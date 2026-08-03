package a1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements androidx.lifecycle.d, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y1.t f29g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0.v f30h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f0.n f31i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f32j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f33k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a1.b f34l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f35m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final sg.c f36n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f.w f37o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f38p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f.w f39q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y1.f2 f40r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f41s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a1.a f42t;

    public i(y1.t r3, b0.v r4) {
            r2 = this;
            r2.<init>()
            r2.f29g = r3
            r2.f30h = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.f32j = r4
            r0 = 100
            r2.f33k = r0
            a1.b r4 = a1.b.f13g
            r2.f34l = r4
            r4 = 1
            r2.f35m = r4
            r0 = 0
            r1 = 6
            sg.c r4 = sg.j.a(r4, r1, r0)
            r2.f36n = r4
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r4.<init>(r0)
            f.w r4 = f.l.f2854a
            r4.getClass()
            r2.f37o = r4
            f.w r0 = new f.w
            r0.<init>()
            r2.f39q = r0
            y1.f2 r0 = new y1.f2
            f2.s r3 = r3.getSemanticsOwner()
            f2.q r3 = r3.a()
            r0.<init>(r3, r4)
            r2.f40r = r0
            a1.a r3 = new a1.a
            r4 = 0
            r3.<init>(r2, r4)
            r2.f42t = r3
            return
    }

    @Override // androidx.lifecycle.d
    public final void c(androidx.lifecycle.q r1) {
            r0 = this;
            y1.t r1 = r0.f29g
            f2.s r1 = r1.getSemanticsOwner()
            f2.q r1 = r1.a()
            r0.n(r1)
            r0.j()
            r1 = 0
            r0.f31i = r1
            return
    }

    @Override // androidx.lifecycle.d
    public final void d(androidx.lifecycle.q r2) {
            r1 = this;
            b0.v r2 = r1.f30h
            java.lang.Object r2 = r2.invoke()
            f0.n r2 = (f0.n) r2
            r1.f31i = r2
            y1.t r2 = r1.f29g
            f2.s r2 = r2.getSemanticsOwner()
            f2.q r2 = r2.a()
            r0 = -1
            r1.m(r0, r2)
            r1.j()
            return
    }

    public final java.lang.Object e(yf.c r8) {
            r7 = this;
            boolean r0 = r8 instanceof a1.e
            if (r0 == 0) goto L13
            r0 = r8
            a1.e r0 = (a1.e) r0
            int r1 = r0.f22j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22j = r1
            goto L18
        L13:
            a1.e r0 = new a1.e
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f20h
            int r1 = r0.f22j
            r2 = 2
            r3 = 1
            xf.a r4 = xf.a.f21579g
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            sg.b r1 = r0.f19g
            f8.i.I0(r8)
            goto L46
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r8)
            r8 = 0
            return r8
        L33:
            sg.b r1 = r0.f19g
            f8.i.I0(r8)
            goto L51
        L39:
            f8.i.I0(r8)
            sg.c r8 = r7.f36n
            r8.getClass()
            sg.b r1 = new sg.b
            r1.<init>(r8)
        L46:
            r0.f19g = r1
            r0.f22j = r3
            java.lang.Object r8 = r1.b(r0)
            if (r8 != r4) goto L51
            goto L84
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L85
            r1.c()
            boolean r8 = r7.i()
            if (r8 == 0) goto L65
            r7.j()
        L65:
            y1.t r8 = r7.f29g
            android.os.Handler r8 = r8.getHandler()
            boolean r5 = r7.f41s
            if (r5 != 0) goto L78
            if (r8 == 0) goto L78
            r7.f41s = r3
            a1.a r5 = r7.f42t
            r8.post(r5)
        L78:
            r0.f19g = r1
            r0.f22j = r2
            long r5 = r7.f33k
            java.lang.Object r8 = qg.v.f(r5, r0)
            if (r8 != r4) goto L46
        L84:
            return r4
        L85:
            sf.n r8 = sf.n.f12433a
            return r8
    }

    public final void f(f.k r34) {
            r33 = this;
            r0 = r33
            r1 = r34
            int[] r2 = r1.f2844b
            long[] r3 = r1.f2843a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L1a8
            r6 = 0
        Le:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r12
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 == 0) goto L19c
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r14 = 0
        L28:
            if (r14 >= r9) goto L196
            r15 = 255(0xff, double:1.26E-321)
            long r17 = r7 & r15
            r19 = 128(0x80, double:6.3E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L17d
            int r17 = r6 << 3
            int r17 = r17 + r14
            r5 = r2[r17]
            r17 = r11
            f.w r11 = r0.f39q
            java.lang.Object r11 = r11.b(r5)
            y1.f2 r11 = (y1.f2) r11
            java.lang.Object r5 = r1.b(r5)
            f2.r r5 = (f2.r) r5
            r21 = 0
            if (r5 == 0) goto L51
            f2.q r5 = r5.f3216a
            goto L53
        L51:
            r5 = r21
        L53:
            if (r5 == 0) goto L176
            r22 = r12
            int r12 = r5.f3215f
            f2.m r5 = r5.f3213d
            f.k0 r5 = r5.f3204g
            if (r11 != 0) goto Ld7
            java.lang.Object[] r11 = r5.f2849b
            long[] r13 = r5.f2848a
            r24 = r15
            int r15 = r13.length
            int r15 = r15 + (-2)
            r26 = r2
            if (r15 < 0) goto Ld2
            r16 = r10
            r10 = 0
        L6f:
            r1 = r13[r10]
            r27 = r7
            long r7 = ~r1
            long r7 = r7 << r17
            long r7 = r7 & r1
            long r7 = r7 & r22
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto Lc9
            int r7 = r10 - r15
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = 0
        L85:
            if (r8 >= r7) goto Lc5
            long r29 = r1 & r24
            int r29 = (r29 > r19 ? 1 : (r29 == r19 ? 0 : -1))
            if (r29 >= 0) goto Lbe
            int r29 = r10 << 3
            int r29 = r29 + r8
            r29 = r11[r29]
            r30 = r1
            r1 = r29
            f2.x r1 = (f2.x) r1
            f2.x r2 = f2.u.B
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto Lc0
            java.lang.Object r1 = r5.g(r2)
            if (r1 != 0) goto La9
            r1 = r21
        La9:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto Lb4
            java.lang.Object r1 = tf.m.v1(r1)
            i2.g r1 = (i2.g) r1
            goto Lb6
        Lb4:
            r1 = r21
        Lb6:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.l(r12, r1)
            goto Lc0
        Lbe:
            r30 = r1
        Lc0:
            long r1 = r30 >> r16
            int r8 = r8 + 1
            goto L85
        Lc5:
            r1 = r16
            if (r7 != r1) goto Ld4
        Lc9:
            if (r10 == r15) goto Ld4
            int r10 = r10 + 1
            r7 = r27
            r16 = 8
            goto L6f
        Ld2:
            r27 = r7
        Ld4:
            r15 = r14
            goto L173
        Ld7:
            r26 = r2
            r27 = r7
            r24 = r15
            java.lang.Object[] r1 = r5.f2849b
            long[] r2 = r5.f2848a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto Ld4
            r10 = r1
            r13 = r2
            r8 = 0
        Le9:
            r1 = r13[r8]
            r29 = r13
            r15 = r14
            long r13 = ~r1
            long r13 = r13 << r17
            long r13 = r13 & r1
            long r13 = r13 & r22
            int r13 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r13 == 0) goto L16a
            int r13 = r8 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r16 = 8
            int r13 = 8 - r13
            r14 = 0
        L102:
            if (r14 >= r13) goto L166
            long r30 = r1 & r24
            int r30 = (r30 > r19 ? 1 : (r30 == r19 ? 0 : -1))
            if (r30 >= 0) goto L15c
            int r30 = r8 << 3
            int r30 = r30 + r14
            r30 = r10[r30]
            r31 = r1
            r1 = r30
            f2.x r1 = (f2.x) r1
            f2.x r2 = f2.u.B
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto L159
            f2.m r1 = r11.f21911a
            f.k0 r1 = r1.f3204g
            java.lang.Object r1 = r1.g(r2)
            if (r1 != 0) goto L12a
            r1 = r21
        L12a:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L135
            java.lang.Object r1 = tf.m.v1(r1)
            i2.g r1 = (i2.g) r1
            goto L137
        L135:
            r1 = r21
        L137:
            java.lang.Object r2 = r5.g(r2)
            if (r2 != 0) goto L13f
            r2 = r21
        L13f:
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L14a
            java.lang.Object r2 = tf.m.v1(r2)
            i2.g r2 = (i2.g) r2
            goto L14c
        L14a:
            r2 = r21
        L14c:
            boolean r1 = gg.l.a(r1, r2)
            if (r1 != 0) goto L159
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0.l(r12, r1)
        L159:
            r1 = 8
            goto L15f
        L15c:
            r31 = r1
            goto L159
        L15f:
            long r30 = r31 >> r1
            int r14 = r14 + 1
            r1 = r30
            goto L102
        L166:
            r1 = 8
            if (r13 != r1) goto L173
        L16a:
            if (r8 == r7) goto L173
            int r8 = r8 + 1
            r14 = r15
            r13 = r29
            goto Le9
        L173:
            r1 = 8
            goto L187
        L176:
            java.lang.String r1 = "no value for specified key"
            af.d r1 = wb.en.a(r1)
            throw r1
        L17d:
            r26 = r2
            r27 = r7
            r17 = r11
            r22 = r12
            r15 = r14
            r1 = r10
        L187:
            long r7 = r27 >> r1
            int r14 = r15 + 1
            r10 = r1
            r11 = r17
            r12 = r22
            r2 = r26
            r1 = r34
            goto L28
        L196:
            r26 = r2
            r1 = r10
            if (r9 != r1) goto L1a8
            goto L19e
        L19c:
            r26 = r2
        L19e:
            if (r6 == r4) goto L1a8
            int r6 = r6 + 1
            r1 = r34
            r2 = r26
            goto Le
        L1a8:
            return
    }

    public final void g(f2.q r7, fg.p r8) {
            r6 = this;
            r7.getClass()
            r0 = 4
            java.util.List r7 = f2.q.j(r0, r7)
            int r0 = r7.size()
            r1 = 0
            r2 = r1
        Le:
            if (r1 >= r0) goto L2f
            java.lang.Object r3 = r7.get(r1)
            r4 = r3
            f2.q r4 = (f2.q) r4
            f.k r5 = r6.h()
            int r4 = r4.f3215f
            boolean r4 = r5.a(r4)
            if (r4 == 0) goto L2c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r8.invoke(r4, r3)
            int r2 = r2 + 1
        L2c:
            int r1 = r1 + 1
            goto Le
        L2f:
            return
    }

    public final f.k h() {
            r2 = this;
            boolean r0 = r2.f35m
            if (r0 == 0) goto L1b
            r0 = 0
            r2.f35m = r0
            y1.t r0 = r2.f29g
            f2.s r0 = r0.getSemanticsOwner()
            a1.f r1 = a1.f.f23g
            f.w r0 = f2.t.b(r0, r1)
            r2.f37o = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.f38p = r0
        L1b:
            f.w r0 = r2.f37o
            return r0
    }

    public final boolean i() {
            r1 = this;
            f0.n r0 = r1.f31i
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final void j() {
            r10 = this;
            f0.n r0 = r10.f31i
            if (r0 != 0) goto L6
            goto L79
        L6:
            java.lang.Object r1 = r0.f2971a
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 >= r3) goto Lf
            goto L79
        Lf:
            java.util.ArrayList r2 = r10.f32j
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L79
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L1d:
            r7 = 1
            if (r6 >= r4) goto L5f
            java.lang.Object r8 = r2.get(r6)
            a1.j r8 = (a1.j) r8
            a1.k r9 = r8.f45c
            int r9 = r9.ordinal()
            if (r9 == 0) goto L49
            if (r9 != r7) goto L45
            int r7 = r8.f43a
            long r7 = (long) r7
            android.view.autofill.AutofillId r7 = r0.b(r7)
            if (r7 == 0) goto L5c
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r3) goto L5c
            android.view.contentcapture.ContentCaptureSession r8 = androidx.lifecycle.a0.c(r1)
            b2.a.e(r8, r7)
            goto L5c
        L45:
            okio.a.k()
            return
        L49:
            androidx.lifecycle.x r7 = r8.f46d
            if (r7 == 0) goto L5c
            java.lang.Object r7 = r7.f310h
            android.view.ViewStructure r7 = (android.view.ViewStructure) r7
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r3) goto L5c
            android.view.contentcapture.ContentCaptureSession r8 = androidx.lifecycle.a0.c(r1)
            b2.a.d(r8, r7)
        L5c:
            int r6 = r6 + 1
            goto L1d
        L5f:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r3) goto L76
            android.view.contentcapture.ContentCaptureSession r1 = androidx.lifecycle.a0.c(r1)
            android.view.View r0 = r0.f2972b
            android.view.autofill.AutofillId r0 = r0.getAutofillId()
            long[] r3 = new long[r7]
            r6 = -9223372036854775808
            r3[r5] = r6
            b2.a.g(r1, r0, r3)
        L76:
            r2.clear()
        L79:
            return
    }

    public final void k(f2.q r6, y1.f2 r7) {
            r5 = this;
            a1.g r0 = new a1.g
            r1 = 0
            r0.<init>(r7, r1, r5)
            r5.g(r6, r0)
            r7 = 4
            java.util.List r6 = f2.q.j(r7, r6)
            int r7 = r6.size()
            r0 = 0
        L13:
            if (r0 >= r7) goto L45
            java.lang.Object r1 = r6.get(r0)
            f2.q r1 = (f2.q) r1
            f.k r2 = r5.h()
            int r3 = r1.f3215f
            boolean r2 = r2.a(r3)
            if (r2 == 0) goto L42
            f.w r2 = r5.f39q
            boolean r4 = r2.a(r3)
            if (r4 == 0) goto L42
            java.lang.Object r2 = r2.b(r3)
            if (r2 == 0) goto L3b
            y1.f2 r2 = (y1.f2) r2
            r5.k(r1, r2)
            goto L42
        L3b:
            java.lang.String r6 = "node not present in pruned tree before this change"
            af.d r6 = wb.en.a(r6)
            throw r6
        L42:
            int r0 = r0 + 1
            goto L13
        L45:
            return
    }

    public final void l(int r6, java.lang.String r7) {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L7
            goto L1e
        L7:
            f0.n r2 = r5.f31i
            if (r2 != 0) goto Lc
            goto L1e
        Lc:
            long r3 = (long) r6
            android.view.autofill.AutofillId r6 = r2.b(r3)
            if (r6 == 0) goto L1f
            if (r0 < r1) goto L1e
            java.lang.Object r0 = r2.f2971a
            android.view.contentcapture.ContentCaptureSession r0 = androidx.lifecycle.a0.c(r0)
            b2.a.f(r0, r6, r7)
        L1e:
            return
        L1f:
            java.lang.String r6 = "Invalid content capture ID"
            af.d r6 = wb.en.a(r6)
            throw r6
    }

    public final void m(int r18, f2.q r19) {
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r0.i()
            if (r2 != 0) goto Lb
            return
        Lb:
            f2.m r2 = r1.f3213d
            f.k0 r2 = r2.f3204g
            f2.x r3 = f2.u.D
            java.lang.Object r3 = r2.g(r3)
            r4 = 0
            if (r3 != 0) goto L19
            r3 = r4
        L19:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            a1.b r5 = r0.f34l
            a1.b r6 = a1.b.f13g
            if (r5 != r6) goto L45
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r5 = gg.l.a(r3, r5)
            if (r5 == 0) goto L45
            f2.x r3 = f2.l.f3190m
            java.lang.Object r2 = r2.g(r3)
            if (r2 != 0) goto L32
            r2 = r4
        L32:
            f2.a r2 = (f2.a) r2
            if (r2 == 0) goto L6e
            sf.b r2 = r2.f3138b
            fg.l r2 = (fg.l) r2
            if (r2 == 0) goto L6e
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            java.lang.Object r2 = r2.invoke(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            goto L6e
        L45:
            a1.b r5 = r0.f34l
            a1.b r6 = a1.b.f14h
            if (r5 != r6) goto L6e
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r3 = gg.l.a(r3, r5)
            if (r3 == 0) goto L6e
            f2.x r3 = f2.l.f3190m
            java.lang.Object r2 = r2.g(r3)
            if (r2 != 0) goto L5c
            r2 = r4
        L5c:
            f2.a r2 = (f2.a) r2
            if (r2 == 0) goto L6e
            sf.b r2 = r2.f3138b
            fg.l r2 = (fg.l) r2
            if (r2 == 0) goto L6e
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.Object r2 = r2.invoke(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L6e:
            int r6 = r1.f3215f
            f0.n r2 = r0.f31i
            if (r2 != 0) goto L77
        L74:
            r10 = r4
            goto L1a4
        L77:
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r3 >= r5) goto L7e
            goto L74
        L7e:
            y1.t r7 = r0.f29g
            android.view.autofill.AutofillId r7 = r7.getAutofillId()
            f2.q r8 = r1.l()
            int r9 = r1.f3215f
            if (r8 == 0) goto L96
            int r7 = r8.f3215f
            long r7 = (long) r7
            android.view.autofill.AutofillId r7 = r2.b(r7)
            if (r7 != 0) goto L96
            goto L74
        L96:
            long r10 = (long) r9
            if (r3 < r5) goto Laa
            java.lang.Object r2 = r2.f2971a
            android.view.contentcapture.ContentCaptureSession r2 = androidx.lifecycle.a0.c(r2)
            android.view.ViewStructure r2 = b2.a.c(r2, r7, r10)
            androidx.lifecycle.x r3 = new androidx.lifecycle.x
            r5 = 2
            r3.<init>(r2, r5)
            goto Lab
        Laa:
            r3 = r4
        Lab:
            if (r3 != 0) goto Lae
            goto L74
        Lae:
            java.lang.Object r2 = r3.f310h
            r10 = r2
            android.view.ViewStructure r10 = (android.view.ViewStructure) r10
            f2.m r2 = r1.f3213d
            f2.x r5 = f2.u.K
            f.k0 r7 = r2.f3204g
            boolean r5 = r7.c(r5)
            if (r5 == 0) goto Lc0
            goto L74
        Lc0:
            android.os.Bundle r5 = r10.getExtras()
            if (r5 == 0) goto Ld4
            java.lang.String r8 = "android.view.contentcapture.EventTimestamp"
            long r11 = r0.f38p
            r5.putLong(r8, r11)
            java.lang.String r8 = "android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX"
            r11 = r18
            r5.putInt(r8, r11)
        Ld4:
            f2.x r5 = f2.u.f3248z
            java.lang.Object r5 = r7.g(r5)
            if (r5 != 0) goto Ldd
            r5 = r4
        Ldd:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto Le4
            r10.setId(r9, r4, r4, r5)
        Le4:
            f2.x r5 = f2.u.f3235m
            java.lang.Object r5 = r7.g(r5)
            if (r5 != 0) goto Led
            r5 = r4
        Led:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto Lf6
            java.lang.String r5 = "android.widget.ViewGroup"
            r10.setClassName(r5)
        Lf6:
            f2.x r5 = f2.u.B
            java.lang.Object r5 = r7.g(r5)
            if (r5 != 0) goto Lff
            r5 = r4
        Lff:
            java.util.List r5 = (java.util.List) r5
            r8 = 62
            java.lang.String r9 = "\n"
            if (r5 == 0) goto L113
            java.lang.String r11 = "android.widget.TextView"
            r10.setClassName(r11)
            java.lang.String r5 = w2.a.a(r5, r9, r4, r8)
            r10.setText(r5)
        L113:
            f2.x r5 = f2.u.F
            java.lang.Object r5 = r7.g(r5)
            if (r5 != 0) goto L11c
            r5 = r4
        L11c:
            i2.g r5 = (i2.g) r5
            if (r5 == 0) goto L128
            java.lang.String r11 = "android.widget.EditText"
            r10.setClassName(r11)
            r10.setText(r5)
        L128:
            f2.x r5 = f2.u.f3223a
            java.lang.Object r5 = r7.g(r5)
            if (r5 != 0) goto L131
            r5 = r4
        L131:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L13c
            java.lang.String r5 = w2.a.a(r5, r9, r4, r8)
            r10.setContentDescription(r5)
        L13c:
            f2.x r5 = f2.u.f3247y
            java.lang.Object r5 = r7.g(r5)
            if (r5 != 0) goto L145
            r5 = r4
        L145:
            f2.i r5 = (f2.i) r5
            if (r5 == 0) goto L154
            int r5 = r5.f3155a
            java.lang.String r5 = y1.g0.v(r5)
            if (r5 == 0) goto L154
            r10.setClassName(r5)
        L154:
            i2.k0 r2 = y1.g0.o(r2)
            if (r2 == 0) goto L176
            i2.j0 r2 = r2.f6346a
            i2.n0 r5 = r2.f6335b
            u2.c r2 = r2.f6340g
            i2.f0 r5 = r5.f6365a
            long r7 = r5.f6299b
            float r5 = u2.o.c(r7)
            float r7 = r2.d()
            float r7 = r7 * r5
            float r2 = r2.q0()
            float r2 = r2 * r7
            r5 = 0
            r10.setTextStyle(r2, r5, r5, r5)
        L176:
            x1.i1 r2 = r1.d()
            if (r2 == 0) goto L18c
            y0.n r5 = r2.r1()
            boolean r5 = r5.f21832t
            if (r5 == 0) goto L185
            r4 = r2
        L185:
            if (r4 == 0) goto L18c
            e1.c r2 = r1.a(r4)
            goto L18e
        L18c:
            e1.c r2 = e1.c.f2295e
        L18e:
            float r4 = r2.f2296a
            int r11 = (int) r4
            float r5 = r2.f2297b
            int r12 = (int) r5
            float r7 = r2.f2298c
            float r7 = r7 - r4
            int r15 = (int) r7
            float r2 = r2.f2299d
            float r2 = r2 - r5
            int r2 = (int) r2
            r13 = 0
            r14 = 0
            r16 = r2
            r10.setDimens(r11, r12, r13, r14, r15, r16)
            r10 = r3
        L1a4:
            if (r10 != 0) goto L1a7
            goto L1b5
        L1a7:
            a1.j r5 = new a1.j
            long r7 = r0.f38p
            a1.k r9 = a1.k.f47g
            r5.<init>(r6, r7, r9, r10)
            java.util.ArrayList r2 = r0.f32j
            r2.add(r5)
        L1b5:
            a1.h r2 = new a1.h
            r3 = 0
            r2.<init>(r0, r3)
            r0.g(r1, r2)
            return
    }

    public final void n(f2.q r8) {
            r7 = this;
            boolean r0 = r7.i()
            if (r0 != 0) goto L7
            goto L30
        L7:
            int r2 = r8.f3215f
            a1.j r1 = new a1.j
            long r3 = r7.f38p
            a1.k r5 = a1.k.f48h
            r6 = 0
            r1.<init>(r2, r3, r5, r6)
            java.util.ArrayList r0 = r7.f32j
            r0.add(r1)
            r0 = 4
            java.util.List r8 = f2.q.j(r0, r8)
            int r0 = r8.size()
            r1 = 0
        L22:
            if (r1 >= r0) goto L30
            java.lang.Object r2 = r8.get(r1)
            f2.q r2 = (f2.q) r2
            r7.n(r2)
            int r1 = r1 + 1
            goto L22
        L30:
            return
    }

    public final void o() {
            r17 = this;
            r0 = r17
            f.w r1 = r0.f39q
            r1.c()
            f.k r2 = r0.h()
            int[] r3 = r2.f2844b
            java.lang.Object[] r4 = r2.f2845c
            long[] r2 = r2.f2843a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L5e
            r7 = 0
        L17:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L31:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            f2.r r13 = (f2.r) r13
            y1.f2 r15 = new y1.f2
            f2.q r13 = r13.f3216a
            f.k r6 = r0.h()
            r15.<init>(r13, r6)
            r1.h(r14, r15)
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L31
        L57:
            if (r10 != r11) goto L5e
        L59:
            if (r7 == r5) goto L5e
            int r7 = r7 + 1
            goto L17
        L5e:
            y1.f2 r1 = new y1.f2
            y1.t r2 = r0.f29g
            f2.s r2 = r2.getSemanticsOwner()
            f2.q r2 = r2.a()
            f.k r3 = r0.h()
            r1.<init>(r2, r3)
            r0.f40r = r1
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r2) {
            r1 = this;
            y1.t r2 = r1.f29g
            android.os.Handler r2 = r2.getHandler()
            r2.getClass()
            a1.a r0 = r1.f42t
            r2.removeCallbacks(r0)
            r2 = 0
            r1.f31i = r2
            return
    }
}
