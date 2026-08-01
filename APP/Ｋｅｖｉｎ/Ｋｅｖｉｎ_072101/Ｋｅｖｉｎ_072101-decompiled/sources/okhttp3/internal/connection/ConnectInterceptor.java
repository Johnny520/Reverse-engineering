package okhttp3.internal.connection;

/* JADX INFO: compiled from: ConnectInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m115d2 = {"Lokhttp3/internal/connection/ConnectInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r12) throws java.io.IOException {
            r11 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = r12
            okhttp3.internal.http.RealInterceptorChain r0 = (okhttp3.internal.http.RealInterceptorChain) r0
            okhttp3.internal.connection.RealCall r1 = r0.getCall$okhttp()
            r2 = r12
            okhttp3.internal.http.RealInterceptorChain r2 = (okhttp3.internal.http.RealInterceptorChain) r2
            okhttp3.internal.connection.Exchange r10 = r1.initExchange$okhttp(r2)
            r8 = 61
            r9 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r0
            r3 = r10
            okhttp3.internal.http.RealInterceptorChain r1 = okhttp3.internal.http.RealInterceptorChain.copy$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            okhttp3.Request r2 = r0.getRequest$okhttp()
            okhttp3.Response r2 = r1.proceed(r2)
            return r2
    }
}
