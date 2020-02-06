package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
                    String name= ETname.getText().toString();
                    String number= ETnumber.getText().toString().trim();
                    String email= ETemail.getText().toString().trim();
                    String address= ETaddress.getText().toString();
                    int pic=1;
                    Intent intent= new Intent();
                    intent.putExtra("name",name);
                    intent.putExtra("number",number);
                    intent.putExtra("email",email);
                    intent.putExtra("address",address);
                    intent.putExtra("pic",pic);
                    setResult(RESULT_OK,intent);
                    Main2Activity.this.finish();
                }
            }
        });

        IVkutta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean fields = (ETname.getText().toString().isEmpty()) | (ETnumber.getText().toString().isEmpty()) | (ETemail.getText().toString().isEmpty()) | (ETaddress.getText().toString().isEmpty());
                if (ETaddress.getText().toString().isEmpty()) {
                    Toast.makeText(Main2Activity.this, "Shi me post nhi bhejunga, Postal Address daal", Toast.LENGTH_LONG).show();
                }
                else if (fields) {
                    Toast.makeText(Main2Activity.this, "Sare details bharna zaruri h", Toast.LENGTH_SHORT).show();
                }
                else {
                    String name = ETname.getText().toString();
                    String number = ETnumber.getText().toString().trim();
                    String email = ETemail.getText().toString().trim();
                    String address = ETaddress.getText().toString();
                    Intent intent = new Intent();
                    intent.putExtra("name", name);
                    intent.putExtra("number", number);
                    intent.putExtra("email", email);
                    intent.putExtra("address", address);
                    intent.putExtra("pic",2);
                    setResult(RESULT_OK, intent);
                    Main2Activity.this.finish();
                }
            }
        });

    }
}
