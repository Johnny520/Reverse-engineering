package okhttp3;

import java.util.concurrent.TimeUnit;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ConnectionPool {
    private final RealConnectionPool delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i9, long j3, TimeUnit timeUnit) {
        this(new RealConnectionPool(TaskRunner.INSTANCE, i9, j3, timeUnit));
        timeUnit.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int connectionCount() {
        return this.delegate.connectionCount();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void evictAll() {
        this.delegate.evictAll();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final RealConnectionPool getDelegate$okhttp() {
        return this.delegate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int idleConnectionCount() {
        return this.delegate.idleConnectionCount();
    }

    public ConnectionPool(RealConnectionPool realConnectionPool) {
        realConnectionPool.getClass();
        this.delegate = realConnectionPool;
    }

    public ConnectionPool() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
