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
import com.google.android.material.textfield.C3177;
import com.kongzue.dialogx.util.C3765;
import p257.RunnableC8199;
import p261.AbstractC8248;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.views.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3762 extends View {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public boolean f11682;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public Runnable f11683;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public RunnableC8199 f11684;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public ValueAnimator f11685;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f11686;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public Interpolator f11687;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public float f11688;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public float f11689;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public float f11690;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public float f11691;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f11692;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Paint f11693;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public float f11694;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public int f11695;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public float f11696;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public float f11697;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public float f11698;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f11699;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public RectF f11700;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C3765 f11701;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C3765 f11702;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final float f11703;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final float f11704;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public float f11705;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public float f11706;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f11707;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11708;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f11709;

    public C3762(Context context) {
        super(context);
        this.f11709 = 0;
        this.f11707 = (int) ((2.0f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
        this.f11708 = -1;
        this.f11703 = 180.0f;
        this.f11704 = 80.0f;
        this.f11693 = new Paint();
        this.f11692 = false;
        this.f11689 = 100.0f;
        this.f11699 = 0;
        this.f11695 = 0;
        this.f11686 = 0;
        m8086();
    }

    public int getColor() {
        return this.f11708;
    }

    public int getStatus() {
        return this.f11709;
    }

    public int getStrokeWidth() {
        return this.f11707;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        C3765 c3765 = this.f11702;
        if (c3765 != null) {
            c3765.f11715 = false;
        }
        C3765 c37652 = this.f11701;
        if (c37652 != null) {
            c37652.f11715 = false;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean zIsInEditMode = isInEditMode();
        Paint paint = this.f11693;
        if (zIsInEditMode) {
            canvas.drawArc(this.f11700, 0.0f, 365.0f, false, paint);
            return;
        }
        if (this.f11682) {
            canvas.drawArc(this.f11700, 0.0f, 365.0f, false, paint);
            this.f11699 = 2;
            m8087(this.f11709, canvas);
            return;
        }
        int i = this.f11709;
        if (i == 0) {
            float fSin = (this.f11704 / 2.0f) + ((float) (Math.sin(Math.toRadians(this.f11706)) * ((double) this.f11694))) + this.f11694;
            float f = this.f11705;
            float f2 = f - fSin;
            this.f11698 = f2;
            if (f2 < 0.0f) {
                this.f11698 = f2 + 360.0f;
            }
            this.f11697 = fSin;
            this.f11696 = fSin < 0.0f ? 360.0f - fSin : fSin;
            canvas.drawArc(this.f11700, f, -fSin, false, paint);
            return;
        }
        if (i == 1 || i == 2 || i == 3) {
            int i2 = this.f11699;
            if (i2 != 0) {
                if (i2 != 1) {
                    return;
                }
                canvas.drawArc(this.f11700, 0.0f, 360.0f, false, paint);
                m8087(this.f11709, canvas);
                return;
            }
            float f3 = this.f11697 + 5.0f;
            this.f11697 = f3;
            canvas.drawArc(this.f11700, this.f11698, f3, false, paint);
            if (this.f11697 - (360.0f - this.f11696) >= this.f11698) {
                this.f11699 = 1;
                Runnable runnable = this.f11683;
                if (runnable != null) {
                    runnable.run();
                    this.f11683 = null;
                    return;
                }
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        int i3 = this.f11699;
        if (i3 != 0) {
            if (i3 != 1) {
                return;
            }
            canvas.drawArc(this.f11700, 0.0f, 360.0f, false, paint);
            m8087(this.f11709, canvas);
            return;
        }
        canvas.drawArc(this.f11700, -90.0f, this.f11705, false, paint);
        if (this.f11705 == 365.0f) {
            this.f11699 = 1;
            Runnable runnable2 = this.f11683;
            if (runnable2 != null) {
                runnable2.run();
                this.f11683 = null;
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11691 = (i * 1.0f) / 2.0f;
        this.f11690 = (i2 * 1.0f) / 2.0f;
        this.f11689 = (Math.min(getWidth(), getHeight()) / 2) - (this.f11707 / 2);
        float f = this.f11691;
        float f2 = this.f11689;
        float f3 = this.f11690;
        this.f11700 = new RectF(f - f2, f3 - f2, f + f2, f3 + f2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m8084(float f) {
        C3765 c3765 = this.f11702;
        if (c3765 != null) {
            c3765.f11715 = false;
        }
        C3765 c37652 = this.f11701;
        if (c37652 != null) {
            c37652.f11715 = false;
        }
        if (this.f11709 != 4) {
            this.f11705 = 0.0f;
        }
        this.f11682 = false;
        this.f11709 = 4;
        C3765 c3765M8089 = C3765.m8089(this.f11705, f * 365.0f);
        this.f11702 = c3765M8089;
        c3765M8089.f11717 = 1000L;
        c3765M8089.f11713 = new DecelerateInterpolator(2.0f);
        C3765 c37653 = this.f11702;
        c37653.f11722 = 0;
        c37653.f11714 = new C3759(this, 0);
        c37653.m8090();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m8085(int i, Interpolator interpolator) {
        this.f11687 = interpolator;
        this.f11709 = i;
        if (this.f11699 == 0) {
            this.f11683 = new RunnableC3761(this, 5);
            return;
        }
        ValueAnimator valueAnimator = this.f11685;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f11685 = null;
        }
        this.f11688 = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f11685 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.f11685.addUpdateListener(new C3177(this, 2));
        this.f11685.start();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8086() {
        synchronized (C3762.class) {
            try {
                if (this.f11692) {
                    return;
                }
                this.f11692 = true;
                this.f11693.setAntiAlias(true);
                this.f11693.setStyle(Paint.Style.STROKE);
                this.f11693.setStrokeWidth(this.f11707);
                this.f11693.setStrokeCap(Paint.Cap.ROUND);
                this.f11693.setColor(this.f11708);
                if (!isInEditMode()) {
                    Context context = getContext();
                    float refreshRate = Build.VERSION.SDK_INT >= 30 ? ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay().getMode().getRefreshRate() : ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRefreshRate();
                    int i = (int) (refreshRate > 0.0f ? (long) (1000.0d / ((double) refreshRate)) : 16L);
                    this.f11694 = (this.f11703 - this.f11704) / 2.0f;
                    C3765 c3765M8089 = C3765.m8089(0.0f, 365.0f);
                    this.f11702 = c3765M8089;
                    c3765M8089.f11717 = 1000L;
                    c3765M8089.f11713 = new LinearInterpolator();
                    C3765 c3765 = this.f11702;
                    c3765.f11722 = -1;
                    c3765.f11721 = i;
                    c3765.f11714 = new C3759(this, 1);
                    C3765 c3765M80892 = C3765.m8089(0.0f, 365.0f);
                    this.f11701 = c3765M80892;
                    c3765M80892.f11717 = 1500L;
                    c3765M80892.f11721 = i;
                    c3765M80892.f11713 = new LinearInterpolator();
                    C3765 c37652 = this.f11701;
                    c37652.f11722 = -1;
                    c37652.f11714 = new C3759(this, 2);
                    c37652.m8090();
                    this.f11702.m8090();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8087(int i, Canvas canvas) {
        C3765 c3765 = this.f11702;
        Interpolator interpolator = c3765.f11713;
        Interpolator interpolator2 = this.f11687;
        if (interpolator != interpolator2) {
            c3765.f11713 = interpolator2;
        }
        RunnableC8199 runnableC8199 = this.f11684;
        if (runnableC8199 != null) {
            runnableC8199.run();
            this.f11684 = null;
            if (AbstractC8248.f22833) {
                if (i == 1) {
                    performHapticFeedback(3);
                } else if (i == 2) {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC3761(this, 0), 240L);
                } else if (i == 3) {
                    performHapticFeedback(3);
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC3761(this, 1), 150L);
                }
            }
        }
        Paint paint = this.f11693;
        if (i == 1) {
            float f = this.f11689;
            float f2 = this.f11691;
            float f3 = (int) (f / 20.0f);
            int i2 = (int) ((f2 - (f / 10.0f)) - f3);
            float f4 = f / 2.0f;
            int i3 = (int) (f2 - f4);
            int i4 = (int) (this.f11690 + f3);
            int i5 = (int) (f4 + f2);
            float f5 = i3;
            int i6 = (int) (((i5 - i3) * this.f11688) + f5);
            Path path = new Path();
            path.moveTo(f5, i4);
            if (i6 < i2) {
                this.f11695 = i6;
                int i7 = (i6 - i3) + i4;
                this.f11686 = i7;
                path.lineTo(i6, i7);
            } else {
                this.f11695 = i2;
                int i8 = (i2 - i3) + i4;
                this.f11686 = i8;
                path.lineTo(i2, i8);
                path.lineTo(i6, this.f11686 - (i6 - this.f11695));
            }
            canvas.drawPath(path, paint);
            return;
        }
        if (i == 2) {
            int i9 = (int) this.f11691;
            float f6 = this.f11690;
            float f7 = this.f11689;
            float f8 = 1.0f * f7;
            int i10 = (int) (f6 - (f8 / 2.0f));
            int i11 = (int) ((f8 / 8.0f) + f6);
            int i12 = (int) (((f7 * 3.0f) / 7.0f) + f6);
            float f9 = this.f11688;
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
        float f13 = this.f11690;
        float f14 = (this.f11689 * 4.0f) / 10.0f;
        int i13 = (int) (f13 - f14);
        int i14 = (int) (f14 + this.f11691);
        float f15 = this.f11688;
        if (f15 < 0.5f) {
            float f16 = i13;
            int i15 = (int) ((f15 * 2.0f * (i14 - i13)) + f16);
            this.f11695 = i15;
            this.f11686 = i15;
            float f17 = i15;
            canvas.drawLine(f16, f16, f17, f17, paint);
            return;
        }
        float f18 = i13;
        float f19 = i14 - i13;
        int i16 = (int) ((f15 * 2.0f * f19) + f18);
        this.f11695 = i16;
        this.f11686 = i16;
        float f20 = i14;
        canvas.drawLine(f18, f18, f20, f20, paint);
        float f21 = (this.f11688 - 0.5f) * 2.0f * f19;
        canvas.drawLine(f20, f18, (int) (f20 - f21), (int) (f21 + f18), paint);
    }
}
