package okio;

import com.alibaba.fastjson2.JSONB;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p136j8.C2104o;
import p222p.AbstractC3199a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RealBufferedSource implements BufferedSource {
    public final Buffer bufferField;
    public boolean closed;
    public final Source source;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RealBufferedSource(Source source) {
        source.getClass();
        this.source = source;
        this.bufferField = new Buffer();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource, okio.BufferedSink
    public Buffer buffer() {
        return this.bufferField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.bufferField.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public boolean exhausted() {
        if (!this.closed) {
            return this.bufferField.exhausted() && this.source.read(this.bufferField, 8192L) == -1;
        }
        C2104o.m5276A("closed");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource, okio.BufferedSink
    public Buffer getBuffer() {
        return this.bufferField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public long indexOf(byte b10, long j3, long j4) {
        if (this.closed) {
            C2104o.m5276A("closed");
            return 0L;
        }
        if (0 > j3 || j3 > j4) {
            StringBuilder sbM6842o = AbstractC3199a.m6842o(j3, "fromIndex=", " toIndex=");
            sbM6842o.append(j4);
            throw new IllegalArgumentException(sbM6842o.toString().toString());
        }
        long jMax = j3;
        while (jMax < j4) {
            byte b11 = b10;
            long j5 = j4;
            long jIndexOf = this.bufferField.indexOf(b11, jMax, j5);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = this.bufferField.size();
            if (size >= j5 || this.source.read(this.bufferField, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b10 = b11;
            j4 = j5;
        }
        return -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public long indexOfElement(ByteString byteString, long j3) {
        byteString.getClass();
        if (this.closed) {
            C2104o.m5276A("closed");
            return 0L;
        }
        while (true) {
            long jIndexOfElement = this.bufferField.indexOfElement(byteString, j3);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            j3 = Math.max(j3, size);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public InputStream inputStream() {
        return new InputStream() { // from class: okio.RealBufferedSource.inputStream.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.io.InputStream
            public int available() throws IOException {
                RealBufferedSource realBufferedSource = RealBufferedSource.this;
                if (!realBufferedSource.closed) {
                    return (int) Math.min(realBufferedSource.bufferField.size(), Integer.MAX_VALUE);
                }
                C2104o.m5299y("closed");
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws EOFException {
                RealBufferedSource.this.close();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.io.InputStream
            public int read(byte[] bArr, int i9, int i10) throws IOException {
                bArr.getClass();
                if (RealBufferedSource.this.closed) {
                    C2104o.m5299y("closed");
                    return 0;
                }
                SegmentedByteString.checkOffsetAndCount(bArr.length, i9, i10);
                if (RealBufferedSource.this.bufferField.size() == 0) {
                    RealBufferedSource realBufferedSource = RealBufferedSource.this;
                    if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                        return -1;
                    }
                }
                return RealBufferedSource.this.bufferField.read(bArr, i9, i10);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public String toString() {
                return RealBufferedSource.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                RealBufferedSource realBufferedSource = RealBufferedSource.this;
                if (!realBufferedSource.closed) {
                    if (realBufferedSource.bufferField.size() == 0) {
                        RealBufferedSource realBufferedSource2 = RealBufferedSource.this;
                        if (realBufferedSource2.source.read(realBufferedSource2.bufferField, 8192L) == -1) {
                            return -1;
                        }
                    }
                    return RealBufferedSource.this.bufferField.readByte() & 255;
                }
                C2104o.m5299y("closed");
                return 0;
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public boolean rangeEquals(long j3, ByteString byteString, int i9, int i10) {
        byteString.getClass();
        if (this.closed) {
            C2104o.m5276A("closed");
            return false;
        }
        if (j3 < 0 || i9 < 0 || i10 < 0 || byteString.size() - i9 < i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            long j4 = ((long) i11) + j3;
            if (!request(1 + j4) || this.bufferField.getByte(j4) != byteString.getByte(i9 + i11)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Source
    public long read(Buffer buffer, long j3) {
        buffer.getClass();
        if (j3 < 0) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "byteCount < 0: "));
            return 0L;
        }
        if (this.closed) {
            C2104o.m5276A("closed");
            return 0L;
        }
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
            return -1L;
        }
        return this.bufferField.read(buffer, Math.min(j3, this.bufferField.size()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public long readAll(Sink sink) {
        Buffer buffer;
        sink.getClass();
        long j3 = 0;
        while (true) {
            long j4 = this.source.read(this.bufferField, 8192L);
            buffer = this.bufferField;
            if (j4 == -1) {
                break;
            }
            long jCompleteSegmentByteCount = buffer.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j3 += jCompleteSegmentByteCount;
                sink.write(this.bufferField, jCompleteSegmentByteCount);
            }
        }
        if (buffer.size() <= 0) {
            return j3;
        }
        long size = this.bufferField.size() + j3;
        Buffer buffer2 = this.bufferField;
        sink.write(buffer2, buffer2.size());
        return size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public byte readByte() throws EOFException {
        require(1L);
        return this.bufferField.readByte();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public byte[] readByteArray() {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public ByteString readByteString() {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public long readDecimalLong() throws EOFException {
        byte b10;
        require(1L);
        long j3 = 0;
        while (true) {
            long j4 = j3 + 1;
            if (!request(j4)) {
                break;
            }
            b10 = this.bufferField.getByte(j3);
            if ((b10 < 48 || b10 > 57) && !(j3 == 0 && b10 == 45)) {
                break;
            }
            j3 = j4;
        }
        if (j3 == 0) {
            AbstractC0000a.m96w(16);
            AbstractC0000a.m96w(16);
            String string = Integer.toString(b10, 16);
            string.getClass();
            throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
        }
        return this.bufferField.readDecimalLong();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public void readFully(byte[] bArr) throws EOFException {
        bArr.getClass();
        try {
            require(bArr.length);
            this.bufferField.readFully(bArr);
        } catch (EOFException e6) {
            int i9 = 0;
            while (this.bufferField.size() > 0) {
                Buffer buffer = this.bufferField;
                int i10 = buffer.read(bArr, i9, (int) buffer.size());
                if (i10 == -1) {
                    throw new AssertionError();
                }
                i9 += i10;
            }
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() throws EOFException {
        byte b10;
        require(1L);
        int i9 = 0;
        while (true) {
            int i10 = i9 + 1;
            if (!request(i10)) {
                break;
            }
            b10 = this.bufferField.getByte(i9);
            if ((b10 < 48 || b10 > 57) && ((b10 < 97 || b10 > 102) && (b10 < 65 || b10 > 70))) {
                break;
            }
            i9 = i10;
        }
        if (i9 == 0) {
            AbstractC0000a.m96w(16);
            AbstractC0000a.m96w(16);
            String string = Integer.toString(b10, 16);
            string.getClass();
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
        }
        return this.bufferField.readHexadecimalUnsignedLong();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public int readInt() throws EOFException {
        require(4L);
        return this.bufferField.readInt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public int readIntLe() throws EOFException {
        require(4L);
        return this.bufferField.readIntLe();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public long readLong() throws EOFException {
        require(8L);
        return this.bufferField.readLong();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public long readLongLe() throws EOFException {
        require(8L);
        return this.bufferField.readLongLe();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public short readShort() throws EOFException {
        require(2L);
        return this.bufferField.readShort();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public short readShortLe() throws EOFException {
        require(2L);
        return this.bufferField.readShortLe();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public String readString(Charset charset) {
        charset.getClass();
        this.bufferField.writeAll(this.source);
        return this.bufferField.readString(charset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public String readUtf8() {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readUtf8();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        require(1L);
        byte b10 = this.bufferField.getByte(0L);
        if ((b10 & 224) == 192) {
            require(2L);
        } else if ((b10 & JSONB.Constants.BC_INT32_NUM_MIN) == 224) {
            require(3L);
        } else if ((b10 & 248) == 240) {
            require(4L);
        }
        return this.bufferField.readUtf8CodePoint();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public String readUtf8Line() {
        long jIndexOf = indexOf((byte) 10);
        Buffer buffer = this.bufferField;
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(buffer, jIndexOf);
        }
        if (buffer.size() != 0) {
            return readUtf8(this.bufferField.size());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public String readUtf8LineStrict(long j3) throws EOFException {
        if (j3 < 0) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "limit < 0: "));
            return null;
        }
        long j4 = j3 == Long.MAX_VALUE ? Long.MAX_VALUE : j3 + 1;
        long jIndexOf = indexOf((byte) 10, 0L, j4);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this.bufferField, jIndexOf);
        }
        if (j4 < Long.MAX_VALUE && request(j4) && this.bufferField.getByte(j4 - 1) == 13 && request(j4 + 1) && this.bufferField.getByte(j4) == 10) {
            return okio.internal.Buffer.readUtf8Line(this.bufferField, j4);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = this.bufferField;
        buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
        C2104o.m5282g(buffer.readByteString().hex(), Math.min(this.bufferField.size(), j3));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public boolean request(long j3) {
        if (j3 < 0) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "byteCount < 0: "));
            return false;
        }
        if (this.closed) {
            C2104o.m5276A("closed");
            return false;
        }
        while (this.bufferField.size() < j3) {
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public void require(long j3) throws EOFException {
        if (request(j3)) {
            return;
        }
        C2104o.m5277a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public int select(Options options) throws EOFException {
        options.getClass();
        if (this.closed) {
            C2104o.m5276A("closed");
            return 0;
        }
        do {
            int iSelectPrefix = okio.internal.Buffer.selectPrefix(this.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix == -1) {
                    return -1;
                }
                this.bufferField.skip(options.getByteStrings$okio()[iSelectPrefix].size());
                return iSelectPrefix;
            }
        } while (this.source.read(this.bufferField, 8192L) != -1);
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.BufferedSource
    public void skip(long j3) throws EOFException {
        if (this.closed) {
            C2104o.m5276A("closed");
            return;
        }
        while (j3 > 0) {
            if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
                C2104o.m5277a();
                return;
            } else {
                long jMin = Math.min(j3, this.bufferField.size());
                this.bufferField.skip(jMin);
                j3 -= jMin;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Source
    public Timeout timeout() {
        return this.source.timeout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "buffer(" + this.source + ')';
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray(long j3) throws EOFException {
        require(j3);
        return this.bufferField.readByteArray(j3);
    }

    @Override // okio.BufferedSource
    public ByteString readByteString(long j3) throws EOFException {
        require(j3);
        return this.bufferField.readByteString(j3);
    }

    @Override // okio.BufferedSource
    public String readUtf8(long j3) throws EOFException {
        require(j3);
        return this.bufferField.readUtf8(j3);
    }

    @Override // okio.BufferedSource
    public String readString(long j3, Charset charset) throws EOFException {
        charset.getClass();
        require(j3);
        return this.bufferField.readString(j3, charset);
    }

    public static /* synthetic */ void getBuffer$annotations() {
    }

    @Override // okio.BufferedSource
    public void readFully(Buffer buffer, long j3) throws EOFException {
        buffer.getClass();
        try {
            require(j3);
            this.bufferField.readFully(buffer, j3);
        } catch (EOFException e6) {
            buffer.writeAll(this.bufferField);
            throw e6;
        }
    }

    @Override // okio.BufferedSource
    public long indexOfElement(ByteString byteString) {
        byteString.getClass();
        return indexOfElement(byteString, 0L);
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j3, ByteString byteString) {
        byteString.getClass();
        return rangeEquals(j3, byteString, 0, byteString.size());
    }

    @Override // okio.BufferedSource
    public int read(byte[] bArr) {
        bArr.getClass();
        return read(bArr, 0, bArr.length);
    }

    @Override // okio.BufferedSource
    public int read(byte[] bArr, int i9, int i10) {
        bArr.getClass();
        long j3 = i10;
        SegmentedByteString.checkOffsetAndCount(bArr.length, i9, j3);
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
            return -1;
        }
        return this.bufferField.read(bArr, i9, (int) Math.min(j3, this.bufferField.size()));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
            return -1;
        }
        return this.bufferField.read(byteBuffer);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b10, long j3) {
        return indexOf(b10, j3, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(ByteString byteString) {
        byteString.getClass();
        return indexOf(byteString, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b10) {
        return indexOf(b10, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(ByteString byteString, long j3) {
        byteString.getClass();
        if (this.closed) {
            C2104o.m5276A("closed");
            return 0L;
        }
        while (true) {
            long jIndexOf = this.bufferField.indexOf(byteString, j3);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            j3 = Math.max(j3, (size - ((long) byteString.size())) + 1);
        }
    }

    @Override // okio.BufferedSource
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }
}
