package com.example.fragmentdemo26

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.container_fragm, CurrentTaskFragment())
                .commit()
        }

        findViewById<Button>(R.id.btnBrief).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container_fragm, CurrentTaskFragment())
                .commit()
        }

        findViewById<Button>(R.id.btnDetailed).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container_fragm, FinishTaskFragment())
                .commit()
        }
    }
}