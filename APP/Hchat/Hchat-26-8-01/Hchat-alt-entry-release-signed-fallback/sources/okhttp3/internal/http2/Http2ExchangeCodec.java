package okhttp3.internal.http2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Http2ExchangeCodec implements okhttp3.internal.http.ExchangeCodec {
    private static final java.lang.String CONNECTION = "connection";
    public static final okhttp3.internal.http2.Http2ExchangeCodec.Companion Companion = null;
    private static final java.lang.String ENCODING = "encoding";
    private static final java.lang.String HOST = "host";
    private static final java.util.List<java.lang.String> HTTP_2_SKIPPED_REQUEST_HEADERS = null;
    private static final java.util.List<java.lang.String> HTTP_2_SKIPPED_RESPONSE_HEADERS = null;
    private static final java.lang.String KEEP_ALIVE = "keep-alive";
    private static final java.lang.String PROXY_CONNECTION = "proxy-connection";
    private static final java.lang.String TE = "te";
    private static final java.lang.String TRANSFER_ENCODING = "transfer-encoding";
    private static final java.lang.String UPGRADE = "upgrade";
    private volatile boolean canceled;
    private final okhttp3.internal.http.RealInterceptorChain chain;
    private final okhttp3.internal.connection.RealConnection connection;
    private final okhttp3.internal.http2.Http2Connection http2Connection;
    private final okhttp3.Protocol protocol;
    private volatile okhttp3.internal.http2.Http2Stream stream;

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

        public final java.util.List<okhttp3.internal.http2.Header> http2HeadersList(okhttp3.Request r7) {
                r6 = this;
                r7.getClass()
                okhttp3.Headers r0 = r7.headers()
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + 4
                r1.<init>(r2)
                okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
                okio.ByteString r3 = okhttp3.internal.http2.Header.TARGET_METHOD
                java.lang.String r4 = r7.method()
                r2.<init>(r3, r4)
                r1.add(r2)
                okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
                okio.ByteString r3 = okhttp3.internal.http2.Header.TARGET_PATH
                okhttp3.internal.http.RequestLine r4 = okhttp3.internal.http.RequestLine.INSTANCE
                okhttp3.HttpUrl r5 = r7.url()
                java.lang.String r4 = r4.requestPath(r5)
                r2.<init>(r3, r4)
                r1.add(r2)
                java.lang.String r2 = "Host"
                java.lang.String r2 = r7.header(r2)
                if (r2 == 0) goto L46
                okhttp3.internal.http2.Header r3 = new okhttp3.internal.http2.Header
                okio.ByteString r4 = okhttp3.internal.http2.Header.TARGET_AUTHORITY
                r3.<init>(r4, r2)
                r1.add(r3)
            L46:
                okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
                okio.ByteString r3 = okhttp3.internal.http2.Header.TARGET_SCHEME
                okhttp3.HttpUrl r7 = r7.url()
                java.lang.String r7 = r7.scheme()
                r2.<init>(r3, r7)
                r1.add(r2)
                int r7 = r0.size()
                r2 = 0
            L5d:
                if (r2 >= r7) goto L96
                java.lang.String r3 = r0.name(r2)
                java.util.Locale r4 = java.util.Locale.US
                java.lang.String r3 = j8.b.l(r4, r3, r4)
                java.util.List r4 = okhttp3.internal.http2.Http2ExchangeCodec.access$getHTTP_2_SKIPPED_REQUEST_HEADERS$cp()
                boolean r4 = r4.contains(r3)
                if (r4 == 0) goto L87
                java.lang.String r4 = "te"
                boolean r4 = r3.equals(r4)
                if (r4 == 0) goto L93
                java.lang.String r4 = r0.value(r2)
                java.lang.String r5 = "trailers"
                boolean r4 = gg.l.a(r4, r5)
                if (r4 == 0) goto L93
            L87:
                okhttp3.internal.http2.Header r4 = new okhttp3.internal.http2.Header
                java.lang.String r5 = r0.value(r2)
                r4.<init>(r3, r5)
                r1.add(r4)
            L93:
                int r2 = r2 + 1
                goto L5d
            L96:
                return r1
        }

        public final okhttp3.Response.Builder readHttp2HeadersList(okhttp3.Headers r8, okhttp3.Protocol r9) {
                r7 = this;
                r8.getClass()
                r9.getClass()
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
                r0.<init>()
                int r1 = r8.size()
                r2 = 0
                r3 = 0
            L11:
                if (r3 >= r1) goto L48
                java.lang.String r4 = r8.name(r3)
                java.lang.String r5 = r8.value(r3)
                java.lang.String r6 = ":status"
                boolean r6 = gg.l.a(r4, r6)
                if (r6 == 0) goto L38
                okhttp3.internal.http.StatusLine$Companion r2 = okhttp3.internal.http.StatusLine.Companion
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r6 = "HTTP/1.1 "
                r4.<init>(r6)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                okhttp3.internal.http.StatusLine r2 = r2.parse(r4)
                goto L45
            L38:
                java.util.List r6 = okhttp3.internal.http2.Http2ExchangeCodec.access$getHTTP_2_SKIPPED_RESPONSE_HEADERS$cp()
                boolean r6 = r6.contains(r4)
                if (r6 != 0) goto L45
                r0.addLenient$okhttp(r4, r5)
            L45:
                int r3 = r3 + 1
                goto L11
            L48:
                if (r2 == 0) goto L68
                okhttp3.Response$Builder r8 = new okhttp3.Response$Builder
                r8.<init>()
                okhttp3.Response$Builder r8 = r8.protocol(r9)
                int r9 = r2.code
                okhttp3.Response$Builder r8 = r8.code(r9)
                java.lang.String r9 = r2.message
                okhttp3.Response$Builder r8 = r8.message(r9)
                okhttp3.Headers r9 = r0.build()
                okhttp3.Response$Builder r8 = r8.headers(r9)
                return r8
            L68:
                java.net.ProtocolException r8 = new java.net.ProtocolException
                java.lang.String r9 = "Expected ':status' header not present"
                r8.<init>(r9)
                throw r8
        }
    }

    static {
            okhttp3.internal.http2.Http2ExchangeCodec$Companion r0 = new okhttp3.internal.http2.Http2ExchangeCodec$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.Http2ExchangeCodec.Companion = r0
            java.lang.String r12 = ":scheme"
            java.lang.String r13 = ":authority"
            java.lang.String r2 = "connection"
            java.lang.String r3 = "host"
            java.lang.String r4 = "keep-alive"
            java.lang.String r5 = "proxy-connection"
            java.lang.String r6 = "te"
            java.lang.String r7 = "transfer-encoding"
            java.lang.String r8 = "encoding"
            java.lang.String r9 = "upgrade"
            java.lang.String r10 = ":method"
            java.lang.String r11 = ":path"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            java.util.List r0 = okhttp3.internal.Util.immutableListOf(r0)
            okhttp3.internal.http2.Http2ExchangeCodec.HTTP_2_SKIPPED_REQUEST_HEADERS = r0
            java.lang.String r7 = "encoding"
            java.lang.String r8 = "upgrade"
            java.lang.String r1 = "connection"
            java.lang.String r2 = "host"
            java.lang.String r3 = "keep-alive"
            java.lang.String r4 = "proxy-connection"
            java.lang.String r5 = "te"
            java.lang.String r6 = "transfer-encoding"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8}
            java.util.List r0 = okhttp3.internal.Util.immutableListOf(r0)
            okhttp3.internal.http2.Http2ExchangeCodec.HTTP_2_SKIPPED_RESPONSE_HEADERS = r0
            return
    }

    public Http2ExchangeCodec(okhttp3.OkHttpClient r1, okhttp3.internal.connection.RealConnection r2, okhttp3.internal.http.RealInterceptorChain r3, okhttp3.internal.http2.Http2Connection r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.connection = r2
            r0.chain = r3
            r0.http2Connection = r4
            java.util.List r1 = r1.protocols()
            okhttp3.Protocol r2 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L22
            goto L24
        L22:
            okhttp3.Protocol r2 = okhttp3.Protocol.HTTP_2
        L24:
            r0.protocol = r2
            return
    }

    public static final /* synthetic */ java.util.List access$getHTTP_2_SKIPPED_REQUEST_HEADERS$cp() {
            java.util.List<java.lang.String> r0 = okhttp3.internal.http2.Http2ExchangeCodec.HTTP_2_SKIPPED_REQUEST_HEADERS
            return r0
    }

    public static final /* synthetic */ java.util.List access$getHTTP_2_SKIPPED_RESPONSE_HEADERS$cp() {
            java.util.List<java.lang.String> r0 = okhttp3.internal.http2.Http2ExchangeCodec.HTTP_2_SKIPPED_RESPONSE_HEADERS
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
            r2 = this;
            r0 = 1
            r2.canceled = r0
            okhttp3.internal.http2.Http2Stream r0 = r2.stream
            if (r0 == 0) goto Lc
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL
            r0.closeLater(r1)
        Lc:
            return
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okio.Sink createRequestBody(okhttp3.Request r1, long r2) {
            r0 = this;
            r1.getClass()
            okhttp3.internal.http2.Http2Stream r1 = r0.stream
            r1.getClass()
            okio.Sink r1 = r1.getSink()
            return r1
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream r0 = r1.stream
            r0.getClass()
            okio.Sink r0 = r0.getSink()
            r0.close()
            return
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
            r1 = this;
            okhttp3.internal.http2.Http2Connection r0 = r1.http2Connection
            r0.flush()
            return
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okhttp3.internal.connection.RealConnection getConnection() {
            r1 = this;
            okhttp3.internal.connection.RealConnection r0 = r1.connection
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okio.Source openResponseBodySource(okhttp3.Response r1) {
            r0 = this;
            r1.getClass()
            okhttp3.internal.http2.Http2Stream r1 = r0.stream
            r1.getClass()
            okhttp3.internal.http2.Http2Stream$FramingSource r1 = r1.getSource$okhttp()
            return r1
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okhttp3.Response.Builder readResponseHeaders(boolean r4) {
            r3 = this;
            okhttp3.internal.http2.Http2Stream r0 = r3.stream
            if (r0 == 0) goto L1d
            okhttp3.Headers r0 = r0.takeHeaders()
            okhttp3.internal.http2.Http2ExchangeCodec$Companion r1 = okhttp3.internal.http2.Http2ExchangeCodec.Companion
            okhttp3.Protocol r2 = r3.protocol
            okhttp3.Response$Builder r0 = r1.readHttp2HeadersList(r0, r2)
            if (r4 == 0) goto L1c
            int r4 = r0.getCode$okhttp()
            r1 = 100
            if (r4 != r1) goto L1c
            r4 = 0
            return r4
        L1c:
            return r0
        L1d:
            java.lang.String r4 = "stream wasn't created"
            j8.o.y(r4)
            r4 = 0
            return r4
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(okhttp3.Response r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = okhttp3.internal.http.HttpHeaders.promisesBody(r3)
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            long r0 = okhttp3.internal.Util.headersContentLength(r3)
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okhttp3.Headers trailers() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream r0 = r1.stream
            r0.getClass()
            okhttp3.Headers r0 = r0.trailers()
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(okhttp3.Request r4) {
            r3 = this;
            r4.getClass()
            okhttp3.internal.http2.Http2Stream r0 = r3.stream
            if (r0 == 0) goto L8
            return
        L8:
            okhttp3.RequestBody r0 = r4.body()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            okhttp3.internal.http2.Http2ExchangeCodec$Companion r1 = okhttp3.internal.http2.Http2ExchangeCodec.Companion
            java.util.List r4 = r1.http2HeadersList(r4)
            okhttp3.internal.http2.Http2Connection r1 = r3.http2Connection
            okhttp3.internal.http2.Http2Stream r4 = r1.newStream(r4, r0)
            r3.stream = r4
            boolean r4 = r3.canceled
            okhttp3.internal.http2.Http2Stream r0 = r3.stream
            if (r4 != 0) goto L4c
            r0.getClass()
            okio.Timeout r4 = r0.readTimeout()
            okhttp3.internal.http.RealInterceptorChain r0 = r3.chain
            int r0 = r0.getReadTimeoutMillis$okhttp()
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4.timeout(r0, r2)
            okhttp3.internal.http2.Http2Stream r4 = r3.stream
            r4.getClass()
            okio.Timeout r4 = r4.writeTimeout()
            okhttp3.internal.http.RealInterceptorChain r0 = r3.chain
            int r0 = r0.getWriteTimeoutMillis$okhttp()
            long r0 = (long) r0
            r4.timeout(r0, r2)
            return
        L4c:
            r0.getClass()
            okhttp3.internal.http2.ErrorCode r4 = okhttp3.internal.http2.ErrorCode.CANCEL
            r0.closeLater(r4)
            java.lang.String r4 = "Canceled"
            j8.o.y(r4)
            return
    }
}
