package okhttp3.internal.http2;

import gg.AbstractC1411g;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.Buffer;
import okio.BufferedSink;
import p068eh.AbstractC0921a;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Http2Writer implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final Buffer hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final BufferedSink sink;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Http2Writer(BufferedSink bufferedSink, boolean z9) {
        bufferedSink.getClass();
        this.sink = bufferedSink;
        this.client = z9;
        Buffer buffer = new Buffer();
        this.hpackBuffer = buffer;
        this.maxFrameSize = 16384;
        this.hpackWriter = new Hpack.Writer(0, false, buffer, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void writeContinuationFrames(int i9, long j3) {
        while (j3 > 0) {
            long jMin = Math.min(this.maxFrameSize, j3);
            j3 -= jMin;
            frameHeader(i9, (int) jMin, 9, j3 == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, jMin);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void applyAndAckSettings(Settings settings) {
        try {
            settings.getClass();
            if (this.closed) {
                throw new IOException("closed");
            }
            this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
            if (settings.getHeaderTableSize() != -1) {
                this.hpackWriter.resizeHeaderTable(settings.getHeaderTableSize());
            }
            frameHeader(0, 0, 4, 1);
            this.sink.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.closed = true;
        this.sink.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void connectionPreface() {
        try {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (this.client) {
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Util.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.hex(), new Object[0]));
                }
                this.sink.write(Http2.CONNECTION_PREFACE);
                this.sink.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void data(boolean z9, int i9, Buffer buffer, int i10) {
        if (this.closed) {
            throw new IOException("closed");
        }
        dataFrame(i9, z9 ? 1 : 0, buffer, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void dataFrame(int i9, int i10, Buffer buffer, int i11) {
        frameHeader(i9, i11, 0, i10);
        if (i11 > 0) {
            BufferedSink bufferedSink = this.sink;
            buffer.getClass();
            bufferedSink.write(buffer, i11);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void flush() {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.sink.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void frameHeader(int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            i13 = i9;
            i14 = i10;
            i15 = i11;
            i16 = i12;
            logger2.fine(Http2.INSTANCE.frameLog(false, i13, i14, i15, i16));
        } else {
            i13 = i9;
            i14 = i10;
            i15 = i11;
            i16 = i12;
        }
        if (i14 > this.maxFrameSize) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i14).toString());
        }
        if ((Integer.MIN_VALUE & i13) != 0) {
            C2104o.m5291q(AbstractC0921a.m2249l(i13, "reserved bit set: "));
            return;
        }
        Util.writeMedium(this.sink, i14);
        this.sink.writeByte(i15 & 255);
        this.sink.writeByte(i16 & 255);
        this.sink.writeInt(Integer.MAX_VALUE & i13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void goAway(int i9, ErrorCode errorCode, byte[] bArr) {
        try {
            errorCode.getClass();
            bArr.getClass();
            if (this.closed) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            frameHeader(0, bArr.length + 8, 7, 0);
            this.sink.writeInt(i9);
            this.sink.writeInt(errorCode.getHttpCode());
            if (!(bArr.length == 0)) {
                this.sink.write(bArr);
            }
            this.sink.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void headers(boolean z9, int i9, List<Header> list) {
        list.getClass();
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(list);
        long size = this.hpackBuffer.size();
        long jMin = Math.min(this.maxFrameSize, size);
        int i10 = size == jMin ? 4 : 0;
        if (z9) {
            i10 |= 1;
        }
        frameHeader(i9, (int) jMin, 1, i10);
        this.sink.write(this.hpackBuffer, jMin);
        if (size > jMin) {
            writeContinuationFrames(i9, size - jMin);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void ping(boolean z9, int i9, int i10) {
        if (this.closed) {
            throw new IOException("closed");
        }
        frameHeader(0, 8, 6, z9 ? 1 : 0);
        this.sink.writeInt(i9);
        this.sink.writeInt(i10);
        this.sink.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void pushPromise(int i9, int i10, List<Header> list) {
        list.getClass();
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(list);
        long size = this.hpackBuffer.size();
        int iMin = (int) Math.min(((long) this.maxFrameSize) - 4, size);
        long j3 = iMin;
        frameHeader(i9, iMin + 4, 5, size == j3 ? 4 : 0);
        this.sink.writeInt(i10 & Integer.MAX_VALUE);
        this.sink.write(this.hpackBuffer, j3);
        if (size > j3) {
            writeContinuationFrames(i9, size - j3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void rstStream(int i9, ErrorCode errorCode) {
        errorCode.getClass();
        if (this.closed) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        frameHeader(i9, 4, 3, 0);
        this.sink.writeInt(errorCode.getHttpCode());
        this.sink.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void settings(Settings settings) {
        try {
            settings.getClass();
            if (this.closed) {
                throw new IOException("closed");
            }
            int i9 = 0;
            frameHeader(0, settings.size() * 6, 4, 0);
            while (i9 < 10) {
                if (settings.isSet(i9)) {
                    this.sink.writeShort(i9 != 4 ? i9 != 7 ? i9 : 4 : 3);
                    this.sink.writeInt(settings.get(i9));
                }
                i9++;
            }
            this.sink.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void windowUpdate(int i9, long j3) {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (j3 == 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j3).toString());
        }
        frameHeader(i9, 4, 8, 0);
        this.sink.writeInt((int) j3);
        this.sink.flush();
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.http2.Http2Writer.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        private Companion() {
        }
    }
}
