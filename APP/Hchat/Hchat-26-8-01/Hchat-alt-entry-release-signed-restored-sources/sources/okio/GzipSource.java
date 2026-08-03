package okio;

import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import p025bc.AbstractC0255e;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class GzipSource implements Source {
    private final CRC32 crc;
    private final Inflater inflater;
    private final InflaterSource inflaterSource;
    private byte section;
    private final RealBufferedSource source;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GzipSource(Source source) {
        source.getClass();
        RealBufferedSource realBufferedSource = new RealBufferedSource(source);
        this.source = realBufferedSource;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new InflaterSource((BufferedSource) realBufferedSource, inflater);
        this.crc = new CRC32();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void checkEqual(String str, int i9, int i10) throws IOException {
        if (i10 != i9) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10), Integer.valueOf(i9)}, 3)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void consumeHeader() throws IOException {
        this.source.require(10L);
        byte b10 = this.source.bufferField.getByte(3L);
        boolean z9 = ((b10 >> 1) & 1) == 1;
        if (z9) {
            updateCrc(this.source.bufferField, 0L, 10L);
        }
        checkEqual("ID1ID2", 8075, this.source.readShort());
        this.source.skip(8L);
        if (((b10 >> 2) & 1) == 1) {
            this.source.require(2L);
            if (z9) {
                updateCrc(this.source.bufferField, 0L, 2L);
            }
            long shortLe = this.source.bufferField.readShortLe() & 65535;
            this.source.require(shortLe);
            if (z9) {
                updateCrc(this.source.bufferField, 0L, shortLe);
            }
            this.source.skip(shortLe);
        }
        if (((b10 >> 3) & 1) == 1) {
            long jIndexOf = this.source.indexOf((byte) 0);
            if (jIndexOf == -1) {
                C2104o.m5277a();
                return;
            } else {
                if (z9) {
                    updateCrc(this.source.bufferField, 0L, jIndexOf + 1);
                }
                this.source.skip(jIndexOf + 1);
            }
        }
        if (((b10 >> 4) & 1) == 1) {
            long jIndexOf2 = this.source.indexOf((byte) 0);
            if (jIndexOf2 == -1) {
                C2104o.m5277a();
                return;
            } else {
                if (z9) {
                    updateCrc(this.source.bufferField, 0L, jIndexOf2 + 1);
                }
                this.source.skip(jIndexOf2 + 1);
            }
        }
        if (z9) {
            checkEqual("FHCRC", this.source.readShortLe(), (short) this.crc.getValue());
            this.crc.reset();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void consumeTrailer() throws IOException {
        checkEqual("CRC", this.source.readIntLe(), (int) this.crc.getValue());
        checkEqual("ISIZE", this.source.readIntLe(), (int) this.inflater.getBytesWritten());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void updateCrc(Buffer buffer, long j3, long j4) {
        Segment segment = buffer.head;
        segment.getClass();
        while (true) {
            int i9 = segment.limit;
            int i10 = segment.pos;
            if (j3 < i9 - i10) {
                break;
            }
            j3 -= (long) (i9 - i10);
            segment = segment.next;
            segment.getClass();
        }
        while (j4 > 0) {
            int i11 = (int) (((long) segment.pos) + j3);
            int iMin = (int) Math.min(segment.limit - i11, j4);
            this.crc.update(segment.data, i11, iMin);
            j4 -= (long) iMin;
            segment = segment.next;
            segment.getClass();
            j3 = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inflaterSource.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Source
    public long read(Buffer buffer, long j3) throws IOException {
        GzipSource gzipSource;
        buffer.getClass();
        if (j3 < 0) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "byteCount < 0: "));
            return 0L;
        }
        if (j3 == 0) {
            return 0L;
        }
        if (this.section == 0) {
            consumeHeader();
            this.section = (byte) 1;
        }
        if (this.section == 1) {
            long size = buffer.size();
            long j4 = this.inflaterSource.read(buffer, j3);
            if (j4 != -1) {
                updateCrc(buffer, size, j4);
                return j4;
            }
            gzipSource = this;
            gzipSource.section = (byte) 2;
        } else {
            gzipSource = this;
        }
        if (gzipSource.section == 2) {
            consumeTrailer();
            gzipSource.section = (byte) 3;
            if (!gzipSource.source.exhausted()) {
                C2104o.m5299y("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Source
    public Timeout timeout() {
        return this.source.timeout();
    }
}
