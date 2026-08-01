package okhttp3.internal.http;

/* JADX INFO: compiled from: RetryAndFollowUpInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J(\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m115d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "client", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "buildRedirectRequest", "Lokhttp3/Request;", "userResponse", "Lokhttp3/Response;", "method", "", "followUpRequest", "exchange", "Lokhttp3/internal/connection/Exchange;", "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "isRecoverable", "", "e", "Ljava/io/IOException;", "requestSendStarted", "recover", "call", "Lokhttp3/internal/connection/RealCall;", "userRequest", "requestIsOneShot", "retryAfter", "", "defaultDelay", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class RetryAndFollowUpInterceptor implements okhttp3.Interceptor {
    public static final okhttp3.internal.http.RetryAndFollowUpInterceptor.Companion Companion = null;
    private static final int MAX_FOLLOW_UPS = 20;
    private final okhttp3.OkHttpClient client;

    /* JADX INFO: compiled from: RetryAndFollowUpInterceptor.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m115d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor$Companion;", "", "()V", "MAX_FOLLOW_UPS", "", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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
    }

    static {
            okhttp3.internal.http.RetryAndFollowUpInterceptor$Companion r0 = new okhttp3.internal.http.RetryAndFollowUpInterceptor$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http.RetryAndFollowUpInterceptor.Companion = r0
            return
    }

    public RetryAndFollowUpInterceptor(okhttp3.OkHttpClient r2) {
            r1 = this;
            java.lang.String r0 = "client"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.client = r2
            return
    }

    private final okhttp3.Request buildRedirectRequest(okhttp3.Response r11, java.lang.String r12) {
            r10 = this;
            okhttp3.OkHttpClient r0 = r10.client
            boolean r0 = r0.followRedirects()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.String r0 = "Location"
            r2 = 2
            java.lang.String r0 = okhttp3.Response.header$default(r11, r0, r1, r2, r1)
            if (r0 != 0) goto L14
            return r1
        L14:
            okhttp3.Request r2 = r11.request()
            okhttp3.HttpUrl r2 = r2.url()
            okhttp3.HttpUrl r2 = r2.resolve(r0)
            if (r2 != 0) goto L23
            return r1
        L23:
            java.lang.String r3 = r2.scheme()
            okhttp3.Request r4 = r11.request()
            okhttp3.HttpUrl r4 = r4.url()
            java.lang.String r4 = r4.scheme()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L42
            okhttp3.OkHttpClient r4 = r10.client
            boolean r4 = r4.followSslRedirects()
            if (r4 != 0) goto L42
            return r1
        L42:
            okhttp3.Request r4 = r11.request()
            okhttp3.Request$Builder r4 = r4.newBuilder()
            boolean r5 = okhttp3.internal.http.HttpMethod.permitsRequestBody(r12)
            if (r5 == 0) goto L99
            int r5 = r11.code()
            okhttp3.internal.http.HttpMethod r6 = okhttp3.internal.http.HttpMethod.INSTANCE
            boolean r6 = r6.redirectsWithBody(r12)
            r7 = 307(0x133, float:4.3E-43)
            r8 = 308(0x134, float:4.32E-43)
            if (r6 != 0) goto L67
            if (r5 == r8) goto L67
            if (r5 != r7) goto L65
            goto L67
        L65:
            r6 = 0
            goto L68
        L67:
            r6 = 1
        L68:
            okhttp3.internal.http.HttpMethod r9 = okhttp3.internal.http.HttpMethod.INSTANCE
            boolean r9 = r9.redirectsToGet(r12)
            if (r9 == 0) goto L7b
            if (r5 == r8) goto L7b
            if (r5 == r7) goto L7b
            java.lang.String r7 = "GET"
            r4.method(r7, r1)
            goto L88
        L7b:
            if (r6 == 0) goto L85
            okhttp3.Request r1 = r11.request()
            okhttp3.RequestBody r1 = r1.body()
        L85:
            r4.method(r12, r1)
        L88:
            if (r6 != 0) goto L99
            java.lang.String r1 = "Transfer-Encoding"
            r4.removeHeader(r1)
            java.lang.String r1 = "Content-Length"
            r4.removeHeader(r1)
            java.lang.String r1 = "Content-Type"
            r4.removeHeader(r1)
        L99:
            okhttp3.Request r1 = r11.request()
            okhttp3.HttpUrl r1 = r1.url()
            boolean r1 = okhttp3.internal.Util.canReuseConnectionFor(r1, r2)
            if (r1 != 0) goto Lac
            java.lang.String r1 = "Authorization"
            r4.removeHeader(r1)
        Lac:
            okhttp3.Request$Builder r1 = r4.url(r2)
            okhttp3.Request r1 = r1.build()
            return r1
    }

    private final okhttp3.Request followUpRequest(okhttp3.Response r9, okhttp3.internal.connection.Exchange r10) throws java.io.IOException {
            r8 = this;
            r0 = 0
            if (r10 == 0) goto Le
            okhttp3.internal.connection.RealConnection r1 = r10.getConnection$okhttp()
            if (r1 == 0) goto Le
            okhttp3.Route r1 = r1.route()
            goto Lf
        Le:
            r1 = r0
        Lf:
            int r2 = r9.code()
            okhttp3.Request r3 = r9.request()
            java.lang.String r3 = r3.method()
            switch(r2) {
                case 300: goto Lc7;
                case 301: goto Lc7;
                case 302: goto Lc7;
                case 303: goto Lc7;
                case 307: goto Lc7;
                case 308: goto Lc7;
                case 401: goto Lbc;
                case 407: goto L9a;
                case 408: goto L64;
                case 421: goto L3d;
                case 503: goto L1f;
                default: goto L1e;
            }
        L1e:
            return r0
        L1f:
            okhttp3.Response r4 = r9.priorResponse()
            if (r4 == 0) goto L2e
            int r5 = r4.code()
            r6 = 503(0x1f7, float:7.05E-43)
            if (r5 != r6) goto L2e
            return r0
        L2e:
            r5 = 2147483647(0x7fffffff, float:NaN)
            int r5 = r8.retryAfter(r9, r5)
            if (r5 != 0) goto L3c
            okhttp3.Request r0 = r9.request()
            return r0
        L3c:
            return r0
        L3d:
            okhttp3.Request r4 = r9.request()
            okhttp3.RequestBody r4 = r4.body()
            if (r4 == 0) goto L4e
            boolean r5 = r4.isOneShot()
            if (r5 == 0) goto L4e
            return r0
        L4e:
            if (r10 == 0) goto L63
            boolean r5 = r10.isCoalescedConnection$okhttp()
            if (r5 != 0) goto L57
            goto L63
        L57:
            okhttp3.internal.connection.RealConnection r0 = r10.getConnection$okhttp()
            r0.noCoalescedConnections$okhttp()
            okhttp3.Request r0 = r9.request()
            return r0
        L63:
            return r0
        L64:
            okhttp3.OkHttpClient r4 = r8.client
            boolean r4 = r4.retryOnConnectionFailure()
            if (r4 != 0) goto L6d
            return r0
        L6d:
            okhttp3.Request r4 = r9.request()
            okhttp3.RequestBody r4 = r4.body()
            if (r4 == 0) goto L7e
            boolean r5 = r4.isOneShot()
            if (r5 == 0) goto L7e
            return r0
        L7e:
            okhttp3.Response r5 = r9.priorResponse()
            if (r5 == 0) goto L8d
            int r6 = r5.code()
            r7 = 408(0x198, float:5.72E-43)
            if (r6 != r7) goto L8d
            return r0
        L8d:
            r6 = 0
            int r6 = r8.retryAfter(r9, r6)
            if (r6 <= 0) goto L95
            return r0
        L95:
            okhttp3.Request r0 = r9.request()
            return r0
        L9a:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.net.Proxy r0 = r1.proxy()
            java.net.Proxy$Type r4 = r0.type()
            java.net.Proxy$Type r5 = java.net.Proxy.Type.HTTP
            if (r4 != r5) goto Lb4
            okhttp3.OkHttpClient r4 = r8.client
            okhttp3.Authenticator r4 = r4.proxyAuthenticator()
            okhttp3.Request r4 = r4.authenticate(r1, r9)
            return r4
        Lb4:
            java.net.ProtocolException r4 = new java.net.ProtocolException
            java.lang.String r5 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r4.<init>(r5)
            throw r4
        Lbc:
            okhttp3.OkHttpClient r0 = r8.client
            okhttp3.Authenticator r0 = r0.authenticator()
            okhttp3.Request r0 = r0.authenticate(r1, r9)
            return r0
        Lc7:
            okhttp3.Request r0 = r8.buildRedirectRequest(r9, r3)
            return r0
    }

    private final boolean isRecoverable(java.io.IOException r4, boolean r5) {
            r3 = this;
            boolean r0 = r4 instanceof java.net.ProtocolException
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r4 instanceof java.io.InterruptedIOException
            r2 = 1
            if (r0 == 0) goto L13
            boolean r0 = r4 instanceof java.net.SocketTimeoutException
            if (r0 == 0) goto L12
            if (r5 != 0) goto L12
            r1 = r2
        L12:
            return r1
        L13:
            boolean r0 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r0 == 0) goto L20
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof java.security.cert.CertificateException
            if (r0 == 0) goto L20
            return r1
        L20:
            boolean r0 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r0 == 0) goto L25
            return r1
        L25:
            return r2
    }

    private final boolean recover(java.io.IOException r3, okhttp3.internal.connection.RealCall r4, okhttp3.Request r5, boolean r6) {
            r2 = this;
            okhttp3.OkHttpClient r0 = r2.client
            boolean r0 = r0.retryOnConnectionFailure()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            if (r6 == 0) goto L13
            boolean r0 = r2.requestIsOneShot(r3, r5)
            if (r0 == 0) goto L13
            return r1
        L13:
            boolean r0 = r2.isRecoverable(r3, r6)
            if (r0 != 0) goto L1a
            return r1
        L1a:
            boolean r0 = r4.retryAfterFailure()
            if (r0 != 0) goto L21
            return r1
        L21:
            r0 = 1
            return r0
    }

    private final boolean requestIsOneShot(java.io.IOException r3, okhttp3.Request r4) {
            r2 = this;
            okhttp3.RequestBody r0 = r4.body()
            if (r0 == 0) goto Lc
            boolean r1 = r0.isOneShot()
            if (r1 != 0) goto L10
        Lc:
            boolean r1 = r3 instanceof java.io.FileNotFoundException
            if (r1 == 0) goto L12
        L10:
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    private final int retryAfter(okhttp3.Response r5, int r6) {
            r4 = this;
            r0 = 0
            r1 = 2
            java.lang.String r2 = "Retry-After"
            java.lang.String r0 = okhttp3.Response.header$default(r5, r2, r0, r1, r0)
            if (r0 != 0) goto Lb
            return r6
        Lb:
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            kotlin.text.Regex r2 = new kotlin.text.Regex
            java.lang.String r3 = "\\d+"
            r2.<init>(r3)
            boolean r1 = r2.matches(r1)
            if (r1 == 0) goto L2b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "valueOf(header)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            return r1
        L2b:
            r1 = 2147483647(0x7fffffff, float:NaN)
            return r1
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r18) throws java.io.IOException {
            r17 = this;
            r1 = r17
            r2 = r18
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r3 = r2
            okhttp3.internal.http.RealInterceptorChain r3 = (okhttp3.internal.http.RealInterceptorChain) r3
            r0 = r2
            okhttp3.internal.http.RealInterceptorChain r0 = (okhttp3.internal.http.RealInterceptorChain) r0
            okhttp3.Request r0 = r0.getRequest$okhttp()
            okhttp3.internal.connection.RealCall r4 = r3.getCall$okhttp()
            r5 = 0
            r6 = 0
            r7 = 1
            java.util.List r8 = kotlin.collections.CollectionsKt.emptyList()
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r0
        L23:
            r4.enterNetworkInterceptorExchange(r5, r8)
            r10 = 0
            r11 = 1
            boolean r0 = r4.isCanceled()     // Catch: java.lang.Throwable -> L10d
            if (r0 != 0) goto L105
        L31:
            r12 = 0
            okhttp3.Response r0 = r3.proceed(r5)     // Catch: java.io.IOException -> Lb4 okhttp3.internal.connection.RouteException -> Lda java.lang.Throwable -> L10d
            r10 = r0
            r8 = 1
            if (r7 == 0) goto L55
        L3b:
            okhttp3.Response$Builder r0 = r10.newBuilder()     // Catch: java.lang.Throwable -> L10d
            okhttp3.Response$Builder r12 = r7.newBuilder()     // Catch: java.lang.Throwable -> L10d
            r13 = 0
            okhttp3.Response$Builder r12 = r12.body(r13)     // Catch: java.lang.Throwable -> L10d
            okhttp3.Response r12 = r12.build()     // Catch: java.lang.Throwable -> L10d
            okhttp3.Response$Builder r0 = r0.priorResponse(r12)     // Catch: java.lang.Throwable -> L10d
            okhttp3.Response r0 = r0.build()     // Catch: java.lang.Throwable -> L10d
            r10 = r0
        L55:
            okhttp3.internal.connection.Exchange r0 = r4.getInterceptorScopedExchange$okhttp()     // Catch: java.lang.Throwable -> L10d
            okhttp3.Request r12 = r1.followUpRequest(r10, r0)     // Catch: java.lang.Throwable -> L10d
            if (r12 != 0) goto L70
            if (r0 == 0) goto L6a
            boolean r13 = r0.isDuplex$okhttp()     // Catch: java.lang.Throwable -> L10d
            if (r13 == 0) goto L6a
            r4.timeoutEarlyExit()     // Catch: java.lang.Throwable -> L10d
        L6a:
            r11 = 0
            r4.exitNetworkInterceptorExchange$okhttp(r11)
            return r10
        L70:
            okhttp3.RequestBody r13 = r12.body()     // Catch: java.lang.Throwable -> L10d
            if (r13 == 0) goto L82
            boolean r14 = r13.isOneShot()     // Catch: java.lang.Throwable -> L10d
            if (r14 == 0) goto L82
            r11 = 0
            r4.exitNetworkInterceptorExchange$okhttp(r11)
            return r10
        L82:
            okhttp3.ResponseBody r14 = r10.body()     // Catch: java.lang.Throwable -> L10d
            if (r14 == 0) goto L8d
            java.io.Closeable r14 = (java.io.Closeable) r14     // Catch: java.lang.Throwable -> L10d
            okhttp3.internal.Util.closeQuietly(r14)     // Catch: java.lang.Throwable -> L10d
        L8d:
            int r6 = r6 + 1
            r14 = 20
            if (r6 > r14) goto L99
            r5 = r12
            r7 = r10
            r4.exitNetworkInterceptorExchange$okhttp(r11)
            goto L23
        L99:
            java.net.ProtocolException r14 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> L10d
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10d
            r15.<init>()     // Catch: java.lang.Throwable -> L10d
            r16 = r0
            java.lang.String r0 = "Too many follow-up requests: "
            java.lang.StringBuilder r0 = r15.append(r0)     // Catch: java.lang.Throwable -> L10d
            java.lang.StringBuilder r0 = r0.append(r6)     // Catch: java.lang.Throwable -> L10d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L10d
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L10d
            throw r14     // Catch: java.lang.Throwable -> L10d
        Lb4:
            r0 = move-exception
            r13 = r0
            r0 = r13
            boolean r13 = r0 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L10d
            if (r13 != 0) goto Lbd
            r12 = 1
        Lbd:
            boolean r12 = r1.recover(r0, r4, r5, r12)     // Catch: java.lang.Throwable -> L10d
            if (r12 == 0) goto Ld2
            r12 = r9
            java.util.Collection r12 = (java.util.Collection) r12     // Catch: java.lang.Throwable -> L10d
            java.util.List r12 = kotlin.collections.CollectionsKt.plus(r12, r0)     // Catch: java.lang.Throwable -> L10d
            r9 = r12
            r8 = 0
            r4.exitNetworkInterceptorExchange$okhttp(r11)
            goto L23
        Ld2:
            r12 = r0
            java.lang.Exception r12 = (java.lang.Exception) r12     // Catch: java.lang.Throwable -> L10d
            java.lang.Throwable r12 = okhttp3.internal.Util.withSuppressed(r12, r9)     // Catch: java.lang.Throwable -> L10d
            throw r12     // Catch: java.lang.Throwable -> L10d
        Lda:
            r0 = move-exception
            r13 = r0
            r0 = r13
            java.io.IOException r13 = r0.getLastConnectException()     // Catch: java.lang.Throwable -> L10d
            boolean r12 = r1.recover(r13, r4, r5, r12)     // Catch: java.lang.Throwable -> L10d
            if (r12 == 0) goto Lfa
            r12 = r9
            java.util.Collection r12 = (java.util.Collection) r12     // Catch: java.lang.Throwable -> L10d
            java.io.IOException r13 = r0.getFirstConnectException()     // Catch: java.lang.Throwable -> L10d
            java.util.List r12 = kotlin.collections.CollectionsKt.plus(r12, r13)     // Catch: java.lang.Throwable -> L10d
            r9 = r12
            r8 = 0
            r4.exitNetworkInterceptorExchange$okhttp(r11)
            goto L23
        Lfa:
            java.io.IOException r12 = r0.getFirstConnectException()     // Catch: java.lang.Throwable -> L10d
            java.lang.Exception r12 = (java.lang.Exception) r12     // Catch: java.lang.Throwable -> L10d
            java.lang.Throwable r12 = okhttp3.internal.Util.withSuppressed(r12, r9)     // Catch: java.lang.Throwable -> L10d
            throw r12     // Catch: java.lang.Throwable -> L10d
        L105:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L10d
            java.lang.String r12 = "Canceled"
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L10d
            throw r0     // Catch: java.lang.Throwable -> L10d
        L10d:
            r0 = move-exception
            r4.exitNetworkInterceptorExchange$okhttp(r11)
            throw r0
    }
}
