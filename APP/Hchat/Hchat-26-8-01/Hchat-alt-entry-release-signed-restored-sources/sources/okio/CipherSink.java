package okio;

import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class CipherSink implements Sink {
    private final int blockSize;
    private final Cipher cipher;
    private boolean closed;
    private final BufferedSink sink;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CipherSink(BufferedSink bufferedSink, Cipher cipher) {
        bufferedSink.getClass();
        cipher.getClass();
        this.sink = bufferedSink;
        this.cipher = cipher;
        int blockSize = cipher.getBlockSize();
        this.blockSize = blockSize;
        if (blockSize > 0) {
            return;
        }
        C2104o.m5300z(cipher, "Block cipher required ");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Throwable doFinal() {
        int outputSize = this.cipher.getOutputSize(0);
        Throwable th2 = null;
        if (outputSize == 0) {
            return null;
        }
        BufferedSink bufferedSink = this.sink;
        if (outputSize > 8192) {
            try {
                byte[] bArrDoFinal = this.cipher.doFinal();
                bArrDoFinal.getClass();
                bufferedSink.write(bArrDoFinal);
                return null;
            } catch (Throwable th3) {
                return th3;
            }
        }
        Buffer buffer = bufferedSink.getBuffer();
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(outputSize);
        try {
            int iDoFinal = this.cipher.doFinal(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit);
            segmentWritableSegment$okio.limit += iDoFinal;
            buffer.setSize$okio(buffer.size() + ((long) iDoFinal));
        } catch (Throwable th4) {
            th2 = th4;
        }
        if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
            buffer.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
        }
        return th2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final int update(Buffer buffer, long j3) throws ShortBufferException {
        Segment segment = buffer.head;
        segment.getClass();
        int iMin = (int) Math.min(j3, segment.limit - segment.pos);
        Buffer buffer2 = this.sink.getBuffer();
        int outputSize = this.cipher.getOutputSize(iMin);
        int i9 = iMin;
        while (outputSize > 8192) {
            int i10 = this.blockSize;
            if (i9 <= i10) {
                BufferedSink bufferedSink = this.sink;
                byte[] bArrUpdate = this.cipher.update(buffer.readByteArray(j3));
                bArrUpdate.getClass();
                bufferedSink.write(bArrUpdate);
                return (int) j3;
            }
            i9 -= i10;
            outputSize = this.cipher.getOutputSize(i9);
        }
        Segment segmentWritableSegment$okio = buffer2.writableSegment$okio(outputSize);
        int iUpdate = this.cipher.update(segment.data, segment.pos, i9, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit);
        segmentWritableSegment$okio.limit += iUpdate;
        buffer2.setSize$okio(buffer2.size() + ((long) iUpdate));
        if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
            buffer2.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
        }
        this.sink.emitCompleteSegments();
        buffer.setSize$okio(buffer.size() - ((long) i9));
        int i11 = segment.pos + i9;
        segment.pos = i11;
        if (i11 == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        this.closed = true;
        Throwable thDoFinal = doFinal();
        try {
            this.sink.close();
        } catch (Throwable th2) {
            if (thDoFinal == null) {
                thDoFinal = th2;
            }
        }
        if (thDoFinal != null) {
            throw thDoFinal;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        this.sink.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Cipher getCipher() {
        return this.cipher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Sink
    public Timeout timeout() {
        return this.sink.timeout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Sink
    public void write(Buffer buffer, long j3) {
        buffer.getClass();
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, j3);
        if (this.closed) {
            C2104o.m5276A("closed");
            return;
        }
        long jUpdate = j3;
        while (jUpdate > 0) {
            jUpdate -= (long) update(buffer, jUpdate);
        }
    }
}
