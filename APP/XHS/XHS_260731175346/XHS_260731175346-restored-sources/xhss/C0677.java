package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛷᛳᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0677 extends xhss.AbstractC0356 {

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f2295;

    @Override // xhss.AbstractC0356, java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            xhss.ᛴᛴᛴᛷ r2 = (xhss.AbstractC0356) r2
            boolean r0 = r2 instanceof xhss.C0677
            if (r0 == 0) goto L11
            xhss.ᛷᛷᛳᛶ r2 = (xhss.C0677) r2
            int r2 = r2.f2295
            int r1 = r1.f2295
            int r1 = java.lang.Integer.compare(r2, r1)
            return r1
        L11:
            int r1 = super.mo715(r2)
            return r1
    }

    @Override // xhss.AbstractC0356
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo714() {
            r0 = this;
            int r0 = r0.f2295
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    @Override // xhss.AbstractC0356
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final int mo715(xhss.AbstractC0356 r1) {
            r0 = this;
            r0 = 0
            throw r0
    }
}
