package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class GzipSink implements okio.Sink {
    private boolean closed;
    private final java.util.zip.CRC32 crc;
    private final java.util.zip.Deflater deflater;
    private final okio.DeflaterSink deflaterSink;
    private final okio.RealBufferedSink sink;

    public GzipSink(okio.Sink r4) {
            r3 = this;
            r4.getClass()
            r3.<init>()
            okio.RealBufferedSink r0 = new okio.RealBufferedSink
            r0.<init>(r4)
            r3.sink = r0
            java.util.zip.Deflater r4 = new java.util.zip.Deflater
            r1 = -1
            r2 = 1
            r4.<init>(r1, r2)
            r3.deflater = r4
            okio.DeflaterSink r1 = new okio.DeflaterSink
            r1.<init>(r0, r4)
            r3.deflaterSink = r1
            java.util.zip.CRC32 r4 = new java.util.zip.CRC32
            r4.<init>()
            r3.crc = r4
            okio.Buffer r4 = r0.bufferField
            r0 = 8075(0x1f8b, float:1.1315E-41)
            r4.writeShort(r0)
            r0 = 8
            r4.writeByte(r0)
            r0 = 0
            r4.writeByte(r0)
            r4.writeInt(r0)
            r4.writeByte(r0)
            r4.writeByte(r0)
            return
    }

    private final void updateCrc(okio.Buffer r5, long r6) {
            r4 = this;
            okio.Segment r5 = r5.head
            r5.getClass()
        L5:
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L27
            int r0 = r5.limit
            int r1 = r5.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r0 = java.lang.Math.min(r6, r0)
            int r0 = (int) r0
            java.util.zip.CRC32 r1 = r4.crc
            byte[] r2 = r5.data
            int r3 = r5.pos
            r1.update(r2, r3, r0)
            long r0 = (long) r0
            long r6 = r6 - r0
            okio.Segment r5 = r5.next
            r5.getClass()
            goto L5
        L27:
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

    @sf.a
    /* JADX INFO: renamed from: -deprecated_deflater, reason: not valid java name */
    public final java.util.zip.Deflater m170deprecated_deflater() {
            r1 = this;
            java.util.zip.Deflater r0 = r1.deflater
            return r0
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 == 0) goto L5
            goto L29
        L5:
            okio.DeflaterSink r0 = r2.deflaterSink     // Catch: java.lang.Throwable -> Lf
            r0.finishDeflate$okio()     // Catch: java.lang.Throwable -> Lf
            r2.writeFooter()     // Catch: java.lang.Throwable -> Lf
            r0 = 0
            goto L10
        Lf:
            r0 = move-exception
        L10:
            java.util.zip.Deflater r1 = r2.deflater     // Catch: java.lang.Throwable -> L16
            r1.end()     // Catch: java.lang.Throwable -> L16
            goto L1a
        L16:
            r1 = move-exception
            if (r0 != 0) goto L1a
            r0 = r1
        L1a:
            okio.RealBufferedSink r1 = r2.sink     // Catch: java.lang.Throwable -> L20
            r1.close()     // Catch: java.lang.Throwable -> L20
            goto L24
        L20:
            r1 = move-exception
            if (r0 != 0) goto L24
            r0 = r1
        L24:
            r1 = 1
            r2.closed = r1
            if (r0 != 0) goto L2a
        L29:
            return
        L2a:
            throw r0
    }

    public final java.util.zip.Deflater deflater() {
            r1 = this;
            java.util.zip.Deflater r0 = r1.deflater
            return r0
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
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
    public void write(okio.Buffer r3, long r4) {
            r2 = this;
            r3.getClass()
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L15
            if (r0 != 0) goto Lc
            return
        Lc:
            r2.updateCrc(r3, r4)
            okio.DeflaterSink r0 = r2.deflaterSink
            r0.write(r3, r4)
            return
        L15:
            java.lang.String r3 = "byteCount < 0: "
            java.lang.String r3 = bc.e.g(r4, r3)
            j8.o.q(r3)
            return
    }
}
