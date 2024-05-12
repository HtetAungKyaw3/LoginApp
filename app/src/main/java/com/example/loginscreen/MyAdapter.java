package com.example.loginscreen;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//import com.example.umfs.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Item> items;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        holder.nameView.setText(view);


        holder.nameView.setText(items.get(position).getName());
        holder.nameView.setOnClickListener(new View.OnClickListener() {
//            final  String  item  = items.get(position);
            @Override
            public void onClick(View view) {
//                Toast.makeText(DiceRollActivity.this, "Login Successful!",Toast.LENGTH_SHORT).show();
            }
        });

        holder.aboutDice.setText(items.get(position).getAbout());

        holder.imageView.setImageResource(items.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
