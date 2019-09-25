package com.example.experiment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SpaceActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView welcome;
    private ImageView ivkcgl;
    private ImageView ivgjx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space);

        ivkcgl=findViewById(R.id.iv_kcgl);
        ivgjx=findViewById(R.id.iv_gjx);

        ivkcgl.setOnClickListener(this);

        welcome = findViewById(R.id.welcome);
        Intent intent = getIntent();
        String name = intent.getStringExtra("class");
        if (name != null){
            welcome.setText("欢迎"+name+"来到的空间");
        }

        ivkcgl = findViewById(R.id.iv_kcgl);
        ivgjx = findViewById(R.id.iv_gjx);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.iv_kcgl:
                Intent intent=new Intent(SpaceActivity.this, LvClassActivity.class);
                startActivity(intent);
                break;
            case R.id.iv_gjx:

                break;
        }
    }
}
