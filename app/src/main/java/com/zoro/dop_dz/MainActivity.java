package com.zoro.dop_dz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private  EditText login;
    private EditText them;
    private  EditText sms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.btn_sms);
        login=findViewById(R.id.poch);
        them=findViewById(R.id.them);
        sms=findViewById(R.id.mesage);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String to = login.getText().toString();
                String subject = them.getText().toString();
                String message = sms.getText().toString();
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
                email.putExtra(Intent.EXTRA_SUBJECT, subject);
                email.putExtra(Intent.EXTRA_TEXT, message);
                email.setType("message/rfc822");
                startActivity(email);
            }
        });
    }}