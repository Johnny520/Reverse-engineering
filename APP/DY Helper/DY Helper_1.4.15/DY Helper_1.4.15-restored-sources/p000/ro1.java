package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ro1 extends p000.AbstractC1099 implements java.util.RandomAccess {

    /* JADX INFO: renamed from: ε */
    public final java.lang.Object[] f9426;

    /* JADX INFO: renamed from: ζ */
    public final int f9427;

    /* JADX INFO: renamed from: η */
    public int f9428;

    /* JADX INFO: renamed from: θ */
    public int f9429;

    public ro1(int r2, java.lang.Object[] r3) {
            r1 = this;
            r1.<init>()
            r1.f9426 = r3
            if (r2 < 0) goto L2a
            int r0 = r3.length
            if (r2 > r0) goto L10
            int r3 = r3.length
            r1.f9427 = r3
            r1.f9429 = r2
            return
        L10:
            java.lang.String r1 = "ring buffer filled size: "
            java.lang.String r0 = " cannot be larger than the buffer size: "
            java.lang.StringBuilder r1 = p000.a12.m19(r2, r1, r0)
            int r2 = r3.length
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L2a:
            java.lang.String r1 = "ring buffer filled size should not be negative but it is "
            java.lang.String r1 = p000.a12.m17(r1, r2)
            p000.C1080.m7266(r1)
            r1 = 0
            throw r1
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.f9429
            if (r3 < 0) goto L11
            if (r3 >= r0) goto L11
            int r0 = r2.f9428
            int r0 = r0 + r3
            int r3 = r2.f9427
            int r0 = r0 % r3
            java.lang.Object[] r2 = r2.f9426
            r2 = r2[r0]
            return r2
        L11:
            java.lang.String r2 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = p000.AbstractC0602nx.m4125(r3, r0, r2, r1)
            p000.C1080.m7269(r2)
            r2 = 0
            return r2
    }

    @Override // p000.AbstractC1099, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
            r1 = this;
            qo1 r0 = new qo1
            r0.<init>(r1)
            return r0
    }

    @Override // p000.AbstractC1089, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.mo2340()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            return r1
    }

    @Override // p000.AbstractC1089, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] r7) {
            r6 = this;
            r7.getClass()
            int r0 = r7.length
            int r1 = r6.f9429
            if (r0 >= r1) goto Lc
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r1)
        Lc:
            int r0 = r6.f9429
            int r1 = r6.f9428
            r2 = 0
            r3 = r2
        L12:
            java.lang.Object[] r4 = r6.f9426
            if (r3 >= r0) goto L23
            int r5 = r6.f9427
            if (r1 >= r5) goto L23
            r4 = r4[r1]
            r7[r3] = r4
            int r3 = r3 + 1
            int r1 = r1 + 1
            goto L12
        L23:
            if (r3 >= r0) goto L2e
            r6 = r4[r2]
            r7[r3] = r6
            int r3 = r3 + 1
            int r2 = r2 + 1
            goto L23
        L2e:
            int r6 = r7.length
            if (r0 >= r6) goto L34
            r6 = 0
            r7[r0] = r6
        L34:
            return r7
    }

    @Override // p000.AbstractC1089
    /* JADX INFO: renamed from: α */
    public final int mo2340() {
            r0 = this;
            int r0 = r0.f9429
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final void m5118(int r6) {
            r5 = this;
            if (r6 < 0) goto L42
            int r0 = r5.f9429
            if (r6 > r0) goto L27
            if (r6 <= 0) goto L26
            int r0 = r5.f9428
            int r1 = r0 + r6
            int r2 = r5.f9427
            int r1 = r1 % r2
            java.lang.Object[] r3 = r5.f9426
            r4 = 0
            if (r0 <= r1) goto L1c
            java.util.Arrays.fill(r3, r0, r2, r4)
            r0 = 0
            java.util.Arrays.fill(r3, r0, r1, r4)
            goto L1f
        L1c:
            java.util.Arrays.fill(r3, r0, r1, r4)
        L1f:
            r5.f9428 = r1
            int r0 = r5.f9429
            int r0 = r0 - r6
            r5.f9429 = r0
        L26:
            return
        L27:
            java.lang.String r0 = "n shouldn't be greater than the buffer size: n = "
            java.lang.String r1 = ", size = "
            java.lang.StringBuilder r6 = p000.a12.m19(r6, r0, r1)
            int r5 = r5.f9429
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L42:
            java.lang.String r5 = "n shouldn't be negative but it is "
            java.lang.String r5 = p000.a12.m17(r5, r6)
            p000.C1080.m7266(r5)
            return
    }
}
