package defpackage;

/* JADX INFO: renamed from: ᲇᛸᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C2104 extends defpackage.AbstractC0758 {
    public C2104() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r1, java.lang.Object r2) {
            r0 = this;
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            r1.m1076(r2)
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r4) {
            r3 = this;
            int r3 = r4.m2090()
            r0 = 9
            r1 = 0
            if (r3 != r0) goto Ld
            r4.m2108()
            return r1
        Ld:
            java.lang.String r3 = r4.m2096()
            defpackage.AbstractC2279.m3700(r3)     // Catch: java.lang.NumberFormatException -> L1a
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch: java.lang.NumberFormatException -> L1a
            r0.<init>(r3)     // Catch: java.lang.NumberFormatException -> L1a
            return r0
        L1a:
            r0 = move-exception
            r2 = 1
            java.lang.String r4 = r4.m2106(r2)
            java.lang.String r2 = "' as BigInteger; at path "
            defpackage.C0086.m552(r3, r2, r4, r0)
            return r1
    }
}
