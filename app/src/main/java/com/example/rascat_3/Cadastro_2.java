package com.example.rascat_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.rascat_3.User_3.User_2;

public class Cadastro_2 extends AppCompatActivity {

    private EditText nominho;
    private EditText EmailDois;
    private EditText PasswordSim;
    private Integer num;
    private Button cad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro2);

        /*nominho = findViewById(R.id.nominho);
        EmailDois = findViewById(R.id.EmailDois);
        PasswordSim = findViewById(R.id);
        //num = findViewById(R.id.num)
        cad = findViewById(R.id.cad);*/

        cad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recuperarDados();
            }
        });
    }

    private void recuperarDados() {
        if(nominho.getText().toString()==" "||EmailDois.getText().toString()==" "
                ||PasswordSim.getText().toString()==" "/*||num.get.toString()=" "*/) {
            Toast.makeText(this, "Preencha todos os dados", Toast.LENGTH_LONG);
        }else {
            User_2 u = new User_2();
            u.setNome(nominho.getText().toString());
            u.setEmail(EmailDois.getText().toString());
            u.setSenha(PasswordSim.getText().toString());
            //u.setNumero(num.getText().toString());
        }
    }
}