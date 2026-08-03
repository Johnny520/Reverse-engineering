package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RealBufferedSource implements okio.BufferedSource {
    public final okio.Buffer bufferField;
    public boolean closed;
    public final okio.Source source;


    public RealBufferedSource(okio.Source r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.source = r1
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r0.bufferField = r1
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
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto L11
            r0 = 1
            r1.closed = r0
            okio.Source r0 = r1.source
            r0.close()
            okio.Buffer r0 = r1.bufferField
            r0.clear()
        L11:
            return
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
            r4 = this;
            boolean r0 = r4.closed
            if (r0 != 0) goto L20
            okio.Buffer r0 = r4.bufferField
            boolean r0 = r0.exhausted()
            if (r0 == 0) goto L1e
            okio.Source r0 = r4.source
            okio.Buffer r1 = r4.bufferField
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1e
            r0 = 1
            return r0
        L1e:
            r0 = 0
            return r0
        L20:
            java.lang.String r0 = "closed"
            j8.o.A(r0)
            r0 = 0
            return r0
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public okio.Buffer getBuffer() {
            r1 = this;
            okio.Buffer r0 = r1.bufferField
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOf(byte r7) {
            r6 = this;
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = r6
            r1 = r7
            long r1 = r0.indexOf(r1, r2, r4)
            return r1
    }

    @Override // okio.BufferedSource
    public long indexOf(byte r7, long r8) {
            r6 = this;
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = r6
            r1 = r7
            r2 = r8
            long r7 = r0.indexOf(r1, r2, r4)
            return r7
    }

    @Override // okio.BufferedSource
    public long indexOf(byte r10, long r11, long r13) {
            r9 = this;
            boolean r0 = r9.closed
            if (r0 != 0) goto L5d
            r0 = 0
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 > 0) goto L43
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 > 0) goto L43
            r3 = r11
        Lf:
            int r11 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            r7 = -1
            if (r11 >= 0) goto L42
            okio.Buffer r1 = r9.bufferField
            r2 = r10
            r5 = r13
            long r10 = r1.indexOf(r2, r3, r5)
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L22
            return r10
        L22:
            okio.Buffer r10 = r9.bufferField
            long r10 = r10.size()
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 >= 0) goto L42
            okio.Source r12 = r9.source
            okio.Buffer r13 = r9.bufferField
            r0 = 8192(0x2000, double:4.0474E-320)
            long r12 = r12.read(r13, r0)
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 != 0) goto L3b
            goto L42
        L3b:
            long r3 = java.lang.Math.max(r3, r10)
            r10 = r2
            r13 = r5
            goto Lf
        L42:
            return r7
        L43:
            r5 = r13
            java.lang.String r10 = "fromIndex="
            java.lang.String r13 = " toIndex="
            java.lang.StringBuilder r10 = p.a.o(r11, r10, r13)
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        L5d:
            java.lang.String r10 = "closed"
            j8.o.A(r10)
            r10 = 0
            return r10
    }

    @Override // okio.BufferedSource
    public long indexOf(okio.ByteString r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            long r0 = r2.indexOf(r3, r0)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOf(okio.ByteString r9, long r10) {
            r8 = this;
            r9.getClass()
            boolean r0 = r8.closed
            if (r0 != 0) goto L37
        L7:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.indexOf(r9, r10)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L14
            return r0
        L14:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.size()
            okio.Source r4 = r8.source
            okio.Buffer r5 = r8.bufferField
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.read(r5, r6)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L29
            return r2
        L29:
            int r2 = r9.size()
            long r2 = (long) r2
            long r0 = r0 - r2
            r2 = 1
            long r0 = r0 + r2
            long r10 = java.lang.Math.max(r10, r0)
            goto L7
        L37:
            java.lang.String r9 = "closed"
            j8.o.A(r9)
            r9 = 0
            return r9
    }

    @Override // okio.BufferedSource
    public long indexOfElement(okio.ByteString r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            long r0 = r2.indexOfElement(r3, r0)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOfElement(okio.ByteString r9, long r10) {
            r8 = this;
            r9.getClass()
            boolean r0 = r8.closed
            if (r0 != 0) goto L2e
        L7:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.indexOfElement(r9, r10)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L14
            return r0
        L14:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.size()
            okio.Source r4 = r8.source
            okio.Buffer r5 = r8.bufferField
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.read(r5, r6)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L29
            return r2
        L29:
            long r10 = java.lang.Math.max(r10, r0)
            goto L7
        L2e:
            java.lang.String r9 = "closed"
            j8.o.A(r9)
            r9 = 0
            return r9
    }

    @Override // okio.BufferedSource
    public java.io.InputStream inputStream() {
            r1 = this;
            okio.RealBufferedSource$inputStream$1 r0 = new okio.RealBufferedSource$inputStream$1
            r0.<init>(r1)
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
            r1 = this;
            okio.PeekSource r0 = new okio.PeekSource
            r0.<init>(r1)
            okio.BufferedSource r0 = okio.Okio.buffer(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long r7, okio.ByteString r9) {
            r6 = this;
            r9.getClass()
            r4 = 0
            int r5 = r9.size()
            r0 = r6
            r1 = r7
            r3 = r9
            boolean r7 = r0.rangeEquals(r1, r3, r4, r5)
            return r7
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long r7, okio.ByteString r9, int r10, int r11) {
            r6 = this;
            r9.getClass()
            boolean r0 = r6.closed
            if (r0 != 0) goto L3e
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L3d
            if (r10 < 0) goto L3d
            if (r11 < 0) goto L3d
            int r0 = r9.size()
            int r0 = r0 - r10
            if (r0 >= r11) goto L1a
            goto L3d
        L1a:
            r0 = r1
        L1b:
            if (r0 >= r11) goto L3b
            long r2 = (long) r0
            long r2 = r2 + r7
            r4 = 1
            long r4 = r4 + r2
            boolean r4 = r6.request(r4)
            if (r4 != 0) goto L29
            return r1
        L29:
            okio.Buffer r4 = r6.bufferField
            byte r2 = r4.getByte(r2)
            int r3 = r10 + r0
            byte r3 = r9.getByte(r3)
            if (r2 == r3) goto L38
            return r1
        L38:
            int r0 = r0 + 1
            goto L1b
        L3b:
            r7 = 1
            return r7
        L3d:
            return r1
        L3e:
            java.lang.String r7 = "closed"
            j8.o.A(r7)
            r7 = 0
            return r7
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer r5) {
            r4 = this;
            r5.getClass()
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L21
            okio.Source r0 = r4.source
            okio.Buffer r1 = r4.bufferField
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L21
            r5 = -1
            return r5
        L21:
            okio.Buffer r0 = r4.bufferField
            int r5 = r0.read(r5)
            return r5
    }

    @Override // okio.BufferedSource
    public int read(byte[] r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            int r1 = r3.length
            int r3 = r2.read(r3, r0, r1)
            return r3
    }

    @Override // okio.BufferedSource
    public int read(byte[] r8, int r9, int r10) {
            r7 = this;
            r8.getClass()
            int r0 = r8.length
            long r1 = (long) r0
            long r3 = (long) r9
            long r5 = (long) r10
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            okio.Buffer r10 = r7.bufferField
            long r0 = r10.size()
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 != 0) goto L28
            okio.Source r10 = r7.source
            okio.Buffer r0 = r7.bufferField
            r1 = 8192(0x2000, double:4.0474E-320)
            long r0 = r10.read(r0, r1)
            r2 = -1
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 != 0) goto L28
            r8 = -1
            return r8
        L28:
            okio.Buffer r10 = r7.bufferField
            long r0 = r10.size()
            long r0 = java.lang.Math.min(r5, r0)
            int r10 = (int) r0
            okio.Buffer r0 = r7.bufferField
            int r8 = r0.read(r8, r9, r10)
            return r8
    }

    @Override // okio.Source
    public long read(okio.Buffer r5, long r6) {
            r4 = this;
            r5.getClass()
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L41
            boolean r2 = r4.closed
            if (r2 != 0) goto L39
            okio.Buffer r2 = r4.bufferField
            long r2 = r2.size()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L28
            okio.Source r0 = r4.source
            okio.Buffer r1 = r4.bufferField
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            return r2
        L28:
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            long r6 = java.lang.Math.min(r6, r0)
            okio.Buffer r0 = r4.bufferField
            long r5 = r0.read(r5, r6)
            return r5
        L39:
            java.lang.String r5 = "closed"
            j8.o.A(r5)
            r5 = 0
            return r5
        L41:
            java.lang.String r5 = "byteCount < 0: "
            java.lang.String r5 = bc.e.g(r6, r5)
            j8.o.q(r5)
            r5 = 0
            return r5
    }

    @Override // okio.BufferedSource
    public long readAll(okio.Sink r9) {
            r8 = this;
            r9.getClass()
            r0 = 0
            r2 = r0
        L6:
            okio.Source r4 = r8.source
            okio.Buffer r5 = r8.bufferField
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.read(r5, r6)
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            okio.Buffer r5 = r8.bufferField
            if (r4 == 0) goto L27
            long r4 = r5.completeSegmentByteCount()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L6
            long r2 = r2 + r4
            okio.Buffer r6 = r8.bufferField
            r9.write(r6, r4)
            goto L6
        L27:
            long r4 = r5.size()
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L40
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.size()
            long r0 = r0 + r2
            okio.Buffer r2 = r8.bufferField
            long r3 = r2.size()
            r9.write(r2, r3)
            return r0
        L40:
            return r2
    }

    @Override // okio.BufferedSource
    public byte readByte() {
            r2 = this;
            r0 = 1
            r2.require(r0)
            okio.Buffer r0 = r2.bufferField
            byte r0 = r0.readByte()
            return r0
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray() {
            r2 = this;
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r0 = r2.bufferField
            byte[] r0 = r0.readByteArray()
            return r0
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray(long r2) {
            r1 = this;
            r1.require(r2)
            okio.Buffer r0 = r1.bufferField
            byte[] r2 = r0.readByteArray(r2)
            return r2
    }

    @Override // okio.BufferedSource
    public okio.ByteString readByteString() {
            r2 = this;
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r0 = r2.bufferField
            okio.ByteString r0 = r0.readByteString()
            return r0
    }

    @Override // okio.BufferedSource
    public okio.ByteString readByteString(long r2) {
            r1 = this;
            r1.require(r2)
            okio.Buffer r0 = r1.bufferField
            okio.ByteString r2 = r0.readByteString(r2)
            return r2
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() {
            r10 = this;
            r0 = 1
            r10.require(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L47
            okio.Buffer r8 = r10.bufferField
            byte r8 = r8.getByte(r4)
            r9 = 48
            if (r8 < r9) goto L1e
            r9 = 57
            if (r8 <= r9) goto L27
        L1e:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L29
            r5 = 45
            if (r8 == r5) goto L27
            goto L29
        L27:
            r4 = r6
            goto L8
        L29:
            if (r4 == 0) goto L2c
            goto L47
        L2c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            a.a.w(r1)
            a.a.w(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            r1.getClass()
            java.lang.String r2 = "Expected a digit or '-' but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L47:
            okio.Buffer r0 = r10.bufferField
            long r0 = r0.readDecimalLong()
            return r0
    }

    @Override // okio.BufferedSource
    public void readFully(okio.Buffer r2, long r3) {
            r1 = this;
            r2.getClass()
            r1.require(r3)     // Catch: java.io.EOFException -> Lc
            okio.Buffer r0 = r1.bufferField
            r0.readFully(r2, r3)
            return
        Lc:
            r3 = move-exception
            okio.Buffer r4 = r1.bufferField
            r2.writeAll(r4)
            throw r3
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] r7) {
            r6 = this;
            r7.getClass()
            int r0 = r7.length     // Catch: java.io.EOFException -> Le
            long r0 = (long) r0     // Catch: java.io.EOFException -> Le
            r6.require(r0)     // Catch: java.io.EOFException -> Le
            okio.Buffer r0 = r6.bufferField
            r0.readFully(r7)
            return
        Le:
            r0 = move-exception
            r1 = 0
        L10:
            okio.Buffer r2 = r6.bufferField
            long r2 = r2.size()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L32
            okio.Buffer r2 = r6.bufferField
            long r3 = r2.size()
            int r3 = (int) r3
            int r2 = r2.read(r7, r1, r3)
            r3 = -1
            if (r2 == r3) goto L2c
            int r1 = r1 + r2
            goto L10
        L2c:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L32:
            throw r0
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() {
            r5 = this;
            r0 = 1
            r5.require(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.request(r2)
            if (r2 == 0) goto L4f
            okio.Buffer r2 = r5.bufferField
            long r3 = (long) r0
            byte r2 = r2.getByte(r3)
            r3 = 48
            if (r2 < r3) goto L1e
            r3 = 57
            if (r2 <= r3) goto L2f
        L1e:
            r3 = 97
            if (r2 < r3) goto L26
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L2f
        L26:
            r3 = 65
            if (r2 < r3) goto L31
            r3 = 70
            if (r2 <= r3) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L4f
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            a.a.w(r1)
            a.a.w(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            r1.getClass()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L4f:
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.readHexadecimalUnsignedLong()
            return r0
    }

    @Override // okio.BufferedSource
    public int readInt() {
            r2 = this;
            r0 = 4
            r2.require(r0)
            okio.Buffer r0 = r2.bufferField
            int r0 = r0.readInt()
            return r0
    }

    @Override // okio.BufferedSource
    public int readIntLe() {
            r2 = this;
            r0 = 4
            r2.require(r0)
            okio.Buffer r0 = r2.bufferField
            int r0 = r0.readIntLe()
            return r0
    }

    @Override // okio.BufferedSource
    public long readLong() {
            r2 = this;
            r0 = 8
            r2.require(r0)
            okio.Buffer r0 = r2.bufferField
            long r0 = r0.readLong()
            return r0
    }

    @Override // okio.BufferedSource
    public long readLongLe() {
            r2 = this;
            r0 = 8
            r2.require(r0)
            okio.Buffer r0 = r2.bufferField
            long r0 = r0.readLongLe()
            return r0
    }

    @Override // okio.BufferedSource
    public short readShort() {
            r2 = this;
            r0 = 2
            r2.require(r0)
            okio.Buffer r0 = r2.bufferField
            short r0 = r0.readShort()
            return r0
    }

    @Override // okio.BufferedSource
    public short readShortLe() {
            r2 = this;
            r0 = 2
            r2.require(r0)
            okio.Buffer r0 = r2.bufferField
            short r0 = r0.readShortLe()
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readString(long r2, java.nio.charset.Charset r4) {
            r1 = this;
            r4.getClass()
            r1.require(r2)
            okio.Buffer r0 = r1.bufferField
            java.lang.String r2 = r0.readString(r2, r4)
            return r2
    }

    @Override // okio.BufferedSource
    public java.lang.String readString(java.nio.charset.Charset r3) {
            r2 = this;
            r3.getClass()
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r0 = r2.bufferField
            java.lang.String r3 = r0.readString(r3)
            return r3
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8() {
            r2 = this;
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r0 = r2.bufferField
            java.lang.String r0 = r0.readUtf8()
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8(long r2) {
            r1 = this;
            r1.require(r2)
            okio.Buffer r0 = r1.bufferField
            java.lang.String r2 = r0.readUtf8(r2)
            return r2
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() {
            r3 = this;
            r0 = 1
            r3.require(r0)
            okio.Buffer r0 = r3.bufferField
            r1 = 0
            byte r0 = r0.getByte(r1)
            r1 = r0 & 224(0xe0, float:3.14E-43)
            r2 = 192(0xc0, float:2.69E-43)
            if (r1 != r2) goto L19
            r0 = 2
            r3.require(r0)
            goto L30
        L19:
            r1 = r0 & 240(0xf0, float:3.36E-43)
            r2 = 224(0xe0, float:3.14E-43)
            if (r1 != r2) goto L25
            r0 = 3
            r3.require(r0)
            goto L30
        L25:
            r0 = r0 & 248(0xf8, float:3.48E-43)
            r1 = 240(0xf0, float:3.36E-43)
            if (r0 != r1) goto L30
            r0 = 4
            r3.require(r0)
        L30:
            okio.Buffer r0 = r3.bufferField
            int r0 = r0.readUtf8CodePoint()
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8Line() {
            r4 = this;
            r0 = 10
            long r0 = r4.indexOf(r0)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            okio.Buffer r3 = r4.bufferField
            if (r2 != 0) goto L25
            long r0 = r3.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L23
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            java.lang.String r0 = r4.readUtf8(r0)
            return r0
        L23:
            r0 = 0
            return r0
        L25:
            java.lang.String r0 = okio.internal.Buffer.readUtf8Line(r3, r0)
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8LineStrict() {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r0 = r2.readUtf8LineStrict(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8LineStrict(long r14) {
            r13 = this;
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 < 0) goto L89
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            r3 = 1
            if (r2 != 0) goto L13
            r11 = r0
            goto L16
        L13:
            long r5 = r14 + r3
            r11 = r5
        L16:
            r8 = 10
            r9 = 0
            r7 = r13
            long r5 = r7.indexOf(r8, r9, r11)
            r8 = -1
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 == 0) goto L2c
            okio.Buffer r14 = r7.bufferField
            java.lang.String r14 = okio.internal.Buffer.readUtf8Line(r14, r5)
            return r14
        L2c:
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 >= 0) goto L5b
            boolean r0 = r13.request(r11)
            if (r0 == 0) goto L5b
            okio.Buffer r0 = r7.bufferField
            long r1 = r11 - r3
            byte r0 = r0.getByte(r1)
            r1 = 13
            if (r0 != r1) goto L5b
            long r0 = r11 + r3
            boolean r0 = r13.request(r0)
            if (r0 == 0) goto L5b
            okio.Buffer r0 = r7.bufferField
            byte r0 = r0.getByte(r11)
            r1 = 10
            if (r0 != r1) goto L5b
            okio.Buffer r14 = r7.bufferField
            java.lang.String r14 = okio.internal.Buffer.readUtf8Line(r14, r11)
            return r14
        L5b:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            okio.Buffer r0 = r7.bufferField
            long r2 = r0.size()
            r4 = 32
            long r4 = (long) r4
            long r4 = java.lang.Math.min(r4, r2)
            r2 = 0
            r0.copyTo(r1, r2, r4)
            okio.Buffer r0 = r7.bufferField
            long r2 = r0.size()
            long r14 = java.lang.Math.min(r2, r14)
            okio.ByteString r0 = r1.readByteString()
            java.lang.String r0 = r0.hex()
            j8.o.g(r0, r14)
            r14 = 0
            return r14
        L89:
            r7 = r13
            java.lang.String r0 = "limit < 0: "
            java.lang.String r14 = bc.e.g(r14, r0)
            j8.o.q(r14)
            r14 = 0
            return r14
    }

    @Override // okio.BufferedSource
    public boolean request(long r5) {
            r4 = this;
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L2f
            boolean r0 = r4.closed
            if (r0 != 0) goto L28
        La:
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L26
            okio.Source r0 = r4.source
            okio.Buffer r1 = r4.bufferField
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto La
            r5 = 0
            return r5
        L26:
            r5 = 1
            return r5
        L28:
            java.lang.String r5 = "closed"
            j8.o.A(r5)
        L2d:
            r5 = 0
            return r5
        L2f:
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r5 = bc.e.g(r5, r0)
            j8.o.q(r5)
            goto L2d
    }

    @Override // okio.BufferedSource
    public void require(long r1) {
            r0 = this;
            boolean r1 = r0.request(r1)
            if (r1 == 0) goto L7
            return
        L7:
            j8.o.a()
            return
    }

    @Override // okio.BufferedSource
    public int select(okio.Options r6) {
            r5 = this;
            r6.getClass()
            boolean r0 = r5.closed
            if (r0 != 0) goto L37
        L7:
            okio.Buffer r0 = r5.bufferField
            r1 = 1
            int r0 = okio.internal.Buffer.selectPrefix(r0, r6, r1)
            r1 = -2
            r2 = -1
            if (r0 == r1) goto L26
            if (r0 == r2) goto L25
            okio.ByteString[] r6 = r6.getByteStrings$okio()
            r6 = r6[r0]
            int r6 = r6.size()
            okio.Buffer r1 = r5.bufferField
            long r2 = (long) r6
            r1.skip(r2)
            return r0
        L25:
            return r2
        L26:
            okio.Source r0 = r5.source
            okio.Buffer r1 = r5.bufferField
            r3 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r3)
            r3 = -1
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L7
            return r2
        L37:
            java.lang.String r6 = "closed"
            j8.o.A(r6)
            r6 = 0
            return r6
    }

    @Override // okio.BufferedSource
    public void skip(long r5) {
            r4 = this;
            boolean r0 = r4.closed
            if (r0 != 0) goto L3b
        L4:
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L3a
            okio.Buffer r2 = r4.bufferField
            long r2 = r2.size()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L29
            okio.Source r0 = r4.source
            okio.Buffer r1 = r4.bufferField
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L25
            goto L29
        L25:
            j8.o.a()
            return
        L29:
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            long r0 = java.lang.Math.min(r5, r0)
            okio.Buffer r2 = r4.bufferField
            r2.skip(r0)
            long r5 = r5 - r0
            goto L4
        L3a:
            return
        L3b:
            java.lang.String r5 = "closed"
            j8.o.A(r5)
            return
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
            r1 = this;
            okio.Source r0 = r1.source
            okio.Timeout r0 = r0.timeout()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "buffer("
            r0.<init>(r1)
            okio.Source r1 = r2.source
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
