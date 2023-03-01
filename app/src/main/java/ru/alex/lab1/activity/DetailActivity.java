package ru.alex.lab1.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import ru.alex.lab1.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.w("DetailActivity", "on start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("DetailActivity", "on resume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("DetailActivity", "on pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w("DetailActivity", "on stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w("DetailActivity", "on restart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("DetailActivity", "on destroy");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
}