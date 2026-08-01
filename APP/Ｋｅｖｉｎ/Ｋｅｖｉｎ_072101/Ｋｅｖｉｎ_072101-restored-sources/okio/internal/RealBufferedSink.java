package okio.internal;

/* JADX INFO: renamed from: okio.internal.-RealBufferedSink, reason: invalid class name */
/* JADX INFO: compiled from: RealBufferedSink.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a\r\u0010\u0005\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0080\b\u001a\r\u0010\t\u001a\u00020\n*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0080\b\u001a%\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b\u001a\u001d\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0080\b\u001a%\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b\u001a\u001d\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u0016\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\f\u001a\u00020\u0015H\u0080\b\u001a\u0015\u0010\u0017\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u0019\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001c\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u001e\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010 \u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010!\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\"\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010#\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\"\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010$\u001a\u00020\u0004*\u00020\u00022\u0006\u0010%\u001a\u00020\nH\u0080\b\u001a%\u0010$\u001a\u00020\u0004*\u00020\u00022\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010(\u001a\u00020\u0004*\u00020\u00022\u0006\u0010)\u001a\u00020\u000fH\u0080\b¨\u0006*"}, m115d2 = {"commonClose", "", "Lokio/RealBufferedSink;", "commonEmit", "Lokio/BufferedSink;", "commonEmitCompleteSegments", "commonFlush", "commonTimeout", "Lokio/Timeout;", "commonToString", "", "commonWrite", "source", "", "offset", "", "byteCount", "Lokio/Buffer;", "", "byteString", "Lokio/ByteString;", "Lokio/Source;", "commonWriteAll", "commonWriteByte", "b", "commonWriteDecimalLong", "v", "commonWriteHexadecimalUnsignedLong", "commonWriteInt", "i", "commonWriteIntLe", "commonWriteLong", "commonWriteLongLe", "commonWriteShort", "s", "commonWriteShortLe", "commonWriteUtf8", "string", "beginIndex", "endIndex", "commonWriteUtf8CodePoint", "codePoint", "okio"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class RealBufferedSink {
    public static final void commonClose(okio.RealBufferedSink r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            boolean r1 = r7.closed
            if (r1 == 0) goto Lb
            return
        Lb:
            r1 = 0
            r2 = r7
            r3 = 0
            okio.Buffer r4 = r2.bufferField     // Catch: java.lang.Throwable -> L2d
            long r2 = r4.size()     // Catch: java.lang.Throwable -> L2d
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L2f
            okio.Sink r2 = r7.sink     // Catch: java.lang.Throwable -> L2d
            r3 = r7
            r4 = 0
            okio.Buffer r5 = r3.bufferField     // Catch: java.lang.Throwable -> L2d
            r3 = r7
            r4 = 0
            okio.Buffer r6 = r3.bufferField     // Catch: java.lang.Throwable -> L2d
            long r3 = r6.size()     // Catch: java.lang.Throwable -> L2d
            r2.write(r5, r3)     // Catch: java.lang.Throwable -> L2d
            goto L2f
        L2d:
            r2 = move-exception
            r1 = r2
        L2f:
            okio.Sink r2 = r7.sink     // Catch: java.lang.Throwable -> L36
            r2.close()     // Catch: java.lang.Throwable -> L36
            goto L3a
        L36:
            r2 = move-exception
            if (r1 != 0) goto L3a
            r1 = r2
        L3a:
            r2 = 1
            r7.closed = r2
            if (r1 != 0) goto L40
            return
        L40:
            throw r1
    }

    public static final okio.BufferedSink commonEmit(okio.RealBufferedSink r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            boolean r1 = r6.closed
            if (r1 != 0) goto L25
            r1 = r6
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            long r1 = r1.size()
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L21
            okio.Sink r3 = r6.sink
            r4 = r6
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            r3.write(r4, r1)
        L21:
            r3 = r6
            okio.BufferedSink r3 = (okio.BufferedSink) r3
            return r3
        L25:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final okio.BufferedSink commonEmitCompleteSegments(okio.RealBufferedSink r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            boolean r1 = r6.closed
            if (r1 != 0) goto L25
            r1 = r6
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            long r1 = r1.completeSegmentByteCount()
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L21
            okio.Sink r3 = r6.sink
            r4 = r6
            r5 = 0
            okio.Buffer r4 = r4.bufferField
            r3.write(r4, r1)
        L21:
            r3 = r6
            okio.BufferedSink r3 = (okio.BufferedSink) r3
            return r3
        L25:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final void commonFlush(okio.RealBufferedSink r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            boolean r1 = r5.closed
            if (r1 != 0) goto L2f
            r1 = r5
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            long r1 = r1.size()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L29
            okio.Sink r1 = r5.sink
            r2 = r5
            r3 = 0
            okio.Buffer r2 = r2.bufferField
            r3 = r5
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            long r3 = r3.size()
            r1.write(r2, r3)
        L29:
            okio.Sink r1 = r5.sink
            r1.flush()
            return
        L2f:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final okio.Timeout commonTimeout(okio.RealBufferedSink r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            okio.Sink r1 = r2.sink
            okio.Timeout r1 = r1.timeout()
            return r1
    }

    public static final java.lang.String commonToString(okio.RealBufferedSink r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "buffer("
            java.lang.StringBuilder r1 = r1.append(r2)
            okio.Sink r2 = r3.sink
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 41
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static final okio.BufferedSink commonWrite(okio.RealBufferedSink r3, okio.ByteString r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "byteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            boolean r1 = r3.closed
            if (r1 != 0) goto L1b
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r1.write(r4)
            okio.BufferedSink r1 = r3.emitCompleteSegments()
            return r1
        L1b:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final okio.BufferedSink commonWrite(okio.RealBufferedSink r3, okio.ByteString r4, int r5, int r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "byteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            boolean r1 = r3.closed
            if (r1 != 0) goto L1b
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r1.write(r4, r5, r6)
            okio.BufferedSink r1 = r3.emitCompleteSegments()
            return r1
        L1b:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final okio.BufferedSink commonWrite(okio.RealBufferedSink r7, okio.Source r8, long r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            r1 = r9
        Lc:
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2b
            r3 = r7
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            long r3 = r8.read(r3, r1)
            r5 = -1
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L25
            long r1 = r1 - r3
            r7.emitCompleteSegments()
            goto Lc
        L25:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L2b:
            r3 = r7
            okio.BufferedSink r3 = (okio.BufferedSink) r3
            return r3
    }

    public static final okio.BufferedSink commonWrite(okio.RealBufferedSink r3, byte[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            boolean r1 = r3.closed
            if (r1 != 0) goto L1b
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r1.write(r4)
            okio.BufferedSink r1 = r3.emitCompleteSegments()
            return r1
        L1b:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final okio.BufferedSink commonWrite(okio.RealBufferedSink r3, byte[] r4, int r5, int r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            boolean r1 = r3.closed
            if (r1 != 0) goto L1b
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r1.write(r4, r5, r6)
            okio.BufferedSink r1 = r3.emitCompleteSegments()
            return r1
        L1b:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final void commonWrite(okio.RealBufferedSink r3, okio.Buffer r4, long r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            boolean r1 = r3.closed
            if (r1 != 0) goto L1a
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r1.write(r4, r5)
            r3.emitCompleteSegments()
            return
        L1a:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final long commonWriteAll(okio.RealBufferedSink r7, okio.Source r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            r1 = 0
        Ld:
            r3 = r7
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            r4 = 8192(0x2000, double:4.0474E-320)
            long r3 = r8.read(r3, r4)
            r5 = -1
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L23
            long r1 = r1 + r3
            r7.emitCompleteSegments()
            goto Ld
        L23:
            return r1
    }

    public static final okio.BufferedSink commonWriteByte(okio.RealBufferedSink r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            boolean r1 = r3.closed
            if (r1 != 0) goto L16
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r1.writeByte(r4)
            okio.BufferedSink r1 = r3.emitCompleteSegments()
            return r1
        L16:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final okio.BufferedSink commonWriteDecimalLong(okio.RealBufferedSink r3, long r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            boolean r1 = r3.closed
            if (r1 != 0) goto L16
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r1.writeDecimalLong(r4)
            okio.BufferedSink r1 = r3.emitCompleteSegments()
            return r1
        L16:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final okio.BufferedSink commonWriteHexadecimalUnsignedLong(okio.RealBufferedSink r3, long r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            boolean r1 = r3.closed
            if (r1 != 0) goto L16
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r1.writeHexadecimalUnsignedLong(r4)
            okio.BufferedSink r1 = r3.emitCompleteSegments()
            return r1
        L16:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final okio.BufferedSink commonWriteInt(okio.RealBufferedSink r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            boolean r1 = r3.closed
            if (r1 != 0) goto L16
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r1.writeInt(r4)
            okio.BufferedSink r1 = r3.emitCompleteSegments()
            return r1
        L16:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final okio.BufferedSink commonWriteIntLe(okio.RealBufferedSink r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            boolean r1 = r3.closed
            if (r1 != 0) goto L16
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r1.writeIntLe(r4)
            okio.BufferedSink r1 = r3.emitCompleteSegments()
            return r1
        L16:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final okio.BufferedSink commonWriteLong(okio.RealBufferedSink r3, long r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            boolean r1 = r3.closed
            if (r1 != 0) goto L16
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r1.writeLong(r4)
            okio.BufferedSink r1 = r3.emitCompleteSegments()
            return r1
        L16:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final okio.BufferedSink commonWriteLongLe(okio.RealBufferedSink r3, long r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            boolean r1 = r3.closed
            if (r1 != 0) goto L16
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r1.writeLongLe(r4)
            okio.BufferedSink r1 = r3.emitCompleteSegments()
            return r1
        L16:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final okio.BufferedSink commonWriteShort(okio.RealBufferedSink r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            boolean r1 = r3.closed
            if (r1 != 0) goto L16
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r1.writeShort(r4)
            okio.BufferedSink r1 = r3.emitCompleteSegments()
            return r1
        L16:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final okio.BufferedSink commonWriteShortLe(okio.RealBufferedSink r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            boolean r1 = r3.closed
            if (r1 != 0) goto L16
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r1.writeShortLe(r4)
            okio.BufferedSink r1 = r3.emitCompleteSegments()
            return r1
        L16:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final okio.BufferedSink commonWriteUtf8(okio.RealBufferedSink r3, java.lang.String r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            boolean r1 = r3.closed
            if (r1 != 0) goto L1b
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r1.writeUtf8(r4)
            okio.BufferedSink r1 = r3.emitCompleteSegments()
            return r1
        L1b:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final okio.BufferedSink commonWriteUtf8(okio.RealBufferedSink r3, java.lang.String r4, int r5, int r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            boolean r1 = r3.closed
            if (r1 != 0) goto L1b
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r1.writeUtf8(r4, r5, r6)
            okio.BufferedSink r1 = r3.emitCompleteSegments()
            return r1
        L1b:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final okio.BufferedSink commonWriteUtf8CodePoint(okio.RealBufferedSink r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            boolean r1 = r3.closed
            if (r1 != 0) goto L16
            r1 = r3
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            r1.writeUtf8CodePoint(r4)
            okio.BufferedSink r1 = r3.emitCompleteSegments()
            return r1
        L16:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }
}
