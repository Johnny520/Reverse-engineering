package okhttp3.internal.connection;

/* JADX INFO: compiled from: ExchangeFinder.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ0\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$H\u0002J8\u0010%\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0002J\u0006\u0010'\u001a\u00020$J\n\u0010(\u001a\u0004\u0018\u00010\u0010H\u0002J\u000e\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, m115d2 = {"Lokhttp3/internal/connection/ExchangeFinder;", "", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "address", "Lokhttp3/Address;", "call", "Lokhttp3/internal/connection/RealCall;", "eventListener", "Lokhttp3/EventListener;", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Address;Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;)V", "getAddress$okhttp", "()Lokhttp3/Address;", "connectionShutdownCount", "", "nextRouteToTry", "Lokhttp3/Route;", "otherFailureCount", "refusedStreamCount", "routeSelection", "Lokhttp3/internal/connection/RouteSelector$Selection;", "routeSelector", "Lokhttp3/internal/connection/RouteSelector;", "find", "Lokhttp3/internal/http/ExchangeCodec;", "client", "Lokhttp3/OkHttpClient;", "chain", "Lokhttp3/internal/http/RealInterceptorChain;", "findConnection", "Lokhttp3/internal/connection/RealConnection;", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "connectionRetryEnabled", "", "findHealthyConnection", "doExtensiveHealthChecks", "retryAfterFailure", "retryRoute", "sameHostAndPort", "url", "Lokhttp3/HttpUrl;", "trackFailure", "", "e", "Ljava/io/IOException;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

    public ExchangeFinder(okhttp3.internal.connection.RealConnectionPool r2, okhttp3.Address r3, okhttp3.internal.connection.RealCall r4, okhttp3.EventListener r5) {
            r1 = this;
            java.lang.String r0 = "connectionPool"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "eventListener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r1.<init>()
            r1.connectionPool = r2
            r1.address = r3
            r1.call = r4
            r1.eventListener = r5
            return
    }

    private final okhttp3.internal.connection.RealConnection findConnection(int r18, int r19, int r20, int r21, boolean r22) throws java.io.IOException {
            r17 = this;
            r1 = r17
            okhttp3.internal.connection.RealCall r0 = r1.call
            boolean r0 = r0.isCanceled()
            if (r0 != 0) goto L1b1
            okhttp3.internal.connection.RealCall r0 = r1.call
            okhttp3.internal.connection.RealConnection r2 = r0.getConnection()
            r0 = 1
            r3 = 0
            if (r2 == 0) goto L6a
            r4 = 0
            monitor-enter(r2)
            r5 = 0
            boolean r6 = r2.getNoNewExchanges()     // Catch: java.lang.Throwable -> L67
            if (r6 != 0) goto L2f
            okhttp3.Route r6 = r2.route()     // Catch: java.lang.Throwable -> L67
            okhttp3.Address r6 = r6.address()     // Catch: java.lang.Throwable -> L67
            okhttp3.HttpUrl r6 = r6.url()     // Catch: java.lang.Throwable -> L67
            boolean r6 = r1.sameHostAndPort(r6)     // Catch: java.lang.Throwable -> L67
            if (r6 != 0) goto L36
        L2f:
            okhttp3.internal.connection.RealCall r6 = r1.call     // Catch: java.lang.Throwable -> L67
            java.net.Socket r6 = r6.releaseConnectionNoEvents$okhttp()     // Catch: java.lang.Throwable -> L67
            r4 = r6
        L36:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L67
            monitor-exit(r2)
            okhttp3.internal.connection.RealCall r5 = r1.call
            okhttp3.internal.connection.RealConnection r5 = r5.getConnection()
            if (r5 == 0) goto L55
            if (r4 != 0) goto L45
            goto L46
        L45:
            r0 = r3
        L46:
            if (r0 == 0) goto L49
            return r2
        L49:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L55:
            if (r4 == 0) goto L5a
            okhttp3.internal.Util.closeQuietly(r4)
        L5a:
            okhttp3.EventListener r5 = r1.eventListener
            okhttp3.internal.connection.RealCall r6 = r1.call
            okhttp3.Call r6 = (okhttp3.Call) r6
            r7 = r2
            okhttp3.Connection r7 = (okhttp3.Connection) r7
            r5.connectionReleased(r6, r7)
            goto L6a
        L67:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L6a:
            r1.refusedStreamCount = r3
            r1.connectionShutdownCount = r3
            r1.otherFailureCount = r3
            okhttp3.internal.connection.RealConnectionPool r4 = r1.connectionPool
            okhttp3.Address r5 = r1.address
            okhttp3.internal.connection.RealCall r6 = r1.call
            r7 = 0
            boolean r4 = r4.callAcquirePooledConnection(r5, r6, r7, r3)
            if (r4 == 0) goto L93
            okhttp3.internal.connection.RealCall r0 = r1.call
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okhttp3.EventListener r3 = r1.eventListener
            okhttp3.internal.connection.RealCall r4 = r1.call
            okhttp3.Call r4 = (okhttp3.Call) r4
            r5 = r0
            okhttp3.Connection r5 = (okhttp3.Connection) r5
            r3.connectionAcquired(r4, r5)
            return r0
        L93:
            r4 = 0
            r5 = 0
            okhttp3.Route r6 = r1.nextRouteToTry
            if (r6 == 0) goto La3
            r3 = 0
            okhttp3.Route r4 = r1.nextRouteToTry
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r1.nextRouteToTry = r7
            goto L118
        La3:
            okhttp3.internal.connection.RouteSelector$Selection r6 = r1.routeSelection
            if (r6 == 0) goto Lbd
            okhttp3.internal.connection.RouteSelector$Selection r6 = r1.routeSelection
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            boolean r6 = r6.hasNext()
            if (r6 == 0) goto Lbd
            r3 = 0
            okhttp3.internal.connection.RouteSelector$Selection r4 = r1.routeSelection
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            okhttp3.Route r4 = r4.next()
            goto L118
        Lbd:
            okhttp3.internal.connection.RouteSelector r6 = r1.routeSelector
            if (r6 != 0) goto Ldb
            okhttp3.internal.connection.RouteSelector r8 = new okhttp3.internal.connection.RouteSelector
            okhttp3.Address r9 = r1.address
            okhttp3.internal.connection.RealCall r10 = r1.call
            okhttp3.OkHttpClient r10 = r10.getClient()
            okhttp3.internal.connection.RouteDatabase r10 = r10.getRouteDatabase()
            okhttp3.internal.connection.RealCall r11 = r1.call
            okhttp3.Call r11 = (okhttp3.Call) r11
            okhttp3.EventListener r12 = r1.eventListener
            r8.<init>(r9, r10, r11, r12)
            r6 = r8
            r1.routeSelector = r6
        Ldb:
            okhttp3.internal.connection.RouteSelector$Selection r8 = r6.next()
            r1.routeSelection = r8
            java.util.List r4 = r8.getRoutes()
            okhttp3.internal.connection.RealCall r9 = r1.call
            boolean r9 = r9.isCanceled()
            if (r9 != 0) goto L1a9
            okhttp3.internal.connection.RealConnectionPool r9 = r1.connectionPool
            okhttp3.Address r10 = r1.address
            okhttp3.internal.connection.RealCall r11 = r1.call
            boolean r3 = r9.callAcquirePooledConnection(r10, r11, r4, r3)
            if (r3 == 0) goto L10f
            okhttp3.internal.connection.RealCall r0 = r1.call
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okhttp3.EventListener r3 = r1.eventListener
            okhttp3.internal.connection.RealCall r7 = r1.call
            okhttp3.Call r7 = (okhttp3.Call) r7
            r9 = r0
            okhttp3.Connection r9 = (okhttp3.Connection) r9
            r3.connectionAcquired(r7, r9)
            return r0
        L10f:
            okhttp3.Route r3 = r8.next()
            r16 = r4
            r4 = r3
            r3 = r16
        L118:
            okhttp3.internal.connection.RealConnection r5 = new okhttp3.internal.connection.RealConnection
            okhttp3.internal.connection.RealConnectionPool r6 = r1.connectionPool
            r5.<init>(r6, r4)
            okhttp3.internal.connection.RealCall r6 = r1.call
            r6.setConnectionToCancel(r5)
            okhttp3.internal.connection.RealCall r6 = r1.call     // Catch: java.lang.Throwable -> L1a2
            r14 = r6
            okhttp3.Call r14 = (okhttp3.Call) r14     // Catch: java.lang.Throwable -> L1a2
            okhttp3.EventListener r15 = r1.eventListener     // Catch: java.lang.Throwable -> L1a2
            r8 = r5
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r8.connect(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L1a2
            okhttp3.internal.connection.RealCall r6 = r1.call
            r6.setConnectionToCancel(r7)
            okhttp3.internal.connection.RealCall r6 = r1.call
            okhttp3.OkHttpClient r6 = r6.getClient()
            okhttp3.internal.connection.RouteDatabase r6 = r6.getRouteDatabase()
            okhttp3.Route r7 = r5.route()
            r6.connected(r7)
            okhttp3.internal.connection.RealConnectionPool r6 = r1.connectionPool
            okhttp3.Address r7 = r1.address
            okhttp3.internal.connection.RealCall r8 = r1.call
            boolean r0 = r6.callAcquirePooledConnection(r7, r8, r3, r0)
            if (r0 == 0) goto L182
            okhttp3.internal.connection.RealCall r0 = r1.call
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1.nextRouteToTry = r4
            java.net.Socket r6 = r5.socket()
            okhttp3.internal.Util.closeQuietly(r6)
            okhttp3.EventListener r6 = r1.eventListener
            okhttp3.internal.connection.RealCall r7 = r1.call
            okhttp3.Call r7 = (okhttp3.Call) r7
            r8 = r0
            okhttp3.Connection r8 = (okhttp3.Connection) r8
            r6.connectionAcquired(r7, r8)
            return r0
        L182:
            monitor-enter(r5)
            r0 = 0
            okhttp3.internal.connection.RealConnectionPool r6 = r1.connectionPool     // Catch: java.lang.Throwable -> L19f
            r6.put(r5)     // Catch: java.lang.Throwable -> L19f
            okhttp3.internal.connection.RealCall r6 = r1.call     // Catch: java.lang.Throwable -> L19f
            r6.acquireConnectionNoEvents(r5)     // Catch: java.lang.Throwable -> L19f
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L19f
            monitor-exit(r5)
            okhttp3.EventListener r0 = r1.eventListener
            okhttp3.internal.connection.RealCall r6 = r1.call
            okhttp3.Call r6 = (okhttp3.Call) r6
            r7 = r5
            okhttp3.Connection r7 = (okhttp3.Connection) r7
            r0.connectionAcquired(r6, r7)
            return r5
        L19f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L1a2:
            r0 = move-exception
            okhttp3.internal.connection.RealCall r6 = r1.call
            r6.setConnectionToCancel(r7)
            throw r0
        L1a9:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)
            throw r0
        L1b1:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
    }

    private final okhttp3.internal.connection.RealConnection findHealthyConnection(int r6, int r7, int r8, int r9, boolean r10, boolean r11) throws java.io.IOException {
            r5 = this;
        L1:
            okhttp3.internal.connection.RealConnection r0 = r5.findConnection(r6, r7, r8, r9, r10)
            boolean r1 = r0.isHealthy(r11)
            if (r1 == 0) goto L13
            return r0
        L13:
            r0.noNewExchanges$okhttp()
            okhttp3.Route r1 = r5.nextRouteToTry
            if (r1 != 0) goto L1
            okhttp3.internal.connection.RouteSelector$Selection r1 = r5.routeSelection
            r2 = 1
            if (r1 == 0) goto L24
            boolean r1 = r1.hasNext()
            goto L25
        L24:
            r1 = r2
        L25:
            if (r1 != 0) goto L1
            okhttp3.internal.connection.RouteSelector r3 = r5.routeSelector
            if (r3 == 0) goto L2f
            boolean r2 = r3.hasNext()
        L2f:
            if (r2 == 0) goto L32
            goto L1
        L32:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "exhausted all routes"
            r3.<init>(r4)
            throw r3
    }

    private final okhttp3.Route retryRoute() {
            r5 = this;
            int r0 = r5.refusedStreamCount
            r1 = 0
            r2 = 1
            if (r0 > r2) goto L45
            int r0 = r5.connectionShutdownCount
            if (r0 > r2) goto L45
            int r0 = r5.otherFailureCount
            if (r0 <= 0) goto Lf
            goto L45
        Lf:
            okhttp3.internal.connection.RealCall r0 = r5.call
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            if (r0 != 0) goto L18
            return r1
        L18:
            monitor-enter(r0)
            r2 = 0
            int r3 = r0.getRouteFailureCount$okhttp()     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L22
            monitor-exit(r0)
            return r1
        L22:
            okhttp3.Route r3 = r0.route()     // Catch: java.lang.Throwable -> L42
            okhttp3.Address r3 = r3.address()     // Catch: java.lang.Throwable -> L42
            okhttp3.HttpUrl r3 = r3.url()     // Catch: java.lang.Throwable -> L42
            okhttp3.Address r4 = r5.address     // Catch: java.lang.Throwable -> L42
            okhttp3.HttpUrl r4 = r4.url()     // Catch: java.lang.Throwable -> L42
            boolean r3 = okhttp3.internal.Util.canReuseConnectionFor(r3, r4)     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L3c
            monitor-exit(r0)
            return r1
        L3c:
            okhttp3.Route r1 = r0.route()     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)
            return r1
        L42:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L45:
            return r1
    }

    public final okhttp3.internal.http.ExchangeCodec find(okhttp3.OkHttpClient r9, okhttp3.internal.http.RealInterceptorChain r10) {
            r8 = this;
            java.lang.String r0 = "client"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r2 = r10.getConnectTimeoutMillis$okhttp()     // Catch: java.io.IOException -> L3e okhttp3.internal.connection.RouteException -> L48
            int r3 = r10.getReadTimeoutMillis$okhttp()     // Catch: java.io.IOException -> L3e okhttp3.internal.connection.RouteException -> L48
            int r4 = r10.getWriteTimeoutMillis$okhttp()     // Catch: java.io.IOException -> L3e okhttp3.internal.connection.RouteException -> L48
            int r5 = r9.pingIntervalMillis()     // Catch: java.io.IOException -> L3e okhttp3.internal.connection.RouteException -> L48
            boolean r6 = r9.retryOnConnectionFailure()     // Catch: java.io.IOException -> L3e okhttp3.internal.connection.RouteException -> L48
            okhttp3.Request r0 = r10.getRequest$okhttp()     // Catch: java.io.IOException -> L3e okhttp3.internal.connection.RouteException -> L48
            java.lang.String r0 = r0.method()     // Catch: java.io.IOException -> L3e okhttp3.internal.connection.RouteException -> L48
            java.lang.String r1 = "GET"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.io.IOException -> L3e okhttp3.internal.connection.RouteException -> L48
            if (r0 != 0) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            r7 = r0
            r1 = r8
            okhttp3.internal.connection.RealConnection r0 = r1.findHealthyConnection(r2, r3, r4, r5, r6, r7)     // Catch: java.io.IOException -> L3e okhttp3.internal.connection.RouteException -> L48
            okhttp3.internal.http.ExchangeCodec r1 = r0.newCodec$okhttp(r9, r10)     // Catch: java.io.IOException -> L3e okhttp3.internal.connection.RouteException -> L48
            return r1
        L3e:
            r0 = move-exception
            r8.trackFailure(r0)
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            r1.<init>(r0)
            throw r1
        L48:
            r0 = move-exception
            java.io.IOException r1 = r0.getLastConnectException()
            r8.trackFailure(r1)
            throw r0
    }

    public final okhttp3.Address getAddress$okhttp() {
            r1 = this;
            okhttp3.Address r0 = r1.address
            return r0
    }

    public final boolean retryAfterFailure() {
            r4 = this;
            int r0 = r4.refusedStreamCount
            r1 = 0
            if (r0 != 0) goto Le
            int r0 = r4.connectionShutdownCount
            if (r0 != 0) goto Le
            int r0 = r4.otherFailureCount
            if (r0 != 0) goto Le
            return r1
        Le:
            okhttp3.Route r0 = r4.nextRouteToTry
            r2 = 1
            if (r0 == 0) goto L14
            return r2
        L14:
            okhttp3.Route r0 = r4.retryRoute()
            if (r0 == 0) goto L1d
            r4.nextRouteToTry = r0
            return r2
        L1d:
            okhttp3.internal.connection.RouteSelector$Selection r3 = r4.routeSelection
            if (r3 == 0) goto L28
            boolean r3 = r3.hasNext()
            if (r3 != r2) goto L28
            r1 = r2
        L28:
            if (r1 == 0) goto L2b
            return r2
        L2b:
            okhttp3.internal.connection.RouteSelector r1 = r4.routeSelector
            if (r1 != 0) goto L30
            return r2
        L30:
            boolean r2 = r1.hasNext()
            return r2
    }

    public final boolean sameHostAndPort(okhttp3.HttpUrl r4) {
            r3 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okhttp3.Address r0 = r3.address
            okhttp3.HttpUrl r0 = r0.url()
            int r1 = r4.port()
            int r2 = r0.port()
            if (r1 != r2) goto L25
            java.lang.String r1 = r4.host()
            java.lang.String r2 = r0.host()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L25
            r1 = 1
            goto L26
        L25:
            r1 = 0
        L26:
            return r1
    }

    public final void trackFailure(java.io.IOException r3) {
            r2 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r2.nextRouteToTry = r0
            boolean r0 = r3 instanceof okhttp3.internal.http2.StreamResetException
            if (r0 == 0) goto L1c
            r0 = r3
            okhttp3.internal.http2.StreamResetException r0 = (okhttp3.internal.http2.StreamResetException) r0
            okhttp3.internal.http2.ErrorCode r0 = r0.errorCode
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM
            if (r0 != r1) goto L1c
            int r0 = r2.refusedStreamCount
            int r0 = r0 + 1
            r2.refusedStreamCount = r0
            goto L2d
        L1c:
            boolean r0 = r3 instanceof okhttp3.internal.http2.ConnectionShutdownException
            if (r0 == 0) goto L27
            int r0 = r2.connectionShutdownCount
            int r0 = r0 + 1
            r2.connectionShutdownCount = r0
            goto L2d
        L27:
            int r0 = r2.otherFailureCount
            int r0 = r0 + 1
            r2.otherFailureCount = r0
        L2d:
            return
    }
}
