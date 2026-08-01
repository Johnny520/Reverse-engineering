package xhss;

/* JADX INFO: renamed from: xhss.ᛴᲇᲀᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0417 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final xhss.InterfaceC0869 f1477 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final boolean f1478;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0881 f1479;

    static {
            java.lang.Class<xhss.ᛴᲇᲀᛴ> r0 = xhss.C0417.class
            xhss.ᲀᛶᛶᲀ r0 = xhss.AbstractC0993.m1628(r0)
            xhss.C0417.f1477 = r0
            return
    }

    public C0417(xhss.C0881 r5, boolean r6) {
            r4 = this;
            r4.<init>()
            xhss.ᛳᛳᛵᛱ r0 = r5.f2840
            boolean r0 = r0 instanceof xhss.C1112
            if (r0 == 0) goto L54
            xhss.ᛳᛳᛵᛱ r0 = r5.m560()
            boolean r0 = r0 instanceof xhss.C0079
            if (r0 == 0) goto L54
            r0 = 0
            r1 = r5
            r2 = r0
        L14:
            xhss.ᛳᛳᛵᛱ r1 = r1.m560()
            if (r1 == 0) goto L20
            boolean r3 = r1 instanceof xhss.C1112
            if (r3 != 0) goto L20
            r2 = r1
            goto L14
        L20:
            boolean r3 = r1 instanceof xhss.C1112
            if (r3 == 0) goto L54
            r2.f936 = r0
            r5.f2840 = r2
            xhss.ᛴᛸᛵᛴ r0 = new xhss.ᛴᛸᛵᛴ
            r0.<init>()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.f1403 = r2
            xhss.ᛴᲇᲀᛴ r2 = new xhss.ᛴᲇᲀᛴ
            r3 = 1
            r2.<init>(r5, r3)
            r0.f1400 = r2
            r5 = 2
            r0.f1402 = r5
            r5 = r1
            xhss.ᲈᛱᛲ r5 = (xhss.C1112) r5
            xhss.ᛴᛸᛵᛴ[] r0 = new xhss.C0395[]{r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r5.f3585 = r0
            xhss.ᲀᛷᲈᛳ r5 = new xhss.ᲀᛷᲈᛳ
            r0 = 36
            r5.<init>(r0)
            r5.f2840 = r1
            r5.f936 = r1
        L54:
            r4.f1479 = r5
            r4.f1478 = r6
            return
    }

    public final java.lang.String toString() {
            r0 = this;
            xhss.ᲀᛷᲈᛳ r0 = r0.f1479
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0530 m810(java.lang.Object r4, java.lang.Object r5, xhss.C0844 r6) {
            r3 = this;
            xhss.ᲀᛶᛶᲀ r0 = xhss.C0417.f1477
            boolean r1 = r0.mo385()
            xhss.ᲀᛷᲈᛳ r2 = r3.f1479
            if (r1 == 0) goto L11
            java.lang.String r1 = r2.toString()
            r0.mo379(r1)
        L11:
            xhss.ᛵᲈᛷ r0 = new xhss.ᛵᲈᛷ
            r0.<init>(r3, r5, r6)
            xhss.ᲀᛱᛸᛳ r3 = xhss.AbstractC0356.f1319     // Catch: xhss.C0699 -> L1d
            java.lang.String r5 = ""
            r2.mo131(r5, r3, r4, r0)     // Catch: xhss.C0699 -> L1d
        L1d:
            return r0
    }
}
