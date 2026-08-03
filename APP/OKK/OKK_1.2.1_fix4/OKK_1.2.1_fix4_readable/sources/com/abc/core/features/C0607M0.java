package com.abc.core.features;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import p001A0.AbstractC0040p;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.M0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0607M0 extends ReplacementSpan {

    /* JADX INFO: renamed from: a */
    public final int f1863a;

    /* JADX INFO: renamed from: b */
    public final int f1864b;

    /* JADX INFO: renamed from: c */
    public final float f1865c = 16.0f;

    /* JADX INFO: renamed from: d */
    public final float f1866d = 10.0f;

    public C0607M0(int i2, int i3) {
        this.f1863a = i2;
        this.f1864b = i3;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        AbstractC0307g.m703e(canvas, "canvas");
        AbstractC0307g.m703e(paint, "paint");
        if (charSequence == null) {
            return;
        }
        float fMeasureText = paint.measureText(charSequence, i2, i3);
        float f3 = this.f1866d;
        RectF rectF = new RectF(f2, i4, (2 * f3) + fMeasureText + f2, i6);
        int color = paint.getColor();
        paint.setColor(this.f1863a);
        float f4 = this.f1865c;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        paint.setColor(this.f1864b);
        canvas.drawText(charSequence, i2, i3, f2 + f3, i5, paint);
        paint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        AbstractC0307g.m703e(paint, "paint");
        if (charSequence == null) {
            return 0;
        }
        return AbstractC0040p.m87P((this.f1866d * 2) + paint.measureText(charSequence, i2, i3));
    }
}
