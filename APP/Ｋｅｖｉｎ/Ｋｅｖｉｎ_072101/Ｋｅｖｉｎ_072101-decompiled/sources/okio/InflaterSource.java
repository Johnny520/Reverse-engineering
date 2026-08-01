package okio;

/* JADX INFO: compiled from: InflaterSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0016\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000bJ\b\u0010\u0015\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m115d2 = {"Lokio/InflaterSource;", "Lokio/Source;", "source", "inflater", "Ljava/util/zip/Inflater;", "(Lokio/Source;Ljava/util/zip/Inflater;)V", "Lokio/BufferedSource;", "(Lokio/BufferedSource;Ljava/util/zip/Inflater;)V", "bufferBytesHeldByInflater", "", "closed", "", "close", "", "read", "", "sink", "Lokio/Buffer;", "byteCount", "readOrInflate", "refill", "releaseBytesAfterInflate", "timeout", "Lokio/Timeout;", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class InflaterSource implements okio.Source {
    private int bufferBytesHeldByInflater;
    private boolean closed;
    private final java.util.zip.Inflater inflater;
    private final okio.BufferedSource source;

    public InflaterSource(okio.BufferedSource r2, java.util.zip.Inflater r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.source = r2
            r1.inflater = r3
            return
    }

    public InflaterSource(okio.Source r2, java.util.zip.Inflater r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.BufferedSource r0 = okio.Okio.buffer(r2)
            r1.<init>(r0, r3)
            return
    }

    private final void releaseBytesAfterInflate() {
            r4 = this;
            int r0 = r4.bufferBytesHeldByInflater
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r4.bufferBytesHeldByInflater
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
    public void close() throws java.io.IOException {
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
    public long read(okio.Buffer r5, long r6) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
        L5:
            long r0 = r4.readOrInflate(r5, r6)
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L11
            return r0
        L11:
            java.util.zip.Inflater r2 = r4.inflater
            boolean r2 = r2.finished()
            if (r2 != 0) goto L33
            java.util.zip.Inflater r2 = r4.inflater
            boolean r2 = r2.needsDictionary()
            if (r2 == 0) goto L22
            goto L33
        L22:
            okio.BufferedSource r2 = r4.source
            boolean r2 = r2.exhausted()
            if (r2 != 0) goto L2b
            goto L5
        L2b:
            java.io.EOFException r2 = new java.io.EOFException
            java.lang.String r3 = "source exhausted prematurely"
            r2.<init>(r3)
            throw r2
        L33:
            r2 = -1
            return r2
    }

    public final long readOrInflate(okio.Buffer r8, long r9) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r3 = 1
            if (r2 < 0) goto Le
            r2 = r3
            goto Lf
        Le:
            r2 = 0
        Lf:
            if (r2 == 0) goto L74
            boolean r2 = r7.closed
            if (r2 != 0) goto L66
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 != 0) goto L1a
            return r0
        L1a:
            okio.Segment r2 = r8.writableSegment$okio(r3)     // Catch: java.util.zip.DataFormatException -> L5c
            int r3 = r2.limit     // Catch: java.util.zip.DataFormatException -> L5c
            int r3 = 8192 - r3
            r4 = 0
            long r5 = (long) r3     // Catch: java.util.zip.DataFormatException -> L5c
            long r5 = java.lang.Math.min(r9, r5)     // Catch: java.util.zip.DataFormatException -> L5c
            int r3 = (int) r5     // Catch: java.util.zip.DataFormatException -> L5c
            r7.refill()     // Catch: java.util.zip.DataFormatException -> L5c
            java.util.zip.Inflater r4 = r7.inflater     // Catch: java.util.zip.DataFormatException -> L5c
            byte[] r5 = r2.data     // Catch: java.util.zip.DataFormatException -> L5c
            int r6 = r2.limit     // Catch: java.util.zip.DataFormatException -> L5c
            int r4 = r4.inflate(r5, r6, r3)     // Catch: java.util.zip.DataFormatException -> L5c
            r7.releaseBytesAfterInflate()     // Catch: java.util.zip.DataFormatException -> L5c
            if (r4 <= 0) goto L4c
            int r0 = r2.limit     // Catch: java.util.zip.DataFormatException -> L5c
            int r0 = r0 + r4
            r2.limit = r0     // Catch: java.util.zip.DataFormatException -> L5c
            long r0 = r8.size()     // Catch: java.util.zip.DataFormatException -> L5c
            long r5 = (long) r4     // Catch: java.util.zip.DataFormatException -> L5c
            long r0 = r0 + r5
            r8.setSize$okio(r0)     // Catch: java.util.zip.DataFormatException -> L5c
            long r0 = (long) r4     // Catch: java.util.zip.DataFormatException -> L5c
            return r0
        L4c:
            int r5 = r2.pos     // Catch: java.util.zip.DataFormatException -> L5c
            int r6 = r2.limit     // Catch: java.util.zip.DataFormatException -> L5c
            if (r5 != r6) goto L5b
            okio.Segment r5 = r2.pop()     // Catch: java.util.zip.DataFormatException -> L5c
            r8.head = r5     // Catch: java.util.zip.DataFormatException -> L5c
            okio.SegmentPool.recycle(r2)     // Catch: java.util.zip.DataFormatException -> L5c
        L5b:
            return r0
        L5c:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.<init>(r2)
            throw r1
        L66:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L74:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "byteCount < 0: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public final boolean refill() throws java.io.IOException {
            r6 = this;
            java.util.zip.Inflater r0 = r6.inflater
            boolean r0 = r0.needsInput()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            okio.BufferedSource r0 = r6.source
            boolean r0 = r0.exhausted()
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            okio.BufferedSource r0 = r6.source
            okio.Buffer r0 = r0.getBuffer()
            okio.Segment r0 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r2 = r0.limit
            int r3 = r0.pos
            int r2 = r2 - r3
            r6.bufferBytesHeldByInflater = r2
            java.util.zip.Inflater r2 = r6.inflater
            byte[] r3 = r0.data
            int r4 = r0.pos
            int r5 = r6.bufferBytesHeldByInflater
            r2.setInput(r3, r4, r5)
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
