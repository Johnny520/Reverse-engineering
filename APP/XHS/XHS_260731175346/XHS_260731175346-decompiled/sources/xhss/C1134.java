package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛳᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1134 extends xhss.AbstractC0709 implements java.util.RandomAccess {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.AbstractC0709 f3661;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final int f3662;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final int f3663;

    public C1134(xhss.AbstractC0709 r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f3661 = r1
            r0.f3662 = r2
            int r1 = r1.mo426()
            xhss.AbstractC0561.m997(r2, r3, r1)
            int r3 = r3 - r2
            r0.f3663 = r3
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r4) {
            r3 = this;
            int r0 = r3.f3663
            if (r4 < 0) goto L10
            if (r4 >= r0) goto L10
            int r0 = r3.f3662
            int r0 = r0 + r4
            xhss.ᛷᲁᲁ r3 = r3.f3661
            java.lang.Object r3 = r3.get(r0)
            return r3
        L10:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "index: "
            java.lang.String r2 = ", size: "
            java.lang.String r4 = xhss.AbstractC0390.m782(r4, r0, r1, r2)
            r3.<init>(r4)
            throw r3
    }

    @Override // xhss.AbstractC0709, java.util.List
    public final java.util.List subList(int r3, int r4) {
            r2 = this;
            int r0 = r2.f3663
            xhss.AbstractC0561.m997(r3, r4, r0)
            xhss.ᲈᛳᲀ r0 = new xhss.ᲈᛳᲀ
            int r1 = r2.f3662
            int r3 = r3 + r1
            int r1 = r1 + r4
            xhss.ᛷᲁᲁ r2 = r2.f3661
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // xhss.AbstractC0652
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final int mo426() {
            r0 = this;
            int r0 = r0.f3663
            return r0
    }
}
