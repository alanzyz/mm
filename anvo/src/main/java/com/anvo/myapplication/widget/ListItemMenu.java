package com.anvo.myapplication.widget;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import com.anvo.myapplication.R;

/**
 * Created by Administrator on 2017/11/7.
 */

public class ListItemMenu extends PopupWindow {
    private Context mContext;
    private LinearLayout quit,share;

    public ListItemMenu( int width, int height, Context mContext) {
        super(width, height);
        this.mContext = mContext;
        intView();
    }

    private void intView() {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_menu, null);
        setContentView(view);
//        this means
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(0000));
        quit = view.findViewById(R.id.hidequestion);
        share = view.findViewById(R.id.share);
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });


    }
}
