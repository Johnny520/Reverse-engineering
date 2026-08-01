package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛱᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0828 extends xhss.AbstractC0937 {

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public final java.lang.Class f2702;

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public xhss.AbstractC0463 f2703;

    public C0828(xhss.C0623 r1, java.lang.Class r2) {
            r0 = this;
            r0.<init>(r1)
            java.lang.Class r1 = r2.getComponentType()
            r0.f2702 = r1
            return
    }

    @Override // xhss.AbstractC0463
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo837(java.lang.Object r4) {
            r3 = this;
            java.util.List r4 = (java.util.List) r4
            int r0 = r4.size()
            java.lang.Class r3 = r3.f2702
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r0)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L13:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r4.next()
            int r2 = r0 + 1
            r3[r0] = r1
            r0 = r2
            goto L13
        L23:
            return r3
    }

    @Override // xhss.AbstractC0463
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final xhss.AbstractC0463 mo841(java.lang.String r2) {
            r1 = this;
            xhss.ᛵᛳᲈᛶ r2 = r1.f2703
            if (r2 != 0) goto Le
            xhss.ᛷᛱᛳᲁ r2 = r1.f1675
            java.lang.Class r0 = r1.f2702
            xhss.ᛵᛳᲈᛶ r2 = r2.m1096(r0)
            r1.f2703 = r2
        Le:
            return r2
    }

    @Override // xhss.AbstractC0463
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    public final xhss.AbstractC0463 mo843(java.lang.String r2) {
            r1 = this;
            xhss.ᛵᛳᲈᛶ r2 = r1.f2703
            if (r2 != 0) goto Le
            xhss.ᛷᛱᛳᲁ r2 = r1.f1675
            java.lang.Class r0 = r1.f2702
            xhss.ᛵᛳᲈᛶ r2 = r2.m1096(r0)
            r1.f2703 = r2
        Le:
            return r2
    }
}
