package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidCertificateChainCleaner extends okhttp3.internal.tls.CertificateChainCleaner {
    public static final okhttp3.internal.platform.android.AndroidCertificateChainCleaner.Companion Companion = null;
    private final javax.net.ssl.X509TrustManager trustManager;
    private final android.net.http.X509TrustManagerExtensions x509TrustManagerExtensions;

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

        public final okhttp3.internal.platform.android.AndroidCertificateChainCleaner buildIfSupported(javax.net.ssl.X509TrustManager r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                android.net.http.X509TrustManagerExtensions r1 = new android.net.http.X509TrustManagerExtensions     // Catch: java.lang.IllegalArgumentException -> La
                r1.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> La
                goto Lb
            La:
                r1 = r0
            Lb:
                if (r1 == 0) goto L12
                okhttp3.internal.platform.android.AndroidCertificateChainCleaner r0 = new okhttp3.internal.platform.android.AndroidCertificateChainCleaner
                r0.<init>(r3, r1)
            L12:
                return r0
        }
    }

    static {
            okhttp3.internal.platform.android.AndroidCertificateChainCleaner$Companion r0 = new okhttp3.internal.platform.android.AndroidCertificateChainCleaner$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.android.AndroidCertificateChainCleaner.Companion = r0
            return
    }

    public AndroidCertificateChainCleaner(javax.net.ssl.X509TrustManager r1, android.net.http.X509TrustManagerExtensions r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.trustManager = r1
            r0.x509TrustManagerExtensions = r2
            return
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    public java.util.List<java.security.cert.Certificate> clean(java.util.List<? extends java.security.cert.Certificate> r3, java.lang.String r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            r0 = 0
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            java.lang.Object[] r3 = r3.toArray(r0)
            java.security.cert.X509Certificate[] r3 = (java.security.cert.X509Certificate[]) r3
            android.net.http.X509TrustManagerExtensions r0 = r2.x509TrustManagerExtensions     // Catch: java.security.cert.CertificateException -> L1b
            java.lang.String r1 = "RSA"
            java.util.List r3 = r0.checkServerTrusted(r3, r1, r4)     // Catch: java.security.cert.CertificateException -> L1b
            r3.getClass()     // Catch: java.security.cert.CertificateException -> L1b
            return r3
        L1b:
            r3 = move-exception
            javax.net.ssl.SSLPeerUnverifiedException r4 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.String r0 = r3.getMessage()
            r4.<init>(r0)
            r4.initCause(r3)
            throw r4
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okhttp3.internal.platform.android.AndroidCertificateChainCleaner
            if (r0 == 0) goto Le
            okhttp3.internal.platform.android.AndroidCertificateChainCleaner r2 = (okhttp3.internal.platform.android.AndroidCertificateChainCleaner) r2
            javax.net.ssl.X509TrustManager r2 = r2.trustManager
            javax.net.ssl.X509TrustManager r0 = r1.trustManager
            if (r2 != r0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            javax.net.ssl.X509TrustManager r0 = r1.trustManager
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }
}
