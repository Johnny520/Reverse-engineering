package defpackage;

/* JADX INFO: renamed from: ᲈᛳᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2202 extends defpackage.AbstractC2115 implements java.util.RandomAccess {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f9380;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f9381;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object[] f9382;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f9383;

    public C2202(int r3, java.lang.Object[] r4) {
            r2 = this;
            r2.<init>()
            r2.f9382 = r4
            r0 = 0
            if (r3 < 0) goto L1a
            int r1 = r4.length
            if (r3 > r1) goto L11
            int r4 = r4.length
            r2.f9381 = r4
            r2.f9383 = r3
            return
        L11:
            java.lang.String r2 = " cannot be larger than the buffer size: "
            int r4 = r4.length
            java.lang.String r1 = "ring buffer filled size: "
            defpackage.C2264.m3669(r1, r3, r2, r4)
            throw r0
        L1a:
            java.lang.String r2 = "ring buffer filled size should not be negative but it is "
            java.lang.String r2 = defpackage.AbstractC1124.m2145(r3, r2)
            defpackage.C2264.m3678(r2)
            throw r0
    }

    @Override // java.util.List
    public final java.lang.Object get(int r4) {
            r3 = this;
            int r0 = r3.f9383
            if (r4 < 0) goto L11
            if (r4 >= r0) goto L11
            int r0 = r3.f9380
            int r0 = r0 + r4
            int r4 = r3.f9381
            int r0 = r0 % r4
            java.lang.Object[] r3 = r3.f9382
            r3 = r3[r0]
            return r3
        L11:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "index: "
            java.lang.String r2 = ", size: "
            java.lang.String r4 = defpackage.AbstractC1124.m2143(r4, r0, r1, r2)
            r3.<init>(r4)
            throw r3
    }

    @Override // defpackage.AbstractC2115, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
            r1 = this;
            ᲁᛱᛶ r0 = new ᲁᛱᛶ
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.AbstractC0050, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.mo395()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            return r1
    }

    @Override // defpackage.AbstractC0050, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r7) {
            r6 = this;
            int r0 = r7.length
            int r1 = r6.f9383
            if (r0 >= r1) goto L9
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r1)
        L9:
            int r0 = r6.f9383
            int r1 = r6.f9380
            r2 = 0
            r3 = r2
        Lf:
            java.lang.Object[] r4 = r6.f9382
            if (r3 >= r0) goto L20
            int r5 = r6.f9381
            if (r1 >= r5) goto L20
            r4 = r4[r1]
            r7[r3] = r4
            int r3 = r3 + 1
            int r1 = r1 + 1
            goto Lf
        L20:
            if (r3 >= r0) goto L2b
            r6 = r4[r2]
            r7[r3] = r6
            int r3 = r3 + 1
            int r2 = r2 + 1
            goto L20
        L2b:
            int r6 = r7.length
            if (r0 >= r6) goto L31
            r6 = 0
            r7[r0] = r6
        L31:
            return r7
    }

    @Override // defpackage.AbstractC0050
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final int mo395() {
            r0 = this;
            int r0 = r0.f9383
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m3602(int r6) {
            r5 = this;
            if (r6 < 0) goto L31
            int r0 = r5.f9383
            if (r6 > r0) goto L27
            if (r6 <= 0) goto L26
            int r0 = r5.f9380
            int r1 = r0 + r6
            int r2 = r5.f9381
            int r1 = r1 % r2
            java.lang.Object[] r3 = r5.f9382
            r4 = 0
            if (r0 <= r1) goto L1c
            java.util.Arrays.fill(r3, r0, r2, r4)
            r0 = 0
            java.util.Arrays.fill(r3, r0, r1, r4)
            goto L1f
        L1c:
            java.util.Arrays.fill(r3, r0, r1, r4)
        L1f:
            r5.f9380 = r1
            int r0 = r5.f9383
            int r0 = r0 - r6
            r5.f9383 = r0
        L26:
            return
        L27:
            java.lang.String r0 = ", size = "
            int r5 = r5.f9383
            java.lang.String r1 = "n shouldn't be greater than the buffer size: n = "
            defpackage.C2264.m3669(r1, r6, r0, r5)
            return
        L31:
            java.lang.String r5 = "n shouldn't be negative but it is "
            java.lang.String r5 = defpackage.AbstractC1124.m2145(r6, r5)
            defpackage.C2264.m3678(r5)
            return
    }
}
