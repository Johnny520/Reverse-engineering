package okhttp3.internal.cache;

import gg.AbstractC1411g;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p218og.AbstractC3156t;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class CacheInterceptor implements Interceptor {
    public static final Companion Companion = new Companion(null);
    private final Cache cache;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CacheInterceptor(Cache cache) {
        this.cache = cache;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Response cacheWritingResponse(final CacheRequest cacheRequest, Response response) {
        if (cacheRequest == null) {
            return response;
        }
        Sink sinkBody = cacheRequest.body();
        ResponseBody responseBodyBody = response.body();
        responseBodyBody.getClass();
        final BufferedSource bufferedSourceSource = responseBodyBody.source();
        final BufferedSink bufferedSinkBuffer = Okio.buffer(sinkBody);
        Source source = new Source() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1
            private boolean cacheRequestClosed;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                }
                bufferedSourceSource.close();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okio.Source
            public long read(Buffer buffer, long j3) throws IOException {
                buffer.getClass();
                try {
                    long j4 = bufferedSourceSource.read(buffer, j3);
                    if (j4 != -1) {
                        buffer.copyTo(bufferedSinkBuffer.getBuffer(), buffer.size() - j4, j4);
                        bufferedSinkBuffer.emitCompleteSegments();
                        return j4;
                    }
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        bufferedSinkBuffer.close();
                    }
                    return -1L;
                } catch (IOException e6) {
                    if (this.cacheRequestClosed) {
                        throw e6;
                    }
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                    throw e6;
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okio.Source
            public Timeout timeout() {
                return bufferedSourceSource.timeout();
            }
        };
        return response.newBuilder().body(new RealResponseBody(Response.header$default(response, "Content-Type", null, 2, null), response.body().contentLength(), Okio.buffer(source))).build();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Cache getCache$okhttp() {
        return this.cache;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        EventListener eventListener$okhttp;
        ResponseBody responseBodyBody;
        ResponseBody responseBodyBody2;
        chain.getClass();
        Call call = chain.call();
        Cache cache = this.cache;
        Response response = cache != null ? cache.get$okhttp(chain.request()) : null;
        CacheStrategy cacheStrategyCompute = new CacheStrategy.Factory(System.currentTimeMillis(), chain.request(), response).compute();
        Request networkRequest = cacheStrategyCompute.getNetworkRequest();
        Response cacheResponse = cacheStrategyCompute.getCacheResponse();
        Cache cache2 = this.cache;
        if (cache2 != null) {
            cache2.trackResponse$okhttp(cacheStrategyCompute);
        }
        RealCall realCall = call instanceof RealCall ? (RealCall) call : null;
        if (realCall == null || (eventListener$okhttp = realCall.getEventListener$okhttp()) == null) {
            eventListener$okhttp = EventListener.NONE;
        }
        if (response != null && cacheResponse == null && (responseBodyBody2 = response.body()) != null) {
            Util.closeQuietly(responseBodyBody2);
        }
        if (networkRequest == null && cacheResponse == null) {
            Response responseBuild = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
            eventListener$okhttp.satisfactionFailure(call, responseBuild);
            return responseBuild;
        }
        if (networkRequest == null) {
            cacheResponse.getClass();
            Response responseBuild2 = cacheResponse.newBuilder().cacheResponse(Companion.stripBody(cacheResponse)).build();
            eventListener$okhttp.cacheHit(call, responseBuild2);
            return responseBuild2;
        }
        if (cacheResponse != null) {
            eventListener$okhttp.cacheConditionalHit(call, cacheResponse);
        } else if (this.cache != null) {
            eventListener$okhttp.cacheMiss(call);
        }
        try {
            Response responseProceed = chain.proceed(networkRequest);
            if (responseProceed == null && response != null && responseBodyBody != null) {
            }
            if (cacheResponse != null) {
                if (responseProceed != null && responseProceed.code() == 304) {
                    Response.Builder builderNewBuilder = cacheResponse.newBuilder();
                    Companion companion = Companion;
                    Response responseBuild3 = builderNewBuilder.headers(companion.combine(cacheResponse.headers(), responseProceed.headers())).sentRequestAtMillis(responseProceed.sentRequestAtMillis()).receivedResponseAtMillis(responseProceed.receivedResponseAtMillis()).cacheResponse(companion.stripBody(cacheResponse)).networkResponse(companion.stripBody(responseProceed)).build();
                    ResponseBody responseBodyBody3 = responseProceed.body();
                    responseBodyBody3.getClass();
                    responseBodyBody3.close();
                    Cache cache3 = this.cache;
                    cache3.getClass();
                    cache3.trackConditionalCacheHit$okhttp();
                    this.cache.update$okhttp(cacheResponse, responseBuild3);
                    eventListener$okhttp.cacheHit(call, responseBuild3);
                    return responseBuild3;
                }
                ResponseBody responseBodyBody4 = cacheResponse.body();
                if (responseBodyBody4 != null) {
                    Util.closeQuietly(responseBodyBody4);
                }
            }
            responseProceed.getClass();
            Response.Builder builderNewBuilder2 = responseProceed.newBuilder();
            Companion companion2 = Companion;
            Response responseBuild4 = builderNewBuilder2.cacheResponse(companion2.stripBody(cacheResponse)).networkResponse(companion2.stripBody(responseProceed)).build();
            if (this.cache != null) {
                if (HttpHeaders.promisesBody(responseBuild4) && CacheStrategy.Companion.isCacheable(responseBuild4, networkRequest)) {
                    Response responseCacheWritingResponse = cacheWritingResponse(this.cache.put$okhttp(responseBuild4), responseBuild4);
                    if (cacheResponse != null) {
                        eventListener$okhttp.cacheMiss(call);
                    }
                    return responseCacheWritingResponse;
                }
                if (HttpMethod.INSTANCE.invalidatesCache(networkRequest.method())) {
                    try {
                        this.cache.remove$okhttp(networkRequest);
                    } catch (IOException unused) {
                    }
                }
            }
            return responseBuild4;
        } finally {
            if (response != null && (responseBodyBody = response.body()) != null) {
                Util.closeQuietly(responseBodyBody);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.cache.CacheInterceptor.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final Headers combine(Headers headers, Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i9 = 0; i9 < size; i9++) {
                String strName = headers.name(i9);
                String strValue = headers.value(i9);
                if ((!"Warning".equalsIgnoreCase(strName) || !AbstractC3156t.m6740d0(strValue, "1", false)) && (isContentSpecificHeader(strName) || !isEndToEnd(strName) || headers2.get(strName) == null)) {
                    builder.addLenient$okhttp(strName, strValue);
                }
            }
            int size2 = headers2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                String strName2 = headers2.name(i10);
                if (!isContentSpecificHeader(strName2) && isEndToEnd(strName2)) {
                    builder.addLenient$okhttp(strName2, headers2.value(i10));
                }
            }
            return builder.build();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final boolean isContentSpecificHeader(String str) {
            return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final boolean isEndToEnd(String str) {
            return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final Response stripBody(Response response) {
            return (response != null ? response.body() : null) != null ? response.newBuilder().body(null).build() : response;
        }

        private Companion() {
        }
    }
}
