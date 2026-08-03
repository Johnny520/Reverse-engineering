package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class StandardAndroidSocketAdapter extends okhttp3.internal.platform.android.AndroidSocketAdapter {
    public static final okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion Companion = null;
    private final java.lang.Class<?> paramClass;
    private final java.lang.Class<? super javax.net.ssl.SSLSocketFactory> sslSocketFactoryClass;

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

        public static /* synthetic */ okhttp3.internal.platform.android.SocketAdapter buildIfSupported$default(okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion r0, java.lang.String r1, int r2, java.lang.Object r3) {
                r2 = r2 & 1
                if (r2 == 0) goto L6
                java.lang.String r1 = "com.android.org.conscrypt"
            L6:
                okhttp3.internal.platform.android.SocketAdapter r0 = r0.buildIfSupported(r1)
                return r0
        }

        public final okhttp3.internal.platform.android.SocketAdapter buildIfSupported(java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = ".SSLParametersImpl"
                java.lang.String r1 = ".OpenSSLSocketFactoryImpl"
                java.lang.String r2 = ".OpenSSLSocketImpl"
                r4.getClass()
                java.lang.String r2 = r4.concat(r2)     // Catch: java.lang.Exception -> L27
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L27
                java.lang.String r1 = r4.concat(r1)     // Catch: java.lang.Exception -> L27
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L27
                java.lang.String r4 = r4.concat(r0)     // Catch: java.lang.Exception -> L27
                java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L27
                okhttp3.internal.platform.android.StandardAndroidSocketAdapter r0 = new okhttp3.internal.platform.android.StandardAndroidSocketAdapter     // Catch: java.lang.Exception -> L27
                r0.<init>(r2, r1, r4)     // Catch: java.lang.Exception -> L27
                return r0
            L27:
                r4 = move-exception
                okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
                okhttp3.internal.platform.Platform r0 = r0.get()
                java.lang.String r1 = "unable to load android socket classes"
                r2 = 5
                r0.log(r1, r2, r4)
                r4 = 0
                return r4
        }
    }

    static {
            okhttp3.internal.platform.android.StandardAndroidSocketAdapter$Companion r0 = new okhttp3.internal.platform.android.StandardAndroidSocketAdapter$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion = r0
            return
    }

    public StandardAndroidSocketAdapter(java.lang.Class<? super javax.net.ssl.SSLSocket> r1, java.lang.Class<? super javax.net.ssl.SSLSocketFactory> r2, java.lang.Class<?> r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>(r1)
            r0.sslSocketFactoryClass = r2
            r0.paramClass = r3
            return
    }

    @Override // okhttp3.internal.platform.android.AndroidSocketAdapter, okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(javax.net.ssl.SSLSocketFactory r2) {
            r1 = this;
            r2.getClass()
            java.lang.Class<? super javax.net.ssl.SSLSocketFactory> r0 = r1.sslSocketFactoryClass
            boolean r2 = r0.isInstance(r2)
            return r2
    }

    @Override // okhttp3.internal.platform.android.AndroidSocketAdapter, okhttp3.internal.platform.android.SocketAdapter
    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory r3) {
            r2 = this;
            r3.getClass()
            java.lang.Class<?> r0 = r2.paramClass
            java.lang.String r1 = "sslParameters"
            java.lang.Object r3 = okhttp3.internal.Util.readFieldOrNull(r3, r0, r1)
            r3.getClass()
            java.lang.String r0 = "x509TrustManager"
            java.lang.Class<javax.net.ssl.X509TrustManager> r1 = javax.net.ssl.X509TrustManager.class
            java.lang.Object r0 = okhttp3.internal.Util.readFieldOrNull(r3, r1, r0)
            javax.net.ssl.X509TrustManager r0 = (javax.net.ssl.X509TrustManager) r0
            if (r0 != 0) goto L23
            java.lang.String r0 = "trustManager"
            java.lang.Object r3 = okhttp3.internal.Util.readFieldOrNull(r3, r1, r0)
            javax.net.ssl.X509TrustManager r3 = (javax.net.ssl.X509TrustManager) r3
            return r3
        L23:
            return r0
    }
}
