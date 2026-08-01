package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛷᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1161 extends xhss.AbstractC0252 {
    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final boolean m1858(java.lang.String r2, java.lang.Object r3, xhss.C0530 r4) {
            r1 = this;
            xhss.ᲀᛲᲇ r4 = r4.f1940
            xhss.ᛳᛳᛱᛳ r0 = xhss.EnumC0250.f930
            if (r3 != 0) goto L23
            boolean r1 = r1.m561()
            if (r1 == 0) goto L4f
            java.util.Set r1 = r4.f2744
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L15
            goto L4f
        L15:
            xhss.ᛸᲁᛴᛷ r1 = new xhss.ᛸᲁᛴᛷ
            java.lang.String r3 = "The path "
            java.lang.String r4 = " is null"
            java.lang.String r2 = xhss.AbstractC0390.m781(r3, r2, r4)
            r1.<init>(r2)
            throw r1
        L23:
            xhss.ᲇᛵᛲᲁ r2 = r4.f2745
            r2.getClass()
            boolean r2 = r3 instanceof java.util.List
            if (r2 != 0) goto L51
            boolean r2 = r1.m561()
            if (r2 == 0) goto L4f
            java.util.Set r2 = r4.f2744
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L3b
            goto L4f
        L3b:
            xhss.ᛸᲁᛴᛷ r2 = new xhss.ᛸᲁᛴᛷ
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3}
            java.lang.String r3 = "Filter: %s can only be applied to arrays. Current context is: %s"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            r2.<init>(r1)
            throw r2
        L4f:
            r1 = 0
            return r1
        L51:
            r1 = 1
            return r1
    }
}
