package com.example.feedback;

import static android.icu.lang.UCharacter.DecompositionType.SUB;
import static com.example.feedback.LoginActivity.name1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class faculty extends AppCompatActivity {
    static StringBuffer mail1 = new StringBuffer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);

        getSupportActionBar().hide();
        String fname = LoginActivity.name1;
        DBHelper DB = new DBHelper(this);
        TextView name = (TextView) findViewById(R.id.textView);
        TextView sub = (TextView) findViewById(R.id.textView3);
        TextView count = (TextView) findViewById(R.id.textView5);
        TextView q1 = (TextView) findViewById(R.id.textView7);
        TextView q2 = (TextView) findViewById(R.id.textView9);
        TextView q3 = (TextView) findViewById(R.id.textView11);
        TextView q4 = (TextView) findViewById(R.id.textView13);
        TextView q5 = (TextView) findViewById(R.id.textView15);
        Button button = (Button)findViewById(R.id.button3);
        String user = DB.checksub(fname);
        int c = DB.checkcount(user);
        float que1 = DB.checkp1(user);
        float que2 = DB.checkp2(user);
        float que3 = DB.checkp3(user);
        float que4 = DB.checkp4(user);
        float que5 = DB.checkp5(user);

        que1 = que1/c;
        que2 = que2/c;
        que3 = que3/c;
        que4 = que4/c;
        que5 = que5/c;
        name.setText(fname);
        sub.setText(user);
        count.setText(String.valueOf(c));
        q1.setText(String.valueOf(que1));
        q2.setText(String.valueOf(que2));
        q3.setText(String.valueOf(que3));
        q4.setText(String.valueOf(que4));
        q5.setText(String.valueOf(que5));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = DB.getjavaData();
                if(res.getCount() == 0){
                    Toast.makeText(getApplicationContext(),"No Entries Exist",Toast.LENGTH_LONG).show();
                }
                StringBuffer buffer1 = new StringBuffer();
                while(res.moveToNext()){
                    buffer1.append("Name :"+res.getString(0)+"\n");
                    buffer1.append("USN :"+res.getString(1)+"\n");
                    buffer1.append("E Mail:"+res.getString(3)+"\n");
                    buffer1.append("\n");

                            mail1.append(res.getString(3)+",");


                }

                AlertDialog.Builder builder = new AlertDialog.Builder(faculty.this);
                builder.setCancelable(true);
                builder.setTitle("***Students who have not given feedback***");
                builder.setMessage(buffer1.toString());

                builder.setPositiveButton("Send mail", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(),mail.class);
                        startActivity(intent);
                    }
                });

                builder.show();
            }
        });

    }
}