package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button somma =(Button) findViewById(R.id.btn_piu);
        EditText v1=(EditText) findViewById(R.id.Valore1) ;
        EditText v2=(EditText) findViewById(R.id.valore2) ;
        TextView tot=(TextView) findViewById(R.id.risultato);

        somma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totale=0;
                totale=integer.valueOf(v1.getText())+integer.valueOf(v2.getText());
                tot.setText(" "+totale);
            }
        });
    }
}