package okhttp3.internal.cache;

/* JADX INFO: compiled from: CacheStrategy.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u001b\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m115d2 = {"Lokhttp3/internal/cache/CacheStrategy;", "", "networkRequest", "Lokhttp3/Request;", "cacheResponse", "Lokhttp3/Response;", "(Lokhttp3/Request;Lokhttp3/Response;)V", "getCacheResponse", "()Lokhttp3/Response;", "getNetworkRequest", "()Lokhttp3/Request;", "Companion", "Factory", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class CacheStrategy {
    public static final okhttp3.internal.cache.CacheStrategy.Companion Companion = null;
    private final okhttp3.Response cacheResponse;
    private final okhttp3.Request networkRequest;

    /* JADX INFO: compiled from: CacheStrategy.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m115d2 = {"Lokhttp3/internal/cache/CacheStrategy$Companion;", "", "()V", "isCacheable", "", "response", "Lokhttp3/Response;", "request", "Lokhttp3/Request;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

        public final boolean isCacheable(okhttp3.Response r5, okhttp3.Request r6) {
                r4 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                int r0 = r5.code()
                r1 = 0
                switch(r0) {
                    case 200: goto L3d;
                    case 203: goto L3d;
                    case 204: goto L3d;
                    case 300: goto L3d;
                    case 301: goto L3d;
                    case 302: goto L13;
                    case 307: goto L13;
                    case 308: goto L3d;
                    case 404: goto L3d;
                    case 405: goto L3d;
                    case 410: goto L3d;
                    case 414: goto L3d;
                    case 501: goto L3d;
                    default: goto L12;
                }
            L12:
                return r1
            L13:
                java.lang.String r0 = "Expires"
                r2 = 2
                r3 = 0
                java.lang.String r0 = okhttp3.Response.header$default(r5, r0, r3, r2, r3)
                if (r0 != 0) goto L3d
                okhttp3.CacheControl r0 = r5.cacheControl()
                int r0 = r0.maxAgeSeconds()
                r2 = -1
                if (r0 != r2) goto L3d
                okhttp3.CacheControl r0 = r5.cacheControl()
                boolean r0 = r0.isPublic()
                if (r0 != 0) goto L3d
                okhttp3.CacheControl r0 = r5.cacheControl()
                boolean r0 = r0.isPrivate()
                if (r0 != 0) goto L3d
                return r1
            L3d:
                okhttp3.CacheControl r0 = r5.cacheControl()
                boolean r0 = r0.noStore()
                if (r0 != 0) goto L52
                okhttp3.CacheControl r0 = r6.cacheControl()
                boolean r0 = r0.noStore()
                if (r0 != 0) goto L52
                r1 = 1
            L52:
                return r1
        }
    }

    /* JADX INFO: compiled from: CacheStrategy.kt */
    @kotlin.Metadata(m114d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0003H\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0003H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m115d2 = {"Lokhttp3/internal/cache/CacheStrategy$Factory;", "", "nowMillis", "", "request", "Lokhttp3/Request;", "cacheResponse", "Lokhttp3/Response;", "(JLokhttp3/Request;Lokhttp3/Response;)V", "ageSeconds", "", "etag", "", "expires", "Ljava/util/Date;", "lastModified", "lastModifiedString", "receivedResponseMillis", "getRequest$okhttp", "()Lokhttp3/Request;", "sentRequestMillis", "servedDate", "servedDateString", "cacheResponseAge", "compute", "Lokhttp3/internal/cache/CacheStrategy;", "computeCandidate", "computeFreshnessLifetime", "hasConditions", "", "isFreshnessLifetimeHeuristic", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Factory {
        private int ageSeconds;
        private final okhttp3.Response cacheResponse;
        private java.lang.String etag;
        private java.util.Date expires;
        private java.util.Date lastModified;
        private java.lang.String lastModifiedString;
        private final long nowMillis;
        private long receivedResponseMillis;
        private final okhttp3.Request request;
        private long sentRequestMillis;
        private java.util.Date servedDate;
        private java.lang.String servedDateString;

        public Factory(long r9, okhttp3.Request r11, okhttp3.Response r12) {
                r8 = this;
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                r8.<init>()
                r8.nowMillis = r9
                r8.request = r11
                r8.cacheResponse = r12
                r0 = -1
                r8.ageSeconds = r0
                okhttp3.Response r1 = r8.cacheResponse
                if (r1 == 0) goto L8a
                okhttp3.Response r1 = r8.cacheResponse
                long r1 = r1.sentRequestAtMillis()
                r8.sentRequestMillis = r1
                okhttp3.Response r1 = r8.cacheResponse
                long r1 = r1.receivedResponseAtMillis()
                r8.receivedResponseMillis = r1
                okhttp3.Response r1 = r8.cacheResponse
                okhttp3.Headers r1 = r1.headers()
                r2 = 0
                int r3 = r1.size()
            L31:
                if (r2 >= r3) goto L8a
                java.lang.String r4 = r1.name(r2)
                java.lang.String r5 = r1.value(r2)
                java.lang.String r6 = "Date"
                r7 = 1
                boolean r6 = kotlin.text.StringsKt.equals(r4, r6, r7)
                if (r6 == 0) goto L4e
                java.util.Date r6 = okhttp3.internal.http.DatesKt.toHttpDateOrNull(r5)
                r8.servedDate = r6
                r8.servedDateString = r5
                goto L87
            L4e:
                java.lang.String r6 = "Expires"
                boolean r6 = kotlin.text.StringsKt.equals(r4, r6, r7)
                if (r6 == 0) goto L5d
                java.util.Date r6 = okhttp3.internal.http.DatesKt.toHttpDateOrNull(r5)
                r8.expires = r6
                goto L87
            L5d:
                java.lang.String r6 = "Last-Modified"
                boolean r6 = kotlin.text.StringsKt.equals(r4, r6, r7)
                if (r6 == 0) goto L6e
                java.util.Date r6 = okhttp3.internal.http.DatesKt.toHttpDateOrNull(r5)
                r8.lastModified = r6
                r8.lastModifiedString = r5
                goto L87
            L6e:
                java.lang.String r6 = "ETag"
                boolean r6 = kotlin.text.StringsKt.equals(r4, r6, r7)
                if (r6 == 0) goto L79
                r8.etag = r5
                goto L87
            L79:
                java.lang.String r6 = "Age"
                boolean r6 = kotlin.text.StringsKt.equals(r4, r6, r7)
                if (r6 == 0) goto L87
                int r6 = okhttp3.internal.Util.toNonNegativeInt(r5, r0)
                r8.ageSeconds = r6
            L87:
                int r2 = r2 + 1
                goto L31
            L8a:
                return
        }

        private final long cacheResponseAge() {
                r11 = this;
                java.util.Date r0 = r11.servedDate
                r1 = 0
                if (r0 == 0) goto L12
                long r3 = r11.receivedResponseMillis
                long r5 = r0.getTime()
                long r3 = r3 - r5
                long r1 = java.lang.Math.max(r1, r3)
                goto L13
            L12:
            L13:
                int r3 = r11.ageSeconds
                r4 = -1
                if (r3 == r4) goto L27
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
                int r4 = r11.ageSeconds
                long r4 = (long) r4
                long r3 = r3.toMillis(r4)
                long r3 = java.lang.Math.max(r1, r3)
                goto L28
            L27:
                r3 = r1
            L28:
                long r5 = r11.receivedResponseMillis
                long r7 = r11.sentRequestMillis
                long r5 = r5 - r7
                long r7 = r11.nowMillis
                long r9 = r11.receivedResponseMillis
                long r7 = r7 - r9
                long r9 = r3 + r5
                long r9 = r9 + r7
                return r9
        }

        private final okhttp3.internal.cache.CacheStrategy computeCandidate() {
                r17 = this;
                r0 = r17
                okhttp3.Response r1 = r0.cacheResponse
                r2 = 0
                if (r1 != 0) goto Lf
                okhttp3.internal.cache.CacheStrategy r1 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r3 = r0.request
                r1.<init>(r3, r2)
                return r1
            Lf:
                okhttp3.Request r1 = r0.request
                boolean r1 = r1.isHttps()
                if (r1 == 0) goto L27
                okhttp3.Response r1 = r0.cacheResponse
                okhttp3.Handshake r1 = r1.handshake()
                if (r1 != 0) goto L27
                okhttp3.internal.cache.CacheStrategy r1 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r3 = r0.request
                r1.<init>(r3, r2)
                return r1
            L27:
                okhttp3.internal.cache.CacheStrategy$Companion r1 = okhttp3.internal.cache.CacheStrategy.Companion
                okhttp3.Response r3 = r0.cacheResponse
                okhttp3.Request r4 = r0.request
                boolean r1 = r1.isCacheable(r3, r4)
                if (r1 != 0) goto L3b
                okhttp3.internal.cache.CacheStrategy r1 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r3 = r0.request
                r1.<init>(r3, r2)
                return r1
            L3b:
                okhttp3.Request r1 = r0.request
                okhttp3.CacheControl r1 = r1.cacheControl()
                boolean r3 = r1.noCache()
                if (r3 != 0) goto L134
                okhttp3.Request r3 = r0.request
                boolean r3 = r0.hasConditions(r3)
                if (r3 == 0) goto L53
                r16 = r1
                goto L136
            L53:
                okhttp3.Response r3 = r0.cacheResponse
                okhttp3.CacheControl r3 = r3.cacheControl()
                long r4 = r17.cacheResponseAge()
                long r6 = r17.computeFreshnessLifetime()
                int r8 = r1.maxAgeSeconds()
                r9 = -1
                if (r8 == r9) goto L77
                java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
                int r10 = r1.maxAgeSeconds()
                long r10 = (long) r10
                long r10 = r8.toMillis(r10)
                long r6 = java.lang.Math.min(r6, r10)
            L77:
                r10 = 0
                int r8 = r1.minFreshSeconds()
                if (r8 == r9) goto L8a
                java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
                int r12 = r1.minFreshSeconds()
                long r12 = (long) r12
                long r10 = r8.toMillis(r12)
            L8a:
                r12 = 0
                boolean r8 = r3.mustRevalidate()
                if (r8 != 0) goto La3
                int r8 = r1.maxStaleSeconds()
                if (r8 == r9) goto La3
                java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
                int r9 = r1.maxStaleSeconds()
                long r14 = (long) r9
                long r12 = r8.toMillis(r14)
            La3:
                boolean r8 = r3.noCache()
                if (r8 != 0) goto Le0
                long r8 = r4 + r10
                long r14 = r6 + r12
                int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
                if (r8 >= 0) goto Le0
                okhttp3.Response r8 = r0.cacheResponse
                okhttp3.Response$Builder r8 = r8.newBuilder()
                long r14 = r4 + r10
                int r9 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
                java.lang.String r14 = "Warning"
                if (r9 < 0) goto Lc4
                java.lang.String r9 = "110 HttpURLConnection \"Response is stale\""
                r8.addHeader(r14, r9)
            Lc4:
                r15 = 86400000(0x5265c00, double:4.2687272E-316)
                int r9 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r9 <= 0) goto Ld6
                boolean r9 = r17.isFreshnessLifetimeHeuristic()
                if (r9 == 0) goto Ld6
                java.lang.String r9 = "113 HttpURLConnection \"Heuristic expiration\""
                r8.addHeader(r14, r9)
            Ld6:
                okhttp3.internal.cache.CacheStrategy r9 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Response r14 = r8.build()
                r9.<init>(r2, r14)
                return r9
            Le0:
                r8 = 0
                r9 = 0
                java.lang.String r14 = r0.etag
                if (r14 == 0) goto Lec
                java.lang.String r2 = "If-None-Match"
                java.lang.String r8 = r0.etag
                goto Lfd
            Lec:
                java.util.Date r14 = r0.lastModified
                if (r14 == 0) goto Lf5
                java.lang.String r2 = "If-Modified-Since"
                java.lang.String r8 = r0.lastModifiedString
                goto Lfd
            Lf5:
                java.util.Date r14 = r0.servedDate
                if (r14 == 0) goto L12a
                java.lang.String r2 = "If-Modified-Since"
                java.lang.String r8 = r0.servedDateString
            Lfd:
                okhttp3.Request r9 = r0.request
                okhttp3.Headers r9 = r9.headers()
                okhttp3.Headers$Builder r9 = r9.newBuilder()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
                r9.addLenient$okhttp(r2, r8)
                okhttp3.Request r14 = r0.request
                okhttp3.Request$Builder r14 = r14.newBuilder()
                okhttp3.Headers r15 = r9.build()
                okhttp3.Request$Builder r14 = r14.headers(r15)
                okhttp3.Request r14 = r14.build()
                okhttp3.internal.cache.CacheStrategy r15 = new okhttp3.internal.cache.CacheStrategy
                r16 = r1
                okhttp3.Response r1 = r0.cacheResponse
                r15.<init>(r14, r1)
                return r15
            L12a:
                r16 = r1
                okhttp3.internal.cache.CacheStrategy r1 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r14 = r0.request
                r1.<init>(r14, r2)
                return r1
            L134:
                r16 = r1
            L136:
                okhttp3.internal.cache.CacheStrategy r1 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r3 = r0.request
                r1.<init>(r3, r2)
                return r1
        }

        private final long computeFreshnessLifetime() {
                r9 = this;
                okhttp3.Response r0 = r9.cacheResponse
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                okhttp3.CacheControl r0 = r0.cacheControl()
                int r1 = r0.maxAgeSeconds()
                r2 = -1
                if (r1 == r2) goto L1c
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
                int r2 = r0.maxAgeSeconds()
                long r2 = (long) r2
                long r1 = r1.toMillis(r2)
                return r1
            L1c:
                java.util.Date r1 = r9.expires
                r2 = 0
                if (r1 == 0) goto L38
                java.util.Date r4 = r9.servedDate
                if (r4 == 0) goto L2b
                long r4 = r4.getTime()
                goto L2d
            L2b:
                long r4 = r9.receivedResponseMillis
            L2d:
                long r6 = r1.getTime()
                long r6 = r6 - r4
                int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r8 <= 0) goto L37
                r2 = r6
            L37:
                return r2
            L38:
                java.util.Date r4 = r9.lastModified
                if (r4 == 0) goto L6c
                okhttp3.Response r4 = r9.cacheResponse
                okhttp3.Request r4 = r4.request()
                okhttp3.HttpUrl r4 = r4.url()
                java.lang.String r4 = r4.query()
                if (r4 != 0) goto L6c
                java.util.Date r4 = r9.servedDate
                if (r4 == 0) goto L55
                long r4 = r4.getTime()
                goto L57
            L55:
                long r4 = r9.sentRequestMillis
            L57:
                java.util.Date r6 = r9.lastModified
                kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
                long r6 = r6.getTime()
                long r6 = r4 - r6
                int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r8 <= 0) goto L6b
                r2 = 10
                long r2 = (long) r2
                long r2 = r6 / r2
            L6b:
                return r2
            L6c:
                return r2
        }

        private final boolean hasConditions(okhttp3.Request r2) {
                r1 = this;
                java.lang.String r0 = "If-Modified-Since"
                java.lang.String r0 = r2.header(r0)
                if (r0 != 0) goto L13
                java.lang.String r0 = "If-None-Match"
                java.lang.String r0 = r2.header(r0)
                if (r0 == 0) goto L11
                goto L13
            L11:
                r0 = 0
                goto L14
            L13:
                r0 = 1
            L14:
                return r0
        }

        private final boolean isFreshnessLifetimeHeuristic() {
                r2 = this;
                okhttp3.Response r0 = r2.cacheResponse
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                okhttp3.CacheControl r0 = r0.cacheControl()
                int r0 = r0.maxAgeSeconds()
                r1 = -1
                if (r0 != r1) goto L16
                java.util.Date r0 = r2.expires
                if (r0 != 0) goto L16
                r0 = 1
                goto L17
            L16:
                r0 = 0
            L17:
                return r0
        }

        public final okhttp3.internal.cache.CacheStrategy compute() {
                r3 = this;
                okhttp3.internal.cache.CacheStrategy r0 = r3.computeCandidate()
                okhttp3.Request r1 = r0.getNetworkRequest()
                if (r1 == 0) goto L1d
                okhttp3.Request r1 = r3.request
                okhttp3.CacheControl r1 = r1.cacheControl()
                boolean r1 = r1.onlyIfCached()
                if (r1 == 0) goto L1d
                okhttp3.internal.cache.CacheStrategy r1 = new okhttp3.internal.cache.CacheStrategy
                r2 = 0
                r1.<init>(r2, r2)
                return r1
            L1d:
                return r0
        }

        public final okhttp3.Request getRequest$okhttp() {
                r1 = this;
                okhttp3.Request r0 = r1.request
                return r0
        }
    }

    static {
            okhttp3.internal.cache.CacheStrategy$Companion r0 = new okhttp3.internal.cache.CacheStrategy$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.cache.CacheStrategy.Companion = r0
            return
    }

    public CacheStrategy(okhttp3.Request r1, okhttp3.Response r2) {
            r0 = this;
            r0.<init>()
            r0.networkRequest = r1
            r0.cacheResponse = r2
            return
    }

    public final okhttp3.Response getCacheResponse() {
            r1 = this;
            okhttp3.Response r0 = r1.cacheResponse
            return r0
    }

    public final okhttp3.Request getNetworkRequest() {
            r1 = this;
            okhttp3.Request r0 = r1.networkRequest
            return r0
    }
}
