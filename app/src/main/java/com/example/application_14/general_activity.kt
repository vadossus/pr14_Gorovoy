package com.example.application_14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class general_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general)
    }

    fun next_activity2(view: View) {
        val intent = Intent(this, alarm_activity::class.java)
        startActivity(intent)
    }

    fun next_activity3(view: View) {
        val intent = Intent(this, add_task_activity::class.java)
        startActivity(intent)
    }
}