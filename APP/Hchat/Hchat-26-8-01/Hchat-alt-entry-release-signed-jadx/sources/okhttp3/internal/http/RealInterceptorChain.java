package okhttp3.internal.http;

import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RealInterceptorChain implements Interceptor.Chain {
    private final RealCall call;
    private int calls;
    private final int connectTimeoutMillis;
    private final Exchange exchange;
    private final int index;
    private final List<Interceptor> interceptors;
    private final int readTimeoutMillis;
    private final Request request;
    private final int writeTimeoutMillis;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends okhttp3.Interceptor> */
    /* JADX WARN: Multi-variable type inference failed */
    public RealInterceptorChain(RealCall realCall, List<? extends Interceptor> list, int i9, Exchange exchange, Request request, int i10, int i11, int i12) {
        realCall.getClass();
        list.getClass();
        request.getClass();
        this.call = realCall;
        this.interceptors = list;
        this.index = i9;
        this.exchange = exchange;
        this.request = request;
        this.connectTimeoutMillis = i10;
        this.readTimeoutMillis = i11;
        this.writeTimeoutMillis = i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ RealInterceptorChain copy$okhttp$default(RealInterceptorChain realInterceptorChain, int i9, Exchange exchange, Request request, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i9 = realInterceptorChain.index;
        }
        if ((i13 & 2) != 0) {
            exchange = realInterceptorChain.exchange;
        }
        if ((i13 & 4) != 0) {
            request = realInterceptorChain.request;
        }
        if ((i13 & 8) != 0) {
            i10 = realInterceptorChain.connectTimeoutMillis;
        }
        if ((i13 & 16) != 0) {
            i11 = realInterceptorChain.readTimeoutMillis;
        }
        if ((i13 & 32) != 0) {
            i12 = realInterceptorChain.writeTimeoutMillis;
        }
        int i14 = i11;
        int i15 = i12;
        return realInterceptorChain.copy$okhttp(i9, exchange, request, i10, i14, i15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.Interceptor.Chain
    public Call call() {
        return this.call;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.Interceptor.Chain
    public int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.Interceptor.Chain
    public Connection connection() {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.getConnection$okhttp();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final RealInterceptorChain copy$okhttp(int i9, Exchange exchange, Request request, int i10, int i11, int i12) {
        request.getClass();
        return new RealInterceptorChain(this.call, this.interceptors, i9, exchange, request, i10, i11, i12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final RealCall getCall$okhttp() {
        return this.call;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getConnectTimeoutMillis$okhttp() {
        return this.connectTimeoutMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Exchange getExchange$okhttp() {
        return this.exchange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getReadTimeoutMillis$okhttp() {
        return this.readTimeoutMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Request getRequest$okhttp() {
        return this.request;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getWriteTimeoutMillis$okhttp() {
        return this.writeTimeoutMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.Interceptor.Chain
    public Response proceed(Request request) {
        request.getClass();
        if (this.index >= this.interceptors.size()) {
            C2104o.m5276A("Check failed.");
            return null;
        }
        this.calls++;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            if (!exchange.getFinder$okhttp().sameHostAndPort(request.url())) {
                C2104o.m5286k(this.interceptors.get(this.index - 1), "network interceptor ", " must retain the same host and port");
                return null;
            }
            if (this.calls != 1) {
                C2104o.m5286k(this.interceptors.get(this.index - 1), "network interceptor ", " must call proceed() exactly once");
                return null;
            }
        }
        RealInterceptorChain realInterceptorChainCopy$okhttp$default = copy$okhttp$default(this, this.index + 1, null, request, 0, 0, 0, 58, null);
        Interceptor interceptor = this.interceptors.get(this.index);
        Response responseIntercept = interceptor.intercept(realInterceptorChainCopy$okhttp$default);
        if (responseIntercept == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (this.exchange != null && this.index + 1 < this.interceptors.size() && realInterceptorChainCopy$okhttp$default.calls != 1) {
            C2104o.m5286k(interceptor, "network interceptor ", " must call proceed() exactly once");
            return null;
        }
        if (responseIntercept.body() != null) {
            return responseIntercept;
        }
        C2104o.m5286k(interceptor, "interceptor ", " returned a response with no body");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.Interceptor.Chain
    public int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.Interceptor.Chain
    public Request request() {
        return this.request;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withConnectTimeout(int i9, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, Util.checkDuration("connectTimeout", i9, timeUnit), 0, 0, 55, null);
        }
        C2104o.m5276A("Timeouts can't be adjusted in a network interceptor");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withReadTimeout(int i9, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, Util.checkDuration("readTimeout", i9, timeUnit), 0, 47, null);
        }
        C2104o.m5276A("Timeouts can't be adjusted in a network interceptor");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withWriteTimeout(int i9, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, Util.checkDuration("writeTimeout", i9, timeUnit), 31, null);
        }
        C2104o.m5276A("Timeouts can't be adjusted in a network interceptor");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.Interceptor.Chain
    public int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }
}
