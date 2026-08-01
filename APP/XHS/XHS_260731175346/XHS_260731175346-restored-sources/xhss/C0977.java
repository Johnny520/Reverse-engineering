package xhss;

/* JADX INFO: renamed from: xhss.ᲁᛸᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0977 implements xhss.InterfaceC0189 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0417 f3180;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.String f3181;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final java.lang.Object f3182;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.C0844 f3183;

    public C0977(xhss.C0417 r2, java.lang.Object r3, xhss.C0844 r4) {
            r1 = this;
            r1.<init>()
            r1.f3180 = r2
            java.lang.String r0 = r3.toString()
            r1.f3181 = r0
            r1.f3183 = r4
            xhss.ᛵᲈᛷ r2 = r2.m810(r3, r3, r4)
            r3 = 1
            java.lang.Object r2 = r2.m943(r3)
            r1.f3182 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L2e
            java.lang.Class<xhss.ᲁᛸᛶᛳ> r2 = xhss.C0977.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L2e
        L10:
            xhss.ᲁᛸᛶᛳ r5 = (xhss.C0977) r5
            xhss.ᛴᲇᲀᛴ r2 = r4.f3180
            xhss.ᛴᲇᲀᛴ r3 = r5.f3180
            if (r2 == r3) goto L19
            goto L2e
        L19:
            java.lang.String r2 = r4.f3181
            java.lang.String r3 = r5.f3181
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2e
            xhss.ᲀᛲᲇ r4 = r4.f3183
            xhss.ᲀᛲᲇ r5 = r5.f3183
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 == 0) goto L2e
            return r0
        L2e:
            return r1
    }
}
