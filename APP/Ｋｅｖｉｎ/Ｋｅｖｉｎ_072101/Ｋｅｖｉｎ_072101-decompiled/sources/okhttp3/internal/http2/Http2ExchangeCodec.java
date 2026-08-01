package okhttp3.internal.http2;

/* JADX INFO: compiled from: Http2ExchangeCodec.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 (2\u00020\u0001:\u0001(B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\fH\u0016J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m115d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "client", "Lokhttp3/OkHttpClient;", "connection", "Lokhttp3/internal/connection/RealConnection;", "chain", "Lokhttp3/internal/http/RealInterceptorChain;", "http2Connection", "Lokhttp3/internal/http2/Http2Connection;", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/connection/RealConnection;Lokhttp3/internal/http/RealInterceptorChain;Lokhttp3/internal/http2/Http2Connection;)V", "canceled", "", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "protocol", "Lokhttp3/Protocol;", "stream", "Lokhttp3/internal/http2/Http2Stream;", "cancel", "", "createRequestBody", "Lokio/Sink;", "request", "Lokhttp3/Request;", "contentLength", "", "finishRequest", "flushRequest", "openResponseBodySource", "Lokio/Source;", "response", "Lokhttp3/Response;", "readResponseHeaders", "Lokhttp3/Response$Builder;", "expectContinue", "reportedContentLength", "trailers", "Lokhttp3/Headers;", "writeRequestHeaders", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class Http2ExchangeCodec implements okhttp3.internal.http.ExchangeCodec {
    private static final java.lang.String CONNECTION = "connection";
    public static final okhttp3.internal.http2.Http2ExchangeCodec.Companion Companion = null;
    private static final java.lang.String ENCODING = "encoding";
    private static final java.lang.String HOST = "host";
    private static final java.util.List<java.lang.String> HTTP_2_SKIPPED_REQUEST_HEADERS = null;
    private static final java.util.List<java.lang.String> HTTP_2_SKIPPED_RESPONSE_HEADERS = null;
    private static final java.lang.String KEEP_ALIVE = "keep-alive";
    private static final java.lang.String PROXY_CONNECTION = "proxy-connection";

    /* JADX INFO: renamed from: TE */
    private static final java.lang.String f85TE = "te";
    private static final java.lang.String TRANSFER_ENCODING = "transfer-encoding";
    private static final java.lang.String UPGRADE = "upgrade";
    private volatile boolean canceled;
    private final okhttp3.internal.http.RealInterceptorChain chain;
    private final okhttp3.internal.connection.RealConnection connection;
    private final okhttp3.internal.http2.Http2Connection http2Connection;
    private final okhttp3.Protocol protocol;
    private volatile okhttp3.internal.http2.Http2Stream stream;

    /* JADX INFO: compiled from: Http2ExchangeCodec.kt */
    @kotlin.Metadata(m114d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m115d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;", "", "()V", "CONNECTION", "", "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", "", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "http2HeadersList", "Lokhttp3/internal/http2/Header;", "request", "Lokhttp3/Request;", "readHttp2HeadersList", "Lokhttp3/Response$Builder;", "headerBlock", "Lokhttp3/Headers;", "protocol", "Lokhttp3/Protocol;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

        public final java.util.List<okhttp3.internal.http2.Header> http2HeadersList(okhttp3.Request r9) {
                r8 = this;
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                okhttp3.Headers r0 = r9.headers()
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + 4
                r1.<init>(r2)
                okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
                okio.ByteString r3 = okhttp3.internal.http2.Header.TARGET_METHOD
                java.lang.String r4 = r9.method()
                r2.<init>(r3, r4)
                r1.add(r2)
                okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
                okio.ByteString r3 = okhttp3.internal.http2.Header.TARGET_PATH
                okhttp3.internal.http.RequestLine r4 = okhttp3.internal.http.RequestLine.INSTANCE
                okhttp3.HttpUrl r5 = r9.url()
                java.lang.String r4 = r4.requestPath(r5)
                r2.<init>(r3, r4)
                r1.add(r2)
                java.lang.String r2 = "Host"
                java.lang.String r2 = r9.header(r2)
                if (r2 == 0) goto L48
                okhttp3.internal.http2.Header r3 = new okhttp3.internal.http2.Header
                okio.ByteString r4 = okhttp3.internal.http2.Header.TARGET_AUTHORITY
                r3.<init>(r4, r2)
                r1.add(r3)
            L48:
                okhttp3.internal.http2.Header r3 = new okhttp3.internal.http2.Header
                okio.ByteString r4 = okhttp3.internal.http2.Header.TARGET_SCHEME
                okhttp3.HttpUrl r5 = r9.url()
                java.lang.String r5 = r5.scheme()
                r3.<init>(r4, r5)
                r1.add(r3)
                r3 = 0
                int r4 = r0.size()
            L5f:
                if (r3 >= r4) goto La2
                java.lang.String r5 = r0.name(r3)
                java.util.Locale r6 = java.util.Locale.US
                java.lang.String r7 = "US"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
                java.lang.String r5 = r5.toLowerCase(r6)
                java.lang.String r6 = "this as java.lang.String).toLowerCase(locale)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
                java.util.List r6 = okhttp3.internal.http2.Http2ExchangeCodec.access$getHTTP_2_SKIPPED_REQUEST_HEADERS$cp()
                boolean r6 = r6.contains(r5)
                if (r6 == 0) goto L93
                java.lang.String r6 = "te"
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
                if (r6 == 0) goto L9f
                java.lang.String r6 = r0.value(r3)
                java.lang.String r7 = "trailers"
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
                if (r6 == 0) goto L9f
            L93:
                okhttp3.internal.http2.Header r6 = new okhttp3.internal.http2.Header
                java.lang.String r7 = r0.value(r3)
                r6.<init>(r5, r7)
                r1.add(r6)
            L9f:
                int r3 = r3 + 1
                goto L5f
            La2:
                r3 = r1
                java.util.List r3 = (java.util.List) r3
                return r3
        }

        public final okhttp3.Response.Builder readHttp2HeadersList(okhttp3.Headers r10, okhttp3.Protocol r11) {
                r9 = this;
                java.lang.String r0 = "headerBlock"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                java.lang.String r0 = "protocol"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                r0 = 0
                okhttp3.Headers$Builder r1 = new okhttp3.Headers$Builder
                r1.<init>()
                r2 = 0
                int r3 = r10.size()
            L15:
                if (r2 >= r3) goto L51
                java.lang.String r4 = r10.name(r2)
                java.lang.String r5 = r10.value(r2)
                java.lang.String r6 = ":status"
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r6)
                if (r6 == 0) goto L41
                okhttp3.internal.http.StatusLine$Companion r6 = okhttp3.internal.http.StatusLine.Companion
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "HTTP/1.1 "
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.StringBuilder r7 = r7.append(r5)
                java.lang.String r7 = r7.toString()
                okhttp3.internal.http.StatusLine r0 = r6.parse(r7)
                goto L4e
            L41:
                java.util.List r6 = okhttp3.internal.http2.Http2ExchangeCodec.access$getHTTP_2_SKIPPED_RESPONSE_HEADERS$cp()
                boolean r6 = r6.contains(r4)
                if (r6 != 0) goto L4e
                r1.addLenient$okhttp(r4, r5)
            L4e:
                int r2 = r2 + 1
                goto L15
            L51:
                if (r0 == 0) goto L71
                okhttp3.Response$Builder r2 = new okhttp3.Response$Builder
                r2.<init>()
                okhttp3.Response$Builder r2 = r2.protocol(r11)
                int r3 = r0.code
                okhttp3.Response$Builder r2 = r2.code(r3)
                java.lang.String r3 = r0.message
                okhttp3.Response$Builder r2 = r2.message(r3)
                okhttp3.Headers r3 = r1.build()
                okhttp3.Response$Builder r2 = r2.headers(r3)
                return r2
            L71:
                java.net.ProtocolException r2 = new java.net.ProtocolException
                java.lang.String r3 = "Expected ':status' header not present"
                r2.<init>(r3)
                throw r2
        }
    }

    static {
            okhttp3.internal.http2.Http2ExchangeCodec$Companion r0 = new okhttp3.internal.http2.Http2ExchangeCodec$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.Http2ExchangeCodec.Companion = r0
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
            java.lang.String r12 = ":scheme"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            java.util.List r0 = okhttp3.internal.Util.immutableListOf(r0)
            okhttp3.internal.http2.Http2ExchangeCodec.HTTP_2_SKIPPED_REQUEST_HEADERS = r0
            java.lang.String r8 = "upgrade"
            java.lang.String r1 = "connection"
            java.lang.String r2 = "host"
            java.lang.String r3 = "keep-alive"
            java.lang.String r4 = "proxy-connection"
            java.lang.String r5 = "te"
            java.lang.String r6 = "transfer-encoding"
            java.lang.String r7 = "encoding"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8}
            java.util.List r0 = okhttp3.internal.Util.immutableListOf(r0)
            okhttp3.internal.http2.Http2ExchangeCodec.HTTP_2_SKIPPED_RESPONSE_HEADERS = r0
            return
    }

    public Http2ExchangeCodec(okhttp3.OkHttpClient r3, okhttp3.internal.connection.RealConnection r4, okhttp3.internal.http.RealInterceptorChain r5, okhttp3.internal.http2.Http2Connection r6) {
            r2 = this;
            java.lang.String r0 = "client"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "http2Connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r2.<init>()
            r2.connection = r4
            r2.chain = r5
            r2.http2Connection = r6
            java.util.List r0 = r3.protocols()
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L2c
            okhttp3.Protocol r0 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            goto L2e
        L2c:
            okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_2
        L2e:
            r2.protocol = r0
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
    public okio.Sink createRequestBody(okhttp3.Request r2, long r3) {
            r1 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.internal.http2.Http2Stream r0 = r1.stream
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okio.Sink r0 = r0.getSink()
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream r0 = r1.stream
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
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
    public okio.Source openResponseBodySource(okhttp3.Response r2) {
            r1 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.internal.http2.Http2Stream r0 = r1.stream
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r0.getSource$okhttp()
            okio.Source r0 = (okio.Source) r0
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okhttp3.Response.Builder readResponseHeaders(boolean r6) {
            r5 = this;
            okhttp3.internal.http2.Http2Stream r0 = r5.stream
            if (r0 == 0) goto L1e
            okhttp3.Headers r1 = r0.takeHeaders()
            okhttp3.internal.http2.Http2ExchangeCodec$Companion r2 = okhttp3.internal.http2.Http2ExchangeCodec.Companion
            okhttp3.Protocol r3 = r5.protocol
            okhttp3.Response$Builder r2 = r2.readHttp2HeadersList(r1, r3)
            if (r6 == 0) goto L1c
            int r3 = r2.getCode$okhttp()
            r4 = 100
            if (r3 != r4) goto L1c
            r3 = 0
            goto L1d
        L1c:
            r3 = r2
        L1d:
            return r3
        L1e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "stream wasn't created"
            r0.<init>(r1)
            throw r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(okhttp3.Response r3) {
            r2 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = okhttp3.internal.http.HttpHeaders.promisesBody(r3)
            if (r0 != 0) goto Lf
            r0 = 0
            goto L13
        Lf:
            long r0 = okhttp3.internal.Util.headersContentLength(r3)
        L13:
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okhttp3.Headers trailers() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream r0 = r1.stream
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okhttp3.Headers r0 = r0.trailers()
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(okhttp3.Request r7) {
            r6 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            okhttp3.internal.http2.Http2Stream r0 = r6.stream
            if (r0 == 0) goto La
            return
        La:
            okhttp3.RequestBody r0 = r7.body()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            okhttp3.internal.http2.Http2ExchangeCodec$Companion r1 = okhttp3.internal.http2.Http2ExchangeCodec.Companion
            java.util.List r1 = r1.http2HeadersList(r7)
            okhttp3.internal.http2.Http2Connection r2 = r6.http2Connection
            okhttp3.internal.http2.Http2Stream r2 = r2.newStream(r1, r0)
            r6.stream = r2
            boolean r2 = r6.canceled
            if (r2 != 0) goto L50
            okhttp3.internal.http2.Http2Stream r2 = r6.stream
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            okio.Timeout r2 = r2.readTimeout()
            okhttp3.internal.http.RealInterceptorChain r3 = r6.chain
            int r3 = r3.getReadTimeoutMillis$okhttp()
            long r3 = (long) r3
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2.timeout(r3, r5)
            okhttp3.internal.http2.Http2Stream r2 = r6.stream
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            okio.Timeout r2 = r2.writeTimeout()
            okhttp3.internal.http.RealInterceptorChain r3 = r6.chain
            int r3 = r3.getWriteTimeoutMillis$okhttp()
            long r3 = (long) r3
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2.timeout(r3, r5)
            return
        L50:
            okhttp3.internal.http2.Http2Stream r2 = r6.stream
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            okhttp3.internal.http2.ErrorCode r3 = okhttp3.internal.http2.ErrorCode.CANCEL
            r2.closeLater(r3)
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)
            throw r2
    }
}
