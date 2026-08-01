package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class je1 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.ConcurrentHashMap f5443 = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.je1.f5443 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.Object m2956(long r6, long r8, p000.p70 r10) {
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L69
            java.util.concurrent.ConcurrentHashMap r2 = p000.je1.f5443
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            f71 r7 = new f71
            r3 = 24
            r7.<init>(r3)
            c8 r3 = new c8
            r4 = 11
            r3.<init>(r7, r4)
            java.lang.Object r6 = r2.computeIfAbsent(r6, r3)
            r6.getClass()
            ie1 r6 = (p000.ie1) r6
            java.lang.Object r7 = r6.f5063
            monitor-enter(r7)
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 >= 0) goto L2b
            r8 = r0
        L2b:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3e
            long r4 = r6.f5064     // Catch: java.lang.Throwable -> L3e
            long r2 = r2 - r4
            long r2 = r8 - r2
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L49
            java.lang.Object r4 = r6.f5063     // Catch: java.lang.Throwable -> L3e java.lang.InterruptedException -> L40
            r4.wait(r2)     // Catch: java.lang.Throwable -> L3e java.lang.InterruptedException -> L40
            goto L2b
        L3e:
            r6 = move-exception
            goto L67
        L40:
            r6 = move-exception
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L3e
            r8.interrupt()     // Catch: java.lang.Throwable -> L3e
            throw r6     // Catch: java.lang.Throwable -> L3e
        L49:
            java.lang.Object r8 = r10.invoke()     // Catch: java.lang.Throwable -> L5a
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3e
            r6.f5064 = r9     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r6 = r6.f5063     // Catch: java.lang.Throwable -> L3e
            r6.notifyAll()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r7)
            return r8
        L5a:
            r8 = move-exception
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3e
            r6.f5064 = r9     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r6 = r6.f5063     // Catch: java.lang.Throwable -> L3e
            r6.notifyAll()     // Catch: java.lang.Throwable -> L3e
            throw r8     // Catch: java.lang.Throwable -> L3e
        L67:
            monitor-exit(r7)
            throw r6
        L69:
            java.lang.String r6 = "会话短 ID 必须大于 0"
            p000.C1080.m7275(r6)
            r6 = 0
            return r6
    }
}
