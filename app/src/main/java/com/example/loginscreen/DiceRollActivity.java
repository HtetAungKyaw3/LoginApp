package com.example.loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

//import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class DiceRollActivity extends AppCompatActivity {

    DiceRollActivity binding;
    TextView scoreTxt;
    ImageView diceImage;
    Button btnRoll, btnChoose;

    ImageView arrow_left_ic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dice_roll);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        scoreTxt = findViewById(R.id.scoreTxt);
        diceImage = findViewById(R.id.diceImage);
        btnRoll = findViewById(R.id.btnRoll);
        btnChoose =findViewById(R.id.btnChoose);
        arrow_left_ic = findViewById(R.id.arrow_left_ic);

        btnChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DiceRollActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });

        arrow_left_ic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int score = random.nextInt(6)+1;
                scoreTxt.setText(String.valueOf(score));

                switch (score){
                    case  1:
                        diceImage.setImageResource(R.drawable.dice_1);
                        break;
                    case  2:
                        diceImage.setImageResource(R.drawable.dice_2);
                        break;
                    case  3:
                        diceImage.setImageResource(R.drawable.dice_3);
                        break;
                    case  4:
                        diceImage.setImageResource(R.drawable.dice_4);
                        break;
                    case  5:
                        diceImage.setImageResource(R.drawable.dice_5);
                        break;
                    case  6:
                        diceImage.setImageResource(R.drawable.dice_6);
                        break;
                }
            }
        });
///

    }
}