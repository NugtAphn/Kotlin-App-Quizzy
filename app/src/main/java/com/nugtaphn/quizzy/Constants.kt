package com.nugtaphn.quizzy

object Constants {
    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val questionOne = Question(
            1,"2+2",
            R.drawable.ic_launcher_foreground,
            "1","2","3","4",
            4
        )
        questionList.add(questionOne)

        val questionTwo = Question(
            2,"1+2",
            R.drawable.ic_launcher_foreground,
            "1","2","3","4",
            3
        )
        questionList.add(questionTwo)

        return questionList
    }
}