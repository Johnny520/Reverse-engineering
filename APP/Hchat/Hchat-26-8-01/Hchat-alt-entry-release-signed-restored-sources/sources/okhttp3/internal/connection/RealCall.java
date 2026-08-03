package okhttp3.internal.connection;

import ac.AbstractC0063p;
import gg.AbstractC1416l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CertificatePinner;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;
import okio.AsyncTimeout;
import p136j8.C2104o;
import tf.AbstractC4171r;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RealCall implements Call {
    private Object callStackTrace;
    private volatile boolean canceled;
    private final OkHttpClient client;
    private RealConnection connection;
    private final RealConnectionPool connectionPool;
    private volatile RealConnection connectionToCancel;
    private final EventListener eventListener;
    private volatile Exchange exchange;
    private ExchangeFinder exchangeFinder;
    private final AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;
    private Exchange interceptorScopedExchange;
    private final Request originalRequest;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;
    private final C31741 timeout;
    private boolean timeoutEarlyExit;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class AsyncCall implements Runnable {
        private volatile AtomicInteger callsPerHost;
        private final Callback responseCallback;
        final /* synthetic */ RealCall this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AsyncCall(RealCall realCall, Callback callback) {
            callback.getClass();
            this.this$0 = realCall;
            this.responseCallback = callback;
            this.callsPerHost = new AtomicInteger(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void executeOn(ExecutorService executorService) {
            executorService.getClass();
            Dispatcher dispatcher = this.this$0.getClient().dispatcher();
            if (Util.assertionsEnabled && Thread.holdsLock(dispatcher)) {
                C2104o.m5284i(Thread.currentThread().getName(), " MUST NOT hold lock on ", dispatcher);
                return;
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e6) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e6);
                    this.this$0.noMoreExchanges$okhttp(interruptedIOException);
                    this.responseCallback.onFailure(this.this$0, interruptedIOException);
                    this.this$0.getClient().dispatcher().finished$okhttp(this);
                }
            } catch (Throwable th2) {
                this.this$0.getClient().dispatcher().finished$okhttp(this);
                throw th2;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final RealCall getCall() {
            return this.this$0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getHost() {
            return this.this$0.getOriginalRequest().url().host();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Request getRequest() {
            return this.this$0.getOriginalRequest();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void reuseCallsPerHostFrom(AsyncCall asyncCall) {
            asyncCall.getClass();
            this.callsPerHost = asyncCall.callsPerHost;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public void run() {
            OkHttpClient client;
            String str = "OkHttp " + this.this$0.redactedUrl$okhttp();
            RealCall realCall = this.this$0;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                realCall.timeout.enter();
                boolean z9 = false;
                try {
                    try {
                        try {
                            this.responseCallback.onResponse(realCall, realCall.getResponseWithInterceptorChain$okhttp());
                            client = realCall.getClient();
                        } catch (IOException e6) {
                            e = e6;
                            z9 = true;
                            if (z9) {
                                Platform.Companion.get().log("Callback failure for " + realCall.toLoggableString(), 4, e);
                            } else {
                                this.responseCallback.onFailure(realCall, e);
                            }
                            client = realCall.getClient();
                        } catch (Throwable th2) {
                            th = th2;
                            z9 = true;
                            realCall.cancel();
                            if (!z9) {
                                IOException iOException = new IOException("canceled due to " + th);
                                AbstractC0063p.m412e(iOException, th);
                                this.responseCallback.onFailure(realCall, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        realCall.getClient().dispatcher().finished$okhttp(this);
                        throw th3;
                    }
                } catch (IOException e7) {
                    e = e7;
                } catch (Throwable th4) {
                    th = th4;
                }
                client.dispatcher().finished$okhttp(this);
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class CallReference extends WeakReference<RealCall> {
        private final Object callStackTrace;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(RealCall realCall, Object obj) {
            super(realCall);
            realCall.getClass();
            this.callStackTrace = obj;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r4v5, types: [okhttp3.internal.connection.RealCall$timeout$1, okio.Timeout] */
    public RealCall(OkHttpClient okHttpClient, Request request, boolean z9) {
        okHttpClient.getClass();
        request.getClass();
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z9;
        this.connectionPool = okHttpClient.connectionPool().getDelegate$okhttp();
        this.eventListener = okHttpClient.eventListenerFactory().create(this);
        ?? r42 = new AsyncTimeout() { // from class: okhttp3.internal.connection.RealCall.timeout.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okio.AsyncTimeout
            public void timedOut() {
                RealCall.this.cancel();
            }
        };
        r42.timeout(okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = r42;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final <E extends IOException> E callDone(E e6) {
        Socket socketReleaseConnectionNoEvents$okhttp;
        boolean z9 = Util.assertionsEnabled;
        if (z9 && Thread.holdsLock(this)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return null;
        }
        RealConnection realConnection = this.connection;
        if (realConnection != null) {
            if (z9 && Thread.holdsLock(realConnection)) {
                C2104o.m5284i(Thread.currentThread().getName(), " MUST NOT hold lock on ", realConnection);
                return null;
            }
            synchronized (realConnection) {
                socketReleaseConnectionNoEvents$okhttp = releaseConnectionNoEvents$okhttp();
            }
            if (this.connection == null) {
                if (socketReleaseConnectionNoEvents$okhttp != null) {
                    Util.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
                }
                this.eventListener.connectionReleased(this, realConnection);
            } else if (socketReleaseConnectionNoEvents$okhttp != null) {
                C2104o.m5276A("Check failed.");
                return null;
            }
        }
        E e7 = (E) timeoutExit(e6);
        EventListener eventListener = this.eventListener;
        if (e6 == null) {
            eventListener.callEnd(this);
            return e7;
        }
        e7.getClass();
        eventListener.callFailed(this, e7);
        return e7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void callStart() {
        this.callStackTrace = Platform.Companion.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Address createAddress(HttpUrl httpUrl) {
        SSLSocketFactory sslSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        if (httpUrl.isHttps()) {
            sslSocketFactory = this.client.sslSocketFactory();
            hostnameVerifier = this.client.hostnameVerifier();
            certificatePinner = this.client.certificatePinner();
        } else {
            sslSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.host(), httpUrl.port(), this.client.dns(), this.client.socketFactory(), sslSocketFactory, hostnameVerifier, certificatePinner, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final <E extends IOException> E timeoutExit(E e6) {
        if (this.timeoutEarlyExit || !exit()) {
            return e6;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (e6 != null) {
            interruptedIOException.initCause(e6);
        }
        return interruptedIOException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final String toLoggableString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(isCanceled() ? "canceled " : HttpUrl.FRAGMENT_ENCODE_SET);
        sb2.append(this.forWebSocket ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(redactedUrl$okhttp());
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void acquireConnectionNoEvents(RealConnection realConnection) {
        realConnection.getClass();
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST hold lock on ", realConnection);
        } else if (this.connection != null) {
            C2104o.m5276A("Check failed.");
        } else {
            this.connection = realConnection;
            realConnection.getCalls().add(new CallReference(this, this.callStackTrace));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.Call
    public void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            exchange.cancel();
        }
        RealConnection realConnection = this.connectionToCancel;
        if (realConnection != null) {
            realConnection.cancel();
        }
        this.eventListener.canceled(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: clone()Lokhttp3/Call; */
    @Override // okhttp3.Call
    public RealCall clone() {
        return new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.Call
    public void enqueue(Callback callback) {
        callback.getClass();
        if (!this.executed.compareAndSet(false, true)) {
            C2104o.m5276A("Already Executed");
        } else {
            callStart();
            this.client.dispatcher().enqueue$okhttp(new AsyncCall(this, callback));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void enterNetworkInterceptorExchange(Request request, boolean z9) {
        request.getClass();
        if (this.interceptorScopedExchange != null) {
            C2104o.m5276A("Check failed.");
            return;
        }
        synchronized (this) {
            try {
                if (this.responseBodyOpen) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                }
                if (this.requestBodyOpen) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z9) {
            this.exchangeFinder = new ExchangeFinder(this.connectionPool, createAddress(request.url()), this, this.eventListener);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.Call
    public Response execute() {
        if (!this.executed.compareAndSet(false, true)) {
            C2104o.m5276A("Already Executed");
            return null;
        }
        enter();
        callStart();
        try {
            this.client.dispatcher().executed$okhttp(this);
            return getResponseWithInterceptorChain$okhttp();
        } finally {
            this.client.dispatcher().finished$okhttp(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void exitNetworkInterceptorExchange$okhttp(boolean z9) {
        Exchange exchange;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
        }
        if (z9 && (exchange = this.exchange) != null) {
            exchange.detachWithViolence();
        }
        this.interceptorScopedExchange = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OkHttpClient getClient() {
        return this.client;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final RealConnection getConnection() {
        return this.connection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final RealConnection getConnectionToCancel() {
        return this.connectionToCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Exchange getInterceptorScopedExchange$okhttp() {
        return this.interceptorScopedExchange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Request getOriginalRequest() {
        return this.originalRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Response getResponseWithInterceptorChain$okhttp() {
        ArrayList arrayList = new ArrayList();
        AbstractC4171r.m8432h1(arrayList, this.client.interceptors());
        arrayList.add(new RetryAndFollowUpInterceptor(this.client));
        arrayList.add(new BridgeInterceptor(this.client.cookieJar()));
        arrayList.add(new CacheInterceptor(this.client.cache()));
        arrayList.add(ConnectInterceptor.INSTANCE);
        if (!this.forWebSocket) {
            AbstractC4171r.m8432h1(arrayList, this.client.networkInterceptors());
        }
        arrayList.add(new CallServerInterceptor(this.forWebSocket));
        try {
            try {
                Response responseProceed = new RealInterceptorChain(this, arrayList, 0, null, this.originalRequest, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis()).proceed(this.originalRequest);
                if (isCanceled()) {
                    Util.closeQuietly(responseProceed);
                    throw new IOException("Canceled");
                }
                noMoreExchanges$okhttp(null);
                return responseProceed;
            } catch (IOException e6) {
                IOException iOExceptionNoMoreExchanges$okhttp = noMoreExchanges$okhttp(e6);
                iOExceptionNoMoreExchanges$okhttp.getClass();
                throw iOExceptionNoMoreExchanges$okhttp;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                noMoreExchanges$okhttp(null);
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Exchange initExchange$okhttp(RealInterceptorChain realInterceptorChain) throws IOException {
        realInterceptorChain.getClass();
        synchronized (this) {
            try {
                if (!this.expectMoreExchanges) {
                    throw new IllegalStateException("released");
                }
                if (this.responseBodyOpen) {
                    throw new IllegalStateException("Check failed.");
                }
                if (this.requestBodyOpen) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        exchangeFinder.getClass();
        Exchange exchange = new Exchange(this, this.eventListener, exchangeFinder, exchangeFinder.find(this.client, realInterceptorChain));
        this.interceptorScopedExchange = exchange;
        this.exchange = exchange;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
        }
        if (!this.canceled) {
            return exchange;
        }
        C2104o.m5299y("Canceled");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.Call
    public boolean isCanceled() {
        return this.canceled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.Call
    public boolean isExecuted() {
        return this.executed.get();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final <E extends IOException> E messageDone$okhttp(Exchange exchange, boolean z9, boolean z10, E e6) {
        boolean z11;
        boolean z12;
        exchange.getClass();
        if (exchange.equals(this.exchange)) {
            synchronized (this) {
                z11 = false;
                if (z9) {
                    try {
                        if (!this.requestBodyOpen) {
                            if (z10 || !this.responseBodyOpen) {
                                z12 = false;
                            }
                        }
                        if (z9) {
                            this.requestBodyOpen = false;
                        }
                        if (z10) {
                            this.responseBodyOpen = false;
                        }
                        boolean z13 = this.requestBodyOpen;
                        boolean z14 = (z13 || this.responseBodyOpen) ? false : true;
                        if (!z13 && !this.responseBodyOpen) {
                            if (!this.expectMoreExchanges) {
                                z11 = true;
                            }
                        }
                        z12 = z11;
                        z11 = z14;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    if (z10) {
                    }
                    z12 = false;
                }
            }
            if (z11) {
                this.exchange = null;
                RealConnection realConnection = this.connection;
                if (realConnection != null) {
                    realConnection.incrementSuccessCount$okhttp();
                }
            }
            if (z12) {
                return (E) callDone(e6);
            }
        }
        return e6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IOException noMoreExchanges$okhttp(IOException iOException) {
        boolean z9;
        synchronized (this) {
            z9 = false;
            if (this.expectMoreExchanges) {
                this.expectMoreExchanges = false;
                if (!this.requestBodyOpen) {
                    if (!this.responseBodyOpen) {
                        z9 = true;
                    }
                }
            }
        }
        return z9 ? callDone(iOException) : iOException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String redactedUrl$okhttp() {
        return this.originalRequest.url().redact();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Socket releaseConnectionNoEvents$okhttp() {
        RealConnection realConnection = this.connection;
        realConnection.getClass();
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST hold lock on ", realConnection);
            return null;
        }
        List<Reference<RealCall>> calls = realConnection.getCalls();
        Iterator<Reference<RealCall>> it = calls.iterator();
        int i9 = 0;
        while (true) {
            if (!it.hasNext()) {
                i9 = -1;
                break;
            }
            if (AbstractC1416l.m3825a(it.next().get(), this)) {
                break;
            }
            i9++;
        }
        if (i9 == -1) {
            C2104o.m5276A("Check failed.");
            return null;
        }
        calls.remove(i9);
        this.connection = null;
        if (calls.isEmpty()) {
            realConnection.setIdleAtNs$okhttp(System.nanoTime());
            if (this.connectionPool.connectionBecameIdle(realConnection)) {
                return realConnection.socket();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.Call
    public Request request() {
        return this.originalRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean retryAfterFailure() {
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        exchangeFinder.getClass();
        return exchangeFinder.retryAfterFailure();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setConnectionToCancel(RealConnection realConnection) {
        this.connectionToCancel = realConnection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void timeoutEarlyExit() {
        if (this.timeoutEarlyExit) {
            C2104o.m5276A("Check failed.");
        } else {
            this.timeoutEarlyExit = true;
            exit();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: timeout()Lokio/Timeout; */
    @Override // okhttp3.Call
    public AsyncTimeout timeout() {
        return this.timeout;
    }
}
