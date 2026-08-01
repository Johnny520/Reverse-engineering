package defpackage;

/* JADX INFO: renamed from: ᛱᲀᲁᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0170 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.util.HashMap f1148 = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            defpackage.AbstractC0170.f1148 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Class<ᛸᛷᲀᲈ> r0 = defpackage.AbstractC1533.class
            m705(r0)
            java.lang.Class<ᛴᛸᛳ> r0 = defpackage.AbstractC0725.class
            m705(r0)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m705(java.lang.Class r3) {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.HashMap r1 = defpackage.AbstractC0170.f1148
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
