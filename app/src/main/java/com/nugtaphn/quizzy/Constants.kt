package com.nugtaphn.quizzy

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTION : String = "total_question"
    const val CORRECT_QUESTION:String = "correct_answer"

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

        val questionThree = Question(
            2,"1*2-1",
            R.drawable.ic_launcher_foreground,
            "1","2","3","4",
            1
        )
        questionList.add(questionThree)

        val questionFour = Question(
            2,"1+2-1",
            R.drawable.ic_launcher_foreground,
            "1","2","3","4",
            2
        )
        questionList.add(questionFour)

        val questionFive = Question(
            2,"1+2+1",
            R.drawable.ic_launcher_foreground,
            "1","2","3","4",
            4
        )
        questionList.add(questionFive)

        return questionList
    }
}