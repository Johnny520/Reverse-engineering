package okhttp3.internal.platform;

/* JADX INFO: compiled from: Jdk9Platform.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\nH\u0017J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0013"}, m115d2 = {"Lokhttp3/internal/platform/Jdk9Platform;", "Lokhttp3/internal/platform/Platform;", "()V", "configureTlsExtensions", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "hostname", "", "protocols", "", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "getSelectedProtocol", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public class Jdk9Platform extends okhttp3.internal.platform.Platform {
    public static final okhttp3.internal.platform.Jdk9Platform.Companion Companion = null;
    private static final boolean isAvailable = false;

    /* JADX INFO: compiled from: Jdk9Platform.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, m115d2 = {"Lokhttp3/internal/platform/Jdk9Platform$Companion;", "", "()V", "isAvailable", "", "()Z", "buildIfSupported", "Lokhttp3/internal/platform/Jdk9Platform;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

        public final okhttp3.internal.platform.Jdk9Platform buildIfSupported() {
                r1 = this;
                boolean r0 = r1.isAvailable()
                if (r0 == 0) goto Lc
                okhttp3.internal.platform.Jdk9Platform r0 = new okhttp3.internal.platform.Jdk9Platform
                r0.<init>()
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        public final boolean isAvailable() {
                r1 = this;
                boolean r0 = okhttp3.internal.platform.Jdk9Platform.access$isAvailable$cp()
                return r0
        }
    }

    static {
            okhttp3.internal.platform.Jdk9Platform$Companion r0 = new okhttp3.internal.platform.Jdk9Platform$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.Jdk9Platform.Companion = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L15
            java.lang.Integer r1 = kotlin.text.StringsKt.toIntOrNull(r0)
        L15:
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L24
            int r4 = r1.intValue()
            r5 = 9
            if (r4 < r5) goto L22
            goto L31
        L22:
            r2 = r3
            goto L31
        L24:
            java.lang.Class<javax.net.ssl.SSLSocket> r4 = javax.net.ssl.SSLSocket.class
            java.lang.String r5 = "getApplicationProtocol"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L2e
            r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L2e
            goto L30
        L2e:
            r2 = move-exception
            r2 = r3
        L30:
        L31:
            okhttp3.internal.platform.Jdk9Platform.isAvailable = r2
            return
    }

    public Jdk9Platform() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ boolean access$isAvailable$cp() {
            boolean r0 = okhttp3.internal.platform.Jdk9Platform.isAvailable
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(javax.net.ssl.SSLSocket r7, java.lang.String r8, java.util.List<okhttp3.Protocol> r9) {
            r6 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "protocols"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            javax.net.ssl.SSLParameters r0 = r7.getSSLParameters()
            okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion
            java.util.List r1 = r1.alpnProtocolNames(r9)
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = 0
            r4 = r2
            r5 = 0
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.Object[] r2 = r4.toArray(r5)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.setApplicationProtocols(r2)
            r7.setSSLParameters(r0)
            return
    }

    @Override // okhttp3.internal.platform.Platform
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r4) {
            r3 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            java.lang.String r1 = r4.getApplicationProtocol()     // Catch: java.lang.UnsupportedOperationException -> L1a
            if (r1 != 0) goto Lf
            r2 = 1
            goto L15
        Lf:
            java.lang.String r2 = ""
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)     // Catch: java.lang.UnsupportedOperationException -> L1a
        L15:
            if (r2 == 0) goto L18
            goto L19
        L18:
            r0 = r1
        L19:
            return r0
        L1a:
            r1 = move-exception
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory r3) {
            r2 = this;
            java.lang.String r0 = "sslSocketFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+"
            r0.<init>(r1)
            throw r0
    }
}
