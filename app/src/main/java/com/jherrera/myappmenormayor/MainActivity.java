package com.jherrera.myappmenormayor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText campo1;
    private EditText campo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campo1 =findViewById(R.id.txtNombre);
        campo2 =findViewById(R.id.txtEdad);
    }

    public void producto(){
        String nombre;
        String edad;
        nombre = campo1.getText().toString();
        edad = campo2.getText().toString();
        if (!nombre.isEmpty()&&!edad.isEmpty()){
            int eda;
            eda = Integer.parseInt(edad);
            if (eda<18){
                Intent intent = new Intent(this,MAMenor.class);
                startActivity(intent);
                finish();
            }else if(eda>=18){
                Intent intent = new Intent(this,MAMayor.class);
                startActivity(intent);
                finish();
            }

        }else{
            Toast.makeText(this, "Datos no ingresados", Toast.LENGTH_SHORT).show();
        }

    }

    public void pulsar(View view) {
        switch (view.getId()){
            case R.id.btnMostrar:
                this.producto();
                break;
        }

    }
}