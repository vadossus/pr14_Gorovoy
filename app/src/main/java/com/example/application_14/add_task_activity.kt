package com.example.application_14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class add_task_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_task)
    }

    fun next_activity4(view: View) {
        val intent = Intent(this, general_activity::class.java)
        startActivity(intent)
    }

    fun next_activity5(view: View) {
        val intent = Intent(this, edit_alarm_activity::class.java)
        startActivity(intent)
    }
}