package f0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements n2.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0.p f2939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qg.e1 f2940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f0.u f2941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public tg.r f2942d;

    @Override // n2.n
    public final void a(n2.s r8, n2.j r9, b0.s r10, w.w r11) {
            r7 = this;
            eb.o r0 = new eb.o
            r6 = 1
            r2 = r7
            r1 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.j(r0)
            return
    }

    @Override // n2.n
    public final void b() {
            r1 = this;
            r0 = 0
            r1.j(r0)
            return
    }

    @Override // n2.n
    public final void c() {
            r2 = this;
            f0.p r0 = r2.f2939a
            if (r0 == 0) goto L13
            i0.m2 r1 = y1.h1.f21955q
            java.lang.Object r0 = x1.k.h(r0, r1)
            y1.g2 r0 = (y1.g2) r0
            if (r0 == 0) goto L13
            y1.i1 r0 = (y1.i1) r0
            r0.b()
        L13:
            return
    }

    @Override // n2.n
    public final void d() {
            r12 = this;
            qg.e1 r0 = r12.f2940b
            r1 = 0
            if (r0 == 0) goto L8
            r0.a(r1)
        L8:
            r12.f2940b = r1
            tg.n r0 = r12.i()
            if (r0 == 0) goto L3a
            r1 = r0
            tg.r r1 = (tg.r) r1
            monitor-enter(r1)
            long r2 = r1.n()     // Catch: java.lang.Throwable -> L37
            int r0 = r1.f13243q     // Catch: java.lang.Throwable -> L37
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L37
            long r2 = r2 + r4
            long r4 = r1.f13242p     // Catch: java.lang.Throwable -> L37
            long r6 = r1.n()     // Catch: java.lang.Throwable -> L37
            int r0 = r1.f13243q     // Catch: java.lang.Throwable -> L37
            long r8 = (long) r0     // Catch: java.lang.Throwable -> L37
            long r6 = r6 + r8
            long r8 = r1.n()     // Catch: java.lang.Throwable -> L37
            int r0 = r1.f13243q     // Catch: java.lang.Throwable -> L37
            long r10 = (long) r0     // Catch: java.lang.Throwable -> L37
            long r8 = r8 + r10
            int r0 = r1.f13244r     // Catch: java.lang.Throwable -> L37
            long r10 = (long) r0     // Catch: java.lang.Throwable -> L37
            long r8 = r8 + r10
            r1.t(r2, r4, r6, r8)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r1)
            return
        L37:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L3a:
            return
    }

    @Override // n2.n
    public final void e(n2.s r14, n2.s r15) {
            r13 = this;
            f0.u r0 = r13.f2941c
            if (r0 == 0) goto L129
            n2.s r1 = r0.f3006h
            long r1 = r1.f8977b
            long r3 = r15.f8977b
            boolean r1 = i2.m0.b(r1, r3)
            r2 = 0
            if (r1 == 0) goto L20
            n2.s r1 = r0.f3006h
            i2.m0 r1 = r1.f8978c
            i2.m0 r3 = r15.f8978c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L1e
            goto L20
        L1e:
            r1 = r2
            goto L21
        L20:
            r1 = 1
        L21:
            r0.f3006h = r15
            java.util.ArrayList r3 = r0.f3008j
            int r3 = r3.size()
            r4 = r2
        L2a:
            if (r4 >= r3) goto L41
            java.util.ArrayList r5 = r0.f3008j
            java.lang.Object r5 = r5.get(r4)
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            java.lang.Object r5 = r5.get()
            f0.v r5 = (f0.v) r5
            if (r5 == 0) goto L3e
            r5.f3018g = r15
        L3e:
            int r4 = r4 + 1
            goto L2a
        L41:
            f0.r r3 = r0.f3011m
            java.lang.Object r4 = r3.f2982c
            monitor-enter(r4)
            r5 = 0
            r3.f2989j = r5     // Catch: java.lang.Throwable -> L125
            r3.f2991l = r5     // Catch: java.lang.Throwable -> L125
            r3.f2990k = r5     // Catch: java.lang.Throwable -> L125
            r3.f2992m = r5     // Catch: java.lang.Throwable -> L125
            r3.f2993n = r5     // Catch: java.lang.Throwable -> L125
            monitor-exit(r4)
            boolean r3 = gg.l.a(r14, r15)
            r4 = -1
            if (r3 == 0) goto L8f
            if (r1 == 0) goto L129
            f0.n r14 = r0.f3000b
            long r1 = r15.f8977b
            int r7 = i2.m0.f(r1)
            long r1 = r15.f8977b
            int r8 = i2.m0.e(r1)
            n2.s r15 = r0.f3006h
            i2.m0 r15 = r15.f8978c
            if (r15 == 0) goto L77
            long r1 = r15.f6360a
            int r15 = i2.m0.f(r1)
            r9 = r15
            goto L78
        L77:
            r9 = r4
        L78:
            n2.s r15 = r0.f3006h
            i2.m0 r15 = r15.f8978c
            if (r15 == 0) goto L84
            long r0 = r15.f6360a
            int r4 = i2.m0.e(r0)
        L84:
            r10 = r4
            android.view.inputmethod.InputMethodManager r5 = r14.a()
            android.view.View r6 = r14.f2972b
            r5.updateSelection(r6, r7, r8, r9, r10)
            return
        L8f:
            if (r14 == 0) goto Lbf
            i2.g r1 = r14.f8976a
            java.lang.String r1 = r1.f6314h
            i2.g r3 = r15.f8976a
            java.lang.String r3 = r3.f6314h
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto Lb3
            long r5 = r14.f8977b
            long r7 = r15.f8977b
            boolean r1 = i2.m0.b(r5, r7)
            if (r1 == 0) goto Lbf
            i2.m0 r14 = r14.f8978c
            i2.m0 r15 = r15.f8978c
            boolean r14 = gg.l.a(r14, r15)
            if (r14 != 0) goto Lbf
        Lb3:
            f0.n r14 = r0.f3000b
            android.view.inputmethod.InputMethodManager r15 = r14.a()
            android.view.View r14 = r14.f2972b
            r15.restartInput(r14)
            return
        Lbf:
            java.util.ArrayList r14 = r0.f3008j
            int r14 = r14.size()
        Lc5:
            if (r2 >= r14) goto L129
            java.util.ArrayList r15 = r0.f3008j
            java.lang.Object r15 = r15.get(r2)
            java.lang.ref.WeakReference r15 = (java.lang.ref.WeakReference) r15
            java.lang.Object r15 = r15.get()
            f0.v r15 = (f0.v) r15
            if (r15 == 0) goto L122
            n2.s r1 = r0.f3006h
            f0.n r3 = r0.f3000b
            boolean r5 = r15.f3022k
            if (r5 != 0) goto Le0
            goto L122
        Le0:
            r15.f3018g = r1
            boolean r5 = r15.f3020i
            if (r5 == 0) goto Lf5
            int r15 = r15.f3019h
            android.view.inputmethod.ExtractedText r5 = f0.q.d(r1)
            android.view.inputmethod.InputMethodManager r6 = r3.a()
            android.view.View r7 = r3.f2972b
            r6.updateExtractedText(r7, r15, r5)
        Lf5:
            i2.m0 r15 = r1.f8978c
            long r5 = r1.f8977b
            if (r15 == 0) goto L103
            long r7 = r15.f6360a
            int r15 = i2.m0.f(r7)
            r11 = r15
            goto L104
        L103:
            r11 = r4
        L104:
            i2.m0 r15 = r1.f8978c
            if (r15 == 0) goto L110
            long r7 = r15.f6360a
            int r15 = i2.m0.e(r7)
            r12 = r15
            goto L111
        L110:
            r12 = r4
        L111:
            int r9 = i2.m0.f(r5)
            int r10 = i2.m0.e(r5)
            android.view.inputmethod.InputMethodManager r7 = r3.a()
            android.view.View r8 = r3.f2972b
            r7.updateSelection(r8, r9, r10, r11, r12)
        L122:
            int r2 = r2 + 1
            goto Lc5
        L125:
            r0 = move-exception
            r14 = r0
            monitor-exit(r4)
            throw r14
        L129:
            return
    }

    @Override // n2.n
    public final void f() {
            r2 = this;
            f0.p r0 = r2.f2939a
            if (r0 == 0) goto L13
            i0.m2 r1 = y1.h1.f21955q
            java.lang.Object r0 = x1.k.h(r0, r1)
            y1.g2 r0 = (y1.g2) r0
            if (r0 == 0) goto L13
            y1.i1 r0 = (y1.i1) r0
            r0.a()
        L13:
            return
    }

    @Override // n2.n
    public final void g(n2.s r2, b5.k r3, i2.k0 r4, i0.c r5, e1.c r6, e1.c r7) {
            r1 = this;
            f0.u r5 = r1.f2941c
            if (r5 == 0) goto L25
            f0.r r5 = r5.f3011m
            java.lang.Object r0 = r5.f2982c
            monitor-enter(r0)
            r5.f2989j = r2     // Catch: java.lang.Throwable -> L1c
            r5.f2991l = r3     // Catch: java.lang.Throwable -> L1c
            r5.f2990k = r4     // Catch: java.lang.Throwable -> L1c
            r5.f2992m = r6     // Catch: java.lang.Throwable -> L1c
            r5.f2993n = r7     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r5.f2984e     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L1e
            boolean r2 = r5.f2983d     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L21
            goto L1e
        L1c:
            r2 = move-exception
            goto L23
        L1e:
            r5.a()     // Catch: java.lang.Throwable -> L1c
        L21:
            monitor-exit(r0)
            return
        L23:
            monitor-exit(r0)
            throw r2
        L25:
            return
    }

    @Override // n2.n
    public final void h(e1.c r6) {
            r5 = this;
            f0.u r0 = r5.f2941c
            if (r0 == 0) goto L39
            android.graphics.Rect r1 = new android.graphics.Rect
            float r2 = r6.f2296a
            int r2 = ig.a.X(r2)
            float r3 = r6.f2297b
            int r3 = ig.a.X(r3)
            float r4 = r6.f2298c
            int r4 = ig.a.X(r4)
            float r6 = r6.f2299d
            int r6 = ig.a.X(r6)
            r1.<init>(r2, r3, r4, r6)
            r0.f3010l = r1
            java.util.ArrayList r6 = r0.f3008j
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L39
            android.graphics.Rect r6 = r0.f3010l
            if (r6 == 0) goto L39
            android.view.View r0 = r0.f2999a
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r6)
            r0.requestRectangleOnScreen(r1)
        L39:
            return
    }

    public final tg.n i() {
            r2 = this;
            tg.r r0 = r2.f2942d
            if (r0 == 0) goto L5
            return r0
        L5:
            boolean r0 = e0.e.f2289a
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            sg.a r0 = sg.a.f12438i
            r1 = 2
            tg.r r0 = tg.s.a(r1, r0)
            r2.f2942d = r0
            return r0
    }

    public final void j(eb.o r7) {
            r6 = this;
            f0.p r3 = r6.f2939a
            if (r3 != 0) goto L5
            return
        L5:
            ci.e r0 = new ci.e
            r5 = 2
            r4 = 0
            r2 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            boolean r7 = r3.f21832t
            if (r7 != 0) goto L13
            goto L22
        L13:
            qg.t r7 = r3.Y0()
            ci.j r1 = new ci.j
            r5 = 4
            r1.<init>(r3, r0, r4, r5)
            r0 = 1
            qg.e1 r4 = qg.v.q(r7, r4, r1, r0)
        L22:
            r2.f2940b = r4
            return
    }

    public final void k(f0.p r3) {
            r2 = this;
            f0.p r0 = r2.f2939a
            if (r0 != r3) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 != 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected textInputModifierNode to be "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " but was "
            r0.append(r3)
            f0.p r3 = r2.f2939a
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            o.b.c(r3)
        L24:
            r3 = 0
            r2.f2939a = r3
            return
    }
}
