package okhttp3.internal.http1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Http1ExchangeCodec implements okhttp3.internal.http.ExchangeCodec {
    public static final okhttp3.internal.http1.Http1ExchangeCodec.Companion Companion = null;
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final okhttp3.OkHttpClient client;
    private final okhttp3.internal.connection.RealConnection connection;
    private final okhttp3.internal.http1.HeadersReader headersReader;
    private final okio.BufferedSink sink;
    private final okio.BufferedSource source;
    private int state;
    private okhttp3.Headers trailers;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public abstract class AbstractSource implements okio.Source {
        private boolean closed;
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;
        private final okio.ForwardingTimeout timeout;

        public AbstractSource(okhttp3.internal.http1.Http1ExchangeCodec r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                okio.ForwardingTimeout r0 = new okio.ForwardingTimeout
                okio.BufferedSource r2 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSource$p(r2)
                okio.Timeout r2 = r2.timeout()
                r0.<init>(r2)
                r1.timeout = r0
                return
        }

        public final boolean getClosed() {
                r1 = this;
                boolean r0 = r1.closed
                return r0
        }

        public final okio.ForwardingTimeout getTimeout() {
                r1 = this;
                okio.ForwardingTimeout r0 = r1.timeout
                return r0
        }

        @Override // okio.Source
        public long read(okio.Buffer r2, long r3) {
                r1 = this;
                r2.getClass()
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r1.this$0     // Catch: java.io.IOException -> Le
                okio.BufferedSource r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSource$p(r0)     // Catch: java.io.IOException -> Le
                long r2 = r0.read(r2, r3)     // Catch: java.io.IOException -> Le
                return r2
            Le:
                r2 = move-exception
                okhttp3.internal.http1.Http1ExchangeCodec r3 = r1.this$0
                okhttp3.internal.connection.RealConnection r3 = r3.getConnection()
                r3.noNewExchanges$okhttp()
                r1.responseBodyComplete()
                throw r2
        }

        public final void responseBodyComplete() {
                r4 = this;
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r4.this$0
                int r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getState$p(r0)
                r1 = 6
                if (r0 != r1) goto La
                return
            La:
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r4.this$0
                int r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getState$p(r0)
                okhttp3.internal.http1.Http1ExchangeCodec r2 = r4.this$0
                r3 = 5
                if (r0 != r3) goto L20
                okio.ForwardingTimeout r0 = r4.timeout
                okhttp3.internal.http1.Http1ExchangeCodec.access$detachTimeout(r2, r0)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r4.this$0
                okhttp3.internal.http1.Http1ExchangeCodec.access$setState$p(r0, r1)
                return
            L20:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                int r1 = okhttp3.internal.http1.Http1ExchangeCodec.access$getState$p(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "state: "
                r2.<init>(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
        }

        public final void setClosed(boolean r1) {
                r0 = this;
                r0.closed = r1
                return
        }

        @Override // okio.Source
        public okio.Timeout timeout() {
                r1 = this;
                okio.ForwardingTimeout r0 = r1.timeout
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class ChunkedSink implements okio.Sink {
        private boolean closed;
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;
        private final okio.ForwardingTimeout timeout;

        public ChunkedSink(okhttp3.internal.http1.Http1ExchangeCodec r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                okio.ForwardingTimeout r0 = new okio.ForwardingTimeout
                okio.BufferedSink r2 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSink$p(r2)
                okio.Timeout r2 = r2.timeout()
                r0.<init>(r2)
                r1.timeout = r0
                return
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L24
                if (r0 == 0) goto L7
                monitor-exit(r2)
                return
            L7:
                r0 = 1
                r2.closed = r0     // Catch: java.lang.Throwable -> L24
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0     // Catch: java.lang.Throwable -> L24
                okio.BufferedSink r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSink$p(r0)     // Catch: java.lang.Throwable -> L24
                java.lang.String r1 = "0\r\n\r\n"
                r0.writeUtf8(r1)     // Catch: java.lang.Throwable -> L24
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0     // Catch: java.lang.Throwable -> L24
                okio.ForwardingTimeout r1 = r2.timeout     // Catch: java.lang.Throwable -> L24
                okhttp3.internal.http1.Http1ExchangeCodec.access$detachTimeout(r0, r1)     // Catch: java.lang.Throwable -> L24
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0     // Catch: java.lang.Throwable -> L24
                r1 = 3
                okhttp3.internal.http1.Http1ExchangeCodec.access$setState$p(r0, r1)     // Catch: java.lang.Throwable -> L24
                monitor-exit(r2)
                return
            L24:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
                throw r0
        }

        @Override // okio.Sink, java.io.Flushable
        public synchronized void flush() {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.closed     // Catch: java.lang.Throwable -> L12
                if (r0 == 0) goto L7
                monitor-exit(r1)
                return
            L7:
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r1.this$0     // Catch: java.lang.Throwable -> L12
                okio.BufferedSink r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSink$p(r0)     // Catch: java.lang.Throwable -> L12
                r0.flush()     // Catch: java.lang.Throwable -> L12
                monitor-exit(r1)
                return
            L12:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
                throw r0
        }

        @Override // okio.Sink
        public okio.Timeout timeout() {
                r1 = this;
                okio.ForwardingTimeout r0 = r1.timeout
                return r0
        }

        @Override // okio.Sink
        public void write(okio.Buffer r3, long r4) {
                r2 = this;
                r3.getClass()
                boolean r0 = r2.closed
                if (r0 != 0) goto L35
                r0 = 0
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 != 0) goto Le
                return
            Le:
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0
                okio.BufferedSink r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSink$p(r0)
                r0.writeHexadecimalUnsignedLong(r4)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0
                okio.BufferedSink r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSink$p(r0)
                java.lang.String r1 = "\r\n"
                r0.writeUtf8(r1)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0
                okio.BufferedSink r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSink$p(r0)
                r0.write(r3, r4)
                okhttp3.internal.http1.Http1ExchangeCodec r3 = r2.this$0
                okio.BufferedSink r3 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSink$p(r3)
                r3.writeUtf8(r1)
                return
            L35:
                java.lang.String r3 = "closed"
                j8.o.A(r3)
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class ChunkedSource extends okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;
        private final okhttp3.HttpUrl url;

        public ChunkedSource(okhttp3.internal.http1.Http1ExchangeCodec r1, okhttp3.HttpUrl r2) {
                r0 = this;
                r2.getClass()
                r0.this$0 = r1
                r0.<init>(r1)
                r0.url = r2
                r1 = -1
                r0.bytesRemainingInChunk = r1
                r1 = 1
                r0.hasMoreChunks = r1
                return
        }

        private final void readChunkSize() {
                r6 = this;
                java.lang.String r0 = "expected chunk size and optional extensions but was \""
                long r1 = r6.bytesRemainingInChunk
                r3 = -1
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 == 0) goto L13
                okhttp3.internal.http1.Http1ExchangeCodec r1 = r6.this$0
                okio.BufferedSource r1 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSource$p(r1)
                r1.readUtf8LineStrict()
            L13:
                okhttp3.internal.http1.Http1ExchangeCodec r1 = r6.this$0     // Catch: java.lang.NumberFormatException -> L49
                okio.BufferedSource r1 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSource$p(r1)     // Catch: java.lang.NumberFormatException -> L49
                long r1 = r1.readHexadecimalUnsignedLong()     // Catch: java.lang.NumberFormatException -> L49
                r6.bytesRemainingInChunk = r1     // Catch: java.lang.NumberFormatException -> L49
                okhttp3.internal.http1.Http1ExchangeCodec r1 = r6.this$0     // Catch: java.lang.NumberFormatException -> L49
                okio.BufferedSource r1 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSource$p(r1)     // Catch: java.lang.NumberFormatException -> L49
                java.lang.String r1 = r1.readUtf8LineStrict()     // Catch: java.lang.NumberFormatException -> L49
                java.lang.CharSequence r1 = og.m.R0(r1)     // Catch: java.lang.NumberFormatException -> L49
                java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> L49
                long r2 = r6.bytesRemainingInChunk     // Catch: java.lang.NumberFormatException -> L49
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L7f
                int r2 = r1.length()     // Catch: java.lang.NumberFormatException -> L49
                r3 = 0
                if (r2 <= 0) goto L4b
                java.lang.String r2 = ";"
                boolean r2 = og.t.d0(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L49
                if (r2 == 0) goto L7f
                goto L4b
            L49:
                r0 = move-exception
                goto L9b
            L4b:
                long r0 = r6.bytesRemainingInChunk
                int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r0 != 0) goto L7e
                r6.hasMoreChunks = r3
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r6.this$0
                okhttp3.internal.http1.HeadersReader r1 = okhttp3.internal.http1.Http1ExchangeCodec.access$getHeadersReader$p(r0)
                okhttp3.Headers r1 = r1.readHeaders()
                okhttp3.internal.http1.Http1ExchangeCodec.access$setTrailers$p(r0, r1)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r6.this$0
                okhttp3.OkHttpClient r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getClient$p(r0)
                r0.getClass()
                okhttp3.CookieJar r0 = r0.cookieJar()
                okhttp3.HttpUrl r1 = r6.url
                okhttp3.internal.http1.Http1ExchangeCodec r2 = r6.this$0
                okhttp3.Headers r2 = okhttp3.internal.http1.Http1ExchangeCodec.access$getTrailers$p(r2)
                r2.getClass()
                okhttp3.internal.http.HttpHeaders.receiveHeaders(r0, r1, r2)
                r6.responseBodyComplete()
            L7e:
                return
            L7f:
                java.net.ProtocolException r2 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> L49
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L49
                r3.<init>(r0)     // Catch: java.lang.NumberFormatException -> L49
                long r4 = r6.bytesRemainingInChunk     // Catch: java.lang.NumberFormatException -> L49
                r3.append(r4)     // Catch: java.lang.NumberFormatException -> L49
                r3.append(r1)     // Catch: java.lang.NumberFormatException -> L49
                r0 = 34
                r3.append(r0)     // Catch: java.lang.NumberFormatException -> L49
                java.lang.String r0 = r3.toString()     // Catch: java.lang.NumberFormatException -> L49
                r2.<init>(r0)     // Catch: java.lang.NumberFormatException -> L49
                throw r2     // Catch: java.lang.NumberFormatException -> L49
            L9b:
                java.net.ProtocolException r1 = new java.net.ProtocolException
                java.lang.String r0 = r0.getMessage()
                r1.<init>(r0)
                throw r1
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r2 = this;
                boolean r0 = r2.getClosed()
                if (r0 == 0) goto L7
                return
            L7:
                boolean r0 = r2.hasMoreChunks
                if (r0 == 0) goto L21
                r0 = 100
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
                boolean r0 = okhttp3.internal.Util.discard(r2, r0, r1)
                if (r0 != 0) goto L21
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0
                okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
                r0.noNewExchanges$okhttp()
                r2.responseBodyComplete()
            L21:
                r0 = 1
                r2.setClosed(r0)
                return
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(okio.Buffer r8, long r9) {
                r7 = this;
                r8.getClass()
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 < 0) goto L58
                boolean r2 = r7.getClosed()
                if (r2 != 0) goto L50
                boolean r2 = r7.hasMoreChunks
                r3 = -1
                if (r2 != 0) goto L16
                return r3
            L16:
                long r5 = r7.bytesRemainingInChunk
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 == 0) goto L20
                int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r0 != 0) goto L28
            L20:
                r7.readChunkSize()
                boolean r0 = r7.hasMoreChunks
                if (r0 != 0) goto L28
                return r3
            L28:
                long r0 = r7.bytesRemainingInChunk
                long r9 = java.lang.Math.min(r9, r0)
                long r8 = super.read(r8, r9)
                int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r10 == 0) goto L3c
                long r0 = r7.bytesRemainingInChunk
                long r0 = r0 - r8
                r7.bytesRemainingInChunk = r0
                return r8
            L3c:
                okhttp3.internal.http1.Http1ExchangeCodec r8 = r7.this$0
                okhttp3.internal.connection.RealConnection r8 = r8.getConnection()
                r8.noNewExchanges$okhttp()
                java.net.ProtocolException r8 = new java.net.ProtocolException
                java.lang.String r9 = "unexpected end of stream"
                r8.<init>(r9)
                r7.responseBodyComplete()
                throw r8
            L50:
                java.lang.String r8 = "closed"
                j8.o.A(r8)
                r8 = 0
                return r8
            L58:
                java.lang.String r8 = "byteCount < 0: "
                java.lang.String r8 = bc.e.g(r9, r8)
                j8.o.q(r8)
                r8 = 0
                return r8
        }
    }

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
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class FixedLengthSource extends okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource {
        private long bytesRemaining;
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;

        public FixedLengthSource(okhttp3.internal.http1.Http1ExchangeCodec r3, long r4) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>(r3)
                r2.bytesRemaining = r4
                r0 = 0
                int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r3 != 0) goto L10
                r2.responseBodyComplete()
            L10:
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r4 = this;
                boolean r0 = r4.getClosed()
                if (r0 == 0) goto L7
                return
            L7:
                long r0 = r4.bytesRemaining
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L25
                r0 = 100
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
                boolean r0 = okhttp3.internal.Util.discard(r4, r0, r1)
                if (r0 != 0) goto L25
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r4.this$0
                okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
                r0.noNewExchanges$okhttp()
                r4.responseBodyComplete()
            L25:
                r0 = 1
                r4.setClosed(r0)
                return
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(okio.Buffer r8, long r9) {
                r7 = this;
                r8.getClass()
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 < 0) goto L4d
                boolean r2 = r7.getClosed()
                if (r2 != 0) goto L45
                long r2 = r7.bytesRemaining
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                r5 = -1
                if (r4 != 0) goto L18
                return r5
            L18:
                long r9 = java.lang.Math.min(r2, r9)
                long r8 = super.read(r8, r9)
                int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r10 == 0) goto L31
                long r2 = r7.bytesRemaining
                long r2 = r2 - r8
                r7.bytesRemaining = r2
                int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r10 != 0) goto L30
                r7.responseBodyComplete()
            L30:
                return r8
            L31:
                okhttp3.internal.http1.Http1ExchangeCodec r8 = r7.this$0
                okhttp3.internal.connection.RealConnection r8 = r8.getConnection()
                r8.noNewExchanges$okhttp()
                java.net.ProtocolException r8 = new java.net.ProtocolException
                java.lang.String r9 = "unexpected end of stream"
                r8.<init>(r9)
                r7.responseBodyComplete()
                throw r8
            L45:
                java.lang.String r8 = "closed"
                j8.o.A(r8)
            L4a:
                r8 = 0
                return r8
            L4d:
                java.lang.String r8 = "byteCount < 0: "
                java.lang.String r8 = bc.e.g(r9, r8)
                j8.o.q(r8)
                goto L4a
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class KnownLengthSink implements okio.Sink {
        private boolean closed;
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;
        private final okio.ForwardingTimeout timeout;

        public KnownLengthSink(okhttp3.internal.http1.Http1ExchangeCodec r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                okio.ForwardingTimeout r0 = new okio.ForwardingTimeout
                okio.BufferedSink r2 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSink$p(r2)
                okio.Timeout r2 = r2.timeout()
                r0.<init>(r2)
                r1.timeout = r0
                return
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r2 = this;
                boolean r0 = r2.closed
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.closed = r0
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0
                okio.ForwardingTimeout r1 = r2.timeout
                okhttp3.internal.http1.Http1ExchangeCodec.access$detachTimeout(r0, r1)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0
                r1 = 3
                okhttp3.internal.http1.Http1ExchangeCodec.access$setState$p(r0, r1)
                return
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
                r1 = this;
                boolean r0 = r1.closed
                if (r0 == 0) goto L5
                return
            L5:
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r1.this$0
                okio.BufferedSink r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSink$p(r0)
                r0.flush()
                return
        }

        @Override // okio.Sink
        public okio.Timeout timeout() {
                r1 = this;
                okio.ForwardingTimeout r0 = r1.timeout
                return r0
        }

        @Override // okio.Sink
        public void write(okio.Buffer r8, long r9) {
                r7 = this;
                r8.getClass()
                boolean r0 = r7.closed
                if (r0 != 0) goto L1b
                long r1 = r8.size()
                r3 = 0
                r5 = r9
                okhttp3.internal.Util.checkOffsetAndCount(r1, r3, r5)
                okhttp3.internal.http1.Http1ExchangeCodec r9 = r7.this$0
                okio.BufferedSink r9 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSink$p(r9)
                r9.write(r8, r5)
                return
            L1b:
                java.lang.String r8 = "closed"
                j8.o.A(r8)
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class UnknownLengthSource extends okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource {
        private boolean inputExhausted;
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;

        public UnknownLengthSource(okhttp3.internal.http1.Http1ExchangeCodec r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                boolean r0 = r1.getClosed()
                if (r0 == 0) goto L7
                return
            L7:
                boolean r0 = r1.inputExhausted
                if (r0 != 0) goto Le
                r1.responseBodyComplete()
            Le:
                r0 = 1
                r1.setClosed(r0)
                return
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(okio.Buffer r4, long r5) {
                r3 = this;
                r4.getClass()
                r0 = 0
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 < 0) goto L2e
                boolean r0 = r3.getClosed()
                if (r0 != 0) goto L26
                boolean r0 = r3.inputExhausted
                r1 = -1
                if (r0 == 0) goto L16
                return r1
            L16:
                long r4 = super.read(r4, r5)
                int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r6 != 0) goto L25
                r4 = 1
                r3.inputExhausted = r4
                r3.responseBodyComplete()
                return r1
            L25:
                return r4
            L26:
                java.lang.String r4 = "closed"
                j8.o.A(r4)
            L2b:
                r4 = 0
                return r4
            L2e:
                java.lang.String r4 = "byteCount < 0: "
                java.lang.String r4 = bc.e.g(r5, r4)
                j8.o.q(r4)
                goto L2b
        }
    }

    static {
            okhttp3.internal.http1.Http1ExchangeCodec$Companion r0 = new okhttp3.internal.http1.Http1ExchangeCodec$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http1.Http1ExchangeCodec.Companion = r0
            return
    }

    public Http1ExchangeCodec(okhttp3.OkHttpClient r1, okhttp3.internal.connection.RealConnection r2, okio.BufferedSource r3, okio.BufferedSink r4) {
            r0 = this;
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.client = r1
            r0.connection = r2
            r0.source = r3
            r0.sink = r4
            okhttp3.internal.http1.HeadersReader r1 = new okhttp3.internal.http1.HeadersReader
            r1.<init>(r3)
            r0.headersReader = r1
            return
    }

    public static final /* synthetic */ void access$detachTimeout(okhttp3.internal.http1.Http1ExchangeCodec r0, okio.ForwardingTimeout r1) {
            r0.detachTimeout(r1)
            return
    }

    public static final /* synthetic */ okhttp3.OkHttpClient access$getClient$p(okhttp3.internal.http1.Http1ExchangeCodec r0) {
            okhttp3.OkHttpClient r0 = r0.client
            return r0
    }

    public static final /* synthetic */ okhttp3.internal.http1.HeadersReader access$getHeadersReader$p(okhttp3.internal.http1.Http1ExchangeCodec r0) {
            okhttp3.internal.http1.HeadersReader r0 = r0.headersReader
            return r0
    }

    public static final /* synthetic */ okio.BufferedSink access$getSink$p(okhttp3.internal.http1.Http1ExchangeCodec r0) {
            okio.BufferedSink r0 = r0.sink
            return r0
    }

    public static final /* synthetic */ okio.BufferedSource access$getSource$p(okhttp3.internal.http1.Http1ExchangeCodec r0) {
            okio.BufferedSource r0 = r0.source
            return r0
    }

    public static final /* synthetic */ int access$getState$p(okhttp3.internal.http1.Http1ExchangeCodec r0) {
            int r0 = r0.state
            return r0
    }

    public static final /* synthetic */ okhttp3.Headers access$getTrailers$p(okhttp3.internal.http1.Http1ExchangeCodec r0) {
            okhttp3.Headers r0 = r0.trailers
            return r0
    }

    public static final /* synthetic */ void access$setState$p(okhttp3.internal.http1.Http1ExchangeCodec r0, int r1) {
            r0.state = r1
            return
    }

    public static final /* synthetic */ void access$setTrailers$p(okhttp3.internal.http1.Http1ExchangeCodec r0, okhttp3.Headers r1) {
            r0.trailers = r1
            return
    }

    private final void detachTimeout(okio.ForwardingTimeout r3) {
            r2 = this;
            okio.Timeout r0 = r3.delegate()
            okio.Timeout r1 = okio.Timeout.NONE
            r3.setDelegate(r1)
            r0.clearDeadline()
            r0.clearTimeout()
            return
    }

    private final boolean isChunked(okhttp3.Request r2) {
            r1 = this;
            java.lang.String r0 = "Transfer-Encoding"
            java.lang.String r2 = r2.header(r0)
            java.lang.String r0 = "chunked"
            boolean r2 = r0.equalsIgnoreCase(r2)
            return r2
    }

    private final boolean isChunked(okhttp3.Response r4) {
            r3 = this;
            r0 = 0
            r1 = 2
            java.lang.String r2 = "Transfer-Encoding"
            java.lang.String r4 = okhttp3.Response.header$default(r4, r2, r0, r1, r0)
            java.lang.String r0 = "chunked"
            boolean r4 = r0.equalsIgnoreCase(r4)
            return r4
    }

    private final okio.Sink newChunkedSink() {
            r2 = this;
            int r0 = r2.state
            r1 = 1
            if (r0 != r1) goto Le
            r0 = 2
            r2.state = r0
            okhttp3.internal.http1.Http1ExchangeCodec$ChunkedSink r0 = new okhttp3.internal.http1.Http1ExchangeCodec$ChunkedSink
            r0.<init>(r2)
            return r0
        Le:
            java.lang.String r0 = "state: "
            int r1 = r2.state
            j8.o.p(r1, r0)
            r0 = 0
            return r0
    }

    private final okio.Source newChunkedSource(okhttp3.HttpUrl r3) {
            r2 = this;
            int r0 = r2.state
            r1 = 4
            if (r0 != r1) goto Le
            r0 = 5
            r2.state = r0
            okhttp3.internal.http1.Http1ExchangeCodec$ChunkedSource r0 = new okhttp3.internal.http1.Http1ExchangeCodec$ChunkedSource
            r0.<init>(r2, r3)
            return r0
        Le:
            java.lang.String r3 = "state: "
            int r0 = r2.state
            j8.o.p(r0, r3)
            r3 = 0
            return r3
    }

    private final okio.Source newFixedLengthSource(long r3) {
            r2 = this;
            int r0 = r2.state
            r1 = 4
            if (r0 != r1) goto Le
            r0 = 5
            r2.state = r0
            okhttp3.internal.http1.Http1ExchangeCodec$FixedLengthSource r0 = new okhttp3.internal.http1.Http1ExchangeCodec$FixedLengthSource
            r0.<init>(r2, r3)
            return r0
        Le:
            java.lang.String r3 = "state: "
            int r4 = r2.state
            j8.o.p(r4, r3)
            r3 = 0
            return r3
    }

    private final okio.Sink newKnownLengthSink() {
            r2 = this;
            int r0 = r2.state
            r1 = 1
            if (r0 != r1) goto Le
            r0 = 2
            r2.state = r0
            okhttp3.internal.http1.Http1ExchangeCodec$KnownLengthSink r0 = new okhttp3.internal.http1.Http1ExchangeCodec$KnownLengthSink
            r0.<init>(r2)
            return r0
        Le:
            java.lang.String r0 = "state: "
            int r1 = r2.state
            j8.o.p(r1, r0)
            r0 = 0
            return r0
    }

    private final okio.Source newUnknownLengthSource() {
            r2 = this;
            int r0 = r2.state
            r1 = 4
            if (r0 != r1) goto L15
            r0 = 5
            r2.state = r0
            okhttp3.internal.connection.RealConnection r0 = r2.getConnection()
            r0.noNewExchanges$okhttp()
            okhttp3.internal.http1.Http1ExchangeCodec$UnknownLengthSource r0 = new okhttp3.internal.http1.Http1ExchangeCodec$UnknownLengthSource
            r0.<init>(r2)
            return r0
        L15:
            java.lang.String r0 = "state: "
            int r1 = r2.state
            j8.o.p(r1, r0)
            r0 = 0
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
            r1 = this;
            okhttp3.internal.connection.RealConnection r0 = r1.getConnection()
            r0.cancel()
            return
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okio.Sink createRequestBody(okhttp3.Request r3, long r4) {
            r2 = this;
            r3.getClass()
            okhttp3.RequestBody r0 = r3.body()
            if (r0 == 0) goto L1c
            okhttp3.RequestBody r0 = r3.body()
            boolean r0 = r0.isDuplex()
            if (r0 != 0) goto L14
            goto L1c
        L14:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r4 = "Duplex connections are not supported for HTTP/1"
            r3.<init>(r4)
            throw r3
        L1c:
            boolean r3 = r2.isChunked(r3)
            if (r3 == 0) goto L27
            okio.Sink r3 = r2.newChunkedSink()
            return r3
        L27:
            r0 = -1
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L32
            okio.Sink r3 = r2.newKnownLengthSink()
            return r3
        L32:
            java.lang.String r3 = "Cannot stream a request body without chunked encoding or a known content length!"
            j8.o.A(r3)
            r3 = 0
            return r3
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
            r1 = this;
            okio.BufferedSink r0 = r1.sink
            r0.flush()
            return
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
            r1 = this;
            okio.BufferedSink r0 = r1.sink
            r0.flush()
            return
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okhttp3.internal.connection.RealConnection getConnection() {
            r1 = this;
            okhttp3.internal.connection.RealConnection r0 = r1.connection
            return r0
    }

    public final boolean isClosed() {
            r2 = this;
            int r0 = r2.state
            r1 = 6
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okio.Source openResponseBodySource(okhttp3.Response r5) {
            r4 = this;
            r5.getClass()
            boolean r0 = okhttp3.internal.http.HttpHeaders.promisesBody(r5)
            if (r0 != 0) goto L10
            r0 = 0
            okio.Source r5 = r4.newFixedLengthSource(r0)
            return r5
        L10:
            boolean r0 = r4.isChunked(r5)
            if (r0 == 0) goto L23
            okhttp3.Request r5 = r5.request()
            okhttp3.HttpUrl r5 = r5.url()
            okio.Source r5 = r4.newChunkedSource(r5)
            return r5
        L23:
            long r0 = okhttp3.internal.Util.headersContentLength(r5)
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L32
            okio.Source r5 = r4.newFixedLengthSource(r0)
            return r5
        L32:
            okio.Source r5 = r4.newUnknownLengthSource()
            return r5
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okhttp3.Response.Builder readResponseHeaders(boolean r5) {
            r4 = this;
            int r0 = r4.state
            r1 = 1
            r2 = 3
            if (r0 == r1) goto L15
            r1 = 2
            if (r0 == r1) goto L15
            if (r0 != r2) goto Lc
            goto L15
        Lc:
            java.lang.String r5 = "state: "
            int r0 = r4.state
            j8.o.p(r0, r5)
            r5 = 0
            return r5
        L15:
            okhttp3.internal.http.StatusLine$Companion r0 = okhttp3.internal.http.StatusLine.Companion     // Catch: java.io.EOFException -> L4c
            okhttp3.internal.http1.HeadersReader r1 = r4.headersReader     // Catch: java.io.EOFException -> L4c
            java.lang.String r1 = r1.readLine()     // Catch: java.io.EOFException -> L4c
            okhttp3.internal.http.StatusLine r0 = r0.parse(r1)     // Catch: java.io.EOFException -> L4c
            okhttp3.Response$Builder r1 = new okhttp3.Response$Builder     // Catch: java.io.EOFException -> L4c
            r1.<init>()     // Catch: java.io.EOFException -> L4c
            okhttp3.Protocol r3 = r0.protocol     // Catch: java.io.EOFException -> L4c
            okhttp3.Response$Builder r1 = r1.protocol(r3)     // Catch: java.io.EOFException -> L4c
            int r3 = r0.code     // Catch: java.io.EOFException -> L4c
            okhttp3.Response$Builder r1 = r1.code(r3)     // Catch: java.io.EOFException -> L4c
            java.lang.String r3 = r0.message     // Catch: java.io.EOFException -> L4c
            okhttp3.Response$Builder r1 = r1.message(r3)     // Catch: java.io.EOFException -> L4c
            okhttp3.internal.http1.HeadersReader r3 = r4.headersReader     // Catch: java.io.EOFException -> L4c
            okhttp3.Headers r3 = r3.readHeaders()     // Catch: java.io.EOFException -> L4c
            okhttp3.Response$Builder r1 = r1.headers(r3)     // Catch: java.io.EOFException -> L4c
            r3 = 100
            if (r5 == 0) goto L4e
            int r5 = r0.code     // Catch: java.io.EOFException -> L4c
            if (r5 != r3) goto L4e
            r5 = 0
            return r5
        L4c:
            r5 = move-exception
            goto L64
        L4e:
            int r5 = r0.code     // Catch: java.io.EOFException -> L4c
            if (r5 != r3) goto L55
            r4.state = r2     // Catch: java.io.EOFException -> L4c
            return r1
        L55:
            r0 = 102(0x66, float:1.43E-43)
            if (r0 > r5) goto L60
            r0 = 200(0xc8, float:2.8E-43)
            if (r5 >= r0) goto L60
            r4.state = r2     // Catch: java.io.EOFException -> L4c
            return r1
        L60:
            r5 = 4
            r4.state = r5     // Catch: java.io.EOFException -> L4c
            return r1
        L64:
            okhttp3.internal.connection.RealConnection r0 = r4.getConnection()
            okhttp3.Route r0 = r0.route()
            okhttp3.Address r0 = r0.address()
            okhttp3.HttpUrl r0 = r0.url()
            java.lang.String r0 = r0.redact()
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "unexpected end of stream on "
            java.lang.String r0 = wb.en.g(r2, r0)
            r1.<init>(r0, r5)
            throw r1
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
            boolean r0 = r2.isChunked(r3)
            if (r0 == 0) goto L15
            r0 = -1
            return r0
        L15:
            long r0 = okhttp3.internal.Util.headersContentLength(r3)
            return r0
    }

    public final void skipConnectBody(okhttp3.Response r5) {
            r4 = this;
            r5.getClass()
            long r0 = okhttp3.internal.Util.headersContentLength(r5)
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto Le
            return
        Le:
            okio.Source r5 = r4.newFixedLengthSource(r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            okhttp3.internal.Util.skipAll(r5, r0, r1)
            r5.close()
            return
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okhttp3.Headers trailers() {
            r2 = this;
            int r0 = r2.state
            r1 = 6
            if (r0 != r1) goto Lc
            okhttp3.Headers r0 = r2.trailers
            if (r0 != 0) goto Lb
            okhttp3.Headers r0 = okhttp3.internal.Util.EMPTY_HEADERS
        Lb:
            return r0
        Lc:
            java.lang.String r0 = "too early; can't read the trailers yet"
            j8.o.A(r0)
            r0 = 0
            return r0
    }

    public final void writeRequest(okhttp3.Headers r5, java.lang.String r6) {
            r4 = this;
            r5.getClass()
            r6.getClass()
            int r0 = r4.state
            if (r0 != 0) goto L41
            okio.BufferedSink r0 = r4.sink
            okio.BufferedSink r6 = r0.writeUtf8(r6)
            java.lang.String r0 = "\r\n"
            r6.writeUtf8(r0)
            int r6 = r5.size()
            r1 = 0
        L1a:
            okio.BufferedSink r2 = r4.sink
            if (r1 >= r6) goto L3a
            java.lang.String r3 = r5.name(r1)
            okio.BufferedSink r2 = r2.writeUtf8(r3)
            java.lang.String r3 = ": "
            okio.BufferedSink r2 = r2.writeUtf8(r3)
            java.lang.String r3 = r5.value(r1)
            okio.BufferedSink r2 = r2.writeUtf8(r3)
            r2.writeUtf8(r0)
            int r1 = r1 + 1
            goto L1a
        L3a:
            r2.writeUtf8(r0)
            r5 = 1
            r4.state = r5
            return
        L41:
            java.lang.String r5 = "state: "
            int r6 = r4.state
            j8.o.p(r6, r5)
            return
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(okhttp3.Request r3) {
            r2 = this;
            r3.getClass()
            okhttp3.internal.http.RequestLine r0 = okhttp3.internal.http.RequestLine.INSTANCE
            okhttp3.internal.connection.RealConnection r1 = r2.getConnection()
            okhttp3.Route r1 = r1.route()
            java.net.Proxy r1 = r1.proxy()
            java.net.Proxy$Type r1 = r1.type()
            r1.getClass()
            java.lang.String r0 = r0.get(r3, r1)
            okhttp3.Headers r3 = r3.headers()
            r2.writeRequest(r3, r0)
            return
    }
}
