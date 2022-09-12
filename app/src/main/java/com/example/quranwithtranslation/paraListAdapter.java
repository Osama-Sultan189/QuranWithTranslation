package com.example.quranwithtranslation;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class paraListAdapter extends RecyclerView.Adapter<paraListAdapter.Myvh> {
    List<String> pList;
    Context cl;
    public paraListAdapter(List<String> paranames, Context c) {
       pList=paranames;
       cl=c;
    }

    @NonNull
    @Override
    public paraListAdapter.Myvh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.paranameview, parent, false);
        return new paraListAdapter.Myvh(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull paraListAdapter.Myvh holder, int position) {
        holder.data=pList.get(position);
        holder.surahName.setText(holder.data);
        holder.itemView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(cl, ayahView.class);
                        intent.putExtra("Id",pList.indexOf(holder.data)+1);
                        intent.putExtra("colname","ParaID");

                        intent.putExtra("act","paraview");
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        cl.startActivity(intent);
                    }
                }
        );

    }

    @Override
    public int getItemCount() {
        return pList.size();
    }


    public class Myvh extends RecyclerView.ViewHolder {
        TextView surahName;
        String data;
        public Myvh(@NonNull View itemView) {
            super(itemView);
            surahName=itemView.findViewById(R.id.nametext);
        }
    }
}
