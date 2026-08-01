package p000;

/* JADX INFO: renamed from: o8 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0614o8 extends p000.q01 implements p000.InterfaceC0092bw, p000.c41, p000.zr1 {

    /* JADX INFO: renamed from: Α */
    public p000.u81 f7977;

    /* JADX INFO: renamed from: τ */
    public long f7978;

    /* JADX INFO: renamed from: υ */
    public p000.iv1 f7979;

    /* JADX INFO: renamed from: φ */
    public long f7980;

    /* JADX INFO: renamed from: χ */
    public p000.np0 f7981;

    /* JADX INFO: renamed from: ψ */
    public p000.u81 f7982;

    /* JADX INFO: renamed from: ω */
    public p000.iv1 f7983;

    @Override // p000.c41
    /* JADX INFO: renamed from: Ζ */
    public final void mo603() {
            r2 = this;
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r2.f7980 = r0
            r0 = 0
            r2.f7981 = r0
            r2.f7982 = r0
            r2.f7983 = r0
            p000.AbstractC1021yh.m6865(r2)
            return
    }

    @Override // p000.InterfaceC0092bw
    /* JADX INFO: renamed from: Μ */
    public final void mo604(p000.aq0 r26) {
            r25 = this;
            r0 = r25
            r1 = r26
            fe r2 = r1.f1284
            iv1 r3 = r0.f7979
            pl1 r4 = p000.kn0.f6053
            if (r3 != r4) goto L26
            long r2 = r0.f7978
            long r4 = p000.C0114ci.f2125
            boolean r2 = p000.C0114ci.m1192(r2, r4)
            if (r2 != 0) goto L23
            long r1 = r0.f7978
            r5 = 0
            r6 = 126(0x7e, float:1.77E-43)
            r3 = 0
            r0 = r26
            p000.InterfaceC0190cw.m1617(r0, r1, r3, r5, r6)
            r1 = r0
        L23:
            r6 = r1
            goto L181
        L26:
            t30 r3 = p000.t30.f10165
            long r4 = r2.mo585()
            long r6 = r0.f7980
            boolean r4 = p000.jw1.m2997(r4, r6)
            if (r4 == 0) goto L4c
            np0 r4 = r1.getLayoutDirection()
            np0 r5 = r0.f7981
            if (r4 != r5) goto L4c
            iv1 r4 = r0.f7983
            iv1 r5 = r0.f7979
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto L4c
            u81 r4 = r0.f7982
            r4.getClass()
            goto L5a
        L4c:
            p3 r4 = new p3
            r5 = 1
            r4.<init>(r0, r5, r1)
            p000.ln0.m3642(r0, r4)
            u81 r4 = r0.f7977
            r5 = 0
            r0.f7977 = r5
        L5a:
            r0.f7982 = r4
            long r5 = r2.mo585()
            r0.f7980 = r5
            np0 r5 = r1.getLayoutDirection()
            r0.f7981 = r5
            iv1 r5 = r0.f7979
            r0.f7983 = r5
            r4.getClass()
            long r5 = r0.f7978
            long r7 = p000.C0114ci.f2125
            boolean r5 = p000.C0114ci.m1192(r5, r7)
            if (r5 != 0) goto L23
            long r5 = r0.f7978
            boolean r0 = r4 instanceof p000.s81
            r7 = 32
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r0 == 0) goto Lcc
            s81 r4 = (p000.s81) r4
            ml1 r0 = r4.f9764
            float r2 = r0.f7200
            float r4 = r0.f7201
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r10 = (long) r2
            int r2 = java.lang.Float.floatToRawIntBits(r4)
            long r12 = (long) r2
            long r10 = r10 << r7
            long r7 = r12 & r8
            long r7 = r7 | r10
            float r2 = r0.f7202
            float r4 = r0.f7200
            float r2 = r2 - r4
            float r4 = r0.f7203
            float r0 = r0.f7201
            float r4 = r4 - r0
            int r0 = java.lang.Float.floatToRawIntBits(r2)
            long r9 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r4)
            long r11 = (long) r0
            r0 = 32
            long r9 = r9 << r0
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r13
            long r9 = r9 | r11
            r23 = r7
            r8 = r3
            r3 = r23
            r7 = 1065353216(0x3f800000, float:1.0)
            r1 = r5
            r5 = r9
            r9 = 3
            r0 = r26
            r0.mo582(r1, r3, r5, r7, r8, r9)
            r6 = r0
            goto L181
        Lcc:
            r23 = r5
            r6 = r1
            r0 = r23
            boolean r5 = r4 instanceof p000.t81
            if (r5 == 0) goto L170
            t81 r4 = (p000.t81) r4
            x2 r5 = r4.f10248
            if (r5 == 0) goto Le0
            r6.m589(r5, r0, r3)
            goto L181
        Le0:
            wo1 r4 = r4.f10247
            long r10 = r4.f11795
            long r10 = r10 >> r7
            int r5 = (int) r10
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r10 = r4.f11788
            float r11 = r4.f11789
            int r10 = java.lang.Float.floatToRawIntBits(r10)
            long r12 = (long) r10
            int r10 = java.lang.Float.floatToRawIntBits(r11)
            long r10 = (long) r10
            long r12 = r12 << r7
            long r10 = r10 & r8
            long r10 = r10 | r12
            float r12 = r4.m6400()
            float r4 = r4.m6399()
            int r12 = java.lang.Float.floatToRawIntBits(r12)
            long r12 = (long) r12
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r14 = (long) r4
            long r12 = r12 << r7
            long r14 = r14 & r8
            long r12 = r12 | r14
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r14 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            long r14 = r14 << r7
            long r4 = r4 & r8
            long r4 = r4 | r14
            ee r14 = r2.f3906
            de r15 = r14.f3516
            r25 = r7
            r16 = r8
            long r7 = r10 >> r25
            int r7 = (int) r7
            r8 = r16
            float r16 = java.lang.Float.intBitsToFloat(r7)
            long r10 = r10 & r8
            int r10 = (int) r10
            float r17 = java.lang.Float.intBitsToFloat(r10)
            float r7 = java.lang.Float.intBitsToFloat(r7)
            r18 = r8
            long r8 = r12 >> r25
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r8 = r8 + r7
            float r7 = java.lang.Float.intBitsToFloat(r10)
            long r9 = r12 & r18
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r9 = r9 + r7
            long r10 = r4 >> r25
            int r7 = (int) r10
            float r20 = java.lang.Float.intBitsToFloat(r7)
            long r4 = r4 & r18
            int r4 = (int) r4
            float r21 = java.lang.Float.intBitsToFloat(r4)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 3
            r23 = r0
            r0 = r2
            r1 = r23
            q2 r22 = p000.C0282fe.m2102(r0, r1, r3, r4, r5)
            r18 = r8
            r19 = r9
            r15.mo1728(r16, r17, r18, r19, r20, r21, r22)
            goto L181
        L170:
            r1 = r0
            boolean r0 = r4 instanceof p000.r81
            if (r0 == 0) goto L17d
            r81 r4 = (p000.r81) r4
            z91 r0 = r4.f9289
            r6.m589(r0, r1, r3)
            goto L181
        L17d:
            p000.C1080.m7272()
            return
        L181:
            r6.m587()
            return
    }

    @Override // p000.zr1
    /* JADX INFO: renamed from: Ω */
    public final void mo600(p000.js1 r1) {
            r0 = this;
            iv1 r0 = r0.f7979
            p000.hs1.m2529(r1, r0)
            return
    }

    @Override // p000.zr1
    /* JADX INFO: renamed from: γ */
    public final boolean mo2339() {
            r0 = this;
            r0 = 0
            return r0
    }
}
