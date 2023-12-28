package com.nugtaphn.quizzy

data class Question(
    val id : Int,
    var question : String,
    var img : Int,
    var optionOne : String,
    var optionTwo : String,
    var optionThree: String,
    var optionFour : String,
    var correctAnswer : Int,
)

