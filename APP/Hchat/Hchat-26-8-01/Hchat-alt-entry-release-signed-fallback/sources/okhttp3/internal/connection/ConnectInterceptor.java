package okhttp3.internal.connection;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ConnectInterceptor implements okhttp3.Interceptor {
    public static final okhttp3.internal.connection.ConnectInterceptor INSTANCE = null;

    static {
            okhttp3.internal.connection.ConnectInterceptor r0 = new okhttp3.internal.connection.ConnectInterceptor
            r0.<init>()
            okhttp3.internal.connection.ConnectInterceptor.INSTANCE = r0
            return
    }

    private ConnectInterceptor() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r10) {
            r9 = this;
            r10.getClass()
            r0 = r10
            okhttp3.internal.http.RealInterceptorChain r0 = (okhttp3.internal.http.RealInterceptorChain) r0
            okhttp3.internal.connection.RealCall r10 = r0.getCall$okhttp()
            okhttp3.internal.connection.Exchange r2 = r10.initExchange$okhttp(r0)
            r7 = 61
            r8 = 0
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            okhttp3.internal.http.RealInterceptorChain r10 = okhttp3.internal.http.RealInterceptorChain.copy$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            okhttp3.Request r0 = r0.getRequest$okhttp()
            okhttp3.Response r10 = r10.proceed(r0)
            return r10
    }
}
