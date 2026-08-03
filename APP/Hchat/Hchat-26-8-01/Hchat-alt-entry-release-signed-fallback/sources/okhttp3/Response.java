package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Response implements java.io.Closeable {
    private final okhttp3.ResponseBody body;
    private final okhttp3.Response cacheResponse;
    private final int code;
    private final okhttp3.internal.connection.Exchange exchange;
    private final okhttp3.Handshake handshake;
    private final okhttp3.Headers headers;
    private okhttp3.CacheControl lazyCacheControl;
    private final java.lang.String message;
    private final okhttp3.Response networkResponse;
    private final okhttp3.Response priorResponse;
    private final okhttp3.Protocol protocol;
    private final long receivedResponseAtMillis;
    private final okhttp3.Request request;
    private final long sentRequestAtMillis;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class Builder {
        private okhttp3.ResponseBody body;
        private okhttp3.Response cacheResponse;
        private int code;
        private okhttp3.internal.connection.Exchange exchange;
        private okhttp3.Handshake handshake;
        private okhttp3.Headers.Builder headers;
        private java.lang.String message;
        private okhttp3.Response networkResponse;
        private okhttp3.Response priorResponse;
        private okhttp3.Protocol protocol;
        private long receivedResponseAtMillis;
        private okhttp3.Request request;
        private long sentRequestAtMillis;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.code = r0
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
                r0.<init>()
                r1.headers = r0
                return
        }

        public Builder(okhttp3.Response r3) {
                r2 = this;
                r3.getClass()
                r2.<init>()
                r0 = -1
                r2.code = r0
                okhttp3.Request r0 = r3.request()
                r2.request = r0
                okhttp3.Protocol r0 = r3.protocol()
                r2.protocol = r0
                int r0 = r3.code()
                r2.code = r0
                java.lang.String r0 = r3.message()
                r2.message = r0
                okhttp3.Handshake r0 = r3.handshake()
                r2.handshake = r0
                okhttp3.Headers r0 = r3.headers()
                okhttp3.Headers$Builder r0 = r0.newBuilder()
                r2.headers = r0
                okhttp3.ResponseBody r0 = r3.body()
                r2.body = r0
                okhttp3.Response r0 = r3.networkResponse()
                r2.networkResponse = r0
                okhttp3.Response r0 = r3.cacheResponse()
                r2.cacheResponse = r0
                okhttp3.Response r0 = r3.priorResponse()
                r2.priorResponse = r0
                long r0 = r3.sentRequestAtMillis()
                r2.sentRequestAtMillis = r0
                long r0 = r3.receivedResponseAtMillis()
                r2.receivedResponseAtMillis = r0
                okhttp3.internal.connection.Exchange r3 = r3.exchange()
                r2.exchange = r3
                return
        }

        private final void checkPriorResponse(okhttp3.Response r1) {
                r0 = this;
                if (r1 == 0) goto Le
                okhttp3.ResponseBody r1 = r1.body()
                if (r1 != 0) goto L9
                return
            L9:
                java.lang.String r1 = "priorResponse.body != null"
                j8.o.t(r1)
            Le:
                return
        }

        private final void checkSupportResponse(java.lang.String r2, okhttp3.Response r3) {
                r1 = this;
                if (r3 == 0) goto L42
                okhttp3.ResponseBody r0 = r3.body()
                if (r0 != 0) goto L39
                okhttp3.Response r0 = r3.networkResponse()
                if (r0 != 0) goto L2f
                okhttp3.Response r0 = r3.cacheResponse()
                if (r0 != 0) goto L25
                okhttp3.Response r3 = r3.priorResponse()
                if (r3 != 0) goto L1b
                return
            L1b:
                java.lang.String r3 = ".priorResponse != null"
                java.lang.String r2 = bc.e.i(r2, r3)
                j8.o.q(r2)
                return
            L25:
                java.lang.String r3 = ".cacheResponse != null"
                java.lang.String r2 = bc.e.i(r2, r3)
                j8.o.q(r2)
                return
            L2f:
                java.lang.String r3 = ".networkResponse != null"
                java.lang.String r2 = bc.e.i(r2, r3)
                j8.o.q(r2)
                return
            L39:
                java.lang.String r3 = ".body != null"
                java.lang.String r2 = bc.e.i(r2, r3)
                j8.o.q(r2)
            L42:
                return
        }

        public okhttp3.Response.Builder addHeader(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                okhttp3.Headers$Builder r0 = r1.headers
                r0.add(r2, r3)
                return r1
        }

        public okhttp3.Response.Builder body(okhttp3.ResponseBody r1) {
                r0 = this;
                r0.body = r1
                return r0
        }

        public okhttp3.Response build() {
                r17 = this;
                r0 = r17
                int r5 = r0.code
                if (r5 < 0) goto L45
                okhttp3.Request r2 = r0.request
                if (r2 == 0) goto L3e
                okhttp3.Protocol r3 = r0.protocol
                if (r3 == 0) goto L37
                java.lang.String r4 = r0.message
                if (r4 == 0) goto L30
                okhttp3.Handshake r6 = r0.handshake
                okhttp3.Headers$Builder r1 = r0.headers
                okhttp3.Headers r7 = r1.build()
                okhttp3.ResponseBody r8 = r0.body
                okhttp3.Response r9 = r0.networkResponse
                okhttp3.Response r10 = r0.cacheResponse
                okhttp3.Response r11 = r0.priorResponse
                long r12 = r0.sentRequestAtMillis
                long r14 = r0.receivedResponseAtMillis
                okhttp3.internal.connection.Exchange r1 = r0.exchange
                r16 = r1
                okhttp3.Response r1 = new okhttp3.Response
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r16)
                return r1
            L30:
                java.lang.String r1 = "message == null"
                j8.o.A(r1)
                r1 = 0
                return r1
            L37:
                java.lang.String r1 = "protocol == null"
                j8.o.A(r1)
                r1 = 0
                return r1
            L3e:
                java.lang.String r1 = "request == null"
                j8.o.A(r1)
                r1 = 0
                return r1
            L45:
                java.lang.String r1 = "code < 0: "
                int r2 = r0.code
                j8.o.p(r2, r1)
                r1 = 0
                return r1
        }

        public okhttp3.Response.Builder cacheResponse(okhttp3.Response r2) {
                r1 = this;
                java.lang.String r0 = "cacheResponse"
                r1.checkSupportResponse(r0, r2)
                r1.cacheResponse = r2
                return r1
        }

        public okhttp3.Response.Builder code(int r1) {
                r0 = this;
                r0.code = r1
                return r0
        }

        public final okhttp3.ResponseBody getBody$okhttp() {
                r1 = this;
                okhttp3.ResponseBody r0 = r1.body
                return r0
        }

        public final okhttp3.Response getCacheResponse$okhttp() {
                r1 = this;
                okhttp3.Response r0 = r1.cacheResponse
                return r0
        }

        public final int getCode$okhttp() {
                r1 = this;
                int r0 = r1.code
                return r0
        }

        public final okhttp3.internal.connection.Exchange getExchange$okhttp() {
                r1 = this;
                okhttp3.internal.connection.Exchange r0 = r1.exchange
                return r0
        }

        public final okhttp3.Handshake getHandshake$okhttp() {
                r1 = this;
                okhttp3.Handshake r0 = r1.handshake
                return r0
        }

        public final okhttp3.Headers.Builder getHeaders$okhttp() {
                r1 = this;
                okhttp3.Headers$Builder r0 = r1.headers
                return r0
        }

        public final java.lang.String getMessage$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.message
                return r0
        }

        public final okhttp3.Response getNetworkResponse$okhttp() {
                r1 = this;
                okhttp3.Response r0 = r1.networkResponse
                return r0
        }

        public final okhttp3.Response getPriorResponse$okhttp() {
                r1 = this;
                okhttp3.Response r0 = r1.priorResponse
                return r0
        }

        public final okhttp3.Protocol getProtocol$okhttp() {
                r1 = this;
                okhttp3.Protocol r0 = r1.protocol
                return r0
        }

        public final long getReceivedResponseAtMillis$okhttp() {
                r2 = this;
                long r0 = r2.receivedResponseAtMillis
                return r0
        }

        public final okhttp3.Request getRequest$okhttp() {
                r1 = this;
                okhttp3.Request r0 = r1.request
                return r0
        }

        public final long getSentRequestAtMillis$okhttp() {
                r2 = this;
                long r0 = r2.sentRequestAtMillis
                return r0
        }

        public okhttp3.Response.Builder handshake(okhttp3.Handshake r1) {
                r0 = this;
                r0.handshake = r1
                return r0
        }

        public okhttp3.Response.Builder header(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                okhttp3.Headers$Builder r0 = r1.headers
                r0.set(r2, r3)
                return r1
        }

        public okhttp3.Response.Builder headers(okhttp3.Headers r1) {
                r0 = this;
                r1.getClass()
                okhttp3.Headers$Builder r1 = r1.newBuilder()
                r0.headers = r1
                return r0
        }

        public final void initExchange$okhttp(okhttp3.internal.connection.Exchange r1) {
                r0 = this;
                r1.getClass()
                r0.exchange = r1
                return
        }

        public okhttp3.Response.Builder message(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                r0.message = r1
                return r0
        }

        public okhttp3.Response.Builder networkResponse(okhttp3.Response r2) {
                r1 = this;
                java.lang.String r0 = "networkResponse"
                r1.checkSupportResponse(r0, r2)
                r1.networkResponse = r2
                return r1
        }

        public okhttp3.Response.Builder priorResponse(okhttp3.Response r1) {
                r0 = this;
                r0.checkPriorResponse(r1)
                r0.priorResponse = r1
                return r0
        }

        public okhttp3.Response.Builder protocol(okhttp3.Protocol r1) {
                r0 = this;
                r1.getClass()
                r0.protocol = r1
                return r0
        }

        public okhttp3.Response.Builder receivedResponseAtMillis(long r1) {
                r0 = this;
                r0.receivedResponseAtMillis = r1
                return r0
        }

        public okhttp3.Response.Builder removeHeader(java.lang.String r2) {
                r1 = this;
                r2.getClass()
                okhttp3.Headers$Builder r0 = r1.headers
                r0.removeAll(r2)
                return r1
        }

        public okhttp3.Response.Builder request(okhttp3.Request r1) {
                r0 = this;
                r1.getClass()
                r0.request = r1
                return r0
        }

        public okhttp3.Response.Builder sentRequestAtMillis(long r1) {
                r0 = this;
                r0.sentRequestAtMillis = r1
                return r0
        }

        public final void setBody$okhttp(okhttp3.ResponseBody r1) {
                r0 = this;
                r0.body = r1
                return
        }

        public final void setCacheResponse$okhttp(okhttp3.Response r1) {
                r0 = this;
                r0.cacheResponse = r1
                return
        }

        public final void setCode$okhttp(int r1) {
                r0 = this;
                r0.code = r1
                return
        }

        public final void setExchange$okhttp(okhttp3.internal.connection.Exchange r1) {
                r0 = this;
                r0.exchange = r1
                return
        }

        public final void setHandshake$okhttp(okhttp3.Handshake r1) {
                r0 = this;
                r0.handshake = r1
                return
        }

        public final void setHeaders$okhttp(okhttp3.Headers.Builder r1) {
                r0 = this;
                r1.getClass()
                r0.headers = r1
                return
        }

        public final void setMessage$okhttp(java.lang.String r1) {
                r0 = this;
                r0.message = r1
                return
        }

        public final void setNetworkResponse$okhttp(okhttp3.Response r1) {
                r0 = this;
                r0.networkResponse = r1
                return
        }

        public final void setPriorResponse$okhttp(okhttp3.Response r1) {
                r0 = this;
                r0.priorResponse = r1
                return
        }

        public final void setProtocol$okhttp(okhttp3.Protocol r1) {
                r0 = this;
                r0.protocol = r1
                return
        }

        public final void setReceivedResponseAtMillis$okhttp(long r1) {
                r0 = this;
                r0.receivedResponseAtMillis = r1
                return
        }

        public final void setRequest$okhttp(okhttp3.Request r1) {
                r0 = this;
                r0.request = r1
                return
        }

        public final void setSentRequestAtMillis$okhttp(long r1) {
                r0 = this;
                r0.sentRequestAtMillis = r1
                return
        }
    }

    public Response(okhttp3.Request r1, okhttp3.Protocol r2, java.lang.String r3, int r4, okhttp3.Handshake r5, okhttp3.Headers r6, okhttp3.ResponseBody r7, okhttp3.Response r8, okhttp3.Response r9, okhttp3.Response r10, long r11, long r13, okhttp3.internal.connection.Exchange r15) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r6.getClass()
            r0.<init>()
            r0.request = r1
            r0.protocol = r2
            r0.message = r3
            r0.code = r4
            r0.handshake = r5
            r0.headers = r6
            r0.body = r7
            r0.networkResponse = r8
            r0.cacheResponse = r9
            r0.priorResponse = r10
            r0.sentRequestAtMillis = r11
            r0.receivedResponseAtMillis = r13
            r0.exchange = r15
            return
    }

    public static /* synthetic */ java.lang.String header$default(okhttp3.Response r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.lang.String r0 = r0.header(r1, r2)
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name */
    public final okhttp3.ResponseBody m134deprecated_body() {
            r1 = this;
            okhttp3.ResponseBody r0 = r1.body
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final okhttp3.CacheControl m135deprecated_cacheControl() {
            r1 = this;
            okhttp3.CacheControl r0 = r1.cacheControl()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_cacheResponse, reason: not valid java name */
    public final okhttp3.Response m136deprecated_cacheResponse() {
            r1 = this;
            okhttp3.Response r0 = r1.cacheResponse
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_code, reason: not valid java name */
    public final int m137deprecated_code() {
            r1 = this;
            int r0 = r1.code
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_handshake, reason: not valid java name */
    public final okhttp3.Handshake m138deprecated_handshake() {
            r1 = this;
            okhttp3.Handshake r0 = r1.handshake
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name */
    public final okhttp3.Headers m139deprecated_headers() {
            r1 = this;
            okhttp3.Headers r0 = r1.headers
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_message, reason: not valid java name */
    public final java.lang.String m140deprecated_message() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_networkResponse, reason: not valid java name */
    public final okhttp3.Response m141deprecated_networkResponse() {
            r1 = this;
            okhttp3.Response r0 = r1.networkResponse
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_priorResponse, reason: not valid java name */
    public final okhttp3.Response m142deprecated_priorResponse() {
            r1 = this;
            okhttp3.Response r0 = r1.priorResponse
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_protocol, reason: not valid java name */
    public final okhttp3.Protocol m143deprecated_protocol() {
            r1 = this;
            okhttp3.Protocol r0 = r1.protocol
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name */
    public final long m144deprecated_receivedResponseAtMillis() {
            r2 = this;
            long r0 = r2.receivedResponseAtMillis
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_request, reason: not valid java name */
    public final okhttp3.Request m145deprecated_request() {
            r1 = this;
            okhttp3.Request r0 = r1.request
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name */
    public final long m146deprecated_sentRequestAtMillis() {
            r2 = this;
            long r0 = r2.sentRequestAtMillis
            return r0
    }

    public final okhttp3.ResponseBody body() {
            r1 = this;
            okhttp3.ResponseBody r0 = r1.body
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

    public final okhttp3.Response cacheResponse() {
            r1 = this;
            okhttp3.Response r0 = r1.cacheResponse
            return r0
    }

    public final java.util.List<okhttp3.Challenge> challenges() {
            r3 = this;
            okhttp3.Headers r0 = r3.headers
            int r1 = r3.code
            r2 = 401(0x191, float:5.62E-43)
            if (r1 == r2) goto L12
            r2 = 407(0x197, float:5.7E-43)
            if (r1 == r2) goto Lf
            tf.t r0 = tf.t.f13167g
            return r0
        Lf:
            java.lang.String r1 = "Proxy-Authenticate"
            goto L14
        L12:
            java.lang.String r1 = "WWW-Authenticate"
        L14:
            java.util.List r0 = okhttp3.internal.http.HttpHeaders.parseChallenges(r0, r1)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            okhttp3.ResponseBody r0 = r1.body
            if (r0 == 0) goto L8
            r0.close()
            return
        L8:
            java.lang.String r0 = "response is not eligible for a body and must not be closed"
            j8.o.A(r0)
            return
    }

    public final int code() {
            r1 = this;
            int r0 = r1.code
            return r0
    }

    public final okhttp3.internal.connection.Exchange exchange() {
            r1 = this;
            okhttp3.internal.connection.Exchange r0 = r1.exchange
            return r0
    }

    public final okhttp3.Handshake handshake() {
            r1 = this;
            okhttp3.Handshake r0 = r1.handshake
            return r0
    }

    public final java.lang.String header(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            r1 = 2
            java.lang.String r3 = header$default(r2, r3, r0, r1, r0)
            return r3
    }

    public final java.lang.String header(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r2.getClass()
            okhttp3.Headers r0 = r1.headers
            java.lang.String r2 = r0.get(r2)
            if (r2 != 0) goto Lc
            return r3
        Lc:
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

    public final boolean isRedirect() {
            r2 = this;
            int r0 = r2.code
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto Lf
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto Lf
            switch(r0) {
                case 300: goto Lf;
                case 301: goto Lf;
                case 302: goto Lf;
                case 303: goto Lf;
                default: goto Ld;
            }
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    public final boolean isSuccessful() {
            r3 = this;
            int r0 = r3.code
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r1 > r0) goto Ld
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 >= r1) goto Ld
            r0 = 1
            return r0
        Ld:
            return r2
    }

    public final java.lang.String message() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }

    public final okhttp3.Response networkResponse() {
            r1 = this;
            okhttp3.Response r0 = r1.networkResponse
            return r0
    }

    public final okhttp3.Response.Builder newBuilder() {
            r1 = this;
            okhttp3.Response$Builder r0 = new okhttp3.Response$Builder
            r0.<init>(r1)
            return r0
    }

    public final okhttp3.ResponseBody peekBody(long r5) {
            r4 = this;
            okhttp3.ResponseBody r0 = r4.body
            r0.getClass()
            okio.BufferedSource r0 = r0.source()
            okio.BufferedSource r0 = r0.peek()
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r0.request(r5)
            okio.Buffer r2 = r0.getBuffer()
            long r2 = r2.size()
            long r5 = java.lang.Math.min(r5, r2)
            r1.write(r0, r5)
            okhttp3.ResponseBody$Companion r5 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r6 = r4.body
            okhttp3.MediaType r6 = r6.contentType()
            long r2 = r1.size()
            okhttp3.ResponseBody r5 = r5.create(r1, r6, r2)
            return r5
    }

    public final okhttp3.Response priorResponse() {
            r1 = this;
            okhttp3.Response r0 = r1.priorResponse
            return r0
    }

    public final okhttp3.Protocol protocol() {
            r1 = this;
            okhttp3.Protocol r0 = r1.protocol
            return r0
    }

    public final long receivedResponseAtMillis() {
            r2 = this;
            long r0 = r2.receivedResponseAtMillis
            return r0
    }

    public final okhttp3.Request request() {
            r1 = this;
            okhttp3.Request r0 = r1.request
            return r0
    }

    public final long sentRequestAtMillis() {
            r2 = this;
            long r0 = r2.sentRequestAtMillis
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Response{protocol="
            r0.<init>(r1)
            okhttp3.Protocol r1 = r2.protocol
            r0.append(r1)
            java.lang.String r1 = ", code="
            r0.append(r1)
            int r1 = r2.code
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r1 = r2.message
            r0.append(r1)
            java.lang.String r1 = ", url="
            r0.append(r1)
            okhttp3.Request r1 = r2.request
            okhttp3.HttpUrl r1 = r1.url()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final okhttp3.Headers trailers() {
            r1 = this;
            okhttp3.internal.connection.Exchange r0 = r1.exchange
            if (r0 == 0) goto L9
            okhttp3.Headers r0 = r0.trailers()
            return r0
        L9:
            java.lang.String r0 = "trailers not available"
            j8.o.A(r0)
            r0 = 0
            return r0
    }
}
