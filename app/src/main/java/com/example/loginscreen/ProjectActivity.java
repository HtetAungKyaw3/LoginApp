package com.example.loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.loginscreen.databinding.ProjectActivityBinding;

public class ProjectActivity extends AppCompatActivity {


 ProjectActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ProjectActivityBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.arrowLeftIc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        binding.diceCView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ProjectActivity.this, "DICE ROLLER",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ProjectActivity.this,DiceRollActivity.class);
                startActivity(intent);
            }
        }

        );
        binding.guessWCView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ProjectActivity.this, "Guess Word!",Toast.LENGTH_SHORT).show();
//                    Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/studio?gad_source=1&gclid=Cj0KCQjwxeyxBhC7ARIsAC7dS3-N1K3Ya1bkp9l8F1yVcek4geiN1-txWo0zx2L1UgRUP5kfTABYt80aAly1EALw_wcB&gclsrc=aw.ds"));
                Intent intent = new Intent(ProjectActivity.this, DiceRollActivity.class);
                startActivity(intent);
            }
        });
        binding.dateCounterCVeiw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(ProjectActivity.this, "DICE ROLLER",Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(ProjectActivity.this,DiceRollActivity.class);
//                startActivity(intent);
                Toast.makeText(ProjectActivity.this, "Font Converter",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ProjectActivity.this,DiceRollActivity.class);
                startActivity(intent);
            }
        });//date_counter_cVeiw
        binding.fontCVeiw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//
                Toast.makeText(ProjectActivity.this, "Font Converter",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ProjectActivity.this,FontConverter.class);
                startActivity(intent);
            }
        });


    }

//    @Override
//    public void onClick(View view) {
//        int id = view .getId();
//        switch (id){
//            case R.id.dice_CView:
//                Toast.makeText(ProjectActivity.this, "DICE ROLLER",Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(ProjectActivity.this,DiceRollActivity.class);
//                startActivity(intent);
//                break;
//            case R.id.guess_w_cView:
//                Toast.makeText(ProjectActivity.this, "DICE ROLLER",Toast.LENGTH_SHORT).show();
//                Intent intent1 = new Intent(ProjectActivity.this,SecondActivity.class);
//                startActivity(intent1);
//                break;
//            case R.id.date_counter_cVeiw:
//                Toast.makeText(ProjectActivity.this, "DICE ROLLER",Toast.LENGTH_SHORT).show();
//                Intent intent2 = new Intent(ProjectActivity.this,DiceRollActivity.class);
//                startActivity(intent2);
//                break;
//            case R.id.unicode_cView:
//                Toast.makeText(ProjectActivity.this, "DICE ROLLER",Toast.LENGTH_SHORT).show();
//                Intent intent3 = new Intent(ProjectActivity.this,DiceRollActivity.class);
//                startActivity(intent3);
//                break;
//
//        }

    }



