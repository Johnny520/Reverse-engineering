package j2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.text.TextPaint f6695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.text.TextUtils.TruncateAt f6696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c8.a f6699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final android.text.Layout f6700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6703i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f6704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f6705k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f6706l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint.FontMetricsInt f6707m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6708n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l2.h[] f6709o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final android.graphics.Rect f6710p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public be.k f6711q;

    public k(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, boolean r28, int r29, int r30, int r31, int r32, int r33, int r34, j2.f r35) {
            r21 = this;
            r1 = r21
            r2 = r22
            r0 = r23
            r3 = r25
            r7 = r28
            r1.<init>()
            r4 = r24
            r1.f6695a = r4
            r8 = r26
            r1.f6696b = r8
            r1.f6697c = r7
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r1.f6710p = r5
            int r5 = r2.length()
            android.text.TextDirectionHeuristic r13 = j2.l.b(r27)
            android.text.Layout$Alignment r6 = j2.i.f6692a
            r14 = 1
            r15 = 2
            if (r3 == 0) goto L46
            if (r3 == r14) goto L43
            if (r3 == r15) goto L40
            r6 = 3
            if (r3 == r6) goto L3d
            r6 = 4
            if (r3 == r6) goto L3a
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
        L38:
            r6 = r3
            goto L49
        L3a:
            android.text.Layout$Alignment r3 = j2.i.f6693b
            goto L38
        L3d:
            android.text.Layout$Alignment r3 = j2.i.f6692a
            goto L38
        L40:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L38
        L43:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L38
        L46:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L38
        L49:
            boolean r3 = r2 instanceof android.text.Spanned
            if (r3 == 0) goto L5b
            r3 = r2
            android.text.Spanned r3 = (android.text.Spanned) r3
            r9 = -1
            java.lang.Class<l2.a> r11 = l2.a.class
            int r3 = r3.nextSpanTransition(r9, r5, r11)
            if (r3 >= r5) goto L5b
            r3 = r14
            goto L5c
        L5b:
            r3 = 0
        L5c:
            java.lang.String r5 = "TextLayout:initLayout"
            android.os.Trace.beginSection(r5)
            android.text.BoringLayout$Metrics r9 = r35.a()     // Catch: java.lang.Throwable -> Lbb
            double r11 = (double) r0     // Catch: java.lang.Throwable -> Lbb
            r16 = r11
            double r10 = java.lang.Math.ceil(r16)     // Catch: java.lang.Throwable -> Lbb
            float r5 = (float) r10     // Catch: java.lang.Throwable -> Lbb
            int r5 = (int) r5     // Catch: java.lang.Throwable -> Lbb
            r10 = 33
            if (r9 == 0) goto Lbe
            float r11 = r35.c()     // Catch: java.lang.Throwable -> Lbb
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 > 0) goto Lbe
            if (r3 != 0) goto Lbe
            r1.f6706l = r14     // Catch: java.lang.Throwable -> Lbb
            if (r5 < 0) goto L81
            goto L86
        L81:
            java.lang.String r0 = "negative width"
            o2.a.a(r0)     // Catch: java.lang.Throwable -> Lbb
        L86:
            if (r5 < 0) goto L89
            goto L8e
        L89:
            java.lang.String r0 = "negative ellipsized width"
            o2.a.a(r0)     // Catch: java.lang.Throwable -> Lbb
        L8e:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lbb
            if (r0 < r10) goto L9f
            r4 = r5
            r5 = r6
            r6 = r9
            r9 = r4
            r3 = r24
            android.text.BoringLayout r0 = ai.a.j(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lbb
            r2 = r0
            r0 = 0
            goto Lb7
        L9f:
            r4 = r5
            r5 = r6
            r6 = r9
            android.text.BoringLayout r2 = new android.text.BoringLayout     // Catch: java.lang.Throwable -> Lbb
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r12 = r4
            r3 = r22
            r11 = r26
            r10 = r28
            r9 = r6
            r0 = 0
            r6 = r5
            r5 = r4
            r4 = r24
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lbb
        Lb7:
            r8 = r29
            r6 = r13
            goto Le9
        Lbb:
            r0 = move-exception
            goto L359
        Lbe:
            r4 = r5
            r5 = r6
            r0 = 0
            r1.f6706l = r0     // Catch: java.lang.Throwable -> Lbb
            r6 = r5
            int r5 = r22.length()     // Catch: java.lang.Throwable -> Lbb
            double r2 = java.lang.Math.ceil(r16)     // Catch: java.lang.Throwable -> Lbb
            float r2 = (float) r2     // Catch: java.lang.Throwable -> Lbb
            int r10 = (int) r2     // Catch: java.lang.Throwable -> Lbb
            r2 = r22
            r3 = r24
            r9 = r26
            r12 = r28
            r8 = r29
            r14 = r31
            r15 = r32
            r16 = r33
            r11 = r34
            r7 = r6
            r6 = r13
            r13 = r30
            android.text.StaticLayout r3 = j2.g.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> Lbb
            r2 = r3
        Le9:
            r1.f6700f = r2     // Catch: java.lang.Throwable -> Lbb
            android.os.Trace.endSection()
            int r3 = r2.getLineCount()
            int r3 = java.lang.Math.min(r3, r8)
            r1.f6701g = r3
            int r4 = r3 + (-1)
            if (r3 >= r8) goto Lfe
        Lfc:
            r14 = r0
            goto L10f
        Lfe:
            int r5 = r2.getEllipsisCount(r4)
            if (r5 > 0) goto L10e
            int r5 = r2.getLineEnd(r4)
            int r7 = r22.length()
            if (r5 == r7) goto Lfc
        L10e:
            r14 = 1
        L10f:
            r1.f6698d = r14
            java.lang.CharSequence r5 = r2.getText()
            boolean r5 = r5 instanceof android.text.Spanned
            if (r5 != 0) goto L11a
            goto L135
        L11a:
            java.lang.CharSequence r5 = r2.getText()
            r5.getClass()
            android.text.Spanned r5 = (android.text.Spanned) r5
            java.lang.Class<l2.h> r8 = l2.h.class
            boolean r5 = j2.g.f(r5, r8)
            if (r5 != 0) goto L137
            java.lang.CharSequence r5 = r2.getText()
            int r5 = r5.length()
            if (r5 <= 0) goto L137
        L135:
            r5 = 0
            goto L14e
        L137:
            java.lang.CharSequence r5 = r2.getText()
            r5.getClass()
            android.text.Spanned r5 = (android.text.Spanned) r5
            java.lang.CharSequence r9 = r2.getText()
            int r9 = r9.length()
            java.lang.Object[] r5 = r5.getSpans(r0, r9, r8)
            l2.h[] r5 = (l2.h[]) r5
        L14e:
            r1.f6709o = r5
            if (r5 == 0) goto L169
            java.lang.Object r8 = tf.l.z0(r5)
            l2.h r8 = (l2.h) r8
            if (r8 == 0) goto L169
            boolean r9 = r8.f7762i
            if (r9 == 0) goto L165
            int r8 = r8.f7765l
            r9 = 2
            if (r8 != r9) goto L166
            r14 = 1
            goto L167
        L165:
            r9 = 2
        L166:
            r14 = r0
        L167:
            r10 = r14
            goto L16b
        L169:
            r9 = 2
            r10 = r0
        L16b:
            if (r5 == 0) goto L17f
            java.lang.Object r8 = tf.l.z0(r5)
            l2.h r8 = (l2.h) r8
            if (r8 == 0) goto L17f
            boolean r11 = r8.f7763j
            if (r11 == 0) goto L17f
            int r8 = r8.f7765l
            if (r8 != r9) goto L17f
            r14 = 1
            goto L180
        L17f:
            r14 = r0
        L180:
            if (r10 == 0) goto L194
            if (r14 == 0) goto L194
            long r2 = j2.l.f6713b
            r22 = 0
            r23 = 32
            r24 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r7 = 33
            r12 = 1
            goto L23e
        L194:
            long r15 = j2.l.f6713b
            if (r28 != 0) goto L220
            boolean r9 = r1.f6706l
            if (r9 == 0) goto L1ae
            r9 = r2
            android.text.BoringLayout r9 = (android.text.BoringLayout) r9
            int r13 = android.os.Build.VERSION.SDK_INT
            r22 = 0
            r7 = 33
            if (r13 < r7) goto L1ac
            boolean r9 = ai.a.z(r9)
            goto L1c3
        L1ac:
            r9 = r0
            goto L1c3
        L1ae:
            r22 = 0
            r7 = 33
            r9 = r2
            android.text.StaticLayout r9 = (android.text.StaticLayout) r9
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r7) goto L1be
            boolean r9 = ai.a.A(r9)
            goto L1c3
        L1be:
            r9 = 28
            if (r13 < r9) goto L1ac
            r9 = 1
        L1c3:
            if (r9 == 0) goto L1ce
            r23 = 32
            r24 = 4294967295(0xffffffff, double:2.1219957905E-314)
        L1cc:
            r12 = 1
            goto L22c
        L1ce:
            android.text.TextPaint r9 = r2.getPaint()
            java.lang.CharSequence r13 = r2.getText()
            r23 = 32
            int r8 = r2.getLineStart(r0)
            r24 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r11 = r2.getLineEnd(r0)
            android.graphics.Rect r8 = j2.g.b(r9, r13, r8, r11)
            int r11 = r2.getLineAscent(r0)
            int r12 = r8.top
            if (r12 >= r11) goto L1f4
            int r11 = r11 - r12
        L1f2:
            r12 = 1
            goto L1f9
        L1f4:
            int r11 = r2.getTopPadding()
            goto L1f2
        L1f9:
            if (r3 != r12) goto L1fc
            goto L208
        L1fc:
            int r3 = r2.getLineStart(r4)
            int r8 = r2.getLineEnd(r4)
            android.graphics.Rect r8 = j2.g.b(r9, r13, r3, r8)
        L208:
            int r3 = r2.getLineDescent(r4)
            int r8 = r8.bottom
            if (r8 <= r3) goto L212
            int r8 = r8 - r3
            goto L216
        L212:
            int r8 = r2.getBottomPadding()
        L216:
            if (r11 != 0) goto L21b
            if (r8 != 0) goto L21b
            goto L22c
        L21b:
            long r15 = j2.l.a(r11, r8)
            goto L22c
        L220:
            r22 = 0
            r23 = 32
            r24 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r7 = 33
            goto L1cc
        L22c:
            if (r10 == 0) goto L230
            r10 = r0
            goto L233
        L230:
            long r2 = r15 >> r23
            int r10 = (int) r2
        L233:
            if (r14 == 0) goto L237
            r2 = r0
            goto L23a
        L237:
            long r2 = r15 & r24
            int r2 = (int) r2
        L23a:
            long r2 = j2.l.a(r10, r2)
        L23e:
            if (r5 == 0) goto L26f
            int r8 = r5.length
            r9 = r0
            r10 = r9
            r11 = r10
        L244:
            if (r10 >= r8) goto L263
            r13 = r5[r10]
            int r14 = r13.f7770q
            if (r14 >= 0) goto L254
            int r14 = java.lang.Math.abs(r14)
            int r9 = java.lang.Math.max(r9, r14)
        L254:
            int r13 = r13.f7771r
            if (r13 >= 0) goto L260
            int r11 = java.lang.Math.abs(r13)
            int r11 = java.lang.Math.max(r9, r11)
        L260:
            int r10 = r10 + 1
            goto L244
        L263:
            if (r9 != 0) goto L26a
            if (r11 != 0) goto L26a
            long r8 = j2.l.f6713b
            goto L271
        L26a:
            long r8 = j2.l.a(r9, r11)
            goto L271
        L26f:
            long r8 = j2.l.f6713b
        L271:
            long r10 = r2 >> r23
            int r5 = (int) r10
            long r10 = r8 >> r23
            int r10 = (int) r10
            int r5 = java.lang.Math.max(r5, r10)
            r1.f6702h = r5
            long r2 = r2 & r24
            int r2 = (int) r2
            long r8 = r8 & r24
            int r3 = (int) r8
            int r2 = java.lang.Math.max(r2, r3)
            r1.f6703i = r2
            android.text.TextPaint r2 = r1.f6695a
            l2.h[] r3 = r1.f6709o
            int r5 = r1.f6701g
            int r5 = r5 - r12
            android.text.Layout r8 = r1.f6700f
            int r9 = r8.getLineStart(r5)
            int r8 = r8.getLineEnd(r5)
            if (r9 != r8) goto L328
            if (r3 == 0) goto L328
            int r8 = r3.length
            if (r8 != 0) goto L2a3
            goto L328
        L2a3:
            r10 = r6
            android.text.SpannableString r6 = new android.text.SpannableString
            java.lang.String r8 = "\u200b"
            r6.<init>(r8)
            int r8 = r3.length
            if (r8 == 0) goto L322
            r3 = r3[r0]
            int r8 = r6.length()
            if (r5 == 0) goto L2bc
            boolean r5 = r3.f7763j
            if (r5 == 0) goto L2bc
            r5 = r0
            goto L2be
        L2bc:
            boolean r5 = r3.f7763j
        L2be:
            l2.h r9 = new l2.h
            float r11 = r3.f7760g
            boolean r12 = r3.f7763j
            float r13 = r3.f7764k
            int r3 = r3.f7765l
            r28 = r3
            r25 = r5
            r24 = r8
            r22 = r9
            r23 = r11
            r26 = r12
            r27 = r13
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r3 = r22
            int r5 = r6.length()
            r6.setSpan(r3, r0, r5, r7)
            int r9 = r6.length()
            boolean r3 = r1.f6697c
            android.text.Layout$Alignment r11 = j2.d.f6679a
            r19 = 0
            r20 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = 0
            r14 = 2147483647(0x7fffffff, float:NaN)
            r15 = 0
            r17 = 0
            r18 = 0
            r7 = r2
            r16 = r3
            android.text.StaticLayout r2 = j2.g.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.graphics.Paint$FontMetricsInt r7 = new android.graphics.Paint$FontMetricsInt
            r7.<init>()
            int r3 = r2.getLineAscent(r0)
            r7.ascent = r3
            int r3 = r2.getLineDescent(r0)
            r7.descent = r3
            int r3 = r2.getLineTop(r0)
            r7.top = r3
            int r2 = r2.getLineBottom(r0)
            r7.bottom = r2
            goto L32a
        L322:
            java.lang.String r0 = "Array is empty."
            j8.o.l(r0)
            throw r22
        L328:
            r7 = r22
        L32a:
            if (r7 == 0) goto L33b
            int r0 = r7.bottom
            float r2 = r1.e(r4)
            float r3 = r1.g(r4)
            float r2 = r2 - r3
            int r2 = (int) r2
            int r10 = r0 - r2
            goto L33c
        L33b:
            r10 = r0
        L33c:
            r1.f6708n = r10
            r1.f6707m = r7
            android.text.Layout r0 = r1.f6700f
            android.text.TextPaint r2 = r0.getPaint()
            float r0 = x6.d.A(r0, r4, r2)
            r1.f6704j = r0
            android.text.Layout r0 = r1.f6700f
            android.text.TextPaint r2 = r0.getPaint()
            float r0 = x6.d.B(r0, r4, r2)
            r1.f6705k = r0
            return
        L359:
            android.os.Trace.endSection()
            throw r0
    }

    public final int a() {
            r2 = this;
            boolean r0 = r2.f6698d
            android.text.Layout r1 = r2.f6700f
            if (r0 == 0) goto Lf
            int r0 = r2.f6701g
            int r0 = r0 + (-1)
            int r0 = r1.getLineBottom(r0)
            goto L13
        Lf:
            int r0 = r1.getHeight()
        L13:
            int r1 = r2.f6702h
            int r0 = r0 + r1
            int r1 = r2.f6703i
            int r0 = r0 + r1
            int r1 = r2.f6708n
            int r0 = r0 + r1
            return r0
    }

    public final float b(int r2) {
            r1 = this;
            int r0 = r1.f6701g
            int r0 = r0 + (-1)
            if (r2 != r0) goto Lc
            float r2 = r1.f6704j
            float r0 = r1.f6705k
            float r2 = r2 + r0
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public final be.k c() {
            r2 = this;
            be.k r0 = r2.f6711q
            if (r0 != 0) goto Ld
            be.k r0 = new be.k
            android.text.Layout r1 = r2.f6700f
            r0.<init>(r1)
            r2.f6711q = r0
        Ld:
            return r0
    }

    public final float d(int r3) {
            r2 = this;
            int r0 = r2.f6702h
            float r0 = (float) r0
            int r1 = r2.f6701g
            int r1 = r1 + (-1)
            if (r3 != r1) goto L16
            android.graphics.Paint$FontMetricsInt r1 = r2.f6707m
            if (r1 == 0) goto L16
            float r3 = r2.g(r3)
            int r1 = r1.ascent
            float r1 = (float) r1
            float r3 = r3 - r1
            goto L1d
        L16:
            android.text.Layout r1 = r2.f6700f
            int r3 = r1.getLineBaseline(r3)
            float r3 = (float) r3
        L1d:
            float r0 = r0 + r3
            return r0
    }

    public final float e(int r4) {
            r3 = this;
            int r0 = r3.f6701g
            int r1 = r0 + (-1)
            android.text.Layout r2 = r3.f6700f
            if (r4 != r1) goto L18
            android.graphics.Paint$FontMetricsInt r1 = r3.f6707m
            if (r1 == 0) goto L18
            int r4 = r4 + (-1)
            int r4 = r2.getLineBottom(r4)
            float r4 = (float) r4
            int r0 = r1.bottom
            float r0 = (float) r0
            float r4 = r4 + r0
            return r4
        L18:
            int r1 = r3.f6702h
            float r1 = (float) r1
            int r2 = r2.getLineBottom(r4)
            float r2 = (float) r2
            float r1 = r1 + r2
            int r0 = r0 + (-1)
            if (r4 != r0) goto L28
            int r4 = r3.f6703i
            goto L29
        L28:
            r4 = 0
        L29:
            float r4 = (float) r4
            float r1 = r1 + r4
            return r1
    }

    public final int f(int r4) {
            r3 = this;
            java.lang.ThreadLocal r0 = j2.l.f6712a
            android.text.Layout r0 = r3.f6700f
            int r1 = r0.getEllipsisCount(r4)
            if (r1 <= 0) goto L19
            android.text.TextUtils$TruncateAt r1 = r3.f6696b
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            if (r1 != r2) goto L19
            java.lang.CharSequence r4 = r0.getText()
            int r4 = r4.length()
            return r4
        L19:
            int r4 = r0.getLineEnd(r4)
            return r4
    }

    public final float g(int r2) {
            r1 = this;
            android.text.Layout r0 = r1.f6700f
            int r0 = r0.getLineTop(r2)
            float r0 = (float) r0
            if (r2 != 0) goto Lb
            r2 = 0
            goto Ld
        Lb:
            int r2 = r1.f6702h
        Ld:
            float r2 = (float) r2
            float r0 = r0 + r2
            return r0
    }

    public final float h(int r3, boolean r4) {
            r2 = this;
            be.k r0 = r2.c()
            r1 = 1
            float r4 = r0.i(r3, r1, r4)
            android.text.Layout r0 = r2.f6700f
            int r3 = r0.getLineForOffset(r3)
            float r3 = r2.b(r3)
            float r3 = r3 + r4
            return r3
    }

    public final float i(int r3, boolean r4) {
            r2 = this;
            be.k r0 = r2.c()
            r1 = 0
            float r4 = r0.i(r3, r1, r4)
            android.text.Layout r0 = r2.f6700f
            int r3 = r0.getLineForOffset(r3)
            float r3 = r2.b(r3)
            float r3 = r3 + r4
            return r3
    }

    public final c8.a j() {
            r4 = this;
            c8.a r0 = r4.f6699e
            if (r0 == 0) goto L5
            return r0
        L5:
            c8.a r0 = new c8.a
            android.text.Layout r1 = r4.f6700f
            java.lang.CharSequence r2 = r1.getText()
            java.lang.CharSequence r1 = r1.getText()
            int r1 = r1.length()
            android.text.TextPaint r3 = r4.f6695a
            java.util.Locale r3 = r3.getTextLocale()
            r0.<init>(r2, r1, r3)
            r4.f6699e = r0
            return r0
    }
}
