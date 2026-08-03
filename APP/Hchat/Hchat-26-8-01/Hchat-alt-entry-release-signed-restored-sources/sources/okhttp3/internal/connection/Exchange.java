package okhttp3.internal.connection;

import gg.AbstractC1416l;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.p221ws.RealWebSocket;
import okio.Buffer;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Exchange {
    private final RealCall call;
    private final ExchangeCodec codec;
    private final RealConnection connection;
    private final EventListener eventListener;
    private final ExchangeFinder finder;
    private boolean hasFailure;
    private boolean isDuplex;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class RequestBodySink extends ForwardingSink {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        final /* synthetic */ Exchange this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, Sink sink, long j3) {
            super(sink);
            sink.getClass();
            this.this$0 = exchange;
            this.contentLength = j3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final <E extends IOException> E complete(E e6) {
            if (this.completed) {
                return e6;
            }
            this.completed = true;
            return (E) this.this$0.bodyComplete(this.bytesReceived, false, true, e6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j3 = this.contentLength;
            if (j3 != -1 && this.bytesReceived != j3) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                complete(null);
            } catch (IOException e6) {
                throw complete(e6);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e6) {
                throw complete(e6);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.ForwardingSink, okio.Sink
        public void write(Buffer buffer, long j3) throws IOException {
            buffer.getClass();
            if (this.closed) {
                C2104o.m5276A("closed");
                return;
            }
            long j4 = this.contentLength;
            if (j4 == -1 || this.bytesReceived + j3 <= j4) {
                try {
                    super.write(buffer, j3);
                    this.bytesReceived += j3;
                    return;
                } catch (IOException e6) {
                    throw complete(e6);
                }
            }
            throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + j3));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class ResponseBodySource extends ForwardingSource {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        final /* synthetic */ Exchange this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, Source source, long j3) {
            super(source);
            source.getClass();
            this.this$0 = exchange;
            this.contentLength = j3;
            this.invokeStartEvent = true;
            if (j3 == 0) {
                complete(null);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                complete(null);
            } catch (IOException e6) {
                throw complete(e6);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final <E extends IOException> E complete(E e6) {
            if (this.completed) {
                return e6;
            }
            this.completed = true;
            if (e6 == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.this$0.getEventListener$okhttp().responseBodyStart(this.this$0.getCall$okhttp());
            }
            return (E) this.this$0.bodyComplete(this.bytesReceived, true, false, e6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer buffer, long j3) throws IOException {
            buffer.getClass();
            if (this.closed) {
                C2104o.m5276A("closed");
                return 0L;
            }
            try {
                long j4 = delegate().read(buffer, j3);
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.this$0.getEventListener$okhttp().responseBodyStart(this.this$0.getCall$okhttp());
                }
                if (j4 == -1) {
                    complete(null);
                    return -1L;
                }
                long j5 = this.bytesReceived + j4;
                long j10 = this.contentLength;
                if (j10 != -1 && j5 > j10) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j5);
                }
                this.bytesReceived = j5;
                if (j5 == j10) {
                    complete(null);
                }
                return j4;
            } catch (IOException e6) {
                throw complete(e6);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Exchange(RealCall realCall, EventListener eventListener, ExchangeFinder exchangeFinder, ExchangeCodec exchangeCodec) {
        realCall.getClass();
        eventListener.getClass();
        exchangeFinder.getClass();
        exchangeCodec.getClass();
        this.call = realCall;
        this.eventListener = eventListener;
        this.finder = exchangeFinder;
        this.codec = exchangeCodec;
        this.connection = exchangeCodec.getConnection();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void trackFailure(IOException iOException) {
        this.hasFailure = true;
        this.finder.trackFailure(iOException);
        this.codec.getConnection().trackFailure$okhttp(this.call, iOException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final <E extends IOException> E bodyComplete(long j3, boolean z9, boolean z10, E e6) {
        if (e6 != null) {
            trackFailure(e6);
        }
        if (z10) {
            EventListener eventListener = this.eventListener;
            if (e6 != null) {
                eventListener.requestFailed(this.call, e6);
            } else {
                eventListener.requestBodyEnd(this.call, j3);
            }
        }
        if (z9) {
            EventListener eventListener2 = this.eventListener;
            if (e6 != null) {
                eventListener2.responseFailed(this.call, e6);
            } else {
                eventListener2.responseBodyEnd(this.call, j3);
            }
        }
        return (E) this.call.messageDone$okhttp(this, z10, z9, e6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void cancel() {
        this.codec.cancel();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Sink createRequestBody(Request request, boolean z9) {
        request.getClass();
        this.isDuplex = z9;
        RequestBody requestBodyBody = request.body();
        requestBodyBody.getClass();
        long jContentLength = requestBodyBody.contentLength();
        this.eventListener.requestBodyStart(this.call);
        return new RequestBodySink(this, this.codec.createRequestBody(request, jContentLength), jContentLength);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void detachWithViolence() {
        this.codec.cancel();
        this.call.messageDone$okhttp(this, true, true, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void finishRequest() throws IOException {
        try {
            this.codec.finishRequest();
        } catch (IOException e6) {
            this.eventListener.requestFailed(this.call, e6);
            trackFailure(e6);
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void flushRequest() throws IOException {
        try {
            this.codec.flushRequest();
        } catch (IOException e6) {
            this.eventListener.requestFailed(this.call, e6);
            trackFailure(e6);
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final RealCall getCall$okhttp() {
        return this.call;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final RealConnection getConnection$okhttp() {
        return this.connection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ExchangeFinder getFinder$okhttp() {
        return this.finder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getHasFailure$okhttp() {
        return this.hasFailure;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isCoalescedConnection$okhttp() {
        return !AbstractC1416l.m3825a(this.finder.getAddress$okhttp().url().host(), this.connection.route().address().url().host());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isDuplex$okhttp() {
        return this.isDuplex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final RealWebSocket.Streams newWebSocketStreams() {
        this.call.timeoutEarlyExit();
        return this.codec.getConnection().newWebSocketStreams$okhttp(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void noNewExchangesOnConnection() {
        this.codec.getConnection().noNewExchanges$okhttp();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void noRequestBody() {
        this.call.messageDone$okhttp(this, true, false, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ResponseBody openResponseBody(Response response) throws IOException {
        response.getClass();
        try {
            String strHeader$default = Response.header$default(response, "Content-Type", null, 2, null);
            long jReportedContentLength = this.codec.reportedContentLength(response);
            return new RealResponseBody(strHeader$default, jReportedContentLength, Okio.buffer(new ResponseBodySource(this, this.codec.openResponseBodySource(response), jReportedContentLength)));
        } catch (IOException e6) {
            this.eventListener.responseFailed(this.call, e6);
            trackFailure(e6);
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Response.Builder readResponseHeaders(boolean z9) throws IOException {
        try {
            Response.Builder responseHeaders = this.codec.readResponseHeaders(z9);
            if (responseHeaders == null) {
                return responseHeaders;
            }
            responseHeaders.initExchange$okhttp(this);
            return responseHeaders;
        } catch (IOException e6) {
            this.eventListener.responseFailed(this.call, e6);
            trackFailure(e6);
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void responseHeadersEnd(Response response) {
        response.getClass();
        this.eventListener.responseHeadersEnd(this.call, response);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void responseHeadersStart() {
        this.eventListener.responseHeadersStart(this.call);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Headers trailers() {
        return this.codec.trailers();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void webSocketUpgradeFailed() {
        bodyComplete(-1L, true, true, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeRequestHeaders(Request request) throws IOException {
        request.getClass();
        try {
            this.eventListener.requestHeadersStart(this.call);
            this.codec.writeRequestHeaders(request);
            this.eventListener.requestHeadersEnd(this.call, request);
        } catch (IOException e6) {
            this.eventListener.requestFailed(this.call, e6);
            trackFailure(e6);
            throw e6;
        }
    }
}
