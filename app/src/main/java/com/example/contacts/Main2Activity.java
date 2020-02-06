package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

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

        IVpoty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean fields= (ETname.getText().toString().isEmpty()) | (ETnumber.getText().toString().isEmpty()) | (ETemail.getText().toString().isEmpty()) | (ETaddress.getText().toString().isEmpty());
                if(ETaddress.getText().toString().isEmpty()){
                    Toast.makeText(Main2Activity.this,"Shi me post nhi bhejunga, Postal Address daal",Toast.LENGTH_LONG).show();
                }
                else if(fields){
                    Toast.makeText(Main2Activity.this,"Sare details bharna zaruri h",Toast.LENGTH_SHORT).show();
                }
                else{
                    Main2Activity.this.finish();
                }
            }
        });

    }
}
