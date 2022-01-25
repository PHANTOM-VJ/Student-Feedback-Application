package com.example.feedback;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class feedback extends AppCompatActivity {
    int q1,q2,q3,q4,q5;
    int flag;
    String pre = HomeActivity.var;
    int s1 =   HomeActivity.s1;
    int s2 =   HomeActivity.s2;
    int s3 =   HomeActivity.s3;
    int s4 =   HomeActivity.s4;
    int s5 =   HomeActivity.s5;
    int s6 =   HomeActivity.s6;
    int s7 =   HomeActivity.s7;
    int s8 =   HomeActivity.s8;

    String name = LoginActivity.name1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        DBHelper DB = new DBHelper(this);
        getSupportActionBar().hide();
        //String pre = HomeActivity.var;
        RadioButton q11 = (RadioButton) findViewById(R.id.q11);
        RadioButton q12 = (RadioButton) findViewById(R.id.q12);
        RadioButton q13 = (RadioButton) findViewById(R.id.q13);
        RadioButton q14 = (RadioButton) findViewById(R.id.q14);
        RadioButton q15 = (RadioButton) findViewById(R.id.q15);
        RadioButton q21 = (RadioButton) findViewById(R.id.q21);
        RadioButton q22 = (RadioButton) findViewById(R.id.q22);
        RadioButton q23 = (RadioButton) findViewById(R.id.q23);
        RadioButton q24 = (RadioButton) findViewById(R.id.q24);
        RadioButton q25 = (RadioButton) findViewById(R.id.q25);
        RadioButton q31 = (RadioButton) findViewById(R.id.q31);
        RadioButton q32 = (RadioButton) findViewById(R.id.q32);
        RadioButton q33 = (RadioButton) findViewById(R.id.q33);
        RadioButton q34 = (RadioButton) findViewById(R.id.q34);
        RadioButton q35 = (RadioButton) findViewById(R.id.q35);
        RadioButton q41 = (RadioButton) findViewById(R.id.q41);
        RadioButton q42 = (RadioButton) findViewById(R.id.q42);
        RadioButton q43 = (RadioButton) findViewById(R.id.q43);
        RadioButton q44 = (RadioButton) findViewById(R.id.q44);
        RadioButton q45 = (RadioButton) findViewById(R.id.q45);
        RadioButton q51 = (RadioButton) findViewById(R.id.q51);
        RadioButton q52 = (RadioButton) findViewById(R.id.q52);
        RadioButton q53 = (RadioButton) findViewById(R.id.q53);
        RadioButton q54 = (RadioButton) findViewById(R.id.q54);
        RadioButton q55 = (RadioButton) findViewById(R.id.q55);
        Button button = (Button) findViewById(R.id.button);

        String user = DB.checkfaculty(pre);

        TextView t = (TextView) findViewById(R.id.textView);
        t.setText(pre);
        TextView t2 = (TextView) findViewById(R.id.textView2);
        t2.setText(user);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getApplicationContext(), "hello"+name, Toast.LENGTH_SHORT).show();
                if(q11.isChecked()){
                    q1 = 5;
                    DB.insertfeedback1(pre,q1);}
                else if(q12.isChecked()){
                    q1 = 4;
                    DB.insertfeedback1(pre,q1);}
                else if(q13.isChecked()){
                    q1 = 3;
                    DB.insertfeedback1(pre,q1);}
                else if(q14.isChecked()){
                    q1 = 2;
                    DB.insertfeedback1(pre,q1);}
                else if(q15.isChecked()){
                    q1 = 1;
                    DB.insertfeedback1(pre,q1);}

                   // Toast.makeText(getApplicationContext(),"select any option from question1",Toast.LENGTH_LONG).show();

                if(q21.isChecked()){
                    q2 = 5;
                    DB.insertfeedback2(pre,q2);}
                else if(q22.isChecked()){
                    q2 = 4;
                    DB.insertfeedback2(pre,q2);}
                else if(q23.isChecked()){
                    q2 = 3;
                    DB.insertfeedback2(pre,q2);}
                else if(q24.isChecked()){
                    q2 = 2;
                    DB.insertfeedback2(pre,q2);}
                else if(q25.isChecked()){
                    q2 = 1;
                    DB.insertfeedback2(pre,q2);}

                   // Toast.makeText(getApplicationContext(),"select any option from question2",Toast.LENGTH_LONG).show();

                if(q31.isChecked()){
                    q3 = 5;
                    DB.insertfeedback3(pre,q3);}
                else if(q32.isChecked()){
                    q3 = 4;
                    DB.insertfeedback3(pre,q3);}
                else if(q33.isChecked()){
                    q3 = 3;
                    DB.insertfeedback3(pre,q3);}
                else if(q34.isChecked()){
                    q3 = 2;
                    DB.insertfeedback3(pre,q3);}
                else if(q35.isChecked()){
                    q3 = 1;
                    DB.insertfeedback3(pre,q3);}

                   // Toast.makeText(getApplicationContext(),"select any option from question3 "+q3,Toast.LENGTH_LONG).show();

                if(q41.isChecked()){
                    q4 = 5;
                    DB.insertfeedback4(pre,q4);}
                else if(q42.isChecked()){
                    q4 = 4;
                    DB.insertfeedback4(pre,q4);}
                else if(q43.isChecked()){
                    q4 = 3;
                    DB.insertfeedback4(pre,q4);}
                else if(q44.isChecked()){
                    q4 = 2;
                    DB.insertfeedback4(pre,q4);}
                else if(q45.isChecked()){
                    q4 = 1;
                    DB.insertfeedback4(pre,q4);}

                    //Toast.makeText(getApplicationContext(),"select any option from question3 "+q4,Toast.LENGTH_LONG).show();

                if(q51.isChecked()){
                    q5 = 5;
                    DB.insertfeedback5(pre,q5);}
                else if(q52.isChecked()){
                    q5 = 4;
                    DB.insertfeedback5(pre,q5);}
                else if(q53.isChecked()){
                    q5 = 3;
                    DB.insertfeedback5(pre,q5);}
                else if(q54.isChecked()){
                    q5 = 2;
                    DB.insertfeedback5(pre,q5);}
                else if(q55.isChecked()){
                    q5 = 1;
                    DB.insertfeedback5(pre,q5);}

                //flag = s1+s2+s3+s4+s5+s6+s7+s8;
                //Toast.makeText(getApplicationContext(), "succesfull"+flag, Toast.LENGTH_SHORT).show();

                if(s1 == 1 && s2 == 1 && s3 == 1 && s4 == 1 && s5 == 1 && s6 == 1 && s7 == 1 && s8 == 1)
                {
                    flag = 1;
                    DB.insertflag(name,flag);

                    Toast.makeText(getApplicationContext(), "Successful"+flag, Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(getApplicationContext(), "Feedback Recorded", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(intent);

            }
        });



    }
}
