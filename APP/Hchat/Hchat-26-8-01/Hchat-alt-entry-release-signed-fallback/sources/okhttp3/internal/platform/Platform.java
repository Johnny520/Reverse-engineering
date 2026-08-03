package okhttp3.internal.platform;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Platform {
    public static final okhttp3.internal.platform.Platform.Companion Companion = null;
    public static final int INFO = 4;
    public static final int WARN = 5;
    private static final java.util.logging.Logger logger = null;
    private static volatile okhttp3.internal.platform.Platform platform;

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

        public static final /* synthetic */ okhttp3.internal.platform.Platform access$findPlatform(okhttp3.internal.platform.Platform.Companion r0) {
                okhttp3.internal.platform.Platform r0 = r0.findPlatform()
                return r0
        }

        private final okhttp3.internal.platform.Platform findAndroidPlatform() {
                r1 = this;
                okhttp3.internal.platform.android.AndroidLog r0 = okhttp3.internal.platform.android.AndroidLog.INSTANCE
                r0.enable()
                okhttp3.internal.platform.Android10Platform$Companion r0 = okhttp3.internal.platform.Android10Platform.Companion
                okhttp3.internal.platform.Platform r0 = r0.buildIfSupported()
                if (r0 != 0) goto L16
                okhttp3.internal.platform.AndroidPlatform$Companion r0 = okhttp3.internal.platform.AndroidPlatform.Companion
                okhttp3.internal.platform.Platform r0 = r0.buildIfSupported()
                r0.getClass()
            L16:
                return r0
        }

        private final okhttp3.internal.platform.Platform findJvmPlatform() {
                r1 = this;
                boolean r0 = r1.isConscryptPreferred()
                if (r0 == 0) goto Lf
                okhttp3.internal.platform.ConscryptPlatform$Companion r0 = okhttp3.internal.platform.ConscryptPlatform.Companion
                okhttp3.internal.platform.ConscryptPlatform r0 = r0.buildIfSupported()
                if (r0 == 0) goto Lf
                return r0
            Lf:
                boolean r0 = r1.isBouncyCastlePreferred()
                if (r0 == 0) goto L1e
                okhttp3.internal.platform.BouncyCastlePlatform$Companion r0 = okhttp3.internal.platform.BouncyCastlePlatform.Companion
                okhttp3.internal.platform.BouncyCastlePlatform r0 = r0.buildIfSupported()
                if (r0 == 0) goto L1e
                return r0
            L1e:
                boolean r0 = r1.isOpenJSSEPreferred()
                if (r0 == 0) goto L2d
                okhttp3.internal.platform.OpenJSSEPlatform$Companion r0 = okhttp3.internal.platform.OpenJSSEPlatform.Companion
                okhttp3.internal.platform.OpenJSSEPlatform r0 = r0.buildIfSupported()
                if (r0 == 0) goto L2d
                return r0
            L2d:
                okhttp3.internal.platform.Jdk9Platform$Companion r0 = okhttp3.internal.platform.Jdk9Platform.Companion
                okhttp3.internal.platform.Jdk9Platform r0 = r0.buildIfSupported()
                if (r0 == 0) goto L36
                return r0
            L36:
                okhttp3.internal.platform.Jdk8WithJettyBootPlatform$Companion r0 = okhttp3.internal.platform.Jdk8WithJettyBootPlatform.Companion
                okhttp3.internal.platform.Platform r0 = r0.buildIfSupported()
                if (r0 == 0) goto L3f
                return r0
            L3f:
                okhttp3.internal.platform.Platform r0 = new okhttp3.internal.platform.Platform
                r0.<init>()
                return r0
        }

        private final okhttp3.internal.platform.Platform findPlatform() {
                r1 = this;
                boolean r0 = r1.isAndroid()
                if (r0 == 0) goto Lb
                okhttp3.internal.platform.Platform r0 = r1.findAndroidPlatform()
                return r0
            Lb:
                okhttp3.internal.platform.Platform r0 = r1.findJvmPlatform()
                return r0
        }

        private final boolean isBouncyCastlePreferred() {
                r2 = this;
                java.security.Provider[] r0 = java.security.Security.getProviders()
                r1 = 0
                r0 = r0[r1]
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = "BC"
                boolean r0 = r1.equals(r0)
                return r0
        }

        private final boolean isConscryptPreferred() {
                r2 = this;
                java.security.Provider[] r0 = java.security.Security.getProviders()
                r1 = 0
                r0 = r0[r1]
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = "Conscrypt"
                boolean r0 = r1.equals(r0)
                return r0
        }

        private final boolean isOpenJSSEPreferred() {
                r2 = this;
                java.security.Provider[] r0 = java.security.Security.getProviders()
                r1 = 0
                r0 = r0[r1]
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = "OpenJSSE"
                boolean r0 = r1.equals(r0)
                return r0
        }

        public static /* synthetic */ void resetForTests$default(okhttp3.internal.platform.Platform.Companion r0, okhttp3.internal.platform.Platform r1, int r2, java.lang.Object r3) {
                r2 = r2 & 1
                if (r2 == 0) goto L8
                okhttp3.internal.platform.Platform r1 = r0.findPlatform()
            L8:
                r0.resetForTests(r1)
                return
        }

        public final java.util.List<java.lang.String> alpnProtocolNames(java.util.List<? extends okhttp3.Protocol> r5) {
                r4 = this;
                r5.getClass()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r5 = r5.iterator()
            Lc:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L21
                java.lang.Object r1 = r5.next()
                r2 = r1
                okhttp3.Protocol r2 = (okhttp3.Protocol) r2
                okhttp3.Protocol r3 = okhttp3.Protocol.HTTP_1_0
                if (r2 == r3) goto Lc
                r0.add(r1)
                goto Lc
            L21:
                java.util.ArrayList r5 = new java.util.ArrayList
                int r1 = tf.n.e1(r0)
                r5.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            L2e:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L42
                java.lang.Object r1 = r0.next()
                okhttp3.Protocol r1 = (okhttp3.Protocol) r1
                java.lang.String r1 = r1.toString()
                r5.add(r1)
                goto L2e
            L42:
                return r5
        }

        public final byte[] concatLengthPrefixed(java.util.List<? extends okhttp3.Protocol> r4) {
                r3 = this;
                r4.getClass()
                okio.Buffer r0 = new okio.Buffer
                r0.<init>()
                java.util.List r4 = r3.alpnProtocolNames(r4)
                java.util.Iterator r4 = r4.iterator()
            L10:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L27
                java.lang.Object r1 = r4.next()
                java.lang.String r1 = (java.lang.String) r1
                int r2 = r1.length()
                r0.writeByte(r2)
                r0.writeUtf8(r1)
                goto L10
            L27:
                byte[] r4 = r0.readByteArray()
                return r4
        }

        public final okhttp3.internal.platform.Platform get() {
                r1 = this;
                okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.access$getPlatform$cp()
                return r0
        }

        public final boolean isAndroid() {
                r2 = this;
                java.lang.String r0 = "java.vm.name"
                java.lang.String r0 = java.lang.System.getProperty(r0)
                java.lang.String r1 = "Dalvik"
                boolean r0 = r1.equals(r0)
                return r0
        }

        public final void resetForTests(okhttp3.internal.platform.Platform r1) {
                r0 = this;
                r1.getClass()
                okhttp3.internal.platform.Platform.access$setPlatform$cp(r1)
                return
        }
    }

    static {
            okhttp3.internal.platform.Platform$Companion r0 = new okhttp3.internal.platform.Platform$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.Platform.Companion = r0
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.Companion.access$findPlatform(r0)
            okhttp3.internal.platform.Platform.platform = r0
            java.lang.Class<okhttp3.OkHttpClient> r0 = okhttp3.OkHttpClient.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            okhttp3.internal.platform.Platform.logger = r0
            return
    }

    public Platform() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ okhttp3.internal.platform.Platform access$getPlatform$cp() {
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.platform
            return r0
    }

    public static final /* synthetic */ void access$setPlatform$cp(okhttp3.internal.platform.Platform r0) {
            okhttp3.internal.platform.Platform.platform = r0
            return
    }

    public static final okhttp3.internal.platform.Platform get() {
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r0 = r0.get()
            return r0
    }

    public static /* synthetic */ void log$default(okhttp3.internal.platform.Platform r1, java.lang.String r2, int r3, java.lang.Throwable r4, int r5, java.lang.Object r6) {
            if (r6 != 0) goto L10
            r6 = r5 & 2
            r0 = 4
            if (r6 == 0) goto L8
            r3 = r0
        L8:
            r5 = r5 & r0
            if (r5 == 0) goto Lc
            r4 = 0
        Lc:
            r1.log(r2, r3, r4)
            return
        L10:
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: log"
            j8.o.w(r1)
            return
    }

    public void afterHandshake(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            r1.getClass()
            return
    }

    public okhttp3.internal.tls.CertificateChainCleaner buildCertificateChainCleaner(javax.net.ssl.X509TrustManager r2) {
            r1 = this;
            r2.getClass()
            okhttp3.internal.tls.BasicCertificateChainCleaner r0 = new okhttp3.internal.tls.BasicCertificateChainCleaner
            okhttp3.internal.tls.TrustRootIndex r2 = r1.buildTrustRootIndex(r2)
            r0.<init>(r2)
            return r0
    }

    public okhttp3.internal.tls.TrustRootIndex buildTrustRootIndex(javax.net.ssl.X509TrustManager r3) {
            r2 = this;
            r3.getClass()
            okhttp3.internal.tls.BasicTrustRootIndex r0 = new okhttp3.internal.tls.BasicTrustRootIndex
            java.security.cert.X509Certificate[] r3 = r3.getAcceptedIssuers()
            r3.getClass()
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.security.cert.X509Certificate[] r3 = (java.security.cert.X509Certificate[]) r3
            r0.<init>(r3)
            return r0
    }

    public void configureTlsExtensions(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List<okhttp3.Protocol> r3) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            return
    }

    public void connectSocket(java.net.Socket r1, java.net.InetSocketAddress r2, int r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r1.connect(r2, r3)
            return
    }

    public final java.lang.String getPrefix() {
            r1 = this;
            java.lang.String r0 = "OkHttp"
            return r0
    }

    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            r1.getClass()
            r1 = 0
            return r1
    }

    public java.lang.Object getStackTraceForCloseable(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            java.util.logging.Logger r0 = okhttp3.internal.platform.Platform.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L13
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r3)
            return r0
        L13:
            r3 = 0
            return r3
    }

    public boolean isCleartextTrafficPermitted(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r1 = 1
            return r1
    }

    public void log(java.lang.String r2, int r3, java.lang.Throwable r4) {
            r1 = this;
            r2.getClass()
            r0 = 5
            if (r3 != r0) goto L9
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            goto Lb
        L9:
            java.util.logging.Level r3 = java.util.logging.Level.INFO
        Lb:
            java.util.logging.Logger r0 = okhttp3.internal.platform.Platform.logger
            r0.log(r3, r2, r4)
            return
    }

    public void logCloseableLeak(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            r2.getClass()
            if (r3 != 0) goto Lb
            java.lang.String r0 = " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);"
            java.lang.String r2 = r2.concat(r0)
        Lb:
            r0 = 5
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r1.log(r2, r0, r3)
            return
    }

    public javax.net.ssl.SSLContext newSSLContext() {
            r1 = this;
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)
            r0.getClass()
            return r0
    }

    public javax.net.ssl.SSLSocketFactory newSslSocketFactory(javax.net.ssl.X509TrustManager r4) {
            r3 = this;
            r4.getClass()
            javax.net.ssl.SSLContext r0 = r3.newSSLContext()     // Catch: java.security.GeneralSecurityException -> L19
            r1 = 1
            javax.net.ssl.TrustManager[] r1 = new javax.net.ssl.TrustManager[r1]     // Catch: java.security.GeneralSecurityException -> L19
            r2 = 0
            r1[r2] = r4     // Catch: java.security.GeneralSecurityException -> L19
            r4 = 0
            r0.init(r4, r1, r4)     // Catch: java.security.GeneralSecurityException -> L19
            javax.net.ssl.SSLSocketFactory r4 = r0.getSocketFactory()     // Catch: java.security.GeneralSecurityException -> L19
            r4.getClass()     // Catch: java.security.GeneralSecurityException -> L19
            return r4
        L19:
            r4 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No System TLS: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            throw r0
    }

    public javax.net.ssl.X509TrustManager platformTrustManager() {
            r3 = this;
            java.lang.String r0 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()
            javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance(r0)
            r1 = 0
            r0.init(r1)
            javax.net.ssl.TrustManager[] r0 = r0.getTrustManagers()
            r0.getClass()
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L24
            r1 = 0
            r1 = r0[r1]
            boolean r2 = r1 instanceof javax.net.ssl.X509TrustManager
            if (r2 == 0) goto L24
            r1.getClass()
            javax.net.ssl.X509TrustManager r1 = (javax.net.ssl.X509TrustManager) r1
            return r1
        L24:
            java.lang.String r0 = java.util.Arrays.toString(r0)
            r0.getClass()
            java.lang.String r1 = "Unexpected default trust managers: "
            java.lang.String r0 = r1.concat(r0)
            ah.a.h(r0)
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory r4) {
            r3 = this;
            r4.getClass()
            r0 = 0
            java.lang.String r1 = "sun.security.ssl.SSLContextImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.RuntimeException -> L1e java.lang.ClassNotFoundException -> L31
            java.lang.String r2 = "context"
            java.lang.Object r4 = okhttp3.internal.Util.readFieldOrNull(r4, r1, r2)     // Catch: java.lang.RuntimeException -> L1e java.lang.ClassNotFoundException -> L31
            if (r4 != 0) goto L13
            return r0
        L13:
            java.lang.Class<javax.net.ssl.X509TrustManager> r1 = javax.net.ssl.X509TrustManager.class
            java.lang.String r2 = "trustManager"
            java.lang.Object r4 = okhttp3.internal.Util.readFieldOrNull(r4, r1, r2)     // Catch: java.lang.RuntimeException -> L1e java.lang.ClassNotFoundException -> L31
            javax.net.ssl.X509TrustManager r4 = (javax.net.ssl.X509TrustManager) r4     // Catch: java.lang.RuntimeException -> L1e java.lang.ClassNotFoundException -> L31
            return r4
        L1e:
            r4 = move-exception
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "java.lang.reflect.InaccessibleObjectException"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L30
            goto L31
        L30:
            throw r4
        L31:
            return r0
    }
}
