package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Route;
import okhttp3.internal.C5757c;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.FlowControlListener;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p172l8.C4700i0;
import p376zd.C10026x0;
import p376zd.C9995i;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\u0018\u0000 \u008e\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u008e\u0001B[\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001aH\u0016¢\u0006\u0004\b(\u0010\u001cJ\u000f\u0010*\u001a\u00020\u001aH\u0000¢\u0006\u0004\b)\u0010\u001cJ\u000f\u0010,\u001a\u00020\u001aH\u0000¢\u0006\u0004\b+\u0010\u001cJ\r\u0010-\u001a\u00020\u001a¢\u0006\u0004\b-\u0010\u001cJ'\u00103\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020.2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001dH\u0000¢\u0006\u0004\b1\u00102J\u001f\u0010;\u001a\u0002082\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010=\u001a\u00020\u001aH\u0000¢\u0006\u0004\b<\u0010\u001cJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010>J\u000f\u0010?\u001a\u00020\u001aH\u0016¢\u0006\u0004\b?\u0010\u001cJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010@J\u0015\u0010B\u001a\u00020\u001f2\u0006\u0010A\u001a\u00020\u001f¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\u001a2\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u001f\u0010L\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010NJ'\u0010T\u001a\u00020\u001a2\u0006\u00105\u001a\u0002042\u0006\u0010O\u001a\u00020\t2\u0006\u0010Q\u001a\u00020PH\u0000¢\u0006\u0004\bR\u0010SJ!\u0010X\u001a\u00020\u001a2\u0006\u0010V\u001a\u00020U2\b\u0010W\u001a\u0004\u0018\u00010PH\u0016¢\u0006\u0004\bX\u0010YJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010ZJ\u000f\u0010\\\u001a\u00020[H\u0016¢\u0006\u0004\b\\\u0010]R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010^\u001a\u0004\b_\u0010`R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010a\u001a\u0004\bb\u0010cR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010d\u001a\u0004\be\u0010>R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010fR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010gR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010hR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010iR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010jR\u001a\u0010\u0017\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010k\u001a\u0004\bl\u0010mR\u0018\u0010n\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\"\u0010(\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u0016\u0010*\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010pR\"\u0010u\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bu\u0010j\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u0016\u0010z\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010jR\u0016\u0010{\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010jR$\u0010}\u001a\u00020\u00142\u0006\u0010|\u001a\u00020\u00148\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b}\u0010j\u001a\u0004\b~\u0010wR)\u0010\u0081\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020U0\u0080\u00010\u007f8\u0006¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R*\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0016\u0010\u008d\u0001\u001a\u00020\u001f8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010r¨\u0006\u008f\u0001"}, m16758d2 = {"Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/Connection;", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "Lokhttp3/internal/concurrent/Lockable;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/Route;", "route", "Ljava/net/Socket;", "rawSocket", "javaNetSocket", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/internal/connection/BufferedSocket;", "socket", _UrlKt.FRAGMENT_ENCODE_SET, "pingIntervalMillis", "Lokhttp3/internal/connection/ConnectionListener;", "connectionListener", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Route;Ljava/net/Socket;Ljava/net/Socket;Lokhttp3/Handshake;Lokhttp3/Protocol;Lokhttp3/internal/connection/BufferedSocket;ILokhttp3/internal/connection/ConnectionListener;)V", "Ll8/i0;", "startHttp2", "()V", _UrlKt.FRAGMENT_ENCODE_SET, "candidates", _UrlKt.FRAGMENT_ENCODE_SET, "routeMatchesAny", "(Ljava/util/List;)Z", "Lokhttp3/HttpUrl;", "url", "supportsUrl", "(Lokhttp3/HttpUrl;)Z", "certificateSupportHost", "(Lokhttp3/HttpUrl;Lokhttp3/Handshake;)Z", "noNewExchanges", "noCoalescedConnections$okhttp", "noCoalescedConnections", "incrementSuccessCount$okhttp", "incrementSuccessCount", "start", "Lokhttp3/Address;", "address", "routes", "isEligible$okhttp", "(Lokhttp3/Address;Ljava/util/List;)Z", "isEligible", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http/ExchangeCodec;", "newCodec$okhttp", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/http/ExchangeCodec;", "newCodec", "useAsSocket$okhttp", "useAsSocket", "()Lokhttp3/Route;", "cancel", "()Ljava/net/Socket;", "doExtensiveChecks", "isHealthy", "(Z)Z", "Lokhttp3/internal/http2/Http2Stream;", "stream", "onStream", "(Lokhttp3/internal/http2/Http2Stream;)V", "Lokhttp3/internal/http2/Http2Connection;", "connection", "Lokhttp3/internal/http2/Settings;", "settings", "onSettings", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Settings;)V", "()Lokhttp3/Handshake;", "failedRoute", "Ljava/io/IOException;", "failure", "connectFailed$okhttp", "(Lokhttp3/OkHttpClient;Lokhttp3/Route;Ljava/io/IOException;)V", "connectFailed", "Lokhttp3/internal/connection/RealCall;", "call", "e", "trackFailure", "(Lokhttp3/internal/connection/RealCall;Ljava/io/IOException;)V", "()Lokhttp3/Protocol;", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner", "()Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/connection/RealConnectionPool;", "getConnectionPool", "()Lokhttp3/internal/connection/RealConnectionPool;", "Lokhttp3/Route;", "getRoute", "Ljava/net/Socket;", "Lokhttp3/Handshake;", "Lokhttp3/Protocol;", "Lokhttp3/internal/connection/BufferedSocket;", "I", "Lokhttp3/internal/connection/ConnectionListener;", "getConnectionListener$okhttp", "()Lokhttp3/internal/connection/ConnectionListener;", "http2Connection", "Lokhttp3/internal/http2/Http2Connection;", "Z", "getNoNewExchanges", "()Z", "setNoNewExchanges", "(Z)V", "routeFailureCount", "getRouteFailureCount$okhttp", "()I", "setRouteFailureCount$okhttp", "(I)V", "successCount", "refusedStreamCount", "value", "allocationLimit", "getAllocationLimit$okhttp", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/lang/ref/Reference;", "calls", "Ljava/util/List;", "getCalls", "()Ljava/util/List;", _UrlKt.FRAGMENT_ENCODE_SET, "idleAtNs", "J", "getIdleAtNs", "()J", "setIdleAtNs", "(J)V", "isMultiplexed$okhttp", "isMultiplexed", "Companion", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class RealConnection extends Http2Connection.Listener implements Connection, ExchangeCodec.Carrier, Lockable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private int allocationLimit;
    private final List<Reference<RealCall>> calls;
    private final ConnectionListener connectionListener;
    private final RealConnectionPool connectionPool;
    private final Handshake handshake;
    private Http2Connection http2Connection;
    private long idleAtNs;
    private final Socket javaNetSocket;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private final int pingIntervalMillis;
    private final Protocol protocol;
    private final Socket rawSocket;
    private int refusedStreamCount;
    private final Route route;
    private int routeFailureCount;
    private final BufferedSocket socket;
    private int successCount;
    private final TaskRunner taskRunner;

    public RealConnection(TaskRunner taskRunner, RealConnectionPool realConnectionPool, Route route, Socket socket, Socket socket2, Handshake handshake, Protocol protocol, BufferedSocket bufferedSocket, int i10, ConnectionListener connectionListener) {
        taskRunner.getClass();
        realConnectionPool.getClass();
        route.getClass();
        socket.getClass();
        socket2.getClass();
        protocol.getClass();
        bufferedSocket.getClass();
        connectionListener.getClass();
        this.taskRunner = taskRunner;
        this.connectionPool = realConnectionPool;
        this.route = route;
        this.rawSocket = socket;
        this.javaNetSocket = socket2;
        this.handshake = handshake;
        this.protocol = protocol;
        this.socket = bufferedSocket;
        this.pingIntervalMillis = i10;
        this.connectionListener = connectionListener;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    private final boolean certificateSupportHost(HttpUrl url, Handshake handshake) {
        List<Certificate> listPeerCertificates = handshake.peerCertificates();
        if (!listPeerCertificates.isEmpty()) {
            OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.INSTANCE;
            String strHost = url.host();
            Certificate certificate = listPeerCertificates.get(0);
            certificate.getClass();
            if (okHostnameVerifier.verify(strHost, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    private final boolean routeMatchesAny(List<Route> candidates) {
        if (candidates != null && candidates.isEmpty()) {
            return false;
        }
        for (Route route : candidates) {
            Proxy.Type type = route.proxy().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && getRoute().proxy().type() == type2 && AbstractC1061t.m3842c(getRoute().socketAddress(), route.socketAddress())) {
                return true;
            }
        }
        return false;
    }

    private final void startHttp2() throws SocketException {
        this.javaNetSocket.setSoTimeout(0);
        Object obj = this.connectionListener;
        FlowControlListener flowControlListener = obj instanceof FlowControlListener ? (FlowControlListener) obj : null;
        if (flowControlListener == null) {
            flowControlListener = FlowControlListener.None.INSTANCE;
        }
        Http2Connection http2ConnectionBuild = new Http2Connection.Builder(true, this.taskRunner).socket(this.socket, getRoute().address().url().host()).listener(this).pingIntervalMillis(this.pingIntervalMillis).flowControlListener(flowControlListener).build();
        this.http2Connection = http2ConnectionBuild;
        this.allocationLimit = Http2Connection.INSTANCE.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        Http2Connection.start$default(http2ConnectionBuild, false, 1, null);
    }

    private final boolean supportsUrl(HttpUrl url) {
        Handshake handshake;
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            C5757c.m23260a(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return false;
        }
        HttpUrl httpUrlUrl = getRoute().address().url();
        if (url.port() != httpUrlUrl.port()) {
            return false;
        }
        if (AbstractC1061t.m3842c(url.host(), httpUrlUrl.host())) {
            return true;
        }
        return (this.noCoalescedConnections || (handshake = this.handshake) == null || !certificateSupportHost(url, handshake)) ? false : true;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    /* JADX INFO: renamed from: cancel */
    public void mo39015cancel() {
        _UtilJvmKt.closeQuietly(this.rawSocket);
    }

    public final void connectFailed$okhttp(OkHttpClient client, Route failedRoute, IOException failure) {
        client.getClass();
        failedRoute.getClass();
        failure.getClass();
        if (failedRoute.proxy().type() != Proxy.Type.DIRECT) {
            Address address = failedRoute.address();
            address.proxySelector().connectFailed(address.url().uri(), failedRoute.proxy().address(), failure);
        }
        client.getRouteDatabase().failed(failedRoute);
    }

    /* JADX INFO: renamed from: getAllocationLimit$okhttp, reason: from getter */
    public final int getAllocationLimit() {
        return this.allocationLimit;
    }

    public final List<Reference<RealCall>> getCalls() {
        return this.calls;
    }

    /* JADX INFO: renamed from: getConnectionListener$okhttp, reason: from getter */
    public final ConnectionListener getConnectionListener() {
        return this.connectionListener;
    }

    public final RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    public final long getIdleAtNs() {
        return this.idleAtNs;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public Route getRoute() {
        return this.route;
    }

    /* JADX INFO: renamed from: getRouteFailureCount$okhttp, reason: from getter */
    public final int getRouteFailureCount() {
        return this.routeFailureCount;
    }

    public final TaskRunner getTaskRunner() {
        return this.taskRunner;
    }

    @Override // okhttp3.Connection
    /* JADX INFO: renamed from: handshake, reason: from getter */
    public Handshake getHandshake() {
        return this.handshake;
    }

    public final void incrementSuccessCount$okhttp() {
        synchronized (this) {
            this.successCount++;
        }
    }

    public final boolean isEligible$okhttp(Address address, List<Route> routes) {
        address.getClass();
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            C5757c.m23260a(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return false;
        }
        if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !getRoute().address().equalsNonHost$okhttp(address)) {
            return false;
        }
        if (AbstractC1061t.m3842c(address.url().host(), route().address().url().host())) {
            return true;
        }
        if (this.http2Connection == null || routes == null || !routeMatchesAny(routes) || address.hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
            return false;
        }
        try {
            CertificatePinner certificatePinner = address.certificatePinner();
            certificatePinner.getClass();
            String strHost = address.url().host();
            Handshake handshake = getHandshake();
            handshake.getClass();
            certificatePinner.check(strHost, handshake.peerCertificates());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean isHealthy(boolean doExtensiveChecks) {
        long j10;
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            C5757c.m23260a(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return false;
        }
        long jNanoTime = System.nanoTime();
        if (this.rawSocket.isClosed() || this.javaNetSocket.isClosed() || this.javaNetSocket.isInputShutdown() || this.javaNetSocket.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return http2Connection.isHealthy(jNanoTime);
        }
        synchronized (this) {
            j10 = jNanoTime - this.idleAtNs;
        }
        if (j10 < IDLE_CONNECTION_HEALTHY_NS || !doExtensiveChecks) {
            return true;
        }
        return _UtilJvmKt.isHealthy(this.javaNetSocket, this.socket.getSource());
    }

    public final boolean isMultiplexed$okhttp() {
        return this.http2Connection != null;
    }

    public final ExchangeCodec newCodec$okhttp(OkHttpClient client, RealInterceptorChain chain) {
        client.getClass();
        chain.getClass();
        BufferedSocket bufferedSocket = this.socket;
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(client, this, chain, http2Connection);
        }
        this.javaNetSocket.setSoTimeout(chain.readTimeoutMillis());
        C10026x0 c10026x0Timeout = bufferedSocket.getSource().timeout();
        long readTimeoutMillis$okhttp = chain.getReadTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c10026x0Timeout.timeout(readTimeoutMillis$okhttp, timeUnit);
        bufferedSocket.getSink().timeout().timeout(chain.getWriteTimeoutMillis(), timeUnit);
        return new Http1ExchangeCodec(client, this, bufferedSocket);
    }

    public final void noCoalescedConnections$okhttp() {
        synchronized (this) {
            this.noCoalescedConnections = true;
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public void noNewExchanges() {
        synchronized (this) {
            this.noNewExchanges = true;
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
        this.connectionListener.noNewExchanges(this);
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onSettings(Http2Connection connection, Settings settings) {
        connection.getClass();
        settings.getClass();
        synchronized (this) {
            this.allocationLimit = settings.getMaxConcurrentStreams();
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(Http2Stream stream) {
        stream.getClass();
        stream.close(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // okhttp3.Connection
    /* JADX INFO: renamed from: protocol, reason: from getter */
    public Protocol getProtocol() {
        return this.protocol;
    }

    @Override // okhttp3.Connection
    public Route route() {
        return getRoute();
    }

    public final void setIdleAtNs(long j10) {
        this.idleAtNs = j10;
    }

    public final void setNoNewExchanges(boolean z10) {
        this.noNewExchanges = z10;
    }

    public final void setRouteFailureCount$okhttp(int i10) {
        this.routeFailureCount = i10;
    }

    @Override // okhttp3.Connection
    /* JADX INFO: renamed from: socket, reason: from getter */
    public Socket getJavaNetSocket() {
        return this.javaNetSocket;
    }

    public final void start() throws SocketException {
        this.idleAtNs = System.nanoTime();
        Protocol protocol = this.protocol;
        if (protocol == Protocol.HTTP_2 || protocol == Protocol.H2_PRIOR_KNOWLEDGE) {
            startHttp2();
        }
    }

    public String toString() {
        Object objCipherSuite;
        StringBuilder sb2 = new StringBuilder("Connection{");
        sb2.append(getRoute().address().url().host());
        sb2.append(':');
        sb2.append(getRoute().address().url().port());
        sb2.append(", proxy=");
        sb2.append(getRoute().proxy());
        sb2.append(" hostAddress=");
        sb2.append(getRoute().socketAddress());
        sb2.append(" cipherSuite=");
        Handshake handshake = this.handshake;
        if (handshake == null || (objCipherSuite = handshake.cipherSuite()) == null) {
            objCipherSuite = "none";
        }
        sb2.append(objCipherSuite);
        sb2.append(" protocol=");
        sb2.append(this.protocol);
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void trackFailure(okhttp3.internal.connection.RealCall r4, java.io.IOException r5) {
        /*
            r3 = this;
            r4.getClass()
            monitor-enter(r3)
            boolean r0 = r5 instanceof okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L24
            r1 = 1
            if (r0 == 0) goto L3f
            r0 = r5
            okhttp3.internal.http2.StreamResetException r0 = (okhttp3.internal.http2.StreamResetException) r0     // Catch: java.lang.Throwable -> L24
            okhttp3.internal.http2.ErrorCode r0 = r0.errorCode     // Catch: java.lang.Throwable -> L24
            okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> L24
            if (r0 != r2) goto L26
            int r4 = r3.refusedStreamCount     // Catch: java.lang.Throwable -> L24
            int r4 = r4 + r1
            r3.refusedStreamCount = r4     // Catch: java.lang.Throwable -> L24
            if (r4 <= r1) goto L4a
            boolean r4 = r3.noNewExchanges     // Catch: java.lang.Throwable -> L24
            r4 = r4 ^ r1
            r3.noNewExchanges = r1     // Catch: java.lang.Throwable -> L24
            int r5 = r3.routeFailureCount     // Catch: java.lang.Throwable -> L24
            int r5 = r5 + r1
            r3.routeFailureCount = r5     // Catch: java.lang.Throwable -> L24
            goto L68
        L24:
            r4 = move-exception
            goto L73
        L26:
            okhttp3.internal.http2.StreamResetException r5 = (okhttp3.internal.http2.StreamResetException) r5     // Catch: java.lang.Throwable -> L24
            okhttp3.internal.http2.ErrorCode r5 = r5.errorCode     // Catch: java.lang.Throwable -> L24
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch: java.lang.Throwable -> L24
            if (r5 != r0) goto L34
            boolean r4 = r4.getCanceled()     // Catch: java.lang.Throwable -> L24
            if (r4 != 0) goto L4a
        L34:
            boolean r4 = r3.noNewExchanges     // Catch: java.lang.Throwable -> L24
            r4 = r4 ^ r1
            r3.noNewExchanges = r1     // Catch: java.lang.Throwable -> L24
            int r5 = r3.routeFailureCount     // Catch: java.lang.Throwable -> L24
            int r5 = r5 + r1
            r3.routeFailureCount = r5     // Catch: java.lang.Throwable -> L24
            goto L68
        L3f:
            boolean r0 = r3.isMultiplexed$okhttp()     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L4c
            boolean r0 = r5 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L4a
            goto L4c
        L4a:
            r4 = 0
            goto L68
        L4c:
            boolean r0 = r3.noNewExchanges     // Catch: java.lang.Throwable -> L24
            r0 = r0 ^ r1
            r3.noNewExchanges = r1     // Catch: java.lang.Throwable -> L24
            int r2 = r3.successCount     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L67
            if (r5 == 0) goto L62
            okhttp3.OkHttpClient r4 = r4.getClient()     // Catch: java.lang.Throwable -> L24
            okhttp3.Route r2 = r3.getRoute()     // Catch: java.lang.Throwable -> L24
            r3.connectFailed$okhttp(r4, r2, r5)     // Catch: java.lang.Throwable -> L24
        L62:
            int r4 = r3.routeFailureCount     // Catch: java.lang.Throwable -> L24
            int r4 = r4 + r1
            r3.routeFailureCount = r4     // Catch: java.lang.Throwable -> L24
        L67:
            r4 = r0
        L68:
            l8.i0 r5 = p172l8.C4700i0.f13910a     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)
            if (r4 == 0) goto L72
            okhttp3.internal.connection.ConnectionListener r4 = r3.connectionListener
            r4.noNewExchanges(r3)
        L72:
            return
        L73:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.trackFailure(okhttp3.internal.connection.RealCall, java.io.IOException):void");
    }

    public final void useAsSocket$okhttp() throws SocketException {
        this.javaNetSocket.setSoTimeout(0);
        noNewExchanges();
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m16758d2 = {"Lokhttp3/internal/connection/RealConnection$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "IDLE_CONNECTION_HEALTHY_NS", _UrlKt.FRAGMENT_ENCODE_SET, "newTestConnection", "Lokhttp3/internal/connection/RealConnection;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "route", "Lokhttp3/Route;", "socket", "Ljava/net/Socket;", "idleAtNs", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        public final RealConnection newTestConnection(TaskRunner taskRunner, RealConnectionPool connectionPool, Route route, Socket socket, long idleAtNs) {
            taskRunner.getClass();
            connectionPool.getClass();
            route.getClass();
            socket.getClass();
            RealConnection realConnection = new RealConnection(taskRunner, connectionPool, route, new Socket(), socket, null, Protocol.HTTP_2, new BufferedSocket() { // from class: okhttp3.internal.connection.RealConnection$Companion$newTestConnection$bufferedSocket$1
                private final C9995i sink = new C9995i();
                private final C9995i source = new C9995i();

                @Override // okhttp3.internal.connection.BufferedSocket, p376zd.InterfaceC10022v0
                public C9995i getSink() {
                    return this.sink;
                }

                @Override // okhttp3.internal.connection.BufferedSocket, p376zd.InterfaceC10022v0
                public C9995i getSource() {
                    return this.source;
                }

                @Override // okhttp3.internal.connection.BufferedSocket, p376zd.InterfaceC10022v0
                public void cancel() {
                }
            }, 0, ConnectionListener.INSTANCE.getNONE());
            realConnection.setIdleAtNs(idleAtNs);
            return realConnection;
        }

        private Companion() {
        }
    }
}
