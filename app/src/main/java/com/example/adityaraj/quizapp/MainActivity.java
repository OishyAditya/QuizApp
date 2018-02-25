package com.example.adityaraj.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Questions setquestion=new Questions();
    TextView screen,question;
    Button check1,check2,check3,exit;
    int questionnumber=0;
    int scroe=0;
    String answer;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen= (TextView) findViewById(R.id.score);
        question= (TextView) findViewById(R.id.questionset);
        check1= (Button) findViewById(R.id.checkoption1);
        check2= (Button) findViewById(R.id.checkoption2);
        check3= (Button) findViewById(R.id.checkoption3);
        exit= (Button) findViewById(R.id.exit);
        updatequestion();
        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check1.getText()==answer){
                    scroe++;
                    updatescroe(scroe);
                    updatequestion();
                    Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_SHORT).show();
                }
                else {
                    scroe=scroe;
                    updatescroe(scroe);
                    updatequestion();
                    Toast.makeText(MainActivity.this,"Wrong",Toast.LENGTH_SHORT).show();
                }
            }
        });
        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check2.getText()==answer){
                    scroe++;
                    updatescroe(scroe);
                    updatequestion();
                    Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_SHORT).show();
                }
                else {
                    scroe=scroe;
                    updatescroe(scroe);
                    updatequestion();
                    Toast.makeText(MainActivity.this,"Wrong",Toast.LENGTH_SHORT).show();
                }
            }
        });
        check3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check3.getText()==answer){
                    scroe++;
                    updatescroe(scroe);
                    updatequestion();
                    Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_SHORT).show();
                }
                else {
                    scroe=scroe;
                    updatescroe(scroe);
                    updatequestion();
                    Toast.makeText(MainActivity.this,"Wrong",Toast.LENGTH_SHORT).show();
                }
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });


    }

    public void updatescroe(int scroe){
        screen.setText(""+scroe);
    }
    public void updatequestion(){
        question.setText(setquestion.getquestion(questionnumber));
        check1.setText(setquestion.getoption1(questionnumber));
        check2.setText(setquestion.getoption2(questionnumber));
        check3.setText(setquestion.getoption3(questionnumber));
        answer=setquestion.getanswer(questionnumber);
        questionnumber++;
    }
}
