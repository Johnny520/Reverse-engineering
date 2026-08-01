package defpackage;

/* JADX INFO: renamed from: ᛸᛳᛳᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1452 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final java.util.LinkedHashMap f6386 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1654 f6387 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.concurrent.locks.ReentrantLock f6388;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0682 f6389;

    static {
            ᲀᛴᛱᛱ r0 = new ᲀᛴᛱᛱ
            r1 = 22
            r0.<init>(r1)
            defpackage.C1452.f6387 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            defpackage.C1452.f6386 = r0
            return
    }

    public C1452(java.lang.String r4, boolean r5) {
            r3 = this;
            r3.<init>()
            ᲀᛴᛱᛱ r0 = defpackage.C1452.f6387
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = defpackage.C1452.f6386     // Catch: java.lang.Throwable -> L17
            java.lang.Object r2 = r1.get(r4)     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L19
            java.util.concurrent.locks.ReentrantLock r2 = new java.util.concurrent.locks.ReentrantLock     // Catch: java.lang.Throwable -> L17
            r2.<init>()     // Catch: java.lang.Throwable -> L17
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r3 = move-exception
            goto L2a
        L19:
            java.util.concurrent.locks.ReentrantLock r2 = (java.util.concurrent.locks.ReentrantLock) r2     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            r3.f6388 = r2
            if (r5 == 0) goto L26
            ᛴᛵᲇᲇ r5 = new ᛴᛵᲇᲇ
            r5.<init>(r4)
            goto L27
        L26:
            r5 = 0
        L27:
            r3.f6389 = r5
            return
        L2a:
            monitor-exit(r0)
            throw r3
    }
}
