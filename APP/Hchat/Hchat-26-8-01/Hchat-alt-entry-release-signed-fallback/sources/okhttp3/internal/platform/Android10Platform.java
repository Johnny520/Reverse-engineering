package okhttp3.internal.platform;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Android10Platform extends okhttp3.internal.platform.Platform {
    public static final okhttp3.internal.platform.Android10Platform.Companion Companion = null;
    private static final boolean isSupported = false;
    private final java.util.List<okhttp3.internal.platform.android.SocketAdapter> socketAdapters;

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

        public final okhttp3.internal.platform.Platform buildIfSupported() {
                r1 = this;
                boolean r0 = r1.isSupported()
                if (r0 == 0) goto Lc
                okhttp3.internal.platform.Android10Platform r0 = new okhttp3.internal.platform.Android10Platform
                r0.<init>()
                return r0
            Lc:
                r0 = 0
                return r0
        }

        public final boolean isSupported() {
                r1 = this;
                boolean r0 = okhttp3.internal.platform.Android10Platform.access$isSupported$cp()
                return r0
        }
    }

    static {
            okhttp3.internal.platform.Android10Platform$Companion r0 = new okhttp3.internal.platform.Android10Platform$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.Android10Platform.Companion = r0
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            boolean r0 = r0.isAndroid()
            if (r0 == 0) goto L18
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            okhttp3.internal.platform.Android10Platform.isSupported = r0
            return
    }

    public Android10Platform() {
            r6 = this;
            r6.<init>()
            okhttp3.internal.platform.android.Android10SocketAdapter$Companion r0 = okhttp3.internal.platform.android.Android10SocketAdapter.Companion
            okhttp3.internal.platform.android.SocketAdapter r0 = r0.buildIfSupported()
            okhttp3.internal.platform.android.DeferredSocketAdapter r1 = new okhttp3.internal.platform.android.DeferredSocketAdapter
            okhttp3.internal.platform.android.AndroidSocketAdapter$Companion r2 = okhttp3.internal.platform.android.AndroidSocketAdapter.Companion
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r2 = r2.getPlayProviderFactory()
            r1.<init>(r2)
            okhttp3.internal.platform.android.DeferredSocketAdapter r2 = new okhttp3.internal.platform.android.DeferredSocketAdapter
            okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion r3 = okhttp3.internal.platform.android.ConscryptSocketAdapter.Companion
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r3 = r3.getFactory()
            r2.<init>(r3)
            okhttp3.internal.platform.android.DeferredSocketAdapter r3 = new okhttp3.internal.platform.android.DeferredSocketAdapter
            okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion r4 = okhttp3.internal.platform.android.BouncyCastleSocketAdapter.Companion
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r4 = r4.getFactory()
            r3.<init>(r4)
            r4 = 4
            okhttp3.internal.platform.android.SocketAdapter[] r4 = new okhttp3.internal.platform.android.SocketAdapter[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r0 = 3
            r4[r0] = r3
            java.util.ArrayList r0 = a.a.z0(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L46:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5d
            java.lang.Object r2 = r0.next()
            r3 = r2
            okhttp3.internal.platform.android.SocketAdapter r3 = (okhttp3.internal.platform.android.SocketAdapter) r3
            boolean r3 = r3.isSupported()
            if (r3 == 0) goto L46
            r1.add(r2)
            goto L46
        L5d:
            r6.socketAdapters = r1
            return
    }

    public static final /* synthetic */ boolean access$isSupported$cp() {
            boolean r0 = okhttp3.internal.platform.Android10Platform.isSupported
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    public okhttp3.internal.tls.CertificateChainCleaner buildCertificateChainCleaner(javax.net.ssl.X509TrustManager r2) {
            r1 = this;
            r2.getClass()
            okhttp3.internal.platform.android.AndroidCertificateChainCleaner$Companion r0 = okhttp3.internal.platform.android.AndroidCertificateChainCleaner.Companion
            okhttp3.internal.platform.android.AndroidCertificateChainCleaner r0 = r0.buildIfSupported(r2)
            if (r0 == 0) goto Lc
            return r0
        Lc:
            okhttp3.internal.tls.CertificateChainCleaner r2 = super.buildCertificateChainCleaner(r2)
            return r2
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(javax.net.ssl.SSLSocket r4, java.lang.String r5, java.util.List<? extends okhttp3.Protocol> r6) {
            r3 = this;
            r4.getClass()
            r6.getClass()
            java.util.List<okhttp3.internal.platform.android.SocketAdapter> r0 = r3.socketAdapters
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            r2 = r1
            okhttp3.internal.platform.android.SocketAdapter r2 = (okhttp3.internal.platform.android.SocketAdapter) r2
            boolean r2 = r2.matchesSocket(r4)
            if (r2 == 0) goto Lc
            goto L21
        L20:
            r1 = 0
        L21:
            okhttp3.internal.platform.android.SocketAdapter r1 = (okhttp3.internal.platform.android.SocketAdapter) r1
            if (r1 == 0) goto L28
            r1.configureTlsExtensions(r4, r5, r6)
        L28:
            return
    }

    @Override // okhttp3.internal.platform.Platform
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r5) {
            r4 = this;
            r5.getClass()
            java.util.List<okhttp3.internal.platform.android.SocketAdapter> r0 = r4.socketAdapters
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            r3 = r1
            okhttp3.internal.platform.android.SocketAdapter r3 = (okhttp3.internal.platform.android.SocketAdapter) r3
            boolean r3 = r3.matchesSocket(r5)
            if (r3 == 0) goto L9
            goto L1f
        L1e:
            r1 = r2
        L1f:
            okhttp3.internal.platform.android.SocketAdapter r1 = (okhttp3.internal.platform.android.SocketAdapter) r1
            if (r1 == 0) goto L28
            java.lang.String r5 = r1.getSelectedProtocol(r5)
            return r5
        L28:
            return r2
    }

    @Override // okhttp3.internal.platform.Platform
    public boolean isCleartextTrafficPermitted(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            android.security.NetworkSecurityPolicy r0 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r2 = r0.isCleartextTrafficPermitted(r2)
            return r2
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory r5) {
            r4 = this;
            r5.getClass()
            java.util.List<okhttp3.internal.platform.android.SocketAdapter> r0 = r4.socketAdapters
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            r3 = r1
            okhttp3.internal.platform.android.SocketAdapter r3 = (okhttp3.internal.platform.android.SocketAdapter) r3
            boolean r3 = r3.matchesSocketFactory(r5)
            if (r3 == 0) goto L9
            goto L1f
        L1e:
            r1 = r2
        L1f:
            okhttp3.internal.platform.android.SocketAdapter r1 = (okhttp3.internal.platform.android.SocketAdapter) r1
            if (r1 == 0) goto L28
            javax.net.ssl.X509TrustManager r5 = r1.trustManager(r5)
            return r5
        L28:
            return r2
    }
}
