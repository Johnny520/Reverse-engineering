package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛱᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0729 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final java.util.HashMap f2461 = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            xhss.AbstractC0729.f2461 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Class<xhss.ᛵᛵᛲᲈ> r0 = xhss.AbstractC0473.class
            m1273(r0)
            java.lang.Class<xhss.ᛶᛱᛱᛳ> r0 = xhss.AbstractC0533.class
            m1273(r0)
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static void m1273(java.lang.Class r3) {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.HashMap r1 = xhss.AbstractC0729.f2461
            monitor-enter(r1)
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L18
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L16
            r2.<init>()     // Catch: java.lang.Throwable -> L16
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r3 = move-exception
            goto L1d
        L18:
            r2.add(r3)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            return
        L1d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r3
    }
}
