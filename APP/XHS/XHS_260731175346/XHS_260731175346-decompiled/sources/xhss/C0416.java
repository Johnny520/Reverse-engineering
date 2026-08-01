package xhss;

/* JADX INFO: renamed from: xhss.ᛴᲇᛷᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0416 extends xhss.AbstractC0121 {
    public C0416() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r4) {
            r3 = this;
            int r3 = r4.m762()
            r0 = 9
            r1 = 0
            if (r3 != r0) goto Ld
            r4.m756()
            return r1
        Ld:
            java.lang.String r3 = r4.m739()
            java.math.BigDecimal r3 = xhss.AbstractC1178.m1867(r3)     // Catch: java.lang.NumberFormatException -> L16
            return r3
        L16:
            r0 = move-exception
            r2 = 1
            java.lang.String r4 = r4.m764(r2)
            java.lang.String r2 = "' as BigDecimal; at path "
            xhss.C0532.m951(r3, r2, r4, r0)
            return r1
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r1, java.lang.Object r2) {
            r0 = this;
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
            r1.m1394(r2)
            return
    }
}
