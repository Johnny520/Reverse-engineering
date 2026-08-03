package okhttp3.internal.connection;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RealConnectionPool {
    public static final okhttp3.internal.connection.RealConnectionPool.Companion Companion = null;
    private final okhttp3.internal.concurrent.TaskQueue cleanupQueue;
    private final okhttp3.internal.connection.RealConnectionPool$cleanupTask$1 cleanupTask;
    private final java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final okhttp3.internal.connection.RealConnectionPool get(okhttp3.ConnectionPool r1) {
                r0 = this;
                r1.getClass()
                okhttp3.internal.connection.RealConnectionPool r1 = r1.getDelegate$okhttp()
                return r1
        }
    }

    static {
            okhttp3.internal.connection.RealConnectionPool$Companion r0 = new okhttp3.internal.connection.RealConnectionPool$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.connection.RealConnectionPool.Companion = r0
            return
    }

    public RealConnectionPool(okhttp3.internal.concurrent.TaskRunner r3, int r4, long r5, java.util.concurrent.TimeUnit r7) {
            r2 = this;
            r3.getClass()
            r7.getClass()
            r2.<init>()
            r2.maxIdleConnections = r4
            long r0 = r7.toNanos(r5)
            r2.keepAliveDurationNs = r0
            okhttp3.internal.concurrent.TaskQueue r3 = r3.newQueue()
            r2.cleanupQueue = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = okhttp3.internal.Util.okHttpName
            java.lang.String r7 = " ConnectionPool"
            java.lang.String r3 = eh.a.r(r3, r4, r7)
            okhttp3.internal.connection.RealConnectionPool$cleanupTask$1 r4 = new okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            r4.<init>(r2, r3)
            r2.cleanupTask = r4
            java.util.concurrent.ConcurrentLinkedQueue r3 = new java.util.concurrent.ConcurrentLinkedQueue
            r3.<init>()
            r2.connections = r3
            r3 = 0
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L39
            return
        L39:
            java.lang.String r3 = "keepAliveDuration <= 0: "
            java.lang.String r3 = bc.e.g(r5, r3)
            j8.o.q(r3)
            r3 = 0
            throw r3
    }

    private final int pruneAndGetAllocationCount(okhttp3.internal.connection.RealConnection r7, long r8) {
            r6 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L1a
            boolean r0 = java.lang.Thread.holdsLock(r7)
            if (r0 == 0) goto Lb
            goto L1a
        Lb:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = " MUST hold lock on "
            j8.o.i(r8, r9, r7)
            r7 = 0
            return r7
        L1a:
            java.util.List r0 = r7.getCalls()
            r1 = 0
            r2 = r1
        L20:
            int r3 = r0.size()
            if (r2 >= r3) goto L77
            java.lang.Object r3 = r0.get(r2)
            java.lang.ref.Reference r3 = (java.lang.ref.Reference) r3
            java.lang.Object r4 = r3.get()
            if (r4 == 0) goto L35
            int r2 = r2 + 1
            goto L20
        L35:
            okhttp3.internal.connection.RealCall$CallReference r3 = (okhttp3.internal.connection.RealCall.CallReference) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "A connection to "
            r4.<init>(r5)
            okhttp3.Route r5 = r7.route()
            okhttp3.Address r5 = r5.address()
            okhttp3.HttpUrl r5 = r5.url()
            r4.append(r5)
            java.lang.String r5 = " was leaked. Did you forget to close a response body?"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            okhttp3.internal.platform.Platform$Companion r5 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r5 = r5.get()
            java.lang.Object r3 = r3.getCallStackTrace()
            r5.logCloseableLeak(r4, r3)
            r0.remove(r2)
            r3 = 1
            r7.setNoNewExchanges(r3)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L20
            long r2 = r6.keepAliveDurationNs
            long r8 = r8 - r2
            r7.setIdleAtNs$okhttp(r8)
            return r1
        L77:
            int r7 = r0.size()
            return r7
    }

    public final boolean callAcquirePooledConnection(okhttp3.Address r4, okhttp3.internal.connection.RealCall r5, java.util.List<okhttp3.Route> r6, boolean r7) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r3.connections
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RealConnection r1 = (okhttp3.internal.connection.RealConnection) r1
            r1.getClass()
            monitor-enter(r1)
            if (r7 == 0) goto L27
            boolean r2 = r1.isMultiplexed$okhttp()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L33
            goto L27
        L25:
            r4 = move-exception
            goto L35
        L27:
            boolean r2 = r1.isEligible$okhttp(r4, r6)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L33
            r5.acquireConnectionNoEvents(r1)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r1)
            r4 = 1
            return r4
        L33:
            monitor-exit(r1)
            goto Lc
        L35:
            monitor-exit(r1)
            throw r4
        L37:
            r4 = 0
            return r4
    }

    public final long cleanup(long r11) {
            r10 = this;
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r10.connections
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
            r3 = -9223372036854775808
            r4 = r3
            r3 = r2
            r2 = r1
        Ld:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L39
            java.lang.Object r6 = r0.next()
            okhttp3.internal.connection.RealConnection r6 = (okhttp3.internal.connection.RealConnection) r6
            r6.getClass()
            monitor-enter(r6)
            int r7 = r10.pruneAndGetAllocationCount(r6, r11)     // Catch: java.lang.Throwable -> L36
            if (r7 <= 0) goto L26
            int r2 = r2 + 1
            goto L34
        L26:
            int r1 = r1 + 1
            long r7 = r6.getIdleAtNs$okhttp()     // Catch: java.lang.Throwable -> L36
            long r7 = r11 - r7
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 <= 0) goto L34
            r3 = r6
            r4 = r7
        L34:
            monitor-exit(r6)
            goto Ld
        L36:
            r11 = move-exception
            monitor-exit(r6)
            throw r11
        L39:
            long r6 = r10.keepAliveDurationNs
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L4e
            int r0 = r10.maxIdleConnections
            if (r1 <= r0) goto L44
            goto L4e
        L44:
            if (r1 <= 0) goto L48
            long r6 = r6 - r4
            return r6
        L48:
            if (r2 <= 0) goto L4b
            return r6
        L4b:
            r11 = -1
            return r11
        L4e:
            r3.getClass()
            monitor-enter(r3)
            java.util.List r0 = r3.getCalls()     // Catch: java.lang.Throwable -> L8a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L8a
            r1 = 0
            if (r0 != 0) goto L60
            monitor-exit(r3)
            return r1
        L60:
            long r6 = r3.getIdleAtNs$okhttp()     // Catch: java.lang.Throwable -> L8a
            long r6 = r6 + r4
            int r11 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r11 == 0) goto L6b
            monitor-exit(r3)
            return r1
        L6b:
            r11 = 1
            r3.setNoNewExchanges(r11)     // Catch: java.lang.Throwable -> L8a
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r11 = r10.connections     // Catch: java.lang.Throwable -> L8a
            r11.remove(r3)     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r3)
            java.net.Socket r11 = r3.socket()
            okhttp3.internal.Util.closeQuietly(r11)
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r11 = r10.connections
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L89
            okhttp3.internal.concurrent.TaskQueue r11 = r10.cleanupQueue
            r11.cancelAll()
        L89:
            return r1
        L8a:
            r11 = move-exception
            monitor-exit(r3)
            throw r11
    }

    public final boolean connectionBecameIdle(okhttp3.internal.connection.RealConnection r8) {
            r7 = this;
            r8.getClass()
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L1d
            boolean r0 = java.lang.Thread.holdsLock(r8)
            if (r0 == 0) goto Le
            goto L1d
        Le:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = " MUST hold lock on "
            j8.o.i(r0, r1, r8)
        L1b:
            r8 = 0
            return r8
        L1d:
            boolean r0 = r8.getNoNewExchanges()
            if (r0 != 0) goto L34
            int r0 = r7.maxIdleConnections
            if (r0 != 0) goto L28
            goto L34
        L28:
            okhttp3.internal.concurrent.TaskQueue r1 = r7.cleanupQueue
            okhttp3.internal.connection.RealConnectionPool$cleanupTask$1 r2 = r7.cleanupTask
            r5 = 2
            r6 = 0
            r3 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r1, r2, r3, r5, r6)
            goto L1b
        L34:
            r0 = 1
            r8.setNoNewExchanges(r0)
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r1 = r7.connections
            r1.remove(r8)
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r8 = r7.connections
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L4a
            okhttp3.internal.concurrent.TaskQueue r8 = r7.cleanupQueue
            r8.cancelAll()
        L4a:
            return r0
    }

    public final int connectionCount() {
            r1 = this;
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r1.connections
            int r0 = r0.size()
            return r0
    }

    public final void evictAll() {
            r3 = this;
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r3.connections
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RealConnection r1 = (okhttp3.internal.connection.RealConnection) r1
            r1.getClass()
            monitor-enter(r1)
            java.util.List r2 = r1.getCalls()     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L31
            r0.remove()     // Catch: java.lang.Throwable -> L2f
            r2 = 1
            r1.setNoNewExchanges(r2)     // Catch: java.lang.Throwable -> L2f
            java.net.Socket r2 = r1.socket()     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r0 = move-exception
            goto L39
        L31:
            r2 = 0
        L32:
            monitor-exit(r1)
            if (r2 == 0) goto L9
            okhttp3.internal.Util.closeQuietly(r2)
            goto L9
        L39:
            monitor-exit(r1)
            throw r0
        L3b:
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r3.connections
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L48
            okhttp3.internal.concurrent.TaskQueue r0 = r3.cleanupQueue
            r0.cancelAll()
        L48:
            return
    }

    public final int idleConnectionCount() {
            r4 = this;
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r4.connections
            r1 = 0
            if (r0 == 0) goto Lc
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto Lc
            return r1
        Lc:
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            okhttp3.internal.connection.RealConnection r2 = (okhttp3.internal.connection.RealConnection) r2
            r2.getClass()
            monitor-enter(r2)
            java.util.List r3 = r2.getCalls()     // Catch: java.lang.Throwable -> L35
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L35
            monitor-exit(r2)
            if (r3 == 0) goto L10
            int r1 = r1 + 1
            if (r1 < 0) goto L30
            goto L10
        L30:
            a.a.P0()
            r0 = 0
            throw r0
        L35:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L38:
            return r1
    }

    public final void put(okhttp3.internal.connection.RealConnection r8) {
            r7 = this;
            r8.getClass()
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L1c
            boolean r0 = java.lang.Thread.holdsLock(r8)
            if (r0 == 0) goto Le
            goto L1c
        Le:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = " MUST hold lock on "
            j8.o.i(r0, r1, r8)
            return
        L1c:
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r7.connections
            r0.add(r8)
            okhttp3.internal.concurrent.TaskQueue r1 = r7.cleanupQueue
            okhttp3.internal.connection.RealConnectionPool$cleanupTask$1 r2 = r7.cleanupTask
            r5 = 2
            r6 = 0
            r3 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r1, r2, r3, r5, r6)
            return
    }
}
