package com.nugtaphn.quizzy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        var questionList = Constants.getQuestions()
        Log.i("Question size is","${questionList.size}")
    }
}