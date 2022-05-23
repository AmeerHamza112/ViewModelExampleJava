package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviderGetKt;

import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;
    private MainViewModel mainViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mainViewModel=new ViewModelProvider(this).get(MainViewModel.class);
        binding.buttonIncrement.setOnClickListener(this);
        setText();
    }

    @Override
    public void onClick(View v) {
        int id =v.getId();
        if(id==R.id.button_increment){
            mainViewModel.increment();
            setText();

        }
    }

    private void setText(){
        binding.textViewIncrement.setText(String.valueOf(mainViewModel.count));
    }
}