package com.example.kalkulator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    String mainZmienna;
    String zmienna1;
    String  zmienna2;
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

    if(znak == -1){
        listenerZmienna = v -> {
            zmienna1 += ((Button) v).getText().toString();
            mainZmienna = zmienna1;
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

    }

    private void setZmienna1(){

    }

    private void setZmienna2(){

    }

    private void setZnak(){

    }
}