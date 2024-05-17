package com.example.loginscreen;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.example.loginscreen.databinding.ActivityMainBinding;
import com.example.loginscreen.databinding.FontConveterActivityBinding;

public class FontConverter extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private FontConveterActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FontConveterActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initListeners();
    }

    private void initListeners() {
        binding.rgFonts.setOnCheckedChangeListener(this);
        binding.btConvert.setOnClickListener(v -> {

            String input = binding.etInput.getText().toString();
            if (binding.rbUni2Zg.isChecked()) {
                // Convert Uiicode to Zawgyi
                String converted =RabbitConventer.uni2zg(input);
                binding.etOutput.setText(converted);
            } else {
                // Convert Zawgyi to Unicode
                String converted = RabbitConventer.zg2uni(input);
                binding.etOutput.setText(converted);
            }
        });
        binding.btClear.setOnClickListener(v -> {
            binding.etInput.getText().clear();
            binding.etOutput.getText().clear();
        });
        binding.arrowLeftIc.setOnClickListener(view -> {

            onBackPressed();
        });
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        if (checkedId == R.id.rbUni2Zg) {
            // Unicode to Zawgyi
            Log.d("SAI", "Unicode to Zawgyi");
        } else {
            // Zawgyi to Unicode
            Log.d("SAI", "Zawgyi to Unicode");
        }
    }


}
