package com.jherrera.myappmenormayor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MAMayor extends AppCompatActivity {

    private EditText campo5;
    private EditText campo6;
    private EditText campo7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mamayor);
        campo5 =findViewById(R.id.txtNumero3);
        campo6 =findViewById(R.id.txtNumero4);
        campo7 =findViewById(R.id.txtValor2);
    }

    public int obtenerAleatorio3() {
        return (int) (Math.random() * 100);
    }
    public int obtenerAleatorio4() {
        return (int) (Math.random() * 100);
    }

    public void aleatorio2(){
        int no1;
        int no2;
        no1 = obtenerAleatorio3();
        no2 = obtenerAleatorio4();
        campo5.setText(String.valueOf(no1));
        campo6.setText(String.valueOf(no2));
    }

    public void multiplicacion(){
        String num1;
        String num2;
        String val;

        num1 = campo5.getText().toString();
        num2 = campo6.getText().toString();
        val = campo7.getText().toString();
        if (!val.isEmpty()){
            int result;
            int resul;
            resul = Integer.parseInt(val);
            result = Integer.parseInt(num2) * Integer.parseInt(num1);

            if (result == resul){
                Toast.makeText(this, "Excelente, eres todo un adulto", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Incorrecto aun eres un bebe", Toast.LENGTH_SHORT).show();
            }

        }else{
            Toast.makeText(this, "Datos no ingresados", Toast.LENGTH_SHORT).show();
        }

    }
    public void pulsar(View view) {
        switch (view.getId()){
            case R.id.btnMostrar2:
                this.multiplicacion();
                break;
            case R.id.btnEmpezar2:
                this.aleatorio2();
                break;
        }
    }
}