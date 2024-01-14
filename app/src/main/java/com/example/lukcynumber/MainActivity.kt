package com.example.lukcynumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1Btn:Button
        val fragment2Btn:Button

        fragment1Btn= findViewById(R.id.fragment1btn);
        fragment2Btn= findViewById(R.id.fragment2btn);

        fragment1Btn.setOnClickListener{

        }

        fragment2Btn.setOnClickListener{

        }

    }
}