package okhttp3.internal.http2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Http2Writer implements java.io.Closeable {
    public static final okhttp3.internal.http2.Http2Writer.Companion Companion = null;
    private static final java.util.logging.Logger logger = null;
    private final boolean client;
    private boolean closed;
    private final okio.Buffer hpackBuffer;
    private final okhttp3.internal.http2.Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final okio.BufferedSink sink;

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

    public Http2Writer(okio.BufferedSink r7, boolean r8) {
            r6 = this;
            r7.getClass()
            r6.<init>()
            r6.sink = r7
            r6.client = r8
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            r6.hpackBuffer = r3
            r7 = 16384(0x4000, float:2.2959E-41)
            r6.maxFrameSize = r7
            okhttp3.internal.http2.Hpack$Writer r0 = new okhttp3.internal.http2.Hpack$Writer
            r4 = 3
            r5 = 0
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            r6.hpackWriter = r0
            return
    }

    private final void writeContinuationFrames(int r6, long r7) {
            r5 = this;
        L0:
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L23
            int r2 = r5.maxFrameSize
            long r2 = (long) r2
            long r2 = java.lang.Math.min(r2, r7)
            long r7 = r7 - r2
            int r4 = (int) r2
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L15
            r0 = 4
            goto L16
        L15:
            r0 = 0
        L16:
            r1 = 9
            r5.frameHeader(r6, r4, r1, r0)
            okio.BufferedSink r0 = r5.sink
            okio.Buffer r1 = r5.hpackBuffer
            r0.write(r1, r2)
            goto L0
        L23:
            return
    }

    public final synchronized void applyAndAckSettings(okhttp3.internal.http2.Settings r3) {
            r2 = this;
            monitor-enter(r2)
            r3.getClass()     // Catch: java.lang.Throwable -> L21
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L30
            int r0 = r2.maxFrameSize     // Catch: java.lang.Throwable -> L21
            int r0 = r3.getMaxFrameSize(r0)     // Catch: java.lang.Throwable -> L21
            r2.maxFrameSize = r0     // Catch: java.lang.Throwable -> L21
            int r0 = r3.getHeaderTableSize()     // Catch: java.lang.Throwable -> L21
            r1 = -1
            if (r0 == r1) goto L23
            okhttp3.internal.http2.Hpack$Writer r0 = r2.hpackWriter     // Catch: java.lang.Throwable -> L21
            int r3 = r3.getHeaderTableSize()     // Catch: java.lang.Throwable -> L21
            r0.resizeHeaderTable(r3)     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r3 = move-exception
            goto L38
        L23:
            r3 = 4
            r0 = 1
            r1 = 0
            r2.frameHeader(r1, r1, r3, r0)     // Catch: java.lang.Throwable -> L21
            okio.BufferedSink r3 = r2.sink     // Catch: java.lang.Throwable -> L21
            r3.flush()     // Catch: java.lang.Throwable -> L21
            monitor-exit(r2)
            return
        L30:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = "closed"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L21
            throw r3     // Catch: java.lang.Throwable -> L21
        L38:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            throw r3
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
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

    public final synchronized void connectionPreface() {
            r3 = this;
            java.lang.String r0 = ">> CONNECTION "
            monitor-enter(r3)
            boolean r1 = r3.closed     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L44
            boolean r1 = r3.client     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto Ld
            monitor-exit(r3)
            return
        Ld:
            java.util.logging.Logger r1 = okhttp3.internal.http2.Http2Writer.logger     // Catch: java.lang.Throwable -> L34
            java.util.logging.Level r2 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L34
            boolean r2 = r1.isLoggable(r2)     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L36
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L34
            okio.ByteString r0 = okhttp3.internal.http2.Http2.CONNECTION_PREFACE     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = r0.hex()     // Catch: java.lang.Throwable -> L34
            r2.append(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L34
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = okhttp3.internal.Util.format(r0, r2)     // Catch: java.lang.Throwable -> L34
            r1.fine(r0)     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r0 = move-exception
            goto L4c
        L36:
            okio.BufferedSink r0 = r3.sink     // Catch: java.lang.Throwable -> L34
            okio.ByteString r1 = okhttp3.internal.http2.Http2.CONNECTION_PREFACE     // Catch: java.lang.Throwable -> L34
            r0.write(r1)     // Catch: java.lang.Throwable -> L34
            okio.BufferedSink r0 = r3.sink     // Catch: java.lang.Throwable -> L34
            r0.flush()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r3)
            return
        L44:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L34
            throw r0     // Catch: java.lang.Throwable -> L34
        L4c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            throw r0
    }

    public final synchronized void data(boolean r2, int r3, okio.Buffer r4, int r5) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.closed     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto Lc
            r1.dataFrame(r3, r2, r4, r5)     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return
        La:
            r2 = move-exception
            goto L14
        Lc:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> La
            java.lang.String r3 = "closed"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> La
            throw r2     // Catch: java.lang.Throwable -> La
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r2
    }

    public final void dataFrame(int r3, int r4, okio.Buffer r5, int r6) {
            r2 = this;
            r0 = 0
            r2.frameHeader(r3, r6, r0, r4)
            if (r6 <= 0) goto Lf
            okio.BufferedSink r3 = r2.sink
            r5.getClass()
            long r0 = (long) r6
            r3.write(r5, r0)
        Lf:
            return
    }

    public final synchronized void flush() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto Le
            okio.BufferedSink r0 = r2.sink     // Catch: java.lang.Throwable -> Lc
            r0.flush()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        Lc:
            r0 = move-exception
            goto L16
        Le:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0     // Catch: java.lang.Throwable -> Lc
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    public final void frameHeader(int r9, int r10, int r11, int r12) {
            r8 = this;
            java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Writer.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r1 = r0.isLoggable(r1)
            if (r1 == 0) goto L19
            okhttp3.internal.http2.Http2 r2 = okhttp3.internal.http2.Http2.INSTANCE
            r3 = 0
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            java.lang.String r9 = r2.frameLog(r3, r4, r5, r6, r7)
            r0.fine(r9)
            goto L1d
        L19:
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
        L1d:
            int r9 = r8.maxFrameSize
            if (r5 > r9) goto L4d
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r9 & r4
            if (r9 != 0) goto L43
            okio.BufferedSink r9 = r8.sink
            okhttp3.internal.Util.writeMedium(r9, r5)
            okio.BufferedSink r9 = r8.sink
            r10 = r6 & 255(0xff, float:3.57E-43)
            r9.writeByte(r10)
            okio.BufferedSink r9 = r8.sink
            r10 = r7 & 255(0xff, float:3.57E-43)
            r9.writeByte(r10)
            okio.BufferedSink r9 = r8.sink
            r10 = 2147483647(0x7fffffff, float:NaN)
            r10 = r10 & r4
            r9.writeInt(r10)
            return
        L43:
            java.lang.String r9 = "reserved bit set: "
            java.lang.String r9 = eh.a.l(r4, r9)
            j8.o.q(r9)
            return
        L4d:
            int r9 = r8.maxFrameSize
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "FRAME_SIZE_ERROR length > "
            r10.<init>(r11)
            r10.append(r9)
            java.lang.String r9 = ": "
            r10.append(r9)
            r10.append(r5)
            java.lang.String r9 = r10.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    public final okhttp3.internal.http2.Hpack.Writer getHpackWriter() {
            r1 = this;
            okhttp3.internal.http2.Hpack$Writer r0 = r1.hpackWriter
            return r0
    }

    public final synchronized void goAway(int r4, okhttp3.internal.http2.ErrorCode r5, byte[] r6) {
            r3 = this;
            monitor-enter(r3)
            r5.getClass()     // Catch: java.lang.Throwable -> L34
            r6.getClass()     // Catch: java.lang.Throwable -> L34
            boolean r0 = r3.closed     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L45
            int r0 = r5.getHttpCode()     // Catch: java.lang.Throwable -> L34
            r1 = -1
            if (r0 == r1) goto L3d
            int r0 = r6.length     // Catch: java.lang.Throwable -> L34
            int r0 = r0 + 8
            r1 = 7
            r2 = 0
            r3.frameHeader(r2, r0, r1, r2)     // Catch: java.lang.Throwable -> L34
            okio.BufferedSink r0 = r3.sink     // Catch: java.lang.Throwable -> L34
            r0.writeInt(r4)     // Catch: java.lang.Throwable -> L34
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L34
            int r5 = r5.getHttpCode()     // Catch: java.lang.Throwable -> L34
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> L34
            int r4 = r6.length     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L2c
            r2 = 1
        L2c:
            if (r2 != 0) goto L36
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L34
            r4.write(r6)     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r4 = move-exception
            goto L4d
        L36:
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L34
            r4.flush()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r3)
            return
        L3d:
            java.lang.String r4 = "errorCode.httpCode == -1"
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L34
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L34
            throw r5     // Catch: java.lang.Throwable -> L34
        L45:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34
            throw r4     // Catch: java.lang.Throwable -> L34
        L4d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            throw r4
    }

    public final synchronized void headers(boolean r7, int r8, java.util.List<okhttp3.internal.http2.Header> r9) {
            r6 = this;
            monitor-enter(r6)
            r9.getClass()     // Catch: java.lang.Throwable -> L38
            boolean r0 = r6.closed     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L3c
            okhttp3.internal.http2.Hpack$Writer r0 = r6.hpackWriter     // Catch: java.lang.Throwable -> L38
            r0.writeHeaders(r9)     // Catch: java.lang.Throwable -> L38
            okio.Buffer r9 = r6.hpackBuffer     // Catch: java.lang.Throwable -> L38
            long r0 = r9.size()     // Catch: java.lang.Throwable -> L38
            int r9 = r6.maxFrameSize     // Catch: java.lang.Throwable -> L38
            long r2 = (long) r9     // Catch: java.lang.Throwable -> L38
            long r2 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L38
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 != 0) goto L20
            r4 = 4
            goto L21
        L20:
            r4 = 0
        L21:
            if (r7 == 0) goto L25
            r4 = r4 | 1
        L25:
            int r7 = (int) r2     // Catch: java.lang.Throwable -> L38
            r5 = 1
            r6.frameHeader(r8, r7, r5, r4)     // Catch: java.lang.Throwable -> L38
            okio.BufferedSink r7 = r6.sink     // Catch: java.lang.Throwable -> L38
            okio.Buffer r4 = r6.hpackBuffer     // Catch: java.lang.Throwable -> L38
            r7.write(r4, r2)     // Catch: java.lang.Throwable -> L38
            if (r9 <= 0) goto L3a
            long r0 = r0 - r2
            r6.writeContinuationFrames(r8, r0)     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            r7 = move-exception
            goto L44
        L3a:
            monitor-exit(r6)
            return
        L3c:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = "closed"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L38
            throw r7     // Catch: java.lang.Throwable -> L38
        L44:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L38
            throw r7
    }

    public final int maxDataLength() {
            r1 = this;
            int r0 = r1.maxFrameSize
            return r0
    }

    public final synchronized void ping(boolean r4, int r5, int r6) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.closed     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L1f
            r0 = 8
            r1 = 6
            r2 = 0
            r3.frameHeader(r2, r0, r1, r4)     // Catch: java.lang.Throwable -> L1d
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L1d
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> L1d
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L1d
            r4.writeInt(r6)     // Catch: java.lang.Throwable -> L1d
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L1d
            r4.flush()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return
        L1d:
            r4 = move-exception
            goto L27
        L1f:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1d
            throw r4     // Catch: java.lang.Throwable -> L1d
        L27:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r4
    }

    public final synchronized void pushPromise(int r8, int r9, java.util.List<okhttp3.internal.http2.Header> r10) {
            r7 = this;
            monitor-enter(r7)
            r10.getClass()     // Catch: java.lang.Throwable -> L43
            boolean r0 = r7.closed     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L47
            okhttp3.internal.http2.Hpack$Writer r0 = r7.hpackWriter     // Catch: java.lang.Throwable -> L43
            r0.writeHeaders(r10)     // Catch: java.lang.Throwable -> L43
            okio.Buffer r10 = r7.hpackBuffer     // Catch: java.lang.Throwable -> L43
            long r0 = r10.size()     // Catch: java.lang.Throwable -> L43
            int r10 = r7.maxFrameSize     // Catch: java.lang.Throwable -> L43
            long r2 = (long) r10     // Catch: java.lang.Throwable -> L43
            r4 = 4
            long r2 = r2 - r4
            long r2 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L43
            int r10 = (int) r2     // Catch: java.lang.Throwable -> L43
            int r2 = r10 + 4
            long r3 = (long) r10     // Catch: java.lang.Throwable -> L43
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 != 0) goto L27
            r5 = 4
            goto L28
        L27:
            r5 = 0
        L28:
            r6 = 5
            r7.frameHeader(r8, r2, r6, r5)     // Catch: java.lang.Throwable -> L43
            okio.BufferedSink r2 = r7.sink     // Catch: java.lang.Throwable -> L43
            r5 = 2147483647(0x7fffffff, float:NaN)
            r9 = r9 & r5
            r2.writeInt(r9)     // Catch: java.lang.Throwable -> L43
            okio.BufferedSink r9 = r7.sink     // Catch: java.lang.Throwable -> L43
            okio.Buffer r2 = r7.hpackBuffer     // Catch: java.lang.Throwable -> L43
            r9.write(r2, r3)     // Catch: java.lang.Throwable -> L43
            if (r10 <= 0) goto L45
            long r0 = r0 - r3
            r7.writeContinuationFrames(r8, r0)     // Catch: java.lang.Throwable -> L43
            goto L45
        L43:
            r8 = move-exception
            goto L4f
        L45:
            monitor-exit(r7)
            return
        L47:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L43
            java.lang.String r9 = "closed"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L43
            throw r8     // Catch: java.lang.Throwable -> L43
        L4f:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L43
            throw r8
    }

    public final synchronized void rstStream(int r4, okhttp3.internal.http2.ErrorCode r5) {
            r3 = this;
            monitor-enter(r3)
            r5.getClass()     // Catch: java.lang.Throwable -> L25
            boolean r0 = r3.closed     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L2f
            int r0 = r5.getHttpCode()     // Catch: java.lang.Throwable -> L25
            r1 = -1
            if (r0 == r1) goto L27
            r0 = 3
            r1 = 0
            r2 = 4
            r3.frameHeader(r4, r2, r0, r1)     // Catch: java.lang.Throwable -> L25
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L25
            int r5 = r5.getHttpCode()     // Catch: java.lang.Throwable -> L25
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> L25
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L25
            r4.flush()     // Catch: java.lang.Throwable -> L25
            monitor-exit(r3)
            return
        L25:
            r4 = move-exception
            goto L37
        L27:
            java.lang.String r4 = "Failed requirement."
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L25
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L25
            throw r5     // Catch: java.lang.Throwable -> L25
        L2f:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L25
            throw r4     // Catch: java.lang.Throwable -> L25
        L37:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            throw r4
    }

    public final synchronized void settings(okhttp3.internal.http2.Settings r5) {
            r4 = this;
            monitor-enter(r4)
            r5.getClass()     // Catch: java.lang.Throwable -> L36
            boolean r0 = r4.closed     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L42
            int r0 = r5.size()     // Catch: java.lang.Throwable -> L36
            int r0 = r0 * 6
            r1 = 4
            r2 = 0
            r4.frameHeader(r2, r0, r1, r2)     // Catch: java.lang.Throwable -> L36
        L13:
            r0 = 10
            if (r2 >= r0) goto L3b
            boolean r0 = r5.isSet(r2)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            if (r2 == r1) goto L26
            r0 = 7
            if (r2 == r0) goto L24
            r0 = r2
            goto L27
        L24:
            r0 = r1
            goto L27
        L26:
            r0 = 3
        L27:
            okio.BufferedSink r3 = r4.sink     // Catch: java.lang.Throwable -> L36
            r3.writeShort(r0)     // Catch: java.lang.Throwable -> L36
            okio.BufferedSink r0 = r4.sink     // Catch: java.lang.Throwable -> L36
            int r3 = r5.get(r2)     // Catch: java.lang.Throwable -> L36
            r0.writeInt(r3)     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r5 = move-exception
            goto L4a
        L38:
            int r2 = r2 + 1
            goto L13
        L3b:
            okio.BufferedSink r5 = r4.sink     // Catch: java.lang.Throwable -> L36
            r5.flush()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L42:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = "closed"
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L36
            throw r5     // Catch: java.lang.Throwable -> L36
        L4a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r5
    }

    public final synchronized void windowUpdate(int r4, long r5) {
            r3 = this;
            java.lang.String r0 = "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: "
            monitor-enter(r3)
            boolean r1 = r3.closed     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L40
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L2a
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L2a
            r0 = 8
            r1 = 0
            r2 = 4
            r3.frameHeader(r4, r2, r0, r1)     // Catch: java.lang.Throwable -> L28
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L28
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L28
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> L28
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L28
            r4.flush()     // Catch: java.lang.Throwable -> L28
            monitor-exit(r3)
            return
        L28:
            r4 = move-exception
            goto L48
        L2a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L28
            r4.append(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L28
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L28
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L28
            throw r5     // Catch: java.lang.Throwable -> L28
        L40:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L28
            throw r4     // Catch: java.lang.Throwable -> L28
        L48:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            throw r4
    }
}
