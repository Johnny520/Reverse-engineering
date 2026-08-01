package okio;

/* JADX INFO: compiled from: RealBufferedSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\u0001H\u0016J\u0018\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J(\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020'H\u0016J \u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020'2\u0006\u0010 \u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016J\u0018\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010%\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\b\u0010+\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020'2\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010,\u001a\u00020\u0018H\u0016J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010-\u001a\u00020\u0012H\u0016J\u0010\u0010.\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020'H\u0016J\u0018\u0010.\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010/\u001a\u00020\u0012H\u0016J\b\u00100\u001a\u00020\"H\u0016J\b\u00101\u001a\u00020\"H\u0016J\b\u00102\u001a\u00020\u0012H\u0016J\b\u00103\u001a\u00020\u0012H\u0016J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u000205H\u0016J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\u0018\u00107\u001a\u0002082\u0006\u0010#\u001a\u00020\u00122\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u000208H\u0016J\u0010\u0010;\u001a\u0002082\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010<\u001a\u00020\"H\u0016J\n\u0010=\u001a\u0004\u0018\u000108H\u0016J\b\u0010>\u001a\u000208H\u0016J\u0010\u0010>\u001a\u0002082\u0006\u0010?\u001a\u00020\u0012H\u0016J\u0010\u0010@\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010A\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010F\u001a\u00020GH\u0016J\b\u0010H\u001a\u000208H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, m115d2 = {"Lokio/RealBufferedSource;", "Lokio/BufferedSource;", "source", "Lokio/Source;", "(Lokio/Source;)V", "buffer", "Lokio/Buffer;", "getBuffer$annotations", "()V", "getBuffer", "()Lokio/Buffer;", "bufferField", "closed", "", "close", "", "exhausted", "indexOf", "", "b", "", "fromIndex", "toIndex", "bytes", "Lokio/ByteString;", "indexOfElement", "targetBytes", "inputStream", "Ljava/io/InputStream;", "isOpen", "peek", "rangeEquals", "offset", "bytesOffset", "", "byteCount", "read", "sink", "Ljava/nio/ByteBuffer;", "", "readAll", "Lokio/Sink;", "readByte", "readByteArray", "readByteString", "readDecimalLong", "readFully", "readHexadecimalUnsignedLong", "readInt", "readIntLe", "readLong", "readLongLe", "readShort", "", "readShortLe", "readString", "", "charset", "Ljava/nio/charset/Charset;", "readUtf8", "readUtf8CodePoint", "readUtf8Line", "readUtf8LineStrict", "limit", "request", "require", "select", "options", "Lokio/Options;", "skip", "timeout", "Lokio/Timeout;", "toString", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class RealBufferedSource implements okio.BufferedSource {
    public final okio.Buffer bufferField;
    public boolean closed;
    public final okio.Source source;


    public RealBufferedSource(okio.Source r2) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.source = r2
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r1.bufferField = r0
            return
    }

    public static /* synthetic */ void getBuffer$annotations() {
            return
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public okio.Buffer buffer() {
            r1 = this;
            okio.Buffer r0 = r1.bufferField
            return r0
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r4 = this;
            r0 = r4
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L16
            r2 = 1
            r0.closed = r2
            okio.Source r2 = r0.source
            r2.close()
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r2.clear()
        L16:
            return
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
            r6 = this;
            r0 = r6
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L26
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            boolean r2 = r2.exhausted()
            if (r2 == 0) goto L24
            okio.Source r2 = r0.source
            r3 = r0
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            r4 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2.read(r3, r4)
            r4 = -1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L24
            r2 = 1
            goto L25
        L24:
            r2 = 0
        L25:
            return r2
        L26:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public okio.Buffer getBuffer() {
            r2 = this;
            r0 = 0
            okio.Buffer r1 = r2.bufferField
            return r1
    }

    @Override // okio.BufferedSource
    public long indexOf(byte r7) {
            r6 = this;
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = r6
            r1 = r7
            long r0 = r0.indexOf(r1, r2, r4)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOf(byte r7, long r8) {
            r6 = this;
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = r6
            r1 = r7
            r2 = r8
            long r0 = r0.indexOf(r1, r2, r4)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOf(byte r17, long r18, long r20) {
            r16 = this;
            r6 = r20
            r8 = r16
            r9 = 0
            r0 = 0
            r0 = r18
            boolean r2 = r8.closed
            if (r2 != 0) goto L81
            r2 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r3 = 0
            if (r2 > 0) goto L19
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 > 0) goto L19
            r3 = 1
        L19:
            if (r3 == 0) goto L59
            r10 = r0
        L1c:
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            r12 = -1
            if (r0 >= 0) goto L57
            r0 = r8
            r1 = 0
            okio.Buffer r0 = r0.bufferField
            r1 = r17
            r2 = r10
            r4 = r20
            long r0 = r0.indexOf(r1, r2, r4)
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L35
            r12 = r0
            goto L58
        L35:
            r2 = r8
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            long r2 = r2.size()
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 >= 0) goto L58
            okio.Source r4 = r8.source
            r5 = r8
            r14 = 0
            okio.Buffer r5 = r5.bufferField
            r14 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.read(r5, r14)
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 != 0) goto L52
            goto L58
        L52:
            long r10 = java.lang.Math.max(r10, r2)
            goto L1c
        L57:
        L58:
            return r12
        L59:
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "fromIndex="
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = " toIndex="
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L81:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSource
    public long indexOf(okio.ByteString r3) {
            r2 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            long r0 = r2.indexOf(r3, r0)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOf(okio.ByteString r16, long r17) {
            r15 = this;
            r0 = r16
            java.lang.String r1 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = r15
            r2 = 0
            r3 = r17
            boolean r5 = r1.closed
            if (r5 != 0) goto L48
        Lf:
        L10:
            r5 = r1
            r6 = 0
            okio.Buffer r5 = r5.bufferField
            long r5 = r5.indexOf(r0, r3)
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L1f
            goto L38
        L1f:
            r9 = r1
            r10 = 0
            okio.Buffer r9 = r9.bufferField
            long r9 = r9.size()
            okio.Source r11 = r1.source
            r12 = r1
            r13 = 0
            okio.Buffer r12 = r12.bufferField
            r13 = 8192(0x2000, double:4.0474E-320)
            long r11 = r11.read(r12, r13)
            int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r11 != 0) goto L39
            r5 = r7
        L38:
            return r5
        L39:
            int r7 = r16.size()
            long r7 = (long) r7
            long r7 = r9 - r7
            r11 = 1
            long r7 = r7 + r11
            long r3 = java.lang.Math.max(r3, r7)
            goto Lf
        L48:
            r5 = 0
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "closed"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    @Override // okio.BufferedSource
    public long indexOfElement(okio.ByteString r3) {
            r2 = this;
            java.lang.String r0 = "targetBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            long r0 = r2.indexOfElement(r3, r0)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOfElement(okio.ByteString r16, long r17) {
            r15 = this;
            r0 = r16
            java.lang.String r1 = "targetBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = r15
            r2 = 0
            r3 = r17
            boolean r5 = r1.closed
            if (r5 != 0) goto L3e
        Lf:
        L10:
            r5 = r1
            r6 = 0
            okio.Buffer r5 = r5.bufferField
            long r5 = r5.indexOfElement(r0, r3)
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L1f
            goto L38
        L1f:
            r9 = r1
            r10 = 0
            okio.Buffer r9 = r9.bufferField
            long r9 = r9.size()
            okio.Source r11 = r1.source
            r12 = r1
            r13 = 0
            okio.Buffer r12 = r12.bufferField
            r13 = 8192(0x2000, double:4.0474E-320)
            long r11 = r11.read(r12, r13)
            int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r11 != 0) goto L39
            r5 = r7
        L38:
            return r5
        L39:
            long r3 = java.lang.Math.max(r3, r9)
            goto Lf
        L3e:
            r5 = 0
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "closed"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    @Override // okio.BufferedSource
    public java.io.InputStream inputStream() {
            r1 = this;
            okio.RealBufferedSource$inputStream$1 r0 = new okio.RealBufferedSource$inputStream$1
            r0.<init>(r1)
            java.io.InputStream r0 = (java.io.InputStream) r0
            return r0
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r1 = this;
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            return r0
    }

    @Override // okio.BufferedSource
    public okio.BufferedSource peek() {
            r4 = this;
            r0 = r4
            r1 = 0
            okio.PeekSource r2 = new okio.PeekSource
            r3 = r0
            okio.BufferedSource r3 = (okio.BufferedSource) r3
            r2.<init>(r3)
            okio.Source r2 = (okio.Source) r2
            okio.BufferedSource r0 = okio.Okio.buffer(r2)
            return r0
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long r8, okio.ByteString r10) {
            r7 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r6 = r10.size()
            r5 = 0
            r1 = r7
            r2 = r8
            r4 = r10
            boolean r0 = r1.rangeEquals(r2, r4, r5, r6)
            return r0
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long r9, okio.ByteString r11, int r12, int r13) {
            r8 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = r8
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L45
            r2 = 0
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r3 = 0
            if (r2 < 0) goto L43
            if (r12 < 0) goto L43
            if (r13 < 0) goto L43
            int r2 = r11.size()
            int r2 = r2 - r12
            if (r2 >= r13) goto L1e
            goto L43
        L1e:
            r2 = 0
        L1f:
            if (r2 >= r13) goto L41
            long r4 = (long) r2
            long r4 = r4 + r9
            r6 = 1
            long r6 = r6 + r4
            boolean r6 = r0.request(r6)
            if (r6 != 0) goto L2d
            goto L44
        L2d:
            r6 = r0
            r7 = 0
            okio.Buffer r6 = r6.bufferField
            byte r6 = r6.getByte(r4)
            int r7 = r12 + r2
            byte r7 = r11.getByte(r7)
            if (r6 == r7) goto L3e
            goto L44
        L3e:
            int r2 = r2 + 1
            goto L1f
        L41:
            r3 = 1
            goto L44
        L43:
        L44:
            return r3
        L45:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer r5) {
            r4 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            r1 = 0
            okio.Buffer r0 = r0.bufferField
            long r0 = r0.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L27
            okio.Source r0 = r4.source
            r1 = r4
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L27
            r2 = -1
            return r2
        L27:
            r0 = r4
            r1 = 0
            okio.Buffer r0 = r0.bufferField
            int r0 = r0.read(r5)
            return r0
    }

    @Override // okio.BufferedSource
    public int read(byte[] r3) {
            r2 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r3.length
            int r0 = r2.read(r3, r0, r1)
            return r0
    }

    @Override // okio.BufferedSource
    public int read(byte[] r10, int r11, int r12) {
            r9 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = r9
            r1 = 0
            int r2 = r10.length
            long r3 = (long) r2
            long r5 = (long) r11
            long r7 = (long) r12
            okio.SegmentedByteString.checkOffsetAndCount(r3, r5, r7)
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            long r2 = r2.size()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L30
            okio.Source r2 = r0.source
            r3 = r0
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            r4 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2.read(r3, r4)
            r4 = -1
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L30
            r4 = -1
            goto L47
        L30:
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            long r2 = r2.size()
            r4 = 0
            long r5 = (long) r12
            long r5 = java.lang.Math.min(r5, r2)
            int r2 = (int) r5
            r3 = r0
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            int r4 = r3.read(r10, r11, r2)
        L47:
            return r4
    }

    @Override // okio.Source
    public long read(okio.Buffer r8, long r9) {
            r7 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r7
            r1 = 0
            r2 = 0
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 < 0) goto Lf
            r4 = 1
            goto L10
        Lf:
            r4 = 0
        L10:
            if (r4 == 0) goto L58
            boolean r4 = r0.closed
            if (r4 != 0) goto L4a
            r4 = r0
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            long r4 = r4.size()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L35
            okio.Source r2 = r0.source
            r3 = r0
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            r4 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2.read(r3, r4)
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L35
            goto L49
        L35:
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            long r2 = r2.size()
            long r2 = java.lang.Math.min(r9, r2)
            r4 = r0
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            long r4 = r4.read(r8, r2)
        L49:
            return r4
        L4a:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L58:
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "byteCount < 0: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r9)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // okio.BufferedSource
    public long readAll(okio.Sink r10) {
            r9 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = r9
            r1 = 0
            r2 = 0
        L9:
            okio.Source r4 = r0.source
            r5 = r0
            r6 = 0
            okio.Buffer r5 = r5.bufferField
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.read(r5, r6)
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 0
            if (r4 == 0) goto L32
            r4 = r0
            r7 = 0
            okio.Buffer r4 = r4.bufferField
            long r7 = r4.completeSegmentByteCount()
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 <= 0) goto L9
            long r2 = r2 + r7
            r4 = r0
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            r10.write(r4, r7)
            goto L9
        L32:
            r4 = r0
            r7 = 0
            okio.Buffer r4 = r4.bufferField
            long r7 = r4.size()
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 <= 0) goto L56
            r4 = r0
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            long r4 = r4.size()
            long r2 = r2 + r4
            r4 = r0
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            r5 = r0
            r6 = 0
            okio.Buffer r5 = r5.bufferField
            long r5 = r5.size()
            r10.write(r4, r5)
        L56:
            return r2
    }

    @Override // okio.BufferedSource
    public byte readByte() {
            r4 = this;
            r0 = r4
            r1 = 0
            r2 = 1
            r0.require(r2)
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            byte r0 = r2.readByte()
            return r0
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray() {
            r4 = this;
            r0 = r4
            r1 = 0
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            okio.Source r3 = r0.source
            r2.writeAll(r3)
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            byte[] r0 = r2.readByteArray()
            return r0
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray(long r5) {
            r4 = this;
            r0 = r4
            r1 = 0
            r0.require(r5)
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            byte[] r0 = r2.readByteArray(r5)
            return r0
    }

    @Override // okio.BufferedSource
    public okio.ByteString readByteString() {
            r4 = this;
            r0 = r4
            r1 = 0
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            okio.Source r3 = r0.source
            r2.writeAll(r3)
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            okio.ByteString r0 = r2.readByteString()
            return r0
    }

    @Override // okio.BufferedSource
    public okio.ByteString readByteString(long r5) {
            r4 = this;
            r0 = r4
            r1 = 0
            r0.require(r5)
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            okio.ByteString r0 = r2.readByteString(r5)
            return r0
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() {
            r10 = this;
            r0 = r10
            r1 = 0
            r2 = 1
            r0.require(r2)
            r4 = 0
        L9:
            long r6 = r4 + r2
            boolean r6 = r0.request(r6)
            if (r6 == 0) goto L5f
            r6 = r0
            r7 = 0
            okio.Buffer r6 = r6.bufferField
            byte r6 = r6.getByte(r4)
            r7 = 48
            if (r6 < r7) goto L21
            r7 = 57
            if (r6 <= r7) goto L2c
        L21:
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 != 0) goto L2e
            r9 = 45
            if (r6 == r9) goto L2c
            goto L2e
        L2c:
            long r4 = r4 + r2
            goto L9
        L2e:
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 == 0) goto L33
            goto L5f
        L33:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "Expected a digit or '-' but was 0x"
            java.lang.StringBuilder r3 = r3.append(r7)
            r7 = 16
            int r7 = kotlin.text.CharsKt.checkRadix(r7)
            int r7 = kotlin.text.CharsKt.checkRadix(r7)
            java.lang.String r7 = java.lang.Integer.toString(r6, r7)
            java.lang.String r8 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L5f:
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            long r0 = r2.readDecimalLong()
            return r0
    }

    @Override // okio.BufferedSource
    public void readFully(okio.Buffer r6, long r7) {
            r5 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            r1 = 0
            r0.require(r7)     // Catch: java.io.EOFException -> L14
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r2.readFully(r6, r7)
            return
        L14:
            r2 = move-exception
            r3 = r0
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            okio.Source r3 = (okio.Source) r3
            r6.writeAll(r3)
            throw r2
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] r9) {
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r8
            r1 = 0
            int r2 = r9.length     // Catch: java.io.EOFException -> L16
            long r2 = (long) r2     // Catch: java.io.EOFException -> L16
            r0.require(r2)     // Catch: java.io.EOFException -> L16
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r2.readFully(r9)
            return
        L16:
            r2 = move-exception
            r3 = 0
        L18:
            r4 = r0
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            long r4 = r4.size()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L42
            r4 = r0
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            r5 = r0
            r6 = 0
            okio.Buffer r5 = r5.bufferField
            long r5 = r5.size()
            int r5 = (int) r5
            int r4 = r4.read(r9, r3, r5)
            r5 = -1
            if (r4 == r5) goto L3c
            int r3 = r3 + r4
            goto L18
        L3c:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L42:
            throw r2
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() {
            r8 = this;
            r0 = r8
            r1 = 0
            r2 = 1
            r0.require(r2)
            r2 = 0
        L8:
            int r3 = r2 + 1
            long r3 = (long) r3
            boolean r3 = r0.request(r3)
            if (r3 == 0) goto L66
            r3 = r0
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            long r4 = (long) r2
            byte r3 = r3.getByte(r4)
            r4 = 48
            if (r3 < r4) goto L22
            r4 = 57
            if (r3 <= r4) goto L33
        L22:
            r4 = 97
            if (r3 < r4) goto L2a
            r4 = 102(0x66, float:1.43E-43)
            if (r3 <= r4) goto L33
        L2a:
            r4 = 65
            if (r3 < r4) goto L37
            r4 = 70
            if (r3 <= r4) goto L33
            goto L37
        L33:
            int r2 = r2 + 1
            goto L8
        L37:
            if (r2 == 0) goto L3a
            goto L66
        L3a:
            java.lang.NumberFormatException r4 = new java.lang.NumberFormatException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r5 = r5.append(r6)
            r6 = 16
            int r6 = kotlin.text.CharsKt.checkRadix(r6)
            int r6 = kotlin.text.CharsKt.checkRadix(r6)
            java.lang.String r6 = java.lang.Integer.toString(r3, r6)
            java.lang.String r7 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L66:
            r3 = r0
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            long r0 = r3.readHexadecimalUnsignedLong()
            return r0
    }

    @Override // okio.BufferedSource
    public int readInt() {
            r4 = this;
            r0 = r4
            r1 = 0
            r2 = 4
            r0.require(r2)
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            int r0 = r2.readInt()
            return r0
    }

    @Override // okio.BufferedSource
    public int readIntLe() {
            r4 = this;
            r0 = r4
            r1 = 0
            r2 = 4
            r0.require(r2)
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            int r0 = r2.readIntLe()
            return r0
    }

    @Override // okio.BufferedSource
    public long readLong() {
            r4 = this;
            r0 = r4
            r1 = 0
            r2 = 8
            r0.require(r2)
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            long r0 = r2.readLong()
            return r0
    }

    @Override // okio.BufferedSource
    public long readLongLe() {
            r4 = this;
            r0 = r4
            r1 = 0
            r2 = 8
            r0.require(r2)
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            long r0 = r2.readLongLe()
            return r0
    }

    @Override // okio.BufferedSource
    public short readShort() {
            r4 = this;
            r0 = r4
            r1 = 0
            r2 = 2
            r0.require(r2)
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            short r0 = r2.readShort()
            return r0
    }

    @Override // okio.BufferedSource
    public short readShortLe() {
            r4 = this;
            r0 = r4
            r1 = 0
            r2 = 2
            r0.require(r2)
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            short r0 = r2.readShortLe()
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readString(long r3, java.nio.charset.Charset r5) {
            r2 = this;
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r2.require(r3)
            r0 = r2
            r1 = 0
            okio.Buffer r0 = r0.bufferField
            java.lang.String r0 = r0.readString(r3, r5)
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readString(java.nio.charset.Charset r3) {
            r2 = this;
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            r1 = 0
            okio.Buffer r0 = r0.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            r0 = r2
            r1 = 0
            okio.Buffer r0 = r0.bufferField
            java.lang.String r0 = r0.readString(r3)
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8() {
            r4 = this;
            r0 = r4
            r1 = 0
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            okio.Source r3 = r0.source
            r2.writeAll(r3)
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            java.lang.String r0 = r2.readUtf8()
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8(long r5) {
            r4 = this;
            r0 = r4
            r1 = 0
            r0.require(r5)
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            java.lang.String r0 = r2.readUtf8(r5)
            return r0
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() {
            r5 = this;
            r0 = r5
            r1 = 0
            r2 = 1
            r0.require(r2)
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r3 = 0
            byte r2 = r2.getByte(r3)
            r3 = r2 & 224(0xe0, float:3.14E-43)
            r4 = 192(0xc0, float:2.69E-43)
            if (r3 != r4) goto L1e
            r3 = 2
            r0.require(r3)
            goto L35
        L1e:
            r3 = r2 & 240(0xf0, float:3.36E-43)
            r4 = 224(0xe0, float:3.14E-43)
            if (r3 != r4) goto L2a
            r3 = 3
            r0.require(r3)
            goto L35
        L2a:
            r3 = r2 & 248(0xf8, float:3.48E-43)
            r4 = 240(0xf0, float:3.36E-43)
            if (r3 != r4) goto L35
            r3 = 4
            r0.require(r3)
        L35:
            r3 = r0
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            int r0 = r3.readUtf8CodePoint()
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8Line() {
            r8 = this;
            r0 = r8
            r1 = 0
            r2 = 10
            long r2 = r0.indexOf(r2)
            r4 = -1
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L2b
            r4 = r0
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            long r4 = r4.size()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L29
            r4 = r0
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            long r4 = r4.size()
            java.lang.String r4 = r0.readUtf8(r4)
            goto L33
        L29:
            r4 = 0
            goto L33
        L2b:
            r4 = r0
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            java.lang.String r4 = okio.internal.Buffer.readUtf8Line(r4, r2)
        L33:
            return r4
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8LineStrict() {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r0 = r2.readUtf8LineStrict(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8LineStrict(long r23) {
            r22 = this;
            r0 = r23
            r8 = r22
            r9 = 0
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 == 0) goto Lcb
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            r12 = 1
            if (r2 != 0) goto L1d
            r2 = r10
            goto L1f
        L1d:
            long r2 = r0 + r12
        L1f:
            r14 = r2
            r3 = 10
            r4 = 0
            r2 = r8
            r6 = r14
            long r2 = r2.indexOf(r3, r4, r6)
            r4 = -1
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L39
            r4 = r8
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            java.lang.String r4 = okio.internal.Buffer.readUtf8Line(r4, r2)
            goto L6c
        L39:
            int r4 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r4 >= 0) goto L6d
            boolean r4 = r8.request(r14)
            if (r4 == 0) goto L6d
            r4 = r8
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            long r5 = r14 - r12
            byte r4 = r4.getByte(r5)
            r5 = 13
            if (r4 != r5) goto L6d
            long r12 = r12 + r14
            boolean r4 = r8.request(r12)
            if (r4 == 0) goto L6d
            r4 = r8
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            byte r4 = r4.getByte(r14)
            r5 = 10
            if (r4 != r5) goto L6d
            r4 = r8
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            java.lang.String r4 = okio.internal.Buffer.readUtf8Line(r4, r14)
        L6c:
            return r4
        L6d:
            okio.Buffer r17 = new okio.Buffer
            r17.<init>()
            r4 = r8
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            r5 = r8
            r6 = 0
            okio.Buffer r5 = r5.bufferField
            long r5 = r5.size()
            r7 = 32
            r10 = 0
            long r11 = (long) r7
            long r20 = java.lang.Math.min(r11, r5)
            r18 = 0
            r16 = r4
            r16.copyTo(r17, r18, r20)
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "\\n not found: limit="
            java.lang.StringBuilder r5 = r5.append(r6)
            r6 = r8
            r7 = 0
            okio.Buffer r6 = r6.bufferField
            long r6 = r6.size()
            long r6 = java.lang.Math.min(r6, r0)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " content="
            java.lang.StringBuilder r5 = r5.append(r6)
            okio.ByteString r6 = r17.readByteString()
            java.lang.String r6 = r6.hex()
            java.lang.StringBuilder r5 = r5.append(r6)
            r6 = 8230(0x2026, float:1.1533E-41)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        Lcb:
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "limit < 0: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // okio.BufferedSource
    public boolean request(long r10) {
            r9 = this;
            r0 = r9
            r1 = 0
            r2 = 0
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r2 < 0) goto Lc
            r2 = r3
            goto Ld
        Lc:
            r2 = r4
        Ld:
            if (r2 == 0) goto L43
            boolean r2 = r0.closed
            if (r2 != 0) goto L35
        L13:
            r2 = r0
            r5 = 0
            okio.Buffer r2 = r2.bufferField
            long r5 = r2.size()
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 >= 0) goto L33
            okio.Source r2 = r0.source
            r5 = r0
            r6 = 0
            okio.Buffer r5 = r5.bufferField
            r6 = 8192(0x2000, double:4.0474E-320)
            long r5 = r2.read(r5, r6)
            r7 = -1
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L13
            r3 = r4
            goto L34
        L33:
        L34:
            return r3
        L35:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L43:
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "byteCount < 0: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r10)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // okio.BufferedSource
    public void require(long r4) {
            r3 = this;
            r0 = r3
            r1 = 0
            boolean r2 = r0.request(r4)
            if (r2 == 0) goto La
        L9:
            return
        La:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
    }

    @Override // okio.BufferedSource
    public int select(okio.Options r9) {
            r8 = this;
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r8
            r1 = 0
            boolean r2 = r0.closed
            if (r2 != 0) goto L42
        Lb:
        Lc:
            r2 = r0
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r3 = 1
            int r2 = okio.internal.Buffer.selectPrefix(r2, r9, r3)
            r3 = -1
            switch(r2) {
                case -2: goto L2e;
                case -1: goto L2c;
                default: goto L19;
            }
        L19:
            okio.ByteString[] r3 = r9.getByteStrings$okio()
            r3 = r3[r2]
            int r3 = r3.size()
            r4 = r0
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            long r5 = (long) r3
            r4.skip(r5)
            goto L41
        L2c:
            r2 = r3
            goto L41
        L2e:
            okio.Source r4 = r0.source
            r5 = r0
            r6 = 0
            okio.Buffer r5 = r5.bufferField
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.read(r5, r6)
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto Lb
            r2 = r3
        L41:
            return r2
        L42:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSource
    public void skip(long r9) {
            r8 = this;
            r0 = r8
            r1 = 0
            r2 = r9
            boolean r4 = r0.closed
            if (r4 != 0) goto L49
        L7:
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L47
            r6 = r0
            r7 = 0
            okio.Buffer r6 = r6.bufferField
            long r6 = r6.size()
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 != 0) goto L32
            okio.Source r4 = r0.source
            r5 = r0
            r6 = 0
            okio.Buffer r5 = r5.bufferField
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.read(r5, r6)
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L2c
            goto L32
        L2c:
            java.io.EOFException r4 = new java.io.EOFException
            r4.<init>()
            throw r4
        L32:
            r4 = r0
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            long r4 = r4.size()
            long r4 = java.lang.Math.min(r2, r4)
            r6 = r0
            r7 = 0
            okio.Buffer r6 = r6.bufferField
            r6.skip(r4)
            long r2 = r2 - r4
            goto L7
        L47:
            return
        L49:
            r4 = 0
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "closed"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
            r3 = this;
            r0 = r3
            r1 = 0
            okio.Source r2 = r0.source
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
            okio.Source r3 = r0.source
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = 41
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
