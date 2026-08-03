package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class InflaterSource implements okio.Source {
    private int bufferBytesHeldByInflater;
    private boolean closed;
    private final java.util.zip.Inflater inflater;
    private final okio.BufferedSource source;

    public InflaterSource(okio.BufferedSource r1, java.util.zip.Inflater r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.source = r1
            r0.inflater = r2
            return
    }

    public InflaterSource(okio.Source r1, java.util.zip.Inflater r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            okio.BufferedSource r1 = okio.Okio.buffer(r1)
            r0.<init>(r1, r2)
            return
    }

    private final void releaseBytesAfterInflate() {
            r4 = this;
            int r0 = r4.bufferBytesHeldByInflater
            if (r0 != 0) goto L5
            return
        L5:
            java.util.zip.Inflater r1 = r4.inflater
            int r1 = r1.getRemaining()
            int r0 = r0 - r1
            int r1 = r4.bufferBytesHeldByInflater
            int r1 = r1 - r0
            r4.bufferBytesHeldByInflater = r1
            okio.BufferedSource r1 = r4.source
            long r2 = (long) r0
            r1.skip(r2)
            return
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 == 0) goto L5
            return
        L5:
            java.util.zip.Inflater r0 = r1.inflater
            r0.end()
            r0 = 1
            r1.closed = r0
            okio.BufferedSource r0 = r1.source
            r0.close()
            return
    }

    @Override // okio.Source
    public long read(okio.Buffer r5, long r6) {
            r4 = this;
            r5.getClass()
        L3:
            long r0 = r4.readOrInflate(r5, r6)
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto Le
            return r0
        Le:
            java.util.zip.Inflater r0 = r4.inflater
            boolean r0 = r0.finished()
            if (r0 != 0) goto L30
            java.util.zip.Inflater r0 = r4.inflater
            boolean r0 = r0.needsDictionary()
            if (r0 == 0) goto L1f
            goto L30
        L1f:
            okio.BufferedSource r0 = r4.source
            boolean r0 = r0.exhausted()
            if (r0 != 0) goto L28
            goto L3
        L28:
            java.io.EOFException r5 = new java.io.EOFException
            java.lang.String r6 = "source exhausted prematurely"
            r5.<init>(r6)
            throw r5
        L30:
            r5 = -1
            return r5
    }

    public final long readOrInflate(okio.Buffer r6, long r7) {
            r5 = this;
            r6.getClass()
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto L60
            boolean r3 = r5.closed
            if (r3 != 0) goto L58
            if (r2 != 0) goto L10
            return r0
        L10:
            r2 = 1
            okio.Segment r2 = r6.writableSegment$okio(r2)     // Catch: java.util.zip.DataFormatException -> L40
            int r3 = r2.limit     // Catch: java.util.zip.DataFormatException -> L40
            int r3 = 8192 - r3
            long r3 = (long) r3     // Catch: java.util.zip.DataFormatException -> L40
            long r7 = java.lang.Math.min(r7, r3)     // Catch: java.util.zip.DataFormatException -> L40
            int r7 = (int) r7     // Catch: java.util.zip.DataFormatException -> L40
            r5.refill()     // Catch: java.util.zip.DataFormatException -> L40
            java.util.zip.Inflater r8 = r5.inflater     // Catch: java.util.zip.DataFormatException -> L40
            byte[] r3 = r2.data     // Catch: java.util.zip.DataFormatException -> L40
            int r4 = r2.limit     // Catch: java.util.zip.DataFormatException -> L40
            int r7 = r8.inflate(r3, r4, r7)     // Catch: java.util.zip.DataFormatException -> L40
            r5.releaseBytesAfterInflate()     // Catch: java.util.zip.DataFormatException -> L40
            if (r7 <= 0) goto L42
            int r8 = r2.limit     // Catch: java.util.zip.DataFormatException -> L40
            int r8 = r8 + r7
            r2.limit = r8     // Catch: java.util.zip.DataFormatException -> L40
            long r0 = r6.size()     // Catch: java.util.zip.DataFormatException -> L40
            long r7 = (long) r7     // Catch: java.util.zip.DataFormatException -> L40
            long r0 = r0 + r7
            r6.setSize$okio(r0)     // Catch: java.util.zip.DataFormatException -> L40
            return r7
        L40:
            r6 = move-exception
            goto L52
        L42:
            int r7 = r2.pos     // Catch: java.util.zip.DataFormatException -> L40
            int r8 = r2.limit     // Catch: java.util.zip.DataFormatException -> L40
            if (r7 != r8) goto L51
            okio.Segment r7 = r2.pop()     // Catch: java.util.zip.DataFormatException -> L40
            r6.head = r7     // Catch: java.util.zip.DataFormatException -> L40
            okio.SegmentPool.recycle(r2)     // Catch: java.util.zip.DataFormatException -> L40
        L51:
            return r0
        L52:
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r6)
            throw r7
        L58:
            java.lang.String r6 = "closed"
            j8.o.A(r6)
        L5d:
            r6 = 0
            return r6
        L60:
            java.lang.String r6 = "byteCount < 0: "
            java.lang.String r6 = bc.e.g(r7, r6)
            j8.o.q(r6)
            goto L5d
    }

    public final boolean refill() {
            r5 = this;
            java.util.zip.Inflater r0 = r5.inflater
            boolean r0 = r0.needsInput()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            okio.BufferedSource r0 = r5.source
            boolean r0 = r0.exhausted()
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            okio.BufferedSource r0 = r5.source
            okio.Buffer r0 = r0.getBuffer()
            okio.Segment r0 = r0.head
            r0.getClass()
            int r2 = r0.limit
            int r3 = r0.pos
            int r2 = r2 - r3
            r5.bufferBytesHeldByInflater = r2
            java.util.zip.Inflater r4 = r5.inflater
            byte[] r0 = r0.data
            r4.setInput(r0, r3, r2)
            return r1
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            okio.Timeout r0 = r0.timeout()
            return r0
    }
}
