package xhss;

/* JADX INFO: renamed from: xhss.ᲈᲀᲇᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1180 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final xhss.InterfaceC0869 f3801 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object f3802;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0844 f3803;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.Object f3804;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.util.HashMap f3805;

    static {
            java.lang.Class<xhss.ᲈᲀᲇᛵ> r0 = xhss.C1180.class
            xhss.ᲀᛶᛶᲀ r0 = xhss.AbstractC0993.m1628(r0)
            xhss.C1180.f3801 = r0
            return
    }

    public C1180(java.lang.Object r1, java.lang.Object r2, xhss.C0844 r3, java.util.HashMap r4) {
            r0 = this;
            r0.<init>()
            r0.f3804 = r1
            r0.f3802 = r2
            r0.f3803 = r3
            r0.f3805 = r4
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.Object m1891(xhss.C0417 r5) {
            r4 = this;
            boolean r0 = r5.f1478
            r1 = 1
            xhss.ᲀᛲᲇ r2 = r4.f3803
            java.lang.Object r3 = r4.f3802
            if (r0 == 0) goto L3b
            java.util.HashMap r4 = r4.f3805
            boolean r0 = r4.containsKey(r5)
            if (r0 == 0) goto L2f
            xhss.ᲀᛷᲈᛳ r0 = r5.f1479
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Using cached result for root path: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            xhss.ᲀᛶᛶᲀ r1 = xhss.C1180.f3801
            r1.mo380(r0)
            java.lang.Object r4 = r4.get(r5)
            return r4
        L2f:
            xhss.ᛵᲈᛷ r0 = r5.m810(r3, r3, r2)
            java.lang.Object r0 = r0.m943(r1)
            r4.put(r5, r0)
            return r0
        L3b:
            java.lang.Object r4 = r4.f3804
            xhss.ᛵᲈᛷ r4 = r5.m810(r4, r3, r2)
            java.lang.Object r4 = r4.m943(r1)
            return r4
    }
}
