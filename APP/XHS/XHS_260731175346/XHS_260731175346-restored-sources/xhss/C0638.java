package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛳᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0638 extends xhss.AbstractC0495 implements java.lang.Iterable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.util.ArrayList f2191;

    public C0638() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2191 = r0
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L15
            boolean r0 = r2 instanceof xhss.C0638
            if (r0 == 0) goto L13
            xhss.ᛷᛳᛶᲇ r2 = (xhss.C0638) r2
            java.util.ArrayList r2 = r2.f2191
            java.util.ArrayList r1 = r1.f2191
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 0
            return r1
        L15:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.util.ArrayList r0 = r0.f2191
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r0 = this;
            java.util.ArrayList r0 = r0.f2191
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // xhss.AbstractC0495
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final long mo900() {
            r2 = this;
            xhss.ᛵᛷᛸᛶ r2 = r2.m1107()
            long r0 = r2.mo900()
            return r0
    }

    @Override // xhss.AbstractC0495
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final java.lang.String mo901() {
            r0 = this;
            xhss.ᛵᛷᛸᛶ r0 = r0.m1107()
            java.lang.String r0 = r0.mo901()
            return r0
    }

    @Override // xhss.AbstractC0495
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final int mo902() {
            r0 = this;
            xhss.ᛵᛷᛸᛶ r0 = r0.m1107()
            int r0 = r0.mo902()
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.AbstractC0495 m1107() {
            r2 = this;
            java.util.ArrayList r2 = r2.f2191
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L11
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            xhss.ᛵᛷᛸᛶ r2 = (xhss.AbstractC0495) r2
            return r2
        L11:
            java.lang.String r2 = "Array must have size 1, but has size "
            java.lang.String r2 = xhss.AbstractC0390.m774(r2, r0)
            xhss.C0532.m950(r2)
            r2 = 0
            return r2
    }
}
