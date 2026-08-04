package yyds;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᛵᛳᛱᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1052 extends View {

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public ValueAnimator f4758;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final Paint f4759;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final float f4760;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final Paint f4761;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public String f4762;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final RectF f4763;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final float f4764;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public float f4765;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final Paint f4766;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final Paint f4767;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final C0078 f4768;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public float f4769;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final int[] f4770;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final float f4771;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final float f4772;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final TextPaint f4773;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final Paint f4774;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final int f4775;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final int f4776;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public boolean f4777;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final int f4778;

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public long f4779;

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public final C0217 f4780;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final Matrix f4781;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f4782;

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public float f4783;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final Paint f4784;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final float f4785;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final float f4786;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public boolean f4787;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1052(Context context) {
        super(context);
        AbstractC2328.m4341(-155176741274478L);
        this.f4782 = 120;
        float f = context.getResources().getDisplayMetrics().density;
        this.f4786 = f;
        float f2 = context.getResources().getDisplayMetrics().scaledDensity;
        this.f4764 = f2;
        float f3 = 6.0f * f;
        this.f4785 = f3;
        float f4 = 24.0f * f;
        this.f4772 = f4;
        this.f4760 = (0.9f * f3) + f4;
        this.f4763 = new RectF();
        int color = context.getColor(R.color.douyin_primary);
        this.f4778 = Color.red(color);
        this.f4775 = Color.green(color);
        this.f4776 = Color.blue(color);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(context.getColor(R.color.download_panel_bg));
        this.f4761 = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        paint2.setStrokeWidth(f3);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setColor(context.getColor(R.color.divider_color));
        this.f4759 = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style2);
        paint3.setStrokeWidth(f3);
        paint3.setStrokeCap(cap);
        paint3.setColor(color);
        this.f4767 = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style);
        this.f4784 = paint4;
        this.f4771 = f3 * 2.4f;
        this.f4768 = new C0078(new C1223(7, this));
        this.f4781 = new Matrix();
        Paint paint5 = new Paint(1);
        paint5.setStyle(style);
        paint5.setColor(color);
        this.f4766 = paint5;
        Paint paint6 = new Paint(1);
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        this.f4774 = paint6;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(context.getColor(R.color.dialog_title_color));
        textPaint.setTextSize(f2 * 14.0f);
        textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.f4773 = textPaint;
        this.f4770 = new int[]{color, color, color, context.getColor(R.color.douyin_save_gif), Color.rgb((int) ((Color.red(-1) * 0.62f) + (Color.red(color) * 0.38f)), (int) ((Color.green(-1) * 0.62f) + (Color.green(color) * 0.38f)), (int) ((Color.blue(-1) * 0.62f) + (Color.blue(color) * 0.38f)))};
        this.f4762 = AbstractC2328.m4341(-155211101012846L);
        this.f4777 = true;
        this.f4780 = new C0217(64);
    }

    private final RadialGradient getGlowShader() {
        return (RadialGradient) this.f4768.getValue();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2247();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        m2243();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        AbstractC2328.m4341(-155236870816622L);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        canvas.drawCircle(width, height, this.f4760, this.f4761);
        Paint paint = this.f4759;
        RectF rectF = this.f4763;
        canvas.drawArc(rectF, 0.0f, 360.0f, false, paint);
        boolean z = this.f4787;
        Paint paint2 = this.f4767;
        if (z) {
            canvas2 = canvas;
            canvas2.drawArc(rectF, this.f4769, 100.0f, false, paint2);
        } else {
            float f = this.f4765;
            if (f > 0.0f) {
                float f2 = f * 360.0f;
                canvas2 = canvas;
                canvas2.drawArc(rectF, -90.0f, f2, false, paint2);
            } else {
                canvas2 = canvas;
            }
        }
        float[] fArrM2245 = m2245();
        float f3 = fArrM2245[0];
        float f4 = fArrM2245[1];
        boolean z2 = this.f4787;
        float f5 = this.f4785;
        if (z2 || this.f4765 > 0.0f) {
            Matrix matrix = this.f4781;
            matrix.setTranslate(f3, f4);
            getGlowShader().setLocalMatrix(matrix);
            RadialGradient glowShader = getGlowShader();
            Paint paint3 = this.f4784;
            paint3.setShader(glowShader);
            canvas2.drawCircle(f3, f4, this.f4771, paint3);
            canvas2.drawCircle(f3, f4, 0.6f * f5, this.f4766);
        }
        for (C1395 c1395 : this.f4780) {
            float fM1483 = AbstractC0598.m1483(c1395.f6497 / c1395.f6503, 0.0f, 1.0f);
            float fSin = (((float) Math.sin(((r4 - c1395.f6497) * 26.0f) + c1395.f6501)) * 0.45f) + 0.55f;
            int i = c1395.f6496;
            Paint paint4 = this.f4774;
            paint4.setColor(i);
            paint4.setAlpha(AbstractC0598.m1487((int) (fM1483 * fSin * 235.0f), 0, 255));
            paint4.setStrokeWidth(c1395.f6495);
            float f6 = c1395.f6498;
            float f7 = c1395.f6499;
            canvas2.drawLine(f6, f7, f6 - (c1395.f6502 * 0.05f), f7 - (c1395.f6504 * 0.05f), paint4);
        }
        String str = this.f4762;
        boolean z3 = this.f4777;
        TextPaint textPaint = this.f4773;
        if (z3) {
            float f8 = this.f4764 * 14.0f;
            textPaint.setTextSize(f8);
            float f9 = ((this.f4772 - (f5 / 2.0f)) - (this.f4786 * 3.0f)) * 2.0f;
            float fMeasureText = textPaint.measureText(str);
            if (fMeasureText > f9 && fMeasureText > 0.0f) {
                textPaint.setTextSize((f8 * f9) / fMeasureText);
            }
            this.f4777 = false;
        }
        canvas2.drawText(this.f4762, width, height - ((textPaint.descent() + textPaint.ascent()) / 2.0f), textPaint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = (int) (this.f4782 * this.f4786);
        setMeasuredDimension(i3, i3);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i / 2.0f;
        float f2 = i2 / 2.0f;
        float f3 = this.f4772;
        this.f4763.set(f - f3, f2 - f3, f + f3, f2 + f3);
        this.f4777 = true;
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        m2247();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        AbstractC2328.m4341(-155266935587694L);
        super.onVisibilityChanged(view, i);
        m2247();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m2247();
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m2243() {
        ValueAnimator valueAnimator = this.f4758;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f4758 = null;
        this.f4780.clear();
        this.f4783 = 0.0f;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean m2244() {
        return isAttachedToWindow() && isShown() && getWindowVisibility() == 0;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final float[] m2245() {
        float f;
        float f2;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        if (this.f4787) {
            f = this.f4769;
            f2 = 100.0f;
        } else {
            f = this.f4765 * 360.0f;
            f2 = -90.0f;
        }
        double radians = Math.toRadians(f + f2);
        float fCos = (float) Math.cos(radians);
        float fSin = (float) Math.sin(radians);
        float f3 = this.f4772;
        return new float[]{(f3 * fCos) + width, (f3 * fSin) + height, fCos, fSin};
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m2246(float f, boolean z) {
        float fM1483 = AbstractC0598.m1483(f, 0.0f, 1.0f);
        float f2 = (z || this.f4787) ? 0.0f : fM1483 - this.f4765;
        this.f4765 = fM1483;
        this.f4787 = z;
        if (f2 > 0.0f && getWidth() > 0) {
            int i = (int) (f2 * 220.0f);
            for (int i2 = 0; i2 < i; i2++) {
                float[] fArrM2245 = m2245();
                m2248(fArrM2245[0], fArrM2245[1], fArrM2245[2], fArrM2245[3]);
            }
        }
        String strM4341 = z ? AbstractC2328.m4341(-155223985914734L) : AbstractC0897.m1999(new StringBuilder(), (int) (this.f4765 * 100.0f), '%');
        if (!AbstractC1544.m3188(this.f4762, strM4341)) {
            this.f4762 = strM4341;
            this.f4777 = true;
        }
        m2247();
        invalidate();
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m2247() {
        if (!m2244()) {
            m2243();
            return;
        }
        ValueAnimator valueAnimator = this.f4758;
        if ((valueAnimator == null || !valueAnimator.isRunning()) && m2244()) {
            this.f4779 = SystemClock.elapsedRealtime();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(16L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new C2405(1, this));
            valueAnimatorOfFloat.start();
            this.f4758 = valueAnimatorOfFloat;
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m2248(float f, float f2, float f3, float f4) {
        C1510 c1510 = AbstractC2497.f12305;
        float fM3134 = ((c1510.m3134() * 2.0f) - 1.0f) * 0.28f;
        float f5 = (f3 * 0.55f) - (f4 * fM3134);
        float f6 = ((fM3134 * f3) + (0.55f * f4)) - 0.85f;
        float f7 = (f6 * f4) + (f5 * f3);
        if (f7 < 0.18f) {
            float f8 = 0.18f - f7;
            f5 += f3 * f8;
            f6 += f8 * f4;
        }
        float fSqrt = (float) Math.sqrt((f6 * f6) + (f5 * f5));
        if (fSqrt < 0.001f) {
            fSqrt = 0.001f;
        }
        float f9 = f5 / fSqrt;
        float f10 = f6 / fSqrt;
        float fM31342 = (c1510.m3134() * 62.0f) + 30.0f;
        float f11 = this.f4786;
        float f12 = fM31342 * f11;
        float fM31343 = (c1510.m3134() * 0.4f) + 0.35f;
        float fM31344 = ((c1510.m3134() * c1510.m3134() * 1.5000001f) + 0.9f) * f11;
        float f13 = f10 * f12;
        int[] iArr = this.f4770;
        C1395 c1395 = new C1395(f, f2, f9 * f12, f13, fM31343, fM31343, fM31344, fM31344, iArr[AbstractC2497.f12306.m1531(iArr.length)], c1510.m3134() * 6.2831855f);
        C0217 c0217 = this.f4780;
        c0217.addLast(c1395);
        if (c0217.f1227 > 120) {
            c0217.removeFirst();
        }
    }
}
