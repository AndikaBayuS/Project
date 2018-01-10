package com.siborder.telkom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
Button Login;
EditText U, P;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Login = (Button) findViewById(R.id.BtnLogin);
        U = (EditText) findViewById(R.id.Username);
        P = (EditText) findViewById(R.id.Password);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String User = U.getText().toString();
                String Pass = P.getText().toString();
                if(User.equals("guest") && Pass.equals("guest")){
                    Intent next = new Intent(LoginActivity.this, MenuActivity.class);
                    startActivity(next);
                    finish();

                } else if(User.matches("")|| Pass.matches("")){
                    Toast.makeText(getApplication(),"Usernmae atau password tidak boleh kosong", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplication(), "Gagal Login, Username atau password Salah", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
