package okio.internal;

/* JADX INFO: renamed from: okio.internal.-RealBufferedSource, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RealBufferedSource {
    public static final void commonClose(okio.RealBufferedSource r1) {
            r1.getClass()
            boolean r0 = r1.closed
            if (r0 == 0) goto L8
            return
        L8:
            r0 = 1
            r1.closed = r0
            okio.Source r0 = r1.source
            r0.close()
            okio.Buffer r1 = r1.bufferField
            r1.clear()
            return
    }

    public static final boolean commonExhausted(okio.RealBufferedSource r4) {
            r4.getClass()
            boolean r0 = r4.closed
            if (r0 != 0) goto L23
            okio.Buffer r0 = r4.bufferField
            boolean r0 = r0.exhausted()
            if (r0 == 0) goto L21
            okio.Source r0 = r4.source
            okio.Buffer r4 = r4.bufferField
            r1 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r4, r1)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L21
            r4 = 1
            return r4
        L21:
            r4 = 0
            return r4
        L23:
            java.lang.String r4 = "closed"
            j8.o.A(r4)
            r4 = 0
            return r4
    }

    public static final long commonIndexOf(okio.RealBufferedSource r9, byte r10, long r11, long r13) {
            r9.getClass()
            boolean r0 = r9.closed
            if (r0 != 0) goto L60
            r0 = 0
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 > 0) goto L46
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 > 0) goto L46
            r3 = r11
        L12:
            int r11 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            r7 = -1
            if (r11 >= 0) goto L45
            okio.Buffer r1 = r9.bufferField
            r2 = r10
            r5 = r13
            long r10 = r1.indexOf(r2, r3, r5)
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L25
            return r10
        L25:
            okio.Buffer r10 = r9.bufferField
            long r10 = r10.size()
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 >= 0) goto L45
            okio.Source r12 = r9.source
            okio.Buffer r13 = r9.bufferField
            r0 = 8192(0x2000, double:4.0474E-320)
            long r12 = r12.read(r13, r0)
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 != 0) goto L3e
            goto L45
        L3e:
            long r3 = java.lang.Math.max(r3, r10)
            r10 = r2
            r13 = r5
            goto L12
        L45:
            return r7
        L46:
            r5 = r13
            java.lang.String r9 = "fromIndex="
            java.lang.String r10 = " toIndex="
            java.lang.StringBuilder r9 = p.a.o(r11, r9, r10)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L60:
            java.lang.String r9 = "closed"
            j8.o.A(r9)
            r9 = 0
            return r9
    }

    public static final long commonIndexOf(okio.RealBufferedSource r8, okio.ByteString r9, long r10) {
            r8.getClass()
            r9.getClass()
            boolean r0 = r8.closed
            if (r0 != 0) goto L3a
        La:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.indexOf(r9, r10)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L17
            return r0
        L17:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.size()
            okio.Source r4 = r8.source
            okio.Buffer r5 = r8.bufferField
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.read(r5, r6)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L2c
            return r2
        L2c:
            int r2 = r9.size()
            long r2 = (long) r2
            long r0 = r0 - r2
            r2 = 1
            long r0 = r0 + r2
            long r10 = java.lang.Math.max(r10, r0)
            goto La
        L3a:
            java.lang.String r8 = "closed"
            j8.o.A(r8)
            r8 = 0
            return r8
    }

    public static final long commonIndexOfElement(okio.RealBufferedSource r8, okio.ByteString r9, long r10) {
            r8.getClass()
            r9.getClass()
            boolean r0 = r8.closed
            if (r0 != 0) goto L31
        La:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.indexOfElement(r9, r10)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L17
            return r0
        L17:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.size()
            okio.Source r4 = r8.source
            okio.Buffer r5 = r8.bufferField
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.read(r5, r6)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L2c
            return r2
        L2c:
            long r10 = java.lang.Math.max(r10, r0)
            goto La
        L31:
            java.lang.String r8 = "closed"
            j8.o.A(r8)
            r8 = 0
            return r8
    }

    public static final okio.BufferedSource commonPeek(okio.RealBufferedSource r1) {
            r1.getClass()
            okio.PeekSource r0 = new okio.PeekSource
            r0.<init>(r1)
            okio.BufferedSource r1 = okio.Okio.buffer(r0)
            return r1
    }

    public static final boolean commonRangeEquals(okio.RealBufferedSource r6, long r7, okio.ByteString r9, int r10, int r11) {
            r6.getClass()
            r9.getClass()
            boolean r0 = r6.closed
            if (r0 != 0) goto L41
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L40
            if (r10 < 0) goto L40
            if (r11 < 0) goto L40
            int r0 = r9.size()
            int r0 = r0 - r10
            if (r0 >= r11) goto L1d
            goto L40
        L1d:
            r0 = r1
        L1e:
            if (r0 >= r11) goto L3e
            long r2 = (long) r0
            long r2 = r2 + r7
            r4 = 1
            long r4 = r4 + r2
            boolean r4 = r6.request(r4)
            if (r4 != 0) goto L2c
            return r1
        L2c:
            okio.Buffer r4 = r6.bufferField
            byte r2 = r4.getByte(r2)
            int r3 = r10 + r0
            byte r3 = r9.getByte(r3)
            if (r2 == r3) goto L3b
            return r1
        L3b:
            int r0 = r0 + 1
            goto L1e
        L3e:
            r6 = 1
            return r6
        L40:
            return r1
        L41:
            java.lang.String r6 = "closed"
            j8.o.A(r6)
            r6 = 0
            return r6
    }

    public static final int commonRead(okio.RealBufferedSource r7, byte[] r8, int r9, int r10) {
            r7.getClass()
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
            if (r10 != 0) goto L2b
            okio.Source r10 = r7.source
            okio.Buffer r0 = r7.bufferField
            r1 = 8192(0x2000, double:4.0474E-320)
            long r0 = r10.read(r0, r1)
            r2 = -1
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 != 0) goto L2b
            r7 = -1
            return r7
        L2b:
            okio.Buffer r10 = r7.bufferField
            long r0 = r10.size()
            long r0 = java.lang.Math.min(r5, r0)
            int r10 = (int) r0
            okio.Buffer r7 = r7.bufferField
            int r7 = r7.read(r8, r9, r10)
            return r7
    }

    public static final long commonRead(okio.RealBufferedSource r4, okio.Buffer r5, long r6) {
            r4.getClass()
            r5.getClass()
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L44
            boolean r2 = r4.closed
            if (r2 != 0) goto L3c
            okio.Buffer r2 = r4.bufferField
            long r2 = r2.size()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L2b
            okio.Source r0 = r4.source
            okio.Buffer r1 = r4.bufferField
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2b
            return r2
        L2b:
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            long r6 = java.lang.Math.min(r6, r0)
            okio.Buffer r4 = r4.bufferField
            long r4 = r4.read(r5, r6)
            return r4
        L3c:
            java.lang.String r4 = "closed"
            j8.o.A(r4)
            r4 = 0
            return r4
        L44:
            java.lang.String r4 = "byteCount < 0: "
            java.lang.String r4 = bc.e.g(r6, r4)
            j8.o.q(r4)
            r4 = 0
            return r4
    }

    public static final long commonReadAll(okio.RealBufferedSource r8, okio.Sink r9) {
            r8.getClass()
            r9.getClass()
            r0 = 0
            r2 = r0
        L9:
            okio.Source r4 = r8.source
            okio.Buffer r5 = r8.bufferField
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.read(r5, r6)
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            okio.Buffer r5 = r8.bufferField
            if (r4 == 0) goto L2a
            long r4 = r5.completeSegmentByteCount()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L9
            long r2 = r2 + r4
            okio.Buffer r6 = r8.bufferField
            r9.write(r6, r4)
            goto L9
        L2a:
            long r4 = r5.size()
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L43
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.size()
            long r0 = r0 + r2
            okio.Buffer r8 = r8.bufferField
            long r2 = r8.size()
            r9.write(r8, r2)
            return r0
        L43:
            return r2
    }

    public static final byte commonReadByte(okio.RealBufferedSource r2) {
            r2.getClass()
            r0 = 1
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            byte r2 = r2.readByte()
            return r2
    }

    public static final byte[] commonReadByteArray(okio.RealBufferedSource r2) {
            r2.getClass()
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r2 = r2.bufferField
            byte[] r2 = r2.readByteArray()
            return r2
    }

    public static final byte[] commonReadByteArray(okio.RealBufferedSource r0, long r1) {
            r0.getClass()
            r0.require(r1)
            okio.Buffer r0 = r0.bufferField
            byte[] r0 = r0.readByteArray(r1)
            return r0
    }

    public static final okio.ByteString commonReadByteString(okio.RealBufferedSource r2) {
            r2.getClass()
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r2 = r2.bufferField
            okio.ByteString r2 = r2.readByteString()
            return r2
    }

    public static final okio.ByteString commonReadByteString(okio.RealBufferedSource r0, long r1) {
            r0.getClass()
            r0.require(r1)
            okio.Buffer r0 = r0.bufferField
            okio.ByteString r0 = r0.readByteString(r1)
            return r0
    }

    public static final long commonReadDecimalLong(okio.RealBufferedSource r10) {
            r10.getClass()
            r0 = 1
            r10.require(r0)
            r2 = 0
            r4 = r2
        Lb:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L4a
            okio.Buffer r8 = r10.bufferField
            byte r8 = r8.getByte(r4)
            r9 = 48
            if (r8 < r9) goto L21
            r9 = 57
            if (r8 <= r9) goto L2a
        L21:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L2c
            r5 = 45
            if (r8 == r5) goto L2a
            goto L2c
        L2a:
            r4 = r6
            goto Lb
        L2c:
            if (r4 == 0) goto L2f
            goto L4a
        L2f:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            r0 = 16
            a.a.w(r0)
            a.a.w(r0)
            java.lang.String r0 = java.lang.Integer.toString(r8, r0)
            r0.getClass()
            java.lang.String r1 = "Expected a digit or '-' but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r10.<init>(r0)
            throw r10
        L4a:
            okio.Buffer r10 = r10.bufferField
            long r0 = r10.readDecimalLong()
            return r0
    }

    public static final void commonReadFully(okio.RealBufferedSource r0, okio.Buffer r1, long r2) {
            r0.getClass()
            r1.getClass()
            r0.require(r2)     // Catch: java.io.EOFException -> Lf
            okio.Buffer r0 = r0.bufferField
            r0.readFully(r1, r2)
            return
        Lf:
            r2 = move-exception
            okio.Buffer r0 = r0.bufferField
            r1.writeAll(r0)
            throw r2
    }

    public static final void commonReadFully(okio.RealBufferedSource r6, byte[] r7) {
            r6.getClass()
            r7.getClass()
            int r0 = r7.length     // Catch: java.io.EOFException -> L11
            long r0 = (long) r0     // Catch: java.io.EOFException -> L11
            r6.require(r0)     // Catch: java.io.EOFException -> L11
            okio.Buffer r6 = r6.bufferField
            r6.readFully(r7)
            return
        L11:
            r0 = move-exception
            r1 = 0
        L13:
            okio.Buffer r2 = r6.bufferField
            long r2 = r2.size()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L35
            okio.Buffer r2 = r6.bufferField
            long r3 = r2.size()
            int r3 = (int) r3
            int r2 = r2.read(r7, r1, r3)
            r3 = -1
            if (r2 == r3) goto L2f
            int r1 = r1 + r2
            goto L13
        L2f:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L35:
            throw r0
    }

    public static final long commonReadHexadecimalUnsignedLong(okio.RealBufferedSource r5) {
            r5.getClass()
            r0 = 1
            r5.require(r0)
            r0 = 0
        L9:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.request(r2)
            if (r2 == 0) goto L52
            okio.Buffer r2 = r5.bufferField
            long r3 = (long) r0
            byte r2 = r2.getByte(r3)
            r3 = 48
            if (r2 < r3) goto L21
            r3 = 57
            if (r2 <= r3) goto L32
        L21:
            r3 = 97
            if (r2 < r3) goto L29
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L32
        L29:
            r3 = 65
            if (r2 < r3) goto L34
            r3 = 70
            if (r2 <= r3) goto L32
            goto L34
        L32:
            r0 = r1
            goto L9
        L34:
            if (r0 == 0) goto L37
            goto L52
        L37:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            r0 = 16
            a.a.w(r0)
            a.a.w(r0)
            java.lang.String r0 = java.lang.Integer.toString(r2, r0)
            r0.getClass()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r5.<init>(r0)
            throw r5
        L52:
            okio.Buffer r5 = r5.bufferField
            long r0 = r5.readHexadecimalUnsignedLong()
            return r0
    }

    public static final int commonReadInt(okio.RealBufferedSource r2) {
            r2.getClass()
            r0 = 4
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            int r2 = r2.readInt()
            return r2
    }

    public static final int commonReadIntLe(okio.RealBufferedSource r2) {
            r2.getClass()
            r0 = 4
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            int r2 = r2.readIntLe()
            return r2
    }

    public static final long commonReadLong(okio.RealBufferedSource r2) {
            r2.getClass()
            r0 = 8
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            long r0 = r2.readLong()
            return r0
    }

    public static final long commonReadLongLe(okio.RealBufferedSource r2) {
            r2.getClass()
            r0 = 8
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            long r0 = r2.readLongLe()
            return r0
    }

    public static final short commonReadShort(okio.RealBufferedSource r2) {
            r2.getClass()
            r0 = 2
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            short r2 = r2.readShort()
            return r2
    }

    public static final short commonReadShortLe(okio.RealBufferedSource r2) {
            r2.getClass()
            r0 = 2
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            short r2 = r2.readShortLe()
            return r2
    }

    public static final java.lang.String commonReadUtf8(okio.RealBufferedSource r2) {
            r2.getClass()
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r2 = r2.bufferField
            java.lang.String r2 = r2.readUtf8()
            return r2
    }

    public static final java.lang.String commonReadUtf8(okio.RealBufferedSource r0, long r1) {
            r0.getClass()
            r0.require(r1)
            okio.Buffer r0 = r0.bufferField
            java.lang.String r0 = r0.readUtf8(r1)
            return r0
    }

    public static final int commonReadUtf8CodePoint(okio.RealBufferedSource r3) {
            r3.getClass()
            r0 = 1
            r3.require(r0)
            okio.Buffer r0 = r3.bufferField
            r1 = 0
            byte r0 = r0.getByte(r1)
            r1 = r0 & 224(0xe0, float:3.14E-43)
            r2 = 192(0xc0, float:2.69E-43)
            if (r1 != r2) goto L1c
            r0 = 2
            r3.require(r0)
            goto L33
        L1c:
            r1 = r0 & 240(0xf0, float:3.36E-43)
            r2 = 224(0xe0, float:3.14E-43)
            if (r1 != r2) goto L28
            r0 = 3
            r3.require(r0)
            goto L33
        L28:
            r0 = r0 & 248(0xf8, float:3.48E-43)
            r1 = 240(0xf0, float:3.36E-43)
            if (r0 != r1) goto L33
            r0 = 4
            r3.require(r0)
        L33:
            okio.Buffer r3 = r3.bufferField
            int r3 = r3.readUtf8CodePoint()
            return r3
    }

    public static final java.lang.String commonReadUtf8Line(okio.RealBufferedSource r4) {
            r4.getClass()
            r0 = 10
            long r0 = r4.indexOf(r0)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            okio.Buffer r3 = r4.bufferField
            if (r2 != 0) goto L28
            long r0 = r3.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L26
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            java.lang.String r4 = r4.readUtf8(r0)
            return r4
        L26:
            r4 = 0
            return r4
        L28:
            java.lang.String r4 = okio.internal.Buffer.readUtf8Line(r3, r0)
            return r4
    }

    public static final java.lang.String commonReadUtf8LineStrict(okio.RealBufferedSource r13, long r14) {
            r13.getClass()
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 < 0) goto L8c
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            r3 = 1
            if (r2 != 0) goto L16
            r11 = r0
            goto L19
        L16:
            long r5 = r14 + r3
            r11 = r5
        L19:
            r8 = 10
            r9 = 0
            r7 = r13
            long r5 = r7.indexOf(r8, r9, r11)
            r8 = -1
            int r13 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r13 == 0) goto L2f
            okio.Buffer r13 = r7.bufferField
            java.lang.String r13 = okio.internal.Buffer.readUtf8Line(r13, r5)
            return r13
        L2f:
            int r13 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r13 >= 0) goto L5e
            boolean r13 = r7.request(r11)
            if (r13 == 0) goto L5e
            okio.Buffer r13 = r7.bufferField
            long r0 = r11 - r3
            byte r13 = r13.getByte(r0)
            r0 = 13
            if (r13 != r0) goto L5e
            long r0 = r11 + r3
            boolean r13 = r7.request(r0)
            if (r13 == 0) goto L5e
            okio.Buffer r13 = r7.bufferField
            byte r13 = r13.getByte(r11)
            r0 = 10
            if (r13 != r0) goto L5e
            okio.Buffer r13 = r7.bufferField
            java.lang.String r13 = okio.internal.Buffer.readUtf8Line(r13, r11)
            return r13
        L5e:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            okio.Buffer r0 = r7.bufferField
            long r2 = r0.size()
            r13 = 32
            long r4 = (long) r13
            long r4 = java.lang.Math.min(r4, r2)
            r2 = 0
            r0.copyTo(r1, r2, r4)
            okio.Buffer r13 = r7.bufferField
            long r2 = r13.size()
            long r13 = java.lang.Math.min(r2, r14)
            okio.ByteString r15 = r1.readByteString()
            java.lang.String r15 = r15.hex()
            j8.o.g(r15, r13)
            r13 = 0
            return r13
        L8c:
            java.lang.String r13 = "limit < 0: "
            java.lang.String r13 = bc.e.g(r14, r13)
            j8.o.q(r13)
            r13 = 0
            return r13
    }

    public static final boolean commonRequest(okio.RealBufferedSource r4, long r5) {
            r4.getClass()
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L32
            boolean r0 = r4.closed
            if (r0 != 0) goto L2b
        Ld:
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L29
            okio.Source r0 = r4.source
            okio.Buffer r1 = r4.bufferField
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Ld
            r4 = 0
            return r4
        L29:
            r4 = 1
            return r4
        L2b:
            java.lang.String r4 = "closed"
            j8.o.A(r4)
        L30:
            r4 = 0
            return r4
        L32:
            java.lang.String r4 = "byteCount < 0: "
            java.lang.String r4 = bc.e.g(r5, r4)
            j8.o.q(r4)
            goto L30
    }

    public static final void commonRequire(okio.RealBufferedSource r0, long r1) {
            r0.getClass()
            boolean r0 = r0.request(r1)
            if (r0 == 0) goto La
            return
        La:
            j8.o.a()
            return
    }

    public static final int commonSelect(okio.RealBufferedSource r5, okio.Options r6) {
            r5.getClass()
            r6.getClass()
            boolean r0 = r5.closed
            if (r0 != 0) goto L3a
        La:
            okio.Buffer r0 = r5.bufferField
            r1 = 1
            int r0 = okio.internal.Buffer.selectPrefix(r0, r6, r1)
            r1 = -2
            r2 = -1
            if (r0 == r1) goto L29
            if (r0 == r2) goto L28
            okio.ByteString[] r6 = r6.getByteStrings$okio()
            r6 = r6[r0]
            int r6 = r6.size()
            okio.Buffer r5 = r5.bufferField
            long r1 = (long) r6
            r5.skip(r1)
            return r0
        L28:
            return r2
        L29:
            okio.Source r0 = r5.source
            okio.Buffer r1 = r5.bufferField
            r3 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r3)
            r3 = -1
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto La
            return r2
        L3a:
            java.lang.String r5 = "closed"
            j8.o.A(r5)
            r5 = 0
            return r5
    }

    public static final void commonSkip(okio.RealBufferedSource r4, long r5) {
            r4.getClass()
            boolean r0 = r4.closed
            if (r0 != 0) goto L3e
        L7:
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L3d
            okio.Buffer r2 = r4.bufferField
            long r2 = r2.size()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L2c
            okio.Source r0 = r4.source
            okio.Buffer r1 = r4.bufferField
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L28
            goto L2c
        L28:
            j8.o.a()
            return
        L2c:
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            long r0 = java.lang.Math.min(r5, r0)
            okio.Buffer r2 = r4.bufferField
            r2.skip(r0)
            long r5 = r5 - r0
            goto L7
        L3d:
            return
        L3e:
            java.lang.String r4 = "closed"
            j8.o.A(r4)
            return
    }

    public static final okio.Timeout commonTimeout(okio.RealBufferedSource r0) {
            r0.getClass()
            okio.Source r0 = r0.source
            okio.Timeout r0 = r0.timeout()
            return r0
    }

    public static final java.lang.String commonToString(okio.RealBufferedSource r2) {
            r2.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "buffer("
            r0.<init>(r1)
            okio.Source r2 = r2.source
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
