package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛵᛸᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0770 implements xhss.InterfaceC0030 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0331 f2544;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0927 f2545;

    public C0770(xhss.C0927 r1, xhss.C0331 r2) {
            r0 = this;
            r0.<init>()
            r0.f2545 = r1
            r0.f2544 = r2
            return
    }

    @Override // xhss.InterfaceC0030
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final java.lang.Object mo136() {
            r5 = this;
            xhss.ᲁᛲᛵ r0 = r5.f2545
            xhss.ᛴᛱᛱ r1 = r5.f2544
            r2 = 1
            r3 = 0
            boolean r4 = r1.m669(r2, r5)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r4 == 0) goto L20
        Lc:
            r4 = 0
            boolean r4 = r1.m669(r4, r5)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r4 != 0) goto Lc
            r5 = 9
            r0.m1520(r2, r5, r3)
        L18:
            xhss.AbstractC0577.m1041(r1)
            goto L35
        L1c:
            r5 = move-exception
            goto L28
        L1e:
            r5 = move-exception
            goto L30
        L20:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            java.lang.String r2 = "Required SETTINGS preface not received"
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            throw r5     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
        L28:
            r2 = 3
            r0.m1520(r2, r2, r3)
            xhss.AbstractC0577.m1041(r1)
            throw r5
        L30:
            r2 = 2
            r0.m1520(r2, r2, r5)
            goto L18
        L35:
            xhss.ᛵᛷᲈᛶ r5 = xhss.C0500.f1817
            return r5
    }
}
