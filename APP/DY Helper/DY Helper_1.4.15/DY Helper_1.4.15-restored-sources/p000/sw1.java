package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class sw1 extends p000.AbstractC1103 {

    /* JADX INFO: renamed from: ζ */
    public static final p000.sw1 f10062 = null;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Object[] f10063;

    static {
            sw1 r0 = new sw1
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.<init>(r1)
            p000.sw1.f10062 = r0
            return
    }

    public sw1(java.lang.Object[] r1) {
            r0 = this;
            r0.<init>()
            r0.f10063 = r1
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            java.lang.Object[] r1 = r1.f10063
            int r0 = r1.length
            p000.AbstractC1021yh.m6885(r2, r0)
            r1 = r1[r2]
            return r1
    }

    @Override // p000.AbstractC1099, java.util.List
    public final int indexOf(java.lang.Object r1) {
            r0 = this;
            java.lang.Object[] r0 = r0.f10063
            int r0 = p000.AbstractC0312g7.m2254(r0, r1)
            return r0
    }

    @Override // p000.AbstractC1099, java.util.List
    public final int lastIndexOf(java.lang.Object r5) {
            r4 = this;
            java.lang.Object[] r4 = r4.f10063
            r0 = -1
            if (r5 != 0) goto L15
            int r5 = r4.length
            int r5 = r5 + r0
            if (r5 < 0) goto L29
        L9:
            int r1 = r5 + (-1)
            r2 = r4[r5]
            if (r2 != 0) goto L10
            return r5
        L10:
            if (r1 >= 0) goto L13
            goto L29
        L13:
            r5 = r1
            goto L9
        L15:
            int r1 = r4.length
            int r1 = r1 + r0
            if (r1 < 0) goto L29
        L19:
            int r2 = r1 + (-1)
            r3 = r4[r1]
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L24
            return r1
        L24:
            if (r2 >= 0) goto L27
            goto L29
        L27:
            r1 = r2
            goto L19
        L29:
            return r0
    }

    @Override // p000.AbstractC1099, java.util.List
    public final java.util.ListIterator listIterator(int r3) {
            r2 = this;
            java.lang.Object[] r2 = r2.f10063
            int r0 = r2.length
            p000.AbstractC1021yh.m6886(r3, r0)
            tc r0 = new tc
            int r1 = r2.length
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // p000.AbstractC1089
    /* JADX INFO: renamed from: α */
    public final int mo2340() {
            r0 = this;
            java.lang.Object[] r0 = r0.f10063
            int r0 = r0.length
            return r0
    }

    @Override // p000.AbstractC1103
    /* JADX INFO: renamed from: β */
    public final p000.AbstractC1103 mo4443(int r6, java.lang.Object r7) {
            r5 = this;
            java.lang.Object[] r0 = r5.f10063
            int r1 = r0.length
            p000.AbstractC1021yh.m6886(r6, r1)
            int r1 = r0.length
            if (r6 != r1) goto Le
            б r5 = r5.mo4444(r7)
            return r5
        Le:
            int r5 = r0.length
            r1 = 32
            r2 = 0
            if (r5 >= r1) goto L2b
            int r5 = r0.length
            int r5 = r5 + 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r1 = 6
            p000.AbstractC0312g7.m2240(r0, r5, r2, r6, r1)
            int r1 = r6 + 1
            int r2 = r0.length
            p000.AbstractC0312g7.m2238(r0, r5, r1, r6, r2)
            r5[r6] = r7
            sw1 r6 = new sw1
            r6.<init>(r5)
            return r6
        L2b:
            int r5 = r0.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r0, r5)
            int r3 = r6 + 1
            int r4 = r0.length
            int r4 = r4 + (-1)
            p000.AbstractC0312g7.m2238(r0, r5, r3, r6, r4)
            r5[r6] = r7
            r6 = 31
            r6 = r0[r6]
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r2] = r6
            pa1 r6 = new pa1
            int r0 = r0.length
            int r0 = r0 + 1
            r6.<init>(r5, r7, r0, r2)
            return r6
    }

    @Override // p000.AbstractC1103
    /* JADX INFO: renamed from: γ */
    public final p000.AbstractC1103 mo4444(java.lang.Object r4) {
            r3 = this;
            java.lang.Object[] r3 = r3.f10063
            int r0 = r3.length
            r1 = 32
            if (r0 >= r1) goto L17
            int r0 = r3.length
            int r0 = r0 + 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            int r3 = r3.length
            r0[r3] = r4
            sw1 r3 = new sw1
            r3.<init>(r0)
            return r3
        L17:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r1 = 0
            r0[r1] = r4
            pa1 r4 = new pa1
            int r2 = r3.length
            int r2 = r2 + 1
            r4.<init>(r3, r0, r2, r1)
            return r4
    }

    @Override // p000.AbstractC1103
    /* JADX INFO: renamed from: δ */
    public final p000.AbstractC1103 mo5578(java.util.Collection r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.f10063
            int r1 = r0.length
            int r2 = r4.size()
            int r2 = r2 + r1
            r1 = 32
            if (r2 > r1) goto L31
            int r3 = r0.length
            int r1 = r4.size()
            int r1 = r1 + r3
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r1)
            int r0 = r0.length
            java.util.Iterator r4 = r4.iterator()
        L1b:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r4.next()
            int r2 = r0 + 1
            r3[r0] = r1
            r0 = r2
            goto L1b
        L2b:
            sw1 r4 = new sw1
            r4.<init>(r3)
            return r4
        L31:
            qa1 r3 = r3.mo4445()
            r3.addAll(r4)
            б r3 = r3.m4829()
            return r3
    }

    @Override // p000.AbstractC1103
    /* JADX INFO: renamed from: ε */
    public final p000.qa1 mo4445() {
            r4 = this;
            qa1 r0 = new qa1
            java.lang.Object[] r1 = r4.f10063
            r2 = 0
            r3 = 0
            r0.<init>(r4, r3, r1, r2)
            return r0
    }

    @Override // p000.AbstractC1103
    /* JADX INFO: renamed from: ζ */
    public final p000.AbstractC1103 mo4446(p000.C1102 r10) {
            r9 = this;
            java.lang.Object[] r0 = r9.f10063
            int r1 = r0.length
            int r2 = r0.length
            r3 = 0
            r6 = r0
            r4 = r3
            r5 = r4
        L8:
            if (r4 >= r2) goto L2c
            r7 = r0[r4]
            java.lang.Object r8 = r10.invoke(r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L22
            if (r5 != 0) goto L29
            int r1 = r0.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r0, r1)
            r5 = 1
            r1 = r4
            goto L29
        L22:
            if (r5 == 0) goto L29
            int r8 = r1 + 1
            r6[r1] = r7
            r1 = r8
        L29:
            int r4 = r4 + 1
            goto L8
        L2c:
            int r10 = r0.length
            if (r1 != r10) goto L30
            return r9
        L30:
            if (r1 != 0) goto L35
            sw1 r9 = p000.sw1.f10062
            return r9
        L35:
            sw1 r9 = new sw1
            java.lang.Object[] r10 = p000.AbstractC0312g7.m2242(r6, r3, r1)
            r9.<init>(r10)
            return r9
    }

    @Override // p000.AbstractC1103
    /* JADX INFO: renamed from: η */
    public final p000.AbstractC1103 mo4447(int r4) {
            r3 = this;
            java.lang.Object[] r3 = r3.f10063
            int r0 = r3.length
            p000.AbstractC1021yh.m6885(r4, r0)
            int r0 = r3.length
            r1 = 1
            if (r0 != r1) goto Ld
            sw1 r3 = p000.sw1.f10062
            return r3
        Ld:
            int r0 = r3.length
            int r0 = r0 - r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            int r1 = r4 + 1
            int r2 = r3.length
            p000.AbstractC0312g7.m2238(r3, r0, r4, r1, r2)
            sw1 r3 = new sw1
            r3.<init>(r0)
            return r3
    }

    @Override // p000.AbstractC1103
    /* JADX INFO: renamed from: θ */
    public final p000.AbstractC1103 mo4448(int r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Object[] r1 = r1.f10063
            int r0 = r1.length
            p000.AbstractC1021yh.m6885(r2, r0)
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            r1[r2] = r3
            sw1 r2 = new sw1
            r2.<init>(r1)
            return r2
    }
}
