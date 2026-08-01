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
import com.google.android.material.textfield.C4009;
import com.kongzue.dialogx.util.C4597;
import p273.RunnableC9028;
import p277.AbstractC9077;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.views.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4594 extends View {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public boolean f12027;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public Runnable f12028;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public RunnableC9028 f12029;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public ValueAnimator f12030;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f12031;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public Interpolator f12032;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public float f12033;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public float f12034;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public float f12035;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public float f12036;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f12037;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Paint f12038;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public float f12039;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public int f12040;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public float f12041;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public float f12042;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public float f12043;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f12044;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public RectF f12045;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C4597 f12046;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C4597 f12047;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final float f12048;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final float f12049;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public float f12050;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public float f12051;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f12052;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f12053;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f12054;

    public C4594(Context context) {
        super(context);
        this.f12054 = 0;
        this.f12052 = (int) ((2.0f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
        this.f12053 = -1;
        this.f12048 = 180.0f;
        this.f12049 = 80.0f;
        this.f12038 = new Paint();
        this.f12037 = false;
        this.f12034 = 100.0f;
        this.f12044 = 0;
        this.f12040 = 0;
        this.f12031 = 0;
        m8645();
    }

    public int getColor() {
        return this.f12053;
    }

    public int getStatus() {
        return this.f12054;
    }

    public int getStrokeWidth() {
        return this.f12052;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        C4597 c4597 = this.f12047;
        if (c4597 != null) {
            c4597.f12060 = false;
        }
        C4597 c45972 = this.f12046;
        if (c45972 != null) {
            c45972.f12060 = false;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean zIsInEditMode = isInEditMode();
        Paint paint = this.f12038;
        if (zIsInEditMode) {
            canvas.drawArc(this.f12045, 0.0f, 365.0f, false, paint);
            return;
        }
        if (this.f12027) {
            canvas.drawArc(this.f12045, 0.0f, 365.0f, false, paint);
            this.f12044 = 2;
            m8646(this.f12054, canvas);
            return;
        }
        int i = this.f12054;
        if (i == 0) {
            float fSin = (this.f12049 / 2.0f) + ((float) (Math.sin(Math.toRadians(this.f12051)) * ((double) this.f12039))) + this.f12039;
            float f = this.f12050;
            float f2 = f - fSin;
            this.f12043 = f2;
            if (f2 < 0.0f) {
                this.f12043 = f2 + 360.0f;
            }
            this.f12042 = fSin;
            this.f12041 = fSin < 0.0f ? 360.0f - fSin : fSin;
            canvas.drawArc(this.f12045, f, -fSin, false, paint);
            return;
        }
        if (i == 1 || i == 2 || i == 3) {
            int i2 = this.f12044;
            if (i2 != 0) {
                if (i2 != 1) {
                    return;
                }
                canvas.drawArc(this.f12045, 0.0f, 360.0f, false, paint);
                m8646(this.f12054, canvas);
                return;
            }
            float f3 = this.f12042 + 5.0f;
            this.f12042 = f3;
            canvas.drawArc(this.f12045, this.f12043, f3, false, paint);
            if (this.f12042 - (360.0f - this.f12041) >= this.f12043) {
                this.f12044 = 1;
                Runnable runnable = this.f12028;
                if (runnable != null) {
                    runnable.run();
                    this.f12028 = null;
                    return;
                }
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        int i3 = this.f12044;
        if (i3 != 0) {
            if (i3 != 1) {
                return;
            }
            canvas.drawArc(this.f12045, 0.0f, 360.0f, false, paint);
            m8646(this.f12054, canvas);
            return;
        }
        canvas.drawArc(this.f12045, -90.0f, this.f12050, false, paint);
        if (this.f12050 == 365.0f) {
            this.f12044 = 1;
            Runnable runnable2 = this.f12028;
            if (runnable2 != null) {
                runnable2.run();
                this.f12028 = null;
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f12036 = (i * 1.0f) / 2.0f;
        this.f12035 = (i2 * 1.0f) / 2.0f;
        this.f12034 = (Math.min(getWidth(), getHeight()) / 2) - (this.f12052 / 2);
        float f = this.f12036;
        float f2 = this.f12034;
        float f3 = this.f12035;
        this.f12045 = new RectF(f - f2, f3 - f2, f + f2, f3 + f2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m8643(float f) {
        C4597 c4597 = this.f12047;
        if (c4597 != null) {
            c4597.f12060 = false;
        }
        C4597 c45972 = this.f12046;
        if (c45972 != null) {
            c45972.f12060 = false;
        }
        if (this.f12054 != 4) {
            this.f12050 = 0.0f;
        }
        this.f12027 = false;
        this.f12054 = 4;
        C4597 c4597M8648 = C4597.m8648(this.f12050, f * 365.0f);
        this.f12047 = c4597M8648;
        c4597M8648.f12062 = 1000L;
        c4597M8648.f12058 = new DecelerateInterpolator(2.0f);
        C4597 c45973 = this.f12047;
        c45973.f12067 = 0;
        c45973.f12059 = new C4591(this, 0);
        c45973.m8649();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m8644(int i, Interpolator interpolator) {
        this.f12032 = interpolator;
        this.f12054 = i;
        if (this.f12044 == 0) {
            this.f12028 = new RunnableC4593(this, 5);
            return;
        }
        ValueAnimator valueAnimator = this.f12030;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12030 = null;
        }
        this.f12033 = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f12030 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.f12030.addUpdateListener(new C4009(this, 2));
        this.f12030.start();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8645() {
        synchronized (C4594.class) {
            try {
                if (this.f12037) {
                    return;
                }
                this.f12037 = true;
                this.f12038.setAntiAlias(true);
                this.f12038.setStyle(Paint.Style.STROKE);
                this.f12038.setStrokeWidth(this.f12052);
                this.f12038.setStrokeCap(Paint.Cap.ROUND);
                this.f12038.setColor(this.f12053);
                if (!isInEditMode()) {
                    Context context = getContext();
                    float refreshRate = Build.VERSION.SDK_INT >= 30 ? ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay().getMode().getRefreshRate() : ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRefreshRate();
                    int i = (int) (refreshRate > 0.0f ? (long) (1000.0d / ((double) refreshRate)) : 16L);
                    this.f12039 = (this.f12048 - this.f12049) / 2.0f;
                    C4597 c4597M8648 = C4597.m8648(0.0f, 365.0f);
                    this.f12047 = c4597M8648;
                    c4597M8648.f12062 = 1000L;
                    c4597M8648.f12058 = new LinearInterpolator();
                    C4597 c4597 = this.f12047;
                    c4597.f12067 = -1;
                    c4597.f12066 = i;
                    c4597.f12059 = new C4591(this, 1);
                    C4597 c4597M86482 = C4597.m8648(0.0f, 365.0f);
                    this.f12046 = c4597M86482;
                    c4597M86482.f12062 = 1500L;
                    c4597M86482.f12066 = i;
                    c4597M86482.f12058 = new LinearInterpolator();
                    C4597 c45972 = this.f12046;
                    c45972.f12067 = -1;
                    c45972.f12059 = new C4591(this, 2);
                    c45972.m8649();
                    this.f12047.m8649();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8646(int i, Canvas canvas) {
        C4597 c4597 = this.f12047;
        Interpolator interpolator = c4597.f12058;
        Interpolator interpolator2 = this.f12032;
        if (interpolator != interpolator2) {
            c4597.f12058 = interpolator2;
        }
        RunnableC9028 runnableC9028 = this.f12029;
        if (runnableC9028 != null) {
            runnableC9028.run();
            this.f12029 = null;
            if (AbstractC9077.f23178) {
                if (i == 1) {
                    performHapticFeedback(3);
                } else if (i == 2) {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC4593(this, 0), 240L);
                } else if (i == 3) {
                    performHapticFeedback(3);
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC4593(this, 1), 150L);
                }
            }
        }
        Paint paint = this.f12038;
        if (i == 1) {
            float f = this.f12034;
            float f2 = this.f12036;
            float f3 = (int) (f / 20.0f);
            int i2 = (int) ((f2 - (f / 10.0f)) - f3);
            float f4 = f / 2.0f;
            int i3 = (int) (f2 - f4);
            int i4 = (int) (this.f12035 + f3);
            int i5 = (int) (f4 + f2);
            float f5 = i3;
            int i6 = (int) (((i5 - i3) * this.f12033) + f5);
            Path path = new Path();
            path.moveTo(f5, i4);
            if (i6 < i2) {
                this.f12040 = i6;
                int i7 = (i6 - i3) + i4;
                this.f12031 = i7;
                path.lineTo(i6, i7);
            } else {
                this.f12040 = i2;
                int i8 = (i2 - i3) + i4;
                this.f12031 = i8;
                path.lineTo(i2, i8);
                path.lineTo(i6, this.f12031 - (i6 - this.f12040));
            }
            canvas.drawPath(path, paint);
            return;
        }
        if (i == 2) {
            int i9 = (int) this.f12036;
            float f6 = this.f12035;
            float f7 = this.f12034;
            float f8 = 1.0f * f7;
            int i10 = (int) (f6 - (f8 / 2.0f));
            int i11 = (int) ((f8 / 8.0f) + f6);
            int i12 = (int) (((f7 * 3.0f) / 7.0f) + f6);
            float f9 = this.f12033;
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
        float f13 = this.f12035;
        float f14 = (this.f12034 * 4.0f) / 10.0f;
        int i13 = (int) (f13 - f14);
        int i14 = (int) (f14 + this.f12036);
        float f15 = this.f12033;
        if (f15 < 0.5f) {
            float f16 = i13;
            int i15 = (int) ((f15 * 2.0f * (i14 - i13)) + f16);
            this.f12040 = i15;
            this.f12031 = i15;
            float f17 = i15;
            canvas.drawLine(f16, f16, f17, f17, paint);
            return;
        }
        float f18 = i13;
        float f19 = i14 - i13;
        int i16 = (int) ((f15 * 2.0f * f19) + f18);
        this.f12040 = i16;
        this.f12031 = i16;
        float f20 = i14;
        canvas.drawLine(f18, f18, f20, f20, paint);
        float f21 = (this.f12033 - 0.5f) * 2.0f * f19;
        canvas.drawLine(f20, f18, (int) (f20 - f21), (int) (f21 + f18), paint);
    }
}
