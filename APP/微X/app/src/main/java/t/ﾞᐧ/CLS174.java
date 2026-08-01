// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

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
import t.ᵔʾ.CLS297;

public final class CLS174 extends View {
    public interface CLS173 {
    }

    public Path FLD1237;
    public RectF FLD1238;
    public RectF FLD1239;
    public Paint FLD1240;
    public Path FLD1241;
    public int FLD1242;
    public RectF FLD1243;
    public int FLD1244;
    public float[] FLD1245;
    public Bitmap FLD1246;
    public Paint FLD1247;
    public int FLD1248;
    public Path FLD1249;
    public Paint FLD1250;
    public CLS173 FLD1251;
    public Paint FLD1252;
    public Matrix FLD1253;
    public int FLD1254;
    public Paint FLD1255;
    public Paint FLD1256;

    public CLS174(Activity activity0) {
        super(activity0);
        this.FLD1245 = new float[]{0.0f, 0.0f, 1.0f};
        Paint paint0 = new Paint();
        this.FLD1252 = paint0;
        paint0.setStyle(Paint.Style.STROKE);
        this.FLD1252.setStrokeWidth(2.0f);
        this.FLD1252.setARGB(0x80, 0, 0, 0);
        Paint paint1 = new Paint();
        this.FLD1256 = paint1;
        paint1.setStyle(Paint.Style.STROKE);
        this.FLD1256.setStrokeWidth(2.0f);
        this.FLD1255 = new Paint();
        Paint paint2 = new Paint();
        this.FLD1240 = paint2;
        paint2.setAntiAlias(true);
        this.FLD1240.setDither(true);
        Paint paint3 = new Paint();
        this.FLD1250 = paint3;
        paint3.setAntiAlias(true);
        this.FLD1250.setDither(true);
        Paint paint4 = new Paint();
        this.FLD1247 = paint4;
        paint4.setAntiAlias(true);
        this.FLD1237 = new Path();
        this.FLD1241 = new Path();
        this.FLD1249 = new Path();
        this.FLD1238 = new RectF();
        this.FLD1239 = new RectF();
        this.FLD1243 = new RectF();
    }

    public int getColor() {
        return Color.HSVToColor(this.FLD1245);
    }

    @Override  // android.view.View
    public final void onDraw(Canvas canvas0) {
        int v = this.getWidth();
        int v1 = this.getHeight();
        canvas0.drawBitmap(this.FLD1246, ((float)(v / 2 - this.FLD1248)), ((float)(v1 / 2 - this.FLD1248)), null);
        this.FLD1247.setColor(Color.HSVToColor(this.FLD1245));
        canvas0.drawPath(this.FLD1237, this.FLD1247);
        float[] arr_f = new float[3];
        float[] arr_f1 = this.FLD1245;
        arr_f[0] = arr_f1[0];
        arr_f[1] = arr_f1[1];
        arr_f[2] = 1.0f;
        SweepGradient sweepGradient0 = new SweepGradient(((float)(v / 2)), ((float)(v1 / 2)), new int[]{0xFF000000, Color.HSVToColor(arr_f), -1}, null);
        sweepGradient0.setLocalMatrix(this.FLD1253);
        this.FLD1250.setShader(sweepGradient0);
        canvas0.drawPath(this.FLD1241, this.FLD1250);
        double f = (double)(((float)Math.toRadians(this.FLD1245[0])));
        int v2 = this.FLD1248;
        float f1 = ((float)v2) * 0.075f / 2.0f;
        RectF rectF0 = this.FLD1243;
        float f2 = (float)(((int)(((float)(((int)(-Math.cos(f) * ((double)this.FLD1245[1]) * ((double)this.FLD1248))) + v / 2)) - f1)));
        float f3 = (float)(((int)(((float)(((int)(-Math.sin(f) * ((double)this.FLD1245[1]) * ((double)v2))) + v1 / 2)) - f1)));
        rectF0.set(f2, f3, f2 + ((float)v2) * 0.075f, ((float)v2) * 0.075f + f3);
        canvas0.drawOval(this.FLD1243, this.FLD1252);
        this.FLD1256.setColor(Color.HSVToColor(new float[]{0.0f, 0.0f, 1.0f - this.FLD1245[2]}));
        double f4 = ((double)(this.FLD1245[2] - 0.5f)) * 3.141593;
        float f5 = (float)Math.cos(f4);
        float f6 = (float)Math.sin(f4);
        canvas0.drawLine(((float)this.FLD1244) * f5 + ((float)(v / 2)), ((float)this.FLD1244) * f6 + ((float)(v1 / 2)), ((float)(v / 2)) + f5 * ((float)this.FLD1242), f6 * ((float)this.FLD1242) + ((float)(v1 / 2)), this.FLD1256);
        if(this.FLD1254 > 0) {
            int v3 = this.getWidth();
            int v4 = this.getHeight();
            double f7 = ((double)(this.FLD1245[2] - 0.5f)) * 3.141593;
            double f8 = Math.cos(f7) * ((double)this.FLD1242);
            double f9 = Math.sin(f7) * ((double)this.FLD1242);
            double f10 = Math.cos(f7 + 0.032725) * ((double)(this.FLD1242 + this.FLD1254));
            double f11 = Math.sin(f7 + 0.032725) * ((double)(this.FLD1242 + this.FLD1254));
            double f12 = Math.cos(f7 - 0.032725) * ((double)(this.FLD1242 + this.FLD1254));
            double f13 = Math.sin(f7 - 0.032725) * ((double)(this.FLD1242 + this.FLD1254));
            this.FLD1249.reset();
            float f14 = ((float)f8) + ((float)(v3 / 2));
            float f15 = ((float)f9) + ((float)(v4 / 2));
            this.FLD1249.moveTo(f14, f15);
            this.FLD1249.lineTo(((float)f10) + ((float)(v3 / 2)), ((float)f11) + ((float)(v4 / 2)));
            this.FLD1249.lineTo(((float)f12) + ((float)(v3 / 2)), ((float)f13) + ((float)(v4 / 2)));
            this.FLD1249.lineTo(f14, f15);
            this.FLD1255.setColor(Color.HSVToColor(this.FLD1245));
            this.FLD1255.setStyle(Paint.Style.FILL);
            canvas0.drawPath(this.FLD1249, this.FLD1255);
            this.FLD1255.setStyle(Paint.Style.STROKE);
            this.FLD1255.setStrokeJoin(Paint.Join.ROUND);
            this.FLD1255.setColor(0xFF000000);
            canvas0.drawPath(this.FLD1249, this.FLD1255);
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
            this.FLD1245 = ((Bundle)parcelable0).getFloatArray("color");
            parcelable0 = ((Bundle)parcelable0).getParcelable("super");
        }
        super.onRestoreInstanceState(parcelable0);
    }

    @Override  // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle0 = new Bundle();
        bundle0.putFloatArray("color", this.FLD1245);
        bundle0.putParcelable("super", super.onSaveInstanceState());
        return bundle0;
    }

    @Override  // android.view.View
    public final void onSizeChanged(int v, int v1, int v2, int v3) {
        int v4 = v * 4 / 100;
        this.FLD1254 = v4;
        int v5 = v / 2 - v * 2 / 100 - v4;
        this.FLD1242 = v5;
        int v6 = v5 - v * 10 / 100;
        this.FLD1244 = v6;
        this.FLD1248 = v6 - v * 5 / 100;
        this.FLD1238.set(((float)(v / 2 - v5)), ((float)(v1 / 2 - v5)), ((float)(v / 2 + v5)), ((float)(v5 + v1 / 2)));
        this.FLD1239.set(((float)(v / 2 - this.FLD1244)), ((float)(v1 / 2 - this.FLD1244)), ((float)(v / 2 + this.FLD1244)), ((float)(this.FLD1244 + v1 / 2)));
        int v7 = this.FLD1248 * 2;
        int v8 = this.FLD1248 * 2;
        Bitmap bitmap0 = Bitmap.createBitmap(v7, v8, Bitmap.Config.ARGB_8888);
        int[] arr_v = new int[13];
        float[] arr_f = {0.0f, 1.0f, 1.0f};
        for(int v9 = 0; v9 < 13; ++v9) {
            arr_f[0] = (float)((v9 * 30 + 180) % 360);
            arr_v[v9] = Color.HSVToColor(arr_f);
        }
        arr_v[12] = arr_v[0];
        ComposeShader composeShader0 = new ComposeShader(new SweepGradient(((float)(v7 / 2)), ((float)(v8 / 2)), arr_v, null), new RadialGradient(((float)(v7 / 2)), ((float)(v8 / 2)), ((float)this.FLD1248), -1, 0xFFFFFF, Shader.TileMode.CLAMP), PorterDuff.Mode.SRC_OVER);
        this.FLD1240.setShader(composeShader0);
        new Canvas(bitmap0).drawCircle(((float)(v7 / 2)), ((float)(v8 / 2)), ((float)this.FLD1248), this.FLD1240);
        this.FLD1246 = bitmap0;
        Matrix matrix0 = new Matrix();
        this.FLD1253 = matrix0;
        matrix0.preRotate(270.0f, ((float)(v / 2)), ((float)(v1 / 2)));
        this.FLD1237.arcTo(this.FLD1238, 270.0f, -180.0f);
        this.FLD1237.arcTo(this.FLD1239, 90.0f, 180.0f);
        this.FLD1241.arcTo(this.FLD1238, 270.0f, 180.0f);
        this.FLD1241.arcTo(this.FLD1239, 90.0f, -180.0f);
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
                if(f <= ((double)this.FLD1248)) {
                    this.FLD1245[0] = (float)(Math.toDegrees(Math.atan2(v3, v2)) + 180.0);
                    this.FLD1245[1] = Math.max(0.0f, Math.min(1.0f, ((float)(f / ((double)this.FLD1248)))));
                    this.invalidate();
                }
                else if(v >= this.getWidth() / 2 && f >= ((double)this.FLD1244)) {
                    this.FLD1245[2] = (float)Math.max(0.0, Math.min(1.0, Math.atan2(v3, v2) / 3.141593 + 0.5));
                    this.invalidate();
                }
                CLS173 ٴـ$ˆٴ0 = this.FLD1251;
                if(ٴـ$ˆٴ0 != null) {
                    int v4 = this.getColor();
                    ((CLS172)((CLS297)ٴـ$ˆٴ0).FLD915).getClass();
                    ((CLS172)((CLS297)ٴـ$ˆٴ0).FLD915).FLD1208 = Color.red(v4);
                    ((CLS172)((CLS297)ٴـ$ˆٴ0).FLD915).FLD1212 = Color.green(v4);
                    ((CLS172)((CLS297)ٴـ$ˆٴ0).FLD915).FLD1218 = Color.blue(v4);
                    ((CLS172)((CLS297)ٴـ$ˆٴ0).FLD915).FLD1222.setProgress(((CLS172)((CLS297)ٴـ$ˆٴ0).FLD915).FLD1208);
                    ((CLS172)((CLS297)ٴـ$ˆٴ0).FLD915).FLD1209.setProgress(((CLS172)((CLS297)ٴـ$ˆٴ0).FLD915).FLD1212);
                    ((CLS172)((CLS297)ٴـ$ˆٴ0).FLD915).FLD1210.setProgress(((CLS172)((CLS297)ٴـ$ˆٴ0).FLD915).FLD1218);
                    ((CLS172)((CLS297)ٴـ$ˆٴ0).FLD915).MTH2420();
                }
                return true;
            }
            default: {
                return super.onTouchEvent(motionEvent0);
            }
        }
    }

    public void setColor(int v) {
        Color.colorToHSV(v, this.FLD1245);
        this.invalidate();
    }

    public void setOnColorSelectedListener(CLS173 ٴـ$ˆٴ0) {
        this.FLD1251 = ٴـ$ˆٴ0;
    }
}

