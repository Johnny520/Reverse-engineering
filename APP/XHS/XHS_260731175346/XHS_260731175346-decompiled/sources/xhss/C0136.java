package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛲᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0136 extends xhss.AbstractC0121 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ xhss.AbstractC0121 f595;

    public C0136(xhss.AbstractC0121 r1) {
            r0 = this;
            r0.<init>()
            r0.f595 = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NullSafeTypeAdapter["
            r0.<init>(r1)
            xhss.ᛲᛱᛶᛴ r2 = r2.f595
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r3) {
            r2 = this;
            int r0 = r3.m762()
            r1 = 9
            if (r0 != r1) goto Ld
            r3.m756()
            r2 = 0
            return r2
        Ld:
            xhss.ᛲᛱᛶᛴ r2 = r2.f595
            java.lang.Object r2 = r2.mo119(r3)
            return r2
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r1, java.lang.Object r2) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.m1396()
            return
        L6:
            xhss.ᛲᛱᛶᛴ r0 = r0.f595
            r0.mo120(r1, r2)
            return
    }
}
