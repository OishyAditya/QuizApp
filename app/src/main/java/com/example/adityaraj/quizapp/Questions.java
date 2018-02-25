package com.example.adityaraj.quizapp;


public class Questions {
    private String []questions={
            "1.It's dangerous ____ run across the road.",
            "2.He is completely absorbed ____ his research work.",
            "3.You must abstain ____ smoking and drinking.",
            "4.That suggestion is not acceptable ____ us.",
            "5.I am only slightly acquainted ____ him.",
            "6.James was acquitted ____ the charge of theft.",
            "7.One must learn to adapt oneself ____ changing circumstances.",
            "8.James is addicted ____ gambling.",
            "9.He was admitted ____ the Medical College.",
            "10.This is an urgent matter which admits ____ no delay.",
            "11.Avail yourself ____ this opportunity.",
            "12.Don’t brood ____ past failures.",
            "13.He fell ____ the horse.",
            "14.The virus spread ____ the country.",
            "15.Passengers sit ____ the driver."
    };
    private String []answer={"to","in","from","to","with","of","to","to","to","of","of","over","off","throughtout","behind"};
    private  String [][]checks={
        {"for","to","in"},
        {"to","in","into"},
        {"to","from","into"},
        {"for","to","in"},
        {"with","in","to"},
        {"of","to","in"},
        {"into","to","over"},
        {"to","in","into"},
        {"in","to","for"},
        {"to","of","into"},
        {"to","of","from"},
        {"to","of","over"},
        {"of","off","in"},
        {"over","throughout","to"},
        {"to","behind","over"}
    };
    public String getquestion(int point){
        String getques=questions[point];
        return getques;
    }
   public String getanswer(int point){
        String getans=answer[point];
        return  getans;
    }
    public String getoption1(int point){
        String getop1=checks[point][0];
        return getop1;
    }
    public String getoption2(int point){
        String getop1=checks[point][1];
        return getop1;
    }
    public String getoption3(int point){
        String getop1=checks[point][2];
        return getop1;
    }




}
