package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: w9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2661w9 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g */
    public static final LinearInterpolator f9204g = new LinearInterpolator();

    /* JADX INFO: renamed from: h */
    public static final C1370eh f9205h = new C1370eh(1);

    /* JADX INFO: renamed from: i */
    public static final int[] f9206i = {-16777216};

    /* JADX INFO: renamed from: a */
    public final C2618v9 f9207a;

    /* JADX INFO: renamed from: b */
    public float f9208b;

    /* JADX INFO: renamed from: c */
    public final Resources f9209c;

    /* JADX INFO: renamed from: d */
    public final ValueAnimator f9210d;

    /* JADX INFO: renamed from: e */
    public float f9211e;

    /* JADX INFO: renamed from: f */
    public boolean f9212f;

    public C2661w9(Context context) {
        context.getClass();
        this.f9209c = context.getResources();
        C2618v9 c2618v9 = new C2618v9();
        this.f9207a = c2618v9;
        c2618v9.f9082i = f9206i;
        c2618v9.m5129a(0);
        c2618v9.f9081h = 2.5f;
        c2618v9.f9075b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C2532t9(this, c2618v9));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f9204g);
        valueAnimatorOfFloat.addListener(new C2575u9(this, c2618v9));
        this.f9210d = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: d */
    public static void m5224d(float f, C2618v9 c2618v9) {
        if (f <= 0.75f) {
            c2618v9.f9094u = c2618v9.f9082i[c2618v9.f9083j];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = c2618v9.f9082i;
        int i = c2618v9.f9083j;
        int i2 = iArr[i];
        int i3 = iArr[(i + 1) % iArr.length];
        c2618v9.f9094u = ((((i2 >> 24) & 255) + ((int) ((((i3 >> 24) & 255) - r1) * f2))) << 24) | ((((i2 >> 16) & 255) + ((int) ((((i3 >> 16) & 255) - r3) * f2))) << 16) | ((((i2 >> 8) & 255) + ((int) ((((i3 >> 8) & 255) - r4) * f2))) << 8) | ((i2 & 255) + ((int) (f2 * ((i3 & 255) - r2))));
    }

    /* JADX INFO: renamed from: a */
    public final void m5225a(float f, C2618v9 c2618v9, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.f9212f) {
            m5224d(f, c2618v9);
            float fFloor = (float) (Math.floor(c2618v9.f9086m / 0.8f) + 1.0d);
            float f2 = c2618v9.f9084k;
            float f3 = c2618v9.f9085l;
            c2618v9.f9078e = (((f3 - 0.01f) - f2) * f) + f2;
            c2618v9.f9079f = f3;
            float f4 = c2618v9.f9086m;
            c2618v9.f9080g = ((fFloor - f4) * f) + f4;
            return;
        }
        if (f != 1.0f || z) {
            float f5 = c2618v9.f9086m;
            C1370eh c1370eh = f9205h;
            if (f < 0.5f) {
                interpolation = c2618v9.f9084k;
                interpolation2 = (c1370eh.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f6 = c2618v9.f9084k + 0.79f;
                interpolation = f6 - (((1.0f - c1370eh.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.f9211e) * 216.0f;
            c2618v9.f9078e = interpolation;
            c2618v9.f9079f = interpolation2;
            c2618v9.f9080g = f7;
            this.f9208b = f8;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5226b(float f, float f2, float f3, float f4) {
        float f5 = this.f9209c.getDisplayMetrics().density;
        float f6 = f2 * f5;
        C2618v9 c2618v9 = this.f9207a;
        c2618v9.f9081h = f6;
        c2618v9.f9075b.setStrokeWidth(f6);
        c2618v9.f9090q = f * f5;
        c2618v9.m5129a(0);
        c2618v9.f9091r = (int) (f3 * f5);
        c2618v9.f9092s = (int) (f4 * f5);
    }

    /* JADX INFO: renamed from: c */
    public final void m5227c(int i) {
        if (i == 0) {
            m5226b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m5226b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f9208b, bounds.exactCenterX(), bounds.exactCenterY());
        C2618v9 c2618v9 = this.f9207a;
        Paint paint = c2618v9.f9075b;
        RectF rectF = c2618v9.f9074a;
        float f = c2618v9.f9090q;
        float fMin = (c2618v9.f9081h / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((c2618v9.f9091r * c2618v9.f9089p) / 2.0f, c2618v9.f9081h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = c2618v9.f9078e;
        float f3 = c2618v9.f9080g;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((c2618v9.f9079f + f3) * 360.0f) - f4;
        paint.setColor(c2618v9.f9094u);
        paint.setAlpha(c2618v9.f9093t);
        float f6 = c2618v9.f9081h / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, c2618v9.f9077d);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, paint);
        Paint paint2 = c2618v9.f9076c;
        if (c2618v9.f9087n) {
            Path path = c2618v9.f9088o;
            if (path == null) {
                Path path2 = new Path();
                c2618v9.f9088o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (c2618v9.f9091r * c2618v9.f9089p) / 2.0f;
            c2618v9.f9088o.moveTo(0.0f, 0.0f);
            c2618v9.f9088o.lineTo(c2618v9.f9091r * c2618v9.f9089p, 0.0f);
            Path path3 = c2618v9.f9088o;
            float f9 = c2618v9.f9091r;
            float f10 = c2618v9.f9089p;
            path3.lineTo((f9 * f10) / 2.0f, c2618v9.f9092s * f10);
            c2618v9.f9088o.offset((rectF.centerX() + fMin2) - f8, (c2618v9.f9081h / 2.0f) + rectF.centerY());
            c2618v9.f9088o.close();
            paint2.setColor(c2618v9.f9094u);
            paint2.setAlpha(c2618v9.f9093t);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(c2618v9.f9088o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f9207a.f9093t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f9210d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f9207a.f9093t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9207a.f9075b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f9210d.cancel();
        C2618v9 c2618v9 = this.f9207a;
        float f = c2618v9.f9078e;
        c2618v9.f9084k = f;
        float f2 = c2618v9.f9079f;
        c2618v9.f9085l = f2;
        c2618v9.f9086m = c2618v9.f9080g;
        if (f2 != f) {
            this.f9212f = true;
            this.f9210d.setDuration(666L);
            this.f9210d.start();
            return;
        }
        c2618v9.m5129a(0);
        c2618v9.f9084k = 0.0f;
        c2618v9.f9085l = 0.0f;
        c2618v9.f9086m = 0.0f;
        c2618v9.f9078e = 0.0f;
        c2618v9.f9079f = 0.0f;
        c2618v9.f9080g = 0.0f;
        this.f9210d.setDuration(1332L);
        this.f9210d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f9210d.cancel();
        this.f9208b = 0.0f;
        C2618v9 c2618v9 = this.f9207a;
        if (c2618v9.f9087n) {
            c2618v9.f9087n = false;
        }
        c2618v9.m5129a(0);
        c2618v9.f9084k = 0.0f;
        c2618v9.f9085l = 0.0f;
        c2618v9.f9086m = 0.0f;
        c2618v9.f9078e = 0.0f;
        c2618v9.f9079f = 0.0f;
        c2618v9.f9080g = 0.0f;
        invalidateSelf();
    }
}
