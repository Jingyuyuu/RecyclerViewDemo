package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewdemo.Model.MenuAdapter;
import com.example.recyclerviewdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    MenuAdapter adapter;
    RecyclerView recyclerView;
    androidx.recyclerview.widget.LinearLayoutManager  layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding=ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot() );
        adapter =new MenuAdapter();
        recyclerView=binding.menulist;
        recyclerView.setAdapter(adapter);

        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);




    }
}