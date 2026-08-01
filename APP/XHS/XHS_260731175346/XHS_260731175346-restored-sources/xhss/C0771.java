package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛵᛸᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0771 extends xhss.AbstractC1161 {

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static final xhss.InterfaceC0869 f2546 = null;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.C0481 f2547;

    static {
            java.lang.Class<xhss.ᛸᛵᛸᛸ> r0 = xhss.C0771.class
            xhss.ᲀᛶᛶᲀ r0 = xhss.AbstractC0993.m1628(r0)
            xhss.C0771.f2546 = r0
            return
    }

    public C0771(xhss.C0481 r1) {
            r0 = this;
            r0.<init>()
            r0.f2547 = r1
            return
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.String mo130() {
            r0 = this;
            xhss.ᛵᛶᛳ r0 = r0.f2547
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo131(java.lang.String r7, xhss.AbstractC0356 r8, java.lang.Object r9, xhss.C0530 r10) {
            r6 = this;
            xhss.ᲀᛲᲇ r8 = r10.f1940
            xhss.ᛵᛶᛳ r0 = r6.f2547
            java.lang.Object r1 = r0.f1744
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r2 = r0.f1742
            java.lang.Integer r2 = (java.lang.Integer) r2
            boolean r3 = r6.m1858(r7, r9, r10)
            if (r3 != 0) goto L14
            goto Lc6
        L14:
            int r0 = r0.f1741
            int r0 = xhss.AbstractC0390.m784(r0)
            r3 = 0
            xhss.ᲀᛶᛶᲀ r4 = xhss.C0771.f2546
            if (r0 == 0) goto L8d
            r5 = 1
            if (r0 == r5) goto L5c
            r3 = 2
            if (r0 == r3) goto L27
            goto Lc6
        L27:
            xhss.ᲇᛵᛲᲁ r8 = r8.f2745
            int r8 = r8.m1696(r9)
            int r0 = r2.intValue()
            int r1 = r1.intValue()
            int r1 = java.lang.Math.min(r8, r1)
            if (r0 >= r1) goto Lc6
            if (r8 != 0) goto L3f
            goto Lc6
        L3f:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.String r5 = r6.toString()
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r2, r3, r5}
            java.lang.String r2 = "Slice between indexes on array with length: {}. From index: {} to: {}. Input: {}"
            r4.mo376(r2, r8)
        L54:
            if (r0 >= r1) goto Lc6
            r6.m558(r0, r7, r9, r10)
            int r0 = r0 + 1
            goto L54
        L5c:
            xhss.ᲇᛵᛲᲁ r8 = r8.f2745
            int r8 = r8.m1696(r9)
            if (r8 != 0) goto L65
            goto Lc6
        L65:
            int r0 = r1.intValue()
            if (r0 >= 0) goto L6c
            int r0 = r0 + r8
        L6c:
            int r0 = java.lang.Math.min(r8, r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = r6.toString()
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r1, r2}
            java.lang.String r1 = "Slice to index on array with length: {}. From index: 0 to: {}. Input: {}"
            r4.mo376(r1, r8)
        L85:
            if (r3 >= r0) goto Lc6
            r6.m558(r3, r7, r9, r10)
            int r3 = r3 + 1
            goto L85
        L8d:
            xhss.ᲇᛵᛲᲁ r8 = r8.f2745
            int r8 = r8.m1696(r9)
            int r0 = r2.intValue()
            if (r0 >= 0) goto L9a
            int r0 = r0 + r8
        L9a:
            int r0 = java.lang.Math.max(r3, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r3 = r8 + (-1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = r6.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3, r5}
            java.lang.String r2 = "Slice from index on array with length: {}. From index: {} to: {}. Input: {}"
            r4.mo376(r2, r1)
            if (r8 == 0) goto Lc6
            if (r0 < r8) goto Lbe
            goto Lc6
        Lbe:
            if (r0 >= r8) goto Lc6
            r6.m558(r0, r7, r9, r10)
            int r0 = r0 + 1
            goto Lbe
        Lc6:
            return
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final boolean mo133() {
            r0 = this;
            r0 = 0
            return r0
    }
}
