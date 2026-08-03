package okhttp3.internal.connection;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ExchangeFinder {
    private final okhttp3.Address address;
    private final okhttp3.internal.connection.RealCall call;
    private final okhttp3.internal.connection.RealConnectionPool connectionPool;
    private int connectionShutdownCount;
    private final okhttp3.EventListener eventListener;
    private okhttp3.Route nextRouteToTry;
    private int otherFailureCount;
    private int refusedStreamCount;
    private okhttp3.internal.connection.RouteSelector.Selection routeSelection;
    private okhttp3.internal.connection.RouteSelector routeSelector;

    public ExchangeFinder(okhttp3.internal.connection.RealConnectionPool r1, okhttp3.Address r2, okhttp3.internal.connection.RealCall r3, okhttp3.EventListener r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.connectionPool = r1
            r0.address = r2
            r0.call = r3
            r0.eventListener = r4
            return
    }

    private final okhttp3.internal.connection.RealConnection findConnection(int r13, int r14, int r15, int r16, boolean r17) {
            r12 = this;
            okhttp3.internal.connection.RealCall r0 = r12.call
            boolean r0 = r0.isCanceled()
            if (r0 != 0) goto L16a
            okhttp3.internal.connection.RealCall r0 = r12.call
            okhttp3.internal.connection.RealConnection r1 = r0.getConnection()
            r2 = 0
            if (r1 == 0) goto L58
            monitor-enter(r1)
            boolean r0 = r1.getNoNewExchanges()     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L30
            okhttp3.Route r0 = r1.route()     // Catch: java.lang.Throwable -> L2d
            okhttp3.Address r0 = r0.address()     // Catch: java.lang.Throwable -> L2d
            okhttp3.HttpUrl r0 = r0.url()     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r12.sameHostAndPort(r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L2b
            goto L30
        L2b:
            r0 = r2
            goto L36
        L2d:
            r0 = move-exception
            r13 = r0
            goto L56
        L30:
            okhttp3.internal.connection.RealCall r0 = r12.call     // Catch: java.lang.Throwable -> L2d
            java.net.Socket r0 = r0.releaseConnectionNoEvents$okhttp()     // Catch: java.lang.Throwable -> L2d
        L36:
            monitor-exit(r1)
            okhttp3.internal.connection.RealCall r3 = r12.call
            okhttp3.internal.connection.RealConnection r3 = r3.getConnection()
            if (r3 == 0) goto L49
            if (r0 != 0) goto L42
            return r1
        L42:
            java.lang.String r13 = "Check failed."
            j8.o.A(r13)
            r13 = 0
            return r13
        L49:
            if (r0 == 0) goto L4e
            okhttp3.internal.Util.closeQuietly(r0)
        L4e:
            okhttp3.EventListener r0 = r12.eventListener
            okhttp3.internal.connection.RealCall r3 = r12.call
            r0.connectionReleased(r3, r1)
            goto L58
        L56:
            monitor-exit(r1)
            throw r13
        L58:
            r0 = 0
            r12.refusedStreamCount = r0
            r12.connectionShutdownCount = r0
            r12.otherFailureCount = r0
            okhttp3.internal.connection.RealConnectionPool r1 = r12.connectionPool
            okhttp3.Address r3 = r12.address
            okhttp3.internal.connection.RealCall r4 = r12.call
            boolean r1 = r1.callAcquirePooledConnection(r3, r4, r2, r0)
            if (r1 == 0) goto L7c
            okhttp3.internal.connection.RealCall r13 = r12.call
            okhttp3.internal.connection.RealConnection r13 = r13.getConnection()
            r13.getClass()
            okhttp3.EventListener r14 = r12.eventListener
            okhttp3.internal.connection.RealCall r15 = r12.call
            r14.connectionAcquired(r15, r13)
            return r13
        L7c:
            okhttp3.Route r1 = r12.nextRouteToTry
            if (r1 == 0) goto L87
            r1.getClass()
            r12.nextRouteToTry = r2
        L85:
            r3 = r2
            goto Lec
        L87:
            okhttp3.internal.connection.RouteSelector$Selection r1 = r12.routeSelection
            if (r1 == 0) goto L9e
            r1.getClass()
            boolean r1 = r1.hasNext()
            if (r1 == 0) goto L9e
            okhttp3.internal.connection.RouteSelector$Selection r0 = r12.routeSelection
            r0.getClass()
            okhttp3.Route r1 = r0.next()
            goto L85
        L9e:
            okhttp3.internal.connection.RouteSelector r1 = r12.routeSelector
            if (r1 != 0) goto Lb9
            okhttp3.internal.connection.RouteSelector r1 = new okhttp3.internal.connection.RouteSelector
            okhttp3.Address r3 = r12.address
            okhttp3.internal.connection.RealCall r4 = r12.call
            okhttp3.OkHttpClient r4 = r4.getClient()
            okhttp3.internal.connection.RouteDatabase r4 = r4.getRouteDatabase()
            okhttp3.internal.connection.RealCall r5 = r12.call
            okhttp3.EventListener r6 = r12.eventListener
            r1.<init>(r3, r4, r5, r6)
            r12.routeSelector = r1
        Lb9:
            okhttp3.internal.connection.RouteSelector$Selection r1 = r1.next()
            r12.routeSelection = r1
            java.util.List r3 = r1.getRoutes()
            okhttp3.internal.connection.RealCall r4 = r12.call
            boolean r4 = r4.isCanceled()
            if (r4 != 0) goto L163
            okhttp3.internal.connection.RealConnectionPool r4 = r12.connectionPool
            okhttp3.Address r5 = r12.address
            okhttp3.internal.connection.RealCall r6 = r12.call
            boolean r0 = r4.callAcquirePooledConnection(r5, r6, r3, r0)
            if (r0 == 0) goto Le8
            okhttp3.internal.connection.RealCall r13 = r12.call
            okhttp3.internal.connection.RealConnection r13 = r13.getConnection()
            r13.getClass()
            okhttp3.EventListener r14 = r12.eventListener
            okhttp3.internal.connection.RealCall r15 = r12.call
            r14.connectionAcquired(r15, r13)
            return r13
        Le8:
            okhttp3.Route r1 = r1.next()
        Lec:
            okhttp3.internal.connection.RealConnection r4 = new okhttp3.internal.connection.RealConnection
            okhttp3.internal.connection.RealConnectionPool r0 = r12.connectionPool
            r4.<init>(r0, r1)
            okhttp3.internal.connection.RealCall r0 = r12.call
            r0.setConnectionToCancel(r4)
            okhttp3.internal.connection.RealCall r10 = r12.call     // Catch: java.lang.Throwable -> L15b
            okhttp3.EventListener r11 = r12.eventListener     // Catch: java.lang.Throwable -> L15b
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r4.connect(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L15b
            okhttp3.internal.connection.RealCall r13 = r12.call
            r13.setConnectionToCancel(r2)
            okhttp3.internal.connection.RealCall r13 = r12.call
            okhttp3.OkHttpClient r13 = r13.getClient()
            okhttp3.internal.connection.RouteDatabase r13 = r13.getRouteDatabase()
            okhttp3.Route r14 = r4.route()
            r13.connected(r14)
            okhttp3.internal.connection.RealConnectionPool r13 = r12.connectionPool
            okhttp3.Address r14 = r12.address
            okhttp3.internal.connection.RealCall r15 = r12.call
            r0 = 1
            boolean r13 = r13.callAcquirePooledConnection(r14, r15, r3, r0)
            if (r13 == 0) goto L143
            okhttp3.internal.connection.RealCall r13 = r12.call
            okhttp3.internal.connection.RealConnection r13 = r13.getConnection()
            r13.getClass()
            r12.nextRouteToTry = r1
            java.net.Socket r14 = r4.socket()
            okhttp3.internal.Util.closeQuietly(r14)
            okhttp3.EventListener r14 = r12.eventListener
            okhttp3.internal.connection.RealCall r15 = r12.call
            r14.connectionAcquired(r15, r13)
            return r13
        L143:
            monitor-enter(r4)
            okhttp3.internal.connection.RealConnectionPool r13 = r12.connectionPool     // Catch: java.lang.Throwable -> L157
            r13.put(r4)     // Catch: java.lang.Throwable -> L157
            okhttp3.internal.connection.RealCall r13 = r12.call     // Catch: java.lang.Throwable -> L157
            r13.acquireConnectionNoEvents(r4)     // Catch: java.lang.Throwable -> L157
            monitor-exit(r4)
            okhttp3.EventListener r13 = r12.eventListener
            okhttp3.internal.connection.RealCall r14 = r12.call
            r13.connectionAcquired(r14, r4)
            return r4
        L157:
            r0 = move-exception
            r13 = r0
            monitor-exit(r4)
            throw r13
        L15b:
            r0 = move-exception
            r13 = r0
            okhttp3.internal.connection.RealCall r14 = r12.call
            r14.setConnectionToCancel(r2)
            throw r13
        L163:
            java.lang.String r13 = "Canceled"
            j8.o.y(r13)
            r13 = 0
            return r13
        L16a:
            java.lang.String r13 = "Canceled"
            j8.o.y(r13)
            r13 = 0
            return r13
    }

    private final okhttp3.internal.connection.RealConnection findHealthyConnection(int r4, int r5, int r6, int r7, boolean r8, boolean r9) {
            r3 = this;
        L0:
            okhttp3.internal.connection.RealConnection r0 = r3.findConnection(r4, r5, r6, r7, r8)
            r1 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            boolean r2 = r0.isHealthy(r9)
            if (r2 == 0) goto L11
            return r0
        L11:
            r0.noNewExchanges$okhttp()
            okhttp3.Route r0 = r4.nextRouteToTry
            if (r0 != 0) goto L2f
            okhttp3.internal.connection.RouteSelector$Selection r0 = r4.routeSelection
            r2 = 1
            if (r0 == 0) goto L22
            boolean r0 = r0.hasNext()
            goto L23
        L22:
            r0 = r2
        L23:
            if (r0 != 0) goto L2f
            okhttp3.internal.connection.RouteSelector r0 = r4.routeSelector
            if (r0 == 0) goto L2d
            boolean r2 = r0.hasNext()
        L2d:
            if (r2 == 0) goto L35
        L2f:
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r1
            goto L0
        L35:
            java.lang.String r5 = "exhausted all routes"
            j8.o.y(r5)
            r5 = 0
            return r5
    }

    private final okhttp3.Route retryRoute() {
            r4 = this;
            int r0 = r4.refusedStreamCount
            r1 = 0
            r2 = 1
            if (r0 > r2) goto L44
            int r0 = r4.connectionShutdownCount
            if (r0 > r2) goto L44
            int r0 = r4.otherFailureCount
            if (r0 <= 0) goto Lf
            goto L44
        Lf:
            okhttp3.internal.connection.RealCall r0 = r4.call
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            if (r0 != 0) goto L18
            return r1
        L18:
            monitor-enter(r0)
            int r2 = r0.getRouteFailureCount$okhttp()     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L21
            monitor-exit(r0)
            return r1
        L21:
            okhttp3.Route r2 = r0.route()     // Catch: java.lang.Throwable -> L41
            okhttp3.Address r2 = r2.address()     // Catch: java.lang.Throwable -> L41
            okhttp3.HttpUrl r2 = r2.url()     // Catch: java.lang.Throwable -> L41
            okhttp3.Address r3 = r4.address     // Catch: java.lang.Throwable -> L41
            okhttp3.HttpUrl r3 = r3.url()     // Catch: java.lang.Throwable -> L41
            boolean r2 = okhttp3.internal.Util.canReuseConnectionFor(r2, r3)     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L3b
            monitor-exit(r0)
            return r1
        L3b:
            okhttp3.Route r1 = r0.route()     // Catch: java.lang.Throwable -> L41
            monitor-exit(r0)
            return r1
        L41:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L44:
            return r1
    }

    public final okhttp3.internal.http.ExchangeCodec find(okhttp3.OkHttpClient r9, okhttp3.internal.http.RealInterceptorChain r10) {
            r8 = this;
            r9.getClass()
            r10.getClass()
            int r2 = r10.getConnectTimeoutMillis$okhttp()     // Catch: java.io.IOException -> L3a okhttp3.internal.connection.RouteException -> L3d
            int r3 = r10.getReadTimeoutMillis$okhttp()     // Catch: java.io.IOException -> L3a okhttp3.internal.connection.RouteException -> L3d
            int r4 = r10.getWriteTimeoutMillis$okhttp()     // Catch: java.io.IOException -> L3a okhttp3.internal.connection.RouteException -> L3d
            int r5 = r9.pingIntervalMillis()     // Catch: java.io.IOException -> L3a okhttp3.internal.connection.RouteException -> L3d
            boolean r6 = r9.retryOnConnectionFailure()     // Catch: java.io.IOException -> L3a okhttp3.internal.connection.RouteException -> L3d
            okhttp3.Request r0 = r10.getRequest$okhttp()     // Catch: java.io.IOException -> L3a okhttp3.internal.connection.RouteException -> L3d
            java.lang.String r0 = r0.method()     // Catch: java.io.IOException -> L3a okhttp3.internal.connection.RouteException -> L3d
            java.lang.String r1 = "GET"
            boolean r0 = gg.l.a(r0, r1)     // Catch: java.io.IOException -> L3a okhttp3.internal.connection.RouteException -> L3d
            r7 = r0 ^ 1
            r1 = r8
            okhttp3.internal.connection.RealConnection r0 = r1.findHealthyConnection(r2, r3, r4, r5, r6, r7)     // Catch: java.io.IOException -> L34 okhttp3.internal.connection.RouteException -> L37
            okhttp3.internal.http.ExchangeCodec r9 = r0.newCodec$okhttp(r9, r10)     // Catch: java.io.IOException -> L34 okhttp3.internal.connection.RouteException -> L37
            return r9
        L34:
            r0 = move-exception
        L35:
            r9 = r0
            goto L40
        L37:
            r0 = move-exception
        L38:
            r9 = r0
            goto L49
        L3a:
            r0 = move-exception
            r1 = r8
            goto L35
        L3d:
            r0 = move-exception
            r1 = r8
            goto L38
        L40:
            r8.trackFailure(r9)
            okhttp3.internal.connection.RouteException r10 = new okhttp3.internal.connection.RouteException
            r10.<init>(r9)
            throw r10
        L49:
            java.io.IOException r10 = r9.getLastConnectException()
            r8.trackFailure(r10)
            throw r9
    }

    public final okhttp3.Address getAddress$okhttp() {
            r1 = this;
            okhttp3.Address r0 = r1.address
            return r0
    }

    public final boolean retryAfterFailure() {
            r2 = this;
            int r0 = r2.refusedStreamCount
            if (r0 != 0) goto Le
            int r0 = r2.connectionShutdownCount
            if (r0 != 0) goto Le
            int r0 = r2.otherFailureCount
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            okhttp3.Route r0 = r2.nextRouteToTry
            r1 = 1
            if (r0 == 0) goto L14
            return r1
        L14:
            okhttp3.Route r0 = r2.retryRoute()
            if (r0 == 0) goto L1d
            r2.nextRouteToTry = r0
            return r1
        L1d:
            okhttp3.internal.connection.RouteSelector$Selection r0 = r2.routeSelection
            if (r0 == 0) goto L28
            boolean r0 = r0.hasNext()
            if (r0 != r1) goto L28
            return r1
        L28:
            okhttp3.internal.connection.RouteSelector r0 = r2.routeSelector
            if (r0 != 0) goto L2d
            return r1
        L2d:
            boolean r0 = r0.hasNext()
            return r0
    }

    public final boolean sameHostAndPort(okhttp3.HttpUrl r4) {
            r3 = this;
            r4.getClass()
            okhttp3.Address r0 = r3.address
            okhttp3.HttpUrl r0 = r0.url()
            int r1 = r4.port()
            int r2 = r0.port()
            if (r1 != r2) goto L23
            java.lang.String r4 = r4.host()
            java.lang.String r0 = r0.host()
            boolean r4 = gg.l.a(r4, r0)
            if (r4 == 0) goto L23
            r4 = 1
            return r4
        L23:
            r4 = 0
            return r4
    }

    public final void trackFailure(java.io.IOException r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            r2.nextRouteToTry = r0
            boolean r0 = r3 instanceof okhttp3.internal.http2.StreamResetException
            if (r0 == 0) goto L1a
            r0 = r3
            okhttp3.internal.http2.StreamResetException r0 = (okhttp3.internal.http2.StreamResetException) r0
            okhttp3.internal.http2.ErrorCode r0 = r0.errorCode
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM
            if (r0 != r1) goto L1a
            int r3 = r2.refusedStreamCount
            int r3 = r3 + 1
            r2.refusedStreamCount = r3
            return
        L1a:
            boolean r3 = r3 instanceof okhttp3.internal.http2.ConnectionShutdownException
            if (r3 == 0) goto L25
            int r3 = r2.connectionShutdownCount
            int r3 = r3 + 1
            r2.connectionShutdownCount = r3
            return
        L25:
            int r3 = r2.otherFailureCount
            int r3 = r3 + 1
            r2.otherFailureCount = r3
            return
    }
}
