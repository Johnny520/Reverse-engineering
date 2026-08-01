package okhttp3.internal.http2;

/* JADX INFO: compiled from: Http2Writer.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 :2\u00020\u0001:\u0001:B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0006\u0010\u0015\u001a\u00020\u0011J(\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u000fJ(\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u000fJ\u0006\u0010\u001e\u001a\u00020\u0011J&\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fJ\u001e\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'J$\u0010(\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*J\u0006\u0010,\u001a\u00020\u000fJ\u001e\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000fJ$\u00101\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f2\f\u00103\u001a\b\u0012\u0004\u0012\u00020+0*J\u0016\u00104\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%J\u000e\u00105\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u0013J\u0016\u00106\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u00107\u001a\u000208J\u0018\u00109\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u000208H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, m115d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "sink", "Lokio/BufferedSink;", "client", "", "(Lokio/BufferedSink;Z)V", "closed", "hpackBuffer", "Lokio/Buffer;", "hpackWriter", "Lokhttp3/internal/http2/Hpack$Writer;", "getHpackWriter", "()Lokhttp3/internal/http2/Hpack$Writer;", "maxFrameSize", "", "applyAndAckSettings", "", "peerSettings", "Lokhttp3/internal/http2/Settings;", "close", "connectionPreface", "data", "outFinished", "streamId", "source", "byteCount", "dataFrame", "flags", "buffer", "flush", "frameHeader", "length", "type", "goAway", "lastGoodStreamId", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "debugData", "", "headers", "headerBlock", "", "Lokhttp3/internal/http2/Header;", "maxDataLength", "ping", "ack", "payload1", "payload2", "pushPromise", "promisedStreamId", "requestHeaders", "rstStream", "settings", "windowUpdate", "windowSizeIncrement", "", "writeContinuationFrames", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class Http2Writer implements java.io.Closeable {
    public static final okhttp3.internal.http2.Http2Writer.Companion Companion = null;
    private static final java.util.logging.Logger logger = null;
    private final boolean client;
    private boolean closed;
    private final okio.Buffer hpackBuffer;
    private final okhttp3.internal.http2.Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final okio.BufferedSink sink;

    /* JADX INFO: compiled from: Http2Writer.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m115d2 = {"Lokhttp3/internal/http2/Http2Writer$Companion;", "", "()V", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

    static {
            okhttp3.internal.http2.Http2Writer$Companion r0 = new okhttp3.internal.http2.Http2Writer$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.Http2Writer.Companion = r0
            java.lang.Class<okhttp3.internal.http2.Http2> r0 = okhttp3.internal.http2.Http2.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            okhttp3.internal.http2.Http2Writer.logger = r0
            return
    }

    public Http2Writer(okio.BufferedSink r8, boolean r9) {
            r7 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r7.<init>()
            r7.sink = r8
            r7.client = r9
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r7.hpackBuffer = r0
            r0 = 16384(0x4000, float:2.2959E-41)
            r7.maxFrameSize = r0
            okhttp3.internal.http2.Hpack$Writer r0 = new okhttp3.internal.http2.Hpack$Writer
            okio.Buffer r4 = r7.hpackBuffer
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            r7.hpackWriter = r0
            return
    }

    private final void writeContinuationFrames(int r8, long r9) throws java.io.IOException {
            r7 = this;
            r0 = r9
        L1:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L27
            int r4 = r7.maxFrameSize
            long r4 = (long) r4
            long r4 = java.lang.Math.min(r4, r0)
            long r0 = r0 - r4
            int r6 = (int) r4
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L19
            r2 = 4
            goto L1a
        L19:
            r2 = 0
        L1a:
            r3 = 9
            r7.frameHeader(r8, r6, r3, r2)
            okio.BufferedSink r2 = r7.sink
            okio.Buffer r3 = r7.hpackBuffer
            r2.write(r3, r4)
            goto L1
        L27:
            return
    }

    public final synchronized void applyAndAckSettings(okhttp3.internal.http2.Settings r4) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "peerSettings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r3.closed     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L34
            int r0 = r3.maxFrameSize     // Catch: java.lang.Throwable -> L3c
            int r0 = r4.getMaxFrameSize(r0)     // Catch: java.lang.Throwable -> L3c
            r3.maxFrameSize = r0     // Catch: java.lang.Throwable -> L3c
            int r0 = r4.getHeaderTableSize()     // Catch: java.lang.Throwable -> L3c
            r1 = -1
            if (r0 == r1) goto L22
            okhttp3.internal.http2.Hpack$Writer r0 = r3.hpackWriter     // Catch: java.lang.Throwable -> L3c
            int r1 = r4.getHeaderTableSize()     // Catch: java.lang.Throwable -> L3c
            r0.resizeHeaderTable(r1)     // Catch: java.lang.Throwable -> L3c
        L22:
            r0 = 0
            r1 = 4
            r2 = 1
            r3.frameHeader(r0, r0, r1, r2)     // Catch: java.lang.Throwable -> L3c
            okio.BufferedSink r0 = r3.sink     // Catch: java.lang.Throwable -> L3c
            r0.flush()     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r3)
            return
        L34:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3c
            throw r0     // Catch: java.lang.Throwable -> L3c
        L3c:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3c
            throw r4
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.closed = r0     // Catch: java.lang.Throwable -> Lb
            okio.BufferedSink r0 = r1.sink     // Catch: java.lang.Throwable -> Lb
            r0.close()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public final synchronized void connectionPreface() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.closed     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L48
            boolean r0 = r3.client     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto Lb
            monitor-exit(r3)
            return
        Lb:
            java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Writer.logger     // Catch: java.lang.Throwable -> L50
            java.util.logging.Level r1 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L50
            boolean r0 = r0.isLoggable(r1)     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L3a
            java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Writer.logger     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r1.<init>()     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = ">> CONNECTION "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L50
            okio.ByteString r2 = okhttp3.internal.http2.Http2.CONNECTION_PREFACE     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = r2.hex()     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L50
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = okhttp3.internal.Util.format(r1, r2)     // Catch: java.lang.Throwable -> L50
            r0.fine(r1)     // Catch: java.lang.Throwable -> L50
        L3a:
            okio.BufferedSink r0 = r3.sink     // Catch: java.lang.Throwable -> L50
            okio.ByteString r1 = okhttp3.internal.http2.Http2.CONNECTION_PREFACE     // Catch: java.lang.Throwable -> L50
            r0.write(r1)     // Catch: java.lang.Throwable -> L50
            okio.BufferedSink r0 = r3.sink     // Catch: java.lang.Throwable -> L50
            r0.flush()     // Catch: java.lang.Throwable -> L50
            monitor-exit(r3)
            return
        L48:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L50
            throw r0     // Catch: java.lang.Throwable -> L50
        L50:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L50
            throw r0
    }

    public final synchronized void data(boolean r3, int r4, okio.Buffer r5, int r6) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto Lf
            r0 = 0
            if (r3 == 0) goto La
            r0 = r0 | 1
        La:
            r2.dataFrame(r4, r0, r5, r6)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            return
        Lf:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
            throw r0     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    public final void dataFrame(int r4, int r5, okio.Buffer r6, int r7) throws java.io.IOException {
            r3 = this;
            r0 = 0
            r3.frameHeader(r4, r7, r0, r5)
            if (r7 <= 0) goto L14
            okio.BufferedSink r0 = r3.sink
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            long r1 = (long) r7
            r0.write(r6, r1)
        L14:
            return
    }

    public final synchronized void flush() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto Lc
            okio.BufferedSink r0 = r2.sink     // Catch: java.lang.Throwable -> L14
            r0.flush()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        Lc:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L14
            throw r0     // Catch: java.lang.Throwable -> L14
        L14:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    public final void frameHeader(int r8, int r9, int r10, int r11) throws java.io.IOException {
            r7 = this;
            java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Writer.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L1a
            java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Writer.logger
            okhttp3.internal.http2.Http2 r1 = okhttp3.internal.http2.Http2.INSTANCE
            r2 = 0
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            java.lang.String r1 = r1.frameLog(r2, r3, r4, r5, r6)
            r0.fine(r1)
        L1a:
            int r0 = r7.maxFrameSize
            r1 = 1
            r2 = 0
            if (r9 > r0) goto L22
            r0 = r1
            goto L23
        L22:
            r0 = r2
        L23:
            if (r0 == 0) goto L69
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r8
            if (r0 != 0) goto L2b
            goto L2c
        L2b:
            r1 = r2
        L2c:
            if (r1 == 0) goto L4b
            okio.BufferedSink r0 = r7.sink
            okhttp3.internal.Util.writeMedium(r0, r9)
            okio.BufferedSink r0 = r7.sink
            r1 = r10 & 255(0xff, float:3.57E-43)
            r0.writeByte(r1)
            okio.BufferedSink r0 = r7.sink
            r1 = r11 & 255(0xff, float:3.57E-43)
            r0.writeByte(r1)
            okio.BufferedSink r0 = r7.sink
            r1 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r8
            r0.writeInt(r1)
            return
        L4b:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "reserved bit set: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L69:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "FRAME_SIZE_ERROR length > "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r7.maxFrameSize
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ": "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public final okhttp3.internal.http2.Hpack.Writer getHpackWriter() {
            r1 = this;
            okhttp3.internal.http2.Hpack$Writer r0 = r1.hpackWriter
            return r0
    }

    public final synchronized void goAway(int r5, okhttp3.internal.http2.ErrorCode r6, byte[] r7) throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "errorCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "debugData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)     // Catch: java.lang.Throwable -> L5e
            boolean r0 = r4.closed     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto L56
            int r0 = r6.getHttpCode()     // Catch: java.lang.Throwable -> L5e
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L1a
            r0 = r2
            goto L1b
        L1a:
            r0 = r3
        L1b:
            if (r0 == 0) goto L49
        L1f:
            int r0 = r7.length     // Catch: java.lang.Throwable -> L5e
            int r0 = r0 + 8
            r1 = 7
            r4.frameHeader(r3, r0, r1, r3)     // Catch: java.lang.Throwable -> L5e
            okio.BufferedSink r0 = r4.sink     // Catch: java.lang.Throwable -> L5e
            r0.writeInt(r5)     // Catch: java.lang.Throwable -> L5e
            okio.BufferedSink r0 = r4.sink     // Catch: java.lang.Throwable -> L5e
            int r1 = r6.getHttpCode()     // Catch: java.lang.Throwable -> L5e
            r0.writeInt(r1)     // Catch: java.lang.Throwable -> L5e
            int r0 = r7.length     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto L3a
            goto L3b
        L3a:
            r2 = r3
        L3b:
            if (r2 != 0) goto L42
            okio.BufferedSink r0 = r4.sink     // Catch: java.lang.Throwable -> L5e
            r0.write(r7)     // Catch: java.lang.Throwable -> L5e
        L42:
            okio.BufferedSink r0 = r4.sink     // Catch: java.lang.Throwable -> L5e
            r0.flush()     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r4)
            return
        L49:
            r0 = 0
            java.lang.String r1 = "errorCode.httpCode == -1"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L5e
            throw r0     // Catch: java.lang.Throwable -> L5e
        L56:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L5e
            throw r0     // Catch: java.lang.Throwable -> L5e
        L5e:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5e
            throw r5
    }

    public final synchronized void headers(boolean r8, int r9, java.util.List<okhttp3.internal.http2.Header> r10) throws java.io.IOException {
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "headerBlock"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)     // Catch: java.lang.Throwable -> L4a
            boolean r0 = r7.closed     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L42
            okhttp3.internal.http2.Hpack$Writer r0 = r7.hpackWriter     // Catch: java.lang.Throwable -> L4a
            r0.writeHeaders(r10)     // Catch: java.lang.Throwable -> L4a
            okio.Buffer r0 = r7.hpackBuffer     // Catch: java.lang.Throwable -> L4a
            long r0 = r0.size()     // Catch: java.lang.Throwable -> L4a
            int r2 = r7.maxFrameSize     // Catch: java.lang.Throwable -> L4a
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L4a
            long r2 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L4a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L22
            r4 = 4
            goto L23
        L22:
            r4 = 0
        L23:
            if (r8 == 0) goto L27
            r4 = r4 | 1
        L27:
            int r5 = (int) r2     // Catch: java.lang.Throwable -> L4a
            r6 = 1
            r7.frameHeader(r9, r5, r6, r4)     // Catch: java.lang.Throwable -> L4a
            okio.BufferedSink r5 = r7.sink     // Catch: java.lang.Throwable -> L4a
            okio.Buffer r6 = r7.hpackBuffer     // Catch: java.lang.Throwable -> L4a
            r5.write(r6, r2)     // Catch: java.lang.Throwable -> L4a
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L40
            long r5 = r0 - r2
            r7.writeContinuationFrames(r9, r5)     // Catch: java.lang.Throwable -> L4a
        L40:
            monitor-exit(r7)
            return
        L42:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4a
            throw r0     // Catch: java.lang.Throwable -> L4a
        L4a:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4a
            throw r8
    }

    public final int maxDataLength() {
            r1 = this;
            int r0 = r1.maxFrameSize
            return r0
    }

    public final synchronized void ping(boolean r5, int r6, int r7) throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.closed     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L26
        L9:
            r0 = 0
            if (r5 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = r0
        Lf:
            r2 = 8
            r3 = 6
            r4.frameHeader(r0, r2, r3, r1)     // Catch: java.lang.Throwable -> L2e
            okio.BufferedSink r0 = r4.sink     // Catch: java.lang.Throwable -> L2e
            r0.writeInt(r6)     // Catch: java.lang.Throwable -> L2e
            okio.BufferedSink r0 = r4.sink     // Catch: java.lang.Throwable -> L2e
            r0.writeInt(r7)     // Catch: java.lang.Throwable -> L2e
            okio.BufferedSink r0 = r4.sink     // Catch: java.lang.Throwable -> L2e
            r0.flush()     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r4)
            return
        L26:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            throw r0     // Catch: java.lang.Throwable -> L2e
        L2e:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
            throw r5
    }

    public final synchronized void pushPromise(int r8, int r9, java.util.List<okhttp3.internal.http2.Header> r10) throws java.io.IOException {
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "requestHeaders"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)     // Catch: java.lang.Throwable -> L57
            boolean r0 = r7.closed     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L4f
            okhttp3.internal.http2.Hpack$Writer r0 = r7.hpackWriter     // Catch: java.lang.Throwable -> L57
            r0.writeHeaders(r10)     // Catch: java.lang.Throwable -> L57
            okio.Buffer r0 = r7.hpackBuffer     // Catch: java.lang.Throwable -> L57
            long r0 = r0.size()     // Catch: java.lang.Throwable -> L57
            int r2 = r7.maxFrameSize     // Catch: java.lang.Throwable -> L57
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L57
            r4 = 4
            long r2 = r2 - r4
            long r2 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L57
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L57
            int r3 = r2 + 4
            long r4 = (long) r2     // Catch: java.lang.Throwable -> L57
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L2c
            r4 = 4
            goto L2d
        L2c:
            r4 = 0
        L2d:
            r5 = 5
            r7.frameHeader(r8, r3, r5, r4)     // Catch: java.lang.Throwable -> L57
            okio.BufferedSink r3 = r7.sink     // Catch: java.lang.Throwable -> L57
            r4 = 2147483647(0x7fffffff, float:NaN)
            r4 = r4 & r9
            r3.writeInt(r4)     // Catch: java.lang.Throwable -> L57
            okio.BufferedSink r3 = r7.sink     // Catch: java.lang.Throwable -> L57
            okio.Buffer r4 = r7.hpackBuffer     // Catch: java.lang.Throwable -> L57
            long r5 = (long) r2     // Catch: java.lang.Throwable -> L57
            r3.write(r4, r5)     // Catch: java.lang.Throwable -> L57
            long r3 = (long) r2     // Catch: java.lang.Throwable -> L57
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L4d
            long r3 = (long) r2     // Catch: java.lang.Throwable -> L57
            long r3 = r0 - r3
            r7.writeContinuationFrames(r8, r3)     // Catch: java.lang.Throwable -> L57
        L4d:
            monitor-exit(r7)
            return
        L4f:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L57
            throw r0     // Catch: java.lang.Throwable -> L57
        L57:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L57
            throw r8
    }

    public final synchronized void rstStream(int r4, okhttp3.internal.http2.ErrorCode r5) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "errorCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)     // Catch: java.lang.Throwable -> L45
            boolean r0 = r3.closed     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L3d
            int r0 = r5.getHttpCode()     // Catch: java.lang.Throwable -> L45
            r1 = -1
            r2 = 0
            if (r0 == r1) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = r2
        L15:
            if (r0 == 0) goto L31
        L1c:
            r0 = 4
            r1 = 3
            r3.frameHeader(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L45
            okio.BufferedSink r0 = r3.sink     // Catch: java.lang.Throwable -> L45
            int r1 = r5.getHttpCode()     // Catch: java.lang.Throwable -> L45
            r0.writeInt(r1)     // Catch: java.lang.Throwable -> L45
            okio.BufferedSink r0 = r3.sink     // Catch: java.lang.Throwable -> L45
            r0.flush()     // Catch: java.lang.Throwable -> L45
            monitor-exit(r3)
            return
        L31:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L45
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L45
            throw r1     // Catch: java.lang.Throwable -> L45
        L3d:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> L45
        L45:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L45
            throw r4
    }

    public final synchronized void settings(okhttp3.internal.http2.Settings r6) throws java.io.IOException {
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "settings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)     // Catch: java.lang.Throwable -> L4d
            boolean r0 = r5.closed     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto L45
        Lc:
            int r0 = r6.size()     // Catch: java.lang.Throwable -> L4d
            int r0 = r0 * 6
            r1 = 4
            r2 = 0
            r5.frameHeader(r2, r0, r1, r2)     // Catch: java.lang.Throwable -> L4d
            r0 = 0
        L1a:
            r2 = 10
            if (r0 >= r2) goto L3e
            boolean r2 = r6.isSet(r0)     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L3b
            switch(r0) {
                case 4: goto L2b;
                case 7: goto L29;
                default: goto L27;
            }     // Catch: java.lang.Throwable -> L4d
        L27:
            r2 = r0
            goto L2c
        L29:
            r2 = r1
            goto L2c
        L2b:
            r2 = 3
        L2c:
            okio.BufferedSink r3 = r5.sink     // Catch: java.lang.Throwable -> L4d
            r3.writeShort(r2)     // Catch: java.lang.Throwable -> L4d
            okio.BufferedSink r3 = r5.sink     // Catch: java.lang.Throwable -> L4d
            int r4 = r6.get(r0)     // Catch: java.lang.Throwable -> L4d
            r3.writeInt(r4)     // Catch: java.lang.Throwable -> L4d
        L3b:
            int r0 = r0 + 1
            goto L1a
        L3e:
            okio.BufferedSink r0 = r5.sink     // Catch: java.lang.Throwable -> L4d
            r0.flush()     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r5)
            return
        L45:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4d
            throw r0     // Catch: java.lang.Throwable -> L4d
        L4d:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4d
            throw r6
    }

    public final synchronized void windowUpdate(int r5, long r6) throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.closed     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L4e
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L15
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 == 0) goto L30
        L1d:
            r0 = 4
            r2 = 8
            r4.frameHeader(r5, r0, r2, r1)     // Catch: java.lang.Throwable -> L56
            okio.BufferedSink r0 = r4.sink     // Catch: java.lang.Throwable -> L56
            int r1 = (int) r6     // Catch: java.lang.Throwable -> L56
            r0.writeInt(r1)     // Catch: java.lang.Throwable -> L56
            okio.BufferedSink r0 = r4.sink     // Catch: java.lang.Throwable -> L56
            r0.flush()     // Catch: java.lang.Throwable -> L56
            monitor-exit(r4)
            return
        L30:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r1.<init>()     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L56
            java.lang.StringBuilder r1 = r1.append(r6)     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L56
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L56
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L56
            throw r0     // Catch: java.lang.Throwable -> L56
        L4e:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L56
            throw r0     // Catch: java.lang.Throwable -> L56
        L56:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L56
            throw r5
    }
}
