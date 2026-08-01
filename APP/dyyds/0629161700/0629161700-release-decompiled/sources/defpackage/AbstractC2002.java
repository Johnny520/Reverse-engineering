package defpackage;

/* JADX INFO: renamed from: ᲇᛲᛷᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2002 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.util.HashMap f8650 = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            defpackage.AbstractC2002.f8650 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static synchronized void m3395(android.app.Activity r4) {
            java.lang.Class<ᲇᛲᛷᛳ> r0 = defpackage.AbstractC2002.class
            monitor-enter(r0)
            int r1 = r4.getRequestedOrientation()     // Catch: java.lang.Throwable -> L2d
            r2 = -1
            if (r1 != r2) goto Lc
            monitor-exit(r0)
            return
        Lc:
            java.util.HashMap r1 = defpackage.AbstractC2002.f8650     // Catch: java.lang.Throwable -> L2d
            int r3 = r4.hashCode()     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L20
            monitor-exit(r0)
            return
        L20:
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L2d
            if (r1 != r2) goto L28
            monitor-exit(r0)
            return
        L28:
            r4.setRequestedOrientation(r2)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r0)
            return
        L2d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r4
    }
}
