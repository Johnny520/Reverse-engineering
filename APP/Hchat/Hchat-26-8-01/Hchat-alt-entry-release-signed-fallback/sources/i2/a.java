package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2.d f6245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j2.k f6248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.CharSequence f6249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Object f6250f;

    public a(q2.d r21, int r22, int r23, long r24) {
            r20 = this;
            r0 = r20
            r10 = r21
            r4 = r22
            r11 = r23
            r0.<init>()
            r0.f6245a = r10
            r0.f6246b = r4
            r12 = r24
            r0.f6247c = r12
            int r1 = u2.a.i(r12)
            if (r1 != 0) goto L20
            int r1 = u2.a.j(r12)
            if (r1 != 0) goto L20
            goto L25
        L20:
            java.lang.String r1 = "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."
            o2.a.a(r1)
        L25:
            r14 = 1
            if (r4 < r14) goto L29
            goto L2e
        L29:
            java.lang.String r1 = "maxLines should be greater than 0"
            o2.a.a(r1)
        L2e:
            i2.n0 r1 = r10.f10606b
            java.lang.CharSequence r2 = r10.f10612h
            r3 = 5
            r5 = 4
            r6 = 2
            if (r11 != r6) goto L96
            i2.f0 r8 = r1.f6365a
            long r8 = r8.f6305h
            r17 = 0
            long r6 = x6.d.D(r17)
            boolean r6 = u2.o.a(r8, r6)
            if (r6 != 0) goto L94
            i2.f0 r6 = r1.f6365a
            long r6 = r6.f6305h
            long r8 = u2.o.f13359c
            boolean r6 = u2.o.a(r6, r8)
            if (r6 != 0) goto L94
            i2.u r6 = r1.f6366b
            int r6 = r6.f6391a
            if (r6 != 0) goto L5a
            goto L94
        L5a:
            if (r6 != r3) goto L5d
            goto L94
        L5d:
            if (r6 != r5) goto L60
            goto L94
        L60:
            int r6 = r2.length()
            if (r6 != 0) goto L67
            goto L94
        L67:
            boolean r6 = r2 instanceof android.text.Spannable
            if (r6 == 0) goto L6f
            r6 = r2
            android.text.Spannable r6 = (android.text.Spannable) r6
            goto L70
        L6f:
            r6 = 0
        L70:
            if (r6 != 0) goto L77
            android.text.SpannableString r6 = new android.text.SpannableString
            r6.<init>(r2)
        L77:
            r2 = r6
            java.lang.Class<l2.c> r6 = l2.c.class
            boolean r6 = j2.g.f(r2, r6)
            if (r6 != 0) goto L94
            l2.c r6 = new l2.c
            r6.<init>()
            int r7 = r2.length()
            int r7 = r7 - r14
            int r8 = r2.length()
            int r8 = r8 - r14
            r9 = 33
            r2.setSpan(r6, r7, r8, r9)
        L94:
            r9 = r2
            goto L99
        L96:
            r17 = 0
            goto L94
        L99:
            r0.f6249e = r9
            i2.u r2 = r1.f6366b
            i2.f0 r1 = r1.f6365a
            int r6 = r2.f6391a
            r7 = 3
            if (r6 != r14) goto La6
            r8 = r7
            goto Lb9
        La6:
            r8 = 2
            if (r6 != r8) goto Lab
            r8 = r5
            goto Lb9
        Lab:
            if (r6 != r7) goto Laf
            r8 = 2
            goto Lb9
        Laf:
            if (r6 != r3) goto Lb2
            goto Lb7
        Lb2:
            r8 = 6
            if (r6 != r8) goto Lb7
            r8 = r14
            goto Lb9
        Lb7:
            r8 = r17
        Lb9:
            if (r6 != r5) goto Lbd
            r6 = r14
            goto Lbf
        Lbd:
            r6 = r17
        Lbf:
            int r15 = r2.f6398h
            r3 = 32
            r5 = 2
            if (r15 != r5) goto Lce
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 > r3) goto Lcc
            r15 = r5
            goto Ld0
        Lcc:
            r15 = 4
            goto Ld0
        Lce:
            r15 = r17
        Ld0:
            int r2 = r2.f6397g
            r3 = r2 & 255(0xff, float:3.57E-43)
            if (r3 != r14) goto Ld7
            goto Le3
        Ld7:
            if (r3 != r5) goto Ldd
            r3 = r2
            r2 = r6
            r6 = r14
            goto Le7
        Ldd:
            if (r3 != r7) goto Le3
            r3 = r2
            r2 = r6
            r6 = 2
            goto Le7
        Le3:
            r3 = r2
            r2 = r6
            r6 = r17
        Le7:
            int r5 = r3 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            if (r5 != r14) goto Lee
            goto Lfe
        Lee:
            r14 = 2
            if (r5 != r14) goto Lf4
            r5 = r7
            r7 = 1
            goto L101
        Lf4:
            if (r5 != r7) goto Lf9
            r5 = r7
            r7 = 2
            goto L101
        Lf9:
            r14 = 4
            if (r5 != r14) goto Lfe
            r5 = r7
            goto L101
        Lfe:
            r5 = r7
            r7 = r17
        L101:
            int r3 = r3 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            r14 = 1
            if (r3 != r14) goto L10a
            r14 = 2
            goto L111
        L10a:
            r14 = 2
            if (r3 != r14) goto L111
            r3 = r1
            r1 = r8
            r8 = 1
            goto L115
        L111:
            r3 = r1
            r1 = r8
            r8 = r17
        L115:
            if (r11 != r14) goto L120
            android.text.TextUtils$TruncateAt r16 = android.text.TextUtils.TruncateAt.END
        L119:
            r5 = r15
            r18 = 32
            r15 = r3
            r3 = r16
            goto L131
        L120:
            r5 = 5
            if (r11 != r5) goto L126
            android.text.TextUtils$TruncateAt r16 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L119
        L126:
            r5 = 4
            if (r11 != r5) goto L12c
            android.text.TextUtils$TruncateAt r16 = android.text.TextUtils.TruncateAt.START
            goto L119
        L12c:
            r5 = r15
            r18 = 32
            r15 = r3
            r3 = 0
        L131:
            j2.k r14 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            android.text.Layout r0 = r14.f6700f
            int r4 = android.os.Build.VERSION.SDK_INT
            r16 = r1
            r1 = 35
            if (r4 >= r1) goto L14a
            q2.f r1 = r10.f10611g
            float r1 = r1.getLetterSpacing()
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L152
        L14a:
            r0 = r20
            r4 = r22
            r1 = r16
            r10 = 2
            goto L192
        L152:
            r1 = 4
            if (r11 != r1) goto L157
        L155:
            r1 = 0
            goto L15b
        L157:
            r1 = 5
            if (r11 != r1) goto L14a
            goto L155
        L15b:
            int r4 = r0.getEllipsisCount(r1)
            if (r4 <= 0) goto L14a
            int r4 = r0.getEllipsisStart(r1)
            int r0 = r0.getEllipsisCount(r1)
            int r0 = r0 + r4
            java.lang.CharSequence r4 = r9.subSequence(r1, r4)
            int r10 = r9.length()
            java.lang.CharSequence r0 = r9.subSequence(r0, r10)
            r9 = 3
            java.lang.CharSequence[] r9 = new java.lang.CharSequence[r9]
            r9[r1] = r4
            java.lang.String r1 = "…"
            r19 = 1
            r9[r19] = r1
            r10 = 2
            r9[r10] = r0
            java.lang.CharSequence r9 = android.text.TextUtils.concat(r9)
            r0 = r20
            r4 = r22
            r1 = r16
            j2.k r14 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L192:
            int r9 = r14.f6701g
            if (r11 != r10) goto L1cd
            int r10 = r14.a()
            int r11 = u2.a.g(r12)
            if (r10 <= r11) goto L1cd
            r10 = 1
            if (r4 <= r10) goto L1cd
            int r4 = u2.a.g(r12)
            r10 = 0
        L1a8:
            if (r10 >= r9) goto L1b7
            float r11 = r14.e(r10)
            float r12 = (float) r4
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L1b4
            goto L1b8
        L1b4:
            int r10 = r10 + 1
            goto L1a8
        L1b7:
            r10 = r9
        L1b8:
            if (r10 < 0) goto L1ca
            int r4 = r0.f6246b
            if (r10 == r4) goto L1ca
            r4 = 1
            if (r10 >= r4) goto L1c3
            r4 = 1
            goto L1c4
        L1c3:
            r4 = r10
        L1c4:
            java.lang.CharSequence r9 = r0.f6249e
            j2.k r14 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L1ca:
            r0.f6248d = r14
            goto L1cf
        L1cd:
            r0.f6248d = r14
        L1cf:
            q2.d r1 = r0.f6245a
            q2.f r1 = r1.f10611g
            t2.o r2 = r15.f6298a
            f1.s r2 = r2.c()
            float r3 = r0.d()
            float r4 = r0.b()
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r5 = (long) r3
            int r3 = java.lang.Float.floatToRawIntBits(r4)
            long r3 = (long) r3
            long r5 = r5 << r18
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r7
            long r3 = r3 | r5
            t2.o r5 = r15.f6298a
            float r5 = r5.a()
            r1.c(r2, r3, r5)
            j2.k r1 = r0.f6248d
            android.text.Layout r1 = r1.f6700f
            java.lang.CharSequence r2 = r1.getText()
            boolean r2 = r2 instanceof android.text.Spanned
            if (r2 != 0) goto L20b
        L209:
            r1 = 0
            goto L23d
        L20b:
            java.lang.CharSequence r2 = r1.getText()
            r2.getClass()
            android.text.Spanned r2 = (android.text.Spanned) r2
            r3 = -1
            int r4 = r2.length()
            java.lang.Class<s2.b> r5 = s2.b.class
            int r3 = r2.nextSpanTransition(r3, r4, r5)
            int r2 = r2.length()
            if (r3 == r2) goto L209
            java.lang.CharSequence r2 = r1.getText()
            r2.getClass()
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.CharSequence r1 = r1.getText()
            int r1 = r1.length()
            r3 = 0
            java.lang.Object[] r1 = r2.getSpans(r3, r1, r5)
            s2.b[] r1 = (s2.b[]) r1
        L23d:
            if (r1 == 0) goto L268
            int r2 = r1.length
            r3 = 0
        L241:
            if (r3 >= r2) goto L268
            r4 = r1[r3]
            float r5 = r0.d()
            float r6 = r0.b()
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r9 = (long) r5
            int r5 = java.lang.Float.floatToRawIntBits(r6)
            long r5 = (long) r5
            long r9 = r9 << r18
            long r5 = r5 & r7
            long r5 = r5 | r9
            i0.j1 r4 = r4.f12333i
            e1.e r9 = new e1.e
            r9.<init>(r5)
            r4.setValue(r9)
            int r3 = r3 + 1
            goto L241
        L268:
            java.lang.CharSequence r1 = r0.f6249e
            boolean r2 = r1 instanceof android.text.Spanned
            if (r2 != 0) goto L272
            tf.t r1 = tf.t.f13167g
            goto L34f
        L272:
            r2 = r1
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r1 = r1.length()
            java.lang.Class<l2.i> r3 = l2.i.class
            r4 = 0
            java.lang.Object[] r1 = r2.getSpans(r4, r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r1.length
            r3.<init>(r4)
            int r4 = r1.length
            r7 = 0
        L288:
            if (r7 >= r4) goto L34e
            r5 = r1[r7]
            l2.i r5 = (l2.i) r5
            int r6 = r2.getSpanStart(r5)
            int r8 = r2.getSpanEnd(r5)
            j2.k r9 = r0.f6248d
            android.text.Layout r9 = r9.f6700f
            int r9 = r9.getLineForOffset(r6)
            int r10 = r0.f6246b
            if (r9 < r10) goto L2a4
            r10 = 1
            goto L2a5
        L2a4:
            r10 = 0
        L2a5:
            j2.k r11 = r0.f6248d
            android.text.Layout r11 = r11.f6700f
            int r11 = r11.getEllipsisCount(r9)
            if (r11 <= 0) goto L2c4
            j2.k r11 = r0.f6248d
            android.text.Layout r11 = r11.f6700f
            int r11 = r11.getLineStart(r9)
            j2.k r12 = r0.f6248d
            android.text.Layout r12 = r12.f6700f
            int r12 = r12.getEllipsisStart(r9)
            int r12 = r12 + r11
            if (r8 <= r12) goto L2c4
            r11 = 1
            goto L2c5
        L2c4:
            r11 = 0
        L2c5:
            j2.k r12 = r0.f6248d
            int r12 = r12.f(r9)
            if (r8 <= r12) goto L2cf
            r8 = 1
            goto L2d0
        L2cf:
            r8 = 0
        L2d0:
            if (r11 != 0) goto L2d6
            if (r8 != 0) goto L2d6
            if (r10 == 0) goto L2da
        L2d6:
            r10 = 1
            r12 = 0
            goto L346
        L2da:
            j2.k r8 = r0.f6248d
            android.text.Layout r8 = r8.f6700f
            int r8 = r8.getParagraphDirection(r9)
            r10 = 1
            if (r8 != r10) goto L2e7
            r8 = r10
            goto L2e8
        L2e7:
            r8 = 0
        L2e8:
            j2.k r11 = r0.f6248d
            android.text.Layout r11 = r11.f6700f
            boolean r11 = r11.isRtlCharAt(r6)
            if (r8 == 0) goto L302
            if (r11 != 0) goto L302
            j2.k r8 = r0.f6248d
            r12 = 0
            float r6 = r8.h(r6, r12)
            int r8 = r5.c()
        L2ff:
            float r8 = (float) r8
            float r8 = r8 + r6
            goto L32b
        L302:
            r12 = 0
            if (r8 == 0) goto L315
            if (r11 == 0) goto L315
            j2.k r8 = r0.f6248d
            float r8 = r8.i(r6, r12)
            int r6 = r5.c()
        L311:
            float r6 = (float) r6
            float r6 = r8 - r6
            goto L32b
        L315:
            j2.k r8 = r0.f6248d
            if (r11 == 0) goto L322
            float r8 = r8.h(r6, r12)
            int r6 = r5.c()
            goto L311
        L322:
            float r6 = r8.i(r6, r12)
            int r8 = r5.c()
            goto L2ff
        L32b:
            j2.k r11 = r0.f6248d
            r5.getClass()
            float r9 = r11.d(r9)
            int r11 = r5.b()
            float r11 = (float) r11
            float r9 = r9 - r11
            int r5 = r5.b()
            float r5 = (float) r5
            float r5 = r5 + r9
            e1.c r11 = new e1.c
            r11.<init>(r6, r9, r8, r5)
            goto L347
        L346:
            r11 = 0
        L347:
            r3.add(r11)
            int r7 = r7 + 1
            goto L288
        L34e:
            r1 = r3
        L34f:
            r0.f6250f = r1
            return
    }

    public final j2.k a(int r17, int r18, android.text.TextUtils.TruncateAt r19, int r20, int r21, int r22, int r23, int r24, java.lang.CharSequence r25) {
            r16 = this;
            float r2 = r16.d()
            r15 = r16
            q2.d r0 = r15.f6245a
            q2.f r3 = r0.f10611g
            int r6 = r0.f10616l
            j2.f r14 = r0.f10613i
            i2.n0 r0 = r0.f10606b
            q2.a r1 = q2.b.f10602a
            i2.x r0 = r0.f6367c
            if (r0 == 0) goto L1e
            i2.w r0 = r0.f6404a
            if (r0 == 0) goto L1e
            boolean r0 = r0.f6402a
        L1c:
            r7 = r0
            goto L20
        L1e:
            r0 = 0
            goto L1c
        L20:
            j2.k r0 = new j2.k
            r4 = r17
            r13 = r18
            r5 = r19
            r8 = r20
            r12 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r1 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
    }

    public final float b() {
            r1 = this;
            j2.k r0 = r1.f6248d
            int r0 = r0.a()
            float r0 = (float) r0
            return r0
    }

    public final long c(e1.c r12, int r13, g1.d r14) {
            r11 = this;
            android.graphics.RectF r4 = f1.c0.u(r12)
            r12 = 1
            r8 = 0
            if (r13 != 0) goto L9
            goto Ld
        L9:
            if (r13 != r12) goto Ld
            r13 = r12
            goto Le
        Ld:
            r13 = r8
        Le:
            b0.t r6 = new b0.t
            r0 = 14
            r6.<init>(r14, r0)
            j2.k r0 = r11.f6248d
            android.text.TextPaint r14 = r0.f6695a
            android.text.Layout r1 = r0.f6700f
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r2 < r3) goto L52
            if (r13 != r12) goto L38
            b.e r13 = new b.e
            java.lang.CharSequence r14 = r1.getText()
            c8.a r0 = r0.j()
            r2 = 16
            r13.<init>(r14, r2, r0)
            k2.a r14 = new k2.a
            r14.<init>(r13)
            goto L47
        L38:
            f0.k.q()
            java.lang.CharSequence r13 = r1.getText()
            android.text.GraphemeClusterSegmentFinder r13 = f0.k.m(r13, r14)
            android.text.SegmentFinder r14 = f0.k.n(r13)
        L47:
            j2.a r13 = new j2.a
            r13.<init>(r6)
            int[] r13 = f0.k.r(r1, r4, r14, r13)
            goto Le7
        L52:
            r3 = r2
            be.k r2 = r0.c()
            if (r13 != r12) goto L6a
            b.e r13 = new b.e
            java.lang.CharSequence r14 = r1.getText()
            c8.a r3 = r0.j()
            r5 = 16
            r13.<init>(r14, r5, r3)
        L68:
            r5 = r13
            goto L80
        L6a:
            java.lang.CharSequence r13 = r1.getText()
            r5 = 29
            if (r3 < r5) goto L79
            k2.b r3 = new k2.b
            r3.<init>(r13, r14)
            r13 = r3
            goto L68
        L79:
            k2.c r14 = new k2.c
            r14.<init>(r13)
            r13 = r14
            goto L68
        L80:
            float r13 = r4.top
            int r13 = (int) r13
            int r13 = r1.getLineForVertical(r13)
            float r14 = r4.top
            float r3 = r0.e(r13)
            int r14 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r14 <= 0) goto L98
            int r13 = r13 + 1
            int r14 = r0.f6701g
            if (r13 < r14) goto L98
            goto Ld7
        L98:
            r3 = r13
            float r13 = r4.bottom
            int r13 = (int) r13
            int r13 = r1.getLineForVertical(r13)
            if (r13 != 0) goto Lad
            float r14 = r4.bottom
            float r7 = r0.g(r8)
            int r14 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r14 >= 0) goto Lad
            goto Ld7
        Lad:
            r7 = 1
            int r14 = j2.g.e(r0, r1, r2, r3, r4, r5, r6, r7)
        Lb2:
            r9 = r3
            r10 = -1
            if (r14 != r10) goto Lc0
            if (r9 >= r13) goto Lc0
            int r3 = r9 + 1
            r7 = 1
            int r14 = j2.g.e(r0, r1, r2, r3, r4, r5, r6, r7)
            goto Lb2
        Lc0:
            if (r14 != r10) goto Lc3
            goto Ld7
        Lc3:
            r7 = 0
            r3 = r13
            int r13 = j2.g.e(r0, r1, r2, r3, r4, r5, r6, r7)
        Lc9:
            if (r13 != r10) goto Ld5
            if (r9 >= r3) goto Ld5
            int r3 = r3 + (-1)
            r7 = 0
            int r13 = j2.g.e(r0, r1, r2, r3, r4, r5, r6, r7)
            goto Lc9
        Ld5:
            if (r13 != r10) goto Ld9
        Ld7:
            r13 = 0
            goto Le7
        Ld9:
            int r14 = r14 + r12
            int r14 = r5.g(r14)
            int r13 = r13 - r12
            int r13 = r5.h(r13)
            int[] r13 = new int[]{r14, r13}
        Le7:
            if (r13 != 0) goto Lec
            long r12 = i2.m0.f6358b
            return r12
        Lec:
            r14 = r13[r8]
            r12 = r13[r12]
            long r12 = i2.e0.b(r14, r12)
            return r12
    }

    public final float d() {
            r2 = this;
            long r0 = r2.f6247c
            int r0 = u2.a.h(r0)
            float r0 = (float) r0
            return r0
    }

    public final void e(f1.u r7) {
            r6 = this;
            android.graphics.Canvas r7 = f1.c.a(r7)
            j2.k r0 = r6.f6248d
            boolean r1 = r0.f6698d
            r2 = 0
            if (r1 == 0) goto L19
            r7.save()
            float r1 = r6.d()
            float r3 = r6.b()
            r7.clipRect(r2, r2, r1, r3)
        L19:
            int r1 = r0.f6702h
            android.graphics.Rect r3 = r0.f6710p
            boolean r3 = r7.getClipBounds(r3)
            if (r3 != 0) goto L24
            goto L4f
        L24:
            if (r1 == 0) goto L2a
            float r3 = (float) r1
            r7.translate(r2, r3)
        L2a:
            java.lang.ThreadLocal r3 = j2.l.f6712a
            java.lang.Object r4 = r3.get()
            if (r4 != 0) goto L3a
            j2.j r4 = new j2.j
            r4.<init>()
            r3.set(r4)
        L3a:
            j2.j r4 = (j2.j) r4
            r4.f6694a = r7
            r3 = 0
            android.text.Layout r5 = r0.f6700f     // Catch: java.lang.Throwable -> L57
            r5.draw(r4)     // Catch: java.lang.Throwable -> L57
            r4.f6694a = r3
            if (r1 == 0) goto L4f
            r3 = -1
            float r3 = (float) r3
            float r1 = (float) r1
            float r3 = r3 * r1
            r7.translate(r2, r3)
        L4f:
            boolean r0 = r0.f6698d
            if (r0 == 0) goto L56
            r7.restore()
        L56:
            return
        L57:
            r7 = move-exception
            r4.f6694a = r3
            throw r7
    }

    public final void f(f1.u r3, long r4, f1.q0 r6, t2.l r7, h1.c r8) {
            r2 = this;
            q2.d r0 = r2.f6245a
            q2.f r0 = r0.f10611g
            int r1 = r0.f10622c
            r0.d(r4)
            r0.f(r6)
            r0.g(r7)
            r0.e(r8)
            r4 = 3
            r0.b(r4)
            r2.e(r3)
            r0.b(r1)
            return
    }

    public final void g(f1.u r9, f1.s r10, float r11, f1.q0 r12, t2.l r13, h1.c r14) {
            r8 = this;
            q2.d r0 = r8.f6245a
            q2.f r0 = r0.f10611g
            int r1 = r0.f10622c
            float r2 = r8.d()
            float r3 = r8.b()
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r4 = (long) r2
            int r2 = java.lang.Float.floatToRawIntBits(r3)
            long r2 = (long) r2
            r6 = 32
            long r4 = r4 << r6
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r6
            long r2 = r2 | r4
            r0.c(r10, r2, r11)
            r0.f(r12)
            r0.g(r13)
            r0.e(r14)
            r10 = 3
            r0.b(r10)
            r8.e(r9)
            r0.b(r1)
            return
    }
}
