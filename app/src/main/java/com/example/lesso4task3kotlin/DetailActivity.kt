package com.example.lesso4task3kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.lesso4task3kotlin.Model.User
import java.lang.String
import kotlin.toString

class DetailActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this)
        textView.textSize = 26f
        textView.setPadding(16, 16, 16, 16)
        val arguments: Intent = intent
        val user: User?
        if (arguments != null) {
            user = arguments.getParcelableExtra(User::class.java.simpleName)
            textView.text = """
     Name: ${user!!.getName().toString()}
     Age:
     """.trimIndent() + String.valueOf(
                user.getAge()
            )
        }
        setContentView(textView)
    }
}