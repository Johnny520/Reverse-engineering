package okhttp3.internal.http;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RealInterceptorChain implements okhttp3.Interceptor.Chain {
    private final okhttp3.internal.connection.RealCall call;
    private int calls;
    private final int connectTimeoutMillis;
    private final okhttp3.internal.connection.Exchange exchange;
    private final int index;
    private final java.util.List<okhttp3.Interceptor> interceptors;
    private final int readTimeoutMillis;
    private final okhttp3.Request request;
    private final int writeTimeoutMillis;

    public RealInterceptorChain(okhttp3.internal.connection.RealCall r1, java.util.List<? extends okhttp3.Interceptor> r2, int r3, okhttp3.internal.connection.Exchange r4, okhttp3.Request r5, int r6, int r7, int r8) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r5.getClass()
            r0.<init>()
            r0.call = r1
            r0.interceptors = r2
            r0.index = r3
            r0.exchange = r4
            r0.request = r5
            r0.connectTimeoutMillis = r6
            r0.readTimeoutMillis = r7
            r0.writeTimeoutMillis = r8
            return
    }

    public static /* synthetic */ okhttp3.internal.http.RealInterceptorChain copy$okhttp$default(okhttp3.internal.http.RealInterceptorChain r0, int r1, okhttp3.internal.connection.Exchange r2, okhttp3.Request r3, int r4, int r5, int r6, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            if (r8 == 0) goto L6
            int r1 = r0.index
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto Lc
            okhttp3.internal.connection.Exchange r2 = r0.exchange
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L12
            okhttp3.Request r3 = r0.request
        L12:
            r8 = r7 & 8
            if (r8 == 0) goto L18
            int r4 = r0.connectTimeoutMillis
        L18:
            r8 = r7 & 16
            if (r8 == 0) goto L1e
            int r5 = r0.readTimeoutMillis
        L1e:
            r7 = r7 & 32
            if (r7 == 0) goto L24
            int r6 = r0.writeTimeoutMillis
        L24:
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            r2 = r0
            okhttp3.internal.http.RealInterceptorChain r0 = r2.copy$okhttp(r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Call call() {
            r1 = this;
            okhttp3.internal.connection.RealCall r0 = r1.call
            return r0
    }

    @Override // okhttp3.Interceptor.Chain
    public int connectTimeoutMillis() {
            r1 = this;
            int r0 = r1.connectTimeoutMillis
            return r0
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Connection connection() {
            r1 = this;
            okhttp3.internal.connection.Exchange r0 = r1.exchange
            if (r0 == 0) goto L9
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection$okhttp()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final okhttp3.internal.http.RealInterceptorChain copy$okhttp(int r10, okhttp3.internal.connection.Exchange r11, okhttp3.Request r12, int r13, int r14, int r15) {
            r9 = this;
            r12.getClass()
            okhttp3.internal.http.RealInterceptorChain r0 = new okhttp3.internal.http.RealInterceptorChain
            okhttp3.internal.connection.RealCall r1 = r9.call
            java.util.List<okhttp3.Interceptor> r2 = r9.interceptors
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public final okhttp3.internal.connection.RealCall getCall$okhttp() {
            r1 = this;
            okhttp3.internal.connection.RealCall r0 = r1.call
            return r0
    }

    public final int getConnectTimeoutMillis$okhttp() {
            r1 = this;
            int r0 = r1.connectTimeoutMillis
            return r0
    }

    public final okhttp3.internal.connection.Exchange getExchange$okhttp() {
            r1 = this;
            okhttp3.internal.connection.Exchange r0 = r1.exchange
            return r0
    }

    public final int getReadTimeoutMillis$okhttp() {
            r1 = this;
            int r0 = r1.readTimeoutMillis
            return r0
    }

    public final okhttp3.Request getRequest$okhttp() {
            r1 = this;
            okhttp3.Request r0 = r1.request
            return r0
    }

    public final int getWriteTimeoutMillis$okhttp() {
            r1 = this;
            int r0 = r1.writeTimeoutMillis
            return r0
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Response proceed(okhttp3.Request r14) {
            r13 = this;
            r14.getClass()
            int r0 = r13.index
            java.util.List<okhttp3.Interceptor> r1 = r13.interceptors
            int r1 = r1.size()
            if (r0 >= r1) goto Laa
            int r0 = r13.calls
            r1 = 1
            int r0 = r0 + r1
            r13.calls = r0
            okhttp3.internal.connection.Exchange r0 = r13.exchange
            java.lang.String r2 = " must call proceed() exactly once"
            java.lang.String r3 = "network interceptor "
            if (r0 == 0) goto L4b
            okhttp3.internal.connection.ExchangeFinder r0 = r0.getFinder$okhttp()
            okhttp3.HttpUrl r4 = r14.url()
            boolean r0 = r0.sameHostAndPort(r4)
            if (r0 == 0) goto L3c
            int r0 = r13.calls
            if (r0 != r1) goto L2e
            goto L4b
        L2e:
            java.util.List<okhttp3.Interceptor> r14 = r13.interceptors
            int r0 = r13.index
            int r0 = r0 - r1
            java.lang.Object r14 = r14.get(r0)
            j8.o.k(r14, r3, r2)
        L3a:
            r14 = 0
            return r14
        L3c:
            java.util.List<okhttp3.Interceptor> r14 = r13.interceptors
            int r0 = r13.index
            int r0 = r0 - r1
            java.lang.Object r14 = r14.get(r0)
            java.lang.String r0 = " must retain the same host and port"
            j8.o.k(r14, r3, r0)
            goto L3a
        L4b:
            int r0 = r13.index
            int r5 = r0 + 1
            r11 = 58
            r12 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r4 = r13
            r7 = r14
            okhttp3.internal.http.RealInterceptorChain r14 = copy$okhttp$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.util.List<okhttp3.Interceptor> r0 = r4.interceptors
            int r5 = r4.index
            java.lang.Object r0 = r0.get(r5)
            okhttp3.Interceptor r0 = (okhttp3.Interceptor) r0
            okhttp3.Response r5 = r0.intercept(r14)
            java.lang.String r6 = "interceptor "
            if (r5 == 0) goto L93
            okhttp3.internal.connection.Exchange r7 = r4.exchange
            if (r7 == 0) goto L86
            int r7 = r4.index
            int r7 = r7 + r1
            java.util.List<okhttp3.Interceptor> r8 = r4.interceptors
            int r8 = r8.size()
            if (r7 >= r8) goto L86
            int r14 = r14.calls
            if (r14 != r1) goto L82
            goto L86
        L82:
            j8.o.k(r0, r3, r2)
            goto L3a
        L86:
            okhttp3.ResponseBody r14 = r5.body()
            if (r14 == 0) goto L8d
            return r5
        L8d:
            java.lang.String r14 = " returned a response with no body"
            j8.o.k(r0, r6, r14)
            goto L3a
        L93:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            r1.append(r0)
            java.lang.String r0 = " returned null"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r14.<init>(r0)
            throw r14
        Laa:
            r4 = r13
            java.lang.String r14 = "Check failed."
            j8.o.A(r14)
            goto L3a
    }

    @Override // okhttp3.Interceptor.Chain
    public int readTimeoutMillis() {
            r1 = this;
            int r0 = r1.readTimeoutMillis
            return r0
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Request request() {
            r1 = this;
            okhttp3.Request r0 = r1.request
            return r0
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Interceptor.Chain withConnectTimeout(int r13, java.util.concurrent.TimeUnit r14) {
            r12 = this;
            r14.getClass()
            okhttp3.internal.connection.Exchange r0 = r12.exchange
            if (r0 != 0) goto L1c
            java.lang.String r0 = "connectTimeout"
            long r1 = (long) r13
            int r7 = okhttp3.internal.Util.checkDuration(r0, r1, r14)
            r10 = 55
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r3 = r12
            okhttp3.internal.http.RealInterceptorChain r13 = copy$okhttp$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        L1c:
            java.lang.String r13 = "Timeouts can't be adjusted in a network interceptor"
            j8.o.A(r13)
            r13 = 0
            return r13
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Interceptor.Chain withReadTimeout(int r13, java.util.concurrent.TimeUnit r14) {
            r12 = this;
            r14.getClass()
            okhttp3.internal.connection.Exchange r0 = r12.exchange
            if (r0 != 0) goto L1c
            java.lang.String r0 = "readTimeout"
            long r1 = (long) r13
            int r8 = okhttp3.internal.Util.checkDuration(r0, r1, r14)
            r10 = 47
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r3 = r12
            okhttp3.internal.http.RealInterceptorChain r13 = copy$okhttp$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        L1c:
            java.lang.String r13 = "Timeouts can't be adjusted in a network interceptor"
            j8.o.A(r13)
            r13 = 0
            return r13
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Interceptor.Chain withWriteTimeout(int r13, java.util.concurrent.TimeUnit r14) {
            r12 = this;
            r14.getClass()
            okhttp3.internal.connection.Exchange r0 = r12.exchange
            if (r0 != 0) goto L1c
            java.lang.String r0 = "writeTimeout"
            long r1 = (long) r13
            int r9 = okhttp3.internal.Util.checkDuration(r0, r1, r14)
            r10 = 31
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r12
            okhttp3.internal.http.RealInterceptorChain r13 = copy$okhttp$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        L1c:
            java.lang.String r13 = "Timeouts can't be adjusted in a network interceptor"
            j8.o.A(r13)
            r13 = 0
            return r13
    }

    @Override // okhttp3.Interceptor.Chain
    public int writeTimeoutMillis() {
            r1 = this;
            int r0 = r1.writeTimeoutMillis
            return r0
    }
}
