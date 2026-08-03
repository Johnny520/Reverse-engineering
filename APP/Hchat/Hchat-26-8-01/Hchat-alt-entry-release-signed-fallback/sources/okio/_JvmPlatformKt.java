package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class _JvmPlatformKt {
    public static final byte[] asUtf8ToByteArray(java.lang.String r1) {
            r1.getClass()
            java.nio.charset.Charset r0 = og.a.f9804a
            byte[] r1 = r1.getBytes(r0)
            r1.getClass()
            return r1
    }

    public static final java.util.concurrent.locks.ReentrantLock newLock() {
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            return r0
    }

    public static final java.lang.String toUtf8String(byte[] r2) {
            r2.getClass()
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = og.a.f9804a
            r0.<init>(r2, r1)
            return r0
    }

    public static final <T> T withLock(java.util.concurrent.locks.ReentrantLock r0, fg.a r1) {
            r0.getClass()
            r1.getClass()
            r0.lock()
            java.lang.Object r1 = r1.invoke()     // Catch: java.lang.Throwable -> L11
            r0.unlock()
            return r1
        L11:
            r1 = move-exception
            r0.unlock()
            throw r1
    }
}
