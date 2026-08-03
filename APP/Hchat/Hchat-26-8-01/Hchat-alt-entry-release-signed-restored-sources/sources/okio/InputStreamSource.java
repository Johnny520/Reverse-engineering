package okio;

import java.io.IOException;
import java.io.InputStream;
import p025bc.AbstractC0255e;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class InputStreamSource implements Source {
    private final InputStream input;
    private final Timeout timeout;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputStreamSource(InputStream inputStream, Timeout timeout) {
        inputStream.getClass();
        timeout.getClass();
        this.input = inputStream;
        this.timeout = timeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.input.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Source
    public long read(Buffer buffer, long j3) throws IOException {
        buffer.getClass();
        if (j3 == 0) {
            return 0L;
        }
        if (j3 < 0) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "byteCount < 0: "));
            return 0L;
        }
        try {
            this.timeout.throwIfReached();
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            int i9 = this.input.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(j3, 8192 - segmentWritableSegment$okio.limit));
            if (i9 != -1) {
                segmentWritableSegment$okio.limit += i9;
                long j4 = i9;
                buffer.setSize$okio(buffer.size() + j4);
                return j4;
            }
            if (segmentWritableSegment$okio.pos != segmentWritableSegment$okio.limit) {
                return -1L;
            }
            buffer.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
            return -1L;
        } catch (AssertionError e6) {
            if (Okio.isAndroidGetsocknameError(e6)) {
                throw new IOException(e6);
            }
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Source
    public Timeout timeout() {
        return this.timeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "source(" + this.input + ')';
    }
}
