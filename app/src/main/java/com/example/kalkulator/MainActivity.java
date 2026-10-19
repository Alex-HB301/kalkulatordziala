package com.example.kalkulator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    String zmienna1 = "";
    String  zmienna2 = "";
    String kontrolka = "";
    int znak = -1;
    View.OnClickListener listenerZmienna;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    TextView wyswietlacz = findViewById(R.id.textView);

    if(znak == -1){
        listenerZmienna = v -> {
            kontrolka = ((Button) v).getText().toString();
            System.out.println(kontrolka);
            if(kontrolka.equals("+")){
                znak = 1;
                wyswietlacz.setText("+");
            } else if (kontrolka.equals("-")) {
                znak = 2;
                wyswietlacz.setText("-");
            }
            else if (kontrolka.equals("*")) {
                znak = 3;
                wyswietlacz.setText("*");
            }
            else if (kontrolka.equals("/")) {
                znak = 4;
                wyswietlacz.setText("/");
            }
            else{
                zmienna1 += ((Button) v).getText().toString();
                wyswietlacz.setText(zmienna1);
            }
        };
    }
    else{
        listenerZmienna = v -> {
            
        };
    }

    findViewById(R.id.btn0).setOnClickListener(listenerZmienna);
    findViewById(R.id.btn1).setOnClickListener(listenerZmienna);
    findViewById(R.id.btn2).setOnClickListener(listenerZmienna);
    findViewById(R.id.btn3).setOnClickListener(listenerZmienna);
    findViewById(R.id.btn4).setOnClickListener(listenerZmienna);
    findViewById(R.id.btn5).setOnClickListener(listenerZmienna);
    findViewById(R.id.btn6).setOnClickListener(listenerZmienna);
    findViewById(R.id.btn7).setOnClickListener(listenerZmienna);
    findViewById(R.id.btn8).setOnClickListener(listenerZmienna);
    findViewById(R.id.btn9).setOnClickListener(listenerZmienna);
    findViewById(R.id.btnPlus).setOnClickListener(listenerZmienna);
    findViewById(R.id.btnMinus).setOnClickListener(listenerZmienna);
    findViewById(R.id.btnMultiply).setOnClickListener(listenerZmienna);
    findViewById(R.id.btnDivide).setOnClickListener(listenerZmienna);
    }


}