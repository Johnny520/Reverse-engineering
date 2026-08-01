package okhttp3.internal.http2;

/* JADX INFO: compiled from: Http2Stream.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 _2\u00020\u0001:\u0004_`abB1\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020#J\r\u0010C\u001a\u00020AH\u0000¢\u0006\u0002\bDJ\r\u0010E\u001a\u00020AH\u0000¢\u0006\u0002\bFJ\u0018\u0010G\u001a\u00020A2\u0006\u0010H\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u001a\u0010I\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u000e\u0010J\u001a\u00020A2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010K\u001a\u00020A2\u0006\u0010L\u001a\u00020\nJ\u0006\u0010M\u001a\u00020NJ\u0006\u0010O\u001a\u00020PJ\u0006\u0010,\u001a\u00020QJ\u0016\u0010R\u001a\u00020A2\u0006\u00104\u001a\u00020S2\u0006\u0010T\u001a\u00020\u0003J\u0016\u0010U\u001a\u00020A2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010V\u001a\u00020A2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010W\u001a\u00020\nJ\u0006\u0010L\u001a\u00020\nJ\r\u0010X\u001a\u00020AH\u0000¢\u0006\u0002\bYJ$\u0010Z\u001a\u00020A2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\u0007J\u0006\u0010>\u001a\u00020QR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010 R$\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010)\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u0018\u0010,\u001a\u00060-R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u00100\u001a\u000601R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u00104\u001a\u000605R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R$\u00108\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010&\"\u0004\b:\u0010(R$\u0010;\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010&\"\u0004\b=\u0010(R\u0018\u0010>\u001a\u00060-R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010/¨\u0006c"}, m115d2 = {"Lokhttp3/internal/http2/Http2Stream;", "", "id", "", "connection", "Lokhttp3/internal/http2/Http2Connection;", "outFinished", "", "inFinished", "headers", "Lokhttp3/Headers;", "(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V", "getConnection", "()Lokhttp3/internal/http2/Http2Connection;", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "getErrorCode$okhttp", "()Lokhttp3/internal/http2/ErrorCode;", "setErrorCode$okhttp", "(Lokhttp3/internal/http2/ErrorCode;)V", "errorException", "Ljava/io/IOException;", "getErrorException$okhttp", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "hasResponseHeaders", "headersQueue", "Ljava/util/ArrayDeque;", "getId", "()I", "isLocallyInitiated", "()Z", "isOpen", "<set-?>", "", "readBytesAcknowledged", "getReadBytesAcknowledged", "()J", "setReadBytesAcknowledged$okhttp", "(J)V", "readBytesTotal", "getReadBytesTotal", "setReadBytesTotal$okhttp", "readTimeout", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getReadTimeout$okhttp", "()Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "sink", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "getSink$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSink;", "source", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "getSource$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSource;", "writeBytesMaximum", "getWriteBytesMaximum", "setWriteBytesMaximum$okhttp", "writeBytesTotal", "getWriteBytesTotal", "setWriteBytesTotal$okhttp", "writeTimeout", "getWriteTimeout$okhttp", "addBytesToWriteWindow", "", "delta", "cancelStreamIfNecessary", "cancelStreamIfNecessary$okhttp", "checkOutNotClosed", "checkOutNotClosed$okhttp", "close", "rstStatusCode", "closeInternal", "closeLater", "enqueueTrailers", "trailers", "getSink", "Lokio/Sink;", "getSource", "Lokio/Source;", "Lokio/Timeout;", "receiveData", "Lokio/BufferedSource;", "length", "receiveHeaders", "receiveRstStream", "takeHeaders", "waitForIo", "waitForIo$okhttp", "writeHeaders", "responseHeaders", "", "Lokhttp3/internal/http2/Header;", "flushHeaders", "Companion", "FramingSink", "FramingSource", "StreamTimeout", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class Http2Stream {
    public static final okhttp3.internal.http2.Http2Stream.Companion Companion = null;
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final okhttp3.internal.http2.Http2Connection connection;
    private okhttp3.internal.http2.ErrorCode errorCode;
    private java.io.IOException errorException;
    private boolean hasResponseHeaders;
    private final java.util.ArrayDeque<okhttp3.Headers> headersQueue;

    /* JADX INFO: renamed from: id */
    private final int f86id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final okhttp3.internal.http2.Http2Stream.StreamTimeout readTimeout;
    private final okhttp3.internal.http2.Http2Stream.FramingSink sink;
    private final okhttp3.internal.http2.Http2Stream.FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final okhttp3.internal.http2.Http2Stream.StreamTimeout writeTimeout;

    /* JADX INFO: compiled from: Http2Stream.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m115d2 = {"Lokhttp3/internal/http2/Http2Stream$Companion;", "", "()V", "EMIT_BUFFER_SIZE", "", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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
    }

    /* JADX INFO: compiled from: Http2Stream.kt */
    @kotlin.Metadata(m114d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m115d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokio/Sink;", "finished", "", "(Lokhttp3/internal/http2/Http2Stream;Z)V", "closed", "getClosed", "()Z", "setClosed", "(Z)V", "getFinished", "setFinished", "sendBuffer", "Lokio/Buffer;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "close", "", "emitFrame", "outFinishedOnLastFrame", "flush", "timeout", "Lokio/Timeout;", "write", "source", "byteCount", "", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public final class FramingSink implements okio.Sink {
        private boolean closed;
        private boolean finished;
        private final okio.Buffer sendBuffer;
        final /* synthetic */ okhttp3.internal.http2.Http2Stream this$0;
        private okhttp3.Headers trailers;

        public FramingSink(okhttp3.internal.http2.Http2Stream r2, boolean r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r1.finished = r3
                okio.Buffer r0 = new okio.Buffer
                r0.<init>()
                r1.sendBuffer = r0
                return
        }

        public /* synthetic */ FramingSink(okhttp3.internal.http2.Http2Stream r1, boolean r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
                r0 = this;
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                r0.<init>(r1, r2)
                return
        }

        private final void emitFrame(boolean r15) throws java.io.IOException {
                r14 = this;
                r0 = 0
                r2 = 0
                okhttp3.internal.http2.Http2Stream r3 = r14.this$0
                okhttp3.internal.http2.Http2Stream r4 = r14.this$0
                monitor-enter(r3)
                r5 = 0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r6 = r4.getWriteTimeout$okhttp()     // Catch: java.lang.Throwable -> La8
                r6.enter()     // Catch: java.lang.Throwable -> La8
            L11:
                long r6 = r4.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L9f
                long r8 = r4.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L9f
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 < 0) goto L2f
                boolean r6 = r14.finished     // Catch: java.lang.Throwable -> L9f
                if (r6 != 0) goto L2f
                boolean r6 = r14.closed     // Catch: java.lang.Throwable -> L9f
                if (r6 != 0) goto L2f
                okhttp3.internal.http2.ErrorCode r6 = r4.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L9f
                if (r6 != 0) goto L2f
                r4.waitForIo$okhttp()     // Catch: java.lang.Throwable -> L9f
                goto L11
            L2f:
                okhttp3.internal.http2.Http2Stream$StreamTimeout r6 = r4.getWriteTimeout$okhttp()     // Catch: java.lang.Throwable -> La8
                r6.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> La8
                r4.checkOutNotClosed$okhttp()     // Catch: java.lang.Throwable -> La8
                long r6 = r4.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> La8
                long r8 = r4.getWriteBytesTotal()     // Catch: java.lang.Throwable -> La8
                long r6 = r6 - r8
                okio.Buffer r8 = r14.sendBuffer     // Catch: java.lang.Throwable -> La8
                long r8 = r8.size()     // Catch: java.lang.Throwable -> La8
                long r6 = java.lang.Math.min(r6, r8)     // Catch: java.lang.Throwable -> La8
                r0 = r6
                long r6 = r4.getWriteBytesTotal()     // Catch: java.lang.Throwable -> La8
                long r6 = r6 + r0
                r4.setWriteBytesTotal$okhttp(r6)     // Catch: java.lang.Throwable -> La8
                if (r15 == 0) goto L64
                okio.Buffer r4 = r14.sendBuffer     // Catch: java.lang.Throwable -> La8
                long r6 = r4.size()     // Catch: java.lang.Throwable -> La8
                int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r4 != 0) goto L64
                r4 = 1
                goto L65
            L64:
                r4 = 0
            L65:
                r10 = r4
                kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L9c
                monitor-exit(r3)
                okhttp3.internal.http2.Http2Stream r2 = r14.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r2 = r2.getWriteTimeout$okhttp()
                r2.enter()
                okhttp3.internal.http2.Http2Stream r2 = r14.this$0     // Catch: java.lang.Throwable -> L91
                okhttp3.internal.http2.Http2Connection r8 = r2.getConnection()     // Catch: java.lang.Throwable -> L91
                okhttp3.internal.http2.Http2Stream r2 = r14.this$0     // Catch: java.lang.Throwable -> L91
                int r9 = r2.getId()     // Catch: java.lang.Throwable -> L91
                okio.Buffer r11 = r14.sendBuffer     // Catch: java.lang.Throwable -> L91
                r12 = r0
                r8.writeData(r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L91
                okhttp3.internal.http2.Http2Stream r2 = r14.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r2 = r2.getWriteTimeout$okhttp()
                r2.exitAndThrowIfTimedOut()
                return
            L91:
                r2 = move-exception
                okhttp3.internal.http2.Http2Stream r3 = r14.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r3 = r3.getWriteTimeout$okhttp()
                r3.exitAndThrowIfTimedOut()
                throw r2
            L9c:
                r4 = move-exception
                r2 = r10
                goto La9
            L9f:
                r6 = move-exception
                okhttp3.internal.http2.Http2Stream$StreamTimeout r4 = r4.getWriteTimeout$okhttp()     // Catch: java.lang.Throwable -> La8
                r4.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> La8
                throw r6     // Catch: java.lang.Throwable -> La8
            La8:
                r4 = move-exception
            La9:
                monitor-exit(r3)
                throw r4
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r12 = this;
                okhttp3.internal.http2.Http2Stream r0 = r12.this$0
                r1 = 0
                boolean r2 = okhttp3.internal.Util.assertionsEnabled
                if (r2 == 0) goto L39
                boolean r2 = java.lang.Thread.holdsLock(r0)
                if (r2 != 0) goto Le
                goto L39
            Le:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Thread "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                java.lang.String r4 = r4.getName()
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r4 = " MUST NOT hold lock on "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L39:
                r0 = 0
                okhttp3.internal.http2.Http2Stream r1 = r12.this$0
                okhttp3.internal.http2.Http2Stream r2 = r12.this$0
                monitor-enter(r1)
                r3 = 0
                boolean r4 = r12.closed     // Catch: java.lang.Throwable -> Le2
                if (r4 == 0) goto L47
                monitor-exit(r1)
                return
            L47:
                okhttp3.internal.http2.ErrorCode r2 = r2.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> Le2
                r4 = 0
                r5 = 1
                if (r2 != 0) goto L51
                r2 = r5
                goto L52
            L51:
                r2 = r4
            L52:
                r0 = r2
                kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Le2
                monitor-exit(r1)
                okhttp3.internal.http2.Http2Stream r1 = r12.this$0
                okhttp3.internal.http2.Http2Stream$FramingSink r1 = r1.getSink$okhttp()
                boolean r1 = r1.finished
                if (r1 != 0) goto Lc6
                okio.Buffer r1 = r12.sendBuffer
                long r1 = r1.size()
                r6 = 0
                int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r1 <= 0) goto L6f
                r1 = r5
                goto L70
            L6f:
                r1 = r4
            L70:
                okhttp3.Headers r2 = r12.trailers
                if (r2 == 0) goto L76
                r2 = r5
                goto L77
            L76:
                r2 = r4
            L77:
                if (r2 == 0) goto La1
            L7a:
                okio.Buffer r3 = r12.sendBuffer
                long r8 = r3.size()
                int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r3 <= 0) goto L88
                r12.emitFrame(r4)
                goto L7a
            L88:
                okhttp3.internal.http2.Http2Stream r3 = r12.this$0
                okhttp3.internal.http2.Http2Connection r3 = r3.getConnection()
                okhttp3.internal.http2.Http2Stream r4 = r12.this$0
                int r4 = r4.getId()
                okhttp3.Headers r6 = r12.trailers
                kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
                java.util.List r6 = okhttp3.internal.Util.toHeaderList(r6)
                r3.writeHeaders$okhttp(r4, r0, r6)
                goto Lc6
            La1:
                if (r1 == 0) goto Lb1
            La3:
                okio.Buffer r3 = r12.sendBuffer
                long r3 = r3.size()
                int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r3 <= 0) goto Lc6
                r12.emitFrame(r5)
                goto La3
            Lb1:
                if (r0 == 0) goto Lc6
                okhttp3.internal.http2.Http2Stream r3 = r12.this$0
                okhttp3.internal.http2.Http2Connection r6 = r3.getConnection()
                okhttp3.internal.http2.Http2Stream r3 = r12.this$0
                int r7 = r3.getId()
                r9 = 0
                r10 = 0
                r8 = 1
                r6.writeData(r7, r8, r9, r10)
            Lc6:
                okhttp3.internal.http2.Http2Stream r1 = r12.this$0
                monitor-enter(r1)
                r2 = 0
                r12.closed = r5     // Catch: java.lang.Throwable -> Ldf
                kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Ldf
                monitor-exit(r1)
                okhttp3.internal.http2.Http2Stream r1 = r12.this$0
                okhttp3.internal.http2.Http2Connection r1 = r1.getConnection()
                r1.flush()
                okhttp3.internal.http2.Http2Stream r1 = r12.this$0
                r1.cancelStreamIfNecessary$okhttp()
                return
            Ldf:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
            Le2:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws java.io.IOException {
                r5 = this;
                okhttp3.internal.http2.Http2Stream r0 = r5.this$0
                r1 = 0
                boolean r2 = okhttp3.internal.Util.assertionsEnabled
                if (r2 == 0) goto L39
                boolean r2 = java.lang.Thread.holdsLock(r0)
                if (r2 != 0) goto Le
                goto L39
            Le:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Thread "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                java.lang.String r4 = r4.getName()
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r4 = " MUST NOT hold lock on "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L39:
                okhttp3.internal.http2.Http2Stream r0 = r5.this$0
                okhttp3.internal.http2.Http2Stream r1 = r5.this$0
                monitor-enter(r0)
                r2 = 0
                r1.checkOutNotClosed$okhttp()     // Catch: java.lang.Throwable -> L62
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L62
                monitor-exit(r0)
            L47:
                okio.Buffer r0 = r5.sendBuffer
                long r0 = r0.size()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto L61
                r0 = 0
                r5.emitFrame(r0)
                okhttp3.internal.http2.Http2Stream r0 = r5.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.flush()
                goto L47
            L61:
                return
            L62:
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
                okio.Timeout r0 = (okio.Timeout) r0
                return r0
        }

        @Override // okio.Sink
        public void write(okio.Buffer r6, long r7) throws java.io.IOException {
                r5 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                okhttp3.internal.http2.Http2Stream r0 = r5.this$0
                r1 = 0
                boolean r2 = okhttp3.internal.Util.assertionsEnabled
                if (r2 == 0) goto L3e
                boolean r2 = java.lang.Thread.holdsLock(r0)
                if (r2 != 0) goto L13
                goto L3e
            L13:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Thread "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                java.lang.String r4 = r4.getName()
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r4 = " MUST NOT hold lock on "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L3e:
                okio.Buffer r0 = r5.sendBuffer
                r0.write(r6, r7)
            L44:
                okio.Buffer r0 = r5.sendBuffer
                long r0 = r0.size()
                r2 = 16384(0x4000, double:8.095E-320)
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 < 0) goto L55
                r0 = 0
                r5.emitFrame(r0)
                goto L44
            L55:
                return
        }
    }

    /* JADX INFO: compiled from: Http2Stream.kt */
    @kotlin.Metadata(m114d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\u001d\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\"J\b\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0002R\u001a\u0010\u0007\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006&"}, m115d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokio/Source;", "maxByteCount", "", "finished", "", "(Lokhttp3/internal/http2/Http2Stream;JZ)V", "closed", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "getFinished$okhttp", "setFinished$okhttp", "readBuffer", "Lokio/Buffer;", "getReadBuffer", "()Lokio/Buffer;", "receiveBuffer", "getReceiveBuffer", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "close", "", "read", "sink", "byteCount", "receive", "source", "Lokio/BufferedSource;", "receive$okhttp", "timeout", "Lokio/Timeout;", "updateConnectionFlowControl", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public final class FramingSource implements okio.Source {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private final okio.Buffer readBuffer;
        private final okio.Buffer receiveBuffer;
        final /* synthetic */ okhttp3.internal.http2.Http2Stream this$0;
        private okhttp3.Headers trailers;

        public FramingSource(okhttp3.internal.http2.Http2Stream r2, long r3, boolean r5) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r1.maxByteCount = r3
                r1.finished = r5
                okio.Buffer r0 = new okio.Buffer
                r0.<init>()
                r1.receiveBuffer = r0
                okio.Buffer r0 = new okio.Buffer
                r0.<init>()
                r1.readBuffer = r0
                return
        }

        private final void updateConnectionFlowControl(long r6) {
                r5 = this;
                okhttp3.internal.http2.Http2Stream r0 = r5.this$0
                r1 = 0
                boolean r2 = okhttp3.internal.Util.assertionsEnabled
                if (r2 == 0) goto L39
                boolean r2 = java.lang.Thread.holdsLock(r0)
                if (r2 != 0) goto Le
                goto L39
            Le:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Thread "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                java.lang.String r4 = r4.getName()
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r4 = " MUST NOT hold lock on "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L39:
                okhttp3.internal.http2.Http2Stream r0 = r5.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.updateConnectionFlowControl$okhttp(r6)
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r7 = this;
                r0 = 0
                okhttp3.internal.http2.Http2Stream r2 = r7.this$0
                okhttp3.internal.http2.Http2Stream r3 = r7.this$0
                monitor-enter(r2)
                r4 = 0
                r5 = 1
                r7.closed = r5     // Catch: java.lang.Throwable -> L37
                okio.Buffer r5 = r7.readBuffer     // Catch: java.lang.Throwable -> L37
                long r5 = r5.size()     // Catch: java.lang.Throwable -> L37
                r0 = r5
                okio.Buffer r5 = r7.readBuffer     // Catch: java.lang.Throwable -> L37
                r5.clear()     // Catch: java.lang.Throwable -> L37
                r5 = 0
                java.lang.String r6 = "null cannot be cast to non-null type java.lang.Object"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r6)     // Catch: java.lang.Throwable -> L37
                r6 = r3
                java.lang.Object r6 = (java.lang.Object) r6     // Catch: java.lang.Throwable -> L37
                r6.notifyAll()     // Catch: java.lang.Throwable -> L37
                kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L37
                monitor-exit(r2)
                r2 = 0
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 <= 0) goto L31
                r7.updateConnectionFlowControl(r0)
            L31:
                okhttp3.internal.http2.Http2Stream r2 = r7.this$0
                r2.cancelStreamIfNecessary$okhttp()
                return
            L37:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
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
        public long read(okio.Buffer r19, long r20) throws java.io.IOException {
                r18 = this;
                r1 = r18
                r2 = r19
                r3 = r20
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r5 = 0
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 < 0) goto L13
                r0 = 1
                goto L14
            L13:
                r0 = 0
            L14:
                if (r0 == 0) goto Le2
            L16:
            L17:
                r7 = 0
                r8 = 0
                r8 = -1
                r10 = 0
                okhttp3.internal.http2.Http2Stream r11 = r1.this$0
                okhttp3.internal.http2.Http2Stream r12 = r1.this$0
                monitor-enter(r11)
                r13 = 0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r12.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> Ldf
                r0.enter()     // Catch: java.lang.Throwable -> Ldf
                okhttp3.internal.http2.ErrorCode r0 = r12.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> Ld6
                if (r0 == 0) goto L4a
                boolean r0 = r1.finished     // Catch: java.lang.Throwable -> Ld6
                if (r0 != 0) goto L4a
                java.io.IOException r0 = r12.getErrorException$okhttp()     // Catch: java.lang.Throwable -> Ld6
                if (r0 != 0) goto L49
                okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> Ld6
                okhttp3.internal.http2.ErrorCode r14 = r12.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> Ld6
                kotlin.jvm.internal.Intrinsics.checkNotNull(r14)     // Catch: java.lang.Throwable -> Ld6
                r0.<init>(r14)     // Catch: java.lang.Throwable -> Ld6
                java.io.IOException r0 = (java.io.IOException) r0     // Catch: java.lang.Throwable -> Ld6
            L49:
                r10 = r0
            L4a:
                boolean r0 = r1.closed     // Catch: java.lang.Throwable -> Ld6
                if (r0 != 0) goto Lce
                okio.Buffer r0 = r1.readBuffer     // Catch: java.lang.Throwable -> Ld6
                long r14 = r0.size()     // Catch: java.lang.Throwable -> Ld6
                int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
                if (r0 <= 0) goto La3
                okio.Buffer r0 = r1.readBuffer     // Catch: java.lang.Throwable -> Ld6
                okio.Buffer r14 = r1.readBuffer     // Catch: java.lang.Throwable -> Ld6
                long r14 = r14.size()     // Catch: java.lang.Throwable -> Ld6
                long r14 = java.lang.Math.min(r3, r14)     // Catch: java.lang.Throwable -> Ld6
                long r14 = r0.read(r2, r14)     // Catch: java.lang.Throwable -> Ld6
                r8 = r14
                long r14 = r12.getReadBytesTotal()     // Catch: java.lang.Throwable -> Ld6
                long r14 = r14 + r8
                r12.setReadBytesTotal$okhttp(r14)     // Catch: java.lang.Throwable -> Ld6
                long r14 = r12.getReadBytesTotal()     // Catch: java.lang.Throwable -> Ld6
                long r16 = r12.getReadBytesAcknowledged()     // Catch: java.lang.Throwable -> Ld6
                long r14 = r14 - r16
                if (r10 != 0) goto Lae
                okhttp3.internal.http2.Http2Connection r0 = r12.getConnection()     // Catch: java.lang.Throwable -> Ld6
                okhttp3.internal.http2.Settings r0 = r0.getOkHttpSettings()     // Catch: java.lang.Throwable -> Ld6
                int r0 = r0.getInitialWindowSize()     // Catch: java.lang.Throwable -> Ld6
                int r0 = r0 / 2
                long r5 = (long) r0     // Catch: java.lang.Throwable -> Ld6
                int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
                if (r0 < 0) goto Lae
                okhttp3.internal.http2.Http2Connection r0 = r12.getConnection()     // Catch: java.lang.Throwable -> Ld6
                int r5 = r12.getId()     // Catch: java.lang.Throwable -> Ld6
                r0.writeWindowUpdateLater$okhttp(r5, r14)     // Catch: java.lang.Throwable -> Ld6
                long r5 = r12.getReadBytesTotal()     // Catch: java.lang.Throwable -> Ld6
                r12.setReadBytesAcknowledged$okhttp(r5)     // Catch: java.lang.Throwable -> Ld6
                goto Lae
            La3:
                boolean r0 = r1.finished     // Catch: java.lang.Throwable -> Ld6
                if (r0 != 0) goto Lae
                if (r10 != 0) goto Lae
                r12.waitForIo$okhttp()     // Catch: java.lang.Throwable -> Ld6
                r0 = 1
                r7 = r0
            Lae:
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r12.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> Ldf
                r0.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> Ldf
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Ldf
                monitor-exit(r11)
                if (r7 == 0) goto Lc0
                r5 = 0
                goto L16
            Lc0:
                r5 = -1
                int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r0 == 0) goto Lc7
                return r8
            Lc7:
                if (r10 != 0) goto Lca
                return r5
            Lca:
                r0 = r10
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                throw r0
            Lce:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Ld6
                java.lang.String r5 = "stream closed"
                r0.<init>(r5)     // Catch: java.lang.Throwable -> Ld6
                throw r0     // Catch: java.lang.Throwable -> Ld6
            Ld6:
                r0 = move-exception
                okhttp3.internal.http2.Http2Stream$StreamTimeout r5 = r12.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> Ldf
                r5.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> Ldf
                throw r0     // Catch: java.lang.Throwable -> Ldf
            Ldf:
                r0 = move-exception
                monitor-exit(r11)
                throw r0
            Le2:
                r0 = 0
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "byteCount < 0: "
                java.lang.StringBuilder r5 = r5.append(r6)
                java.lang.StringBuilder r5 = r5.append(r3)
                java.lang.String r0 = r5.toString()
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                throw r5
        }

        public final void receive$okhttp(okio.BufferedSource r18, long r19) throws java.io.IOException {
                r17 = this;
                r1 = r17
                r2 = r18
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.internal.http2.Http2Stream r0 = r1.this$0
                r3 = 0
                boolean r4 = okhttp3.internal.Util.assertionsEnabled
                if (r4 == 0) goto L42
                boolean r4 = java.lang.Thread.holdsLock(r0)
                if (r4 != 0) goto L17
                goto L42
            L17:
                java.lang.AssertionError r4 = new java.lang.AssertionError
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Thread "
                java.lang.StringBuilder r5 = r5.append(r6)
                java.lang.Thread r6 = java.lang.Thread.currentThread()
                java.lang.String r6 = r6.getName()
                java.lang.StringBuilder r5 = r5.append(r6)
                java.lang.String r6 = " MUST NOT hold lock on "
                java.lang.StringBuilder r5 = r5.append(r6)
                java.lang.StringBuilder r5 = r5.append(r0)
                java.lang.String r5 = r5.toString()
                r4.<init>(r5)
                throw r4
            L42:
                r3 = 0
                r3 = r19
            L47:
                r5 = 0
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 <= 0) goto Ld3
                r7 = 0
                r8 = 0
                okhttp3.internal.http2.Http2Stream r9 = r1.this$0
                monitor-enter(r9)
                r0 = 0
                boolean r10 = r1.finished     // Catch: java.lang.Throwable -> Ld0
                r7 = r10
                okio.Buffer r10 = r1.readBuffer     // Catch: java.lang.Throwable -> Ld0
                long r10 = r10.size()     // Catch: java.lang.Throwable -> Ld0
                long r10 = r10 + r3
                long r12 = r1.maxByteCount     // Catch: java.lang.Throwable -> Ld0
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                r11 = 1
                r12 = 0
                if (r10 <= 0) goto L67
                r10 = r11
                goto L68
            L67:
                r10 = r12
            L68:
                r8 = r10
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Ld0
                monitor-exit(r9)
                if (r8 == 0) goto L7a
                r2.skip(r3)
                okhttp3.internal.http2.Http2Stream r0 = r1.this$0
                okhttp3.internal.http2.ErrorCode r5 = okhttp3.internal.http2.ErrorCode.FLOW_CONTROL_ERROR
                r0.closeLater(r5)
                return
            L7a:
                if (r7 == 0) goto L80
                r2.skip(r3)
                return
            L80:
                okio.Buffer r0 = r1.receiveBuffer
                long r9 = r2.read(r0, r3)
                r13 = -1
                int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
                if (r0 == 0) goto Lca
                long r3 = r3 - r9
                okhttp3.internal.http2.Http2Stream r13 = r1.this$0
                okhttp3.internal.http2.Http2Stream r0 = r1.this$0
                monitor-enter(r13)
                r14 = 0
                boolean r15 = r1.closed     // Catch: java.lang.Throwable -> Lc7
                if (r15 == 0) goto L9d
                okio.Buffer r0 = r1.receiveBuffer     // Catch: java.lang.Throwable -> Lc7
                r0.clear()     // Catch: java.lang.Throwable -> Lc7
                goto Lc2
            L9d:
                okio.Buffer r15 = r1.readBuffer     // Catch: java.lang.Throwable -> Lc7
                long r15 = r15.size()     // Catch: java.lang.Throwable -> Lc7
                int r5 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
                if (r5 != 0) goto La8
                goto La9
            La8:
                r11 = r12
            La9:
                r5 = r11
                okio.Buffer r6 = r1.readBuffer     // Catch: java.lang.Throwable -> Lc7
                okio.Buffer r11 = r1.receiveBuffer     // Catch: java.lang.Throwable -> Lc7
                okio.Source r11 = (okio.Source) r11     // Catch: java.lang.Throwable -> Lc7
                r6.writeAll(r11)     // Catch: java.lang.Throwable -> Lc7
                if (r5 == 0) goto Lc2
            Lb6:
                r6 = 0
                java.lang.String r11 = "null cannot be cast to non-null type java.lang.Object"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r11)     // Catch: java.lang.Throwable -> Lc7
                r11 = r0
                java.lang.Object r11 = (java.lang.Object) r11     // Catch: java.lang.Throwable -> Lc7
                r11.notifyAll()     // Catch: java.lang.Throwable -> Lc7
            Lc2:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lc7
                monitor-exit(r13)
                goto L47
            Lc7:
                r0 = move-exception
                monitor-exit(r13)
                throw r0
            Lca:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
            Ld0:
                r0 = move-exception
                monitor-exit(r9)
                throw r0
            Ld3:
                r5 = r19
                r1.updateConnectionFlowControl(r5)
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
                okio.Timeout r0 = (okio.Timeout) r0
                return r0
        }
    }

    /* JADX INFO: compiled from: Http2Stream.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\t"}, m115d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokio/AsyncTimeout;", "(Lokhttp3/internal/http2/Http2Stream;)V", "exitAndThrowIfTimedOut", "", "newTimeoutException", "Ljava/io/IOException;", "cause", "timedOut", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public final class StreamTimeout extends okio.AsyncTimeout {
        final /* synthetic */ okhttp3.internal.http2.Http2Stream this$0;

        public StreamTimeout(okhttp3.internal.http2.Http2Stream r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public final void exitAndThrowIfTimedOut() throws java.io.IOException {
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
        protected java.io.IOException newTimeoutException(java.io.IOException r5) {
                r4 = this;
                java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
                java.lang.String r1 = "timeout"
                r0.<init>(r1)
                r1 = r0
                r2 = 0
                if (r5 == 0) goto L11
                r3 = r5
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                r1.initCause(r3)
            L11:
                java.io.IOException r0 = (java.io.IOException) r0
                return r0
        }

        @Override // okio.AsyncTimeout
        protected void timedOut() {
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
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r3.<init>()
            r3.f86id = r4
            r3.connection = r5
            okhttp3.internal.http2.Http2Connection r0 = r3.connection
            okhttp3.internal.http2.Settings r0 = r0.getPeerSettings()
            int r0 = r0.getInitialWindowSize()
            long r0 = (long) r0
            r3.writeBytesMaximum = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r3.headersQueue = r0
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = new okhttp3.internal.http2.Http2Stream$FramingSource
            okhttp3.internal.http2.Http2Connection r1 = r3.connection
            okhttp3.internal.http2.Settings r1 = r1.getOkHttpSettings()
            int r1 = r1.getInitialWindowSize()
            long r1 = (long) r1
            r0.<init>(r3, r1, r7)
            r3.source = r0
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = new okhttp3.internal.http2.Http2Stream$FramingSink
            r0.<init>(r3, r6)
            r3.sink = r0
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = new okhttp3.internal.http2.Http2Stream$StreamTimeout
            r0.<init>(r3)
            r3.readTimeout = r0
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = new okhttp3.internal.http2.Http2Stream$StreamTimeout
            r0.<init>(r3)
            r3.writeTimeout = r0
            if (r8 == 0) goto L68
            boolean r0 = r3.isLocallyInitiated()
            if (r0 != 0) goto L5a
            java.util.ArrayDeque<okhttp3.Headers> r0 = r3.headersQueue
            java.util.Collection r0 = (java.util.Collection) r0
            r0.add(r8)
            goto L6e
        L5a:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "locally-initiated streams shouldn't have headers yet"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L68:
            boolean r0 = r3.isLocallyInitiated()
            if (r0 == 0) goto L70
        L6e:
        L6f:
            return
        L70:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "remotely-initiated streams should have headers"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private final boolean closeInternal(okhttp3.internal.http2.ErrorCode r6, java.io.IOException r7) {
            r5 = this;
            r0 = r5
            r1 = 0
            boolean r2 = okhttp3.internal.Util.assertionsEnabled
            if (r2 == 0) goto L38
            boolean r2 = java.lang.Thread.holdsLock(r0)
            if (r2 != 0) goto Ld
            goto L38
        Ld:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Thread "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " MUST NOT hold lock on "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L38:
            monitor-enter(r5)
            r0 = 0
            okhttp3.internal.http2.ErrorCode r1 = r5.errorCode     // Catch: java.lang.Throwable -> L74
            r2 = 0
            if (r1 == 0) goto L43
        L41:
            monitor-exit(r5)
            return r2
        L43:
            r5.errorCode = r6     // Catch: java.lang.Throwable -> L74
            r5.errorException = r7     // Catch: java.lang.Throwable -> L74
            r1 = r5
            r3 = 0
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r4)     // Catch: java.lang.Throwable -> L74
            r4 = r1
            java.lang.Object r4 = (java.lang.Object) r4     // Catch: java.lang.Throwable -> L74
            r4.notifyAll()     // Catch: java.lang.Throwable -> L74
            okhttp3.internal.http2.Http2Stream$FramingSource r1 = r5.source     // Catch: java.lang.Throwable -> L74
            boolean r1 = r1.getFinished$okhttp()     // Catch: java.lang.Throwable -> L74
            if (r1 == 0) goto L67
            okhttp3.internal.http2.Http2Stream$FramingSink r1 = r5.sink     // Catch: java.lang.Throwable -> L74
            boolean r1 = r1.getFinished()     // Catch: java.lang.Throwable -> L74
            if (r1 == 0) goto L67
        L65:
            monitor-exit(r5)
            return r2
        L67:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L74
            monitor-exit(r5)
            okhttp3.internal.http2.Http2Connection r0 = r5.connection
            int r1 = r5.f86id
            r0.removeStream$okhttp(r1)
            r0 = 1
            return r0
        L74:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    public final void addBytesToWriteWindow(long r4) {
            r3 = this;
            long r0 = r3.writeBytesMaximum
            long r0 = r0 + r4
            r3.writeBytesMaximum = r0
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L18
            r0 = r3
            r1 = 0
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r2)
            r2 = r0
            java.lang.Object r2 = (java.lang.Object) r2
            r2.notifyAll()
        L18:
            return
    }

    public final void cancelStreamIfNecessary$okhttp() throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = 0
            boolean r2 = okhttp3.internal.Util.assertionsEnabled
            if (r2 == 0) goto L38
            boolean r2 = java.lang.Thread.holdsLock(r0)
            if (r2 != 0) goto Ld
            goto L38
        Ld:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Thread "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " MUST NOT hold lock on "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L38:
            r0 = 0
            r1 = 0
            monitor-enter(r5)
            r2 = 0
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r5.source     // Catch: java.lang.Throwable -> L7d
            boolean r3 = r3.getFinished$okhttp()     // Catch: java.lang.Throwable -> L7d
            if (r3 != 0) goto L5f
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r5.source     // Catch: java.lang.Throwable -> L7d
            boolean r3 = r3.getClosed$okhttp()     // Catch: java.lang.Throwable -> L7d
            if (r3 == 0) goto L5f
            okhttp3.internal.http2.Http2Stream$FramingSink r3 = r5.sink     // Catch: java.lang.Throwable -> L7d
            boolean r3 = r3.getFinished()     // Catch: java.lang.Throwable -> L7d
            if (r3 != 0) goto L5d
            okhttp3.internal.http2.Http2Stream$FramingSink r3 = r5.sink     // Catch: java.lang.Throwable -> L7d
            boolean r3 = r3.getClosed()     // Catch: java.lang.Throwable -> L7d
            if (r3 == 0) goto L5f
        L5d:
            r3 = 1
            goto L60
        L5f:
            r3 = 0
        L60:
            r1 = r3
            boolean r3 = r5.isOpen()     // Catch: java.lang.Throwable -> L7d
            r0 = r3
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r5)
            if (r1 == 0) goto L73
            okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.CANCEL
            r3 = 0
            r5.close(r2, r3)
            goto L7c
        L73:
            if (r0 != 0) goto L7c
            okhttp3.internal.http2.Http2Connection r2 = r5.connection
            int r3 = r5.f86id
            r2.removeStream$okhttp(r3)
        L7c:
            return
        L7d:
            r2 = move-exception
            monitor-exit(r5)
            throw r2
    }

    public final void checkOutNotClosed$okhttp() throws java.io.IOException {
            r2 = this;
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink
            boolean r0 = r0.getClosed()
            if (r0 != 0) goto L30
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink
            boolean r0 = r0.getFinished()
            if (r0 != 0) goto L28
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode
            if (r0 == 0) goto L27
            java.io.IOException r0 = r2.errorException
            if (r0 == 0) goto L1a
            goto L24
        L1a:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException
            okhttp3.internal.http2.ErrorCode r1 = r2.errorCode
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r0.<init>(r1)
        L24:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L27:
            return
        L28:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "stream finished"
            r0.<init>(r1)
            throw r0
        L30:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "stream closed"
            r0.<init>(r1)
            throw r0
    }

    public final void close(okhttp3.internal.http2.ErrorCode r3, java.io.IOException r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "rstStatusCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r2.closeInternal(r3, r4)
            if (r0 != 0) goto Lc
            return
        Lc:
            okhttp3.internal.http2.Http2Connection r0 = r2.connection
            int r1 = r2.f86id
            r0.writeSynReset$okhttp(r1, r3)
            return
    }

    public final void closeLater(okhttp3.internal.http2.ErrorCode r3) {
            r2 = this;
            java.lang.String r0 = "errorCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            boolean r0 = r2.closeInternal(r3, r0)
            if (r0 != 0) goto Ld
            return
        Ld:
            okhttp3.internal.http2.Http2Connection r0 = r2.connection
            int r1 = r2.f86id
            r0.writeSynResetLater$okhttp(r1, r3)
            return
    }

    public final void enqueueTrailers(okhttp3.Headers r4) {
            r3 = this;
            java.lang.String r0 = "trailers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            monitor-enter(r3)
            r0 = 0
            okhttp3.internal.http2.Http2Stream$FramingSink r1 = r3.sink     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r1.getFinished()     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L31
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            if (r1 == 0) goto L24
            okhttp3.internal.http2.Http2Stream$FramingSink r1 = r3.sink     // Catch: java.lang.Throwable -> L3e
            r1.setTrailers(r4)     // Catch: java.lang.Throwable -> L3e
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r3)
            return
        L24:
            r1 = 0
            java.lang.String r2 = "trailers.size() == 0"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3e
            throw r1     // Catch: java.lang.Throwable -> L3e
        L31:
            r1 = 0
            java.lang.String r2 = "already finished"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3e
            throw r1     // Catch: java.lang.Throwable -> L3e
        L3e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
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
            int r0 = r1.f86id
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
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            boolean r1 = r3.hasResponseHeaders     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto Lf
            boolean r1 = r3.isLocallyInitiated()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            if (r1 == 0) goto L1b
        L13:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L28
            monitor-exit(r3)
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r3.sink
            okio.Sink r0 = (okio.Sink) r0
            return r0
        L1b:
            r1 = 0
            java.lang.String r2 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L28
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L28
            throw r1     // Catch: java.lang.Throwable -> L28
        L28:
            r0 = move-exception
            monitor-exit(r3)
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
            okio.Source r0 = (okio.Source) r0
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
            int r0 = r4.f86id
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
            goto L14
        L13:
            r1 = r2
        L14:
            return r1
    }

    public final synchronized boolean isOpen() {
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch: java.lang.Throwable -> L31
            r1 = 0
            if (r0 == 0) goto L8
            monitor-exit(r2)
            return r1
        L8:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L31
            boolean r0 = r0.getFinished$okhttp()     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L18
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L31
            boolean r0 = r0.getClosed$okhttp()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2e
        L18:
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink     // Catch: java.lang.Throwable -> L31
            boolean r0 = r0.getFinished()     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L28
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink     // Catch: java.lang.Throwable -> L31
            boolean r0 = r0.getClosed()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2e
        L28:
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2e
            monitor-exit(r2)
            return r1
        L2e:
            monitor-exit(r2)
            r0 = 1
            return r0
        L31:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            throw r0
    }

    public final okio.Timeout readTimeout() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.readTimeout
            okio.Timeout r0 = (okio.Timeout) r0
            return r0
    }

    public final void receiveData(okio.BufferedSource r6, int r7) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            r1 = 0
            boolean r2 = okhttp3.internal.Util.assertionsEnabled
            if (r2 == 0) goto L3d
            boolean r2 = java.lang.Thread.holdsLock(r0)
            if (r2 != 0) goto L12
            goto L3d
        L12:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Thread "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " MUST NOT hold lock on "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L3d:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r5.source
            long r1 = (long) r7
            r0.receive$okhttp(r6, r1)
            return
    }

    public final void receiveHeaders(okhttp3.Headers r6, boolean r7) {
            r5 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            r1 = 0
            boolean r2 = okhttp3.internal.Util.assertionsEnabled
            if (r2 == 0) goto L3d
            boolean r2 = java.lang.Thread.holdsLock(r0)
            if (r2 != 0) goto L12
            goto L3d
        L12:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Thread "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " MUST NOT hold lock on "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L3d:
            r0 = 0
            monitor-enter(r5)
            r1 = 0
            boolean r2 = r5.hasResponseHeaders     // Catch: java.lang.Throwable -> L7f
            r3 = 1
            if (r2 == 0) goto L4f
            if (r7 != 0) goto L49
            goto L4f
        L49:
            okhttp3.internal.http2.Http2Stream$FramingSource r2 = r5.source     // Catch: java.lang.Throwable -> L7f
            r2.setTrailers(r6)     // Catch: java.lang.Throwable -> L7f
            goto L58
        L4f:
            r5.hasResponseHeaders = r3     // Catch: java.lang.Throwable -> L7f
            java.util.ArrayDeque<okhttp3.Headers> r2 = r5.headersQueue     // Catch: java.lang.Throwable -> L7f
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L7f
            r2.add(r6)     // Catch: java.lang.Throwable -> L7f
        L58:
            if (r7 == 0) goto L5f
            okhttp3.internal.http2.Http2Stream$FramingSource r2 = r5.source     // Catch: java.lang.Throwable -> L7f
            r2.setFinished$okhttp(r3)     // Catch: java.lang.Throwable -> L7f
        L5f:
            boolean r2 = r5.isOpen()     // Catch: java.lang.Throwable -> L7f
            r0 = r2
            r2 = r5
            r3 = 0
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r4)     // Catch: java.lang.Throwable -> L7f
            r4 = r2
            java.lang.Object r4 = (java.lang.Object) r4     // Catch: java.lang.Throwable -> L7f
            r4.notifyAll()     // Catch: java.lang.Throwable -> L7f
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r5)
            if (r0 != 0) goto L7e
            okhttp3.internal.http2.Http2Connection r1 = r5.connection
            int r2 = r5.f86id
            r1.removeStream$okhttp(r2)
        L7e:
            return
        L7f:
            r1 = move-exception
            monitor-exit(r5)
            throw r1
    }

    public final synchronized void receiveRstStream(okhttp3.internal.http2.ErrorCode r4) {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "errorCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)     // Catch: java.lang.Throwable -> L1b
            okhttp3.internal.http2.ErrorCode r0 = r3.errorCode     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L19
            r3.errorCode = r4     // Catch: java.lang.Throwable -> L1b
            r0 = r3
            r1 = 0
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r2)     // Catch: java.lang.Throwable -> L1b
            r2 = r0
            java.lang.Object r2 = (java.lang.Object) r2     // Catch: java.lang.Throwable -> L1b
            r2.notifyAll()     // Catch: java.lang.Throwable -> L1b
        L19:
            monitor-exit(r3)
            return
        L1b:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            throw r4
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

    public final synchronized okhttp3.Headers takeHeaders() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch: java.lang.Throwable -> L52
            r0.enter()     // Catch: java.lang.Throwable -> L52
        L7:
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L19
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            r2.waitForIo$okhttp()     // Catch: java.lang.Throwable -> L17
            goto L7
        L17:
            r0 = move-exception
            goto L4c
        L19:
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch: java.lang.Throwable -> L52
            r0.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L52
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L52
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L52
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L38
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L52
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = "headersQueue.removeFirst()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Throwable -> L52
            okhttp3.Headers r0 = (okhttp3.Headers) r0     // Catch: java.lang.Throwable -> L52
            monitor-exit(r2)
            return r0
        L38:
            java.io.IOException r0 = r2.errorException     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L3f
        L3c:
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L52
            goto L4a
        L3f:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L52
            okhttp3.internal.http2.ErrorCode r1 = r2.errorCode     // Catch: java.lang.Throwable -> L52
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L52
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L52
            goto L3c
        L4a:
            throw r0     // Catch: java.lang.Throwable -> L52
        L4b:
            r0 = move-exception
        L4c:
            okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r2.readTimeout     // Catch: java.lang.Throwable -> L52
            r1.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L52
            throw r0     // Catch: java.lang.Throwable -> L52
        L52:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L52
            throw r0
    }

    public final synchronized okhttp3.Headers trailers() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.getFinished$okhttp()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L2d
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L4c
            okio.Buffer r0 = r0.getReceiveBuffer()     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.exhausted()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L2d
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L4c
            okio.Buffer r0 = r0.getReadBuffer()     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.exhausted()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L2d
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L4c
            okhttp3.Headers r0 = r0.getTrailers()     // Catch: java.lang.Throwable -> L4c
            if (r0 != 0) goto L2b
            okhttp3.Headers r0 = okhttp3.internal.Util.EMPTY_HEADERS     // Catch: java.lang.Throwable -> L4c
        L2b:
            monitor-exit(r2)
            return r0
        L2d:
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L44
            java.io.IOException r0 = r2.errorException     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L38
        L35:
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L4c
            goto L43
        L38:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L4c
            okhttp3.internal.http2.ErrorCode r1 = r2.errorCode     // Catch: java.lang.Throwable -> L4c
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L4c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4c
            goto L35
        L43:
            throw r0     // Catch: java.lang.Throwable -> L4c
        L44:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = "too early; can't read the trailers yet"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4c
            throw r0     // Catch: java.lang.Throwable -> L4c
        L4c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4c
            throw r0
    }

    public final void waitForIo$okhttp() throws java.io.InterruptedIOException {
            r3 = this;
            r0 = r3
            r1 = 0
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r2)     // Catch: java.lang.InterruptedException -> Lf
            r2 = r0
            java.lang.Object r2 = (java.lang.Object) r2     // Catch: java.lang.InterruptedException -> Lf
            r2.wait()     // Catch: java.lang.InterruptedException -> Lf
            return
        Lf:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            java.io.InterruptedIOException r1 = new java.io.InterruptedIOException
            r1.<init>()
            throw r1
    }

    public final void writeHeaders(java.util.List<okhttp3.internal.http2.Header> r8, boolean r9, boolean r10) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "responseHeaders"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r7
            r1 = 0
            boolean r2 = okhttp3.internal.Util.assertionsEnabled
            if (r2 == 0) goto L3d
            boolean r2 = java.lang.Thread.holdsLock(r0)
            if (r2 != 0) goto L12
            goto L3d
        L12:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Thread "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " MUST NOT hold lock on "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L3d:
            monitor-enter(r7)
            r0 = 0
            r1 = 1
            r7.hasResponseHeaders = r1     // Catch: java.lang.Throwable -> L82
            if (r9 == 0) goto L4b
            okhttp3.internal.http2.Http2Stream$FramingSink r2 = r7.sink     // Catch: java.lang.Throwable -> L82
            r2.setFinished(r1)     // Catch: java.lang.Throwable -> L82
        L4b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L82
            monitor-exit(r7)
            if (r10 != 0) goto L72
            okhttp3.internal.http2.Http2Connection r0 = r7.connection
            monitor-enter(r0)
            r2 = 0
            okhttp3.internal.http2.Http2Connection r3 = r7.connection     // Catch: java.lang.Throwable -> L6e
            long r3 = r3.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L6e
            okhttp3.internal.http2.Http2Connection r5 = r7.connection     // Catch: java.lang.Throwable -> L6e
            long r5 = r5.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L6e
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L66
            goto L67
        L66:
            r1 = 0
        L67:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)
            goto L73
        L6c:
            r2 = move-exception
            goto L70
        L6e:
            r2 = move-exception
            r1 = r10
        L70:
            monitor-exit(r0)
            throw r2
        L72:
            r1 = r10
        L73:
            okhttp3.internal.http2.Http2Connection r0 = r7.connection
            int r2 = r7.f86id
            r0.writeHeaders$okhttp(r2, r9, r8)
            if (r1 == 0) goto L81
            okhttp3.internal.http2.Http2Connection r0 = r7.connection
            r0.flush()
        L81:
            return
        L82:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
    }

    public final okio.Timeout writeTimeout() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.writeTimeout
            okio.Timeout r0 = (okio.Timeout) r0
            return r0
    }
}
