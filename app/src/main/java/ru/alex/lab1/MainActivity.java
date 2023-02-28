package ru.alex.lab1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import ru.alex.lab1.activity.DetailActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button navBtn = findViewById(R.id.navBtn);
        Button navToGithub = findViewById(R.id.navToGithub);

        navToGithub.setOnClickListener(e -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://github.com/JustAlex322"));
            startActivity(intent);
        });

        navBtn.setOnClickListener(e -> {
            Intent refToDetail = new Intent(this, DetailActivity.class);
            startActivity(refToDetail);
        });
    }
}