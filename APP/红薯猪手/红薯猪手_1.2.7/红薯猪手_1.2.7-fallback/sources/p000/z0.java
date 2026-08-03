package p000;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static final java.util.HashMap f1225 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.io.File f1226;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.concurrent.locks.Lock f1227;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean f1228;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public java.nio.channels.FileChannel f1229;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            p000.z0.f1225 = r0
            return
    }

    public z0(java.lang.String r3, java.io.File r4, boolean r5) {
            r2 = this;
            r2.<init>()
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = ".lck"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r4, r3)
            r2.f1226 = r0
            java.lang.String r3 = r0.getAbsolutePath()
            java.util.HashMap r4 = p000.z0.f1225
            monitor-enter(r4)
            java.lang.Object r0 = r4.get(r3)     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L32
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock     // Catch: java.lang.Throwable -> L38
            r0.<init>()     // Catch: java.lang.Throwable -> L38
            r4.put(r3, r0)     // Catch: java.lang.Throwable -> L38
        L32:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            r2.f1227 = r0
            r2.f1228 = r5
            return
        L38:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            throw r3
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m489() {
            r1 = this;
            java.nio.channels.FileChannel r0 = r1.f1229
            if (r0 == 0) goto L7
            r0.close()     // Catch: java.io.IOException -> L7
        L7:
            java.util.concurrent.locks.Lock r0 = r1.f1227
            r0.unlock()
            return
    }
}
