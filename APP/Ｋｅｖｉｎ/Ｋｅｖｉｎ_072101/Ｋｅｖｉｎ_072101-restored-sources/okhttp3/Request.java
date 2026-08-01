package okhttp3;

/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001*BA\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\u0010\rJ\u000f\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\b\u001cJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u0005J\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u001fJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050 2\u0006\u0010\u001e\u001a\u00020\u0005J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b!J\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u0004\u0018\u00010\u0001J#\u0010$\u001a\u0004\u0018\u0001H%\"\u0004\b\u0000\u0010%2\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u0002H%0\f¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0005H\u0016J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b)R\u0015\u0010\b\u001a\u0004\u0018\u00010\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0017R$\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001a¨\u0006+"}, m115d2 = {"Lokhttp3/Request;", "", "url", "Lokhttp3/HttpUrl;", "method", "", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "tags", "", "Ljava/lang/Class;", "(Lokhttp3/HttpUrl;Ljava/lang/String;Lokhttp3/Headers;Lokhttp3/RequestBody;Ljava/util/Map;)V", "()Lokhttp3/RequestBody;", "cacheControl", "Lokhttp3/CacheControl;", "()Lokhttp3/CacheControl;", "()Lokhttp3/Headers;", "isHttps", "", "()Z", "lazyCacheControl", "()Ljava/lang/String;", "getTags$okhttp", "()Ljava/util/Map;", "()Lokhttp3/HttpUrl;", "-deprecated_body", "-deprecated_cacheControl", "header", "name", "-deprecated_headers", "", "-deprecated_method", "newBuilder", "Lokhttp3/Request$Builder;", "tag", "T", "type", "(Ljava/lang/Class;)Ljava/lang/Object;", "toString", "-deprecated_url", "Builder", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class Request {
    private final okhttp3.RequestBody body;
    private final okhttp3.Headers headers;
    private okhttp3.CacheControl lazyCacheControl;
    private final java.lang.String method;
    private final java.util.Map<java.lang.Class<?>, java.lang.Object> tags;
    private final okhttp3.HttpUrl url;

    /* JADX INFO: compiled from: Request.kt */
    @kotlin.Metadata(m114d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016J\u0010\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*H\u0016J\u0014\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0017J\b\u0010,\u001a\u00020\u0000H\u0016J\b\u0010-\u001a\u00020\u0000H\u0016J\u0018\u0010.\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013H\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020/H\u0016J\u001a\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u00100\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u00101\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u00102\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u00103\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0013H\u0016J-\u00104\u001a\u00020\u0000\"\u0004\b\u0000\u001052\u000e\u00106\u001a\n\u0012\u0006\b\u0000\u0012\u0002H50\u001a2\b\u00104\u001a\u0004\u0018\u0001H5H\u0016¢\u0006\u0002\u00107J\u0012\u00104\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u000208H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u0018\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a\u0012\u0004\u0012\u00020\u00010\u0019X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00069"}, m115d2 = {"Lokhttp3/Request$Builder;", "", "()V", "request", "Lokhttp3/Request;", "(Lokhttp3/Request;)V", "body", "Lokhttp3/RequestBody;", "getBody$okhttp", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", "headers", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "method", "", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "tags", "", "Ljava/lang/Class;", "getTags$okhttp", "()Ljava/util/Map;", "setTags$okhttp", "(Ljava/util/Map;)V", "url", "Lokhttp3/HttpUrl;", "getUrl$okhttp", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V", "addHeader", "name", "value", "build", "cacheControl", "Lokhttp3/CacheControl;", "delete", "get", "head", "header", "Lokhttp3/Headers;", "patch", "post", "put", "removeHeader", "tag", "T", "type", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Ljava/net/URL;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static class Builder {
        private okhttp3.RequestBody body;
        private okhttp3.Headers.Builder headers;
        private java.lang.String method;
        private java.util.Map<java.lang.Class<?>, java.lang.Object> tags;
        private okhttp3.HttpUrl url;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                java.util.Map r0 = (java.util.Map) r0
                r1.tags = r0
                java.lang.String r0 = "GET"
                r1.method = r0
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
                r0.<init>()
                r1.headers = r0
                return
        }

        public Builder(okhttp3.Request r2) {
                r1 = this;
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                java.util.Map r0 = (java.util.Map) r0
                r1.tags = r0
                okhttp3.HttpUrl r0 = r2.url()
                r1.url = r0
                java.lang.String r0 = r2.method()
                r1.method = r0
                okhttp3.RequestBody r0 = r2.body()
                r1.body = r0
                java.util.Map r0 = r2.getTags$okhttp()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L35
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                java.util.Map r0 = (java.util.Map) r0
                goto L3d
            L35:
                java.util.Map r0 = r2.getTags$okhttp()
                java.util.Map r0 = kotlin.collections.MapsKt.toMutableMap(r0)
            L3d:
                r1.tags = r0
                okhttp3.Headers r0 = r2.headers()
                okhttp3.Headers$Builder r0 = r0.newBuilder()
                r1.headers = r0
                return
        }

        public static /* synthetic */ okhttp3.Request.Builder delete$default(okhttp3.Request.Builder r0, okhttp3.RequestBody r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Ld
                r2 = r2 & 1
                if (r2 == 0) goto L8
                okhttp3.RequestBody r1 = okhttp3.internal.Util.EMPTY_REQUEST
            L8:
                okhttp3.Request$Builder r0 = r0.delete(r1)
                return r0
            Ld:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: delete"
                r0.<init>(r1)
                throw r0
        }

        public okhttp3.Request.Builder addHeader(java.lang.String r4, java.lang.String r5) {
                r3 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = r3
                okhttp3.Request$Builder r0 = (okhttp3.Request.Builder) r0
                r1 = 0
                okhttp3.Headers$Builder r2 = r0.headers
                r2.add(r4, r5)
                r0 = r3
                okhttp3.Request$Builder r0 = (okhttp3.Request.Builder) r0
                return r0
        }

        public okhttp3.Request build() {
                r7 = this;
                okhttp3.HttpUrl r1 = r7.url
                if (r1 == 0) goto L1c
                java.lang.String r2 = r7.method
                okhttp3.Headers$Builder r0 = r7.headers
                okhttp3.Headers r3 = r0.build()
                okhttp3.RequestBody r4 = r7.body
                java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r7.tags
                java.util.Map r5 = okhttp3.internal.Util.toImmutableMap(r0)
                okhttp3.Request r6 = new okhttp3.Request
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
            L1c:
                r0 = 0
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "url == null"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public okhttp3.Request.Builder cacheControl(okhttp3.CacheControl r4) {
                r3 = this;
                java.lang.String r0 = "cacheControl"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = r4.toString()
                r1 = r0
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                int r1 = r1.length()
                if (r1 != 0) goto L15
                r1 = 1
                goto L16
            L15:
                r1 = 0
            L16:
                java.lang.String r2 = "Cache-Control"
                if (r1 == 0) goto L1f
                okhttp3.Request$Builder r1 = r3.removeHeader(r2)
                goto L23
            L1f:
                okhttp3.Request$Builder r1 = r3.header(r2, r0)
            L23:
                return r1
        }

        public final okhttp3.Request.Builder delete() {
                r2 = this;
                r0 = 0
                r1 = 1
                okhttp3.Request$Builder r0 = delete$default(r2, r0, r1, r0)
                return r0
        }

        public okhttp3.Request.Builder delete(okhttp3.RequestBody r2) {
                r1 = this;
                java.lang.String r0 = "DELETE"
                okhttp3.Request$Builder r0 = r1.method(r0, r2)
                return r0
        }

        public okhttp3.Request.Builder get() {
                r2 = this;
                java.lang.String r0 = "GET"
                r1 = 0
                okhttp3.Request$Builder r0 = r2.method(r0, r1)
                return r0
        }

        public final okhttp3.RequestBody getBody$okhttp() {
                r1 = this;
                okhttp3.RequestBody r0 = r1.body
                return r0
        }

        public final okhttp3.Headers.Builder getHeaders$okhttp() {
                r1 = this;
                okhttp3.Headers$Builder r0 = r1.headers
                return r0
        }

        public final java.lang.String getMethod$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.method
                return r0
        }

        public final java.util.Map<java.lang.Class<?>, java.lang.Object> getTags$okhttp() {
                r1 = this;
                java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r1.tags
                return r0
        }

        public final okhttp3.HttpUrl getUrl$okhttp() {
                r1 = this;
                okhttp3.HttpUrl r0 = r1.url
                return r0
        }

        public okhttp3.Request.Builder head() {
                r2 = this;
                java.lang.String r0 = "HEAD"
                r1 = 0
                okhttp3.Request$Builder r0 = r2.method(r0, r1)
                return r0
        }

        public okhttp3.Request.Builder header(java.lang.String r4, java.lang.String r5) {
                r3 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = r3
                okhttp3.Request$Builder r0 = (okhttp3.Request.Builder) r0
                r1 = 0
                okhttp3.Headers$Builder r2 = r0.headers
                r2.set(r4, r5)
                r0 = r3
                okhttp3.Request$Builder r0 = (okhttp3.Request.Builder) r0
                return r0
        }

        public okhttp3.Request.Builder headers(okhttp3.Headers r4) {
                r3 = this;
                java.lang.String r0 = "headers"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r0 = r3
                okhttp3.Request$Builder r0 = (okhttp3.Request.Builder) r0
                r1 = 0
                okhttp3.Headers$Builder r2 = r4.newBuilder()
                r0.headers = r2
                r0 = r3
                okhttp3.Request$Builder r0 = (okhttp3.Request.Builder) r0
                return r0
        }

        public okhttp3.Request.Builder method(java.lang.String r6, okhttp3.RequestBody r7) {
                r5 = this;
                java.lang.String r0 = "method"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                r0 = r5
                okhttp3.Request$Builder r0 = (okhttp3.Request.Builder) r0
                r1 = 0
                r2 = r6
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                int r2 = r2.length()
                if (r2 <= 0) goto L14
                r2 = 1
                goto L15
            L14:
                r2 = 0
            L15:
                if (r2 == 0) goto L75
                java.lang.String r2 = "method "
                if (r7 != 0) goto L44
                boolean r3 = okhttp3.internal.http.HttpMethod.requiresRequestBody(r6)
                if (r3 != 0) goto L22
                goto L4a
            L22:
                r3 = 0
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.StringBuilder r2 = r4.append(r2)
                java.lang.StringBuilder r2 = r2.append(r6)
                java.lang.String r4 = " must have a request body."
                java.lang.StringBuilder r2 = r2.append(r4)
                java.lang.String r2 = r2.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
            L44:
                boolean r3 = okhttp3.internal.http.HttpMethod.permitsRequestBody(r6)
                if (r3 == 0) goto L53
            L4a:
                r0.method = r6
                r0.body = r7
                r0 = r5
                okhttp3.Request$Builder r0 = (okhttp3.Request.Builder) r0
                return r0
            L53:
                r3 = 0
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.StringBuilder r2 = r4.append(r2)
                java.lang.StringBuilder r2 = r2.append(r6)
                java.lang.String r4 = " must not have a request body."
                java.lang.StringBuilder r2 = r2.append(r4)
                java.lang.String r2 = r2.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
            L75:
                r2 = 0
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "method.isEmpty() == true"
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        public okhttp3.Request.Builder patch(okhttp3.RequestBody r2) {
                r1 = this;
                java.lang.String r0 = "body"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "PATCH"
                okhttp3.Request$Builder r0 = r1.method(r0, r2)
                return r0
        }

        public okhttp3.Request.Builder post(okhttp3.RequestBody r2) {
                r1 = this;
                java.lang.String r0 = "body"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "POST"
                okhttp3.Request$Builder r0 = r1.method(r0, r2)
                return r0
        }

        public okhttp3.Request.Builder put(okhttp3.RequestBody r2) {
                r1 = this;
                java.lang.String r0 = "body"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "PUT"
                okhttp3.Request$Builder r0 = r1.method(r0, r2)
                return r0
        }

        public okhttp3.Request.Builder removeHeader(java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r0 = r3
                okhttp3.Request$Builder r0 = (okhttp3.Request.Builder) r0
                r1 = 0
                okhttp3.Headers$Builder r2 = r0.headers
                r2.removeAll(r4)
                r0 = r3
                okhttp3.Request$Builder r0 = (okhttp3.Request.Builder) r0
                return r0
        }

        public final void setBody$okhttp(okhttp3.RequestBody r1) {
                r0 = this;
                r0.body = r1
                return
        }

        public final void setHeaders$okhttp(okhttp3.Headers.Builder r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.headers = r2
                return
        }

        public final void setMethod$okhttp(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.method = r2
                return
        }

        public final void setTags$okhttp(java.util.Map<java.lang.Class<?>, java.lang.Object> r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.tags = r2
                return
        }

        public final void setUrl$okhttp(okhttp3.HttpUrl r1) {
                r0 = this;
                r0.url = r1
                return
        }

        public <T> okhttp3.Request.Builder tag(java.lang.Class<? super T> r5, T r6) {
                r4 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = r4
                okhttp3.Request$Builder r0 = (okhttp3.Request.Builder) r0
                r1 = 0
                if (r6 != 0) goto L11
                java.util.Map<java.lang.Class<?>, java.lang.Object> r2 = r0.tags
                r2.remove(r5)
                goto L2e
            L11:
                java.util.Map<java.lang.Class<?>, java.lang.Object> r2 = r0.tags
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L22
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
                java.util.Map r2 = (java.util.Map) r2
                r0.tags = r2
            L22:
                java.util.Map<java.lang.Class<?>, java.lang.Object> r2 = r0.tags
                java.lang.Object r3 = r5.cast(r6)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                r2.put(r5, r3)
            L2e:
                r0 = r4
                okhttp3.Request$Builder r0 = (okhttp3.Request.Builder) r0
                return r0
        }

        public okhttp3.Request.Builder tag(java.lang.Object r2) {
                r1 = this;
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                okhttp3.Request$Builder r0 = r1.tag(r0, r2)
                return r0
        }

        public okhttp3.Request.Builder url(java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "ws:"
                r1 = 1
                boolean r0 = kotlin.text.StringsKt.startsWith(r4, r0, r1)
                java.lang.String r2 = "this as java.lang.String).substring(startIndex)"
                if (r0 == 0) goto L2d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "http:"
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 3
                java.lang.String r1 = r4.substring(r1)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                goto L52
            L2d:
                java.lang.String r0 = "wss:"
                boolean r0 = kotlin.text.StringsKt.startsWith(r4, r0, r1)
                if (r0 == 0) goto L51
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "https:"
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 4
                java.lang.String r1 = r4.substring(r1)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                goto L52
            L51:
                r0 = r4
            L52:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                okhttp3.HttpUrl r1 = r1.get(r0)
                okhttp3.Request$Builder r1 = r3.url(r1)
                return r1
        }

        public okhttp3.Request.Builder url(java.net.URL r4) {
                r3 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                java.lang.String r1 = r4.toString()
                java.lang.String r2 = "url.toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                okhttp3.HttpUrl r0 = r0.get(r1)
                okhttp3.Request$Builder r0 = r3.url(r0)
                return r0
        }

        public okhttp3.Request.Builder url(okhttp3.HttpUrl r3) {
                r2 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = r2
                okhttp3.Request$Builder r0 = (okhttp3.Request.Builder) r0
                r1 = 0
                r0.url = r3
                r0 = r2
                okhttp3.Request$Builder r0 = (okhttp3.Request.Builder) r0
                return r0
        }
    }

    public Request(okhttp3.HttpUrl r2, java.lang.String r3, okhttp3.Headers r4, okhttp3.RequestBody r5, java.util.Map<java.lang.Class<?>, ? extends java.lang.Object> r6) {
            r1 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "method"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "tags"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r1.<init>()
            r1.url = r2
            r1.method = r3
            r1.headers = r4
            r1.body = r5
            r1.tags = r6
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "body", imports = {}))
    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name */
    public final okhttp3.RequestBody m10345deprecated_body() {
            r1 = this;
            okhttp3.RequestBody r0 = r1.body
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cacheControl", imports = {}))
    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final okhttp3.CacheControl m10346deprecated_cacheControl() {
            r1 = this;
            okhttp3.CacheControl r0 = r1.cacheControl()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "headers", imports = {}))
    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name */
    public final okhttp3.Headers m10347deprecated_headers() {
            r1 = this;
            okhttp3.Headers r0 = r1.headers
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "method", imports = {}))
    /* JADX INFO: renamed from: -deprecated_method, reason: not valid java name */
    public final java.lang.String m10348deprecated_method() {
            r1 = this;
            java.lang.String r0 = r1.method
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "url", imports = {}))
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final okhttp3.HttpUrl m10349deprecated_url() {
            r1 = this;
            okhttp3.HttpUrl r0 = r1.url
            return r0
    }

    public final okhttp3.RequestBody body() {
            r1 = this;
            okhttp3.RequestBody r0 = r1.body
            return r0
    }

    public final okhttp3.CacheControl cacheControl() {
            r3 = this;
            okhttp3.CacheControl r0 = r3.lazyCacheControl
            if (r0 != 0) goto Le
            okhttp3.CacheControl$Companion r1 = okhttp3.CacheControl.Companion
            okhttp3.Headers r2 = r3.headers
            okhttp3.CacheControl r0 = r1.parse(r2)
            r3.lazyCacheControl = r0
        Le:
            return r0
    }

    public final java.util.Map<java.lang.Class<?>, java.lang.Object> getTags$okhttp() {
            r1 = this;
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r1.tags
            return r0
    }

    public final java.lang.String header(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.Headers r0 = r1.headers
            java.lang.String r0 = r0.get(r2)
            return r0
    }

    public final java.util.List<java.lang.String> headers(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.Headers r0 = r1.headers
            java.util.List r0 = r0.values(r2)
            return r0
    }

    public final okhttp3.Headers headers() {
            r1 = this;
            okhttp3.Headers r0 = r1.headers
            return r0
    }

    public final boolean isHttps() {
            r1 = this;
            okhttp3.HttpUrl r0 = r1.url
            boolean r0 = r0.isHttps()
            return r0
    }

    public final java.lang.String method() {
            r1 = this;
            java.lang.String r0 = r1.method
            return r0
    }

    public final okhttp3.Request.Builder newBuilder() {
            r1 = this;
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>(r1)
            return r0
    }

    public final java.lang.Object tag() {
            r1 = this;
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Object r0 = r1.tag(r0)
            return r0
    }

    public final <T> T tag(java.lang.Class<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r1.tags
            java.lang.Object r0 = r0.get(r2)
            java.lang.Object r0 = r2.cast(r0)
            return r0
    }

    public java.lang.String toString() {
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r0
            r2 = 0
            java.lang.String r3 = "Request{method="
            r1.append(r3)
            java.lang.String r3 = r13.method
            r1.append(r3)
            java.lang.String r3 = ", url="
            r1.append(r3)
            okhttp3.HttpUrl r3 = r13.url
            r1.append(r3)
            okhttp3.Headers r3 = r13.headers
            int r3 = r3.size()
            if (r3 == 0) goto L6e
            java.lang.String r3 = ", headers=["
            r1.append(r3)
            okhttp3.Headers r3 = r13.headers
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r4 = 0
            r5 = 0
            java.util.Iterator r6 = r3.iterator()
        L32:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L68
            java.lang.Object r7 = r6.next()
            int r8 = r5 + 1
            if (r5 >= 0) goto L43
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L43:
            r9 = r7
            kotlin.Pair r9 = (kotlin.Pair) r9
            r10 = 0
            java.lang.Object r11 = r9.component1()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r9 = r9.component2()
            java.lang.String r9 = (java.lang.String) r9
            if (r5 <= 0) goto L5a
            java.lang.String r12 = ", "
            r1.append(r12)
        L5a:
            r1.append(r11)
            r12 = 58
            r1.append(r12)
            r1.append(r9)
            r5 = r8
            goto L32
        L68:
            r3 = 93
            r1.append(r3)
        L6e:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r3 = r13.tags
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L80
            java.lang.String r3 = ", tags="
            r1.append(r3)
            java.util.Map<java.lang.Class<?>, java.lang.Object> r3 = r13.tags
            r1.append(r3)
        L80:
            r3 = 125(0x7d, float:1.75E-43)
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final okhttp3.HttpUrl url() {
            r1 = this;
            okhttp3.HttpUrl r0 = r1.url
            return r0
    }
}
