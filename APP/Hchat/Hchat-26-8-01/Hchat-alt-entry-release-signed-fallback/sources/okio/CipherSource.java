package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class CipherSource implements okio.Source {
    private final int blockSize;
    private final okio.Buffer buffer;
    private final javax.crypto.Cipher cipher;
    private boolean closed;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    private boolean f0final;
    private final okio.BufferedSource source;

    public CipherSource(okio.BufferedSource r2, javax.crypto.Cipher r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r1.<init>()
            r1.source = r2
            r1.cipher = r3
            int r2 = r3.getBlockSize()
            r1.blockSize = r2
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r1.buffer = r0
            if (r2 <= 0) goto L1d
            return
        L1d:
            java.lang.String r2 = "Block cipher required "
            j8.o.z(r3, r2)
            r2 = 0
            throw r2
    }

    private final void doFinal() {
            r7 = this;
            javax.crypto.Cipher r0 = r7.cipher
            r1 = 0
            int r0 = r0.getOutputSize(r1)
            if (r0 != 0) goto La
            goto L3b
        La:
            okio.Buffer r1 = r7.buffer
            okio.Segment r0 = r1.writableSegment$okio(r0)
            javax.crypto.Cipher r1 = r7.cipher
            byte[] r2 = r0.data
            int r3 = r0.pos
            int r1 = r1.doFinal(r2, r3)
            int r2 = r0.limit
            int r2 = r2 + r1
            r0.limit = r2
            okio.Buffer r2 = r7.buffer
            long r3 = r2.size()
            long r5 = (long) r1
            long r3 = r3 + r5
            r2.setSize$okio(r3)
            int r1 = r0.pos
            int r2 = r0.limit
            if (r1 != r2) goto L3b
            okio.Buffer r1 = r7.buffer
            okio.Segment r2 = r0.pop()
            r1.head = r2
            okio.SegmentPool.recycle(r0)
        L3b:
            return
    }

    private final void refill() {
            r4 = this;
        L0:
            okio.Buffer r0 = r4.buffer
            long r0 = r0.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L23
            boolean r0 = r4.f0final
            if (r0 != 0) goto L23
            okio.BufferedSource r0 = r4.source
            boolean r0 = r0.exhausted()
            if (r0 == 0) goto L1f
            r0 = 1
            r4.f0final = r0
            r4.doFinal()
            return
        L1f:
            r4.update()
            goto L0
        L23:
            return
    }

    private final void update() {
            r9 = this;
            okio.BufferedSource r0 = r9.source
            okio.Buffer r0 = r0.getBuffer()
            okio.Segment r0 = r0.head
            r0.getClass()
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            javax.crypto.Cipher r2 = r9.cipher
            int r2 = r2.getOutputSize(r1)
            r6 = r1
        L17:
            r1 = 8192(0x2000, float:1.148E-41)
            if (r2 <= r1) goto L3f
            int r1 = r9.blockSize
            if (r6 > r1) goto L37
            r0 = 1
            r9.f0final = r0
            okio.Buffer r0 = r9.buffer
            javax.crypto.Cipher r1 = r9.cipher
            okio.BufferedSource r2 = r9.source
            byte[] r2 = r2.readByteArray()
            byte[] r1 = r1.doFinal(r2)
            r1.getClass()
            r0.write(r1)
            return
        L37:
            int r6 = r6 - r1
            javax.crypto.Cipher r1 = r9.cipher
            int r2 = r1.getOutputSize(r6)
            goto L17
        L3f:
            okio.Buffer r1 = r9.buffer
            okio.Segment r1 = r1.writableSegment$okio(r2)
            javax.crypto.Cipher r3 = r9.cipher
            byte[] r4 = r0.data
            int r5 = r0.pos
            byte[] r7 = r1.data
            int r8 = r1.pos
            int r0 = r3.update(r4, r5, r6, r7, r8)
            okio.BufferedSource r2 = r9.source
            long r3 = (long) r6
            r2.skip(r3)
            int r2 = r1.limit
            int r2 = r2 + r0
            r1.limit = r2
            okio.Buffer r2 = r9.buffer
            long r3 = r2.size()
            long r5 = (long) r0
            long r3 = r3 + r5
            r2.setSize$okio(r3)
            int r0 = r1.pos
            int r2 = r1.limit
            if (r0 != r2) goto L7a
            okio.Buffer r0 = r9.buffer
            okio.Segment r2 = r1.pop()
            r0.head = r2
            okio.SegmentPool.recycle(r1)
        L7a:
            return
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            r0 = 1
            r1.closed = r0
            okio.BufferedSource r0 = r1.source
            r0.close()
            return
    }

    public final javax.crypto.Cipher getCipher() {
            r1 = this;
            javax.crypto.Cipher r0 = r1.cipher
            return r0
    }

    @Override // okio.Source
    public long read(okio.Buffer r5, long r6) {
            r4 = this;
            r5.getClass()
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L22
            boolean r3 = r4.closed
            if (r3 != 0) goto L1a
            if (r2 != 0) goto L10
            return r0
        L10:
            r4.refill()
            okio.Buffer r0 = r4.buffer
            long r5 = r0.read(r5, r6)
            return r5
        L1a:
            java.lang.String r5 = "closed"
            j8.o.A(r5)
            r5 = 0
            return r5
        L22:
            java.lang.String r5 = "byteCount < 0: "
            java.lang.String r5 = bc.e.g(r6, r5)
            j8.o.q(r5)
            r5 = 0
            return r5
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            okio.Timeout r0 = r0.timeout()
            return r0
    }
}
