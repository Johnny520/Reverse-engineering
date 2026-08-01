package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class pa1 extends p000.AbstractC1103 {

    /* JADX INFO: renamed from: ε */
    public final java.lang.Object[] f8472;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object[] f8473;

    /* JADX INFO: renamed from: η */
    public final int f8474;

    /* JADX INFO: renamed from: θ */
    public final int f8475;

    public pa1(java.lang.Object[] r1, java.lang.Object[] r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f8472 = r1
            r0.f8473 = r2
            r0.f8474 = r3
            r0.f8475 = r4
            int r1 = r0.mo2340()
            r3 = 32
            if (r1 <= r3) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 != 0) goto L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Trie-based persistent vector should have at least 33 elements, got "
            r1.<init>(r3)
            int r0 = r0.mo2340()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.pi1.m4544(r0)
        L2d:
            int r0 = r2.length
            return
    }

    /* JADX INFO: renamed from: ι */
    public static java.lang.Object[] m4440(java.lang.Object[] r4, int r5, int r6, java.lang.Object r7, p000.y21 r8) {
            int r0 = p000.i81.m2669(r6, r5)
            r1 = 32
            if (r5 != 0) goto L1f
            if (r0 != 0) goto Ld
            java.lang.Object[] r5 = new java.lang.Object[r1]
            goto L11
        Ld:
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r4, r1)
        L11:
            int r6 = r0 + 1
            r1 = 31
            p000.AbstractC0312g7.m2238(r4, r5, r6, r0, r1)
            r4 = r4[r1]
            r8.f12428 = r4
            r5[r0] = r7
            return r5
        L1f:
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r4, r1)
            int r5 = r5 + (-5)
            r3 = r4[r0]
            r3.getClass()
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.Object[] r6 = m4440(r3, r5, r6, r7, r8)
            r2[r0] = r6
        L32:
            int r0 = r0 + 1
            if (r0 >= r1) goto L4b
            r6 = r2[r0]
            if (r6 == 0) goto L4b
            r6 = r4[r0]
            r6.getClass()
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            r7 = 0
            java.lang.Object r3 = r8.f12428
            java.lang.Object[] r6 = m4440(r6, r5, r7, r3, r8)
            r2[r0] = r6
            goto L32
        L4b:
            return r2
    }

    /* JADX INFO: renamed from: λ */
    public static java.lang.Object[] m4441(java.lang.Object[] r4, int r5, int r6, p000.y21 r7) {
            int r0 = p000.i81.m2669(r6, r5)
            r1 = 0
            r2 = 5
            if (r5 != r2) goto Le
            r5 = r4[r0]
            r7.f12428 = r5
            r5 = r1
            goto L1a
        Le:
            r3 = r4[r0]
            r3.getClass()
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r5 = r5 - r2
            java.lang.Object[] r5 = m4441(r3, r5, r6, r7)
        L1a:
            if (r5 != 0) goto L1f
            if (r0 != 0) goto L1f
            return r1
        L1f:
            r6 = 32
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r6)
            r4[r0] = r5
            return r4
    }

    /* JADX INFO: renamed from: ρ */
    public static java.lang.Object[] m4442(int r2, int r3, java.lang.Object r4, java.lang.Object[] r5) {
            int r0 = p000.i81.m2669(r3, r2)
            r1 = 32
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)
            if (r2 != 0) goto Lf
            r5[r0] = r4
            return r5
        Lf:
            r1 = r5[r0]
            r1.getClass()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r2 = r2 + (-5)
            java.lang.Object[] r2 = m4442(r2, r3, r4, r1)
            r5[r0] = r2
            return r5
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.mo2340()
            p000.AbstractC1021yh.m6885(r3, r0)
            int r0 = r2.m4454()
            if (r0 > r3) goto L10
            java.lang.Object[] r2 = r2.f8473
            goto L25
        L10:
            java.lang.Object[] r0 = r2.f8472
            int r2 = r2.f8475
        L14:
            if (r2 <= 0) goto L24
            int r1 = p000.i81.m2669(r3, r2)
            r0 = r0[r1]
            r0.getClass()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r2 = r2 + (-5)
            goto L14
        L24:
            r2 = r0
        L25:
            r3 = r3 & 31
            r2 = r2[r3]
            return r2
    }

    @Override // p000.AbstractC1099, java.util.List
    public final java.util.ListIterator listIterator(int r8) {
            r7 = this;
            int r0 = r7.f8474
            p000.AbstractC1021yh.m6886(r8, r0)
            ra1 r1 = new ra1
            int r0 = r7.f8475
            int r0 = r0 / 5
            int r6 = r0 + 1
            java.lang.Object[] r2 = r7.f8472
            java.lang.Object[] r3 = r7.f8473
            int r5 = r7.f8474
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // p000.AbstractC1089
    /* JADX INFO: renamed from: α */
    public final int mo2340() {
            r0 = this;
            int r0 = r0.f8474
            return r0
    }

    @Override // p000.AbstractC1103
    /* JADX INFO: renamed from: β */
    public final p000.AbstractC1103 mo4443(int r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f8474
            p000.AbstractC1021yh.m6886(r4, r0)
            if (r4 != r0) goto Lc
            б r3 = r3.mo4444(r5)
            return r3
        Lc:
            int r0 = r3.m4454()
            java.lang.Object[] r1 = r3.f8472
            if (r4 < r0) goto L1a
            int r4 = r4 - r0
            pa1 r3 = r3.m4449(r1, r4, r5)
            return r3
        L1a:
            y21 r0 = new y21
            r2 = 0
            r0.<init>(r2)
            int r2 = r3.f8475
            java.lang.Object[] r4 = m4440(r1, r2, r4, r5, r0)
            r5 = 0
            java.lang.Object r0 = r0.f12428
            pa1 r3 = r3.m4449(r4, r5, r0)
            return r3
    }

    @Override // p000.AbstractC1103
    /* JADX INFO: renamed from: γ */
    public final p000.AbstractC1103 mo4444(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.m4454()
            int r1 = r5.f8474
            int r0 = r1 - r0
            java.lang.Object[] r2 = r5.f8472
            java.lang.Object[] r3 = r5.f8473
            r4 = 32
            if (r0 >= r4) goto L20
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            r3[r0] = r6
            pa1 r6 = new pa1
            int r1 = r1 + 1
            int r5 = r5.f8475
            r6.<init>(r2, r3, r1, r5)
            return r6
        L20:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r1 = 0
            r0[r1] = r6
            pa1 r5 = r5.m4450(r2, r3, r0)
            return r5
    }

    @Override // p000.AbstractC1103
    /* JADX INFO: renamed from: ε */
    public final p000.qa1 mo4445() {
            r4 = this;
            qa1 r0 = new qa1
            java.lang.Object[] r1 = r4.f8473
            int r2 = r4.f8475
            java.lang.Object[] r3 = r4.f8472
            r0.<init>(r4, r3, r1, r2)
            return r0
    }

    @Override // p000.AbstractC1103
    /* JADX INFO: renamed from: ζ */
    public final p000.AbstractC1103 mo4446(p000.C1102 r5) {
            r4 = this;
            qa1 r0 = new qa1
            java.lang.Object[] r1 = r4.f8473
            int r2 = r4.f8475
            java.lang.Object[] r3 = r4.f8472
            r0.<init>(r4, r3, r1, r2)
            r0.m4820(r5)
            б r4 = r0.m4829()
            return r4
    }

    @Override // p000.AbstractC1103
    /* JADX INFO: renamed from: η */
    public final p000.AbstractC1103 mo4447(int r7) {
            r6 = this;
            int r0 = r6.mo2340()
            p000.AbstractC1021yh.m6885(r7, r0)
            int r0 = r6.m4454()
            int r1 = r6.f8475
            java.lang.Object[] r2 = r6.f8472
            if (r7 < r0) goto L17
            int r7 = r7 - r0
            б r6 = r6.m4453(r2, r0, r1, r7)
            return r6
        L17:
            y21 r3 = new y21
            java.lang.Object[] r4 = r6.f8473
            r5 = 0
            r4 = r4[r5]
            r3.<init>(r4)
            java.lang.Object[] r7 = r6.m4452(r2, r1, r7, r3)
            б r6 = r6.m4453(r7, r0, r1, r5)
            return r6
    }

    @Override // p000.AbstractC1103
    /* JADX INFO: renamed from: θ */
    public final p000.AbstractC1103 mo4448(int r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r4.f8474
            p000.AbstractC1021yh.m6885(r5, r0)
            int r1 = r4.m4454()
            java.lang.Object[] r2 = r4.f8472
            java.lang.Object[] r3 = r4.f8473
            int r4 = r4.f8475
            if (r1 > r5) goto L21
            r1 = 32
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
            r5 = r5 & 31
            r1[r5] = r6
            pa1 r5 = new pa1
            r5.<init>(r2, r1, r0, r4)
            return r5
        L21:
            java.lang.Object[] r5 = m4442(r4, r5, r6, r2)
            pa1 r6 = new pa1
            r6.<init>(r5, r3, r0, r4)
            return r6
    }

    /* JADX INFO: renamed from: κ */
    public final p000.pa1 m4449(java.lang.Object[] r7, int r8, java.lang.Object r9) {
            r6 = this;
            int r0 = r6.m4454()
            int r1 = r6.f8474
            int r0 = r1 - r0
            java.lang.Object[] r2 = r6.f8473
            r3 = 32
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r2, r3)
            if (r0 >= r3) goto L23
            int r3 = r8 + 1
            p000.AbstractC0312g7.m2238(r2, r4, r3, r8, r0)
            r4[r8] = r9
            pa1 r8 = new pa1
            int r1 = r1 + 1
            int r6 = r6.f8475
            r8.<init>(r7, r4, r1, r6)
            return r8
        L23:
            r1 = 31
            r1 = r2[r1]
            int r5 = r8 + 1
            int r0 = r0 + (-1)
            p000.AbstractC0312g7.m2238(r2, r4, r5, r8, r0)
            r4[r8] = r9
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r9 = 0
            r8[r9] = r1
            pa1 r6 = r6.m4450(r7, r4, r8)
            return r6
    }

    /* JADX INFO: renamed from: μ */
    public final p000.pa1 m4450(java.lang.Object[] r6, java.lang.Object[] r7, java.lang.Object[] r8) {
            r5 = this;
            int r0 = r5.f8474
            int r1 = r0 >> 5
            r2 = 1
            int r3 = r5.f8475
            int r4 = r2 << r3
            if (r1 <= r4) goto L1f
            r1 = 32
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r4 = 0
            r1[r4] = r6
            int r3 = r3 + 5
            java.lang.Object[] r5 = r5.m4451(r3, r1, r7)
            pa1 r6 = new pa1
            int r0 = r0 + r2
            r6.<init>(r5, r8, r0, r3)
            return r6
        L1f:
            java.lang.Object[] r5 = r5.m4451(r3, r6, r7)
            pa1 r6 = new pa1
            int r0 = r0 + r2
            r6.<init>(r5, r8, r0, r3)
            return r6
    }

    /* JADX INFO: renamed from: ν */
    public final java.lang.Object[] m4451(int r4, java.lang.Object[] r5, java.lang.Object[] r6) {
            r3 = this;
            int r0 = r3.mo2340()
            int r0 = r0 + (-1)
            int r0 = p000.i81.m2669(r0, r4)
            r1 = 32
            if (r5 == 0) goto L13
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)
            goto L15
        L13:
            java.lang.Object[] r5 = new java.lang.Object[r1]
        L15:
            r1 = 5
            if (r4 != r1) goto L1b
            r5[r0] = r6
            return r5
        L1b:
            r2 = r5[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r4 = r4 - r1
            java.lang.Object[] r3 = r3.m4451(r4, r2, r6)
            r5[r0] = r3
            return r5
    }

    /* JADX INFO: renamed from: ξ */
    public final java.lang.Object[] m4452(java.lang.Object[] r6, int r7, int r8, p000.y21 r9) {
            r5 = this;
            int r0 = p000.i81.m2669(r8, r7)
            r1 = 31
            r2 = 32
            if (r7 != 0) goto L21
            if (r0 != 0) goto Lf
            java.lang.Object[] r5 = new java.lang.Object[r2]
            goto L13
        Lf:
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r6, r2)
        L13:
            int r7 = r0 + 1
            p000.AbstractC0312g7.m2238(r6, r5, r0, r7, r2)
            java.lang.Object r7 = r9.f12428
            r5[r1] = r7
            r6 = r6[r0]
            r9.f12428 = r6
            return r5
        L21:
            r3 = r6[r1]
            if (r3 != 0) goto L2f
            int r1 = r5.m4454()
            int r1 = r1 + (-1)
            int r1 = p000.i81.m2669(r1, r7)
        L2f:
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r2)
            int r7 = r7 + (-5)
            int r2 = r0 + 1
            if (r2 > r1) goto L4c
        L39:
            r3 = r6[r1]
            r3.getClass()
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r4 = 0
            java.lang.Object[] r3 = r5.m4452(r3, r7, r4, r9)
            r6[r1] = r3
            if (r1 == r2) goto L4c
            int r1 = r1 + (-1)
            goto L39
        L4c:
            r1 = r6[r0]
            r1.getClass()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.lang.Object[] r5 = r5.m4452(r1, r7, r8, r9)
            r6[r0] = r5
            return r6
    }

    /* JADX INFO: renamed from: ο */
    public final p000.AbstractC1103 m4453(java.lang.Object[] r7, int r8, int r9, int r10) {
            r6 = this;
            int r0 = r6.f8474
            int r0 = r0 - r8
            r1 = 0
            r2 = 32
            r3 = 1
            if (r0 != r3) goto L49
            if (r9 != 0) goto L1a
            int r6 = r7.length
            r8 = 33
            if (r6 != r8) goto L14
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r2)
        L14:
            sw1 r6 = new sw1
            r6.<init>(r7)
            return r6
        L1a:
            y21 r6 = new y21
            r6.<init>(r1)
            int r10 = r8 + (-1)
            java.lang.Object[] r7 = m4441(r7, r9, r10, r6)
            r7.getClass()
            java.lang.Object r6 = r6.f12428
            r6.getClass()
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            r10 = r7[r3]
            if (r10 != 0) goto L43
            r10 = 0
            r7 = r7[r10]
            r7.getClass()
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            pa1 r10 = new pa1
            int r9 = r9 + (-5)
            r10.<init>(r7, r6, r8, r9)
            return r10
        L43:
            pa1 r10 = new pa1
            r10.<init>(r7, r6, r8, r9)
            return r10
        L49:
            java.lang.Object[] r6 = r6.f8473
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r6, r2)
            int r4 = r0 + (-1)
            if (r10 >= r4) goto L58
            int r5 = r10 + 1
            p000.AbstractC0312g7.m2238(r6, r2, r10, r5, r0)
        L58:
            r2[r4] = r1
            pa1 r6 = new pa1
            int r8 = r8 + r0
            int r8 = r8 - r3
            r6.<init>(r7, r2, r8, r9)
            return r6
    }

    /* JADX INFO: renamed from: π */
    public final int m4454() {
            r0 = this;
            int r0 = r0.f8474
            int r0 = r0 + (-1)
            r0 = r0 & (-32)
            return r0
    }
}
