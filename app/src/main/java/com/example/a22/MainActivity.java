package com.example.a22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtResult;
    private Button btnCheckTicket;
    private EditText etTicketNumber;

    private Algorithm algorithm = new Algorithm();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResult = findViewById(R.id.txtResult);
        btnCheckTicket = findViewById(R.id.btnCheckTicket);
        etTicketNumber = findViewById(R.id.ticketNumber);

        btnCheckTicket.setOnClickListener(listener);

    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String number = etTicketNumber.getText().toString();
            if(algorithm.isHappyTicket(number)){
                txtResult.setText("Это число счастливое");
            } else {
                int newHappyNumber = algorithm.nextHappyInt(number);
                txtResult.setText("Новое счастливоке число" + newHappyNumber);
            }


        }
    };
}


