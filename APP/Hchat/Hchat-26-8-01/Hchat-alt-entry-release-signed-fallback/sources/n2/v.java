package n2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements n2.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.View f8986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b5.c f8987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n2.w f8988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fg.l f8990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public fg.l f8991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n2.s f8992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n2.j f8993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f8994i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.Object f8995j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public android.graphics.Rect f8996k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n2.c f8997l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j0.b f8998m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a1.a f8999n;

    public v(android.view.View r6, y1.t r7) {
            r5 = this;
            b5.c r0 = new b5.c
            r0.<init>()
            r0.f469a = r6
            d1.c0 r1 = new d1.c0
            r2 = 10
            r1.<init>(r0, r2)
            sf.d r2 = sf.d.f12416h
            sf.c r1 = be.h.G(r2, r1)
            r0.f470b = r1
            androidx.lifecycle.x r1 = new androidx.lifecycle.x
            r1.<init>(r6)
            r0.f471c = r1
            android.view.Choreographer r1 = android.view.Choreographer.getInstance()
            n2.w r2 = new n2.w
            r2.<init>(r1)
            r5.<init>()
            r5.f8986a = r6
            r5.f8987b = r0
            r5.f8988c = r2
            n2.b r6 = n2.b.f8924j
            r5.f8990e = r6
            n2.b r6 = n2.b.f8925k
            r5.f8991f = r6
            n2.s r6 = new n2.s
            long r1 = i2.m0.f6358b
            r3 = 4
            java.lang.String r4 = ""
            r6.<init>(r3, r4, r1)
            r5.f8992g = r6
            n2.j r6 = n2.j.f8952g
            r5.f8993h = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.f8994i = r6
            d1.c0 r6 = new d1.c0
            r1 = 11
            r6.<init>(r5, r1)
            sf.d r1 = sf.d.f12416h
            sf.c r6 = be.h.G(r1, r6)
            r5.f8995j = r6
            n2.c r6 = new n2.c
            r6.<init>(r7, r0)
            r5.f8997l = r6
            j0.b r6 = new j0.b
            r7 = 16
            n2.u[] r7 = new n2.u[r7]
            r6.<init>(r7)
            r5.f8998m = r6
            return
    }

    @Override // n2.n
    public final void a(n2.s r2, n2.j r3, b0.s r4, w.w r5) {
            r1 = this;
            r0 = 1
            r1.f8989d = r0
            r1.f8992g = r2
            r1.f8993h = r3
            r1.f8990e = r4
            r1.f8991f = r5
            n2.u r2 = n2.u.f8981g
            r1.i(r2)
            return
    }

    @Override // n2.n
    public final void b() {
            r1 = this;
            n2.u r0 = n2.u.f8981g
            r1.i(r0)
            return
    }

    @Override // n2.n
    public final void c() {
            r1 = this;
            n2.u r0 = n2.u.f8983i
            r1.i(r0)
            return
    }

    @Override // n2.n
    public final void d() {
            r1 = this;
            r0 = 0
            r1.f8989d = r0
            n2.b r0 = n2.b.f8926l
            r1.f8990e = r0
            n2.b r0 = n2.b.f8927m
            r1.f8991f = r0
            r0 = 0
            r1.f8996k = r0
            n2.u r0 = n2.u.f8982h
            r1.i(r0)
            return
    }

    @Override // n2.n
    public final void e(n2.s r13, n2.s r14) {
            r12 = this;
            n2.s r0 = r12.f8992g
            long r0 = r0.f8977b
            long r2 = r14.f8977b
            boolean r0 = i2.m0.b(r0, r2)
            r1 = 0
            if (r0 == 0) goto L1c
            n2.s r0 = r12.f8992g
            i2.m0 r0 = r0.f8978c
            i2.m0 r2 = r14.f8978c
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto L1a
            goto L1c
        L1a:
            r0 = r1
            goto L1d
        L1c:
            r0 = 1
        L1d:
            r12.f8992g = r14
            java.util.ArrayList r2 = r12.f8994i
            int r2 = r2.size()
            r3 = r1
        L26:
            if (r3 >= r2) goto L3d
            java.util.ArrayList r4 = r12.f8994i
            java.lang.Object r4 = r4.get(r3)
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            java.lang.Object r4 = r4.get()
            n2.o r4 = (n2.o) r4
            if (r4 == 0) goto L3a
            r4.f8965d = r14
        L3a:
            int r3 = r3 + 1
            goto L26
        L3d:
            n2.c r2 = r12.f8997l
            java.lang.Object r3 = r2.f8931c
            monitor-enter(r3)
            r4 = 0
            r2.f8938j = r4     // Catch: java.lang.Throwable -> L142
            r2.f8940l = r4     // Catch: java.lang.Throwable -> L142
            r2.f8939k = r4     // Catch: java.lang.Throwable -> L142
            n2.b r5 = n2.b.f8922h     // Catch: java.lang.Throwable -> L142
            r2.f8941m = r5     // Catch: java.lang.Throwable -> L142
            r2.f8942n = r4     // Catch: java.lang.Throwable -> L142
            r2.f8943o = r4     // Catch: java.lang.Throwable -> L142
            monitor-exit(r3)
            boolean r2 = gg.l.a(r13, r14)
            r3 = -1
            if (r2 == 0) goto L97
            if (r0 == 0) goto L141
            b5.c r13 = r12.f8987b
            long r0 = r14.f8977b
            int r6 = i2.m0.f(r0)
            long r0 = r14.f8977b
            int r7 = i2.m0.e(r0)
            n2.s r14 = r12.f8992g
            i2.m0 r14 = r14.f8978c
            if (r14 == 0) goto L77
            long r0 = r14.f6360a
            int r14 = i2.m0.f(r0)
            r8 = r14
            goto L78
        L77:
            r8 = r3
        L78:
            n2.s r14 = r12.f8992g
            i2.m0 r14 = r14.f8978c
            if (r14 == 0) goto L84
            long r0 = r14.f6360a
            int r3 = i2.m0.e(r0)
        L84:
            r9 = r3
            java.lang.Object r14 = r13.f470b
            java.lang.Object r14 = r14.getValue()
            r4 = r14
            android.view.inputmethod.InputMethodManager r4 = (android.view.inputmethod.InputMethodManager) r4
            java.lang.Object r13 = r13.f469a
            r5 = r13
            android.view.View r5 = (android.view.View) r5
            r4.updateSelection(r5, r6, r7, r8, r9)
            return
        L97:
            if (r13 == 0) goto Lcd
            i2.g r0 = r13.f8976a
            java.lang.String r0 = r0.f6314h
            i2.g r2 = r14.f8976a
            java.lang.String r2 = r2.f6314h
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto Lbb
            long r4 = r13.f8977b
            long r6 = r14.f8977b
            boolean r0 = i2.m0.b(r4, r6)
            if (r0 == 0) goto Lcd
            i2.m0 r13 = r13.f8978c
            i2.m0 r14 = r14.f8978c
            boolean r13 = gg.l.a(r13, r14)
            if (r13 != 0) goto Lcd
        Lbb:
            b5.c r13 = r12.f8987b
            java.lang.Object r14 = r13.f470b
            java.lang.Object r14 = r14.getValue()
            android.view.inputmethod.InputMethodManager r14 = (android.view.inputmethod.InputMethodManager) r14
            java.lang.Object r13 = r13.f469a
            android.view.View r13 = (android.view.View) r13
            r14.restartInput(r13)
            return
        Lcd:
            java.util.ArrayList r13 = r12.f8994i
            int r13 = r13.size()
        Ld3:
            if (r1 >= r13) goto L141
            java.util.ArrayList r14 = r12.f8994i
            java.lang.Object r14 = r14.get(r1)
            java.lang.ref.WeakReference r14 = (java.lang.ref.WeakReference) r14
            java.lang.Object r14 = r14.get()
            n2.o r14 = (n2.o) r14
            if (r14 == 0) goto L13e
            n2.s r0 = r12.f8992g
            b5.c r2 = r12.f8987b
            boolean r4 = r14.f8969h
            if (r4 != 0) goto Lee
            goto L13e
        Lee:
            r14.f8965d = r0
            boolean r4 = r14.f8967f
            if (r4 == 0) goto L109
            int r14 = r14.f8966e
            android.view.inputmethod.ExtractedText r4 = fb.v0.N(r0)
            java.lang.Object r5 = r2.f470b
            java.lang.Object r5 = r5.getValue()
            android.view.inputmethod.InputMethodManager r5 = (android.view.inputmethod.InputMethodManager) r5
            java.lang.Object r6 = r2.f469a
            android.view.View r6 = (android.view.View) r6
            r5.updateExtractedText(r6, r14, r4)
        L109:
            i2.m0 r14 = r0.f8978c
            long r4 = r0.f8977b
            if (r14 == 0) goto L117
            long r6 = r14.f6360a
            int r14 = i2.m0.f(r6)
            r10 = r14
            goto L118
        L117:
            r10 = r3
        L118:
            i2.m0 r14 = r0.f8978c
            if (r14 == 0) goto L124
            long r6 = r14.f6360a
            int r14 = i2.m0.e(r6)
            r11 = r14
            goto L125
        L124:
            r11 = r3
        L125:
            int r8 = i2.m0.f(r4)
            int r9 = i2.m0.e(r4)
            java.lang.Object r14 = r2.f470b
            java.lang.Object r14 = r14.getValue()
            r6 = r14
            android.view.inputmethod.InputMethodManager r6 = (android.view.inputmethod.InputMethodManager) r6
            java.lang.Object r14 = r2.f469a
            r7 = r14
            android.view.View r7 = (android.view.View) r7
            r6.updateSelection(r7, r8, r9, r10, r11)
        L13e:
            int r1 = r1 + 1
            goto Ld3
        L141:
            return
        L142:
            r0 = move-exception
            r13 = r0
            monitor-exit(r3)
            throw r13
    }

    @Override // n2.n
    public final void f() {
            r1 = this;
            n2.u r0 = n2.u.f8984j
            r1.i(r0)
            return
    }

    @Override // n2.n
    public final void g(n2.s r3, b5.k r4, i2.k0 r5, i0.c r6, e1.c r7, e1.c r8) {
            r2 = this;
            n2.c r0 = r2.f8997l
            java.lang.Object r1 = r0.f8931c
            monitor-enter(r1)
            r0.f8938j = r3     // Catch: java.lang.Throwable -> L1a
            r0.f8940l = r4     // Catch: java.lang.Throwable -> L1a
            r0.f8939k = r5     // Catch: java.lang.Throwable -> L1a
            r0.f8941m = r6     // Catch: java.lang.Throwable -> L1a
            r0.f8942n = r7     // Catch: java.lang.Throwable -> L1a
            r0.f8943o = r8     // Catch: java.lang.Throwable -> L1a
            boolean r3 = r0.f8933e     // Catch: java.lang.Throwable -> L1a
            if (r3 != 0) goto L1c
            boolean r3 = r0.f8932d     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L1f
            goto L1c
        L1a:
            r3 = move-exception
            goto L21
        L1c:
            r0.a()     // Catch: java.lang.Throwable -> L1a
        L1f:
            monitor-exit(r1)
            return
        L21:
            monitor-exit(r1)
            throw r3
    }

    @Override // n2.n
    public final void h(e1.c r5) {
            r4 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            float r1 = r5.f2296a
            int r1 = ig.a.X(r1)
            float r2 = r5.f2297b
            int r2 = ig.a.X(r2)
            float r3 = r5.f2298c
            int r3 = ig.a.X(r3)
            float r5 = r5.f2299d
            int r5 = ig.a.X(r5)
            r0.<init>(r1, r2, r3, r5)
            r4.f8996k = r0
            java.util.ArrayList r5 = r4.f8994i
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L35
            android.graphics.Rect r5 = r4.f8996k
            if (r5 == 0) goto L35
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r5)
            android.view.View r5 = r4.f8986a
            r5.requestRectangleOnScreen(r0)
        L35:
            return
    }

    public final void i(n2.u r2) {
            r1 = this;
            j0.b r0 = r1.f8998m
            r0.b(r2)
            a1.a r2 = r1.f8999n
            if (r2 != 0) goto L17
            a1.a r2 = new a1.a
            r0 = 25
            r2.<init>(r1, r0)
            n2.w r0 = r1.f8988c
            r0.execute(r2)
            r1.f8999n = r2
        L17:
            return
    }
}
