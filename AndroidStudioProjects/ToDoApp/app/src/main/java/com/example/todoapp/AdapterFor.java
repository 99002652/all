package com.example.todoapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterFor extends RecyclerView.Adapter<AdapterFor.exViewHolder>{

    private ArrayList<TaskList> mexampleList;

    @NonNull
    @Override
    public exViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_task_list,parent,false);
        exViewHolder evh=new exViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull exViewHolder holder, int position) {
        TaskList crrentitem=mexampleList.get(position);
        holder.mimageView.setImageResource(crrentitem.getImg());
        holder.mTextView1.setText(crrentitem.getText1());
        holder.mTextView2.setText(crrentitem.getText2());
    }

    @Override
    public int getItemCount() {
        return mexampleList.size();
    }

    public static class exViewHolder extends RecyclerView.ViewHolder{
        public ImageView mimageView;
        public TextView mTextView1;
        public TextView mTextView2;


        public exViewHolder(@NonNull View itemView) {
            super(itemView);
            mimageView=itemView.findViewById(R.id.imageview);
            mTextView1=itemView.findViewById(R.id.textView);
            mTextView2=itemView.findViewById(R.id.textView2);

        }
    }
    public ex_Adapter(ArrayList<TaskList> exampleList){
        mexampleList=exampleList;
    }





}
