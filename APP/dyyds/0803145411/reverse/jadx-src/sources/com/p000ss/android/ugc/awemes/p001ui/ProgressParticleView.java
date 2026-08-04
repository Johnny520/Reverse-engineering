package com.p000ss.android.ugc.awemes.p001ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.Iterator;
import yyds.AbstractC0598;
import yyds.AbstractC2328;
import yyds.AbstractC2497;
import yyds.C0078;
import yyds.C0217;
import yyds.C1223;
import yyds.C1265;
import yyds.C1510;
import yyds.C2405;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ProgressParticleView extends View {

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public static final /* synthetic */ int f507 = 0;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public boolean f508;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final Paint f509;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public float f510;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final float f511;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f512;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public float f513;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public float f514;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public long f515;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public ValueAnimator f516;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final Paint f517;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final Matrix f518;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final int[] f519;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final C0078 f520;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final C0217 f521;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final float f522;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public boolean f523;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int f524;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f525;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressParticleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC2328.m4341(-193754137527150L);
        float f = context.getResources().getDisplayMetrics().density;
        this.f522 = f;
        int color = context.getColor(R.color.douyin_primary);
        this.f525 = Color.red(color);
        this.f512 = Color.green(color);
        this.f524 = Color.blue(color);
        Paint paint = new Paint(1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f517 = paint;
        this.f509 = new Paint(1);
        this.f511 = f * 7.0f;
        this.f520 = new C0078(new C1223(17, this));
        this.f518 = new Matrix();
        this.f519 = new int[]{color, color, color, context.getColor(R.color.douyin_save_gif), Color.rgb((int) ((Color.red(-1) * 0.62f) + (Color.red(color) * 0.38f)), (int) ((Color.green(-1) * 0.62f) + (Color.green(color) * 0.38f)), (int) ((Color.blue(-1) * 0.62f) + (Color.blue(color) * 0.38f)))};
        this.f521 = new C0217(64);
    }

    private final RadialGradient getGlowShader() {
        return (RadialGradient) this.f520.getValue();
    }

    private final boolean getHasVisibleTip() {
        return this.f508 ? this.f523 : this.f510 > 0.0f;
    }

    private final float getTipX() {
        return (this.f508 ? this.f514 : this.f510) * getWidth();
    }

    private final float getTipY() {
        return getHeight() / 2.0f;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final void m358(ProgressParticleView progressParticleView) {
        AbstractC2328.m4341(-193904461382510L);
        C0217 c0217 = progressParticleView.f521;
        if (!progressParticleView.m360()) {
            progressParticleView.m359();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jM1488 = AbstractC0598.m1488(jElapsedRealtime - progressParticleView.f515, 0L, 50L);
        progressParticleView.f515 = jElapsedRealtime;
        float f = jM1488 / 1000.0f;
        if (progressParticleView.getWidth() <= 0) {
            return;
        }
        if (progressParticleView.getHasVisibleTip()) {
            float tipX = progressParticleView.getTipX();
            float tipY = progressParticleView.getTipY();
            progressParticleView.f513 = (26.0f * f) + progressParticleView.f513;
            while (true) {
                float f2 = progressParticleView.f513;
                if (f2 < 1.0f) {
                    break;
                }
                progressParticleView.f513 = f2 - 1.0f;
                progressParticleView.m363(tipX, tipY);
            }
        }
        if (!c0217.isEmpty()) {
            float f3 = 1.0f - (3.2f * f);
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            float f4 = progressParticleView.f522 * 220.0f * f;
            Iterator<E> it = c0217.iterator();
            while (it.hasNext()) {
                C1265 c1265 = (C1265) it.next();
                float f5 = c1265.f5829 - f;
                c1265.f5829 = f5;
                if (f5 <= 0.0f) {
                    it.remove();
                } else {
                    float f6 = c1265.f5834 * f3;
                    c1265.f5834 = f6;
                    float f7 = (c1265.f5836 * f3) + f4;
                    c1265.f5836 = f7;
                    c1265.f5830 = (f6 * f) + c1265.f5830;
                    c1265.f5831 = (f7 * f) + c1265.f5831;
                    c1265.f5827 = ((AbstractC0598.m1483(f5 / c1265.f5835, 0.0f, 1.0f) * 0.65f) + 0.35f) * c1265.f5832;
                }
            }
        }
        progressParticleView.invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m362();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        m359();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC2328.m4341(-193788497265518L);
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        float tipX = getTipX();
        float tipY = getTipY();
        if (getHasVisibleTip()) {
            Matrix matrix = this.f518;
            matrix.setTranslate(tipX, tipY);
            getGlowShader().setLocalMatrix(matrix);
            RadialGradient glowShader = getGlowShader();
            Paint paint = this.f509;
            paint.setShader(glowShader);
            canvas.drawCircle(tipX, tipY, this.f511, paint);
        }
        for (C1265 c1265 : this.f521) {
            float fM1483 = AbstractC0598.m1483(c1265.f5829 / c1265.f5835, 0.0f, 1.0f);
            float fSin = (((float) Math.sin(((r3 - c1265.f5829) * 26.0f) + c1265.f5833)) * 0.45f) + 0.55f;
            int i = c1265.f5828;
            Paint paint2 = this.f517;
            paint2.setColor(i);
            paint2.setAlpha(AbstractC0598.m1487((int) (fM1483 * fSin * 235.0f), 0, 255));
            paint2.setStrokeWidth(c1265.f5827);
            float f = c1265.f5830;
            float f2 = c1265.f5831;
            canvas.drawLine(f, f2, f - (c1265.f5834 * 0.045f), f2 - (c1265.f5836 * 0.045f), paint2);
        }
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        m362();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        AbstractC2328.m4341(-193818562036590L);
        super.onVisibilityChanged(view, i);
        m362();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m362();
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m359() {
        ValueAnimator valueAnimator = this.f516;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f516 = null;
        this.f521.clear();
        this.f513 = 0.0f;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean m360() {
        return isAttachedToWindow() && isShown() && getWindowVisibility() == 0;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m361(float f, boolean z) {
        float fM1483 = AbstractC0598.m1483(f, 0.0f, 1.0f);
        float f2 = (z || this.f508) ? 0.0f : fM1483 - this.f510;
        this.f510 = fM1483;
        this.f508 = z;
        if (f2 > 0.0f && getWidth() > 0) {
            int i = (int) (f2 * 260.0f);
            for (int i2 = 0; i2 < i; i2++) {
                m363(getTipX(), getTipY());
            }
        }
        m362();
        invalidate();
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m362() {
        if (!m360()) {
            m359();
            return;
        }
        ValueAnimator valueAnimator = this.f516;
        if ((valueAnimator == null || !valueAnimator.isRunning()) && m360()) {
            this.f515 = SystemClock.elapsedRealtime();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(16L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new C2405(5, this));
            valueAnimatorOfFloat.start();
            this.f516 = valueAnimatorOfFloat;
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m363(float f, float f2) {
        C1510 c1510 = AbstractC2497.f12305;
        double radians = Math.toRadians(((c1510.m3134() * 52.0f) - 26.0f) - 90.0f);
        float fM3134 = (c1510.m3134() * 75.0f) + 55.0f;
        float f3 = this.f522;
        float fM31342 = (c1510.m3134() * 0.34999996f) + 0.3f;
        float fM31343 = ((c1510.m3134() * c1510.m3134() * 1.6999999f) + 0.9f) * f3;
        float fM31344 = f - ((c1510.m3134() * 6.0f) * f3);
        float fM31345 = (((c1510.m3134() * 2.0f) - 1.0f) * f3) + f2;
        double d = fM3134 * f3;
        float fCos = (float) (Math.cos(radians) * d);
        float fSin = (float) (Math.sin(radians) * d);
        int[] iArr = this.f519;
        C1265 c1265 = new C1265(fM31344, fM31345, fCos, fSin, fM31342, fM31342, fM31343, fM31343, iArr[AbstractC2497.f12306.m1531(iArr.length)], c1510.m3134() * 6.2831855f);
        C0217 c0217 = this.f521;
        c0217.addLast(c1265);
        if (c0217.f1227 > 110) {
            c0217.removeFirst();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressParticleView(Context context) {
        this(context, null);
        AbstractC2328.m4341(-193870101644142L);
    }
}
