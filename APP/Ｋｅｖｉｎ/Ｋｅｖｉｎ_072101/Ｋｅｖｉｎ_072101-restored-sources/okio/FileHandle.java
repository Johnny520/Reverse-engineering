package okio;

/* JADX INFO: compiled from: FileHandle.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002-.B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0013H$J\b\u0010\u001b\u001a\u00020\u0013H$J(\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH$J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0016H$J\b\u0010$\u001a\u00020\u0016H$J(\u0010%\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH$J&\u0010&\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rJ\u001e\u0010&\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020'2\u0006\u0010!\u001a\u00020\u0016J \u0010(\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020'2\u0006\u0010!\u001a\u00020\u0016H\u0002J\u0016\u0010)\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010)\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010*\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u0016J\u0006\u0010#\u001a\u00020\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u0016J&\u0010+\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rJ\u001e\u0010+\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020'2\u0006\u0010!\u001a\u00020\u0016J \u0010,\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020'2\u0006\u0010!\u001a\u00020\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0015\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006/"}, m115d2 = {"Lokio/FileHandle;", "Ljava/io/Closeable;", "Lokio/Closeable;", "readWrite", "", "(Z)V", "closed", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/Lock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "openStreamCount", "", "getReadWrite", "()Z", "appendingSink", "Lokio/Sink;", "close", "", "flush", "position", "", "sink", "source", "Lokio/Source;", "protectedClose", "protectedFlush", "protectedRead", "fileOffset", "array", "", "arrayOffset", "byteCount", "protectedResize", "size", "protectedSize", "protectedWrite", "read", "Lokio/Buffer;", "readNoCloseCheck", "reposition", "resize", "write", "writeNoCloseCheck", "FileHandleSink", "FileHandleSource", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public abstract class FileHandle implements java.io.Closeable {
    private boolean closed;
    private final java.util.concurrent.locks.ReentrantLock lock;
    private int openStreamCount;
    private final boolean readWrite;

    /* JADX INFO: compiled from: FileHandle.kt */
    @kotlin.Metadata(m114d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, m115d2 = {"Lokio/FileHandle$FileHandleSink;", "Lokio/Sink;", "fileHandle", "Lokio/FileHandle;", "position", "", "(Lokio/FileHandle;J)V", "closed", "", "getClosed", "()Z", "setClosed", "(Z)V", "getFileHandle", "()Lokio/FileHandle;", "getPosition", "()J", "setPosition", "(J)V", "close", "", "flush", "timeout", "Lokio/Timeout;", "write", "source", "Lokio/Buffer;", "byteCount", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
    private static final class FileHandleSink implements okio.Sink {
        private boolean closed;
        private final okio.FileHandle fileHandle;
        private long position;

        public FileHandleSink(okio.FileHandle r2, long r3) {
                r1 = this;
                java.lang.String r0 = "fileHandle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.fileHandle = r2
                r1.position = r3
                return
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r6 = this;
                boolean r0 = r6.closed
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r6.closed = r0
                okio.FileHandle r0 = r6.fileHandle
                java.util.concurrent.locks.ReentrantLock r0 = r0.getLock()
                r1 = 0
                r2 = r0
                java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
                r2.lock()
                r3 = 0
                okio.FileHandle r4 = r6.fileHandle     // Catch: java.lang.Throwable -> L42
                int r5 = okio.FileHandle.access$getOpenStreamCount$p(r4)     // Catch: java.lang.Throwable -> L42
                int r5 = r5 + (-1)
                okio.FileHandle.access$setOpenStreamCount$p(r4, r5)     // Catch: java.lang.Throwable -> L42
                okio.FileHandle r4 = r6.fileHandle     // Catch: java.lang.Throwable -> L42
                int r4 = okio.FileHandle.access$getOpenStreamCount$p(r4)     // Catch: java.lang.Throwable -> L42
                if (r4 != 0) goto L3e
                okio.FileHandle r4 = r6.fileHandle     // Catch: java.lang.Throwable -> L42
                boolean r4 = okio.FileHandle.access$getClosed$p(r4)     // Catch: java.lang.Throwable -> L42
                if (r4 != 0) goto L32
                goto L3e
            L32:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L42
                r2.unlock()
                okio.FileHandle r0 = r6.fileHandle
                r0.protectedClose()
                return
            L3e:
                r2.unlock()
                return
            L42:
                r3 = move-exception
                r2.unlock()
                throw r3
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
                r2 = this;
                boolean r0 = r2.closed
                if (r0 != 0) goto La
                okio.FileHandle r0 = r2.fileHandle
                r0.protectedFlush()
                return
            La:
                r0 = 0
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "closed"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
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
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                boolean r0 = r7.closed
                if (r0 != 0) goto L18
                okio.FileHandle r1 = r7.fileHandle
                long r2 = r7.position
                r4 = r8
                r5 = r9
                okio.FileHandle.access$writeNoCloseCheck(r1, r2, r4, r5)
                long r0 = r7.position
                long r0 = r0 + r9
                r7.position = r0
                return
            L18:
                r0 = 0
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "closed"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    /* JADX INFO: compiled from: FileHandle.kt */
    @kotlin.Metadata(m114d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, m115d2 = {"Lokio/FileHandle$FileHandleSource;", "Lokio/Source;", "fileHandle", "Lokio/FileHandle;", "position", "", "(Lokio/FileHandle;J)V", "closed", "", "getClosed", "()Z", "setClosed", "(Z)V", "getFileHandle", "()Lokio/FileHandle;", "getPosition", "()J", "setPosition", "(J)V", "close", "", "read", "sink", "Lokio/Buffer;", "byteCount", "timeout", "Lokio/Timeout;", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
    private static final class FileHandleSource implements okio.Source {
        private boolean closed;
        private final okio.FileHandle fileHandle;
        private long position;

        public FileHandleSource(okio.FileHandle r2, long r3) {
                r1 = this;
                java.lang.String r0 = "fileHandle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.fileHandle = r2
                r1.position = r3
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r6 = this;
                boolean r0 = r6.closed
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r6.closed = r0
                okio.FileHandle r0 = r6.fileHandle
                java.util.concurrent.locks.ReentrantLock r0 = r0.getLock()
                r1 = 0
                r2 = r0
                java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
                r2.lock()
                r3 = 0
                okio.FileHandle r4 = r6.fileHandle     // Catch: java.lang.Throwable -> L42
                int r5 = okio.FileHandle.access$getOpenStreamCount$p(r4)     // Catch: java.lang.Throwable -> L42
                int r5 = r5 + (-1)
                okio.FileHandle.access$setOpenStreamCount$p(r4, r5)     // Catch: java.lang.Throwable -> L42
                okio.FileHandle r4 = r6.fileHandle     // Catch: java.lang.Throwable -> L42
                int r4 = okio.FileHandle.access$getOpenStreamCount$p(r4)     // Catch: java.lang.Throwable -> L42
                if (r4 != 0) goto L3e
                okio.FileHandle r4 = r6.fileHandle     // Catch: java.lang.Throwable -> L42
                boolean r4 = okio.FileHandle.access$getClosed$p(r4)     // Catch: java.lang.Throwable -> L42
                if (r4 != 0) goto L32
                goto L3e
            L32:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L42
                r2.unlock()
                okio.FileHandle r0 = r6.fileHandle
                r0.protectedClose()
                return
            L3e:
                r2.unlock()
                return
            L42:
                r3 = move-exception
                r2.unlock()
                throw r3
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
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                boolean r0 = r7.closed
                if (r0 != 0) goto L1f
                okio.FileHandle r1 = r7.fileHandle
                long r2 = r7.position
                r4 = r8
                r5 = r9
                long r0 = okio.FileHandle.access$readNoCloseCheck(r1, r2, r4, r5)
                r2 = -1
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 == 0) goto L1e
                long r2 = r7.position
                long r2 = r2 + r0
                r7.position = r2
            L1e:
                return r0
            L1f:
                r0 = 0
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "closed"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
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

    public FileHandle(boolean r2) {
            r1 = this;
            r1.<init>()
            r1.readWrite = r2
            java.util.concurrent.locks.ReentrantLock r0 = okio._JvmPlatformKt.newLock()
            r1.lock = r0
            return
    }

    public static final /* synthetic */ boolean access$getClosed$p(okio.FileHandle r1) {
            boolean r0 = r1.closed
            return r0
    }

    public static final /* synthetic */ int access$getOpenStreamCount$p(okio.FileHandle r1) {
            int r0 = r1.openStreamCount
            return r0
    }

    public static final /* synthetic */ long access$readNoCloseCheck(okio.FileHandle r2, long r3, okio.Buffer r5, long r6) {
            long r0 = r2.readNoCloseCheck(r3, r5, r6)
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

    private final long readNoCloseCheck(long r18, okio.Buffer r20, long r21) {
            r17 = this;
            r0 = r20
            r1 = r21
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 1
            if (r3 < 0) goto Ld
            r3 = r4
            goto Le
        Ld:
            r3 = 0
        Le:
            if (r3 == 0) goto L67
            r5 = r18
            long r7 = r18 + r1
        L14:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 >= 0) goto L63
            okio.Segment r3 = r0.writableSegment$okio(r4)
            byte[] r12 = r3.data
            int r13 = r3.limit
            long r9 = r7 - r5
            int r11 = r3.limit
            int r11 = 8192 - r11
            r14 = 0
            r15 = r5
            long r4 = (long) r11
            long r4 = java.lang.Math.min(r9, r4)
            int r14 = (int) r4
            r9 = r17
            r10 = r15
            int r4 = r9.protectedRead(r10, r12, r13, r14)
            r5 = -1
            if (r4 != r5) goto L51
            int r5 = r3.pos
            int r6 = r3.limit
            if (r5 != r6) goto L49
            okio.Segment r5 = r3.pop()
            r0.head = r5
            okio.SegmentPool.recycle(r3)
        L49:
            int r5 = (r18 > r15 ? 1 : (r18 == r15 ? 0 : -1))
            if (r5 != 0) goto L50
            r5 = -1
            return r5
        L50:
            goto L64
        L51:
            int r5 = r3.limit
            int r5 = r5 + r4
            r3.limit = r5
            long r5 = (long) r4
            long r5 = r5 + r15
            long r9 = r20.size()
            long r11 = (long) r4
            long r9 = r9 + r11
            r0.setSize$okio(r9)
            r4 = 1
            goto L14
        L63:
            r15 = r5
        L64:
            long r5 = r15 - r18
            return r5
        L67:
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "byteCount < 0: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r3 = r4.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public static /* synthetic */ okio.Sink sink$default(okio.FileHandle r0, long r1, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Ld
            r3 = r3 & 1
            if (r3 == 0) goto L8
            r1 = 0
        L8:
            okio.Sink r0 = r0.sink(r1)
            return r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: sink"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ okio.Source source$default(okio.FileHandle r0, long r1, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Ld
            r3 = r3 & 1
            if (r3 == 0) goto L8
            r1 = 0
        L8:
            okio.Source r0 = r0.source(r1)
            return r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: source"
            r0.<init>(r1)
            throw r0
    }

    private final void writeNoCloseCheck(long r14, okio.Buffer r16, long r17) {
            r13 = this;
            r0 = r16
            long r1 = r16.size()
            r3 = 0
            r5 = r17
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            r1 = r14
            long r3 = r14 + r17
        L10:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L52
            okio.Segment r5 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r11 = r5
            long r5 = r3 - r1
            int r7 = r11.limit
            int r8 = r11.pos
            int r7 = r7 - r8
            r8 = 0
            long r9 = (long) r7
            long r9 = java.lang.Math.min(r5, r9)
            int r12 = (int) r9
            byte[] r8 = r11.data
            int r9 = r11.pos
            r5 = r13
            r6 = r1
            r10 = r12
            r5.protectedWrite(r6, r8, r9, r10)
            int r5 = r11.pos
            int r5 = r5 + r12
            r11.pos = r5
            long r5 = (long) r12
            long r1 = r1 + r5
            long r5 = r16.size()
            long r7 = (long) r12
            long r5 = r5 - r7
            r0.setSize$okio(r5)
            int r5 = r11.pos
            int r6 = r11.limit
            if (r5 != r6) goto L10
            okio.Segment r5 = r11.pop()
            r0.head = r5
            okio.SegmentPool.recycle(r11)
            goto L10
        L52:
            return
    }

    public final okio.Sink appendingSink() throws java.io.IOException {
            r2 = this;
            long r0 = r2.size()
            okio.Sink r0 = r2.sink(r0)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.lock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            boolean r4 = r5.closed     // Catch: java.lang.Throwable -> L27
            if (r4 == 0) goto L12
            r2.unlock()
            return
        L12:
            r4 = 1
            r5.closed = r4     // Catch: java.lang.Throwable -> L27
            int r4 = r5.openStreamCount     // Catch: java.lang.Throwable -> L27
            if (r4 == 0) goto L1d
            r2.unlock()
            return
        L1d:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L27
            r2.unlock()
            r5.protectedClose()
            return
        L27:
            r3 = move-exception
            r2.unlock()
            throw r3
    }

    public final void flush() throws java.io.IOException {
            r6 = this;
            boolean r0 = r6.readWrite
            if (r0 == 0) goto L2e
            java.util.concurrent.locks.ReentrantLock r0 = r6.lock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            boolean r4 = r6.closed     // Catch: java.lang.Throwable -> L29
            if (r4 != 0) goto L1c
        L13:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L29
            r2.unlock()
            r6.protectedFlush()
            return
        L1c:
            r4 = 0
            java.lang.String r5 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L29
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L29
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L29
            throw r4     // Catch: java.lang.Throwable -> L29
        L29:
            r3 = move-exception
            r2.unlock()
            throw r3
        L2e:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "file handle is read-only"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
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

    public final long position(okio.Sink r6) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r6
            r1 = 0
            boolean r3 = r0 instanceof okio.RealBufferedSink
            if (r3 == 0) goto L1b
            r3 = r0
            okio.RealBufferedSink r3 = (okio.RealBufferedSink) r3
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            long r1 = r3.size()
            r3 = r0
            okio.RealBufferedSink r3 = (okio.RealBufferedSink) r3
            okio.Sink r0 = r3.sink
        L1b:
            boolean r3 = r0 instanceof okio.FileHandle.FileHandleSink
            if (r3 == 0) goto L2a
            r3 = r0
            okio.FileHandle$FileHandleSink r3 = (okio.FileHandle.FileHandleSink) r3
            okio.FileHandle r3 = r3.getFileHandle()
            if (r3 != r5) goto L2a
            r3 = 1
            goto L2b
        L2a:
            r3 = 0
        L2b:
            if (r3 == 0) goto L4d
            r3 = r0
            okio.FileHandle$FileHandleSink r3 = (okio.FileHandle.FileHandleSink) r3
            boolean r3 = r3.getClosed()
            if (r3 != 0) goto L3f
            r3 = r0
            okio.FileHandle$FileHandleSink r3 = (okio.FileHandle.FileHandleSink) r3
            long r3 = r3.getPosition()
            long r3 = r3 + r1
            return r3
        L3f:
            r3 = 0
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "closed"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L4d:
            r3 = 0
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "sink was not created by this FileHandle"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public final long position(okio.Source r6) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r6
            r1 = 0
            boolean r3 = r0 instanceof okio.RealBufferedSource
            if (r3 == 0) goto L1b
            r3 = r0
            okio.RealBufferedSource r3 = (okio.RealBufferedSource) r3
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            long r1 = r3.size()
            r3 = r0
            okio.RealBufferedSource r3 = (okio.RealBufferedSource) r3
            okio.Source r0 = r3.source
        L1b:
            boolean r3 = r0 instanceof okio.FileHandle.FileHandleSource
            if (r3 == 0) goto L2a
            r3 = r0
            okio.FileHandle$FileHandleSource r3 = (okio.FileHandle.FileHandleSource) r3
            okio.FileHandle r3 = r3.getFileHandle()
            if (r3 != r5) goto L2a
            r3 = 1
            goto L2b
        L2a:
            r3 = 0
        L2b:
            if (r3 == 0) goto L4d
            r3 = r0
            okio.FileHandle$FileHandleSource r3 = (okio.FileHandle.FileHandleSource) r3
            boolean r3 = r3.getClosed()
            if (r3 != 0) goto L3f
            r3 = r0
            okio.FileHandle$FileHandleSource r3 = (okio.FileHandle.FileHandleSource) r3
            long r3 = r3.getPosition()
            long r3 = r3 - r1
            return r3
        L3f:
            r3 = 0
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "closed"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L4d:
            r3 = 0
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "source was not created by this FileHandle"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    protected abstract void protectedClose() throws java.io.IOException;

    protected abstract void protectedFlush() throws java.io.IOException;

    protected abstract int protectedRead(long r1, byte[] r3, int r4, int r5) throws java.io.IOException;

    protected abstract void protectedResize(long r1) throws java.io.IOException;

    protected abstract long protectedSize() throws java.io.IOException;

    protected abstract void protectedWrite(long r1, byte[] r3, int r4, int r5) throws java.io.IOException;

    public final int read(long r7, byte[] r9, int r10, int r11) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.concurrent.locks.ReentrantLock r0 = r6.lock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            boolean r4 = r6.closed     // Catch: java.lang.Throwable -> L2b
            if (r4 != 0) goto L1e
        L14:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2b
            r2.unlock()
            int r0 = r6.protectedRead(r7, r9, r10, r11)
            return r0
        L1e:
            r4 = 0
            java.lang.String r5 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L2b
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2b
            throw r4     // Catch: java.lang.Throwable -> L2b
        L2b:
            r3 = move-exception
            r2.unlock()
            throw r3
    }

    public final long read(long r7, okio.Buffer r9, long r10) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.concurrent.locks.ReentrantLock r0 = r6.lock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            boolean r4 = r6.closed     // Catch: java.lang.Throwable -> L2b
            if (r4 != 0) goto L1e
        L14:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2b
            r2.unlock()
            long r0 = r6.readNoCloseCheck(r7, r9, r10)
            return r0
        L1e:
            r4 = 0
            java.lang.String r5 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L2b
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2b
            throw r4     // Catch: java.lang.Throwable -> L2b
        L2b:
            r3 = move-exception
            r2.unlock()
            throw r3
    }

    public final void reposition(okio.Sink r7, long r8) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = r7 instanceof okio.RealBufferedSink
            java.lang.String r1 = "closed"
            java.lang.String r2 = "sink was not created by this FileHandle"
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L53
            r0 = r7
            okio.RealBufferedSink r0 = (okio.RealBufferedSink) r0
            okio.Sink r0 = r0.sink
            boolean r5 = r0 instanceof okio.FileHandle.FileHandleSink
            if (r5 == 0) goto L22
            r5 = r0
            okio.FileHandle$FileHandleSink r5 = (okio.FileHandle.FileHandleSink) r5
            okio.FileHandle r5 = r5.getFileHandle()
            if (r5 != r6) goto L22
            goto L23
        L22:
            r3 = r4
        L23:
            if (r3 == 0) goto L47
            r2 = r0
            okio.FileHandle$FileHandleSink r2 = (okio.FileHandle.FileHandleSink) r2
            boolean r2 = r2.getClosed()
            if (r2 != 0) goto L3b
            r1 = r7
            okio.RealBufferedSink r1 = (okio.RealBufferedSink) r1
            r1.emit()
            r1 = r0
            okio.FileHandle$FileHandleSink r1 = (okio.FileHandle.FileHandleSink) r1
            r1.setPosition(r8)
            goto L73
        L3b:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L47:
            r1 = 0
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L53:
            boolean r0 = r7 instanceof okio.FileHandle.FileHandleSink
            if (r0 == 0) goto L61
            r0 = r7
            okio.FileHandle$FileHandleSink r0 = (okio.FileHandle.FileHandleSink) r0
            okio.FileHandle r0 = r0.getFileHandle()
            if (r0 != r6) goto L61
            goto L62
        L61:
            r3 = r4
        L62:
            if (r3 == 0) goto L80
            r0 = r7
            okio.FileHandle$FileHandleSink r0 = (okio.FileHandle.FileHandleSink) r0
            boolean r0 = r0.getClosed()
            if (r0 != 0) goto L74
            r0 = r7
            okio.FileHandle$FileHandleSink r0 = (okio.FileHandle.FileHandleSink) r0
            r0.setPosition(r8)
        L73:
            return
        L74:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L80:
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void reposition(okio.Source r10, long r11) throws java.io.IOException {
            r9 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            boolean r0 = r10 instanceof okio.RealBufferedSource
            java.lang.String r1 = "closed"
            java.lang.String r2 = "source was not created by this FileHandle"
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L80
            r0 = r10
            okio.RealBufferedSource r0 = (okio.RealBufferedSource) r0
            okio.Source r0 = r0.source
            boolean r5 = r0 instanceof okio.FileHandle.FileHandleSource
            if (r5 == 0) goto L23
            r5 = r0
            okio.FileHandle$FileHandleSource r5 = (okio.FileHandle.FileHandleSource) r5
            okio.FileHandle r5 = r5.getFileHandle()
            if (r5 != r9) goto L23
            r5 = r3
            goto L24
        L23:
            r5 = r4
        L24:
            if (r5 == 0) goto L74
            r2 = r0
            okio.FileHandle$FileHandleSource r2 = (okio.FileHandle.FileHandleSource) r2
            boolean r2 = r2.getClosed()
            if (r2 != 0) goto L68
            r1 = r10
            okio.RealBufferedSource r1 = (okio.RealBufferedSource) r1
            r2 = 0
            okio.Buffer r1 = r1.bufferField
            long r1 = r1.size()
            r5 = r0
            okio.FileHandle$FileHandleSource r5 = (okio.FileHandle.FileHandleSource) r5
            long r5 = r5.getPosition()
            long r5 = r5 - r1
            long r5 = r11 - r5
            r7 = 0
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 > 0) goto L4e
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 >= 0) goto L4e
            goto L4f
        L4e:
            r3 = r4
        L4f:
            if (r3 == 0) goto L58
            r3 = r10
            okio.RealBufferedSource r3 = (okio.RealBufferedSource) r3
            r3.skip(r5)
            goto La0
        L58:
            r3 = r10
            okio.RealBufferedSource r3 = (okio.RealBufferedSource) r3
            r4 = 0
            okio.Buffer r3 = r3.bufferField
            r3.clear()
            r3 = r0
            okio.FileHandle$FileHandleSource r3 = (okio.FileHandle.FileHandleSource) r3
            r3.setPosition(r11)
            goto La0
        L68:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L74:
            r1 = 0
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L80:
            boolean r0 = r10 instanceof okio.FileHandle.FileHandleSource
            if (r0 == 0) goto L8e
            r0 = r10
            okio.FileHandle$FileHandleSource r0 = (okio.FileHandle.FileHandleSource) r0
            okio.FileHandle r0 = r0.getFileHandle()
            if (r0 != r9) goto L8e
            goto L8f
        L8e:
            r3 = r4
        L8f:
            if (r3 == 0) goto Lad
            r0 = r10
            okio.FileHandle$FileHandleSource r0 = (okio.FileHandle.FileHandleSource) r0
            boolean r0 = r0.getClosed()
            if (r0 != 0) goto La1
            r0 = r10
            okio.FileHandle$FileHandleSource r0 = (okio.FileHandle.FileHandleSource) r0
            r0.setPosition(r11)
        La0:
            return
        La1:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lad:
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void resize(long r7) throws java.io.IOException {
            r6 = this;
            boolean r0 = r6.readWrite
            if (r0 == 0) goto L2e
            java.util.concurrent.locks.ReentrantLock r0 = r6.lock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            boolean r4 = r6.closed     // Catch: java.lang.Throwable -> L29
            if (r4 != 0) goto L1c
        L13:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L29
            r2.unlock()
            r6.protectedResize(r7)
            return
        L1c:
            r4 = 0
            java.lang.String r5 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L29
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L29
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L29
            throw r4     // Catch: java.lang.Throwable -> L29
        L29:
            r3 = move-exception
            r2.unlock()
            throw r3
        L2e:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "file handle is read-only"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final okio.Sink sink(long r7) throws java.io.IOException {
            r6 = this;
            boolean r0 = r6.readWrite
            if (r0 == 0) goto L35
            java.util.concurrent.locks.ReentrantLock r0 = r6.lock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            boolean r4 = r6.closed     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L23
            int r4 = r6.openStreamCount     // Catch: java.lang.Throwable -> L30
            int r4 = r4 + 1
            r6.openStreamCount = r4     // Catch: java.lang.Throwable -> L30
            r2.unlock()
            okio.FileHandle$FileHandleSink r0 = new okio.FileHandle$FileHandleSink
            r0.<init>(r6, r7)
            okio.Sink r0 = (okio.Sink) r0
            return r0
        L23:
            r4 = 0
            java.lang.String r5 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L30
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L30
            throw r4     // Catch: java.lang.Throwable -> L30
        L30:
            r3 = move-exception
            r2.unlock()
            throw r3
        L35:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "file handle is read-only"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final long size() throws java.io.IOException {
            r6 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r6.lock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            boolean r4 = r6.closed     // Catch: java.lang.Throwable -> L26
            if (r4 != 0) goto L19
        Lf:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L26
            r2.unlock()
            long r0 = r6.protectedSize()
            return r0
        L19:
            r4 = 0
            java.lang.String r5 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L26
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L26
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L26
            throw r4     // Catch: java.lang.Throwable -> L26
        L26:
            r3 = move-exception
            r2.unlock()
            throw r3
    }

    public final okio.Source source(long r7) throws java.io.IOException {
            r6 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r6.lock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            boolean r4 = r6.closed     // Catch: java.lang.Throwable -> L2c
            if (r4 != 0) goto L1f
            int r4 = r6.openStreamCount     // Catch: java.lang.Throwable -> L2c
            int r4 = r4 + 1
            r6.openStreamCount = r4     // Catch: java.lang.Throwable -> L2c
            r2.unlock()
            okio.FileHandle$FileHandleSource r0 = new okio.FileHandle$FileHandleSource
            r0.<init>(r6, r7)
            okio.Source r0 = (okio.Source) r0
            return r0
        L1f:
            r4 = 0
            java.lang.String r5 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L2c
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2c
            throw r4     // Catch: java.lang.Throwable -> L2c
        L2c:
            r3 = move-exception
            r2.unlock()
            throw r3
    }

    public final void write(long r7, okio.Buffer r9, long r10) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r6.readWrite
            if (r0 == 0) goto L33
            java.util.concurrent.locks.ReentrantLock r0 = r6.lock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            boolean r4 = r6.closed     // Catch: java.lang.Throwable -> L2e
            if (r4 != 0) goto L21
        L18:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2e
            r2.unlock()
            r6.writeNoCloseCheck(r7, r9, r10)
            return
        L21:
            r4 = 0
            java.lang.String r5 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L2e
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2e
            throw r4     // Catch: java.lang.Throwable -> L2e
        L2e:
            r3 = move-exception
            r2.unlock()
            throw r3
        L33:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "file handle is read-only"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void write(long r7, byte[] r9, int r10, int r11) {
            r6 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r6.readWrite
            if (r0 == 0) goto L33
            java.util.concurrent.locks.ReentrantLock r0 = r6.lock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            boolean r4 = r6.closed     // Catch: java.lang.Throwable -> L2e
            if (r4 != 0) goto L21
        L18:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2e
            r2.unlock()
            r6.protectedWrite(r7, r9, r10, r11)
            return
        L21:
            r4 = 0
            java.lang.String r5 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L2e
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2e
            throw r4     // Catch: java.lang.Throwable -> L2e
        L2e:
            r3 = move-exception
            r2.unlock()
            throw r3
        L33:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "file handle is read-only"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
