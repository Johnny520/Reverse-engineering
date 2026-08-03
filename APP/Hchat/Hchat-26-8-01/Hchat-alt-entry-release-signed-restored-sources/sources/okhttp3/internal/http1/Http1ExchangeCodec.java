package okhttp3.internal.http1;

import gg.AbstractC1411g;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p025bc.AbstractC0255e;
import p136j8.C2104o;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Companion Companion = new Companion(null);
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final OkHttpClient client;
    private final RealConnection connection;
    private final HeadersReader headersReader;
    private final BufferedSink sink;
    private final BufferedSource source;
    private int state;
    private Headers trailers;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public abstract class AbstractSource implements Source {
        private boolean closed;
        private final ForwardingTimeout timeout;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AbstractSource() {
            this.timeout = new ForwardingTimeout(Http1ExchangeCodec.this.source.timeout());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean getClosed() {
            return this.closed;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ForwardingTimeout getTimeout() {
            return this.timeout;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Source
        public long read(Buffer buffer, long j3) throws IOException {
            buffer.getClass();
            try {
                return Http1ExchangeCodec.this.source.read(buffer, j3);
            } catch (IOException e6) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
                throw e6;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void responseBodyComplete() {
            if (Http1ExchangeCodec.this.state == 6) {
                return;
            }
            int i9 = Http1ExchangeCodec.this.state;
            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
            if (i9 == 5) {
                http1ExchangeCodec.detachTimeout(this.timeout);
                Http1ExchangeCodec.this.state = 6;
            } else {
                throw new IllegalStateException("state: " + http1ExchangeCodec.state);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setClosed(boolean z9) {
            this.closed = z9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Source
        public Timeout timeout() {
            return this.timeout;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class ChunkedSink implements Sink {
        private boolean closed;
        private final ForwardingTimeout timeout;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ChunkedSink() {
            this.timeout = new ForwardingTimeout(Http1ExchangeCodec.this.sink.timeout());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.sink.writeUtf8("0\r\n\r\n");
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Sink, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Sink
        public Timeout timeout() {
            return this.timeout;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Sink
        public void write(Buffer buffer, long j3) {
            buffer.getClass();
            if (this.closed) {
                C2104o.m5276A("closed");
            } else {
                if (j3 == 0) {
                    return;
                }
                Http1ExchangeCodec.this.sink.writeHexadecimalUnsignedLong(j3);
                Http1ExchangeCodec.this.sink.writeUtf8("\r\n");
                Http1ExchangeCodec.this.sink.write(buffer, j3);
                Http1ExchangeCodec.this.sink.writeUtf8("\r\n");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final HttpUrl url;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super();
            httpUrl.getClass();
            this.this$0 = http1ExchangeCodec;
            this.url = httpUrl;
            this.bytesRemainingInChunk = Http1ExchangeCodec.NO_CHUNK_YET;
            this.hasMoreChunks = true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void readChunkSize() throws ProtocolException {
            if (this.bytesRemainingInChunk != Http1ExchangeCodec.NO_CHUNK_YET) {
                this.this$0.source.readUtf8LineStrict();
            }
            try {
                this.bytesRemainingInChunk = this.this$0.source.readHexadecimalUnsignedLong();
                String string = AbstractC3149m.m6703R0(this.this$0.source.readUtf8LineStrict()).toString();
                if (this.bytesRemainingInChunk < 0 || (string.length() > 0 && !AbstractC3156t.m6740d0(string, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + string + '\"');
                }
                if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    Http1ExchangeCodec http1ExchangeCodec = this.this$0;
                    http1ExchangeCodec.trailers = http1ExchangeCodec.headersReader.readHeaders();
                    OkHttpClient okHttpClient = this.this$0.client;
                    okHttpClient.getClass();
                    CookieJar cookieJar = okHttpClient.cookieJar();
                    HttpUrl httpUrl = this.url;
                    Headers headers = this.this$0.trailers;
                    headers.getClass();
                    HttpHeaders.receiveHeaders(cookieJar, httpUrl, headers);
                    responseBodyComplete();
                }
            } catch (NumberFormatException e6) {
                throw new ProtocolException(e6.getMessage());
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(Buffer buffer, long j3) throws IOException {
            buffer.getClass();
            if (j3 < 0) {
                C2104o.m5291q(AbstractC0255e.m1018g(j3, "byteCount < 0: "));
                return 0L;
            }
            if (getClosed()) {
                C2104o.m5276A("closed");
                return 0L;
            }
            if (!this.hasMoreChunks) {
                return Http1ExchangeCodec.NO_CHUNK_YET;
            }
            long j4 = this.bytesRemainingInChunk;
            if (j4 == 0 || j4 == Http1ExchangeCodec.NO_CHUNK_YET) {
                readChunkSize();
                if (!this.hasMoreChunks) {
                    return Http1ExchangeCodec.NO_CHUNK_YET;
                }
            }
            long j5 = super.read(buffer, Math.min(j3, this.bytesRemainingInChunk));
            if (j5 != Http1ExchangeCodec.NO_CHUNK_YET) {
                this.bytesRemainingInChunk -= j5;
                return j5;
            }
            this.this$0.getConnection().noNewExchanges$okhttp();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            responseBodyComplete();
            throw protocolException;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public FixedLengthSource(long j3) {
            super();
            this.bytesRemaining = j3;
            if (j3 == 0) {
                responseBodyComplete();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(Buffer buffer, long j3) throws IOException {
            buffer.getClass();
            if (j3 < 0) {
                C2104o.m5291q(AbstractC0255e.m1018g(j3, "byteCount < 0: "));
                return 0L;
            }
            if (getClosed()) {
                C2104o.m5276A("closed");
                return 0L;
            }
            long j4 = this.bytesRemaining;
            if (j4 == 0) {
                return Http1ExchangeCodec.NO_CHUNK_YET;
            }
            long j5 = super.read(buffer, Math.min(j4, j3));
            if (j5 == Http1ExchangeCodec.NO_CHUNK_YET) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete();
                throw protocolException;
            }
            long j10 = this.bytesRemaining - j5;
            this.bytesRemaining = j10;
            if (j10 == 0) {
                responseBodyComplete();
            }
            return j5;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class KnownLengthSink implements Sink {
        private boolean closed;
        private final ForwardingTimeout timeout;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public KnownLengthSink() {
            this.timeout = new ForwardingTimeout(Http1ExchangeCodec.this.sink.timeout());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Sink
        public Timeout timeout() {
            return this.timeout;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Sink
        public void write(Buffer buffer, long j3) {
            buffer.getClass();
            if (this.closed) {
                C2104o.m5276A("closed");
            } else {
                Util.checkOffsetAndCount(buffer.size(), 0L, j3);
                Http1ExchangeCodec.this.sink.write(buffer, j3);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public UnknownLengthSource() {
            super();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete();
            }
            setClosed(true);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(Buffer buffer, long j3) throws IOException {
            buffer.getClass();
            if (j3 < 0) {
                C2104o.m5291q(AbstractC0255e.m1018g(j3, "byteCount < 0: "));
                return 0L;
            }
            if (getClosed()) {
                C2104o.m5276A("closed");
                return 0L;
            }
            if (this.inputExhausted) {
                return Http1ExchangeCodec.NO_CHUNK_YET;
            }
            long j4 = super.read(buffer, j3);
            if (j4 != Http1ExchangeCodec.NO_CHUNK_YET) {
                return j4;
            }
            this.inputExhausted = true;
            responseBodyComplete();
            return Http1ExchangeCodec.NO_CHUNK_YET;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, BufferedSource bufferedSource, BufferedSink bufferedSink) {
        realConnection.getClass();
        bufferedSource.getClass();
        bufferedSink.getClass();
        this.client = okHttpClient;
        this.connection = realConnection;
        this.source = bufferedSource;
        this.sink = bufferedSink;
        this.headersReader = new HeadersReader(bufferedSource);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final void detachTimeout(ForwardingTimeout forwardingTimeout) {
        Timeout timeoutDelegate = forwardingTimeout.delegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        timeoutDelegate.clearDeadline();
        timeoutDelegate.clearTimeout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean isChunked(Response response) {
        return "chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Sink newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        C2104o.m5290p(this.state, "state: ");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Source newChunkedSource(HttpUrl httpUrl) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(this, httpUrl);
        }
        C2104o.m5290p(this.state, "state: ");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Source newFixedLengthSource(long j3) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(j3);
        }
        C2104o.m5290p(this.state, "state: ");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Sink newKnownLengthSink() {
        if (this.state == 1) {
            this.state = 2;
            return new KnownLengthSink();
        }
        C2104o.m5290p(this.state, "state: ");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Source newUnknownLengthSource() {
        if (this.state != 4) {
            C2104o.m5290p(this.state, "state: ");
            return null;
        }
        this.state = 5;
        getConnection().noNewExchanges$okhttp();
        return new UnknownLengthSource();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getConnection().cancel();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.http.ExchangeCodec
    public Sink createRequestBody(Request request, long j3) throws ProtocolException {
        request.getClass();
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (isChunked(request)) {
            return newChunkedSink();
        }
        if (j3 != NO_CHUNK_YET) {
            return newKnownLengthSink();
        }
        C2104o.m5276A("Cannot stream a request body without chunked encoding or a known content length!");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        this.sink.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        this.sink.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection getConnection() {
        return this.connection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isClosed() {
        return this.state == 6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.http.ExchangeCodec
    public Source openResponseBodySource(Response response) {
        response.getClass();
        if (!HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(0L);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long jHeadersContentLength = Util.headersContentLength(response);
        return jHeadersContentLength != NO_CHUNK_YET ? newFixedLengthSource(jHeadersContentLength) : newUnknownLengthSource();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean z9) {
        int i9 = this.state;
        if (i9 != 1 && i9 != 2 && i9 != 3) {
            C2104o.m5290p(this.state, "state: ");
            return null;
        }
        try {
            StatusLine statusLine = StatusLine.Companion.parse(this.headersReader.readLine());
            Response.Builder builderHeaders = new Response.Builder().protocol(statusLine.protocol).code(statusLine.code).message(statusLine.message).headers(this.headersReader.readHeaders());
            if (z9 && statusLine.code == 100) {
                return null;
            }
            int i10 = statusLine.code;
            if (i10 == 100) {
                this.state = 3;
                return builderHeaders;
            }
            if (102 > i10 || i10 >= 200) {
                this.state = 4;
                return builderHeaders;
            }
            this.state = 3;
            return builderHeaders;
        } catch (EOFException e6) {
            throw new IOException(AbstractC4855en.m9263g("unexpected end of stream on ", getConnection().route().address().url().redact()), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        response.getClass();
        if (HttpHeaders.promisesBody(response)) {
            return isChunked(response) ? NO_CHUNK_YET : Util.headersContentLength(response);
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void skipConnectBody(Response response) {
        response.getClass();
        long jHeadersContentLength = Util.headersContentLength(response);
        if (jHeadersContentLength == NO_CHUNK_YET) {
            return;
        }
        Source sourceNewFixedLengthSource = newFixedLengthSource(jHeadersContentLength);
        Util.skipAll(sourceNewFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        sourceNewFixedLengthSource.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
        if (this.state == 6) {
            Headers headers = this.trailers;
            return headers == null ? Util.EMPTY_HEADERS : headers;
        }
        C2104o.m5276A("too early; can't read the trailers yet");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeRequest(Headers headers, String str) {
        headers.getClass();
        str.getClass();
        if (this.state != 0) {
            C2104o.m5290p(this.state, "state: ");
            return;
        }
        this.sink.writeUtf8(str).writeUtf8("\r\n");
        int size = headers.size();
        int i9 = 0;
        while (true) {
            BufferedSink bufferedSink = this.sink;
            if (i9 >= size) {
                bufferedSink.writeUtf8("\r\n");
                this.state = 1;
                return;
            } else {
                bufferedSink.writeUtf8(headers.name(i9)).writeUtf8(": ").writeUtf8(headers.value(i9)).writeUtf8("\r\n");
                i9++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) {
        request.getClass();
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getConnection().route().proxy().type();
        type.getClass();
        writeRequest(request.headers(), requestLine.get(request, type));
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.http1.Http1ExchangeCodec.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        private Companion() {
        }
    }

    private final boolean isChunked(Request request) {
        return "chunked".equalsIgnoreCase(request.header("Transfer-Encoding"));
    }
}
