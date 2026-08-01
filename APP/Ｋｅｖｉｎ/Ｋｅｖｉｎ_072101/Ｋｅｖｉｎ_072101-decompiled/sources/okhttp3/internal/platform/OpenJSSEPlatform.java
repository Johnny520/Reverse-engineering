package okhttp3.internal.platform;

/* JADX INFO: compiled from: OpenJSSEPlatform.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e0\fH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m115d2 = {"Lokhttp3/internal/platform/OpenJSSEPlatform;", "Lokhttp3/internal/platform/Platform;", "()V", "provider", "Ljava/security/Provider;", "configureTlsExtensions", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "hostname", "", "protocols", "", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "getSelectedProtocol", "newSSLContext", "Ljavax/net/ssl/SSLContext;", "platformTrustManager", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class OpenJSSEPlatform extends okhttp3.internal.platform.Platform {
    public static final okhttp3.internal.platform.OpenJSSEPlatform.Companion Companion = null;
    private static final boolean isSupported = false;
    private final java.security.Provider provider;

    /* JADX INFO: compiled from: OpenJSSEPlatform.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, m115d2 = {"Lokhttp3/internal/platform/OpenJSSEPlatform$Companion;", "", "()V", "isSupported", "", "()Z", "buildIfSupported", "Lokhttp3/internal/platform/OpenJSSEPlatform;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final okhttp3.internal.platform.OpenJSSEPlatform buildIfSupported() {
                r2 = this;
                boolean r0 = r2.isSupported()
                r1 = 0
                if (r0 == 0) goto Ld
                okhttp3.internal.platform.OpenJSSEPlatform r0 = new okhttp3.internal.platform.OpenJSSEPlatform
                r0.<init>(r1)
                r1 = r0
            Ld:
                return r1
        }

        public final boolean isSupported() {
                r1 = this;
                boolean r0 = okhttp3.internal.platform.OpenJSSEPlatform.access$isSupported$cp()
                return r0
        }
    }

    static {
            okhttp3.internal.platform.OpenJSSEPlatform$Companion r0 = new okhttp3.internal.platform.OpenJSSEPlatform$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.OpenJSSEPlatform.Companion = r0
            r0 = 0
            java.lang.String r1 = "org.openjsse.net.ssl.OpenJSSE"
            okhttp3.internal.platform.OpenJSSEPlatform$Companion r2 = okhttp3.internal.platform.OpenJSSEPlatform.Companion     // Catch: java.lang.ClassNotFoundException -> L1b
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.ClassNotFoundException -> L1b
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1b
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.ClassNotFoundException -> L1b
            r0 = 1
            goto L1d
        L1b:
            r1 = move-exception
        L1d:
            okhttp3.internal.platform.OpenJSSEPlatform.isSupported = r0
            return
    }

    private OpenJSSEPlatform() {
            r1 = this;
            r1.<init>()
            org.openjsse.net.ssl.OpenJSSE r0 = new org.openjsse.net.ssl.OpenJSSE
            r0.<init>()
            java.security.Provider r0 = (java.security.Provider) r0
            r1.provider = r0
            return
    }

    public /* synthetic */ OpenJSSEPlatform(kotlin.jvm.internal.DefaultConstructorMarker r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ boolean access$isSupported$cp() {
            boolean r0 = okhttp3.internal.platform.OpenJSSEPlatform.isSupported
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(javax.net.ssl.SSLSocket r8, java.lang.String r9, java.util.List<okhttp3.Protocol> r10) {
            r7 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "protocols"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            boolean r0 = r8 instanceof org.openjsse.javax.net.ssl.SSLSocket
            if (r0 == 0) goto L3a
            r0 = r8
            org.openjsse.javax.net.ssl.SSLSocket r0 = (org.openjsse.javax.net.ssl.SSLSocket) r0
            javax.net.ssl.SSLParameters r0 = r0.getSSLParameters()
            boolean r1 = r0 instanceof org.openjsse.javax.net.ssl.SSLParameters
            if (r1 == 0) goto L3d
            okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion
            java.util.List r1 = r1.alpnProtocolNames(r10)
            r2 = r0
            org.openjsse.javax.net.ssl.SSLParameters r2 = (org.openjsse.javax.net.ssl.SSLParameters) r2
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            r4 = 0
            r5 = r3
            r6 = 0
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r3 = r5.toArray(r6)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r2.setApplicationProtocols(r3)
            r2 = r8
            org.openjsse.javax.net.ssl.SSLSocket r2 = (org.openjsse.javax.net.ssl.SSLSocket) r2
            r2.setSSLParameters(r0)
            goto L3d
        L3a:
            super.configureTlsExtensions(r8, r9, r10)
        L3d:
            return
    }

    @Override // okhttp3.internal.platform.Platform
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r3) {
            r2 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3 instanceof org.openjsse.javax.net.ssl.SSLSocket
            if (r0 == 0) goto L21
            r0 = r3
            org.openjsse.javax.net.ssl.SSLSocket r0 = (org.openjsse.javax.net.ssl.SSLSocket) r0
            java.lang.String r0 = r0.getApplicationProtocol()
            if (r0 != 0) goto L14
            r1 = 1
            goto L1a
        L14:
            java.lang.String r1 = ""
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
        L1a:
            if (r1 == 0) goto L1f
            r1 = 0
            r0 = r1
            goto L25
        L1f:
            goto L25
        L21:
            java.lang.String r0 = super.getSelectedProtocol(r3)
        L25:
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.SSLContext newSSLContext() {
            r2 = this;
            java.lang.String r0 = "TLSv1.3"
            java.security.Provider r1 = r2.provider
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0, r1)
            java.lang.String r1 = "getInstance(\"TLSv1.3\", provider)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.X509TrustManager platformTrustManager() {
            r6 = this;
            java.lang.String r0 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()
            java.security.Provider r1 = r6.provider
            javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance(r0, r1)
            r1 = 0
            r0.init(r1)
            javax.net.ssl.TrustManager[] r1 = r0.getTrustManagers()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r2 = r1.length
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L21
            r2 = r1[r3]
            boolean r2 = r2 instanceof javax.net.ssl.X509TrustManager
            if (r2 == 0) goto L21
            goto L22
        L21:
            r4 = r3
        L22:
            if (r4 == 0) goto L2e
            r2 = r1[r3]
            java.lang.String r3 = "null cannot be cast to non-null type javax.net.ssl.X509TrustManager"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
            javax.net.ssl.X509TrustManager r2 = (javax.net.ssl.X509TrustManager) r2
            return r2
        L2e:
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected default trust managers: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = java.util.Arrays.toString(r1)
            java.lang.String r5 = "toString(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory r3) {
            r2 = this;
            java.lang.String r0 = "sslSocketFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with OpenJSSE"
            r0.<init>(r1)
            throw r0
    }
}
