package com.example.assignment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        EditText fullName= findViewById(R.id.signup_firstname);
        EditText fullName= findViewById(R.id.editTextText2);
        EditText fullname= findViewById(R.id.editTextTextEmailAddress);
        EditText fullname= findViewById(R.id.editTextTextPassword);
        EditText fullname=findViewById(R.id.editTextTextPassword2);

//        Button button = findViewById(R.id.signup_button);
//        button.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v){
//                //Toast.makeText(content this, text"JENNIFER" int=)
           }
       });





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
    }
}