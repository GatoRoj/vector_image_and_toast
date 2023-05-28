package com.example.vector_image_and_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast mytoast = Toast.makeText(getApplicationContext(),"Bienvenido a music app",Toast.LENGTH_LONG);
        mytoast.show();
    }
}