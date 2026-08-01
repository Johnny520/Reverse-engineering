package defpackage;

/* JADX INFO: renamed from: ᛶᛵᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1080 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final java.util.HashMap f4858 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.nio.channels.FileChannel f4859;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.concurrent.locks.Lock f4860;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean f4861;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.io.File f4862;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            defpackage.C1080.f4858 = r0
            return
    }

    public C1080(java.lang.String r2, java.io.File r3, boolean r4) {
            r1 = this;
            r1.<init>()
            r1.f4861 = r4
            if (r3 == 0) goto L13
            java.io.File r4 = new java.io.File
            java.lang.String r0 = ".lck"
            java.lang.String r0 = r2.concat(r0)
            r4.<init>(r3, r0)
            goto L14
        L13:
            r4 = 0
        L14:
            r1.f4862 = r4
            java.util.HashMap r3 = defpackage.C1080.f4858
            monitor-enter(r3)
            java.lang.Object r4 = r3.get(r2)     // Catch: java.lang.Throwable -> L28
            if (r4 != 0) goto L2a
            java.util.concurrent.locks.ReentrantLock r4 = new java.util.concurrent.locks.ReentrantLock     // Catch: java.lang.Throwable -> L28
            r4.<init>()     // Catch: java.lang.Throwable -> L28
            r3.put(r2, r4)     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r1 = move-exception
            goto L30
        L2a:
            java.util.concurrent.locks.Lock r4 = (java.util.concurrent.locks.Lock) r4     // Catch: java.lang.Throwable -> L28
            monitor-exit(r3)
            r1.f4860 = r4
            return
        L30:
            monitor-exit(r3)
            throw r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m2059(boolean r2) {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.f4860
            r0.lock()
            if (r2 == 0) goto L38
            java.io.File r2 = r1.f4862
            if (r2 == 0) goto L26
            java.io.File r0 = r2.getParentFile()     // Catch: java.io.IOException -> L15
            if (r0 == 0) goto L17
            r0.mkdirs()     // Catch: java.io.IOException -> L15
            goto L17
        L15:
            r2 = move-exception
            goto L2e
        L17:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L15
            r0.<init>(r2)     // Catch: java.io.IOException -> L15
            java.nio.channels.FileChannel r2 = r0.getChannel()     // Catch: java.io.IOException -> L15
            r2.lock()     // Catch: java.io.IOException -> L15
            r1.f4859 = r2     // Catch: java.io.IOException -> L15
            return
        L26:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.io.IOException -> L15
            java.lang.String r0 = "No lock directory was provided."
            r2.<init>(r0)     // Catch: java.io.IOException -> L15
            throw r2     // Catch: java.io.IOException -> L15
        L2e:
            r0 = 0
            r1.f4859 = r0
            java.lang.String r1 = "SupportSQLiteLock"
            java.lang.String r0 = "Unable to grab file lock."
            android.util.Log.w(r1, r0, r2)
        L38:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m2060() {
            r1 = this;
            java.nio.channels.FileChannel r0 = r1.f4859     // Catch: java.io.IOException -> L7
            if (r0 == 0) goto L7
            r0.close()     // Catch: java.io.IOException -> L7
        L7:
            java.util.concurrent.locks.Lock r1 = r1.f4860
            r1.unlock()
            return
    }
}
