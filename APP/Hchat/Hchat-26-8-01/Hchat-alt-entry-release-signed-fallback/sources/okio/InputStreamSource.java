package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class InputStreamSource implements okio.Source {
    private final java.io.InputStream input;
    private final okio.Timeout timeout;

    public InputStreamSource(java.io.InputStream r1, okio.Timeout r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.input = r1
            r0.timeout = r2
            return
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.io.InputStream r0 = r1.input
            r0.close()
            return
    }

    @Override // okio.Source
    public long read(okio.Buffer r4, long r5) {
            r3 = this;
            r4.getClass()
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            return r0
        La:
            if (r2 < 0) goto L5e
            okio.Timeout r0 = r3.timeout     // Catch: java.lang.AssertionError -> L3d
            r0.throwIfReached()     // Catch: java.lang.AssertionError -> L3d
            r0 = 1
            okio.Segment r0 = r4.writableSegment$okio(r0)     // Catch: java.lang.AssertionError -> L3d
            int r1 = r0.limit     // Catch: java.lang.AssertionError -> L3d
            int r1 = 8192 - r1
            long r1 = (long) r1     // Catch: java.lang.AssertionError -> L3d
            long r5 = java.lang.Math.min(r5, r1)     // Catch: java.lang.AssertionError -> L3d
            int r5 = (int) r5     // Catch: java.lang.AssertionError -> L3d
            java.io.InputStream r6 = r3.input     // Catch: java.lang.AssertionError -> L3d
            byte[] r1 = r0.data     // Catch: java.lang.AssertionError -> L3d
            int r2 = r0.limit     // Catch: java.lang.AssertionError -> L3d
            int r5 = r6.read(r1, r2, r5)     // Catch: java.lang.AssertionError -> L3d
            r6 = -1
            if (r5 != r6) goto L42
            int r5 = r0.pos     // Catch: java.lang.AssertionError -> L3d
            int r6 = r0.limit     // Catch: java.lang.AssertionError -> L3d
            if (r5 != r6) goto L3f
            okio.Segment r5 = r0.pop()     // Catch: java.lang.AssertionError -> L3d
            r4.head = r5     // Catch: java.lang.AssertionError -> L3d
            okio.SegmentPool.recycle(r0)     // Catch: java.lang.AssertionError -> L3d
            goto L3f
        L3d:
            r4 = move-exception
            goto L51
        L3f:
            r4 = -1
            return r4
        L42:
            int r6 = r0.limit     // Catch: java.lang.AssertionError -> L3d
            int r6 = r6 + r5
            r0.limit = r6     // Catch: java.lang.AssertionError -> L3d
            long r0 = r4.size()     // Catch: java.lang.AssertionError -> L3d
            long r5 = (long) r5     // Catch: java.lang.AssertionError -> L3d
            long r0 = r0 + r5
            r4.setSize$okio(r0)     // Catch: java.lang.AssertionError -> L3d
            return r5
        L51:
            boolean r5 = okio.Okio.isAndroidGetsocknameError(r4)
            if (r5 == 0) goto L5d
            java.io.IOException r5 = new java.io.IOException
            r5.<init>(r4)
            throw r5
        L5d:
            throw r4
        L5e:
            java.lang.String r4 = "byteCount < 0: "
            java.lang.String r4 = bc.e.g(r5, r4)
            j8.o.q(r4)
            r4 = 0
            return r4
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
            r1 = this;
            okio.Timeout r0 = r1.timeout
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "source("
            r0.<init>(r1)
            java.io.InputStream r1 = r2.input
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
