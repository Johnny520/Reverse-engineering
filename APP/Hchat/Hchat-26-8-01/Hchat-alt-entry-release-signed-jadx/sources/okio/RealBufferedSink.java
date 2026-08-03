package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RealBufferedSink implements BufferedSink {
    public final Buffer bufferField;
    public boolean closed;
    public final Sink sink;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RealBufferedSink(Sink sink) {
        sink.getClass();
        this.sink = sink;
        this.bufferField = new Buffer();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSink
    public Buffer buffer() {
        return this.bufferField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        try {
            if (this.bufferField.size() > 0) {
                Sink sink = this.sink;
                Buffer buffer = this.bufferField;
                sink.write(buffer, buffer.size());
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.sink.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSink
    public BufferedSink emit() {
        if (this.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        long size = this.bufferField.size();
        if (size > 0) {
            this.sink.write(this.bufferField, size);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSink
    public BufferedSink emitCompleteSegments() {
        if (this.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        long jCompleteSegmentByteCount = this.bufferField.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            this.sink.write(this.bufferField, jCompleteSegmentByteCount);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
        if (this.closed) {
            C2104o.m5276A("closed");
            return;
        }
        if (this.bufferField.size() > 0) {
            Sink sink = this.sink;
            Buffer buffer = this.bufferField;
            sink.write(buffer, buffer.size());
        }
        this.sink.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSink
    public Buffer getBuffer() {
        return this.bufferField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSink
    public OutputStream outputStream() {
        return new OutputStream() { // from class: okio.RealBufferedSink.outputStream.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws Throwable {
                RealBufferedSink.this.close();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (realBufferedSink.closed) {
                    return;
                }
                realBufferedSink.flush();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public String toString() {
                return RealBufferedSink.this + ".outputStream()";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i9, int i10) throws IOException {
                bArr.getClass();
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (realBufferedSink.closed) {
                    C2104o.m5299y("closed");
                } else {
                    realBufferedSink.bufferField.write(bArr, i9, i10);
                    RealBufferedSink.this.emitCompleteSegments();
                }
            }

            @Override // java.io.OutputStream
            public void write(int i9) throws IOException {
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (!realBufferedSink.closed) {
                    realBufferedSink.bufferField.writeByte((int) ((byte) i9));
                    RealBufferedSink.this.emitCompleteSegments();
                } else {
                    C2104o.m5299y("closed");
                }
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Sink
    public Timeout timeout() {
        return this.sink.timeout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "buffer(" + this.sink + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSink
    public BufferedSink write(Source source, long j3) throws EOFException {
        source.getClass();
        while (j3 > 0) {
            long j4 = source.read(this.bufferField, j3);
            if (j4 == -1) {
                C2104o.m5277a();
                return null;
            }
            j3 -= j4;
            emitCompleteSegments();
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSink
    public long writeAll(Source source) {
        source.getClass();
        long j3 = 0;
        while (true) {
            long j4 = source.read(this.bufferField, 8192L);
            if (j4 == -1) {
                return j3;
            }
            j3 += j4;
            emitCompleteSegments();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSink
    public BufferedSink writeByte(int i9) {
        if (this.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        this.bufferField.writeByte(i9);
        return emitCompleteSegments();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSink
    public BufferedSink writeDecimalLong(long j3) {
        if (this.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        this.bufferField.writeDecimalLong(j3);
        return emitCompleteSegments();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSink
    public BufferedSink writeHexadecimalUnsignedLong(long j3) {
        if (this.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        this.bufferField.writeHexadecimalUnsignedLong(j3);
        return emitCompleteSegments();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSink
    public BufferedSink writeInt(int i9) {
        if (this.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        this.bufferField.writeInt(i9);
        return emitCompleteSegments();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSink
    public BufferedSink writeIntLe(int i9) {
        if (this.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        this.bufferField.writeIntLe(i9);
        return emitCompleteSegments();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSink
    public BufferedSink writeLong(long j3) {
        if (this.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        this.bufferField.writeLong(j3);
        return emitCompleteSegments();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSink
    public BufferedSink writeLongLe(long j3) {
        if (this.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        this.bufferField.writeLongLe(j3);
        return emitCompleteSegments();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSink
    public BufferedSink writeShort(int i9) {
        if (this.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        this.bufferField.writeShort(i9);
        return emitCompleteSegments();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSink
    public BufferedSink writeShortLe(int i9) {
        if (this.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        this.bufferField.writeShortLe(i9);
        return emitCompleteSegments();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSink
    public BufferedSink writeString(String str, Charset charset) {
        str.getClass();
        charset.getClass();
        if (this.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        this.bufferField.writeString(str, charset);
        return emitCompleteSegments();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSink
    public BufferedSink writeUtf8(String str) {
        str.getClass();
        if (this.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        this.bufferField.writeUtf8(str);
        return emitCompleteSegments();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSink
    public BufferedSink writeUtf8CodePoint(int i9) {
        if (this.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        this.bufferField.writeUtf8CodePoint(i9);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeUtf8(String str, int i9, int i10) {
        str.getClass();
        if (!this.closed) {
            this.bufferField.writeUtf8(str, i9, i10);
            return emitCompleteSegments();
        }
        C2104o.m5276A("closed");
        return null;
    }

    public static /* synthetic */ void getBuffer$annotations() {
    }

    @Override // okio.BufferedSink
    public BufferedSink writeString(String str, int i9, int i10, Charset charset) {
        str.getClass();
        charset.getClass();
        if (!this.closed) {
            this.bufferField.writeString(str, i9, i10, charset);
            return emitCompleteSegments();
        }
        C2104o.m5276A("closed");
        return null;
    }

    @Override // okio.Sink
    public void write(Buffer buffer, long j3) {
        buffer.getClass();
        if (!this.closed) {
            this.bufferField.write(buffer, j3);
            emitCompleteSegments();
        } else {
            C2104o.m5276A("closed");
        }
    }

    @Override // okio.BufferedSink
    public BufferedSink write(ByteString byteString) {
        byteString.getClass();
        if (!this.closed) {
            this.bufferField.write(byteString);
            return emitCompleteSegments();
        }
        C2104o.m5276A("closed");
        return null;
    }

    @Override // okio.BufferedSink
    public BufferedSink write(ByteString byteString, int i9, int i10) {
        byteString.getClass();
        if (!this.closed) {
            this.bufferField.write(byteString, i9, i10);
            return emitCompleteSegments();
        }
        C2104o.m5276A("closed");
        return null;
    }

    @Override // okio.BufferedSink
    public BufferedSink write(byte[] bArr) {
        bArr.getClass();
        if (!this.closed) {
            this.bufferField.write(bArr);
            return emitCompleteSegments();
        }
        C2104o.m5276A("closed");
        return null;
    }

    @Override // okio.BufferedSink
    public BufferedSink write(byte[] bArr, int i9, int i10) {
        bArr.getClass();
        if (!this.closed) {
            this.bufferField.write(bArr, i9, i10);
            return emitCompleteSegments();
        }
        C2104o.m5276A("closed");
        return null;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.closed) {
            int iWrite = this.bufferField.write(byteBuffer);
            emitCompleteSegments();
            return iWrite;
        }
        C2104o.m5276A("closed");
        return 0;
    }
}
