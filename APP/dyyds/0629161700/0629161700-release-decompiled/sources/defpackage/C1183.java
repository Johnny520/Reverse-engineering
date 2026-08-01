package defpackage;

/* JADX INFO: renamed from: ᛶᲈᛵᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1183 extends android.text.style.ReplacementSpan {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public float f5371;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0948 f5372;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.graphics.Paint.FontMetricsInt f5373;

    public C1183(defpackage.C0948 r2) {
            r1 = this;
            r1.<init>()
            android.graphics.Paint$FontMetricsInt r0 = new android.graphics.Paint$FontMetricsInt
            r0.<init>()
            r1.f5373 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.f5371 = r0
            java.lang.String r0 = "metadata cannot be null"
            defpackage.C1825.m3220(r2, r0)
            r1.f5372 = r2
            return
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas r2, java.lang.CharSequence r3, int r4, int r5, float r6, int r7, int r8, int r9, android.graphics.Paint r10) {
            r1 = this;
            ᛴᲁᛶᲈ r3 = defpackage.C0766.m1696()
            r3.getClass()
            float r9 = (float) r8
            ᛵᛸᛸᛳ r1 = r1.f5372
            ᛲᛶᛲᲁ r3 = r1.f4248
            java.lang.Object r4 = r3.f1619
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4
            android.graphics.Typeface r0 = r10.getTypeface()
            r10.setTypeface(r4)
            int r1 = r1.f4247
            int r1 = r1 * 2
            java.lang.Object r3 = r3.f1615
            r5 = r3
            char[] r5 = (char[]) r5
            r7 = 2
            r4 = r2
            r8 = r6
            r6 = r1
            r4.drawText(r5, r6, r7, r8, r9, r10)
            r10.setTypeface(r0)
            return
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(android.graphics.Paint r5, java.lang.CharSequence r6, int r7, int r8, android.graphics.Paint.FontMetricsInt r9) {
            r4 = this;
            android.graphics.Paint$FontMetricsInt r6 = r4.f5373
            r5.getFontMetricsInt(r6)
            int r5 = r6.descent
            int r7 = r6.ascent
            int r5 = r5 - r7
            int r5 = java.lang.Math.abs(r5)
            float r5 = (float) r5
            r7 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r7
            ᛵᛸᛸᛳ r7 = r4.f5372
            ᲈᛱᛵᛱ r8 = r7.m1901()
            r0 = 14
            int r1 = r8.m2420(r0)
            r2 = 0
            if (r1 == 0) goto L2d
            java.lang.Object r3 = r8.f5769
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r8 = r8.f5768
            int r1 = r1 + r8
            short r8 = r3.getShort(r1)
            goto L2e
        L2d:
            r8 = r2
        L2e:
            float r8 = (float) r8
            float r5 = r5 / r8
            r4.f5371 = r5
            ᲈᛱᛵᛱ r5 = r7.m1901()
            int r8 = r5.m2420(r0)
            if (r8 == 0) goto L46
            java.lang.Object r0 = r5.f5769
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r5 = r5.f5768
            int r8 = r8 + r5
            r0.getShort(r8)
        L46:
            ᲈᛱᛵᛱ r5 = r7.m1901()
            r7 = 12
            int r7 = r5.m2420(r7)
            if (r7 == 0) goto L5d
            java.lang.Object r8 = r5.f5769
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            int r5 = r5.f5768
            int r7 = r7 + r5
            short r2 = r8.getShort(r7)
        L5d:
            float r5 = (float) r2
            float r4 = r4.f5371
            float r5 = r5 * r4
            int r4 = (int) r5
            short r4 = (short) r4
            if (r9 == 0) goto L75
            int r5 = r6.ascent
            r9.ascent = r5
            int r5 = r6.descent
            r9.descent = r5
            int r5 = r6.top
            r9.top = r5
            int r5 = r6.bottom
            r9.bottom = r5
        L75:
            return r4
    }
}
