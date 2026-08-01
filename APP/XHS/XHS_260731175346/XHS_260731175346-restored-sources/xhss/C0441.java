package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛲᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0441 extends xhss.AbstractC0561 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public xhss.C0950 f1581;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public java.util.List f1582;

    @Override // xhss.AbstractC0561
    /* JADX INFO: renamed from: ᛸᛶᲈᛶ */
    public final int mo135(xhss.C0099 r5) {
            r4 = this;
            java.util.List r0 = r4.f1582
            r1 = 0
            if (r0 == 0) goto L3c
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = xhss.AbstractC0249.m554(r0)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r0.next()
            xhss.ᛱᛳᛸ r3 = (xhss.C0028) r3
            if (r3 == 0) goto L25
        L20:
            int r3 = r3.mo135(r5)
            goto L2b
        L25:
            xhss.ᛱᛳᛸ r3 = new xhss.ᛱᛳᛸ
            r3.<init>()
            goto L20
        L2b:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L12
        L33:
            int[] r0 = xhss.AbstractC0713.m1238(r2)
            int r0 = r5.m260(r0)
            goto L3d
        L3c:
            r0 = r1
        L3d:
            xhss.ᲁᛴᲇᛲ r4 = r4.f1581
            if (r4 == 0) goto L46
            int r4 = r4.mo135(r5)
            goto L47
        L46:
            r4 = r1
        L47:
            r2 = 2
            r5.m258(r2)
            r2 = 1
            r5.m253(r2, r4)
            r5.m253(r1, r0)
            int r4 = r5.m257()
            r5.m259(r4)
            return r4
    }
}
