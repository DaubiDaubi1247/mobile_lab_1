package ru.alex.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import ru.alex.lab1.activity.DetailActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button navBtn = findViewById(R.id.navBtn);

        navBtn.setOnClickListener(e -> {
            Intent refToDetail = new Intent(this, DetailActivity.class);
            startActivity(refToDetail);
        });
    }
}