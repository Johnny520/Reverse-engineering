package okhttp3.internal.connection;

import gg.AbstractC1411g;
import gg.AbstractC1416l;
import gg.AbstractC1417m;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.p221ws.RealWebSocket;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Timeout;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p136j8.C2104o;
import p218og.AbstractC3150n;
import tf.AbstractC4167n;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {
    public static final Companion Companion = new Companion(null);
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private int allocationLimit;
    private final List<Reference<RealCall>> calls;
    private final RealConnectionPool connectionPool;
    private Handshake handshake;
    private Http2Connection http2Connection;
    private long idleAtNs;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private Protocol protocol;
    private Socket rawSocket;
    private int refusedStreamCount;
    private final Route route;
    private int routeFailureCount;
    private BufferedSink sink;
    private Socket socket;
    private BufferedSource source;
    private int successCount;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.connection.RealConnection$connectTls$1 */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class C31751 extends AbstractC1417m implements InterfaceC1220a {
        final /* synthetic */ Address $address;
        final /* synthetic */ CertificatePinner $certificatePinner;
        final /* synthetic */ Handshake $unverifiedHandshake;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31751(CertificatePinner certificatePinner, Handshake handshake, Address address) {
            super(0);
            this.$certificatePinner = certificatePinner;
            this.$unverifiedHandshake = handshake;
            this.$address = address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // p085fg.InterfaceC1220a
        public final List<Certificate> invoke() {
            CertificateChainCleaner certificateChainCleaner$okhttp = this.$certificatePinner.getCertificateChainCleaner$okhttp();
            certificateChainCleaner$okhttp.getClass();
            return certificateChainCleaner$okhttp.clean(this.$unverifiedHandshake.peerCertificates(), this.$address.url().host());
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.connection.RealConnection$connectTls$2 */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class C31762 extends AbstractC1417m implements InterfaceC1220a {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C31762() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // p085fg.InterfaceC1220a
        public final List<X509Certificate> invoke() {
            Handshake handshake = RealConnection.this.handshake;
            handshake.getClass();
            List<Certificate> listPeerCertificates = handshake.peerCertificates();
            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listPeerCertificates));
            for (Certificate certificate : listPeerCertificates) {
                certificate.getClass();
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RealConnection(RealConnectionPool realConnectionPool, Route route) {
        realConnectionPool.getClass();
        route.getClass();
        this.connectionPool = realConnectionPool;
        this.route = route;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean certificateSupportHost(HttpUrl httpUrl, Handshake handshake) {
        List<Certificate> listPeerCertificates = handshake.peerCertificates();
        if (!listPeerCertificates.isEmpty()) {
            OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.INSTANCE;
            String strHost = httpUrl.host();
            Certificate certificate = listPeerCertificates.get(0);
            certificate.getClass();
            if (okHostnameVerifier.verify(strHost, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void connectSocket(int i9, int i10, Call call, EventListener eventListener) throws IOException {
        Socket socketCreateSocket;
        Proxy proxy = this.route.proxy();
        Address address = this.route.address();
        Proxy.Type type = proxy.type();
        int i11 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 1 || i11 == 2) {
            socketCreateSocket = address.socketFactory().createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.rawSocket = socketCreateSocket;
        eventListener.connectStart(call, this.route.socketAddress(), proxy);
        socketCreateSocket.setSoTimeout(i10);
        try {
            Platform.Companion.get().connectSocket(socketCreateSocket, this.route.socketAddress(), i9);
            try {
                this.source = Okio.buffer(Okio.source(socketCreateSocket));
                this.sink = Okio.buffer(Okio.sink(socketCreateSocket));
            } catch (NullPointerException e6) {
                if (AbstractC1416l.m3825a(e6.getMessage(), NPE_THROW_WITH_NULL)) {
                    throw new IOException(e6);
                }
            }
        } catch (ConnectException e7) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.route.socketAddress());
            connectException.initCause(e7);
            throw connectException;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void connectTls(ConnectionSpecSelector connectionSpecSelector) throws Throwable {
        SSLSocket sSLSocket;
        Address address = this.route.address();
        SSLSocketFactory sslSocketFactory = address.sslSocketFactory();
        SSLSocket sSLSocket2 = null;
        try {
            sslSocketFactory.getClass();
            Socket socketCreateSocket = sslSocketFactory.createSocket(this.rawSocket, address.url().host(), address.url().port(), true);
            socketCreateSocket.getClass();
            sSLSocket = (SSLSocket) socketCreateSocket;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ConnectionSpec connectionSpecConfigureSecureSocket = connectionSpecSelector.configureSecureSocket(sSLSocket);
            if (connectionSpecConfigureSecureSocket.supportsTlsExtensions()) {
                Platform.Companion.get().configureTlsExtensions(sSLSocket, address.url().host(), address.protocols());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            Handshake.Companion companion = Handshake.Companion;
            session.getClass();
            Handshake handshake = companion.get(session);
            HostnameVerifier hostnameVerifier = address.hostnameVerifier();
            hostnameVerifier.getClass();
            if (hostnameVerifier.verify(address.url().host(), session)) {
                CertificatePinner certificatePinner = address.certificatePinner();
                certificatePinner.getClass();
                this.handshake = new Handshake(handshake.tlsVersion(), handshake.cipherSuite(), handshake.localCertificates(), new C31751(certificatePinner, handshake, address));
                certificatePinner.check$okhttp(address.url().host(), new C31762());
                String selectedProtocol = connectionSpecConfigureSecureSocket.supportsTlsExtensions() ? Platform.Companion.get().getSelectedProtocol(sSLSocket) : null;
                this.socket = sSLSocket;
                this.source = Okio.buffer(Okio.source(sSLSocket));
                this.sink = Okio.buffer(Okio.sink(sSLSocket));
                this.protocol = selectedProtocol != null ? Protocol.Companion.get(selectedProtocol) : Protocol.HTTP_1_1;
                Platform.Companion.get().afterHandshake(sSLSocket);
                return;
            }
            List<Certificate> listPeerCertificates = handshake.peerCertificates();
            if (listPeerCertificates.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified (no certificates)");
            }
            Certificate certificate = listPeerCertificates.get(0);
            certificate.getClass();
            X509Certificate x509Certificate = (X509Certificate) certificate;
            throw new SSLPeerUnverifiedException(AbstractC3150n.m6729S("\n              |Hostname " + address.url().host() + " not verified:\n              |    certificate: " + CertificatePinner.Companion.pin(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate) + "\n              "));
        } catch (Throwable th3) {
            th = th3;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                Platform.Companion.get().afterHandshake(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                Util.closeQuietly((Socket) sSLSocket2);
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void connectTunnel(int i9, int i10, int i11, Call call, EventListener eventListener) throws IOException {
        Request requestCreateTunnelRequest = createTunnelRequest();
        HttpUrl httpUrlUrl = requestCreateTunnelRequest.url();
        for (int i12 = 0; i12 < 21; i12++) {
            connectSocket(i9, i10, call, eventListener);
            requestCreateTunnelRequest = createTunnel(i10, i11, requestCreateTunnelRequest, httpUrlUrl);
            if (requestCreateTunnelRequest == null) {
                return;
            }
            Socket socket = this.rawSocket;
            if (socket != null) {
                Util.closeQuietly(socket);
            }
            this.rawSocket = null;
            this.sink = null;
            this.source = null;
            eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Request createTunnel(int i9, int i10, Request request, HttpUrl httpUrl) throws IOException {
        String str = "CONNECT " + Util.toHostHeader(httpUrl, true) + " HTTP/1.1";
        while (true) {
            BufferedSource bufferedSource = this.source;
            bufferedSource.getClass();
            BufferedSink bufferedSink = this.sink;
            bufferedSink.getClass();
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, bufferedSource, bufferedSink);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bufferedSource.timeout().timeout(i9, timeUnit);
            bufferedSink.timeout().timeout(i10, timeUnit);
            http1ExchangeCodec.writeRequest(request.headers(), str);
            http1ExchangeCodec.finishRequest();
            Response.Builder responseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            responseHeaders.getClass();
            Response responseBuild = responseHeaders.request(request).build();
            http1ExchangeCodec.skipConnectBody(responseBuild);
            int iCode = responseBuild.code();
            if (iCode == 200) {
                if (bufferedSource.getBuffer().exhausted() && bufferedSink.getBuffer().exhausted()) {
                    return null;
                }
                C2104o.m5299y("TLS tunnel buffered too many bytes!");
                return null;
            }
            if (iCode != 407) {
                C2104o.m5295u(responseBuild.code(), "Unexpected response code for CONNECT: ");
                return null;
            }
            Request requestAuthenticate = this.route.address().proxyAuthenticator().authenticate(this.route, responseBuild);
            if (requestAuthenticate == null) {
                C2104o.m5299y("Failed to authenticate with proxy");
                return null;
            }
            if ("close".equalsIgnoreCase(Response.header$default(responseBuild, "Connection", null, 2, null))) {
                return requestAuthenticate;
            }
            request = requestAuthenticate;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Request createTunnelRequest() {
        Request requestBuild = new Request.Builder().url(this.route.address().url()).method("CONNECT", null).header("Host", Util.toHostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Util.userAgent).build();
        Request requestAuthenticate = this.route.address().proxyAuthenticator().authenticate(this.route, new Response.Builder().request(requestBuild).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        return requestAuthenticate == null ? requestBuild : requestAuthenticate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void establishProtocol(ConnectionSpecSelector connectionSpecSelector, int i9, Call call, EventListener eventListener) throws Throwable {
        if (this.route.address().sslSocketFactory() != null) {
            eventListener.secureConnectStart(call);
            connectTls(connectionSpecSelector);
            eventListener.secureConnectEnd(call, this.handshake);
            if (this.protocol == Protocol.HTTP_2) {
                startHttp2(i9);
                return;
            }
            return;
        }
        List<Protocol> listProtocols = this.route.address().protocols();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        boolean zContains = listProtocols.contains(protocol);
        Socket socket = this.rawSocket;
        if (!zContains) {
            this.socket = socket;
            this.protocol = Protocol.HTTP_1_1;
        } else {
            this.socket = socket;
            this.protocol = protocol;
            startHttp2(i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean routeMatchesAny(List<Route> list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        for (Route route : list) {
            Proxy.Type type = route.proxy().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.route.proxy().type() == type2 && AbstractC1416l.m3825a(this.route.socketAddress(), route.socketAddress())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Class process forced to load method for inline: okhttp3.internal.http2.Http2Connection.start$default(okhttp3.internal.http2.Http2Connection, boolean, okhttp3.internal.concurrent.TaskRunner, int, java.lang.Object):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void startHttp2(int i9) throws SocketException {
        Socket socket = this.socket;
        socket.getClass();
        BufferedSource bufferedSource = this.source;
        bufferedSource.getClass();
        BufferedSink bufferedSink = this.sink;
        bufferedSink.getClass();
        socket.setSoTimeout(0);
        Http2Connection http2ConnectionBuild = new Http2Connection.Builder(true, TaskRunner.INSTANCE).socket(socket, this.route.address().url().host(), bufferedSource, bufferedSink).listener(this).pingIntervalMillis(i9).build();
        this.http2Connection = http2ConnectionBuild;
        this.allocationLimit = Http2Connection.Companion.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        Http2Connection.start$default(http2ConnectionBuild, false, null, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean supportsUrl(HttpUrl httpUrl) {
        Handshake handshake;
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return false;
        }
        HttpUrl httpUrlUrl = this.route.address().url();
        if (httpUrl.port() != httpUrlUrl.port()) {
            return false;
        }
        if (AbstractC1416l.m3825a(httpUrl.host(), httpUrlUrl.host())) {
            return true;
        }
        if (!this.noCoalescedConnections && (handshake = this.handshake) != null) {
            handshake.getClass();
            if (certificateSupportHost(httpUrl, handshake)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void cancel() {
        Socket socket = this.rawSocket;
        if (socket != null) {
            Util.closeQuietly(socket);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:27:0x009a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x00e2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:67:0x0082 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [okhttp3.internal.connection.RealConnection] */
    /* JADX WARN: Type inference failed for: r1v11, types: [okhttp3.EventListener] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [okhttp3.EventListener] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void connect(int i9, int i10, int i11, int i12, boolean z9, Call call, EventListener eventListener) throws Throwable {
        ?? r12;
        Call call2;
        IOException iOException;
        Socket socket;
        Socket socket2;
        call.getClass();
        eventListener.getClass();
        if (this.protocol != null) {
            C2104o.m5276A("already connected");
            return;
        }
        List<ConnectionSpec> listConnectionSpecs = this.route.address().connectionSpecs();
        ConnectionSpecSelector connectionSpecSelector = new ConnectionSpecSelector(listConnectionSpecs);
        if (this.route.address().sslSocketFactory() != null) {
            List<Protocol> listProtocols = this.route.address().protocols();
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            boolean zContains = listProtocols.contains(protocol);
            r12 = protocol;
            if (zContains) {
                throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
        } else {
            if (!listConnectionSpecs.contains(ConnectionSpec.CLEARTEXT)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strHost = this.route.address().url().host();
            boolean zIsCleartextTrafficPermitted = Platform.Companion.get().isCleartextTrafficPermitted(strHost);
            r12 = zIsCleartextTrafficPermitted;
            if (!zIsCleartextTrafficPermitted) {
                throw new RouteException(new UnknownServiceException(AbstractC0921a.m2251n("CLEARTEXT communication to ", strHost, " not permitted by network security policy")));
            }
        }
        RouteException routeException = null;
        do {
            try {
                try {
                } catch (IOException e6) {
                    e = e6;
                }
            } catch (IOException e7) {
                e = e7;
                call2 = call;
                r12 = eventListener;
            }
            try {
                if (this.route.requiresTunnel()) {
                    try {
                        connectTunnel(i9, i10, i11, call, eventListener);
                        call2 = call;
                        r12 = eventListener;
                        if (this.rawSocket == null) {
                        }
                        if (!this.route.requiresTunnel() && this.rawSocket == null) {
                            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.idleAtNs = System.nanoTime();
                        return;
                    } catch (IOException e10) {
                        e = e10;
                        call2 = call;
                        r12 = eventListener;
                        iOException = e;
                        socket = this.socket;
                        if (socket != null) {
                        }
                        socket2 = this.rawSocket;
                        if (socket2 != null) {
                        }
                        this.socket = null;
                        this.rawSocket = null;
                        this.source = null;
                        this.sink = null;
                        this.handshake = null;
                        this.protocol = null;
                        this.http2Connection = null;
                        this.allocationLimit = 1;
                        r12.connectFailed(call2, this.route.socketAddress(), this.route.proxy(), null, iOException);
                        if (routeException != null) {
                        }
                        if (z9) {
                        }
                    }
                } else {
                    call2 = call;
                    EventListener eventListener2 = eventListener;
                    connectSocket(i9, i10, call2, eventListener2);
                    r12 = eventListener2;
                }
                establishProtocol(connectionSpecSelector, i12, call2, r12);
                r12.connectEnd(call2, this.route.socketAddress(), this.route.proxy(), this.protocol);
                if (!this.route.requiresTunnel()) {
                }
                this.idleAtNs = System.nanoTime();
                return;
            } catch (IOException e11) {
                e = e11;
                iOException = e;
                socket = this.socket;
                if (socket != null) {
                    Util.closeQuietly(socket);
                }
                socket2 = this.rawSocket;
                if (socket2 != null) {
                    Util.closeQuietly(socket2);
                }
                this.socket = null;
                this.rawSocket = null;
                this.source = null;
                this.sink = null;
                this.handshake = null;
                this.protocol = null;
                this.http2Connection = null;
                this.allocationLimit = 1;
                r12.connectFailed(call2, this.route.socketAddress(), this.route.proxy(), null, iOException);
                if (routeException != null) {
                    routeException = new RouteException(iOException);
                } else {
                    routeException.addConnectException(iOException);
                }
                if (z9) {
                    throw routeException;
                }
            }
        } while (connectionSpecSelector.connectionFailed(iOException));
        throw routeException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void connectFailed$okhttp(OkHttpClient okHttpClient, Route route, IOException iOException) {
        okHttpClient.getClass();
        route.getClass();
        iOException.getClass();
        if (route.proxy().type() != Proxy.Type.DIRECT) {
            Address address = route.address();
            address.proxySelector().connectFailed(address.url().uri(), route.proxy().address(), iOException);
        }
        okHttpClient.getRouteDatabase().failed(route);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<Reference<RealCall>> getCalls() {
        return this.calls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getIdleAtNs$okhttp() {
        return this.idleAtNs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getRouteFailureCount$okhttp() {
        return this.routeFailureCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.Connection
    public Handshake handshake() {
        return this.handshake;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void incrementSuccessCount$okhttp() {
        this.successCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isEligible$okhttp(Address address, List<Route> list) {
        address.getClass();
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return false;
        }
        if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.address().equalsNonHost$okhttp(address)) {
            return false;
        }
        if (AbstractC1416l.m3825a(address.url().host(), route().address().url().host())) {
            return true;
        }
        if (this.http2Connection == null || list == null || !routeMatchesAny(list) || address.hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
            return false;
        }
        try {
            CertificatePinner certificatePinner = address.certificatePinner();
            certificatePinner.getClass();
            String strHost = address.url().host();
            Handshake handshake = handshake();
            handshake.getClass();
            certificatePinner.check(strHost, handshake.peerCertificates());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isHealthy(boolean z9) {
        long j3;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return false;
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.rawSocket;
        socket.getClass();
        Socket socket2 = this.socket;
        socket2.getClass();
        BufferedSource bufferedSource = this.source;
        bufferedSource.getClass();
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return http2Connection.isHealthy(jNanoTime);
        }
        synchronized (this) {
            j3 = jNanoTime - this.idleAtNs;
        }
        if (j3 < IDLE_CONNECTION_HEALTHY_NS || !z9) {
            return true;
        }
        return Util.isHealthy(socket2, bufferedSource);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isMultiplexed$okhttp() {
        return this.http2Connection != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ExchangeCodec newCodec$okhttp(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) throws SocketException {
        okHttpClient.getClass();
        realInterceptorChain.getClass();
        Socket socket = this.socket;
        socket.getClass();
        BufferedSource bufferedSource = this.source;
        bufferedSource.getClass();
        BufferedSink bufferedSink = this.sink;
        bufferedSink.getClass();
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(okHttpClient, this, realInterceptorChain, http2Connection);
        }
        socket.setSoTimeout(realInterceptorChain.readTimeoutMillis());
        Timeout timeout = bufferedSource.timeout();
        long readTimeoutMillis$okhttp = realInterceptorChain.getReadTimeoutMillis$okhttp();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(readTimeoutMillis$okhttp, timeUnit);
        bufferedSink.timeout().timeout(realInterceptorChain.getWriteTimeoutMillis$okhttp(), timeUnit);
        return new Http1ExchangeCodec(okHttpClient, this, bufferedSource, bufferedSink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final RealWebSocket.Streams newWebSocketStreams$okhttp(final Exchange exchange) throws SocketException {
        exchange.getClass();
        Socket socket = this.socket;
        socket.getClass();
        final BufferedSource bufferedSource = this.source;
        bufferedSource.getClass();
        final BufferedSink bufferedSink = this.sink;
        bufferedSink.getClass();
        socket.setSoTimeout(0);
        noNewExchanges$okhttp();
        return new RealWebSocket.Streams(bufferedSource, bufferedSink) { // from class: okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                exchange.bodyComplete(-1L, true, true, null);
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void noCoalescedConnections$okhttp() {
        this.noCoalescedConnections = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void noNewExchanges$okhttp() {
        this.noNewExchanges = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public synchronized void onSettings(Http2Connection http2Connection, Settings settings) {
        http2Connection.getClass();
        settings.getClass();
        this.allocationLimit = settings.getMaxConcurrentStreams();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(Http2Stream http2Stream) {
        http2Stream.getClass();
        http2Stream.close(ErrorCode.REFUSED_STREAM, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.Connection
    public Protocol protocol() {
        Protocol protocol = this.protocol;
        protocol.getClass();
        return protocol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.Connection
    public Route route() {
        return this.route;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setIdleAtNs$okhttp(long j3) {
        this.idleAtNs = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setNoNewExchanges(boolean z9) {
        this.noNewExchanges = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setRouteFailureCount$okhttp(int i9) {
        this.routeFailureCount = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.Connection
    public Socket socket() {
        Socket socket = this.socket;
        socket.getClass();
        return socket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        Object objCipherSuite;
        StringBuilder sb2 = new StringBuilder("Connection{");
        sb2.append(this.route.address().url().host());
        sb2.append(':');
        sb2.append(this.route.address().url().port());
        sb2.append(", proxy=");
        sb2.append(this.route.proxy());
        sb2.append(" hostAddress=");
        sb2.append(this.route.socketAddress());
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void trackFailure$okhttp(RealCall realCall, IOException iOException) {
        try {
            realCall.getClass();
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i9 = this.refusedStreamCount + 1;
                    this.refusedStreamCount = i9;
                    if (i9 > 1) {
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    }
                } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !realCall.isCanceled()) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (!isMultiplexed$okhttp() || (iOException instanceof ConnectionShutdownException)) {
                this.noNewExchanges = true;
                if (this.successCount == 0) {
                    if (iOException != null) {
                        connectFailed$okhttp(realCall.getClient(), this.route, iOException);
                    }
                    this.routeFailureCount++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.connection.RealConnection.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final RealConnection newTestConnection(RealConnectionPool realConnectionPool, Route route, Socket socket, long j3) {
            realConnectionPool.getClass();
            route.getClass();
            socket.getClass();
            RealConnection realConnection = new RealConnection(realConnectionPool, route);
            realConnection.socket = socket;
            realConnection.setIdleAtNs$okhttp(j3);
            return realConnection;
        }

        private Companion() {
        }
    }
}
