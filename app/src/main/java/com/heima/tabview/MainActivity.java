package com.heima.tabview;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void quick_start(View view){
        startActivity(new Intent(this,QuickStartActivity.class));
    }
    public void custom_in_xml(View view){
        startActivity(new Intent(this,CustomInXmlActivity.class));
    }
    public void custom_in_java(View view){
        startActivity(new Intent(this,CustomInJavaActivity.class));
    }
    public void use_in_fragment(View view){
        startActivity(new Intent(this,UseInFragment.class));
    }



}
