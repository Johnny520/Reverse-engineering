package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Request {
    private final okhttp3.RequestBody body;
    private final okhttp3.Headers headers;
    private okhttp3.CacheControl lazyCacheControl;
    private final java.lang.String method;
    private final java.util.Map<java.lang.Class<?>, java.lang.Object> tags;
    private final okhttp3.HttpUrl url;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
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
                r1.tags = r0
                java.lang.String r0 = "GET"
                r1.method = r0
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
                r0.<init>()
                r1.headers = r0
                return
        }

        public Builder(okhttp3.Request r3) {
                r2 = this;
                r3.getClass()
                r2.<init>()
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r2.tags = r0
                okhttp3.HttpUrl r0 = r3.url()
                r2.url = r0
                java.lang.String r0 = r3.method()
                r2.method = r0
                okhttp3.RequestBody r0 = r3.body()
                r2.body = r0
                java.util.Map r0 = r3.getTags$okhttp()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L2f
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                goto L3c
            L2f:
                java.util.Map r0 = r3.getTags$okhttp()
                r0.getClass()
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>(r0)
                r0 = r1
            L3c:
                r2.tags = r0
                okhttp3.Headers r3 = r3.headers()
                okhttp3.Headers$Builder r3 = r3.newBuilder()
                r2.headers = r3
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
                java.lang.String r0 = "Super calls with default arguments not supported in this target, function: delete"
                j8.o.w(r0)
                r0 = 0
                return r0
        }

        public okhttp3.Request.Builder addHeader(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                okhttp3.Headers$Builder r0 = r1.headers
                r0.add(r2, r3)
                return r1
        }

        public okhttp3.Request build() {
                r6 = this;
                okhttp3.HttpUrl r1 = r6.url
                if (r1 == 0) goto L1a
                java.lang.String r2 = r6.method
                okhttp3.Headers$Builder r0 = r6.headers
                okhttp3.Headers r3 = r0.build()
                okhttp3.RequestBody r4 = r6.body
                java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r6.tags
                java.util.Map r5 = okhttp3.internal.Util.toImmutableMap(r0)
                okhttp3.Request r0 = new okhttp3.Request
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
            L1a:
                java.lang.String r0 = "url == null"
                j8.o.A(r0)
                r0 = 0
                return r0
        }

        public okhttp3.Request.Builder cacheControl(okhttp3.CacheControl r3) {
                r2 = this;
                r3.getClass()
                java.lang.String r3 = r3.toString()
                int r0 = r3.length()
                java.lang.String r1 = "Cache-Control"
                if (r0 != 0) goto L14
                okhttp3.Request$Builder r3 = r2.removeHeader(r1)
                return r3
            L14:
                okhttp3.Request$Builder r3 = r2.header(r1, r3)
                return r3
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
                okhttp3.Request$Builder r2 = r1.method(r0, r2)
                return r2
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

        public okhttp3.Request.Builder header(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                okhttp3.Headers$Builder r0 = r1.headers
                r0.set(r2, r3)
                return r1
        }

        public okhttp3.Request.Builder headers(okhttp3.Headers r1) {
                r0 = this;
                r1.getClass()
                okhttp3.Headers$Builder r1 = r1.newBuilder()
                r0.headers = r1
                return r0
        }

        public okhttp3.Request.Builder method(java.lang.String r3, okhttp3.RequestBody r4) {
                r2 = this;
                r3.getClass()
                int r0 = r3.length()
                if (r0 <= 0) goto L34
                java.lang.String r0 = "method "
                if (r4 != 0) goto L1f
                boolean r1 = okhttp3.internal.http.HttpMethod.requiresRequestBody(r3)
                if (r1 != 0) goto L14
                goto L25
            L14:
                java.lang.String r4 = " must have a request body."
                java.lang.String r3 = eh.a.n(r0, r3, r4)
                j8.o.q(r3)
            L1d:
                r3 = 0
                return r3
            L1f:
                boolean r1 = okhttp3.internal.http.HttpMethod.permitsRequestBody(r3)
                if (r1 == 0) goto L2a
            L25:
                r2.method = r3
                r2.body = r4
                return r2
            L2a:
                java.lang.String r4 = " must not have a request body."
                java.lang.String r3 = eh.a.n(r0, r3, r4)
                j8.o.q(r3)
                goto L1d
            L34:
                java.lang.String r3 = "method.isEmpty() == true"
                j8.o.t(r3)
                goto L1d
        }

        public okhttp3.Request.Builder patch(okhttp3.RequestBody r2) {
                r1 = this;
                r2.getClass()
                java.lang.String r0 = "PATCH"
                okhttp3.Request$Builder r2 = r1.method(r0, r2)
                return r2
        }

        public okhttp3.Request.Builder post(okhttp3.RequestBody r2) {
                r1 = this;
                r2.getClass()
                java.lang.String r0 = "POST"
                okhttp3.Request$Builder r2 = r1.method(r0, r2)
                return r2
        }

        public okhttp3.Request.Builder put(okhttp3.RequestBody r2) {
                r1 = this;
                r2.getClass()
                java.lang.String r0 = "PUT"
                okhttp3.Request$Builder r2 = r1.method(r0, r2)
                return r2
        }

        public okhttp3.Request.Builder removeHeader(java.lang.String r2) {
                r1 = this;
                r2.getClass()
                okhttp3.Headers$Builder r0 = r1.headers
                r0.removeAll(r2)
                return r1
        }

        public final void setBody$okhttp(okhttp3.RequestBody r1) {
                r0 = this;
                r0.body = r1
                return
        }

        public final void setHeaders$okhttp(okhttp3.Headers.Builder r1) {
                r0 = this;
                r1.getClass()
                r0.headers = r1
                return
        }

        public final void setMethod$okhttp(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                r0.method = r1
                return
        }

        public final void setTags$okhttp(java.util.Map<java.lang.Class<?>, java.lang.Object> r1) {
                r0 = this;
                r1.getClass()
                r0.tags = r1
                return
        }

        public final void setUrl$okhttp(okhttp3.HttpUrl r1) {
                r0 = this;
                r0.url = r1
                return
        }

        public <T> okhttp3.Request.Builder tag(java.lang.Class<? super T> r2, T r3) {
                r1 = this;
                r2.getClass()
                java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r1.tags
                if (r3 != 0) goto Lb
                r0.remove(r2)
                return r1
            Lb:
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L18
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r1.tags = r0
            L18:
                java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r1.tags
                java.lang.Object r3 = r2.cast(r3)
                r3.getClass()
                r0.put(r2, r3)
                return r1
        }

        public okhttp3.Request.Builder tag(java.lang.Object r2) {
                r1 = this;
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                okhttp3.Request$Builder r2 = r1.tag(r0, r2)
                return r2
        }

        public okhttp3.Request.Builder url(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                java.lang.String r0 = "ws:"
                r1 = 1
                boolean r0 = og.t.d0(r3, r0, r1)
                if (r0 == 0) goto L18
                r0 = 3
                java.lang.String r3 = r3.substring(r0)
                java.lang.String r0 = "http:"
                java.lang.String r3 = r0.concat(r3)
                goto L2b
            L18:
                java.lang.String r0 = "wss:"
                boolean r0 = og.t.d0(r3, r0, r1)
                if (r0 == 0) goto L2b
                r0 = 4
                java.lang.String r3 = r3.substring(r0)
                java.lang.String r0 = "https:"
                java.lang.String r3 = r0.concat(r3)
            L2b:
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                okhttp3.HttpUrl r3 = r0.get(r3)
                okhttp3.Request$Builder r3 = r2.url(r3)
                return r3
        }

        public okhttp3.Request.Builder url(java.net.URL r2) {
                r1 = this;
                r2.getClass()
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                java.lang.String r2 = r2.toString()
                r2.getClass()
                okhttp3.HttpUrl r2 = r0.get(r2)
                okhttp3.Request$Builder r2 = r1.url(r2)
                return r2
        }

        public okhttp3.Request.Builder url(okhttp3.HttpUrl r1) {
                r0 = this;
                r1.getClass()
                r0.url = r1
                return r0
        }
    }

    public Request(okhttp3.HttpUrl r1, java.lang.String r2, okhttp3.Headers r3, okhttp3.RequestBody r4, java.util.Map<java.lang.Class<?>, ? extends java.lang.Object> r5) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r5.getClass()
            r0.<init>()
            r0.url = r1
            r0.method = r2
            r0.headers = r3
            r0.body = r4
            r0.tags = r5
            return
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name */
    public final okhttp3.RequestBody m129deprecated_body() {
            r1 = this;
            okhttp3.RequestBody r0 = r1.body
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final okhttp3.CacheControl m130deprecated_cacheControl() {
            r1 = this;
            okhttp3.CacheControl r0 = r1.cacheControl()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name */
    public final okhttp3.Headers m131deprecated_headers() {
            r1 = this;
            okhttp3.Headers r0 = r1.headers
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_method, reason: not valid java name */
    public final java.lang.String m132deprecated_method() {
            r1 = this;
            java.lang.String r0 = r1.method
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final okhttp3.HttpUrl m133deprecated_url() {
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
            r2 = this;
            okhttp3.CacheControl r0 = r2.lazyCacheControl
            if (r0 != 0) goto Le
            okhttp3.CacheControl$Companion r0 = okhttp3.CacheControl.Companion
            okhttp3.Headers r1 = r2.headers
            okhttp3.CacheControl r0 = r0.parse(r1)
            r2.lazyCacheControl = r0
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
            r2.getClass()
            okhttp3.Headers r0 = r1.headers
            java.lang.String r2 = r0.get(r2)
            return r2
    }

    public final java.util.List<java.lang.String> headers(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            okhttp3.Headers r0 = r1.headers
            java.util.List r2 = r0.values(r2)
            return r2
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
            r2.getClass()
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r1.tags
            java.lang.Object r0 = r0.get(r2)
            java.lang.Object r2 = r2.cast(r0)
            return r2
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Request{method="
            r0.<init>(r1)
            java.lang.String r1 = r6.method
            r0.append(r1)
            java.lang.String r1 = ", url="
            r0.append(r1)
            okhttp3.HttpUrl r1 = r6.url
            r0.append(r1)
            okhttp3.Headers r1 = r6.headers
            int r1 = r1.size()
            if (r1 == 0) goto L60
            java.lang.String r1 = ", headers=["
            r0.append(r1)
            okhttp3.Headers r1 = r6.headers
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L2a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r1.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L56
            sf.e r3 = (sf.e) r3
            java.lang.Object r5 = r3.f12418g
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.f12419h
            java.lang.String r3 = (java.lang.String) r3
            if (r2 <= 0) goto L49
            java.lang.String r2 = ", "
            r0.append(r2)
        L49:
            r0.append(r5)
            r2 = 58
            r0.append(r2)
            r0.append(r3)
            r2 = r4
            goto L2a
        L56:
            a.a.Q0()
            r0 = 0
            throw r0
        L5b:
            r1 = 93
            r0.append(r1)
        L60:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r6.tags
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L72
            java.lang.String r1 = ", tags="
            r0.append(r1)
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r6.tags
            r0.append(r1)
        L72:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final okhttp3.HttpUrl url() {
            r1 = this;
            okhttp3.HttpUrl r0 = r1.url
            return r0
    }
}
