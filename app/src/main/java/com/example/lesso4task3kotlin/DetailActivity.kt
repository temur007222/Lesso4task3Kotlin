package com.example.lesso4task3kotlin

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import com.example.lesso4task3kotlin.Model.User
import java.lang.String


class DetailActivity: AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this)
        textView.textSize = 25f
        textView.setPadding(22, 20, 20, 20)
        val arguments : Intent = intent
        var user: User
        if (arguments != null) {
            user = arguments.getParcelableExtra<User>("name")!!

            textView.text = """
                Name: ${user.getName().toString()}
                Age:${String.valueOf(user.getAge())}
                """.trimIndent()
        }

        setContentView(textView)
    }
}