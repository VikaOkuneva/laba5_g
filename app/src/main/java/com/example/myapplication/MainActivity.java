package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclic1 (View v) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Это первый котик",
                Toast.LENGTH_LONG);
        myToast.show();
    }
    public void onclic2 (View v) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Это второй котик",
                Toast.LENGTH_LONG);
        myToast.show();
    }
    public void onclic3 (View v) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Это третий котик",
                Toast.LENGTH_LONG);
        myToast.show();
    }
}