package com.example.andrew.gamenamehere;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the Play button is pressed */
    public void play(View view) {
        startActivity(new Intent(this, MainPlayActivity.class));
    }

    /** Called when the Options button is pressed */
    public void options(View view) {
        startActivity(new Intent(this, OptionsActivity.class));
    }
}
