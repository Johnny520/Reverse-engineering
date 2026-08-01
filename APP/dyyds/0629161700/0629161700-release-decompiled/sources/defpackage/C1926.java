package defpackage;

/* JADX INFO: renamed from: ᲁᲁᛴᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1926 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public boolean f8365;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public java.lang.Object f8366;

    public C1926(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f8365 = r2
            r0.f8366 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public synchronized void m3352(defpackage.InterfaceC1901 r3, boolean r4) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f8365     // Catch: java.lang.Throwable -> L12
            r1 = 1
            if (r0 != 0) goto L14
            if (r4 == 0) goto L9
            goto L14
        L9:
            r2.f8365 = r1     // Catch: java.lang.Throwable -> L12
            r3.mo692()     // Catch: java.lang.Throwable -> L12
            r3 = 0
            r2.f8365 = r3     // Catch: java.lang.Throwable -> L12
            goto L1f
        L12:
            r3 = move-exception
            goto L21
        L14:
            java.lang.Object r4 = r2.f8366     // Catch: java.lang.Throwable -> L12
            android.os.Handler r4 = (android.os.Handler) r4     // Catch: java.lang.Throwable -> L12
            android.os.Message r3 = r4.obtainMessage(r1, r3)     // Catch: java.lang.Throwable -> L12
            r3.sendToTarget()     // Catch: java.lang.Throwable -> L12
        L1f:
            monitor-exit(r2)
            return
        L21:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
    }
}
