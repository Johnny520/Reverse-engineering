package okio;

/* JADX INFO: compiled from: PeekSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m115d2 = {"Lokio/PeekSource;", "Lokio/Source;", "upstream", "Lokio/BufferedSource;", "(Lokio/BufferedSource;)V", "buffer", "Lokio/Buffer;", "closed", "", "expectedPos", "", "expectedSegment", "Lokio/Segment;", "pos", "", "close", "", "read", "sink", "byteCount", "timeout", "Lokio/Timeout;", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class PeekSource implements okio.Source {
    private final okio.Buffer buffer;
    private boolean closed;
    private int expectedPos;
    private okio.Segment expectedSegment;
    private long pos;
    private final okio.BufferedSource upstream;

    public PeekSource(okio.BufferedSource r2) {
            r1 = this;
            java.lang.String r0 = "upstream"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.upstream = r2
            okio.BufferedSource r0 = r1.upstream
            okio.Buffer r0 = r0.getBuffer()
            r1.buffer = r0
            okio.Buffer r0 = r1.buffer
            okio.Segment r0 = r0.head
            r1.expectedSegment = r0
            okio.Buffer r0 = r1.buffer
            okio.Segment r0 = r0.head
            if (r0 == 0) goto L21
            int r0 = r0.pos
            goto L22
        L21:
            r0 = -1
        L22:
            r1.expectedPos = r0
            return
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            r0 = 1
            r1.closed = r0
            return
    }

    @Override // okio.Source
    public long read(okio.Buffer r9, long r10) {
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r2 < 0) goto Lf
            r2 = r3
            goto L10
        Lf:
            r2 = r4
        L10:
            if (r2 == 0) goto L9d
            boolean r2 = r8.closed
            if (r2 != 0) goto L8f
            okio.Segment r2 = r8.expectedSegment
            if (r2 == 0) goto L32
            okio.Segment r2 = r8.expectedSegment
            okio.Buffer r5 = r8.buffer
            okio.Segment r5 = r5.head
            if (r2 != r5) goto L30
            int r2 = r8.expectedPos
            okio.Buffer r5 = r8.buffer
            okio.Segment r5 = r5.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            int r5 = r5.pos
            if (r2 != r5) goto L30
            goto L32
        L30:
            r3 = r4
            goto L33
        L32:
        L33:
            if (r3 == 0) goto L81
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 != 0) goto L3a
            return r0
        L3a:
            okio.BufferedSource r0 = r8.upstream
            long r1 = r8.pos
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L4a
            r0 = -1
            return r0
        L4a:
            okio.Segment r0 = r8.expectedSegment
            if (r0 != 0) goto L65
            okio.Buffer r0 = r8.buffer
            okio.Segment r0 = r0.head
            if (r0 == 0) goto L65
            okio.Buffer r0 = r8.buffer
            okio.Segment r0 = r0.head
            r8.expectedSegment = r0
            okio.Buffer r0 = r8.buffer
            okio.Segment r0 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.pos
            r8.expectedPos = r0
        L65:
            okio.Buffer r0 = r8.buffer
            long r0 = r0.size()
            long r2 = r8.pos
            long r0 = r0 - r2
            long r0 = java.lang.Math.min(r10, r0)
            okio.Buffer r2 = r8.buffer
            long r4 = r8.pos
            r3 = r9
            r6 = r0
            r2.copyTo(r3, r4, r6)
            long r2 = r8.pos
            long r2 = r2 + r0
            r8.pos = r2
            return r0
        L81:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Peek source is invalid because upstream source was used"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8f:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9d:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "byteCount < 0: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
            r1 = this;
            okio.BufferedSource r0 = r1.upstream
            okio.Timeout r0 = r0.timeout()
            return r0
    }
}
