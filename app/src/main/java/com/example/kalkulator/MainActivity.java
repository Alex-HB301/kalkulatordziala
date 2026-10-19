package com.example.kalkulator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.text.HtmlKt;
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

    listenerZmienna = v -> {
        kontrolka = ((Button) v).getText().toString();
        System.out.println("kebab");
        if(kontrolka.equals("C")){
            znak = -1;
            zmienna1 = "";
            zmienna2 = "";
            wyswietlacz.setText("0");
        }
        else if(kontrolka.equals("=")){
            if(znak == -1 || zmienna1.equals("") || zmienna2.equals("")){
                wyswietlacz.setText("ty debilu skonczony, ty idioto");
            }
            else{
                float rownanie1 = Float.parseFloat(zmienna1);
                float roundedValue1 = Math.round(rownanie1 * 10000.0f) / 10000.0f;
                float rownanie2 = Float.parseFloat(zmienna2);
                float roundedValue2 = Math.round(rownanie2 * 10000.0f) / 10000.0f;
                float wynik;
                if(znak == 1){
                    wynik = roundedValue1 + roundedValue2;
                    wyswietlacz.setText(Float.toString(wynik));
                    zmienna1 = "";
                    zmienna2 = "";
                    znak = -1;
                }
                else if(znak == 2){
                    wynik = roundedValue1 - roundedValue2;
                    wyswietlacz.setText(Float.toString(wynik));
                    zmienna1 = "";
                    zmienna2 = "";
                    znak = -1;
                }
                else if(znak == 3){
                    wynik = roundedValue1 * roundedValue2;
                    wyswietlacz.setText(Float.toString(wynik));
                    zmienna1 = "";
                    zmienna2 = "";
                    znak = -1;
                }
                else{
                    wynik = roundedValue1 / roundedValue2;
                    wynik = roundedValue1 / roundedValue2;
                    wyswietlacz.setText(Float.toString(wynik));
                    zmienna1 = "";
                    zmienna2 = "";
                    znak = -1;
                }
            }
        }
        else if(znak == -1){
            if(kontrolka.equals("+")){
                znak = 1;
                wyswietlacz.setText("+");
                System.out.println(znak);
            } else if (kontrolka.equals("-")) {
                znak = 2;
                wyswietlacz.setText("-");
                System.out.println(znak);
            }
            else if (kontrolka.equals("*")) {
                znak = 3;
                wyswietlacz.setText("*");
                System.out.println(znak);
            }
            else if (kontrolka.equals("/")) {
                znak = 4;
                wyswietlacz.setText("/");
                System.out.println(znak);
            }
            else{
                zmienna1 += ((Button) v).getText().toString();
                wyswietlacz.setText(zmienna1);
            }
        }
        else{
            if(kontrolka.equals("+")){
                wyswietlacz.setText("ty debilu skonczony, ty idioto");
            } else if (kontrolka.equals("-")) {
                wyswietlacz.setText("ty debilu skonczony, ty idioto");
            }
            else if (kontrolka.equals("*")) {
                wyswietlacz.setText("ty debilu skonczony, ty idioto");
            }
            else if (kontrolka.equals("/")) {
                wyswietlacz.setText("ty debilu skonczony, ty idioto");
            }
            else{
                zmienna2 += ((Button) v).getText().toString();
                wyswietlacz.setText(zmienna2);
            }
        }
    };

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
    findViewById(R.id.btnComa).setOnClickListener(listenerZmienna);
    findViewById(R.id.btnSend).setOnClickListener(listenerZmienna);
    findViewById(R.id.btnReset).setOnClickListener(listenerZmienna);
    }


}