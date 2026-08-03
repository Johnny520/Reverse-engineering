package okhttp3.internal.connection;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
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

        public final okhttp3.internal.connection.RealConnection newTestConnection(okhttp3.internal.connection.RealConnectionPool r2, okhttp3.Route r3, java.net.Socket r4, long r5) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r4.getClass()
                okhttp3.internal.connection.RealConnection r0 = new okhttp3.internal.connection.RealConnection
                r0.<init>(r2, r3)
                okhttp3.internal.connection.RealConnection.access$setSocket$p(r0, r4)
                r0.setIdleAtNs$okhttp(r5)
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                java.net.Proxy$Type[] r0 = java.net.Proxy.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                okhttp3.internal.connection.RealConnection.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.connection.RealConnection$connectTls$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class AnonymousClass1 extends gg.m implements fg.a {
        final /* synthetic */ okhttp3.Address $address;
        final /* synthetic */ okhttp3.CertificatePinner $certificatePinner;
        final /* synthetic */ okhttp3.Handshake $unverifiedHandshake;

        public AnonymousClass1(okhttp3.CertificatePinner r1, okhttp3.Handshake r2, okhttp3.Address r3) {
                r0 = this;
                r0.$certificatePinner = r1
                r0.$unverifiedHandshake = r2
                r0.$address = r3
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // fg.a
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                r1 = this;
                java.util.List r0 = r1.invoke()
                return r0
        }

        @Override // fg.a
        public final java.util.List<java.security.cert.Certificate> invoke() {
                r3 = this;
                okhttp3.CertificatePinner r0 = r3.$certificatePinner
                okhttp3.internal.tls.CertificateChainCleaner r0 = r0.getCertificateChainCleaner$okhttp()
                r0.getClass()
                okhttp3.Handshake r1 = r3.$unverifiedHandshake
                java.util.List r1 = r1.peerCertificates()
                okhttp3.Address r2 = r3.$address
                okhttp3.HttpUrl r2 = r2.url()
                java.lang.String r2 = r2.host()
                java.util.List r0 = r0.clean(r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.connection.RealConnection$connectTls$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class AnonymousClass2 extends gg.m implements fg.a {
        final /* synthetic */ okhttp3.internal.connection.RealConnection this$0;

        public AnonymousClass2(okhttp3.internal.connection.RealConnection r1) {
                r0 = this;
                r0.this$0 = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // fg.a
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                r1 = this;
                java.util.List r0 = r1.invoke()
                return r0
        }

        @Override // fg.a
        public final java.util.List<java.security.cert.X509Certificate> invoke() {
                r3 = this;
                okhttp3.internal.connection.RealConnection r0 = r3.this$0
                okhttp3.Handshake r0 = okhttp3.internal.connection.RealConnection.access$getHandshake$p(r0)
                r0.getClass()
                java.util.List r0 = r0.peerCertificates()
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = tf.n.e1(r0)
                r1.<init>(r2)
                java.util.Iterator r0 = r0.iterator()
            L1a:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L2f
                java.lang.Object r2 = r0.next()
                java.security.cert.Certificate r2 = (java.security.cert.Certificate) r2
                r2.getClass()
                java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
                r1.add(r2)
                goto L1a
            L2f:
                return r1
        }
    }

    static {
            okhttp3.internal.connection.RealConnection$Companion r0 = new okhttp3.internal.connection.RealConnection$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.connection.RealConnection.Companion = r0
            return
    }

    public RealConnection(okhttp3.internal.connection.RealConnectionPool r1, okhttp3.Route r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.connectionPool = r1
            r0.route = r2
            r1 = 1
            r0.allocationLimit = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.calls = r1
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0.idleAtNs = r1
            return
    }

    public static final /* synthetic */ okhttp3.Handshake access$getHandshake$p(okhttp3.internal.connection.RealConnection r0) {
            okhttp3.Handshake r0 = r0.handshake
            return r0
    }

    public static final /* synthetic */ void access$setSocket$p(okhttp3.internal.connection.RealConnection r0, java.net.Socket r1) {
            r0.socket = r1
            return
    }

    private final boolean certificateSupportHost(okhttp3.HttpUrl r3, okhttp3.Handshake r4) {
            r2 = this;
            java.util.List r4 = r4.peerCertificates()
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 != 0) goto L22
            okhttp3.internal.tls.OkHostnameVerifier r0 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE
            java.lang.String r3 = r3.host()
            java.lang.Object r4 = r4.get(r1)
            r4.getClass()
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4
            boolean r3 = r0.verify(r3, r4)
            if (r3 == 0) goto L22
            r3 = 1
            return r3
        L22:
            return r1
    }

    private final void connectSocket(int r5, int r6, okhttp3.Call r7, okhttp3.EventListener r8) {
            r4 = this;
            okhttp3.Route r0 = r4.route
            java.net.Proxy r0 = r0.proxy()
            okhttp3.Route r1 = r4.route
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
            r3 = 1
            if (r2 == r3) goto L28
            r3 = 2
            if (r2 == r3) goto L28
            java.net.Socket r1 = new java.net.Socket
            r1.<init>(r0)
            goto L33
        L28:
            javax.net.SocketFactory r1 = r1.socketFactory()
            java.net.Socket r1 = r1.createSocket()
            r1.getClass()
        L33:
            r4.rawSocket = r1
            okhttp3.Route r2 = r4.route
            java.net.InetSocketAddress r2 = r2.socketAddress()
            r8.connectStart(r7, r2, r0)
            r1.setSoTimeout(r6)
            okhttp3.internal.platform.Platform$Companion r6 = okhttp3.internal.platform.Platform.Companion     // Catch: java.net.ConnectException -> L79
            okhttp3.internal.platform.Platform r6 = r6.get()     // Catch: java.net.ConnectException -> L79
            okhttp3.Route r7 = r4.route     // Catch: java.net.ConnectException -> L79
            java.net.InetSocketAddress r7 = r7.socketAddress()     // Catch: java.net.ConnectException -> L79
            r6.connectSocket(r1, r7, r5)     // Catch: java.net.ConnectException -> L79
            okio.Source r5 = okio.Okio.source(r1)     // Catch: java.lang.NullPointerException -> L65
            okio.BufferedSource r5 = okio.Okio.buffer(r5)     // Catch: java.lang.NullPointerException -> L65
            r4.source = r5     // Catch: java.lang.NullPointerException -> L65
            okio.Sink r5 = okio.Okio.sink(r1)     // Catch: java.lang.NullPointerException -> L65
            okio.BufferedSink r5 = okio.Okio.buffer(r5)     // Catch: java.lang.NullPointerException -> L65
            r4.sink = r5     // Catch: java.lang.NullPointerException -> L65
            return
        L65:
            r5 = move-exception
            java.lang.String r6 = r5.getMessage()
            java.lang.String r7 = "throw with null exception"
            boolean r6 = gg.l.a(r6, r7)
            if (r6 != 0) goto L73
            return
        L73:
            java.io.IOException r6 = new java.io.IOException
            r6.<init>(r5)
            throw r6
        L79:
            r5 = move-exception
            java.net.ConnectException r6 = new java.net.ConnectException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to connect to "
            r7.<init>(r8)
            okhttp3.Route r8 = r4.route
            java.net.InetSocketAddress r8 = r8.socketAddress()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            r6.initCause(r5)
            throw r6
    }

    private final void connectTls(okhttp3.internal.connection.ConnectionSpecSelector r11) {
            r10 = this;
            java.lang.String r0 = "Hostname "
            java.lang.String r1 = "\n              |Hostname "
            okhttp3.Route r2 = r10.route
            okhttp3.Address r2 = r2.address()
            javax.net.ssl.SSLSocketFactory r3 = r2.sslSocketFactory()
            r4 = 0
            r3.getClass()     // Catch: java.lang.Throwable -> L165
            java.net.Socket r5 = r10.rawSocket     // Catch: java.lang.Throwable -> L165
            okhttp3.HttpUrl r6 = r2.url()     // Catch: java.lang.Throwable -> L165
            java.lang.String r6 = r6.host()     // Catch: java.lang.Throwable -> L165
            okhttp3.HttpUrl r7 = r2.url()     // Catch: java.lang.Throwable -> L165
            int r7 = r7.port()     // Catch: java.lang.Throwable -> L165
            r8 = 1
            java.net.Socket r3 = r3.createSocket(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L165
            r3.getClass()     // Catch: java.lang.Throwable -> L165
            javax.net.ssl.SSLSocket r3 = (javax.net.ssl.SSLSocket) r3     // Catch: java.lang.Throwable -> L165
            okhttp3.ConnectionSpec r11 = r11.configureSecureSocket(r3)     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r11.supportsTlsExtensions()     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L52
            okhttp3.internal.platform.Platform$Companion r5 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.Throwable -> L4e
            okhttp3.internal.platform.Platform r5 = r5.get()     // Catch: java.lang.Throwable -> L4e
            okhttp3.HttpUrl r6 = r2.url()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r6 = r6.host()     // Catch: java.lang.Throwable -> L4e
            java.util.List r7 = r2.protocols()     // Catch: java.lang.Throwable -> L4e
            r5.configureTlsExtensions(r3, r6, r7)     // Catch: java.lang.Throwable -> L4e
            goto L52
        L4e:
            r11 = move-exception
            r4 = r3
            goto L166
        L52:
            r3.startHandshake()     // Catch: java.lang.Throwable -> L4e
            javax.net.ssl.SSLSession r5 = r3.getSession()     // Catch: java.lang.Throwable -> L4e
            okhttp3.Handshake$Companion r6 = okhttp3.Handshake.Companion     // Catch: java.lang.Throwable -> L4e
            r5.getClass()     // Catch: java.lang.Throwable -> L4e
            okhttp3.Handshake r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L4e
            javax.net.ssl.HostnameVerifier r7 = r2.hostnameVerifier()     // Catch: java.lang.Throwable -> L4e
            r7.getClass()     // Catch: java.lang.Throwable -> L4e
            okhttp3.HttpUrl r8 = r2.url()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r8 = r8.host()     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r7.verify(r8, r5)     // Catch: java.lang.Throwable -> L4e
            if (r5 != 0) goto Lf9
            java.util.List r11 = r6.peerCertificates()     // Catch: java.lang.Throwable -> L4e
            boolean r4 = r11.isEmpty()     // Catch: java.lang.Throwable -> L4e
            if (r4 != 0) goto Lda
            r0 = 0
            java.lang.Object r11 = r11.get(r0)     // Catch: java.lang.Throwable -> L4e
            r11.getClass()     // Catch: java.lang.Throwable -> L4e
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch: java.lang.Throwable -> L4e
            javax.net.ssl.SSLPeerUnverifiedException r0 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch: java.lang.Throwable -> L4e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L4e
            okhttp3.HttpUrl r1 = r2.url()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = r1.host()     // Catch: java.lang.Throwable -> L4e
            r4.append(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = " not verified:\n              |    certificate: "
            r4.append(r1)     // Catch: java.lang.Throwable -> L4e
            okhttp3.CertificatePinner$Companion r1 = okhttp3.CertificatePinner.Companion     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = r1.pin(r11)     // Catch: java.lang.Throwable -> L4e
            r4.append(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "\n              |    DN: "
            r4.append(r1)     // Catch: java.lang.Throwable -> L4e
            java.security.Principal r1 = r11.getSubjectDN()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L4e
            r4.append(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "\n              |    subjectAltNames: "
            r4.append(r1)     // Catch: java.lang.Throwable -> L4e
            okhttp3.internal.tls.OkHostnameVerifier r1 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE     // Catch: java.lang.Throwable -> L4e
            java.util.List r11 = r1.allSubjectAltNames(r11)     // Catch: java.lang.Throwable -> L4e
            r4.append(r11)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r11 = "\n              "
            r4.append(r11)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r11 = r4.toString()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r11 = og.n.S(r11)     // Catch: java.lang.Throwable -> L4e
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.Throwable -> L4e
        Lda:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch: java.lang.Throwable -> L4e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L4e
            okhttp3.HttpUrl r0 = r2.url()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = r0.host()     // Catch: java.lang.Throwable -> L4e
            r1.append(r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = " not verified (no certificates)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L4e
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L4e
            throw r11     // Catch: java.lang.Throwable -> L4e
        Lf9:
            okhttp3.CertificatePinner r0 = r2.certificatePinner()     // Catch: java.lang.Throwable -> L4e
            r0.getClass()     // Catch: java.lang.Throwable -> L4e
            okhttp3.Handshake r1 = new okhttp3.Handshake     // Catch: java.lang.Throwable -> L4e
            okhttp3.TlsVersion r5 = r6.tlsVersion()     // Catch: java.lang.Throwable -> L4e
            okhttp3.CipherSuite r7 = r6.cipherSuite()     // Catch: java.lang.Throwable -> L4e
            java.util.List r8 = r6.localCertificates()     // Catch: java.lang.Throwable -> L4e
            okhttp3.internal.connection.RealConnection$connectTls$1 r9 = new okhttp3.internal.connection.RealConnection$connectTls$1     // Catch: java.lang.Throwable -> L4e
            r9.<init>(r0, r6, r2)     // Catch: java.lang.Throwable -> L4e
            r1.<init>(r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L4e
            r10.handshake = r1     // Catch: java.lang.Throwable -> L4e
            okhttp3.HttpUrl r1 = r2.url()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = r1.host()     // Catch: java.lang.Throwable -> L4e
            okhttp3.internal.connection.RealConnection$connectTls$2 r2 = new okhttp3.internal.connection.RealConnection$connectTls$2     // Catch: java.lang.Throwable -> L4e
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L4e
            r0.check$okhttp(r1, r2)     // Catch: java.lang.Throwable -> L4e
            boolean r11 = r11.supportsTlsExtensions()     // Catch: java.lang.Throwable -> L4e
            if (r11 == 0) goto L138
            okhttp3.internal.platform.Platform$Companion r11 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.Throwable -> L4e
            okhttp3.internal.platform.Platform r11 = r11.get()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r4 = r11.getSelectedProtocol(r3)     // Catch: java.lang.Throwable -> L4e
        L138:
            r10.socket = r3     // Catch: java.lang.Throwable -> L4e
            okio.Source r11 = okio.Okio.source(r3)     // Catch: java.lang.Throwable -> L4e
            okio.BufferedSource r11 = okio.Okio.buffer(r11)     // Catch: java.lang.Throwable -> L4e
            r10.source = r11     // Catch: java.lang.Throwable -> L4e
            okio.Sink r11 = okio.Okio.sink(r3)     // Catch: java.lang.Throwable -> L4e
            okio.BufferedSink r11 = okio.Okio.buffer(r11)     // Catch: java.lang.Throwable -> L4e
            r10.sink = r11     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L157
            okhttp3.Protocol$Companion r11 = okhttp3.Protocol.Companion     // Catch: java.lang.Throwable -> L4e
            okhttp3.Protocol r11 = r11.get(r4)     // Catch: java.lang.Throwable -> L4e
            goto L159
        L157:
            okhttp3.Protocol r11 = okhttp3.Protocol.HTTP_1_1     // Catch: java.lang.Throwable -> L4e
        L159:
            r10.protocol = r11     // Catch: java.lang.Throwable -> L4e
            okhttp3.internal.platform.Platform$Companion r11 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r11 = r11.get()
            r11.afterHandshake(r3)
            return
        L165:
            r11 = move-exception
        L166:
            if (r4 == 0) goto L171
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r0 = r0.get()
            r0.afterHandshake(r4)
        L171:
            if (r4 == 0) goto L176
            okhttp3.internal.Util.closeQuietly(r4)
        L176:
            throw r11
    }

    private final void connectTunnel(int r7, int r8, int r9, okhttp3.Call r10, okhttp3.EventListener r11) {
            r6 = this;
            okhttp3.Request r0 = r6.createTunnelRequest()
            okhttp3.HttpUrl r1 = r0.url()
            r2 = 0
        L9:
            r3 = 21
            if (r2 >= r3) goto L37
            r6.connectSocket(r7, r8, r10, r11)
            okhttp3.Request r0 = r6.createTunnel(r8, r9, r0, r1)
            if (r0 != 0) goto L17
            goto L37
        L17:
            java.net.Socket r3 = r6.rawSocket
            if (r3 == 0) goto L1e
            okhttp3.internal.Util.closeQuietly(r3)
        L1e:
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
        L37:
            return
    }

    private final okhttp3.Request createTunnel(int r9, int r10, okhttp3.Request r11, okhttp3.HttpUrl r12) {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CONNECT "
            r0.<init>(r1)
            r1 = 1
            java.lang.String r12 = okhttp3.internal.Util.toHostHeader(r12, r1)
            r0.append(r12)
            java.lang.String r12 = " HTTP/1.1"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
        L18:
            okio.BufferedSource r0 = r8.source
            r0.getClass()
            okio.BufferedSink r1 = r8.sink
            r1.getClass()
            okhttp3.internal.http1.Http1ExchangeCodec r2 = new okhttp3.internal.http1.Http1ExchangeCodec
            r3 = 0
            r2.<init>(r3, r8, r0, r1)
            okio.Timeout r4 = r0.timeout()
            long r5 = (long) r9
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4.timeout(r5, r7)
            okio.Timeout r4 = r1.timeout()
            long r5 = (long) r10
            r4.timeout(r5, r7)
            okhttp3.Headers r4 = r11.headers()
            r2.writeRequest(r4, r12)
            r2.finishRequest()
            r4 = 0
            okhttp3.Response$Builder r4 = r2.readResponseHeaders(r4)
            r4.getClass()
            okhttp3.Response$Builder r11 = r4.request(r11)
            okhttp3.Response r11 = r11.build()
            r2.skipConnectBody(r11)
            int r2 = r11.code()
            r4 = 200(0xc8, float:2.8E-43)
            if (r2 == r4) goto L98
            r0 = 407(0x197, float:5.7E-43)
            if (r2 != r0) goto L8e
            okhttp3.Route r0 = r8.route
            okhttp3.Address r0 = r0.address()
            okhttp3.Authenticator r0 = r0.proxyAuthenticator()
            okhttp3.Route r1 = r8.route
            okhttp3.Request r0 = r0.authenticate(r1, r11)
            if (r0 == 0) goto L87
            java.lang.String r1 = "Connection"
            r2 = 2
            java.lang.String r11 = okhttp3.Response.header$default(r11, r1, r3, r2, r3)
            java.lang.String r1 = "close"
            boolean r11 = r1.equalsIgnoreCase(r11)
            if (r11 == 0) goto L85
            return r0
        L85:
            r11 = r0
            goto L18
        L87:
            java.lang.String r9 = "Failed to authenticate with proxy"
            j8.o.y(r9)
        L8c:
            r9 = 0
            return r9
        L8e:
            java.lang.String r9 = "Unexpected response code for CONNECT: "
            int r10 = r11.code()
            j8.o.u(r10, r9)
            goto L8c
        L98:
            okio.Buffer r9 = r0.getBuffer()
            boolean r9 = r9.exhausted()
            if (r9 == 0) goto Lad
            okio.Buffer r9 = r1.getBuffer()
            boolean r9 = r9.exhausted()
            if (r9 == 0) goto Lad
            return r3
        Lad:
            java.lang.String r9 = "TLS tunnel buffered too many bytes!"
            j8.o.y(r9)
            goto L8c
    }

    private final okhttp3.Request createTunnelRequest() {
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
            okhttp3.Request r1 = r2.authenticate(r3, r1)
            if (r1 != 0) goto L8d
            return r0
        L8d:
            return r1
    }

    private final void establishProtocol(okhttp3.internal.connection.ConnectionSpecSelector r2, int r3, okhttp3.Call r4, okhttp3.EventListener r5) {
            r1 = this;
            okhttp3.Route r0 = r1.route
            okhttp3.Address r0 = r0.address()
            javax.net.ssl.SSLSocketFactory r0 = r0.sslSocketFactory()
            if (r0 != 0) goto L2f
            okhttp3.Route r2 = r1.route
            okhttp3.Address r2 = r2.address()
            java.util.List r2 = r2.protocols()
            okhttp3.Protocol r4 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r2 = r2.contains(r4)
            java.net.Socket r5 = r1.rawSocket
            if (r2 == 0) goto L28
            r1.socket = r5
            r1.protocol = r4
            r1.startHttp2(r3)
            return
        L28:
            r1.socket = r5
            okhttp3.Protocol r2 = okhttp3.Protocol.HTTP_1_1
            r1.protocol = r2
            return
        L2f:
            r5.secureConnectStart(r4)
            r1.connectTls(r2)
            okhttp3.Handshake r2 = r1.handshake
            r5.secureConnectEnd(r4, r2)
            okhttp3.Protocol r2 = r1.protocol
            okhttp3.Protocol r4 = okhttp3.Protocol.HTTP_2
            if (r2 != r4) goto L43
            r1.startHttp2(r3)
        L43:
            return
    }

    private final boolean routeMatchesAny(java.util.List<okhttp3.Route> r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto La
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto La
            return r0
        La:
            java.util.Iterator r5 = r5.iterator()
        Le:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r5.next()
            okhttp3.Route r1 = (okhttp3.Route) r1
            java.net.Proxy r2 = r1.proxy()
            java.net.Proxy$Type r2 = r2.type()
            java.net.Proxy$Type r3 = java.net.Proxy.Type.DIRECT
            if (r2 != r3) goto Le
            okhttp3.Route r2 = r4.route
            java.net.Proxy r2 = r2.proxy()
            java.net.Proxy$Type r2 = r2.type()
            if (r2 != r3) goto Le
            okhttp3.Route r2 = r4.route
            java.net.InetSocketAddress r2 = r2.socketAddress()
            java.net.InetSocketAddress r1 = r1.socketAddress()
            boolean r1 = gg.l.a(r2, r1)
            if (r1 == 0) goto Le
            r5 = 1
            return r5
        L44:
            return r0
    }

    private final void startHttp2(int r8) {
            r7 = this;
            java.net.Socket r0 = r7.socket
            r0.getClass()
            okio.BufferedSource r1 = r7.source
            r1.getClass()
            okio.BufferedSink r2 = r7.sink
            r2.getClass()
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
            okhttp3.internal.http2.Http2Connection$Builder r0 = r4.socket(r0, r5, r1, r2)
            okhttp3.internal.http2.Http2Connection$Builder r0 = r0.listener(r7)
            okhttp3.internal.http2.Http2Connection$Builder r8 = r0.pingIntervalMillis(r8)
            okhttp3.internal.http2.Http2Connection r8 = r8.build()
            r7.http2Connection = r8
            okhttp3.internal.http2.Http2Connection$Companion r0 = okhttp3.internal.http2.Http2Connection.Companion
            okhttp3.internal.http2.Settings r0 = r0.getDEFAULT_SETTINGS()
            int r0 = r0.getMaxConcurrentStreams()
            r7.allocationLimit = r0
            r0 = 0
            r1 = 3
            okhttp3.internal.http2.Http2Connection.start$default(r8, r3, r0, r1, r0)
            return
    }

    private final boolean supportsUrl(okhttp3.HttpUrl r5) {
            r4 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L1a
            boolean r0 = java.lang.Thread.holdsLock(r4)
            if (r0 == 0) goto Lb
            goto L1a
        Lb:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            java.lang.String r0 = " MUST hold lock on "
            j8.o.i(r5, r0, r4)
            r5 = 0
            return r5
        L1a:
            okhttp3.Route r0 = r4.route
            okhttp3.Address r0 = r0.address()
            okhttp3.HttpUrl r0 = r0.url()
            int r1 = r5.port()
            int r2 = r0.port()
            r3 = 0
            if (r1 == r2) goto L30
            return r3
        L30:
            java.lang.String r1 = r5.host()
            java.lang.String r0 = r0.host()
            boolean r0 = gg.l.a(r1, r0)
            r1 = 1
            if (r0 == 0) goto L40
            return r1
        L40:
            boolean r0 = r4.noCoalescedConnections
            if (r0 != 0) goto L52
            okhttp3.Handshake r0 = r4.handshake
            if (r0 == 0) goto L52
            r0.getClass()
            boolean r5 = r4.certificateSupportHost(r5, r0)
            if (r5 == 0) goto L52
            return r1
        L52:
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

    public final void connect(int r13, int r14, int r15, int r16, boolean r17, okhttp3.Call r18, okhttp3.EventListener r19) {
            r12 = this;
            r18.getClass()
            r19.getClass()
            okhttp3.Protocol r0 = r12.protocol
            if (r0 != 0) goto L13f
            okhttp3.Route r0 = r12.route
            okhttp3.Address r0 = r0.address()
            java.util.List r0 = r0.connectionSpecs()
            okhttp3.internal.connection.ConnectionSpecSelector r7 = new okhttp3.internal.connection.ConnectionSpecSelector
            r7.<init>(r0)
            okhttp3.Route r1 = r12.route
            okhttp3.Address r1 = r1.address()
            javax.net.ssl.SSLSocketFactory r1 = r1.sslSocketFactory()
            if (r1 != 0) goto L68
            okhttp3.ConnectionSpec r1 = okhttp3.ConnectionSpec.CLEARTEXT
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L5b
            okhttp3.Route r0 = r12.route
            okhttp3.Address r0 = r0.address()
            okhttp3.HttpUrl r0 = r0.url()
            java.lang.String r0 = r0.host()
            okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r1 = r1.get()
            boolean r1 = r1.isCleartextTrafficPermitted(r0)
            if (r1 == 0) goto L48
            goto L7a
        L48:
            okhttp3.internal.connection.RouteException r13 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r14 = new java.net.UnknownServiceException
            java.lang.String r15 = "CLEARTEXT communication to "
            java.lang.String r1 = " not permitted by network security policy"
            java.lang.String r15 = eh.a.n(r15, r0, r1)
            r14.<init>(r15)
            r13.<init>(r14)
            throw r13
        L5b:
            okhttp3.internal.connection.RouteException r13 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r14 = new java.net.UnknownServiceException
            java.lang.String r15 = "CLEARTEXT communication not enabled for client"
            r14.<init>(r15)
            r13.<init>(r14)
            throw r13
        L68:
            okhttp3.Route r0 = r12.route
            okhttp3.Address r0 = r0.address()
            java.util.List r0 = r0.protocols()
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L132
        L7a:
            r8 = 0
            r9 = r8
        L7c:
            okhttp3.Route r0 = r12.route     // Catch: java.io.IOException -> Le4
            boolean r0 = r0.requiresTunnel()     // Catch: java.io.IOException -> Le4
            if (r0 == 0) goto La4
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r18
            r6 = r19
            r1.connectTunnel(r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L9f
            r10 = r3
            r2 = r5
            r1 = r6
            java.net.Socket r0 = r12.rawSocket     // Catch: java.io.IOException -> L9a
            if (r0 != 0) goto L97
            goto Lc1
        L97:
            r11 = r16
            goto Lad
        L9a:
            r0 = move-exception
        L9b:
            r11 = r16
        L9d:
            r6 = r0
            goto Led
        L9f:
            r0 = move-exception
            r10 = r3
            r2 = r5
            r1 = r6
            goto L9b
        La4:
            r10 = r14
            r2 = r18
            r1 = r19
            r12.connectSocket(r13, r14, r2, r1)     // Catch: java.io.IOException -> L9a
            goto L97
        Lad:
            r12.establishProtocol(r7, r11, r2, r1)     // Catch: java.io.IOException -> Le2
            okhttp3.Route r0 = r12.route     // Catch: java.io.IOException -> Le2
            java.net.InetSocketAddress r0 = r0.socketAddress()     // Catch: java.io.IOException -> Le2
            okhttp3.Route r3 = r12.route     // Catch: java.io.IOException -> Le2
            java.net.Proxy r3 = r3.proxy()     // Catch: java.io.IOException -> Le2
            okhttp3.Protocol r4 = r12.protocol     // Catch: java.io.IOException -> Le2
            r1.connectEnd(r2, r0, r3, r4)     // Catch: java.io.IOException -> Le2
        Lc1:
            okhttp3.Route r13 = r12.route
            boolean r13 = r13.requiresTunnel()
            if (r13 == 0) goto Ldb
            java.net.Socket r13 = r12.rawSocket
            if (r13 == 0) goto Lce
            goto Ldb
        Lce:
            okhttp3.internal.connection.RouteException r13 = new okhttp3.internal.connection.RouteException
            java.net.ProtocolException r14 = new java.net.ProtocolException
            java.lang.String r15 = "Too many tunnel connections attempted: 21"
            r14.<init>(r15)
            r13.<init>(r14)
            throw r13
        Ldb:
            long r13 = java.lang.System.nanoTime()
            r12.idleAtNs = r13
            return
        Le2:
            r0 = move-exception
            goto L9d
        Le4:
            r0 = move-exception
            r10 = r14
            r11 = r16
            r2 = r18
            r1 = r19
            goto L9d
        Led:
            java.net.Socket r0 = r12.socket
            if (r0 == 0) goto Lf4
            okhttp3.internal.Util.closeQuietly(r0)
        Lf4:
            java.net.Socket r0 = r12.rawSocket
            if (r0 == 0) goto Lfb
            okhttp3.internal.Util.closeQuietly(r0)
        Lfb:
            r12.socket = r8
            r12.rawSocket = r8
            r12.source = r8
            r12.sink = r8
            r12.handshake = r8
            r12.protocol = r8
            r12.http2Connection = r8
            r0 = 1
            r12.allocationLimit = r0
            okhttp3.Route r0 = r12.route
            java.net.InetSocketAddress r3 = r0.socketAddress()
            okhttp3.Route r0 = r12.route
            java.net.Proxy r4 = r0.proxy()
            r5 = 0
            r1.connectFailed(r2, r3, r4, r5, r6)
            if (r9 != 0) goto L124
            okhttp3.internal.connection.RouteException r9 = new okhttp3.internal.connection.RouteException
            r9.<init>(r6)
            goto L127
        L124:
            r9.addConnectException(r6)
        L127:
            if (r17 == 0) goto L131
            boolean r0 = r7.connectionFailed(r6)
            if (r0 == 0) goto L131
            goto L7c
        L131:
            throw r9
        L132:
            okhttp3.internal.connection.RouteException r13 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r14 = new java.net.UnknownServiceException
            java.lang.String r15 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r14.<init>(r15)
            r13.<init>(r14)
            throw r13
        L13f:
            java.lang.String r13 = "already connected"
            j8.o.A(r13)
            return
    }

    public final void connectFailed$okhttp(okhttp3.OkHttpClient r4, okhttp3.Route r5, java.io.IOException r6) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            r6.getClass()
            java.net.Proxy r0 = r5.proxy()
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT
            if (r0 == r1) goto L30
            okhttp3.Address r0 = r5.address()
            java.net.ProxySelector r1 = r0.proxySelector()
            okhttp3.HttpUrl r0 = r0.url()
            java.net.URI r0 = r0.uri()
            java.net.Proxy r2 = r5.proxy()
            java.net.SocketAddress r2 = r2.address()
            r1.connectFailed(r0, r2, r6)
        L30:
            okhttp3.internal.connection.RouteDatabase r4 = r4.getRouteDatabase()
            r4.failed(r5)
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

    public final boolean isEligible$okhttp(okhttp3.Address r4, java.util.List<okhttp3.Route> r5) {
            r3 = this;
            r4.getClass()
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L1d
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 == 0) goto Le
            goto L1d
        Le:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = " MUST hold lock on "
            j8.o.i(r4, r5, r3)
            r4 = 0
            return r4
        L1d:
            java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.RealCall>> r0 = r3.calls
            int r0 = r0.size()
            int r1 = r3.allocationLimit
            r2 = 0
            if (r0 >= r1) goto L9a
            boolean r0 = r3.noNewExchanges
            if (r0 == 0) goto L2d
            goto L9a
        L2d:
            okhttp3.Route r0 = r3.route
            okhttp3.Address r0 = r0.address()
            boolean r0 = r0.equalsNonHost$okhttp(r4)
            if (r0 != 0) goto L3a
            return r2
        L3a:
            okhttp3.HttpUrl r0 = r4.url()
            java.lang.String r0 = r0.host()
            okhttp3.Route r1 = r3.route()
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.String r1 = r1.host()
            boolean r0 = gg.l.a(r0, r1)
            r1 = 1
            if (r0 == 0) goto L5a
            return r1
        L5a:
            okhttp3.internal.http2.Http2Connection r0 = r3.http2Connection
            if (r0 != 0) goto L5f
            return r2
        L5f:
            if (r5 == 0) goto L9a
            boolean r5 = r3.routeMatchesAny(r5)
            if (r5 != 0) goto L68
            goto L9a
        L68:
            javax.net.ssl.HostnameVerifier r5 = r4.hostnameVerifier()
            okhttp3.internal.tls.OkHostnameVerifier r0 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE
            if (r5 == r0) goto L71
            return r2
        L71:
            okhttp3.HttpUrl r5 = r4.url()
            boolean r5 = r3.supportsUrl(r5)
            if (r5 != 0) goto L7c
            return r2
        L7c:
            okhttp3.CertificatePinner r5 = r4.certificatePinner()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L9a
            r5.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L9a
            okhttp3.HttpUrl r4 = r4.url()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L9a
            java.lang.String r4 = r4.host()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L9a
            okhttp3.Handshake r0 = r3.handshake()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L9a
            r0.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L9a
            java.util.List r0 = r0.peerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L9a
            r5.check(r4, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L9a
            return r1
        L9a:
            return r2
    }

    public final boolean isHealthy(boolean r8) {
            r7 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L1a
            boolean r0 = java.lang.Thread.holdsLock(r7)
            if (r0 != 0) goto Lb
            goto L1a
        Lb:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            java.lang.String r0 = " MUST NOT hold lock on "
            j8.o.i(r8, r0, r7)
            r8 = 0
            return r8
        L1a:
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r7.rawSocket
            r2.getClass()
            java.net.Socket r3 = r7.socket
            r3.getClass()
            okio.BufferedSource r4 = r7.source
            r4.getClass()
            boolean r2 = r2.isClosed()
            if (r2 != 0) goto L69
            boolean r2 = r3.isClosed()
            if (r2 != 0) goto L69
            boolean r2 = r3.isInputShutdown()
            if (r2 != 0) goto L69
            boolean r2 = r3.isOutputShutdown()
            if (r2 == 0) goto L46
            goto L69
        L46:
            okhttp3.internal.http2.Http2Connection r2 = r7.http2Connection
            if (r2 == 0) goto L4f
            boolean r8 = r2.isHealthy(r0)
            return r8
        L4f:
            monitor-enter(r7)
            long r5 = r7.idleAtNs     // Catch: java.lang.Throwable -> L66
            long r0 = r0 - r5
            monitor-exit(r7)
            r5 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto L64
            if (r8 == 0) goto L64
            boolean r8 = okhttp3.internal.Util.isHealthy(r3, r4)
            return r8
        L64:
            r8 = 1
            return r8
        L66:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L69:
            r8 = 0
            return r8
    }

    public final boolean isMultiplexed$okhttp() {
            r1 = this;
            okhttp3.internal.http2.Http2Connection r0 = r1.http2Connection
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final okhttp3.internal.http.ExchangeCodec newCodec$okhttp(okhttp3.OkHttpClient r7, okhttp3.internal.http.RealInterceptorChain r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            java.net.Socket r0 = r6.socket
            r0.getClass()
            okio.BufferedSource r1 = r6.source
            r1.getClass()
            okio.BufferedSink r2 = r6.sink
            r2.getClass()
            okhttp3.internal.http2.Http2Connection r3 = r6.http2Connection
            if (r3 == 0) goto L1f
            okhttp3.internal.http2.Http2ExchangeCodec r0 = new okhttp3.internal.http2.Http2ExchangeCodec
            r0.<init>(r7, r6, r8, r3)
            return r0
        L1f:
            int r3 = r8.readTimeoutMillis()
            r0.setSoTimeout(r3)
            okio.Timeout r0 = r1.timeout()
            int r3 = r8.getReadTimeoutMillis$okhttp()
            long r3 = (long) r3
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.timeout(r3, r5)
            okio.Timeout r0 = r2.timeout()
            int r8 = r8.getWriteTimeoutMillis$okhttp()
            long r3 = (long) r8
            r0.timeout(r3, r5)
            okhttp3.internal.http1.Http1ExchangeCodec r8 = new okhttp3.internal.http1.Http1ExchangeCodec
            r8.<init>(r7, r6, r1, r2)
            return r8
    }

    public final okhttp3.internal.ws.RealWebSocket.Streams newWebSocketStreams$okhttp(okhttp3.internal.connection.Exchange r5) {
            r4 = this;
            r5.getClass()
            java.net.Socket r0 = r4.socket
            r0.getClass()
            okio.BufferedSource r1 = r4.source
            r1.getClass()
            okio.BufferedSink r2 = r4.sink
            r2.getClass()
            r3 = 0
            r0.setSoTimeout(r3)
            r4.noNewExchanges$okhttp()
            okhttp3.internal.connection.RealConnection$newWebSocketStreams$1 r0 = new okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
            r0.<init>(r1, r2, r5)
            return r0
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
    public synchronized void onSettings(okhttp3.internal.http2.Http2Connection r1, okhttp3.internal.http2.Settings r2) {
            r0 = this;
            monitor-enter(r0)
            r1.getClass()     // Catch: java.lang.Throwable -> Lf
            r2.getClass()     // Catch: java.lang.Throwable -> Lf
            int r1 = r2.getMaxConcurrentStreams()     // Catch: java.lang.Throwable -> Lf
            r0.allocationLimit = r1     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(okhttp3.internal.http2.Http2Stream r3) {
            r2 = this;
            r3.getClass()
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM
            r1 = 0
            r3.close(r0, r1)
            return
    }

    @Override // okhttp3.Connection
    public okhttp3.Protocol protocol() {
            r1 = this;
            okhttp3.Protocol r0 = r1.protocol
            r0.getClass()
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
            r0.getClass()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Connection{"
            r0.<init>(r1)
            okhttp3.Route r1 = r2.route
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.String r1 = r1.host()
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            okhttp3.Route r1 = r2.route
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            int r1 = r1.port()
            r0.append(r1)
            java.lang.String r1 = ", proxy="
            r0.append(r1)
            okhttp3.Route r1 = r2.route
            java.net.Proxy r1 = r1.proxy()
            r0.append(r1)
            java.lang.String r1 = " hostAddress="
            r0.append(r1)
            okhttp3.Route r1 = r2.route
            java.net.InetSocketAddress r1 = r1.socketAddress()
            r0.append(r1)
            java.lang.String r1 = " cipherSuite="
            r0.append(r1)
            okhttp3.Handshake r1 = r2.handshake
            if (r1 == 0) goto L59
            okhttp3.CipherSuite r1 = r1.cipherSuite()
            if (r1 != 0) goto L5b
        L59:
            java.lang.String r1 = "none"
        L5b:
            r0.append(r1)
            java.lang.String r1 = " protocol="
            r0.append(r1)
            okhttp3.Protocol r1 = r2.protocol
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final synchronized void trackFailure$okhttp(okhttp3.internal.connection.RealCall r4, java.io.IOException r5) {
            r3 = this;
            monitor-enter(r3)
            r4.getClass()     // Catch: java.lang.Throwable -> L21
            boolean r0 = r5 instanceof okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L21
            r1 = 1
            if (r0 == 0) goto L39
            r0 = r5
            okhttp3.internal.http2.StreamResetException r0 = (okhttp3.internal.http2.StreamResetException) r0     // Catch: java.lang.Throwable -> L21
            okhttp3.internal.http2.ErrorCode r0 = r0.errorCode     // Catch: java.lang.Throwable -> L21
            okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> L21
            if (r0 != r2) goto L23
            int r4 = r3.refusedStreamCount     // Catch: java.lang.Throwable -> L21
            int r4 = r4 + r1
            r3.refusedStreamCount = r4     // Catch: java.lang.Throwable -> L21
            if (r4 <= r1) goto L59
            r3.noNewExchanges = r1     // Catch: java.lang.Throwable -> L21
            int r4 = r3.routeFailureCount     // Catch: java.lang.Throwable -> L21
            int r4 = r4 + r1
            r3.routeFailureCount = r4     // Catch: java.lang.Throwable -> L21
            goto L59
        L21:
            r4 = move-exception
            goto L5b
        L23:
            okhttp3.internal.http2.StreamResetException r5 = (okhttp3.internal.http2.StreamResetException) r5     // Catch: java.lang.Throwable -> L21
            okhttp3.internal.http2.ErrorCode r5 = r5.errorCode     // Catch: java.lang.Throwable -> L21
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch: java.lang.Throwable -> L21
            if (r5 != r0) goto L31
            boolean r4 = r4.isCanceled()     // Catch: java.lang.Throwable -> L21
            if (r4 != 0) goto L59
        L31:
            r3.noNewExchanges = r1     // Catch: java.lang.Throwable -> L21
            int r4 = r3.routeFailureCount     // Catch: java.lang.Throwable -> L21
            int r4 = r4 + r1
            r3.routeFailureCount = r4     // Catch: java.lang.Throwable -> L21
            goto L59
        L39:
            boolean r0 = r3.isMultiplexed$okhttp()     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L43
            boolean r0 = r5 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L59
        L43:
            r3.noNewExchanges = r1     // Catch: java.lang.Throwable -> L21
            int r0 = r3.successCount     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L59
            if (r5 == 0) goto L54
            okhttp3.OkHttpClient r4 = r4.getClient()     // Catch: java.lang.Throwable -> L21
            okhttp3.Route r0 = r3.route     // Catch: java.lang.Throwable -> L21
            r3.connectFailed$okhttp(r4, r0, r5)     // Catch: java.lang.Throwable -> L21
        L54:
            int r4 = r3.routeFailureCount     // Catch: java.lang.Throwable -> L21
            int r4 = r4 + r1
            r3.routeFailureCount = r4     // Catch: java.lang.Throwable -> L21
        L59:
            monitor-exit(r3)
            return
        L5b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            throw r4
    }
}
