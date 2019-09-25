package com.example.experiment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LvClassActivity extends AppCompatActivity{

    private ListView lvkcb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvclass);

        lvkcb = findViewById(R.id.lv_kcb);
        String[] datas = {
                "Android应用程序开发",
                "移动应用程序测试",
                "高等数学",
                "高职英语",
                "Java程序设计语言",
                "Android游戏开发",
                "心理健康",
                "体育"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, datas);
        lvkcb.setAdapter(adapter);
        lvkcb.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(LvClassActivity.this,IntroActivity.class);
                intent.putExtra("class","");
                startActivity(intent);
            }
        });
    }
}
