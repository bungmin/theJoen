package com.thejoejn.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView userIdEdit;
    TextView userPwEdit;
    TextView wasabiText;
    Button okLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userIdEdit = findViewById(R.id.userIdEdit);
        userPwEdit = findViewById(R.id.userPwEdit);
        okLogin = findViewById(R.id.okLogin);
        wasabiText = findViewById(R.id.wasabiText);

//      okLogin.setOnClickListener 하고 난다음에  new OnClickListener()로 재료

        okLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String loginText2 = userIdEdit.getText().toString();
                String passwdText= userPwEdit.getText().toString();

                Toast.makeText(MainActivity.this,  "ID : "+ loginText2 , Toast.LENGTH_SHORT).show();

                wasabiText.setText("ID : "+ loginText2 + " , PW: " + passwdText);

                String.format("ID : %s, PW : %s", loginText2, passwdText);
                //wasabiText.setText("ID : "+ loginText2 + " , PW: " + passwdText);

            }

        });





    }
}
