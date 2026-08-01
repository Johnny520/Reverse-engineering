// Decompiled by JEB v5.42.0.202606242140

package t.ˊﾞ;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class CLS111 extends Drawable {
    public final class CLS109 {
        public final CLS110 FLD807;
        public final CLS111 FLD808;
        public final CLS110 FLD809;

        public CLS109(CLS110 ⁱʾ$ᵔʾ0, CLS110 ⁱʾ$ᵔʾ1) {
            this.FLD807 = ⁱʾ$ᵔʾ0;
            this.FLD809 = ⁱʾ$ᵔʾ1;
        }

        public static void MTH1861(CLS109 ⁱʾ$ˆٴ0, Canvas canvas0) {
            CLS110.MTH1863(ⁱʾ$ˆٴ0.FLD807, CLS111.this.FLD815, CLS111.this.FLD822);
            CLS110.MTH1863(ⁱʾ$ˆٴ0.FLD809, CLS111.this.FLD815, CLS111.this.FLD821);
            canvas0.drawLine(CLS111.this.FLD822[0], CLS111.this.FLD822[1], CLS111.this.FLD821[0], CLS111.this.FLD821[1], CLS111.this.FLD817);
        }
    }

    public static final class CLS110 {
        public final PathMeasure FLD810;
        public final float FLD811;
        public final PathMeasure FLD812;
        public final float FLD813;

        public CLS110(Path path0, Path path1) {
            PathMeasure pathMeasure0 = new PathMeasure(path0, false);
            this.FLD810 = pathMeasure0;
            PathMeasure pathMeasure1 = new PathMeasure(path1, false);
            this.FLD812 = pathMeasure1;
            this.FLD811 = pathMeasure0.getLength();
            this.FLD813 = pathMeasure1.getLength();
        }

        public static void MTH1863(CLS110 ⁱʾ$ᵔʾ0, float f, float[] arr_f) {
            float f2;
            PathMeasure pathMeasure0;
            float f1;
            if(f <= 0.5f) {
                f1 = f * 2.0f;
                pathMeasure0 = ⁱʾ$ᵔʾ0.FLD810;
                f2 = ⁱʾ$ᵔʾ0.FLD811;
            }
            else {
                f1 = (f - 0.5f) * 2.0f;
                pathMeasure0 = ⁱʾ$ᵔʾ0.FLD812;
                f2 = ⁱʾ$ᵔʾ0.FLD813;
            }
            pathMeasure0.getPosTan(f2 * f1, arr_f, null);
        }
    }

    public boolean FLD814;
    public float FLD815;
    public final CLS109 FLD816;
    public final Paint FLD817;
    public final CLS109 FLD818;
    public final CLS109 FLD819;
    public final Rect FLD820;
    public final float[] FLD821;
    public final float[] FLD822;

    public CLS111(Resources resources0) {
        this.FLD822 = new float[]{0.0f, 0.0f};
        this.FLD821 = new float[]{0.0f, 0.0f};
        float f = resources0.getDisplayMetrics().density;
        Paint paint0 = new Paint(0x81);
        this.FLD817 = paint0;
        paint0.setStrokeCap(Paint.Cap.BUTT);
        paint0.setColor(0xFF000000);
        paint0.setStyle(Paint.Style.STROKE);
        paint0.setStrokeWidth(2.0f * f);
        int v = (int)(23.5f * f);
        this.FLD820 = new Rect(0, 0, v, v);
        Path path0 = new Path();
        path0.moveTo(5.042f, 20.0f);
        path0.rCubicTo(8.125f, -16.316999f, 39.752998f, -27.851f, 55.490002f, -2.765f);
        Path path1 = new Path();
        path1.moveTo(60.530998f, 17.235001f);
        path1.rCubicTo(11.301f, 18.014999f, -3.699f, 46.083f, -23.725f, 43.456001f);
        CLS111.MTH1871(path0, f);
        CLS111.MTH1871(path1, f);
        CLS110 ⁱʾ$ᵔʾ0 = new CLS110(path0, path1);
        Path path2 = new Path();
        path2.moveTo(64.959f, 20.0f);
        path2.rCubicTo(4.457f, 16.75f, 1.512f, 37.981998f, -22.556999f, 42.699001f);
        Path path3 = new Path();
        path3.moveTo(42.402f, 62.699001f);
        path3.cubicTo(18.333f, 67.417999f, 8.807f, 45.646f, 8.807f, 32.823002f);
        CLS111.MTH1871(path2, f);
        CLS111.MTH1871(path3, f);
        this.FLD816 = new CLS109(this, ⁱʾ$ᵔʾ0, new CLS110(path2, path3));
        Path path4 = new Path();
        path4.moveTo(5.042f, 35.0f);
        path4.cubicTo(5.042f, 20.333f, 18.625f, 6.791f, 35.0f, 6.791f);
        Path path5 = new Path();
        path5.moveTo(35.0f, 6.791f);
        path5.rCubicTo(16.083f, 0.0f, 26.853001f, 16.702f, 26.853001f, 28.209f);
        CLS111.MTH1871(path4, f);
        CLS111.MTH1871(path5, f);
        CLS110 ⁱʾ$ᵔʾ1 = new CLS110(path4, path5);
        Path path6 = new Path();
        path6.moveTo(64.959f, 35.0f);
        path6.rCubicTo(0.0f, 10.926f, -8.709f, 26.416f, -29.958f, 26.416f);
        Path path7 = new Path();
        path7.moveTo(35.0f, 61.416f);
        path7.rCubicTo(-7.5f, 0.0f, -23.945999f, -8.211f, -23.945999f, -26.416f);
        CLS111.MTH1871(path6, f);
        CLS111.MTH1871(path7, f);
        this.FLD819 = new CLS109(this, ⁱʾ$ᵔʾ1, new CLS110(path6, path7));
        Path path8 = new Path();
        path8.moveTo(5.042f, 50.0f);
        path8.cubicTo(2.5f, 43.312f, 0.013f, 26.546f, 9.475f, 17.346001f);
        Path path9 = new Path();
        path9.moveTo(9.475f, 17.346001f);
        path9.rCubicTo(9.462f, -9.2f, 24.188f, -10.353f, 27.326f, -8.245f);
        CLS111.MTH1871(path8, f);
        CLS111.MTH1871(path9, f);
        CLS110 ⁱʾ$ᵔʾ2 = new CLS110(path8, path9);
        Path path10 = new Path();
        path10.moveTo(64.959f, 50.0f);
        path10.rCubicTo(-7.021f, 10.08f, -20.584f, 19.698999f, -37.361f, 12.74f);
        Path path11 = new Path();
        path11.moveTo(27.598f, 62.699001f);
        path11.rCubicTo(-15.723f, -6.521f, -18.799999f, -23.542999f, -18.799999f, -25.642f);
        CLS111.MTH1871(path10, f);
        CLS111.MTH1871(path11, f);
        this.FLD818 = new CLS109(this, ⁱʾ$ᵔʾ2, new CLS110(path10, path11));
    }

    @Override  // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas0) {
        if(this.FLD814) {
            canvas0.save();
            canvas0.scale(1.0f, -1.0f, ((float)(this.getIntrinsicWidth() / 2)), ((float)(this.getIntrinsicHeight() / 2)));
        }
        CLS109.MTH1861(this.FLD816, canvas0);
        CLS109.MTH1861(this.FLD819, canvas0);
        CLS109.MTH1861(this.FLD818, canvas0);
        if(this.FLD814) {
            canvas0.restore();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.FLD820.height();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.FLD820.width();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAlpha(int v) {
        this.FLD817.setAlpha(v);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter0) {
        this.FLD817.setColorFilter(colorFilter0);
        this.invalidateSelf();
    }

    public static void MTH1871(Path path0, float f) {
        if(f == 3.0f) {
            return;
        }
        Matrix matrix0 = new Matrix();
        matrix0.setScale(f / 3.0f, f / 3.0f, 0.0f, 0.0f);
        path0.transform(matrix0);
    }
}

