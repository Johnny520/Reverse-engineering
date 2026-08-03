package okhttp3.internal.connection;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
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
    private final okhttp3.internal.connection.RealCall.AnonymousClass1 timeout;
    private boolean timeoutEarlyExit;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class AsyncCall implements java.lang.Runnable {
        private volatile java.util.concurrent.atomic.AtomicInteger callsPerHost;
        private final okhttp3.Callback responseCallback;
        final /* synthetic */ okhttp3.internal.connection.RealCall this$0;

        public AsyncCall(okhttp3.internal.connection.RealCall r1, okhttp3.Callback r2) {
                r0 = this;
                r2.getClass()
                r0.this$0 = r1
                r0.<init>()
                r0.responseCallback = r2
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r2 = 0
                r1.<init>(r2)
                r0.callsPerHost = r1
                return
        }

        public final void executeOn(java.util.concurrent.ExecutorService r3) {
                r2 = this;
                r3.getClass()
                okhttp3.internal.connection.RealCall r0 = r2.this$0
                okhttp3.OkHttpClient r0 = r0.getClient()
                okhttp3.Dispatcher r0 = r0.dispatcher()
                boolean r1 = okhttp3.internal.Util.assertionsEnabled
                if (r1 == 0) goto L26
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L18
                goto L26
            L18:
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r3 = r3.getName()
                java.lang.String r1 = " MUST NOT hold lock on "
                j8.o.i(r3, r1, r0)
                return
            L26:
                r3.execute(r2)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.RejectedExecutionException -> L2c
                return
            L2a:
                r3 = move-exception
                goto L51
            L2c:
                r3 = move-exception
                java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
                java.lang.String r1 = "executor rejected"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L2a
                r0.initCause(r3)     // Catch: java.lang.Throwable -> L2a
                okhttp3.internal.connection.RealCall r3 = r2.this$0     // Catch: java.lang.Throwable -> L2a
                r3.noMoreExchanges$okhttp(r0)     // Catch: java.lang.Throwable -> L2a
                okhttp3.Callback r3 = r2.responseCallback     // Catch: java.lang.Throwable -> L2a
                okhttp3.internal.connection.RealCall r1 = r2.this$0     // Catch: java.lang.Throwable -> L2a
                r3.onFailure(r1, r0)     // Catch: java.lang.Throwable -> L2a
                okhttp3.internal.connection.RealCall r3 = r2.this$0
                okhttp3.OkHttpClient r3 = r3.getClient()
                okhttp3.Dispatcher r3 = r3.dispatcher()
                r3.finished$okhttp(r2)
                return
            L51:
                okhttp3.internal.connection.RealCall r0 = r2.this$0
                okhttp3.OkHttpClient r0 = r0.getClient()
                okhttp3.Dispatcher r0 = r0.dispatcher()
                r0.finished$okhttp(r2)
                throw r3
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

        public final void reuseCallsPerHostFrom(okhttp3.internal.connection.RealCall.AsyncCall r1) {
                r0 = this;
                r1.getClass()
                java.util.concurrent.atomic.AtomicInteger r1 = r1.callsPerHost
                r0.callsPerHost = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                java.lang.String r0 = "Callback failure for "
                java.lang.String r1 = "canceled due to "
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "OkHttp "
                r2.<init>(r3)
                okhttp3.internal.connection.RealCall r3 = r8.this$0
                java.lang.String r3 = r3.redactedUrl$okhttp()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                okhttp3.internal.connection.RealCall r3 = r8.this$0
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                java.lang.String r5 = r4.getName()
                r4.setName(r2)
                okhttp3.internal.connection.RealCall$timeout$1 r2 = okhttp3.internal.connection.RealCall.access$getTimeout$p(r3)     // Catch: java.lang.Throwable -> L43
                r2.enter()     // Catch: java.lang.Throwable -> L43
                r2 = 0
                okhttp3.Response r2 = r3.getResponseWithInterceptorChain$okhttp()     // Catch: java.lang.Throwable -> L4b java.io.IOException -> L6e
                r6 = 1
                okhttp3.Callback r7 = r8.responseCallback     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
                r7.onResponse(r3, r2)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
                okhttp3.OkHttpClient r0 = r3.getClient()     // Catch: java.lang.Throwable -> L43
            L3b:
                okhttp3.Dispatcher r0 = r0.dispatcher()     // Catch: java.lang.Throwable -> L43
                r0.finished$okhttp(r8)     // Catch: java.lang.Throwable -> L43
                goto L96
            L43:
                r0 = move-exception
                goto La6
            L45:
                r0 = move-exception
                r2 = r6
                goto L4c
            L48:
                r1 = move-exception
                r2 = r6
                goto L6f
            L4b:
                r0 = move-exception
            L4c:
                r3.cancel()     // Catch: java.lang.Throwable -> L6b
                if (r2 != 0) goto L6d
                java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L6b
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
                r6.<init>(r1)     // Catch: java.lang.Throwable -> L6b
                r6.append(r0)     // Catch: java.lang.Throwable -> L6b
                java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L6b
                r2.<init>(r1)     // Catch: java.lang.Throwable -> L6b
                ac.p.e(r2, r0)     // Catch: java.lang.Throwable -> L6b
                okhttp3.Callback r1 = r8.responseCallback     // Catch: java.lang.Throwable -> L6b
                r1.onFailure(r3, r2)     // Catch: java.lang.Throwable -> L6b
                goto L6d
            L6b:
                r0 = move-exception
                goto L9a
            L6d:
                throw r0     // Catch: java.lang.Throwable -> L6b
            L6e:
                r1 = move-exception
            L6f:
                if (r2 == 0) goto L8c
                okhttp3.internal.platform.Platform$Companion r2 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.Throwable -> L6b
                okhttp3.internal.platform.Platform r2 = r2.get()     // Catch: java.lang.Throwable -> L6b
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
                r6.<init>(r0)     // Catch: java.lang.Throwable -> L6b
                java.lang.String r0 = okhttp3.internal.connection.RealCall.access$toLoggableString(r3)     // Catch: java.lang.Throwable -> L6b
                r6.append(r0)     // Catch: java.lang.Throwable -> L6b
                java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L6b
                r6 = 4
                r2.log(r0, r6, r1)     // Catch: java.lang.Throwable -> L6b
                goto L91
            L8c:
                okhttp3.Callback r0 = r8.responseCallback     // Catch: java.lang.Throwable -> L6b
                r0.onFailure(r3, r1)     // Catch: java.lang.Throwable -> L6b
            L91:
                okhttp3.OkHttpClient r0 = r3.getClient()     // Catch: java.lang.Throwable -> L43
                goto L3b
            L96:
                r4.setName(r5)
                return
            L9a:
                okhttp3.OkHttpClient r1 = r3.getClient()     // Catch: java.lang.Throwable -> L43
                okhttp3.Dispatcher r1 = r1.dispatcher()     // Catch: java.lang.Throwable -> L43
                r1.finished$okhttp(r8)     // Catch: java.lang.Throwable -> L43
                throw r0     // Catch: java.lang.Throwable -> L43
            La6:
                r4.setName(r5)
                throw r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class CallReference extends java.lang.ref.WeakReference<okhttp3.internal.connection.RealCall> {
        private final java.lang.Object callStackTrace;

        public CallReference(okhttp3.internal.connection.RealCall r1, java.lang.Object r2) {
                r0 = this;
                r1.getClass()
                r0.<init>(r1)
                r0.callStackTrace = r2
                return
        }

        public final java.lang.Object getCallStackTrace() {
                r1 = this;
                java.lang.Object r0 = r1.callStackTrace
                return r0
        }
    }


    public RealCall(okhttp3.OkHttpClient r3, okhttp3.Request r4, boolean r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            r2.<init>()
            r2.client = r3
            r2.originalRequest = r4
            r2.forWebSocket = r5
            okhttp3.ConnectionPool r4 = r3.connectionPool()
            okhttp3.internal.connection.RealConnectionPool r4 = r4.getDelegate$okhttp()
            r2.connectionPool = r4
            okhttp3.EventListener$Factory r4 = r3.eventListenerFactory()
            okhttp3.EventListener r4 = r4.create(r2)
            r2.eventListener = r4
            okhttp3.internal.connection.RealCall$timeout$1 r4 = new okhttp3.internal.connection.RealCall$timeout$1
            r4.<init>(r2)
            int r3 = r3.callTimeoutMillis()
            long r0 = (long) r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4.timeout(r0, r3)
            r2.timeout = r4
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>()
            r2.executed = r3
            r3 = 1
            r2.expectMoreExchanges = r3
            return
    }

    public static final /* synthetic */ okhttp3.internal.connection.RealCall.AnonymousClass1 access$getTimeout$p(okhttp3.internal.connection.RealCall r0) {
            okhttp3.internal.connection.RealCall$timeout$1 r0 = r0.timeout
            return r0
    }

    public static final /* synthetic */ java.lang.String access$toLoggableString(okhttp3.internal.connection.RealCall r0) {
            java.lang.String r0 = r0.toLoggableString()
            return r0
    }

    private final <E extends java.io.IOException> E callDone(E r4) {
            r3 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L1a
            boolean r1 = java.lang.Thread.holdsLock(r3)
            if (r1 != 0) goto Lb
            goto L1a
        Lb:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = " MUST NOT hold lock on "
            j8.o.i(r4, r0, r3)
        L18:
            r4 = 0
            return r4
        L1a:
            okhttp3.internal.connection.RealConnection r1 = r3.connection
            if (r1 == 0) goto L56
            if (r0 == 0) goto L35
            boolean r0 = java.lang.Thread.holdsLock(r1)
            if (r0 != 0) goto L27
            goto L35
        L27:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = " MUST NOT hold lock on "
            j8.o.i(r4, r0, r1)
            goto L18
        L35:
            monitor-enter(r1)
            java.net.Socket r0 = r3.releaseConnectionNoEvents$okhttp()     // Catch: java.lang.Throwable -> L53
            monitor-exit(r1)
            okhttp3.internal.connection.RealConnection r2 = r3.connection
            if (r2 != 0) goto L4a
            if (r0 == 0) goto L44
            okhttp3.internal.Util.closeQuietly(r0)
        L44:
            okhttp3.EventListener r0 = r3.eventListener
            r0.connectionReleased(r3, r1)
            goto L56
        L4a:
            if (r0 != 0) goto L4d
            goto L56
        L4d:
            java.lang.String r4 = "Check failed."
            j8.o.A(r4)
            goto L18
        L53:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        L56:
            java.io.IOException r0 = r3.timeoutExit(r4)
            okhttp3.EventListener r1 = r3.eventListener
            if (r4 == 0) goto L65
            r0.getClass()
            r1.callFailed(r3, r0)
            return r0
        L65:
            r1.callEnd(r3)
            return r0
    }

    private final void callStart() {
            r2 = this;
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r0 = r0.get()
            java.lang.String r1 = "response.body().close()"
            java.lang.Object r0 = r0.getStackTraceForCloseable(r1)
            r2.callStackTrace = r0
            okhttp3.EventListener r0 = r2.eventListener
            r0.callStart(r2)
            return
    }

    private final okhttp3.Address createAddress(okhttp3.HttpUrl r15) {
            r14 = this;
            boolean r0 = r15.isHttps()
            if (r0 == 0) goto L1c
            okhttp3.OkHttpClient r0 = r14.client
            javax.net.ssl.SSLSocketFactory r0 = r0.sslSocketFactory()
            okhttp3.OkHttpClient r1 = r14.client
            javax.net.ssl.HostnameVerifier r1 = r1.hostnameVerifier()
            okhttp3.OkHttpClient r2 = r14.client
            okhttp3.CertificatePinner r2 = r2.certificatePinner()
            r6 = r0
            r7 = r1
            r8 = r2
            goto L20
        L1c:
            r0 = 0
            r6 = r0
            r7 = r6
            r8 = r7
        L20:
            okhttp3.Address r1 = new okhttp3.Address
            java.lang.String r2 = r15.host()
            int r3 = r15.port()
            okhttp3.OkHttpClient r15 = r14.client
            okhttp3.Dns r4 = r15.dns()
            okhttp3.OkHttpClient r15 = r14.client
            javax.net.SocketFactory r5 = r15.socketFactory()
            okhttp3.OkHttpClient r15 = r14.client
            okhttp3.Authenticator r9 = r15.proxyAuthenticator()
            okhttp3.OkHttpClient r15 = r14.client
            java.net.Proxy r10 = r15.proxy()
            okhttp3.OkHttpClient r15 = r14.client
            java.util.List r11 = r15.protocols()
            okhttp3.OkHttpClient r15 = r14.client
            java.util.List r12 = r15.connectionSpecs()
            okhttp3.OkHttpClient r15 = r14.client
            java.net.ProxySelector r13 = r15.proxySelector()
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r1
    }

    private final <E extends java.io.IOException> E timeoutExit(E r3) {
            r2 = this;
            boolean r0 = r2.timeoutEarlyExit
            if (r0 == 0) goto L5
            goto Ld
        L5:
            okhttp3.internal.connection.RealCall$timeout$1 r0 = r2.timeout
            boolean r0 = r0.exit()
            if (r0 != 0) goto Le
        Ld:
            return r3
        Le:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            if (r3 == 0) goto L1a
            r0.initCause(r3)
        L1a:
            return r0
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
            r0.append(r1)
            boolean r1 = r2.forWebSocket
            if (r1 == 0) goto L1a
            java.lang.String r1 = "web socket"
            goto L1c
        L1a:
            java.lang.String r1 = "call"
        L1c:
            r0.append(r1)
            java.lang.String r1 = " to "
            r0.append(r1)
            java.lang.String r1 = r2.redactedUrl$okhttp()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void acquireConnectionNoEvents(okhttp3.internal.connection.RealConnection r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L1c
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 == 0) goto Le
            goto L1c
        Le:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = " MUST hold lock on "
            j8.o.i(r0, r1, r3)
            return
        L1c:
            okhttp3.internal.connection.RealConnection r0 = r2.connection
            if (r0 != 0) goto L31
            r2.connection = r3
            java.util.List r3 = r3.getCalls()
            okhttp3.internal.connection.RealCall$CallReference r0 = new okhttp3.internal.connection.RealCall$CallReference
            java.lang.Object r1 = r2.callStackTrace
            r0.<init>(r2, r1)
            r3.add(r0)
            return
        L31:
            java.lang.String r3 = "Check failed."
            j8.o.A(r3)
            return
    }

    @Override // okhttp3.Call
    public void cancel() {
            r1 = this;
            boolean r0 = r1.canceled
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.canceled = r0
            okhttp3.internal.connection.Exchange r0 = r1.exchange
            if (r0 == 0) goto Lf
            r0.cancel()
        Lf:
            okhttp3.internal.connection.RealConnection r0 = r1.connectionToCancel
            if (r0 == 0) goto L16
            r0.cancel()
        L16:
            okhttp3.EventListener r0 = r1.eventListener
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
            r4.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.executed
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L1f
            r3.callStart()
            okhttp3.OkHttpClient r0 = r3.client
            okhttp3.Dispatcher r0 = r0.dispatcher()
            okhttp3.internal.connection.RealCall$AsyncCall r1 = new okhttp3.internal.connection.RealCall$AsyncCall
            r1.<init>(r3, r4)
            r0.enqueue$okhttp(r1)
            return
        L1f:
            java.lang.String r4 = "Already Executed"
            j8.o.A(r4)
            return
    }

    public final void enterNetworkInterceptorExchange(okhttp3.Request r3, boolean r4) {
            r2 = this;
            r3.getClass()
            okhttp3.internal.connection.Exchange r0 = r2.interceptorScopedExchange
            if (r0 != 0) goto L3b
            monitor-enter(r2)
            boolean r0 = r2.responseBodyOpen     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L31
            boolean r0 = r2.requestBodyOpen     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L27
            monitor-exit(r2)
            if (r4 == 0) goto L26
            okhttp3.internal.connection.ExchangeFinder r4 = new okhttp3.internal.connection.ExchangeFinder
            okhttp3.internal.connection.RealConnectionPool r0 = r2.connectionPool
            okhttp3.HttpUrl r3 = r3.url()
            okhttp3.Address r3 = r2.createAddress(r3)
            okhttp3.EventListener r1 = r2.eventListener
            r4.<init>(r0, r3, r2, r1)
            r2.exchangeFinder = r4
        L26:
            return
        L27:
            java.lang.String r3 = "Check failed."
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2f
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L2f
            throw r4     // Catch: java.lang.Throwable -> L2f
        L2f:
            r3 = move-exception
            goto L39
        L31:
            java.lang.String r3 = "cannot make a new request because the previous response is still open: please call response.close()"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2f
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L2f
            throw r4     // Catch: java.lang.Throwable -> L2f
        L39:
            monitor-exit(r2)
            throw r3
        L3b:
            java.lang.String r3 = "Check failed."
            j8.o.A(r3)
            return
    }

    @Override // okhttp3.Call
    public okhttp3.Response execute() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.executed
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L34
            okhttp3.internal.connection.RealCall$timeout$1 r0 = r3.timeout
            r0.enter()
            r3.callStart()
            okhttp3.OkHttpClient r0 = r3.client     // Catch: java.lang.Throwable -> L29
            okhttp3.Dispatcher r0 = r0.dispatcher()     // Catch: java.lang.Throwable -> L29
            r0.executed$okhttp(r3)     // Catch: java.lang.Throwable -> L29
            okhttp3.Response r0 = r3.getResponseWithInterceptorChain$okhttp()     // Catch: java.lang.Throwable -> L29
            okhttp3.OkHttpClient r1 = r3.client
            okhttp3.Dispatcher r1 = r1.dispatcher()
            r1.finished$okhttp(r3)
            return r0
        L29:
            r0 = move-exception
            okhttp3.OkHttpClient r1 = r3.client
            okhttp3.Dispatcher r1 = r1.dispatcher()
            r1.finished$okhttp(r3)
            throw r0
        L34:
            java.lang.String r0 = "Already Executed"
            j8.o.A(r0)
            r0 = 0
            return r0
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.expectMoreExchanges     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L13
            monitor-exit(r1)
            if (r2 == 0) goto Lf
            okhttp3.internal.connection.Exchange r2 = r1.exchange
            if (r2 == 0) goto Lf
            r2.detachWithViolence()
        Lf:
            r2 = 0
            r1.interceptorScopedExchange = r2
            return
        L13:
            java.lang.String r2 = "released"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1b
            throw r0     // Catch: java.lang.Throwable -> L1b
        L1b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
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

    public final okhttp3.Response getResponseWithInterceptorChain$okhttp() {
            r9 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            okhttp3.OkHttpClient r0 = r9.client
            java.util.List r0 = r0.interceptors()
            tf.r.h1(r2, r0)
            okhttp3.internal.http.RetryAndFollowUpInterceptor r0 = new okhttp3.internal.http.RetryAndFollowUpInterceptor
            okhttp3.OkHttpClient r1 = r9.client
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.BridgeInterceptor r0 = new okhttp3.internal.http.BridgeInterceptor
            okhttp3.OkHttpClient r1 = r9.client
            okhttp3.CookieJar r1 = r1.cookieJar()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.cache.CacheInterceptor r0 = new okhttp3.internal.cache.CacheInterceptor
            okhttp3.OkHttpClient r1 = r9.client
            okhttp3.Cache r1 = r1.cache()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.connection.ConnectInterceptor r0 = okhttp3.internal.connection.ConnectInterceptor.INSTANCE
            r2.add(r0)
            boolean r0 = r9.forWebSocket
            if (r0 != 0) goto L46
            okhttp3.OkHttpClient r0 = r9.client
            java.util.List r0 = r0.networkInterceptors()
            tf.r.h1(r2, r0)
        L46:
            okhttp3.internal.http.CallServerInterceptor r0 = new okhttp3.internal.http.CallServerInterceptor
            boolean r1 = r9.forWebSocket
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.RealInterceptorChain r0 = new okhttp3.internal.http.RealInterceptorChain
            okhttp3.Request r5 = r9.originalRequest
            okhttp3.OkHttpClient r1 = r9.client
            int r6 = r1.connectTimeoutMillis()
            okhttp3.OkHttpClient r1 = r9.client
            int r7 = r1.readTimeoutMillis()
            okhttp3.OkHttpClient r1 = r9.client
            int r8 = r1.writeTimeoutMillis()
            r3 = 0
            r4 = 0
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r2 = 0
            r3 = 0
            okhttp3.Request r4 = r1.originalRequest     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            okhttp3.Response r0 = r0.proceed(r4)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            boolean r4 = r9.isCanceled()     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            if (r4 != 0) goto L7e
            r9.noMoreExchanges$okhttp(r2)
            return r0
        L7e:
            okhttp3.internal.Util.closeQuietly(r0)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            java.lang.String r4 = "Canceled"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            throw r0     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
        L89:
            r0 = move-exception
            goto L95
        L8b:
            r0 = move-exception
            r3 = 1
            java.io.IOException r0 = r9.noMoreExchanges$okhttp(r0)     // Catch: java.lang.Throwable -> L89
            r0.getClass()     // Catch: java.lang.Throwable -> L89
            throw r0     // Catch: java.lang.Throwable -> L89
        L95:
            if (r3 != 0) goto L9a
            r9.noMoreExchanges$okhttp(r2)
        L9a:
            throw r0
    }

    public final okhttp3.internal.connection.Exchange initExchange$okhttp(okhttp3.internal.http.RealInterceptorChain r4) {
            r3 = this;
            r4.getClass()
            monitor-enter(r3)
            boolean r0 = r3.expectMoreExchanges     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L4f
            boolean r0 = r3.responseBodyOpen     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L47
            boolean r0 = r3.requestBodyOpen     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L3d
            monitor-exit(r3)
            okhttp3.internal.connection.ExchangeFinder r0 = r3.exchangeFinder
            r0.getClass()
            okhttp3.OkHttpClient r1 = r3.client
            okhttp3.internal.http.ExchangeCodec r4 = r0.find(r1, r4)
            okhttp3.internal.connection.Exchange r1 = new okhttp3.internal.connection.Exchange
            okhttp3.EventListener r2 = r3.eventListener
            r1.<init>(r3, r2, r0, r4)
            r3.interceptorScopedExchange = r1
            r3.exchange = r1
            monitor-enter(r3)
            r4 = 1
            r3.requestBodyOpen = r4     // Catch: java.lang.Throwable -> L3a
            r3.responseBodyOpen = r4     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r3)
            boolean r4 = r3.canceled
            if (r4 != 0) goto L33
            return r1
        L33:
            java.lang.String r4 = "Canceled"
            j8.o.y(r4)
            r4 = 0
            return r4
        L3a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L3d:
            java.lang.String r4 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L45
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> L45
        L45:
            r4 = move-exception
            goto L57
        L47:
            java.lang.String r4 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L45
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> L45
        L4f:
            java.lang.String r4 = "released"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L45
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> L45
        L57:
            monitor-exit(r3)
            throw r4
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

    public final <E extends java.io.IOException> E messageDone$okhttp(okhttp3.internal.connection.Exchange r2, boolean r3, boolean r4, E r5) {
            r1 = this;
            r2.getClass()
            okhttp3.internal.connection.Exchange r0 = r1.exchange
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lc
            goto L56
        Lc:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L17
            boolean r0 = r1.requestBodyOpen     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L1d
            goto L17
        L15:
            r2 = move-exception
            goto L3f
        L17:
            if (r4 == 0) goto L41
            boolean r0 = r1.responseBodyOpen     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L41
        L1d:
            if (r3 == 0) goto L21
            r1.requestBodyOpen = r2     // Catch: java.lang.Throwable -> L15
        L21:
            if (r4 == 0) goto L25
            r1.responseBodyOpen = r2     // Catch: java.lang.Throwable -> L15
        L25:
            boolean r3 = r1.requestBodyOpen     // Catch: java.lang.Throwable -> L15
            r4 = 1
            if (r3 != 0) goto L30
            boolean r0 = r1.responseBodyOpen     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L30
            r0 = r4
            goto L31
        L30:
            r0 = r2
        L31:
            if (r3 != 0) goto L3c
            boolean r3 = r1.responseBodyOpen     // Catch: java.lang.Throwable -> L15
            if (r3 != 0) goto L3c
            boolean r3 = r1.expectMoreExchanges     // Catch: java.lang.Throwable -> L15
            if (r3 != 0) goto L3c
            r2 = r4
        L3c:
            r3 = r2
            r2 = r0
            goto L42
        L3f:
            monitor-exit(r1)
            throw r2
        L41:
            r3 = r2
        L42:
            monitor-exit(r1)
            if (r2 == 0) goto L4f
            r2 = 0
            r1.exchange = r2
            okhttp3.internal.connection.RealConnection r2 = r1.connection
            if (r2 == 0) goto L4f
            r2.incrementSuccessCount$okhttp()
        L4f:
            if (r3 == 0) goto L56
            java.io.IOException r2 = r1.callDone(r5)
            return r2
        L56:
            return r5
    }

    public final java.io.IOException noMoreExchanges$okhttp(java.io.IOException r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.expectMoreExchanges     // Catch: java.lang.Throwable -> L12
            r1 = 0
            if (r0 == 0) goto L14
            r2.expectMoreExchanges = r1     // Catch: java.lang.Throwable -> L12
            boolean r0 = r2.requestBodyOpen     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L14
            boolean r0 = r2.responseBodyOpen     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L14
            r1 = 1
            goto L14
        L12:
            r3 = move-exception
            goto L1c
        L14:
            monitor-exit(r2)
            if (r1 == 0) goto L1b
            java.io.IOException r3 = r2.callDone(r3)
        L1b:
            return r3
        L1c:
            monitor-exit(r2)
            throw r3
    }

    public final java.lang.String redactedUrl$okhttp() {
            r1 = this;
            okhttp3.Request r0 = r1.originalRequest
            okhttp3.HttpUrl r0 = r0.url()
            java.lang.String r0 = r0.redact()
            return r0
    }

    public final java.net.Socket releaseConnectionNoEvents$okhttp() {
            r6 = this;
            okhttp3.internal.connection.RealConnection r0 = r6.connection
            r0.getClass()
            boolean r1 = okhttp3.internal.Util.assertionsEnabled
            if (r1 == 0) goto L1f
            boolean r1 = java.lang.Thread.holdsLock(r0)
            if (r1 == 0) goto L10
            goto L1f
        L10:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = " MUST hold lock on "
            j8.o.i(r1, r2, r0)
        L1d:
            r0 = 0
            return r0
        L1f:
            java.util.List r1 = r0.getCalls()
            java.util.Iterator r2 = r1.iterator()
            r3 = 0
        L28:
            boolean r4 = r2.hasNext()
            r5 = -1
            if (r4 == 0) goto L43
            java.lang.Object r4 = r2.next()
            java.lang.ref.Reference r4 = (java.lang.ref.Reference) r4
            java.lang.Object r4 = r4.get()
            boolean r4 = gg.l.a(r4, r6)
            if (r4 == 0) goto L40
            goto L44
        L40:
            int r3 = r3 + 1
            goto L28
        L43:
            r3 = r5
        L44:
            if (r3 == r5) goto L67
            r1.remove(r3)
            r2 = 0
            r6.connection = r2
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L66
            long r3 = java.lang.System.nanoTime()
            r0.setIdleAtNs$okhttp(r3)
            okhttp3.internal.connection.RealConnectionPool r1 = r6.connectionPool
            boolean r1 = r1.connectionBecameIdle(r0)
            if (r1 == 0) goto L66
            java.net.Socket r0 = r0.socket()
            return r0
        L66:
            return r2
        L67:
            java.lang.String r0 = "Check failed."
            j8.o.A(r0)
            goto L1d
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
            r0.getClass()
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
            return r0
    }

    @Override // okhttp3.Call
    public /* bridge */ /* synthetic */ okio.Timeout timeout() {
            r1 = this;
            okio.AsyncTimeout r0 = r1.timeout()
            return r0
    }

    public final void timeoutEarlyExit() {
            r1 = this;
            boolean r0 = r1.timeoutEarlyExit
            if (r0 != 0) goto Ld
            r0 = 1
            r1.timeoutEarlyExit = r0
            okhttp3.internal.connection.RealCall$timeout$1 r0 = r1.timeout
            r0.exit()
            return
        Ld:
            java.lang.String r0 = "Check failed."
            j8.o.A(r0)
            return
    }
}
