package com.example.sonjaehyeong.ms_hw09_201302419;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ClickView m = new ClickView(this);
        setContentView(m);
    }
}

class ClickView extends View {
    int x=550, y=500;

    public ClickView(Context context) {
        super(context);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        canvas.drawRect(x-100,y-100,x+100,y+100, paint);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN :
            case MotionEvent.ACTION_MOVE :
                x = (int)event.getX();
                y = (int)event.getY();

                invalidate();
        }
        return true;
    }
}