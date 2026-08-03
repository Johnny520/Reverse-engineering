package okhttp3.internal.platform;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ConscryptPlatform extends okhttp3.internal.platform.Platform {
    public static final okhttp3.internal.platform.ConscryptPlatform.Companion Companion = null;
    private static final boolean isSupported = false;
    private final java.security.Provider provider;

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

        public static /* synthetic */ boolean atLeastVersion$default(okhttp3.internal.platform.ConscryptPlatform.Companion r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
                r6 = r5 & 2
                r0 = 0
                if (r6 == 0) goto L6
                r3 = r0
            L6:
                r5 = r5 & 4
                if (r5 == 0) goto Lb
                r4 = r0
            Lb:
                boolean r1 = r1.atLeastVersion(r2, r3, r4)
                return r1
        }

        public final boolean atLeastVersion(int r5, int r6, int r7) {
                r4 = this;
                org.conscrypt.Conscrypt$Version r0 = org.conscrypt.Conscrypt.version()
                int r1 = r0.major()
                r2 = 0
                r3 = 1
                if (r1 == r5) goto L14
                int r6 = r0.major()
                if (r6 <= r5) goto L13
                return r3
            L13:
                return r2
            L14:
                int r5 = r0.minor()
                if (r5 == r6) goto L22
                int r5 = r0.minor()
                if (r5 <= r6) goto L21
                return r3
            L21:
                return r2
            L22:
                int r5 = r0.patch()
                if (r5 < r7) goto L29
                return r3
            L29:
                return r2
        }

        public final okhttp3.internal.platform.ConscryptPlatform buildIfSupported() {
                r2 = this;
                boolean r0 = r2.isSupported()
                r1 = 0
                if (r0 == 0) goto Ld
                okhttp3.internal.platform.ConscryptPlatform r0 = new okhttp3.internal.platform.ConscryptPlatform
                r0.<init>(r1)
                return r0
            Ld:
                return r1
        }

        public final boolean isSupported() {
                r1 = this;
                boolean r0 = okhttp3.internal.platform.ConscryptPlatform.access$isSupported$cp()
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class DisabledHostnameVerifier implements org.conscrypt.ConscryptHostnameVerifier {
        public static final okhttp3.internal.platform.ConscryptPlatform.DisabledHostnameVerifier INSTANCE = null;

        static {
                okhttp3.internal.platform.ConscryptPlatform$DisabledHostnameVerifier r0 = new okhttp3.internal.platform.ConscryptPlatform$DisabledHostnameVerifier
                r0.<init>()
                okhttp3.internal.platform.ConscryptPlatform.DisabledHostnameVerifier.INSTANCE = r0
                return
        }

        private DisabledHostnameVerifier() {
                r0 = this;
                r0.<init>()
                return
        }

        public final boolean verify(java.lang.String r1, javax.net.ssl.SSLSession r2) {
                r0 = this;
                r1 = 1
                return r1
        }

        public boolean verify(java.security.cert.X509Certificate[] r1, java.lang.String r2, javax.net.ssl.SSLSession r3) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    static {
            okhttp3.internal.platform.ConscryptPlatform$Companion r0 = new okhttp3.internal.platform.ConscryptPlatform$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.ConscryptPlatform.Companion = r0
            r1 = 0
            java.lang.String r2 = "org.conscrypt.Conscrypt$Version"
            java.lang.Class r3 = r0.getClass()     // Catch: java.lang.Throwable -> L25
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L25
            java.lang.Class.forName(r2, r1, r3)     // Catch: java.lang.Throwable -> L25
            boolean r2 = org.conscrypt.Conscrypt.isAvailable()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L25
            r2 = 2
            r3 = 1
            boolean r0 = r0.atLeastVersion(r2, r3, r1)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L25
            r1 = r3
        L25:
            okhttp3.internal.platform.ConscryptPlatform.isSupported = r1
            return
    }

    private ConscryptPlatform() {
            r1 = this;
            r1.<init>()
            java.security.Provider r0 = org.conscrypt.Conscrypt.newProvider()
            r0.getClass()
            r1.provider = r0
            return
    }

    public /* synthetic */ ConscryptPlatform(gg.g r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ boolean access$isSupported$cp() {
            boolean r0 = okhttp3.internal.platform.ConscryptPlatform.isSupported
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(javax.net.ssl.SSLSocket r2, java.lang.String r3, java.util.List<okhttp3.Protocol> r4) {
            r1 = this;
            r2.getClass()
            r4.getClass()
            boolean r0 = org.conscrypt.Conscrypt.isConscrypt(r2)
            if (r0 == 0) goto L23
            r3 = 1
            org.conscrypt.Conscrypt.setUseSessionTickets(r2, r3)
            okhttp3.internal.platform.Platform$Companion r3 = okhttp3.internal.platform.Platform.Companion
            java.util.List r3 = r3.alpnProtocolNames(r4)
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r3 = r3.toArray(r4)
            java.lang.String[] r3 = (java.lang.String[]) r3
            org.conscrypt.Conscrypt.setApplicationProtocols(r2, r3)
            return
        L23:
            super.configureTlsExtensions(r2, r3, r4)
            return
    }

    @Override // okhttp3.internal.platform.Platform
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            r2.getClass()
            boolean r0 = org.conscrypt.Conscrypt.isConscrypt(r2)
            if (r0 == 0) goto Le
            java.lang.String r2 = org.conscrypt.Conscrypt.getApplicationProtocol(r2)
            return r2
        Le:
            java.lang.String r2 = super.getSelectedProtocol(r2)
            return r2
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.SSLContext newSSLContext() {
            r2 = this;
            java.lang.String r0 = "TLS"
            java.security.Provider r1 = r2.provider
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0, r1)
            r0.getClass()
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.SSLSocketFactory newSslSocketFactory(javax.net.ssl.X509TrustManager r4) {
            r3 = this;
            r4.getClass()
            javax.net.ssl.SSLContext r0 = r3.newSSLContext()
            r1 = 1
            javax.net.ssl.TrustManager[] r1 = new javax.net.ssl.TrustManager[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 0
            r0.init(r4, r1, r4)
            javax.net.ssl.SSLSocketFactory r4 = r0.getSocketFactory()
            r4.getClass()
            return r4
    }

    @Override // okhttp3.internal.platform.Platform
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
            if (r1 != r2) goto L2b
            r1 = 0
            r1 = r0[r1]
            boolean r2 = r1 instanceof javax.net.ssl.X509TrustManager
            if (r2 == 0) goto L2b
            r1.getClass()
            javax.net.ssl.X509TrustManager r1 = (javax.net.ssl.X509TrustManager) r1
            okhttp3.internal.platform.ConscryptPlatform$DisabledHostnameVerifier r0 = okhttp3.internal.platform.ConscryptPlatform.DisabledHostnameVerifier.INSTANCE
            org.conscrypt.ConscryptHostnameVerifier r0 = (org.conscrypt.ConscryptHostnameVerifier) r0
            org.conscrypt.Conscrypt.setHostnameVerifier(r1, r0)
            return r1
        L2b:
            java.lang.String r0 = java.util.Arrays.toString(r0)
            r0.getClass()
            java.lang.String r1 = "Unexpected default trust managers: "
            java.lang.String r0 = r1.concat(r0)
            ah.a.h(r0)
            r0 = 0
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory r1) {
            r0 = this;
            r1.getClass()
            r1 = 0
            return r1
    }
}
