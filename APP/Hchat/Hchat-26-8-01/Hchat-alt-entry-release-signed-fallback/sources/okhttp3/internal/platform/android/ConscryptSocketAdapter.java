package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ConscryptSocketAdapter implements okhttp3.internal.platform.android.SocketAdapter {
    public static final okhttp3.internal.platform.android.ConscryptSocketAdapter.Companion Companion = null;
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
                okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = okhttp3.internal.platform.android.ConscryptSocketAdapter.access$getFactory$cp()
                return r0
        }
    }

    static {
            okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion r0 = new okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.android.ConscryptSocketAdapter.Companion = r0
            okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion$factory$1 r0 = new okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion$factory$1
            r0.<init>()
            okhttp3.internal.platform.android.ConscryptSocketAdapter.factory = r0
            return
    }

    public ConscryptSocketAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ okhttp3.internal.platform.android.DeferredSocketAdapter.Factory access$getFactory$cp() {
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = okhttp3.internal.platform.android.ConscryptSocketAdapter.factory
            return r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List<? extends okhttp3.Protocol> r3) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            boolean r2 = r0.matchesSocket(r1)
            if (r2 == 0) goto L22
            r2 = 1
            org.conscrypt.Conscrypt.setUseSessionTickets(r1, r2)
            okhttp3.internal.platform.Platform$Companion r2 = okhttp3.internal.platform.Platform.Companion
            java.util.List r2 = r2.alpnProtocolNames(r3)
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            org.conscrypt.Conscrypt.setApplicationProtocols(r1, r2)
        L22:
            return
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            r2.getClass()
            boolean r0 = r1.matchesSocket(r2)
            if (r0 == 0) goto Le
            java.lang.String r2 = org.conscrypt.Conscrypt.getApplicationProtocol(r2)
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
            r1 = this;
            okhttp3.internal.platform.ConscryptPlatform$Companion r0 = okhttp3.internal.platform.ConscryptPlatform.Companion
            boolean r0 = r0.isSupported()
            return r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            r1.getClass()
            boolean r1 = org.conscrypt.Conscrypt.isConscrypt(r1)
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
