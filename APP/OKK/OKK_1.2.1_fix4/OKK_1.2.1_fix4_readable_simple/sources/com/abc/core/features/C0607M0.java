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
    public final float f1865c;

    /* JADX INFO: renamed from: d */
    public final float f1866d;

    public C0607M0(int r1, int r2) {
        this.f1863a = r1;
        this.f1864b = r2;
        this.f1865c = 16.0f;
        this.f1866d = 10.0f;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas r13, CharSequence r14, int r15, int r16, float r17, int r18, int r19, int r20, Paint r21) {
        AbstractC0307g.m703e(r13, "canvas");
        AbstractC0307g.m703e(r21, "paint");
        if (r14 != null) goto L5;
        return;
    L5:
        float r6 = r21.measureText(r14, r15, r16);
        float r9 = this.f1866d;
        RectF r62 = new RectF(r17, r18, ((2 * r9) + r6) + r17, r20);
        int r10 = r21.getColor();
        r21.setColor(this.f1863a);
        float r7 = this.f1865c;
        r13.drawRoundRect(r62, r7, r7, r21);
        r21.setColor(this.f1864b);
        r13.drawText(r14, r15, r16, r17 + r9, r19, r21);
        r21.setColor(r10);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint r1, CharSequence r2, int r3, int r4, Paint.FontMetricsInt r5) {
        AbstractC0307g.m703e(r1, "paint");
        if (r2 != null) goto L7;
        return 0;
    L7:
        return AbstractC0040p.m87P((this.f1866d * 2) + r1.measureText(r2, r3, r4));
    }
}
