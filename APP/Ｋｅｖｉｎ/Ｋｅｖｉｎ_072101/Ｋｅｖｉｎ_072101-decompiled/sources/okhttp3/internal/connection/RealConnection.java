package okhttp3.internal.connection;

/* JADX INFO: compiled from: RealConnection.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 {2\u00020\u00012\u00020\u0002:\u0001{B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u00105\u001a\u000206J\u0018\u00107\u001a\u00020\u001d2\u0006\u00108\u001a\u0002092\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J>\u0010:\u001a\u0002062\u0006\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CJ%\u0010D\u001a\u0002062\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00062\u0006\u0010H\u001a\u00020IH\u0000¢\u0006\u0002\bJJ(\u0010K\u001a\u0002062\u0006\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010L\u001a\u0002062\u0006\u0010M\u001a\u00020NH\u0002J0\u0010O\u001a\u0002062\u0006\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\t2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J*\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\t2\u0006\u0010R\u001a\u00020Q2\u0006\u00108\u001a\u000209H\u0002J\b\u0010S\u001a\u00020QH\u0002J(\u0010T\u001a\u0002062\u0006\u0010M\u001a\u00020N2\u0006\u0010>\u001a\u00020\t2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\r\u0010U\u001a\u000206H\u0000¢\u0006\u0002\bVJ%\u0010W\u001a\u00020\u001d2\u0006\u0010X\u001a\u00020Y2\u000e\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010[H\u0000¢\u0006\u0002\b\\J\u000e\u0010]\u001a\u00020\u001d2\u0006\u0010^\u001a\u00020\u001dJ\u001d\u0010_\u001a\u00020`2\u0006\u0010E\u001a\u00020F2\u0006\u0010a\u001a\u00020bH\u0000¢\u0006\u0002\bcJ\u0015\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020gH\u0000¢\u0006\u0002\bhJ\r\u0010 \u001a\u000206H\u0000¢\u0006\u0002\biJ\r\u0010!\u001a\u000206H\u0000¢\u0006\u0002\bjJ\u0018\u0010k\u001a\u0002062\u0006\u0010l\u001a\u00020\u00152\u0006\u0010m\u001a\u00020nH\u0016J\u0010\u0010o\u001a\u0002062\u0006\u0010p\u001a\u00020qH\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010r\u001a\u00020\u001d2\f\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00060[H\u0002J\b\u00101\u001a\u00020(H\u0016J\u0010\u0010t\u001a\u0002062\u0006\u0010>\u001a\u00020\tH\u0002J\u0010\u0010u\u001a\u00020\u001d2\u0006\u00108\u001a\u000209H\u0002J\b\u0010v\u001a\u00020wH\u0016J\u001f\u0010x\u001a\u0002062\u0006\u0010@\u001a\u00020\r2\b\u0010y\u001a\u0004\u0018\u00010IH\u0000¢\u0006\u0002\bzR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006|"}, m115d2 = {"Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/Connection;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "route", "Lokhttp3/Route;", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Route;)V", "allocationLimit", "", "calls", "", "Ljava/lang/ref/Reference;", "Lokhttp3/internal/connection/RealCall;", "getCalls", "()Ljava/util/List;", "getConnectionPool", "()Lokhttp3/internal/connection/RealConnectionPool;", "handshake", "Lokhttp3/Handshake;", "http2Connection", "Lokhttp3/internal/http2/Http2Connection;", "idleAtNs", "", "getIdleAtNs$okhttp", "()J", "setIdleAtNs$okhttp", "(J)V", "isMultiplexed", "", "isMultiplexed$okhttp", "()Z", "noCoalescedConnections", "noNewExchanges", "getNoNewExchanges", "setNoNewExchanges", "(Z)V", "protocol", "Lokhttp3/Protocol;", "rawSocket", "Ljava/net/Socket;", "refusedStreamCount", "routeFailureCount", "getRouteFailureCount$okhttp", "()I", "setRouteFailureCount$okhttp", "(I)V", "sink", "Lokio/BufferedSink;", "socket", "source", "Lokio/BufferedSource;", "successCount", "cancel", "", "certificateSupportHost", "url", "Lokhttp3/HttpUrl;", "connect", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "connectionRetryEnabled", "call", "Lokhttp3/Call;", "eventListener", "Lokhttp3/EventListener;", "connectFailed", "client", "Lokhttp3/OkHttpClient;", "failedRoute", "failure", "Ljava/io/IOException;", "connectFailed$okhttp", "connectSocket", "connectTls", "connectionSpecSelector", "Lokhttp3/internal/connection/ConnectionSpecSelector;", "connectTunnel", "createTunnel", "Lokhttp3/Request;", "tunnelRequest", "createTunnelRequest", "establishProtocol", "incrementSuccessCount", "incrementSuccessCount$okhttp", "isEligible", "address", "Lokhttp3/Address;", "routes", "", "isEligible$okhttp", "isHealthy", "doExtensiveChecks", "newCodec", "Lokhttp3/internal/http/ExchangeCodec;", "chain", "Lokhttp3/internal/http/RealInterceptorChain;", "newCodec$okhttp", "newWebSocketStreams", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "exchange", "Lokhttp3/internal/connection/Exchange;", "newWebSocketStreams$okhttp", "noCoalescedConnections$okhttp", "noNewExchanges$okhttp", "onSettings", "connection", "settings", "Lokhttp3/internal/http2/Settings;", "onStream", "stream", "Lokhttp3/internal/http2/Http2Stream;", "routeMatchesAny", "candidates", "startHttp2", "supportsUrl", "toString", "", "trackFailure", "e", "trackFailure$okhttp", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class RealConnection extends okhttp3.internal.http2.Http2Connection.Listener implements okhttp3.Connection {
    public static final okhttp3.internal.connection.RealConnection.Companion Companion = null;
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final java.lang.String NPE_THROW_WITH_NULL = "throw with null exception";
    private int allocationLimit;
    private final java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.RealCall>> calls;
    private final okhttp3.internal.connection.RealConnectionPool connectionPool;
    private okhttp3.Handshake handshake;
    private okhttp3.internal.http2.Http2Connection http2Connection;
    private long idleAtNs;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private okhttp3.Protocol protocol;
    private java.net.Socket rawSocket;
    private int refusedStreamCount;
    private final okhttp3.Route route;
    private int routeFailureCount;
    private okio.BufferedSink sink;
    private java.net.Socket socket;
    private okio.BufferedSource source;
    private int successCount;

    /* JADX INFO: compiled from: RealConnection.kt */
    @kotlin.Metadata(m114d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m115d2 = {"Lokhttp3/internal/connection/RealConnection$Companion;", "", "()V", "IDLE_CONNECTION_HEALTHY_NS", "", "MAX_TUNNEL_ATTEMPTS", "", "NPE_THROW_WITH_NULL", "", "newTestConnection", "Lokhttp3/internal/connection/RealConnection;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "route", "Lokhttp3/Route;", "socket", "Ljava/net/Socket;", "idleAtNs", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

        public final okhttp3.internal.connection.RealConnection newTestConnection(okhttp3.internal.connection.RealConnectionPool r2, okhttp3.Route r3, java.net.Socket r4, long r5) {
                r1 = this;
                java.lang.String r0 = "connectionPool"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "route"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "socket"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okhttp3.internal.connection.RealConnection r0 = new okhttp3.internal.connection.RealConnection
                r0.<init>(r2, r3)
                okhttp3.internal.connection.RealConnection.access$setSocket$p(r0, r4)
                r0.setIdleAtNs$okhttp(r5)
                return r0
        }
    }

    /* JADX INFO: compiled from: RealConnection.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 8, 0}, m119xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                java.net.Proxy$Type[] r0 = java.net.Proxy.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT     // Catch: java.lang.NoSuchFieldError -> L11
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L11
                goto L12
            L11:
                r1 = move-exception
            L12:
                java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP     // Catch: java.lang.NoSuchFieldError -> L1c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
                goto L1d
            L1c:
                r1 = move-exception
            L1d:
                okhttp3.internal.connection.RealConnection.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }



    static {
            okhttp3.internal.connection.RealConnection$Companion r0 = new okhttp3.internal.connection.RealConnection$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.connection.RealConnection.Companion = r0
            return
    }

    public RealConnection(okhttp3.internal.connection.RealConnectionPool r3, okhttp3.Route r4) {
            r2 = this;
            java.lang.String r0 = "connectionPool"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "route"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r2.<init>()
            r2.connectionPool = r3
            r2.route = r4
            r0 = 1
            r2.allocationLimit = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r2.calls = r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.idleAtNs = r0
            return
    }

    public static final /* synthetic */ okhttp3.Handshake access$getHandshake$p(okhttp3.internal.connection.RealConnection r1) {
            okhttp3.Handshake r0 = r1.handshake
            return r0
    }

    public static final /* synthetic */ void access$setSocket$p(okhttp3.internal.connection.RealConnection r0, java.net.Socket r1) {
            r0.socket = r1
            return
    }

    private final boolean certificateSupportHost(okhttp3.HttpUrl r7, okhttp3.Handshake r8) {
            r6 = this;
            java.util.List r0 = r8.peerCertificates()
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r2 = 0
            if (r1 != 0) goto L26
            okhttp3.internal.tls.OkHostnameVerifier r1 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE
            java.lang.String r3 = r7.host()
            java.lang.Object r4 = r0.get(r2)
            java.lang.String r5 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r5)
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4
            boolean r1 = r1.verify(r3, r4)
            if (r1 == 0) goto L26
            r2 = 1
        L26:
            return r2
    }

    private final void connectSocket(int r9, int r10, okhttp3.Call r11, okhttp3.EventListener r12) throws java.io.IOException {
            r8 = this;
            okhttp3.Route r0 = r8.route
            java.net.Proxy r0 = r0.proxy()
            okhttp3.Route r1 = r8.route
            okhttp3.Address r1 = r1.address()
            java.net.Proxy$Type r2 = r0.type()
            if (r2 != 0) goto L14
            r2 = -1
            goto L1c
        L14:
            int[] r3 = okhttp3.internal.connection.RealConnection.WhenMappings.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r3[r2]
        L1c:
            switch(r2) {
                case 1: goto L25;
                case 2: goto L25;
                default: goto L1f;
            }
        L1f:
            java.net.Socket r2 = new java.net.Socket
            r2.<init>(r0)
            goto L30
        L25:
            javax.net.SocketFactory r2 = r1.socketFactory()
            java.net.Socket r2 = r2.createSocket()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
        L30:
            r8.rawSocket = r2
            okhttp3.Route r3 = r8.route
            java.net.InetSocketAddress r3 = r3.socketAddress()
            r12.connectStart(r11, r3, r0)
            r2.setSoTimeout(r10)
            okhttp3.internal.platform.Platform$Companion r3 = okhttp3.internal.platform.Platform.Companion     // Catch: java.net.ConnectException -> L7c
            okhttp3.internal.platform.Platform r3 = r3.get()     // Catch: java.net.ConnectException -> L7c
            okhttp3.Route r4 = r8.route     // Catch: java.net.ConnectException -> L7c
            java.net.InetSocketAddress r4 = r4.socketAddress()     // Catch: java.net.ConnectException -> L7c
            r3.connectSocket(r2, r4, r9)     // Catch: java.net.ConnectException -> L7c
            okio.Source r3 = okio.Okio.source(r2)     // Catch: java.lang.NullPointerException -> L65
            okio.BufferedSource r3 = okio.Okio.buffer(r3)     // Catch: java.lang.NullPointerException -> L65
            r8.source = r3     // Catch: java.lang.NullPointerException -> L65
            okio.Sink r3 = okio.Okio.sink(r2)     // Catch: java.lang.NullPointerException -> L65
            okio.BufferedSink r3 = okio.Okio.buffer(r3)     // Catch: java.lang.NullPointerException -> L65
            r8.sink = r3     // Catch: java.lang.NullPointerException -> L65
            goto L72
        L65:
            r3 = move-exception
            java.lang.String r4 = r3.getMessage()
            java.lang.String r5 = "throw with null exception"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 != 0) goto L73
        L72:
            return
        L73:
            java.io.IOException r4 = new java.io.IOException
            r5 = r3
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r4.<init>(r5)
            throw r4
        L7c:
            r3 = move-exception
            java.net.ConnectException r4 = new java.net.ConnectException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to connect to "
            java.lang.StringBuilder r5 = r5.append(r6)
            okhttp3.Route r6 = r8.route
            java.net.InetSocketAddress r6 = r6.socketAddress()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            r5 = r4
            r6 = 0
            r7 = r3
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            r5.initCause(r7)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            throw r4
    }

    private final void connectTls(okhttp3.internal.connection.ConnectionSpecSelector r17) throws java.io.IOException {
            r16 = this;
            r1 = r16
            okhttp3.Route r0 = r1.route
            okhttp3.Address r2 = r0.address()
            javax.net.ssl.SSLSocketFactory r3 = r2.sslSocketFactory()
            r4 = 0
            r5 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Throwable -> L19d
            java.net.Socket r0 = r1.rawSocket     // Catch: java.lang.Throwable -> L19d
            okhttp3.HttpUrl r6 = r2.url()     // Catch: java.lang.Throwable -> L19d
            java.lang.String r6 = r6.host()     // Catch: java.lang.Throwable -> L19d
            okhttp3.HttpUrl r7 = r2.url()     // Catch: java.lang.Throwable -> L19d
            int r7 = r7.port()     // Catch: java.lang.Throwable -> L19d
            r8 = 1
            java.net.Socket r0 = r3.createSocket(r0, r6, r7, r8)     // Catch: java.lang.Throwable -> L19d
            java.lang.String r6 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r6)     // Catch: java.lang.Throwable -> L19d
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0     // Catch: java.lang.Throwable -> L19d
            r5 = r0
            r6 = r17
            okhttp3.ConnectionSpec r0 = r6.configureSecureSocket(r5)     // Catch: java.lang.Throwable -> L19b
            boolean r7 = r0.supportsTlsExtensions()     // Catch: java.lang.Throwable -> L19b
            if (r7 == 0) goto L52
            okhttp3.internal.platform.Platform$Companion r7 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.Throwable -> L19b
            okhttp3.internal.platform.Platform r7 = r7.get()     // Catch: java.lang.Throwable -> L19b
            okhttp3.HttpUrl r9 = r2.url()     // Catch: java.lang.Throwable -> L19b
            java.lang.String r9 = r9.host()     // Catch: java.lang.Throwable -> L19b
            java.util.List r10 = r2.protocols()     // Catch: java.lang.Throwable -> L19b
            r7.configureTlsExtensions(r5, r9, r10)     // Catch: java.lang.Throwable -> L19b
        L52:
            r5.startHandshake()     // Catch: java.lang.Throwable -> L19b
            javax.net.ssl.SSLSession r7 = r5.getSession()     // Catch: java.lang.Throwable -> L19b
            okhttp3.Handshake$Companion r9 = okhttp3.Handshake.Companion     // Catch: java.lang.Throwable -> L19b
            java.lang.String r10 = "sslSocketSession"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r10)     // Catch: java.lang.Throwable -> L19b
            okhttp3.Handshake r9 = r9.get(r7)     // Catch: java.lang.Throwable -> L19b
            javax.net.ssl.HostnameVerifier r10 = r2.hostnameVerifier()     // Catch: java.lang.Throwable -> L19b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)     // Catch: java.lang.Throwable -> L19b
            okhttp3.HttpUrl r11 = r2.url()     // Catch: java.lang.Throwable -> L19b
            java.lang.String r11 = r11.host()     // Catch: java.lang.Throwable -> L19b
            boolean r10 = r10.verify(r11, r7)     // Catch: java.lang.Throwable -> L19b
            r11 = 0
            if (r10 != 0) goto L11b
            java.util.List r10 = r9.peerCertificates()     // Catch: java.lang.Throwable -> L19b
            r12 = r10
            java.util.Collection r12 = (java.util.Collection) r12     // Catch: java.lang.Throwable -> L19b
            boolean r12 = r12.isEmpty()     // Catch: java.lang.Throwable -> L19b
            if (r12 != 0) goto Lf4
            r12 = 0
            java.lang.Object r12 = r10.get(r12)     // Catch: java.lang.Throwable -> L19b
            java.lang.String r13 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r12, r13)     // Catch: java.lang.Throwable -> L19b
            java.security.cert.X509Certificate r12 = (java.security.cert.X509Certificate) r12     // Catch: java.lang.Throwable -> L19b
            javax.net.ssl.SSLPeerUnverifiedException r13 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch: java.lang.Throwable -> L19b
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19b
            r14.<init>()     // Catch: java.lang.Throwable -> L19b
            java.lang.String r15 = "\n              |Hostname "
            java.lang.StringBuilder r14 = r14.append(r15)     // Catch: java.lang.Throwable -> L19b
            okhttp3.HttpUrl r15 = r2.url()     // Catch: java.lang.Throwable -> L19b
            java.lang.String r15 = r15.host()     // Catch: java.lang.Throwable -> L19b
            java.lang.StringBuilder r14 = r14.append(r15)     // Catch: java.lang.Throwable -> L19b
            java.lang.String r15 = " not verified:\n              |    certificate: "
            java.lang.StringBuilder r14 = r14.append(r15)     // Catch: java.lang.Throwable -> L19b
            okhttp3.CertificatePinner$Companion r15 = okhttp3.CertificatePinner.Companion     // Catch: java.lang.Throwable -> L19b
            r8 = r12
            java.security.cert.Certificate r8 = (java.security.cert.Certificate) r8     // Catch: java.lang.Throwable -> L19b
            java.lang.String r8 = r15.pin(r8)     // Catch: java.lang.Throwable -> L19b
            java.lang.StringBuilder r8 = r14.append(r8)     // Catch: java.lang.Throwable -> L19b
            java.lang.String r14 = "\n              |    DN: "
            java.lang.StringBuilder r8 = r8.append(r14)     // Catch: java.lang.Throwable -> L19b
            java.security.Principal r14 = r12.getSubjectDN()     // Catch: java.lang.Throwable -> L19b
            java.lang.String r14 = r14.getName()     // Catch: java.lang.Throwable -> L19b
            java.lang.StringBuilder r8 = r8.append(r14)     // Catch: java.lang.Throwable -> L19b
            java.lang.String r14 = "\n              |    subjectAltNames: "
            java.lang.StringBuilder r8 = r8.append(r14)     // Catch: java.lang.Throwable -> L19b
            okhttp3.internal.tls.OkHostnameVerifier r14 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE     // Catch: java.lang.Throwable -> L19b
            java.util.List r14 = r14.allSubjectAltNames(r12)     // Catch: java.lang.Throwable -> L19b
            java.lang.StringBuilder r8 = r8.append(r14)     // Catch: java.lang.Throwable -> L19b
            java.lang.String r14 = "\n              "
            java.lang.StringBuilder r8 = r8.append(r14)     // Catch: java.lang.Throwable -> L19b
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L19b
            r14 = 1
            java.lang.String r8 = kotlin.text.StringsKt.trimMargin$default(r8, r11, r14, r11)     // Catch: java.lang.Throwable -> L19b
            r13.<init>(r8)     // Catch: java.lang.Throwable -> L19b
            throw r13     // Catch: java.lang.Throwable -> L19b
        Lf4:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch: java.lang.Throwable -> L19b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19b
            r11.<init>()     // Catch: java.lang.Throwable -> L19b
            java.lang.String r12 = "Hostname "
            java.lang.StringBuilder r11 = r11.append(r12)     // Catch: java.lang.Throwable -> L19b
            okhttp3.HttpUrl r12 = r2.url()     // Catch: java.lang.Throwable -> L19b
            java.lang.String r12 = r12.host()     // Catch: java.lang.Throwable -> L19b
            java.lang.StringBuilder r11 = r11.append(r12)     // Catch: java.lang.Throwable -> L19b
            java.lang.String r12 = " not verified (no certificates)"
            java.lang.StringBuilder r11 = r11.append(r12)     // Catch: java.lang.Throwable -> L19b
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L19b
            r8.<init>(r11)     // Catch: java.lang.Throwable -> L19b
            throw r8     // Catch: java.lang.Throwable -> L19b
        L11b:
            okhttp3.CertificatePinner r8 = r2.certificatePinner()     // Catch: java.lang.Throwable -> L19b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)     // Catch: java.lang.Throwable -> L19b
            okhttp3.Handshake r10 = new okhttp3.Handshake     // Catch: java.lang.Throwable -> L19b
            okhttp3.TlsVersion r12 = r9.tlsVersion()     // Catch: java.lang.Throwable -> L19b
            okhttp3.CipherSuite r13 = r9.cipherSuite()     // Catch: java.lang.Throwable -> L19b
            java.util.List r14 = r9.localCertificates()     // Catch: java.lang.Throwable -> L19b
            okhttp3.internal.connection.RealConnection$connectTls$1 r15 = new okhttp3.internal.connection.RealConnection$connectTls$1     // Catch: java.lang.Throwable -> L19b
            r15.<init>(r8, r9, r2)     // Catch: java.lang.Throwable -> L19b
            kotlin.jvm.functions.Function0 r15 = (kotlin.jvm.functions.Function0) r15     // Catch: java.lang.Throwable -> L19b
            r10.<init>(r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L19b
            r1.handshake = r10     // Catch: java.lang.Throwable -> L19b
            okhttp3.HttpUrl r10 = r2.url()     // Catch: java.lang.Throwable -> L19b
            java.lang.String r10 = r10.host()     // Catch: java.lang.Throwable -> L19b
            okhttp3.internal.connection.RealConnection$connectTls$2 r12 = new okhttp3.internal.connection.RealConnection$connectTls$2     // Catch: java.lang.Throwable -> L19b
            r12.<init>(r1)     // Catch: java.lang.Throwable -> L19b
            kotlin.jvm.functions.Function0 r12 = (kotlin.jvm.functions.Function0) r12     // Catch: java.lang.Throwable -> L19b
            r8.check$okhttp(r10, r12)     // Catch: java.lang.Throwable -> L19b
            boolean r10 = r0.supportsTlsExtensions()     // Catch: java.lang.Throwable -> L19b
            if (r10 == 0) goto L15f
            okhttp3.internal.platform.Platform$Companion r10 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.Throwable -> L19b
            okhttp3.internal.platform.Platform r10 = r10.get()     // Catch: java.lang.Throwable -> L19b
            java.lang.String r11 = r10.getSelectedProtocol(r5)     // Catch: java.lang.Throwable -> L19b
            goto L160
        L15f:
        L160:
            r10 = r11
            r11 = r5
            java.net.Socket r11 = (java.net.Socket) r11     // Catch: java.lang.Throwable -> L19b
            r1.socket = r11     // Catch: java.lang.Throwable -> L19b
            r11 = r5
            java.net.Socket r11 = (java.net.Socket) r11     // Catch: java.lang.Throwable -> L19b
            okio.Source r11 = okio.Okio.source(r11)     // Catch: java.lang.Throwable -> L19b
            okio.BufferedSource r11 = okio.Okio.buffer(r11)     // Catch: java.lang.Throwable -> L19b
            r1.source = r11     // Catch: java.lang.Throwable -> L19b
            r11 = r5
            java.net.Socket r11 = (java.net.Socket) r11     // Catch: java.lang.Throwable -> L19b
            okio.Sink r11 = okio.Okio.sink(r11)     // Catch: java.lang.Throwable -> L19b
            okio.BufferedSink r11 = okio.Okio.buffer(r11)     // Catch: java.lang.Throwable -> L19b
            r1.sink = r11     // Catch: java.lang.Throwable -> L19b
            if (r10 == 0) goto L189
            okhttp3.Protocol$Companion r11 = okhttp3.Protocol.Companion     // Catch: java.lang.Throwable -> L19b
            okhttp3.Protocol r11 = r11.get(r10)     // Catch: java.lang.Throwable -> L19b
            goto L18b
        L189:
            okhttp3.Protocol r11 = okhttp3.Protocol.HTTP_1_1     // Catch: java.lang.Throwable -> L19b
        L18b:
            r1.protocol = r11     // Catch: java.lang.Throwable -> L19b
            r0 = 1
            okhttp3.internal.platform.Platform$Companion r4 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r4 = r4.get()
            r4.afterHandshake(r5)
            return
        L19b:
            r0 = move-exception
            goto L1a0
        L19d:
            r0 = move-exception
            r6 = r17
        L1a0:
            if (r5 == 0) goto L1ab
            okhttp3.internal.platform.Platform$Companion r7 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r7 = r7.get()
            r7.afterHandshake(r5)
        L1ab:
            if (r5 == 0) goto L1b4
            r7 = r5
            java.net.Socket r7 = (java.net.Socket) r7
            okhttp3.internal.Util.closeQuietly(r7)
        L1b4:
            throw r0
    }

    private final void connectTunnel(int r7, int r8, int r9, okhttp3.Call r10, okhttp3.EventListener r11) throws java.io.IOException {
            r6 = this;
            okhttp3.Request r0 = r6.createTunnelRequest()
            okhttp3.HttpUrl r1 = r0.url()
            r2 = 0
        L9:
            r3 = 21
            if (r2 >= r3) goto L38
            r6.connectSocket(r7, r8, r10, r11)
            okhttp3.Request r3 = r6.createTunnel(r8, r9, r0, r1)
            if (r3 != 0) goto L17
            goto L38
        L17:
            r0 = r3
            java.net.Socket r3 = r6.rawSocket
            if (r3 == 0) goto L1f
            okhttp3.internal.Util.closeQuietly(r3)
        L1f:
            r3 = 0
            r6.rawSocket = r3
            r6.sink = r3
            r6.source = r3
            okhttp3.Route r4 = r6.route
            java.net.InetSocketAddress r4 = r4.socketAddress()
            okhttp3.Route r5 = r6.route
            java.net.Proxy r5 = r5.proxy()
            r11.connectEnd(r10, r4, r5, r3)
            int r2 = r2 + 1
            goto L9
        L38:
            return
    }

    private final okhttp3.Request createTunnel(int r12, int r13, okhttp3.Request r14, okhttp3.HttpUrl r15) throws java.io.IOException {
            r11 = this;
            r0 = r14
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "CONNECT "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 1
            java.lang.String r3 = okhttp3.internal.Util.toHostHeader(r15, r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = " HTTP/1.1"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
        L1f:
            okio.BufferedSource r3 = r11.source
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.BufferedSink r4 = r11.sink
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            okhttp3.internal.http1.Http1ExchangeCodec r5 = new okhttp3.internal.http1.Http1ExchangeCodec
            r6 = 0
            r5.<init>(r6, r11, r3, r4)
            okio.Timeout r7 = r3.timeout()
            long r8 = (long) r12
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            r7.timeout(r8, r10)
            okio.Timeout r7 = r4.timeout()
            long r8 = (long) r13
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            r7.timeout(r8, r10)
            okhttp3.Headers r7 = r0.headers()
            r5.writeRequest(r7, r1)
            r5.finishRequest()
            r7 = 0
            okhttp3.Response$Builder r7 = r5.readResponseHeaders(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            okhttp3.Response$Builder r7 = r7.request(r0)
            okhttp3.Response r7 = r7.build()
            r5.skipConnectBody(r7)
            int r8 = r7.code()
            switch(r8) {
                case 200: goto Lb1;
                case 407: goto L86;
                default: goto L69;
            }
        L69:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Unexpected response code for CONNECT: "
            java.lang.StringBuilder r6 = r6.append(r8)
            int r8 = r7.code()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
            r2.<init>(r6)
            throw r2
        L86:
            okhttp3.Route r8 = r11.route
            okhttp3.Address r8 = r8.address()
            okhttp3.Authenticator r8 = r8.proxyAuthenticator()
            okhttp3.Route r9 = r11.route
            okhttp3.Request r8 = r8.authenticate(r9, r7)
            if (r8 == 0) goto La9
            r0 = r8
            java.lang.String r8 = "Connection"
            r9 = 2
            java.lang.String r6 = okhttp3.Response.header$default(r7, r8, r6, r9, r6)
            java.lang.String r8 = "close"
            boolean r6 = kotlin.text.StringsKt.equals(r8, r6, r2)
            if (r6 == 0) goto L1f
            return r0
        La9:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r6 = "Failed to authenticate with proxy"
            r2.<init>(r6)
            throw r2
        Lb1:
            okio.Buffer r2 = r3.getBuffer()
            boolean r2 = r2.exhausted()
            if (r2 == 0) goto Lc6
            okio.Buffer r2 = r4.getBuffer()
            boolean r2 = r2.exhausted()
            if (r2 == 0) goto Lc6
            return r6
        Lc6:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r6 = "TLS tunnel buffered too many bytes!"
            r2.<init>(r6)
            throw r2
    }

    private final okhttp3.Request createTunnelRequest() throws java.io.IOException {
            r4 = this;
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>()
            okhttp3.Route r1 = r4.route
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            okhttp3.Request$Builder r0 = r0.url(r1)
            java.lang.String r1 = "CONNECT"
            r2 = 0
            okhttp3.Request$Builder r0 = r0.method(r1, r2)
            okhttp3.Route r1 = r4.route
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            r2 = 1
            java.lang.String r1 = okhttp3.internal.Util.toHostHeader(r1, r2)
            java.lang.String r2 = "Host"
            okhttp3.Request$Builder r0 = r0.header(r2, r1)
            java.lang.String r1 = "Proxy-Connection"
            java.lang.String r2 = "Keep-Alive"
            okhttp3.Request$Builder r0 = r0.header(r1, r2)
            java.lang.String r1 = "User-Agent"
            java.lang.String r2 = "okhttp/4.12.0"
            okhttp3.Request$Builder r0 = r0.header(r1, r2)
            okhttp3.Request r0 = r0.build()
            okhttp3.Response$Builder r1 = new okhttp3.Response$Builder
            r1.<init>()
            okhttp3.Response$Builder r1 = r1.request(r0)
            okhttp3.Protocol r2 = okhttp3.Protocol.HTTP_1_1
            okhttp3.Response$Builder r1 = r1.protocol(r2)
            r2 = 407(0x197, float:5.7E-43)
            okhttp3.Response$Builder r1 = r1.code(r2)
            java.lang.String r2 = "Preemptive Authenticate"
            okhttp3.Response$Builder r1 = r1.message(r2)
            okhttp3.ResponseBody r2 = okhttp3.internal.Util.EMPTY_RESPONSE
            okhttp3.Response$Builder r1 = r1.body(r2)
            r2 = -1
            okhttp3.Response$Builder r1 = r1.sentRequestAtMillis(r2)
            okhttp3.Response$Builder r1 = r1.receivedResponseAtMillis(r2)
            java.lang.String r2 = "Proxy-Authenticate"
            java.lang.String r3 = "OkHttp-Preemptive"
            okhttp3.Response$Builder r1 = r1.header(r2, r3)
            okhttp3.Response r1 = r1.build()
            okhttp3.Route r2 = r4.route
            okhttp3.Address r2 = r2.address()
            okhttp3.Authenticator r2 = r2.proxyAuthenticator()
            okhttp3.Route r3 = r4.route
            okhttp3.Request r2 = r2.authenticate(r3, r1)
            if (r2 != 0) goto L91
            r3 = r0
            goto L92
        L91:
            r3 = r2
        L92:
            return r3
    }

    private final void establishProtocol(okhttp3.internal.connection.ConnectionSpecSelector r3, int r4, okhttp3.Call r5, okhttp3.EventListener r6) throws java.io.IOException {
            r2 = this;
            okhttp3.Route r0 = r2.route
            okhttp3.Address r0 = r0.address()
            javax.net.ssl.SSLSocketFactory r0 = r0.sslSocketFactory()
            if (r0 != 0) goto L33
            okhttp3.Route r0 = r2.route
            okhttp3.Address r0 = r0.address()
            java.util.List r0 = r0.protocols()
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L2a
            java.net.Socket r0 = r2.rawSocket
            r2.socket = r0
            okhttp3.Protocol r0 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            r2.protocol = r0
            r2.startHttp2(r4)
            return
        L2a:
            java.net.Socket r0 = r2.rawSocket
            r2.socket = r0
            okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1
            r2.protocol = r0
            return
        L33:
            r6.secureConnectStart(r5)
            r2.connectTls(r3)
            okhttp3.Handshake r0 = r2.handshake
            r6.secureConnectEnd(r5, r0)
            okhttp3.Protocol r0 = r2.protocol
            okhttp3.Protocol r1 = okhttp3.Protocol.HTTP_2
            if (r0 != r1) goto L47
            r2.startHttp2(r4)
        L47:
            return
    }

    private final boolean routeMatchesAny(java.util.List<okhttp3.Route> r11) {
            r10 = this;
            r0 = r11
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L13
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L13
            goto L59
        L13:
            java.util.Iterator r2 = r0.iterator()
        L17:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L58
            java.lang.Object r4 = r2.next()
            r5 = r4
            okhttp3.Route r5 = (okhttp3.Route) r5
            r6 = 0
            java.net.Proxy r7 = r5.proxy()
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r8 = java.net.Proxy.Type.DIRECT
            r9 = 1
            if (r7 != r8) goto L52
            okhttp3.Route r7 = r10.route
            java.net.Proxy r7 = r7.proxy()
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r8 = java.net.Proxy.Type.DIRECT
            if (r7 != r8) goto L52
            okhttp3.Route r7 = r10.route
            java.net.InetSocketAddress r7 = r7.socketAddress()
            java.net.InetSocketAddress r8 = r5.socketAddress()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r8)
            if (r7 == 0) goto L52
            r7 = r9
            goto L53
        L52:
            r7 = r3
        L53:
            if (r7 == 0) goto L17
            r3 = r9
            goto L59
        L58:
        L59:
            return r3
    }

    private final void startHttp2(int r8) throws java.io.IOException {
            r7 = this;
            java.net.Socket r0 = r7.socket
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okio.BufferedSource r1 = r7.source
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            okio.BufferedSink r2 = r7.sink
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r3 = 0
            r0.setSoTimeout(r3)
            okhttp3.internal.http2.Http2Connection$Builder r4 = new okhttp3.internal.http2.Http2Connection$Builder
            r5 = 1
            okhttp3.internal.concurrent.TaskRunner r6 = okhttp3.internal.concurrent.TaskRunner.INSTANCE
            r4.<init>(r5, r6)
            okhttp3.Route r5 = r7.route
            okhttp3.Address r5 = r5.address()
            okhttp3.HttpUrl r5 = r5.url()
            java.lang.String r5 = r5.host()
            okhttp3.internal.http2.Http2Connection$Builder r4 = r4.socket(r0, r5, r1, r2)
            r5 = r7
            okhttp3.internal.http2.Http2Connection$Listener r5 = (okhttp3.internal.http2.Http2Connection.Listener) r5
            okhttp3.internal.http2.Http2Connection$Builder r4 = r4.listener(r5)
            okhttp3.internal.http2.Http2Connection$Builder r4 = r4.pingIntervalMillis(r8)
            okhttp3.internal.http2.Http2Connection r4 = r4.build()
            r7.http2Connection = r4
            okhttp3.internal.http2.Http2Connection$Companion r5 = okhttp3.internal.http2.Http2Connection.Companion
            okhttp3.internal.http2.Settings r5 = r5.getDEFAULT_SETTINGS()
            int r5 = r5.getMaxConcurrentStreams()
            r7.allocationLimit = r5
            r5 = 0
            r6 = 3
            okhttp3.internal.http2.Http2Connection.start$default(r4, r3, r5, r6, r5)
            return
    }

    private final boolean supportsUrl(okhttp3.HttpUrl r6) {
            r5 = this;
            r0 = r5
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
            okhttp3.Route r0 = r5.route
            okhttp3.Address r0 = r0.address()
            okhttp3.HttpUrl r0 = r0.url()
            int r1 = r6.port()
            int r2 = r0.port()
            r3 = 0
            if (r1 == r2) goto L4f
            return r3
        L4f:
            java.lang.String r1 = r6.host()
            java.lang.String r2 = r0.host()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r2 = 1
            if (r1 == 0) goto L5f
            return r2
        L5f:
            boolean r1 = r5.noCoalescedConnections
            if (r1 != 0) goto L73
            okhttp3.Handshake r1 = r5.handshake
            if (r1 == 0) goto L73
            okhttp3.Handshake r1 = r5.handshake
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            boolean r1 = r5.certificateSupportHost(r6, r1)
            if (r1 == 0) goto L73
            r3 = r2
        L73:
            return r3
    }

    public final void cancel() {
            r1 = this;
            java.net.Socket r0 = r1.rawSocket
            if (r0 == 0) goto L7
            okhttp3.internal.Util.closeQuietly(r0)
        L7:
            return
    }

    public final void connect(int r17, int r18, int r19, int r20, boolean r21, okhttp3.Call r22, okhttp3.EventListener r23) {
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "eventListener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            okhttp3.Protocol r0 = r7.protocol
            r10 = 1
            if (r0 != 0) goto L17
            r0 = r10
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 == 0) goto L178
            r0 = 0
            okhttp3.Route r1 = r7.route
            okhttp3.Address r1 = r1.address()
            java.util.List r11 = r1.connectionSpecs()
            okhttp3.internal.connection.ConnectionSpecSelector r1 = new okhttp3.internal.connection.ConnectionSpecSelector
            r1.<init>(r11)
            r12 = r1
            okhttp3.Route r1 = r7.route
            okhttp3.Address r1 = r1.address()
            javax.net.ssl.SSLSocketFactory r1 = r1.sslSocketFactory()
            if (r1 != 0) goto L90
            okhttp3.ConnectionSpec r1 = okhttp3.ConnectionSpec.CLEARTEXT
            boolean r1 = r11.contains(r1)
            if (r1 == 0) goto L80
            okhttp3.Route r1 = r7.route
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.String r1 = r1.host()
            okhttp3.internal.platform.Platform$Companion r2 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r2 = r2.get()
            boolean r2 = r2.isCleartextTrafficPermitted(r1)
            if (r2 == 0) goto L5a
            goto La2
        L5a:
            okhttp3.internal.connection.RouteException r2 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r3 = new java.net.UnknownServiceException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "CLEARTEXT communication to "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r5 = " not permitted by network security policy"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            java.io.IOException r3 = (java.io.IOException) r3
            r2.<init>(r3)
            throw r2
        L80:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.String r3 = "CLEARTEXT communication not enabled for client"
            r2.<init>(r3)
            java.io.IOException r2 = (java.io.IOException) r2
            r1.<init>(r2)
            throw r1
        L90:
            okhttp3.Route r1 = r7.route
            okhttp3.Address r1 = r1.address()
            java.util.List r1 = r1.protocols()
            okhttp3.Protocol r2 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L164
        La2:
            r13 = r0
        La3:
            okhttp3.Route r0 = r7.route     // Catch: java.io.IOException -> L112
            boolean r0 = r0.requiresTunnel()     // Catch: java.io.IOException -> L112
            if (r0 == 0) goto Lcc
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.connectTunnel(r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L112
            java.net.Socket r0 = r7.rawSocket     // Catch: java.io.IOException -> L112
            if (r0 != 0) goto Lc7
            r14 = r17
            r15 = r18
            r6 = r20
            goto Lea
        Lc7:
            r14 = r17
            r15 = r18
            goto Ld3
        Lcc:
            r14 = r17
            r15 = r18
            r7.connectSocket(r14, r15, r8, r9)     // Catch: java.io.IOException -> L110
        Ld3:
            r6 = r20
            r7.establishProtocol(r12, r6, r8, r9)     // Catch: java.io.IOException -> L10e
            okhttp3.Route r0 = r7.route     // Catch: java.io.IOException -> L10e
            java.net.InetSocketAddress r0 = r0.socketAddress()     // Catch: java.io.IOException -> L10e
            okhttp3.Route r1 = r7.route     // Catch: java.io.IOException -> L10e
            java.net.Proxy r1 = r1.proxy()     // Catch: java.io.IOException -> L10e
            okhttp3.Protocol r2 = r7.protocol     // Catch: java.io.IOException -> L10e
            r9.connectEnd(r8, r0, r1, r2)     // Catch: java.io.IOException -> L10e
        Lea:
            okhttp3.Route r0 = r7.route
            boolean r0 = r0.requiresTunnel()
            if (r0 == 0) goto L107
            java.net.Socket r0 = r7.rawSocket
            if (r0 == 0) goto Lf7
            goto L107
        Lf7:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            java.io.IOException r1 = (java.io.IOException) r1
            r0.<init>(r1)
            throw r0
        L107:
            long r0 = java.lang.System.nanoTime()
            r7.idleAtNs = r0
            return
        L10e:
            r0 = move-exception
            goto L119
        L110:
            r0 = move-exception
            goto L117
        L112:
            r0 = move-exception
            r14 = r17
            r15 = r18
        L117:
            r6 = r20
        L119:
            java.net.Socket r1 = r7.socket
            if (r1 == 0) goto L120
            okhttp3.internal.Util.closeQuietly(r1)
        L120:
            java.net.Socket r1 = r7.rawSocket
            if (r1 == 0) goto L127
            okhttp3.internal.Util.closeQuietly(r1)
        L127:
            r1 = 0
            r7.socket = r1
            r7.rawSocket = r1
            r7.source = r1
            r7.sink = r1
            r7.handshake = r1
            r7.protocol = r1
            r7.http2Connection = r1
            r7.allocationLimit = r10
            okhttp3.Route r1 = r7.route
            java.net.InetSocketAddress r3 = r1.socketAddress()
            okhttp3.Route r1 = r7.route
            java.net.Proxy r4 = r1.proxy()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.connectFailed(r2, r3, r4, r5, r6)
            if (r13 != 0) goto L156
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            r1.<init>(r0)
            r13 = r1
            goto L159
        L156:
            r13.addConnectException(r0)
        L159:
            if (r21 == 0) goto L163
            boolean r1 = r12.connectionFailed(r0)
            if (r1 == 0) goto L163
            goto La3
        L163:
            throw r13
        L164:
            r14 = r17
            r15 = r18
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.String r3 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r2.<init>(r3)
            java.io.IOException r2 = (java.io.IOException) r2
            r1.<init>(r2)
            throw r1
        L178:
            r14 = r17
            r15 = r18
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void connectFailed$okhttp(okhttp3.OkHttpClient r5, okhttp3.Route r6, java.io.IOException r7) {
            r4 = this;
            java.lang.String r0 = "client"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "failedRoute"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "failure"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.net.Proxy r0 = r6.proxy()
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT
            if (r0 == r1) goto L36
            okhttp3.Address r0 = r6.address()
            java.net.ProxySelector r1 = r0.proxySelector()
            okhttp3.HttpUrl r2 = r0.url()
            java.net.URI r2 = r2.uri()
            java.net.Proxy r3 = r6.proxy()
            java.net.SocketAddress r3 = r3.address()
            r1.connectFailed(r2, r3, r7)
        L36:
            okhttp3.internal.connection.RouteDatabase r0 = r5.getRouteDatabase()
            r0.failed(r6)
            return
    }

    public final java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.RealCall>> getCalls() {
            r1 = this;
            java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.RealCall>> r0 = r1.calls
            return r0
    }

    public final okhttp3.internal.connection.RealConnectionPool getConnectionPool() {
            r1 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r1.connectionPool
            return r0
    }

    public final long getIdleAtNs$okhttp() {
            r2 = this;
            long r0 = r2.idleAtNs
            return r0
    }

    public final boolean getNoNewExchanges() {
            r1 = this;
            boolean r0 = r1.noNewExchanges
            return r0
    }

    public final int getRouteFailureCount$okhttp() {
            r1 = this;
            int r0 = r1.routeFailureCount
            return r0
    }

    @Override // okhttp3.Connection
    public okhttp3.Handshake handshake() {
            r1 = this;
            okhttp3.Handshake r0 = r1.handshake
            return r0
    }

    public final synchronized void incrementSuccessCount$okhttp() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.successCount     // Catch: java.lang.Throwable -> L9
            int r0 = r0 + 1
            r1.successCount = r0     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public final boolean isEligible$okhttp(okhttp3.Address r6, java.util.List<okhttp3.Route> r7) {
            r5 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
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
            java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.RealCall>> r0 = r5.calls
            int r0 = r0.size()
            int r1 = r5.allocationLimit
            r2 = 0
            if (r0 >= r1) goto Lbf
            boolean r0 = r5.noNewExchanges
            if (r0 == 0) goto L4e
            goto Lbf
        L4e:
            okhttp3.Route r0 = r5.route
            okhttp3.Address r0 = r0.address()
            boolean r0 = r0.equalsNonHost$okhttp(r6)
            if (r0 != 0) goto L5b
            return r2
        L5b:
            okhttp3.HttpUrl r0 = r6.url()
            java.lang.String r0 = r0.host()
            okhttp3.Route r1 = r5.route()
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.String r1 = r1.host()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r1 = 1
            if (r0 == 0) goto L7b
            return r1
        L7b:
            okhttp3.internal.http2.Http2Connection r0 = r5.http2Connection
            if (r0 != 0) goto L80
            return r2
        L80:
            if (r7 == 0) goto Lbe
            boolean r0 = r5.routeMatchesAny(r7)
            if (r0 != 0) goto L89
            goto Lbe
        L89:
            javax.net.ssl.HostnameVerifier r0 = r6.hostnameVerifier()
            okhttp3.internal.tls.OkHostnameVerifier r3 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE
            if (r0 == r3) goto L92
            return r2
        L92:
            okhttp3.HttpUrl r0 = r6.url()
            boolean r0 = r5.supportsUrl(r0)
            if (r0 != 0) goto L9d
            return r2
        L9d:
            okhttp3.CertificatePinner r0 = r6.certificatePinner()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lbc
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lbc
            okhttp3.HttpUrl r3 = r6.url()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lbc
            java.lang.String r3 = r3.host()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lbc
            okhttp3.Handshake r4 = r5.handshake()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lbc
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lbc
            java.util.List r4 = r4.peerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lbc
            r0.check(r3, r4)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lbc
            return r1
        Lbc:
            r0 = move-exception
            return r2
        Lbe:
            return r2
        Lbf:
            return r2
    }

    public final boolean isHealthy(boolean r11) {
            r10 = this;
            r0 = r10
            r1 = 0
            boolean r2 = okhttp3.internal.Util.assertionsEnabled
            if (r2 == 0) goto L38
            boolean r2 = java.lang.Thread.holdsLock(r0)
            if (r2 != 0) goto Ld
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
            java.lang.String r4 = " MUST NOT hold lock on "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L38:
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r10.rawSocket
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.net.Socket r3 = r10.socket
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.BufferedSource r4 = r10.source
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            boolean r5 = r2.isClosed()
            if (r5 != 0) goto L8a
            boolean r5 = r3.isClosed()
            if (r5 != 0) goto L8a
            boolean r5 = r3.isInputShutdown()
            if (r5 != 0) goto L8a
            boolean r5 = r3.isOutputShutdown()
            if (r5 == 0) goto L65
            goto L8a
        L65:
            okhttp3.internal.http2.Http2Connection r5 = r10.http2Connection
            if (r5 == 0) goto L6e
            boolean r6 = r5.isHealthy(r0)
            return r6
        L6e:
            monitor-enter(r10)
            r6 = 0
            long r7 = r10.idleAtNs     // Catch: java.lang.Throwable -> L87
            long r6 = r0 - r7
            monitor-exit(r10)
            r8 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 < 0) goto L85
            if (r11 == 0) goto L85
            boolean r8 = okhttp3.internal.Util.isHealthy(r3, r4)
            return r8
        L85:
            r8 = 1
            return r8
        L87:
            r6 = move-exception
            monitor-exit(r10)
            throw r6
        L8a:
            r5 = 0
            return r5
    }

    public final boolean isMultiplexed$okhttp() {
            r1 = this;
            okhttp3.internal.http2.Http2Connection r0 = r1.http2Connection
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final okhttp3.internal.http.ExchangeCodec newCodec$okhttp(okhttp3.OkHttpClient r9, okhttp3.internal.http.RealInterceptorChain r10) throws java.net.SocketException {
            r8 = this;
            java.lang.String r0 = "client"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.net.Socket r0 = r8.socket
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okio.BufferedSource r1 = r8.source
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            okio.BufferedSink r2 = r8.sink
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            okhttp3.internal.http2.Http2Connection r3 = r8.http2Connection
            if (r3 == 0) goto L25
            okhttp3.internal.http2.Http2ExchangeCodec r4 = new okhttp3.internal.http2.Http2ExchangeCodec
            r4.<init>(r9, r8, r10, r3)
            okhttp3.internal.http.ExchangeCodec r4 = (okhttp3.internal.http.ExchangeCodec) r4
            goto L4f
        L25:
            int r4 = r10.readTimeoutMillis()
            r0.setSoTimeout(r4)
            okio.Timeout r4 = r1.timeout()
            int r5 = r10.getReadTimeoutMillis$okhttp()
            long r5 = (long) r5
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4.timeout(r5, r7)
            okio.Timeout r4 = r2.timeout()
            int r5 = r10.getWriteTimeoutMillis$okhttp()
            long r5 = (long) r5
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4.timeout(r5, r7)
            okhttp3.internal.http1.Http1ExchangeCodec r4 = new okhttp3.internal.http1.Http1ExchangeCodec
            r4.<init>(r9, r8, r1, r2)
            okhttp3.internal.http.ExchangeCodec r4 = (okhttp3.internal.http.ExchangeCodec) r4
        L4f:
            return r4
    }

    public final okhttp3.internal.ws.RealWebSocket.Streams newWebSocketStreams$okhttp(okhttp3.internal.connection.Exchange r5) throws java.net.SocketException {
            r4 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.net.Socket r0 = r4.socket
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okio.BufferedSource r1 = r4.source
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            okio.BufferedSink r2 = r4.sink
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r3 = 0
            r0.setSoTimeout(r3)
            r4.noNewExchanges$okhttp()
            okhttp3.internal.connection.RealConnection$newWebSocketStreams$1 r3 = new okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
            r3.<init>(r1, r2, r5)
            okhttp3.internal.ws.RealWebSocket$Streams r3 = (okhttp3.internal.ws.RealWebSocket.Streams) r3
            return r3
    }

    public final synchronized void noCoalescedConnections$okhttp() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.noCoalescedConnections = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    public final synchronized void noNewExchanges$okhttp() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.noNewExchanges = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public synchronized void onSettings(okhttp3.internal.http2.Http2Connection r2, okhttp3.internal.http2.Settings r3) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "settings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)     // Catch: java.lang.Throwable -> L13
            int r0 = r3.getMaxConcurrentStreams()     // Catch: java.lang.Throwable -> L13
            r1.allocationLimit = r0     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return
        L13:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(okhttp3.internal.http2.Http2Stream r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "stream"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM
            r1 = 0
            r3.close(r0, r1)
            return
    }

    @Override // okhttp3.Connection
    public okhttp3.Protocol protocol() {
            r1 = this;
            okhttp3.Protocol r0 = r1.protocol
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
    }

    @Override // okhttp3.Connection
    public okhttp3.Route route() {
            r1 = this;
            okhttp3.Route r0 = r1.route
            return r0
    }

    public final void setIdleAtNs$okhttp(long r1) {
            r0 = this;
            r0.idleAtNs = r1
            return
    }

    public final void setNoNewExchanges(boolean r1) {
            r0 = this;
            r0.noNewExchanges = r1
            return
    }

    public final void setRouteFailureCount$okhttp(int r1) {
            r0 = this;
            r0.routeFailureCount = r1
            return
    }

    @Override // okhttp3.Connection
    public java.net.Socket socket() {
            r1 = this;
            java.net.Socket r0 = r1.socket
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Connection{"
            java.lang.StringBuilder r0 = r0.append(r1)
            okhttp3.Route r1 = r2.route
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.String r1 = r1.host()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 58
            java.lang.StringBuilder r0 = r0.append(r1)
            okhttp3.Route r1 = r2.route
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            int r1 = r1.port()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", proxy="
            java.lang.StringBuilder r0 = r0.append(r1)
            okhttp3.Route r1 = r2.route
            java.net.Proxy r1 = r1.proxy()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " hostAddress="
            java.lang.StringBuilder r0 = r0.append(r1)
            okhttp3.Route r1 = r2.route
            java.net.InetSocketAddress r1 = r1.socketAddress()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " cipherSuite="
            java.lang.StringBuilder r0 = r0.append(r1)
            okhttp3.Handshake r1 = r2.handshake
            if (r1 == 0) goto L67
            okhttp3.CipherSuite r1 = r1.cipherSuite()
            if (r1 != 0) goto L69
        L67:
            java.lang.String r1 = "none"
        L69:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " protocol="
            java.lang.StringBuilder r0 = r0.append(r1)
            okhttp3.Protocol r1 = r2.protocol
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final synchronized void trackFailure$okhttp(okhttp3.internal.connection.RealCall r4, java.io.IOException r5) {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)     // Catch: java.lang.Throwable -> L5f
            boolean r0 = r5 instanceof okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L5f
            r1 = 1
            if (r0 == 0) goto L3d
        Lc:
            r0 = r5
            okhttp3.internal.http2.StreamResetException r0 = (okhttp3.internal.http2.StreamResetException) r0     // Catch: java.lang.Throwable -> L5f
            okhttp3.internal.http2.ErrorCode r0 = r0.errorCode     // Catch: java.lang.Throwable -> L5f
            okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> L5f
            if (r0 != r2) goto L26
            int r0 = r3.refusedStreamCount     // Catch: java.lang.Throwable -> L5f
            int r0 = r0 + r1
            r3.refusedStreamCount = r0     // Catch: java.lang.Throwable -> L5f
            int r0 = r3.refusedStreamCount     // Catch: java.lang.Throwable -> L5f
            if (r0 <= r1) goto L5d
            r3.noNewExchanges = r1     // Catch: java.lang.Throwable -> L5f
            int r0 = r3.routeFailureCount     // Catch: java.lang.Throwable -> L5f
            int r0 = r0 + r1
            r3.routeFailureCount = r0     // Catch: java.lang.Throwable -> L5f
            goto L5d
        L26:
            r0 = r5
            okhttp3.internal.http2.StreamResetException r0 = (okhttp3.internal.http2.StreamResetException) r0     // Catch: java.lang.Throwable -> L5f
            okhttp3.internal.http2.ErrorCode r0 = r0.errorCode     // Catch: java.lang.Throwable -> L5f
            okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch: java.lang.Throwable -> L5f
            if (r0 != r2) goto L35
            boolean r0 = r4.isCanceled()     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L5d
        L35:
            r3.noNewExchanges = r1     // Catch: java.lang.Throwable -> L5f
            int r0 = r3.routeFailureCount     // Catch: java.lang.Throwable -> L5f
            int r0 = r0 + r1
            r3.routeFailureCount = r0     // Catch: java.lang.Throwable -> L5f
            goto L5d
        L3d:
            boolean r0 = r3.isMultiplexed$okhttp()     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L47
            boolean r0 = r5 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L5d
        L47:
            r3.noNewExchanges = r1     // Catch: java.lang.Throwable -> L5f
            int r0 = r3.successCount     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L5d
            if (r5 == 0) goto L58
            okhttp3.OkHttpClient r0 = r4.getClient()     // Catch: java.lang.Throwable -> L5f
            okhttp3.Route r2 = r3.route     // Catch: java.lang.Throwable -> L5f
            r3.connectFailed$okhttp(r0, r2, r5)     // Catch: java.lang.Throwable -> L5f
        L58:
            int r0 = r3.routeFailureCount     // Catch: java.lang.Throwable -> L5f
            int r0 = r0 + r1
            r3.routeFailureCount = r0     // Catch: java.lang.Throwable -> L5f
        L5d:
            monitor-exit(r3)
            return
        L5f:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5f
            throw r4
    }
}
