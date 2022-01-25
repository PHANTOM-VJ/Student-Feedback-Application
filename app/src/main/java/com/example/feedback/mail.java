package com.example.feedback;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class mail extends AppCompatActivity {
    EditText sub,message;
    String semail,spassword;
    String to;
    StringBuffer mail = faculty.mail1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);
        to = mail.toString();
        sub = findViewById(R.id.sub);
        message = findViewById(R.id.editmessage);
        Button btn = findViewById(R.id.button);
        getSupportActionBar().hide();
        semail="";
        spassword="";

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Properties properties = new Properties();
                properties.put("mail.smtp.auth","true");
                properties.put("mail.smtp.starttls.enable","true");
                properties.put("mail.smtp.host","smtp.gmail.com");
                properties.put("mail.smtp.port","587");

                Session session = Session.getInstance(properties, new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(semail,spassword);
                    }
                });


                try {
                    Message message1 = new MimeMessage(session);

                    message1.setFrom(new InternetAddress(semail));

                    message1.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
                    message1.setSubject(sub.getText().toString());
                    message1.setText(message.getText().toString());
                    new SendMail().execute(message1);
                } catch (MessagingException e) {
                    e.printStackTrace();
                }

            }
        });
    }

    private class SendMail extends AsyncTask<Message,String,String> {
        private ProgressDialog progressDialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog = ProgressDialog.show(mail.this,"Please Wait","Sending Mail...",true,false);

        }

        @Override
        protected String doInBackground(Message... messages) {
            try {
                Transport.send(messages[0]);
                return "success";
            } catch (MessagingException e) {
                e.printStackTrace();
                return "error";
            }

        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            progressDialog.dismiss();
            if(s.equals("success")){
                AlertDialog.Builder builder = new AlertDialog.Builder(mail.this);
                builder.setCancelable(false);
                builder.setTitle(Html.fromHtml("<font color='#509324'> Success</font?"));
                builder.setMessage("Mail sent successfully");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        message.setText("");
                        sub.setText("");

                    }
                });

                builder.show();
            }else {
                Toast.makeText(getApplicationContext(),"Something went wrong",Toast.LENGTH_LONG).show();
            }
        }

    }
}