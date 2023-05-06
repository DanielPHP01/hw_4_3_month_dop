package com.example.hw_4_3_month_dop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.hw_4_3_month_dop.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClick {

    ActivityMainBinding binding;
    AdapterPlane adapter;
    ArrayList<Planes> arrayList = new ArrayList<>();
    Planes planes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        fiilOurList();
        initRecycler();
    }

    private void initRecycler() {
        adapter = new AdapterPlane(arrayList, this);
        binding.recyclerView.setAdapter(adapter);
    }

    private void fiilOurList() {
        arrayList.add(new Planes("Aerobus", "310", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREUlvmP7YgG1raELkE0nyAtK12MDpsfBzRwe-9bqqg&s"));
        arrayList.add(new Planes("Aerobus", "310", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREUlvmP7YgG1raELkE0nyAtK12MDpsfBzRwe-9bqqg&s"));
        arrayList.add(new Planes("Aerobus", "310", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREUlvmP7YgG1raELkE0nyAtK12MDpsfBzRwe-9bqqg&s"));
        arrayList.add(new Planes("Aerobus", "310", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREUlvmP7YgG1raELkE0nyAtK12MDpsfBzRwe-9bqqg&s"));
        arrayList.add(new Planes("Aerobus", "310", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREUlvmP7YgG1raELkE0nyAtK12MDpsfBzRwe-9bqqg&s"));
        arrayList.add(new Planes("Aerobus", "310", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREUlvmP7YgG1raELkE0nyAtK12MDpsfBzRwe-9bqqg&s"));
        arrayList.add(new Planes("Aerobus", "310", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREUlvmP7YgG1raELkE0nyAtK12MDpsfBzRwe-9bqqg&s"));
        arrayList.add(new Planes("Aerobus", "310", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREUlvmP7YgG1raELkE0nyAtK12MDpsfBzRwe-9bqqg&s"));
        arrayList.add(new Planes("Aerobus", "310", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREUlvmP7YgG1raELkE0nyAtK12MDpsfBzRwe-9bqqg&s"));
        arrayList.add(new Planes("Aerobus", "310", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREUlvmP7YgG1raELkE0nyAtK12MDpsfBzRwe-9bqqg&s"));
        arrayList.add(new Planes("Aerobus", "310", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREUlvmP7YgG1raELkE0nyAtK12MDpsfBzRwe-9bqqg&s"));
        arrayList.add(new Planes("Aerobus", "310", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREUlvmP7YgG1raELkE0nyAtK12MDpsfBzRwe-9bqqg&s"));
    }

    @Override
    public void onClick(Planes planes) {
        Intent intent = new Intent(this, ContainerActivity.class);
        intent.putExtra("plane", planes);
        startActivity(intent);


    }
}