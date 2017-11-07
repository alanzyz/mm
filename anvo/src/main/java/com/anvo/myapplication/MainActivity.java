package com.anvo.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.anvo.myapplication.adapter.FragmentTabAdapter;
import com.anvo.myapplication.fragements.FourFragment;
import com.anvo.myapplication.fragements.IndexFragment;
import com.anvo.myapplication.fragements.SecondFragment;
import com.anvo.myapplication.fragements.ThirdFragment;

import java.util.ArrayList;
import java.util.List;

//extends fragment activity
public class MainActivity extends FragmentActivity {
    private final String TAG = MainActivity.class.getSimpleName();
    private Context context;
    private FrameLayout content;
    private AppBarLayout index_app_bar;
    private List<Fragment> fragments = new ArrayList<>();
    //    some views
    private RadioGroup rgs;
    private RadioButton index_tab;
    private int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        content = findViewById(R.id.content);
        index_app_bar = findViewById(R.id.index_app_bar);
        rgs = findViewById(R.id.tabs_rg);
        index_tab = findViewById(R.id.home_tab);
        fragments.add(new IndexFragment());
        fragments.add(new SecondFragment());
        fragments.add(new ThirdFragment());
        fragments.add(new FourFragment());

        FragmentTabAdapter tabAdapter = new FragmentTabAdapter(fragments, rgs, this, R.id.content);
        tabAdapter.setOnRgsExtraCheckedChangedListener(new FragmentTabAdapter.OnRgsExtraCheckedChangedListener() {
            @Override
            public void OnRgsExtraCheckedChanged(RadioGroup radioGroup, int checkedId, int index) {
                super.OnRgsExtraCheckedChanged(radioGroup, checkedId, index);
                Log.e("CheckedChanged", "=======" + index);
                currentIndex = index;
                resetView();
                switch (index) {
                    case 0:
                        index_app_bar.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        break;


                }
            }


        });


    }

    private void resetView() {
        index_app_bar.setVisibility(View.GONE);

    }

    @Override
    public void onBackPressed() {

        if (currentIndex != 0) {
            index_tab.setChecked(true);
        } else {
            super.onBackPressed();
        }
    }
}
