package ru.alex.lab1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import ru.alex.lab1.activity.DetailActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.w("MainActivity", "on start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("MainActivity", "on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("MainActivity", "on pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w("MainActivity", "on stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w("MainActivity", "on restart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("MainActivity", "on destroy");
    }

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