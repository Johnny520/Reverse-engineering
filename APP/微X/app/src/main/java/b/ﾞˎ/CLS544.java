// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

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
import b.ᵔʾ.CLS1229;

public final class CLS544 extends View {
    public interface CLS543 {
    }

    public Path FLD5327;
    public RectF FLD5328;
    public RectF FLD5329;
    public Paint FLD5330;
    public Path FLD5331;
    public int FLD5332;
    public RectF FLD5333;
    public int FLD5334;
    public float[] FLD5335;
    public Bitmap FLD5336;
    public Paint FLD5337;
    public int FLD5338;
    public Path FLD5339;
    public Paint FLD5340;
    public CLS543 FLD5341;
    public Paint FLD5342;
    public Matrix FLD5343;
    public int FLD5344;
    public Paint FLD5345;
    public Paint FLD5346;

    public CLS544(Activity activity0) {
        super(activity0);
        this.FLD5335 = new float[]{0.0f, 0.0f, 1.0f};
        Paint paint0 = new Paint();
        this.FLD5342 = paint0;
        paint0.setStyle(Paint.Style.STROKE);
        this.FLD5342.setStrokeWidth(2.0f);
        this.FLD5342.setARGB(0x80, 0, 0, 0);
        Paint paint1 = new Paint();
        this.FLD5346 = paint1;
        paint1.setStyle(Paint.Style.STROKE);
        this.FLD5346.setStrokeWidth(2.0f);
        this.FLD5345 = new Paint();
        Paint paint2 = new Paint();
        this.FLD5330 = paint2;
        paint2.setAntiAlias(true);
        this.FLD5330.setDither(true);
        Paint paint3 = new Paint();
        this.FLD5340 = paint3;
        paint3.setAntiAlias(true);
        this.FLD5340.setDither(true);
        Paint paint4 = new Paint();
        this.FLD5337 = paint4;
        paint4.setAntiAlias(true);
        this.FLD5327 = new Path();
        this.FLD5331 = new Path();
        this.FLD5339 = new Path();
        this.FLD5328 = new RectF();
        this.FLD5329 = new RectF();
        this.FLD5333 = new RectF();
    }

    public int getColor() {
        return Color.HSVToColor(this.FLD5335);
    }

    @Override  // android.view.View
    public final void onDraw(Canvas canvas0) {
        int v = this.getWidth();
        int v1 = this.getHeight();
        canvas0.drawBitmap(this.FLD5336, ((float)(v / 2 - this.FLD5338)), ((float)(v1 / 2 - this.FLD5338)), null);
        this.FLD5337.setColor(Color.HSVToColor(this.FLD5335));
        canvas0.drawPath(this.FLD5327, this.FLD5337);
        float[] arr_f = new float[3];
        float[] arr_f1 = this.FLD5335;
        arr_f[0] = arr_f1[0];
        arr_f[1] = arr_f1[1];
        arr_f[2] = 1.0f;
        SweepGradient sweepGradient0 = new SweepGradient(((float)(v / 2)), ((float)(v1 / 2)), new int[]{0xFF000000, Color.HSVToColor(arr_f), -1}, null);
        sweepGradient0.setLocalMatrix(this.FLD5343);
        this.FLD5340.setShader(sweepGradient0);
        canvas0.drawPath(this.FLD5331, this.FLD5340);
        double f = (double)(((float)Math.toRadians(this.FLD5335[0])));
        int v2 = this.FLD5338;
        float f1 = ((float)v2) * 0.075f / 2.0f;
        RectF rectF0 = this.FLD5333;
        float f2 = (float)(((int)(((float)(((int)(-Math.cos(f) * ((double)this.FLD5335[1]) * ((double)this.FLD5338))) + v / 2)) - f1)));
        float f3 = (float)(((int)(((float)(((int)(-Math.sin(f) * ((double)this.FLD5335[1]) * ((double)v2))) + v1 / 2)) - f1)));
        rectF0.set(f2, f3, f2 + ((float)v2) * 0.075f, ((float)v2) * 0.075f + f3);
        canvas0.drawOval(this.FLD5333, this.FLD5342);
        this.FLD5346.setColor(Color.HSVToColor(new float[]{0.0f, 0.0f, 1.0f - this.FLD5335[2]}));
        double f4 = ((double)(this.FLD5335[2] - 0.5f)) * 3.141593;
        float f5 = (float)Math.cos(f4);
        float f6 = (float)Math.sin(f4);
        canvas0.drawLine(((float)this.FLD5334) * f5 + ((float)(v / 2)), ((float)this.FLD5334) * f6 + ((float)(v1 / 2)), ((float)(v / 2)) + f5 * ((float)this.FLD5332), f6 * ((float)this.FLD5332) + ((float)(v1 / 2)), this.FLD5346);
        if(this.FLD5344 > 0) {
            int v3 = this.getWidth();
            int v4 = this.getHeight();
            double f7 = ((double)(this.FLD5335[2] - 0.5f)) * 3.141593;
            double f8 = Math.cos(f7) * ((double)this.FLD5332);
            double f9 = Math.sin(f7) * ((double)this.FLD5332);
            double f10 = Math.cos(f7 + 0.032725) * ((double)(this.FLD5332 + this.FLD5344));
            double f11 = Math.sin(f7 + 0.032725) * ((double)(this.FLD5332 + this.FLD5344));
            double f12 = Math.cos(f7 - 0.032725) * ((double)(this.FLD5332 + this.FLD5344));
            double f13 = Math.sin(f7 - 0.032725) * ((double)(this.FLD5332 + this.FLD5344));
            this.FLD5339.reset();
            float f14 = ((float)f8) + ((float)(v3 / 2));
            float f15 = ((float)f9) + ((float)(v4 / 2));
            this.FLD5339.moveTo(f14, f15);
            this.FLD5339.lineTo(((float)f10) + ((float)(v3 / 2)), ((float)f11) + ((float)(v4 / 2)));
            this.FLD5339.lineTo(((float)f12) + ((float)(v3 / 2)), ((float)f13) + ((float)(v4 / 2)));
            this.FLD5339.lineTo(f14, f15);
            this.FLD5345.setColor(Color.HSVToColor(this.FLD5335));
            this.FLD5345.setStyle(Paint.Style.FILL);
            canvas0.drawPath(this.FLD5339, this.FLD5345);
            this.FLD5345.setStyle(Paint.Style.STROKE);
            this.FLD5345.setStrokeJoin(Paint.Join.ROUND);
            this.FLD5345.setColor(0xFF000000);
            canvas0.drawPath(this.FLD5339, this.FLD5345);
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
            this.FLD5335 = ((Bundle)parcelable0).getFloatArray("color");
            parcelable0 = ((Bundle)parcelable0).getParcelable("super");
        }
        super.onRestoreInstanceState(parcelable0);
    }

    @Override  // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle0 = new Bundle();
        bundle0.putFloatArray("color", this.FLD5335);
        bundle0.putParcelable("super", super.onSaveInstanceState());
        return bundle0;
    }

    @Override  // android.view.View
    public final void onSizeChanged(int v, int v1, int v2, int v3) {
        int v4 = v * 4 / 100;
        this.FLD5344 = v4;
        int v5 = v / 2 - v * 2 / 100 - v4;
        this.FLD5332 = v5;
        int v6 = v5 - v * 10 / 100;
        this.FLD5334 = v6;
        this.FLD5338 = v6 - v * 5 / 100;
        this.FLD5328.set(((float)(v / 2 - v5)), ((float)(v1 / 2 - v5)), ((float)(v / 2 + v5)), ((float)(v5 + v1 / 2)));
        this.FLD5329.set(((float)(v / 2 - this.FLD5334)), ((float)(v1 / 2 - this.FLD5334)), ((float)(v / 2 + this.FLD5334)), ((float)(this.FLD5334 + v1 / 2)));
        int v7 = this.FLD5338 * 2;
        int v8 = this.FLD5338 * 2;
        Bitmap bitmap0 = Bitmap.createBitmap(v7, v8, Bitmap.Config.ARGB_8888);
        int[] arr_v = new int[13];
        float[] arr_f = {0.0f, 1.0f, 1.0f};
        for(int v9 = 0; v9 < 13; ++v9) {
            arr_f[0] = (float)((v9 * 30 + 180) % 360);
            arr_v[v9] = Color.HSVToColor(arr_f);
        }
        arr_v[12] = arr_v[0];
        ComposeShader composeShader0 = new ComposeShader(new SweepGradient(((float)(v7 / 2)), ((float)(v8 / 2)), arr_v, null), new RadialGradient(((float)(v7 / 2)), ((float)(v8 / 2)), ((float)this.FLD5338), -1, 0xFFFFFF, Shader.TileMode.CLAMP), PorterDuff.Mode.SRC_OVER);
        this.FLD5330.setShader(composeShader0);
        new Canvas(bitmap0).drawCircle(((float)(v7 / 2)), ((float)(v8 / 2)), ((float)this.FLD5338), this.FLD5330);
        this.FLD5336 = bitmap0;
        Matrix matrix0 = new Matrix();
        this.FLD5343 = matrix0;
        matrix0.preRotate(270.0f, ((float)(v / 2)), ((float)(v1 / 2)));
        this.FLD5327.arcTo(this.FLD5328, 270.0f, -180.0f);
        this.FLD5327.arcTo(this.FLD5329, 90.0f, 180.0f);
        this.FLD5331.arcTo(this.FLD5328, 270.0f, 180.0f);
        this.FLD5331.arcTo(this.FLD5329, 90.0f, -180.0f);
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
                if(f <= ((double)this.FLD5338)) {
                    this.FLD5335[0] = (float)(Math.toDegrees(Math.atan2(v3, v2)) + 180.0);
                    this.FLD5335[1] = Math.max(0.0f, Math.min(1.0f, ((float)(f / ((double)this.FLD5338)))));
                    this.invalidate();
                }
                else if(v >= this.getWidth() / 2 && f >= ((double)this.FLD5334)) {
                    this.FLD5335[2] = (float)Math.max(0.0, Math.min(1.0, Math.atan2(v3, v2) / 3.141593 + 0.5));
                    this.invalidate();
                }
                CLS543 ᵔʾ$ˆٴ0 = this.FLD5341;
                if(ᵔʾ$ˆٴ0 != null) {
                    int v4 = this.getColor();
                    ((CLS556)((CLS1229)ᵔʾ$ˆٴ0).FLD2971).getClass();
                    ((CLS556)((CLS1229)ᵔʾ$ˆٴ0).FLD2971).FLD5407 = Color.red(v4);
                    ((CLS556)((CLS1229)ᵔʾ$ˆٴ0).FLD2971).FLD5411 = Color.green(v4);
                    ((CLS556)((CLS1229)ᵔʾ$ˆٴ0).FLD2971).FLD5417 = Color.blue(v4);
                    ((CLS556)((CLS1229)ᵔʾ$ˆٴ0).FLD2971).FLD5421.setProgress(((CLS556)((CLS1229)ᵔʾ$ˆٴ0).FLD2971).FLD5407);
                    ((CLS556)((CLS1229)ᵔʾ$ˆٴ0).FLD2971).FLD5408.setProgress(((CLS556)((CLS1229)ᵔʾ$ˆٴ0).FLD2971).FLD5411);
                    ((CLS556)((CLS1229)ᵔʾ$ˆٴ0).FLD2971).FLD5409.setProgress(((CLS556)((CLS1229)ᵔʾ$ˆٴ0).FLD2971).FLD5417);
                    ((CLS556)((CLS1229)ᵔʾ$ˆٴ0).FLD2971).MTH7430();
                }
                return true;
            }
            default: {
                return super.onTouchEvent(motionEvent0);
            }
        }
    }

    public void setColor(int v) {
        Color.colorToHSV(v, this.FLD5335);
        this.invalidate();
    }

    public void setOnColorSelectedListener(CLS543 ᵔʾ$ˆٴ0) {
        this.FLD5341 = ᵔʾ$ˆٴ0;
    }
}

