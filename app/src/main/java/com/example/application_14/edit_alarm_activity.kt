package com.example.application_14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class edit_alarm_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_alarm)
    }

    fun next_activity6(view: View) {
        val intent = Intent(this, add_task_activity::class.java)
        startActivity(intent)
    }
}