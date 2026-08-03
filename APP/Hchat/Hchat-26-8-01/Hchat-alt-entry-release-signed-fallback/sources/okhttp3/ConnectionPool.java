package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ConnectionPool {
    private final okhttp3.internal.connection.RealConnectionPool delegate;

    public ConnectionPool() {
            r4 = this;
            r0 = 5
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            r3 = 5
            r4.<init>(r3, r0, r2)
            return
    }

    public ConnectionPool(int r7, long r8, java.util.concurrent.TimeUnit r10) {
            r6 = this;
            r10.getClass()
            okhttp3.internal.connection.RealConnectionPool r0 = new okhttp3.internal.connection.RealConnectionPool
            okhttp3.internal.concurrent.TaskRunner r1 = okhttp3.internal.concurrent.TaskRunner.INSTANCE
            r2 = r7
            r3 = r8
            r5 = r10
            r0.<init>(r1, r2, r3, r5)
            r6.<init>(r0)
            return
    }

    public ConnectionPool(okhttp3.internal.connection.RealConnectionPool r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.delegate = r1
            return
    }

    public final int connectionCount() {
            r1 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r1.delegate
            int r0 = r0.connectionCount()
            return r0
    }

    public final void evictAll() {
            r1 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r1.delegate
            r0.evictAll()
            return
    }

    public final okhttp3.internal.connection.RealConnectionPool getDelegate$okhttp() {
            r1 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r1.delegate
            return r0
    }

    public final int idleConnectionCount() {
            r1 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r1.delegate
            int r0 = r0.idleConnectionCount()
            return r0
    }
}
