package okio.internal;

/* JADX INFO: renamed from: okio.internal.-RealBufferedSink, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RealBufferedSink {
    public static final void commonClose(okio.RealBufferedSink r4) {
            r4.getClass()
            boolean r0 = r4.closed
            if (r0 == 0) goto L8
            goto L32
        L8:
            okio.Buffer r0 = r4.bufferField     // Catch: java.lang.Throwable -> L20
            long r0 = r0.size()     // Catch: java.lang.Throwable -> L20
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L22
            okio.Sink r0 = r4.sink     // Catch: java.lang.Throwable -> L20
            okio.Buffer r1 = r4.bufferField     // Catch: java.lang.Throwable -> L20
            long r2 = r1.size()     // Catch: java.lang.Throwable -> L20
            r0.write(r1, r2)     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r0 = move-exception
            goto L23
        L22:
            r0 = 0
        L23:
            okio.Sink r1 = r4.sink     // Catch: java.lang.Throwable -> L29
            r1.close()     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            r1 = move-exception
            if (r0 != 0) goto L2d
            r0 = r1
        L2d:
            r1 = 1
            r4.closed = r1
            if (r0 != 0) goto L33
        L32:
            return
        L33:
            throw r0
    }

    public static final okio.BufferedSink commonEmit(okio.RealBufferedSink r4) {
            r4.getClass()
            boolean r0 = r4.closed
            if (r0 != 0) goto L1b
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1a
            okio.Sink r2 = r4.sink
            okio.Buffer r3 = r4.bufferField
            r2.write(r3, r0)
        L1a:
            return r4
        L1b:
            java.lang.String r4 = "closed"
            j8.o.A(r4)
            r4 = 0
            return r4
    }

    public static final okio.BufferedSink commonEmitCompleteSegments(okio.RealBufferedSink r4) {
            r4.getClass()
            boolean r0 = r4.closed
            if (r0 != 0) goto L1b
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.completeSegmentByteCount()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1a
            okio.Sink r2 = r4.sink
            okio.Buffer r3 = r4.bufferField
            r2.write(r3, r0)
        L1a:
            return r4
        L1b:
            java.lang.String r4 = "closed"
            j8.o.A(r4)
            r4 = 0
            return r4
    }

    public static final void commonFlush(okio.RealBufferedSink r4) {
            r4.getClass()
            boolean r0 = r4.closed
            if (r0 != 0) goto L24
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1e
            okio.Sink r0 = r4.sink
            okio.Buffer r1 = r4.bufferField
            long r2 = r1.size()
            r0.write(r1, r2)
        L1e:
            okio.Sink r4 = r4.sink
            r4.flush()
            return
        L24:
            java.lang.String r4 = "closed"
            j8.o.A(r4)
            return
    }

    public static final okio.Timeout commonTimeout(okio.RealBufferedSink r0) {
            r0.getClass()
            okio.Sink r0 = r0.sink
            okio.Timeout r0 = r0.timeout()
            return r0
    }

    public static final java.lang.String commonToString(okio.RealBufferedSink r2) {
            r2.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "buffer("
            r0.<init>(r1)
            okio.Sink r2 = r2.sink
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static final okio.BufferedSink commonWrite(okio.RealBufferedSink r1, okio.ByteString r2) {
            r1.getClass()
            r2.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L14
            okio.Buffer r0 = r1.bufferField
            r0.write(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L14:
            java.lang.String r1 = "closed"
            j8.o.A(r1)
            r1 = 0
            return r1
    }

    public static final okio.BufferedSink commonWrite(okio.RealBufferedSink r1, okio.ByteString r2, int r3, int r4) {
            r1.getClass()
            r2.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L14
            okio.Buffer r0 = r1.bufferField
            r0.write(r2, r3, r4)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L14:
            java.lang.String r1 = "closed"
            j8.o.A(r1)
            r1 = 0
            return r1
    }

    public static final okio.BufferedSink commonWrite(okio.RealBufferedSink r4, okio.Source r5, long r6) {
            r4.getClass()
            r5.getClass()
        L6:
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L21
            okio.Buffer r0 = r4.bufferField
            long r0 = r5.read(r0, r6)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1d
            long r6 = r6 - r0
            r4.emitCompleteSegments()
            goto L6
        L1d:
            j8.o.a()
            r4 = 0
        L21:
            return r4
    }

    public static final okio.BufferedSink commonWrite(okio.RealBufferedSink r1, byte[] r2) {
            r1.getClass()
            r2.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L14
            okio.Buffer r0 = r1.bufferField
            r0.write(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L14:
            java.lang.String r1 = "closed"
            j8.o.A(r1)
            r1 = 0
            return r1
    }

    public static final okio.BufferedSink commonWrite(okio.RealBufferedSink r1, byte[] r2, int r3, int r4) {
            r1.getClass()
            r2.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L14
            okio.Buffer r0 = r1.bufferField
            r0.write(r2, r3, r4)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L14:
            java.lang.String r1 = "closed"
            j8.o.A(r1)
            r1 = 0
            return r1
    }

    public static final void commonWrite(okio.RealBufferedSink r1, okio.Buffer r2, long r3) {
            r1.getClass()
            r2.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L13
            okio.Buffer r0 = r1.bufferField
            r0.write(r2, r3)
            r1.emitCompleteSegments()
            return
        L13:
            java.lang.String r1 = "closed"
            j8.o.A(r1)
            return
    }

    public static final long commonWriteAll(okio.RealBufferedSink r6, okio.Source r7) {
            r6.getClass()
            r7.getClass()
            r0 = 0
        L8:
            okio.Buffer r2 = r6.bufferField
            r3 = 8192(0x2000, double:4.0474E-320)
            long r2 = r7.read(r2, r3)
            r4 = -1
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L1b
            long r0 = r0 + r2
            r6.emitCompleteSegments()
            goto L8
        L1b:
            return r0
    }

    public static final okio.BufferedSink commonWriteByte(okio.RealBufferedSink r1, int r2) {
            r1.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L11
            okio.Buffer r0 = r1.bufferField
            r0.writeByte(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L11:
            java.lang.String r1 = "closed"
            j8.o.A(r1)
            r1 = 0
            return r1
    }

    public static final okio.BufferedSink commonWriteDecimalLong(okio.RealBufferedSink r1, long r2) {
            r1.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L11
            okio.Buffer r0 = r1.bufferField
            r0.writeDecimalLong(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L11:
            java.lang.String r1 = "closed"
            j8.o.A(r1)
            r1 = 0
            return r1
    }

    public static final okio.BufferedSink commonWriteHexadecimalUnsignedLong(okio.RealBufferedSink r1, long r2) {
            r1.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L11
            okio.Buffer r0 = r1.bufferField
            r0.writeHexadecimalUnsignedLong(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L11:
            java.lang.String r1 = "closed"
            j8.o.A(r1)
            r1 = 0
            return r1
    }

    public static final okio.BufferedSink commonWriteInt(okio.RealBufferedSink r1, int r2) {
            r1.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L11
            okio.Buffer r0 = r1.bufferField
            r0.writeInt(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L11:
            java.lang.String r1 = "closed"
            j8.o.A(r1)
            r1 = 0
            return r1
    }

    public static final okio.BufferedSink commonWriteIntLe(okio.RealBufferedSink r1, int r2) {
            r1.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L11
            okio.Buffer r0 = r1.bufferField
            r0.writeIntLe(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L11:
            java.lang.String r1 = "closed"
            j8.o.A(r1)
            r1 = 0
            return r1
    }

    public static final okio.BufferedSink commonWriteLong(okio.RealBufferedSink r1, long r2) {
            r1.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L11
            okio.Buffer r0 = r1.bufferField
            r0.writeLong(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L11:
            java.lang.String r1 = "closed"
            j8.o.A(r1)
            r1 = 0
            return r1
    }

    public static final okio.BufferedSink commonWriteLongLe(okio.RealBufferedSink r1, long r2) {
            r1.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L11
            okio.Buffer r0 = r1.bufferField
            r0.writeLongLe(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L11:
            java.lang.String r1 = "closed"
            j8.o.A(r1)
            r1 = 0
            return r1
    }

    public static final okio.BufferedSink commonWriteShort(okio.RealBufferedSink r1, int r2) {
            r1.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L11
            okio.Buffer r0 = r1.bufferField
            r0.writeShort(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L11:
            java.lang.String r1 = "closed"
            j8.o.A(r1)
            r1 = 0
            return r1
    }

    public static final okio.BufferedSink commonWriteShortLe(okio.RealBufferedSink r1, int r2) {
            r1.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L11
            okio.Buffer r0 = r1.bufferField
            r0.writeShortLe(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L11:
            java.lang.String r1 = "closed"
            j8.o.A(r1)
            r1 = 0
            return r1
    }

    public static final okio.BufferedSink commonWriteUtf8(okio.RealBufferedSink r1, java.lang.String r2) {
            r1.getClass()
            r2.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L14
            okio.Buffer r0 = r1.bufferField
            r0.writeUtf8(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L14:
            java.lang.String r1 = "closed"
            j8.o.A(r1)
            r1 = 0
            return r1
    }

    public static final okio.BufferedSink commonWriteUtf8(okio.RealBufferedSink r1, java.lang.String r2, int r3, int r4) {
            r1.getClass()
            r2.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L14
            okio.Buffer r0 = r1.bufferField
            r0.writeUtf8(r2, r3, r4)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L14:
            java.lang.String r1 = "closed"
            j8.o.A(r1)
            r1 = 0
            return r1
    }

    public static final okio.BufferedSink commonWriteUtf8CodePoint(okio.RealBufferedSink r1, int r2) {
            r1.getClass()
            boolean r0 = r1.closed
            if (r0 != 0) goto L11
            okio.Buffer r0 = r1.bufferField
            r0.writeUtf8CodePoint(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L11:
            java.lang.String r1 = "closed"
            j8.o.A(r1)
            r1 = 0
            return r1
    }
}
