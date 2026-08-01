package defpackage;

/* JADX INFO: renamed from: ᛸᛴᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C1483 extends defpackage.AbstractC0758 {
    public C1483() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r1, java.lang.Object r2) {
            r0 = this;
            java.util.Currency r2 = (java.util.Currency) r2
            java.lang.String r0 = r2.getCurrencyCode()
            r1.m1075(r0)
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r3) {
            r2 = this;
            java.lang.String r2 = r3.m2096()
            java.util.Currency r2 = java.util.Currency.getInstance(r2)     // Catch: java.lang.IllegalArgumentException -> L9
            return r2
        L9:
            r0 = move-exception
            r1 = 1
            java.lang.String r3 = r3.m2106(r1)
            java.lang.String r1 = "' as Currency; at path "
            defpackage.C0086.m552(r2, r1, r3, r0)
            r2 = 0
            return r2
    }
}
