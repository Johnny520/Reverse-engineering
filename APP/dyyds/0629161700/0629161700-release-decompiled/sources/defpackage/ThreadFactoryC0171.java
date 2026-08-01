package defpackage;

/* JADX INFO: renamed from: ᛱᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0171 implements java.util.concurrent.ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final synchronized java.lang.Thread newThread(java.lang.Runnable r3) {
            r2 = this;
            monitor-enter(r2)
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "glide-disk-lru-cache-thread"
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> Le
            r3 = 1
            r0.setPriority(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return r0
        Le:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
    }
}
