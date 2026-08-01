package defpackage;

/* JADX INFO: renamed from: ᛲᛲᲀᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0257 implements defpackage.InterfaceC0267 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.util.concurrent.LinkedBlockingQueue f1509;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.concurrent.ConcurrentHashMap f1510;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public volatile boolean f1511;

    public C0257() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1511 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f1510 = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            r1.f1509 = r0
            return
    }

    @Override // defpackage.InterfaceC0267
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final synchronized defpackage.InterfaceC0150 mo884(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.ConcurrentHashMap r0 = r3.f1510     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L1a
            ᲁᛱᛱᲁ r0 = (defpackage.C1792) r0     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            ᲁᛱᛱᲁ r0 = new ᲁᛱᛱᲁ     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.LinkedBlockingQueue r1 = r3.f1509     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r3.f1511     // Catch: java.lang.Throwable -> L1a
            r0.<init>(r4, r1, r2)     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.ConcurrentHashMap r1 = r3.f1510     // Catch: java.lang.Throwable -> L1a
            r1.put(r4, r0)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r4 = move-exception
            goto L1e
        L1c:
            monitor-exit(r3)
            return r0
        L1e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1a
            throw r4
    }
}
