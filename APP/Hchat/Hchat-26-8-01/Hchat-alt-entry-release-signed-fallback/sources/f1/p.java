package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f3103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f3104i;

    public /* synthetic */ p(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f3102g = r2
            r0.f3103h = r1
            r0.f3104i = r3
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.f3102g
            switch(r0) {
                case 0: goto L240;
                case 1: goto L229;
                case 2: goto L212;
                case 3: goto L16f;
                case 4: goto L132;
                case 5: goto L11e;
                case 6: goto L10b;
                case 7: goto Lf4;
                case 8: goto La8;
                case 9: goto L8e;
                case 10: goto L7a;
                case 11: goto L1b;
                default: goto L5;
            }
        L5:
            i0.a0 r15 = (i0.a0) r15
            java.lang.Object r15 = r14.f3103h
            y2.x r15 = (y2.x) r15
            java.lang.Object r0 = r14.f3104i
            y2.b0 r0 = (y2.b0) r0
            r15.setPositionProvider(r0)
            r15.r()
            y2.i r15 = new y2.i
            r15.<init>()
            return r15
        L1b:
            y1.f1 r15 = (y1.f1) r15
            java.lang.Object r0 = r14.f3104i
            fg.p r0 = (fg.p) r0
            java.lang.Object r1 = r14.f3103h
            y1.x2 r1 = (y1.x2) r1
            boolean r2 = r1.f22158i
            if (r2 != 0) goto L77
            androidx.lifecycle.q r2 = r15.f21890c
            android.view.View r3 = r15.f21888a
            androidx.lifecycle.s r2 = r2.f()
            r1.f22160k = r0
            androidx.lifecycle.s r4 = r1.f22159j
            if (r4 != 0) goto L5a
            android.os.Looper r15 = android.os.Looper.myLooper()
            android.os.Handler r0 = r3.getHandler()
            android.os.Looper r0 = r0.getLooper()
            boolean r15 = gg.l.a(r15, r0)
            if (r15 != 0) goto L54
            rb.g r15 = new rb.g
            r0 = 20
            r15.<init>(r1, r0, r2)
            r3.post(r15)
            goto L77
        L54:
            r1.f22159j = r2
            r2.a(r1)
            goto L77
        L5a:
            androidx.lifecycle.l r2 = r2.f300c
            androidx.lifecycle.l r3 = androidx.lifecycle.l.f291i
            int r2 = r2.compareTo(r3)
            if (r2 < 0) goto L77
            i0.q r2 = r1.f22157h
            y1.g1 r3 = new y1.g1
            r3.<init>(r1, r15, r0)
            s0.d r15 = new s0.d
            r0 = -1723985096(0xffffffff993e1338, float:-9.826651E-24)
            r1 = 1
            r15.<init>(r0, r3, r1)
            r2.A(r15)
        L77:
            sf.n r15 = sf.n.f12433a
            return r15
        L7a:
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            java.lang.Object r15 = r14.f3103h
            i0.d r15 = (i0.d) r15
            java.lang.Object r15 = r15.f5860h
            android.view.Choreographer r15 = (android.view.Choreographer) r15
            java.lang.Object r0 = r14.f3104i
            y1.o0 r0 = (y1.o0) r0
            r15.removeFrameCallback(r0)
            sf.n r15 = sf.n.f12433a
            return r15
        L8e:
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            java.lang.Object r15 = r14.f3103h
            y1.n0 r15 = (y1.n0) r15
            java.lang.Object r0 = r14.f3104i
            y1.o0 r0 = (y1.o0) r0
            java.lang.Object r1 = r15.f22008k
            monitor-enter(r1)
            java.util.ArrayList r15 = r15.f22010m     // Catch: java.lang.Throwable -> La4
            r15.remove(r0)     // Catch: java.lang.Throwable -> La4
            monitor-exit(r1)
            sf.n r15 = sf.n.f12433a
            return r15
        La4:
            r0 = move-exception
            r15 = r0
            monitor-exit(r1)
            throw r15
        La8:
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            java.lang.Object r15 = r14.f3103h
            y1.s1 r15 = (y1.s1) r15
            java.lang.Object r1 = r15.f22070c
            monitor-enter(r1)
            r0 = 1
            r15.f22072e = r0     // Catch: java.lang.Throwable -> Ld6
            j0.b r0 = r15.f22071d     // Catch: java.lang.Throwable -> Ld6
            java.lang.Object[] r2 = r0.f6671g     // Catch: java.lang.Throwable -> Ld6
            int r0 = r0.f6673i     // Catch: java.lang.Throwable -> Ld6
            r3 = 0
        Lbb:
            r4 = 0
            if (r3 >= r0) goto Ld9
            r5 = r2[r3]     // Catch: java.lang.Throwable -> Ld6
            x1.g2 r5 = (x1.g2) r5     // Catch: java.lang.Throwable -> Ld6
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> Ld6
            n2.l r5 = (n2.l) r5     // Catch: java.lang.Throwable -> Ld6
            if (r5 == 0) goto Ld3
            f0.v r6 = r5.f8961b     // Catch: java.lang.Throwable -> Ld6
            if (r6 == 0) goto Ld3
            r6.closeConnection()     // Catch: java.lang.Throwable -> Ld6
            r5.f8961b = r4     // Catch: java.lang.Throwable -> Ld6
        Ld3:
            int r3 = r3 + 1
            goto Lbb
        Ld6:
            r0 = move-exception
            r15 = r0
            goto Lf2
        Ld9:
            j0.b r15 = r15.f22071d     // Catch: java.lang.Throwable -> Ld6
            r15.g()     // Catch: java.lang.Throwable -> Ld6
            monitor-exit(r1)
            java.lang.Object r15 = r14.f3104i
            y1.k0 r15 = (y1.k0) r15
            n2.t r15 = r15.f21988h
            java.util.concurrent.atomic.AtomicReference r0 = r15.f8980b
            r0.set(r4)
            n2.n r15 = r15.f8979a
            r15.d()
            sf.n r15 = sf.n.f12433a
            return r15
        Lf2:
            monitor-exit(r1)
            throw r15
        Lf4:
            qg.t r15 = (qg.t) r15
            y1.s1 r15 = new y1.s1
            java.lang.Object r0 = r14.f3103h
            f0.u r0 = (f0.u) r0
            d1.c0 r1 = new d1.c0
            java.lang.Object r2 = r14.f3104i
            y1.k0 r2 = (y1.k0) r2
            r3 = 18
            r1.<init>(r2, r3)
            r15.<init>(r0, r1)
            return r15
        L10b:
            v1.a1 r15 = (v1.a1) r15
            java.lang.Object r0 = r14.f3103h
            v1.b1 r0 = (v1.b1) r0
            java.lang.Object r1 = r14.f3104i
            y0.s r1 = (y0.s) r1
            float r1 = r1.f21836u
            r2 = 0
            r15.A(r0, r2, r2, r1)
            sf.n r15 = sf.n.f12433a
            return r15
        L11e:
            y0.o r15 = (y0.o) r15
            java.lang.Object r0 = r14.f3103h
            x1.f0 r0 = (x1.f0) r0
            java.lang.Object r1 = r14.f3104i
            y0.o r1 = (y0.o) r1
            y0.o r15 = r15.d(r1)
            r0.d0(r15)
            sf.n r15 = sf.n.f12433a
            return r15
        L132:
            java.lang.String r0 = "onTouchEvent"
            android.view.MotionEvent r15 = (android.view.MotionEvent) r15
            java.lang.Object r1 = r14.f3104i
            s1.a0 r1 = (s1.a0) r1
            int r2 = r15.getActionMasked()
            r3 = 0
            if (r2 != 0) goto L161
            java.lang.Object r2 = r14.f3103h
            hb.c r2 = (hb.c) r2
            s1.b0 r1 = r1.f12203a
            if (r1 == 0) goto L15d
            java.lang.Object r15 = r1.invoke(r15)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L158
            s1.y r15 = s1.y.f12325h
            goto L15a
        L158:
            s1.y r15 = s1.y.f12326i
        L15a:
            r2.f5339h = r15
            goto L168
        L15d:
            gg.l.g(r0)
            throw r3
        L161:
            s1.b0 r1 = r1.f12203a
            if (r1 == 0) goto L16b
            r1.invoke(r15)
        L168:
            sf.n r15 = sf.n.f12433a
            return r15
        L16b:
            gg.l.g(r0)
            throw r3
        L16f:
            h1.d r15 = (h1.d) r15
            java.lang.Object r0 = r14.f3103h
            r1 = r0
            h1.d r1 = (h1.d) r1
            b5.c r0 = r15.z0()
            u2.c r0 = r0.s()
            b5.c r2 = r15.z0()
            u2.m r2 = r2.u()
            b5.c r3 = r15.z0()
            f1.u r3 = r3.p()
            b5.c r4 = r15.z0()
            long r4 = r4.v()
            b5.c r15 = r15.z0()
            java.lang.Object r15 = r15.f470b
            i1.b r15 = (i1.b) r15
            java.lang.Object r6 = r14.f3104i
            fg.l r6 = (fg.l) r6
            b5.c r7 = r1.z0()
            u2.c r7 = r7.s()
            b5.c r8 = r1.z0()
            u2.m r8 = r8.u()
            b5.c r9 = r1.z0()
            f1.u r9 = r9.p()
            b5.c r10 = r1.z0()
            long r10 = r10.v()
            b5.c r12 = r1.z0()
            java.lang.Object r12 = r12.f470b
            i1.b r12 = (i1.b) r12
            b5.c r13 = r1.z0()
            r13.R(r0)
            r13.S(r2)
            r13.P(r3)
            r13.U(r4)
            r13.f470b = r15
            r3.e()
            r6.invoke(r1)     // Catch: java.lang.Throwable -> L1fa
            r3.p()
            b5.c r15 = r1.z0()
            r15.R(r7)
            r15.S(r8)
            r15.P(r9)
            r15.U(r10)
            r15.f470b = r12
            sf.n r15 = sf.n.f12433a
            return r15
        L1fa:
            r0 = move-exception
            r15 = r0
            r3.p()
            b5.c r0 = r1.z0()
            r0.R(r7)
            r0.S(r8)
            r0.P(r9)
            r0.U(r10)
            r0.f470b = r12
            throw r15
        L212:
            v1.a1 r15 = (v1.a1) r15
            java.lang.Object r0 = r14.f3103h
            v1.b1 r0 = (v1.b1) r0
            java.lang.Object r1 = r14.f3104i
            h.e0 r1 = (h.e0) r1
            i0.f1 r1 = r1.f4652c
            float r1 = r1.g()
            r2 = 0
            r15.A(r0, r2, r2, r1)
            sf.n r15 = sf.n.f12433a
            return r15
        L229:
            r0 = r15
            v1.a1 r0 = (v1.a1) r0
            java.lang.Object r15 = r14.f3103h
            r1 = r15
            v1.b1 r1 = (v1.b1) r1
            java.lang.Object r15 = r14.f3104i
            f1.s0 r15 = (f1.s0) r15
            b1.f r4 = r15.G
            r5 = 4
            r2 = 0
            r3 = 0
            v1.a1.G(r0, r1, r2, r3, r4, r5)
            sf.n r15 = sf.n.f12433a
            return r15
        L240:
            r0 = r15
            v1.a1 r0 = (v1.a1) r0
            java.lang.Object r15 = r14.f3103h
            r1 = r15
            v1.b1 r1 = (v1.b1) r1
            java.lang.Object r15 = r14.f3104i
            f1.q r15 = (f1.q) r15
            fg.l r4 = r15.f3107u
            r5 = 4
            r2 = 0
            r3 = 0
            v1.a1.G(r0, r1, r2, r3, r4, r5)
            sf.n r15 = sf.n.f12433a
            return r15
    }
}
