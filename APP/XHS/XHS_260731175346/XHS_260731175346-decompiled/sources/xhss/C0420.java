package xhss;

/* JADX INFO: renamed from: xhss.ᛴᲇᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0420 extends xhss.AbstractC0775 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static volatile xhss.C0420 f1484;

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public static xhss.C0420 m811() {
            xhss.ᛴᲇᲇᲈ r0 = xhss.C0420.f1484
            if (r0 == 0) goto L7
            xhss.ᛴᲇᲇᲈ r0 = xhss.C0420.f1484
            return r0
        L7:
            java.lang.Class<xhss.ᛴᲇᲇᲈ> r0 = xhss.C0420.class
            monitor-enter(r0)
            xhss.ᛴᲇᲇᲈ r1 = xhss.C0420.f1484     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L21
            xhss.ᛴᲇᲇᲈ r1 = new xhss.ᛴᲇᲇᲈ     // Catch: java.lang.Throwable -> L1f
            r1.<init>()     // Catch: java.lang.Throwable -> L1f
            xhss.ᛷᛶᲈᲈ r2 = new xhss.ᛷᛶᲈᲈ     // Catch: java.lang.Throwable -> L1f
            r2.<init>()     // Catch: java.lang.Throwable -> L1f
            r3 = 4
            java.util.concurrent.Executors.newFixedThreadPool(r3, r2)     // Catch: java.lang.Throwable -> L1f
            xhss.C0420.f1484 = r1     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r1 = move-exception
            goto L25
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            xhss.ᛴᲇᲇᲈ r0 = xhss.C0420.f1484
            return r0
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r1
    }
}
