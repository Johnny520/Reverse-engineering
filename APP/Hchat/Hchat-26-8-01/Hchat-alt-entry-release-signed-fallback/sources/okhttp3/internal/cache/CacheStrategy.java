package okhttp3.internal.cache;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class CacheStrategy {
    public static final okhttp3.internal.cache.CacheStrategy.Companion Companion = null;
    private final okhttp3.Response cacheResponse;
    private final okhttp3.Request networkRequest;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final boolean isCacheable(okhttp3.Response r5, okhttp3.Request r6) {
                r4 = this;
                r5.getClass()
                r6.getClass()
                int r0 = r5.code()
                r1 = 200(0xc8, float:2.8E-43)
                r2 = 0
                if (r0 == r1) goto L61
                r1 = 410(0x19a, float:5.75E-43)
                if (r0 == r1) goto L61
                r1 = 414(0x19e, float:5.8E-43)
                if (r0 == r1) goto L61
                r1 = 501(0x1f5, float:7.02E-43)
                if (r0 == r1) goto L61
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 == r1) goto L61
                r1 = 204(0xcc, float:2.86E-43)
                if (r0 == r1) goto L61
                r1 = 307(0x133, float:4.3E-43)
                if (r0 == r1) goto L37
                r1 = 308(0x134, float:4.32E-43)
                if (r0 == r1) goto L61
                r1 = 404(0x194, float:5.66E-43)
                if (r0 == r1) goto L61
                r1 = 405(0x195, float:5.68E-43)
                if (r0 == r1) goto L61
                switch(r0) {
                    case 300: goto L61;
                    case 301: goto L61;
                    case 302: goto L37;
                    default: goto L36;
                }
            L36:
                return r2
            L37:
                java.lang.String r0 = "Expires"
                r1 = 2
                r3 = 0
                java.lang.String r0 = okhttp3.Response.header$default(r5, r0, r3, r1, r3)
                if (r0 != 0) goto L61
                okhttp3.CacheControl r0 = r5.cacheControl()
                int r0 = r0.maxAgeSeconds()
                r1 = -1
                if (r0 != r1) goto L61
                okhttp3.CacheControl r0 = r5.cacheControl()
                boolean r0 = r0.isPublic()
                if (r0 != 0) goto L61
                okhttp3.CacheControl r0 = r5.cacheControl()
                boolean r0 = r0.isPrivate()
                if (r0 != 0) goto L61
                return r2
            L61:
                okhttp3.CacheControl r5 = r5.cacheControl()
                boolean r5 = r5.noStore()
                if (r5 != 0) goto L77
                okhttp3.CacheControl r5 = r6.cacheControl()
                boolean r5 = r5.noStore()
                if (r5 != 0) goto L77
                r5 = 1
                return r5
            L77:
                return r2
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
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

        public Factory(long r4, okhttp3.Request r6, okhttp3.Response r7) {
                r3 = this;
                r6.getClass()
                r3.<init>()
                r3.nowMillis = r4
                r3.request = r6
                r3.cacheResponse = r7
                r4 = -1
                r3.ageSeconds = r4
                if (r7 == 0) goto L7d
                long r5 = r7.sentRequestAtMillis()
                r3.sentRequestMillis = r5
                long r5 = r7.receivedResponseAtMillis()
                r3.receivedResponseMillis = r5
                okhttp3.Headers r5 = r7.headers()
                int r6 = r5.size()
                r7 = 0
            L26:
                if (r7 >= r6) goto L7d
                java.lang.String r0 = r5.name(r7)
                java.lang.String r1 = r5.value(r7)
                java.lang.String r2 = "Date"
                boolean r2 = og.t.X(r0, r2)
                if (r2 == 0) goto L41
                java.util.Date r0 = okhttp3.internal.http.DatesKt.toHttpDateOrNull(r1)
                r3.servedDate = r0
                r3.servedDateString = r1
                goto L7a
            L41:
                java.lang.String r2 = "Expires"
                boolean r2 = og.t.X(r0, r2)
                if (r2 == 0) goto L50
                java.util.Date r0 = okhttp3.internal.http.DatesKt.toHttpDateOrNull(r1)
                r3.expires = r0
                goto L7a
            L50:
                java.lang.String r2 = "Last-Modified"
                boolean r2 = og.t.X(r0, r2)
                if (r2 == 0) goto L61
                java.util.Date r0 = okhttp3.internal.http.DatesKt.toHttpDateOrNull(r1)
                r3.lastModified = r0
                r3.lastModifiedString = r1
                goto L7a
            L61:
                java.lang.String r2 = "ETag"
                boolean r2 = og.t.X(r0, r2)
                if (r2 == 0) goto L6c
                r3.etag = r1
                goto L7a
            L6c:
                java.lang.String r2 = "Age"
                boolean r0 = og.t.X(r0, r2)
                if (r0 == 0) goto L7a
                int r0 = okhttp3.internal.Util.toNonNegativeInt(r1, r4)
                r3.ageSeconds = r0
            L7a:
                int r7 = r7 + 1
                goto L26
            L7d:
                return
        }

        private final long cacheResponseAge() {
                r9 = this;
                java.util.Date r0 = r9.servedDate
                r1 = 0
                if (r0 == 0) goto L11
                long r3 = r9.receivedResponseMillis
                long r5 = r0.getTime()
                long r3 = r3 - r5
                long r1 = java.lang.Math.max(r1, r3)
            L11:
                int r0 = r9.ageSeconds
                r3 = -1
                if (r0 == r3) goto L21
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
                long r4 = (long) r0
                long r3 = r3.toMillis(r4)
                long r1 = java.lang.Math.max(r1, r3)
            L21:
                long r3 = r9.receivedResponseMillis
                long r5 = r9.sentRequestMillis
                long r5 = r3 - r5
                long r7 = r9.nowMillis
                long r7 = r7 - r3
                long r1 = r1 + r5
                long r1 = r1 + r7
                return r1
        }

        private final okhttp3.internal.cache.CacheStrategy computeCandidate() {
                r14 = this;
                okhttp3.Response r0 = r14.cacheResponse
                r1 = 0
                if (r0 != 0) goto Ld
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r2 = r14.request
                r0.<init>(r2, r1)
                return r0
            Ld:
                okhttp3.Request r0 = r14.request
                boolean r0 = r0.isHttps()
                if (r0 == 0) goto L25
                okhttp3.Response r0 = r14.cacheResponse
                okhttp3.Handshake r0 = r0.handshake()
                if (r0 != 0) goto L25
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r2 = r14.request
                r0.<init>(r2, r1)
                return r0
            L25:
                okhttp3.internal.cache.CacheStrategy$Companion r0 = okhttp3.internal.cache.CacheStrategy.Companion
                okhttp3.Response r2 = r14.cacheResponse
                okhttp3.Request r3 = r14.request
                boolean r0 = r0.isCacheable(r2, r3)
                if (r0 != 0) goto L39
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r2 = r14.request
                r0.<init>(r2, r1)
                return r0
            L39:
                okhttp3.Request r0 = r14.request
                okhttp3.CacheControl r0 = r0.cacheControl()
                boolean r2 = r0.noCache()
                if (r2 != 0) goto L11e
                okhttp3.Request r2 = r14.request
                boolean r2 = r14.hasConditions(r2)
                if (r2 == 0) goto L4f
                goto L11e
            L4f:
                okhttp3.Response r2 = r14.cacheResponse
                okhttp3.CacheControl r2 = r2.cacheControl()
                long r3 = r14.cacheResponseAge()
                long r5 = r14.computeFreshnessLifetime()
                int r7 = r0.maxAgeSeconds()
                java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
                r9 = -1
                if (r7 == r9) goto L73
                int r7 = r0.maxAgeSeconds()
                long r10 = (long) r7
                long r10 = r8.toMillis(r10)
                long r5 = java.lang.Math.min(r5, r10)
            L73:
                int r7 = r0.minFreshSeconds()
                r10 = 0
                if (r7 == r9) goto L85
                int r7 = r0.minFreshSeconds()
                long r12 = (long) r7
                long r12 = r8.toMillis(r12)
                goto L86
            L85:
                r12 = r10
            L86:
                boolean r7 = r2.mustRevalidate()
                if (r7 != 0) goto L9b
                int r7 = r0.maxStaleSeconds()
                if (r7 == r9) goto L9b
                int r0 = r0.maxStaleSeconds()
                long r9 = (long) r0
                long r10 = r8.toMillis(r9)
            L9b:
                boolean r0 = r2.noCache()
                if (r0 != 0) goto Ld4
                long r12 = r12 + r3
                long r10 = r10 + r5
                int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r0 >= 0) goto Ld4
                okhttp3.Response r0 = r14.cacheResponse
                okhttp3.Response$Builder r0 = r0.newBuilder()
                int r2 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                java.lang.String r5 = "Warning"
                if (r2 < 0) goto Lb8
                java.lang.String r2 = "110 HttpURLConnection \"Response is stale\""
                r0.addHeader(r5, r2)
            Lb8:
                r6 = 86400000(0x5265c00, double:4.2687272E-316)
                int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r2 <= 0) goto Lca
                boolean r2 = r14.isFreshnessLifetimeHeuristic()
                if (r2 == 0) goto Lca
                java.lang.String r2 = "113 HttpURLConnection \"Heuristic expiration\""
                r0.addHeader(r5, r2)
            Lca:
                okhttp3.internal.cache.CacheStrategy r2 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Response r0 = r0.build()
                r2.<init>(r1, r0)
                return r2
            Ld4:
                java.lang.String r0 = r14.etag
                if (r0 == 0) goto Ldb
                java.lang.String r1 = "If-None-Match"
                goto Lec
            Ldb:
                java.util.Date r0 = r14.lastModified
                java.lang.String r2 = "If-Modified-Since"
                if (r0 == 0) goto Le5
                java.lang.String r0 = r14.lastModifiedString
            Le3:
                r1 = r2
                goto Lec
            Le5:
                java.util.Date r0 = r14.servedDate
                if (r0 == 0) goto L116
                java.lang.String r0 = r14.servedDateString
                goto Le3
            Lec:
                okhttp3.Request r2 = r14.request
                okhttp3.Headers r2 = r2.headers()
                okhttp3.Headers$Builder r2 = r2.newBuilder()
                r0.getClass()
                r2.addLenient$okhttp(r1, r0)
                okhttp3.Request r0 = r14.request
                okhttp3.Request$Builder r0 = r0.newBuilder()
                okhttp3.Headers r1 = r2.build()
                okhttp3.Request$Builder r0 = r0.headers(r1)
                okhttp3.Request r0 = r0.build()
                okhttp3.internal.cache.CacheStrategy r1 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Response r2 = r14.cacheResponse
                r1.<init>(r0, r2)
                return r1
            L116:
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r2 = r14.request
                r0.<init>(r2, r1)
                return r0
            L11e:
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r2 = r14.request
                r0.<init>(r2, r1)
                return r0
        }

        private final long computeFreshnessLifetime() {
                r7 = this;
                okhttp3.Response r0 = r7.cacheResponse
                r0.getClass()
                okhttp3.CacheControl r0 = r0.cacheControl()
                int r1 = r0.maxAgeSeconds()
                r2 = -1
                if (r1 == r2) goto L1c
                int r0 = r0.maxAgeSeconds()
                long r0 = (long) r0
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
                long r0 = r2.toMillis(r0)
                return r0
            L1c:
                java.util.Date r0 = r7.expires
                r1 = 0
                if (r0 == 0) goto L38
                java.util.Date r3 = r7.servedDate
                if (r3 == 0) goto L2b
                long r3 = r3.getTime()
                goto L2d
            L2b:
                long r3 = r7.receivedResponseMillis
            L2d:
                long r5 = r0.getTime()
                long r5 = r5 - r3
                int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r0 <= 0) goto L37
                return r5
            L37:
                return r1
            L38:
                java.util.Date r0 = r7.lastModified
                if (r0 == 0) goto L6a
                okhttp3.Response r0 = r7.cacheResponse
                okhttp3.Request r0 = r0.request()
                okhttp3.HttpUrl r0 = r0.url()
                java.lang.String r0 = r0.query()
                if (r0 != 0) goto L6a
                java.util.Date r0 = r7.servedDate
                if (r0 == 0) goto L55
                long r3 = r0.getTime()
                goto L57
            L55:
                long r3 = r7.sentRequestMillis
            L57:
                java.util.Date r0 = r7.lastModified
                r0.getClass()
                long r5 = r0.getTime()
                long r3 = r3 - r5
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 <= 0) goto L6a
                r0 = 10
                long r0 = (long) r0
                long r3 = r3 / r0
                return r3
            L6a:
                return r1
        }

        private final boolean hasConditions(okhttp3.Request r2) {
                r1 = this;
                java.lang.String r0 = "If-Modified-Since"
                java.lang.String r0 = r2.header(r0)
                if (r0 != 0) goto L13
                java.lang.String r0 = "If-None-Match"
                java.lang.String r2 = r2.header(r0)
                if (r2 == 0) goto L11
                goto L13
            L11:
                r2 = 0
                return r2
            L13:
                r2 = 1
                return r2
        }

        private final boolean isFreshnessLifetimeHeuristic() {
                r2 = this;
                okhttp3.Response r0 = r2.cacheResponse
                r0.getClass()
                okhttp3.CacheControl r0 = r0.cacheControl()
                int r0 = r0.maxAgeSeconds()
                r1 = -1
                if (r0 != r1) goto L16
                java.util.Date r0 = r2.expires
                if (r0 != 0) goto L16
                r0 = 1
                return r0
            L16:
                r0 = 0
                return r0
        }

        public final okhttp3.internal.cache.CacheStrategy compute() {
                r2 = this;
                okhttp3.internal.cache.CacheStrategy r0 = r2.computeCandidate()
                okhttp3.Request r1 = r0.getNetworkRequest()
                if (r1 == 0) goto L1c
                okhttp3.Request r1 = r2.request
                okhttp3.CacheControl r1 = r1.cacheControl()
                boolean r1 = r1.onlyIfCached()
                if (r1 == 0) goto L1c
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                r1 = 0
                r0.<init>(r1, r1)
            L1c:
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
