package okhttp3.internal.connection;

/* JADX INFO: compiled from: RealCall.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000§\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001.\u0018\u00002\u00020\u0001:\u0002deB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u00101\u001a\u0002022\u0006\u0010\u0010\u001a\u00020\u000fJ!\u00103\u001a\u0002H4\"\n\b\u0000\u00104*\u0004\u0018\u0001052\u0006\u00106\u001a\u0002H4H\u0002¢\u0006\u0002\u00107J\b\u00108\u001a\u000202H\u0002J\b\u00109\u001a\u000202H\u0016J\b\u0010:\u001a\u00020\u0000H\u0016J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010?\u001a\u0002022\u0006\u0010@\u001a\u00020AH\u0016J\u0016\u0010B\u001a\u0002022\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u0007J\b\u0010E\u001a\u00020FH\u0016J\u0015\u0010G\u001a\u0002022\u0006\u0010H\u001a\u00020\u0007H\u0000¢\u0006\u0002\bIJ\r\u0010J\u001a\u00020FH\u0000¢\u0006\u0002\bKJ\u0015\u0010L\u001a\u00020\u001e2\u0006\u0010M\u001a\u00020NH\u0000¢\u0006\u0002\bOJ\b\u0010P\u001a\u00020\u0007H\u0016J\b\u0010Q\u001a\u00020\u0007H\u0016J;\u0010R\u001a\u0002H4\"\n\b\u0000\u00104*\u0004\u0018\u0001052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010S\u001a\u00020\u00072\u0006\u0010T\u001a\u00020\u00072\u0006\u00106\u001a\u0002H4H\u0000¢\u0006\u0004\bU\u0010VJ\u0019\u0010W\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0002\bXJ\r\u0010Y\u001a\u00020ZH\u0000¢\u0006\u0002\b[J\u000f\u0010\\\u001a\u0004\u0018\u00010]H\u0000¢\u0006\u0002\b^J\b\u0010C\u001a\u00020\u0005H\u0016J\u0006\u0010_\u001a\u00020\u0007J\b\u0010-\u001a\u00020`H\u0016J\u0006\u00100\u001a\u000202J!\u0010a\u001a\u0002H4\"\n\b\u0000\u00104*\u0004\u0018\u0001052\u0006\u0010b\u001a\u0002H4H\u0002¢\u0006\u0002\u00107J\b\u0010c\u001a\u00020ZH\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001aX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\"\u0010&\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001e@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0004\n\u0002\u0010/R\u000e\u00100\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006f"}, m115d2 = {"Lokhttp3/internal/connection/RealCall;", "Lokhttp3/Call;", "client", "Lokhttp3/OkHttpClient;", "originalRequest", "Lokhttp3/Request;", "forWebSocket", "", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V", "callStackTrace", "", "canceled", "getClient", "()Lokhttp3/OkHttpClient;", "<set-?>", "Lokhttp3/internal/connection/RealConnection;", "connection", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionToCancel", "getConnectionToCancel", "setConnectionToCancel", "(Lokhttp3/internal/connection/RealConnection;)V", "eventListener", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "exchange", "Lokhttp3/internal/connection/Exchange;", "exchangeFinder", "Lokhttp3/internal/connection/ExchangeFinder;", "executed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "expectMoreExchanges", "getForWebSocket", "()Z", "interceptorScopedExchange", "getInterceptorScopedExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "getOriginalRequest", "()Lokhttp3/Request;", "requestBodyOpen", "responseBodyOpen", "timeout", "okhttp3/internal/connection/RealCall$timeout$1", "Lokhttp3/internal/connection/RealCall$timeout$1;", "timeoutEarlyExit", "acquireConnectionNoEvents", "", "callDone", "E", "Ljava/io/IOException;", "e", "(Ljava/io/IOException;)Ljava/io/IOException;", "callStart", "cancel", "clone", "createAddress", "Lokhttp3/Address;", "url", "Lokhttp3/HttpUrl;", "enqueue", "responseCallback", "Lokhttp3/Callback;", "enterNetworkInterceptorExchange", "request", "newExchangeFinder", "execute", "Lokhttp3/Response;", "exitNetworkInterceptorExchange", "closeExchange", "exitNetworkInterceptorExchange$okhttp", "getResponseWithInterceptorChain", "getResponseWithInterceptorChain$okhttp", "initExchange", "chain", "Lokhttp3/internal/http/RealInterceptorChain;", "initExchange$okhttp", "isCanceled", "isExecuted", "messageDone", "requestDone", "responseDone", "messageDone$okhttp", "(Lokhttp3/internal/connection/Exchange;ZZLjava/io/IOException;)Ljava/io/IOException;", "noMoreExchanges", "noMoreExchanges$okhttp", "redactedUrl", "", "redactedUrl$okhttp", "releaseConnectionNoEvents", "Ljava/net/Socket;", "releaseConnectionNoEvents$okhttp", "retryAfterFailure", "Lokio/AsyncTimeout;", "timeoutExit", "cause", "toLoggableString", "AsyncCall", "CallReference", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class RealCall implements okhttp3.Call {
    private java.lang.Object callStackTrace;
    private volatile boolean canceled;
    private final okhttp3.OkHttpClient client;
    private okhttp3.internal.connection.RealConnection connection;
    private final okhttp3.internal.connection.RealConnectionPool connectionPool;
    private volatile okhttp3.internal.connection.RealConnection connectionToCancel;
    private final okhttp3.EventListener eventListener;
    private volatile okhttp3.internal.connection.Exchange exchange;
    private okhttp3.internal.connection.ExchangeFinder exchangeFinder;
    private final java.util.concurrent.atomic.AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;
    private okhttp3.internal.connection.Exchange interceptorScopedExchange;
    private final okhttp3.Request originalRequest;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;
    private final okhttp3.internal.connection.RealCall.C10341 timeout;
    private boolean timeoutEarlyExit;

    /* JADX INFO: compiled from: RealCall.kt */
    @kotlin.Metadata(m114d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0012\u0010\u001a\u001a\u00020\u00172\n\u0010\u001b\u001a\u00060\u0000R\u00020\u0006J\b\u0010\u001c\u001a\u00020\u0017H\u0016R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m115d2 = {"Lokhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "responseCallback", "Lokhttp3/Callback;", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/Callback;)V", "call", "Lokhttp3/internal/connection/RealCall;", "getCall", "()Lokhttp3/internal/connection/RealCall;", "<set-?>", "Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "getCallsPerHost", "()Ljava/util/concurrent/atomic/AtomicInteger;", "host", "", "getHost", "()Ljava/lang/String;", "request", "Lokhttp3/Request;", "getRequest", "()Lokhttp3/Request;", "executeOn", "", "executorService", "Ljava/util/concurrent/ExecutorService;", "reuseCallsPerHostFrom", "other", "run", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public final class AsyncCall implements java.lang.Runnable {
        private volatile java.util.concurrent.atomic.AtomicInteger callsPerHost;
        private final okhttp3.Callback responseCallback;
        final /* synthetic */ okhttp3.internal.connection.RealCall this$0;

        public AsyncCall(okhttp3.internal.connection.RealCall r3, okhttp3.Callback r4) {
                r2 = this;
                java.lang.String r0 = "responseCallback"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r2.this$0 = r3
                r2.<init>()
                r2.responseCallback = r4
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r1 = 0
                r0.<init>(r1)
                r2.callsPerHost = r0
                return
        }

        public final void executeOn(java.util.concurrent.ExecutorService r7) {
                r6 = this;
                java.lang.String r0 = "executorService"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                okhttp3.internal.connection.RealCall r0 = r6.this$0
                okhttp3.OkHttpClient r0 = r0.getClient()
                okhttp3.Dispatcher r0 = r0.dispatcher()
                r1 = 0
                boolean r2 = okhttp3.internal.Util.assertionsEnabled
                if (r2 == 0) goto L46
                boolean r2 = java.lang.Thread.holdsLock(r0)
                if (r2 != 0) goto L1b
                goto L46
            L1b:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Thread "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                java.lang.String r4 = r4.getName()
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r4 = " MUST NOT hold lock on "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L46:
                r0 = 0
                r1 = r6
                java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L52 java.util.concurrent.RejectedExecutionException -> L54
                r7.execute(r1)     // Catch: java.lang.Throwable -> L52 java.util.concurrent.RejectedExecutionException -> L54
                r0 = 1
            L51:
                goto L85
            L52:
                r1 = move-exception
                goto L86
            L54:
                r1 = move-exception
                java.io.InterruptedIOException r2 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L52
                java.lang.String r3 = "executor rejected"
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L52
                r3 = r1
                java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Throwable -> L52
                r2.initCause(r3)     // Catch: java.lang.Throwable -> L52
                okhttp3.internal.connection.RealCall r3 = r6.this$0     // Catch: java.lang.Throwable -> L52
                r4 = r2
                java.io.IOException r4 = (java.io.IOException) r4     // Catch: java.lang.Throwable -> L52
                r3.noMoreExchanges$okhttp(r4)     // Catch: java.lang.Throwable -> L52
                okhttp3.Callback r3 = r6.responseCallback     // Catch: java.lang.Throwable -> L52
                okhttp3.internal.connection.RealCall r4 = r6.this$0     // Catch: java.lang.Throwable -> L52
                okhttp3.Call r4 = (okhttp3.Call) r4     // Catch: java.lang.Throwable -> L52
                r5 = r2
                java.io.IOException r5 = (java.io.IOException) r5     // Catch: java.lang.Throwable -> L52
                r3.onFailure(r4, r5)     // Catch: java.lang.Throwable -> L52
                okhttp3.internal.connection.RealCall r1 = r6.this$0
                okhttp3.OkHttpClient r1 = r1.getClient()
                okhttp3.Dispatcher r1 = r1.dispatcher()
                r1.finished$okhttp(r6)
                goto L51
            L85:
                return
            L86:
                okhttp3.internal.connection.RealCall r2 = r6.this$0
                okhttp3.OkHttpClient r2 = r2.getClient()
                okhttp3.Dispatcher r2 = r2.dispatcher()
                r2.finished$okhttp(r6)
                throw r1
        }

        public final okhttp3.internal.connection.RealCall getCall() {
                r1 = this;
                okhttp3.internal.connection.RealCall r0 = r1.this$0
                return r0
        }

        public final java.util.concurrent.atomic.AtomicInteger getCallsPerHost() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.callsPerHost
                return r0
        }

        public final java.lang.String getHost() {
                r1 = this;
                okhttp3.internal.connection.RealCall r0 = r1.this$0
                okhttp3.Request r0 = r0.getOriginalRequest()
                okhttp3.HttpUrl r0 = r0.url()
                java.lang.String r0 = r0.host()
                return r0
        }

        public final okhttp3.Request getRequest() {
                r1 = this;
                okhttp3.internal.connection.RealCall r0 = r1.this$0
                okhttp3.Request r0 = r0.getOriginalRequest()
                return r0
        }

        public final void reuseCallsPerHostFrom(okhttp3.internal.connection.RealCall.AsyncCall r2) {
                r1 = this;
                java.lang.String r0 = "other"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.util.concurrent.atomic.AtomicInteger r0 = r2.callsPerHost
                r1.callsPerHost = r0
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r12 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OkHttp "
                java.lang.StringBuilder r0 = r0.append(r1)
                okhttp3.internal.connection.RealCall r1 = r12.this$0
                java.lang.String r1 = r1.redactedUrl$okhttp()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                okhttp3.internal.connection.RealCall r1 = r12.this$0
                r2 = 0
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r4 = r3.getName()
                r3.setName(r0)
                r5 = 0
                r6 = 0
                okhttp3.internal.connection.RealCall$timeout$1 r7 = okhttp3.internal.connection.RealCall.access$getTimeout$p(r1)     // Catch: java.lang.Throwable -> Lc8
                r7.enter()     // Catch: java.lang.Throwable -> Lc8
                okhttp3.Response r7 = r1.getResponseWithInterceptorChain$okhttp()     // Catch: java.lang.Throwable -> L4b java.io.IOException -> L7b
                r6 = 1
                okhttp3.Callback r8 = r12.responseCallback     // Catch: java.lang.Throwable -> L4b java.io.IOException -> L7b
                r9 = r1
                okhttp3.Call r9 = (okhttp3.Call) r9     // Catch: java.lang.Throwable -> L4b java.io.IOException -> L7b
                r8.onResponse(r9, r7)     // Catch: java.lang.Throwable -> L4b java.io.IOException -> L7b
                okhttp3.OkHttpClient r1 = r1.getClient()     // Catch: java.lang.Throwable -> Lc8
                okhttp3.Dispatcher r1 = r1.dispatcher()     // Catch: java.lang.Throwable -> Lc8
            L47:
                r1.finished$okhttp(r12)     // Catch: java.lang.Throwable -> Lc8
                goto Lb4
            L4b:
                r7 = move-exception
                r1.cancel()     // Catch: java.lang.Throwable -> L79
                if (r6 != 0) goto L77
                java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L79
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
                r9.<init>()     // Catch: java.lang.Throwable -> L79
                java.lang.String r10 = "canceled due to "
                java.lang.StringBuilder r9 = r9.append(r10)     // Catch: java.lang.Throwable -> L79
                java.lang.StringBuilder r9 = r9.append(r7)     // Catch: java.lang.Throwable -> L79
                java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L79
                r8.<init>(r9)     // Catch: java.lang.Throwable -> L79
                r9 = r8
                java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch: java.lang.Throwable -> L79
                kotlin.ExceptionsKt.addSuppressed(r9, r7)     // Catch: java.lang.Throwable -> L79
                okhttp3.Callback r9 = r12.responseCallback     // Catch: java.lang.Throwable -> L79
                r10 = r1
                okhttp3.Call r10 = (okhttp3.Call) r10     // Catch: java.lang.Throwable -> L79
                r9.onFailure(r10, r8)     // Catch: java.lang.Throwable -> L79
            L77:
                throw r7     // Catch: java.lang.Throwable -> L79
            L79:
                r7 = move-exception
                goto Lbc
            L7b:
                r7 = move-exception
                if (r6 == 0) goto La3
                okhttp3.internal.platform.Platform$Companion r8 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.Throwable -> L79
                okhttp3.internal.platform.Platform r8 = r8.get()     // Catch: java.lang.Throwable -> L79
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
                r9.<init>()     // Catch: java.lang.Throwable -> L79
                java.lang.String r10 = "Callback failure for "
                java.lang.StringBuilder r9 = r9.append(r10)     // Catch: java.lang.Throwable -> L79
                java.lang.String r10 = okhttp3.internal.connection.RealCall.access$toLoggableString(r1)     // Catch: java.lang.Throwable -> L79
                java.lang.StringBuilder r9 = r9.append(r10)     // Catch: java.lang.Throwable -> L79
                java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L79
                r10 = r7
                java.lang.Throwable r10 = (java.lang.Throwable) r10     // Catch: java.lang.Throwable -> L79
                r11 = 4
                r8.log(r9, r11, r10)     // Catch: java.lang.Throwable -> L79
                goto Lab
            La3:
                okhttp3.Callback r8 = r12.responseCallback     // Catch: java.lang.Throwable -> L79
                r9 = r1
                okhttp3.Call r9 = (okhttp3.Call) r9     // Catch: java.lang.Throwable -> L79
                r8.onFailure(r9, r7)     // Catch: java.lang.Throwable -> L79
            Lab:
                okhttp3.OkHttpClient r1 = r1.getClient()     // Catch: java.lang.Throwable -> Lc8
                okhttp3.Dispatcher r1 = r1.dispatcher()     // Catch: java.lang.Throwable -> Lc8
                goto L47
            Lb4:
                r3.setName(r4)
                return
            Lbc:
                okhttp3.OkHttpClient r1 = r1.getClient()     // Catch: java.lang.Throwable -> Lc8
                okhttp3.Dispatcher r1 = r1.dispatcher()     // Catch: java.lang.Throwable -> Lc8
                r1.finished$okhttp(r12)     // Catch: java.lang.Throwable -> Lc8
                throw r7     // Catch: java.lang.Throwable -> Lc8
            Lc8:
                r1 = move-exception
                r3.setName(r4)
                throw r1
        }
    }

    /* JADX INFO: compiled from: RealCall.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m115d2 = {"Lokhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/RealCall;", "referent", "callStackTrace", "", "(Lokhttp3/internal/connection/RealCall;Ljava/lang/Object;)V", "getCallStackTrace", "()Ljava/lang/Object;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class CallReference extends java.lang.ref.WeakReference<okhttp3.internal.connection.RealCall> {
        private final java.lang.Object callStackTrace;

        public CallReference(okhttp3.internal.connection.RealCall r2, java.lang.Object r3) {
                r1 = this;
                java.lang.String r0 = "referent"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>(r2)
                r1.callStackTrace = r3
                return
        }

        public final java.lang.Object getCallStackTrace() {
                r1 = this;
                java.lang.Object r0 = r1.callStackTrace
                return r0
        }
    }


    public RealCall(okhttp3.OkHttpClient r7, okhttp3.Request r8, boolean r9) {
            r6 = this;
            java.lang.String r0 = "client"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "originalRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r6.<init>()
            r6.client = r7
            r6.originalRequest = r8
            r6.forWebSocket = r9
            okhttp3.OkHttpClient r0 = r6.client
            okhttp3.ConnectionPool r0 = r0.connectionPool()
            okhttp3.internal.connection.RealConnectionPool r0 = r0.getDelegate$okhttp()
            r6.connectionPool = r0
            okhttp3.OkHttpClient r0 = r6.client
            okhttp3.EventListener$Factory r0 = r0.eventListenerFactory()
            r1 = r6
            okhttp3.Call r1 = (okhttp3.Call) r1
            okhttp3.EventListener r0 = r0.create(r1)
            r6.eventListener = r0
            okhttp3.internal.connection.RealCall$timeout$1 r0 = new okhttp3.internal.connection.RealCall$timeout$1
            r0.<init>(r6)
            r1 = r0
            r2 = 0
            okhttp3.OkHttpClient r3 = r6.client
            int r3 = r3.callTimeoutMillis()
            long r3 = (long) r3
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.timeout(r3, r5)
            r6.timeout = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r6.executed = r0
            r0 = 1
            r6.expectMoreExchanges = r0
            return
    }

    public static final /* synthetic */ okhttp3.internal.connection.RealCall.C10341 access$getTimeout$p(okhttp3.internal.connection.RealCall r1) {
            okhttp3.internal.connection.RealCall$timeout$1 r0 = r1.timeout
            return r0
    }

    public static final /* synthetic */ java.lang.String access$toLoggableString(okhttp3.internal.connection.RealCall r1) {
            java.lang.String r0 = r1.toLoggableString()
            return r0
    }

    private final <E extends java.io.IOException> E callDone(E r7) {
            r6 = this;
            r0 = r6
            r1 = 0
            boolean r2 = okhttp3.internal.Util.assertionsEnabled
            if (r2 == 0) goto L38
            boolean r2 = java.lang.Thread.holdsLock(r0)
            if (r2 != 0) goto Ld
            goto L38
        Ld:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Thread "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " MUST NOT hold lock on "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L38:
            okhttp3.internal.connection.RealConnection r0 = r6.connection
            if (r0 == 0) goto Laa
            r1 = r0
            r2 = 0
            boolean r3 = okhttp3.internal.Util.assertionsEnabled
            if (r3 == 0) goto L75
            boolean r3 = java.lang.Thread.holdsLock(r1)
            if (r3 != 0) goto L4a
            goto L75
        L4a:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Thread "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = " MUST NOT hold lock on "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L75:
            monitor-enter(r0)
            r1 = 0
            java.net.Socket r2 = r6.releaseConnectionNoEvents$okhttp()     // Catch: java.lang.Throwable -> La7
            monitor-exit(r0)
            r1 = r2
            okhttp3.internal.connection.RealConnection r2 = r6.connection
            if (r2 != 0) goto L93
            if (r1 == 0) goto L87
            okhttp3.internal.Util.closeQuietly(r1)
        L87:
            okhttp3.EventListener r2 = r6.eventListener
            r3 = r6
            okhttp3.Call r3 = (okhttp3.Call) r3
            r4 = r0
            okhttp3.Connection r4 = (okhttp3.Connection) r4
            r2.connectionReleased(r3, r4)
            goto Laa
        L93:
            if (r1 != 0) goto L97
            r2 = 1
            goto L98
        L97:
            r2 = 0
        L98:
            if (r2 == 0) goto L9b
            goto Laa
        L9b:
            java.lang.String r2 = "Check failed."
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        La7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        Laa:
            java.io.IOException r1 = r6.timeoutExit(r7)
            if (r7 == 0) goto Lbc
            okhttp3.EventListener r2 = r6.eventListener
            r3 = r6
            okhttp3.Call r3 = (okhttp3.Call) r3
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r2.callFailed(r3, r1)
            goto Lc4
        Lbc:
            okhttp3.EventListener r2 = r6.eventListener
            r3 = r6
            okhttp3.Call r3 = (okhttp3.Call) r3
            r2.callEnd(r3)
        Lc4:
            return r1
    }

    private final void callStart() {
            r2 = this;
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r0 = r0.get()
            java.lang.String r1 = "response.body().close()"
            java.lang.Object r0 = r0.getStackTraceForCloseable(r1)
            r2.callStackTrace = r0
            okhttp3.EventListener r0 = r2.eventListener
            r1 = r2
            okhttp3.Call r1 = (okhttp3.Call) r1
            r0.callStart(r1)
            return
    }

    private final okhttp3.Address createAddress(okhttp3.HttpUrl r19) {
            r18 = this;
            r0 = r18
            r1 = 0
            r2 = 0
            r3 = 0
            boolean r4 = r19.isHttps()
            if (r4 == 0) goto L1d
            okhttp3.OkHttpClient r4 = r0.client
            javax.net.ssl.SSLSocketFactory r1 = r4.sslSocketFactory()
            okhttp3.OkHttpClient r4 = r0.client
            javax.net.ssl.HostnameVerifier r2 = r4.hostnameVerifier()
            okhttp3.OkHttpClient r4 = r0.client
            okhttp3.CertificatePinner r3 = r4.certificatePinner()
        L1d:
            okhttp3.Address r17 = new okhttp3.Address
            java.lang.String r5 = r19.host()
            int r6 = r19.port()
            okhttp3.OkHttpClient r4 = r0.client
            okhttp3.Dns r7 = r4.dns()
            okhttp3.OkHttpClient r4 = r0.client
            javax.net.SocketFactory r8 = r4.socketFactory()
            okhttp3.OkHttpClient r4 = r0.client
            okhttp3.Authenticator r12 = r4.proxyAuthenticator()
            okhttp3.OkHttpClient r4 = r0.client
            java.net.Proxy r13 = r4.proxy()
            okhttp3.OkHttpClient r4 = r0.client
            java.util.List r14 = r4.protocols()
            okhttp3.OkHttpClient r4 = r0.client
            java.util.List r15 = r4.connectionSpecs()
            okhttp3.OkHttpClient r4 = r0.client
            java.net.ProxySelector r16 = r4.proxySelector()
            r4 = r17
            r9 = r1
            r10 = r2
            r11 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r17
    }

    private final <E extends java.io.IOException> E timeoutExit(E r3) {
            r2 = this;
            boolean r0 = r2.timeoutEarlyExit
            if (r0 == 0) goto L5
            return r3
        L5:
            okhttp3.internal.connection.RealCall$timeout$1 r0 = r2.timeout
            boolean r0 = r0.exit()
            if (r0 != 0) goto Le
            return r3
        Le:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            if (r3 == 0) goto L1d
            r1 = r3
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.initCause(r1)
        L1d:
            r1 = r0
            java.io.IOException r1 = (java.io.IOException) r1
            return r1
    }

    private final java.lang.String toLoggableString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2.isCanceled()
            if (r1 == 0) goto Le
            java.lang.String r1 = "canceled "
            goto L10
        Le:
            java.lang.String r1 = ""
        L10:
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r2.forWebSocket
            if (r1 == 0) goto L1b
            java.lang.String r1 = "web socket"
            goto L1d
        L1b:
            java.lang.String r1 = "call"
        L1d:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " to "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.redactedUrl$okhttp()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void acquireConnectionNoEvents(okhttp3.internal.connection.RealConnection r6) {
            r5 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r6
            r1 = 0
            boolean r2 = okhttp3.internal.Util.assertionsEnabled
            if (r2 == 0) goto L3d
            boolean r2 = java.lang.Thread.holdsLock(r0)
            if (r2 == 0) goto L12
            goto L3d
        L12:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Thread "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " MUST hold lock on "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L3d:
            okhttp3.internal.connection.RealConnection r0 = r5.connection
            if (r0 != 0) goto L44
            r0 = 1
            goto L45
        L44:
            r0 = 0
        L45:
            if (r0 == 0) goto L58
            r5.connection = r6
            java.util.List r0 = r6.getCalls()
            okhttp3.internal.connection.RealCall$CallReference r1 = new okhttp3.internal.connection.RealCall$CallReference
            java.lang.Object r2 = r5.callStackTrace
            r1.<init>(r5, r2)
            r0.add(r1)
            return
        L58:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okhttp3.Call
    public void cancel() {
            r2 = this;
            boolean r0 = r2.canceled
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.canceled = r0
            okhttp3.internal.connection.Exchange r0 = r2.exchange
            if (r0 == 0) goto Lf
            r0.cancel()
        Lf:
            okhttp3.internal.connection.RealConnection r0 = r2.connectionToCancel
            if (r0 == 0) goto L16
            r0.cancel()
        L16:
            okhttp3.EventListener r0 = r2.eventListener
            r1 = r2
            okhttp3.Call r1 = (okhttp3.Call) r1
            r0.canceled(r1)
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            okhttp3.internal.connection.RealCall r0 = r1.clone()
            return r0
    }

    @Override // okhttp3.Call
    public /* bridge */ /* synthetic */ okhttp3.Call clone() {
            r1 = this;
            okhttp3.internal.connection.RealCall r0 = r1.clone()
            okhttp3.Call r0 = (okhttp3.Call) r0
            return r0
    }

    @Override // okhttp3.Call
    public okhttp3.internal.connection.RealCall clone() {
            r4 = this;
            okhttp3.internal.connection.RealCall r0 = new okhttp3.internal.connection.RealCall
            okhttp3.OkHttpClient r1 = r4.client
            okhttp3.Request r2 = r4.originalRequest
            boolean r3 = r4.forWebSocket
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // okhttp3.Call
    public void enqueue(okhttp3.Callback r4) {
            r3 = this;
            java.lang.String r0 = "responseCallback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.executed
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L21
            r3.callStart()
            okhttp3.OkHttpClient r0 = r3.client
            okhttp3.Dispatcher r0 = r0.dispatcher()
            okhttp3.internal.connection.RealCall$AsyncCall r1 = new okhttp3.internal.connection.RealCall$AsyncCall
            r1.<init>(r3, r4)
            r0.enqueue$okhttp(r1)
            return
        L21:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already Executed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void enterNetworkInterceptorExchange(okhttp3.Request r5, boolean r6) {
            r4 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            okhttp3.internal.connection.Exchange r0 = r4.interceptorScopedExchange
            if (r0 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L4f
            monitor-enter(r4)
            r0 = 0
            boolean r1 = r4.responseBodyOpen     // Catch: java.lang.Throwable -> L4c
            if (r1 != 0) goto L3f
            boolean r1 = r4.requestBodyOpen     // Catch: java.lang.Throwable -> L4c
            if (r1 != 0) goto L33
        L19:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r4)
            if (r6 == 0) goto L32
            okhttp3.internal.connection.ExchangeFinder r0 = new okhttp3.internal.connection.ExchangeFinder
            okhttp3.internal.connection.RealConnectionPool r1 = r4.connectionPool
            okhttp3.HttpUrl r2 = r5.url()
            okhttp3.Address r2 = r4.createAddress(r2)
            okhttp3.EventListener r3 = r4.eventListener
            r0.<init>(r1, r2, r4, r3)
            r4.exchangeFinder = r0
        L32:
            return
        L33:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L4c
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L4c
            throw r2     // Catch: java.lang.Throwable -> L4c
        L3f:
            r1 = 0
            java.lang.String r2 = "cannot make a new request because the previous response is still open: please call response.close()"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4c
            throw r1     // Catch: java.lang.Throwable -> L4c
        L4c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L4f:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // okhttp3.Call
    public okhttp3.Response execute() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.executed
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L35
            okhttp3.internal.connection.RealCall$timeout$1 r0 = r3.timeout
            r0.enter()
            r3.callStart()
            okhttp3.OkHttpClient r0 = r3.client     // Catch: java.lang.Throwable -> L2a
            okhttp3.Dispatcher r0 = r0.dispatcher()     // Catch: java.lang.Throwable -> L2a
            r0.executed$okhttp(r3)     // Catch: java.lang.Throwable -> L2a
            okhttp3.Response r0 = r3.getResponseWithInterceptorChain$okhttp()     // Catch: java.lang.Throwable -> L2a
            okhttp3.OkHttpClient r1 = r3.client
            okhttp3.Dispatcher r1 = r1.dispatcher()
            r1.finished$okhttp(r3)
            return r0
        L2a:
            r0 = move-exception
            okhttp3.OkHttpClient r1 = r3.client
            okhttp3.Dispatcher r1 = r1.dispatcher()
            r1.finished$okhttp(r3)
            throw r0
        L35:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already Executed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean r4) {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            boolean r1 = r3.expectMoreExchanges     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L17
        L7:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)
            if (r4 == 0) goto L13
            okhttp3.internal.connection.Exchange r0 = r3.exchange
            if (r0 == 0) goto L13
            r0.detachWithViolence()
        L13:
            r0 = 0
            r3.interceptorScopedExchange = r0
            return
        L17:
            r1 = 0
            java.lang.String r2 = "released"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L24
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L24
            throw r1     // Catch: java.lang.Throwable -> L24
        L24:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public final okhttp3.OkHttpClient getClient() {
            r1 = this;
            okhttp3.OkHttpClient r0 = r1.client
            return r0
    }

    public final okhttp3.internal.connection.RealConnection getConnection() {
            r1 = this;
            okhttp3.internal.connection.RealConnection r0 = r1.connection
            return r0
    }

    public final okhttp3.internal.connection.RealConnection getConnectionToCancel() {
            r1 = this;
            okhttp3.internal.connection.RealConnection r0 = r1.connectionToCancel
            return r0
    }

    public final okhttp3.EventListener getEventListener$okhttp() {
            r1 = this;
            okhttp3.EventListener r0 = r1.eventListener
            return r0
    }

    public final boolean getForWebSocket() {
            r1 = this;
            boolean r0 = r1.forWebSocket
            return r0
    }

    public final okhttp3.internal.connection.Exchange getInterceptorScopedExchange$okhttp() {
            r1 = this;
            okhttp3.internal.connection.Exchange r0 = r1.interceptorScopedExchange
            return r0
    }

    public final okhttp3.Request getOriginalRequest() {
            r1 = this;
            okhttp3.Request r0 = r1.originalRequest
            return r0
    }

    public final okhttp3.Response getResponseWithInterceptorChain$okhttp() throws java.io.IOException {
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            okhttp3.OkHttpClient r2 = r11.client
            java.util.List r2 = r2.interceptors()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.collections.CollectionsKt.addAll(r1, r2)
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            okhttp3.internal.http.RetryAndFollowUpInterceptor r2 = new okhttp3.internal.http.RetryAndFollowUpInterceptor
            okhttp3.OkHttpClient r3 = r11.client
            r2.<init>(r3)
            r1.add(r2)
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            okhttp3.internal.http.BridgeInterceptor r2 = new okhttp3.internal.http.BridgeInterceptor
            okhttp3.OkHttpClient r3 = r11.client
            okhttp3.CookieJar r3 = r3.cookieJar()
            r2.<init>(r3)
            r1.add(r2)
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            okhttp3.internal.cache.CacheInterceptor r2 = new okhttp3.internal.cache.CacheInterceptor
            okhttp3.OkHttpClient r3 = r11.client
            okhttp3.Cache r3 = r3.cache()
            r2.<init>(r3)
            r1.add(r2)
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            okhttp3.internal.connection.ConnectInterceptor r2 = okhttp3.internal.connection.ConnectInterceptor.INSTANCE
            r1.add(r2)
            boolean r1 = r11.forWebSocket
            if (r1 != 0) goto L5e
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            okhttp3.OkHttpClient r2 = r11.client
            java.util.List r2 = r2.networkInterceptors()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.collections.CollectionsKt.addAll(r1, r2)
        L5e:
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            okhttp3.internal.http.CallServerInterceptor r2 = new okhttp3.internal.http.CallServerInterceptor
            boolean r3 = r11.forWebSocket
            r2.<init>(r3)
            r1.add(r2)
            okhttp3.internal.http.RealInterceptorChain r10 = new okhttp3.internal.http.RealInterceptorChain
            okhttp3.Request r6 = r11.originalRequest
            okhttp3.OkHttpClient r1 = r11.client
            int r7 = r1.connectTimeoutMillis()
            okhttp3.OkHttpClient r1 = r11.client
            int r8 = r1.readTimeoutMillis()
            okhttp3.OkHttpClient r1 = r11.client
            int r9 = r1.writeTimeoutMillis()
            r4 = 0
            r5 = 0
            r1 = r10
            r2 = r11
            r3 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = 0
            r3 = 0
            okhttp3.Request r4 = r11.originalRequest     // Catch: java.lang.Throwable -> Lb1 java.io.IOException -> Lb3
            okhttp3.Response r4 = r1.proceed(r4)     // Catch: java.lang.Throwable -> Lb1 java.io.IOException -> Lb3
            boolean r5 = r11.isCanceled()     // Catch: java.lang.Throwable -> Lb1 java.io.IOException -> Lb3
            if (r5 != 0) goto La3
        L9e:
            r11.noMoreExchanges$okhttp(r3)
            r3 = r4
            return r4
        La3:
            r5 = r4
            java.io.Closeable r5 = (java.io.Closeable) r5     // Catch: java.lang.Throwable -> Lb1 java.io.IOException -> Lb3
            okhttp3.internal.Util.closeQuietly(r5)     // Catch: java.lang.Throwable -> Lb1 java.io.IOException -> Lb3
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> Lb1 java.io.IOException -> Lb3
            java.lang.String r6 = "Canceled"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lb1 java.io.IOException -> Lb3
            throw r5     // Catch: java.lang.Throwable -> Lb1 java.io.IOException -> Lb3
        Lb1:
            r4 = move-exception
            goto Lc1
        Lb3:
            r4 = move-exception
            r2 = 1
            java.io.IOException r5 = r11.noMoreExchanges$okhttp(r4)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Throwable"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r6)     // Catch: java.lang.Throwable -> Lb1
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch: java.lang.Throwable -> Lb1
            throw r5     // Catch: java.lang.Throwable -> Lb1
        Lc1:
            if (r2 != 0) goto Lc6
            r11.noMoreExchanges$okhttp(r3)
        Lc6:
            throw r4
    }

    public final okhttp3.internal.connection.Exchange initExchange$okhttp(okhttp3.internal.http.RealInterceptorChain r6) {
            r5 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            monitor-enter(r5)
            r0 = 0
            boolean r1 = r5.expectMoreExchanges     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L60
            boolean r1 = r5.responseBodyOpen     // Catch: java.lang.Throwable -> L6d
            if (r1 != 0) goto L54
            boolean r1 = r5.requestBodyOpen     // Catch: java.lang.Throwable -> L6d
            if (r1 != 0) goto L48
        L14:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r5)
            okhttp3.internal.connection.ExchangeFinder r0 = r5.exchangeFinder
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okhttp3.OkHttpClient r1 = r5.client
            okhttp3.internal.http.ExchangeCodec r1 = r0.find(r1, r6)
            okhttp3.internal.connection.Exchange r2 = new okhttp3.internal.connection.Exchange
            okhttp3.EventListener r3 = r5.eventListener
            r2.<init>(r5, r3, r0, r1)
            r5.interceptorScopedExchange = r2
            r5.exchange = r2
            monitor-enter(r5)
            r3 = 0
            r4 = 1
            r5.requestBodyOpen = r4     // Catch: java.lang.Throwable -> L45
            r5.responseBodyOpen = r4     // Catch: java.lang.Throwable -> L45
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L45
            monitor-exit(r5)
            boolean r3 = r5.canceled
            if (r3 != 0) goto L3d
            return r2
        L3d:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Canceled"
            r3.<init>(r4)
            throw r3
        L45:
            r3 = move-exception
            monitor-exit(r5)
            throw r3
        L48:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L6d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L6d
            throw r2     // Catch: java.lang.Throwable -> L6d
        L54:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L6d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L6d
            throw r2     // Catch: java.lang.Throwable -> L6d
        L60:
            r1 = 0
            java.lang.String r2 = "released"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L6d
            throw r1     // Catch: java.lang.Throwable -> L6d
        L6d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    @Override // okhttp3.Call
    public boolean isCanceled() {
            r1 = this;
            boolean r0 = r1.canceled
            return r0
    }

    @Override // okhttp3.Call
    public boolean isExecuted() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.executed
            boolean r0 = r0.get()
            return r0
    }

    public final <E extends java.io.IOException> E messageDone$okhttp(okhttp3.internal.connection.Exchange r7, boolean r8, boolean r9, E r10) {
            r6 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            okhttp3.internal.connection.Exchange r0 = r6.exchange
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            if (r0 != 0) goto Le
            return r10
        Le:
            r0 = 0
            r1 = 0
            monitor-enter(r6)
            r2 = 0
            if (r8 == 0) goto L1b
            boolean r3 = r6.requestBodyOpen     // Catch: java.lang.Throwable -> L19
            if (r3 != 0) goto L21
            goto L1b
        L19:
            r2 = move-exception
            goto L5d
        L1b:
            if (r9 == 0) goto L45
            boolean r3 = r6.responseBodyOpen     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L45
        L21:
            r3 = 0
            if (r8 == 0) goto L26
            r6.requestBodyOpen = r3     // Catch: java.lang.Throwable -> L19
        L26:
            if (r9 == 0) goto L2a
            r6.responseBodyOpen = r3     // Catch: java.lang.Throwable -> L19
        L2a:
            boolean r4 = r6.requestBodyOpen     // Catch: java.lang.Throwable -> L19
            r5 = 1
            if (r4 != 0) goto L35
            boolean r4 = r6.responseBodyOpen     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L35
            r4 = r5
            goto L36
        L35:
            r4 = r3
        L36:
            r0 = r4
            boolean r4 = r6.requestBodyOpen     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L44
            boolean r4 = r6.responseBodyOpen     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L44
            boolean r4 = r6.expectMoreExchanges     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L44
            r3 = r5
        L44:
            r1 = r3
        L45:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L19
            monitor-exit(r6)
            if (r0 == 0) goto L55
            r2 = 0
            r6.exchange = r2
            okhttp3.internal.connection.RealConnection r2 = r6.connection
            if (r2 == 0) goto L55
            r2.incrementSuccessCount$okhttp()
        L55:
            if (r1 == 0) goto L5c
            java.io.IOException r2 = r6.callDone(r10)
            return r2
        L5c:
            return r10
        L5d:
            monitor-exit(r6)
            throw r2
    }

    public final java.io.IOException noMoreExchanges$okhttp(java.io.IOException r5) {
            r4 = this;
            r0 = 0
            monitor-enter(r4)
            r1 = 0
            boolean r2 = r4.expectMoreExchanges     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L14
            r2 = 0
            r4.expectMoreExchanges = r2     // Catch: java.lang.Throwable -> L20
            boolean r3 = r4.requestBodyOpen     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L13
            boolean r3 = r4.responseBodyOpen     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L13
            r2 = 1
        L13:
            r0 = r2
        L14:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            if (r0 == 0) goto L1f
            java.io.IOException r1 = r4.callDone(r5)
            return r1
        L1f:
            return r5
        L20:
            r1 = move-exception
            monitor-exit(r4)
            throw r1
    }

    public final java.lang.String redactedUrl$okhttp() {
            r1 = this;
            okhttp3.Request r0 = r1.originalRequest
            okhttp3.HttpUrl r0 = r0.url()
            java.lang.String r0 = r0.redact()
            return r0
    }

    public final java.net.Socket releaseConnectionNoEvents$okhttp() {
            r11 = this;
            okhttp3.internal.connection.RealConnection r0 = r11.connection
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = r0
            r2 = 0
            boolean r3 = okhttp3.internal.Util.assertionsEnabled
            if (r3 == 0) goto L3d
            boolean r3 = java.lang.Thread.holdsLock(r1)
            if (r3 == 0) goto L12
            goto L3d
        L12:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Thread "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = " MUST hold lock on "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L3d:
            java.util.List r1 = r0.getCalls()
            r2 = r1
            r3 = 0
            r4 = 0
            java.util.Iterator r5 = r2.iterator()
        L49:
            boolean r6 = r5.hasNext()
            r7 = -1
            if (r6 == 0) goto L67
            java.lang.Object r6 = r5.next()
            r8 = r6
            java.lang.ref.Reference r8 = (java.lang.ref.Reference) r8
            r9 = 0
            java.lang.Object r10 = r8.get()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r11)
            if (r8 == 0) goto L63
            goto L68
        L63:
            int r4 = r4 + 1
            goto L49
        L67:
            r4 = r7
        L68:
            r2 = r4
            if (r2 == r7) goto L6d
            r3 = 1
            goto L6e
        L6d:
            r3 = 0
        L6e:
            if (r3 == 0) goto L91
            r1.remove(r2)
            r3 = 0
            r11.connection = r3
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L90
            long r4 = java.lang.System.nanoTime()
            r0.setIdleAtNs$okhttp(r4)
            okhttp3.internal.connection.RealConnectionPool r4 = r11.connectionPool
            boolean r4 = r4.connectionBecameIdle(r0)
            if (r4 == 0) goto L90
            java.net.Socket r3 = r0.socket()
            return r3
        L90:
            return r3
        L91:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Check failed."
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    @Override // okhttp3.Call
    public okhttp3.Request request() {
            r1 = this;
            okhttp3.Request r0 = r1.originalRequest
            return r0
    }

    public final boolean retryAfterFailure() {
            r1 = this;
            okhttp3.internal.connection.ExchangeFinder r0 = r1.exchangeFinder
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            boolean r0 = r0.retryAfterFailure()
            return r0
    }

    public final void setConnectionToCancel(okhttp3.internal.connection.RealConnection r1) {
            r0 = this;
            r0.connectionToCancel = r1
            return
    }

    @Override // okhttp3.Call
    public okio.AsyncTimeout timeout() {
            r1 = this;
            okhttp3.internal.connection.RealCall$timeout$1 r0 = r1.timeout
            okio.AsyncTimeout r0 = (okio.AsyncTimeout) r0
            return r0
    }

    @Override // okhttp3.Call
    public /* bridge */ /* synthetic */ okio.Timeout timeout() {
            r1 = this;
            okio.AsyncTimeout r0 = r1.timeout()
            okio.Timeout r0 = (okio.Timeout) r0
            return r0
    }

    public final void timeoutEarlyExit() {
            r2 = this;
            boolean r0 = r2.timeoutEarlyExit
            if (r0 != 0) goto Ld
            r0 = 1
            r2.timeoutEarlyExit = r0
            okhttp3.internal.connection.RealCall$timeout$1 r0 = r2.timeout
            r0.exit()
            return
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
