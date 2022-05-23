package com.example.myapplication;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    int count =0;

    public void increment() {
        count++;
    }
}
