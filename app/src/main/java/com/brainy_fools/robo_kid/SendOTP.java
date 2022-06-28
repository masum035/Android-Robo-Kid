package com.brainy_fools.robo_kid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SendOTP extends AppCompatActivity {

    private Button buttonGetOTP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_otp);

        final EditText inputMobile = findViewById(R.id.inputMobile);
        buttonGetOTP =findViewById(R.id.buttonGetOTP);

        buttonGetOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputMobile.getText().toString().trim().isEmpty())
                {
                    Toast.makeText(SendOTP.this, "Enter Mobile", Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent intent = new Intent(getApplicationContext(), Dashboard.class);
                intent.putExtra("mobile", inputMobile.getText().toString());
                startActivity(intent);
            }
        });



    }
}