package com.example.group2login;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);

    }

    public void verifydata(View view) {
        String strusername = username.getText().toString();
        String strpassword = password.getText().toString();


        if (strusername.equals("HAROLD") && strpassword.equals("AWITKA")){

            Intent intent = new Intent(this, HaroldData.class);
            startActivity(intent);

        }else if (strusername.equals("KATH") && strpassword.equals("AWITKA")){

            Intent intent = new Intent(this, KathData.class);
            startActivity(intent);

        }else if (strusername.equals("XYLENE") && strpassword.equals("AWITKA")){

            Intent intent = new Intent(this, XyleneData.class);
            startActivity(intent);

        }else if (strusername.equals("BENJO") && strpassword.equals("AWITKA")){

            Intent intent = new Intent(this, BenjoData.class);
            startActivity(intent);

        }else{

            Toast.makeText(this, "Username or Password is Incorrect!", Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}