package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class k32 {

    /* JADX INFO: renamed from: α */
    public final android.text.TextPaint f5734;

    /* JADX INFO: renamed from: β */
    public final android.text.TextUtils.TruncateAt f5735;

    /* JADX INFO: renamed from: γ */
    public final boolean f5736;

    /* JADX INFO: renamed from: δ */
    public final boolean f5737;

    /* JADX INFO: renamed from: ε */
    public final android.text.Layout f5738;

    /* JADX INFO: renamed from: ζ */
    public final int f5739;

    /* JADX INFO: renamed from: η */
    public final int f5740;

    /* JADX INFO: renamed from: θ */
    public final int f5741;

    /* JADX INFO: renamed from: ι */
    public final float f5742;

    /* JADX INFO: renamed from: κ */
    public final float f5743;

    /* JADX INFO: renamed from: λ */
    public final boolean f5744;

    /* JADX INFO: renamed from: μ */
    public final android.graphics.Paint.FontMetricsInt f5745;

    /* JADX INFO: renamed from: ν */
    public final int f5746;

    /* JADX INFO: renamed from: ξ */
    public final p000.xr0[] f5747;

    /* JADX INFO: renamed from: ο */
    public final android.graphics.Rect f5748;

    /* JADX INFO: renamed from: π */
    public p000.C0068b8 f5749;

    public k32(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, boolean r28, int r29, int r30, int r31, int r32, int r33, int r34, p000.pp0 r35) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r25
            r6 = r28
            r0.<init>()
            r4 = r24
            r0.f5734 = r4
            r7 = r26
            r0.f5735 = r7
            r0.f5736 = r6
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r0.f5748 = r5
            int r5 = r1.length()
            android.text.TextDirectionHeuristic r12 = p000.n32.m3950(r27)
            android.text.Layout$Alignment r8 = p000.a32.f57
            r13 = 1
            r14 = 2
            if (r3 == 0) goto L45
            if (r3 == r13) goto L42
            if (r3 == r14) goto L3f
            r8 = 3
            if (r3 == r8) goto L3c
            r8 = 4
            if (r3 == r8) goto L39
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L47
        L39:
            android.text.Layout$Alignment r3 = p000.a32.f58
            goto L47
        L3c:
            android.text.Layout$Alignment r3 = p000.a32.f57
            goto L47
        L3f:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L47
        L42:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L47
        L45:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
        L47:
            boolean r8 = r1 instanceof android.text.Spanned
            if (r8 == 0) goto L59
            r8 = r1
            android.text.Spanned r8 = (android.text.Spanned) r8
            r9 = -1
            java.lang.Class<s8> r10 = p000.C0789s8.class
            int r8 = r8.nextSpanTransition(r9, r5, r10)
            if (r8 >= r5) goto L59
            r5 = r13
            goto L5a
        L59:
            r5 = 0
        L5a:
            java.lang.String r8 = "TextLayout:initLayout"
            android.os.Trace.beginSection(r8)
            android.text.BoringLayout$Metrics r8 = r35.m4563()     // Catch: java.lang.Throwable -> L33f
            double r9 = (double) r2     // Catch: java.lang.Throwable -> L33f
            double r14 = java.lang.Math.ceil(r9)     // Catch: java.lang.Throwable -> L33f
            float r11 = (float) r14     // Catch: java.lang.Throwable -> L33f
            int r11 = (int) r11     // Catch: java.lang.Throwable -> L33f
            r14 = 33
            if (r8 == 0) goto Lb4
            float r15 = r35.m4565()     // Catch: java.lang.Throwable -> L33f
            int r2 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r2 > 0) goto Lb4
            if (r5 != 0) goto Lb4
            r0.f5744 = r13     // Catch: java.lang.Throwable -> L33f
            if (r11 < 0) goto L7d
            goto L82
        L7d:
            java.lang.String r2 = "negative width"
            p000.bm0.m982(r2)     // Catch: java.lang.Throwable -> L33f
        L82:
            if (r11 < 0) goto L85
            goto L8a
        L85:
            java.lang.String r2 = "negative ellipsized width"
            p000.bm0.m982(r2)     // Catch: java.lang.Throwable -> L33f
        L8a:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L33f
            if (r2 < r14) goto L98
            r5 = r8
            r8 = r11
            r2 = r4
            r4 = r3
            r3 = r11
            android.text.BoringLayout r2 = p000.AbstractC1124.m7326(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L33f
            goto Lb0
        L98:
            r4 = r3
            r5 = r8
            r3 = r11
            android.text.BoringLayout r1 = new android.text.BoringLayout     // Catch: java.lang.Throwable -> L33f
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r11 = r3
            r2 = r22
            r10 = r26
            r9 = r28
            r8 = r5
            r5 = r4
            r4 = r3
            r3 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L33f
            r2 = r1
        Lb0:
            r7 = r29
            r5 = r12
            goto Lde
        Lb4:
            r4 = r3
            r3 = r11
            r1 = 0
            r0.f5744 = r1     // Catch: java.lang.Throwable -> L33f
            r5 = r4
            int r4 = r22.length()     // Catch: java.lang.Throwable -> L33f
            double r6 = java.lang.Math.ceil(r9)     // Catch: java.lang.Throwable -> L33f
            float r2 = (float) r6     // Catch: java.lang.Throwable -> L33f
            int r9 = (int) r2     // Catch: java.lang.Throwable -> L33f
            r1 = r22
            r2 = r24
            r8 = r26
            r11 = r28
            r7 = r29
            r13 = r31
            r14 = r32
            r15 = r33
            r10 = r34
            r6 = r5
            r5 = r12
            r12 = r30
            android.text.StaticLayout r2 = p000.e81.m1874(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L33f
        Lde:
            r0.f5738 = r2     // Catch: java.lang.Throwable -> L33f
            android.os.Trace.endSection()
            int r1 = r2.getLineCount()
            int r1 = java.lang.Math.min(r1, r7)
            r0.f5739 = r1
            int r3 = r1 + (-1)
            if (r1 >= r7) goto Lf3
        Lf1:
            r13 = 0
            goto L104
        Lf3:
            int r4 = r2.getEllipsisCount(r3)
            if (r4 > 0) goto L103
            int r4 = r2.getLineEnd(r3)
            int r6 = r22.length()
            if (r4 == r6) goto Lf1
        L103:
            r13 = 1
        L104:
            r0.f5737 = r13
            java.lang.CharSequence r4 = r2.getText()
            boolean r4 = r4 instanceof android.text.Spanned
            if (r4 != 0) goto L10f
            goto L12a
        L10f:
            java.lang.CharSequence r4 = r2.getText()
            r4.getClass()
            android.text.Spanned r4 = (android.text.Spanned) r4
            java.lang.Class<xr0> r7 = p000.xr0.class
            boolean r4 = p000.v71.m6039(r4, r7)
            if (r4 != 0) goto L12d
            java.lang.CharSequence r4 = r2.getText()
            int r4 = r4.length()
            if (r4 <= 0) goto L12d
        L12a:
            r4 = 0
            r9 = 0
            goto L145
        L12d:
            java.lang.CharSequence r4 = r2.getText()
            r4.getClass()
            android.text.Spanned r4 = (android.text.Spanned) r4
            java.lang.CharSequence r8 = r2.getText()
            int r8 = r8.length()
            r9 = 0
            java.lang.Object[] r4 = r4.getSpans(r9, r8, r7)
            xr0[] r4 = (p000.xr0[]) r4
        L145:
            r0.f5747 = r4
            if (r4 == 0) goto L160
            java.lang.Object r7 = p000.AbstractC0312g7.m2250(r4)
            xr0 r7 = (p000.xr0) r7
            if (r7 == 0) goto L160
            boolean r8 = r7.f12258
            if (r8 == 0) goto L15c
            int r7 = r7.f12261
            r8 = 2
            if (r7 != r8) goto L15d
            r13 = 1
            goto L15e
        L15c:
            r8 = 2
        L15d:
            r13 = r9
        L15e:
            r15 = r13
            goto L162
        L160:
            r8 = 2
            r15 = r9
        L162:
            if (r4 == 0) goto L176
            java.lang.Object r7 = p000.AbstractC0312g7.m2250(r4)
            xr0 r7 = (p000.xr0) r7
            if (r7 == 0) goto L176
            boolean r10 = r7.f12259
            if (r10 == 0) goto L176
            int r7 = r7.f12261
            if (r7 != r8) goto L176
            r13 = 1
            goto L177
        L176:
            r13 = r9
        L177:
            if (r15 == 0) goto L189
            if (r13 == 0) goto L189
            long r1 = p000.n32.f7377
            r23 = 32
            r24 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 1
            r14 = 33
            goto L229
        L189:
            long r16 = p000.n32.f7377
            if (r28 != 0) goto L20d
            boolean r8 = r0.f5744
            if (r8 == 0) goto L1a1
            r8 = r2
            android.text.BoringLayout r8 = (android.text.BoringLayout) r8
            int r12 = android.os.Build.VERSION.SDK_INT
            r14 = 33
            if (r12 < r14) goto L19f
            boolean r8 = p000.AbstractC1124.m7341(r8)
            goto L1b0
        L19f:
            r8 = r9
            goto L1b0
        L1a1:
            r14 = 33
            r8 = r2
            android.text.StaticLayout r8 = (android.text.StaticLayout) r8
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r14) goto L1af
            boolean r8 = p000.AbstractC1124.m7342(r8)
            goto L1b0
        L1af:
            r8 = 1
        L1b0:
            if (r8 == 0) goto L1bb
            r23 = 32
            r24 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 1
            goto L217
        L1bb:
            android.text.TextPaint r8 = r2.getPaint()
            java.lang.CharSequence r12 = r2.getText()
            int r6 = r2.getLineStart(r9)
            r23 = 32
            int r7 = r2.getLineEnd(r9)
            android.graphics.Rect r6 = p000.i91.m2684(r8, r12, r6, r7)
            int r7 = r2.getLineAscent(r9)
            r24 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r10 = r6.top
            if (r10 >= r7) goto L1e1
            int r7 = r7 - r10
        L1df:
            r10 = 1
            goto L1e6
        L1e1:
            int r7 = r2.getTopPadding()
            goto L1df
        L1e6:
            if (r1 != r10) goto L1e9
            goto L1f5
        L1e9:
            int r1 = r2.getLineStart(r3)
            int r6 = r2.getLineEnd(r3)
            android.graphics.Rect r6 = p000.i91.m2684(r8, r12, r1, r6)
        L1f5:
            int r1 = r2.getLineDescent(r3)
            int r6 = r6.bottom
            if (r6 <= r1) goto L1ff
            int r6 = r6 - r1
            goto L203
        L1ff:
            int r6 = r2.getBottomPadding()
        L203:
            if (r7 != 0) goto L208
            if (r6 != 0) goto L208
            goto L217
        L208:
            long r16 = p000.n32.m3949(r7, r6)
            goto L217
        L20d:
            r23 = 32
            r24 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 1
            r14 = 33
        L217:
            if (r15 == 0) goto L21b
            r15 = r9
            goto L21e
        L21b:
            long r1 = r16 >> r23
            int r15 = (int) r1
        L21e:
            if (r13 == 0) goto L222
            r1 = r9
            goto L225
        L222:
            long r1 = r16 & r24
            int r1 = (int) r1
        L225:
            long r1 = p000.n32.m3949(r15, r1)
        L229:
            if (r4 == 0) goto L25a
            int r6 = r4.length
            r7 = r9
            r8 = r7
            r15 = r8
        L22f:
            if (r15 >= r6) goto L24e
            r11 = r4[r15]
            int r12 = r11.f12266
            if (r12 >= 0) goto L23f
            int r12 = java.lang.Math.abs(r12)
            int r7 = java.lang.Math.max(r7, r12)
        L23f:
            int r11 = r11.f12267
            if (r11 >= 0) goto L24b
            int r8 = java.lang.Math.abs(r11)
            int r8 = java.lang.Math.max(r7, r8)
        L24b:
            int r15 = r15 + 1
            goto L22f
        L24e:
            if (r7 != 0) goto L255
            if (r8 != 0) goto L255
            long r6 = p000.n32.f7377
            goto L25c
        L255:
            long r6 = p000.n32.m3949(r7, r8)
            goto L25c
        L25a:
            long r6 = p000.n32.f7377
        L25c:
            long r11 = r1 >> r23
            int r4 = (int) r11
            long r11 = r6 >> r23
            int r8 = (int) r11
            int r4 = java.lang.Math.max(r4, r8)
            r0.f5740 = r4
            long r1 = r1 & r24
            int r1 = (int) r1
            long r6 = r6 & r24
            int r2 = (int) r6
            int r1 = java.lang.Math.max(r1, r2)
            r0.f5741 = r1
            android.text.TextPaint r7 = r0.f5734
            xr0[] r1 = r0.f5747
            int r2 = r0.f5739
            int r2 = r2 - r10
            android.text.Layout r4 = r0.f5738
            int r6 = r4.getLineStart(r2)
            int r4 = r4.getLineEnd(r2)
            if (r6 != r4) goto L30e
            if (r1 == 0) goto L30e
            int r4 = r1.length
            if (r4 != 0) goto L28e
            goto L30e
        L28e:
            android.text.SpannableString r6 = new android.text.SpannableString
            java.lang.String r4 = "\u200b"
            r6.<init>(r4)
            java.lang.Object r1 = p000.AbstractC0312g7.m2249(r1)
            xr0 r1 = (p000.xr0) r1
            int r4 = r6.length()
            if (r2 == 0) goto L2a7
            boolean r2 = r1.f12259
            if (r2 == 0) goto L2a7
            r15 = r9
            goto L2a9
        L2a7:
            boolean r15 = r1.f12259
        L2a9:
            xr0 r2 = new xr0
            float r8 = r1.f12256
            boolean r10 = r1.f12259
            float r11 = r1.f12260
            int r1 = r1.f12261
            r28 = r1
            r22 = r2
            r24 = r4
            r23 = r8
            r26 = r10
            r27 = r11
            r25 = r15
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r1 = r22
            int r2 = r6.length()
            r6.setSpan(r1, r9, r2, r14)
            r1 = r9
            int r9 = r6.length()
            boolean r2 = r0.f5736
            android.text.Layout$Alignment r11 = p000.lp0.f6729
            r19 = 0
            r20 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = 0
            r14 = 2147483647(0x7fffffff, float:NaN)
            r15 = 0
            r17 = 0
            r18 = 0
            r16 = r2
            r10 = r5
            android.text.StaticLayout r2 = p000.e81.m1874(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.graphics.Paint$FontMetricsInt r6 = new android.graphics.Paint$FontMetricsInt
            r6.<init>()
            int r4 = r2.getLineAscent(r1)
            r6.ascent = r4
            int r4 = r2.getLineDescent(r1)
            r6.descent = r4
            int r4 = r2.getLineTop(r1)
            r6.top = r4
            int r2 = r2.getLineBottom(r1)
            r6.bottom = r2
            goto L310
        L30e:
            r1 = r9
            r6 = 0
        L310:
            if (r6 == 0) goto L321
            int r1 = r6.bottom
            float r2 = r0.m3151(r3)
            float r4 = r0.m3153(r3)
            float r2 = r2 - r4
            int r2 = (int) r2
            int r15 = r1 - r2
            goto L322
        L321:
            r15 = r1
        L322:
            r0.f5746 = r15
            r0.f5745 = r6
            android.text.Layout r1 = r0.f5738
            android.text.TextPaint r2 = r1.getPaint()
            float r1 = p000.kn0.m3379(r1, r3, r2)
            r0.f5742 = r1
            android.text.Layout r1 = r0.f5738
            android.text.TextPaint r2 = r1.getPaint()
            float r1 = p000.kn0.m3380(r1, r3, r2)
            r0.f5743 = r1
            return
        L33f:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
    }

    /* JADX INFO: renamed from: α */
    public final int m3148() {
            r2 = this;
            boolean r0 = r2.f5737
            android.text.Layout r1 = r2.f5738
            if (r0 == 0) goto Lf
            int r0 = r2.f5739
            int r0 = r0 + (-1)
            int r0 = r1.getLineBottom(r0)
            goto L13
        Lf:
            int r0 = r1.getHeight()
        L13:
            int r1 = r2.f5740
            int r0 = r0 + r1
            int r1 = r2.f5741
            int r0 = r0 + r1
            int r2 = r2.f5746
            int r0 = r0 + r2
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final p000.C0068b8 m3149() {
            r7 = this;
            b8 r0 = r7.f5749
            if (r0 != 0) goto L75
            b8 r1 = new b8
            r1.<init>()
            android.text.Layout r0 = r7.f5738
            r1.f1555 = r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r0 = r3
        L14:
            java.lang.Object r4 = r1.f1555
            android.text.Layout r4 = (android.text.Layout) r4
            java.lang.CharSequence r4 = r4.getText()
            r5 = 10
            r6 = 4
            int r0 = p000.q02.m4668(r4, r5, r0, r6)
            if (r0 >= 0) goto L32
            java.lang.Object r0 = r1.f1555
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.CharSequence r0 = r0.getText()
            int r0 = r0.length()
            goto L34
        L32:
            int r0 = r0 + 1
        L34:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r2.add(r4)
            java.lang.Object r4 = r1.f1555
            android.text.Layout r4 = (android.text.Layout) r4
            java.lang.CharSequence r4 = r4.getText()
            int r4 = r4.length()
            if (r0 < r4) goto L14
            r1.f1556 = r2
            int r0 = r2.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
        L54:
            if (r3 >= r0) goto L5d
            r4 = 0
            r2.add(r4)
            int r3 = r3 + 1
            goto L54
        L5d:
            r1.f1557 = r2
            java.lang.Object r0 = r1.f1556
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            boolean[] r0 = new boolean[r0]
            r1.f1558 = r0
            java.lang.Object r0 = r1.f1556
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.size()
            r7.f5749 = r1
            return r1
        L75:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final float m3150(int r3) {
            r2 = this;
            int r0 = r2.f5740
            float r0 = (float) r0
            int r1 = r2.f5739
            int r1 = r1 + (-1)
            if (r3 != r1) goto L16
            android.graphics.Paint$FontMetricsInt r1 = r2.f5745
            if (r1 == 0) goto L16
            float r2 = r2.m3153(r3)
            int r3 = r1.ascent
            float r3 = (float) r3
            float r2 = r2 - r3
            goto L1d
        L16:
            android.text.Layout r2 = r2.f5738
            int r2 = r2.getLineBaseline(r3)
            float r2 = (float) r2
        L1d:
            float r0 = r0 + r2
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final float m3151(int r4) {
            r3 = this;
            int r0 = r3.f5739
            int r1 = r0 + (-1)
            android.text.Layout r2 = r3.f5738
            if (r4 != r1) goto L18
            android.graphics.Paint$FontMetricsInt r1 = r3.f5745
            if (r1 == 0) goto L18
            int r4 = r4 + (-1)
            int r3 = r2.getLineBottom(r4)
            float r3 = (float) r3
            int r4 = r1.bottom
            float r4 = (float) r4
            float r3 = r3 + r4
            return r3
        L18:
            int r1 = r3.f5740
            float r1 = (float) r1
            int r2 = r2.getLineBottom(r4)
            float r2 = (float) r2
            float r1 = r1 + r2
            int r0 = r0 + (-1)
            if (r4 != r0) goto L28
            int r3 = r3.f5741
            goto L29
        L28:
            r3 = 0
        L29:
            float r3 = (float) r3
            float r1 = r1 + r3
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public final int m3152(int r3) {
            r2 = this;
            java.lang.ThreadLocal r0 = p000.n32.f7376
            android.text.Layout r0 = r2.f5738
            int r1 = r0.getEllipsisCount(r3)
            if (r1 <= 0) goto L19
            android.text.TextUtils$TruncateAt r2 = r2.f5735
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            if (r2 != r1) goto L19
            java.lang.CharSequence r2 = r0.getText()
            int r2 = r2.length()
            return r2
        L19:
            int r2 = r0.getLineEnd(r3)
            return r2
    }

    /* JADX INFO: renamed from: ζ */
    public final float m3153(int r2) {
            r1 = this;
            android.text.Layout r0 = r1.f5738
            int r0 = r0.getLineTop(r2)
            float r0 = (float) r0
            if (r2 != 0) goto Lb
            r1 = 0
            goto Ld
        Lb:
            int r1 = r1.f5740
        Ld:
            float r1 = (float) r1
            float r0 = r0 + r1
            return r0
    }

    /* JADX INFO: renamed from: η */
    public final float m3154(int r3, boolean r4) {
            r2 = this;
            b8 r0 = r2.m3149()
            r1 = 1
            float r4 = r0.m813(r3, r1, r4)
            android.text.Layout r0 = r2.f5738
            int r3 = r0.getLineForOffset(r3)
            int r0 = r2.f5739
            int r0 = r0 - r1
            if (r3 != r0) goto L1a
            float r3 = r2.f5742
            float r2 = r2.f5743
            float r3 = r3 + r2
            goto L1b
        L1a:
            r3 = 0
        L1b:
            float r3 = r3 + r4
            return r3
    }

    /* JADX INFO: renamed from: θ */
    public final float m3155(int r3, boolean r4) {
            r2 = this;
            b8 r0 = r2.m3149()
            r1 = 0
            float r4 = r0.m813(r3, r1, r4)
            android.text.Layout r0 = r2.f5738
            int r3 = r0.getLineForOffset(r3)
            int r0 = r2.f5739
            int r0 = r0 + (-1)
            if (r3 != r0) goto L1b
            float r3 = r2.f5742
            float r2 = r2.f5743
            float r3 = r3 + r2
            goto L1c
        L1b:
            r3 = 0
        L1c:
            float r3 = r3 + r4
            return r3
    }
}
