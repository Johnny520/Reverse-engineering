package defpackage;

/* JADX INFO: renamed from: ᛸᛶᛷᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1511 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.util.ArrayList f6677 = null;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            defpackage.AbstractC1511.f6677 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static synchronized boolean m2746(java.lang.String r4) {
            java.lang.Class<ᛸᛶᛷᛶ> r0 = defpackage.AbstractC1511.class
            monitor-enter(r0)
            java.util.ArrayList r1 = defpackage.AbstractC1511.f6677     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L31
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L31
            java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto L18
            goto L9
        L18:
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L31
            ᲁᛶᲁ r2 = (defpackage.C1876) r2     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto L21
            goto L9
        L21:
            java.lang.String r3 = r2.f8148     // Catch: java.lang.Throwable -> L31
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> L31
            if (r3 != 0) goto L2a
            goto L9
        L2a:
            boolean r2 = r2.f8147     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L9
            monitor-exit(r0)
            r4 = 1
            return r4
        L31:
            r4 = move-exception
            goto L36
        L33:
            monitor-exit(r0)
            r4 = 0
            return r4
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r4
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static synchronized java.util.ArrayList m2747(java.lang.String r5) {
            java.lang.Class<ᛸᛶᛷᛶ> r0 = defpackage.AbstractC1511.class
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L34
            r2 = 1
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L34
            java.util.ArrayList r2 = defpackage.AbstractC1511.f6677     // Catch: java.lang.Throwable -> L34
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L34
        Lf:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L36
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L34
            java.lang.ref.Reference r3 = (java.lang.ref.Reference) r3     // Catch: java.lang.Throwable -> L34
            if (r3 != 0) goto L1e
            goto Lf
        L1e:
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L34
            ᲁᛶᲁ r3 = (defpackage.C1876) r3     // Catch: java.lang.Throwable -> L34
            if (r3 != 0) goto L27
            goto Lf
        L27:
            java.lang.String r4 = r3.f8148     // Catch: java.lang.Throwable -> L34
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L30
            goto Lf
        L30:
            r1.add(r3)     // Catch: java.lang.Throwable -> L34
            goto Lf
        L34:
            r5 = move-exception
            goto L38
        L36:
            monitor-exit(r0)
            return r1
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r5
    }
}
