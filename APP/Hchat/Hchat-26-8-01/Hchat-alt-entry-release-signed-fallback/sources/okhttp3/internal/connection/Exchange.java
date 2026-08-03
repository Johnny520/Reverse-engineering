package okhttp3.internal.connection;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Exchange {
    private final okhttp3.internal.connection.RealCall call;
    private final okhttp3.internal.http.ExchangeCodec codec;
    private final okhttp3.internal.connection.RealConnection connection;
    private final okhttp3.EventListener eventListener;
    private final okhttp3.internal.connection.ExchangeFinder finder;
    private boolean hasFailure;
    private boolean isDuplex;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class RequestBodySink extends okio.ForwardingSink {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        final /* synthetic */ okhttp3.internal.connection.Exchange this$0;

        public RequestBodySink(okhttp3.internal.connection.Exchange r1, okio.Sink r2, long r3) {
                r0 = this;
                r2.getClass()
                r0.this$0 = r1
                r0.<init>(r2)
                r0.contentLength = r3
                return
        }

        private final <E extends java.io.IOException> E complete(E r8) {
                r7 = this;
                boolean r0 = r7.completed
                if (r0 == 0) goto L5
                return r8
            L5:
                r0 = 1
                r7.completed = r0
                okhttp3.internal.connection.Exchange r1 = r7.this$0
                long r2 = r7.bytesReceived
                r4 = 0
                r5 = 1
                r6 = r8
                java.io.IOException r8 = r1.bodyComplete(r2, r4, r5, r6)
                return r8
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r4 = this;
                boolean r0 = r4.closed
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r4.closed = r0
                long r0 = r4.contentLength
                r2 = -1
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 == 0) goto L1f
                long r2 = r4.bytesReceived
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 != 0) goto L17
                goto L1f
            L17:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r1 = "unexpected end of stream"
                r0.<init>(r1)
                throw r0
            L1f:
                super.close()     // Catch: java.io.IOException -> L27
                r0 = 0
                r4.complete(r0)     // Catch: java.io.IOException -> L27
                return
            L27:
                r0 = move-exception
                java.io.IOException r0 = r4.complete(r0)
                throw r0
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
        public void flush() {
                r1 = this;
                super.flush()     // Catch: java.io.IOException -> L4
                return
            L4:
                r0 = move-exception
                java.io.IOException r0 = r1.complete(r0)
                throw r0
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(okio.Buffer r5, long r6) {
                r4 = this;
                r5.getClass()
                boolean r0 = r4.closed
                if (r0 != 0) goto L47
                long r0 = r4.contentLength
                r2 = -1
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 == 0) goto L38
                long r2 = r4.bytesReceived
                long r2 = r2 + r6
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 > 0) goto L17
                goto L38
            L17:
                java.net.ProtocolException r5 = new java.net.ProtocolException
                long r0 = r4.contentLength
                long r2 = r4.bytesReceived
                long r2 = r2 + r6
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r7 = "expected "
                r6.<init>(r7)
                r6.append(r0)
                java.lang.String r7 = " bytes but received "
                r6.append(r7)
                r6.append(r2)
                java.lang.String r6 = r6.toString()
                r5.<init>(r6)
                throw r5
            L38:
                super.write(r5, r6)     // Catch: java.io.IOException -> L41
                long r0 = r4.bytesReceived     // Catch: java.io.IOException -> L41
                long r0 = r0 + r6
                r4.bytesReceived = r0     // Catch: java.io.IOException -> L41
                return
            L41:
                r5 = move-exception
                java.io.IOException r5 = r4.complete(r5)
                throw r5
            L47:
                java.lang.String r5 = "closed"
                j8.o.A(r5)
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class ResponseBodySource extends okio.ForwardingSource {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        final /* synthetic */ okhttp3.internal.connection.Exchange this$0;

        public ResponseBodySource(okhttp3.internal.connection.Exchange r1, okio.Source r2, long r3) {
                r0 = this;
                r2.getClass()
                r0.this$0 = r1
                r0.<init>(r2)
                r0.contentLength = r3
                r1 = 1
                r0.invokeStartEvent = r1
                r1 = 0
                int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r1 != 0) goto L17
                r1 = 0
                r0.complete(r1)
            L17:
                return
        }

        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                boolean r0 = r1.closed
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.closed = r0
                super.close()     // Catch: java.io.IOException -> L10
                r0 = 0
                r1.complete(r0)     // Catch: java.io.IOException -> L10
                return
            L10:
                r0 = move-exception
                java.io.IOException r0 = r1.complete(r0)
                throw r0
        }

        public final <E extends java.io.IOException> E complete(E r9) {
                r8 = this;
                boolean r0 = r8.completed
                if (r0 == 0) goto L5
                return r9
            L5:
                r0 = 1
                r8.completed = r0
                if (r9 != 0) goto L20
                boolean r0 = r8.invokeStartEvent
                if (r0 == 0) goto L20
                r0 = 0
                r8.invokeStartEvent = r0
                okhttp3.internal.connection.Exchange r0 = r8.this$0
                okhttp3.EventListener r0 = r0.getEventListener$okhttp()
                okhttp3.internal.connection.Exchange r1 = r8.this$0
                okhttp3.internal.connection.RealCall r1 = r1.getCall$okhttp()
                r0.responseBodyStart(r1)
            L20:
                okhttp3.internal.connection.Exchange r2 = r8.this$0
                long r3 = r8.bytesReceived
                r5 = 1
                r6 = 0
                r7 = r9
                java.io.IOException r9 = r2.bodyComplete(r3, r5, r6, r7)
                return r9
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(okio.Buffer r9, long r10) {
                r8 = this;
                java.lang.String r0 = "expected "
                r9.getClass()
                boolean r1 = r8.closed
                if (r1 != 0) goto L6e
                okio.Source r1 = r8.delegate()     // Catch: java.io.IOException -> L28
                long r9 = r1.read(r9, r10)     // Catch: java.io.IOException -> L28
                boolean r11 = r8.invokeStartEvent     // Catch: java.io.IOException -> L28
                if (r11 == 0) goto L2a
                r11 = 0
                r8.invokeStartEvent = r11     // Catch: java.io.IOException -> L28
                okhttp3.internal.connection.Exchange r11 = r8.this$0     // Catch: java.io.IOException -> L28
                okhttp3.EventListener r11 = r11.getEventListener$okhttp()     // Catch: java.io.IOException -> L28
                okhttp3.internal.connection.Exchange r1 = r8.this$0     // Catch: java.io.IOException -> L28
                okhttp3.internal.connection.RealCall r1 = r1.getCall$okhttp()     // Catch: java.io.IOException -> L28
                r11.responseBodyStart(r1)     // Catch: java.io.IOException -> L28
                goto L2a
            L28:
                r9 = move-exception
                goto L69
            L2a:
                r1 = -1
                int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
                r3 = 0
                if (r11 != 0) goto L35
                r8.complete(r3)     // Catch: java.io.IOException -> L28
                return r1
            L35:
                long r4 = r8.bytesReceived     // Catch: java.io.IOException -> L28
                long r4 = r4 + r9
                long r6 = r8.contentLength     // Catch: java.io.IOException -> L28
                int r11 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r11 == 0) goto L5f
                int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r11 > 0) goto L43
                goto L5f
            L43:
                java.net.ProtocolException r9 = new java.net.ProtocolException     // Catch: java.io.IOException -> L28
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L28
                r10.<init>(r0)     // Catch: java.io.IOException -> L28
                long r0 = r8.contentLength     // Catch: java.io.IOException -> L28
                r10.append(r0)     // Catch: java.io.IOException -> L28
                java.lang.String r11 = " bytes but received "
                r10.append(r11)     // Catch: java.io.IOException -> L28
                r10.append(r4)     // Catch: java.io.IOException -> L28
                java.lang.String r10 = r10.toString()     // Catch: java.io.IOException -> L28
                r9.<init>(r10)     // Catch: java.io.IOException -> L28
                throw r9     // Catch: java.io.IOException -> L28
            L5f:
                r8.bytesReceived = r4     // Catch: java.io.IOException -> L28
                int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r11 != 0) goto L68
                r8.complete(r3)     // Catch: java.io.IOException -> L28
            L68:
                return r9
            L69:
                java.io.IOException r9 = r8.complete(r9)
                throw r9
            L6e:
                java.lang.String r9 = "closed"
                j8.o.A(r9)
                r9 = 0
                return r9
        }
    }

    public Exchange(okhttp3.internal.connection.RealCall r1, okhttp3.EventListener r2, okhttp3.internal.connection.ExchangeFinder r3, okhttp3.internal.http.ExchangeCodec r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.call = r1
            r0.eventListener = r2
            r0.finder = r3
            r0.codec = r4
            okhttp3.internal.connection.RealConnection r1 = r4.getConnection()
            r0.connection = r1
            return
    }

    private final void trackFailure(java.io.IOException r3) {
            r2 = this;
            r0 = 1
            r2.hasFailure = r0
            okhttp3.internal.connection.ExchangeFinder r0 = r2.finder
            r0.trackFailure(r3)
            okhttp3.internal.http.ExchangeCodec r0 = r2.codec
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            okhttp3.internal.connection.RealCall r1 = r2.call
            r0.trackFailure$okhttp(r1, r3)
            return
    }

    public final <E extends java.io.IOException> E bodyComplete(long r3, boolean r5, boolean r6, E r7) {
            r2 = this;
            if (r7 == 0) goto L5
            r2.trackFailure(r7)
        L5:
            if (r6 == 0) goto L16
            okhttp3.EventListener r0 = r2.eventListener
            if (r7 == 0) goto L11
            okhttp3.internal.connection.RealCall r1 = r2.call
            r0.requestFailed(r1, r7)
            goto L16
        L11:
            okhttp3.internal.connection.RealCall r1 = r2.call
            r0.requestBodyEnd(r1, r3)
        L16:
            if (r5 == 0) goto L27
            okhttp3.EventListener r0 = r2.eventListener
            if (r7 == 0) goto L22
            okhttp3.internal.connection.RealCall r3 = r2.call
            r0.responseFailed(r3, r7)
            goto L27
        L22:
            okhttp3.internal.connection.RealCall r1 = r2.call
            r0.responseBodyEnd(r1, r3)
        L27:
            okhttp3.internal.connection.RealCall r3 = r2.call
            java.io.IOException r3 = r3.messageDone$okhttp(r2, r6, r5, r7)
            return r3
    }

    public final void cancel() {
            r1 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r1.codec
            r0.cancel()
            return
    }

    public final okio.Sink createRequestBody(okhttp3.Request r4, boolean r5) {
            r3 = this;
            r4.getClass()
            r3.isDuplex = r5
            okhttp3.RequestBody r5 = r4.body()
            r5.getClass()
            long r0 = r5.contentLength()
            okhttp3.EventListener r5 = r3.eventListener
            okhttp3.internal.connection.RealCall r2 = r3.call
            r5.requestBodyStart(r2)
            okhttp3.internal.http.ExchangeCodec r5 = r3.codec
            okio.Sink r4 = r5.createRequestBody(r4, r0)
            okhttp3.internal.connection.Exchange$RequestBodySink r5 = new okhttp3.internal.connection.Exchange$RequestBodySink
            r5.<init>(r3, r4, r0)
            return r5
    }

    public final void detachWithViolence() {
            r3 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r3.codec
            r0.cancel()
            okhttp3.internal.connection.RealCall r0 = r3.call
            r1 = 1
            r2 = 0
            r0.messageDone$okhttp(r3, r1, r1, r2)
            return
    }

    public final void finishRequest() {
            r3 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r3.codec     // Catch: java.io.IOException -> L6
            r0.finishRequest()     // Catch: java.io.IOException -> L6
            return
        L6:
            r0 = move-exception
            okhttp3.EventListener r1 = r3.eventListener
            okhttp3.internal.connection.RealCall r2 = r3.call
            r1.requestFailed(r2, r0)
            r3.trackFailure(r0)
            throw r0
    }

    public final void flushRequest() {
            r3 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r3.codec     // Catch: java.io.IOException -> L6
            r0.flushRequest()     // Catch: java.io.IOException -> L6
            return
        L6:
            r0 = move-exception
            okhttp3.EventListener r1 = r3.eventListener
            okhttp3.internal.connection.RealCall r2 = r3.call
            r1.requestFailed(r2, r0)
            r3.trackFailure(r0)
            throw r0
    }

    public final okhttp3.internal.connection.RealCall getCall$okhttp() {
            r1 = this;
            okhttp3.internal.connection.RealCall r0 = r1.call
            return r0
    }

    public final okhttp3.internal.connection.RealConnection getConnection$okhttp() {
            r1 = this;
            okhttp3.internal.connection.RealConnection r0 = r1.connection
            return r0
    }

    public final okhttp3.EventListener getEventListener$okhttp() {
            r1 = this;
            okhttp3.EventListener r0 = r1.eventListener
            return r0
    }

    public final okhttp3.internal.connection.ExchangeFinder getFinder$okhttp() {
            r1 = this;
            okhttp3.internal.connection.ExchangeFinder r0 = r1.finder
            return r0
    }

    public final boolean getHasFailure$okhttp() {
            r1 = this;
            boolean r0 = r1.hasFailure
            return r0
    }

    public final boolean isCoalescedConnection$okhttp() {
            r2 = this;
            okhttp3.internal.connection.ExchangeFinder r0 = r2.finder
            okhttp3.Address r0 = r0.getAddress$okhttp()
            okhttp3.HttpUrl r0 = r0.url()
            java.lang.String r0 = r0.host()
            okhttp3.internal.connection.RealConnection r1 = r2.connection
            okhttp3.Route r1 = r1.route()
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.String r1 = r1.host()
            boolean r0 = gg.l.a(r0, r1)
            r0 = r0 ^ 1
            return r0
    }

    public final boolean isDuplex$okhttp() {
            r1 = this;
            boolean r0 = r1.isDuplex
            return r0
    }

    public final okhttp3.internal.ws.RealWebSocket.Streams newWebSocketStreams() {
            r1 = this;
            okhttp3.internal.connection.RealCall r0 = r1.call
            r0.timeoutEarlyExit()
            okhttp3.internal.http.ExchangeCodec r0 = r1.codec
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r0.newWebSocketStreams$okhttp(r1)
            return r0
    }

    public final void noNewExchangesOnConnection() {
            r1 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r1.codec
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            r0.noNewExchanges$okhttp()
            return
    }

    public final void noRequestBody() {
            r4 = this;
            okhttp3.internal.connection.RealCall r0 = r4.call
            r1 = 0
            r2 = 0
            r3 = 1
            r0.messageDone$okhttp(r4, r3, r1, r2)
            return
    }

    public final okhttp3.ResponseBody openResponseBody(okhttp3.Response r5) {
            r4 = this;
            r5.getClass()
            java.lang.String r0 = "Content-Type"
            r1 = 2
            r2 = 0
            java.lang.String r0 = okhttp3.Response.header$default(r5, r0, r2, r1, r2)     // Catch: java.io.IOException -> L26
            okhttp3.internal.http.ExchangeCodec r1 = r4.codec     // Catch: java.io.IOException -> L26
            long r1 = r1.reportedContentLength(r5)     // Catch: java.io.IOException -> L26
            okhttp3.internal.http.ExchangeCodec r3 = r4.codec     // Catch: java.io.IOException -> L26
            okio.Source r5 = r3.openResponseBodySource(r5)     // Catch: java.io.IOException -> L26
            okhttp3.internal.connection.Exchange$ResponseBodySource r3 = new okhttp3.internal.connection.Exchange$ResponseBodySource     // Catch: java.io.IOException -> L26
            r3.<init>(r4, r5, r1)     // Catch: java.io.IOException -> L26
            okhttp3.internal.http.RealResponseBody r5 = new okhttp3.internal.http.RealResponseBody     // Catch: java.io.IOException -> L26
            okio.BufferedSource r3 = okio.Okio.buffer(r3)     // Catch: java.io.IOException -> L26
            r5.<init>(r0, r1, r3)     // Catch: java.io.IOException -> L26
            return r5
        L26:
            r5 = move-exception
            okhttp3.EventListener r0 = r4.eventListener
            okhttp3.internal.connection.RealCall r1 = r4.call
            r0.responseFailed(r1, r5)
            r4.trackFailure(r5)
            throw r5
    }

    public final okhttp3.Response.Builder readResponseHeaders(boolean r3) {
            r2 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r2.codec     // Catch: java.io.IOException -> Lc
            okhttp3.Response$Builder r3 = r0.readResponseHeaders(r3)     // Catch: java.io.IOException -> Lc
            if (r3 == 0) goto Le
            r3.initExchange$okhttp(r2)     // Catch: java.io.IOException -> Lc
            return r3
        Lc:
            r3 = move-exception
            goto Lf
        Le:
            return r3
        Lf:
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.internal.connection.RealCall r1 = r2.call
            r0.responseFailed(r1, r3)
            r2.trackFailure(r3)
            throw r3
    }

    public final void responseHeadersEnd(okhttp3.Response r3) {
            r2 = this;
            r3.getClass()
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.internal.connection.RealCall r1 = r2.call
            r0.responseHeadersEnd(r1, r3)
            return
    }

    public final void responseHeadersStart() {
            r2 = this;
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.internal.connection.RealCall r1 = r2.call
            r0.responseHeadersStart(r1)
            return
    }

    public final okhttp3.Headers trailers() {
            r1 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r1.codec
            okhttp3.Headers r0 = r0.trailers()
            return r0
    }

    public final void webSocketUpgradeFailed() {
            r6 = this;
            r4 = 1
            r5 = 0
            r1 = -1
            r3 = 1
            r0 = r6
            r0.bodyComplete(r1, r3, r4, r5)
            return
    }

    public final void writeRequestHeaders(okhttp3.Request r3) {
            r2 = this;
            r3.getClass()
            okhttp3.EventListener r0 = r2.eventListener     // Catch: java.io.IOException -> L17
            okhttp3.internal.connection.RealCall r1 = r2.call     // Catch: java.io.IOException -> L17
            r0.requestHeadersStart(r1)     // Catch: java.io.IOException -> L17
            okhttp3.internal.http.ExchangeCodec r0 = r2.codec     // Catch: java.io.IOException -> L17
            r0.writeRequestHeaders(r3)     // Catch: java.io.IOException -> L17
            okhttp3.EventListener r0 = r2.eventListener     // Catch: java.io.IOException -> L17
            okhttp3.internal.connection.RealCall r1 = r2.call     // Catch: java.io.IOException -> L17
            r0.requestHeadersEnd(r1, r3)     // Catch: java.io.IOException -> L17
            return
        L17:
            r3 = move-exception
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.internal.connection.RealCall r1 = r2.call
            r0.requestFailed(r1, r3)
            r2.trackFailure(r3)
            throw r3
    }
}
