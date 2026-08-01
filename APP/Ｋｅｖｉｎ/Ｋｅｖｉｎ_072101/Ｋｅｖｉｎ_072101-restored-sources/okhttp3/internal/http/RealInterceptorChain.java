package okhttp3.internal.http;

/* JADX INFO: compiled from: RealInterceptorChain.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0002\u0010\u0010J\b\u0010\u0002\u001a\u00020\u001cH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016JK\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0002\b J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0016J\u0018\u0010'\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0016J\u0018\u0010(\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000f\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u0006)"}, m115d2 = {"Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Interceptor$Chain;", "call", "Lokhttp3/internal/connection/RealCall;", "interceptors", "", "Lokhttp3/Interceptor;", "index", "", "exchange", "Lokhttp3/internal/connection/Exchange;", "request", "Lokhttp3/Request;", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;III)V", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "calls", "getConnectTimeoutMillis$okhttp", "()I", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "getReadTimeoutMillis$okhttp", "getRequest$okhttp", "()Lokhttp3/Request;", "getWriteTimeoutMillis$okhttp", "Lokhttp3/Call;", "connection", "Lokhttp3/Connection;", "copy", "copy$okhttp", "proceed", "Lokhttp3/Response;", "withConnectTimeout", "timeout", "unit", "Ljava/util/concurrent/TimeUnit;", "withReadTimeout", "withWriteTimeout", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

    public RealInterceptorChain(okhttp3.internal.connection.RealCall r2, java.util.List<? extends okhttp3.Interceptor> r3, int r4, okhttp3.internal.connection.Exchange r5, okhttp3.Request r6, int r7, int r8, int r9) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "interceptors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r1.<init>()
            r1.call = r2
            r1.interceptors = r3
            r1.index = r4
            r1.exchange = r5
            r1.request = r6
            r1.connectTimeoutMillis = r7
            r1.readTimeoutMillis = r8
            r1.writeTimeoutMillis = r9
            return
    }

    public static /* synthetic */ okhttp3.internal.http.RealInterceptorChain copy$okhttp$default(okhttp3.internal.http.RealInterceptorChain r4, int r5, okhttp3.internal.connection.Exchange r6, okhttp3.Request r7, int r8, int r9, int r10, int r11, java.lang.Object r12) {
            r12 = r11 & 1
            if (r12 == 0) goto L6
            int r5 = r4.index
        L6:
            r12 = r11 & 2
            if (r12 == 0) goto Le
            okhttp3.internal.connection.Exchange r6 = r4.exchange
            r12 = r6
            goto Lf
        Le:
            r12 = r6
        Lf:
            r6 = r11 & 4
            if (r6 == 0) goto L17
            okhttp3.Request r7 = r4.request
            r0 = r7
            goto L18
        L17:
            r0 = r7
        L18:
            r6 = r11 & 8
            if (r6 == 0) goto L20
            int r8 = r4.connectTimeoutMillis
            r1 = r8
            goto L21
        L20:
            r1 = r8
        L21:
            r6 = r11 & 16
            if (r6 == 0) goto L29
            int r9 = r4.readTimeoutMillis
            r2 = r9
            goto L2a
        L29:
            r2 = r9
        L2a:
            r6 = r11 & 32
            if (r6 == 0) goto L32
            int r10 = r4.writeTimeoutMillis
            r3 = r10
            goto L33
        L32:
            r3 = r10
        L33:
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            okhttp3.internal.http.RealInterceptorChain r4 = r6.copy$okhttp(r7, r8, r9, r10, r11, r12)
            return r4
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Call call() {
            r1 = this;
            okhttp3.internal.connection.RealCall r0 = r1.call
            okhttp3.Call r0 = (okhttp3.Call) r0
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
            goto La
        L9:
            r0 = 0
        La:
            okhttp3.Connection r0 = (okhttp3.Connection) r0
            return r0
    }

    public final okhttp3.internal.http.RealInterceptorChain copy$okhttp(int r13, okhttp3.internal.connection.Exchange r14, okhttp3.Request r15, int r16, int r17, int r18) {
            r12 = this;
            r0 = r12
            java.lang.String r1 = "request"
            r11 = r15
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            okhttp3.internal.http.RealInterceptorChain r1 = new okhttp3.internal.http.RealInterceptorChain
            okhttp3.internal.connection.RealCall r3 = r0.call
            java.util.List<okhttp3.Interceptor> r4 = r0.interceptors
            r2 = r1
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
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
    public okhttp3.Response proceed(okhttp3.Request r15) throws java.io.IOException {
            r14 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            int r0 = r14.index
            java.util.List<okhttp3.Interceptor> r1 = r14.interceptors
            int r1 = r1.size()
            r2 = 0
            r3 = 1
            if (r0 >= r1) goto L13
            r0 = r3
            goto L14
        L13:
            r0 = r2
        L14:
            if (r0 == 0) goto L13a
            int r0 = r14.calls
            int r0 = r0 + r3
            r14.calls = r0
            okhttp3.internal.connection.Exchange r0 = r14.exchange
            java.lang.String r1 = " must call proceed() exactly once"
            java.lang.String r4 = "network interceptor "
            if (r0 == 0) goto L91
            okhttp3.internal.connection.Exchange r0 = r14.exchange
            okhttp3.internal.connection.ExchangeFinder r0 = r0.getFinder$okhttp()
            okhttp3.HttpUrl r5 = r15.url()
            boolean r0 = r0.sameHostAndPort(r5)
            if (r0 == 0) goto L66
            int r0 = r14.calls
            if (r0 != r3) goto L39
            r0 = r3
            goto L3a
        L39:
            r0 = r2
        L3a:
            if (r0 == 0) goto L3d
            goto L91
        L3d:
            r0 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.util.List<okhttp3.Interceptor> r4 = r14.interceptors
            int r5 = r14.index
            int r5 = r5 - r3
            java.lang.Object r3 = r4.get(r5)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L66:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.util.List<okhttp3.Interceptor> r2 = r14.interceptors
            int r4 = r14.index
            int r4 = r4 - r3
            java.lang.Object r2 = r2.get(r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " must retain the same host and port"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L91:
            int r0 = r14.index
            int r6 = r0 + 1
            r12 = 58
            r13 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r5 = r14
            r8 = r15
            okhttp3.internal.http.RealInterceptorChain r0 = copy$okhttp$default(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.util.List<okhttp3.Interceptor> r5 = r14.interceptors
            int r6 = r14.index
            java.lang.Object r5 = r5.get(r6)
            okhttp3.Interceptor r5 = (okhttp3.Interceptor) r5
            r6 = r0
            okhttp3.Interceptor$Chain r6 = (okhttp3.Interceptor.Chain) r6
            okhttp3.Response r6 = r5.intercept(r6)
            java.lang.String r7 = "interceptor "
            if (r6 == 0) goto L11d
            okhttp3.internal.connection.Exchange r8 = r14.exchange
            if (r8 == 0) goto Lf1
            int r8 = r14.index
            int r8 = r8 + r3
            java.util.List<okhttp3.Interceptor> r9 = r14.interceptors
            int r9 = r9.size()
            if (r8 >= r9) goto Lcd
            int r8 = r0.calls
            if (r8 != r3) goto Lcb
            goto Lcd
        Lcb:
            r8 = r2
            goto Lce
        Lcd:
            r8 = r3
        Lce:
            if (r8 == 0) goto Ld1
            goto Lf1
        Ld1:
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        Lf1:
            okhttp3.ResponseBody r1 = r6.body()
            if (r1 == 0) goto Lf8
            r2 = r3
        Lf8:
            if (r2 == 0) goto Lfb
            return r6
        Lfb:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = " returned a response with no body"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L11d:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = " returned null"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L13a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
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
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            okhttp3.internal.connection.Exchange r0 = r12.exchange
            if (r0 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L25
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
            okhttp3.internal.http.RealInterceptorChain r0 = copy$okhttp$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            okhttp3.Interceptor$Chain r0 = (okhttp3.Interceptor.Chain) r0
            return r0
        L25:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Timeouts can't be adjusted in a network interceptor"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Interceptor.Chain withReadTimeout(int r13, java.util.concurrent.TimeUnit r14) {
            r12 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            okhttp3.internal.connection.Exchange r0 = r12.exchange
            if (r0 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L25
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
            okhttp3.internal.http.RealInterceptorChain r0 = copy$okhttp$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            okhttp3.Interceptor$Chain r0 = (okhttp3.Interceptor.Chain) r0
            return r0
        L25:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Timeouts can't be adjusted in a network interceptor"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Interceptor.Chain withWriteTimeout(int r13, java.util.concurrent.TimeUnit r14) {
            r12 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            okhttp3.internal.connection.Exchange r0 = r12.exchange
            if (r0 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L25
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
            okhttp3.internal.http.RealInterceptorChain r0 = copy$okhttp$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            okhttp3.Interceptor$Chain r0 = (okhttp3.Interceptor.Chain) r0
            return r0
        L25:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Timeouts can't be adjusted in a network interceptor"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okhttp3.Interceptor.Chain
    public int writeTimeoutMillis() {
            r1 = this;
            int r0 = r1.writeTimeoutMillis
            return r0
    }
}
