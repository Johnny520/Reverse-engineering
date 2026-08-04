package yyds;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: yyds.ᲁᲀᛵᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2312 extends View {

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public RunnableC1873 f11324;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public boolean f11325;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public float f11326;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public Paint f11327;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public Interpolator f11328;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public float f11329;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f11330;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public int f11331;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public float f11332;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public float f11333;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public RectF f11334;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public float f11335;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public int f11336;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public float f11337;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public C0291 f11338;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public float f11339;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public float f11340;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public float f11341;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public float f11342;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public Runnable f11343;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public float f11344;

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public boolean f11345;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public int f11346;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f11347;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public float f11348;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C0291 f11349;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f11350;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public ValueAnimator f11351;

    public int getColor() {
        return this.f11330;
    }

    public int getStatus() {
        return this.f11347;
    }

    public int getStrokeWidth() {
        return this.f11350;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        C0291 c0291 = this.f11349;
        if (c0291 != null) {
            c0291.f1553 = false;
        }
        C0291 c02912 = this.f11338;
        if (c02912 != null) {
            c02912.f1553 = false;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f11327;
        if (isInEditMode()) {
            canvas.drawArc(this.f11334, 0.0f, 365.0f, false, paint);
            return;
        }
        if (this.f11345) {
            canvas.drawArc(this.f11334, 0.0f, 365.0f, false, paint);
            this.f11346 = 2;
            m4321(this.f11347, canvas);
            return;
        }
        int i = this.f11347;
        if (i == 0) {
            float fSin = (this.f11341 / 2.0f) + ((float) (Math.sin(Math.toRadians(this.f11329)) * ((double) this.f11342))) + this.f11342;
            float f = this.f11326;
            float f2 = f - fSin;
            this.f11332 = f2;
            if (f2 < 0.0f) {
                this.f11332 = f2 + 360.0f;
            }
            this.f11340 = fSin;
            this.f11339 = fSin < 0.0f ? 360.0f - fSin : fSin;
            canvas.drawArc(this.f11334, f, -fSin, false, paint);
            return;
        }
        if (i == 1 || i == 2 || i == 3) {
            int i2 = this.f11346;
            if (i2 != 0) {
                if (i2 != 1) {
                    return;
                }
                canvas.drawArc(this.f11334, 0.0f, 360.0f, false, paint);
                m4321(this.f11347, canvas);
                return;
            }
            float f3 = this.f11340 + 5.0f;
            this.f11340 = f3;
            canvas.drawArc(this.f11334, this.f11332, f3, false, paint);
            if (this.f11340 - (360.0f - this.f11339) >= this.f11332) {
                this.f11346 = 1;
                Runnable runnable = this.f11343;
                if (runnable != null) {
                    runnable.run();
                    this.f11343 = null;
                    return;
                }
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        int i3 = this.f11346;
        if (i3 != 0) {
            if (i3 != 1) {
                return;
            }
            canvas.drawArc(this.f11334, 0.0f, 360.0f, false, paint);
            m4321(this.f11347, canvas);
            return;
        }
        canvas.drawArc(this.f11334, -90.0f, this.f11326, false, paint);
        if (this.f11326 == 365.0f) {
            this.f11346 = 1;
            Runnable runnable2 = this.f11343;
            if (runnable2 != null) {
                runnable2.run();
                this.f11343 = null;
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11333 = (i * 1.0f) / 2.0f;
        this.f11348 = (i2 * 1.0f) / 2.0f;
        this.f11337 = (Math.min(getWidth(), getHeight()) / 2) - (this.f11350 / 2);
        float f = this.f11333;
        float f2 = this.f11337;
        float f3 = this.f11348;
        this.f11334 = new RectF(f - f2, f3 - f2, f + f2, f3 + f2);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4321(int i, Canvas canvas) {
        Paint paint = this.f11327;
        C0291 c0291 = this.f11349;
        Interpolator interpolator = c0291.f1552;
        Interpolator interpolator2 = this.f11328;
        if (interpolator != interpolator2) {
            c0291.f1552 = interpolator2;
        }
        RunnableC1873 runnableC1873 = this.f11324;
        if (runnableC1873 != null) {
            runnableC1873.run();
            this.f11324 = null;
            if (AbstractC1655.f8454) {
                if (i == 1) {
                    performHapticFeedback(3);
                } else if (i == 2) {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1481(this, 0), 240L);
                } else if (i == 3) {
                    performHapticFeedback(3);
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1481(this, 1), 150L);
                }
            }
        }
        if (i == 1) {
            float f = this.f11337;
            float f2 = this.f11333;
            float f3 = (int) (f / 20.0f);
            int i2 = (int) ((f2 - (f / 10.0f)) - f3);
            float f4 = f / 2.0f;
            int i3 = (int) (f2 - f4);
            int i4 = (int) (this.f11348 + f3);
            int i5 = (int) (f4 + f2);
            float f5 = i3;
            int i6 = (int) (((i5 - i3) * this.f11335) + f5);
            Path path = new Path();
            path.moveTo(f5, i4);
            if (i6 < i2) {
                this.f11336 = i6;
                int i7 = (i6 - i3) + i4;
                this.f11331 = i7;
                path.lineTo(i6, i7);
            } else {
                this.f11336 = i2;
                int i8 = (i2 - i3) + i4;
                this.f11331 = i8;
                path.lineTo(i2, i8);
                path.lineTo(i6, this.f11331 - (i6 - this.f11336));
            }
            canvas.drawPath(path, paint);
            return;
        }
        if (i == 2) {
            int i9 = (int) this.f11333;
            float f6 = this.f11348;
            float f7 = this.f11337;
            float f8 = 1.0f * f7;
            int i10 = (int) (f6 - (f8 / 2.0f));
            int i11 = (int) ((f8 / 8.0f) + f6);
            int i12 = (int) (((f7 * 3.0f) / 7.0f) + f6);
            float f9 = this.f11335;
            if (f9 < 0.9f) {
                float f10 = i9;
                float f11 = i10;
                canvas.drawLine(f10, f11, f10, ((i11 - i10) * f9) + f11, paint);
                return;
            } else {
                float f12 = i9;
                canvas.drawLine(f12, i10, f12, i11, paint);
                canvas.drawLine(f12, i12, f12, i12 + 1, paint);
                return;
            }
        }
        if (i != 3) {
            return;
        }
        float f13 = this.f11348;
        float f14 = (this.f11337 * 4.0f) / 10.0f;
        int i13 = (int) (f13 - f14);
        int i14 = (int) (f14 + this.f11333);
        float f15 = this.f11335;
        if (f15 < 0.5f) {
            float f16 = i13;
            int i15 = (int) ((f15 * 2.0f * (i14 - i13)) + f16);
            this.f11336 = i15;
            this.f11331 = i15;
            float f17 = i15;
            canvas.drawLine(f16, f16, f17, f17, paint);
            return;
        }
        float f18 = i13;
        float f19 = i14 - i13;
        int i16 = (int) ((f15 * 2.0f * f19) + f18);
        this.f11336 = i16;
        this.f11331 = i16;
        float f20 = i14;
        canvas.drawLine(f18, f18, f20, f20, paint);
        float f21 = (this.f11335 - 0.5f) * 2.0f * f19;
        canvas.drawLine(f20, f18, (int) (f20 - f21), (int) (f21 + f18), paint);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m4322() {
        synchronized (C2312.class) {
            try {
                if (this.f11325) {
                    return;
                }
                this.f11325 = true;
                this.f11327.setAntiAlias(true);
                this.f11327.setStyle(Paint.Style.STROKE);
                this.f11327.setStrokeWidth(this.f11350);
                this.f11327.setStrokeCap(Paint.Cap.ROUND);
                this.f11327.setColor(this.f11330);
                if (!isInEditMode()) {
                    float refreshRate = ((WindowManager) getContext().getSystemService(WindowManager.class)).getDefaultDisplay().getMode().getRefreshRate();
                    int i = (int) (refreshRate > 0.0f ? (long) (1000.0d / ((double) refreshRate)) : 16L);
                    this.f11342 = (this.f11344 - this.f11341) / 2.0f;
                    C0291 c0291M942 = C0291.m942(0.0f, 365.0f);
                    this.f11349 = c0291M942;
                    c0291M942.f1547 = 1000L;
                    c0291M942.f1552 = new LinearInterpolator();
                    C0291 c0291 = this.f11349;
                    c0291.f1544 = -1;
                    c0291.f1549 = i;
                    c0291.f1545 = new C2332(this, 1);
                    C0291 c0291M9422 = C0291.m942(0.0f, 365.0f);
                    this.f11338 = c0291M9422;
                    c0291M9422.f1547 = 1500L;
                    c0291M9422.f1549 = i;
                    c0291M9422.f1552 = new LinearInterpolator();
                    C0291 c02912 = this.f11338;
                    c02912.f1544 = -1;
                    c02912.f1545 = new C2332(this, 2);
                    c02912.m943();
                    this.f11349.m943();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m4323(int i, Interpolator interpolator) {
        this.f11328 = interpolator;
        this.f11347 = i;
        if (this.f11346 == 0) {
            this.f11343 = new RunnableC1481(this, 5);
            return;
        }
        ValueAnimator valueAnimator = this.f11351;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f11351 = null;
        }
        this.f11335 = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f11351 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.f11351.addUpdateListener(new C0383(2, this));
        this.f11351.start();
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m4324(float f) {
        C0291 c0291 = this.f11349;
        if (c0291 != null) {
            c0291.f1553 = false;
        }
        C0291 c02912 = this.f11338;
        if (c02912 != null) {
            c02912.f1553 = false;
        }
        if (this.f11347 != 4) {
            this.f11326 = 0.0f;
        }
        this.f11345 = false;
        this.f11347 = 4;
        C0291 c0291M942 = C0291.m942(this.f11326, f * 365.0f);
        this.f11349 = c0291M942;
        c0291M942.f1547 = 1000L;
        c0291M942.f1552 = new DecelerateInterpolator(2.0f);
        C0291 c02913 = this.f11349;
        c02913.f1544 = 0;
        c02913.f1545 = new C2332(this, 0);
        c02913.m943();
    }
}
