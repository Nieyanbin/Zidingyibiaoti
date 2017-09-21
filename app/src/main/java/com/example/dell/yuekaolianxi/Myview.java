package com.example.dell.yuekaolianxi;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by dell on 2017/9/21.
 */
public class Myview extends LinearLayout{
    public Myview(Context context, AttributeSet attrs) {
        super(context, attrs);
        //获取属性
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.Myview);
        String zhongjian_text = typedArray.getString(R.styleable.Myview_zhongjian_text);
        int zhongjian_color = typedArray.getColor(R.styleable.Myview_zhongjian_color, Color.YELLOW);
        float zhongjian_size = typedArray.getDimension(R.styleable.Myview_zhongjian_size, 20);
        int zhongjian_bg = typedArray.getColor(R.styleable.Myview_zhongjian_bg, Color.BLACK);

        String left_text = typedArray.getString(R.styleable.Myview_left_text);
        int left_color = typedArray.getColor(R.styleable.Myview_left_color, Color.YELLOW);
        float left_size = typedArray.getDimension(R.styleable.Myview_left_size, 20);
        int left_bg = typedArray.getColor(R.styleable.Myview_left_bg, Color.BLACK);

        String right_img = typedArray.getString(R.styleable.Myview_right_img);
        int right_color = typedArray.getColor(R.styleable.Myview_right_color, Color.YELLOW);
        float right_size = typedArray.getDimension(R.styleable.Myview_right_size, 20);
        int right_bg = typedArray.getColor(R.styleable.Myview_right_bg, Color.BLACK);

        typedArray.recycle();

        View view=View.inflate(context,R.layout.itema,this);
        TextView tvleft=view.findViewById(R.id.tvleft);
        TextView tvzj=view.findViewById(R.id.tvzj);
        ImageView img=view.findViewById(R.id.img);

        tvleft.setText(left_text);
//        tvleft.setTextColor(left_color);
        tvleft.setTextSize(left_size);
//        tvleft.setBackgroundColor(left_bg);

        tvzj.setText(zhongjian_text);
//        tvzj.setTextColor(zhongjian_color);
        tvzj.setTextSize(zhongjian_size);
//        tvzj.setBackgroundColor(zhongjian_bg);

    }
}
