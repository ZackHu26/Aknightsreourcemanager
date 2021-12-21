package com.example.resourcemanager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class myAdapter extends FirebaseRecyclerAdapter<Model, myAdapter.myViewholder>
{

    public myAdapter(@NonNull FirebaseRecyclerOptions<Model> options)
    {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewholder holder, int position, @NonNull Model model)
    {
        holder.Name.setText(model.getName());
        holder.Level.setText(model.getLevel());
        Glide.with(holder.img.getContext()).load(model.getPurl()).into(holder.img);
    }

    @NonNull
    @Override
    public myViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new myViewholder(view);
    }

    class myViewholder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView Name, Level;
        public myViewholder (@NonNull View itemView)
        {
            super(itemView);
            img = (ImageView)itemView.findViewById(R.id.imageIV);
            Name = (TextView)itemView.findViewById(R.id.titleTv);
            Level = (TextView)itemView.findViewById(R.id.descriptionTv);
        }
    }
}