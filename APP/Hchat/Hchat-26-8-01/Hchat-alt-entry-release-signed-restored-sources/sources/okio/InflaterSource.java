package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p025bc.AbstractC0255e;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class InflaterSource implements Source {
    private int bufferBytesHeldByInflater;
    private boolean closed;
    private final Inflater inflater;
    private final BufferedSource source;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InflaterSource(BufferedSource bufferedSource, Inflater inflater) {
        bufferedSource.getClass();
        inflater.getClass();
        this.source = bufferedSource;
        this.inflater = inflater;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void releaseBytesAfterInflate() {
        int i9 = this.bufferBytesHeldByInflater;
        if (i9 == 0) {
            return;
        }
        int remaining = i9 - this.inflater.getRemaining();
        this.bufferBytesHeldByInflater -= remaining;
        this.source.skip(remaining);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.inflater.end();
        this.closed = true;
        this.source.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Source
    public long read(Buffer buffer, long j3) throws IOException {
        buffer.getClass();
        do {
            long orInflate = readOrInflate(buffer, j3);
            if (orInflate > 0) {
                return orInflate;
            }
            if (this.inflater.finished() || this.inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.source.exhausted());
        throw new EOFException("source exhausted prematurely");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long readOrInflate(Buffer buffer, long j3) throws IOException {
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
        try {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            int iMin = (int) Math.min(j3, 8192 - segmentWritableSegment$okio.limit);
            refill();
            int iInflate = this.inflater.inflate(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, iMin);
            releaseBytesAfterInflate();
            if (iInflate > 0) {
                segmentWritableSegment$okio.limit += iInflate;
                long j4 = iInflate;
                buffer.setSize$okio(buffer.size() + j4);
                return j4;
            }
            if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
                buffer.head = segmentWritableSegment$okio.pop();
                SegmentPool.recycle(segmentWritableSegment$okio);
            }
            return 0L;
        } catch (DataFormatException e6) {
            throw new IOException(e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean refill() {
        if (!this.inflater.needsInput()) {
            return false;
        }
        if (this.source.exhausted()) {
            return true;
        }
        Segment segment = this.source.getBuffer().head;
        segment.getClass();
        int i9 = segment.limit;
        int i10 = segment.pos;
        int i11 = i9 - i10;
        this.bufferBytesHeldByInflater = i11;
        this.inflater.setInput(segment.data, i10, i11);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Source
    public Timeout timeout() {
        return this.source.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InflaterSource(Source source, Inflater inflater) {
        this(Okio.buffer(source), inflater);
        source.getClass();
        inflater.getClass();
    }
}
