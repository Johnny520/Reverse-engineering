package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class OutputStreamSink implements okio.Sink {
    private final java.io.OutputStream out;
    private final okio.Timeout timeout;

    public OutputStreamSink(java.io.OutputStream r1, okio.Timeout r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.out = r1
            r0.timeout = r2
            return
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            r0.close()
            return
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            r0.flush()
            return
    }

    @Override // okio.Sink
    public okio.Timeout timeout() {
            r1 = this;
            okio.Timeout r0 = r1.timeout
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "sink("
            r0.<init>(r1)
            java.io.OutputStream r1 = r2.out
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // okio.Sink
    public void write(okio.Buffer r7, long r8) {
            r6 = this;
            r7.getClass()
            long r0 = r7.size()
            r2 = 0
            r4 = r8
            okio.SegmentedByteString.checkOffsetAndCount(r0, r2, r4)
        Ld:
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L50
            okio.Timeout r0 = r6.timeout
            r0.throwIfReached()
            okio.Segment r0 = r7.head
            r0.getClass()
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r8, r1)
            int r1 = (int) r1
            java.io.OutputStream r2 = r6.out
            byte[] r3 = r0.data
            int r4 = r0.pos
            r2.write(r3, r4, r1)
            int r2 = r0.pos
            int r2 = r2 + r1
            r0.pos = r2
            long r1 = (long) r1
            long r8 = r8 - r1
            long r3 = r7.size()
            long r3 = r3 - r1
            r7.setSize$okio(r3)
            int r1 = r0.pos
            int r2 = r0.limit
            if (r1 != r2) goto Ld
            okio.Segment r1 = r0.pop()
            r7.head = r1
            okio.SegmentPool.recycle(r0)
            goto Ld
        L50:
            return
    }
}
