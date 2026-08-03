package okio;

import java.io.Closeable;
import java.io.EOFException;
import java.util.concurrent.locks.ReentrantLock;
import p025bc.AbstractC0255e;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FileHandle implements Closeable {
    private boolean closed;
    private final ReentrantLock lock = _JvmPlatformKt.newLock();
    private int openStreamCount;
    private final boolean readWrite;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class FileHandleSink implements Sink {
        private boolean closed;
        private final FileHandle fileHandle;
        private long position;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public FileHandleSink(FileHandle fileHandle, long j3) {
            fileHandle.getClass();
            this.fileHandle = fileHandle;
            this.position = j3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            ReentrantLock lock = this.fileHandle.getLock();
            lock.lock();
            try {
                FileHandle fileHandle = this.fileHandle;
                fileHandle.openStreamCount--;
                if (this.fileHandle.openStreamCount == 0) {
                    if (this.fileHandle.closed) {
                        lock.unlock();
                        this.fileHandle.protectedClose();
                    }
                }
            } finally {
                lock.unlock();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            if (this.closed) {
                C2104o.m5276A("closed");
            } else {
                this.fileHandle.protectedFlush();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean getClosed() {
            return this.closed;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final FileHandle getFileHandle() {
            return this.fileHandle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long getPosition() {
            return this.position;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setClosed(boolean z9) {
            this.closed = z9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setPosition(long j3) {
            this.position = j3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Sink
        public Timeout timeout() {
            return Timeout.NONE;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Sink
        public void write(Buffer buffer, long j3) {
            buffer.getClass();
            if (this.closed) {
                C2104o.m5276A("closed");
            } else {
                this.fileHandle.writeNoCloseCheck(this.position, buffer, j3);
                this.position += j3;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class FileHandleSource implements Source {
        private boolean closed;
        private final FileHandle fileHandle;
        private long position;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public FileHandleSource(FileHandle fileHandle, long j3) {
            fileHandle.getClass();
            this.fileHandle = fileHandle;
            this.position = j3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            ReentrantLock lock = this.fileHandle.getLock();
            lock.lock();
            try {
                FileHandle fileHandle = this.fileHandle;
                fileHandle.openStreamCount--;
                if (this.fileHandle.openStreamCount == 0) {
                    if (this.fileHandle.closed) {
                        lock.unlock();
                        this.fileHandle.protectedClose();
                    }
                }
            } finally {
                lock.unlock();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean getClosed() {
            return this.closed;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final FileHandle getFileHandle() {
            return this.fileHandle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long getPosition() {
            return this.position;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Source
        public long read(Buffer buffer, long j3) {
            buffer.getClass();
            if (this.closed) {
                C2104o.m5276A("closed");
                return 0L;
            }
            long noCloseCheck = this.fileHandle.readNoCloseCheck(this.position, buffer, j3);
            if (noCloseCheck != -1) {
                this.position += noCloseCheck;
            }
            return noCloseCheck;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setClosed(boolean z9) {
            this.closed = z9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setPosition(long j3) {
            this.position = j3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Source
        public Timeout timeout() {
            return Timeout.NONE;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FileHandle(boolean z9) {
        this.readWrite = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final long readNoCloseCheck(long j3, Buffer buffer, long j4) {
        if (j4 < 0) {
            C2104o.m5291q(AbstractC0255e.m1018g(j4, "byteCount < 0: "));
            return 0L;
        }
        long j5 = j4 + j3;
        long j10 = j3;
        while (true) {
            if (j10 >= j5) {
                break;
            }
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            int iProtectedRead = protectedRead(j10, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(j5 - j10, 8192 - r7));
            if (iProtectedRead == -1) {
                if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
                    buffer.head = segmentWritableSegment$okio.pop();
                    SegmentPool.recycle(segmentWritableSegment$okio);
                }
                if (j3 == j10) {
                    return -1L;
                }
            } else {
                segmentWritableSegment$okio.limit += iProtectedRead;
                long j11 = iProtectedRead;
                j10 += j11;
                buffer.setSize$okio(buffer.size() + j11);
            }
        }
        return j10 - j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Sink sink$default(FileHandle fileHandle, long j3, int i9, Object obj) {
        if (obj != null) {
            C2104o.m5297w("Super calls with default arguments not supported in this target, function: sink");
            return null;
        }
        if ((i9 & 1) != 0) {
            j3 = 0;
        }
        return fileHandle.sink(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Source source$default(FileHandle fileHandle, long j3, int i9, Object obj) {
        if (obj != null) {
            C2104o.m5297w("Super calls with default arguments not supported in this target, function: source");
            return null;
        }
        if ((i9 & 1) != 0) {
            j3 = 0;
        }
        return fileHandle.source(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final void writeNoCloseCheck(long j3, Buffer buffer, long j4) {
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, j4);
        long j5 = j3 + j4;
        long j10 = j3;
        while (j10 < j5) {
            Segment segment = buffer.head;
            segment.getClass();
            int iMin = (int) Math.min(j5 - j10, segment.limit - segment.pos);
            protectedWrite(j10, segment.data, segment.pos, iMin);
            segment.pos += iMin;
            long j11 = iMin;
            j10 += j11;
            buffer.setSize$okio(buffer.size() - j11);
            if (segment.pos == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Sink appendingSink() {
        return sink(size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                return;
            }
            this.closed = true;
            if (this.openStreamCount != 0) {
                return;
            }
            reentrantLock.unlock();
            protectedClose();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void flush() {
        if (!this.readWrite) {
            C2104o.m5276A("file handle is read-only");
            return;
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            protectedFlush();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ReentrantLock getLock() {
        return this.lock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getReadWrite() {
        return this.readWrite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long position(Source source) {
        long size;
        source.getClass();
        if (source instanceof RealBufferedSource) {
            RealBufferedSource realBufferedSource = (RealBufferedSource) source;
            size = realBufferedSource.bufferField.size();
            source = realBufferedSource.source;
        } else {
            size = 0;
        }
        if (!(source instanceof FileHandleSource) || ((FileHandleSource) source).getFileHandle() != this) {
            C2104o.m5294t("source was not created by this FileHandle");
            return 0L;
        }
        FileHandleSource fileHandleSource = (FileHandleSource) source;
        if (!fileHandleSource.getClosed()) {
            return fileHandleSource.getPosition() - size;
        }
        C2104o.m5276A("closed");
        return 0L;
    }

    public abstract void protectedClose();

    public abstract void protectedFlush();

    public abstract int protectedRead(long j3, byte[] bArr, int i9, int i10);

    public abstract void protectedResize(long j3);

    public abstract long protectedSize();

    public abstract void protectedWrite(long j3, byte[] bArr, int i9, int i10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int read(long j3, byte[] bArr, int i9, int i10) {
        bArr.getClass();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            return protectedRead(j3, bArr, i9, i10);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void reposition(Source source, long j3) throws EOFException {
        source.getClass();
        if (!(source instanceof RealBufferedSource)) {
            if (!(source instanceof FileHandleSource) || ((FileHandleSource) source).getFileHandle() != this) {
                C2104o.m5294t("source was not created by this FileHandle");
                return;
            }
            FileHandleSource fileHandleSource = (FileHandleSource) source;
            if (fileHandleSource.getClosed()) {
                C2104o.m5276A("closed");
                return;
            } else {
                fileHandleSource.setPosition(j3);
                return;
            }
        }
        RealBufferedSource realBufferedSource = (RealBufferedSource) source;
        Source source2 = realBufferedSource.source;
        if (!(source2 instanceof FileHandleSource) || ((FileHandleSource) source2).getFileHandle() != this) {
            C2104o.m5294t("source was not created by this FileHandle");
            return;
        }
        FileHandleSource fileHandleSource2 = (FileHandleSource) source2;
        if (fileHandleSource2.getClosed()) {
            C2104o.m5276A("closed");
            return;
        }
        long size = realBufferedSource.bufferField.size();
        long position = j3 - (fileHandleSource2.getPosition() - size);
        if (0 <= position && position < size) {
            realBufferedSource.skip(position);
        } else {
            realBufferedSource.bufferField.clear();
            fileHandleSource2.setPosition(j3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void resize(long j3) {
        if (!this.readWrite) {
            C2104o.m5276A("file handle is read-only");
            return;
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            protectedResize(j3);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Sink sink(long j3) {
        if (!this.readWrite) {
            C2104o.m5276A("file handle is read-only");
            return null;
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            this.openStreamCount++;
            reentrantLock.unlock();
            return new FileHandleSink(this, j3);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long size() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            return protectedSize();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Source source(long j3) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            this.openStreamCount++;
            reentrantLock.unlock();
            return new FileHandleSource(this, j3);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void write(long j3, byte[] bArr, int i9, int i10) {
        bArr.getClass();
        if (!this.readWrite) {
            C2104o.m5276A("file handle is read-only");
            return;
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            protectedWrite(j3, bArr, i9, i10);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long read(long j3, Buffer buffer, long j4) {
        buffer.getClass();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!this.closed) {
                reentrantLock.unlock();
                return readNoCloseCheck(j3, buffer, j4);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void write(long j3, Buffer buffer, long j4) {
        buffer.getClass();
        if (this.readWrite) {
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (!this.closed) {
                    reentrantLock.unlock();
                    writeNoCloseCheck(j3, buffer, j4);
                    return;
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        C2104o.m5276A("file handle is read-only");
    }

    public final long position(Sink sink) {
        long size;
        sink.getClass();
        if (sink instanceof RealBufferedSink) {
            RealBufferedSink realBufferedSink = (RealBufferedSink) sink;
            size = realBufferedSink.bufferField.size();
            sink = realBufferedSink.sink;
        } else {
            size = 0;
        }
        if ((sink instanceof FileHandleSink) && ((FileHandleSink) sink).getFileHandle() == this) {
            FileHandleSink fileHandleSink = (FileHandleSink) sink;
            if (!fileHandleSink.getClosed()) {
                return fileHandleSink.getPosition() + size;
            }
            C2104o.m5276A("closed");
            return 0L;
        }
        C2104o.m5294t("sink was not created by this FileHandle");
        return 0L;
    }

    public final void reposition(Sink sink, long j3) {
        sink.getClass();
        if (sink instanceof RealBufferedSink) {
            RealBufferedSink realBufferedSink = (RealBufferedSink) sink;
            Sink sink2 = realBufferedSink.sink;
            if ((sink2 instanceof FileHandleSink) && ((FileHandleSink) sink2).getFileHandle() == this) {
                FileHandleSink fileHandleSink = (FileHandleSink) sink2;
                if (!fileHandleSink.getClosed()) {
                    realBufferedSink.emit();
                    fileHandleSink.setPosition(j3);
                    return;
                } else {
                    C2104o.m5276A("closed");
                    return;
                }
            }
            C2104o.m5294t("sink was not created by this FileHandle");
            return;
        }
        if ((sink instanceof FileHandleSink) && ((FileHandleSink) sink).getFileHandle() == this) {
            FileHandleSink fileHandleSink2 = (FileHandleSink) sink;
            if (!fileHandleSink2.getClosed()) {
                fileHandleSink2.setPosition(j3);
                return;
            } else {
                C2104o.m5276A("closed");
                return;
            }
        }
        C2104o.m5294t("sink was not created by this FileHandle");
    }
}
