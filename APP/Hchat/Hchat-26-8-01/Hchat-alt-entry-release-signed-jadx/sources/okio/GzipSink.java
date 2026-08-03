package okio;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import p025bc.AbstractC0255e;
import p136j8.C2104o;
import p276sf.InterfaceC3954a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class GzipSink implements Sink {
    private boolean closed;
    private final CRC32 crc;
    private final Deflater deflater;
    private final DeflaterSink deflaterSink;
    private final RealBufferedSink sink;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GzipSink(Sink sink) {
        sink.getClass();
        RealBufferedSink realBufferedSink = new RealBufferedSink(sink);
        this.sink = realBufferedSink;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new DeflaterSink((BufferedSink) realBufferedSink, deflater);
        this.crc = new CRC32();
        Buffer buffer = realBufferedSink.bufferField;
        buffer.writeShort(8075);
        buffer.writeByte(8);
        buffer.writeByte(0);
        buffer.writeInt(0);
        buffer.writeByte(0);
        buffer.writeByte(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void updateCrc(Buffer buffer, long j3) {
        Segment segment = buffer.head;
        segment.getClass();
        while (j3 > 0) {
            int iMin = (int) Math.min(j3, segment.limit - segment.pos);
            this.crc.update(segment.data, segment.pos, iMin);
            j3 -= (long) iMin;
            segment = segment.next;
            segment.getClass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void writeFooter() {
        this.sink.writeIntLe((int) this.crc.getValue());
        this.sink.writeIntLe((int) this.deflater.getBytesRead());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_deflater, reason: not valid java name */
    public final Deflater m11080deprecated_deflater() {
        return this.deflater;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        try {
            this.deflaterSink.finishDeflate$okio();
            writeFooter();
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
    public final Deflater deflater() {
        return this.deflater;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.deflaterSink.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Sink
    public Timeout timeout() {
        return this.sink.timeout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Sink
    public void write(Buffer buffer, long j3) throws IOException {
        buffer.getClass();
        if (j3 < 0) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "byteCount < 0: "));
        } else {
            if (j3 == 0) {
                return;
            }
            updateCrc(buffer, j3);
            this.deflaterSink.write(buffer, j3);
        }
    }
}
