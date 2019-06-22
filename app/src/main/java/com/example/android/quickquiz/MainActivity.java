package com.example.android.quickquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     String name;
     int score;
     boolean allQuestionsAnswered=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateScore(View view){
        EditText userName =  findViewById(R.id.editText);
        String name = userName.getText().toString();
        if(name.isEmpty()){
            boolean allQuestionsAnswered =false;
            Toast.makeText(this, "please enter your name! ", Toast.LENGTH_LONG).show();
        }



        EditText age = findViewById(R.id.editText2);
        String ageNumber = age.getText().toString();

        if(!ageNumber.isEmpty()){
            score = score+1;
        }
        else {
            boolean allQuestionsAnswered =false;
            Toast.makeText(this, "please enter your Age " + name + "!", Toast.LENGTH_LONG).show();
        }

        CheckBox alaska = findViewById(R.id.checkBox);
        CheckBox newYork = findViewById(R.id.checkBox2);
        CheckBox losAngeles = findViewById(R.id.checkBox3);
        if(alaska.isChecked()&& !losAngeles.isChecked() && !newYork.isChecked()){
            score += 1;
        }else if(!alaska.isChecked()&& !newYork.isChecked() && !losAngeles.isChecked())
        {
            boolean allQuestionsAnswered =false;
            Toast.makeText(this,"Answer question no.1" + name + "!",Toast.LENGTH_SHORT).show();
        }


        RadioButton rb2 = findViewById(R.id.radioButton2);
        RadioButton rb1 = findViewById(R.id.radioButton);
        if(rb1.isChecked() && !rb2.isChecked()){
            score +=1;
        }else if (!rb1.isChecked() && !rb2.isChecked()){
            boolean allQuestionsAnswered = false;

            Toast.makeText(this, "Answer question no.2" + name + "!", Toast.LENGTH_SHORT).show();
        }


        RadioButton rb3 = findViewById(R.id.radioButton3);
        RadioButton rb4 = findViewById(R.id.radioButton4);
        if(rb4.isChecked() && !rb3.isChecked()){
            score +=1;
        }else if((!rb4.isChecked() && !rb3.isChecked())) {
            boolean allQuestionsAnswered =false;
            Toast.makeText(this, "Answer question no.3 " + name + "!", Toast.LENGTH_SHORT).show();
        }


        RadioButton rb5 = findViewById(R.id.radioButton5);
        RadioButton rb6 = findViewById(R.id.radioButton6);
        if(rb6.isChecked() && !rb5.isChecked()){
            score +=1;
        }else if(!rb6.isChecked() && !rb5.isChecked()) {
            boolean allQuestionsAnswered =false;
            Toast.makeText(this, "Answer question no.4 " + name + "!", Toast.LENGTH_SHORT).show();
        }



        EditText ed3 = findViewById(R.id.editText3);
        String editText = ed3.getText().toString();

        if(!editText.isEmpty() && editText == "stomach"){
            score = score+1;
        }
        else if(editText.isEmpty()){
            boolean allQuestionsAnswered =false;
            Toast.makeText(this, "Answer question no.5 " + name + "!", Toast.LENGTH_SHORT).show();
        }

        CheckBox ducks = findViewById(R.id.checkBox4);
        CheckBox lions = findViewById(R.id.checkBox5);
        CheckBox elephants = findViewById(R.id.checkBox6);
        if(ducks.isChecked()&& !lions.isChecked() && !elephants.isChecked()){
            score += 1;
        }else if(!ducks.isChecked() && !lions.isChecked() && !elephants.isChecked()){
            boolean allQuestionsAnswered =false;
            Toast.makeText(this, "answer question no.6 " + name + "!", Toast.LENGTH_SHORT).show();
        }

        EditText ed4 = findViewById(R.id.editText4);
        String editText4 = ed4.getText().toString();

        if(!editText4.isEmpty() && editText4 == "Steve jobs"){
            score = score+1;
        }
        else if(editText4.isEmpty()){
            boolean allQuestionsAnswered =false;
            Toast.makeText(this, "Answer question no.7 " + name + "!", Toast.LENGTH_SHORT).show();
        }

        RadioButton rb7 = findViewById(R.id.radioButton7);
        RadioButton rb8 = findViewById(R.id.radioButton8);
        if(rb7.isChecked() && !rb8.isChecked()){
            score +=1;
        }else if(!rb7.isChecked() && !rb8.isChecked()) {
            boolean allQuestionsAnswered =false;
            Toast.makeText(this, "Answer question no.8 " + name + "!", Toast.LENGTH_SHORT).show();
        }

        if(allQuestionsAnswered==true) {
            Toast.makeText(this, "your score is " + score + " out of 8 " + name, Toast.LENGTH_LONG).show();
            int score = 0;
        }




    }
}
