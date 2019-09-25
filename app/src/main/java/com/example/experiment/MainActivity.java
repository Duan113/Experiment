package com.example.experiment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etname,etpass;
    private Button btlogin,btexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etname=findViewById(R.id.et_name);
        etpass=findViewById(R.id.et_pass);
        btlogin=findViewById(R.id.bt_login);
        btexit=findViewById(R.id.bt_exit);

        etname.setOnClickListener(this);
        etpass.setOnClickListener(this);
        btlogin.setOnClickListener(this);
        btexit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_login:

                String name = ((EditText) findViewById(R.id.et_name)).getText().toString();
                String password = ((EditText) findViewById(R.id.et_pass)).getText().toString();

                if(name.equals("ddp")&& password.equals("123")){
                    Intent intent = new Intent(MainActivity.this,SpaceActivity.class);
                    intent.putExtra("class",name);
                    startActivity(intent);}
                    else {
                    Toast.makeText(MainActivity.this,"用户名或密码错误",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.bt_exit:
                break;
        }
    }
}
