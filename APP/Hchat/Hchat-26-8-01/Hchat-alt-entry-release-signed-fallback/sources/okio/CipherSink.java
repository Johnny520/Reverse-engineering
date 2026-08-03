package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class CipherSink implements okio.Sink {
    private final int blockSize;
    private final javax.crypto.Cipher cipher;
    private boolean closed;
    private final okio.BufferedSink sink;

    public CipherSink(okio.BufferedSink r1, javax.crypto.Cipher r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.sink = r1
            r0.cipher = r2
            int r1 = r2.getBlockSize()
            r0.blockSize = r1
            if (r1 <= 0) goto L16
            return
        L16:
            java.lang.String r1 = "Block cipher required "
            j8.o.z(r2, r1)
            r1 = 0
            throw r1
    }

    private final java.lang.Throwable doFinal() {
            r8 = this;
            javax.crypto.Cipher r0 = r8.cipher
            r1 = 0
            int r0 = r0.getOutputSize(r1)
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            okio.BufferedSink r2 = r8.sink
            r3 = 8192(0x2000, float:1.148E-41)
            if (r0 <= r3) goto L20
            javax.crypto.Cipher r0 = r8.cipher     // Catch: java.lang.Throwable -> L1e
            byte[] r0 = r0.doFinal()     // Catch: java.lang.Throwable -> L1e
            r0.getClass()     // Catch: java.lang.Throwable -> L1e
            r2.write(r0)     // Catch: java.lang.Throwable -> L1e
            return r1
        L1e:
            r0 = move-exception
            return r0
        L20:
            okio.Buffer r2 = r2.getBuffer()
            okio.Segment r0 = r2.writableSegment$okio(r0)
            javax.crypto.Cipher r3 = r8.cipher     // Catch: java.lang.Throwable -> L41
            byte[] r4 = r0.data     // Catch: java.lang.Throwable -> L41
            int r5 = r0.limit     // Catch: java.lang.Throwable -> L41
            int r3 = r3.doFinal(r4, r5)     // Catch: java.lang.Throwable -> L41
            int r4 = r0.limit     // Catch: java.lang.Throwable -> L41
            int r4 = r4 + r3
            r0.limit = r4     // Catch: java.lang.Throwable -> L41
            long r4 = r2.size()     // Catch: java.lang.Throwable -> L41
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L41
            long r4 = r4 + r6
            r2.setSize$okio(r4)     // Catch: java.lang.Throwable -> L41
            goto L42
        L41:
            r1 = move-exception
        L42:
            int r3 = r0.pos
            int r4 = r0.limit
            if (r3 != r4) goto L51
            okio.Segment r3 = r0.pop()
            r2.head = r3
            okio.SegmentPool.recycle(r0)
        L51:
            return r1
    }

    private final int update(okio.Buffer r11, long r12) {
            r10 = this;
            okio.Segment r0 = r11.head
            r0.getClass()
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r12, r1)
            int r1 = (int) r1
            okio.BufferedSink r2 = r10.sink
            okio.Buffer r2 = r2.getBuffer()
            javax.crypto.Cipher r3 = r10.cipher
            int r3 = r3.getOutputSize(r1)
            r7 = r1
        L1d:
            r1 = 8192(0x2000, float:1.148E-41)
            if (r3 <= r1) goto L41
            int r1 = r10.blockSize
            if (r7 > r1) goto L39
            okio.BufferedSink r0 = r10.sink
            javax.crypto.Cipher r1 = r10.cipher
            byte[] r11 = r11.readByteArray(r12)
            byte[] r11 = r1.update(r11)
            r11.getClass()
            r0.write(r11)
            int r11 = (int) r12
            return r11
        L39:
            int r7 = r7 - r1
            javax.crypto.Cipher r1 = r10.cipher
            int r3 = r1.getOutputSize(r7)
            goto L1d
        L41:
            okio.Segment r12 = r2.writableSegment$okio(r3)
            javax.crypto.Cipher r4 = r10.cipher
            byte[] r5 = r0.data
            int r6 = r0.pos
            byte[] r8 = r12.data
            int r9 = r12.limit
            int r13 = r4.update(r5, r6, r7, r8, r9)
            int r1 = r12.limit
            int r1 = r1 + r13
            r12.limit = r1
            long r3 = r2.size()
            long r5 = (long) r13
            long r3 = r3 + r5
            r2.setSize$okio(r3)
            int r13 = r12.pos
            int r1 = r12.limit
            if (r13 != r1) goto L70
            okio.Segment r13 = r12.pop()
            r2.head = r13
            okio.SegmentPool.recycle(r12)
        L70:
            okio.BufferedSink r12 = r10.sink
            r12.emitCompleteSegments()
            long r12 = r11.size()
            long r1 = (long) r7
            long r12 = r12 - r1
            r11.setSize$okio(r12)
            int r12 = r0.pos
            int r12 = r12 + r7
            r0.pos = r12
            int r13 = r0.limit
            if (r12 != r13) goto L90
            okio.Segment r12 = r0.pop()
            r11.head = r12
            okio.SegmentPool.recycle(r0)
        L90:
            return r7
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 == 0) goto L5
            goto L18
        L5:
            r0 = 1
            r2.closed = r0
            java.lang.Throwable r0 = r2.doFinal()
            okio.BufferedSink r1 = r2.sink     // Catch: java.lang.Throwable -> L12
            r1.close()     // Catch: java.lang.Throwable -> L12
            goto L16
        L12:
            r1 = move-exception
            if (r0 != 0) goto L16
            r0 = r1
        L16:
            if (r0 != 0) goto L19
        L18:
            return
        L19:
            throw r0
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
            r1 = this;
            okio.BufferedSink r0 = r1.sink
            r0.flush()
            return
    }

    public final javax.crypto.Cipher getCipher() {
            r1 = this;
            javax.crypto.Cipher r0 = r1.cipher
            return r0
    }

    @Override // okio.Sink
    public okio.Timeout timeout() {
            r1 = this;
            okio.BufferedSink r0 = r1.sink
            okio.Timeout r0 = r0.timeout()
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
            boolean r8 = r6.closed
            if (r8 != 0) goto L20
            r8 = r4
        L12:
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1f
            int r0 = r6.update(r7, r8)
            long r0 = (long) r0
            long r8 = r8 - r0
            goto L12
        L1f:
            return
        L20:
            java.lang.String r7 = "closed"
            j8.o.A(r7)
            return
    }
}
