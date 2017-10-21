package com.example.hatice.toastformati;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        Button button=(Button)findViewById(R.id.toastButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etext=(EditText)findViewById(R.id.toast_editText);


                String yazi=etext.getText().toString().trim();
                if (yazi.isEmpty()){
                    yazi="Mesaj girilmedi!";
                }
                else
                {
                    yazi=etext.getText().toString().trim();

                }
                Toast.makeText(getApplicationContext(),yazi,Toast.LENGTH_SHORT).show();


            }
        });


    }
}

