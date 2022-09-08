package com.example.quranwithtranslation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myRecyclerViewAdapter extends RecyclerView.Adapter<myRecyclerViewAdapter.MyVH> {

    List<Surah> sList;
    iRecyclerListener RL;
    public myRecyclerViewAdapter(List<Surah> SurahList, iRecyclerListener Rl) {
        this.sList = SurahList ;
        this.RL=Rl;
    }

    @NonNull
    @Override
    public myRecyclerViewAdapter.MyVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.itemview, parent, false);
        return new MyVH(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull myRecyclerViewAdapter.MyVH holder, int position) {
        holder.data=sList.get(position);
        holder.surahData.setText(holder.data.surahName+"");
        holder.CL.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        RL.onitenmClicked(holder.data);
                    }
                }
        );
    }

    @Override
    public int getItemCount() {
        return sList.size();
    }


    public class MyVH extends RecyclerView.ViewHolder {
        TextView surahData;
        ConstraintLayout CL;
        Surah data;
        public MyVH(@NonNull View itemView) {
            super(itemView);
            CL = itemView.findViewById(R.id.cl);
            surahData = itemView.findViewById(R.id.surahname);
        }
    }
}