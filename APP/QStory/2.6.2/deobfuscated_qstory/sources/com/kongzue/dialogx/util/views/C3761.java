package com.kongzue.dialogx.util.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.C3176;
import com.kongzue.dialogx.util.C3764;
import p257.RunnableC8198;
import p261.AbstractC8247;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.views.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3761 extends View {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public boolean f11677;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public Runnable f11678;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public RunnableC8198 f11679;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public ValueAnimator f11680;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f11681;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public Interpolator f11682;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public float f11683;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public float f11684;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public float f11685;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public float f11686;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f11687;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Paint f11688;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public float f11689;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public int f11690;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public float f11691;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public float f11692;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public float f11693;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f11694;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public RectF f11695;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C3764 f11696;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C3764 f11697;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final float f11698;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final float f11699;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public float f11700;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public float f11701;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f11702;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11703;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f11704;

    public C3761(Context context) {
        super(context);
        this.f11704 = 0;
        this.f11702 = (int) ((2.0f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
        this.f11703 = -1;
        this.f11698 = 180.0f;
        this.f11699 = 80.0f;
        this.f11688 = new Paint();
        this.f11687 = false;
        this.f11684 = 100.0f;
        this.f11694 = 0;
        this.f11690 = 0;
        this.f11681 = 0;
        m8099();
    }

    public int getColor() {
        return this.f11703;
    }

    public int getStatus() {
        return this.f11704;
    }

    public int getStrokeWidth() {
        return this.f11702;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        C3764 c3764 = this.f11697;
        if (c3764 != null) {
            c3764.f11710 = false;
        }
        C3764 c37642 = this.f11696;
        if (c37642 != null) {
            c37642.f11710 = false;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean zIsInEditMode = isInEditMode();
        Paint paint = this.f11688;
        if (zIsInEditMode) {
            canvas.drawArc(this.f11695, 0.0f, 365.0f, false, paint);
            return;
        }
        if (this.f11677) {
            canvas.drawArc(this.f11695, 0.0f, 365.0f, false, paint);
            this.f11694 = 2;
            m8100(this.f11704, canvas);
            return;
        }
        int i = this.f11704;
        if (i == 0) {
            float fSin = (this.f11699 / 2.0f) + ((float) (Math.sin(Math.toRadians(this.f11701)) * ((double) this.f11689))) + this.f11689;
            float f = this.f11700;
            float f2 = f - fSin;
            this.f11693 = f2;
            if (f2 < 0.0f) {
                this.f11693 = f2 + 360.0f;
            }
            this.f11692 = fSin;
            this.f11691 = fSin < 0.0f ? 360.0f - fSin : fSin;
            canvas.drawArc(this.f11695, f, -fSin, false, paint);
            return;
        }
        if (i == 1 || i == 2 || i == 3) {
            int i2 = this.f11694;
            if (i2 != 0) {
                if (i2 != 1) {
                    return;
                }
                canvas.drawArc(this.f11695, 0.0f, 360.0f, false, paint);
                m8100(this.f11704, canvas);
                return;
            }
            float f3 = this.f11692 + 5.0f;
            this.f11692 = f3;
            canvas.drawArc(this.f11695, this.f11693, f3, false, paint);
            if (this.f11692 - (360.0f - this.f11691) >= this.f11693) {
                this.f11694 = 1;
                Runnable runnable = this.f11678;
                if (runnable != null) {
                    runnable.run();
                    this.f11678 = null;
                    return;
                }
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        int i3 = this.f11694;
        if (i3 != 0) {
            if (i3 != 1) {
                return;
            }
            canvas.drawArc(this.f11695, 0.0f, 360.0f, false, paint);
            m8100(this.f11704, canvas);
            return;
        }
        canvas.drawArc(this.f11695, -90.0f, this.f11700, false, paint);
        if (this.f11700 == 365.0f) {
            this.f11694 = 1;
            Runnable runnable2 = this.f11678;
            if (runnable2 != null) {
                runnable2.run();
                this.f11678 = null;
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11686 = (i * 1.0f) / 2.0f;
        this.f11685 = (i2 * 1.0f) / 2.0f;
        this.f11684 = (Math.min(getWidth(), getHeight()) / 2) - (this.f11702 / 2);
        float f = this.f11686;
        float f2 = this.f11684;
        float f3 = this.f11685;
        this.f11695 = new RectF(f - f2, f3 - f2, f + f2, f3 + f2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m8097(float f) {
        C3764 c3764 = this.f11697;
        if (c3764 != null) {
            c3764.f11710 = false;
        }
        C3764 c37642 = this.f11696;
        if (c37642 != null) {
            c37642.f11710 = false;
        }
        if (this.f11704 != 4) {
            this.f11700 = 0.0f;
        }
        this.f11677 = false;
        this.f11704 = 4;
        C3764 c3764M8102 = C3764.m8102(this.f11700, f * 365.0f);
        this.f11697 = c3764M8102;
        c3764M8102.f11712 = 1000L;
        c3764M8102.f11708 = new DecelerateInterpolator(2.0f);
        C3764 c37643 = this.f11697;
        c37643.f11717 = 0;
        c37643.f11709 = new C3758(this, 0);
        c37643.m8103();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m8098(int i, Interpolator interpolator) {
        this.f11682 = interpolator;
        this.f11704 = i;
        if (this.f11694 == 0) {
            this.f11678 = new RunnableC3760(this, 5);
            return;
        }
        ValueAnimator valueAnimator = this.f11680;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f11680 = null;
        }
        this.f11683 = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f11680 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.f11680.addUpdateListener(new C3176(this, 2));
        this.f11680.start();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8099() {
        synchronized (C3761.class) {
            try {
                if (this.f11687) {
                    return;
                }
                this.f11687 = true;
                this.f11688.setAntiAlias(true);
                this.f11688.setStyle(Paint.Style.STROKE);
                this.f11688.setStrokeWidth(this.f11702);
                this.f11688.setStrokeCap(Paint.Cap.ROUND);
                this.f11688.setColor(this.f11703);
                if (!isInEditMode()) {
                    Context context = getContext();
                    float refreshRate = Build.VERSION.SDK_INT >= 30 ? ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay().getMode().getRefreshRate() : ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRefreshRate();
                    int i = (int) (refreshRate > 0.0f ? (long) (1000.0d / ((double) refreshRate)) : 16L);
                    this.f11689 = (this.f11698 - this.f11699) / 2.0f;
                    C3764 c3764M8102 = C3764.m8102(0.0f, 365.0f);
                    this.f11697 = c3764M8102;
                    c3764M8102.f11712 = 1000L;
                    c3764M8102.f11708 = new LinearInterpolator();
                    C3764 c3764 = this.f11697;
                    c3764.f11717 = -1;
                    c3764.f11716 = i;
                    c3764.f11709 = new C3758(this, 1);
                    C3764 c3764M81022 = C3764.m8102(0.0f, 365.0f);
                    this.f11696 = c3764M81022;
                    c3764M81022.f11712 = 1500L;
                    c3764M81022.f11716 = i;
                    c3764M81022.f11708 = new LinearInterpolator();
                    C3764 c37642 = this.f11696;
                    c37642.f11717 = -1;
                    c37642.f11709 = new C3758(this, 2);
                    c37642.m8103();
                    this.f11697.m8103();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8100(int i, Canvas canvas) {
        C3764 c3764 = this.f11697;
        Interpolator interpolator = c3764.f11708;
        Interpolator interpolator2 = this.f11682;
        if (interpolator != interpolator2) {
            c3764.f11708 = interpolator2;
        }
        RunnableC8198 runnableC8198 = this.f11679;
        if (runnableC8198 != null) {
            runnableC8198.run();
            this.f11679 = null;
            if (AbstractC8247.f22834) {
                if (i == 1) {
                    performHapticFeedback(3);
                } else if (i == 2) {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC3760(this, 0), 240L);
                } else if (i == 3) {
                    performHapticFeedback(3);
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC3760(this, 1), 150L);
                }
            }
        }
        Paint paint = this.f11688;
        if (i == 1) {
            float f = this.f11684;
            float f2 = this.f11686;
            float f3 = (int) (f / 20.0f);
            int i2 = (int) ((f2 - (f / 10.0f)) - f3);
            float f4 = f / 2.0f;
            int i3 = (int) (f2 - f4);
            int i4 = (int) (this.f11685 + f3);
            int i5 = (int) (f4 + f2);
            float f5 = i3;
            int i6 = (int) (((i5 - i3) * this.f11683) + f5);
            Path path = new Path();
            path.moveTo(f5, i4);
            if (i6 < i2) {
                this.f11690 = i6;
                int i7 = (i6 - i3) + i4;
                this.f11681 = i7;
                path.lineTo(i6, i7);
            } else {
                this.f11690 = i2;
                int i8 = (i2 - i3) + i4;
                this.f11681 = i8;
                path.lineTo(i2, i8);
                path.lineTo(i6, this.f11681 - (i6 - this.f11690));
            }
            canvas.drawPath(path, paint);
            return;
        }
        if (i == 2) {
            int i9 = (int) this.f11686;
            float f6 = this.f11685;
            float f7 = this.f11684;
            float f8 = 1.0f * f7;
            int i10 = (int) (f6 - (f8 / 2.0f));
            int i11 = (int) ((f8 / 8.0f) + f6);
            int i12 = (int) (((f7 * 3.0f) / 7.0f) + f6);
            float f9 = this.f11683;
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
        float f13 = this.f11685;
        float f14 = (this.f11684 * 4.0f) / 10.0f;
        int i13 = (int) (f13 - f14);
        int i14 = (int) (f14 + this.f11686);
        float f15 = this.f11683;
        if (f15 < 0.5f) {
            float f16 = i13;
            int i15 = (int) ((f15 * 2.0f * (i14 - i13)) + f16);
            this.f11690 = i15;
            this.f11681 = i15;
            float f17 = i15;
            canvas.drawLine(f16, f16, f17, f17, paint);
            return;
        }
        float f18 = i13;
        float f19 = i14 - i13;
        int i16 = (int) ((f15 * 2.0f * f19) + f18);
        this.f11690 = i16;
        this.f11681 = i16;
        float f20 = i14;
        canvas.drawLine(f18, f18, f20, f20, paint);
        float f21 = (this.f11683 - 0.5f) * 2.0f * f19;
        canvas.drawLine(f20, f18, (int) (f20 - f21), (int) (f21 + f18), paint);
    }
}
