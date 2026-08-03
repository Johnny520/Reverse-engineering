package okhttp3.internal.cache2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Relay {
    public static final okhttp3.internal.cache2.Relay.Companion Companion = null;
    private static final long FILE_HEADER_SIZE = 32;
    public static final okio.ByteString PREFIX_CLEAN = null;
    public static final okio.ByteString PREFIX_DIRTY = null;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final okio.Buffer buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private java.io.RandomAccessFile file;
    private final okio.ByteString metadata;
    private int sourceCount;
    private okio.Source upstream;
    private final okio.Buffer upstreamBuffer;
    private long upstreamPos;
    private java.lang.Thread upstreamReader;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final okhttp3.internal.cache2.Relay edit(java.io.File r10, okio.Source r11, okio.ByteString r12, long r13) {
                r9 = this;
                r10.getClass()
                r11.getClass()
                r12.getClass()
                java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
                java.lang.String r0 = "rw"
                r1.<init>(r10, r0)
                okhttp3.internal.cache2.Relay r0 = new okhttp3.internal.cache2.Relay
                r3 = 0
                r8 = 0
                r2 = r11
                r5 = r12
                r6 = r13
                r0.<init>(r1, r2, r3, r5, r6, r8)
                r10 = 0
                r1.setLength(r10)
                okio.ByteString r3 = okhttp3.internal.cache2.Relay.PREFIX_DIRTY
                r4 = -1
                r6 = -1
                r2 = r0
                okhttp3.internal.cache2.Relay.access$writeHeader(r2, r3, r4, r6)
                return r0
        }

        public final okhttp3.internal.cache2.Relay read(java.io.File r11) {
                r10 = this;
                r11.getClass()
                java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
                java.lang.String r0 = "rw"
                r1.<init>(r11, r0)
                okhttp3.internal.cache2.FileOperator r2 = new okhttp3.internal.cache2.FileOperator
                java.nio.channels.FileChannel r11 = r1.getChannel()
                r11.getClass()
                r2.<init>(r11)
                okio.Buffer r5 = new okio.Buffer
                r5.<init>()
                r3 = 0
                r6 = 32
                r2.read(r3, r5, r6)
                okio.ByteString r11 = okhttp3.internal.cache2.Relay.PREFIX_CLEAN
                int r0 = r11.size()
                long r3 = (long) r0
                okio.ByteString r0 = r5.readByteString(r3)
                boolean r11 = gg.l.a(r0, r11)
                if (r11 == 0) goto L55
                long r8 = r5.readLong()
                long r6 = r5.readLong()
                okio.Buffer r5 = new okio.Buffer
                r5.<init>()
                r3 = 32
                long r3 = r3 + r8
                r2.read(r3, r5, r6)
                okio.ByteString r5 = r5.readByteString()
                okhttp3.internal.cache2.Relay r0 = new okhttp3.internal.cache2.Relay
                r6 = 0
                r3 = r8
                r8 = 0
                r2 = 0
                r0.<init>(r1, r2, r3, r5, r6, r8)
                return r0
            L55:
                java.lang.String r11 = "unreadable cache file"
                j8.o.y(r11)
                r11 = 0
                return r11
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class RelaySource implements okio.Source {
        private okhttp3.internal.cache2.FileOperator fileOperator;
        private long sourcePos;
        final /* synthetic */ okhttp3.internal.cache2.Relay this$0;
        private final okio.Timeout timeout;

        public RelaySource(okhttp3.internal.cache2.Relay r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                okio.Timeout r0 = new okio.Timeout
                r0.<init>()
                r1.timeout = r0
                okhttp3.internal.cache2.FileOperator r0 = new okhttp3.internal.cache2.FileOperator
                java.io.RandomAccessFile r2 = r2.getFile()
                r2.getClass()
                java.nio.channels.FileChannel r2 = r2.getChannel()
                r2.getClass()
                r0.<init>(r2)
                r1.fileOperator = r0
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r3 = this;
                okhttp3.internal.cache2.FileOperator r0 = r3.fileOperator
                if (r0 != 0) goto L5
                goto L2b
            L5:
                r0 = 0
                r3.fileOperator = r0
                okhttp3.internal.cache2.Relay r1 = r3.this$0
                monitor-enter(r1)
                int r2 = r1.getSourceCount()     // Catch: java.lang.Throwable -> L23
                int r2 = r2 + (-1)
                r1.setSourceCount(r2)     // Catch: java.lang.Throwable -> L23
                int r2 = r1.getSourceCount()     // Catch: java.lang.Throwable -> L23
                if (r2 != 0) goto L25
                java.io.RandomAccessFile r2 = r1.getFile()     // Catch: java.lang.Throwable -> L23
                r1.setFile(r0)     // Catch: java.lang.Throwable -> L23
                r0 = r2
                goto L25
            L23:
                r0 = move-exception
                goto L2c
            L25:
                monitor-exit(r1)
                if (r0 == 0) goto L2b
                okhttp3.internal.Util.closeQuietly(r0)
            L2b:
                return
            L2c:
                monitor-exit(r1)
                throw r0
        }

        @Override // okio.Source
        public long read(okio.Buffer r23, long r24) {
                r22 = this;
                r1 = r22
                r2 = r24
                r23.getClass()
                okhttp3.internal.cache2.FileOperator r0 = r1.fileOperator
                if (r0 == 0) goto L15e
                okhttp3.internal.cache2.Relay r4 = r1.this$0
                monitor-enter(r4)
            Le:
                long r5 = r4.getUpstreamPos()     // Catch: java.lang.Throwable -> L2f
                long r7 = r1.sourcePos     // Catch: java.lang.Throwable -> L2f
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                r5 = 2
                r6 = -1
                if (r0 != 0) goto L3b
                boolean r0 = r4.getComplete()     // Catch: java.lang.Throwable -> L2f
                if (r0 == 0) goto L23
                monitor-exit(r4)
                return r6
            L23:
                java.lang.Thread r0 = r4.getUpstreamReader()     // Catch: java.lang.Throwable -> L2f
                if (r0 == 0) goto L32
                okio.Timeout r0 = r1.timeout     // Catch: java.lang.Throwable -> L2f
                r0.waitUntilNotified(r4)     // Catch: java.lang.Throwable -> L2f
                goto Le
            L2f:
                r0 = move-exception
                goto L15c
            L32:
                java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
                r4.setUpstreamReader(r0)     // Catch: java.lang.Throwable -> L2f
                r0 = 1
                goto L4f
            L3b:
                long r8 = r4.getUpstreamPos()     // Catch: java.lang.Throwable -> L2f
                okio.Buffer r0 = r4.getBuffer()     // Catch: java.lang.Throwable -> L2f
                long r10 = r0.size()     // Catch: java.lang.Throwable -> L2f
                long r8 = r8 - r10
                long r10 = r1.sourcePos     // Catch: java.lang.Throwable -> L2f
                int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r0 >= 0) goto L13c
                r0 = r5
            L4f:
                monitor-exit(r4)
                okhttp3.internal.cache2.Relay r4 = r1.this$0
                r8 = 32
                if (r0 != r5) goto L75
                long r4 = r4.getUpstreamPos()
                long r6 = r1.sourcePos
                long r4 = r4 - r6
                long r14 = java.lang.Math.min(r2, r4)
                okhttp3.internal.cache2.FileOperator r10 = r1.fileOperator
                r10.getClass()
                long r2 = r1.sourcePos
                long r11 = r2 + r8
                r13 = r23
                r10.read(r11, r13, r14)
                long r2 = r1.sourcePos
                long r2 = r2 + r14
                r1.sourcePos = r2
                return r14
            L75:
                r5 = 0
                okio.Source r0 = r4.getUpstream()     // Catch: java.lang.Throwable -> La8
                r0.getClass()     // Catch: java.lang.Throwable -> La8
                okhttp3.internal.cache2.Relay r4 = r1.this$0     // Catch: java.lang.Throwable -> La8
                okio.Buffer r4 = r4.getUpstreamBuffer()     // Catch: java.lang.Throwable -> La8
                okhttp3.internal.cache2.Relay r10 = r1.this$0     // Catch: java.lang.Throwable -> La8
                long r10 = r10.getBufferMaxSize()     // Catch: java.lang.Throwable -> La8
                long r10 = r0.read(r4, r10)     // Catch: java.lang.Throwable -> La8
                int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r0 != 0) goto Lab
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> La8
                long r2 = r0.getUpstreamPos()     // Catch: java.lang.Throwable -> La8
                r0.commit(r2)     // Catch: java.lang.Throwable -> La8
                okhttp3.internal.cache2.Relay r2 = r1.this$0
                monitor-enter(r2)
                r2.setUpstreamReader(r5)     // Catch: java.lang.Throwable -> La5
                r2.notifyAll()     // Catch: java.lang.Throwable -> La5
                monitor-exit(r2)
                return r6
            La5:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            La8:
                r0 = move-exception
                goto L12e
            Lab:
                long r20 = java.lang.Math.min(r10, r2)     // Catch: java.lang.Throwable -> La8
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> La8
                okio.Buffer r16 = r0.getUpstreamBuffer()     // Catch: java.lang.Throwable -> La8
                r18 = 0
                r17 = r23
                r16.copyTo(r17, r18, r20)     // Catch: java.lang.Throwable -> La8
                long r2 = r1.sourcePos     // Catch: java.lang.Throwable -> La8
                long r2 = r2 + r20
                r1.sourcePos = r2     // Catch: java.lang.Throwable -> La8
                okhttp3.internal.cache2.FileOperator r12 = r1.fileOperator     // Catch: java.lang.Throwable -> La8
                r12.getClass()     // Catch: java.lang.Throwable -> La8
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> La8
                long r2 = r0.getUpstreamPos()     // Catch: java.lang.Throwable -> La8
                long r13 = r2 + r8
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> La8
                okio.Buffer r0 = r0.getUpstreamBuffer()     // Catch: java.lang.Throwable -> La8
                okio.Buffer r15 = r0.m154clone()     // Catch: java.lang.Throwable -> La8
                r16 = r10
                r12.write(r13, r15, r16)     // Catch: java.lang.Throwable -> La8
                r2 = r16
                okhttp3.internal.cache2.Relay r4 = r1.this$0     // Catch: java.lang.Throwable -> La8
                monitor-enter(r4)     // Catch: java.lang.Throwable -> La8
                okio.Buffer r0 = r4.getBuffer()     // Catch: java.lang.Throwable -> L113
                okio.Buffer r6 = r4.getUpstreamBuffer()     // Catch: java.lang.Throwable -> L113
                r0.write(r6, r2)     // Catch: java.lang.Throwable -> L113
                okio.Buffer r0 = r4.getBuffer()     // Catch: java.lang.Throwable -> L113
                long r6 = r0.size()     // Catch: java.lang.Throwable -> L113
                long r8 = r4.getBufferMaxSize()     // Catch: java.lang.Throwable -> L113
                int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r0 <= 0) goto L115
                okio.Buffer r0 = r4.getBuffer()     // Catch: java.lang.Throwable -> L113
                okio.Buffer r6 = r4.getBuffer()     // Catch: java.lang.Throwable -> L113
                long r6 = r6.size()     // Catch: java.lang.Throwable -> L113
                long r8 = r4.getBufferMaxSize()     // Catch: java.lang.Throwable -> L113
                long r6 = r6 - r8
                r0.skip(r6)     // Catch: java.lang.Throwable -> L113
                goto L115
            L113:
                r0 = move-exception
                goto L12c
            L115:
                long r6 = r4.getUpstreamPos()     // Catch: java.lang.Throwable -> L113
                long r6 = r6 + r2
                r4.setUpstreamPos(r6)     // Catch: java.lang.Throwable -> L113
                monitor-exit(r4)     // Catch: java.lang.Throwable -> La8
                okhttp3.internal.cache2.Relay r2 = r1.this$0
                monitor-enter(r2)
                r2.setUpstreamReader(r5)     // Catch: java.lang.Throwable -> L129
                r2.notifyAll()     // Catch: java.lang.Throwable -> L129
                monitor-exit(r2)
                return r20
            L129:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L12c:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> La8
                throw r0     // Catch: java.lang.Throwable -> La8
            L12e:
                okhttp3.internal.cache2.Relay r2 = r1.this$0
                monitor-enter(r2)
                r2.setUpstreamReader(r5)     // Catch: java.lang.Throwable -> L139
                r2.notifyAll()     // Catch: java.lang.Throwable -> L139
                monitor-exit(r2)
                throw r0
            L139:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L13c:
                long r5 = r4.getUpstreamPos()     // Catch: java.lang.Throwable -> L2f
                long r10 = r1.sourcePos     // Catch: java.lang.Throwable -> L2f
                long r5 = r5 - r10
                long r2 = java.lang.Math.min(r2, r5)     // Catch: java.lang.Throwable -> L2f
                okio.Buffer r5 = r4.getBuffer()     // Catch: java.lang.Throwable -> L2f
                long r6 = r1.sourcePos     // Catch: java.lang.Throwable -> L2f
                long r7 = r6 - r8
                r6 = r23
                r9 = r2
                r5.copyTo(r6, r7, r9)     // Catch: java.lang.Throwable -> L2f
                long r2 = r1.sourcePos     // Catch: java.lang.Throwable -> L2f
                long r2 = r2 + r9
                r1.sourcePos = r2     // Catch: java.lang.Throwable -> L2f
                monitor-exit(r4)
                return r9
            L15c:
                monitor-exit(r4)
                throw r0
            L15e:
                java.lang.String r0 = "Check failed."
                j8.o.A(r0)
                r2 = 0
                return r2
        }

        @Override // okio.Source
        public okio.Timeout timeout() {
                r1 = this;
                okio.Timeout r0 = r1.timeout
                return r0
        }
    }

    static {
            okhttp3.internal.cache2.Relay$Companion r0 = new okhttp3.internal.cache2.Relay$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.cache2.Relay.Companion = r0
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "OkHttp cache v1\n"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            okhttp3.internal.cache2.Relay.PREFIX_CLEAN = r1
            java.lang.String r1 = "OkHttp DIRTY :(\n"
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okhttp3.internal.cache2.Relay.PREFIX_DIRTY = r0
            return
    }

    private Relay(java.io.RandomAccessFile r1, okio.Source r2, long r3, okio.ByteString r5, long r6) {
            r0 = this;
            r0.<init>()
            r0.file = r1
            r0.upstream = r2
            r0.upstreamPos = r3
            r0.metadata = r5
            r0.bufferMaxSize = r6
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r0.upstreamBuffer = r1
            okio.Source r1 = r0.upstream
            if (r1 != 0) goto L1a
            r1 = 1
            goto L1b
        L1a:
            r1 = 0
        L1b:
            r0.complete = r1
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r0.buffer = r1
            return
    }

    public /* synthetic */ Relay(java.io.RandomAccessFile r1, okio.Source r2, long r3, okio.ByteString r5, long r6, gg.g r8) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5, r6)
            return
    }

    public static final /* synthetic */ void access$writeHeader(okhttp3.internal.cache2.Relay r0, okio.ByteString r1, long r2, long r4) {
            r0.writeHeader(r1, r2, r4)
            return
    }

    private final void writeHeader(okio.ByteString r7, long r8, long r10) {
            r6 = this;
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            r3.write(r7)
            r3.writeLong(r8)
            r3.writeLong(r10)
            long r7 = r3.size()
            r9 = 32
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L31
            okhttp3.internal.cache2.FileOperator r0 = new okhttp3.internal.cache2.FileOperator
            java.io.RandomAccessFile r7 = r6.file
            r7.getClass()
            java.nio.channels.FileChannel r7 = r7.getChannel()
            r7.getClass()
            r0.<init>(r7)
            r1 = 0
            r4 = 32
            r0.write(r1, r3, r4)
            return
        L31:
            java.lang.String r7 = "Failed requirement."
            j8.o.t(r7)
            return
    }

    private final void writeMetadata(long r7) {
            r6 = this;
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            okio.ByteString r0 = r6.metadata
            r3.write(r0)
            okhttp3.internal.cache2.FileOperator r0 = new okhttp3.internal.cache2.FileOperator
            java.io.RandomAccessFile r1 = r6.file
            r1.getClass()
            java.nio.channels.FileChannel r1 = r1.getChannel()
            r1.getClass()
            r0.<init>(r1)
            r1 = 32
            long r1 = r1 + r7
            okio.ByteString r7 = r6.metadata
            int r7 = r7.size()
            long r4 = (long) r7
            r0.write(r1, r3, r4)
            return
    }

    public final void commit(long r9) {
            r8 = this;
            r8.writeMetadata(r9)
            java.io.RandomAccessFile r0 = r8.file
            r0.getClass()
            java.nio.channels.FileChannel r0 = r0.getChannel()
            r1 = 0
            r0.force(r1)
            okio.ByteString r3 = okhttp3.internal.cache2.Relay.PREFIX_CLEAN
            okio.ByteString r0 = r8.metadata
            int r0 = r0.size()
            long r6 = (long) r0
            r2 = r8
            r4 = r9
            r2.writeHeader(r3, r4, r6)
            java.io.RandomAccessFile r9 = r2.file
            r9.getClass()
            java.nio.channels.FileChannel r9 = r9.getChannel()
            r9.force(r1)
            monitor-enter(r8)
            r9 = 1
            r2.complete = r9     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r8)
            okio.Source r9 = r2.upstream
            if (r9 == 0) goto L36
            okhttp3.internal.Util.closeQuietly(r9)
        L36:
            r9 = 0
            r2.upstream = r9
            return
        L3a:
            r0 = move-exception
            r9 = r0
            monitor-exit(r8)
            throw r9
    }

    public final okio.Buffer getBuffer() {
            r1 = this;
            okio.Buffer r0 = r1.buffer
            return r0
    }

    public final long getBufferMaxSize() {
            r2 = this;
            long r0 = r2.bufferMaxSize
            return r0
    }

    public final boolean getComplete() {
            r1 = this;
            boolean r0 = r1.complete
            return r0
    }

    public final java.io.RandomAccessFile getFile() {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.file
            return r0
    }

    public final int getSourceCount() {
            r1 = this;
            int r0 = r1.sourceCount
            return r0
    }

    public final okio.Source getUpstream() {
            r1 = this;
            okio.Source r0 = r1.upstream
            return r0
    }

    public final okio.Buffer getUpstreamBuffer() {
            r1 = this;
            okio.Buffer r0 = r1.upstreamBuffer
            return r0
    }

    public final long getUpstreamPos() {
            r2 = this;
            long r0 = r2.upstreamPos
            return r0
    }

    public final java.lang.Thread getUpstreamReader() {
            r1 = this;
            java.lang.Thread r0 = r1.upstreamReader
            return r0
    }

    public final boolean isClosed() {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.file
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final okio.ByteString metadata() {
            r1 = this;
            okio.ByteString r0 = r1.metadata
            return r0
    }

    public final okio.Source newSource() {
            r1 = this;
            monitor-enter(r1)
            java.io.RandomAccessFile r0 = r1.file     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L8
            monitor-exit(r1)
            r0 = 0
            return r0
        L8:
            int r0 = r1.sourceCount     // Catch: java.lang.Throwable -> L15
            int r0 = r0 + 1
            r1.sourceCount = r0     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            okhttp3.internal.cache2.Relay$RelaySource r0 = new okhttp3.internal.cache2.Relay$RelaySource
            r0.<init>(r1)
            return r0
        L15:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final void setComplete(boolean r1) {
            r0 = this;
            r0.complete = r1
            return
    }

    public final void setFile(java.io.RandomAccessFile r1) {
            r0 = this;
            r0.file = r1
            return
    }

    public final void setSourceCount(int r1) {
            r0 = this;
            r0.sourceCount = r1
            return
    }

    public final void setUpstream(okio.Source r1) {
            r0 = this;
            r0.upstream = r1
            return
    }

    public final void setUpstreamPos(long r1) {
            r0 = this;
            r0.upstreamPos = r1
            return
    }

    public final void setUpstreamReader(java.lang.Thread r1) {
            r0 = this;
            r0.upstreamReader = r1
            return
    }
}
