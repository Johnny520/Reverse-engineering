package okio.internal;

import com.alibaba.fastjson2.JSONB;
import java.io.EOFException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Options;
import okio.PeekSource;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Timeout;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p136j8.C2104o;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: okio.internal.-RealBufferedSource, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RealBufferedSource {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void commonClose(okio.RealBufferedSource realBufferedSource) throws EOFException {
        realBufferedSource.getClass();
        if (realBufferedSource.closed) {
            return;
        }
        realBufferedSource.closed = true;
        realBufferedSource.source.close();
        realBufferedSource.bufferField.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean commonExhausted(okio.RealBufferedSource realBufferedSource) {
        realBufferedSource.getClass();
        if (!realBufferedSource.closed) {
            return realBufferedSource.bufferField.exhausted() && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1;
        }
        C2104o.m5276A("closed");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long commonIndexOf(okio.RealBufferedSource realBufferedSource, byte b10, long j3, long j4) {
        realBufferedSource.getClass();
        if (realBufferedSource.closed) {
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
            long jIndexOf = realBufferedSource.bufferField.indexOf(b11, jMax, j5);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (size >= j5 || realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b10 = b11;
            j4 = j5;
        }
        return -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long commonIndexOfElement(okio.RealBufferedSource realBufferedSource, ByteString byteString, long j3) {
        realBufferedSource.getClass();
        byteString.getClass();
        if (realBufferedSource.closed) {
            C2104o.m5276A("closed");
            return 0L;
        }
        while (true) {
            long jIndexOfElement = realBufferedSource.bufferField.indexOfElement(byteString, j3);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j3 = Math.max(j3, size);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final BufferedSource commonPeek(okio.RealBufferedSource realBufferedSource) {
        realBufferedSource.getClass();
        return Okio.buffer(new PeekSource(realBufferedSource));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean commonRangeEquals(okio.RealBufferedSource realBufferedSource, long j3, ByteString byteString, int i9, int i10) {
        realBufferedSource.getClass();
        byteString.getClass();
        if (realBufferedSource.closed) {
            C2104o.m5276A("closed");
            return false;
        }
        if (j3 < 0 || i9 < 0 || i10 < 0 || byteString.size() - i9 < i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            long j4 = ((long) i11) + j3;
            if (!realBufferedSource.request(1 + j4) || realBufferedSource.bufferField.getByte(j4) != byteString.getByte(i9 + i11)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long commonRead(okio.RealBufferedSource realBufferedSource, Buffer buffer, long j3) {
        realBufferedSource.getClass();
        buffer.getClass();
        if (j3 < 0) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "byteCount < 0: "));
            return 0L;
        }
        if (realBufferedSource.closed) {
            C2104o.m5276A("closed");
            return 0L;
        }
        if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
            return -1L;
        }
        return realBufferedSource.bufferField.read(buffer, Math.min(j3, realBufferedSource.bufferField.size()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long commonReadAll(okio.RealBufferedSource realBufferedSource, Sink sink) {
        Buffer buffer;
        realBufferedSource.getClass();
        sink.getClass();
        long j3 = 0;
        while (true) {
            long j4 = realBufferedSource.source.read(realBufferedSource.bufferField, 8192L);
            buffer = realBufferedSource.bufferField;
            if (j4 == -1) {
                break;
            }
            long jCompleteSegmentByteCount = buffer.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j3 += jCompleteSegmentByteCount;
                sink.write(realBufferedSource.bufferField, jCompleteSegmentByteCount);
            }
        }
        if (buffer.size() <= 0) {
            return j3;
        }
        long size = realBufferedSource.bufferField.size() + j3;
        Buffer buffer2 = realBufferedSource.bufferField;
        sink.write(buffer2, buffer2.size());
        return size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final byte commonReadByte(okio.RealBufferedSource realBufferedSource) throws EOFException {
        realBufferedSource.getClass();
        realBufferedSource.require(1L);
        return realBufferedSource.bufferField.readByte();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final byte[] commonReadByteArray(okio.RealBufferedSource realBufferedSource) {
        realBufferedSource.getClass();
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ByteString commonReadByteString(okio.RealBufferedSource realBufferedSource) {
        realBufferedSource.getClass();
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long commonReadDecimalLong(okio.RealBufferedSource realBufferedSource) throws EOFException {
        byte b10;
        realBufferedSource.getClass();
        realBufferedSource.require(1L);
        long j3 = 0;
        while (true) {
            long j4 = j3 + 1;
            if (!realBufferedSource.request(j4)) {
                break;
            }
            b10 = realBufferedSource.bufferField.getByte(j3);
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
        return realBufferedSource.bufferField.readDecimalLong();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void commonReadFully(okio.RealBufferedSource realBufferedSource, byte[] bArr) throws EOFException {
        realBufferedSource.getClass();
        bArr.getClass();
        try {
            realBufferedSource.require(bArr.length);
            realBufferedSource.bufferField.readFully(bArr);
        } catch (EOFException e6) {
            int i9 = 0;
            while (realBufferedSource.bufferField.size() > 0) {
                Buffer buffer = realBufferedSource.bufferField;
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
    public static final long commonReadHexadecimalUnsignedLong(okio.RealBufferedSource realBufferedSource) throws EOFException {
        byte b10;
        realBufferedSource.getClass();
        realBufferedSource.require(1L);
        int i9 = 0;
        while (true) {
            int i10 = i9 + 1;
            if (!realBufferedSource.request(i10)) {
                break;
            }
            b10 = realBufferedSource.bufferField.getByte(i9);
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
        return realBufferedSource.bufferField.readHexadecimalUnsignedLong();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int commonReadInt(okio.RealBufferedSource realBufferedSource) throws EOFException {
        realBufferedSource.getClass();
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readInt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int commonReadIntLe(okio.RealBufferedSource realBufferedSource) throws EOFException {
        realBufferedSource.getClass();
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readIntLe();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long commonReadLong(okio.RealBufferedSource realBufferedSource) throws EOFException {
        realBufferedSource.getClass();
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLong();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long commonReadLongLe(okio.RealBufferedSource realBufferedSource) throws EOFException {
        realBufferedSource.getClass();
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLongLe();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final short commonReadShort(okio.RealBufferedSource realBufferedSource) throws EOFException {
        realBufferedSource.getClass();
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShort();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final short commonReadShortLe(okio.RealBufferedSource realBufferedSource) throws EOFException {
        realBufferedSource.getClass();
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShortLe();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String commonReadUtf8(okio.RealBufferedSource realBufferedSource) {
        realBufferedSource.getClass();
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readUtf8();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int commonReadUtf8CodePoint(okio.RealBufferedSource realBufferedSource) throws EOFException {
        realBufferedSource.getClass();
        realBufferedSource.require(1L);
        byte b10 = realBufferedSource.bufferField.getByte(0L);
        if ((b10 & 224) == 192) {
            realBufferedSource.require(2L);
        } else if ((b10 & JSONB.Constants.BC_INT32_NUM_MIN) == 224) {
            realBufferedSource.require(3L);
        } else if ((b10 & 248) == 240) {
            realBufferedSource.require(4L);
        }
        return realBufferedSource.bufferField.readUtf8CodePoint();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String commonReadUtf8Line(okio.RealBufferedSource realBufferedSource) {
        realBufferedSource.getClass();
        long jIndexOf = realBufferedSource.indexOf((byte) 10);
        Buffer buffer = realBufferedSource.bufferField;
        if (jIndexOf != -1) {
            return Buffer.readUtf8Line(buffer, jIndexOf);
        }
        if (buffer.size() != 0) {
            return realBufferedSource.readUtf8(realBufferedSource.bufferField.size());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String commonReadUtf8LineStrict(okio.RealBufferedSource realBufferedSource, long j3) throws EOFException {
        realBufferedSource.getClass();
        if (j3 < 0) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "limit < 0: "));
            return null;
        }
        long j4 = j3 == Long.MAX_VALUE ? Long.MAX_VALUE : j3 + 1;
        long jIndexOf = realBufferedSource.indexOf((byte) 10, 0L, j4);
        if (jIndexOf != -1) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (j4 < Long.MAX_VALUE && realBufferedSource.request(j4) && realBufferedSource.bufferField.getByte(j4 - 1) == 13 && realBufferedSource.request(j4 + 1) && realBufferedSource.bufferField.getByte(j4) == 10) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, j4);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = realBufferedSource.bufferField;
        buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
        C2104o.m5282g(buffer.readByteString().hex(), Math.min(realBufferedSource.bufferField.size(), j3));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean commonRequest(okio.RealBufferedSource realBufferedSource, long j3) {
        realBufferedSource.getClass();
        if (j3 < 0) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "byteCount < 0: "));
            return false;
        }
        if (realBufferedSource.closed) {
            C2104o.m5276A("closed");
            return false;
        }
        while (realBufferedSource.bufferField.size() < j3) {
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void commonRequire(okio.RealBufferedSource realBufferedSource, long j3) throws EOFException {
        realBufferedSource.getClass();
        if (realBufferedSource.request(j3)) {
            return;
        }
        C2104o.m5277a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int commonSelect(okio.RealBufferedSource realBufferedSource, Options options) throws EOFException {
        realBufferedSource.getClass();
        options.getClass();
        if (realBufferedSource.closed) {
            C2104o.m5276A("closed");
            return 0;
        }
        do {
            int iSelectPrefix = Buffer.selectPrefix(realBufferedSource.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix == -1) {
                    return -1;
                }
                realBufferedSource.bufferField.skip(options.getByteStrings$okio()[iSelectPrefix].size());
                return iSelectPrefix;
            }
        } while (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) != -1);
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void commonSkip(okio.RealBufferedSource realBufferedSource, long j3) throws EOFException {
        realBufferedSource.getClass();
        if (realBufferedSource.closed) {
            C2104o.m5276A("closed");
            return;
        }
        while (j3 > 0) {
            if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                C2104o.m5277a();
                return;
            } else {
                long jMin = Math.min(j3, realBufferedSource.bufferField.size());
                realBufferedSource.bufferField.skip(jMin);
                j3 -= jMin;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Timeout commonTimeout(okio.RealBufferedSource realBufferedSource) {
        realBufferedSource.getClass();
        return realBufferedSource.source.timeout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String commonToString(okio.RealBufferedSource realBufferedSource) {
        realBufferedSource.getClass();
        return "buffer(" + realBufferedSource.source + ')';
    }

    public static final byte[] commonReadByteArray(okio.RealBufferedSource realBufferedSource, long j3) throws EOFException {
        realBufferedSource.getClass();
        realBufferedSource.require(j3);
        return realBufferedSource.bufferField.readByteArray(j3);
    }

    public static final ByteString commonReadByteString(okio.RealBufferedSource realBufferedSource, long j3) throws EOFException {
        realBufferedSource.getClass();
        realBufferedSource.require(j3);
        return realBufferedSource.bufferField.readByteString(j3);
    }

    public static final String commonReadUtf8(okio.RealBufferedSource realBufferedSource, long j3) throws EOFException {
        realBufferedSource.getClass();
        realBufferedSource.require(j3);
        return realBufferedSource.bufferField.readUtf8(j3);
    }

    public static final void commonReadFully(okio.RealBufferedSource realBufferedSource, Buffer buffer, long j3) throws EOFException {
        realBufferedSource.getClass();
        buffer.getClass();
        try {
            realBufferedSource.require(j3);
            realBufferedSource.bufferField.readFully(buffer, j3);
        } catch (EOFException e6) {
            buffer.writeAll(realBufferedSource.bufferField);
            throw e6;
        }
    }

    public static final int commonRead(okio.RealBufferedSource realBufferedSource, byte[] bArr, int i9, int i10) {
        realBufferedSource.getClass();
        bArr.getClass();
        long j3 = i10;
        SegmentedByteString.checkOffsetAndCount(bArr.length, i9, j3);
        if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
            return -1;
        }
        return realBufferedSource.bufferField.read(bArr, i9, (int) Math.min(j3, realBufferedSource.bufferField.size()));
    }

    public static final long commonIndexOf(okio.RealBufferedSource realBufferedSource, ByteString byteString, long j3) {
        realBufferedSource.getClass();
        byteString.getClass();
        if (realBufferedSource.closed) {
            C2104o.m5276A("closed");
            return 0L;
        }
        while (true) {
            long jIndexOf = realBufferedSource.bufferField.indexOf(byteString, j3);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j3 = Math.max(j3, (size - ((long) byteString.size())) + 1);
        }
    }
}
