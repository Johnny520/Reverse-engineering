package okio;

/* JADX INFO: compiled from: CipherSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m115d2 = {"Lokio/CipherSource;", "Lokio/Source;", "source", "Lokio/BufferedSource;", "cipher", "Ljavax/crypto/Cipher;", "(Lokio/BufferedSource;Ljavax/crypto/Cipher;)V", "blockSize", "", "buffer", "Lokio/Buffer;", "getCipher", "()Ljavax/crypto/Cipher;", "closed", "", "final", "close", "", "doFinal", "read", "", "sink", "byteCount", "refill", "timeout", "Lokio/Timeout;", "update", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class CipherSource implements okio.Source {
    private final int blockSize;
    private final okio.Buffer buffer;
    private final javax.crypto.Cipher cipher;
    private boolean closed;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    private boolean f424final;
    private final okio.BufferedSource source;

    public CipherSource(okio.BufferedSource r4, javax.crypto.Cipher r5) {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "cipher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r3.<init>()
            r3.source = r4
            r3.cipher = r5
            javax.crypto.Cipher r0 = r3.cipher
            int r0 = r0.getBlockSize()
            r3.blockSize = r0
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r3.buffer = r0
            int r0 = r3.blockSize
            if (r0 <= 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            if (r0 == 0) goto L2c
        L2b:
            return
        L2c:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Block cipher required "
            java.lang.StringBuilder r1 = r1.append(r2)
            javax.crypto.Cipher r2 = r3.cipher
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    private final void doFinal() {
            r8 = this;
            javax.crypto.Cipher r0 = r8.cipher
            r1 = 0
            int r0 = r0.getOutputSize(r1)
            if (r0 != 0) goto La
            return
        La:
            okio.Buffer r1 = r8.buffer
            okio.Segment r1 = r1.writableSegment$okio(r0)
            javax.crypto.Cipher r2 = r8.cipher
            byte[] r3 = r1.data
            int r4 = r1.pos
            int r2 = r2.doFinal(r3, r4)
            int r3 = r1.limit
            int r3 = r3 + r2
            r1.limit = r3
            okio.Buffer r3 = r8.buffer
            long r4 = r3.size()
            long r6 = (long) r2
            long r4 = r4 + r6
            r3.setSize$okio(r4)
            int r3 = r1.pos
            int r4 = r1.limit
            if (r3 != r4) goto L3b
            okio.Buffer r3 = r8.buffer
            okio.Segment r4 = r1.pop()
            r3.head = r4
            okio.SegmentPool.recycle(r1)
        L3b:
            return
    }

    private final void refill() {
            r4 = this;
        L1:
            okio.Buffer r0 = r4.buffer
            long r0 = r0.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L24
            boolean r0 = r4.f424final
            if (r0 != 0) goto L24
            okio.BufferedSource r0 = r4.source
            boolean r0 = r0.exhausted()
            if (r0 == 0) goto L20
            r0 = 1
            r4.f424final = r0
            r4.doFinal()
            goto L24
        L20:
            r4.update()
            goto L1
        L24:
            return
    }

    private final void update() {
            r10 = this;
            okio.BufferedSource r0 = r10.source
            okio.Buffer r0 = r0.getBuffer()
            okio.Segment r0 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            javax.crypto.Cipher r2 = r10.cipher
            int r2 = r2.getOutputSize(r1)
        L16:
            r3 = 8192(0x2000, float:1.148E-41)
            if (r2 <= r3) goto L42
            int r3 = r10.blockSize
            if (r1 > r3) goto L38
            r3 = 1
            r10.f424final = r3
            okio.Buffer r3 = r10.buffer
            javax.crypto.Cipher r4 = r10.cipher
            okio.BufferedSource r5 = r10.source
            byte[] r5 = r5.readByteArray()
            byte[] r4 = r4.doFinal(r5)
            java.lang.String r5 = "doFinal(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r3.write(r4)
            return
        L38:
            int r3 = r10.blockSize
            int r1 = r1 - r3
            javax.crypto.Cipher r3 = r10.cipher
            int r2 = r3.getOutputSize(r1)
            goto L16
        L42:
            okio.Buffer r3 = r10.buffer
            okio.Segment r9 = r3.writableSegment$okio(r2)
            javax.crypto.Cipher r3 = r10.cipher
            byte[] r4 = r0.data
            int r5 = r0.pos
            byte[] r7 = r9.data
            int r8 = r9.pos
            r6 = r1
            int r3 = r3.update(r4, r5, r6, r7, r8)
            okio.BufferedSource r4 = r10.source
            long r5 = (long) r1
            r4.skip(r5)
            int r4 = r9.limit
            int r4 = r4 + r3
            r9.limit = r4
            okio.Buffer r4 = r10.buffer
            long r5 = r4.size()
            long r7 = (long) r3
            long r5 = r5 + r7
            r4.setSize$okio(r5)
            int r4 = r9.pos
            int r5 = r9.limit
            if (r4 != r5) goto L7f
            okio.Buffer r4 = r10.buffer
            okio.Segment r5 = r9.pop()
            r4.head = r5
            okio.SegmentPool.recycle(r9)
        L7f:
            return
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
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
    public long read(okio.Buffer r4, long r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 == 0) goto L31
            boolean r2 = r3.closed
            if (r2 != 0) goto L23
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L19
            return r0
        L19:
            r3.refill()
            okio.Buffer r0 = r3.buffer
            long r0 = r0.read(r4, r5)
            return r0
        L23:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L31:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "byteCount < 0: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            okio.Timeout r0 = r0.timeout()
            return r0
    }
}
