package okio;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class DeflaterSink implements Sink {
    private boolean closed;
    private final Deflater deflater;
    private final BufferedSink sink;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DeflaterSink(BufferedSink bufferedSink, Deflater deflater) {
        bufferedSink.getClass();
        deflater.getClass();
        this.sink = bufferedSink;
        this.deflater = deflater;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void deflate(boolean z9) throws IOException {
        Segment segmentWritableSegment$okio;
        int iDeflate;
        Buffer buffer = this.sink.getBuffer();
        while (true) {
            segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            Deflater deflater = this.deflater;
            if (z9) {
                try {
                    byte[] bArr = segmentWritableSegment$okio.data;
                    int i9 = segmentWritableSegment$okio.limit;
                    iDeflate = deflater.deflate(bArr, i9, 8192 - i9, 2);
                } catch (NullPointerException e6) {
                    throw new IOException("Deflater already closed", e6);
                }
            } else {
                byte[] bArr2 = segmentWritableSegment$okio.data;
                int i10 = segmentWritableSegment$okio.limit;
                iDeflate = deflater.deflate(bArr2, i10, 8192 - i10);
            }
            if (iDeflate > 0) {
                segmentWritableSegment$okio.limit += iDeflate;
                buffer.setSize$okio(buffer.size() + ((long) iDeflate));
                this.sink.emitCompleteSegments();
            } else if (this.deflater.needsInput()) {
                break;
            }
        }
        if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
            buffer.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        try {
            finishDeflate$okio();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.deflater.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.sink.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void finishDeflate$okio() throws IOException {
        this.deflater.finish();
        deflate(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        deflate(true);
        this.sink.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Sink
    public Timeout timeout() {
        return this.sink.timeout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "DeflaterSink(" + this.sink + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Sink
    public void write(Buffer buffer, long j3) throws IOException {
        buffer.getClass();
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, j3);
        while (j3 > 0) {
            Segment segment = buffer.head;
            segment.getClass();
            int iMin = (int) Math.min(j3, segment.limit - segment.pos);
            this.deflater.setInput(segment.data, segment.pos, iMin);
            deflate(false);
            long j4 = iMin;
            buffer.setSize$okio(buffer.size() - j4);
            int i9 = segment.pos + iMin;
            segment.pos = i9;
            if (i9 == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
            j3 -= j4;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeflaterSink(Sink sink, Deflater deflater) {
        this(Okio.buffer(sink), deflater);
        sink.getClass();
        deflater.getClass();
    }
}
