package okio;

/* JADX INFO: compiled from: GzipSink.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0010J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u00020\t8G¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m115d2 = {"Lokio/GzipSink;", "Lokio/Sink;", "sink", "(Lokio/Sink;)V", "closed", "", "crc", "Ljava/util/zip/CRC32;", "deflater", "Ljava/util/zip/Deflater;", "()Ljava/util/zip/Deflater;", "deflaterSink", "Lokio/DeflaterSink;", "Lokio/RealBufferedSink;", "close", "", "-deprecated_deflater", "flush", "timeout", "Lokio/Timeout;", "updateCrc", "buffer", "Lokio/Buffer;", "byteCount", "", "write", "source", "writeFooter", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class GzipSink implements okio.Sink {
    private boolean closed;
    private final java.util.zip.CRC32 crc;
    private final java.util.zip.Deflater deflater;
    private final okio.DeflaterSink deflaterSink;
    private final okio.RealBufferedSink sink;

    public GzipSink(okio.Sink r4) {
            r3 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r3.<init>()
            okio.RealBufferedSink r0 = new okio.RealBufferedSink
            r0.<init>(r4)
            r3.sink = r0
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            r1 = -1
            r2 = 1
            r0.<init>(r1, r2)
            r3.deflater = r0
            okio.DeflaterSink r0 = new okio.DeflaterSink
            okio.RealBufferedSink r1 = r3.sink
            okio.BufferedSink r1 = (okio.BufferedSink) r1
            java.util.zip.Deflater r2 = r3.deflater
            r0.<init>(r1, r2)
            r3.deflaterSink = r0
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r3.crc = r0
            okio.RealBufferedSink r0 = r3.sink
            r1 = 0
            okio.Buffer r0 = r0.bufferField
            r1 = 0
            r2 = 8075(0x1f8b, float:1.1315E-41)
            r0.writeShort(r2)
            r2 = 8
            r0.writeByte(r2)
            r2 = 0
            r0.writeByte(r2)
            r0.writeInt(r2)
            r0.writeByte(r2)
            r0.writeByte(r2)
            return
    }

    private final void updateCrc(okio.Buffer r8, long r9) {
            r7 = this;
            okio.Segment r0 = r8.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = r9
        L6:
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2a
            int r3 = r0.limit
            int r4 = r0.pos
            int r3 = r3 - r4
            r4 = 0
            long r5 = (long) r3
            long r5 = java.lang.Math.min(r1, r5)
            int r3 = (int) r5
            java.util.zip.CRC32 r4 = r7.crc
            byte[] r5 = r0.data
            int r6 = r0.pos
            r4.update(r5, r6, r3)
            long r4 = (long) r3
            long r1 = r1 - r4
            okio.Segment r4 = r0.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r0 = r4
            goto L6
        L2a:
            return
    }

    private final void writeFooter() {
            r3 = this;
            okio.RealBufferedSink r0 = r3.sink
            java.util.zip.CRC32 r1 = r3.crc
            long r1 = r1.getValue()
            int r1 = (int) r1
            r0.writeIntLe(r1)
            okio.RealBufferedSink r0 = r3.sink
            java.util.zip.Deflater r1 = r3.deflater
            long r1 = r1.getBytesRead()
            int r1 = (int) r1
            r0.writeIntLe(r1)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "deflater", imports = {}))
    /* JADX INFO: renamed from: -deprecated_deflater, reason: not valid java name */
    public final java.util.zip.Deflater m10385deprecated_deflater() {
            r1 = this;
            java.util.zip.Deflater r0 = r1.deflater
            return r0
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            okio.DeflaterSink r1 = r2.deflaterSink     // Catch: java.lang.Throwable -> L10
            r1.finishDeflate$okio()     // Catch: java.lang.Throwable -> L10
            r2.writeFooter()     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r1 = move-exception
            r0 = r1
        L12:
            java.util.zip.Deflater r1 = r2.deflater     // Catch: java.lang.Throwable -> L19
            r1.end()     // Catch: java.lang.Throwable -> L19
            goto L1d
        L19:
            r1 = move-exception
            if (r0 != 0) goto L1d
            r0 = r1
        L1d:
            okio.RealBufferedSink r1 = r2.sink     // Catch: java.lang.Throwable -> L24
            r1.close()     // Catch: java.lang.Throwable -> L24
            goto L28
        L24:
            r1 = move-exception
            if (r0 != 0) goto L28
            r0 = r1
        L28:
            r1 = 1
            r2.closed = r1
            if (r0 != 0) goto L2e
            return
        L2e:
            throw r0
    }

    public final java.util.zip.Deflater deflater() {
            r1 = this;
            java.util.zip.Deflater r0 = r1.deflater
            return r0
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            okio.DeflaterSink r0 = r1.deflaterSink
            r0.flush()
            return
    }

    @Override // okio.Sink
    public okio.Timeout timeout() {
            r1 = this;
            okio.RealBufferedSink r0 = r1.sink
            okio.Timeout r0 = r0.timeout()
            return r0
    }

    @Override // okio.Sink
    public void write(okio.Buffer r4, long r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 == 0) goto L1e
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L15
            return
        L15:
            r3.updateCrc(r4, r5)
            okio.DeflaterSink r0 = r3.deflaterSink
            r0.write(r4, r5)
            return
        L1e:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "byteCount < 0: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }
}
