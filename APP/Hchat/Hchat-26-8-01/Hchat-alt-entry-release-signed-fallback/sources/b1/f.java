package b1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f436h;

    public /* synthetic */ f(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f435g = r2
            r0.f436h = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r17) {
            r16 = this;
            r1 = r16
            r0 = r17
            int r2 = r1.f435g
            r3 = 0
            java.lang.String r4 = "(this)"
            r5 = 1
            r6 = 0
            r7 = 0
            sf.n r8 = sf.n.f12433a
            java.lang.Object r9 = r1.f436h
            switch(r2) {
                case 0: goto L40b;
                case 1: goto L3fe;
                case 2: goto L3d9;
                case 3: goto L3cd;
                case 4: goto L3c1;
                case 5: goto L3b5;
                case 6: goto L3a9;
                case 7: goto L351;
                case 8: goto L345;
                case 9: goto L333;
                case 10: goto L31f;
                case 11: goto L315;
                case 12: goto L2c5;
                case 13: goto L277;
                case 14: goto L266;
                case 15: goto L256;
                case 16: goto L1ca;
                case 17: goto L1be;
                case 18: goto L1b4;
                case 19: goto L19a;
                case 20: goto L189;
                case 21: goto L97;
                case 22: goto L88;
                case 23: goto L7b;
                case 24: goto L70;
                case 25: goto L62;
                case 26: goto L46;
                default: goto L13;
            }
        L13:
            n2.l r0 = (n2.l) r0
            f0.v r2 = r0.f8961b
            if (r2 == 0) goto L1e
            r2.closeConnection()
            r0.f8961b = r6
        L1e:
            y1.s1 r9 = (y1.s1) r9
            j0.b r2 = r9.f22071d
            java.lang.Object[] r3 = r2.f6671g
            int r4 = r2.f6673i
        L26:
            if (r7 >= r4) goto L36
            r5 = r3[r7]
            x1.g2 r5 = (x1.g2) r5
            boolean r5 = gg.l.a(r5, r0)
            if (r5 == 0) goto L33
            goto L37
        L33:
            int r7 = r7 + 1
            goto L26
        L36:
            r7 = -1
        L37:
            if (r7 < 0) goto L3c
            r2.k(r7)
        L3c:
            int r0 = r2.f6673i
            if (r0 != 0) goto L45
            d1.c0 r0 = r9.f22069b
            r0.invoke()
        L45:
            return r8
        L46:
            h1.d r0 = (h1.d) r0
            y1.o1 r9 = (y1.o1) r9
            b5.c r2 = r0.z0()
            f1.u r2 = r2.p()
            fg.p r3 = r9.f22028j
            if (r3 == 0) goto L61
            b5.c r0 = r0.z0()
            java.lang.Object r0 = r0.f470b
            i1.b r0 = (i1.b) r0
            r3.invoke(r2, r0)
        L61:
            return r8
        L62:
            java.util.concurrent.atomic.AtomicBoolean r0 = y1.n1.f22017b
            boolean r0 = r0.compareAndSet(r7, r5)
            if (r0 == 0) goto L6f
            sg.c r9 = (sg.c) r9
            r9.p(r8)
        L6f:
            return r8
        L70:
            i0.a0 r0 = (i0.a0) r0
            y1.k1 r9 = (y1.k1) r9
            b0.m r0 = new b0.m
            r2 = 7
            r0.<init>(r9, r2)
            return r0
        L7b:
            f2.q r0 = (f2.q) r0
            android.content.res.Resources r9 = (android.content.res.Resources) r9
            boolean r0 = y1.g0.c(r0, r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L88:
            f2.q r0 = (f2.q) r0
            f.k r9 = (f.k) r9
            int r0 = r0.f3215f
            boolean r0 = r9.a(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L97:
            r2 = r9
            r9 = r0
            x1.k0 r9 = (x1.k0) r9
            r0 = r2
            y1.k r0 = (y1.k) r0
            y1.t r0 = r0.f21986v
            v1.n r2 = r0.getInsetsListener()
            i0.g1 r2 = r2.f13995n
            int r2 = r2.g()
            if (r2 <= 0) goto L188
            f.w r2 = v1.q1.f14021a
            r9.f20970g = r5
            x1.n0 r2 = r9.f20973j
            v1.t r3 = r2.T0()
            long r4 = r9.f20971h
            r10 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            boolean r4 = u2.j.b(r4, r10)
            if (r4 == 0) goto Ld5
            r4 = 0
            long r4 = r3.P(r4)
            long r4 = ig.a.W(r4)
            r9.f20971h = r4
            long r4 = r3.F()
            r9.f20972i = r4
        Ld5:
            x1.f0 r2 = r2.Y0()
            x1.j0 r2 = r2.M
            r2.b()
            long r2 = r3.F()
            v1.n r4 = r0.getInsetsListener()
            f.k0 r4 = r4.f13994m
            r5 = 32
            long r5 = r2 >> r5
            int r13 = (int) r5
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r5
            int r14 = (int) r2
            v1.o1[] r2 = v1.q1.f14022b
            int r3 = r2.length
            r5 = r7
        Lf8:
            if (r5 >= r3) goto L135
            r6 = r2[r5]
            java.lang.Object r10 = r4.g(r6)
            r10.getClass()
            r15 = r10
            v1.r1 r15 = (v1.r1) r15
            v1.p1 r6 = (v1.p1) r6
            v1.m r10 = r6.f14013c
            long r11 = r15.f14037h
            v1.q1.a(r9, r10, r11, r13, r14)
            i0.j1 r10 = r15.f14031b
            java.lang.Object r10 = r10.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L12b
            v1.m r10 = r15.f14035f
            long r11 = r15.f14039j
            v1.q1.a(r9, r10, r11, r13, r14)
            v1.m r10 = r15.f14036g
            long r11 = r15.f14040k
            v1.q1.a(r9, r10, r11, r13, r14)
        L12b:
            v1.m r10 = r6.f14014d
            long r11 = r15.f14038i
            v1.q1.a(r9, r10, r11, r13, r14)
            int r5 = r5 + 1
            goto Lf8
        L135:
            v1.n r2 = r0.getInsetsListener()
            f.f0 r2 = r2.f13996o
            boolean r3 = r2.i()
            if (r3 == 0) goto L188
            v1.n r0 = r0.getInsetsListener()
            w0.p r0 = r0.f13997p
            java.lang.Object[] r3 = r2.f2803a
            int r2 = r2.f2804b
        L14b:
            if (r7 >= r2) goto L188
            r4 = r3[r7]
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r0.get(r7)
            v1.m r5 = (v1.m) r5
            java.lang.Object r4 = r4.getValue()
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            v1.l r6 = r5.b()
            int r10 = r4.left
            float r10 = (float) r10
            r9.e(r6, r10)
            v1.l r6 = r5.d()
            int r10 = r4.top
            float r10 = (float) r10
            r9.e(r6, r10)
            v1.l r6 = r5.c()
            int r10 = r4.right
            float r10 = (float) r10
            r9.e(r6, r10)
            v1.l r5 = r5.a()
            int r4 = r4.bottom
            float r4 = (float) r4
            r9.e(r5, r4)
            int r7 = r7 + 1
            goto L14b
        L188:
            return r8
        L189:
            r2 = r9
            d1.b0 r0 = (d1.b0) r0
            r9 = r2
            d1.f r9 = (d1.f) r9
            int r2 = r9.f1920a
            boolean r0 = r0.r1(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L19a:
            r2 = r9
            e1.c r0 = (e1.c) r0
            r9 = r2
            x2.n r9 = (x2.n) r9
            boolean r2 = r9.f21832t
            if (r2 == 0) goto L1b3
            qg.t r2 = r9.Y0()
            ci.j r3 = new ci.j
            r4 = 23
            r3.<init>(r9, r0, r6, r4)
            r0 = 3
            qg.v.q(r2, r6, r3, r0)
        L1b3:
            return r8
        L1b4:
            r2 = r9
            u2.c r0 = (u2.c) r0
            r9 = r2
            x1.f0 r9 = (x1.f0) r9
            r9.Z(r0)
            return r8
        L1be:
            r2 = r9
            y0.m r0 = (y0.m) r0
            r9 = r2
            j0.b r9 = (j0.b) r9
            r9.b(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L1ca:
            r2 = r9
            x1.a r0 = (x1.a) r0
            r9 = r2
            x1.g0 r9 = (x1.g0) r9
            int r2 = r0.H()
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r3) goto L1db
            goto L255
        L1db:
            x1.g0 r2 = r0.e()
            boolean r2 = r2.f20916b
            if (r2 == 0) goto L1e6
            r0.h0()
        L1e6:
            x1.g0 r2 = r0.e()
            java.util.HashMap r2 = r2.f20921g
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1f4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L218
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            v1.j r4 = (v1.j) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            x1.r r5 = r0.A()
            x1.g0.a(r9, r4, r3, r5)
            goto L1f4
        L218:
            x1.r r0 = r0.A()
            x1.i1 r0 = r0.f20945w
            r0.getClass()
        L221:
            v1.b1 r2 = r9.f20915a
            x1.r r2 = r2.A()
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L255
            java.util.Map r2 = r9.b(r0)
            java.util.Set r2 = r2.keySet()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L23b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L24f
            java.lang.Object r3 = r2.next()
            v1.j r3 = (v1.j) r3
            int r4 = r9.c(r0, r3)
            x1.g0.a(r9, r3, r4, r0)
            goto L23b
        L24f:
            x1.i1 r0 = r0.f20945w
            r0.getClass()
            goto L221
        L255:
            return r8
        L256:
            r2 = r9
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r9 = r2
            s1.k0 r9 = (s1.k0) r9
            qg.g r2 = r9.f12270i
            if (r2 == 0) goto L263
            r2.w(r0)
        L263:
            r9.f12270i = r6
            return r8
        L266:
            r2 = r9
            m1.c0 r0 = (m1.c0) r0
            r9 = r2
            m1.c r9 = (m1.c) r9
            r9.g(r0)
            fg.l r2 = r9.f8513i
            if (r2 == 0) goto L276
            r2.invoke(r0)
        L276:
            return r8
        L277:
            r2 = r9
            h1.d r0 = (h1.d) r0
            r9 = r2
            i1.b r9 = (i1.b) r9
            f1.j r2 = r9.f6144l
            boolean r3 = r9.f6146n
            if (r3 == 0) goto L2c1
            boolean r3 = r9.f6155w
            if (r3 == 0) goto L2c1
            if (r2 == 0) goto L2c1
            b5.c r3 = r0.z0()
            long r4 = r3.v()
            f1.u r6 = r3.p()
            r6.e()
            java.lang.Object r6 = r3.f469a     // Catch: java.lang.Throwable -> L2b5
            androidx.lifecycle.x r6 = (androidx.lifecycle.x) r6     // Catch: java.lang.Throwable -> L2b5
            java.lang.Object r6 = r6.f310h     // Catch: java.lang.Throwable -> L2b5
            b5.c r6 = (b5.c) r6     // Catch: java.lang.Throwable -> L2b5
            f1.u r6 = r6.p()     // Catch: java.lang.Throwable -> L2b5
            r6.d(r2)     // Catch: java.lang.Throwable -> L2b5
            r9.c(r0)     // Catch: java.lang.Throwable -> L2b5
            f1.u r0 = r3.p()
            r0.p()
            r3.U(r4)
            goto L2c4
        L2b5:
            r0 = move-exception
            f1.u r2 = r3.p()
            r2.p()
            r3.U(r4)
            throw r0
        L2c1:
            r9.c(r0)
        L2c4:
            return r8
        L2c5:
            r2 = r9
            i.p r0 = (i.p) r0
            float r4 = r0.f5743b
            int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r5 >= 0) goto L2cf
            r4 = r3
        L2cf:
            r5 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 <= 0) goto L2d6
            r4 = r5
        L2d6:
            float r6 = r0.f5744c
            r7 = -1090519040(0xffffffffbf000000, float:-0.5)
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 >= 0) goto L2df
            r6 = r7
        L2df:
            r8 = 1056964608(0x3f000000, float:0.5)
            int r9 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r9 <= 0) goto L2e6
            r6 = r8
        L2e6:
            float r9 = r0.f5745d
            int r10 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r10 >= 0) goto L2ed
            goto L2ee
        L2ed:
            r7 = r9
        L2ee:
            int r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r9 <= 0) goto L2f3
            goto L2f4
        L2f3:
            r8 = r7
        L2f4:
            float r0 = r0.f5742a
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 >= 0) goto L2fb
            goto L2fc
        L2fb:
            r3 = r0
        L2fc:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L301
            goto L302
        L301:
            r5 = r3
        L302:
            g1.m r0 = g1.e.f4091x
            long r3 = f1.c0.b(r4, r6, r8, r5, r0)
            r9 = r2
            g1.c r9 = (g1.c) r9
            long r2 = f1.w.a(r3, r9)
            f1.w r0 = new f1.w
            r0.<init>(r2)
            return r0
        L315:
            r2 = r9
            boolean r0 = gg.l.a(r0, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L31f:
            r2 = r9
            java.util.List r0 = (java.util.List) r0
            r9 = r2
            s.u0 r9 = (s.u0) r9
            java.lang.Object r2 = r9.invoke()
            java.lang.Float r2 = (java.lang.Float) r2
            r0.add(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L333:
            r2 = r9
            f2.y r0 = (f2.y) r0
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            mg.d[] r2 = f2.w.f3251a
            f2.x r2 = f2.u.f3223a
            java.util.List r3 = a.a.x0(r9)
            r0.a(r2, r3)
            return r8
        L345:
            r2 = r9
            f2.y r0 = (f2.y) r0
            r9 = r2
            f2.i r9 = (f2.i) r9
            int r2 = r9.f3155a
            f2.w.c(r0, r2)
            return r8
        L351:
            r2 = r9
            f1.d0 r0 = (f1.d0) r0
            r9 = r2
            f1.s0 r9 = (f1.s0) r9
            float r2 = r9.f3114u
            r0.q(r2)
            float r2 = r9.f3115v
            r0.i(r2)
            float r2 = r9.f3116w
            r0.n(r2)
            r0.s(r3)
            r0.g(r3)
            float r2 = r9.f3117x
            r0.c(r2)
            r0.l()
            r0.o()
            r0.f(r3)
            float r2 = r9.f3118y
            r0.u(r2)
            long r2 = r9.f3119z
            r0.H0(r2)
            f1.r0 r2 = r9.A
            r0.Q0(r2)
            boolean r2 = r9.B
            r0.r(r2)
            r0.I()
            long r2 = r9.C
            r0.p(r2)
            long r2 = r9.D
            r0.t(r2)
            r0.Y(r7)
            int r2 = r9.E
            r0.h(r2)
            f1.n r2 = r9.F
            r0.k(r2)
            return r8
        L3a9:
            r2 = r9
            r9 = r2
            f.l0 r9 = (f.l0) r9
            if (r0 != r9) goto L3b0
            goto L3b4
        L3b0:
            java.lang.String r4 = java.lang.String.valueOf(r0)
        L3b4:
            return r4
        L3b5:
            r2 = r9
            r9 = r2
            f.g0 r9 = (f.g0) r9
            if (r0 != r9) goto L3bc
            goto L3c0
        L3bc:
            java.lang.String r4 = java.lang.String.valueOf(r0)
        L3c0:
            return r4
        L3c1:
            r2 = r9
            r9 = r2
            f.f0 r9 = (f.f0) r9
            if (r0 != r9) goto L3c8
            goto L3cc
        L3c8:
            java.lang.String r4 = java.lang.String.valueOf(r0)
        L3cc:
            return r4
        L3cd:
            r2 = r9
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L3d8
            r9 = r2
            android.os.CancellationSignal r9 = (android.os.CancellationSignal) r9
            r9.cancel()
        L3d8:
            return r8
        L3d9:
            r2 = r9
            f1.d0 r0 = (f1.d0) r0
            r9 = r2
            c1.p r9 = (c1.p) r9
            float r2 = l.f.f7628d
            float r3 = r0.d()
            float r3 = r3 * r2
            r0.c(r3)
            f1.r0 r2 = r9.f1002a
            r0.Q0(r2)
            boolean r2 = r9.f1003b
            r0.r(r2)
            long r2 = r9.f1004c
            r0.p(r2)
            long r2 = r9.f1005d
            r0.t(r2)
            return r8
        L3fe:
            r2 = r9
            x1.h0 r0 = (x1.h0) r0
            r9 = r2
            i0.w1 r9 = (i0.w1) r9
            r9.invoke(r0)
            r0.e()
            return r8
        L40b:
            r2 = r9
            b1.h r0 = (b1.h) r0
            y0.n r3 = r0.f21819g
            boolean r3 = r3.f21832t
            if (r3 != 0) goto L417
            x1.d2 r0 = x1.d2.f20873h
            goto L434
        L417:
            b1.h r3 = r0.f442v
            x1.d2 r4 = x1.d2.f20872g
            if (r3 == 0) goto L42f
            r9 = r2
            androidx.lifecycle.x r9 = (androidx.lifecycle.x) r9
            b1.f r2 = new b1.f
            r2.<init>(r9, r7)
            java.lang.Object r5 = r2.invoke(r3)
            if (r5 == r4) goto L42c
            goto L42f
        L42c:
            x1.k.B(r3, r2)
        L42f:
            r0.f442v = r6
            r0.f441u = r6
            r0 = r4
        L434:
            return r0
    }
}
