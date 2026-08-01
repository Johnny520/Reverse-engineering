package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛵᛱᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0762 extends xhss.AbstractC0121 {
    public C0762() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r3) {
            r2 = this;
            java.lang.String r2 = r3.m739()
            java.util.Currency r2 = java.util.Currency.getInstance(r2)     // Catch: java.lang.IllegalArgumentException -> L9
            return r2
        L9:
            r0 = move-exception
            r1 = 1
            java.lang.String r3 = r3.m764(r1)
            java.lang.String r1 = "' as Currency; at path "
            xhss.C0532.m951(r2, r1, r3, r0)
            r2 = 0
            return r2
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r1, java.lang.Object r2) {
            r0 = this;
            java.util.Currency r2 = (java.util.Currency) r2
            java.lang.String r0 = r2.getCurrencyCode()
            r1.m1405(r0)
            return
    }
}
