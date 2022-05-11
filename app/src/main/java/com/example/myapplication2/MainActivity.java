package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resultaldo;
    private EditText txtGrado;
    private RadioButton rb1, rb2;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtGrado = findViewById(R.id.txtGrados);
        btn = findViewById(R.id.btnConvetir);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        resultaldo = findViewById(R.id.lblR);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtGrado.getText() != null){
                    float grados = Float.parseFloat(txtGrado.getText().toString());
                    float r;
                    resultaldo.setText("Seleccione el tipo a convertir!");
                    if (rb1.isChecked()){
                        r = Math.round((grados*1.8+32)*100)/100;
                        resultaldo.setText(r+"°F");
                    }else if (rb2.isChecked()){
                        r = Math.round((grados-32)/1.8*100)/100;
                        resultaldo.setText(r+"°C");
                    }
                }
            }
        });
    }
}