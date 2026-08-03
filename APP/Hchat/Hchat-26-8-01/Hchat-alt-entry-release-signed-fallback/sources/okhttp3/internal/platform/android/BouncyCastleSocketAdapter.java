package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class BouncyCastleSocketAdapter implements okhttp3.internal.platform.android.SocketAdapter {
    public static final okhttp3.internal.platform.android.BouncyCastleSocketAdapter.Companion Companion = null;
    private static final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory factory = null;

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

        public final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory getFactory() {
                r1 = this;
                okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = okhttp3.internal.platform.android.BouncyCastleSocketAdapter.access$getFactory$cp()
                return r0
        }
    }

    static {
            okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion r0 = new okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.android.BouncyCastleSocketAdapter.Companion = r0
            okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion$factory$1 r0 = new okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion$factory$1
            r0.<init>()
            okhttp3.internal.platform.android.BouncyCastleSocketAdapter.factory = r0
            return
    }

    public BouncyCastleSocketAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ okhttp3.internal.platform.android.DeferredSocketAdapter.Factory access$getFactory$cp() {
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = okhttp3.internal.platform.android.BouncyCastleSocketAdapter.factory
            return r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(javax.net.ssl.SSLSocket r2, java.lang.String r3, java.util.List<? extends okhttp3.Protocol> r4) {
            r1 = this;
            r2.getClass()
            r4.getClass()
            boolean r3 = r1.matchesSocket(r2)
            if (r3 == 0) goto L27
            org.bouncycastle.jsse.BCSSLSocket r2 = (org.bouncycastle.jsse.BCSSLSocket) r2
            org.bouncycastle.jsse.BCSSLParameters r3 = r2.getParameters()
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            java.util.List r4 = r0.alpnProtocolNames(r4)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r4 = r4.toArray(r0)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r3.setApplicationProtocols(r4)
            r2.setParameters(r3)
        L27:
            return
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            r2.getClass()
            org.bouncycastle.jsse.BCSSLSocket r2 = (org.bouncycastle.jsse.BCSSLSocket) r2
            java.lang.String r2 = r2.getApplicationProtocol()
            if (r2 != 0) goto Ld
            r0 = 1
            goto L13
        Ld:
            java.lang.String r0 = ""
            boolean r0 = r2.equals(r0)
        L13:
            if (r0 == 0) goto L16
            r2 = 0
        L16:
            return r2
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
            r1 = this;
            okhttp3.internal.platform.BouncyCastlePlatform$Companion r0 = okhttp3.internal.platform.BouncyCastlePlatform.Companion
            boolean r0 = r0.isSupported()
            return r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            r1.getClass()
            r1 = 0
            return r1
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(javax.net.ssl.SSLSocketFactory r1) {
            r0 = this;
            boolean r1 = okhttp3.internal.platform.android.SocketAdapter.DefaultImpls.matchesSocketFactory(r0, r1)
            return r1
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory r1) {
            r0 = this;
            javax.net.ssl.X509TrustManager r1 = okhttp3.internal.platform.android.SocketAdapter.DefaultImpls.trustManager(r0, r1)
            return r1
    }
}
