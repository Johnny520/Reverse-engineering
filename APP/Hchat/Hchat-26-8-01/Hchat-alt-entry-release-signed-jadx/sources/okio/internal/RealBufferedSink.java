package okio.internal;

import java.io.EOFException;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p136j8.C2104o;

/* JADX INFO: renamed from: okio.internal.-RealBufferedSink, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RealBufferedSink {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void commonClose(okio.RealBufferedSink realBufferedSink) throws Throwable {
        realBufferedSink.getClass();
        if (realBufferedSink.closed) {
            return;
        }
        try {
            if (realBufferedSink.bufferField.size() > 0) {
                Sink sink = realBufferedSink.sink;
                Buffer buffer = realBufferedSink.bufferField;
                sink.write(buffer, buffer.size());
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            realBufferedSink.sink.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        realBufferedSink.closed = true;
        if (th != null) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final BufferedSink commonEmit(okio.RealBufferedSink realBufferedSink) {
        realBufferedSink.getClass();
        if (realBufferedSink.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        long size = realBufferedSink.bufferField.size();
        if (size > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, size);
        }
        return realBufferedSink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final BufferedSink commonEmitCompleteSegments(okio.RealBufferedSink realBufferedSink) {
        realBufferedSink.getClass();
        if (realBufferedSink.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        long jCompleteSegmentByteCount = realBufferedSink.bufferField.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, jCompleteSegmentByteCount);
        }
        return realBufferedSink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void commonFlush(okio.RealBufferedSink realBufferedSink) {
        realBufferedSink.getClass();
        if (realBufferedSink.closed) {
            C2104o.m5276A("closed");
            return;
        }
        if (realBufferedSink.bufferField.size() > 0) {
            Sink sink = realBufferedSink.sink;
            Buffer buffer = realBufferedSink.bufferField;
            sink.write(buffer, buffer.size());
        }
        realBufferedSink.sink.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Timeout commonTimeout(okio.RealBufferedSink realBufferedSink) {
        realBufferedSink.getClass();
        return realBufferedSink.sink.timeout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String commonToString(okio.RealBufferedSink realBufferedSink) {
        realBufferedSink.getClass();
        return "buffer(" + realBufferedSink.sink + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, Source source, long j3) throws EOFException {
        realBufferedSink.getClass();
        source.getClass();
        while (j3 > 0) {
            long j4 = source.read(realBufferedSink.bufferField, j3);
            if (j4 == -1) {
                C2104o.m5277a();
                return null;
            }
            j3 -= j4;
            realBufferedSink.emitCompleteSegments();
        }
        return realBufferedSink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long commonWriteAll(okio.RealBufferedSink realBufferedSink, Source source) {
        realBufferedSink.getClass();
        source.getClass();
        long j3 = 0;
        while (true) {
            long j4 = source.read(realBufferedSink.bufferField, 8192L);
            if (j4 == -1) {
                return j3;
            }
            j3 += j4;
            realBufferedSink.emitCompleteSegments();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final BufferedSink commonWriteByte(okio.RealBufferedSink realBufferedSink, int i9) {
        realBufferedSink.getClass();
        if (realBufferedSink.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        realBufferedSink.bufferField.writeByte(i9);
        return realBufferedSink.emitCompleteSegments();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final BufferedSink commonWriteDecimalLong(okio.RealBufferedSink realBufferedSink, long j3) {
        realBufferedSink.getClass();
        if (realBufferedSink.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        realBufferedSink.bufferField.writeDecimalLong(j3);
        return realBufferedSink.emitCompleteSegments();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final BufferedSink commonWriteHexadecimalUnsignedLong(okio.RealBufferedSink realBufferedSink, long j3) {
        realBufferedSink.getClass();
        if (realBufferedSink.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        realBufferedSink.bufferField.writeHexadecimalUnsignedLong(j3);
        return realBufferedSink.emitCompleteSegments();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final BufferedSink commonWriteInt(okio.RealBufferedSink realBufferedSink, int i9) {
        realBufferedSink.getClass();
        if (realBufferedSink.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        realBufferedSink.bufferField.writeInt(i9);
        return realBufferedSink.emitCompleteSegments();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final BufferedSink commonWriteIntLe(okio.RealBufferedSink realBufferedSink, int i9) {
        realBufferedSink.getClass();
        if (realBufferedSink.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        realBufferedSink.bufferField.writeIntLe(i9);
        return realBufferedSink.emitCompleteSegments();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final BufferedSink commonWriteLong(okio.RealBufferedSink realBufferedSink, long j3) {
        realBufferedSink.getClass();
        if (realBufferedSink.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        realBufferedSink.bufferField.writeLong(j3);
        return realBufferedSink.emitCompleteSegments();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final BufferedSink commonWriteLongLe(okio.RealBufferedSink realBufferedSink, long j3) {
        realBufferedSink.getClass();
        if (realBufferedSink.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        realBufferedSink.bufferField.writeLongLe(j3);
        return realBufferedSink.emitCompleteSegments();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final BufferedSink commonWriteShort(okio.RealBufferedSink realBufferedSink, int i9) {
        realBufferedSink.getClass();
        if (realBufferedSink.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        realBufferedSink.bufferField.writeShort(i9);
        return realBufferedSink.emitCompleteSegments();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final BufferedSink commonWriteShortLe(okio.RealBufferedSink realBufferedSink, int i9) {
        realBufferedSink.getClass();
        if (realBufferedSink.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        realBufferedSink.bufferField.writeShortLe(i9);
        return realBufferedSink.emitCompleteSegments();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final BufferedSink commonWriteUtf8(okio.RealBufferedSink realBufferedSink, String str) {
        realBufferedSink.getClass();
        str.getClass();
        if (realBufferedSink.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        realBufferedSink.bufferField.writeUtf8(str);
        return realBufferedSink.emitCompleteSegments();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final BufferedSink commonWriteUtf8CodePoint(okio.RealBufferedSink realBufferedSink, int i9) {
        realBufferedSink.getClass();
        if (realBufferedSink.closed) {
            C2104o.m5276A("closed");
            return null;
        }
        realBufferedSink.bufferField.writeUtf8CodePoint(i9);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteUtf8(okio.RealBufferedSink realBufferedSink, String str, int i9, int i10) {
        realBufferedSink.getClass();
        str.getClass();
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeUtf8(str, i9, i10);
            return realBufferedSink.emitCompleteSegments();
        }
        C2104o.m5276A("closed");
        return null;
    }

    public static final BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, ByteString byteString) {
        realBufferedSink.getClass();
        byteString.getClass();
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(byteString);
            return realBufferedSink.emitCompleteSegments();
        }
        C2104o.m5276A("closed");
        return null;
    }

    public static final BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, ByteString byteString, int i9, int i10) {
        realBufferedSink.getClass();
        byteString.getClass();
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(byteString, i9, i10);
            return realBufferedSink.emitCompleteSegments();
        }
        C2104o.m5276A("closed");
        return null;
    }

    public static final BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, byte[] bArr) {
        realBufferedSink.getClass();
        bArr.getClass();
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(bArr);
            return realBufferedSink.emitCompleteSegments();
        }
        C2104o.m5276A("closed");
        return null;
    }

    public static final BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, byte[] bArr, int i9, int i10) {
        realBufferedSink.getClass();
        bArr.getClass();
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(bArr, i9, i10);
            return realBufferedSink.emitCompleteSegments();
        }
        C2104o.m5276A("closed");
        return null;
    }

    public static final void commonWrite(okio.RealBufferedSink realBufferedSink, Buffer buffer, long j3) {
        realBufferedSink.getClass();
        buffer.getClass();
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(buffer, j3);
            realBufferedSink.emitCompleteSegments();
        } else {
            C2104o.m5276A("closed");
        }
    }
}
