package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g80 extends android.text.style.ReplacementSpan {
    public final android.graphics.Paint.FontMetricsInt a;
    public final defpackage.ni b;
    public float c;

    public g80(defpackage.ni r2) {
            r1 = this;
            r1.<init>()
            android.graphics.Paint$FontMetricsInt r0 = new android.graphics.Paint$FontMetricsInt
            r0.<init>()
            r1.a = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.c = r0
            java.lang.String r0 = "metadata cannot be null"
            defpackage.zt.f(r0, r2)
            r1.b = r2
            return
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas r2, java.lang.CharSequence r3, int r4, int r5, float r6, int r7, int r8, int r9, android.graphics.Paint r10) {
            r1 = this;
            ei r3 = defpackage.ei.a()
            r3.getClass()
            float r9 = (float) r8
            ni r3 = r1.b
            a8 r4 = r3.b
            java.lang.Object r5 = r4.d
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            android.graphics.Typeface r0 = r10.getTypeface()
            r10.setTypeface(r5)
            int r3 = r3.a
            int r3 = r3 * 2
            java.lang.Object r4 = r4.b
            r5 = r4
            char[] r5 = (char[]) r5
            r7 = 2
            r4 = r2
            r8 = r6
            r6 = r3
            r4.drawText(r5, r6, r7, r8, r9, r10)
            r10.setTypeface(r0)
            return
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(android.graphics.Paint r5, java.lang.CharSequence r6, int r7, int r8, android.graphics.Paint.FontMetricsInt r9) {
            r4 = this;
            android.graphics.Paint$FontMetricsInt r6 = r4.a
            r5.getFontMetricsInt(r6)
            int r5 = r6.descent
            int r7 = r6.ascent
            int r5 = r5 - r7
            int r5 = java.lang.Math.abs(r5)
            float r5 = (float) r5
            r7 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r7
            ni r7 = r4.b
            vv r8 = r7.b()
            r0 = 14
            int r1 = r8.a(r0)
            r2 = 0
            if (r1 == 0) goto L2d
            java.lang.Object r3 = r8.d
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r8 = r8.a
            int r1 = r1 + r8
            short r8 = r3.getShort(r1)
            goto L2e
        L2d:
            r8 = r2
        L2e:
            float r8 = (float) r8
            float r5 = r5 / r8
            r4.c = r5
            vv r5 = r7.b()
            int r8 = r5.a(r0)
            if (r8 == 0) goto L46
            java.lang.Object r0 = r5.d
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r5 = r5.a
            int r8 = r8 + r5
            r0.getShort(r8)
        L46:
            vv r5 = r7.b()
            r7 = 12
            int r7 = r5.a(r7)
            if (r7 == 0) goto L5d
            java.lang.Object r8 = r5.d
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            int r5 = r5.a
            int r7 = r7 + r5
            short r2 = r8.getShort(r7)
        L5d:
            float r5 = (float) r2
            float r7 = r4.c
            float r5 = r5 * r7
            int r5 = (int) r5
            short r5 = (short) r5
            if (r9 == 0) goto L75
            int r7 = r6.ascent
            r9.ascent = r7
            int r7 = r6.descent
            r9.descent = r7
            int r7 = r6.top
            r9.top = r7
            int r6 = r6.bottom
            r9.bottom = r6
        L75:
            return r5
    }
}
