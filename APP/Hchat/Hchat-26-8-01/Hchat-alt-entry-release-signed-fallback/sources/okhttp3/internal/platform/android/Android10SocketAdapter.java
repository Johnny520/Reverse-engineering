package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Android10SocketAdapter implements okhttp3.internal.platform.android.SocketAdapter {
    public static final okhttp3.internal.platform.android.Android10SocketAdapter.Companion Companion = null;

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

        public final okhttp3.internal.platform.android.SocketAdapter buildIfSupported() {
                r1 = this;
                boolean r0 = r1.isSupported()
                if (r0 == 0) goto Lc
                okhttp3.internal.platform.android.Android10SocketAdapter r0 = new okhttp3.internal.platform.android.Android10SocketAdapter
                r0.<init>()
                return r0
            Lc:
                r0 = 0
                return r0
        }

        public final boolean isSupported() {
                r2 = this;
                okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
                boolean r0 = r0.isAndroid()
                if (r0 == 0) goto L10
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L10
                r0 = 1
                return r0
            L10:
                r0 = 0
                return r0
        }
    }

    static {
            okhttp3.internal.platform.android.Android10SocketAdapter$Companion r0 = new okhttp3.internal.platform.android.Android10SocketAdapter$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.android.Android10SocketAdapter.Companion = r0
            return
    }

    public Android10SocketAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(javax.net.ssl.SSLSocket r2, java.lang.String r3, java.util.List<? extends okhttp3.Protocol> r4) {
            r1 = this;
            r2.getClass()
            r4.getClass()
            j2.b.r(r2)     // Catch: java.lang.IllegalArgumentException -> L23
            javax.net.ssl.SSLParameters r3 = r2.getSSLParameters()     // Catch: java.lang.IllegalArgumentException -> L23
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.IllegalArgumentException -> L23
            java.util.List r4 = r0.alpnProtocolNames(r4)     // Catch: java.lang.IllegalArgumentException -> L23
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.IllegalArgumentException -> L23
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch: java.lang.IllegalArgumentException -> L23
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch: java.lang.IllegalArgumentException -> L23
            j2.b.q(r3, r4)     // Catch: java.lang.IllegalArgumentException -> L23
            r2.setSSLParameters(r3)     // Catch: java.lang.IllegalArgumentException -> L23
            return
        L23:
            r2 = move-exception
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Android internal error"
            r3.<init>(r4, r2)
            throw r3
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r2 = j2.b.g(r2)
            if (r2 != 0) goto Lb
            r0 = 1
            goto L11
        Lb:
            java.lang.String r0 = ""
            boolean r0 = r2.equals(r0)
        L11:
            if (r0 == 0) goto L14
            r2 = 0
        L14:
            return r2
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
            r1 = this;
            okhttp3.internal.platform.android.Android10SocketAdapter$Companion r0 = okhttp3.internal.platform.android.Android10SocketAdapter.Companion
            boolean r0 = r0.isSupported()
            return r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            r1.getClass()
            boolean r1 = j2.b.t(r1)
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
