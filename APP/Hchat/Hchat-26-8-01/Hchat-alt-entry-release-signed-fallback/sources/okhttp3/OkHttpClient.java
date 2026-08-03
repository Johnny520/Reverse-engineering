package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class OkHttpClient implements java.lang.Cloneable, okhttp3.Call.Factory, okhttp3.WebSocket.Factory {
    public static final okhttp3.OkHttpClient.Companion Companion = null;
    private static final java.util.List<okhttp3.ConnectionSpec> DEFAULT_CONNECTION_SPECS = null;
    private static final java.util.List<okhttp3.Protocol> DEFAULT_PROTOCOLS = null;
    private final okhttp3.Authenticator authenticator;
    private final okhttp3.Cache cache;
    private final int callTimeoutMillis;
    private final okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner;
    private final okhttp3.CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;
    private final okhttp3.ConnectionPool connectionPool;
    private final java.util.List<okhttp3.ConnectionSpec> connectionSpecs;
    private final okhttp3.CookieJar cookieJar;
    private final okhttp3.Dispatcher dispatcher;
    private final okhttp3.Dns dns;
    private final okhttp3.EventListener.Factory eventListenerFactory;
    private final boolean followRedirects;
    private final boolean followSslRedirects;
    private final javax.net.ssl.HostnameVerifier hostnameVerifier;
    private final java.util.List<okhttp3.Interceptor> interceptors;
    private final long minWebSocketMessageToCompress;
    private final java.util.List<okhttp3.Interceptor> networkInterceptors;
    private final int pingIntervalMillis;
    private final java.util.List<okhttp3.Protocol> protocols;
    private final java.net.Proxy proxy;
    private final okhttp3.Authenticator proxyAuthenticator;
    private final java.net.ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final okhttp3.internal.connection.RouteDatabase routeDatabase;
    private final javax.net.SocketFactory socketFactory;
    private final javax.net.ssl.SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;
    private final javax.net.ssl.X509TrustManager x509TrustManager;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Builder {
        private okhttp3.Authenticator authenticator;
        private okhttp3.Cache cache;
        private int callTimeout;
        private okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner;
        private okhttp3.CertificatePinner certificatePinner;
        private int connectTimeout;
        private okhttp3.ConnectionPool connectionPool;
        private java.util.List<okhttp3.ConnectionSpec> connectionSpecs;
        private okhttp3.CookieJar cookieJar;
        private okhttp3.Dispatcher dispatcher;
        private okhttp3.Dns dns;
        private okhttp3.EventListener.Factory eventListenerFactory;
        private boolean followRedirects;
        private boolean followSslRedirects;
        private javax.net.ssl.HostnameVerifier hostnameVerifier;
        private final java.util.List<okhttp3.Interceptor> interceptors;
        private long minWebSocketMessageToCompress;
        private final java.util.List<okhttp3.Interceptor> networkInterceptors;
        private int pingInterval;
        private java.util.List<? extends okhttp3.Protocol> protocols;
        private java.net.Proxy proxy;
        private okhttp3.Authenticator proxyAuthenticator;
        private java.net.ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;
        private okhttp3.internal.connection.RouteDatabase routeDatabase;
        private javax.net.SocketFactory socketFactory;
        private javax.net.ssl.SSLSocketFactory sslSocketFactoryOrNull;
        private int writeTimeout;
        private javax.net.ssl.X509TrustManager x509TrustManagerOrNull;

        public Builder() {
                r2 = this;
                r2.<init>()
                okhttp3.Dispatcher r0 = new okhttp3.Dispatcher
                r0.<init>()
                r2.dispatcher = r0
                okhttp3.ConnectionPool r0 = new okhttp3.ConnectionPool
                r0.<init>()
                r2.connectionPool = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.interceptors = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.networkInterceptors = r0
                okhttp3.EventListener r0 = okhttp3.EventListener.NONE
                okhttp3.EventListener$Factory r0 = okhttp3.internal.Util.asFactory(r0)
                r2.eventListenerFactory = r0
                r0 = 1
                r2.retryOnConnectionFailure = r0
                okhttp3.Authenticator r1 = okhttp3.Authenticator.NONE
                r2.authenticator = r1
                r2.followRedirects = r0
                r2.followSslRedirects = r0
                okhttp3.CookieJar r0 = okhttp3.CookieJar.NO_COOKIES
                r2.cookieJar = r0
                okhttp3.Dns r0 = okhttp3.Dns.SYSTEM
                r2.dns = r0
                r2.proxyAuthenticator = r1
                javax.net.SocketFactory r0 = javax.net.SocketFactory.getDefault()
                r0.getClass()
                r2.socketFactory = r0
                okhttp3.OkHttpClient$Companion r0 = okhttp3.OkHttpClient.Companion
                java.util.List r1 = r0.getDEFAULT_CONNECTION_SPECS$okhttp()
                r2.connectionSpecs = r1
                java.util.List r0 = r0.getDEFAULT_PROTOCOLS$okhttp()
                r2.protocols = r0
                okhttp3.internal.tls.OkHostnameVerifier r0 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE
                r2.hostnameVerifier = r0
                okhttp3.CertificatePinner r0 = okhttp3.CertificatePinner.DEFAULT
                r2.certificatePinner = r0
                r0 = 10000(0x2710, float:1.4013E-41)
                r2.connectTimeout = r0
                r2.readTimeout = r0
                r2.writeTimeout = r0
                r0 = 1024(0x400, double:5.06E-321)
                r2.minWebSocketMessageToCompress = r0
                return
        }

        public Builder(okhttp3.OkHttpClient r3) {
                r2 = this;
                r3.getClass()
                r2.<init>()
                okhttp3.Dispatcher r0 = r3.dispatcher()
                r2.dispatcher = r0
                okhttp3.ConnectionPool r0 = r3.connectionPool()
                r2.connectionPool = r0
                java.util.List<okhttp3.Interceptor> r0 = r2.interceptors
                java.util.List r1 = r3.interceptors()
                tf.r.h1(r0, r1)
                java.util.List<okhttp3.Interceptor> r0 = r2.networkInterceptors
                java.util.List r1 = r3.networkInterceptors()
                tf.r.h1(r0, r1)
                okhttp3.EventListener$Factory r0 = r3.eventListenerFactory()
                r2.eventListenerFactory = r0
                boolean r0 = r3.retryOnConnectionFailure()
                r2.retryOnConnectionFailure = r0
                okhttp3.Authenticator r0 = r3.authenticator()
                r2.authenticator = r0
                boolean r0 = r3.followRedirects()
                r2.followRedirects = r0
                boolean r0 = r3.followSslRedirects()
                r2.followSslRedirects = r0
                okhttp3.CookieJar r0 = r3.cookieJar()
                r2.cookieJar = r0
                okhttp3.Cache r0 = r3.cache()
                r2.cache = r0
                okhttp3.Dns r0 = r3.dns()
                r2.dns = r0
                java.net.Proxy r0 = r3.proxy()
                r2.proxy = r0
                java.net.ProxySelector r0 = r3.proxySelector()
                r2.proxySelector = r0
                okhttp3.Authenticator r0 = r3.proxyAuthenticator()
                r2.proxyAuthenticator = r0
                javax.net.SocketFactory r0 = r3.socketFactory()
                r2.socketFactory = r0
                javax.net.ssl.SSLSocketFactory r0 = okhttp3.OkHttpClient.access$getSslSocketFactoryOrNull$p(r3)
                r2.sslSocketFactoryOrNull = r0
                javax.net.ssl.X509TrustManager r0 = r3.x509TrustManager()
                r2.x509TrustManagerOrNull = r0
                java.util.List r0 = r3.connectionSpecs()
                r2.connectionSpecs = r0
                java.util.List r0 = r3.protocols()
                r2.protocols = r0
                javax.net.ssl.HostnameVerifier r0 = r3.hostnameVerifier()
                r2.hostnameVerifier = r0
                okhttp3.CertificatePinner r0 = r3.certificatePinner()
                r2.certificatePinner = r0
                okhttp3.internal.tls.CertificateChainCleaner r0 = r3.certificateChainCleaner()
                r2.certificateChainCleaner = r0
                int r0 = r3.callTimeoutMillis()
                r2.callTimeout = r0
                int r0 = r3.connectTimeoutMillis()
                r2.connectTimeout = r0
                int r0 = r3.readTimeoutMillis()
                r2.readTimeout = r0
                int r0 = r3.writeTimeoutMillis()
                r2.writeTimeout = r0
                int r0 = r3.pingIntervalMillis()
                r2.pingInterval = r0
                long r0 = r3.minWebSocketMessageToCompress()
                r2.minWebSocketMessageToCompress = r0
                okhttp3.internal.connection.RouteDatabase r3 = r3.getRouteDatabase()
                r2.routeDatabase = r3
                return
        }

        /* JADX INFO: renamed from: -addInterceptor, reason: not valid java name */
        public final okhttp3.OkHttpClient.Builder m127addInterceptor(fg.l r2) {
                r1 = this;
                r2.getClass()
                okhttp3.OkHttpClient$Builder$addInterceptor$2 r0 = new okhttp3.OkHttpClient$Builder$addInterceptor$2
                r0.<init>(r2)
                okhttp3.OkHttpClient$Builder r2 = r1.addInterceptor(r0)
                return r2
        }

        /* JADX INFO: renamed from: -addNetworkInterceptor, reason: not valid java name */
        public final okhttp3.OkHttpClient.Builder m128addNetworkInterceptor(fg.l r2) {
                r1 = this;
                r2.getClass()
                okhttp3.OkHttpClient$Builder$addNetworkInterceptor$2 r0 = new okhttp3.OkHttpClient$Builder$addNetworkInterceptor$2
                r0.<init>(r2)
                okhttp3.OkHttpClient$Builder r2 = r1.addNetworkInterceptor(r0)
                return r2
        }

        public final okhttp3.OkHttpClient.Builder addInterceptor(okhttp3.Interceptor r2) {
                r1 = this;
                r2.getClass()
                java.util.List<okhttp3.Interceptor> r0 = r1.interceptors
                r0.add(r2)
                return r1
        }

        public final okhttp3.OkHttpClient.Builder addNetworkInterceptor(okhttp3.Interceptor r2) {
                r1 = this;
                r2.getClass()
                java.util.List<okhttp3.Interceptor> r0 = r1.networkInterceptors
                r0.add(r2)
                return r1
        }

        public final okhttp3.OkHttpClient.Builder authenticator(okhttp3.Authenticator r1) {
                r0 = this;
                r1.getClass()
                r0.authenticator = r1
                return r0
        }

        public final okhttp3.OkHttpClient build() {
                r1 = this;
                okhttp3.OkHttpClient r0 = new okhttp3.OkHttpClient
                r0.<init>(r1)
                return r0
        }

        public final okhttp3.OkHttpClient.Builder cache(okhttp3.Cache r1) {
                r0 = this;
                r0.cache = r1
                return r0
        }

        public final okhttp3.OkHttpClient.Builder callTimeout(long r2, java.util.concurrent.TimeUnit r4) {
                r1 = this;
                r4.getClass()
                java.lang.String r0 = "timeout"
                int r2 = okhttp3.internal.Util.checkDuration(r0, r2, r4)
                r1.callTimeout = r2
                return r1
        }

        public final okhttp3.OkHttpClient.Builder callTimeout(java.time.Duration r3) {
                r2 = this;
                r3.getClass()
                long r0 = r3.toMillis()
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
                r2.callTimeout(r0, r3)
                return r2
        }

        public final okhttp3.OkHttpClient.Builder certificatePinner(okhttp3.CertificatePinner r2) {
                r1 = this;
                r2.getClass()
                okhttp3.CertificatePinner r0 = r1.certificatePinner
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto Le
                r0 = 0
                r1.routeDatabase = r0
            Le:
                r1.certificatePinner = r2
                return r1
        }

        public final okhttp3.OkHttpClient.Builder connectTimeout(long r2, java.util.concurrent.TimeUnit r4) {
                r1 = this;
                r4.getClass()
                java.lang.String r0 = "timeout"
                int r2 = okhttp3.internal.Util.checkDuration(r0, r2, r4)
                r1.connectTimeout = r2
                return r1
        }

        public final okhttp3.OkHttpClient.Builder connectTimeout(java.time.Duration r3) {
                r2 = this;
                r3.getClass()
                long r0 = r3.toMillis()
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
                r2.connectTimeout(r0, r3)
                return r2
        }

        public final okhttp3.OkHttpClient.Builder connectionPool(okhttp3.ConnectionPool r1) {
                r0 = this;
                r1.getClass()
                r0.connectionPool = r1
                return r0
        }

        public final okhttp3.OkHttpClient.Builder connectionSpecs(java.util.List<okhttp3.ConnectionSpec> r2) {
                r1 = this;
                r2.getClass()
                java.util.List<okhttp3.ConnectionSpec> r0 = r1.connectionSpecs
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto Le
                r0 = 0
                r1.routeDatabase = r0
            Le:
                java.util.List r2 = okhttp3.internal.Util.toImmutableList(r2)
                r1.connectionSpecs = r2
                return r1
        }

        public final okhttp3.OkHttpClient.Builder cookieJar(okhttp3.CookieJar r1) {
                r0 = this;
                r1.getClass()
                r0.cookieJar = r1
                return r0
        }

        public final okhttp3.OkHttpClient.Builder dispatcher(okhttp3.Dispatcher r1) {
                r0 = this;
                r1.getClass()
                r0.dispatcher = r1
                return r0
        }

        public final okhttp3.OkHttpClient.Builder dns(okhttp3.Dns r2) {
                r1 = this;
                r2.getClass()
                okhttp3.Dns r0 = r1.dns
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto Le
                r0 = 0
                r1.routeDatabase = r0
            Le:
                r1.dns = r2
                return r1
        }

        public final okhttp3.OkHttpClient.Builder eventListener(okhttp3.EventListener r1) {
                r0 = this;
                r1.getClass()
                okhttp3.EventListener$Factory r1 = okhttp3.internal.Util.asFactory(r1)
                r0.eventListenerFactory = r1
                return r0
        }

        public final okhttp3.OkHttpClient.Builder eventListenerFactory(okhttp3.EventListener.Factory r1) {
                r0 = this;
                r1.getClass()
                r0.eventListenerFactory = r1
                return r0
        }

        public final okhttp3.OkHttpClient.Builder followRedirects(boolean r1) {
                r0 = this;
                r0.followRedirects = r1
                return r0
        }

        public final okhttp3.OkHttpClient.Builder followSslRedirects(boolean r1) {
                r0 = this;
                r0.followSslRedirects = r1
                return r0
        }

        public final okhttp3.Authenticator getAuthenticator$okhttp() {
                r1 = this;
                okhttp3.Authenticator r0 = r1.authenticator
                return r0
        }

        public final okhttp3.Cache getCache$okhttp() {
                r1 = this;
                okhttp3.Cache r0 = r1.cache
                return r0
        }

        public final int getCallTimeout$okhttp() {
                r1 = this;
                int r0 = r1.callTimeout
                return r0
        }

        public final okhttp3.internal.tls.CertificateChainCleaner getCertificateChainCleaner$okhttp() {
                r1 = this;
                okhttp3.internal.tls.CertificateChainCleaner r0 = r1.certificateChainCleaner
                return r0
        }

        public final okhttp3.CertificatePinner getCertificatePinner$okhttp() {
                r1 = this;
                okhttp3.CertificatePinner r0 = r1.certificatePinner
                return r0
        }

        public final int getConnectTimeout$okhttp() {
                r1 = this;
                int r0 = r1.connectTimeout
                return r0
        }

        public final okhttp3.ConnectionPool getConnectionPool$okhttp() {
                r1 = this;
                okhttp3.ConnectionPool r0 = r1.connectionPool
                return r0
        }

        public final java.util.List<okhttp3.ConnectionSpec> getConnectionSpecs$okhttp() {
                r1 = this;
                java.util.List<okhttp3.ConnectionSpec> r0 = r1.connectionSpecs
                return r0
        }

        public final okhttp3.CookieJar getCookieJar$okhttp() {
                r1 = this;
                okhttp3.CookieJar r0 = r1.cookieJar
                return r0
        }

        public final okhttp3.Dispatcher getDispatcher$okhttp() {
                r1 = this;
                okhttp3.Dispatcher r0 = r1.dispatcher
                return r0
        }

        public final okhttp3.Dns getDns$okhttp() {
                r1 = this;
                okhttp3.Dns r0 = r1.dns
                return r0
        }

        public final okhttp3.EventListener.Factory getEventListenerFactory$okhttp() {
                r1 = this;
                okhttp3.EventListener$Factory r0 = r1.eventListenerFactory
                return r0
        }

        public final boolean getFollowRedirects$okhttp() {
                r1 = this;
                boolean r0 = r1.followRedirects
                return r0
        }

        public final boolean getFollowSslRedirects$okhttp() {
                r1 = this;
                boolean r0 = r1.followSslRedirects
                return r0
        }

        public final javax.net.ssl.HostnameVerifier getHostnameVerifier$okhttp() {
                r1 = this;
                javax.net.ssl.HostnameVerifier r0 = r1.hostnameVerifier
                return r0
        }

        public final java.util.List<okhttp3.Interceptor> getInterceptors$okhttp() {
                r1 = this;
                java.util.List<okhttp3.Interceptor> r0 = r1.interceptors
                return r0
        }

        public final long getMinWebSocketMessageToCompress$okhttp() {
                r2 = this;
                long r0 = r2.minWebSocketMessageToCompress
                return r0
        }

        public final java.util.List<okhttp3.Interceptor> getNetworkInterceptors$okhttp() {
                r1 = this;
                java.util.List<okhttp3.Interceptor> r0 = r1.networkInterceptors
                return r0
        }

        public final int getPingInterval$okhttp() {
                r1 = this;
                int r0 = r1.pingInterval
                return r0
        }

        public final java.util.List<okhttp3.Protocol> getProtocols$okhttp() {
                r1 = this;
                java.util.List<? extends okhttp3.Protocol> r0 = r1.protocols
                return r0
        }

        public final java.net.Proxy getProxy$okhttp() {
                r1 = this;
                java.net.Proxy r0 = r1.proxy
                return r0
        }

        public final okhttp3.Authenticator getProxyAuthenticator$okhttp() {
                r1 = this;
                okhttp3.Authenticator r0 = r1.proxyAuthenticator
                return r0
        }

        public final java.net.ProxySelector getProxySelector$okhttp() {
                r1 = this;
                java.net.ProxySelector r0 = r1.proxySelector
                return r0
        }

        public final int getReadTimeout$okhttp() {
                r1 = this;
                int r0 = r1.readTimeout
                return r0
        }

        public final boolean getRetryOnConnectionFailure$okhttp() {
                r1 = this;
                boolean r0 = r1.retryOnConnectionFailure
                return r0
        }

        public final okhttp3.internal.connection.RouteDatabase getRouteDatabase$okhttp() {
                r1 = this;
                okhttp3.internal.connection.RouteDatabase r0 = r1.routeDatabase
                return r0
        }

        public final javax.net.SocketFactory getSocketFactory$okhttp() {
                r1 = this;
                javax.net.SocketFactory r0 = r1.socketFactory
                return r0
        }

        public final javax.net.ssl.SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
                r1 = this;
                javax.net.ssl.SSLSocketFactory r0 = r1.sslSocketFactoryOrNull
                return r0
        }

        public final int getWriteTimeout$okhttp() {
                r1 = this;
                int r0 = r1.writeTimeout
                return r0
        }

        public final javax.net.ssl.X509TrustManager getX509TrustManagerOrNull$okhttp() {
                r1 = this;
                javax.net.ssl.X509TrustManager r0 = r1.x509TrustManagerOrNull
                return r0
        }

        public final okhttp3.OkHttpClient.Builder hostnameVerifier(javax.net.ssl.HostnameVerifier r2) {
                r1 = this;
                r2.getClass()
                javax.net.ssl.HostnameVerifier r0 = r1.hostnameVerifier
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto Le
                r0 = 0
                r1.routeDatabase = r0
            Le:
                r1.hostnameVerifier = r2
                return r1
        }

        public final java.util.List<okhttp3.Interceptor> interceptors() {
                r1 = this;
                java.util.List<okhttp3.Interceptor> r0 = r1.interceptors
                return r0
        }

        public final okhttp3.OkHttpClient.Builder minWebSocketMessageToCompress(long r3) {
                r2 = this;
                r0 = 0
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 < 0) goto L9
                r2.minWebSocketMessageToCompress = r3
                return r2
            L9:
                java.lang.String r0 = "minWebSocketMessageToCompress must be positive: "
                java.lang.String r3 = bc.e.g(r3, r0)
                j8.o.q(r3)
                r3 = 0
                return r3
        }

        public final java.util.List<okhttp3.Interceptor> networkInterceptors() {
                r1 = this;
                java.util.List<okhttp3.Interceptor> r0 = r1.networkInterceptors
                return r0
        }

        public final okhttp3.OkHttpClient.Builder pingInterval(long r2, java.util.concurrent.TimeUnit r4) {
                r1 = this;
                r4.getClass()
                java.lang.String r0 = "interval"
                int r2 = okhttp3.internal.Util.checkDuration(r0, r2, r4)
                r1.pingInterval = r2
                return r1
        }

        public final okhttp3.OkHttpClient.Builder pingInterval(java.time.Duration r3) {
                r2 = this;
                r3.getClass()
                long r0 = r3.toMillis()
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
                r2.pingInterval(r0, r3)
                return r2
        }

        public final okhttp3.OkHttpClient.Builder protocols(java.util.List<? extends okhttp3.Protocol> r3) {
                r2 = this;
                r3.getClass()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r3)
                okhttp3.Protocol r3 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
                boolean r1 = r0.contains(r3)
                if (r1 != 0) goto L20
                okhttp3.Protocol r1 = okhttp3.Protocol.HTTP_1_1
                boolean r1 = r0.contains(r1)
                if (r1 == 0) goto L19
                goto L20
            L19:
                java.lang.String r3 = "protocols must contain h2_prior_knowledge or http/1.1: "
                j8.o.z(r0, r3)
            L1e:
                r3 = 0
                return r3
            L20:
                boolean r3 = r0.contains(r3)
                if (r3 == 0) goto L34
                int r3 = r0.size()
                r1 = 1
                if (r3 > r1) goto L2e
                goto L34
            L2e:
                java.lang.String r3 = "protocols containing h2_prior_knowledge cannot use other protocols: "
                j8.o.z(r0, r3)
                goto L1e
            L34:
                okhttp3.Protocol r3 = okhttp3.Protocol.HTTP_1_0
                boolean r3 = r0.contains(r3)
                if (r3 != 0) goto L62
                r3 = 0
                boolean r1 = r0.contains(r3)
                if (r1 != 0) goto L5c
                okhttp3.Protocol r1 = okhttp3.Protocol.SPDY_3
                r0.remove(r1)
                java.util.List<? extends okhttp3.Protocol> r1 = r2.protocols
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L52
                r2.routeDatabase = r3
            L52:
                java.util.List r3 = java.util.Collections.unmodifiableList(r0)
                r3.getClass()
                r2.protocols = r3
                return r2
            L5c:
                java.lang.String r3 = "protocols must not contain null"
                j8.o.t(r3)
                goto L1e
            L62:
                java.lang.String r3 = "protocols must not contain http/1.0: "
                j8.o.z(r0, r3)
                goto L1e
        }

        public final okhttp3.OkHttpClient.Builder proxy(java.net.Proxy r2) {
                r1 = this;
                java.net.Proxy r0 = r1.proxy
                boolean r0 = gg.l.a(r2, r0)
                if (r0 != 0) goto Lb
                r0 = 0
                r1.routeDatabase = r0
            Lb:
                r1.proxy = r2
                return r1
        }

        public final okhttp3.OkHttpClient.Builder proxyAuthenticator(okhttp3.Authenticator r2) {
                r1 = this;
                r2.getClass()
                okhttp3.Authenticator r0 = r1.proxyAuthenticator
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto Le
                r0 = 0
                r1.routeDatabase = r0
            Le:
                r1.proxyAuthenticator = r2
                return r1
        }

        public final okhttp3.OkHttpClient.Builder proxySelector(java.net.ProxySelector r2) {
                r1 = this;
                r2.getClass()
                java.net.ProxySelector r0 = r1.proxySelector
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto Le
                r0 = 0
                r1.routeDatabase = r0
            Le:
                r1.proxySelector = r2
                return r1
        }

        public final okhttp3.OkHttpClient.Builder readTimeout(long r2, java.util.concurrent.TimeUnit r4) {
                r1 = this;
                r4.getClass()
                java.lang.String r0 = "timeout"
                int r2 = okhttp3.internal.Util.checkDuration(r0, r2, r4)
                r1.readTimeout = r2
                return r1
        }

        public final okhttp3.OkHttpClient.Builder readTimeout(java.time.Duration r3) {
                r2 = this;
                r3.getClass()
                long r0 = r3.toMillis()
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
                r2.readTimeout(r0, r3)
                return r2
        }

        public final okhttp3.OkHttpClient.Builder retryOnConnectionFailure(boolean r1) {
                r0 = this;
                r0.retryOnConnectionFailure = r1
                return r0
        }

        public final void setAuthenticator$okhttp(okhttp3.Authenticator r1) {
                r0 = this;
                r1.getClass()
                r0.authenticator = r1
                return
        }

        public final void setCache$okhttp(okhttp3.Cache r1) {
                r0 = this;
                r0.cache = r1
                return
        }

        public final void setCallTimeout$okhttp(int r1) {
                r0 = this;
                r0.callTimeout = r1
                return
        }

        public final void setCertificateChainCleaner$okhttp(okhttp3.internal.tls.CertificateChainCleaner r1) {
                r0 = this;
                r0.certificateChainCleaner = r1
                return
        }

        public final void setCertificatePinner$okhttp(okhttp3.CertificatePinner r1) {
                r0 = this;
                r1.getClass()
                r0.certificatePinner = r1
                return
        }

        public final void setConnectTimeout$okhttp(int r1) {
                r0 = this;
                r0.connectTimeout = r1
                return
        }

        public final void setConnectionPool$okhttp(okhttp3.ConnectionPool r1) {
                r0 = this;
                r1.getClass()
                r0.connectionPool = r1
                return
        }

        public final void setConnectionSpecs$okhttp(java.util.List<okhttp3.ConnectionSpec> r1) {
                r0 = this;
                r1.getClass()
                r0.connectionSpecs = r1
                return
        }

        public final void setCookieJar$okhttp(okhttp3.CookieJar r1) {
                r0 = this;
                r1.getClass()
                r0.cookieJar = r1
                return
        }

        public final void setDispatcher$okhttp(okhttp3.Dispatcher r1) {
                r0 = this;
                r1.getClass()
                r0.dispatcher = r1
                return
        }

        public final void setDns$okhttp(okhttp3.Dns r1) {
                r0 = this;
                r1.getClass()
                r0.dns = r1
                return
        }

        public final void setEventListenerFactory$okhttp(okhttp3.EventListener.Factory r1) {
                r0 = this;
                r1.getClass()
                r0.eventListenerFactory = r1
                return
        }

        public final void setFollowRedirects$okhttp(boolean r1) {
                r0 = this;
                r0.followRedirects = r1
                return
        }

        public final void setFollowSslRedirects$okhttp(boolean r1) {
                r0 = this;
                r0.followSslRedirects = r1
                return
        }

        public final void setHostnameVerifier$okhttp(javax.net.ssl.HostnameVerifier r1) {
                r0 = this;
                r1.getClass()
                r0.hostnameVerifier = r1
                return
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long r1) {
                r0 = this;
                r0.minWebSocketMessageToCompress = r1
                return
        }

        public final void setPingInterval$okhttp(int r1) {
                r0 = this;
                r0.pingInterval = r1
                return
        }

        public final void setProtocols$okhttp(java.util.List<? extends okhttp3.Protocol> r1) {
                r0 = this;
                r1.getClass()
                r0.protocols = r1
                return
        }

        public final void setProxy$okhttp(java.net.Proxy r1) {
                r0 = this;
                r0.proxy = r1
                return
        }

        public final void setProxyAuthenticator$okhttp(okhttp3.Authenticator r1) {
                r0 = this;
                r1.getClass()
                r0.proxyAuthenticator = r1
                return
        }

        public final void setProxySelector$okhttp(java.net.ProxySelector r1) {
                r0 = this;
                r0.proxySelector = r1
                return
        }

        public final void setReadTimeout$okhttp(int r1) {
                r0 = this;
                r0.readTimeout = r1
                return
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean r1) {
                r0 = this;
                r0.retryOnConnectionFailure = r1
                return
        }

        public final void setRouteDatabase$okhttp(okhttp3.internal.connection.RouteDatabase r1) {
                r0 = this;
                r0.routeDatabase = r1
                return
        }

        public final void setSocketFactory$okhttp(javax.net.SocketFactory r1) {
                r0 = this;
                r1.getClass()
                r0.socketFactory = r1
                return
        }

        public final void setSslSocketFactoryOrNull$okhttp(javax.net.ssl.SSLSocketFactory r1) {
                r0 = this;
                r0.sslSocketFactoryOrNull = r1
                return
        }

        public final void setWriteTimeout$okhttp(int r1) {
                r0 = this;
                r0.writeTimeout = r1
                return
        }

        public final void setX509TrustManagerOrNull$okhttp(javax.net.ssl.X509TrustManager r1) {
                r0 = this;
                r0.x509TrustManagerOrNull = r1
                return
        }

        public final okhttp3.OkHttpClient.Builder socketFactory(javax.net.SocketFactory r2) {
                r1 = this;
                r2.getClass()
                boolean r0 = r2 instanceof javax.net.ssl.SSLSocketFactory
                if (r0 != 0) goto L15
                javax.net.SocketFactory r0 = r1.socketFactory
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L12
                r0 = 0
                r1.routeDatabase = r0
            L12:
                r1.socketFactory = r2
                return r1
            L15:
                java.lang.String r2 = "socketFactory instanceof SSLSocketFactory"
                j8.o.t(r2)
                r2 = 0
                return r2
        }

        @sf.a
        public final okhttp3.OkHttpClient.Builder sslSocketFactory(javax.net.ssl.SSLSocketFactory r5) {
                r4 = this;
                r5.getClass()
                javax.net.ssl.SSLSocketFactory r0 = r4.sslSocketFactoryOrNull
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto Le
                r0 = 0
                r4.routeDatabase = r0
            Le:
                r4.sslSocketFactoryOrNull = r5
                okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
                okhttp3.internal.platform.Platform r1 = r0.get()
                javax.net.ssl.X509TrustManager r1 = r1.trustManager(r5)
                if (r1 == 0) goto L2e
                r4.x509TrustManagerOrNull = r1
                okhttp3.internal.platform.Platform r5 = r0.get()
                javax.net.ssl.X509TrustManager r0 = r4.x509TrustManagerOrNull
                r0.getClass()
                okhttp3.internal.tls.CertificateChainCleaner r5 = r5.buildCertificateChainCleaner(r0)
                r4.certificateChainCleaner = r5
                return r4
            L2e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Unable to extract the trust manager on "
                r2.<init>(r3)
                okhttp3.internal.platform.Platform r0 = r0.get()
                r2.append(r0)
                java.lang.Class r5 = r5.getClass()
                java.lang.String r0 = ", sslSocketFactory is "
                r2.append(r0)
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                throw r1
        }

        public final okhttp3.OkHttpClient.Builder sslSocketFactory(javax.net.ssl.SSLSocketFactory r2, javax.net.ssl.X509TrustManager r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                javax.net.ssl.SSLSocketFactory r0 = r1.sslSocketFactoryOrNull
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L16
                javax.net.ssl.X509TrustManager r0 = r1.x509TrustManagerOrNull
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L19
            L16:
                r0 = 0
                r1.routeDatabase = r0
            L19:
                r1.sslSocketFactoryOrNull = r2
                okhttp3.internal.tls.CertificateChainCleaner$Companion r2 = okhttp3.internal.tls.CertificateChainCleaner.Companion
                okhttp3.internal.tls.CertificateChainCleaner r2 = r2.get(r3)
                r1.certificateChainCleaner = r2
                r1.x509TrustManagerOrNull = r3
                return r1
        }

        public final okhttp3.OkHttpClient.Builder writeTimeout(long r2, java.util.concurrent.TimeUnit r4) {
                r1 = this;
                r4.getClass()
                java.lang.String r0 = "timeout"
                int r2 = okhttp3.internal.Util.checkDuration(r0, r2, r4)
                r1.writeTimeout = r2
                return r1
        }

        public final okhttp3.OkHttpClient.Builder writeTimeout(java.time.Duration r3) {
                r2 = this;
                r3.getClass()
                long r0 = r3.toMillis()
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
                r2.writeTimeout(r0, r3)
                return r2
        }
    }

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

        public final java.util.List<okhttp3.ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
                r1 = this;
                java.util.List r0 = okhttp3.OkHttpClient.access$getDEFAULT_CONNECTION_SPECS$cp()
                return r0
        }

        public final java.util.List<okhttp3.Protocol> getDEFAULT_PROTOCOLS$okhttp() {
                r1 = this;
                java.util.List r0 = okhttp3.OkHttpClient.access$getDEFAULT_PROTOCOLS$cp()
                return r0
        }
    }

    static {
            okhttp3.OkHttpClient$Companion r0 = new okhttp3.OkHttpClient$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.OkHttpClient.Companion = r0
            okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_2
            okhttp3.Protocol r1 = okhttp3.Protocol.HTTP_1_1
            okhttp3.Protocol[] r0 = new okhttp3.Protocol[]{r0, r1}
            java.util.List r0 = okhttp3.internal.Util.immutableListOf(r0)
            okhttp3.OkHttpClient.DEFAULT_PROTOCOLS = r0
            okhttp3.ConnectionSpec r0 = okhttp3.ConnectionSpec.MODERN_TLS
            okhttp3.ConnectionSpec r1 = okhttp3.ConnectionSpec.CLEARTEXT
            okhttp3.ConnectionSpec[] r0 = new okhttp3.ConnectionSpec[]{r0, r1}
            java.util.List r0 = okhttp3.internal.Util.immutableListOf(r0)
            okhttp3.OkHttpClient.DEFAULT_CONNECTION_SPECS = r0
            return
    }

    public OkHttpClient() {
            r1 = this;
            okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public OkHttpClient(okhttp3.OkHttpClient.Builder r4) {
            r3 = this;
            r4.getClass()
            r3.<init>()
            okhttp3.Dispatcher r0 = r4.getDispatcher$okhttp()
            r3.dispatcher = r0
            okhttp3.ConnectionPool r0 = r4.getConnectionPool$okhttp()
            r3.connectionPool = r0
            java.util.List r0 = r4.getInterceptors$okhttp()
            java.util.List r0 = okhttp3.internal.Util.toImmutableList(r0)
            r3.interceptors = r0
            java.util.List r0 = r4.getNetworkInterceptors$okhttp()
            java.util.List r0 = okhttp3.internal.Util.toImmutableList(r0)
            r3.networkInterceptors = r0
            okhttp3.EventListener$Factory r0 = r4.getEventListenerFactory$okhttp()
            r3.eventListenerFactory = r0
            boolean r0 = r4.getRetryOnConnectionFailure$okhttp()
            r3.retryOnConnectionFailure = r0
            okhttp3.Authenticator r0 = r4.getAuthenticator$okhttp()
            r3.authenticator = r0
            boolean r0 = r4.getFollowRedirects$okhttp()
            r3.followRedirects = r0
            boolean r0 = r4.getFollowSslRedirects$okhttp()
            r3.followSslRedirects = r0
            okhttp3.CookieJar r0 = r4.getCookieJar$okhttp()
            r3.cookieJar = r0
            okhttp3.Cache r0 = r4.getCache$okhttp()
            r3.cache = r0
            okhttp3.Dns r0 = r4.getDns$okhttp()
            r3.dns = r0
            java.net.Proxy r0 = r4.getProxy$okhttp()
            r3.proxy = r0
            java.net.Proxy r0 = r4.getProxy$okhttp()
            if (r0 == 0) goto L65
            okhttp3.internal.proxy.NullProxySelector r0 = okhttp3.internal.proxy.NullProxySelector.INSTANCE
            goto L73
        L65:
            java.net.ProxySelector r0 = r4.getProxySelector$okhttp()
            if (r0 != 0) goto L6f
            java.net.ProxySelector r0 = java.net.ProxySelector.getDefault()
        L6f:
            if (r0 != 0) goto L73
            okhttp3.internal.proxy.NullProxySelector r0 = okhttp3.internal.proxy.NullProxySelector.INSTANCE
        L73:
            r3.proxySelector = r0
            okhttp3.Authenticator r0 = r4.getProxyAuthenticator$okhttp()
            r3.proxyAuthenticator = r0
            javax.net.SocketFactory r0 = r4.getSocketFactory$okhttp()
            r3.socketFactory = r0
            java.util.List r0 = r4.getConnectionSpecs$okhttp()
            r3.connectionSpecs = r0
            java.util.List r1 = r4.getProtocols$okhttp()
            r3.protocols = r1
            javax.net.ssl.HostnameVerifier r1 = r4.getHostnameVerifier$okhttp()
            r3.hostnameVerifier = r1
            int r1 = r4.getCallTimeout$okhttp()
            r3.callTimeoutMillis = r1
            int r1 = r4.getConnectTimeout$okhttp()
            r3.connectTimeoutMillis = r1
            int r1 = r4.getReadTimeout$okhttp()
            r3.readTimeoutMillis = r1
            int r1 = r4.getWriteTimeout$okhttp()
            r3.writeTimeoutMillis = r1
            int r1 = r4.getPingInterval$okhttp()
            r3.pingIntervalMillis = r1
            long r1 = r4.getMinWebSocketMessageToCompress$okhttp()
            r3.minWebSocketMessageToCompress = r1
            okhttp3.internal.connection.RouteDatabase r1 = r4.getRouteDatabase$okhttp()
            if (r1 != 0) goto Lc2
            okhttp3.internal.connection.RouteDatabase r1 = new okhttp3.internal.connection.RouteDatabase
            r1.<init>()
        Lc2:
            r3.routeDatabase = r1
            if (r0 == 0) goto Lcd
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lcd
            goto L13e
        Lcd:
            java.util.Iterator r0 = r0.iterator()
        Ld1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L13e
            java.lang.Object r1 = r0.next()
            okhttp3.ConnectionSpec r1 = (okhttp3.ConnectionSpec) r1
            boolean r1 = r1.isTls()
            if (r1 == 0) goto Ld1
            javax.net.ssl.SSLSocketFactory r0 = r4.getSslSocketFactoryOrNull$okhttp()
            if (r0 == 0) goto L10c
            javax.net.ssl.SSLSocketFactory r0 = r4.getSslSocketFactoryOrNull$okhttp()
            r3.sslSocketFactoryOrNull = r0
            okhttp3.internal.tls.CertificateChainCleaner r0 = r4.getCertificateChainCleaner$okhttp()
            r0.getClass()
            r3.certificateChainCleaner = r0
            javax.net.ssl.X509TrustManager r1 = r4.getX509TrustManagerOrNull$okhttp()
            r1.getClass()
            r3.x509TrustManager = r1
            okhttp3.CertificatePinner r4 = r4.getCertificatePinner$okhttp()
            okhttp3.CertificatePinner r4 = r4.withCertificateChainCleaner$okhttp(r0)
            r3.certificatePinner = r4
            goto L149
        L10c:
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r1 = r0.get()
            javax.net.ssl.X509TrustManager r1 = r1.platformTrustManager()
            r3.x509TrustManager = r1
            okhttp3.internal.platform.Platform r0 = r0.get()
            r1.getClass()
            javax.net.ssl.SSLSocketFactory r0 = r0.newSslSocketFactory(r1)
            r3.sslSocketFactoryOrNull = r0
            okhttp3.internal.tls.CertificateChainCleaner$Companion r0 = okhttp3.internal.tls.CertificateChainCleaner.Companion
            r1.getClass()
            okhttp3.internal.tls.CertificateChainCleaner r0 = r0.get(r1)
            r3.certificateChainCleaner = r0
            okhttp3.CertificatePinner r4 = r4.getCertificatePinner$okhttp()
            r0.getClass()
            okhttp3.CertificatePinner r4 = r4.withCertificateChainCleaner$okhttp(r0)
            r3.certificatePinner = r4
            goto L149
        L13e:
            r4 = 0
            r3.sslSocketFactoryOrNull = r4
            r3.certificateChainCleaner = r4
            r3.x509TrustManager = r4
            okhttp3.CertificatePinner r4 = okhttp3.CertificatePinner.DEFAULT
            r3.certificatePinner = r4
        L149:
            r3.verifyClientState()
            return
    }

    public static final /* synthetic */ java.util.List access$getDEFAULT_CONNECTION_SPECS$cp() {
            java.util.List<okhttp3.ConnectionSpec> r0 = okhttp3.OkHttpClient.DEFAULT_CONNECTION_SPECS
            return r0
    }

    public static final /* synthetic */ java.util.List access$getDEFAULT_PROTOCOLS$cp() {
            java.util.List<okhttp3.Protocol> r0 = okhttp3.OkHttpClient.DEFAULT_PROTOCOLS
            return r0
    }

    public static final /* synthetic */ javax.net.ssl.SSLSocketFactory access$getSslSocketFactoryOrNull$p(okhttp3.OkHttpClient r0) {
            javax.net.ssl.SSLSocketFactory r0 = r0.sslSocketFactoryOrNull
            return r0
    }

    private final void verifyClientState() {
            r3 = this;
            java.util.List<okhttp3.Interceptor> r0 = r3.interceptors
            r0.getClass()
            r1 = 0
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L9a
            java.util.List<okhttp3.Interceptor> r0 = r3.networkInterceptors
            r0.getClass()
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L80
            java.util.List<okhttp3.ConnectionSpec> r0 = r3.connectionSpecs
            if (r0 == 0) goto L22
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L22
            goto L57
        L22:
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r0.next()
            okhttp3.ConnectionSpec r1 = (okhttp3.ConnectionSpec) r1
            boolean r1 = r1.isTls()
            if (r1 == 0) goto L26
            javax.net.ssl.SSLSocketFactory r0 = r3.sslSocketFactoryOrNull
            if (r0 == 0) goto L51
            okhttp3.internal.tls.CertificateChainCleaner r0 = r3.certificateChainCleaner
            if (r0 == 0) goto L4b
            javax.net.ssl.X509TrustManager r0 = r3.x509TrustManager
            if (r0 == 0) goto L45
            goto L6f
        L45:
            java.lang.String r0 = "x509TrustManager == null"
            j8.o.A(r0)
            return
        L4b:
            java.lang.String r0 = "certificateChainCleaner == null"
            j8.o.A(r0)
            return
        L51:
            java.lang.String r0 = "sslSocketFactory == null"
            j8.o.A(r0)
            return
        L57:
            javax.net.ssl.SSLSocketFactory r0 = r3.sslSocketFactoryOrNull
            java.lang.String r1 = "Check failed."
            if (r0 != 0) goto L7c
            okhttp3.internal.tls.CertificateChainCleaner r0 = r3.certificateChainCleaner
            if (r0 != 0) goto L78
            javax.net.ssl.X509TrustManager r0 = r3.x509TrustManager
            if (r0 != 0) goto L74
            okhttp3.CertificatePinner r0 = r3.certificatePinner
            okhttp3.CertificatePinner r2 = okhttp3.CertificatePinner.DEFAULT
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L70
        L6f:
            return
        L70:
            j8.o.A(r1)
            return
        L74:
            j8.o.A(r1)
            return
        L78:
            j8.o.A(r1)
            return
        L7c:
            j8.o.A(r1)
            return
        L80:
            java.util.List<okhttp3.Interceptor> r0 = r3.networkInterceptors
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Null network interceptor: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L9a:
            java.util.List<okhttp3.Interceptor> r0 = r3.interceptors
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Null interceptor: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_authenticator, reason: not valid java name */
    public final okhttp3.Authenticator m101deprecated_authenticator() {
            r1 = this;
            okhttp3.Authenticator r0 = r1.authenticator
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_cache, reason: not valid java name */
    public final okhttp3.Cache m102deprecated_cache() {
            r1 = this;
            okhttp3.Cache r0 = r1.cache
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_callTimeoutMillis, reason: not valid java name */
    public final int m103deprecated_callTimeoutMillis() {
            r1 = this;
            int r0 = r1.callTimeoutMillis
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final okhttp3.CertificatePinner m104deprecated_certificatePinner() {
            r1 = this;
            okhttp3.CertificatePinner r0 = r1.certificatePinner
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_connectTimeoutMillis, reason: not valid java name */
    public final int m105deprecated_connectTimeoutMillis() {
            r1 = this;
            int r0 = r1.connectTimeoutMillis
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_connectionPool, reason: not valid java name */
    public final okhttp3.ConnectionPool m106deprecated_connectionPool() {
            r1 = this;
            okhttp3.ConnectionPool r0 = r1.connectionPool
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final java.util.List<okhttp3.ConnectionSpec> m107deprecated_connectionSpecs() {
            r1 = this;
            java.util.List<okhttp3.ConnectionSpec> r0 = r1.connectionSpecs
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_cookieJar, reason: not valid java name */
    public final okhttp3.CookieJar m108deprecated_cookieJar() {
            r1 = this;
            okhttp3.CookieJar r0 = r1.cookieJar
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_dispatcher, reason: not valid java name */
    public final okhttp3.Dispatcher m109deprecated_dispatcher() {
            r1 = this;
            okhttp3.Dispatcher r0 = r1.dispatcher
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_dns, reason: not valid java name */
    public final okhttp3.Dns m110deprecated_dns() {
            r1 = this;
            okhttp3.Dns r0 = r1.dns
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_eventListenerFactory, reason: not valid java name */
    public final okhttp3.EventListener.Factory m111deprecated_eventListenerFactory() {
            r1 = this;
            okhttp3.EventListener$Factory r0 = r1.eventListenerFactory
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_followRedirects, reason: not valid java name */
    public final boolean m112deprecated_followRedirects() {
            r1 = this;
            boolean r0 = r1.followRedirects
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_followSslRedirects, reason: not valid java name */
    public final boolean m113deprecated_followSslRedirects() {
            r1 = this;
            boolean r0 = r1.followSslRedirects
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final javax.net.ssl.HostnameVerifier m114deprecated_hostnameVerifier() {
            r1 = this;
            javax.net.ssl.HostnameVerifier r0 = r1.hostnameVerifier
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_interceptors, reason: not valid java name */
    public final java.util.List<okhttp3.Interceptor> m115deprecated_interceptors() {
            r1 = this;
            java.util.List<okhttp3.Interceptor> r0 = r1.interceptors
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_networkInterceptors, reason: not valid java name */
    public final java.util.List<okhttp3.Interceptor> m116deprecated_networkInterceptors() {
            r1 = this;
            java.util.List<okhttp3.Interceptor> r0 = r1.networkInterceptors
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_pingIntervalMillis, reason: not valid java name */
    public final int m117deprecated_pingIntervalMillis() {
            r1 = this;
            int r0 = r1.pingIntervalMillis
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_protocols, reason: not valid java name */
    public final java.util.List<okhttp3.Protocol> m118deprecated_protocols() {
            r1 = this;
            java.util.List<okhttp3.Protocol> r0 = r1.protocols
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_proxy, reason: not valid java name */
    public final java.net.Proxy m119deprecated_proxy() {
            r1 = this;
            java.net.Proxy r0 = r1.proxy
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final okhttp3.Authenticator m120deprecated_proxyAuthenticator() {
            r1 = this;
            okhttp3.Authenticator r0 = r1.proxyAuthenticator
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final java.net.ProxySelector m121deprecated_proxySelector() {
            r1 = this;
            java.net.ProxySelector r0 = r1.proxySelector
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_readTimeoutMillis, reason: not valid java name */
    public final int m122deprecated_readTimeoutMillis() {
            r1 = this;
            int r0 = r1.readTimeoutMillis
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_retryOnConnectionFailure, reason: not valid java name */
    public final boolean m123deprecated_retryOnConnectionFailure() {
            r1 = this;
            boolean r0 = r1.retryOnConnectionFailure
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final javax.net.SocketFactory m124deprecated_socketFactory() {
            r1 = this;
            javax.net.SocketFactory r0 = r1.socketFactory
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final javax.net.ssl.SSLSocketFactory m125deprecated_sslSocketFactory() {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.sslSocketFactory()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_writeTimeoutMillis, reason: not valid java name */
    public final int m126deprecated_writeTimeoutMillis() {
            r1 = this;
            int r0 = r1.writeTimeoutMillis
            return r0
    }

    public final okhttp3.Authenticator authenticator() {
            r1 = this;
            okhttp3.Authenticator r0 = r1.authenticator
            return r0
    }

    public final okhttp3.Cache cache() {
            r1 = this;
            okhttp3.Cache r0 = r1.cache
            return r0
    }

    public final int callTimeoutMillis() {
            r1 = this;
            int r0 = r1.callTimeoutMillis
            return r0
    }

    public final okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner() {
            r1 = this;
            okhttp3.internal.tls.CertificateChainCleaner r0 = r1.certificateChainCleaner
            return r0
    }

    public final okhttp3.CertificatePinner certificatePinner() {
            r1 = this;
            okhttp3.CertificatePinner r0 = r1.certificatePinner
            return r0
    }

    public java.lang.Object clone() {
            r1 = this;
            java.lang.Object r0 = super.clone()
            return r0
    }

    public final int connectTimeoutMillis() {
            r1 = this;
            int r0 = r1.connectTimeoutMillis
            return r0
    }

    public final okhttp3.ConnectionPool connectionPool() {
            r1 = this;
            okhttp3.ConnectionPool r0 = r1.connectionPool
            return r0
    }

    public final java.util.List<okhttp3.ConnectionSpec> connectionSpecs() {
            r1 = this;
            java.util.List<okhttp3.ConnectionSpec> r0 = r1.connectionSpecs
            return r0
    }

    public final okhttp3.CookieJar cookieJar() {
            r1 = this;
            okhttp3.CookieJar r0 = r1.cookieJar
            return r0
    }

    public final okhttp3.Dispatcher dispatcher() {
            r1 = this;
            okhttp3.Dispatcher r0 = r1.dispatcher
            return r0
    }

    public final okhttp3.Dns dns() {
            r1 = this;
            okhttp3.Dns r0 = r1.dns
            return r0
    }

    public final okhttp3.EventListener.Factory eventListenerFactory() {
            r1 = this;
            okhttp3.EventListener$Factory r0 = r1.eventListenerFactory
            return r0
    }

    public final boolean followRedirects() {
            r1 = this;
            boolean r0 = r1.followRedirects
            return r0
    }

    public final boolean followSslRedirects() {
            r1 = this;
            boolean r0 = r1.followSslRedirects
            return r0
    }

    public final okhttp3.internal.connection.RouteDatabase getRouteDatabase() {
            r1 = this;
            okhttp3.internal.connection.RouteDatabase r0 = r1.routeDatabase
            return r0
    }

    public final javax.net.ssl.HostnameVerifier hostnameVerifier() {
            r1 = this;
            javax.net.ssl.HostnameVerifier r0 = r1.hostnameVerifier
            return r0
    }

    public final java.util.List<okhttp3.Interceptor> interceptors() {
            r1 = this;
            java.util.List<okhttp3.Interceptor> r0 = r1.interceptors
            return r0
    }

    public final long minWebSocketMessageToCompress() {
            r2 = this;
            long r0 = r2.minWebSocketMessageToCompress
            return r0
    }

    public final java.util.List<okhttp3.Interceptor> networkInterceptors() {
            r1 = this;
            java.util.List<okhttp3.Interceptor> r0 = r1.networkInterceptors
            return r0
    }

    public okhttp3.OkHttpClient.Builder newBuilder() {
            r1 = this;
            okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder
            r0.<init>(r1)
            return r0
    }

    @Override // okhttp3.Call.Factory
    public okhttp3.Call newCall(okhttp3.Request r3) {
            r2 = this;
            r3.getClass()
            okhttp3.internal.connection.RealCall r0 = new okhttp3.internal.connection.RealCall
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // okhttp3.WebSocket.Factory
    public okhttp3.WebSocket newWebSocket(okhttp3.Request r11, okhttp3.WebSocketListener r12) {
            r10 = this;
            r11.getClass()
            r12.getClass()
            okhttp3.internal.ws.RealWebSocket r0 = new okhttp3.internal.ws.RealWebSocket
            okhttp3.internal.concurrent.TaskRunner r1 = okhttp3.internal.concurrent.TaskRunner.INSTANCE
            java.util.Random r4 = new java.util.Random
            r4.<init>()
            int r2 = r10.pingIntervalMillis
            long r5 = (long) r2
            r7 = 0
            long r8 = r10.minWebSocketMessageToCompress
            r2 = r11
            r3 = r12
            r0.<init>(r1, r2, r3, r4, r5, r7, r8)
            r0.connect(r10)
            return r0
    }

    public final int pingIntervalMillis() {
            r1 = this;
            int r0 = r1.pingIntervalMillis
            return r0
    }

    public final java.util.List<okhttp3.Protocol> protocols() {
            r1 = this;
            java.util.List<okhttp3.Protocol> r0 = r1.protocols
            return r0
    }

    public final java.net.Proxy proxy() {
            r1 = this;
            java.net.Proxy r0 = r1.proxy
            return r0
    }

    public final okhttp3.Authenticator proxyAuthenticator() {
            r1 = this;
            okhttp3.Authenticator r0 = r1.proxyAuthenticator
            return r0
    }

    public final java.net.ProxySelector proxySelector() {
            r1 = this;
            java.net.ProxySelector r0 = r1.proxySelector
            return r0
    }

    public final int readTimeoutMillis() {
            r1 = this;
            int r0 = r1.readTimeoutMillis
            return r0
    }

    public final boolean retryOnConnectionFailure() {
            r1 = this;
            boolean r0 = r1.retryOnConnectionFailure
            return r0
    }

    public final javax.net.SocketFactory socketFactory() {
            r1 = this;
            javax.net.SocketFactory r0 = r1.socketFactory
            return r0
    }

    public final javax.net.ssl.SSLSocketFactory sslSocketFactory() {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.sslSocketFactoryOrNull
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "CLEARTEXT-only client"
            j8.o.A(r0)
            r0 = 0
            return r0
    }

    public final int writeTimeoutMillis() {
            r1 = this;
            int r0 = r1.writeTimeoutMillis
            return r0
    }

    public final javax.net.ssl.X509TrustManager x509TrustManager() {
            r1 = this;
            javax.net.ssl.X509TrustManager r0 = r1.x509TrustManager
            return r0
    }
}
