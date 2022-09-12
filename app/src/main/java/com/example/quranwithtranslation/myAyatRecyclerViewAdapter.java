package com.example.quranwithtranslation;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myAyatRecyclerViewAdapter extends RecyclerView.Adapter<myAyatRecyclerViewAdapter.MyVh>  {
    List<Ayah> aList;
    Context ayaContext;
    public myAyatRecyclerViewAdapter(List<Ayah> ayahList, Context c)
    {
        this.aList = ayahList ;
        this.ayaContext=c;
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
        holder.itemView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(ayaContext,ayatDetails.class);
                        intent.putExtra("ayah",holder.data.AyahtextArabic);
                        intent.putExtra("ayahTransFM",holder.data.transFatehMohammad);
                        intent.putExtra("ayahTransMH",holder.data.transMehmoodUlHaq);
                        intent.putExtra("ayahTransMK",holder.data.transDrMohsin);
                        intent.putExtra("ayahTransTU",holder.data.transMuftiTaqiUsmani);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        ayaContext.startActivity(intent);
                    }
                }
        );
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
