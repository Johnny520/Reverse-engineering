package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FileHandle implements java.io.Closeable {
    private boolean closed;
    private final java.util.concurrent.locks.ReentrantLock lock;
    private int openStreamCount;
    private final boolean readWrite;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class FileHandleSink implements okio.Sink {
        private boolean closed;
        private final okio.FileHandle fileHandle;
        private long position;

        public FileHandleSink(okio.FileHandle r1, long r2) {
                r0 = this;
                r1.getClass()
                r0.<init>()
                r0.fileHandle = r1
                r0.position = r2
                return
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r3 = this;
                boolean r0 = r3.closed
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r3.closed = r0
                okio.FileHandle r0 = r3.fileHandle
                java.util.concurrent.locks.ReentrantLock r0 = r0.getLock()
                r0.lock()
                okio.FileHandle r1 = r3.fileHandle     // Catch: java.lang.Throwable -> L36
                int r2 = okio.FileHandle.access$getOpenStreamCount$p(r1)     // Catch: java.lang.Throwable -> L36
                int r2 = r2 + (-1)
                okio.FileHandle.access$setOpenStreamCount$p(r1, r2)     // Catch: java.lang.Throwable -> L36
                okio.FileHandle r1 = r3.fileHandle     // Catch: java.lang.Throwable -> L36
                int r1 = okio.FileHandle.access$getOpenStreamCount$p(r1)     // Catch: java.lang.Throwable -> L36
                if (r1 != 0) goto L38
                okio.FileHandle r1 = r3.fileHandle     // Catch: java.lang.Throwable -> L36
                boolean r1 = okio.FileHandle.access$getClosed$p(r1)     // Catch: java.lang.Throwable -> L36
                if (r1 != 0) goto L2d
                goto L38
            L2d:
                r0.unlock()
                okio.FileHandle r0 = r3.fileHandle
                r0.protectedClose()
                return
            L36:
                r1 = move-exception
                goto L3c
            L38:
                r0.unlock()
                return
            L3c:
                r0.unlock()
                throw r1
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
                r1 = this;
                boolean r0 = r1.closed
                if (r0 != 0) goto La
                okio.FileHandle r0 = r1.fileHandle
                r0.protectedFlush()
                return
            La:
                java.lang.String r0 = "closed"
                j8.o.A(r0)
                return
        }

        public final boolean getClosed() {
                r1 = this;
                boolean r0 = r1.closed
                return r0
        }

        public final okio.FileHandle getFileHandle() {
                r1 = this;
                okio.FileHandle r0 = r1.fileHandle
                return r0
        }

        public final long getPosition() {
                r2 = this;
                long r0 = r2.position
                return r0
        }

        public final void setClosed(boolean r1) {
                r0 = this;
                r0.closed = r1
                return
        }

        public final void setPosition(long r1) {
                r0 = this;
                r0.position = r1
                return
        }

        @Override // okio.Sink
        public okio.Timeout timeout() {
                r1 = this;
                okio.Timeout r0 = okio.Timeout.NONE
                return r0
        }

        @Override // okio.Sink
        public void write(okio.Buffer r8, long r9) {
                r7 = this;
                r8.getClass()
                boolean r0 = r7.closed
                if (r0 != 0) goto L16
                okio.FileHandle r1 = r7.fileHandle
                long r2 = r7.position
                r4 = r8
                r5 = r9
                okio.FileHandle.access$writeNoCloseCheck(r1, r2, r4, r5)
                long r8 = r7.position
                long r8 = r8 + r5
                r7.position = r8
                return
            L16:
                java.lang.String r8 = "closed"
                j8.o.A(r8)
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class FileHandleSource implements okio.Source {
        private boolean closed;
        private final okio.FileHandle fileHandle;
        private long position;

        public FileHandleSource(okio.FileHandle r1, long r2) {
                r0 = this;
                r1.getClass()
                r0.<init>()
                r0.fileHandle = r1
                r0.position = r2
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r3 = this;
                boolean r0 = r3.closed
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r3.closed = r0
                okio.FileHandle r0 = r3.fileHandle
                java.util.concurrent.locks.ReentrantLock r0 = r0.getLock()
                r0.lock()
                okio.FileHandle r1 = r3.fileHandle     // Catch: java.lang.Throwable -> L36
                int r2 = okio.FileHandle.access$getOpenStreamCount$p(r1)     // Catch: java.lang.Throwable -> L36
                int r2 = r2 + (-1)
                okio.FileHandle.access$setOpenStreamCount$p(r1, r2)     // Catch: java.lang.Throwable -> L36
                okio.FileHandle r1 = r3.fileHandle     // Catch: java.lang.Throwable -> L36
                int r1 = okio.FileHandle.access$getOpenStreamCount$p(r1)     // Catch: java.lang.Throwable -> L36
                if (r1 != 0) goto L38
                okio.FileHandle r1 = r3.fileHandle     // Catch: java.lang.Throwable -> L36
                boolean r1 = okio.FileHandle.access$getClosed$p(r1)     // Catch: java.lang.Throwable -> L36
                if (r1 != 0) goto L2d
                goto L38
            L2d:
                r0.unlock()
                okio.FileHandle r0 = r3.fileHandle
                r0.protectedClose()
                return
            L36:
                r1 = move-exception
                goto L3c
            L38:
                r0.unlock()
                return
            L3c:
                r0.unlock()
                throw r1
        }

        public final boolean getClosed() {
                r1 = this;
                boolean r0 = r1.closed
                return r0
        }

        public final okio.FileHandle getFileHandle() {
                r1 = this;
                okio.FileHandle r0 = r1.fileHandle
                return r0
        }

        public final long getPosition() {
                r2 = this;
                long r0 = r2.position
                return r0
        }

        @Override // okio.Source
        public long read(okio.Buffer r8, long r9) {
                r7 = this;
                r8.getClass()
                boolean r0 = r7.closed
                if (r0 != 0) goto L1d
                okio.FileHandle r1 = r7.fileHandle
                long r2 = r7.position
                r4 = r8
                r5 = r9
                long r8 = okio.FileHandle.access$readNoCloseCheck(r1, r2, r4, r5)
                r0 = -1
                int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r10 == 0) goto L1c
                long r0 = r7.position
                long r0 = r0 + r8
                r7.position = r0
            L1c:
                return r8
            L1d:
                java.lang.String r8 = "closed"
                j8.o.A(r8)
                r8 = 0
                return r8
        }

        public final void setClosed(boolean r1) {
                r0 = this;
                r0.closed = r1
                return
        }

        public final void setPosition(long r1) {
                r0 = this;
                r0.position = r1
                return
        }

        @Override // okio.Source
        public okio.Timeout timeout() {
                r1 = this;
                okio.Timeout r0 = okio.Timeout.NONE
                return r0
        }
    }

    public FileHandle(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.readWrite = r1
            java.util.concurrent.locks.ReentrantLock r1 = okio._JvmPlatformKt.newLock()
            r0.lock = r1
            return
    }

    public static final /* synthetic */ boolean access$getClosed$p(okio.FileHandle r0) {
            boolean r0 = r0.closed
            return r0
    }

    public static final /* synthetic */ int access$getOpenStreamCount$p(okio.FileHandle r0) {
            int r0 = r0.openStreamCount
            return r0
    }

    public static final /* synthetic */ long access$readNoCloseCheck(okio.FileHandle r0, long r1, okio.Buffer r3, long r4) {
            long r0 = r0.readNoCloseCheck(r1, r3, r4)
            return r0
    }

    public static final /* synthetic */ void access$setOpenStreamCount$p(okio.FileHandle r0, int r1) {
            r0.openStreamCount = r1
            return
    }

    public static final /* synthetic */ void access$writeNoCloseCheck(okio.FileHandle r0, long r1, okio.Buffer r3, long r4) {
            r0.writeNoCloseCheck(r1, r3, r4)
            return
    }

    private final long readNoCloseCheck(long r15, okio.Buffer r17, long r18) {
            r14 = this;
            r0 = r17
            r1 = r18
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L53
            long r1 = r1 + r15
            r4 = r15
        Lc:
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 >= 0) goto L51
            r3 = 1
            okio.Segment r9 = r0.writableSegment$okio(r3)
            byte[] r6 = r9.data
            int r7 = r9.limit
            long r10 = r1 - r4
            int r3 = 8192 - r7
            long r12 = (long) r3
            long r10 = java.lang.Math.min(r10, r12)
            int r8 = (int) r10
            r3 = r14
            int r6 = r3.protectedRead(r4, r6, r7, r8)
            r3 = -1
            if (r6 != r3) goto L41
            int r1 = r9.pos
            int r2 = r9.limit
            if (r1 != r2) goto L3a
            okio.Segment r1 = r9.pop()
            r0.head = r1
            okio.SegmentPool.recycle(r9)
        L3a:
            int r0 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r0 != 0) goto L51
            r0 = -1
            return r0
        L41:
            int r3 = r9.limit
            int r3 = r3 + r6
            r9.limit = r3
            long r6 = (long) r6
            long r4 = r4 + r6
            long r8 = r0.size()
            long r8 = r8 + r6
            r0.setSize$okio(r8)
            goto Lc
        L51:
            long r4 = r4 - r15
            return r4
        L53:
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r0 = bc.e.g(r1, r0)
            j8.o.q(r0)
            r0 = 0
            return r0
    }

    public static /* synthetic */ okio.Sink sink$default(okio.FileHandle r0, long r1, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Ld
            r3 = r3 & 1
            if (r3 == 0) goto L8
            r1 = 0
        L8:
            okio.Sink r0 = r0.sink(r1)
            return r0
        Ld:
            java.lang.String r0 = "Super calls with default arguments not supported in this target, function: sink"
            j8.o.w(r0)
            r0 = 0
            return r0
    }

    public static /* synthetic */ okio.Source source$default(okio.FileHandle r0, long r1, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Ld
            r3 = r3 & 1
            if (r3 == 0) goto L8
            r1 = 0
        L8:
            okio.Source r0 = r0.source(r1)
            return r0
        Ld:
            java.lang.String r0 = "Super calls with default arguments not supported in this target, function: source"
            j8.o.w(r0)
            r0 = 0
            return r0
    }

    private final void writeNoCloseCheck(long r8, okio.Buffer r10, long r11) {
            r7 = this;
            long r0 = r10.size()
            r2 = 0
            r4 = r11
            okio.SegmentedByteString.checkOffsetAndCount(r0, r2, r4)
            long r11 = r8 + r4
            r1 = r8
        Ld:
            int r8 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r8 >= 0) goto L4a
            okio.Segment r8 = r10.head
            r8.getClass()
            long r3 = r11 - r1
            int r9 = r8.limit
            int r0 = r8.pos
            int r9 = r9 - r0
            long r5 = (long) r9
            long r3 = java.lang.Math.min(r3, r5)
            int r5 = (int) r3
            byte[] r3 = r8.data
            int r4 = r8.pos
            r0 = r7
            r0.protectedWrite(r1, r3, r4, r5)
            int r9 = r8.pos
            int r9 = r9 + r5
            r8.pos = r9
            long r3 = (long) r5
            long r1 = r1 + r3
            long r5 = r10.size()
            long r5 = r5 - r3
            r10.setSize$okio(r5)
            int r9 = r8.pos
            int r0 = r8.limit
            if (r9 != r0) goto Ld
            okio.Segment r9 = r8.pop()
            r10.head = r9
            okio.SegmentPool.recycle(r8)
            goto Ld
        L4a:
            return
    }

    public final okio.Sink appendingSink() {
            r2 = this;
            long r0 = r2.size()
            okio.Sink r0 = r2.sink(r0)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.lock()
            boolean r1 = r2.closed     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto Ld
            r0.unlock()
            return
        Ld:
            r1 = 1
            r2.closed = r1     // Catch: java.lang.Throwable -> L1f
            int r1 = r2.openStreamCount     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L18
            r0.unlock()
            return
        L18:
            r0.unlock()
            r2.protectedClose()
            return
        L1f:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public final void flush() {
            r3 = this;
            boolean r0 = r3.readWrite
            if (r0 == 0) goto L21
            java.util.concurrent.locks.ReentrantLock r0 = r3.lock
            r0.lock()
            boolean r1 = r3.closed     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L14
            r0.unlock()
            r3.protectedFlush()
            return
        L14:
            java.lang.String r1 = "closed"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            throw r2     // Catch: java.lang.Throwable -> L1c
        L1c:
            r1 = move-exception
            r0.unlock()
            throw r1
        L21:
            java.lang.String r0 = "file handle is read-only"
            j8.o.A(r0)
            return
    }

    public final java.util.concurrent.locks.ReentrantLock getLock() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            return r0
    }

    public final boolean getReadWrite() {
            r1 = this;
            boolean r0 = r1.readWrite
            return r0
    }

    public final long position(okio.Sink r5) {
            r4 = this;
            r5.getClass()
            boolean r0 = r5 instanceof okio.RealBufferedSink
            if (r0 == 0) goto L12
            okio.RealBufferedSink r5 = (okio.RealBufferedSink) r5
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            okio.Sink r5 = r5.sink
            goto L14
        L12:
            r0 = 0
        L14:
            boolean r2 = r5 instanceof okio.FileHandle.FileHandleSink
            if (r2 == 0) goto L37
            r2 = r5
            okio.FileHandle$FileHandleSink r2 = (okio.FileHandle.FileHandleSink) r2
            okio.FileHandle r2 = r2.getFileHandle()
            if (r2 != r4) goto L37
            okio.FileHandle$FileHandleSink r5 = (okio.FileHandle.FileHandleSink) r5
            boolean r2 = r5.getClosed()
            if (r2 != 0) goto L2f
            long r2 = r5.getPosition()
            long r2 = r2 + r0
            return r2
        L2f:
            java.lang.String r5 = "closed"
            j8.o.A(r5)
        L34:
            r0 = 0
            return r0
        L37:
            java.lang.String r5 = "sink was not created by this FileHandle"
            j8.o.t(r5)
            goto L34
    }

    public final long position(okio.Source r5) {
            r4 = this;
            r5.getClass()
            boolean r0 = r5 instanceof okio.RealBufferedSource
            if (r0 == 0) goto L12
            okio.RealBufferedSource r5 = (okio.RealBufferedSource) r5
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            okio.Source r5 = r5.source
            goto L14
        L12:
            r0 = 0
        L14:
            boolean r2 = r5 instanceof okio.FileHandle.FileHandleSource
            if (r2 == 0) goto L37
            r2 = r5
            okio.FileHandle$FileHandleSource r2 = (okio.FileHandle.FileHandleSource) r2
            okio.FileHandle r2 = r2.getFileHandle()
            if (r2 != r4) goto L37
            okio.FileHandle$FileHandleSource r5 = (okio.FileHandle.FileHandleSource) r5
            boolean r2 = r5.getClosed()
            if (r2 != 0) goto L2f
            long r2 = r5.getPosition()
            long r2 = r2 - r0
            return r2
        L2f:
            java.lang.String r5 = "closed"
            j8.o.A(r5)
        L34:
            r0 = 0
            return r0
        L37:
            java.lang.String r5 = "source was not created by this FileHandle"
            j8.o.t(r5)
            goto L34
    }

    public abstract void protectedClose();

    public abstract void protectedFlush();

    public abstract int protectedRead(long r1, byte[] r3, int r4, int r5);

    public abstract void protectedResize(long r1);

    public abstract long protectedSize();

    public abstract void protectedWrite(long r1, byte[] r3, int r4, int r5);

    public final int read(long r3, byte[] r5, int r6, int r7) {
            r2 = this;
            r5.getClass()
            java.util.concurrent.locks.ReentrantLock r1 = r2.lock
            r1.lock()
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L14
            r1.unlock()
            int r3 = r2.protectedRead(r3, r5, r6, r7)
            return r3
        L14:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L1c:
            r0 = move-exception
            r3 = r0
            r1.unlock()
            throw r3
    }

    public final long read(long r3, okio.Buffer r5, long r6) {
            r2 = this;
            r5.getClass()
            java.util.concurrent.locks.ReentrantLock r1 = r2.lock
            r1.lock()
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L14
            r1.unlock()
            long r3 = r2.readNoCloseCheck(r3, r5, r6)
            return r3
        L14:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L1c:
            r0 = move-exception
            r3 = r0
            r1.unlock()
            throw r3
    }

    public final void reposition(okio.Sink r5, long r6) {
            r4 = this;
            r5.getClass()
            boolean r0 = r5 instanceof okio.RealBufferedSink
            java.lang.String r1 = "closed"
            java.lang.String r2 = "sink was not created by this FileHandle"
            if (r0 == 0) goto L33
            okio.RealBufferedSink r5 = (okio.RealBufferedSink) r5
            okio.Sink r0 = r5.sink
            boolean r3 = r0 instanceof okio.FileHandle.FileHandleSink
            if (r3 == 0) goto L2f
            r3 = r0
            okio.FileHandle$FileHandleSink r3 = (okio.FileHandle.FileHandleSink) r3
            okio.FileHandle r3 = r3.getFileHandle()
            if (r3 != r4) goto L2f
            okio.FileHandle$FileHandleSink r0 = (okio.FileHandle.FileHandleSink) r0
            boolean r2 = r0.getClosed()
            if (r2 != 0) goto L2b
            r5.emit()
            r0.setPosition(r6)
            return
        L2b:
            j8.o.A(r1)
            return
        L2f:
            j8.o.t(r2)
            return
        L33:
            boolean r0 = r5 instanceof okio.FileHandle.FileHandleSink
            if (r0 == 0) goto L50
            r0 = r5
            okio.FileHandle$FileHandleSink r0 = (okio.FileHandle.FileHandleSink) r0
            okio.FileHandle r0 = r0.getFileHandle()
            if (r0 != r4) goto L50
            okio.FileHandle$FileHandleSink r5 = (okio.FileHandle.FileHandleSink) r5
            boolean r0 = r5.getClosed()
            if (r0 != 0) goto L4c
            r5.setPosition(r6)
            return
        L4c:
            j8.o.A(r1)
            return
        L50:
            j8.o.t(r2)
            return
    }

    public final void reposition(okio.Source r8, long r9) {
            r7 = this;
            r8.getClass()
            boolean r0 = r8 instanceof okio.RealBufferedSource
            java.lang.String r1 = "closed"
            java.lang.String r2 = "source was not created by this FileHandle"
            if (r0 == 0) goto L50
            okio.RealBufferedSource r8 = (okio.RealBufferedSource) r8
            okio.Source r0 = r8.source
            boolean r3 = r0 instanceof okio.FileHandle.FileHandleSource
            if (r3 == 0) goto L4c
            r3 = r0
            okio.FileHandle$FileHandleSource r3 = (okio.FileHandle.FileHandleSource) r3
            okio.FileHandle r3 = r3.getFileHandle()
            if (r3 != r7) goto L4c
            okio.FileHandle$FileHandleSource r0 = (okio.FileHandle.FileHandleSource) r0
            boolean r2 = r0.getClosed()
            if (r2 != 0) goto L48
            okio.Buffer r1 = r8.bufferField
            long r1 = r1.size()
            long r3 = r0.getPosition()
            long r3 = r3 - r1
            long r3 = r9 - r3
            r5 = 0
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 > 0) goto L3f
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L3f
            r8.skip(r3)
            return
        L3f:
            okio.Buffer r8 = r8.bufferField
            r8.clear()
            r0.setPosition(r9)
            return
        L48:
            j8.o.A(r1)
            return
        L4c:
            j8.o.t(r2)
            return
        L50:
            boolean r0 = r8 instanceof okio.FileHandle.FileHandleSource
            if (r0 == 0) goto L6d
            r0 = r8
            okio.FileHandle$FileHandleSource r0 = (okio.FileHandle.FileHandleSource) r0
            okio.FileHandle r0 = r0.getFileHandle()
            if (r0 != r7) goto L6d
            okio.FileHandle$FileHandleSource r8 = (okio.FileHandle.FileHandleSource) r8
            boolean r0 = r8.getClosed()
            if (r0 != 0) goto L69
            r8.setPosition(r9)
            return
        L69:
            j8.o.A(r1)
            return
        L6d:
            j8.o.t(r2)
            return
    }

    public final void resize(long r3) {
            r2 = this;
            boolean r0 = r2.readWrite
            if (r0 == 0) goto L21
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.lock()
            boolean r1 = r2.closed     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L14
            r0.unlock()
            r2.protectedResize(r3)
            return
        L14:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r0.unlock()
            throw r3
        L21:
            java.lang.String r3 = "file handle is read-only"
            j8.o.A(r3)
            return
    }

    public final okio.Sink sink(long r3) {
            r2 = this;
            boolean r0 = r2.readWrite
            if (r0 == 0) goto L2a
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.lock()
            boolean r1 = r2.closed     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            int r1 = r2.openStreamCount     // Catch: java.lang.Throwable -> L1c
            int r1 = r1 + 1
            r2.openStreamCount = r1     // Catch: java.lang.Throwable -> L1c
            r0.unlock()
            okio.FileHandle$FileHandleSink r0 = new okio.FileHandle$FileHandleSink
            r0.<init>(r2, r3)
            return r0
        L1c:
            r3 = move-exception
            goto L26
        L1e:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L26:
            r0.unlock()
            throw r3
        L2a:
            java.lang.String r3 = "file handle is read-only"
            j8.o.A(r3)
            r3 = 0
            return r3
    }

    public final long size() {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.lock
            r0.lock()
            boolean r1 = r3.closed     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L11
            r0.unlock()
            long r0 = r3.protectedSize()
            return r0
        L11:
            java.lang.String r1 = "closed"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L19
            throw r2     // Catch: java.lang.Throwable -> L19
        L19:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public final okio.Source source(long r3) {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.lock()
            boolean r1 = r2.closed     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            int r1 = r2.openStreamCount     // Catch: java.lang.Throwable -> L18
            int r1 = r1 + 1
            r2.openStreamCount = r1     // Catch: java.lang.Throwable -> L18
            r0.unlock()
            okio.FileHandle$FileHandleSource r0 = new okio.FileHandle$FileHandleSource
            r0.<init>(r2, r3)
            return r0
        L18:
            r3 = move-exception
            goto L22
        L1a:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L18
            throw r4     // Catch: java.lang.Throwable -> L18
        L22:
            r0.unlock()
            throw r3
    }

    public final void write(long r3, okio.Buffer r5, long r6) {
            r2 = this;
            r5.getClass()
            boolean r0 = r2.readWrite
            if (r0 == 0) goto L25
            java.util.concurrent.locks.ReentrantLock r1 = r2.lock
            r1.lock()
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L17
            r1.unlock()
            r2.writeNoCloseCheck(r3, r5, r6)
            return
        L17:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1f
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1f
            throw r4     // Catch: java.lang.Throwable -> L1f
        L1f:
            r0 = move-exception
            r3 = r0
            r1.unlock()
            throw r3
        L25:
            java.lang.String r3 = "file handle is read-only"
            j8.o.A(r3)
            return
    }

    public final void write(long r3, byte[] r5, int r6, int r7) {
            r2 = this;
            r5.getClass()
            boolean r0 = r2.readWrite
            if (r0 == 0) goto L25
            java.util.concurrent.locks.ReentrantLock r1 = r2.lock
            r1.lock()
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L17
            r1.unlock()
            r2.protectedWrite(r3, r5, r6, r7)
            return
        L17:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1f
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1f
            throw r4     // Catch: java.lang.Throwable -> L1f
        L1f:
            r0 = move-exception
            r3 = r0
            r1.unlock()
            throw r3
        L25:
            java.lang.String r3 = "file handle is read-only"
            j8.o.A(r3)
            return
    }
}
