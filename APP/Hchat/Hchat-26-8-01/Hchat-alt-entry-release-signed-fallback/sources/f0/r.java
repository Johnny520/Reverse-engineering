package f0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0.a f2980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0.n f2981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f2982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n2.s f2989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i2.k0 f2990k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b5.k f2991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e1.c f2992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e1.c f2993n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final android.view.inputmethod.CursorAnchorInfo.Builder f2994o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f2995p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final android.graphics.Matrix f2996q;

    public r(f0.a r1, f0.n r2) {
            r0 = this;
            r0.<init>()
            r0.f2980a = r1
            r0.f2981b = r2
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.f2982c = r1
            android.view.inputmethod.CursorAnchorInfo$Builder r1 = new android.view.inputmethod.CursorAnchorInfo$Builder
            r1.<init>()
            r0.f2994o = r1
            float[] r1 = f1.i0.a()
            r0.f2995p = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0.f2996q = r1
            return
    }

    public final void a() {
            r30 = this;
            r0 = r30
            f0.n r1 = r0.f2981b
            android.view.inputmethod.InputMethodManager r2 = r1.a()
            android.view.View r3 = r1.f2972b
            boolean r2 = r2.isActive(r3)
            if (r2 == 0) goto L230
            n2.s r2 = r0.f2989j
            if (r2 == 0) goto L230
            b5.k r2 = r0.f2991l
            if (r2 == 0) goto L230
            i2.k0 r2 = r0.f2990k
            if (r2 == 0) goto L230
            e1.c r2 = r0.f2992m
            if (r2 == 0) goto L230
            e1.c r2 = r0.f2993n
            if (r2 != 0) goto L26
            goto L230
        L26:
            float[] r2 = r0.f2995p
            f1.i0.d(r2)
            f0.a r4 = r0.f2980a
            f0.p r4 = r4.f2931n
            i0.j1 r4 = r4.f2979x
            java.lang.Object r4 = r4.getValue()
            v1.t r4 = (v1.t) r4
            if (r4 == 0) goto L47
            boolean r5 = r4.C()
            if (r5 == 0) goto L40
            goto L41
        L40:
            r4 = 0
        L41:
            if (r4 != 0) goto L44
            goto L47
        L44:
            r4.E(r2)
        L47:
            e1.c r4 = r0.f2993n
            r4.getClass()
            float r4 = r4.f2296a
            float r4 = -r4
            e1.c r5 = r0.f2993n
            r5.getClass()
            float r5 = r5.f2297b
            float r5 = -r5
            f1.i0.f(r2, r4, r5)
            android.graphics.Matrix r4 = r0.f2996q
            f1.c0.p(r4, r2)
            n2.s r2 = r0.f2989j
            r2.getClass()
            long r5 = r2.f8977b
            b5.k r7 = r0.f2991l
            r7.getClass()
            i2.k0 r8 = r0.f2990k
            r8.getClass()
            i2.o r9 = r8.f6347b
            e1.c r10 = r0.f2992m
            r10.getClass()
            float r11 = r10.f2299d
            float r12 = r10.f2297b
            e1.c r13 = r0.f2993n
            r13.getClass()
            boolean r14 = r0.f2985f
            boolean r15 = r0.f2986g
            r16 = r1
            boolean r1 = r0.f2987h
            r17 = r1
            boolean r1 = r0.f2988i
            r25 = r1
            android.view.inputmethod.CursorAnchorInfo$Builder r1 = r0.f2994o
            r1.reset()
            r1.setMatrix(r4)
            i2.m0 r4 = r2.f8978c
            r18 = r5
            int r5 = i2.m0.f(r18)
            int r6 = i2.m0.e(r18)
            r1.setSelectionRange(r5, r6)
            t2.j r6 = t2.j.f13012h
            r18 = r1
            r26 = 1
            if (r14 == 0) goto L106
            if (r5 >= 0) goto Lb0
            goto L106
        Lb0:
            r7.l(r5)
            e1.c r14 = r8.c(r5)
            float r1 = r14.f2296a
            r27 = r11
            r28 = r12
            long r11 = r8.f6348c
            r19 = 32
            long r11 = r11 >> r19
            int r11 = (int) r11
            float r11 = (float) r11
            r12 = 0
            float r1 = r9.e0.q(r1, r12, r11)
            float r11 = r14.f2297b
            boolean r11 = f0.q.f(r10, r1, r11)
            float r12 = r14.f2299d
            boolean r12 = f0.q.f(r10, r1, r12)
            t2.j r5 = r8.a(r5)
            if (r5 != r6) goto Ldf
            r5 = r26
            goto Le0
        Ldf:
            r5 = 0
        Le0:
            if (r11 != 0) goto Le8
            if (r12 == 0) goto Le5
            goto Le8
        Le5:
            r19 = 0
            goto Lea
        Le8:
            r19 = r26
        Lea:
            if (r11 == 0) goto Lee
            if (r12 != 0) goto Lf0
        Lee:
            r19 = r19 | 2
        Lf0:
            if (r5 == 0) goto Lf4
            r19 = r19 | 4
        Lf4:
            r23 = r19
            float r5 = r14.f2297b
            float r11 = r14.f2299d
            r22 = r11
            r19 = r1
            r20 = r5
            r21 = r11
            r18.setInsertionMarkerLocation(r19, r20, r21, r22, r23)
            goto L10a
        L106:
            r27 = r11
            r28 = r12
        L10a:
            r1 = r18
            if (r15 == 0) goto L1bd
            r5 = -1
            if (r4 == 0) goto L118
            long r11 = r4.f6360a
            int r11 = i2.m0.f(r11)
            goto L119
        L118:
            r11 = r5
        L119:
            if (r4 == 0) goto L121
            long r4 = r4.f6360a
            int r5 = i2.m0.e(r4)
        L121:
            if (r11 < 0) goto L1bd
            if (r11 >= r5) goto L1bd
            i2.g r2 = r2.f8976a
            java.lang.String r2 = r2.f6314h
            java.lang.CharSequence r2 = r2.subSequence(r11, r5)
            r1.setComposingText(r11, r2)
            r7.l(r11)
            r7.l(r5)
            int r2 = r5 - r11
            int r2 = r2 * 4
            float[] r2 = new float[r2]
            long r14 = i2.e0.b(r11, r5)
            r9.a(r14, r2)
            r4 = r11
        L144:
            if (r4 >= r5) goto L1bd
            r7.l(r4)
            int r12 = r4 - r11
            int r12 = r12 * 4
            r14 = r2[r12]
            int r15 = r12 + 1
            r15 = r2[r15]
            int r18 = r12 + 2
            r19 = r1
            r1 = r2[r18]
            int r12 = r12 + 3
            r12 = r2[r12]
            r29 = r2
            float r2 = r10.f2296a
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 >= 0) goto L168
            r18 = r26
            goto L16a
        L168:
            r18 = 0
        L16a:
            float r2 = r10.f2298c
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 >= 0) goto L173
            r2 = r26
            goto L174
        L173:
            r2 = 0
        L174:
            r2 = r18 & r2
            int r18 = (r28 > r12 ? 1 : (r28 == r12 ? 0 : -1))
            if (r18 >= 0) goto L17d
            r18 = r26
            goto L17f
        L17d:
            r18 = 0
        L17f:
            r2 = r2 & r18
            int r18 = (r15 > r27 ? 1 : (r15 == r27 ? 0 : -1))
            if (r18 >= 0) goto L188
            r18 = r26
            goto L18a
        L188:
            r18 = 0
        L18a:
            r2 = r2 & r18
            boolean r18 = f0.q.f(r10, r14, r15)
            if (r18 == 0) goto L19c
            boolean r18 = f0.q.f(r10, r1, r12)
            if (r18 != 0) goto L199
            goto L19c
        L199:
            r22 = r1
            goto L19f
        L19c:
            r2 = r2 | 2
            goto L199
        L19f:
            t2.j r1 = r8.a(r4)
            if (r1 != r6) goto L1a7
            r2 = r2 | 4
        L1a7:
            r24 = r2
            r23 = r12
            r20 = r14
            r21 = r15
            r18 = r19
            r19 = r4
            r18.addCharacterBounds(r19, r20, r21, r22, r23, r24)
            r1 = r18
            int r4 = r19 + 1
            r2 = r29
            goto L144
        L1bd:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r2 < r4) goto L1e0
            if (r17 == 0) goto L1e0
            android.view.inputmethod.EditorBoundsInfo$Builder r4 = ai.a.m()
            android.graphics.RectF r5 = f1.c0.u(r13)
            android.view.inputmethod.EditorBoundsInfo$Builder r4 = ai.a.n(r4, r5)
            android.graphics.RectF r5 = f1.c0.u(r13)
            android.view.inputmethod.EditorBoundsInfo$Builder r4 = ai.a.D(r4, r5)
            android.view.inputmethod.EditorBoundsInfo r4 = ai.a.o(r4)
            ai.a.l(r1, r4)
        L1e0:
            r4 = 34
            if (r2 < r4) goto L222
            if (r25 == 0) goto L222
            boolean r2 = r10.f()
            if (r2 != 0) goto L222
            int r2 = r9.f6373f
            int r2 = r2 + (-1)
            if (r2 >= 0) goto L1f3
            r2 = 0
        L1f3:
            r4 = r28
            int r4 = r9.e(r4)
            r5 = 0
            int r4 = r9.e0.r(r4, r5, r2)
            r6 = r27
            int r6 = r9.e(r6)
            int r2 = r9.e0.r(r6, r5, r2)
            if (r4 > r2) goto L222
        L20a:
            float r5 = r8.e(r4)
            float r6 = r9.f(r4)
            float r7 = r8.f(r4)
            float r10 = r9.b(r4)
            b0.a0.n(r1, r5, r6, r7, r10)
            if (r4 == r2) goto L222
            int r4 = r4 + 1
            goto L20a
        L222:
            android.view.inputmethod.CursorAnchorInfo r1 = r1.build()
            android.view.inputmethod.InputMethodManager r2 = r16.a()
            r2.updateCursorAnchorInfo(r3, r1)
            r5 = 0
            r0.f2984e = r5
        L230:
            return
    }
}
