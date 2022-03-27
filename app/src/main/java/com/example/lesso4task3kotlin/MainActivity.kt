package com.example.lesso4task3kotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.lesso4task3kotlin.Model.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(v: View?) {
        val nameText = findViewById<EditText>(R.id.name)
        val ageText = findViewById<EditText>(R.id.age)

        val name = nameText.text.toString()
        val age = ageText.text.toString().toInt()

        val user = User(name, age)
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("name", user)
        startActivity(intent)

    }
}