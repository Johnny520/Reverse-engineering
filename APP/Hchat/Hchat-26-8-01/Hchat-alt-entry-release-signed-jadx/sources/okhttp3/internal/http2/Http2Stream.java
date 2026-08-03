package okhttp3.internal.http2;

import gg.AbstractC1411g;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p025bc.AbstractC0255e;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Http2Stream {
    public static final Companion Companion = new Companion(null);
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final Http2Connection connection;
    private ErrorCode errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;

    /* JADX INFO: renamed from: id */
    private final int f10231id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final StreamTimeout readTimeout;
    private final FramingSink sink;
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final StreamTimeout writeTimeout;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class FramingSource implements Source {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private Headers trailers;
        private final Buffer receiveBuffer = new Buffer();
        private final Buffer readBuffer = new Buffer();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public FramingSource(long j3, boolean z9) {
            this.maxByteCount = j3;
            this.finished = z9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void updateConnectionFlowControl(long j3) {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                C2104o.m5284i(Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
            } else {
                Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(j3);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.closed = true;
                size = this.readBuffer.size();
                this.readBuffer.clear();
                http2Stream.getClass();
                http2Stream.notifyAll();
            }
            if (size > 0) {
                updateConnectionFlowControl(size);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean getClosed$okhttp() {
            return this.closed;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean getFinished$okhttp() {
            return this.finished;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Buffer getReadBuffer() {
            return this.readBuffer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Buffer getReceiveBuffer() {
            return this.receiveBuffer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Headers getTrailers() {
            return this.trailers;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Source
        public long read(Buffer buffer, long j3) throws IOException {
            IOException errorException$okhttp;
            boolean z9;
            long j4;
            buffer.getClass();
            long j5 = 0;
            if (j3 < 0) {
                C2104o.m5291q(AbstractC0255e.m1018g(j3, "byteCount < 0: "));
                return 0L;
            }
            while (true) {
                Http2Stream http2Stream = Http2Stream.this;
                synchronized (http2Stream) {
                    http2Stream.getReadTimeout$okhttp().enter();
                    try {
                        if (http2Stream.getErrorCode$okhttp() == null || this.finished) {
                            errorException$okhttp = null;
                        } else {
                            errorException$okhttp = http2Stream.getErrorException$okhttp();
                            if (errorException$okhttp == null) {
                                ErrorCode errorCode$okhttp = http2Stream.getErrorCode$okhttp();
                                errorCode$okhttp.getClass();
                                errorException$okhttp = new StreamResetException(errorCode$okhttp);
                            }
                        }
                        if (this.closed) {
                            throw new IOException("stream closed");
                        }
                        z9 = false;
                        if (this.readBuffer.size() > j5) {
                            Buffer buffer2 = this.readBuffer;
                            j4 = buffer2.read(buffer, Math.min(j3, buffer2.size()));
                            http2Stream.setReadBytesTotal$okhttp(http2Stream.getReadBytesTotal() + j4);
                            long readBytesTotal = http2Stream.getReadBytesTotal() - http2Stream.getReadBytesAcknowledged();
                            if (errorException$okhttp == null && readBytesTotal >= http2Stream.getConnection().getOkHttpSettings().getInitialWindowSize() / 2) {
                                http2Stream.getConnection().writeWindowUpdateLater$okhttp(http2Stream.getId(), readBytesTotal);
                                http2Stream.setReadBytesAcknowledged$okhttp(http2Stream.getReadBytesTotal());
                            }
                        } else {
                            if (!this.finished && errorException$okhttp == null) {
                                http2Stream.waitForIo$okhttp();
                                z9 = true;
                            }
                            j4 = -1;
                        }
                        http2Stream.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                    } finally {
                    }
                }
                if (!z9) {
                    if (j4 != -1) {
                        return j4;
                    }
                    if (errorException$okhttp == null) {
                        return -1L;
                    }
                    throw errorException$okhttp;
                }
                j5 = 0;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void receive$okhttp(BufferedSource bufferedSource, long j3) throws EOFException {
            boolean z9;
            boolean z10;
            bufferedSource.getClass();
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                C2104o.m5284i(Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
                return;
            }
            long j4 = j3;
            while (j4 > 0) {
                synchronized (Http2Stream.this) {
                    z9 = this.finished;
                    z10 = this.readBuffer.size() + j4 > this.maxByteCount;
                }
                if (z10) {
                    bufferedSource.skip(j4);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z9) {
                    bufferedSource.skip(j4);
                    return;
                }
                long j5 = bufferedSource.read(this.receiveBuffer, j4);
                if (j5 == -1) {
                    C2104o.m5277a();
                    return;
                }
                j4 -= j5;
                Http2Stream http2Stream2 = Http2Stream.this;
                synchronized (http2Stream2) {
                    try {
                        if (this.closed) {
                            this.receiveBuffer.clear();
                        } else {
                            boolean z11 = this.readBuffer.size() == 0;
                            this.readBuffer.writeAll(this.receiveBuffer);
                            if (z11) {
                                http2Stream2.getClass();
                                http2Stream2.notifyAll();
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            updateConnectionFlowControl(j3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setClosed$okhttp(boolean z9) {
            this.closed = z9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setFinished$okhttp(boolean z9) {
            this.finished = z9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Source
        public Timeout timeout() {
            return Http2Stream.this.getReadTimeout$okhttp();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class StreamTimeout extends AsyncTimeout {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StreamTimeout() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.AsyncTimeout
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.AsyncTimeout
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Http2Stream(int i9, Http2Connection http2Connection, boolean z9, boolean z10, Headers headers) {
        http2Connection.getClass();
        this.f10231id = i9;
        this.connection = http2Connection;
        this.writeBytesMaximum = http2Connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(http2Connection.getOkHttpSettings().getInitialWindowSize(), z10);
        this.sink = new FramingSink(z9);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers == null) {
            if (isLocallyInitiated()) {
                return;
            }
            C2104o.m5276A("remotely-initiated streams should have headers");
            throw null;
        }
        if (isLocallyInitiated()) {
            C2104o.m5276A("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(headers);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean closeInternal(ErrorCode errorCode, IOException iOException) {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return false;
        }
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = iOException;
            notifyAll();
            if (this.source.getFinished$okhttp()) {
                if (this.sink.getFinished()) {
                    return false;
                }
            }
            this.connection.removeStream$okhttp(this.f10231id);
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addBytesToWriteWindow(long j3) {
        this.writeBytesMaximum += j3;
        if (j3 > 0) {
            notifyAll();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void cancelStreamIfNecessary$okhttp() {
        boolean z9;
        boolean zIsOpen;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return;
        }
        synchronized (this) {
            try {
                z9 = !this.source.getFinished$okhttp() && this.source.getClosed$okhttp() && (this.sink.getFinished() || this.sink.getClosed());
                zIsOpen = isOpen();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z9) {
            close(ErrorCode.CANCEL, null);
        } else {
            if (zIsOpen) {
                return;
            }
            this.connection.removeStream$okhttp(this.f10231id);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void checkOutNotClosed$okhttp() throws IOException {
        if (this.sink.getClosed()) {
            C2104o.m5299y("stream closed");
            return;
        }
        if (this.sink.getFinished()) {
            C2104o.m5299y("stream finished");
            return;
        }
        ErrorCode errorCode = this.errorCode;
        if (errorCode != null) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            errorCode.getClass();
            throw new StreamResetException(errorCode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void close(ErrorCode errorCode, IOException iOException) {
        errorCode.getClass();
        if (closeInternal(errorCode, iOException)) {
            this.connection.writeSynReset$okhttp(this.f10231id, errorCode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void closeLater(ErrorCode errorCode) {
        errorCode.getClass();
        if (closeInternal(errorCode, null)) {
            this.connection.writeSynResetLater$okhttp(this.f10231id, errorCode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void enqueueTrailers(Headers headers) {
        headers.getClass();
        synchronized (this) {
            if (this.sink.getFinished()) {
                throw new IllegalStateException("already finished");
            }
            if (headers.size() == 0) {
                throw new IllegalArgumentException("trailers.size() == 0");
            }
            this.sink.setTrailers(headers);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Http2Connection getConnection() {
        return this.connection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized ErrorCode getErrorCode$okhttp() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getId() {
        return this.f10231id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StreamTimeout getReadTimeout$okhttp() {
        return this.readTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Sink getSink() {
        synchronized (this) {
            if (!this.hasResponseHeaders && !isLocallyInitiated()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.sink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FramingSink getSink$okhttp() {
        return this.sink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Source getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FramingSource getSource$okhttp() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isLocallyInitiated() {
        return this.connection.getClient$okhttp() == ((this.f10231id & 1) == 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized boolean isOpen() {
        try {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.getFinished$okhttp() || this.source.getClosed$okhttp()) {
                if (this.sink.getFinished() || this.sink.getClosed()) {
                    if (this.hasResponseHeaders) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Timeout readTimeout() {
        return this.readTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void receiveData(BufferedSource bufferedSource, int i9) {
        bufferedSource.getClass();
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
        } else {
            this.source.receive$okhttp(bufferedSource, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void receiveHeaders(Headers headers, boolean z9) {
        boolean zIsOpen;
        headers.getClass();
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return;
        }
        synchronized (this) {
            try {
                if (this.hasResponseHeaders && z9) {
                    this.source.setTrailers(headers);
                } else {
                    this.hasResponseHeaders = true;
                    this.headersQueue.add(headers);
                }
                if (z9) {
                    this.source.setFinished$okhttp(true);
                }
                zIsOpen = isOpen();
                notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zIsOpen) {
            return;
        }
        this.connection.removeStream$okhttp(this.f10231id);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void receiveRstStream(ErrorCode errorCode) {
        errorCode.getClass();
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setErrorCode$okhttp(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setErrorException$okhttp(IOException iOException) {
        this.errorException = iOException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setReadBytesAcknowledged$okhttp(long j3) {
        this.readBytesAcknowledged = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setReadBytesTotal$okhttp(long j3) {
        this.readBytesTotal = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setWriteBytesMaximum$okhttp(long j3) {
        this.writeBytesMaximum = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setWriteBytesTotal$okhttp(long j3) {
        this.writeBytesTotal = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized Headers takeHeaders() {
        Headers headersRemoveFirst;
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                waitForIo$okhttp();
            } catch (Throwable th2) {
                this.readTimeout.exitAndThrowIfTimedOut();
                throw th2;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (this.headersQueue.isEmpty()) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            errorCode.getClass();
            throw new StreamResetException(errorCode);
        }
        headersRemoveFirst = this.headersQueue.removeFirst();
        headersRemoveFirst.getClass();
        return headersRemoveFirst;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized Headers trailers() throws IOException {
        Headers trailers;
        if (!this.source.getFinished$okhttp() || !this.source.getReceiveBuffer().exhausted() || !this.source.getReadBuffer().exhausted()) {
            ErrorCode errorCode = this.errorCode;
            if (errorCode == null) {
                throw new IllegalStateException("too early; can't read the trailers yet");
            }
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            errorCode.getClass();
            throw new StreamResetException(errorCode);
        }
        trailers = this.source.getTrailers();
        if (trailers == null) {
            trailers = Util.EMPTY_HEADERS;
        }
        return trailers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeHeaders(List<Header> list, boolean z9, boolean z10) {
        boolean z11;
        list.getClass();
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return;
        }
        synchronized (this) {
            this.hasResponseHeaders = true;
            if (z9) {
                this.sink.setFinished(true);
            }
        }
        if (!z10) {
            synchronized (this.connection) {
                z11 = this.connection.getWriteBytesTotal() >= this.connection.getWriteBytesMaximum();
            }
            z10 = z11;
        }
        this.connection.writeHeaders$okhttp(this.f10231id, z9, list);
        if (z10) {
            this.connection.flush();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Timeout writeTimeout() {
        return this.writeTimeout;
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.http2.Http2Stream.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class FramingSink implements Sink {
        private boolean closed;
        private boolean finished;
        private final Buffer sendBuffer;
        private Headers trailers;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public FramingSink(boolean z9) {
            this.finished = z9;
            this.sendBuffer = new Buffer();
        }

        /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, INVOKE, INVOKE, INVOKE] complete} */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Incorrect finally slice size: {[INVOKE, INVOKE, INVOKE, INVOKE, INVOKE, INVOKE, INVOKE, ARITH, IGET, INVOKE, INVOKE, INVOKE, ARITH, INVOKE] complete}, expected: {[INVOKE, INVOKE, INVOKE, INVOKE] complete} */
        /* JADX WARN: Finally extract failed */
        private final void emitFrame(boolean z9) throws IOException {
            long jMin;
            boolean z10;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.getWriteTimeout$okhttp().enter();
                while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !this.finished && !this.closed && http2Stream.getErrorCode$okhttp() == null) {
                    try {
                        http2Stream.waitForIo$okhttp();
                    } catch (Throwable th2) {
                        http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                        throw th2;
                    }
                }
                http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                http2Stream.checkOutNotClosed$okhttp();
                jMin = Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.sendBuffer.size());
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + jMin);
                z10 = z9 && jMin == this.sendBuffer.size();
            }
            Http2Stream.this.getWriteTimeout$okhttp().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z10, this.sendBuffer, jMin);
            } finally {
                Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                C2104o.m5284i(Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
                return;
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                if (this.closed) {
                    return;
                }
                boolean z9 = http2Stream2.getErrorCode$okhttp() == null;
                if (!Http2Stream.this.getSink$okhttp().finished) {
                    boolean z10 = this.sendBuffer.size() > 0;
                    if (this.trailers != null) {
                        while (this.sendBuffer.size() > 0) {
                            emitFrame(false);
                        }
                        Http2Connection connection = Http2Stream.this.getConnection();
                        int id2 = Http2Stream.this.getId();
                        Headers headers = this.trailers;
                        headers.getClass();
                        connection.writeHeaders$okhttp(id2, z9, Util.toHeaderList(headers));
                    } else if (z10) {
                        while (this.sendBuffer.size() > 0) {
                            emitFrame(true);
                        }
                    } else if (z9) {
                        Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.closed = true;
                }
                Http2Stream.this.getConnection().flush();
                Http2Stream.this.cancelStreamIfNecessary$okhttp();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                C2104o.m5284i(Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
                return;
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                http2Stream2.checkOutNotClosed$okhttp();
            }
            while (this.sendBuffer.size() > 0) {
                emitFrame(false);
                Http2Stream.this.getConnection().flush();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean getClosed() {
            return this.closed;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean getFinished() {
            return this.finished;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Headers getTrailers() {
            return this.trailers;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setClosed(boolean z9) {
            this.closed = z9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setFinished(boolean z9) {
            this.finished = z9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Sink
        public Timeout timeout() {
            return Http2Stream.this.getWriteTimeout$okhttp();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Sink
        public void write(Buffer buffer, long j3) throws IOException {
            buffer.getClass();
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                C2104o.m5284i(Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
                return;
            }
            this.sendBuffer.write(buffer, j3);
            while (this.sendBuffer.size() >= Http2Stream.EMIT_BUFFER_SIZE) {
                emitFrame(false);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 okhttp3.internal.http2.Http2Stream)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(okhttp3.internal.http2.Http2Stream, boolean):void (m)] (LINE:16) call: okhttp3.internal.http2.Http2Stream.FramingSink.<init>(okhttp3.internal.http2.Http2Stream, boolean):void type: THIS */
        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z9, int i9, AbstractC1411g abstractC1411g) {
            this((i9 & 1) != 0 ? false : z9);
        }
    }
}
