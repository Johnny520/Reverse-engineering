package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class bs1 {

    /* JADX INFO: renamed from: α */
    public final p000.q01 f1821;

    /* JADX INFO: renamed from: β */
    public final boolean f1822;

    /* JADX INFO: renamed from: γ */
    public final p000.yp0 f1823;

    /* JADX INFO: renamed from: δ */
    public final p000.xr1 f1824;

    /* JADX INFO: renamed from: ε */
    public p000.bs1 f1825;

    /* JADX INFO: renamed from: ζ */
    public final int f1826;

    public bs1(p000.q01 r1, boolean r2, p000.yp0 r3, p000.xr1 r4) {
            r0 = this;
            r0.<init>()
            r0.f1821 = r1
            r0.f1822 = r2
            r0.f1823 = r3
            r0.f1824 = r4
            int r1 = r3.f12744
            r0.f1826 = r1
            return
    }

    /* JADX INFO: renamed from: κ */
    public static /* synthetic */ java.util.List m1005(int r3, p000.bs1 r4) {
            r0 = r3 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            boolean r0 = r4.f1822
            r0 = r0 ^ r2
            goto Lb
        La:
            r0 = r1
        Lb:
            r3 = r3 & 2
            if (r3 == 0) goto L10
            goto L11
        L10:
            r1 = r2
        L11:
            java.util.List r3 = r4.m1014(r0, r1)
            return r3
    }

    /* JADX INFO: renamed from: α */
    public final p000.ml1 m1006(p000.q31 r10) {
            r9 = this;
            bs1 r9 = r9.m1016()
            if (r9 != 0) goto L9
            ml1 r9 = p000.ml1.f7199
            return r9
        L9:
            yp0 r0 = r9.f1823
            k31 r0 = r0.f12733
            q01 r0 = r0.f5729
            int r1 = r0.f8774
            r2 = 8
            r1 = r1 & r2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L74
        L18:
            if (r0 == 0) goto L74
            int r1 = r0.f8773
            r1 = r1 & r2
            if (r1 == 0) goto L6c
            r1 = r0
            r5 = r4
        L21:
            if (r1 == 0) goto L6c
            boolean r6 = r1 instanceof p000.zr1
            if (r6 == 0) goto L31
            r6 = r1
            zr1 r6 = (p000.zr1) r6
            boolean r6 = r6.mo2339()
            if (r6 == 0) goto L67
            goto L75
        L31:
            int r6 = r1.f8773
            r6 = r6 & r2
            if (r6 == 0) goto L67
            boolean r6 = r1 instanceof p000.C1014ya
            if (r6 == 0) goto L67
            r6 = r1
            ya r6 = (p000.C1014ya) r6
            q01 r6 = r6.f12512
            r7 = 0
        L40:
            if (r6 == 0) goto L64
            int r8 = r6.f8773
            r8 = r8 & r2
            if (r8 == 0) goto L61
            int r7 = r7 + 1
            if (r7 != r3) goto L4d
            r1 = r6
            goto L61
        L4d:
            if (r5 != 0) goto L58
            k21 r5 = new k21
            r8 = 16
            q01[] r8 = new p000.q01[r8]
            r5.<init>(r8)
        L58:
            if (r1 == 0) goto L5e
            r5.m3127(r1)
            r1 = r4
        L5e:
            r5.m3127(r6)
        L61:
            q01 r6 = r6.f8776
            goto L40
        L64:
            if (r7 != r3) goto L67
            goto L21
        L67:
            q01 r1 = p000.h62.m2387(r5)
            goto L21
        L6c:
            int r1 = r0.f8774
            r1 = r1 & r2
            if (r1 == 0) goto L74
            q01 r0 = r0.f8776
            goto L18
        L74:
            r1 = r4
        L75:
            zr1 r1 = (p000.zr1) r1
            if (r1 == 0) goto L7d
            q31 r4 = p000.h62.m2443(r1, r2)
        L7d:
            if (r4 != 0) goto L84
            ml1 r9 = r9.m1006(r10)
            return r9
        L84:
            ml1 r9 = r4.mo2337(r10, r3)
            return r9
    }

    /* JADX INFO: renamed from: β */
    public final p000.bs1 m1007(p000.so1 r6, p000.a80 r7) {
            r5 = this;
            xr1 r0 = new xr1
            r0.<init>()
            r1 = 0
            r0.f12270 = r1
            r0.f12271 = r1
            r7.invoke(r0)
            bs1 r2 = new bs1
            as1 r3 = new as1
            r3.<init>(r7)
            yp0 r7 = new yp0
            int r4 = r5.f1826
            if (r6 == 0) goto L1f
            r6 = 1000000000(0x3b9aca00, float:0.0047237873)
        L1d:
            int r4 = r4 + r6
            goto L23
        L1f:
            r6 = 2000000000(0x77359400, float:3.682842E33)
            goto L1d
        L23:
            r6 = 1
            r7.<init>(r4, r6)
            r2.<init>(r3, r1, r7, r0)
            r2.f1825 = r5
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public final void m1008(p000.yp0 r6, java.util.ArrayList r7) {
            r5 = this;
            k21 r6 = r6.m7008()
            java.lang.Object[] r0 = r6.f5716
            int r6 = r6.f5718
            r1 = 0
        L9:
            if (r1 >= r6) goto L33
            r2 = r0[r1]
            yp0 r2 = (p000.yp0) r2
            boolean r3 = r2.m6977()
            if (r3 == 0) goto L30
            boolean r3 = r2.f12742
            if (r3 != 0) goto L30
            k31 r3 = r2.f12733
            r4 = 8
            boolean r3 = r3.m3144(r4)
            if (r3 == 0) goto L2d
            boolean r3 = r5.f1822
            bs1 r2 = p000.p91.m4416(r2, r3)
            r7.add(r2)
            goto L30
        L2d:
            r5.m1008(r2, r7)
        L30:
            int r1 = r1 + 1
            goto L9
        L33:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final p000.q31 m1009() {
            r1 = this;
            boolean r0 = r1.m1019()
            if (r0 == 0) goto L13
            bs1 r1 = r1.m1016()
            if (r1 == 0) goto L11
            q31 r1 = r1.m1009()
            return r1
        L11:
            r1 = 0
            return r1
        L13:
            zr1 r0 = r1.m1011()
            if (r0 == 0) goto L20
            r1 = 8
            q31 r1 = p000.h62.m2443(r0, r1)
            return r1
        L20:
            yp0 r1 = r1.f1823
            k31 r1 = r1.f12733
            gm0 r1 = r1.f5726
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public final void m1010(java.util.ArrayList r4, java.util.ArrayList r5) {
            r3 = this;
            int r0 = r4.size()
            r1 = 0
            r3.m1023(r4, r1)
            int r3 = r4.size()
        Lc:
            if (r0 >= r3) goto L2a
            java.lang.Object r1 = r4.get(r0)
            bs1 r1 = (p000.bs1) r1
            boolean r2 = r1.m1020()
            if (r2 == 0) goto L1e
            r5.add(r1)
            goto L27
        L1e:
            xr1 r2 = r1.f1824
            boolean r2 = r2.f12271
            if (r2 != 0) goto L27
            r1.m1010(r4, r5)
        L27:
            int r0 = r0 + 1
            goto Lc
        L2a:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final p000.zr1 m1011() {
            r10 = this;
            xr1 r0 = r10.f1824
            boolean r0 = r0.f12270
            r1 = 16
            r2 = 0
            r3 = 1
            r4 = 0
            yp0 r10 = r10.f1823
            if (r0 == 0) goto L87
            k31 r10 = r10.f12733
            q01 r10 = r10.f5729
            int r0 = r10.f8774
            r0 = r0 & 8
            if (r0 == 0) goto Lef
            r0 = r4
        L18:
            if (r10 == 0) goto L84
            int r5 = r10.f8773
            r5 = r5 & 8
            if (r5 == 0) goto L7b
            r5 = r10
            r6 = r4
        L22:
            if (r5 == 0) goto L7b
            boolean r7 = r5 instanceof p000.zr1
            if (r7 == 0) goto L3d
            r7 = r5
            zr1 r7 = (p000.zr1) r7
            boolean r8 = r7.mo2339()
            if (r8 == 0) goto L3b
            boolean r8 = r7.mo5120()
            if (r8 == 0) goto L38
            return r7
        L38:
            if (r0 != 0) goto L3b
            r0 = r7
        L3b:
            r7 = r2
            goto L3e
        L3d:
            r7 = r3
        L3e:
            if (r7 == 0) goto L76
            int r7 = r5.f8773
            r7 = r7 & 8
            if (r7 == 0) goto L76
            boolean r7 = r5 instanceof p000.C1014ya
            if (r7 == 0) goto L76
            r7 = r5
            ya r7 = (p000.C1014ya) r7
            q01 r7 = r7.f12512
            r8 = r2
        L50:
            if (r7 == 0) goto L73
            int r9 = r7.f8773
            r9 = r9 & 8
            if (r9 == 0) goto L70
            int r8 = r8 + 1
            if (r8 != r3) goto L5e
            r5 = r7
            goto L70
        L5e:
            if (r6 != 0) goto L67
            k21 r6 = new k21
            q01[] r9 = new p000.q01[r1]
            r6.<init>(r9)
        L67:
            if (r5 == 0) goto L6d
            r6.m3127(r5)
            r5 = r4
        L6d:
            r6.m3127(r7)
        L70:
            q01 r7 = r7.f8776
            goto L50
        L73:
            if (r8 != r3) goto L76
            goto L22
        L76:
            q01 r5 = p000.h62.m2387(r6)
            goto L22
        L7b:
            int r5 = r10.f8774
            r5 = r5 & 8
            if (r5 == 0) goto L84
            q01 r10 = r10.f8776
            goto L18
        L84:
            r4 = r0
            goto Lef
        L87:
            k31 r10 = r10.f12733
            q01 r10 = r10.f5729
            int r0 = r10.f8774
            r0 = r0 & 8
            if (r0 == 0) goto Lef
        L91:
            if (r10 == 0) goto Lef
            int r0 = r10.f8773
            r0 = r0 & 8
            if (r0 == 0) goto Le6
            r0 = r10
            r5 = r4
        L9b:
            if (r0 == 0) goto Le6
            boolean r6 = r0 instanceof p000.zr1
            if (r6 == 0) goto Lab
            r6 = r0
            zr1 r6 = (p000.zr1) r6
            boolean r6 = r6.mo2339()
            if (r6 == 0) goto Le1
            goto L84
        Lab:
            int r6 = r0.f8773
            r6 = r6 & 8
            if (r6 == 0) goto Le1
            boolean r6 = r0 instanceof p000.C1014ya
            if (r6 == 0) goto Le1
            r6 = r0
            ya r6 = (p000.C1014ya) r6
            q01 r6 = r6.f12512
            r7 = r2
        Lbb:
            if (r6 == 0) goto Lde
            int r8 = r6.f8773
            r8 = r8 & 8
            if (r8 == 0) goto Ldb
            int r7 = r7 + 1
            if (r7 != r3) goto Lc9
            r0 = r6
            goto Ldb
        Lc9:
            if (r5 != 0) goto Ld2
            k21 r5 = new k21
            q01[] r8 = new p000.q01[r1]
            r5.<init>(r8)
        Ld2:
            if (r0 == 0) goto Ld8
            r5.m3127(r0)
            r0 = r4
        Ld8:
            r5.m3127(r6)
        Ldb:
            q01 r6 = r6.f8776
            goto Lbb
        Lde:
            if (r7 != r3) goto Le1
            goto L9b
        Le1:
            q01 r0 = p000.h62.m2387(r5)
            goto L9b
        Le6:
            int r0 = r10.f8774
            r0 = r0 & 8
            if (r0 == 0) goto Lef
            q01 r10 = r10.f8776
            goto L91
        Lef:
            zr1 r4 = (p000.zr1) r4
            return r4
    }

    /* JADX INFO: renamed from: η */
    public final p000.ml1 m1012() {
            r2 = this;
            q31 r2 = r2.m1009()
            if (r2 == 0) goto L1c
            q01 r0 = r2.mo2315()
            boolean r0 = r0.f8784
            if (r0 == 0) goto Lf
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 == 0) goto L1c
            mp0 r0 = p000.AbstractC0782s1.m5332(r2)
            r1 = 1
            ml1 r2 = r0.mo2337(r2, r1)
            return r2
        L1c:
            ml1 r2 = p000.ml1.f7199
            return r2
    }

    /* JADX INFO: renamed from: θ */
    public final p000.ml1 m1013() {
            r1 = this;
            q31 r1 = r1.m1009()
            if (r1 == 0) goto L18
            q01 r0 = r1.mo2315()
            boolean r0 = r0.f8784
            if (r0 == 0) goto Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r1 == 0) goto L18
            r0 = 1
            ml1 r1 = p000.AbstractC0782s1.m5328(r1, r0)
            return r1
        L18:
            ml1 r1 = p000.ml1.f7199
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public final java.util.List m1014(boolean r2, boolean r3) {
            r1 = this;
            if (r2 != 0) goto Lb
            xr1 r2 = r1.f1824
            boolean r2 = r2.f12271
            if (r2 == 0) goto Lb
            jz r1 = p000.C0450jz.f5672
            return r1
        Lb:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r0 = r1.m1020()
            if (r0 == 0) goto L1f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.m1010(r2, r3)
            return r3
        L1f:
            java.util.List r1 = r1.m1023(r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: λ */
    public final p000.xr1 m1015() {
            r2 = this;
            boolean r0 = r2.m1020()
            xr1 r1 = r2.f1824
            if (r0 == 0) goto L15
            xr1 r0 = r1.m6779()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.m1022(r1, r0)
            return r0
        L15:
            return r1
    }

    /* JADX INFO: renamed from: μ */
    public final p000.bs1 m1016() {
            r5 = this;
            bs1 r0 = r5.f1825
            if (r0 == 0) goto L5
            return r0
        L5:
            yp0 r0 = r5.f1823
            boolean r5 = r5.f1822
            r1 = 0
            if (r5 == 0) goto L23
            yp0 r2 = r0.m7005()
        L10:
            if (r2 == 0) goto L23
            xr1 r3 = r2.m7007()
            if (r3 == 0) goto L1e
            boolean r3 = r3.f12270
            r4 = 1
            if (r3 != r4) goto L1e
            goto L24
        L1e:
            yp0 r2 = r2.m7005()
            goto L10
        L23:
            r2 = r1
        L24:
            if (r2 != 0) goto L3e
            yp0 r0 = r0.m7005()
        L2a:
            if (r0 == 0) goto L3d
            k31 r2 = r0.f12733
            r3 = 8
            boolean r2 = r2.m3144(r3)
            if (r2 == 0) goto L38
            r2 = r0
            goto L3e
        L38:
            yp0 r0 = r0.m7005()
            goto L2a
        L3d:
            r2 = r1
        L3e:
            if (r2 != 0) goto L41
            return r1
        L41:
            bs1 r5 = p000.p91.m4416(r2, r5)
            return r5
    }

    /* JADX INFO: renamed from: ν */
    public final p000.ml1 m1017() {
            r2 = this;
            zr1 r0 = r2.m1011()
            if (r0 != 0) goto L11
            yp0 r2 = r2.f1823
            k31 r2 = r2.f12733
            gm0 r2 = r2.f5726
            ml1 r2 = r2.m4757()
            return r2
        L11:
            q01 r0 = (p000.q01) r0
            q01 r0 = r0.f8771
            is1 r1 = p000.wr1.f11813
            xr1 r2 = r2.f1824
            b21 r2 = r2.f12268
            java.lang.Object r2 = r2.m695(r1)
            if (r2 != 0) goto L22
            r2 = 0
        L22:
            r1 = 1
            if (r2 == 0) goto L27
            r2 = r1
            goto L28
        L27:
            r2 = 0
        L28:
            ml1 r2 = p000.i91.m2681(r0, r2, r1)
            return r2
    }

    /* JADX INFO: renamed from: ξ */
    public final p000.xr1 m1018() {
            r0 = this;
            xr1 r0 = r0.f1824
            return r0
    }

    /* JADX INFO: renamed from: ο */
    public final boolean m1019() {
            r0 = this;
            bs1 r0 = r0.f1825
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: π */
    public final boolean m1020() {
            r1 = this;
            boolean r0 = r1.f1822
            if (r0 == 0) goto Lc
            xr1 r1 = r1.f1824
            boolean r1 = r1.f12270
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ρ */
    public final boolean m1021() {
            r2 = this;
            boolean r0 = r2.m1019()
            if (r0 != 0) goto L2e
            r0 = 4
            java.util.List r0 = m1005(r0, r2)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2e
            yp0 r2 = r2.f1823
            yp0 r2 = r2.m7005()
        L17:
            r0 = 1
            if (r2 == 0) goto L2a
            xr1 r1 = r2.m7007()
            if (r1 == 0) goto L25
            boolean r1 = r1.f12270
            if (r1 != r0) goto L25
            goto L2b
        L25:
            yp0 r2 = r2.m7005()
            goto L17
        L2a:
            r2 = 0
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: σ */
    public final void m1022(java.util.ArrayList r4, p000.xr1 r5) {
            r3 = this;
            xr1 r0 = r3.f1824
            boolean r0 = r0.f12271
            if (r0 != 0) goto L2b
            int r0 = r4.size()
            r1 = 0
            r3.m1023(r4, r1)
            int r3 = r4.size()
        L12:
            if (r0 >= r3) goto L2b
            java.lang.Object r1 = r4.get(r0)
            bs1 r1 = (p000.bs1) r1
            boolean r2 = r1.m1020()
            if (r2 != 0) goto L28
            xr1 r2 = r1.f1824
            r5.m6781(r2)
            r1.m1022(r4, r5)
        L28:
            int r0 = r0 + 1
            goto L12
        L2b:
            return
    }

    /* JADX INFO: renamed from: τ */
    public final java.util.List m1023(java.util.ArrayList r6, boolean r7) {
            r5 = this;
            boolean r0 = r5.m1019()
            if (r0 == 0) goto L9
            jz r5 = p000.C0450jz.f5672
            return r5
        L9:
            yp0 r0 = r5.f1823
            r5.m1008(r0, r6)
            if (r7 == 0) goto L70
            xr1 r7 = r5.f1824
            b21 r0 = r7.f12268
            is1 r1 = p000.fs1.f4120
            java.lang.Object r1 = r0.m695(r1)
            r2 = 0
            if (r1 != 0) goto L1e
            r1 = r2
        L1e:
            so1 r1 = (p000.so1) r1
            if (r1 == 0) goto L3a
            boolean r3 = r7.f12270
            if (r3 == 0) goto L3a
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L3a
            b0 r3 = new b0
            r4 = 18
            r3.<init>(r4, r1)
            bs1 r1 = r5.m1007(r1, r3)
            r6.add(r1)
        L3a:
            is1 r1 = p000.fs1.f4098
            boolean r3 = r0.m691(r1)
            if (r3 == 0) goto L70
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L70
            boolean r7 = r7.f12270
            if (r7 == 0) goto L70
            java.lang.Object r7 = r0.m695(r1)
            if (r7 != 0) goto L53
            r7 = r2
        L53:
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L5e
            java.lang.Object r7 = p000.AbstractC0984xh.m6640(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto L5f
        L5e:
            r7 = r2
        L5f:
            if (r7 == 0) goto L70
            b0 r0 = new b0
            r1 = 19
            r0.<init>(r1, r7)
            bs1 r5 = r5.m1007(r2, r0)
            r7 = 0
            r6.add(r7, r5)
        L70:
            return r6
    }
}
