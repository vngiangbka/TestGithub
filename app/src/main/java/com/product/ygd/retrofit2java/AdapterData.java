package com.product.ygd.retrofit2java;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class AdapterData extends RecyclerView.Adapter<AdapterData.MyViewHolder> {
    ArrayList<ModelData> arrayList;
    LayoutInflater inflater;

    AdapterData(Context context, ArrayList<ModelData> arrayList) {
        inflater = LayoutInflater.from(context);
        this.arrayList = arrayList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(inflater.inflate(R.layout.item_row, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ModelData item = arrayList.get(position);
        holder.tvRank.setText(item.getRank());
        holder.tvSong.setText(item.getSong());
        holder.tvSinger.setText(item.getSinger());
        if (item.getUrlMV().equals("")) {
            holder.ivMV.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvRank;
        TextView tvSong;
        TextView tvSinger;
        ImageView ivMV;

        MyViewHolder(View itemView) {
            super(itemView);

            tvRank = itemView.findViewById(R.id.tvRank);
            tvSong = itemView.findViewById(R.id.tvSong);
            tvSinger = itemView.findViewById(R.id.tvSinger);
            ivMV = itemView.findViewById(R.id.ivMV);
        }
    }
}
