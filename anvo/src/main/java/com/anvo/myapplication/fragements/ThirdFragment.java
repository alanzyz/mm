package com.anvo.myapplication.fragements;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anvo.myapplication.R;

/**
 * Created by Administrator on 2017/11/7.
 */

public class ThirdFragment extends Fragment {
    private Context mContext;
    private  View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_three,container,false);
        return rootView;
    }
}
