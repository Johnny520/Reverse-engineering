package okhttp3.internal.platform;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class BouncyCastlePlatform extends okhttp3.internal.platform.Platform {
    public static final okhttp3.internal.platform.BouncyCastlePlatform.Companion Companion = null;
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

        public final okhttp3.internal.platform.BouncyCastlePlatform buildIfSupported() {
                r2 = this;
                boolean r0 = r2.isSupported()
                r1 = 0
                if (r0 == 0) goto Ld
                okhttp3.internal.platform.BouncyCastlePlatform r0 = new okhttp3.internal.platform.BouncyCastlePlatform
                r0.<init>(r1)
                return r0
            Ld:
                return r1
        }

        public final boolean isSupported() {
                r1 = this;
                boolean r0 = okhttp3.internal.platform.BouncyCastlePlatform.access$isSupported$cp()
                return r0
        }
    }

    static {
            okhttp3.internal.platform.BouncyCastlePlatform$Companion r0 = new okhttp3.internal.platform.BouncyCastlePlatform$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.BouncyCastlePlatform.Companion = r0
            r1 = 0
            java.lang.String r2 = "org.bouncycastle.jsse.provider.BouncyCastleJsseProvider"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L17
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L17
            java.lang.Class.forName(r2, r1, r0)     // Catch: java.lang.ClassNotFoundException -> L17
            r1 = 1
        L17:
            okhttp3.internal.platform.BouncyCastlePlatform.isSupported = r1
            return
    }

    private BouncyCastlePlatform() {
            r1 = this;
            r1.<init>()
            org.bouncycastle.jsse.provider.BouncyCastleJsseProvider r0 = new org.bouncycastle.jsse.provider.BouncyCastleJsseProvider
            r0.<init>()
            java.security.Provider r0 = (java.security.Provider) r0
            r1.provider = r0
            return
    }

    public /* synthetic */ BouncyCastlePlatform(gg.g r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ boolean access$isSupported$cp() {
            boolean r0 = okhttp3.internal.platform.BouncyCastlePlatform.isSupported
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List<okhttp3.Protocol> r3) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            super.configureTlsExtensions(r1, r2, r3)
            return
    }

    @Override // okhttp3.internal.platform.Platform
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            r1.getClass()
            java.lang.String r1 = super.getSelectedProtocol(r1)
            return r1
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
    public javax.net.ssl.X509TrustManager platformTrustManager() {
            r3 = this;
            java.lang.String r0 = "PKIX"
            java.lang.String r1 = "BCJSSE"
            javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance(r0, r1)
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

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory r2) {
            r1 = this;
            r2.getClass()
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with BouncyCastle"
            r2.<init>(r0)
            throw r2
    }
}
