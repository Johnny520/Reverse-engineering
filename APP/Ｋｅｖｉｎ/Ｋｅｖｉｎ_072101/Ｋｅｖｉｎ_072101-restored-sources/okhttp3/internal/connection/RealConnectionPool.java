package okhttp3.internal.connection;

/* JADX INFO: compiled from: RealConnectionPool.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u000e\u0018\u0000 (2\u00020\u0001:\u0001(B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ.\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u0015J\u000e\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0012J\u0006\u0010\"\u001a\u00020\u0005J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u0005J\u0018\u0010&\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u000e\u0010'\u001a\u00020$2\u0006\u0010!\u001a\u00020\u0012R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m115d2 = {"Lokhttp3/internal/connection/RealConnectionPool;", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "maxIdleConnections", "", "keepAliveDuration", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(Lokhttp3/internal/concurrent/TaskRunner;IJLjava/util/concurrent/TimeUnit;)V", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupTask", "okhttp3/internal/connection/RealConnectionPool$cleanupTask$1", "Lokhttp3/internal/connection/RealConnectionPool$cleanupTask$1;", "connections", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lokhttp3/internal/connection/RealConnection;", "keepAliveDurationNs", "callAcquirePooledConnection", "", "address", "Lokhttp3/Address;", "call", "Lokhttp3/internal/connection/RealCall;", "routes", "", "Lokhttp3/Route;", "requireMultiplexed", "cleanup", "now", "connectionBecameIdle", "connection", "connectionCount", "evictAll", "", "idleConnectionCount", "pruneAndGetAllocationCount", "put", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class RealConnectionPool {
    public static final okhttp3.internal.connection.RealConnectionPool.Companion Companion = null;
    private final okhttp3.internal.concurrent.TaskQueue cleanupQueue;
    private final okhttp3.internal.connection.RealConnectionPool$cleanupTask$1 cleanupTask;
    private final java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    /* JADX INFO: compiled from: RealConnectionPool.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m115d2 = {"Lokhttp3/internal/connection/RealConnectionPool$Companion;", "", "()V", "get", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/ConnectionPool;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final okhttp3.internal.connection.RealConnectionPool get(okhttp3.ConnectionPool r2) {
                r1 = this;
                java.lang.String r0 = "connectionPool"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.internal.connection.RealConnectionPool r0 = r2.getDelegate$okhttp()
                return r0
        }
    }

    static {
            okhttp3.internal.connection.RealConnectionPool$Companion r0 = new okhttp3.internal.connection.RealConnectionPool$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.connection.RealConnectionPool.Companion = r0
            return
    }

    public RealConnectionPool(okhttp3.internal.concurrent.TaskRunner r4, int r5, long r6, java.util.concurrent.TimeUnit r8) {
            r3 = this;
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r3.<init>()
            r3.maxIdleConnections = r5
            long r0 = r8.toNanos(r6)
            r3.keepAliveDurationNs = r0
            okhttp3.internal.concurrent.TaskQueue r0 = r4.newQueue()
            r3.cleanupQueue = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = okhttp3.internal.Util.okHttpName
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " ConnectionPool"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            okhttp3.internal.connection.RealConnectionPool$cleanupTask$1 r1 = new okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            r1.<init>(r3, r0)
            r3.cleanupTask = r1
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r3.connections = r0
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L47
            r0 = 1
            goto L48
        L47:
            r0 = 0
        L48:
            if (r0 == 0) goto L4c
        L4b:
            return
        L4c:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "keepAliveDuration <= 0: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    private final int pruneAndGetAllocationCount(okhttp3.internal.connection.RealConnection r8, long r9) {
            r7 = this;
            r0 = r8
            r1 = 0
            boolean r2 = okhttp3.internal.Util.assertionsEnabled
            if (r2 == 0) goto L38
            boolean r2 = java.lang.Thread.holdsLock(r0)
            if (r2 == 0) goto Ld
            goto L38
        Ld:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Thread "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " MUST hold lock on "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L38:
            java.util.List r0 = r8.getCalls()
            r1 = 0
        L3e:
            int r2 = r0.size()
            if (r1 >= r2) goto La3
            java.lang.Object r2 = r0.get(r1)
            java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2
            java.lang.Object r3 = r2.get()
            if (r3 == 0) goto L53
            int r1 = r1 + 1
            goto L3e
        L53:
            java.lang.String r3 = "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
            r3 = r2
            okhttp3.internal.connection.RealCall$CallReference r3 = (okhttp3.internal.connection.RealCall.CallReference) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "A connection to "
            java.lang.StringBuilder r4 = r4.append(r5)
            okhttp3.Route r5 = r8.route()
            okhttp3.Address r5 = r5.address()
            okhttp3.HttpUrl r5 = r5.url()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = " was leaked. Did you forget to close a response body?"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            okhttp3.internal.platform.Platform$Companion r5 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r5 = r5.get()
            java.lang.Object r6 = r3.getCallStackTrace()
            r5.logCloseableLeak(r4, r6)
            r0.remove(r1)
            r5 = 1
            r8.setNoNewExchanges(r5)
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L3e
            long r5 = r7.keepAliveDurationNs
            long r5 = r9 - r5
            r8.setIdleAtNs$okhttp(r5)
            r5 = 0
            return r5
        La3:
            int r2 = r0.size()
            return r2
    }

    public final boolean callAcquirePooledConnection(okhttp3.Address r5, okhttp3.internal.connection.RealCall r6, java.util.List<okhttp3.Route> r7, boolean r8) {
            r4 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r4.connections
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RealConnection r1 = (okhttp3.internal.connection.RealConnection) r1
            java.lang.String r2 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            monitor-enter(r1)
            r2 = 0
            if (r8 == 0) goto L2b
            boolean r3 = r1.isMultiplexed$okhttp()     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L38
        L2b:
            boolean r3 = r1.isEligible$okhttp(r5, r7)     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L38
            r6.acquireConnectionNoEvents(r1)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r1)
            r0 = 1
            return r0
        L38:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r1)
            goto L10
        L3c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L3f:
            r0 = 0
            return r0
    }

    public final long cleanup(long r13) {
            r12 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r3 = -9223372036854775808
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r5 = r12.connections
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L49
            java.lang.Object r6 = r5.next()
            okhttp3.internal.connection.RealConnection r6 = (okhttp3.internal.connection.RealConnection) r6
            java.lang.String r7 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            monitor-enter(r6)
            r7 = 0
            int r8 = r12.pruneAndGetAllocationCount(r6, r13)     // Catch: java.lang.Throwable -> L44
            if (r8 <= 0) goto L2f
            int r8 = r0 + 1
            java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2d
            r0 = r8
            goto L41
        L2d:
            r0 = move-exception
            goto L47
        L2f:
            int r1 = r1 + 1
            long r8 = r6.getIdleAtNs$okhttp()     // Catch: java.lang.Throwable -> L44
            long r8 = r13 - r8
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 <= 0) goto L3e
            r3 = r8
            r2 = r6
            goto L3f
        L3e:
        L3f:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L44
        L41:
            monitor-exit(r6)
            goto Ld
        L44:
            r5 = move-exception
            r8 = r0
            r0 = r5
        L47:
            monitor-exit(r6)
            throw r0
        L49:
            long r5 = r12.keepAliveDurationNs
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L63
            int r5 = r12.maxIdleConnections
            if (r1 <= r5) goto L55
            goto L63
        L55:
            if (r1 <= 0) goto L5b
            long r5 = r12.keepAliveDurationNs
            long r5 = r5 - r3
            return r5
        L5b:
            if (r0 <= 0) goto L60
            long r5 = r12.keepAliveDurationNs
            return r5
        L60:
            r5 = -1
            return r5
        L63:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r5 = r2
            monitor-enter(r5)
            r6 = 0
            java.util.List r7 = r5.getCalls()     // Catch: java.lang.Throwable -> La3
            java.util.Collection r7 = (java.util.Collection) r7     // Catch: java.lang.Throwable -> La3
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> La3
            r8 = 0
            if (r7 != 0) goto L79
            monitor-exit(r5)
            return r8
        L79:
            long r10 = r5.getIdleAtNs$okhttp()     // Catch: java.lang.Throwable -> La3
            long r10 = r10 + r3
            int r7 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r7 == 0) goto L84
            monitor-exit(r5)
            return r8
        L84:
            r7 = 1
            r5.setNoNewExchanges(r7)     // Catch: java.lang.Throwable -> La3
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r7 = r12.connections     // Catch: java.lang.Throwable -> La3
            r7.remove(r2)     // Catch: java.lang.Throwable -> La3
            monitor-exit(r5)
            java.net.Socket r6 = r5.socket()
            okhttp3.internal.Util.closeQuietly(r6)
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r6 = r12.connections
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto La2
            okhttp3.internal.concurrent.TaskQueue r6 = r12.cleanupQueue
            r6.cancelAll()
        La2:
            return r8
        La3:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    public final boolean connectionBecameIdle(okhttp3.internal.connection.RealConnection r8) {
            r7 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r8
            r1 = 0
            boolean r2 = okhttp3.internal.Util.assertionsEnabled
            if (r2 == 0) goto L3d
            boolean r2 = java.lang.Thread.holdsLock(r0)
            if (r2 == 0) goto L12
            goto L3d
        L12:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Thread "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " MUST hold lock on "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L3d:
            boolean r0 = r8.getNoNewExchanges()
            if (r0 != 0) goto L59
            int r0 = r7.maxIdleConnections
            if (r0 != 0) goto L49
            goto L59
        L49:
            okhttp3.internal.concurrent.TaskQueue r1 = r7.cleanupQueue
            okhttp3.internal.connection.RealConnectionPool$cleanupTask$1 r0 = r7.cleanupTask
            r2 = r0
            okhttp3.internal.concurrent.Task r2 = (okhttp3.internal.concurrent.Task) r2
            r5 = 2
            r6 = 0
            r3 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r1, r2, r3, r5, r6)
            r0 = 0
            goto L70
        L59:
            r0 = 1
            r8.setNoNewExchanges(r0)
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r1 = r7.connections
            r1.remove(r8)
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r1 = r7.connections
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L6f
            okhttp3.internal.concurrent.TaskQueue r1 = r7.cleanupQueue
            r1.cancelAll()
        L6f:
        L70:
            return r0
    }

    public final int connectionCount() {
            r1 = this;
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r1.connections
            int r0 = r0.size()
            return r0
    }

    public final void evictAll() {
            r4 = this;
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r4.connections
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "connections.iterator()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RealConnection r1 = (okhttp3.internal.connection.RealConnection) r1
            java.lang.String r2 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            monitor-enter(r1)
            r2 = 0
            java.util.List r3 = r1.getCalls()     // Catch: java.lang.Throwable -> L3d
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L3d
            if (r3 == 0) goto L34
            r0.remove()     // Catch: java.lang.Throwable -> L3d
            r3 = 1
            r1.setNoNewExchanges(r3)     // Catch: java.lang.Throwable -> L3d
            java.net.Socket r3 = r1.socket()     // Catch: java.lang.Throwable -> L3d
            goto L35
        L34:
            r3 = 0
        L35:
            monitor-exit(r1)
            r2 = r3
            if (r2 == 0) goto Lb
            okhttp3.internal.Util.closeQuietly(r2)
            goto Lb
        L3d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L40:
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r1 = r4.connections
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L4d
            okhttp3.internal.concurrent.TaskQueue r1 = r4.cleanupQueue
            r1.cancelAll()
        L4d:
            return
    }

    public final int idleConnectionCount() {
            r9 = this;
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r9.connections
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L14
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L14
            r2 = 0
            goto L45
        L14:
            r2 = 0
            java.util.Iterator r3 = r0.iterator()
        L19:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r4 = r3.next()
            r5 = r4
            okhttp3.internal.connection.RealConnection r5 = (okhttp3.internal.connection.RealConnection) r5
            r6 = 0
            java.lang.String r7 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)
            monitor-enter(r5)
            r7 = 0
            java.util.List r8 = r5.getCalls()     // Catch: java.lang.Throwable -> L41
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> L41
            monitor-exit(r5)
            if (r8 == 0) goto L19
            int r2 = r2 + 1
            if (r2 >= 0) goto L19
            kotlin.collections.CollectionsKt.throwCountOverflow()
            goto L19
        L41:
            r3 = move-exception
            monitor-exit(r5)
            throw r3
        L44:
        L45:
            return r2
    }

    public final void put(okhttp3.internal.connection.RealConnection r8) {
            r7 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r8
            r1 = 0
            boolean r2 = okhttp3.internal.Util.assertionsEnabled
            if (r2 == 0) goto L3d
            boolean r2 = java.lang.Thread.holdsLock(r0)
            if (r2 == 0) goto L12
            goto L3d
        L12:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Thread "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " MUST hold lock on "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L3d:
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r7.connections
            r0.add(r8)
            okhttp3.internal.concurrent.TaskQueue r1 = r7.cleanupQueue
            okhttp3.internal.connection.RealConnectionPool$cleanupTask$1 r0 = r7.cleanupTask
            r2 = r0
            okhttp3.internal.concurrent.Task r2 = (okhttp3.internal.concurrent.Task) r2
            r5 = 2
            r6 = 0
            r3 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r1, r2, r3, r5, r6)
            return
    }
}
