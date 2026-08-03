package okhttp3.internal.http2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Http2Stream {
    public static final okhttp3.internal.http2.Http2Stream.Companion Companion = null;
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final okhttp3.internal.http2.Http2Connection connection;
    private okhttp3.internal.http2.ErrorCode errorCode;
    private java.io.IOException errorException;
    private boolean hasResponseHeaders;
    private final java.util.ArrayDeque<okhttp3.Headers> headersQueue;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f9857id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final okhttp3.internal.http2.Http2Stream.StreamTimeout readTimeout;
    private final okhttp3.internal.http2.Http2Stream.FramingSink sink;
    private final okhttp3.internal.http2.Http2Stream.FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final okhttp3.internal.http2.Http2Stream.StreamTimeout writeTimeout;

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
    public final class FramingSink implements okio.Sink {
        private boolean closed;
        private boolean finished;
        private final okio.Buffer sendBuffer;
        final /* synthetic */ okhttp3.internal.http2.Http2Stream this$0;
        private okhttp3.Headers trailers;

        public FramingSink(okhttp3.internal.http2.Http2Stream r1, boolean r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.finished = r2
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
                r0.sendBuffer = r1
                return
        }

        public /* synthetic */ FramingSink(okhttp3.internal.http2.Http2Stream r1, boolean r2, int r3, gg.g r4) {
                r0 = this;
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                r0.<init>(r1, r2)
                return
        }

        private final void emitFrame(boolean r13) {
                r12 = this;
                okhttp3.internal.http2.Http2Stream r1 = r12.this$0
                monitor-enter(r1)
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.getWriteTimeout$okhttp()     // Catch: java.lang.Throwable -> L5f
                r0.enter()     // Catch: java.lang.Throwable -> L5f
            La:
                long r2 = r1.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L28
                long r4 = r1.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L28
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 < 0) goto L2b
                boolean r0 = r12.finished     // Catch: java.lang.Throwable -> L28
                if (r0 != 0) goto L2b
                boolean r0 = r12.closed     // Catch: java.lang.Throwable -> L28
                if (r0 != 0) goto L2b
                okhttp3.internal.http2.ErrorCode r0 = r1.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L28
                if (r0 != 0) goto L2b
                r1.waitForIo$okhttp()     // Catch: java.lang.Throwable -> L28
                goto La
            L28:
                r0 = move-exception
                r13 = r0
                goto L95
            L2b:
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.getWriteTimeout$okhttp()     // Catch: java.lang.Throwable -> L5f
                r0.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L5f
                r1.checkOutNotClosed$okhttp()     // Catch: java.lang.Throwable -> L5f
                long r2 = r1.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L5f
                long r4 = r1.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L5f
                long r2 = r2 - r4
                okio.Buffer r0 = r12.sendBuffer     // Catch: java.lang.Throwable -> L5f
                long r4 = r0.size()     // Catch: java.lang.Throwable -> L5f
                long r10 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L5f
                long r2 = r1.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L5f
                long r2 = r2 + r10
                r1.setWriteBytesTotal$okhttp(r2)     // Catch: java.lang.Throwable -> L5f
                if (r13 == 0) goto L62
                okio.Buffer r13 = r12.sendBuffer     // Catch: java.lang.Throwable -> L5f
                long r2 = r13.size()     // Catch: java.lang.Throwable -> L5f
                int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r13 != 0) goto L62
                r13 = 1
            L5d:
                r8 = r13
                goto L64
            L5f:
                r0 = move-exception
                r13 = r0
                goto L9d
            L62:
                r13 = 0
                goto L5d
            L64:
                monitor-exit(r1)
                okhttp3.internal.http2.Http2Stream r13 = r12.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r13 = r13.getWriteTimeout$okhttp()
                r13.enter()
                okhttp3.internal.http2.Http2Stream r13 = r12.this$0     // Catch: java.lang.Throwable -> L89
                okhttp3.internal.http2.Http2Connection r6 = r13.getConnection()     // Catch: java.lang.Throwable -> L89
                okhttp3.internal.http2.Http2Stream r13 = r12.this$0     // Catch: java.lang.Throwable -> L89
                int r7 = r13.getId()     // Catch: java.lang.Throwable -> L89
                okio.Buffer r9 = r12.sendBuffer     // Catch: java.lang.Throwable -> L89
                r6.writeData(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L89
                okhttp3.internal.http2.Http2Stream r13 = r12.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r13 = r13.getWriteTimeout$okhttp()
                r13.exitAndThrowIfTimedOut()
                return
            L89:
                r0 = move-exception
                r13 = r0
                okhttp3.internal.http2.Http2Stream r0 = r12.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r0.getWriteTimeout$okhttp()
                r0.exitAndThrowIfTimedOut()
                throw r13
            L95:
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.getWriteTimeout$okhttp()     // Catch: java.lang.Throwable -> L5f
                r0.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L5f
                throw r13     // Catch: java.lang.Throwable -> L5f
            L9d:
                monitor-exit(r1)
                throw r13
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r10 = this;
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                boolean r1 = okhttp3.internal.Util.assertionsEnabled
                if (r1 == 0) goto L1b
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto Ld
                goto L1b
            Ld:
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = " MUST NOT hold lock on "
                j8.o.i(r1, r2, r0)
                return
            L1b:
                okhttp3.internal.http2.Http2Stream r1 = r10.this$0
                monitor-enter(r1)
                boolean r0 = r10.closed     // Catch: java.lang.Throwable -> Lb1
                if (r0 == 0) goto L24
                monitor-exit(r1)
                return
            L24:
                okhttp3.internal.http2.ErrorCode r0 = r1.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> Lb1
                r2 = 0
                r3 = 1
                if (r0 != 0) goto L2e
                r0 = r3
                goto L2f
            L2e:
                r0 = r2
            L2f:
                monitor-exit(r1)
                okhttp3.internal.http2.Http2Stream r1 = r10.this$0
                okhttp3.internal.http2.Http2Stream$FramingSink r1 = r1.getSink$okhttp()
                boolean r1 = r1.finished
                if (r1 != 0) goto L99
                okio.Buffer r1 = r10.sendBuffer
                long r4 = r1.size()
                r6 = 0
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r1 <= 0) goto L48
                r1 = r3
                goto L49
            L48:
                r1 = r2
            L49:
                okhttp3.Headers r4 = r10.trailers
                if (r4 == 0) goto L74
            L4d:
                okio.Buffer r1 = r10.sendBuffer
                long r4 = r1.size()
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r1 <= 0) goto L5b
                r10.emitFrame(r2)
                goto L4d
            L5b:
                okhttp3.internal.http2.Http2Stream r1 = r10.this$0
                okhttp3.internal.http2.Http2Connection r1 = r1.getConnection()
                okhttp3.internal.http2.Http2Stream r2 = r10.this$0
                int r2 = r2.getId()
                okhttp3.Headers r4 = r10.trailers
                r4.getClass()
                java.util.List r4 = okhttp3.internal.Util.toHeaderList(r4)
                r1.writeHeaders$okhttp(r2, r0, r4)
                goto L99
            L74:
                if (r1 == 0) goto L84
            L76:
                okio.Buffer r0 = r10.sendBuffer
                long r0 = r0.size()
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L99
                r10.emitFrame(r3)
                goto L76
            L84:
                if (r0 == 0) goto L99
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                okhttp3.internal.http2.Http2Connection r4 = r0.getConnection()
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                int r5 = r0.getId()
                r7 = 0
                r8 = 0
                r6 = 1
                r4.writeData(r5, r6, r7, r8)
            L99:
                okhttp3.internal.http2.Http2Stream r1 = r10.this$0
                monitor-enter(r1)
                r10.closed = r3     // Catch: java.lang.Throwable -> Lae
                monitor-exit(r1)
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.flush()
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                r0.cancelStreamIfNecessary$okhttp()
                return
            Lae:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            Lb1:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
                r4 = this;
                okhttp3.internal.http2.Http2Stream r0 = r4.this$0
                boolean r1 = okhttp3.internal.Util.assertionsEnabled
                if (r1 == 0) goto L1b
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto Ld
                goto L1b
            Ld:
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = " MUST NOT hold lock on "
                j8.o.i(r1, r2, r0)
                return
            L1b:
                okhttp3.internal.http2.Http2Stream r0 = r4.this$0
                monitor-enter(r0)
                r0.checkOutNotClosed$okhttp()     // Catch: java.lang.Throwable -> L3d
                monitor-exit(r0)
            L22:
                okio.Buffer r0 = r4.sendBuffer
                long r0 = r0.size()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto L3c
                r0 = 0
                r4.emitFrame(r0)
                okhttp3.internal.http2.Http2Stream r0 = r4.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.flush()
                goto L22
            L3c:
                return
            L3d:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        public final boolean getClosed() {
                r1 = this;
                boolean r0 = r1.closed
                return r0
        }

        public final boolean getFinished() {
                r1 = this;
                boolean r0 = r1.finished
                return r0
        }

        public final okhttp3.Headers getTrailers() {
                r1 = this;
                okhttp3.Headers r0 = r1.trailers
                return r0
        }

        public final void setClosed(boolean r1) {
                r0 = this;
                r0.closed = r1
                return
        }

        public final void setFinished(boolean r1) {
                r0 = this;
                r0.finished = r1
                return
        }

        public final void setTrailers(okhttp3.Headers r1) {
                r0 = this;
                r0.trailers = r1
                return
        }

        @Override // okio.Sink
        public okio.Timeout timeout() {
                r1 = this;
                okhttp3.internal.http2.Http2Stream r0 = r1.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r0.getWriteTimeout$okhttp()
                return r0
        }

        @Override // okio.Sink
        public void write(okio.Buffer r3, long r4) {
                r2 = this;
                r3.getClass()
                okhttp3.internal.http2.Http2Stream r0 = r2.this$0
                boolean r1 = okhttp3.internal.Util.assertionsEnabled
                if (r1 == 0) goto L1e
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L10
                goto L1e
            L10:
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r3 = r3.getName()
                java.lang.String r4 = " MUST NOT hold lock on "
                j8.o.i(r3, r4, r0)
                return
            L1e:
                okio.Buffer r0 = r2.sendBuffer
                r0.write(r3, r4)
            L23:
                okio.Buffer r3 = r2.sendBuffer
                long r3 = r3.size()
                r0 = 16384(0x4000, double:8.095E-320)
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 < 0) goto L34
                r3 = 0
                r2.emitFrame(r3)
                goto L23
            L34:
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class FramingSource implements okio.Source {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private final okio.Buffer readBuffer;
        private final okio.Buffer receiveBuffer;
        final /* synthetic */ okhttp3.internal.http2.Http2Stream this$0;
        private okhttp3.Headers trailers;

        public FramingSource(okhttp3.internal.http2.Http2Stream r1, long r2, boolean r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.maxByteCount = r2
                r0.finished = r4
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
                r0.receiveBuffer = r1
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
                r0.readBuffer = r1
                return
        }

        private final void updateConnectionFlowControl(long r3) {
                r2 = this;
                okhttp3.internal.http2.Http2Stream r0 = r2.this$0
                boolean r1 = okhttp3.internal.Util.assertionsEnabled
                if (r1 == 0) goto L1b
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto Ld
                goto L1b
            Ld:
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r3 = r3.getName()
                java.lang.String r4 = " MUST NOT hold lock on "
                j8.o.i(r3, r4, r0)
                return
            L1b:
                okhttp3.internal.http2.Http2Stream r0 = r2.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.updateConnectionFlowControl$okhttp(r3)
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r5 = this;
                okhttp3.internal.http2.Http2Stream r0 = r5.this$0
                monitor-enter(r0)
                r1 = 1
                r5.closed = r1     // Catch: java.lang.Throwable -> L27
                okio.Buffer r1 = r5.readBuffer     // Catch: java.lang.Throwable -> L27
                long r1 = r1.size()     // Catch: java.lang.Throwable -> L27
                okio.Buffer r3 = r5.readBuffer     // Catch: java.lang.Throwable -> L27
                r3.clear()     // Catch: java.lang.Throwable -> L27
                r0.getClass()     // Catch: java.lang.Throwable -> L27
                r0.notifyAll()     // Catch: java.lang.Throwable -> L27
                monitor-exit(r0)
                r3 = 0
                int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r0 <= 0) goto L21
                r5.updateConnectionFlowControl(r1)
            L21:
                okhttp3.internal.http2.Http2Stream r0 = r5.this$0
                r0.cancelStreamIfNecessary$okhttp()
                return
            L27:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        public final boolean getClosed$okhttp() {
                r1 = this;
                boolean r0 = r1.closed
                return r0
        }

        public final boolean getFinished$okhttp() {
                r1 = this;
                boolean r0 = r1.finished
                return r0
        }

        public final okio.Buffer getReadBuffer() {
                r1 = this;
                okio.Buffer r0 = r1.readBuffer
                return r0
        }

        public final okio.Buffer getReceiveBuffer() {
                r1 = this;
                okio.Buffer r0 = r1.receiveBuffer
                return r0
        }

        public final okhttp3.Headers getTrailers() {
                r1 = this;
                okhttp3.Headers r0 = r1.trailers
                return r0
        }

        @Override // okio.Source
        public long read(okio.Buffer r19, long r20) {
                r18 = this;
                r1 = r18
                r2 = r20
                r19.getClass()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 < 0) goto Lcb
            Ld:
                okhttp3.internal.http2.Http2Stream r6 = r1.this$0
                monitor-enter(r6)
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r6.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> Lb7
                r0.enter()     // Catch: java.lang.Throwable -> Lb7
                okhttp3.internal.http2.ErrorCode r0 = r6.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L34
                if (r0 == 0) goto L37
                boolean r0 = r1.finished     // Catch: java.lang.Throwable -> L34
                if (r0 != 0) goto L37
                java.io.IOException r0 = r6.getErrorException$okhttp()     // Catch: java.lang.Throwable -> L34
                if (r0 != 0) goto L38
                okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L34
                okhttp3.internal.http2.ErrorCode r7 = r6.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L34
                r7.getClass()     // Catch: java.lang.Throwable -> L34
                r0.<init>(r7)     // Catch: java.lang.Throwable -> L34
                goto L38
            L34:
                r0 = move-exception
                goto Lc1
            L37:
                r0 = 0
            L38:
                boolean r7 = r1.closed     // Catch: java.lang.Throwable -> L34
                if (r7 != 0) goto Lb9
                okio.Buffer r7 = r1.readBuffer     // Catch: java.lang.Throwable -> L34
                long r7 = r7.size()     // Catch: java.lang.Throwable -> L34
                int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                r8 = -1
                r10 = 0
                if (r7 <= 0) goto L93
                okio.Buffer r7 = r1.readBuffer     // Catch: java.lang.Throwable -> L34
                long r11 = r7.size()     // Catch: java.lang.Throwable -> L34
                long r11 = java.lang.Math.min(r2, r11)     // Catch: java.lang.Throwable -> L34
                r13 = r19
                long r11 = r7.read(r13, r11)     // Catch: java.lang.Throwable -> L34
                long r14 = r6.getReadBytesTotal()     // Catch: java.lang.Throwable -> L34
                long r14 = r14 + r11
                r6.setReadBytesTotal$okhttp(r14)     // Catch: java.lang.Throwable -> L34
                long r14 = r6.getReadBytesTotal()     // Catch: java.lang.Throwable -> L34
                long r16 = r6.getReadBytesAcknowledged()     // Catch: java.lang.Throwable -> L34
                long r14 = r14 - r16
                if (r0 != 0) goto La0
                okhttp3.internal.http2.Http2Connection r7 = r6.getConnection()     // Catch: java.lang.Throwable -> L34
                okhttp3.internal.http2.Settings r7 = r7.getOkHttpSettings()     // Catch: java.lang.Throwable -> L34
                int r7 = r7.getInitialWindowSize()     // Catch: java.lang.Throwable -> L34
                int r7 = r7 / 2
                long r4 = (long) r7     // Catch: java.lang.Throwable -> L34
                int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
                if (r4 < 0) goto La0
                okhttp3.internal.http2.Http2Connection r4 = r6.getConnection()     // Catch: java.lang.Throwable -> L34
                int r5 = r6.getId()     // Catch: java.lang.Throwable -> L34
                r4.writeWindowUpdateLater$okhttp(r5, r14)     // Catch: java.lang.Throwable -> L34
                long r4 = r6.getReadBytesTotal()     // Catch: java.lang.Throwable -> L34
                r6.setReadBytesAcknowledged$okhttp(r4)     // Catch: java.lang.Throwable -> L34
                goto La0
            L93:
                r13 = r19
                boolean r4 = r1.finished     // Catch: java.lang.Throwable -> L34
                if (r4 != 0) goto L9f
                if (r0 != 0) goto L9f
                r6.waitForIo$okhttp()     // Catch: java.lang.Throwable -> L34
                r10 = 1
            L9f:
                r11 = r8
            La0:
                okhttp3.internal.http2.Http2Stream$StreamTimeout r4 = r6.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> Lb7
                r4.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> Lb7
                monitor-exit(r6)
                if (r10 == 0) goto Lae
                r4 = 0
                goto Ld
            Lae:
                int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r2 == 0) goto Lb3
                return r11
            Lb3:
                if (r0 != 0) goto Lb6
                return r8
            Lb6:
                throw r0
            Lb7:
                r0 = move-exception
                goto Lc9
            Lb9:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L34
                java.lang.String r2 = "stream closed"
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L34
                throw r0     // Catch: java.lang.Throwable -> L34
            Lc1:
                okhttp3.internal.http2.Http2Stream$StreamTimeout r2 = r6.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> Lb7
                r2.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> Lb7
                throw r0     // Catch: java.lang.Throwable -> Lb7
            Lc9:
                monitor-exit(r6)
                throw r0
            Lcb:
                java.lang.String r0 = "byteCount < 0: "
                java.lang.String r0 = bc.e.g(r2, r0)
                j8.o.q(r0)
                r2 = 0
                return r2
        }

        public final void receive$okhttp(okio.BufferedSource r12, long r13) {
                r11 = this;
                r12.getClass()
                okhttp3.internal.http2.Http2Stream r0 = r11.this$0
                boolean r1 = okhttp3.internal.Util.assertionsEnabled
                if (r1 == 0) goto L1e
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L10
                goto L1e
            L10:
                java.lang.Thread r12 = java.lang.Thread.currentThread()
                java.lang.String r12 = r12.getName()
                java.lang.String r13 = " MUST NOT hold lock on "
                j8.o.i(r12, r13, r0)
                return
            L1e:
                r0 = r13
            L1f:
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L91
                okhttp3.internal.http2.Http2Stream r4 = r11.this$0
                monitor-enter(r4)
                boolean r5 = r11.finished     // Catch: java.lang.Throwable -> L8e
                okio.Buffer r6 = r11.readBuffer     // Catch: java.lang.Throwable -> L8e
                long r6 = r6.size()     // Catch: java.lang.Throwable -> L8e
                long r6 = r6 + r0
                long r8 = r11.maxByteCount     // Catch: java.lang.Throwable -> L8e
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                r7 = 0
                r8 = 1
                if (r6 <= 0) goto L3b
                r6 = r8
                goto L3c
            L3b:
                r6 = r7
            L3c:
                monitor-exit(r4)
                if (r6 == 0) goto L4a
                r12.skip(r0)
                okhttp3.internal.http2.Http2Stream r12 = r11.this$0
                okhttp3.internal.http2.ErrorCode r13 = okhttp3.internal.http2.ErrorCode.FLOW_CONTROL_ERROR
                r12.closeLater(r13)
                return
            L4a:
                if (r5 == 0) goto L50
                r12.skip(r0)
                return
            L50:
                okio.Buffer r4 = r11.receiveBuffer
                long r4 = r12.read(r4, r0)
                r9 = -1
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L8a
                long r0 = r0 - r4
                okhttp3.internal.http2.Http2Stream r4 = r11.this$0
                monitor-enter(r4)
                boolean r5 = r11.closed     // Catch: java.lang.Throwable -> L6a
                if (r5 == 0) goto L6c
                okio.Buffer r2 = r11.receiveBuffer     // Catch: java.lang.Throwable -> L6a
                r2.clear()     // Catch: java.lang.Throwable -> L6a
                goto L86
            L6a:
                r12 = move-exception
                goto L88
            L6c:
                okio.Buffer r5 = r11.readBuffer     // Catch: java.lang.Throwable -> L6a
                long r5 = r5.size()     // Catch: java.lang.Throwable -> L6a
                int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r2 != 0) goto L77
                r7 = r8
            L77:
                okio.Buffer r2 = r11.readBuffer     // Catch: java.lang.Throwable -> L6a
                okio.Buffer r3 = r11.receiveBuffer     // Catch: java.lang.Throwable -> L6a
                r2.writeAll(r3)     // Catch: java.lang.Throwable -> L6a
                if (r7 == 0) goto L86
                r4.getClass()     // Catch: java.lang.Throwable -> L6a
                r4.notifyAll()     // Catch: java.lang.Throwable -> L6a
            L86:
                monitor-exit(r4)
                goto L1f
            L88:
                monitor-exit(r4)
                throw r12
            L8a:
                j8.o.a()
                return
            L8e:
                r12 = move-exception
                monitor-exit(r4)
                throw r12
            L91:
                r11.updateConnectionFlowControl(r13)
                return
        }

        public final void setClosed$okhttp(boolean r1) {
                r0 = this;
                r0.closed = r1
                return
        }

        public final void setFinished$okhttp(boolean r1) {
                r0 = this;
                r0.finished = r1
                return
        }

        public final void setTrailers(okhttp3.Headers r1) {
                r0 = this;
                r0.trailers = r1
                return
        }

        @Override // okio.Source
        public okio.Timeout timeout() {
                r1 = this;
                okhttp3.internal.http2.Http2Stream r0 = r1.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r0.getReadTimeout$okhttp()
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class StreamTimeout extends okio.AsyncTimeout {
        final /* synthetic */ okhttp3.internal.http2.Http2Stream this$0;

        public StreamTimeout(okhttp3.internal.http2.Http2Stream r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public final void exitAndThrowIfTimedOut() {
                r1 = this;
                boolean r0 = r1.exit()
                if (r0 != 0) goto L7
                return
            L7:
                r0 = 0
                java.io.IOException r0 = r1.newTimeoutException(r0)
                throw r0
        }

        @Override // okio.AsyncTimeout
        public java.io.IOException newTimeoutException(java.io.IOException r3) {
                r2 = this;
                java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
                java.lang.String r1 = "timeout"
                r0.<init>(r1)
                if (r3 == 0) goto Lc
                r0.initCause(r3)
            Lc:
                return r0
        }

        @Override // okio.AsyncTimeout
        public void timedOut() {
                r2 = this;
                okhttp3.internal.http2.Http2Stream r0 = r2.this$0
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL
                r0.closeLater(r1)
                okhttp3.internal.http2.Http2Stream r0 = r2.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.sendDegradedPingLater$okhttp()
                return
        }
    }

    static {
            okhttp3.internal.http2.Http2Stream$Companion r0 = new okhttp3.internal.http2.Http2Stream$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.Http2Stream.Companion = r0
            return
    }

    public Http2Stream(int r4, okhttp3.internal.http2.Http2Connection r5, boolean r6, boolean r7, okhttp3.Headers r8) {
            r3 = this;
            r5.getClass()
            r3.<init>()
            r3.f9857id = r4
            r3.connection = r5
            okhttp3.internal.http2.Settings r4 = r5.getPeerSettings()
            int r4 = r4.getInitialWindowSize()
            long r0 = (long) r4
            r3.writeBytesMaximum = r0
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            r3.headersQueue = r4
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = new okhttp3.internal.http2.Http2Stream$FramingSource
            okhttp3.internal.http2.Settings r5 = r5.getOkHttpSettings()
            int r5 = r5.getInitialWindowSize()
            long r1 = (long) r5
            r0.<init>(r3, r1, r7)
            r3.source = r0
            okhttp3.internal.http2.Http2Stream$FramingSink r5 = new okhttp3.internal.http2.Http2Stream$FramingSink
            r5.<init>(r3, r6)
            r3.sink = r5
            okhttp3.internal.http2.Http2Stream$StreamTimeout r5 = new okhttp3.internal.http2.Http2Stream$StreamTimeout
            r5.<init>(r3)
            r3.readTimeout = r5
            okhttp3.internal.http2.Http2Stream$StreamTimeout r5 = new okhttp3.internal.http2.Http2Stream$StreamTimeout
            r5.<init>(r3)
            r3.writeTimeout = r5
            if (r8 == 0) goto L54
            boolean r5 = r3.isLocallyInitiated()
            if (r5 != 0) goto L4d
            r4.add(r8)
            return
        L4d:
            java.lang.String r4 = "locally-initiated streams shouldn't have headers yet"
            j8.o.A(r4)
            r4 = 0
            throw r4
        L54:
            boolean r4 = r3.isLocallyInitiated()
            if (r4 == 0) goto L5b
            return
        L5b:
            java.lang.String r4 = "remotely-initiated streams should have headers"
            j8.o.A(r4)
            r4 = 0
            throw r4
    }

    private final boolean closeInternal(okhttp3.internal.http2.ErrorCode r3, java.io.IOException r4) {
            r2 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L1a
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto Lb
            goto L1a
        Lb:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = " MUST NOT hold lock on "
            j8.o.i(r3, r4, r2)
            r3 = 0
            return r3
        L1a:
            monitor-enter(r2)
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch: java.lang.Throwable -> L3b
            r1 = 0
            if (r0 == 0) goto L22
            monitor-exit(r2)
            return r1
        L22:
            r2.errorCode = r3     // Catch: java.lang.Throwable -> L3b
            r2.errorException = r4     // Catch: java.lang.Throwable -> L3b
            r2.notifyAll()     // Catch: java.lang.Throwable -> L3b
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.source     // Catch: java.lang.Throwable -> L3b
            boolean r3 = r3.getFinished$okhttp()     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L3d
            okhttp3.internal.http2.Http2Stream$FramingSink r3 = r2.sink     // Catch: java.lang.Throwable -> L3b
            boolean r3 = r3.getFinished()     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L3d
            monitor-exit(r2)
            return r1
        L3b:
            r3 = move-exception
            goto L47
        L3d:
            monitor-exit(r2)
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r4 = r2.f9857id
            r3.removeStream$okhttp(r4)
            r3 = 1
            return r3
        L47:
            monitor-exit(r2)
            throw r3
    }

    public final void addBytesToWriteWindow(long r3) {
            r2 = this;
            long r0 = r2.writeBytesMaximum
            long r0 = r0 + r3
            r2.writeBytesMaximum = r0
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto Le
            r2.notifyAll()
        Le:
            return
    }

    public final void cancelStreamIfNecessary$okhttp() {
            r2 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L19
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto Lb
            goto L19
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = " MUST NOT hold lock on "
            j8.o.i(r0, r1, r2)
            return
        L19:
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L3b
            boolean r0 = r0.getFinished$okhttp()     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L3f
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L3b
            boolean r0 = r0.getClosed$okhttp()     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L3f
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink     // Catch: java.lang.Throwable -> L3b
            boolean r0 = r0.getFinished()     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L3d
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink     // Catch: java.lang.Throwable -> L3b
            boolean r0 = r0.getClosed()     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L3f
            goto L3d
        L3b:
            r0 = move-exception
            goto L58
        L3d:
            r0 = 1
            goto L40
        L3f:
            r0 = 0
        L40:
            boolean r1 = r2.isOpen()     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r2)
            if (r0 == 0) goto L4e
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL
            r1 = 0
            r2.close(r0, r1)
            return
        L4e:
            if (r1 != 0) goto L57
            okhttp3.internal.http2.Http2Connection r0 = r2.connection
            int r1 = r2.f9857id
            r0.removeStream$okhttp(r1)
        L57:
            return
        L58:
            monitor-exit(r2)
            throw r0
    }

    public final void checkOutNotClosed$okhttp() {
            r2 = this;
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink
            boolean r0 = r0.getClosed()
            if (r0 != 0) goto L29
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink
            boolean r0 = r0.getFinished()
            if (r0 != 0) goto L23
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode
            if (r0 == 0) goto L22
            java.io.IOException r1 = r2.errorException
            if (r1 == 0) goto L19
            goto L21
        L19:
            okhttp3.internal.http2.StreamResetException r1 = new okhttp3.internal.http2.StreamResetException
            r0.getClass()
            r1.<init>(r0)
        L21:
            throw r1
        L22:
            return
        L23:
            java.lang.String r0 = "stream finished"
            j8.o.y(r0)
            return
        L29:
            java.lang.String r0 = "stream closed"
            j8.o.y(r0)
            return
    }

    public final void close(okhttp3.internal.http2.ErrorCode r2, java.io.IOException r3) {
            r1 = this;
            r2.getClass()
            boolean r3 = r1.closeInternal(r2, r3)
            if (r3 != 0) goto La
            return
        La:
            okhttp3.internal.http2.Http2Connection r3 = r1.connection
            int r0 = r1.f9857id
            r3.writeSynReset$okhttp(r0, r2)
            return
    }

    public final void closeLater(okhttp3.internal.http2.ErrorCode r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            boolean r0 = r2.closeInternal(r3, r0)
            if (r0 != 0) goto Lb
            return
        Lb:
            okhttp3.internal.http2.Http2Connection r0 = r2.connection
            int r1 = r2.f9857id
            r0.writeSynResetLater$okhttp(r1, r3)
            return
    }

    public final void enqueueTrailers(okhttp3.Headers r2) {
            r1 = this;
            r2.getClass()
            monitor-enter(r1)
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r1.sink     // Catch: java.lang.Throwable -> L19
            boolean r0 = r0.getFinished()     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L23
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r1.sink     // Catch: java.lang.Throwable -> L19
            r0.setTrailers(r2)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r1)
            return
        L19:
            r2 = move-exception
            goto L2b
        L1b:
            java.lang.String r2 = "trailers.size() == 0"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L19
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L19
            throw r0     // Catch: java.lang.Throwable -> L19
        L23:
            java.lang.String r2 = "already finished"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L19
            throw r0     // Catch: java.lang.Throwable -> L19
        L2b:
            monitor-exit(r1)
            throw r2
    }

    public final okhttp3.internal.http2.Http2Connection getConnection() {
            r1 = this;
            okhttp3.internal.http2.Http2Connection r0 = r1.connection
            return r0
    }

    public final synchronized okhttp3.internal.http2.ErrorCode getErrorCode$okhttp() {
            r1 = this;
            monitor-enter(r1)
            okhttp3.internal.http2.ErrorCode r0 = r1.errorCode     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final java.io.IOException getErrorException$okhttp() {
            r1 = this;
            java.io.IOException r0 = r1.errorException
            return r0
    }

    public final int getId() {
            r1 = this;
            int r0 = r1.f9857id
            return r0
    }

    public final long getReadBytesAcknowledged() {
            r2 = this;
            long r0 = r2.readBytesAcknowledged
            return r0
    }

    public final long getReadBytesTotal() {
            r2 = this;
            long r0 = r2.readBytesTotal
            return r0
    }

    public final okhttp3.internal.http2.Http2Stream.StreamTimeout getReadTimeout$okhttp() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.readTimeout
            return r0
    }

    public final okio.Sink getSink() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L16
            boolean r0 = r2.isLocallyInitiated()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto Lc
            goto L16
        Lc:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.Throwable -> L14
        L14:
            r0 = move-exception
            goto L1a
        L16:
            monitor-exit(r2)
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink
            return r0
        L1a:
            monitor-exit(r2)
            throw r0
    }

    public final okhttp3.internal.http2.Http2Stream.FramingSink getSink$okhttp() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r1.sink
            return r0
    }

    public final okio.Source getSource() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r1.source
            return r0
    }

    public final okhttp3.internal.http2.Http2Stream.FramingSource getSource$okhttp() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r1.source
            return r0
    }

    public final long getWriteBytesMaximum() {
            r2 = this;
            long r0 = r2.writeBytesMaximum
            return r0
    }

    public final long getWriteBytesTotal() {
            r2 = this;
            long r0 = r2.writeBytesTotal
            return r0
    }

    public final okhttp3.internal.http2.Http2Stream.StreamTimeout getWriteTimeout$okhttp() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.writeTimeout
            return r0
    }

    public final boolean isLocallyInitiated() {
            r4 = this;
            int r0 = r4.f9857id
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 != r1) goto L9
            r0 = r1
            goto La
        L9:
            r0 = r2
        La:
            okhttp3.internal.http2.Http2Connection r3 = r4.connection
            boolean r3 = r3.getClient$okhttp()
            if (r3 != r0) goto L13
            return r1
        L13:
            return r2
    }

    public final synchronized boolean isOpen() {
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch: java.lang.Throwable -> L19
            r1 = 0
            if (r0 == 0) goto L8
            monitor-exit(r2)
            return r1
        L8:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L19
            boolean r0 = r0.getFinished$okhttp()     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L1b
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L19
            boolean r0 = r0.getClosed$okhttp()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L31
            goto L1b
        L19:
            r0 = move-exception
            goto L34
        L1b:
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink     // Catch: java.lang.Throwable -> L19
            boolean r0 = r0.getFinished()     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L2b
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink     // Catch: java.lang.Throwable -> L19
            boolean r0 = r0.getClosed()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L31
        L2b:
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L31
            monitor-exit(r2)
            return r1
        L31:
            monitor-exit(r2)
            r0 = 1
            return r0
        L34:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r0
    }

    public final okio.Timeout readTimeout() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.readTimeout
            return r0
    }

    public final void receiveData(okio.BufferedSource r4, int r5) {
            r3 = this;
            r4.getClass()
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L1c
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto Le
            goto L1c
        Le:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = " MUST NOT hold lock on "
            j8.o.i(r4, r5, r3)
            return
        L1c:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r3.source
            long r1 = (long) r5
            r0.receive$okhttp(r4, r1)
            return
    }

    public final void receiveHeaders(okhttp3.Headers r3, boolean r4) {
            r2 = this;
            r3.getClass()
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L1c
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto Le
            goto L1c
        Le:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = " MUST NOT hold lock on "
            j8.o.i(r3, r4, r2)
            return
        L1c:
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L2b
            r1 = 1
            if (r0 == 0) goto L2d
            if (r4 != 0) goto L25
            goto L2d
        L25:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L2b
            r0.setTrailers(r3)     // Catch: java.lang.Throwable -> L2b
            goto L34
        L2b:
            r3 = move-exception
            goto L4d
        L2d:
            r2.hasResponseHeaders = r1     // Catch: java.lang.Throwable -> L2b
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L2b
            r0.add(r3)     // Catch: java.lang.Throwable -> L2b
        L34:
            if (r4 == 0) goto L3b
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.source     // Catch: java.lang.Throwable -> L2b
            r3.setFinished$okhttp(r1)     // Catch: java.lang.Throwable -> L2b
        L3b:
            boolean r3 = r2.isOpen()     // Catch: java.lang.Throwable -> L2b
            r2.notifyAll()     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r2)
            if (r3 != 0) goto L4c
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r4 = r2.f9857id
            r3.removeStream$okhttp(r4)
        L4c:
            return
        L4d:
            monitor-exit(r2)
            throw r3
    }

    public final synchronized void receiveRstStream(okhttp3.internal.http2.ErrorCode r2) {
            r1 = this;
            monitor-enter(r1)
            r2.getClass()     // Catch: java.lang.Throwable -> Le
            okhttp3.internal.http2.ErrorCode r0 = r1.errorCode     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L10
            r1.errorCode = r2     // Catch: java.lang.Throwable -> Le
            r1.notifyAll()     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r2 = move-exception
            goto L12
        L10:
            monitor-exit(r1)
            return
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    public final void setErrorCode$okhttp(okhttp3.internal.http2.ErrorCode r1) {
            r0 = this;
            r0.errorCode = r1
            return
    }

    public final void setErrorException$okhttp(java.io.IOException r1) {
            r0 = this;
            r0.errorException = r1
            return
    }

    public final void setReadBytesAcknowledged$okhttp(long r1) {
            r0 = this;
            r0.readBytesAcknowledged = r1
            return
    }

    public final void setReadBytesTotal$okhttp(long r1) {
            r0 = this;
            r0.readBytesTotal = r1
            return
    }

    public final void setWriteBytesMaximum$okhttp(long r1) {
            r0 = this;
            r0.writeBytesMaximum = r1
            return
    }

    public final void setWriteBytesTotal$okhttp(long r1) {
            r0 = this;
            r0.writeBytesTotal = r1
            return
    }

    public final synchronized okhttp3.Headers takeHeaders() {
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch: java.lang.Throwable -> L32
            r0.enter()     // Catch: java.lang.Throwable -> L32
        L6:
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L18
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            r2.waitForIo$okhttp()     // Catch: java.lang.Throwable -> L16
            goto L6
        L16:
            r0 = move-exception
            goto L44
        L18:
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch: java.lang.Throwable -> L32
            r0.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L32
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L32
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L34
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.lang.Throwable -> L32
            r0.getClass()     // Catch: java.lang.Throwable -> L32
            okhttp3.Headers r0 = (okhttp3.Headers) r0     // Catch: java.lang.Throwable -> L32
            monitor-exit(r2)
            return r0
        L32:
            r0 = move-exception
            goto L4a
        L34:
            java.io.IOException r0 = r2.errorException     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L39
            goto L43
        L39:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L32
            okhttp3.internal.http2.ErrorCode r1 = r2.errorCode     // Catch: java.lang.Throwable -> L32
            r1.getClass()     // Catch: java.lang.Throwable -> L32
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L32
        L43:
            throw r0     // Catch: java.lang.Throwable -> L32
        L44:
            okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r2.readTimeout     // Catch: java.lang.Throwable -> L32
            r1.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L32
            throw r0     // Catch: java.lang.Throwable -> L32
        L4a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
            throw r0
    }

    public final synchronized okhttp3.Headers trailers() {
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.getFinished$okhttp()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L30
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L2c
            okio.Buffer r0 = r0.getReceiveBuffer()     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.exhausted()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L30
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L2c
            okio.Buffer r0 = r0.getReadBuffer()     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.exhausted()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L30
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L2c
            okhttp3.Headers r0 = r0.getTrailers()     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L2e
            okhttp3.Headers r0 = okhttp3.internal.Util.EMPTY_HEADERS     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r0 = move-exception
            goto L4a
        L2e:
            monitor-exit(r2)
            return r0
        L30:
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L42
            java.io.IOException r1 = r2.errorException     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L39
            goto L41
        L39:
            okhttp3.internal.http2.StreamResetException r1 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L2c
            r0.getClass()     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2c
        L41:
            throw r1     // Catch: java.lang.Throwable -> L2c
        L42:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "too early; can't read the trailers yet"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            throw r0     // Catch: java.lang.Throwable -> L2c
        L4a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            throw r0
    }

    public final void waitForIo$okhttp() {
            r1 = this;
            r1.wait()     // Catch: java.lang.InterruptedException -> L4
            return
        L4:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
    }

    public final void writeHeaders(java.util.List<okhttp3.internal.http2.Header> r6, boolean r7, boolean r8) {
            r5 = this;
            r6.getClass()
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L1c
            boolean r0 = java.lang.Thread.holdsLock(r5)
            if (r0 != 0) goto Le
            goto L1c
        Le:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = " MUST NOT hold lock on "
            j8.o.i(r6, r7, r5)
            return
        L1c:
            monitor-enter(r5)
            r0 = 1
            r5.hasResponseHeaders = r0     // Catch: java.lang.Throwable -> L28
            if (r7 == 0) goto L2a
            okhttp3.internal.http2.Http2Stream$FramingSink r1 = r5.sink     // Catch: java.lang.Throwable -> L28
            r1.setFinished(r0)     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r6 = move-exception
            goto L57
        L2a:
            monitor-exit(r5)
            if (r8 != 0) goto L48
            okhttp3.internal.http2.Http2Connection r8 = r5.connection
            monitor-enter(r8)
            okhttp3.internal.http2.Http2Connection r1 = r5.connection     // Catch: java.lang.Throwable -> L45
            long r1 = r1.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L45
            okhttp3.internal.http2.Http2Connection r3 = r5.connection     // Catch: java.lang.Throwable -> L45
            long r3 = r3.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L45
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L41
            goto L42
        L41:
            r0 = 0
        L42:
            monitor-exit(r8)
            r8 = r0
            goto L48
        L45:
            r6 = move-exception
            monitor-exit(r8)
            throw r6
        L48:
            okhttp3.internal.http2.Http2Connection r0 = r5.connection
            int r1 = r5.f9857id
            r0.writeHeaders$okhttp(r1, r7, r6)
            if (r8 == 0) goto L56
            okhttp3.internal.http2.Http2Connection r6 = r5.connection
            r6.flush()
        L56:
            return
        L57:
            monitor-exit(r5)
            throw r6
    }

    public final okio.Timeout writeTimeout() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.writeTimeout
            return r0
    }
}
