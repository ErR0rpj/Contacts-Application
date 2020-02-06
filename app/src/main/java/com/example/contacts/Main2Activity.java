package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    EditText ETname,ETnumber,ETemail,ETaddress;
    ImageView IVpoty,IVkutta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ETname= findViewById(R.id.ETname);
        ETnumber= findViewById(R.id.ETnumber);
        ETemail= findViewById(R.id.ETemail);
        ETaddress= findViewById(R.id.ETaddress);
        IVpoty= findViewById(R.id.IVpoty);
        IVkutta= findViewById(R.id.IVkutta);

        

    }
}
