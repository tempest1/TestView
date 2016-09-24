package com.example.zhoudi.testview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PieView pv=(PieView)findViewById(R.id.pv);
        pv.update(this,1,2,3,4);

        PieView pv2=(PieView)findViewById(R.id.pv2);
        pv2.update(this,2,3,4,5);
    }
}
