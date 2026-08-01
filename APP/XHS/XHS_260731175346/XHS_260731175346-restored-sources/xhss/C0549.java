package xhss;

/* JADX INFO: renamed from: xhss.ᛶᛳᛳᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0549 extends xhss.AbstractC0052 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.time.OffsetDateTime f1970;

    public C0549(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            java.time.OffsetDateTime r1 = java.time.OffsetDateTime.parse(r1)
            r0.f1970 = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof xhss.C0549
            r2 = 0
            if (r1 != 0) goto Le
            boolean r1 = r4 instanceof xhss.C1192
            if (r1 != 0) goto Le
            return r2
        Le:
            xhss.ᛱᛶᛶᛱ r4 = (xhss.AbstractC0052) r4
            xhss.ᛶᛳᛳᛶ r4 = r4.mo163()
            java.time.OffsetDateTime r3 = r3.f1970
            java.time.OffsetDateTime r4 = r4.f1970
            int r3 = r3.compareTo(r4)
            if (r3 != 0) goto L1f
            return r0
        L1f:
            return r2
    }

    public final java.lang.String toString() {
            r0 = this;
            java.time.OffsetDateTime r0 = r0.f1970
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // xhss.AbstractC0052
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public final xhss.C0549 mo163() {
            r0 = this;
            return r0
    }

    @Override // xhss.AbstractC0052
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final xhss.C1192 mo166() {
            r2 = this;
            xhss.ᲈᲇᛱᛶ r0 = new xhss.ᲈᲇᛱᛶ
            java.time.OffsetDateTime r2 = r2.f1970
            java.lang.String r2 = r2.toString()
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // xhss.AbstractC0052
    /* JADX INFO: renamed from: ᛸᛷᲈᲈ */
    public final java.lang.Class mo167(xhss.C1180 r1) {
            r0 = this;
            java.lang.Class<xhss.ᛶᛳᛳᛶ> r0 = xhss.C0549.class
            return r0
    }
}
