 package com.example.rascat_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity {

     private Button logar;
     private Button btCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      // logar = findViewById(R.id.logar);
        //btCadastro = findViewById(R.id.btCadastro);

        logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telaLogar();
            }
        });

        btCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telaCadastar();
            }

        });
    }
     private void telaCadastar() {
         startActivity(new Intent( /*this ,Cadastro_2.class*/));
     }

     private void telaLogar() {
         startActivity(new Intent(this,Login_2.class));
     }
}