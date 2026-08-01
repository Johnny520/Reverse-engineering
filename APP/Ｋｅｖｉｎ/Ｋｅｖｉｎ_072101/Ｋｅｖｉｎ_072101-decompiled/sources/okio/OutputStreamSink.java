package okio;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m115d2 = {"Lokio/OutputStreamSink;", "Lokio/Sink;", "out", "Ljava/io/OutputStream;", "timeout", "Lokio/Timeout;", "(Ljava/io/OutputStream;Lokio/Timeout;)V", "close", "", "flush", "toString", "", "write", "source", "Lokio/Buffer;", "byteCount", "", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
final class OutputStreamSink implements okio.Sink {
    private final java.io.OutputStream out;
    private final okio.Timeout timeout;

    public OutputStreamSink(java.io.OutputStream r2, okio.Timeout r3) {
            r1 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "timeout"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.out = r2
            r1.timeout = r3
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
            r0.<init>()
            java.lang.String r1 = "sink("
            java.lang.StringBuilder r0 = r0.append(r1)
            java.io.OutputStream r1 = r2.out
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // okio.Sink
    public void write(okio.Buffer r9, long r10) {
            r8 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            long r1 = r9.size()
            r3 = 0
            r5 = r10
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            r0 = r10
        L10:
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L55
            okio.Timeout r2 = r8.timeout
            r2.throwIfReached()
            okio.Segment r2 = r9.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r3 = r2.limit
            int r4 = r2.pos
            int r3 = r3 - r4
            r4 = 0
            long r5 = (long) r3
            long r5 = java.lang.Math.min(r0, r5)
            int r3 = (int) r5
            java.io.OutputStream r4 = r8.out
            byte[] r5 = r2.data
            int r6 = r2.pos
            r4.write(r5, r6, r3)
            int r4 = r2.pos
            int r4 = r4 + r3
            r2.pos = r4
            long r4 = (long) r3
            long r0 = r0 - r4
            long r4 = r9.size()
            long r6 = (long) r3
            long r4 = r4 - r6
            r9.setSize$okio(r4)
            int r4 = r2.pos
            int r5 = r2.limit
            if (r4 != r5) goto L10
            okio.Segment r4 = r2.pop()
            r9.head = r4
            okio.SegmentPool.recycle(r2)
            goto L10
        L55:
            return
    }
}
