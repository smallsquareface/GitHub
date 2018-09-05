package com.qk.fragment_detail;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

public class Dynamic_Method_Activity extends FragmentActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_method);

        findViewById(R.id.dynamic_add_btn1).setOnClickListener(this);
        findViewById(R.id.dynamic_add_btn2).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.dynamic_add_btn1: {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.dynamic_add_container, new Fragment1());
                transaction.commit();
            }
            break;
            case R.id.dynamic_add_btn2: {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.dynamic_add_container, new Fragment2());
                transaction.commit();
            }
            break;


            default:
                break;
        }
    }
}
