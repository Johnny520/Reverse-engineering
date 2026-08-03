package okhttp3.internal.platform;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Jdk9Platform extends okhttp3.internal.platform.Platform {
    public static final okhttp3.internal.platform.Jdk9Platform.Companion Companion = null;
    private static final boolean isAvailable = false;

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

        public final okhttp3.internal.platform.Jdk9Platform buildIfSupported() {
                r1 = this;
                boolean r0 = r1.isAvailable()
                if (r0 == 0) goto Lc
                okhttp3.internal.platform.Jdk9Platform r0 = new okhttp3.internal.platform.Jdk9Platform
                r0.<init>()
                return r0
            Lc:
                r0 = 0
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
            if (r0 == 0) goto L17
            r2 = 10
            java.lang.Integer r0 = og.t.e0(r2, r0)
            goto L18
        L17:
            r0 = r1
        L18:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L26
            int r0 = r0.intValue()
            r1 = 9
            if (r0 < r1) goto L2e
        L24:
            r2 = r3
            goto L2e
        L26:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r4 = "getApplicationProtocol"
            r0.getMethod(r4, r1)     // Catch: java.lang.NoSuchMethodException -> L2e
            goto L24
        L2e:
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
    public void configureTlsExtensions(javax.net.ssl.SSLSocket r2, java.lang.String r3, java.util.List<okhttp3.Protocol> r4) {
            r1 = this;
            r2.getClass()
            r4.getClass()
            javax.net.ssl.SSLParameters r3 = r2.getSSLParameters()
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            java.util.List r4 = r0.alpnProtocolNames(r4)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r4 = r4.toArray(r0)
            java.lang.String[] r4 = (java.lang.String[]) r4
            j2.b.q(r3, r4)
            r2.setSSLParameters(r3)
            return
    }

    @Override // okhttp3.internal.platform.Platform
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r2 = j2.b.g(r2)     // Catch: java.lang.UnsupportedOperationException -> L15
            if (r2 != 0) goto Lb
            r0 = 1
            goto L11
        Lb:
            java.lang.String r0 = ""
            boolean r0 = r2.equals(r0)     // Catch: java.lang.UnsupportedOperationException -> L15
        L11:
            if (r0 == 0) goto L14
            goto L15
        L14:
            return r2
        L15:
            r2 = 0
            return r2
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory r2) {
            r1 = this;
            r2.getClass()
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+"
            r2.<init>(r0)
            throw r2
    }
}
