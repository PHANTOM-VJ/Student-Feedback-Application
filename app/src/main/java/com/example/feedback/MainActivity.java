package com.example.feedback;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        EditText name = (EditText)findViewById(R.id.Name);
        EditText password = (EditText)findViewById(R.id.password);
        EditText repass = (EditText)findViewById(R.id.retype);
        EditText usn = (EditText)findViewById(R.id.usn);
        Button register =(Button)findViewById(R.id.button);
        Button login =(Button)findViewById(R.id.button1);
        EditText mail = (EditText)findViewById(R.id.email);
        DBHelper DB = new DBHelper(this);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = name.getText().toString();
                String email = mail.getText().toString();
                String usn1 = usn.getText().toString();
                String pass = password.getText().toString();
                String repassed = repass.getText().toString();

                if(user.equals("")||pass.equals("")||repassed.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Enter All Fields",Toast.LENGTH_LONG).show();
                }
                else
                {
                    if(pass.equals(repassed)) {
                            Boolean checkuser = DB.checkusername(user);
                            if (checkuser == false) {
                                Boolean insert = DB.insertData(usn1, user, pass, email);
                                if (insert == true) {
                                    Toast.makeText(getApplicationContext(), "Registered Succesfully", Toast.LENGTH_LONG).show();
                                    Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                                    startActivity(intent);
                                } else {
                                    Toast.makeText(getApplicationContext(), "Registration failed", Toast.LENGTH_LONG).show();
                                }
                            } else {
                                Toast.makeText(getApplicationContext(), "User Exist Sign In", Toast.LENGTH_LONG).show();
                            }


                        }else
                        {
                            Toast.makeText(getApplicationContext(), "Password Not Matching", Toast.LENGTH_LONG).show();
                        }

                }

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}