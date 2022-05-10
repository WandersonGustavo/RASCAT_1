package com.example.rascat_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.rascat_3.User_3.User_2;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Cadastro2 extends AppCompatActivity {

    private EditText nominho;
    private EditText EmailDois;
    private EditText PasswordSim;
    private Integer num;
    private Button cad;
    private FirebaseAuth fbAuth;
    private User_2 userDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro2);

       // nominho = findViewById(R.id.nominho);
       // EmailDois = findViewById(R.id.EmailDois);
        PasswordSim = findViewById(R.id.class.getModifiers());
       // num = findViewById(( R.id.num));
      //  cad = findViewById(R.id.cad);
        fbAuth= FirebaseAuth.getInstance();

        cad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recuperarDados();
                criarLogin();
            }
        });

        private void criarLongin(){
            fbAuth.createUserWithEmailAndPassword(userDB.getEmail(),userDB.getSenha())
            .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){

                    }else{
                        Toast.makeText();
                    }
                }
            });
        }

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
            userDB=new User_2();
        }
    }
}