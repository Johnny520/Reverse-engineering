package okhttp3.internal.cache;

/* JADX INFO: compiled from: CacheInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m115d2 = {"Lokhttp3/internal/cache/CacheInterceptor;", "Lokhttp3/Interceptor;", "cache", "Lokhttp3/Cache;", "(Lokhttp3/Cache;)V", "getCache$okhttp", "()Lokhttp3/Cache;", "cacheWritingResponse", "Lokhttp3/Response;", "cacheRequest", "Lokhttp3/internal/cache/CacheRequest;", "response", "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class CacheInterceptor implements okhttp3.Interceptor {
    public static final okhttp3.internal.cache.CacheInterceptor.Companion Companion = null;
    private final okhttp3.Cache cache;

    /* JADX INFO: compiled from: CacheInterceptor.kt */
    @kotlin.Metadata(m114d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¨\u0006\u000f"}, m115d2 = {"Lokhttp3/internal/cache/CacheInterceptor$Companion;", "", "()V", "combine", "Lokhttp3/Headers;", "cachedHeaders", "networkHeaders", "isContentSpecificHeader", "", "fieldName", "", "isEndToEnd", "stripBody", "Lokhttp3/Response;", "response", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

        public static final /* synthetic */ okhttp3.Headers access$combine(okhttp3.internal.cache.CacheInterceptor.Companion r1, okhttp3.Headers r2, okhttp3.Headers r3) {
                okhttp3.Headers r0 = r1.combine(r2, r3)
                return r0
        }

        public static final /* synthetic */ okhttp3.Response access$stripBody(okhttp3.internal.cache.CacheInterceptor.Companion r1, okhttp3.Response r2) {
                okhttp3.Response r0 = r1.stripBody(r2)
                return r0
        }

        private final okhttp3.Headers combine(okhttp3.Headers r10, okhttp3.Headers r11) {
                r9 = this;
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
                r0.<init>()
                r1 = 0
                int r2 = r10.size()
            La:
                if (r1 >= r2) goto L41
                java.lang.String r3 = r10.name(r1)
                java.lang.String r4 = r10.value(r1)
                java.lang.String r5 = "Warning"
                r6 = 1
                boolean r5 = kotlin.text.StringsKt.equals(r5, r3, r6)
                if (r5 == 0) goto L29
                r5 = 2
                r6 = 0
                java.lang.String r7 = "1"
                r8 = 0
                boolean r5 = kotlin.text.StringsKt.startsWith$default(r4, r7, r8, r5, r6)
                if (r5 == 0) goto L29
                goto L3e
            L29:
                boolean r5 = r9.isContentSpecificHeader(r3)
                if (r5 != 0) goto L3b
                boolean r5 = r9.isEndToEnd(r3)
                if (r5 == 0) goto L3b
                java.lang.String r5 = r11.get(r3)
                if (r5 != 0) goto L3e
            L3b:
                r0.addLenient$okhttp(r3, r4)
            L3e:
                int r1 = r1 + 1
                goto La
            L41:
                r1 = 0
                int r2 = r11.size()
            L46:
                if (r1 >= r2) goto L62
                java.lang.String r3 = r11.name(r1)
                boolean r4 = r9.isContentSpecificHeader(r3)
                if (r4 != 0) goto L5f
                boolean r4 = r9.isEndToEnd(r3)
                if (r4 == 0) goto L5f
                java.lang.String r4 = r11.value(r1)
                r0.addLenient$okhttp(r3, r4)
            L5f:
                int r1 = r1 + 1
                goto L46
            L62:
                okhttp3.Headers r1 = r0.build()
                return r1
        }

        private final boolean isContentSpecificHeader(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "Content-Length"
                r1 = 1
                boolean r0 = kotlin.text.StringsKt.equals(r0, r3, r1)
                if (r0 != 0) goto L1c
                java.lang.String r0 = "Content-Encoding"
                boolean r0 = kotlin.text.StringsKt.equals(r0, r3, r1)
                if (r0 != 0) goto L1c
                java.lang.String r0 = "Content-Type"
                boolean r0 = kotlin.text.StringsKt.equals(r0, r3, r1)
                if (r0 == 0) goto L1a
                goto L1c
            L1a:
                r1 = 0
                goto L1d
            L1c:
            L1d:
                return r1
        }

        private final boolean isEndToEnd(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "Connection"
                r1 = 1
                boolean r0 = kotlin.text.StringsKt.equals(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Keep-Alive"
                boolean r0 = kotlin.text.StringsKt.equals(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Proxy-Authenticate"
                boolean r0 = kotlin.text.StringsKt.equals(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Proxy-Authorization"
                boolean r0 = kotlin.text.StringsKt.equals(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "TE"
                boolean r0 = kotlin.text.StringsKt.equals(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Trailers"
                boolean r0 = kotlin.text.StringsKt.equals(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Transfer-Encoding"
                boolean r0 = kotlin.text.StringsKt.equals(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Upgrade"
                boolean r0 = kotlin.text.StringsKt.equals(r0, r3, r1)
                if (r0 != 0) goto L42
                goto L43
            L42:
                r1 = 0
            L43:
                return r1
        }

        private final okhttp3.Response stripBody(okhttp3.Response r3) {
                r2 = this;
                r0 = 0
                if (r3 == 0) goto L8
                okhttp3.ResponseBody r1 = r3.body()
                goto L9
            L8:
                r1 = r0
            L9:
                if (r1 == 0) goto L18
                okhttp3.Response$Builder r1 = r3.newBuilder()
                okhttp3.Response$Builder r0 = r1.body(r0)
                okhttp3.Response r0 = r0.build()
                goto L19
            L18:
                r0 = r3
            L19:
                return r0
        }
    }

    static {
            okhttp3.internal.cache.CacheInterceptor$Companion r0 = new okhttp3.internal.cache.CacheInterceptor$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.cache.CacheInterceptor.Companion = r0
            return
    }

    public CacheInterceptor(okhttp3.Cache r1) {
            r0 = this;
            r0.<init>()
            r0.cache = r1
            return
    }

    private final okhttp3.Response cacheWritingResponse(okhttp3.internal.cache.CacheRequest r11, okhttp3.Response r12) throws java.io.IOException {
            r10 = this;
            if (r11 != 0) goto L3
            return r12
        L3:
            okio.Sink r0 = r11.body()
            okhttp3.ResponseBody r1 = r12.body()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            okio.BufferedSource r1 = r1.source()
            okio.BufferedSink r2 = okio.Okio.buffer(r0)
            okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 r3 = new okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1
            r3.<init>(r1, r11, r2)
            java.lang.String r4 = "Content-Type"
            r5 = 2
            r6 = 0
            java.lang.String r4 = okhttp3.Response.header$default(r12, r4, r6, r5, r6)
            okhttp3.ResponseBody r5 = r12.body()
            long r5 = r5.contentLength()
            okhttp3.Response$Builder r7 = r12.newBuilder()
            okhttp3.internal.http.RealResponseBody r8 = new okhttp3.internal.http.RealResponseBody
            r9 = r3
            okio.Source r9 = (okio.Source) r9
            okio.BufferedSource r9 = okio.Okio.buffer(r9)
            r8.<init>(r4, r5, r9)
            okhttp3.ResponseBody r8 = (okhttp3.ResponseBody) r8
            okhttp3.Response$Builder r7 = r7.body(r8)
            okhttp3.Response r7 = r7.build()
            return r7
    }

    public final okhttp3.Cache getCache$okhttp() {
            r1 = this;
            okhttp3.Cache r0 = r1.cache
            return r0
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r15) throws java.io.IOException {
            r14 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            okhttp3.Call r0 = r15.call()
            okhttp3.Cache r1 = r14.cache
            r2 = 0
            if (r1 == 0) goto L17
            okhttp3.Request r3 = r15.request()
            okhttp3.Response r1 = r1.get$okhttp(r3)
            goto L18
        L17:
            r1 = r2
        L18:
            long r3 = java.lang.System.currentTimeMillis()
            okhttp3.internal.cache.CacheStrategy$Factory r5 = new okhttp3.internal.cache.CacheStrategy$Factory
            okhttp3.Request r6 = r15.request()
            r5.<init>(r3, r6, r1)
            okhttp3.internal.cache.CacheStrategy r5 = r5.compute()
            okhttp3.Request r6 = r5.getNetworkRequest()
            okhttp3.Response r7 = r5.getCacheResponse()
            okhttp3.Cache r8 = r14.cache
            if (r8 == 0) goto L38
            r8.trackResponse$okhttp(r5)
        L38:
            boolean r8 = r0 instanceof okhttp3.internal.connection.RealCall
            if (r8 == 0) goto L3f
            r2 = r0
            okhttp3.internal.connection.RealCall r2 = (okhttp3.internal.connection.RealCall) r2
        L3f:
            if (r2 == 0) goto L47
            okhttp3.EventListener r2 = r2.getEventListener$okhttp()
            if (r2 != 0) goto L49
        L47:
            okhttp3.EventListener r2 = okhttp3.EventListener.NONE
        L49:
            if (r1 == 0) goto L58
            if (r7 != 0) goto L58
            okhttp3.ResponseBody r8 = r1.body()
            if (r8 == 0) goto L58
            java.io.Closeable r8 = (java.io.Closeable) r8
            okhttp3.internal.Util.closeQuietly(r8)
        L58:
            if (r6 != 0) goto L9b
            if (r7 != 0) goto L9b
            okhttp3.Response$Builder r8 = new okhttp3.Response$Builder
            r8.<init>()
            okhttp3.Request r9 = r15.request()
            okhttp3.Response$Builder r8 = r8.request(r9)
            okhttp3.Protocol r9 = okhttp3.Protocol.HTTP_1_1
            okhttp3.Response$Builder r8 = r8.protocol(r9)
            r9 = 504(0x1f8, float:7.06E-43)
            okhttp3.Response$Builder r8 = r8.code(r9)
            java.lang.String r9 = "Unsatisfiable Request (only-if-cached)"
            okhttp3.Response$Builder r8 = r8.message(r9)
            okhttp3.ResponseBody r9 = okhttp3.internal.Util.EMPTY_RESPONSE
            okhttp3.Response$Builder r8 = r8.body(r9)
            r9 = -1
            okhttp3.Response$Builder r8 = r8.sentRequestAtMillis(r9)
            long r9 = java.lang.System.currentTimeMillis()
            okhttp3.Response$Builder r8 = r8.receivedResponseAtMillis(r9)
            okhttp3.Response r8 = r8.build()
            r9 = r8
            r10 = 0
            r2.satisfactionFailure(r0, r9)
            return r8
        L9b:
            if (r6 != 0) goto Lba
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            okhttp3.Response$Builder r8 = r7.newBuilder()
            okhttp3.internal.cache.CacheInterceptor$Companion r9 = okhttp3.internal.cache.CacheInterceptor.Companion
            okhttp3.Response r9 = okhttp3.internal.cache.CacheInterceptor.Companion.access$stripBody(r9, r7)
            okhttp3.Response$Builder r8 = r8.cacheResponse(r9)
            okhttp3.Response r8 = r8.build()
            r9 = r8
            r10 = 0
            r2.cacheHit(r0, r9)
            return r8
        Lba:
            if (r7 == 0) goto Lc0
            r2.cacheConditionalHit(r0, r7)
            goto Lc7
        Lc0:
            okhttp3.Cache r8 = r14.cache
            if (r8 == 0) goto Lc7
            r2.cacheMiss(r0)
        Lc7:
            r8 = 0
            okhttp3.Response r9 = r15.proceed(r6)     // Catch: java.lang.Throwable -> L1b0
            r8 = r9
            if (r8 != 0) goto Ldd
            if (r1 == 0) goto Ldd
            okhttp3.ResponseBody r9 = r1.body()
            if (r9 == 0) goto Ldd
            java.io.Closeable r9 = (java.io.Closeable) r9
            okhttp3.internal.Util.closeQuietly(r9)
        Ldd:
            if (r7 == 0) goto L156
            r9 = 0
            if (r8 == 0) goto Lec
            int r10 = r8.code()
            r11 = 304(0x130, float:4.26E-43)
            if (r10 != r11) goto Lec
            r9 = 1
        Lec:
            if (r9 == 0) goto L14b
            okhttp3.Response$Builder r9 = r7.newBuilder()
            okhttp3.internal.cache.CacheInterceptor$Companion r10 = okhttp3.internal.cache.CacheInterceptor.Companion
            okhttp3.Headers r11 = r7.headers()
            okhttp3.Headers r12 = r8.headers()
            okhttp3.Headers r10 = okhttp3.internal.cache.CacheInterceptor.Companion.access$combine(r10, r11, r12)
            okhttp3.Response$Builder r9 = r9.headers(r10)
            long r10 = r8.sentRequestAtMillis()
            okhttp3.Response$Builder r9 = r9.sentRequestAtMillis(r10)
            long r10 = r8.receivedResponseAtMillis()
            okhttp3.Response$Builder r9 = r9.receivedResponseAtMillis(r10)
            okhttp3.internal.cache.CacheInterceptor$Companion r10 = okhttp3.internal.cache.CacheInterceptor.Companion
            okhttp3.Response r10 = okhttp3.internal.cache.CacheInterceptor.Companion.access$stripBody(r10, r7)
            okhttp3.Response$Builder r9 = r9.cacheResponse(r10)
            okhttp3.internal.cache.CacheInterceptor$Companion r10 = okhttp3.internal.cache.CacheInterceptor.Companion
            okhttp3.Response r10 = okhttp3.internal.cache.CacheInterceptor.Companion.access$stripBody(r10, r8)
            okhttp3.Response$Builder r9 = r9.networkResponse(r10)
            okhttp3.Response r9 = r9.build()
            okhttp3.ResponseBody r10 = r8.body()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            r10.close()
            okhttp3.Cache r10 = r14.cache
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            r10.trackConditionalCacheHit$okhttp()
            okhttp3.Cache r10 = r14.cache
            r10.update$okhttp(r7, r9)
            r10 = r9
            r11 = 0
            r2.cacheHit(r0, r10)
            return r9
        L14b:
            okhttp3.ResponseBody r9 = r7.body()
            if (r9 == 0) goto L156
            java.io.Closeable r9 = (java.io.Closeable) r9
            okhttp3.internal.Util.closeQuietly(r9)
        L156:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            okhttp3.Response$Builder r9 = r8.newBuilder()
            okhttp3.internal.cache.CacheInterceptor$Companion r10 = okhttp3.internal.cache.CacheInterceptor.Companion
            okhttp3.Response r10 = okhttp3.internal.cache.CacheInterceptor.Companion.access$stripBody(r10, r7)
            okhttp3.Response$Builder r9 = r9.cacheResponse(r10)
            okhttp3.internal.cache.CacheInterceptor$Companion r10 = okhttp3.internal.cache.CacheInterceptor.Companion
            okhttp3.Response r10 = okhttp3.internal.cache.CacheInterceptor.Companion.access$stripBody(r10, r8)
            okhttp3.Response$Builder r9 = r9.networkResponse(r10)
            okhttp3.Response r9 = r9.build()
            okhttp3.Cache r10 = r14.cache
            if (r10 == 0) goto L1af
            boolean r10 = okhttp3.internal.http.HttpHeaders.promisesBody(r9)
            if (r10 == 0) goto L19b
            okhttp3.internal.cache.CacheStrategy$Companion r10 = okhttp3.internal.cache.CacheStrategy.Companion
            boolean r10 = r10.isCacheable(r9, r6)
            if (r10 == 0) goto L19b
            okhttp3.Cache r10 = r14.cache
            okhttp3.internal.cache.CacheRequest r10 = r10.put$okhttp(r9)
            okhttp3.Response r11 = r14.cacheWritingResponse(r10, r9)
            r12 = r11
            r13 = 0
            if (r7 == 0) goto L199
            r2.cacheMiss(r0)
        L199:
            return r11
        L19b:
            okhttp3.internal.http.HttpMethod r10 = okhttp3.internal.http.HttpMethod.INSTANCE
            java.lang.String r11 = r6.method()
            boolean r10 = r10.invalidatesCache(r11)
            if (r10 == 0) goto L1af
        L1a8:
            okhttp3.Cache r10 = r14.cache     // Catch: java.io.IOException -> L1ae
            r10.remove$okhttp(r6)     // Catch: java.io.IOException -> L1ae
            goto L1af
        L1ae:
            r10 = move-exception
        L1af:
            return r9
        L1b0:
            r9 = move-exception
            if (r1 == 0) goto L1be
            okhttp3.ResponseBody r10 = r1.body()
            if (r10 == 0) goto L1be
            java.io.Closeable r10 = (java.io.Closeable) r10
            okhttp3.internal.Util.closeQuietly(r10)
        L1be:
            throw r9
    }
}
