package com.example.mohamed.quiz;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by MOHAMED on 19/01/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
private String[] mdataset;


    public class MyViewHolder extends RecyclerView.ViewHolder{

        public ImageView thumbnail;
        public TextView text,count,count2,count3;

        public MyViewHolder(View itemView) {
            super(itemView);
            text = (TextView) itemView.findViewById(R.id.txt);


        }
    }
    public Adapter(String[] mydataset)
    {
        mdataset=mydataset;

    }


    @Override
    public Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_news,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(Adapter.MyViewHolder holder, int position) {
        holder.text.setText(mdataset[position]);

    }

    @Override
    public int getItemCount() {
        return mdataset.length;
    }
}
