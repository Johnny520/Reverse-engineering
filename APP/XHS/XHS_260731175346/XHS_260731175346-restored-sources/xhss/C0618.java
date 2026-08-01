package xhss;

/* JADX INFO: renamed from: xhss.ᛶᲈᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0618 extends xhss.AbstractC1161 {

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.C0587 f2135;

    public C0618(xhss.C0587 r1) {
            r0 = this;
            r0.<init>()
            r0.f2135 = r1
            return
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.String mo130() {
            r0 = this;
            xhss.ᛶᛸᲇᛶ r0 = r0.f2135
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo131(java.lang.String r3, xhss.AbstractC0356 r4, java.lang.Object r5, xhss.C0530 r6) {
            r2 = this;
            xhss.ᛶᛸᲇᛶ r4 = r2.f2135
            java.util.List r4 = r4.f2044
            boolean r0 = r2.m1858(r3, r5, r6)
            if (r0 != 0) goto Lb
            goto L39
        Lb:
            int r0 = r4.size()
            r1 = 1
            if (r0 != r1) goto L21
            r0 = 0
            java.lang.Object r4 = r4.get(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.m558(r4, r3, r5, r6)
            return
        L21:
            java.util.Iterator r4 = r4.iterator()
        L25:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r4.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.m558(r0, r3, r5, r6)
            goto L25
        L39:
            return
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final boolean mo133() {
            r1 = this;
            xhss.ᛶᛸᲇᛶ r1 = r1.f2135
            java.util.List r1 = r1.f2044
            int r1 = r1.size()
            r0 = 1
            if (r1 != r0) goto Lc
            return r0
        Lc:
            r1 = 0
            return r1
    }
}
