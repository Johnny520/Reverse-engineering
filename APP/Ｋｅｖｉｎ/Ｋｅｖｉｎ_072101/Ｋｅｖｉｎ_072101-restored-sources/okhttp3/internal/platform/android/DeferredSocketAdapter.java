package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: DeferredSocketAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\tH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m115d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "socketAdapterFactory", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "(Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;)V", "delegate", "configureTlsExtensions", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "hostname", "", "protocols", "", "Lokhttp3/Protocol;", "getDelegate", "getSelectedProtocol", "isSupported", "", "matchesSocket", "Factory", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class DeferredSocketAdapter implements okhttp3.internal.platform.android.SocketAdapter {
    private okhttp3.internal.platform.android.SocketAdapter delegate;
    private final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory socketAdapterFactory;

    /* JADX INFO: compiled from: DeferredSocketAdapter.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, m115d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "", "create", "Lokhttp3/internal/platform/android/SocketAdapter;", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "matchesSocket", "", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public interface Factory {
        okhttp3.internal.platform.android.SocketAdapter create(javax.net.ssl.SSLSocket r1);

        boolean matchesSocket(javax.net.ssl.SSLSocket r1);
    }

    public DeferredSocketAdapter(okhttp3.internal.platform.android.DeferredSocketAdapter.Factory r2) {
            r1 = this;
            java.lang.String r0 = "socketAdapterFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.socketAdapterFactory = r2
            return
    }

    private final synchronized okhttp3.internal.platform.android.SocketAdapter getDelegate(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            monitor-enter(r1)
            okhttp3.internal.platform.android.SocketAdapter r0 = r1.delegate     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L15
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = r1.socketAdapterFactory     // Catch: java.lang.Throwable -> L19
            boolean r0 = r0.matchesSocket(r2)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L15
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = r1.socketAdapterFactory     // Catch: java.lang.Throwable -> L19
            okhttp3.internal.platform.android.SocketAdapter r0 = r0.create(r2)     // Catch: java.lang.Throwable -> L19
            r1.delegate = r0     // Catch: java.lang.Throwable -> L19
        L15:
            okhttp3.internal.platform.android.SocketAdapter r0 = r1.delegate     // Catch: java.lang.Throwable -> L19
            monitor-exit(r1)
            return r0
        L19:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            throw r2
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(javax.net.ssl.SSLSocket r2, java.lang.String r3, java.util.List<? extends okhttp3.Protocol> r4) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "protocols"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okhttp3.internal.platform.android.SocketAdapter r0 = r1.getDelegate(r2)
            if (r0 == 0) goto L13
            r0.configureTlsExtensions(r2, r3, r4)
        L13:
            return
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.internal.platform.android.SocketAdapter r0 = r1.getDelegate(r2)
            if (r0 == 0) goto L10
            java.lang.String r0 = r0.getSelectedProtocol(r2)
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
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
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = r1.socketAdapterFactory
            boolean r0 = r0.matchesSocket(r2)
            return r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(javax.net.ssl.SSLSocketFactory r2) {
            r1 = this;
            boolean r0 = okhttp3.internal.platform.android.SocketAdapter.DefaultImpls.matchesSocketFactory(r1, r2)
            return r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory r2) {
            r1 = this;
            javax.net.ssl.X509TrustManager r0 = okhttp3.internal.platform.android.SocketAdapter.DefaultImpls.trustManager(r1, r2)
            return r0
    }
}
