package com.example.loginscreen;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//import com.example.umfs.R;

public class MainActivity extends AppCompatActivity {


    private EditText username;
    private EditText password;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.etPassword);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("htetaungkyaw@gmail.com") &&  password.getText().toString().equals("12345")){
                    Toast.makeText(MainActivity.this, "Login Successful!",Toast.LENGTH_SHORT).show();
//                    Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/studio?gad_source=1&gclid=Cj0KCQjwxeyxBhC7ARIsAC7dS3-N1K3Ya1bkp9l8F1yVcek4geiN1-txWo0zx2L1UgRUP5kfTABYt80aAly1EALw_wcB&gclsrc=aw.ds"));
                    Intent intent = new Intent(MainActivity.this,ProjectActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}