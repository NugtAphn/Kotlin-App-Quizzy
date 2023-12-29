package com.nugtaphn.quizzy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etName = findViewById<EditText>(R.id.etName)
        var btnStart = findViewById<Button>(R.id.btnStart)
        btnStart.setOnClickListener {
            if(etName.text.isEmpty()){
                Toast.makeText(this,"Please DO NOT empty your name",Toast.LENGTH_SHORT).show()
            }else{
                var intent = Intent(this,QuizActivity::class.java)
                intent.putExtra(Constants.USER_NAME,etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}