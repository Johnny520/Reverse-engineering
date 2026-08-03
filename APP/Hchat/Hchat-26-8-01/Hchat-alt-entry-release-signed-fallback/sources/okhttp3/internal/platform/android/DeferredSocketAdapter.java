package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class DeferredSocketAdapter implements okhttp3.internal.platform.android.SocketAdapter {
    private okhttp3.internal.platform.android.SocketAdapter delegate;
    private final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory socketAdapterFactory;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface Factory {
        okhttp3.internal.platform.android.SocketAdapter create(javax.net.ssl.SSLSocket r1);

        boolean matchesSocket(javax.net.ssl.SSLSocket r1);
    }

    public DeferredSocketAdapter(okhttp3.internal.platform.android.DeferredSocketAdapter.Factory r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.socketAdapterFactory = r1
            return
    }

    private final synchronized okhttp3.internal.platform.android.SocketAdapter getDelegate(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            monitor-enter(r1)
            okhttp3.internal.platform.android.SocketAdapter r0 = r1.delegate     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = r1.socketAdapterFactory     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.matchesSocket(r2)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L18
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = r1.socketAdapterFactory     // Catch: java.lang.Throwable -> L16
            okhttp3.internal.platform.android.SocketAdapter r2 = r0.create(r2)     // Catch: java.lang.Throwable -> L16
            r1.delegate = r2     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r2 = move-exception
            goto L1c
        L18:
            okhttp3.internal.platform.android.SocketAdapter r2 = r1.delegate     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)
            return r2
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(javax.net.ssl.SSLSocket r2, java.lang.String r3, java.util.List<? extends okhttp3.Protocol> r4) {
            r1 = this;
            r2.getClass()
            r4.getClass()
            okhttp3.internal.platform.android.SocketAdapter r0 = r1.getDelegate(r2)
            if (r0 == 0) goto Lf
            r0.configureTlsExtensions(r2, r3, r4)
        Lf:
            return
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            r2.getClass()
            okhttp3.internal.platform.android.SocketAdapter r0 = r1.getDelegate(r2)
            if (r0 == 0) goto Le
            java.lang.String r2 = r0.getSelectedProtocol(r2)
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            r2.getClass()
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = r1.socketAdapterFactory
            boolean r2 = r0.matchesSocket(r2)
            return r2
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
