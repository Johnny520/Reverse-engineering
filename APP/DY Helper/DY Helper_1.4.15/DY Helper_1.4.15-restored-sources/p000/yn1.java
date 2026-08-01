package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class yn1 {

    /* JADX INFO: renamed from: α */
    public p000.C0384i5 f12691;

    /* JADX INFO: renamed from: β */
    public p000.zj1 f12692;

    /* JADX INFO: renamed from: γ */
    public int f12693;

    /* JADX INFO: renamed from: δ */
    public java.lang.String f12694;

    /* JADX INFO: renamed from: ε */
    public p000.qc0 f12695;

    /* JADX INFO: renamed from: ζ */
    public p000.uc0 f12696;

    /* JADX INFO: renamed from: η */
    public p000.bo1 f12697;

    /* JADX INFO: renamed from: θ */
    public p000.lx1 f12698;

    /* JADX INFO: renamed from: ι */
    public p000.zn1 f12699;

    /* JADX INFO: renamed from: κ */
    public p000.zn1 f12700;

    /* JADX INFO: renamed from: λ */
    public p000.zn1 f12701;

    /* JADX INFO: renamed from: μ */
    public long f12702;

    /* JADX INFO: renamed from: ν */
    public long f12703;

    /* JADX INFO: renamed from: ξ */
    public p000.C1076zz f12704;

    /* JADX INFO: renamed from: ο */
    public p000.p52 f12705;

    public yn1() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f12693 = r0
            ao1 r0 = p000.bo1.f1795
            r1.f12697 = r0
            zz1 r0 = p000.p52.f8428
            r1.f12705 = r0
            uc0 r0 = new uc0
            r0.<init>()
            r1.f12696 = r0
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m6944(java.lang.String r1, p000.zn1 r2) {
            if (r2 == 0) goto L2c
            zn1 r0 = r2.f13205
            if (r0 != 0) goto L23
            zn1 r0 = r2.f13206
            if (r0 != 0) goto L19
            zn1 r2 = r2.f13207
            if (r2 != 0) goto Lf
            goto L2c
        Lf:
            java.lang.String r2 = ".priorResponse != null"
            java.lang.String r1 = r1.concat(r2)
            p000.C1080.m7266(r1)
            return
        L19:
            java.lang.String r2 = ".cacheResponse != null"
            java.lang.String r1 = r1.concat(r2)
            p000.C1080.m7266(r1)
            return
        L23:
            java.lang.String r2 = ".networkResponse != null"
            java.lang.String r1 = r1.concat(r2)
            p000.C1080.m7266(r1)
        L2c:
            return
    }

    /* JADX INFO: renamed from: α */
    public final p000.zn1 m6945() {
            r19 = this;
            r0 = r19
            int r4 = r0.f12693
            if (r4 < 0) goto L51
            i5 r1 = r0.f12691
            if (r1 == 0) goto L4a
            zj1 r2 = r0.f12692
            if (r2 == 0) goto L43
            java.lang.String r3 = r0.f12694
            if (r3 == 0) goto L3c
            qc0 r5 = r0.f12695
            uc0 r6 = r0.f12696
            vc0 r6 = r6.m5839()
            bo1 r7 = r0.f12697
            lx1 r8 = r0.f12698
            zn1 r9 = r0.f12699
            zn1 r10 = r0.f12700
            zn1 r11 = r0.f12701
            long r12 = r0.f12702
            long r14 = r0.f12703
            r16 = r1
            zz r1 = r0.f12704
            p52 r0 = r0.f12705
            r17 = r0
            zn1 r0 = new zn1
            r18 = r16
            r16 = r1
            r1 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r17)
            return r0
        L3c:
            java.lang.String r0 = "message == null"
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
        L43:
            java.lang.String r0 = "protocol == null"
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
        L4a:
            java.lang.String r0 = "request == null"
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
        L51:
            java.lang.String r1 = "code < 0: "
            int r0 = r0.f12693
            p000.ql1.m4937(r1, r0)
            r0 = 0
            return r0
    }
}
