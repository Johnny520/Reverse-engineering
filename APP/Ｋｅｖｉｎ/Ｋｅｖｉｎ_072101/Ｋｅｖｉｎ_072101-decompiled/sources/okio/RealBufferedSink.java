package okio;

/* JADX INFO: compiled from: RealBufferedSink.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0001H\u0016J\b\u0010\u0011\u001a\u00020\u0001H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001eH\u0016J \u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001bH\u0016J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#H\u0016J \u0010\u001a\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001bH\u0016J\u0018\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020$2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010%\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020$H\u0016J\u0010\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u001bH\u0016J\u0010\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u0010*\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u0010+\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u001bH\u0016J\u0010\u0010-\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u001bH\u0016J\u0010\u0010.\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u0010/\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u001bH\u0016J\u0010\u00102\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u001bH\u0016J\u0018\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u000206H\u0016J(\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001b2\u0006\u00105\u001a\u000206H\u0016J\u0010\u00109\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u0019H\u0016J \u00109\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001bH\u0016J\u0010\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u001bH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, m115d2 = {"Lokio/RealBufferedSink;", "Lokio/BufferedSink;", "sink", "Lokio/Sink;", "(Lokio/Sink;)V", "buffer", "Lokio/Buffer;", "getBuffer$annotations", "()V", "getBuffer", "()Lokio/Buffer;", "bufferField", "closed", "", "close", "", "emit", "emitCompleteSegments", "flush", "isOpen", "outputStream", "Ljava/io/OutputStream;", "timeout", "Lokio/Timeout;", "toString", "", "write", "", "source", "Ljava/nio/ByteBuffer;", "", "offset", "byteCount", "", "byteString", "Lokio/ByteString;", "Lokio/Source;", "writeAll", "writeByte", "b", "writeDecimalLong", "v", "writeHexadecimalUnsignedLong", "writeInt", "i", "writeIntLe", "writeLong", "writeLongLe", "writeShort", "s", "writeShortLe", "writeString", "string", "charset", "Ljava/nio/charset/Charset;", "beginIndex", "endIndex", "writeUtf8", "writeUtf8CodePoint", "codePoint", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class RealBufferedSink implements okio.BufferedSink {
    public final okio.Buffer bufferField;
    public boolean closed;
    public final okio.Sink sink;


    public RealBufferedSink(okio.Sink r2) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.sink = r2
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r1.bufferField = r0
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
            r8 = this;
            r0 = r8
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L3c
            r2 = 0
            r3 = r0
            r4 = 0
            okio.Buffer r5 = r3.bufferField     // Catch: java.lang.Throwable -> L28
            long r3 = r5.size()     // Catch: java.lang.Throwable -> L28
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L2a
            okio.Sink r3 = r0.sink     // Catch: java.lang.Throwable -> L28
            r4 = r0
            r5 = 0
            okio.Buffer r6 = r4.bufferField     // Catch: java.lang.Throwable -> L28
            r4 = r0
            r5 = 0
            okio.Buffer r7 = r4.bufferField     // Catch: java.lang.Throwable -> L28
            long r4 = r7.size()     // Catch: java.lang.Throwable -> L28
            r3.write(r6, r4)     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r3 = move-exception
            r2 = r3
        L2a:
            okio.Sink r3 = r0.sink     // Catch: java.lang.Throwable -> L31
            r3.close()     // Catch: java.lang.Throwable -> L31
            goto L35
        L31:
            r3 = move-exception
            if (r2 != 0) goto L35
            r2 = r3
        L35:
            r3 = 1
            r0.closed = r3
            if (r2 != 0) goto L3b
            goto L3c
        L3b:
            throw r2
        L3c:
            return
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink emit() {
            r7 = this;
            r0 = r7
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L20
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            long r2 = r2.size()
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L1d
            okio.Sink r4 = r0.sink
            r5 = r0
            r6 = 0
            okio.Buffer r5 = r5.bufferField
            r4.write(r5, r2)
        L1d:
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
        L20:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink emitCompleteSegments() {
            r7 = this;
            r0 = r7
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L20
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            long r2 = r2.completeSegmentByteCount()
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L1d
            okio.Sink r4 = r0.sink
            r5 = r0
            r6 = 0
            okio.Buffer r5 = r5.bufferField
            r4.write(r5, r2)
        L1d:
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
        L20:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
            r6 = this;
            r0 = r6
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L2c
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            long r2 = r2.size()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L25
            okio.Sink r2 = r0.sink
            r3 = r0
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            r4 = r0
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            long r4 = r4.size()
            r2.write(r3, r4)
        L25:
            okio.Sink r2 = r0.sink
            r2.flush()
            return
        L2c:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    public okio.Buffer getBuffer() {
            r2 = this;
            r0 = 0
            okio.Buffer r1 = r2.bufferField
            return r1
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
            java.io.OutputStream r0 = (java.io.OutputStream) r0
            return r0
    }

    @Override // okio.Sink
    public okio.Timeout timeout() {
            r3 = this;
            r0 = r3
            r1 = 0
            okio.Sink r2 = r0.sink
            okio.Timeout r0 = r2.timeout()
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            r0 = r4
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "buffer("
            java.lang.StringBuilder r2 = r2.append(r3)
            okio.Sink r3 = r0.sink
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = 41
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer r3) {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r2.closed
            if (r0 != 0) goto L15
            r0 = r2
            r1 = 0
            okio.Buffer r0 = r0.bufferField
            int r0 = r0.write(r3)
            r2.emitCompleteSegments()
            return r0
        L15:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink write(okio.ByteString r5) {
            r4 = this;
            java.lang.String r0 = "byteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L17
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r2.write(r5)
            okio.BufferedSink r0 = r0.emitCompleteSegments()
            return r0
        L17:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink write(okio.ByteString r5, int r6, int r7) {
            r4 = this;
            java.lang.String r0 = "byteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L17
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r2.write(r5, r6, r7)
            okio.BufferedSink r0 = r0.emitCompleteSegments()
            return r0
        L17:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink write(okio.Source r9, long r10) {
            r8 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r8
            r1 = 0
            r2 = r10
        L8:
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L27
            r4 = r0
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            long r4 = r9.read(r4, r2)
            r6 = -1
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L21
            long r2 = r2 - r4
            r0.emitCompleteSegments()
            goto L8
        L21:
            java.io.EOFException r6 = new java.io.EOFException
            r6.<init>()
            throw r6
        L27:
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink write(byte[] r5) {
            r4 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L17
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r2.write(r5)
            okio.BufferedSink r0 = r0.emitCompleteSegments()
            return r0
        L17:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink write(byte[] r5, int r6, int r7) {
            r4 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L17
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r2.write(r5, r6, r7)
            okio.BufferedSink r0 = r0.emitCompleteSegments()
            return r0
        L17:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.Sink
    public void write(okio.Buffer r5, long r6) {
            r4 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L17
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r2.write(r5, r6)
            r0.emitCompleteSegments()
            return
        L17:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    public long writeAll(okio.Source r9) {
            r8 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r8
            r1 = 0
            r2 = 0
        L9:
            r4 = r0
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            r5 = 8192(0x2000, double:4.0474E-320)
            long r4 = r9.read(r4, r5)
            r6 = -1
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L1f
            long r2 = r2 + r4
            r0.emitCompleteSegments()
            goto L9
        L1f:
            return r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeByte(int r5) {
            r4 = this;
            r0 = r4
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L12
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r2.writeByte(r5)
            okio.BufferedSink r0 = r0.emitCompleteSegments()
            return r0
        L12:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeDecimalLong(long r5) {
            r4 = this;
            r0 = r4
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L12
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r2.writeDecimalLong(r5)
            okio.BufferedSink r0 = r0.emitCompleteSegments()
            return r0
        L12:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeHexadecimalUnsignedLong(long r5) {
            r4 = this;
            r0 = r4
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L12
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r2.writeHexadecimalUnsignedLong(r5)
            okio.BufferedSink r0 = r0.emitCompleteSegments()
            return r0
        L12:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeInt(int r5) {
            r4 = this;
            r0 = r4
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L12
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r2.writeInt(r5)
            okio.BufferedSink r0 = r0.emitCompleteSegments()
            return r0
        L12:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeIntLe(int r5) {
            r4 = this;
            r0 = r4
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L12
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r2.writeIntLe(r5)
            okio.BufferedSink r0 = r0.emitCompleteSegments()
            return r0
        L12:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeLong(long r5) {
            r4 = this;
            r0 = r4
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L12
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r2.writeLong(r5)
            okio.BufferedSink r0 = r0.emitCompleteSegments()
            return r0
        L12:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeLongLe(long r5) {
            r4 = this;
            r0 = r4
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L12
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r2.writeLongLe(r5)
            okio.BufferedSink r0 = r0.emitCompleteSegments()
            return r0
        L12:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeShort(int r5) {
            r4 = this;
            r0 = r4
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L12
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r2.writeShort(r5)
            okio.BufferedSink r0 = r0.emitCompleteSegments()
            return r0
        L12:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeShortLe(int r5) {
            r4 = this;
            r0 = r4
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L12
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r2.writeShortLe(r5)
            okio.BufferedSink r0 = r0.emitCompleteSegments()
            return r0
        L12:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeString(java.lang.String r3, int r4, int r5, java.nio.charset.Charset r6) {
            r2 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = r2.closed
            if (r0 != 0) goto L1a
            r0 = r2
            r1 = 0
            okio.Buffer r0 = r0.bufferField
            r0.writeString(r3, r4, r5, r6)
            okio.BufferedSink r0 = r2.emitCompleteSegments()
            return r0
        L1a:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeString(java.lang.String r3, java.nio.charset.Charset r4) {
            r2 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r2.closed
            if (r0 != 0) goto L1a
            r0 = r2
            r1 = 0
            okio.Buffer r0 = r0.bufferField
            r0.writeString(r3, r4)
            okio.BufferedSink r0 = r2.emitCompleteSegments()
            return r0
        L1a:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeUtf8(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L17
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r2.writeUtf8(r5)
            okio.BufferedSink r0 = r0.emitCompleteSegments()
            return r0
        L17:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeUtf8(java.lang.String r5, int r6, int r7) {
            r4 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L17
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r2.writeUtf8(r5, r6, r7)
            okio.BufferedSink r0 = r0.emitCompleteSegments()
            return r0
        L17:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeUtf8CodePoint(int r5) {
            r4 = this;
            r0 = r4
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L12
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r2.writeUtf8CodePoint(r5)
            okio.BufferedSink r0 = r0.emitCompleteSegments()
            return r0
        L12:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }
}
