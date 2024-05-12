package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        recyclerView = findViewById(R.id.recyclerview);



        List<Item> items = new ArrayList<Item>();
        items.add(new Item("One","Suitable for single-player board games",R.drawable.dice_imgae_1));
        items.add(new Item("Two","Suitable for multi-player board games",R.drawable.dice_image_2));
        items.add(new Item("Three","Suitable for multi-player board games",R.drawable.dice_image_3));
        items.add(new Item("Four","Suitable for multi-player board games",R.drawable.dice_image_3));
        items.add(new Item("Five","Suitable for multi-player board games",R.drawable.dice_image_3));
        items.add(new Item("One","Suitable for single-player board games",R.drawable.dice_image_3));
        items.add(new Item("Two","Suitable for multi-player board games",R.drawable.dice_image_3));
        items.add(new Item("Three","Suitable for multi-player board games",R.drawable.dice_image_3));
        items.add(new Item("Four","Suitable for multi-player board games",R.drawable.dice_image_3));
        items.add(new Item("Five","Suitable for multi-player board games",R.drawable.dice_image_3));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));

    }
}