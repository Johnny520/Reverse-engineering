package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h0.d1 f4995h;

    public /* synthetic */ t0(h0.d1 r1, int r2) {
            r0 = this;
            r0.f4994g = r2
            r0.f4995h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r23) {
            r22 = this;
            r0 = r22
            int r1 = r0.f4994g
            h0.d1 r2 = r0.f4995h
            switch(r1) {
                case 0: goto L1e;
                case 1: goto L13;
                default: goto L9;
            }
        L9:
            r1 = r23
            e1.b r1 = (e1.b) r1
            r2.r()
            sf.n r1 = sf.n.f12433a
            return r1
        L13:
            r1 = r23
            i0.a0 r1 = (i0.a0) r1
            b0.m r1 = new b0.m
            r3 = 6
            r1.<init>(r2, r3)
            return r1
        L1e:
            r1 = r23
            v1.t r1 = (v1.t) r1
            w.q0 r3 = r2.f4850d
            e1.c r4 = e1.c.f2295e
            if (r3 == 0) goto L141
            boolean r6 = r3.f14615p
            if (r6 != 0) goto L2d
            goto L2e
        L2d:
            r3 = 0
        L2e:
            if (r3 == 0) goto L141
            b5.k r6 = r2.f4848b
            n2.s r7 = r2.n()
            long r7 = r7.f8977b
            int r9 = i2.m0.f6359c
            r9 = 32
            long r7 = r7 >> r9
            int r7 = (int) r7
            r6.l(r7)
            b5.k r6 = r2.f4848b
            n2.s r8 = r2.n()
            long r10 = r8.f8977b
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r12
            int r8 = (int) r10
            r6.l(r8)
            w.q0 r6 = r2.f4850d
            r10 = 0
            if (r6 == 0) goto L69
            v1.t r6 = r6.c()
            if (r6 == 0) goto L69
            r14 = 1
            long r14 = r2.l(r14)
            long r14 = r6.m0(r14)
            goto L6a
        L69:
            r14 = r10
        L6a:
            w.q0 r6 = r2.f4850d
            if (r6 == 0) goto L7d
            v1.t r6 = r6.c()
            if (r6 == 0) goto L7d
            r10 = 0
            long r10 = r2.l(r10)
            long r10 = r6.m0(r10)
        L7d:
            w.q0 r6 = r2.f4850d
            r16 = 0
            if (r6 == 0) goto Lbb
            v1.t r6 = r6.c()
            if (r6 == 0) goto Lbb
            w.m1 r5 = r3.d()
            if (r5 == 0) goto L98
            i2.k0 r5 = r5.f14569a
            e1.c r5 = r5.c(r7)
            float r5 = r5.f2297b
            goto L9a
        L98:
            r5 = r16
        L9a:
            int r7 = java.lang.Float.floatToRawIntBits(r16)
            r17 = r9
            r18 = r10
            long r9 = (long) r7
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            r20 = r12
            long r12 = (long) r5
            long r9 = r9 << r17
            long r11 = r12 & r20
            long r9 = r9 | r11
            long r5 = r6.m0(r9)
            long r5 = r5 & r20
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            goto Lc3
        Lbb:
            r17 = r9
            r18 = r10
            r20 = r12
            r5 = r16
        Lc3:
            w.q0 r6 = r2.f4850d
            if (r6 == 0) goto Lf8
            v1.t r6 = r6.c()
            if (r6 == 0) goto Lf8
            w.m1 r7 = r3.d()
            if (r7 == 0) goto Ldc
            i2.k0 r7 = r7.f14569a
            e1.c r7 = r7.c(r8)
            float r7 = r7.f2297b
            goto Lde
        Ldc:
            r7 = r16
        Lde:
            int r8 = java.lang.Float.floatToRawIntBits(r16)
            long r8 = (long) r8
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r10 = (long) r7
            long r7 = r8 << r17
            long r9 = r10 & r20
            long r7 = r7 | r9
            long r6 = r6.m0(r7)
            long r6 = r6 & r20
            int r6 = (int) r6
            float r16 = java.lang.Float.intBitsToFloat(r6)
        Lf8:
            r6 = r16
            long r7 = r14 >> r17
            int r7 = (int) r7
            float r8 = java.lang.Float.intBitsToFloat(r7)
            long r9 = r18 >> r17
            int r9 = (int) r9
            float r10 = java.lang.Float.intBitsToFloat(r9)
            float r8 = java.lang.Math.min(r8, r10)
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r7 = java.lang.Math.max(r7, r9)
            float r5 = java.lang.Math.min(r5, r6)
            long r9 = r14 & r20
            int r6 = (int) r9
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r9 = r18 & r20
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r6 = java.lang.Math.max(r6, r9)
            r9 = 25
            float r9 = (float) r9
            w.x0 r3 = r3.f14600a
            u2.c r3 = r3.f14716g
            float r3 = r3.d()
            float r3 = r3 * r9
            float r3 = r3 + r6
            e1.c r6 = new e1.c
            r6.<init>(r8, r5, r7, r3)
            goto L142
        L141:
            r6 = r4
        L142:
            w.q0 r2 = r2.f4850d
            if (r2 == 0) goto L16f
            v1.t r2 = r2.c()
            if (r2 != 0) goto L14d
            goto L16f
        L14d:
            boolean r3 = r2.C()
            if (r3 == 0) goto L170
            boolean r3 = r1.C()
            if (r3 != 0) goto L15a
            goto L170
        L15a:
            long r3 = r6.d()
            v1.t r2 = v1.w.h(r2)
            long r1 = r1.w(r2, r3)
            long r3 = r6.c()
            e1.c r4 = ac.p.a(r1, r3)
            goto L170
        L16f:
            r4 = 0
        L170:
            return r4
    }
}
