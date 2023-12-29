package com.nugtaphn.quizzy

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class QuizActivity : AppCompatActivity(), View.OnClickListener {
    private var mCurrentPosition = 1
    private var mQuestionList:ArrayList<Question>? = null
    private var mSelectedOptionNumber = 0

    private var progressBar : ProgressBar? = null
    private var tvProgressBar : TextView? = null
    private var tvQuestion : TextView? = null
    private var ivImage : ImageView? = null

    private var tvOptionOne : TextView? = null
    private var tvOptionTwo : TextView? = null
    private var tvOptionThree : TextView? = null
    private var tvOptionFour : TextView? = null

    private var btnSubmit : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        progressBar = findViewById(R.id.progressBar)
        tvProgressBar = findViewById(R.id.tv_progressBar)
        tvQuestion = findViewById(R.id.tv_question)
        ivImage = findViewById(R.id.iv_image)
        tvOptionOne = findViewById(R.id.tv_optionOne)
        tvOptionTwo = findViewById(R.id.tv_optionTwo)
        tvOptionThree = findViewById(R.id.tv_optionThree)
        tvOptionFour = findViewById(R.id.tv_optionFour)
        btnSubmit = findViewById(R.id.btn_submit)

        mQuestionList = Constants.getQuestions()

        setQuestion()
    }

    private fun setQuestion() {
        val question: Question = mQuestionList!![mCurrentPosition - 1]

        tvQuestion?.text = question.question

        ivImage?.setImageResource(question.img)

        progressBar?.progress = mCurrentPosition
        tvProgressBar?.text = "$mCurrentPosition/${progressBar?.max}"

        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionFour

        tvOptionOne?.setOnClickListener(this)
        tvOptionTwo?.setOnClickListener(this)
        tvOptionThree?.setOnClickListener(this)
        tvOptionFour?.setOnClickListener(this)
        btnSubmit?.setOnClickListener(this)

        if(mCurrentPosition == mQuestionList!!.size){
            btnSubmit?.text = "FINISH"
        }else{
            btnSubmit?.text = "SUBMIT"
        }
    }

    private fun defaultOptionView(){
        val options = ArrayList<TextView>()
        tvOptionOne?.let {
            options.add(0,it)
        }
        tvOptionTwo?.let {
            options.add(1,it)
        }
        tvOptionThree?.let {
            options.add(2,it)
        }
        tvOptionFour?.let {
            options.add(3,it)
        }
        for (i in options){
            i.setTextColor(Color.parseColor("#7A8089"))
            i.typeface = Typeface.DEFAULT
            i.background = ContextCompat.getDrawable(this,R.drawable.option_choice)
        }
    }

    private fun selectedOptionView(tv:TextView, selectedOptionNumber : Int) {
        defaultOptionView()
        mSelectedOptionNumber = selectedOptionNumber
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this,R.drawable.option_choice_selected)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_optionOne -> {
                tvOptionOne?.let {
                    selectedOptionView(it,1)
                }
            }
            R.id.tv_optionTwo -> {
                tvOptionTwo?.let {
                    selectedOptionView(it,2)
                }
            }
            R.id.tv_optionThree -> {
                tvOptionThree?.let {
                    selectedOptionView(it,3)
                }
            }
            R.id.tv_optionFour -> {
                tvOptionFour?.let {
                    selectedOptionView(it,4)
                }
            }
            R.id.btn_submit -> {
                btnSubmit?.let{

                }
            }
        }
    }
}