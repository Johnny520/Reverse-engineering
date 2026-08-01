package okhttp3.internal.connection;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.ConnectionPool;
import okhttp3.internal.C5757c;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p172l8.C4700i0;
import p185m8.AbstractC5114x;
import p376zd.C9991g;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u00018\u0018\u0000 >2\u00020\u0001:\u0001>B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0014JA\u0010\"\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u0016H\u0000¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020#¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020#¢\u0006\u0004\b,\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000e0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, m16758d2 = {"Lokhttp3/internal/connection/RealConnectionPool;", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", _UrlKt.FRAGMENT_ENCODE_SET, "maxIdleConnections", _UrlKt.FRAGMENT_ENCODE_SET, "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "Lokhttp3/internal/connection/ConnectionListener;", "connectionListener", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;IJLjava/util/concurrent/TimeUnit;Lokhttp3/internal/connection/ConnectionListener;)V", "Lokhttp3/internal/connection/RealConnection;", "connection", "now", "pruneAndGetAllocationCount", "(Lokhttp3/internal/connection/RealConnection;J)I", "idleConnectionCount", "()I", "connectionCount", _UrlKt.FRAGMENT_ENCODE_SET, "doExtensiveHealthChecks", "Lokhttp3/Address;", "address", "Lokhttp3/internal/connection/RealCall;", "call", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/Route;", "routes", "requireMultiplexed", "callAcquirePooledConnection$okhttp", "(ZLokhttp3/Address;Lokhttp3/internal/connection/RealCall;Ljava/util/List;Z)Lokhttp3/internal/connection/RealConnection;", "callAcquirePooledConnection", "Ll8/i0;", "put", "(Lokhttp3/internal/connection/RealConnection;)V", "connectionBecameIdle", "(Lokhttp3/internal/connection/RealConnection;)Z", "evictAll", "()V", "closeConnections", "(J)J", "scheduleCloser", "I", "Lokhttp3/internal/connection/ConnectionListener;", "getConnectionListener$okhttp", "()Lokhttp3/internal/connection/ConnectionListener;", "keepAliveDurationNs", "J", "getKeepAliveDurationNs$okhttp", "()J", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "okhttp3/internal/connection/RealConnectionPool$cleanupTask$1", "cleanupTask", "Lokhttp3/internal/connection/RealConnectionPool$cleanupTask$1;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Companion", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class RealConnectionPool {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final TaskQueue cleanupQueue;
    private final RealConnectionPool$cleanupTask$1 cleanupTask;
    private final ConnectionListener connectionListener;
    private final ConcurrentLinkedQueue<RealConnection> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    /* JADX WARN: Type inference failed for: r2v3, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(TaskRunner taskRunner, int i10, long j10, TimeUnit timeUnit, ConnectionListener connectionListener) {
        taskRunner.getClass();
        timeUnit.getClass();
        connectionListener.getClass();
        this.maxIdleConnections = i10;
        this.connectionListener = connectionListener;
        this.keepAliveDurationNs = timeUnit.toNanos(j10);
        this.cleanupQueue = taskRunner.newQueue();
        final String str = _UtilJvmKt.okHttpName + " ConnectionPool connection closer";
        this.cleanupTask = new Task(str) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                return this.this$0.closeConnections(System.nanoTime());
            }
        };
        this.connections = new ConcurrentLinkedQueue<>();
        if (j10 > 0) {
            return;
        }
        C9991g.m38662a("keepAliveDuration <= 0: ", j10);
        throw null;
    }

    private final int pruneAndGetAllocationCount(RealConnection connection, long now) {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(connection)) {
            C5757c.m23260a(Thread.currentThread().getName(), " MUST hold lock on ", connection);
            return 0;
        }
        List<Reference<RealCall>> calls = connection.getCalls();
        int i10 = 0;
        while (i10 < calls.size()) {
            Reference<RealCall> reference = calls.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                Platform.INSTANCE.get().logCloseableLeak("A connection to " + connection.route().address().url() + " was leaked. Did you forget to close a response body?", ((RealCall.CallReference) reference).getCallStackTrace());
                calls.remove(i10);
                if (calls.isEmpty()) {
                    connection.setIdleAtNs(now - this.keepAliveDurationNs);
                    return 0;
                }
            }
        }
        return calls.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:9:0x0023, B:14:0x002c, B:17:0x0033), top: B:40:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.internal.connection.RealConnection callAcquirePooledConnection$okhttp(boolean r6, okhttp3.Address r7, okhttp3.internal.connection.RealCall r8, java.util.List<okhttp3.Route> r9, boolean r10) {
        /*
            r5 = this;
            r7.getClass()
            r8.getClass()
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r5.connections
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RealConnection r1 = (okhttp3.internal.connection.RealConnection) r1
            r1.getClass()
            monitor-enter(r1)
            r2 = 1
            r3 = 0
            if (r10 == 0) goto L2c
            boolean r4 = r1.isMultiplexed$okhttp()     // Catch: java.lang.Throwable -> L2a
            if (r4 != 0) goto L2c
            goto L37
        L2a:
            r6 = move-exception
            goto L64
        L2c:
            boolean r4 = r1.isEligible$okhttp(r7, r9)     // Catch: java.lang.Throwable -> L2a
            if (r4 != 0) goto L33
            goto L37
        L33:
            r8.acquireConnectionNoEvents(r1)     // Catch: java.lang.Throwable -> L2a
            r3 = r2
        L37:
            monitor-exit(r1)
            if (r3 == 0) goto Lf
            boolean r3 = r1.isHealthy(r6)
            if (r3 == 0) goto L41
            return r1
        L41:
            monitor-enter(r1)
            boolean r3 = r1.getNoNewExchanges()     // Catch: java.lang.Throwable -> L61
            r1.setNoNewExchanges(r2)     // Catch: java.lang.Throwable -> L61
            java.net.Socket r2 = r8.releaseConnectionNoEvents$okhttp()     // Catch: java.lang.Throwable -> L61
            monitor-exit(r1)
            if (r2 == 0) goto L59
            okhttp3.internal._UtilJvmKt.closeQuietly(r2)
            okhttp3.internal.connection.ConnectionListener r2 = r5.connectionListener
            r2.connectionClosed(r1)
            goto Lf
        L59:
            if (r3 != 0) goto Lf
            okhttp3.internal.connection.ConnectionListener r2 = r5.connectionListener
            r2.noNewExchanges(r1)
            goto Lf
        L61:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        L64:
            monitor-exit(r1)
            throw r6
        L66:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnectionPool.callAcquirePooledConnection$okhttp(boolean, okhttp3.Address, okhttp3.internal.connection.RealCall, java.util.List, boolean):okhttp3.internal.connection.RealConnection");
    }

    public final long closeConnections(long now) {
        long j10 = (now - this.keepAliveDurationNs) + 1;
        Iterator<RealConnection> it = this.connections.iterator();
        it.getClass();
        RealConnection realConnection = null;
        long j11 = Long.MAX_VALUE;
        int i10 = 0;
        RealConnection realConnection2 = null;
        RealConnection realConnection3 = null;
        int i11 = 0;
        while (it.hasNext()) {
            RealConnection next = it.next();
            next.getClass();
            synchronized (next) {
                if (pruneAndGetAllocationCount(next, now) > 0) {
                    i11++;
                } else {
                    long idleAtNs = next.getIdleAtNs();
                    if (idleAtNs < j10) {
                        realConnection2 = next;
                        j10 = idleAtNs;
                    }
                    i10++;
                    if (idleAtNs < j11) {
                        realConnection3 = next;
                        j11 = idleAtNs;
                    }
                }
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
        }
        if (realConnection2 != null) {
            realConnection = realConnection2;
        } else if (i10 > this.maxIdleConnections) {
            j10 = j11;
            realConnection = realConnection3;
        } else {
            j10 = -1;
        }
        if (realConnection == null) {
            if (realConnection3 != null) {
                return (j11 + this.keepAliveDurationNs) - now;
            }
            if (i11 > 0) {
                return this.keepAliveDurationNs;
            }
            return -1L;
        }
        synchronized (realConnection) {
            if (!realConnection.getCalls().isEmpty()) {
                return 0L;
            }
            if (realConnection.getIdleAtNs() != j10) {
                return 0L;
            }
            realConnection.setNoNewExchanges(true);
            this.connections.remove(realConnection);
            _UtilJvmKt.closeQuietly(realConnection.getJavaNetSocket());
            this.connectionListener.connectionClosed(realConnection);
            if (this.connections.isEmpty()) {
                this.cleanupQueue.cancelAll();
            }
            return 0L;
        }
    }

    public final boolean connectionBecameIdle(RealConnection connection) {
        connection.getClass();
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(connection)) {
            C5757c.m23260a(Thread.currentThread().getName(), " MUST hold lock on ", connection);
            return false;
        }
        if (!connection.getNoNewExchanges() && this.maxIdleConnections != 0) {
            scheduleCloser();
            return false;
        }
        connection.setNoNewExchanges(true);
        this.connections.remove(connection);
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
        return true;
    }

    public final int connectionCount() {
        return this.connections.size();
    }

    public final void evictAll() {
        Socket javaNetSocket;
        Iterator<RealConnection> it = this.connections.iterator();
        it.getClass();
        while (it.hasNext()) {
            RealConnection next = it.next();
            next.getClass();
            synchronized (next) {
                if (next.getCalls().isEmpty()) {
                    it.remove();
                    next.setNoNewExchanges(true);
                    javaNetSocket = next.getJavaNetSocket();
                } else {
                    javaNetSocket = null;
                }
            }
            if (javaNetSocket != null) {
                _UtilJvmKt.closeQuietly(javaNetSocket);
                this.connectionListener.connectionClosed(next);
            }
        }
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
    }

    /* JADX INFO: renamed from: getConnectionListener$okhttp, reason: from getter */
    public final ConnectionListener getConnectionListener() {
        return this.connectionListener;
    }

    /* JADX INFO: renamed from: getKeepAliveDurationNs$okhttp, reason: from getter */
    public final long getKeepAliveDurationNs() {
        return this.keepAliveDurationNs;
    }

    public final int idleConnectionCount() {
        boolean zIsEmpty;
        ConcurrentLinkedQueue<RealConnection> concurrentLinkedQueue = this.connections;
        int i10 = 0;
        if (concurrentLinkedQueue != null && concurrentLinkedQueue.isEmpty()) {
            return 0;
        }
        for (RealConnection realConnection : concurrentLinkedQueue) {
            realConnection.getClass();
            synchronized (realConnection) {
                zIsEmpty = realConnection.getCalls().isEmpty();
            }
            if (zIsEmpty && (i10 = i10 + 1) < 0) {
                AbstractC5114x.m20809x();
            }
        }
        return i10;
    }

    public final void put(RealConnection connection) {
        connection.getClass();
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(connection)) {
            C5757c.m23260a(Thread.currentThread().getName(), " MUST hold lock on ", connection);
        } else {
            this.connections.add(connection);
            scheduleCloser();
        }
    }

    public final void scheduleCloser() {
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m16758d2 = {"Lokhttp3/internal/connection/RealConnectionPool$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "get", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/ConnectionPool;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        public final RealConnectionPool get(ConnectionPool connectionPool) {
            connectionPool.getClass();
            return connectionPool.getDelegate();
        }

        private Companion() {
        }
    }
}
