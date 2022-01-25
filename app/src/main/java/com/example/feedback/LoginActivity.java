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

public class LoginActivity extends AppCompatActivity {


    public static String name1 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        EditText name = (EditText) findViewById(R.id.name);
        EditText password = (EditText) findViewById(R.id.password);
        Button button = (Button) findViewById(R.id.button);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Button register = (Button)findViewById(R.id.reg);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.names,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        DBHelper DB  =  new DBHelper(this);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String user = name.getText().toString();
                        String pass = password.getText().toString();
                        String opt = spinner.getSelectedItem().toString();

                        if(user.equals("")||pass.equals("")||opt.equals(""))
                        {
                            Toast.makeText(getApplicationContext(),"Enter all the fields",Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            if(opt.equals("Student"))
                            {
                                Boolean checkuser = DB.checkusernamepassword(user,pass);
                                if(checkuser==true) {
                                    int flag = DB.checkflag(user);
                                    if(flag == 0) {
                                        name1 = user;
                                        Toast.makeText(getApplicationContext(), "Welcome " + user, Toast.LENGTH_LONG).show();
                                        Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                                        startActivity(intent);
                                    }
                                    else
                                    {
                                        Toast.makeText(getApplicationContext(),"Already feedback given",Toast.LENGTH_LONG).show();
                                    }
                                }
                                else
                                {
                                    Toast.makeText(getApplicationContext(),"User not registered",Toast.LENGTH_LONG).show();
                                }
                            }else
                            {
                                Boolean checkuser = DB.checkusernamepasswordf(user,pass);
                                if(checkuser==true) {
                                    name1 = user;
                                    Toast.makeText(getApplicationContext(), "Welcome "+user, Toast.LENGTH_LONG).show();
                                    Intent intent = new Intent(getApplicationContext(), faculty.class);
                                    startActivity(intent);
                                }
                                else
                                {
                                    Toast.makeText(getApplicationContext(),"User Not Registered",Toast.LENGTH_LONG).show();
                                }
                            }

                        }
                    }
                });

            }
        });

    }
}