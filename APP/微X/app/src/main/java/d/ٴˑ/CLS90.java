// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.app.Activity;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.SweepGradient;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import d.ᵎʻ.CLS210;

public final class CLS90 extends View {
    public interface CLS89 {
    }

    public int FLD462;
    public Bitmap FLD463;
    public Path FLD464;
    public CLS89 FLD465;
    public float[] FLD466;
    public int FLD467;
    public int FLD468;
    public RectF FLD469;
    public Path FLD470;
    public RectF FLD471;
    public Paint FLD472;
    public int FLD473;
    public RectF FLD474;
    public Paint FLD475;
    public Path FLD476;
    public Paint FLD477;
    public Matrix FLD478;
    public Paint FLD479;
    public Paint FLD480;
    public Paint FLD481;

    public CLS90(Activity activity0) {
        super(activity0);
        this.FLD466 = new float[]{0.0f, 0.0f, 1.0f};
        Paint paint0 = new Paint();
        this.FLD479 = paint0;
        paint0.setStyle(Paint.Style.STROKE);
        this.FLD479.setStrokeWidth(2.0f);
        this.FLD479.setARGB(0x80, 0, 0, 0);
        Paint paint1 = new Paint();
        this.FLD481 = paint1;
        paint1.setStyle(Paint.Style.STROKE);
        this.FLD481.setStrokeWidth(2.0f);
        this.FLD475 = new Paint();
        Paint paint2 = new Paint();
        this.FLD477 = paint2;
        paint2.setAntiAlias(true);
        this.FLD477.setDither(true);
        Paint paint3 = new Paint();
        this.FLD472 = paint3;
        paint3.setAntiAlias(true);
        this.FLD472.setDither(true);
        Paint paint4 = new Paint();
        this.FLD480 = paint4;
        paint4.setAntiAlias(true);
        this.FLD476 = new Path();
        this.FLD464 = new Path();
        this.FLD470 = new Path();
        this.FLD471 = new RectF();
        this.FLD469 = new RectF();
        this.FLD474 = new RectF();
    }

    public int getColor() {
        return Color.HSVToColor(this.FLD466);
    }

    @Override  // android.view.View
    public final void onDraw(Canvas canvas0) {
        int v = this.getWidth();
        int v1 = this.getHeight();
        canvas0.drawBitmap(this.FLD463, ((float)(v / 2 - this.FLD468)), ((float)(v1 / 2 - this.FLD468)), null);
        this.FLD480.setColor(Color.HSVToColor(this.FLD466));
        canvas0.drawPath(this.FLD476, this.FLD480);
        float[] arr_f = new float[3];
        float[] arr_f1 = this.FLD466;
        arr_f[0] = arr_f1[0];
        arr_f[1] = arr_f1[1];
        arr_f[2] = 1.0f;
        SweepGradient sweepGradient0 = new SweepGradient(((float)(v / 2)), ((float)(v1 / 2)), new int[]{0xFF000000, Color.HSVToColor(arr_f), -1}, null);
        sweepGradient0.setLocalMatrix(this.FLD478);
        this.FLD472.setShader(sweepGradient0);
        canvas0.drawPath(this.FLD464, this.FLD472);
        double f = (double)(((float)Math.toRadians(this.FLD466[0])));
        int v2 = this.FLD468;
        float f1 = ((float)v2) * 0.075f / 2.0f;
        RectF rectF0 = this.FLD474;
        float f2 = (float)(((int)(((float)(((int)(-Math.cos(f) * ((double)this.FLD466[1]) * ((double)this.FLD468))) + v / 2)) - f1)));
        float f3 = (float)(((int)(((float)(((int)(-Math.sin(f) * ((double)this.FLD466[1]) * ((double)v2))) + v1 / 2)) - f1)));
        rectF0.set(f2, f3, f2 + ((float)v2) * 0.075f, ((float)v2) * 0.075f + f3);
        canvas0.drawOval(this.FLD474, this.FLD479);
        this.FLD481.setColor(Color.HSVToColor(new float[]{0.0f, 0.0f, 1.0f - this.FLD466[2]}));
        double f4 = ((double)(this.FLD466[2] - 0.5f)) * 3.141593;
        float f5 = (float)Math.cos(f4);
        float f6 = (float)Math.sin(f4);
        canvas0.drawLine(((float)this.FLD467) * f5 + ((float)(v / 2)), ((float)this.FLD467) * f6 + ((float)(v1 / 2)), ((float)(v / 2)) + f5 * ((float)this.FLD473), f6 * ((float)this.FLD473) + ((float)(v1 / 2)), this.FLD481);
        if(this.FLD462 > 0) {
            int v3 = this.getWidth();
            int v4 = this.getHeight();
            double f7 = ((double)(this.FLD466[2] - 0.5f)) * 3.141593;
            double f8 = Math.cos(f7) * ((double)this.FLD473);
            double f9 = Math.sin(f7) * ((double)this.FLD473);
            double f10 = Math.cos(f7 + 0.032725) * ((double)(this.FLD473 + this.FLD462));
            double f11 = Math.sin(f7 + 0.032725) * ((double)(this.FLD473 + this.FLD462));
            double f12 = Math.cos(f7 - 0.032725) * ((double)(this.FLD473 + this.FLD462));
            double f13 = Math.sin(f7 - 0.032725) * ((double)(this.FLD473 + this.FLD462));
            this.FLD470.reset();
            float f14 = ((float)f8) + ((float)(v3 / 2));
            float f15 = ((float)f9) + ((float)(v4 / 2));
            this.FLD470.moveTo(f14, f15);
            this.FLD470.lineTo(((float)f10) + ((float)(v3 / 2)), ((float)f11) + ((float)(v4 / 2)));
            this.FLD470.lineTo(((float)f12) + ((float)(v3 / 2)), ((float)f13) + ((float)(v4 / 2)));
            this.FLD470.lineTo(f14, f15);
            this.FLD475.setColor(Color.HSVToColor(this.FLD466));
            this.FLD475.setStyle(Paint.Style.FILL);
            canvas0.drawPath(this.FLD470, this.FLD475);
            this.FLD475.setStyle(Paint.Style.STROKE);
            this.FLD475.setStrokeJoin(Paint.Join.ROUND);
            this.FLD475.setColor(0xFF000000);
            canvas0.drawPath(this.FLD470, this.FLD475);
        }
    }

    @Override  // android.view.View
    public final void onMeasure(int v, int v1) {
        int v2 = Math.min(View.MeasureSpec.getSize(v), View.MeasureSpec.getSize(v1));
        this.setMeasuredDimension(v2, v2);
    }

    @Override  // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if(parcelable0 instanceof Bundle) {
            this.FLD466 = ((Bundle)parcelable0).getFloatArray("color");
            parcelable0 = ((Bundle)parcelable0).getParcelable("super");
        }
        super.onRestoreInstanceState(parcelable0);
    }

    @Override  // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle0 = new Bundle();
        bundle0.putFloatArray("color", this.FLD466);
        bundle0.putParcelable("super", super.onSaveInstanceState());
        return bundle0;
    }

    @Override  // android.view.View
    public final void onSizeChanged(int v, int v1, int v2, int v3) {
        int v4 = v * 4 / 100;
        this.FLD462 = v4;
        int v5 = v / 2 - v * 2 / 100 - v4;
        this.FLD473 = v5;
        int v6 = v5 - v * 10 / 100;
        this.FLD467 = v6;
        this.FLD468 = v6 - v * 5 / 100;
        this.FLD471.set(((float)(v / 2 - v5)), ((float)(v1 / 2 - v5)), ((float)(v / 2 + v5)), ((float)(v5 + v1 / 2)));
        this.FLD469.set(((float)(v / 2 - this.FLD467)), ((float)(v1 / 2 - this.FLD467)), ((float)(v / 2 + this.FLD467)), ((float)(this.FLD467 + v1 / 2)));
        int v7 = this.FLD468 * 2;
        int v8 = this.FLD468 * 2;
        Bitmap bitmap0 = Bitmap.createBitmap(v7, v8, Bitmap.Config.ARGB_8888);
        int[] arr_v = new int[13];
        float[] arr_f = {0.0f, 1.0f, 1.0f};
        for(int v9 = 0; v9 < 13; ++v9) {
            arr_f[0] = (float)((v9 * 30 + 180) % 360);
            arr_v[v9] = Color.HSVToColor(arr_f);
        }
        arr_v[12] = arr_v[0];
        ComposeShader composeShader0 = new ComposeShader(new SweepGradient(((float)(v7 / 2)), ((float)(v8 / 2)), arr_v, null), new RadialGradient(((float)(v7 / 2)), ((float)(v8 / 2)), ((float)this.FLD468), -1, 0xFFFFFF, Shader.TileMode.CLAMP), PorterDuff.Mode.SRC_OVER);
        this.FLD477.setShader(composeShader0);
        new Canvas(bitmap0).drawCircle(((float)(v7 / 2)), ((float)(v8 / 2)), ((float)this.FLD468), this.FLD477);
        this.FLD463 = bitmap0;
        Matrix matrix0 = new Matrix();
        this.FLD478 = matrix0;
        matrix0.preRotate(270.0f, ((float)(v / 2)), ((float)(v1 / 2)));
        this.FLD476.arcTo(this.FLD471, 270.0f, -180.0f);
        this.FLD476.arcTo(this.FLD469, 90.0f, 180.0f);
        this.FLD464.arcTo(this.FLD471, 270.0f, 180.0f);
        this.FLD464.arcTo(this.FLD469, 90.0f, -180.0f);
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        switch(motionEvent0.getAction()) {
            case 0: 
            case 2: {
                int v = (int)motionEvent0.getX();
                int v1 = (int)motionEvent0.getY();
                int v2 = v - this.getWidth() / 2;
                int v3 = v1 - this.getHeight() / 2;
                double f = Math.sqrt(v3 * v3 + v2 * v2);
                if(f <= ((double)this.FLD468)) {
                    this.FLD466[0] = (float)(Math.toDegrees(Math.atan2(v3, v2)) + 180.0);
                    this.FLD466[1] = Math.max(0.0f, Math.min(1.0f, ((float)(f / ((double)this.FLD468)))));
                    this.invalidate();
                }
                else if(v >= this.getWidth() / 2 && f >= ((double)this.FLD467)) {
                    this.FLD466[2] = (float)Math.max(0.0, Math.min(1.0, Math.atan2(v3, v2) / 3.141593 + 0.5));
                    this.invalidate();
                }
                CLS89 יʻ$ᐧי0 = this.FLD465;
                if(יʻ$ᐧי0 != null) {
                    int v4 = this.getColor();
                    ((CLS87)((CLS210)יʻ$ᐧי0).FLD661).getClass();
                    ((CLS87)((CLS210)יʻ$ᐧי0).FLD661).FLD442 = Color.red(v4);
                    ((CLS87)((CLS210)יʻ$ᐧי0).FLD661).FLD433 = Color.green(v4);
                    ((CLS87)((CLS210)יʻ$ᐧי0).FLD661).FLD436 = Color.blue(v4);
                    ((CLS87)((CLS210)יʻ$ᐧי0).FLD661).FLD441.setProgress(((CLS87)((CLS210)יʻ$ᐧי0).FLD661).FLD442);
                    ((CLS87)((CLS210)יʻ$ᐧי0).FLD661).FLD437.setProgress(((CLS87)((CLS210)יʻ$ᐧי0).FLD661).FLD433);
                    ((CLS87)((CLS210)יʻ$ᐧי0).FLD661).FLD435.setProgress(((CLS87)((CLS210)יʻ$ᐧי0).FLD661).FLD436);
                    ((CLS87)((CLS210)יʻ$ᐧי0).FLD661).MTH935();
                }
                return true;
            }
            default: {
                return super.onTouchEvent(motionEvent0);
            }
        }
    }

    public void setColor(int v) {
        Color.colorToHSV(v, this.FLD466);
        this.invalidate();
    }

    public void setOnColorSelectedListener(CLS89 יʻ$ᐧי0) {
        this.FLD465 = יʻ$ᐧי0;
    }
}

