package com.jannatulferdousi.tiktokiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.jannatulferdousi.tiktokiapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList<Model> arrayList = new ArrayList<>();
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        arrayList.add(new Model("android.resource://"+ getPackageName() + "/" + R.raw.a,R.drawable.woman,"Jannat"));
        arrayList.add(new Model("android.resource://"+ getPackageName() + "/" + R.raw.b,R.drawable.man,"Hasan"));
        arrayList.add(new Model("android.resource://"+ getPackageName() + "/" + R.raw.c,R.drawable.man2,"Ali"));
        arrayList.add(new Model("android.resource://"+ getPackageName() + "/" + R.raw.d,R.drawable.woman2,"Jannatul ferdous"));
        arrayList.add(new Model("android.resource://"+ getPackageName() + "/" + R.raw.e,R.drawable.woman2,"Ferdousi"));
        arrayList.add(new Model("android.resource://"+ getPackageName() + "/" + R.raw.f,R.drawable.man,"Abdul"));
        adapter = new Adapter(MainActivity.this,arrayList);
        binding.viewpager2.setAdapter(adapter);





    }
}