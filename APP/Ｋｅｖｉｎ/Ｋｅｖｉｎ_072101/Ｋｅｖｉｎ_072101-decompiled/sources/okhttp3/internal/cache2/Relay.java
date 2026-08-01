package okhttp3.internal.cache2;

/* JADX INFO: compiled from: Relay.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 :2\u00020\u0001:\u0002:;B3\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u000e\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\b\u00105\u001a\u0004\u0018\u00010\u0005J \u00106\u001a\u0002032\u0006\u00107\u001a\u00020\t2\u0006\u00104\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0007H\u0002J\u0010\u00109\u001a\u0002032\u0006\u00104\u001a\u00020\u0007H\u0002R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006<"}, m115d2 = {"Lokhttp3/internal/cache2/Relay;", "", "file", "Ljava/io/RandomAccessFile;", "upstream", "Lokio/Source;", "upstreamPos", "", "metadata", "Lokio/ByteString;", "bufferMaxSize", "(Ljava/io/RandomAccessFile;Lokio/Source;JLokio/ByteString;J)V", "buffer", "Lokio/Buffer;", "getBuffer", "()Lokio/Buffer;", "getBufferMaxSize", "()J", "complete", "", "getComplete", "()Z", "setComplete", "(Z)V", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "isClosed", "sourceCount", "", "getSourceCount", "()I", "setSourceCount", "(I)V", "getUpstream", "()Lokio/Source;", "setUpstream", "(Lokio/Source;)V", "upstreamBuffer", "getUpstreamBuffer", "getUpstreamPos", "setUpstreamPos", "(J)V", "upstreamReader", "Ljava/lang/Thread;", "getUpstreamReader", "()Ljava/lang/Thread;", "setUpstreamReader", "(Ljava/lang/Thread;)V", "commit", "", "upstreamSize", "newSource", "writeHeader", "prefix", "metadataSize", "writeMetadata", "Companion", "RelaySource", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

    /* JADX INFO: compiled from: Relay.kt */
    @kotlin.Metadata(m114d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m115d2 = {"Lokhttp3/internal/cache2/Relay$Companion;", "", "()V", "FILE_HEADER_SIZE", "", "PREFIX_CLEAN", "Lokio/ByteString;", "PREFIX_DIRTY", "SOURCE_FILE", "", "SOURCE_UPSTREAM", "edit", "Lokhttp3/internal/cache2/Relay;", "file", "Ljava/io/File;", "upstream", "Lokio/Source;", "metadata", "bufferMaxSize", "read", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final okhttp3.internal.cache2.Relay edit(java.io.File r21, okio.Source r22, okio.ByteString r23, long r24) throws java.io.IOException {
                r20 = this;
                r0 = r21
                java.lang.String r1 = "file"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                java.lang.String r1 = "upstream"
                r11 = r22
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
                java.lang.String r1 = "metadata"
                r12 = r23
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
                java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
                java.lang.String r2 = "rw"
                r1.<init>(r0, r2)
                okhttp3.internal.cache2.Relay r13 = new okhttp3.internal.cache2.Relay
                r5 = 0
                r10 = 0
                r2 = r13
                r3 = r1
                r4 = r22
                r7 = r23
                r8 = r24
                r2.<init>(r3, r4, r5, r7, r8, r10)
                r3 = 0
                r1.setLength(r3)
                okio.ByteString r15 = okhttp3.internal.cache2.Relay.PREFIX_DIRTY
                r16 = -1
                r18 = -1
                r14 = r2
                okhttp3.internal.cache2.Relay.access$writeHeader(r14, r15, r16, r18)
                return r2
        }

        public final okhttp3.internal.cache2.Relay read(java.io.File r24) throws java.io.IOException {
                r23 = this;
                r0 = r24
                java.lang.String r1 = "file"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                java.io.RandomAccessFile r3 = new java.io.RandomAccessFile
                java.lang.String r1 = "rw"
                r3.<init>(r0, r1)
                okhttp3.internal.cache2.FileOperator r11 = new okhttp3.internal.cache2.FileOperator
                java.nio.channels.FileChannel r1 = r3.getChannel()
                java.lang.String r2 = "randomAccessFile.channel"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                r11.<init>(r1)
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
                r12 = 0
                r15 = 32
                r14 = r1
                r11.read(r12, r14, r15)
                okio.ByteString r2 = okhttp3.internal.cache2.Relay.PREFIX_CLEAN
                int r2 = r2.size()
                long r4 = (long) r2
                okio.ByteString r12 = r1.readByteString(r4)
                okio.ByteString r2 = okhttp3.internal.cache2.Relay.PREFIX_CLEAN
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r2)
                if (r2 == 0) goto L65
                long r13 = r1.readLong()
                long r21 = r1.readLong()
                okio.Buffer r18 = new okio.Buffer
                r18.<init>()
                r4 = 32
                long r16 = r13 + r4
                r15 = r11
                r19 = r21
                r15.read(r16, r18, r19)
                okio.ByteString r15 = r18.readByteString()
                okhttp3.internal.cache2.Relay r16 = new okhttp3.internal.cache2.Relay
                r8 = 0
                r10 = 0
                r4 = 0
                r2 = r16
                r5 = r13
                r7 = r15
                r2.<init>(r3, r4, r5, r7, r8, r10)
                return r16
            L65:
                java.io.IOException r2 = new java.io.IOException
                java.lang.String r4 = "unreadable cache file"
                r2.<init>(r4)
                throw r2
        }
    }

    /* JADX INFO: compiled from: Relay.kt */
    @kotlin.Metadata(m114d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m115d2 = {"Lokhttp3/internal/cache2/Relay$RelaySource;", "Lokio/Source;", "(Lokhttp3/internal/cache2/Relay;)V", "fileOperator", "Lokhttp3/internal/cache2/FileOperator;", "sourcePos", "", "timeout", "Lokio/Timeout;", "close", "", "read", "sink", "Lokio/Buffer;", "byteCount", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public final class RelaySource implements okio.Source {
        private okhttp3.internal.cache2.FileOperator fileOperator;
        private long sourcePos;
        final /* synthetic */ okhttp3.internal.cache2.Relay this$0;
        private final okio.Timeout timeout;

        public RelaySource(okhttp3.internal.cache2.Relay r4) {
                r3 = this;
                r3.this$0 = r4
                r3.<init>()
                okio.Timeout r0 = new okio.Timeout
                r0.<init>()
                r3.timeout = r0
                okhttp3.internal.cache2.FileOperator r0 = new okhttp3.internal.cache2.FileOperator
                okhttp3.internal.cache2.Relay r1 = r3.this$0
                java.io.RandomAccessFile r1 = r1.getFile()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                java.nio.channels.FileChannel r1 = r1.getChannel()
                java.lang.String r2 = "file!!.channel"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                r0.<init>(r1)
                r3.fileOperator = r0
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r6 = this;
                okhttp3.internal.cache2.FileOperator r0 = r6.fileOperator
                if (r0 != 0) goto L5
                return
            L5:
                r0 = 0
                r6.fileOperator = r0
                r1 = 0
                okhttp3.internal.cache2.Relay r2 = r6.this$0
                okhttp3.internal.cache2.Relay r3 = r6.this$0
                monitor-enter(r2)
                r4 = 0
                int r5 = r3.getSourceCount()     // Catch: java.lang.Throwable -> L33
                int r5 = r5 + (-1)
                r3.setSourceCount(r5)     // Catch: java.lang.Throwable -> L33
                int r5 = r3.getSourceCount()     // Catch: java.lang.Throwable -> L33
                if (r5 != 0) goto L26
                java.io.RandomAccessFile r5 = r3.getFile()     // Catch: java.lang.Throwable -> L33
                r1 = r5
                r3.setFile(r0)     // Catch: java.lang.Throwable -> L33
            L26:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L33
                monitor-exit(r2)
                if (r1 == 0) goto L32
                r0 = r1
                java.io.Closeable r0 = (java.io.Closeable) r0
                okhttp3.internal.Util.closeQuietly(r0)
            L32:
                return
            L33:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
        }

        @Override // okio.Source
        public long read(okio.Buffer r26, long r27) throws java.io.IOException {
                r25 = this;
                r1 = r25
                r2 = r27
                java.lang.String r0 = "sink"
                r10 = r26
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                okhttp3.internal.cache2.FileOperator r0 = r1.fileOperator
                r4 = 1
                if (r0 == 0) goto L12
                r0 = r4
                goto L13
            L12:
                r0 = 0
            L13:
                if (r0 == 0) goto L1c0
                okhttp3.internal.cache2.Relay r11 = r1.this$0
                okhttp3.internal.cache2.Relay r0 = r1.this$0
                monitor-enter(r11)
                r5 = 0
                r12 = r5
            L1c:
                long r5 = r0.getUpstreamPos()     // Catch: java.lang.Throwable -> L1bd
                long r7 = r1.sourcePos     // Catch: java.lang.Throwable -> L1bd
                int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                r8 = 2
                r13 = -1
                if (r7 != 0) goto L46
                boolean r7 = r0.getComplete()     // Catch: java.lang.Throwable -> L1bd
                if (r7 == 0) goto L32
                monitor-exit(r11)
                return r13
            L32:
                java.lang.Thread r7 = r0.getUpstreamReader()     // Catch: java.lang.Throwable -> L1bd
                if (r7 == 0) goto L3e
                okio.Timeout r7 = r1.timeout     // Catch: java.lang.Throwable -> L1bd
                r7.waitUntilNotified(r0)     // Catch: java.lang.Throwable -> L1bd
                goto L1c
            L3e:
                java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L1bd
                r0.setUpstreamReader(r7)     // Catch: java.lang.Throwable -> L1bd
                goto L5b
            L46:
                long r4 = r0.getUpstreamPos()     // Catch: java.lang.Throwable -> L1bd
                okio.Buffer r6 = r0.getBuffer()     // Catch: java.lang.Throwable -> L1bd
                long r6 = r6.size()     // Catch: java.lang.Throwable -> L1bd
                long r15 = r4 - r6
                long r4 = r1.sourcePos     // Catch: java.lang.Throwable -> L1bd
                int r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r4 >= 0) goto L19b
                r4 = r8
            L5b:
                monitor-exit(r11)
                r11 = r4
                r15 = 32
                if (r11 != r8) goto L82
                okhttp3.internal.cache2.Relay r0 = r1.this$0
                long r4 = r0.getUpstreamPos()
                long r6 = r1.sourcePos
                long r4 = r4 - r6
                long r12 = java.lang.Math.min(r2, r4)
                okhttp3.internal.cache2.FileOperator r4 = r1.fileOperator
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
                long r5 = r1.sourcePos
                long r5 = r5 + r15
                r7 = r26
                r8 = r12
                r4.read(r5, r7, r8)
                long r4 = r1.sourcePos
                long r4 = r4 + r12
                r1.sourcePos = r4
                return r12
            L82:
                r12 = 0
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L17e
                okio.Source r0 = r0.getUpstream()     // Catch: java.lang.Throwable -> L17e
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> L17e
                okhttp3.internal.cache2.Relay r4 = r1.this$0     // Catch: java.lang.Throwable -> L17e
                okio.Buffer r4 = r4.getUpstreamBuffer()     // Catch: java.lang.Throwable -> L17e
                okhttp3.internal.cache2.Relay r5 = r1.this$0     // Catch: java.lang.Throwable -> L17e
                long r5 = r5.getBufferMaxSize()     // Catch: java.lang.Throwable -> L17e
                long r4 = r0.read(r4, r5)     // Catch: java.lang.Throwable -> L17e
                r8 = r4
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 != 0) goto Lcd
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L17e
                okhttp3.internal.cache2.Relay r4 = r1.this$0     // Catch: java.lang.Throwable -> L17e
                long r4 = r4.getUpstreamPos()     // Catch: java.lang.Throwable -> L17e
                r0.commit(r4)     // Catch: java.lang.Throwable -> L17e
                okhttp3.internal.cache2.Relay r4 = r1.this$0
                okhttp3.internal.cache2.Relay r0 = r1.this$0
                monitor-enter(r4)
                r5 = 0
                r0.setUpstreamReader(r12)     // Catch: java.lang.Throwable -> Lca
                r6 = 0
                java.lang.String r7 = "null cannot be cast to non-null type java.lang.Object"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r7)     // Catch: java.lang.Throwable -> Lca
                r7 = r0
                java.lang.Object r7 = (java.lang.Object) r7     // Catch: java.lang.Throwable -> Lca
                r7.notifyAll()     // Catch: java.lang.Throwable -> Lca
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lca
                monitor-exit(r4)
                r4 = r8
                return r13
            Lca:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            Lcd:
                long r4 = java.lang.Math.min(r8, r2)     // Catch: java.lang.Throwable -> L17e
                r13 = r4
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L17e
                okio.Buffer r4 = r0.getUpstreamBuffer()     // Catch: java.lang.Throwable -> L17e
                r6 = 0
                r5 = r26
                r23 = r8
                r8 = r13
                r4.copyTo(r5, r6, r8)     // Catch: java.lang.Throwable -> L17e
                long r4 = r1.sourcePos     // Catch: java.lang.Throwable -> L17e
                long r4 = r4 + r13
                r1.sourcePos = r4     // Catch: java.lang.Throwable -> L17e
                okhttp3.internal.cache2.FileOperator r0 = r1.fileOperator     // Catch: java.lang.Throwable -> L17e
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> L17e
                okhttp3.internal.cache2.Relay r4 = r1.this$0     // Catch: java.lang.Throwable -> L17e
                long r4 = r4.getUpstreamPos()     // Catch: java.lang.Throwable -> L17e
                long r18 = r4 + r15
                okhttp3.internal.cache2.Relay r4 = r1.this$0     // Catch: java.lang.Throwable -> L17e
                okio.Buffer r4 = r4.getUpstreamBuffer()     // Catch: java.lang.Throwable -> L17e
                okio.Buffer r20 = r4.m10369clone()     // Catch: java.lang.Throwable -> L17e
                r17 = r0
                r21 = r23
                r17.write(r18, r20, r21)     // Catch: java.lang.Throwable -> L17e
                okhttp3.internal.cache2.Relay r4 = r1.this$0     // Catch: java.lang.Throwable -> L17e
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L17e
                monitor-enter(r4)     // Catch: java.lang.Throwable -> L17e
                r5 = 0
                okio.Buffer r6 = r0.getBuffer()     // Catch: java.lang.Throwable -> L177
                okio.Buffer r7 = r0.getUpstreamBuffer()     // Catch: java.lang.Throwable -> L177
                r8 = r23
                r6.write(r7, r8)     // Catch: java.lang.Throwable -> L173
                okio.Buffer r6 = r0.getBuffer()     // Catch: java.lang.Throwable -> L173
                long r6 = r6.size()     // Catch: java.lang.Throwable -> L173
                long r15 = r0.getBufferMaxSize()     // Catch: java.lang.Throwable -> L173
                int r6 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
                if (r6 <= 0) goto L140
                okio.Buffer r6 = r0.getBuffer()     // Catch: java.lang.Throwable -> L173
                okio.Buffer r7 = r0.getBuffer()     // Catch: java.lang.Throwable -> L173
                long r15 = r7.size()     // Catch: java.lang.Throwable -> L173
                long r17 = r0.getBufferMaxSize()     // Catch: java.lang.Throwable -> L173
                r19 = r13
                long r12 = r15 - r17
                r6.skip(r12)     // Catch: java.lang.Throwable -> L171
                goto L142
            L140:
                r19 = r13
            L142:
                long r12 = r0.getUpstreamPos()     // Catch: java.lang.Throwable -> L171
                long r12 = r12 + r8
                r0.setUpstreamPos(r12)     // Catch: java.lang.Throwable -> L171
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L171
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L17e
                okhttp3.internal.cache2.Relay r4 = r1.this$0
                okhttp3.internal.cache2.Relay r0 = r1.this$0
                monitor-enter(r4)
                r5 = 0
                r6 = 0
                r0.setUpstreamReader(r6)     // Catch: java.lang.Throwable -> L16e
                r6 = 0
                java.lang.String r7 = "null cannot be cast to non-null type java.lang.Object"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r7)     // Catch: java.lang.Throwable -> L16e
                r7 = r0
                java.lang.Object r7 = (java.lang.Object) r7     // Catch: java.lang.Throwable -> L16e
                r7.notifyAll()     // Catch: java.lang.Throwable -> L16e
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L16e
                monitor-exit(r4)
                r4 = r19
                r6 = r8
                return r19
            L16e:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            L171:
                r0 = move-exception
                goto L17c
            L173:
                r0 = move-exception
                r19 = r13
                goto L17c
            L177:
                r0 = move-exception
                r19 = r13
                r8 = r23
            L17c:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L17e
                throw r0     // Catch: java.lang.Throwable -> L17e
            L17e:
                r0 = move-exception
                okhttp3.internal.cache2.Relay r4 = r1.this$0
                okhttp3.internal.cache2.Relay r5 = r1.this$0
                monitor-enter(r4)
                r6 = 0
                r7 = 0
                r5.setUpstreamReader(r7)     // Catch: java.lang.Throwable -> L198
                r7 = 0
                java.lang.String r8 = "null cannot be cast to non-null type java.lang.Object"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r8)     // Catch: java.lang.Throwable -> L198
                r5.notifyAll()     // Catch: java.lang.Throwable -> L198
                kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L198
                monitor-exit(r4)
                throw r0
            L198:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            L19b:
                long r4 = r0.getUpstreamPos()     // Catch: java.lang.Throwable -> L1bd
                long r6 = r1.sourcePos     // Catch: java.lang.Throwable -> L1bd
                long r4 = r4 - r6
                long r4 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L1bd
                r13 = r4
                okio.Buffer r4 = r0.getBuffer()     // Catch: java.lang.Throwable -> L1bd
                long r5 = r1.sourcePos     // Catch: java.lang.Throwable -> L1bd
                long r6 = r5 - r15
                r5 = r26
                r8 = r13
                r4.copyTo(r5, r6, r8)     // Catch: java.lang.Throwable -> L1bd
                long r4 = r1.sourcePos     // Catch: java.lang.Throwable -> L1bd
                long r4 = r4 + r13
                r1.sourcePos = r4     // Catch: java.lang.Throwable -> L1bd
                monitor-exit(r11)
                return r13
            L1bd:
                r0 = move-exception
                monitor-exit(r11)
                throw r0
            L1c0:
                java.lang.String r0 = "Check failed."
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                throw r4
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
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okhttp3.internal.cache2.Relay.PREFIX_CLEAN = r0
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "OkHttp DIRTY :(\n"
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okhttp3.internal.cache2.Relay.PREFIX_DIRTY = r0
            return
    }

    private Relay(java.io.RandomAccessFile r2, okio.Source r3, long r4, okio.ByteString r6, long r7) {
            r1 = this;
            r1.<init>()
            r1.file = r2
            r1.upstream = r3
            r1.upstreamPos = r4
            r1.metadata = r6
            r1.bufferMaxSize = r7
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r1.upstreamBuffer = r0
            okio.Source r0 = r1.upstream
            if (r0 != 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            r1.complete = r0
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r1.buffer = r0
            return
    }

    public /* synthetic */ Relay(java.io.RandomAccessFile r1, okio.Source r2, long r3, okio.ByteString r5, long r6, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5, r6)
            return
    }

    public static final /* synthetic */ void access$writeHeader(okhttp3.internal.cache2.Relay r0, okio.ByteString r1, long r2, long r4) {
            r0.writeHeader(r1, r2, r4)
            return
    }

    private final void writeHeader(okio.ByteString r9, long r10, long r12) throws java.io.IOException {
            r8 = this;
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            r0 = r3
            r1 = 0
            r0.write(r9)
            r0.writeLong(r10)
            r0.writeLong(r12)
            long r4 = r0.size()
            r6 = 32
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L1c
            r2 = 1
            goto L1d
        L1c:
            r2 = 0
        L1d:
            if (r2 == 0) goto L3c
        L21:
            okhttp3.internal.cache2.FileOperator r0 = new okhttp3.internal.cache2.FileOperator
            java.io.RandomAccessFile r1 = r8.file
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.nio.channels.FileChannel r1 = r1.getChannel()
            java.lang.String r2 = "file!!.channel"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.<init>(r1)
            r1 = 0
            r4 = 32
            r0.write(r1, r3, r4)
            return
        L3c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Failed requirement."
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    private final void writeMetadata(long r8) throws java.io.IOException {
            r7 = this;
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.ByteString r1 = r7.metadata
            r0.write(r1)
            okhttp3.internal.cache2.FileOperator r1 = new okhttp3.internal.cache2.FileOperator
            java.io.RandomAccessFile r2 = r7.file
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.nio.channels.FileChannel r2 = r2.getChannel()
            java.lang.String r3 = "file!!.channel"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.<init>(r2)
            r2 = 32
            long r2 = r2 + r8
            okio.ByteString r4 = r7.metadata
            int r4 = r4.size()
            long r5 = (long) r4
            r4 = r0
            r1.write(r2, r4, r5)
            return
    }

    public final void commit(long r9) throws java.io.IOException {
            r8 = this;
            r8.writeMetadata(r9)
            java.io.RandomAccessFile r0 = r8.file
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
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
            java.io.RandomAccessFile r0 = r8.file
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.nio.channels.FileChannel r0 = r0.getChannel()
            r0.force(r1)
            monitor-enter(r8)
            r0 = 0
            r1 = 1
            r8.complete = r1     // Catch: java.lang.Throwable -> L40
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L40
            monitor-exit(r8)
            okio.Source r0 = r8.upstream
            if (r0 == 0) goto L3c
            java.io.Closeable r0 = (java.io.Closeable) r0
            okhttp3.internal.Util.closeQuietly(r0)
        L3c:
            r0 = 0
            r8.upstream = r0
            return
        L40:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
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
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final okio.ByteString metadata() {
            r1 = this;
            okio.ByteString r0 = r1.metadata
            return r0
    }

    public final okio.Source newSource() {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            java.io.RandomAccessFile r1 = r2.file     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L9
            monitor-exit(r2)
            r0 = 0
            return r0
        L9:
            int r1 = r2.sourceCount     // Catch: java.lang.Throwable -> L18
            int r1 = r1 + 1
            r2.sourceCount = r1     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            okhttp3.internal.cache2.Relay$RelaySource r0 = new okhttp3.internal.cache2.Relay$RelaySource
            r0.<init>(r2)
            okio.Source r0 = (okio.Source) r0
            return r0
        L18:
            r0 = move-exception
            monitor-exit(r2)
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
