package okhttp3.internal.platform;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidPlatform extends okhttp3.internal.platform.Platform {
    public static final okhttp3.internal.platform.AndroidPlatform.Companion Companion = null;
    private static final boolean isSupported = false;
    private final okhttp3.internal.platform.android.CloseGuard closeGuard;
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
                okhttp3.internal.platform.AndroidPlatform r0 = new okhttp3.internal.platform.AndroidPlatform
                r0.<init>()
                return r0
            Lc:
                r0 = 0
                return r0
        }

        public final boolean isSupported() {
                r1 = this;
                boolean r0 = okhttp3.internal.platform.AndroidPlatform.access$isSupported$cp()
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class CustomTrustRootIndex implements okhttp3.internal.tls.TrustRootIndex {
        private final java.lang.reflect.Method findByIssuerAndSignatureMethod;
        private final javax.net.ssl.X509TrustManager trustManager;

        public CustomTrustRootIndex(javax.net.ssl.X509TrustManager r1, java.lang.reflect.Method r2) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                r0.<init>()
                r0.trustManager = r1
                r0.findByIssuerAndSignatureMethod = r2
                return
        }

        private final javax.net.ssl.X509TrustManager component1() {
                r1 = this;
                javax.net.ssl.X509TrustManager r0 = r1.trustManager
                return r0
        }

        private final java.lang.reflect.Method component2() {
                r1 = this;
                java.lang.reflect.Method r0 = r1.findByIssuerAndSignatureMethod
                return r0
        }

        public static /* synthetic */ okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex copy$default(okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex r0, javax.net.ssl.X509TrustManager r1, java.lang.reflect.Method r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                javax.net.ssl.X509TrustManager r1 = r0.trustManager
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                java.lang.reflect.Method r2 = r0.findByIssuerAndSignatureMethod
            Lc:
                okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex r0 = r0.copy(r1, r2)
                return r0
        }

        public final okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex copy(javax.net.ssl.X509TrustManager r2, java.lang.reflect.Method r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex r0 = new okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex r5 = (okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex) r5
                javax.net.ssl.X509TrustManager r1 = r4.trustManager
                javax.net.ssl.X509TrustManager r3 = r5.trustManager
                boolean r1 = gg.l.a(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.reflect.Method r1 = r4.findByIssuerAndSignatureMethod
                java.lang.reflect.Method r5 = r5.findByIssuerAndSignatureMethod
                boolean r5 = gg.l.a(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        public java.security.cert.X509Certificate findByIssuerAndSignature(java.security.cert.X509Certificate r3) {
                r2 = this;
                r3.getClass()
                java.lang.reflect.Method r0 = r2.findByIssuerAndSignatureMethod     // Catch: java.lang.IllegalAccessException -> L19 java.lang.reflect.InvocationTargetException -> L1b
                javax.net.ssl.X509TrustManager r1 = r2.trustManager     // Catch: java.lang.IllegalAccessException -> L19 java.lang.reflect.InvocationTargetException -> L1b
                java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.IllegalAccessException -> L19 java.lang.reflect.InvocationTargetException -> L1b
                java.lang.Object r3 = r0.invoke(r1, r3)     // Catch: java.lang.IllegalAccessException -> L19 java.lang.reflect.InvocationTargetException -> L1b
                r3.getClass()     // Catch: java.lang.IllegalAccessException -> L19 java.lang.reflect.InvocationTargetException -> L1b
                java.security.cert.TrustAnchor r3 = (java.security.cert.TrustAnchor) r3     // Catch: java.lang.IllegalAccessException -> L19 java.lang.reflect.InvocationTargetException -> L1b
                java.security.cert.X509Certificate r3 = r3.getTrustedCert()     // Catch: java.lang.IllegalAccessException -> L19 java.lang.reflect.InvocationTargetException -> L1b
                return r3
            L19:
                r3 = move-exception
                goto L1d
            L1b:
                r3 = 0
                return r3
            L1d:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "unable to get issues and signature"
                r0.<init>(r1, r3)
                throw r0
        }

        public int hashCode() {
                r2 = this;
                javax.net.ssl.X509TrustManager r0 = r2.trustManager
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.reflect.Method r1 = r2.findByIssuerAndSignatureMethod
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "CustomTrustRootIndex(trustManager="
                r0.<init>(r1)
                javax.net.ssl.X509TrustManager r1 = r2.trustManager
                r0.append(r1)
                java.lang.String r1 = ", findByIssuerAndSignatureMethod="
                r0.append(r1)
                java.lang.reflect.Method r1 = r2.findByIssuerAndSignatureMethod
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            okhttp3.internal.platform.AndroidPlatform$Companion r0 = new okhttp3.internal.platform.AndroidPlatform$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.AndroidPlatform.Companion = r0
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            boolean r0 = r0.isAndroid()
            r1 = 0
            if (r0 != 0) goto L12
            goto L1a
        L12:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 < r2) goto L19
            goto L1a
        L19:
            r1 = 1
        L1a:
            okhttp3.internal.platform.AndroidPlatform.isSupported = r1
            return
    }

    public AndroidPlatform() {
            r7 = this;
            r7.<init>()
            okhttp3.internal.platform.android.StandardAndroidSocketAdapter$Companion r0 = okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion
            r1 = 0
            r2 = 1
            okhttp3.internal.platform.android.SocketAdapter r0 = okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion.buildIfSupported$default(r0, r1, r2, r1)
            okhttp3.internal.platform.android.DeferredSocketAdapter r1 = new okhttp3.internal.platform.android.DeferredSocketAdapter
            okhttp3.internal.platform.android.AndroidSocketAdapter$Companion r3 = okhttp3.internal.platform.android.AndroidSocketAdapter.Companion
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r3 = r3.getPlayProviderFactory()
            r1.<init>(r3)
            okhttp3.internal.platform.android.DeferredSocketAdapter r3 = new okhttp3.internal.platform.android.DeferredSocketAdapter
            okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion r4 = okhttp3.internal.platform.android.ConscryptSocketAdapter.Companion
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r4 = r4.getFactory()
            r3.<init>(r4)
            okhttp3.internal.platform.android.DeferredSocketAdapter r4 = new okhttp3.internal.platform.android.DeferredSocketAdapter
            okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion r5 = okhttp3.internal.platform.android.BouncyCastleSocketAdapter.Companion
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r5 = r5.getFactory()
            r4.<init>(r5)
            r5 = 4
            okhttp3.internal.platform.android.SocketAdapter[] r5 = new okhttp3.internal.platform.android.SocketAdapter[r5]
            r6 = 0
            r5[r6] = r0
            r5[r2] = r1
            r0 = 2
            r5[r0] = r3
            r0 = 3
            r5[r0] = r4
            java.util.ArrayList r0 = a.a.z0(r5)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L47:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r0.next()
            r3 = r2
            okhttp3.internal.platform.android.SocketAdapter r3 = (okhttp3.internal.platform.android.SocketAdapter) r3
            boolean r3 = r3.isSupported()
            if (r3 == 0) goto L47
            r1.add(r2)
            goto L47
        L5e:
            r7.socketAdapters = r1
            okhttp3.internal.platform.android.CloseGuard$Companion r0 = okhttp3.internal.platform.android.CloseGuard.Companion
            okhttp3.internal.platform.android.CloseGuard r0 = r0.get()
            r7.closeGuard = r0
            return
    }

    public static final /* synthetic */ boolean access$isSupported$cp() {
            boolean r0 = okhttp3.internal.platform.AndroidPlatform.isSupported
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
    public okhttp3.internal.tls.TrustRootIndex buildTrustRootIndex(javax.net.ssl.X509TrustManager r4) {
            r3 = this;
            r4.getClass()
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.NoSuchMethodException -> L1d
            java.lang.String r1 = "findTrustAnchorByIssuerAndSignature"
            java.lang.Class<java.security.cert.X509Certificate> r2 = java.security.cert.X509Certificate.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.NoSuchMethodException -> L1d
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1d
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L1d
            okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex r1 = new okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex     // Catch: java.lang.NoSuchMethodException -> L1d
            r1.<init>(r4, r0)     // Catch: java.lang.NoSuchMethodException -> L1d
            return r1
        L1d:
            okhttp3.internal.tls.TrustRootIndex r4 = super.buildTrustRootIndex(r4)
            return r4
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(javax.net.ssl.SSLSocket r4, java.lang.String r5, java.util.List<okhttp3.Protocol> r6) {
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
    public void connectSocket(java.net.Socket r1, java.net.InetSocketAddress r2, int r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r1.connect(r2, r3)
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
    public java.lang.Object getStackTraceForCloseable(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            okhttp3.internal.platform.android.CloseGuard r0 = r1.closeGuard
            java.lang.Object r2 = r0.createAndOpen(r2)
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
    public void logCloseableLeak(java.lang.String r7, java.lang.Object r8) {
            r6 = this;
            r7.getClass()
            okhttp3.internal.platform.android.CloseGuard r0 = r6.closeGuard
            boolean r8 = r0.warnIfOpen(r8)
            if (r8 != 0) goto L14
            r4 = 4
            r5 = 0
            r2 = 5
            r3 = 0
            r0 = r6
            r1 = r7
            okhttp3.internal.platform.Platform.log$default(r0, r1, r2, r3, r4, r5)
        L14:
            return
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
