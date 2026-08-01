package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛷᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0380 implements xhss.InterfaceC0497, java.io.Serializable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public xhss.InterfaceC0030 f1372;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public volatile java.lang.Object f1373;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.Object f1374;

    public C0380(xhss.InterfaceC0030 r1) {
            r0 = this;
            r0.<init>()
            r0.f1372 = r1
            xhss.ᛳᛴᲀᲁ r1 = xhss.C0263.f976
            r0.f1373 = r1
            r0.f1374 = r0
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.Object r0 = r2.f1373
            xhss.ᛳᛴᲀᲁ r1 = xhss.C0263.f976
            if (r0 == r1) goto Lf
            java.lang.Object r2 = r2.m734()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            return r2
        Lf:
            java.lang.String r2 = "Lazy value not initialized yet."
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.Object m734() {
            r3 = this;
            java.lang.Object r0 = r3.f1373
            xhss.ᛳᛴᲀᲁ r1 = xhss.C0263.f976
            if (r0 == r1) goto L7
            return r0
        L7:
            java.lang.Object r0 = r3.f1374
            monitor-enter(r0)
            java.lang.Object r2 = r3.f1373     // Catch: java.lang.Throwable -> L1c
            if (r2 == r1) goto Lf
            goto L1a
        Lf:
            xhss.ᛱᛳᲇᛶ r1 = r3.f1372     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = r1.mo136()     // Catch: java.lang.Throwable -> L1c
            r3.f1373 = r2     // Catch: java.lang.Throwable -> L1c
            r1 = 0
            r3.f1372 = r1     // Catch: java.lang.Throwable -> L1c
        L1a:
            monitor-exit(r0)
            return r2
        L1c:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }
}
