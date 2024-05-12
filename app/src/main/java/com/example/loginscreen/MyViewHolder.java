package com.example.loginscreen;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//import com.example.umfs.R;

public class MyViewHolder  extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView nameView,aboutDice;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        nameView = itemView.findViewById(R.id.nameView);
        aboutDice = itemView.findViewById(R.id.aboutDice);
    }
}
