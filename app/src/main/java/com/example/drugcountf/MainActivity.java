package com.example.drugcountf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Email;
    private EditText Pass;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email = (EditText)findViewById(R.id.editText1);
        Pass = (EditText)findViewById(R.id.editText2);
        login = (Button)findViewById(R.id.btnp);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Email.getText().toString().equals("abc") &&
                Pass.getText().toString().equals("abc"))
                {
                    Toast toasti = Toast.makeText(getApplicationContext(), "PASS",Toast.LENGTH_LONG);
                    toasti.show();
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
                }

//                Toast toasti = Toast.makeText(getApplicationContext(), Email.getText().toString(),Toast.LENGTH_LONG);
//                Auth(Email.getText().toString(),Pass.getText().toString());
//                //toasti.show();
            }
        });

    }


//    void Auth(String name, String pass){
//        if (name== "abc")
//        {
//            Toast toast1 = Toast.makeText(getApplicationContext(),"LOGGEDIN",Toast.LENGTH_LONG);
//            toast1.show();
//        }
//        else{
//            Toast toast = Toast.makeText(getApplicationContext(),"err Id Pass",Toast.LENGTH_LONG);
//            toast.show();
//        }
//    }
}
