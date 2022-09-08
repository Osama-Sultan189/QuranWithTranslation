package com.example.quranwithtranslation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myAyatRecyclerViewAdapter extends RecyclerView.Adapter<myAyatRecyclerViewAdapter.MyVh>  {
    List<Ayah> aList;
    public myAyatRecyclerViewAdapter(List<Ayah> ayahList) {
        this.aList = ayahList ;
    }

    @NonNull
    @Override
    public myAyatRecyclerViewAdapter.MyVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.ayahview, parent, false);
        return new myAyatRecyclerViewAdapter.MyVh(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull myAyatRecyclerViewAdapter.MyVh holder, int position) {
        holder.data=aList.get(position);
        holder.ayahData.setText(holder.data.AyahtextArabic+"");
    }

    @Override
    public int getItemCount() {
        return aList.size();
    }


    public class MyVh extends RecyclerView.ViewHolder {
        TextView ayahData;
        Ayah data;
        public MyVh(@NonNull View itemView) {
            super(itemView);
            ayahData = itemView.findViewById(R.id.ayat);
        }
    }
}
