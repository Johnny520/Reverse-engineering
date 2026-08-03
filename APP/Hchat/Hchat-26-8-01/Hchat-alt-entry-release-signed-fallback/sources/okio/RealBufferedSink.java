package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RealBufferedSink implements okio.BufferedSink {
    public final okio.Buffer bufferField;
    public boolean closed;
    public final okio.Sink sink;


    public RealBufferedSink(okio.Sink r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.sink = r1
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r0.bufferField = r1
            return
    }

    public static /* synthetic */ void getBuffer$annotations() {
            return
    }

    @Override // okio.BufferedSink
    public okio.Buffer buffer() {
            r1 = this;
            okio.Buffer r0 = r1.bufferField
            return r0
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r4 = this;
            boolean r0 = r4.closed
            if (r0 != 0) goto L30
            okio.Buffer r0 = r4.bufferField     // Catch: java.lang.Throwable -> L1c
            long r0 = r0.size()     // Catch: java.lang.Throwable -> L1c
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1e
            okio.Sink r0 = r4.sink     // Catch: java.lang.Throwable -> L1c
            okio.Buffer r1 = r4.bufferField     // Catch: java.lang.Throwable -> L1c
            long r2 = r1.size()     // Catch: java.lang.Throwable -> L1c
            r0.write(r1, r2)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r0 = move-exception
            goto L1f
        L1e:
            r0 = 0
        L1f:
            okio.Sink r1 = r4.sink     // Catch: java.lang.Throwable -> L25
            r1.close()     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r1 = move-exception
            if (r0 != 0) goto L29
            r0 = r1
        L29:
            r1 = 1
            r4.closed = r1
            if (r0 != 0) goto L2f
            goto L30
        L2f:
            throw r0
        L30:
            return
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink emit() {
            r4 = this;
            boolean r0 = r4.closed
            if (r0 != 0) goto L18
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L17
            okio.Sink r2 = r4.sink
            okio.Buffer r3 = r4.bufferField
            r2.write(r3, r0)
        L17:
            return r4
        L18:
            java.lang.String r0 = "closed"
            j8.o.A(r0)
            r0 = 0
            return r0
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink emitCompleteSegments() {
            r4 = this;
            boolean r0 = r4.closed
            if (r0 != 0) goto L18
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.completeSegmentByteCount()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L17
            okio.Sink r2 = r4.sink
            okio.Buffer r3 = r4.bufferField
            r2.write(r3, r0)
        L17:
            return r4
        L18:
            java.lang.String r0 = "closed"
            j8.o.A(r0)
            r0 = 0
            return r0
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
            r4 = this;
            boolean r0 = r4.closed
            if (r0 != 0) goto L21
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1b
            okio.Sink r0 = r4.sink
            okio.Buffer r1 = r4.bufferField
            long r2 = r1.size()
            r0.write(r1, r2)
        L1b:
            okio.Sink r0 = r4.sink
            r0.flush()
            return
        L21:
            java.lang.String r0 = "closed"
            j8.o.A(r0)
            return
    }

    @Override // okio.BufferedSink
    public okio.Buffer getBuffer() {
            r1 = this;
            okio.Buffer r0 = r1.bufferField
            return r0
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r1 = this;
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            return r0
    }

    @Override // okio.BufferedSink
    public java.io.OutputStream outputStream() {
            r1 = this;
            okio.RealBufferedSink$outputStream$1 r0 = new okio.RealBufferedSink$outputStream$1
            r0.<init>(r1)
            return r0
    }

    @Override // okio.Sink
    public okio.Timeout timeout() {
            r1 = this;
            okio.Sink r0 = r1.sink
            okio.Timeout r0 = r0.timeout()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "buffer("
            r0.<init>(r1)
            okio.Sink r1 = r2.sink
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer r2) {
            r1 = this;
            r2.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L11
            okio.Buffer r0 = r1.bufferField
            int r2 = r0.write(r2)
            r1.emitCompleteSegments()
            return r2
        L11:
            java.lang.String r2 = "closed"
            j8.o.A(r2)
            r2 = 0
            return r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink write(okio.ByteString r2) {
            r1 = this;
            r2.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L11
            okio.Buffer r0 = r1.bufferField
            r0.write(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L11:
            java.lang.String r2 = "closed"
            j8.o.A(r2)
            r2 = 0
            return r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink write(okio.ByteString r2, int r3, int r4) {
            r1 = this;
            r2.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L11
            okio.Buffer r0 = r1.bufferField
            r0.write(r2, r3, r4)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L11:
            java.lang.String r2 = "closed"
            j8.o.A(r2)
            r2 = 0
            return r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink write(okio.Source r5, long r6) {
            r4 = this;
            r5.getClass()
        L3:
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1f
            okio.Buffer r0 = r4.bufferField
            long r0 = r5.read(r0, r6)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1a
            long r6 = r6 - r0
            r4.emitCompleteSegments()
            goto L3
        L1a:
            j8.o.a()
            r5 = 0
            return r5
        L1f:
            return r4
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink write(byte[] r2) {
            r1 = this;
            r2.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L11
            okio.Buffer r0 = r1.bufferField
            r0.write(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L11:
            java.lang.String r2 = "closed"
            j8.o.A(r2)
            r2 = 0
            return r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink write(byte[] r2, int r3, int r4) {
            r1 = this;
            r2.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L11
            okio.Buffer r0 = r1.bufferField
            r0.write(r2, r3, r4)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L11:
            java.lang.String r2 = "closed"
            j8.o.A(r2)
            r2 = 0
            return r2
    }

    @Override // okio.Sink
    public void write(okio.Buffer r2, long r3) {
            r1 = this;
            r2.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L10
            okio.Buffer r0 = r1.bufferField
            r0.write(r2, r3)
            r1.emitCompleteSegments()
            return
        L10:
            java.lang.String r2 = "closed"
            j8.o.A(r2)
            return
    }

    @Override // okio.BufferedSink
    public long writeAll(okio.Source r7) {
            r6 = this;
            r7.getClass()
            r0 = 0
        L5:
            okio.Buffer r2 = r6.bufferField
            r3 = 8192(0x2000, double:4.0474E-320)
            long r2 = r7.read(r2, r3)
            r4 = -1
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L18
            long r0 = r0 + r2
            r6.emitCompleteSegments()
            goto L5
        L18:
            return r0
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeByte(int r2) {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Le
            okio.Buffer r0 = r1.bufferField
            r0.writeByte(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        Le:
            java.lang.String r2 = "closed"
            j8.o.A(r2)
            r2 = 0
            return r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeDecimalLong(long r2) {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Le
            okio.Buffer r0 = r1.bufferField
            r0.writeDecimalLong(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        Le:
            java.lang.String r2 = "closed"
            j8.o.A(r2)
            r2 = 0
            return r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeHexadecimalUnsignedLong(long r2) {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Le
            okio.Buffer r0 = r1.bufferField
            r0.writeHexadecimalUnsignedLong(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        Le:
            java.lang.String r2 = "closed"
            j8.o.A(r2)
            r2 = 0
            return r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeInt(int r2) {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Le
            okio.Buffer r0 = r1.bufferField
            r0.writeInt(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        Le:
            java.lang.String r2 = "closed"
            j8.o.A(r2)
            r2 = 0
            return r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeIntLe(int r2) {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Le
            okio.Buffer r0 = r1.bufferField
            r0.writeIntLe(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        Le:
            java.lang.String r2 = "closed"
            j8.o.A(r2)
            r2 = 0
            return r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeLong(long r2) {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Le
            okio.Buffer r0 = r1.bufferField
            r0.writeLong(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        Le:
            java.lang.String r2 = "closed"
            j8.o.A(r2)
            r2 = 0
            return r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeLongLe(long r2) {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Le
            okio.Buffer r0 = r1.bufferField
            r0.writeLongLe(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        Le:
            java.lang.String r2 = "closed"
            j8.o.A(r2)
            r2 = 0
            return r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeShort(int r2) {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Le
            okio.Buffer r0 = r1.bufferField
            r0.writeShort(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        Le:
            java.lang.String r2 = "closed"
            j8.o.A(r2)
            r2 = 0
            return r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeShortLe(int r2) {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Le
            okio.Buffer r0 = r1.bufferField
            r0.writeShortLe(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        Le:
            java.lang.String r2 = "closed"
            j8.o.A(r2)
            r2 = 0
            return r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeString(java.lang.String r2, int r3, int r4, java.nio.charset.Charset r5) {
            r1 = this;
            r2.getClass()
            r5.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L14
            okio.Buffer r0 = r1.bufferField
            r0.writeString(r2, r3, r4, r5)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L14:
            java.lang.String r2 = "closed"
            j8.o.A(r2)
            r2 = 0
            return r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeString(java.lang.String r2, java.nio.charset.Charset r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L14
            okio.Buffer r0 = r1.bufferField
            r0.writeString(r2, r3)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L14:
            java.lang.String r2 = "closed"
            j8.o.A(r2)
            r2 = 0
            return r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeUtf8(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L11
            okio.Buffer r0 = r1.bufferField
            r0.writeUtf8(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L11:
            java.lang.String r2 = "closed"
            j8.o.A(r2)
            r2 = 0
            return r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeUtf8(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r2.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L11
            okio.Buffer r0 = r1.bufferField
            r0.writeUtf8(r2, r3, r4)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L11:
            java.lang.String r2 = "closed"
            j8.o.A(r2)
            r2 = 0
            return r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeUtf8CodePoint(int r2) {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Le
            okio.Buffer r0 = r1.bufferField
            r0.writeUtf8CodePoint(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        Le:
            java.lang.String r2 = "closed"
            j8.o.A(r2)
            r2 = 0
            return r2
    }
}
