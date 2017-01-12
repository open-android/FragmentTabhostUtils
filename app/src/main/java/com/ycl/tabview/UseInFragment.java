package com.ycl.tabview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.FrameLayout;
import com.ycl.tabview.library.TabView;


public class UseInFragment extends FragmentActivity {
    FragmentSample fragmentSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.use_in_fragment);
        fragmentSample=new FragmentSample();
        getSupportFragmentManager().beginTransaction().add(R.id.frame,fragmentSample).show(fragmentSample).commit();
    }
}
