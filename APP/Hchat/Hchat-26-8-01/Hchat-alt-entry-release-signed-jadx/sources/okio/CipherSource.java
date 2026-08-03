package okio;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import p025bc.AbstractC0255e;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class CipherSource implements Source {
    private final int blockSize;
    private final Buffer buffer;
    private final Cipher cipher;
    private boolean closed;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    private boolean f24746final;
    private final BufferedSource source;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CipherSource(BufferedSource bufferedSource, Cipher cipher) {
        bufferedSource.getClass();
        cipher.getClass();
        this.source = bufferedSource;
        this.cipher = cipher;
        int blockSize = cipher.getBlockSize();
        this.blockSize = blockSize;
        this.buffer = new Buffer();
        if (blockSize > 0) {
            return;
        }
        C2104o.m5300z(cipher, "Block cipher required ");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void doFinal() throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        int outputSize = this.cipher.getOutputSize(0);
        if (outputSize == 0) {
            return;
        }
        Segment segmentWritableSegment$okio = this.buffer.writableSegment$okio(outputSize);
        int iDoFinal = this.cipher.doFinal(segmentWritableSegment$okio.data, segmentWritableSegment$okio.pos);
        segmentWritableSegment$okio.limit += iDoFinal;
        Buffer buffer = this.buffer;
        buffer.setSize$okio(buffer.size() + ((long) iDoFinal));
        if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
            this.buffer.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void refill() throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        while (this.buffer.size() == 0 && !this.f24746final) {
            if (this.source.exhausted()) {
                this.f24746final = true;
                doFinal();
                return;
            }
            update();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void update() throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        Segment segment = this.source.getBuffer().head;
        segment.getClass();
        int i9 = segment.limit - segment.pos;
        int outputSize = this.cipher.getOutputSize(i9);
        int i10 = i9;
        while (outputSize > 8192) {
            int i11 = this.blockSize;
            if (i10 <= i11) {
                this.f24746final = true;
                Buffer buffer = this.buffer;
                byte[] bArrDoFinal = this.cipher.doFinal(this.source.readByteArray());
                bArrDoFinal.getClass();
                buffer.write(bArrDoFinal);
                return;
            }
            i10 -= i11;
            outputSize = this.cipher.getOutputSize(i10);
        }
        Segment segmentWritableSegment$okio = this.buffer.writableSegment$okio(outputSize);
        int iUpdate = this.cipher.update(segment.data, segment.pos, i10, segmentWritableSegment$okio.data, segmentWritableSegment$okio.pos);
        this.source.skip(i10);
        segmentWritableSegment$okio.limit += iUpdate;
        Buffer buffer2 = this.buffer;
        buffer2.setSize$okio(buffer2.size() + ((long) iUpdate));
        if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
            this.buffer.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
        this.source.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Cipher getCipher() {
        return this.cipher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Source
    public long read(Buffer buffer, long j3) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        buffer.getClass();
        if (j3 < 0) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "byteCount < 0: "));
            return 0L;
        }
        if (this.closed) {
            C2104o.m5276A("closed");
            return 0L;
        }
        if (j3 == 0) {
            return 0L;
        }
        refill();
        return this.buffer.read(buffer, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Source
    public Timeout timeout() {
        return this.source.timeout();
    }
}
