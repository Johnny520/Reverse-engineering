package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class PeekSource implements okio.Source {
    private final okio.Buffer buffer;
    private boolean closed;
    private int expectedPos;
    private okio.Segment expectedSegment;
    private long pos;
    private final okio.BufferedSource upstream;

    public PeekSource(okio.BufferedSource r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.upstream = r1
            okio.Buffer r1 = r1.getBuffer()
            r0.buffer = r1
            okio.Segment r1 = r1.head
            r0.expectedSegment = r1
            if (r1 == 0) goto L17
            int r1 = r1.pos
            goto L18
        L17:
            r1 = -1
        L18:
            r0.expectedPos = r1
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
            r9.getClass()
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L70
            boolean r3 = r8.closed
            if (r3 != 0) goto L6a
            okio.Segment r3 = r8.expectedSegment
            if (r3 == 0) goto L29
            okio.Buffer r4 = r8.buffer
            okio.Segment r4 = r4.head
            if (r3 != r4) goto L21
            int r3 = r8.expectedPos
            r4.getClass()
            int r4 = r4.pos
            if (r3 != r4) goto L21
            goto L29
        L21:
            java.lang.String r9 = "Peek source is invalid because upstream source was used"
            j8.o.A(r9)
        L26:
            r9 = 0
            return r9
        L29:
            if (r2 != 0) goto L2c
            return r0
        L2c:
            okio.BufferedSource r0 = r8.upstream
            long r1 = r8.pos
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L3c
            r9 = -1
            return r9
        L3c:
            okio.Segment r0 = r8.expectedSegment
            if (r0 != 0) goto L4f
            okio.Buffer r0 = r8.buffer
            okio.Segment r0 = r0.head
            if (r0 == 0) goto L4f
            r8.expectedSegment = r0
            r0.getClass()
            int r0 = r0.pos
            r8.expectedPos = r0
        L4f:
            okio.Buffer r0 = r8.buffer
            long r0 = r0.size()
            long r2 = r8.pos
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            okio.Buffer r2 = r8.buffer
            long r4 = r8.pos
            r3 = r9
            r2.copyTo(r3, r4, r6)
            long r9 = r8.pos
            long r9 = r9 + r6
            r8.pos = r9
            return r6
        L6a:
            java.lang.String r9 = "closed"
            j8.o.A(r9)
            goto L26
        L70:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = bc.e.g(r10, r9)
            j8.o.q(r9)
            goto L26
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
            r1 = this;
            okio.BufferedSource r0 = r1.upstream
            okio.Timeout r0 = r0.timeout()
            return r0
    }
}
