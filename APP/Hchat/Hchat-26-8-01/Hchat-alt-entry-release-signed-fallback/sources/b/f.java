package b;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object f335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object f336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Object f337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Object f338e;

    public void a() {
            r2 = this;
            java.lang.Object r0 = r2.f336c
            tf.k r0 = (tf.k) r0
            int r1 = r0.a()
            java.util.ListIterator r0 = r0.listIterator(r1)
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L1d
            java.lang.Object r0 = r0.previous()
            r1 = r0
            b.g r1 = (b.g) r1
            r1.getClass()
            goto L1e
        L1d:
            r0 = 0
        L1e:
            b.g r0 = (b.g) r0
            if (r0 == 0) goto L28
            y2.a r1 = r0.f340b
            r1.invoke(r0)
            return
        L28:
            java.lang.Object r0 = r2.f335b
            a1.a r0 = (a1.a) r0
            r0.run()
            return
    }

    public int b(p4.t r19, y1.t r20, boolean r21) {
            r18 = this;
            r1 = r18
            java.lang.Object r0 = r1.f336c
            s1.d r0 = (s1.d) r0
            java.lang.Object r2 = r1.f338e
            x1.p r2 = (x1.p) r2
            boolean r3 = r1.f334a
            r4 = 0
            if (r3 == 0) goto L10
            return r4
        L10:
            r3 = 1
            r1.f334a = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r5 = r1.f337d     // Catch: java.lang.Throwable -> L3c
            m.a r5 = (m.a) r5     // Catch: java.lang.Throwable -> L3c
            r6 = r19
            r7 = r20
            h0.q0 r5 = r5.t(r6, r7)     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r6 = r5.f4971c     // Catch: java.lang.Throwable -> L3c
            f.p r6 = (f.p) r6     // Catch: java.lang.Throwable -> L3c
            int r7 = r6.d()     // Catch: java.lang.Throwable -> L3c
            r8 = r4
        L28:
            if (r8 >= r7) goto L41
            java.lang.Object r9 = r6.e(r8)     // Catch: java.lang.Throwable -> L3c
            s1.t r9 = (s1.t) r9     // Catch: java.lang.Throwable -> L3c
            boolean r10 = r9.f12294d     // Catch: java.lang.Throwable -> L3c
            if (r10 != 0) goto L3f
            boolean r9 = r9.f12298h     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L39
            goto L3f
        L39:
            int r8 = r8 + 1
            goto L28
        L3c:
            r0 = move-exception
            goto Ld4
        L3f:
            r7 = r4
            goto L42
        L41:
            r7 = r3
        L42:
            int r8 = r6.d()     // Catch: java.lang.Throwable -> L3c
            r9 = r4
        L47:
            if (r9 >= r8) goto L83
            java.lang.Object r10 = r6.e(r9)     // Catch: java.lang.Throwable -> L3c
            s1.t r10 = (s1.t) r10     // Catch: java.lang.Throwable -> L3c
            if (r7 != 0) goto L57
            boolean r11 = s1.s.b(r10)     // Catch: java.lang.Throwable -> L3c
            if (r11 == 0) goto L80
        L57:
            java.lang.Object r11 = r1.f335b     // Catch: java.lang.Throwable -> L3c
            r12 = r11
            x1.f0 r12 = (x1.f0) r12     // Catch: java.lang.Throwable -> L3c
            long r13 = r10.f12293c     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r11 = r1.f338e     // Catch: java.lang.Throwable -> L3c
            r15 = r11
            x1.p r15 = (x1.p) r15     // Catch: java.lang.Throwable -> L3c
            int r11 = r10.f12299i     // Catch: java.lang.Throwable -> L3c
            r17 = 1
            r16 = r11
            r12.z(r13, r15, r16, r17)     // Catch: java.lang.Throwable -> L3c
            f.f0 r11 = r2.f21015g     // Catch: java.lang.Throwable -> L3c
            boolean r11 = r11.h()     // Catch: java.lang.Throwable -> L3c
            if (r11 != 0) goto L80
            long r11 = r10.f12291a     // Catch: java.lang.Throwable -> L3c
            boolean r10 = s1.s.b(r10)     // Catch: java.lang.Throwable -> L3c
            r0.a(r11, r2, r10)     // Catch: java.lang.Throwable -> L3c
            r2.clear()     // Catch: java.lang.Throwable -> L3c
        L80:
            int r9 = r9 + 1
            goto L47
        L83:
            r2 = r21
            boolean r0 = r0.b(r5, r2)     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r5.f4970b     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L8f
        L8d:
            r2 = r4
            goto Lb3
        L8f:
            int r2 = r6.d()     // Catch: java.lang.Throwable -> L3c
            r5 = r4
        L94:
            if (r5 >= r2) goto L8d
            java.lang.Object r7 = r6.e(r5)     // Catch: java.lang.Throwable -> L3c
            s1.t r7 = (s1.t) r7     // Catch: java.lang.Throwable -> L3c
            long r8 = s1.s.h(r7, r3)     // Catch: java.lang.Throwable -> L3c
            r10 = 0
            boolean r8 = e1.b.b(r8, r10)     // Catch: java.lang.Throwable -> L3c
            if (r8 != 0) goto Lb0
            boolean r7 = r7.b()     // Catch: java.lang.Throwable -> L3c
            if (r7 == 0) goto Lb0
            r2 = r3
            goto Lb3
        Lb0:
            int r5 = r5 + 1
            goto L94
        Lb3:
            int r5 = r6.d()     // Catch: java.lang.Throwable -> L3c
            r7 = r4
        Lb8:
            if (r7 >= r5) goto Lcb
            java.lang.Object r8 = r6.e(r7)     // Catch: java.lang.Throwable -> L3c
            s1.t r8 = (s1.t) r8     // Catch: java.lang.Throwable -> L3c
            boolean r8 = r8.b()     // Catch: java.lang.Throwable -> L3c
            if (r8 == 0) goto Lc8
            r5 = r3
            goto Lcc
        Lc8:
            int r7 = r7 + 1
            goto Lb8
        Lcb:
            r5 = r4
        Lcc:
            int r2 = r2 << r3
            r0 = r0 | r2
            int r2 = r5 << 2
            r0 = r0 | r2
            r1.f334a = r4
            return r0
        Ld4:
            r1.f334a = r4
            throw r0
    }

    public void c(int r4, int r5) {
            r3 = this;
            float r0 = (float) r4
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L7
            goto L1d
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Index should be non-negative ("
            r0.<init>(r1)
            r0.append(r4)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            o.b.a(r0)
        L1d:
            java.lang.Object r0 = r3.f335b
            i0.g1 r0 = (i0.g1) r0
            r0.h(r4)
            java.lang.Object r0 = r3.f338e
            s.g0 r0 = (s.g0) r0
            int r1 = r0.f12015h
            if (r4 == r1) goto L44
            r0.f12015h = r4
            int r4 = r4 / 30
            int r4 = r4 * 30
            int r1 = r4 + (-100)
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            int r4 = r4 + 130
            lg.d r4 = r9.e0.r0(r1, r4)
            i0.j1 r0 = r0.f12014g
            r0.setValue(r4)
        L44:
            java.lang.Object r4 = r3.f336c
            i0.g1 r4 = (i0.g1) r4
            r4.h(r5)
            return
    }

    public void d() {
            r7 = this;
            java.lang.Object r0 = r7.f336c
            tf.k r0 = (tf.k) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L10
        Le:
            r0 = r2
            goto L24
        L10:
            java.util.Iterator r0 = r0.iterator()
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Le
            java.lang.Object r0 = r0.next()
            b.g r0 = (b.g) r0
            r0.getClass()
            r0 = r1
        L24:
            java.lang.Object r3 = r7.f338e
            android.window.OnBackInvokedDispatcher r3 = (android.window.OnBackInvokedDispatcher) r3
            java.lang.Object r4 = r7.f337d
            android.window.OnBackInvokedCallback r4 = (android.window.OnBackInvokedCallback) r4
            if (r3 == 0) goto L49
            if (r4 == 0) goto L49
            b.c r5 = b.c.f325a
            if (r0 == 0) goto L3e
            boolean r6 = r7.f334a
            if (r6 != 0) goto L3e
            r5.b(r3, r2, r4)
            r7.f334a = r1
            return
        L3e:
            if (r0 != 0) goto L49
            boolean r0 = r7.f334a
            if (r0 == 0) goto L49
            r5.c(r3, r4)
            r7.f334a = r2
        L49:
            return
    }
}
