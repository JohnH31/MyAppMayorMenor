package com.jherrera.myappmenormayor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MAMenor extends AppCompatActivity {

    private EditText campo1;
    private EditText campo2;
    private EditText campo3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mamenor);
        campo1 =findViewById(R.id.txtNumero1);
        campo2 =findViewById(R.id.txtNumero2);
        campo3 =findViewById(R.id.txtValor);
    }

    public int obtenerAleatorio1() {
        return (int) (Math.random() * 100);
    }
    public int obtenerAleatorio2() {
        return (int) (Math.random() * 100);
    }

    public void aleatorio(){
        int no1;
        int no2;
        no1 = obtenerAleatorio1();
        no2 = obtenerAleatorio2();
        campo1.setText(String.valueOf(no1));
        campo2.setText(String.valueOf(no2));
    }

    public void suma(){
        String num1;
        String num2;
        String val;

        num1 = campo1.getText().toString();
        num2 = campo2.getText().toString();
        val = campo3.getText().toString();
        if (!val.isEmpty()){
            int result;
            int resul;
            resul = Integer.parseInt(val);
            result = Integer.parseInt(num2) + Integer.parseInt(num1);

            if (result == resul){
                Toast.makeText(this, "Es correcto ya no eres tan bebe", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Incorrecto aun eres un bebe", Toast.LENGTH_SHORT).show();
            }

        }else{
            Toast.makeText(this, "Datos no ingresados", Toast.LENGTH_SHORT).show();
        }

    }

    public void pulsar(View view) {
        switch (view.getId()){
            case R.id.btnMostrar:
                this.suma();
                break;
            case R.id.btnEmpezar:
                this.aleatorio();
                break;
        }
    }
}