package com.thejoejn.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView loginText;
    TextView pwText;
    TextView wasabiText;
    Button okLogin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginText = findViewById(R.id.userId);
        pwText = findViewById(R.id.passwd);
        okLogin = findViewById(R.id.okLogin);
        wasabiText = findViewById(R.id.wasabiText);

        okLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d("확인", "터치이벤트 발생 했다");

//               ctrl + k
                String loginText2 = loginText.getText().toString();
                String passwdText= pwText.getText().toString();

                Toast.makeText(MainActivity.this,  "ID : "+ loginText2 , Toast.LENGTH_SHORT).show();

                wasabiText.setText("ID : "+ loginText2 + " , PW: " + passwdText);



            }

        });





    }
}
