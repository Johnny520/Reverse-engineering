package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛵᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0865 implements java.util.Map.Entry, xhss.InterfaceC0057 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0686 f2794;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final int f2795;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final int f2796;

    public C0865(xhss.C0686 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f2794 = r1
            r0.f2795 = r2
            int r1 = r1.f2324
            r0.f2796 = r1
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.util.Map.Entry
            if (r0 == 0) goto L24
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r1 = r2.getKey()
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)
            if (r0 == 0) goto L24
            java.lang.Object r3 = r3.getValue()
            java.lang.Object r2 = r2.getValue()
            boolean r2 = xhss.AbstractC0007.m97(r3, r2)
            if (r2 == 0) goto L24
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r1 = this;
            r1.m1440()
            xhss.ᛷᛸᛵᛶ r0 = r1.f2794
            java.lang.Object[] r0 = r0.f2320
            int r1 = r1.f2795
            r1 = r0[r1]
            return r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r1 = this;
            r1.m1440()
            xhss.ᛷᛸᛵᛶ r0 = r1.f2794
            java.lang.Object[] r0 = r0.f2321
            int r1 = r1.f2795
            r1 = r0[r1]
            return r1
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.getKey()
            r1 = 0
            if (r0 == 0) goto Lc
            int r0 = r0.hashCode()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            java.lang.Object r2 = r2.getValue()
            if (r2 == 0) goto L17
            int r1 = r2.hashCode()
        L17:
            r2 = r0 ^ r1
            return r2
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r3) {
            r2 = this;
            r2.m1440()
            xhss.ᛷᛸᛵᛶ r0 = r2.f2794
            r0.m1164()
            java.lang.Object[] r1 = r0.f2321
            if (r1 == 0) goto Ld
            goto L16
        Ld:
            java.lang.Object[] r1 = r0.f2320
            int r1 = r1.length
            if (r1 < 0) goto L1d
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.f2321 = r1
        L16:
            int r2 = r2.f2795
            r0 = r1[r2]
            r1[r2] = r3
            return r0
        L1d:
            java.lang.String r2 = "capacity must be non-negative."
            xhss.C0532.m959(r2)
            r2 = 0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.getKey()
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.Object r2 = r2.getValue()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1440() {
            r1 = this;
            xhss.ᛷᛸᛵᛶ r0 = r1.f2794
            int r0 = r0.f2324
            int r1 = r1.f2796
            if (r0 != r1) goto L9
            return
        L9:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            java.lang.String r0 = "The backing map has been modified after this entry was obtained."
            r1.<init>(r0)
            throw r1
    }
}
