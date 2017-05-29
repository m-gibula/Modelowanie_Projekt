package com.example.bakkchos.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by bakkchos on 29.05.2017.
 */

public class CustomMain extends View {
    Paint p,b1,b2,bg;
    Canvas can;
    int b1x,b1y,b2x,b2y;
    public static String EXTRA_MESSAGE1 = "1";
    public CustomMain(Context context) {
        super(context);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        SystemClock.sleep(1000);

        Intent intent = new Intent(getContext(), Subjects.class);
        EXTRA_MESSAGE1 = "1";
        intent.putExtra(EXTRA_MESSAGE1,"1");
        getContext().startActivity(intent);


        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {

        can = canvas;
        super.onDraw(canvas);
        int[] center = new int[2];
        center[0] = canvas.getWidth()/2;
        center[1] = canvas.getHeight()/2;








        Bitmap bg= BitmapFactory.decodeResource(getResources(), R.drawable.bg);
        canvas.drawBitmap(bg, null, new RectF(0, 0, canvas.getWidth(),canvas.getHeight()), null);

        p=new Paint();
        Bitmap b= BitmapFactory.decodeResource(getResources(), R.drawable.pwsz);
        p.setColor(Color.RED);
        canvas.drawBitmap(b,(canvas.getWidth()/2)-(b.getWidth()/2),(canvas.getHeight()/2)-(b.getHeight()/2), p);

       /* b1=new Paint();
        Bitmap btn1= BitmapFactory.decodeResource(getResources(), R.drawable.btn1);
        b1.setColor(Color.RED);
        b1x = center[0]-btn1.getWidth()-20;
        b1y = 100;
        canvas.drawBitmap(btn1,b1x,b1y, b1);

        b2=new Paint();
        Bitmap btn2= BitmapFactory.decodeResource(getResources(), R.drawable.btn2);
        b2.setColor(Color.RED);
        b2x = center[0]+20;
        b2y =100;
        canvas.drawBitmap(btn2,b2x,b2y, b2);
*/



    }
}
