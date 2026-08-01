package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛸᛵᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0396 extends android.text.style.ReplacementSpan {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final android.graphics.Paint.FontMetricsInt f1404;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0476 f1405;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public float f1406;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public short f1407;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public android.text.TextPaint f1408;

    public C0396(xhss.C0476 r2) {
            r1 = this;
            r1.<init>()
            android.graphics.Paint$FontMetricsInt r0 = new android.graphics.Paint$FontMetricsInt
            r0.<init>()
            r1.f1404 = r0
            r0 = -1
            r1.f1407 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.f1406 = r0
            java.lang.String r0 = "rasterizer cannot be null"
            xhss.AbstractC0060.m191(r2, r0)
            r1.f1405 = r2
            return
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas r19, java.lang.CharSequence r20, int r21, int r22, float r23, int r24, int r25, int r26, android.graphics.Paint r27) {
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r27
            boolean r3 = r1 instanceof android.text.Spanned
            r4 = 0
            if (r3 == 0) goto L4a
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.Class<android.text.style.CharacterStyle> r3 = android.text.style.CharacterStyle.class
            r5 = r21
            r6 = r22
            java.lang.Object[] r1 = r1.getSpans(r5, r6, r3)
            android.text.style.CharacterStyle[] r1 = (android.text.style.CharacterStyle[]) r1
            int r3 = r1.length
            if (r3 == 0) goto L42
            int r3 = r1.length
            r5 = 0
            r6 = 1
            if (r3 != r6) goto L26
            r3 = r1[r5]
            if (r3 != r0) goto L26
            goto L42
        L26:
            android.text.TextPaint r3 = r0.f1408
            if (r3 != 0) goto L31
            android.text.TextPaint r3 = new android.text.TextPaint
            r3.<init>()
            r0.f1408 = r3
        L31:
            r4 = r3
            r4.set(r2)
        L35:
            int r3 = r1.length
            if (r5 >= r3) goto L40
            r3 = r1[r5]
            r3.updateDrawState(r4)
            int r5 = r5 + 1
            goto L35
        L40:
            r10 = r4
            goto L52
        L42:
            boolean r1 = r2 instanceof android.text.TextPaint
            if (r1 == 0) goto L40
            r4 = r2
            android.text.TextPaint r4 = (android.text.TextPaint) r4
            goto L40
        L4a:
            boolean r1 = r2 instanceof android.text.TextPaint
            if (r1 == 0) goto L40
            r4 = r2
            android.text.TextPaint r4 = (android.text.TextPaint) r4
            goto L40
        L52:
            if (r10 == 0) goto L82
            int r1 = r10.bgColor
            if (r1 == 0) goto L82
            short r1 = r0.f1407
            float r1 = (float) r1
            float r8 = r23 + r1
            r1 = r24
            float r7 = (float) r1
            r1 = r26
            float r9 = (float) r1
            int r1 = r10.getColor()
            android.graphics.Paint$Style r3 = r10.getStyle()
            int r4 = r10.bgColor
            r10.setColor(r4)
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL
            r10.setStyle(r4)
            r5 = r19
            r6 = r23
            r5.drawRect(r6, r7, r8, r9, r10)
            r10.setStyle(r3)
            r10.setColor(r1)
        L82:
            xhss.ᛵᲁᛱᲁ r1 = xhss.C0514.m921()
            r1.getClass()
            r1 = r25
            float r1 = (float) r1
            if (r10 == 0) goto L8f
            goto L90
        L8f:
            r10 = r2
        L90:
            xhss.ᛵᛵᲇᛷ r0 = r0.f1405
            xhss.ᲇᛸᛶ r2 = r0.f1714
            java.lang.Object r3 = r2.f3447
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3
            android.graphics.Typeface r4 = r10.getTypeface()
            r10.setTypeface(r3)
            int r0 = r0.f1716
            int r13 = r0 * 2
            java.lang.Object r0 = r2.f3446
            r12 = r0
            char[] r12 = (char[]) r12
            r14 = 2
            r11 = r19
            r15 = r23
            r16 = r1
            r17 = r10
            r11.drawText(r12, r13, r14, r15, r16, r17)
            r10.setTypeface(r4)
            return
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(android.graphics.Paint r5, java.lang.CharSequence r6, int r7, int r8, android.graphics.Paint.FontMetricsInt r9) {
            r4 = this;
            android.graphics.Paint$FontMetricsInt r6 = r4.f1404
            r5.getFontMetricsInt(r6)
            int r5 = r6.descent
            int r7 = r6.ascent
            int r5 = r5 - r7
            int r5 = java.lang.Math.abs(r5)
            float r5 = (float) r5
            r7 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r7
            xhss.ᛵᛵᲇᛷ r7 = r4.f1405
            xhss.ᛲᲀᛴᲇ r8 = r7.m874()
            r0 = 14
            int r1 = r8.m880(r0)
            r2 = 0
            if (r1 == 0) goto L2d
            java.lang.Object r3 = r8.f1739
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r8 = r8.f1737
            int r1 = r1 + r8
            short r8 = r3.getShort(r1)
            goto L2e
        L2d:
            r8 = r2
        L2e:
            float r8 = (float) r8
            float r5 = r5 / r8
            r4.f1406 = r5
            xhss.ᛲᲀᛴᲇ r5 = r7.m874()
            int r8 = r5.m880(r0)
            if (r8 == 0) goto L46
            java.lang.Object r0 = r5.f1739
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r5 = r5.f1737
            int r8 = r8 + r5
            r0.getShort(r8)
        L46:
            xhss.ᛲᲀᛴᲇ r5 = r7.m874()
            r7 = 12
            int r7 = r5.m880(r7)
            if (r7 == 0) goto L5d
            java.lang.Object r8 = r5.f1739
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            int r5 = r5.f1737
            int r7 = r7 + r5
            short r2 = r8.getShort(r7)
        L5d:
            float r5 = (float) r2
            float r7 = r4.f1406
            float r5 = r5 * r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.f1407 = r5
            if (r9 == 0) goto L77
            int r4 = r6.ascent
            r9.ascent = r4
            int r4 = r6.descent
            r9.descent = r4
            int r4 = r6.top
            r9.top = r4
            int r4 = r6.bottom
            r9.bottom = r4
        L77:
            return r5
    }
}
