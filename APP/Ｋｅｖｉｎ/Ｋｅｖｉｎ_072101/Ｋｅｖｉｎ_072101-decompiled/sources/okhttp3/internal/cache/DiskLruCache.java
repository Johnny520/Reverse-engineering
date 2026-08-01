package okhttp3.internal.cache;

/* JADX INFO: compiled from: DiskLruCache.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010)\n\u0002\b\u0007*\u0001\u0014\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0004[\\]^B7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u000209H\u0016J!\u0010;\u001a\u0002092\n\u0010<\u001a\u00060=R\u00020\u00002\u0006\u0010>\u001a\u00020\u0010H\u0000¢\u0006\u0002\b?J\u0006\u0010@\u001a\u000209J \u0010A\u001a\b\u0018\u00010=R\u00020\u00002\u0006\u0010B\u001a\u00020(2\b\b\u0002\u0010C\u001a\u00020\u000bH\u0007J\u0006\u0010D\u001a\u000209J\b\u0010E\u001a\u000209H\u0016J\u0017\u0010F\u001a\b\u0018\u00010GR\u00020\u00002\u0006\u0010B\u001a\u00020(H\u0086\u0002J\u0006\u0010H\u001a\u000209J\u0006\u0010I\u001a\u00020\u0010J\b\u0010J\u001a\u00020\u0010H\u0002J\b\u0010K\u001a\u00020%H\u0002J\b\u0010L\u001a\u000209H\u0002J\b\u0010M\u001a\u000209H\u0002J\u0010\u0010N\u001a\u0002092\u0006\u0010O\u001a\u00020(H\u0002J\r\u0010P\u001a\u000209H\u0000¢\u0006\u0002\bQJ\u000e\u0010R\u001a\u00020\u00102\u0006\u0010B\u001a\u00020(J\u0019\u0010S\u001a\u00020\u00102\n\u0010T\u001a\u00060)R\u00020\u0000H\u0000¢\u0006\u0002\bUJ\b\u0010V\u001a\u00020\u0010H\u0002J\u0006\u00105\u001a\u00020\u000bJ\u0010\u0010W\u001a\f\u0012\b\u0012\u00060GR\u00020\u00000XJ\u0006\u0010Y\u001a\u000209J\u0010\u0010Z\u001a\u0002092\u0006\u0010B\u001a\u00020(H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(\u0012\b\u0012\u00060)R\u00020\u00000'X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R&\u0010\n\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u00101\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006_"}, m115d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "directory", "Ljava/io/File;", "appVersion", "", "valueCount", "maxSize", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "civilizedFileSystem", "", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupTask", "okhttp3/internal/cache/DiskLruCache$cleanupTask$1", "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "closed", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "getDirectory", "()Ljava/io/File;", "getFileSystem$okhttp", "()Lokhttp3/internal/io/FileSystem;", "hasJournalErrors", "initialized", "journalFile", "journalFileBackup", "journalFileTmp", "journalWriter", "Lokio/BufferedSink;", "lruEntries", "Ljava/util/LinkedHashMap;", "", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "value", "getMaxSize", "()J", "setMaxSize", "(J)V", "mostRecentRebuildFailed", "mostRecentTrimFailed", "nextSequenceNumber", "redundantOpCount", "size", "getValueCount$okhttp", "()I", "checkNotClosed", "", "close", "completeEdit", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "success", "completeEdit$okhttp", "delete", "edit", "key", "expectedSequenceNumber", "evictAll", "flush", "get", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "initialize", "isClosed", "journalRebuildRequired", "newJournalWriter", "processJournal", "readJournal", "readJournalLine", "line", "rebuildJournal", "rebuildJournal$okhttp", "remove", "removeEntry", "entry", "removeEntry$okhttp", "removeOldestEntry", "snapshots", "", "trimToSize", "validateKey", "Companion", "Editor", "Entry", "Snapshot", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class DiskLruCache implements java.io.Closeable, java.io.Flushable {
    public static final long ANY_SEQUENCE_NUMBER = 0;
    public static final java.lang.String CLEAN = null;
    public static final okhttp3.internal.cache.DiskLruCache.Companion Companion = null;
    public static final java.lang.String DIRTY = null;
    public static final java.lang.String JOURNAL_FILE = null;
    public static final java.lang.String JOURNAL_FILE_BACKUP = null;
    public static final java.lang.String JOURNAL_FILE_TEMP = null;
    public static final kotlin.text.Regex LEGAL_KEY_PATTERN = null;
    public static final java.lang.String MAGIC = null;
    public static final java.lang.String READ = null;
    public static final java.lang.String REMOVE = null;
    public static final java.lang.String VERSION_1 = null;
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final okhttp3.internal.concurrent.TaskQueue cleanupQueue;
    private final okhttp3.internal.cache.DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final java.io.File directory;
    private final okhttp3.internal.p003io.FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final java.io.File journalFile;
    private final java.io.File journalFileBackup;
    private final java.io.File journalFileTmp;
    private okio.BufferedSink journalWriter;
    private final java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache.Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;

    /* JADX INFO: compiled from: DiskLruCache.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m115d2 = {"Lokhttp3/internal/cache/DiskLruCache$Companion;", "", "()V", "ANY_SEQUENCE_NUMBER", "", "CLEAN", "", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "MAGIC", "READ", "REMOVE", "VERSION_1", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    @kotlin.Metadata(m114d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\r\u0010\u0011\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u00060\u0003R\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m115d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "entry", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lokhttp3/internal/cache/DiskLruCache;", "(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V", "done", "", "getEntry$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Entry;", "written", "", "getWritten$okhttp", "()[Z", "abort", "", "commit", "detach", "detach$okhttp", "newSink", "Lokio/Sink;", "index", "", "newSource", "Lokio/Source;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public final class Editor {
        private boolean done;
        private final okhttp3.internal.cache.DiskLruCache.Entry entry;
        final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;
        private final boolean[] written;

        public Editor(okhttp3.internal.cache.DiskLruCache r2, okhttp3.internal.cache.DiskLruCache.Entry r3) {
                r1 = this;
                java.lang.String r0 = "entry"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.this$0 = r2
                r1.<init>()
                r1.entry = r3
                okhttp3.internal.cache.DiskLruCache$Entry r0 = r1.entry
                boolean r0 = r0.getReadable$okhttp()
                if (r0 == 0) goto L16
                r0 = 0
                goto L1e
            L16:
                okhttp3.internal.cache.DiskLruCache r0 = r1.this$0
                int r0 = r0.getValueCount$okhttp()
                boolean[] r0 = new boolean[r0]
            L1e:
                r1.written = r0
                return
        }

        public final void abort() throws java.io.IOException {
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r4.this$0
                okhttp3.internal.cache.DiskLruCache r1 = r4.this$0
                monitor-enter(r0)
                r2 = 0
                boolean r3 = r4.done     // Catch: java.lang.Throwable -> L2e
                if (r3 != 0) goto L22
                okhttp3.internal.cache.DiskLruCache$Entry r3 = r4.entry     // Catch: java.lang.Throwable -> L2e
                okhttp3.internal.cache.DiskLruCache$Editor r3 = r3.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L2e
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)     // Catch: java.lang.Throwable -> L2e
                if (r3 == 0) goto L1a
                r3 = 0
                r1.completeEdit$okhttp(r4, r3)     // Catch: java.lang.Throwable -> L2e
            L1a:
                r1 = 1
                r4.done = r1     // Catch: java.lang.Throwable -> L2e
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2e
                monitor-exit(r0)
                return
            L22:
                java.lang.String r1 = "Check failed."
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2e
                r3.<init>(r1)     // Catch: java.lang.Throwable -> L2e
                throw r3     // Catch: java.lang.Throwable -> L2e
            L2e:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        public final void commit() throws java.io.IOException {
                r5 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r5.this$0
                okhttp3.internal.cache.DiskLruCache r1 = r5.this$0
                monitor-enter(r0)
                r2 = 0
                boolean r3 = r5.done     // Catch: java.lang.Throwable -> L2d
                if (r3 != 0) goto L21
                okhttp3.internal.cache.DiskLruCache$Entry r3 = r5.entry     // Catch: java.lang.Throwable -> L2d
                okhttp3.internal.cache.DiskLruCache$Editor r3 = r3.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L2d
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r5)     // Catch: java.lang.Throwable -> L2d
                r4 = 1
                if (r3 == 0) goto L1a
                r1.completeEdit$okhttp(r5, r4)     // Catch: java.lang.Throwable -> L2d
            L1a:
                r5.done = r4     // Catch: java.lang.Throwable -> L2d
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2d
                monitor-exit(r0)
                return
            L21:
                java.lang.String r1 = "Check failed."
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2d
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2d
                r3.<init>(r1)     // Catch: java.lang.Throwable -> L2d
                throw r3     // Catch: java.lang.Throwable -> L2d
            L2d:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        public final void detach$okhttp() {
                r2 = this;
                okhttp3.internal.cache.DiskLruCache$Entry r0 = r2.entry
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r0.getCurrentEditor$okhttp()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r0 == 0) goto L21
                okhttp3.internal.cache.DiskLruCache r0 = r2.this$0
                boolean r0 = okhttp3.internal.cache.DiskLruCache.access$getCivilizedFileSystem$p(r0)
                if (r0 == 0) goto L1b
                okhttp3.internal.cache.DiskLruCache r0 = r2.this$0
                r1 = 0
                r0.completeEdit$okhttp(r2, r1)
                goto L21
            L1b:
                okhttp3.internal.cache.DiskLruCache$Entry r0 = r2.entry
                r1 = 1
                r0.setZombie$okhttp(r1)
            L21:
                return
        }

        public final okhttp3.internal.cache.DiskLruCache.Entry getEntry$okhttp() {
                r1 = this;
                okhttp3.internal.cache.DiskLruCache$Entry r0 = r1.entry
                return r0
        }

        public final boolean[] getWritten$okhttp() {
                r1 = this;
                boolean[] r0 = r1.written
                return r0
        }

        public final okio.Sink newSink(int r8) {
                r7 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r7.this$0
                okhttp3.internal.cache.DiskLruCache r1 = r7.this$0
                monitor-enter(r0)
                r2 = 0
                boolean r3 = r7.done     // Catch: java.lang.Throwable -> L66
                if (r3 != 0) goto L5a
                okhttp3.internal.cache.DiskLruCache$Entry r3 = r7.entry     // Catch: java.lang.Throwable -> L66
                okhttp3.internal.cache.DiskLruCache$Editor r3 = r3.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L66
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r7)     // Catch: java.lang.Throwable -> L66
                if (r3 != 0) goto L1c
                okio.Sink r1 = okio.Okio.blackhole()     // Catch: java.lang.Throwable -> L66
                monitor-exit(r0)
                return r1
            L1c:
                okhttp3.internal.cache.DiskLruCache$Entry r3 = r7.entry     // Catch: java.lang.Throwable -> L66
                boolean r3 = r3.getReadable$okhttp()     // Catch: java.lang.Throwable -> L66
                if (r3 != 0) goto L2c
                boolean[] r3 = r7.written     // Catch: java.lang.Throwable -> L66
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Throwable -> L66
                r4 = 1
                r3[r8] = r4     // Catch: java.lang.Throwable -> L66
            L2c:
                okhttp3.internal.cache.DiskLruCache$Entry r3 = r7.entry     // Catch: java.lang.Throwable -> L66
                java.util.List r3 = r3.getDirtyFiles$okhttp()     // Catch: java.lang.Throwable -> L66
                java.lang.Object r3 = r3.get(r8)     // Catch: java.lang.Throwable -> L66
                java.io.File r3 = (java.io.File) r3     // Catch: java.lang.Throwable -> L66
                r4 = 0
                okhttp3.internal.io.FileSystem r5 = r1.getFileSystem$okhttp()     // Catch: java.io.FileNotFoundException -> L53 java.lang.Throwable -> L66
                okio.Sink r5 = r5.sink(r3)     // Catch: java.io.FileNotFoundException -> L53 java.lang.Throwable -> L66
                r4 = r5
                okhttp3.internal.cache.FaultHidingSink r5 = new okhttp3.internal.cache.FaultHidingSink     // Catch: java.lang.Throwable -> L66
                okhttp3.internal.cache.DiskLruCache$Editor$newSink$1$1 r6 = new okhttp3.internal.cache.DiskLruCache$Editor$newSink$1$1     // Catch: java.lang.Throwable -> L66
                r6.<init>(r1, r7)     // Catch: java.lang.Throwable -> L66
                kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6     // Catch: java.lang.Throwable -> L66
                r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> L66
                okio.Sink r5 = (okio.Sink) r5     // Catch: java.lang.Throwable -> L66
                monitor-exit(r0)
                return r5
            L53:
                r1 = move-exception
                okio.Sink r5 = okio.Okio.blackhole()     // Catch: java.lang.Throwable -> L66
                monitor-exit(r0)
                return r5
            L5a:
                java.lang.String r1 = "Check failed."
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L66
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L66
                r3.<init>(r1)     // Catch: java.lang.Throwable -> L66
                throw r3     // Catch: java.lang.Throwable -> L66
            L66:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        public final okio.Source newSource(int r6) {
                r5 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r5.this$0
                okhttp3.internal.cache.DiskLruCache r1 = r5.this$0
                monitor-enter(r0)
                r2 = 0
                boolean r3 = r5.done     // Catch: java.lang.Throwable -> L52
                if (r3 != 0) goto L46
                okhttp3.internal.cache.DiskLruCache$Entry r3 = r5.entry     // Catch: java.lang.Throwable -> L52
                boolean r3 = r3.getReadable$okhttp()     // Catch: java.lang.Throwable -> L52
                r4 = 0
                if (r3 == 0) goto L43
                okhttp3.internal.cache.DiskLruCache$Entry r3 = r5.entry     // Catch: java.lang.Throwable -> L52
                okhttp3.internal.cache.DiskLruCache$Editor r3 = r3.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L52
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r5)     // Catch: java.lang.Throwable -> L52
                if (r3 == 0) goto L43
                okhttp3.internal.cache.DiskLruCache$Entry r3 = r5.entry     // Catch: java.lang.Throwable -> L52
                boolean r3 = r3.getZombie$okhttp()     // Catch: java.lang.Throwable -> L52
                if (r3 == 0) goto L28
                goto L43
            L28:
                okhttp3.internal.io.FileSystem r1 = r1.getFileSystem$okhttp()     // Catch: java.io.FileNotFoundException -> L3e java.lang.Throwable -> L52
                okhttp3.internal.cache.DiskLruCache$Entry r3 = r5.entry     // Catch: java.io.FileNotFoundException -> L3e java.lang.Throwable -> L52
                java.util.List r3 = r3.getCleanFiles$okhttp()     // Catch: java.io.FileNotFoundException -> L3e java.lang.Throwable -> L52
                java.lang.Object r3 = r3.get(r6)     // Catch: java.io.FileNotFoundException -> L3e java.lang.Throwable -> L52
                java.io.File r3 = (java.io.File) r3     // Catch: java.io.FileNotFoundException -> L3e java.lang.Throwable -> L52
                okio.Source r4 = r1.source(r3)     // Catch: java.io.FileNotFoundException -> L3e java.lang.Throwable -> L52
                goto L40
            L3e:
                r1 = move-exception
            L40:
                monitor-exit(r0)
                return r4
            L43:
                monitor-exit(r0)
                return r4
            L46:
                java.lang.String r1 = "Check failed."
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L52
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L52
                r3.<init>(r1)     // Catch: java.lang.Throwable -> L52
                throw r3     // Catch: java.lang.Throwable -> L52
            L52:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    @kotlin.Metadata(m114d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010.\u001a\u00020/2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000301H\u0002J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u001aH\u0002J\u001b\u00105\u001a\u0002062\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000301H\u0000¢\u0006\u0002\b7J\u0013\u00108\u001a\b\u0018\u000109R\u00020\fH\u0000¢\u0006\u0002\b:J\u0015\u0010;\u001a\u0002062\u0006\u0010<\u001a\u00020=H\u0000¢\u0006\u0002\b>R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0018\u00010\u000bR\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020 X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$¨\u0006?"}, m115d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "key", "", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V", "cleanFiles", "", "Ljava/io/File;", "getCleanFiles$okhttp", "()Ljava/util/List;", "currentEditor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "getCurrentEditor$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "setCurrentEditor$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "dirtyFiles", "getDirtyFiles$okhttp", "getKey$okhttp", "()Ljava/lang/String;", "lengths", "", "getLengths$okhttp", "()[J", "lockingSourceCount", "", "getLockingSourceCount$okhttp", "()I", "setLockingSourceCount$okhttp", "(I)V", "readable", "", "getReadable$okhttp", "()Z", "setReadable$okhttp", "(Z)V", "sequenceNumber", "", "getSequenceNumber$okhttp", "()J", "setSequenceNumber$okhttp", "(J)V", "zombie", "getZombie$okhttp", "setZombie$okhttp", "invalidLengths", "", "strings", "", "newSource", "Lokio/Source;", "index", "setLengths", "", "setLengths$okhttp", "snapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot$okhttp", "writeLengths", "writer", "Lokio/BufferedSink;", "writeLengths$okhttp", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public final class Entry {
        private final java.util.List<java.io.File> cleanFiles;
        private okhttp3.internal.cache.DiskLruCache.Editor currentEditor;
        private final java.util.List<java.io.File> dirtyFiles;
        private final java.lang.String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;
        private boolean zombie;

        public Entry(okhttp3.internal.cache.DiskLruCache r9, java.lang.String r10) {
                r8 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                r8.this$0 = r9
                r8.<init>()
                r8.key = r10
                okhttp3.internal.cache.DiskLruCache r0 = r8.this$0
                int r0 = r0.getValueCount$okhttp()
                long[] r0 = new long[r0]
                r8.lengths = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List r0 = (java.util.List) r0
                r8.cleanFiles = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List r0 = (java.util.List) r0
                r8.dirtyFiles = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = r8.key
                r0.<init>(r1)
                r1 = 46
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r0.length()
                r2 = 0
                okhttp3.internal.cache.DiskLruCache r3 = r8.this$0
                int r3 = r3.getValueCount$okhttp()
            L41:
                if (r2 >= r3) goto L7d
                r0.append(r2)
                java.util.List<java.io.File> r4 = r8.cleanFiles
                java.util.Collection r4 = (java.util.Collection) r4
                java.io.File r5 = new java.io.File
                okhttp3.internal.cache.DiskLruCache r6 = r8.this$0
                java.io.File r6 = r6.getDirectory()
                java.lang.String r7 = r0.toString()
                r5.<init>(r6, r7)
                r4.add(r5)
                java.lang.String r4 = ".tmp"
                r0.append(r4)
                java.util.List<java.io.File> r4 = r8.dirtyFiles
                java.util.Collection r4 = (java.util.Collection) r4
                java.io.File r5 = new java.io.File
                okhttp3.internal.cache.DiskLruCache r6 = r8.this$0
                java.io.File r6 = r6.getDirectory()
                java.lang.String r7 = r0.toString()
                r5.<init>(r6, r7)
                r4.add(r5)
                r0.setLength(r1)
                int r2 = r2 + 1
                goto L41
            L7d:
                return
        }

        private final java.lang.Void invalidLengths(java.util.List<java.lang.String> r4) throws java.io.IOException {
                r3 = this;
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "unexpected journal line: "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        private final okio.Source newSource(int r4) {
                r3 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r3.this$0
                okhttp3.internal.io.FileSystem r0 = r0.getFileSystem$okhttp()
                java.util.List<java.io.File> r1 = r3.cleanFiles
                java.lang.Object r1 = r1.get(r4)
                java.io.File r1 = (java.io.File) r1
                okio.Source r0 = r0.source(r1)
                okhttp3.internal.cache.DiskLruCache r1 = r3.this$0
                boolean r1 = okhttp3.internal.cache.DiskLruCache.access$getCivilizedFileSystem$p(r1)
                if (r1 == 0) goto L1b
                return r0
            L1b:
                int r1 = r3.lockingSourceCount
                int r1 = r1 + 1
                r3.lockingSourceCount = r1
                okhttp3.internal.cache.DiskLruCache$Entry$newSource$1 r1 = new okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                okhttp3.internal.cache.DiskLruCache r2 = r3.this$0
                r1.<init>(r0, r2, r3)
                okio.Source r1 = (okio.Source) r1
                return r1
        }

        public final java.util.List<java.io.File> getCleanFiles$okhttp() {
                r1 = this;
                java.util.List<java.io.File> r0 = r1.cleanFiles
                return r0
        }

        public final okhttp3.internal.cache.DiskLruCache.Editor getCurrentEditor$okhttp() {
                r1 = this;
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r1.currentEditor
                return r0
        }

        public final java.util.List<java.io.File> getDirtyFiles$okhttp() {
                r1 = this;
                java.util.List<java.io.File> r0 = r1.dirtyFiles
                return r0
        }

        public final java.lang.String getKey$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.key
                return r0
        }

        public final long[] getLengths$okhttp() {
                r1 = this;
                long[] r0 = r1.lengths
                return r0
        }

        public final int getLockingSourceCount$okhttp() {
                r1 = this;
                int r0 = r1.lockingSourceCount
                return r0
        }

        public final boolean getReadable$okhttp() {
                r1 = this;
                boolean r0 = r1.readable
                return r0
        }

        public final long getSequenceNumber$okhttp() {
                r2 = this;
                long r0 = r2.sequenceNumber
                return r0
        }

        public final boolean getZombie$okhttp() {
                r1 = this;
                boolean r0 = r1.zombie
                return r0
        }

        public final void setCurrentEditor$okhttp(okhttp3.internal.cache.DiskLruCache.Editor r1) {
                r0 = this;
                r0.currentEditor = r1
                return
        }

        public final void setLengths$okhttp(java.util.List<java.lang.String> r6) throws java.io.IOException {
                r5 = this;
                java.lang.String r0 = "strings"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                int r0 = r6.size()
                okhttp3.internal.cache.DiskLruCache r1 = r5.this$0
                int r1 = r1.getValueCount$okhttp()
                if (r0 != r1) goto L35
            L12:
                r0 = 0
                int r1 = r6.size()     // Catch: java.lang.NumberFormatException -> L2b
            L17:
                if (r0 >= r1) goto L2a
                long[] r2 = r5.lengths     // Catch: java.lang.NumberFormatException -> L2b
                java.lang.Object r3 = r6.get(r0)     // Catch: java.lang.NumberFormatException -> L2b
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NumberFormatException -> L2b
                long r3 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L2b
                r2[r0] = r3     // Catch: java.lang.NumberFormatException -> L2b
                int r0 = r0 + 1
                goto L17
            L2a:
                return
            L2b:
                r0 = move-exception
                r5.invalidLengths(r6)
                kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
                r1.<init>()
                throw r1
            L35:
                r5.invalidLengths(r6)
                kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
                r0.<init>()
                throw r0
        }

        public final void setLockingSourceCount$okhttp(int r1) {
                r0 = this;
                r0.lockingSourceCount = r1
                return
        }

        public final void setReadable$okhttp(boolean r1) {
                r0 = this;
                r0.readable = r1
                return
        }

        public final void setSequenceNumber$okhttp(long r1) {
                r0 = this;
                r0.sequenceNumber = r1
                return
        }

        public final void setZombie$okhttp(boolean r1) {
                r0 = this;
                r0.zombie = r1
                return
        }

        public final okhttp3.internal.cache.DiskLruCache.Snapshot snapshot$okhttp() {
                r11 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r11.this$0
                r1 = 0
                boolean r2 = okhttp3.internal.Util.assertionsEnabled
                if (r2 == 0) goto L39
                boolean r2 = java.lang.Thread.holdsLock(r0)
                if (r2 == 0) goto Le
                goto L39
            Le:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Thread "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                java.lang.String r4 = r4.getName()
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r4 = " MUST hold lock on "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L39:
                boolean r0 = r11.readable
                r1 = 0
                if (r0 != 0) goto L40
                return r1
            L40:
                okhttp3.internal.cache.DiskLruCache r0 = r11.this$0
                boolean r0 = okhttp3.internal.cache.DiskLruCache.access$getCivilizedFileSystem$p(r0)
                if (r0 != 0) goto L51
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r11.currentEditor
                if (r0 != 0) goto L50
                boolean r0 = r11.zombie
                if (r0 == 0) goto L51
            L50:
                return r1
            L51:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List r0 = (java.util.List) r0
                long[] r2 = r11.lengths
                java.lang.Object r2 = r2.clone()
                r9 = r2
                long[] r9 = (long[]) r9
                r2 = 0
                okhttp3.internal.cache.DiskLruCache r3 = r11.this$0     // Catch: java.io.FileNotFoundException -> L87
                int r3 = r3.getValueCount$okhttp()     // Catch: java.io.FileNotFoundException -> L87
            L69:
                if (r2 >= r3) goto L78
                r4 = r0
                java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.io.FileNotFoundException -> L87
                okio.Source r5 = r11.newSource(r2)     // Catch: java.io.FileNotFoundException -> L87
                r4.add(r5)     // Catch: java.io.FileNotFoundException -> L87
                int r2 = r2 + 1
                goto L69
            L78:
                okhttp3.internal.cache.DiskLruCache$Snapshot r10 = new okhttp3.internal.cache.DiskLruCache$Snapshot     // Catch: java.io.FileNotFoundException -> L87
                okhttp3.internal.cache.DiskLruCache r3 = r11.this$0     // Catch: java.io.FileNotFoundException -> L87
                java.lang.String r4 = r11.key     // Catch: java.io.FileNotFoundException -> L87
                long r5 = r11.sequenceNumber     // Catch: java.io.FileNotFoundException -> L87
                r2 = r10
                r7 = r0
                r8 = r9
                r2.<init>(r3, r4, r5, r7, r8)     // Catch: java.io.FileNotFoundException -> L87
                return r10
            L87:
                r2 = move-exception
                java.util.Iterator r3 = r0.iterator()
            L8c:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L9f
                java.lang.Object r4 = r3.next()
                okio.Source r4 = (okio.Source) r4
                r5 = r4
                java.io.Closeable r5 = (java.io.Closeable) r5
                okhttp3.internal.Util.closeQuietly(r5)
                goto L8c
            L9f:
                okhttp3.internal.cache.DiskLruCache r3 = r11.this$0     // Catch: java.io.IOException -> La6
                r3.removeEntry$okhttp(r11)     // Catch: java.io.IOException -> La6
                goto La7
            La6:
                r3 = move-exception
            La7:
                return r1
        }

        public final void writeLengths$okhttp(okio.BufferedSink r7) throws java.io.IOException {
                r6 = this;
                java.lang.String r0 = "writer"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                long[] r0 = r6.lengths
                int r1 = r0.length
                r2 = 0
            L9:
                if (r2 >= r1) goto L19
                r3 = r0[r2]
                r5 = 32
                okio.BufferedSink r5 = r7.writeByte(r5)
                r5.writeDecimalLong(r3)
                int r2 = r2 + 1
                goto L9
            L19:
                return
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    @kotlin.Metadata(m114d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\f\u0010\u000e\u001a\b\u0018\u00010\u000fR\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m115d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "key", "", "sequenceNumber", "", "sources", "", "Lokio/Source;", "lengths", "", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;JLjava/util/List;[J)V", "close", "", "edit", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "getLength", "index", "", "getSource", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public final class Snapshot implements java.io.Closeable {
        private final java.lang.String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final java.util.List<okio.Source> sources;
        final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;

        public Snapshot(okhttp3.internal.cache.DiskLruCache r2, java.lang.String r3, long r4, java.util.List<? extends okio.Source> r6, long[] r7) {
                r1 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "sources"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = "lengths"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                r1.this$0 = r2
                r1.<init>()
                r1.key = r3
                r1.sequenceNumber = r4
                r1.sources = r6
                r1.lengths = r7
                return
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r3 = this;
                java.util.List<okio.Source> r0 = r3.sources
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L19
                java.lang.Object r1 = r0.next()
                okio.Source r1 = (okio.Source) r1
                r2 = r1
                java.io.Closeable r2 = (java.io.Closeable) r2
                okhttp3.internal.Util.closeQuietly(r2)
                goto L6
            L19:
                return
        }

        public final okhttp3.internal.cache.DiskLruCache.Editor edit() throws java.io.IOException {
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r4.this$0
                java.lang.String r1 = r4.key
                long r2 = r4.sequenceNumber
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r0.edit(r1, r2)
                return r0
        }

        public final long getLength(int r4) {
                r3 = this;
                long[] r0 = r3.lengths
                r1 = r0[r4]
                return r1
        }

        public final okio.Source getSource(int r2) {
                r1 = this;
                java.util.List<okio.Source> r0 = r1.sources
                java.lang.Object r0 = r0.get(r2)
                okio.Source r0 = (okio.Source) r0
                return r0
        }

        public final java.lang.String key() {
                r1 = this;
                java.lang.String r0 = r1.key
                return r0
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.DiskLruCache$snapshots$1 */
    /* JADX INFO: compiled from: DiskLruCache.kt */
    @kotlin.Metadata(m114d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\r\u0010\u000b\u001a\u00060\u0002R\u00020\u0003H\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R$\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012 \u0006*\b\u0018\u00010\u0005R\u00020\u00030\u0005R\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0018\u00010\u0002R\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0018\u00010\u0002R\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m115d2 = {"okhttp3/internal/cache/DiskLruCache$snapshots$1", "", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "delegate", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "kotlin.jvm.PlatformType", "nextSnapshot", "removeSnapshot", "hasNext", "", "next", "remove", "", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class C10311 implements java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Snapshot>, kotlin.jvm.internal.markers.KMutableIterator {
        private final java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Entry> delegate;
        private okhttp3.internal.cache.DiskLruCache.Snapshot nextSnapshot;
        private okhttp3.internal.cache.DiskLruCache.Snapshot removeSnapshot;
        final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;

        C10311(okhttp3.internal.cache.DiskLruCache r3) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.LinkedHashMap r1 = r3.getLruEntries$okhttp()
                java.util.Collection r1 = r1.values()
                r0.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
                java.lang.String r1 = "ArrayList(lruEntries.values).iterator()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                r2.delegate = r0
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r5 = this;
                okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r5.nextSnapshot
                r1 = 1
                if (r0 == 0) goto L6
                return r1
            L6:
                okhttp3.internal.cache.DiskLruCache r0 = r5.this$0
                okhttp3.internal.cache.DiskLruCache r2 = r5.this$0
                monitor-enter(r0)
                r3 = 0
                boolean r2 = r2.getClosed$okhttp()     // Catch: java.lang.Throwable -> L38
                r4 = 0
                if (r2 == 0) goto L15
                monitor-exit(r0)
                return r4
            L15:
                java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Entry> r2 = r5.delegate     // Catch: java.lang.Throwable -> L38
                boolean r2 = r2.hasNext()     // Catch: java.lang.Throwable -> L38
                if (r2 == 0) goto L33
                java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Entry> r2 = r5.delegate     // Catch: java.lang.Throwable -> L38
                java.lang.Object r2 = r2.next()     // Catch: java.lang.Throwable -> L38
                okhttp3.internal.cache.DiskLruCache$Entry r2 = (okhttp3.internal.cache.DiskLruCache.Entry) r2     // Catch: java.lang.Throwable -> L38
                if (r2 == 0) goto L15
                okhttp3.internal.cache.DiskLruCache$Snapshot r2 = r2.snapshot$okhttp()     // Catch: java.lang.Throwable -> L38
                if (r2 != 0) goto L2e
                goto L15
            L2e:
                r5.nextSnapshot = r2     // Catch: java.lang.Throwable -> L38
                monitor-exit(r0)
                return r1
            L33:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L38
                monitor-exit(r0)
                return r4
            L38:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ okhttp3.internal.cache.DiskLruCache.Snapshot next() {
                r1 = this;
                okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r1.next2()
                return r0
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: next, reason: avoid collision after fix types in other method */
        public okhttp3.internal.cache.DiskLruCache.Snapshot next2() {
                r1 = this;
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L13
                okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r1.nextSnapshot
                r1.removeSnapshot = r0
                r0 = 0
                r1.nextSnapshot = r0
                okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r1.removeSnapshot
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                return r0
            L13:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r4 = this;
                okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r4.removeSnapshot
                if (r0 == 0) goto L19
            L5:
                r1 = 0
                okhttp3.internal.cache.DiskLruCache r2 = r4.this$0     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L14
                java.lang.String r3 = r0.key()     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L14
                r2.remove(r3)     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L14
                goto L15
            L10:
                r2 = move-exception
                r4.removeSnapshot = r1
                throw r2
            L14:
                r2 = move-exception
            L15:
                r4.removeSnapshot = r1
                return
            L19:
                r1 = 0
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "remove() before next()"
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
        }
    }

    static {
            okhttp3.internal.cache.DiskLruCache$Companion r0 = new okhttp3.internal.cache.DiskLruCache$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.cache.DiskLruCache.Companion = r0
            java.lang.String r0 = "journal"
            okhttp3.internal.cache.DiskLruCache.JOURNAL_FILE = r0
            java.lang.String r0 = "journal.tmp"
            okhttp3.internal.cache.DiskLruCache.JOURNAL_FILE_TEMP = r0
            java.lang.String r0 = "journal.bkp"
            okhttp3.internal.cache.DiskLruCache.JOURNAL_FILE_BACKUP = r0
            java.lang.String r0 = "libcore.io.DiskLruCache"
            okhttp3.internal.cache.DiskLruCache.MAGIC = r0
            java.lang.String r0 = "1"
            okhttp3.internal.cache.DiskLruCache.VERSION_1 = r0
            r0 = -1
            okhttp3.internal.cache.DiskLruCache.ANY_SEQUENCE_NUMBER = r0
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = "[a-z0-9_-]{1,120}"
            r0.<init>(r1)
            okhttp3.internal.cache.DiskLruCache.LEGAL_KEY_PATTERN = r0
            java.lang.String r0 = "CLEAN"
            okhttp3.internal.cache.DiskLruCache.CLEAN = r0
            java.lang.String r0 = "DIRTY"
            okhttp3.internal.cache.DiskLruCache.DIRTY = r0
            java.lang.String r0 = "REMOVE"
            okhttp3.internal.cache.DiskLruCache.REMOVE = r0
            java.lang.String r0 = "READ"
            okhttp3.internal.cache.DiskLruCache.READ = r0
            return
    }

    public DiskLruCache(okhttp3.internal.p003io.FileSystem r7, java.io.File r8, int r9, int r10, long r11, okhttp3.internal.concurrent.TaskRunner r13) {
            r6 = this;
            java.lang.String r0 = "fileSystem"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "directory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r6.<init>()
            r6.fileSystem = r7
            r6.directory = r8
            r6.appVersion = r9
            r6.valueCount = r10
            r6.maxSize = r11
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 0
            r2 = 1061158912(0x3f400000, float:0.75)
            r3 = 1
            r0.<init>(r1, r2, r3)
            r6.lruEntries = r0
            okhttp3.internal.concurrent.TaskQueue r0 = r13.newQueue()
            r6.cleanupQueue = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = okhttp3.internal.Util.okHttpName
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = " Cache"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r2 = new okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            r2.<init>(r6, r0)
            r6.cleanupTask = r2
            r4 = 0
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 <= 0) goto L52
            r0 = r3
            goto L53
        L52:
            r0 = r1
        L53:
            if (r0 == 0) goto L8d
            int r0 = r6.valueCount
            if (r0 <= 0) goto L5a
            r1 = r3
        L5a:
            if (r1 == 0) goto L7f
            java.io.File r0 = new java.io.File
            java.io.File r1 = r6.directory
            java.lang.String r2 = okhttp3.internal.cache.DiskLruCache.JOURNAL_FILE
            r0.<init>(r1, r2)
            r6.journalFile = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = r6.directory
            java.lang.String r2 = okhttp3.internal.cache.DiskLruCache.JOURNAL_FILE_TEMP
            r0.<init>(r1, r2)
            r6.journalFileTmp = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = r6.directory
            java.lang.String r2 = okhttp3.internal.cache.DiskLruCache.JOURNAL_FILE_BACKUP
            r0.<init>(r1, r2)
            r6.journalFileBackup = r0
            return
        L7f:
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "valueCount <= 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8d:
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "maxSize <= 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final /* synthetic */ boolean access$getCivilizedFileSystem$p(okhttp3.internal.cache.DiskLruCache r1) {
            boolean r0 = r1.civilizedFileSystem
            return r0
    }

    public static final /* synthetic */ boolean access$getInitialized$p(okhttp3.internal.cache.DiskLruCache r1) {
            boolean r0 = r1.initialized
            return r0
    }

    public static final /* synthetic */ boolean access$journalRebuildRequired(okhttp3.internal.cache.DiskLruCache r1) {
            boolean r0 = r1.journalRebuildRequired()
            return r0
    }

    public static final /* synthetic */ void access$setHasJournalErrors$p(okhttp3.internal.cache.DiskLruCache r0, boolean r1) {
            r0.hasJournalErrors = r1
            return
    }

    public static final /* synthetic */ void access$setJournalWriter$p(okhttp3.internal.cache.DiskLruCache r0, okio.BufferedSink r1) {
            r0.journalWriter = r1
            return
    }

    public static final /* synthetic */ void access$setMostRecentRebuildFailed$p(okhttp3.internal.cache.DiskLruCache r0, boolean r1) {
            r0.mostRecentRebuildFailed = r1
            return
    }

    public static final /* synthetic */ void access$setMostRecentTrimFailed$p(okhttp3.internal.cache.DiskLruCache r0, boolean r1) {
            r0.mostRecentTrimFailed = r1
            return
    }

    public static final /* synthetic */ void access$setRedundantOpCount$p(okhttp3.internal.cache.DiskLruCache r0, int r1) {
            r0.redundantOpCount = r1
            return
    }

    private final synchronized void checkNotClosed() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L7
            monitor-exit(r2)
            return
        L7:
            r0 = 0
            java.lang.String r1 = "cache is closed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L14
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L14
            throw r0     // Catch: java.lang.Throwable -> L14
        L14:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    public static /* synthetic */ okhttp3.internal.cache.DiskLruCache.Editor edit$default(okhttp3.internal.cache.DiskLruCache r0, java.lang.String r1, long r2, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            long r2 = okhttp3.internal.cache.DiskLruCache.ANY_SEQUENCE_NUMBER
        L6:
            okhttp3.internal.cache.DiskLruCache$Editor r0 = r0.edit(r1, r2)
            return r0
    }

    private final boolean journalRebuildRequired() {
            r3 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            int r1 = r3.redundantOpCount
            if (r1 < r0) goto L12
            int r1 = r3.redundantOpCount
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r2 = r3.lruEntries
            int r2 = r2.size()
            if (r1 < r2) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    private final okio.BufferedSink newJournalWriter() throws java.io.FileNotFoundException {
            r3 = this;
            okhttp3.internal.io.FileSystem r0 = r3.fileSystem
            java.io.File r1 = r3.journalFile
            okio.Sink r0 = r0.appendingSink(r1)
            okhttp3.internal.cache.FaultHidingSink r1 = new okhttp3.internal.cache.FaultHidingSink
            okhttp3.internal.cache.DiskLruCache$newJournalWriter$faultHidingSink$1 r2 = new okhttp3.internal.cache.DiskLruCache$newJournalWriter$faultHidingSink$1
            r2.<init>(r3)
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r1.<init>(r0, r2)
            r2 = r1
            okio.Sink r2 = (okio.Sink) r2
            okio.BufferedSink r2 = okio.Okio.buffer(r2)
            return r2
    }

    private final void processJournal() throws java.io.IOException {
            r9 = this;
            okhttp3.internal.io.FileSystem r0 = r9.fileSystem
            java.io.File r1 = r9.journalFileTmp
            r0.delete(r1)
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r9.lruEntries
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r0.next()
            java.lang.String r2 = "i.next()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            okhttp3.internal.cache.DiskLruCache$Entry r1 = (okhttp3.internal.cache.DiskLruCache.Entry) r1
            okhttp3.internal.cache.DiskLruCache$Editor r2 = r1.getCurrentEditor$okhttp()
            if (r2 != 0) goto L3b
            r2 = 0
            int r3 = r9.valueCount
        L2b:
            if (r2 >= r3) goto L11
            long r4 = r9.size
            long[] r6 = r1.getLengths$okhttp()
            r7 = r6[r2]
            long r4 = r4 + r7
            r9.size = r4
            int r2 = r2 + 1
            goto L2b
        L3b:
            r2 = 0
            r1.setCurrentEditor$okhttp(r2)
            r2 = 0
            int r3 = r9.valueCount
        L42:
            if (r2 >= r3) goto L65
            okhttp3.internal.io.FileSystem r4 = r9.fileSystem
            java.util.List r5 = r1.getCleanFiles$okhttp()
            java.lang.Object r5 = r5.get(r2)
            java.io.File r5 = (java.io.File) r5
            r4.delete(r5)
            okhttp3.internal.io.FileSystem r4 = r9.fileSystem
            java.util.List r5 = r1.getDirtyFiles$okhttp()
            java.lang.Object r5 = r5.get(r2)
            java.io.File r5 = (java.io.File) r5
            r4.delete(r5)
            int r2 = r2 + 1
            goto L42
        L65:
            r0.remove()
            goto L11
        L69:
            return
    }

    private final void readJournal() throws java.io.IOException {
            r12 = this;
            java.lang.String r0 = ", "
            okhttp3.internal.io.FileSystem r1 = r12.fileSystem
            java.io.File r2 = r12.journalFile
            okio.Source r1 = r1.source(r2)
            okio.BufferedSource r1 = okio.Okio.buffer(r1)
            java.io.Closeable r1 = (java.io.Closeable) r1
            r2 = r1
            okio.BufferedSource r2 = (okio.BufferedSource) r2     // Catch: java.lang.Throwable -> Lc6
            r3 = 0
            java.lang.String r4 = r2.readUtf8LineStrict()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r5 = r2.readUtf8LineStrict()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r6 = r2.readUtf8LineStrict()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r7 = r2.readUtf8LineStrict()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r8 = r2.readUtf8LineStrict()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r9 = okhttp3.internal.cache.DiskLruCache.MAGIC     // Catch: java.lang.Throwable -> Lc6
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r4)     // Catch: java.lang.Throwable -> Lc6
            if (r9 == 0) goto L8f
            java.lang.String r9 = okhttp3.internal.cache.DiskLruCache.VERSION_1     // Catch: java.lang.Throwable -> Lc6
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r5)     // Catch: java.lang.Throwable -> Lc6
            if (r9 == 0) goto L8f
            int r9 = r12.appVersion     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> Lc6
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r6)     // Catch: java.lang.Throwable -> Lc6
            if (r9 == 0) goto L8f
            int r9 = r12.valueCount     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> Lc6
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r7)     // Catch: java.lang.Throwable -> Lc6
            if (r9 == 0) goto L8f
            r9 = r8
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch: java.lang.Throwable -> Lc6
            int r9 = r9.length()     // Catch: java.lang.Throwable -> Lc6
            if (r9 <= 0) goto L5b
            r9 = 1
            goto L5c
        L5b:
            r9 = 0
        L5c:
            if (r9 != 0) goto L8f
            r0 = 0
        L5f:
            java.lang.String r9 = r2.readUtf8LineStrict()     // Catch: java.io.EOFException -> L6b java.lang.Throwable -> Lc6
            r12.readJournalLine(r9)     // Catch: java.io.EOFException -> L6b java.lang.Throwable -> Lc6
            int r0 = r0 + 1
            goto L5f
        L6b:
            r9 = move-exception
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r9 = r12.lruEntries     // Catch: java.lang.Throwable -> Lc6
            int r9 = r9.size()     // Catch: java.lang.Throwable -> Lc6
            int r9 = r0 - r9
            r12.redundantOpCount = r9     // Catch: java.lang.Throwable -> Lc6
            boolean r9 = r2.exhausted()     // Catch: java.lang.Throwable -> Lc6
            if (r9 != 0) goto L81
            r12.rebuildJournal$okhttp()     // Catch: java.lang.Throwable -> Lc6
            goto L87
        L81:
            okio.BufferedSink r9 = r12.newJournalWriter()     // Catch: java.lang.Throwable -> Lc6
            r12.journalWriter = r9     // Catch: java.lang.Throwable -> Lc6
        L87:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lc6
            r0 = 0
            kotlin.p001io.CloseableKt.closeFinally(r1, r0)
            return
        L8f:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> Lc6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc6
            r10.<init>()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r11 = "unexpected journal header: ["
            java.lang.StringBuilder r10 = r10.append(r11)     // Catch: java.lang.Throwable -> Lc6
            java.lang.StringBuilder r10 = r10.append(r4)     // Catch: java.lang.Throwable -> Lc6
            java.lang.StringBuilder r10 = r10.append(r0)     // Catch: java.lang.Throwable -> Lc6
            java.lang.StringBuilder r10 = r10.append(r5)     // Catch: java.lang.Throwable -> Lc6
            java.lang.StringBuilder r10 = r10.append(r0)     // Catch: java.lang.Throwable -> Lc6
            java.lang.StringBuilder r10 = r10.append(r7)     // Catch: java.lang.Throwable -> Lc6
            java.lang.StringBuilder r0 = r10.append(r0)     // Catch: java.lang.Throwable -> Lc6
            java.lang.StringBuilder r0 = r0.append(r8)     // Catch: java.lang.Throwable -> Lc6
            r10 = 93
            java.lang.StringBuilder r0 = r0.append(r10)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lc6
            r9.<init>(r0)     // Catch: java.lang.Throwable -> Lc6
            throw r9     // Catch: java.lang.Throwable -> Lc6
        Lc6:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lc8
        Lc8:
            r2 = move-exception
            kotlin.p001io.CloseableKt.closeFinally(r1, r0)
            throw r2
    }

    private final void readJournalLine(java.lang.String r20) throws java.io.IOException {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r6 = 6
            r7 = 0
            r3 = 32
            r4 = 0
            r5 = 0
            int r2 = kotlin.text.StringsKt.indexOf$default(r2, r3, r4, r5, r6, r7)
            java.lang.String r3 = "unexpected journal line: "
            r4 = -1
            if (r2 == r4) goto Led
            int r11 = r2 + 1
            r5 = r1
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r9 = 4
            r10 = 0
            r6 = 32
            r8 = 0
            r7 = r11
            int r5 = kotlin.text.StringsKt.indexOf$default(r5, r6, r7, r8, r9, r10)
            r6 = 0
            java.lang.String r7 = "this as java.lang.String).substring(startIndex)"
            r8 = 2
            r9 = 0
            r10 = 0
            if (r5 != r4) goto L4b
            java.lang.String r12 = r1.substring(r11)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r7)
            r6 = r12
            java.lang.String r12 = okhttp3.internal.cache.DiskLruCache.REMOVE
            int r12 = r12.length()
            if (r2 != r12) goto L55
            java.lang.String r12 = okhttp3.internal.cache.DiskLruCache.REMOVE
            boolean r12 = kotlin.text.StringsKt.startsWith$default(r1, r12, r10, r8, r9)
            if (r12 == 0) goto L55
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r3 = r0.lruEntries
            r3.remove(r6)
            return
        L4b:
            java.lang.String r12 = r1.substring(r11, r5)
            java.lang.String r13 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r13)
            r6 = r12
        L55:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r12 = r0.lruEntries
            java.lang.Object r12 = r12.get(r6)
            okhttp3.internal.cache.DiskLruCache$Entry r12 = (okhttp3.internal.cache.DiskLruCache.Entry) r12
            if (r12 != 0) goto L6c
            okhttp3.internal.cache.DiskLruCache$Entry r13 = new okhttp3.internal.cache.DiskLruCache$Entry
            r13.<init>(r0, r6)
            r12 = r13
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r13 = r0.lruEntries
            java.util.Map r13 = (java.util.Map) r13
            r13.put(r6, r12)
        L6c:
            if (r5 == r4) goto La8
            java.lang.String r13 = okhttp3.internal.cache.DiskLruCache.CLEAN
            int r13 = r13.length()
            if (r2 != r13) goto La8
            java.lang.String r13 = okhttp3.internal.cache.DiskLruCache.CLEAN
            boolean r13 = kotlin.text.StringsKt.startsWith$default(r1, r13, r10, r8, r9)
            if (r13 == 0) goto La8
            int r3 = r5 + 1
            java.lang.String r3 = r1.substring(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
            r13 = r3
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            r3 = 1
            char[] r14 = new char[r3]
            r4 = 32
            r14[r10] = r4
            r17 = 6
            r18 = 0
            r15 = 0
            r16 = 0
            java.util.List r4 = kotlin.text.StringsKt.split$default(r13, r14, r15, r16, r17, r18)
            r12.setReadable$okhttp(r3)
            r12.setCurrentEditor$okhttp(r9)
            r12.setLengths$okhttp(r4)
            goto Ld5
        La8:
            if (r5 != r4) goto Lc3
            java.lang.String r7 = okhttp3.internal.cache.DiskLruCache.DIRTY
            int r7 = r7.length()
            if (r2 != r7) goto Lc3
            java.lang.String r7 = okhttp3.internal.cache.DiskLruCache.DIRTY
            boolean r7 = kotlin.text.StringsKt.startsWith$default(r1, r7, r10, r8, r9)
            if (r7 == 0) goto Lc3
            okhttp3.internal.cache.DiskLruCache$Editor r3 = new okhttp3.internal.cache.DiskLruCache$Editor
            r3.<init>(r0, r12)
            r12.setCurrentEditor$okhttp(r3)
            goto Ld5
        Lc3:
            if (r5 != r4) goto Ld6
            java.lang.String r4 = okhttp3.internal.cache.DiskLruCache.READ
            int r4 = r4.length()
            if (r2 != r4) goto Ld6
            java.lang.String r4 = okhttp3.internal.cache.DiskLruCache.READ
            boolean r4 = kotlin.text.StringsKt.startsWith$default(r1, r4, r10, r8, r9)
            if (r4 == 0) goto Ld6
        Ld5:
            return
        Ld6:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r3 = r7.append(r3)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        Led:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    private final boolean removeOldestEntry() {
            r3 = this;
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r3.lruEntries
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            okhttp3.internal.cache.DiskLruCache$Entry r1 = (okhttp3.internal.cache.DiskLruCache.Entry) r1
            boolean r2 = r1.getZombie$okhttp()
            if (r2 != 0) goto La
            java.lang.String r0 = "toEvict"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            r3.removeEntry$okhttp(r1)
            r0 = 1
            return r0
        L26:
            r0 = 0
            return r0
    }

    private final void validateKey(java.lang.String r4) {
            r3 = this;
            kotlin.text.Regex r0 = okhttp3.internal.cache.DiskLruCache.LEGAL_KEY_PATTERN
            r1 = r4
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = r0.matches(r1)
            if (r0 == 0) goto Lc
            return
        Lc:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "keys must match regex [a-z0-9_-]{1,120}: \""
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            r2 = 34
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.initialized     // Catch: java.lang.Throwable -> L4e
            r1 = 1
            if (r0 == 0) goto L4a
            boolean r0 = r6.closed     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto Lb
            goto L4a
        Lb:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r6.lruEntries     // Catch: java.lang.Throwable -> L4e
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "lruEntries.values"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch: java.lang.Throwable -> L4e
            r2 = 0
            r3 = r0
            r4 = 0
            okhttp3.internal.cache.DiskLruCache$Entry[] r5 = new okhttp3.internal.cache.DiskLruCache.Entry[r4]     // Catch: java.lang.Throwable -> L4e
            java.lang.Object[] r5 = r3.toArray(r5)     // Catch: java.lang.Throwable -> L4e
            okhttp3.internal.cache.DiskLruCache$Entry[] r5 = (okhttp3.internal.cache.DiskLruCache.Entry[]) r5     // Catch: java.lang.Throwable -> L4e
            int r0 = r5.length     // Catch: java.lang.Throwable -> L4e
        L22:
            if (r4 >= r0) goto L38
            r2 = r5[r4]     // Catch: java.lang.Throwable -> L4e
            okhttp3.internal.cache.DiskLruCache$Editor r3 = r2.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L35
            okhttp3.internal.cache.DiskLruCache$Editor r3 = r2.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L35
            r3.detach$okhttp()     // Catch: java.lang.Throwable -> L4e
        L35:
            int r4 = r4 + 1
            goto L22
        L38:
            r6.trimToSize()     // Catch: java.lang.Throwable -> L4e
            okio.BufferedSink r0 = r6.journalWriter     // Catch: java.lang.Throwable -> L4e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> L4e
            r0.close()     // Catch: java.lang.Throwable -> L4e
            r0 = 0
            r6.journalWriter = r0     // Catch: java.lang.Throwable -> L4e
            r6.closed = r1     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r6)
            return
        L4a:
            r6.closed = r1     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r6)
            return
        L4e:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4e
            throw r0
    }

    public final synchronized void completeEdit$okhttp(okhttp3.internal.cache.DiskLruCache.Editor r12, boolean r13) throws java.io.IOException {
            r11 = this;
            monitor-enter(r11)
            java.lang.String r0 = "editor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)     // Catch: java.lang.Throwable -> L14a
            okhttp3.internal.cache.DiskLruCache$Entry r0 = r12.getEntry$okhttp()     // Catch: java.lang.Throwable -> L14a
            okhttp3.internal.cache.DiskLruCache$Editor r1 = r0.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L14a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r12)     // Catch: java.lang.Throwable -> L14a
            if (r1 == 0) goto L13e
            if (r13 == 0) goto L62
            boolean r1 = r0.getReadable$okhttp()     // Catch: java.lang.Throwable -> L14a
            if (r1 != 0) goto L62
            r1 = 0
            int r2 = r11.valueCount     // Catch: java.lang.Throwable -> L14a
        L1f:
            if (r1 >= r2) goto L62
            boolean[] r3 = r12.getWritten$okhttp()     // Catch: java.lang.Throwable -> L14a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Throwable -> L14a
            boolean r3 = r3[r1]     // Catch: java.lang.Throwable -> L14a
            if (r3 == 0) goto L46
            okhttp3.internal.io.FileSystem r3 = r11.fileSystem     // Catch: java.lang.Throwable -> L14a
            java.util.List r4 = r0.getDirtyFiles$okhttp()     // Catch: java.lang.Throwable -> L14a
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L14a
            java.io.File r4 = (java.io.File) r4     // Catch: java.lang.Throwable -> L14a
            boolean r3 = r3.exists(r4)     // Catch: java.lang.Throwable -> L14a
            if (r3 != 0) goto L43
            r12.abort()     // Catch: java.lang.Throwable -> L14a
            monitor-exit(r11)
            return
        L43:
            int r1 = r1 + 1
            goto L1f
        L46:
            r12.abort()     // Catch: java.lang.Throwable -> L14a
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14a
            r3.<init>()     // Catch: java.lang.Throwable -> L14a
            java.lang.String r4 = "Newly created entry didn't create value for index "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L14a
            java.lang.StringBuilder r3 = r3.append(r1)     // Catch: java.lang.Throwable -> L14a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L14a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L14a
            throw r2     // Catch: java.lang.Throwable -> L14a
        L62:
            r1 = 0
            int r2 = r11.valueCount     // Catch: java.lang.Throwable -> L14a
        L65:
            if (r1 >= r2) goto Lb2
            java.util.List r3 = r0.getDirtyFiles$okhttp()     // Catch: java.lang.Throwable -> L14a
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L14a
            java.io.File r3 = (java.io.File) r3     // Catch: java.lang.Throwable -> L14a
            if (r13 == 0) goto Laa
            boolean r4 = r0.getZombie$okhttp()     // Catch: java.lang.Throwable -> L14a
            if (r4 != 0) goto Laa
            okhttp3.internal.io.FileSystem r4 = r11.fileSystem     // Catch: java.lang.Throwable -> L14a
            boolean r4 = r4.exists(r3)     // Catch: java.lang.Throwable -> L14a
            if (r4 == 0) goto Laf
            java.util.List r4 = r0.getCleanFiles$okhttp()     // Catch: java.lang.Throwable -> L14a
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L14a
            java.io.File r4 = (java.io.File) r4     // Catch: java.lang.Throwable -> L14a
            okhttp3.internal.io.FileSystem r5 = r11.fileSystem     // Catch: java.lang.Throwable -> L14a
            r5.rename(r3, r4)     // Catch: java.lang.Throwable -> L14a
            long[] r5 = r0.getLengths$okhttp()     // Catch: java.lang.Throwable -> L14a
            r6 = r5[r1]     // Catch: java.lang.Throwable -> L14a
            r5 = r6
            okhttp3.internal.io.FileSystem r7 = r11.fileSystem     // Catch: java.lang.Throwable -> L14a
            long r7 = r7.size(r4)     // Catch: java.lang.Throwable -> L14a
            long[] r9 = r0.getLengths$okhttp()     // Catch: java.lang.Throwable -> L14a
            r9[r1] = r7     // Catch: java.lang.Throwable -> L14a
            long r9 = r11.size     // Catch: java.lang.Throwable -> L14a
            long r9 = r9 - r5
            long r9 = r9 + r7
            r11.size = r9     // Catch: java.lang.Throwable -> L14a
            goto Laf
        Laa:
            okhttp3.internal.io.FileSystem r4 = r11.fileSystem     // Catch: java.lang.Throwable -> L14a
            r4.delete(r3)     // Catch: java.lang.Throwable -> L14a
        Laf:
            int r1 = r1 + 1
            goto L65
        Lb2:
            r1 = 0
            r0.setCurrentEditor$okhttp(r1)     // Catch: java.lang.Throwable -> L14a
            boolean r1 = r0.getZombie$okhttp()     // Catch: java.lang.Throwable -> L14a
            if (r1 == 0) goto Lc1
            r11.removeEntry$okhttp(r0)     // Catch: java.lang.Throwable -> L14a
            monitor-exit(r11)
            return
        Lc1:
            int r1 = r11.redundantOpCount     // Catch: java.lang.Throwable -> L14a
            r2 = 1
            int r1 = r1 + r2
            r11.redundantOpCount = r1     // Catch: java.lang.Throwable -> L14a
            okio.BufferedSink r1 = r11.journalWriter     // Catch: java.lang.Throwable -> L14a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L14a
            r3 = 0
            boolean r4 = r0.getReadable$okhttp()     // Catch: java.lang.Throwable -> L14a
            r5 = 10
            r6 = 32
            if (r4 != 0) goto Lf7
            if (r13 == 0) goto Lda
            goto Lf7
        Lda:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r2 = r11.lruEntries     // Catch: java.lang.Throwable -> L14a
            java.lang.String r4 = r0.getKey$okhttp()     // Catch: java.lang.Throwable -> L14a
            r2.remove(r4)     // Catch: java.lang.Throwable -> L14a
            java.lang.String r2 = okhttp3.internal.cache.DiskLruCache.REMOVE     // Catch: java.lang.Throwable -> L14a
            okio.BufferedSink r2 = r1.writeUtf8(r2)     // Catch: java.lang.Throwable -> L14a
            r2.writeByte(r6)     // Catch: java.lang.Throwable -> L14a
            java.lang.String r2 = r0.getKey$okhttp()     // Catch: java.lang.Throwable -> L14a
            r1.writeUtf8(r2)     // Catch: java.lang.Throwable -> L14a
            r1.writeByte(r5)     // Catch: java.lang.Throwable -> L14a
            goto L11c
        Lf7:
            r0.setReadable$okhttp(r2)     // Catch: java.lang.Throwable -> L14a
            java.lang.String r2 = okhttp3.internal.cache.DiskLruCache.CLEAN     // Catch: java.lang.Throwable -> L14a
            okio.BufferedSink r2 = r1.writeUtf8(r2)     // Catch: java.lang.Throwable -> L14a
            r2.writeByte(r6)     // Catch: java.lang.Throwable -> L14a
            java.lang.String r2 = r0.getKey$okhttp()     // Catch: java.lang.Throwable -> L14a
            r1.writeUtf8(r2)     // Catch: java.lang.Throwable -> L14a
            r0.writeLengths$okhttp(r1)     // Catch: java.lang.Throwable -> L14a
            r1.writeByte(r5)     // Catch: java.lang.Throwable -> L14a
            if (r13 == 0) goto L11c
            long r4 = r11.nextSequenceNumber     // Catch: java.lang.Throwable -> L14a
            r6 = 1
            long r6 = r6 + r4
            r11.nextSequenceNumber = r6     // Catch: java.lang.Throwable -> L14a
            r0.setSequenceNumber$okhttp(r4)     // Catch: java.lang.Throwable -> L14a
        L11c:
            r1.flush()     // Catch: java.lang.Throwable -> L14a
            long r1 = r11.size     // Catch: java.lang.Throwable -> L14a
            long r3 = r11.maxSize     // Catch: java.lang.Throwable -> L14a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L12f
            boolean r1 = r11.journalRebuildRequired()     // Catch: java.lang.Throwable -> L14a
            if (r1 == 0) goto L13c
        L12f:
            okhttp3.internal.concurrent.TaskQueue r1 = r11.cleanupQueue     // Catch: java.lang.Throwable -> L14a
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r2 = r11.cleanupTask     // Catch: java.lang.Throwable -> L14a
            okhttp3.internal.concurrent.Task r2 = (okhttp3.internal.concurrent.Task) r2     // Catch: java.lang.Throwable -> L14a
            r5 = 2
            r6 = 0
            r3 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r1, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L14a
        L13c:
            monitor-exit(r11)
            return
        L13e:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L14a
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L14a
            throw r2     // Catch: java.lang.Throwable -> L14a
        L14a:
            r12 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L14a
            throw r12
    }

    public final void delete() throws java.io.IOException {
            r2 = this;
            r2.close()
            okhttp3.internal.io.FileSystem r0 = r2.fileSystem
            java.io.File r1 = r2.directory
            r0.deleteContents(r1)
            return
    }

    public final okhttp3.internal.cache.DiskLruCache.Editor edit(java.lang.String r8) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            r1 = r7
            r2 = r8
            okhttp3.internal.cache.DiskLruCache$Editor r0 = edit$default(r1, r2, r3, r5, r6)
            return r0
    }

    public final synchronized okhttp3.internal.cache.DiskLruCache.Editor edit(java.lang.String r10, long r11) throws java.io.IOException {
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)     // Catch: java.lang.Throwable -> L95
            r9.initialize()     // Catch: java.lang.Throwable -> L95
            r9.checkNotClosed()     // Catch: java.lang.Throwable -> L95
            r9.validateKey(r10)     // Catch: java.lang.Throwable -> L95
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r9.lruEntries     // Catch: java.lang.Throwable -> L95
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Throwable -> L95
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch: java.lang.Throwable -> L95
            long r1 = okhttp3.internal.cache.DiskLruCache.ANY_SEQUENCE_NUMBER     // Catch: java.lang.Throwable -> L95
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L2a
            if (r0 == 0) goto L28
            long r3 = r0.getSequenceNumber$okhttp()     // Catch: java.lang.Throwable -> L95
            int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r1 == 0) goto L2a
        L28:
            monitor-exit(r9)
            return r2
        L2a:
            if (r0 == 0) goto L31
            okhttp3.internal.cache.DiskLruCache$Editor r1 = r0.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L95
            goto L32
        L31:
            r1 = r2
        L32:
            if (r1 == 0) goto L36
            monitor-exit(r9)
            return r2
        L36:
            if (r0 == 0) goto L40
            int r1 = r0.getLockingSourceCount$okhttp()     // Catch: java.lang.Throwable -> L95
            if (r1 == 0) goto L40
            monitor-exit(r9)
            return r2
        L40:
            boolean r1 = r9.mostRecentTrimFailed     // Catch: java.lang.Throwable -> L95
            if (r1 != 0) goto L85
            boolean r1 = r9.mostRecentRebuildFailed     // Catch: java.lang.Throwable -> L95
            if (r1 == 0) goto L49
            goto L85
        L49:
            okio.BufferedSink r1 = r9.journalWriter     // Catch: java.lang.Throwable -> L95
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = okhttp3.internal.cache.DiskLruCache.DIRTY     // Catch: java.lang.Throwable -> L95
            okio.BufferedSink r3 = r1.writeUtf8(r3)     // Catch: java.lang.Throwable -> L95
            r4 = 32
            okio.BufferedSink r3 = r3.writeByte(r4)     // Catch: java.lang.Throwable -> L95
            okio.BufferedSink r3 = r3.writeUtf8(r10)     // Catch: java.lang.Throwable -> L95
            r4 = 10
            r3.writeByte(r4)     // Catch: java.lang.Throwable -> L95
            r1.flush()     // Catch: java.lang.Throwable -> L95
            boolean r3 = r9.hasJournalErrors     // Catch: java.lang.Throwable -> L95
            if (r3 == 0) goto L6c
            monitor-exit(r9)
            return r2
        L6c:
            if (r0 != 0) goto L7b
            okhttp3.internal.cache.DiskLruCache$Entry r2 = new okhttp3.internal.cache.DiskLruCache$Entry     // Catch: java.lang.Throwable -> L95
            r2.<init>(r9, r10)     // Catch: java.lang.Throwable -> L95
            r0 = r2
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r2 = r9.lruEntries     // Catch: java.lang.Throwable -> L95
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L95
            r2.put(r10, r0)     // Catch: java.lang.Throwable -> L95
        L7b:
            okhttp3.internal.cache.DiskLruCache$Editor r2 = new okhttp3.internal.cache.DiskLruCache$Editor     // Catch: java.lang.Throwable -> L95
            r2.<init>(r9, r0)     // Catch: java.lang.Throwable -> L95
            r0.setCurrentEditor$okhttp(r2)     // Catch: java.lang.Throwable -> L95
            monitor-exit(r9)
            return r2
        L85:
            okhttp3.internal.concurrent.TaskQueue r3 = r9.cleanupQueue     // Catch: java.lang.Throwable -> L95
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r1 = r9.cleanupTask     // Catch: java.lang.Throwable -> L95
            r4 = r1
            okhttp3.internal.concurrent.Task r4 = (okhttp3.internal.concurrent.Task) r4     // Catch: java.lang.Throwable -> L95
            r7 = 2
            r8 = 0
            r5 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L95
            monitor-exit(r9)
            return r2
        L95:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L95
            throw r10
    }

    public final synchronized void evictAll() throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            r6.initialize()     // Catch: java.lang.Throwable -> L30
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r6.lruEntries     // Catch: java.lang.Throwable -> L30
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = "lruEntries.values"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Throwable -> L30
            r1 = 0
            r2 = r0
            r3 = 0
            okhttp3.internal.cache.DiskLruCache$Entry[] r4 = new okhttp3.internal.cache.DiskLruCache.Entry[r3]     // Catch: java.lang.Throwable -> L30
            java.lang.Object[] r4 = r2.toArray(r4)     // Catch: java.lang.Throwable -> L30
            okhttp3.internal.cache.DiskLruCache$Entry[] r4 = (okhttp3.internal.cache.DiskLruCache.Entry[]) r4     // Catch: java.lang.Throwable -> L30
            int r0 = r4.length     // Catch: java.lang.Throwable -> L30
            r1 = r3
        L1c:
            if (r1 >= r0) goto L2c
            r2 = r4[r1]     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = "entry"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)     // Catch: java.lang.Throwable -> L30
            r6.removeEntry$okhttp(r2)     // Catch: java.lang.Throwable -> L30
            int r1 = r1 + 1
            goto L1c
        L2c:
            r6.mostRecentTrimFailed = r3     // Catch: java.lang.Throwable -> L30
            monitor-exit(r6)
            return
        L30:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L30
            throw r0
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.initialized     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L7
            monitor-exit(r1)
            return
        L7:
            r1.checkNotClosed()     // Catch: java.lang.Throwable -> L17
            r1.trimToSize()     // Catch: java.lang.Throwable -> L17
            okio.BufferedSink r0 = r1.journalWriter     // Catch: java.lang.Throwable -> L17
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> L17
            r0.flush()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            return
        L17:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    public final synchronized okhttp3.internal.cache.DiskLruCache.Snapshot get(java.lang.String r10) throws java.io.IOException {
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)     // Catch: java.lang.Throwable -> L5b
            r9.initialize()     // Catch: java.lang.Throwable -> L5b
            r9.checkNotClosed()     // Catch: java.lang.Throwable -> L5b
            r9.validateKey(r10)     // Catch: java.lang.Throwable -> L5b
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r9.lruEntries     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Throwable -> L5b
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch: java.lang.Throwable -> L5b
            r1 = 0
            if (r0 != 0) goto L1c
            monitor-exit(r9)
            return r1
        L1c:
            okhttp3.internal.cache.DiskLruCache$Snapshot r2 = r0.snapshot$okhttp()     // Catch: java.lang.Throwable -> L5b
            if (r2 != 0) goto L24
            monitor-exit(r9)
            return r1
        L24:
            r1 = r2
            int r2 = r9.redundantOpCount     // Catch: java.lang.Throwable -> L5b
            int r2 = r2 + 1
            r9.redundantOpCount = r2     // Catch: java.lang.Throwable -> L5b
            okio.BufferedSink r2 = r9.journalWriter     // Catch: java.lang.Throwable -> L5b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = okhttp3.internal.cache.DiskLruCache.READ     // Catch: java.lang.Throwable -> L5b
            okio.BufferedSink r2 = r2.writeUtf8(r3)     // Catch: java.lang.Throwable -> L5b
            r3 = 32
            okio.BufferedSink r2 = r2.writeByte(r3)     // Catch: java.lang.Throwable -> L5b
            okio.BufferedSink r2 = r2.writeUtf8(r10)     // Catch: java.lang.Throwable -> L5b
            r3 = 10
            r2.writeByte(r3)     // Catch: java.lang.Throwable -> L5b
            boolean r2 = r9.journalRebuildRequired()     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L59
            okhttp3.internal.concurrent.TaskQueue r3 = r9.cleanupQueue     // Catch: java.lang.Throwable -> L5b
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r2 = r9.cleanupTask     // Catch: java.lang.Throwable -> L5b
            r4 = r2
            okhttp3.internal.concurrent.Task r4 = (okhttp3.internal.concurrent.Task) r4     // Catch: java.lang.Throwable -> L5b
            r7 = 2
            r8 = 0
            r5 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L5b
        L59:
            monitor-exit(r9)
            return r1
        L5b:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L5b
            throw r10
    }

    public final boolean getClosed$okhttp() {
            r1 = this;
            boolean r0 = r1.closed
            return r0
    }

    public final java.io.File getDirectory() {
            r1 = this;
            java.io.File r0 = r1.directory
            return r0
    }

    public final okhttp3.internal.p003io.FileSystem getFileSystem$okhttp() {
            r1 = this;
            okhttp3.internal.io.FileSystem r0 = r1.fileSystem
            return r0
    }

    public final java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache.Entry> getLruEntries$okhttp() {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r1.lruEntries
            return r0
    }

    public final synchronized long getMaxSize() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.maxSize     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final int getValueCount$okhttp() {
            r1 = this;
            int r0 = r1.valueCount
            return r0
    }

    public final synchronized void initialize() throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            r0 = r6
            r1 = 0
            boolean r2 = okhttp3.internal.Util.assertionsEnabled     // Catch: java.lang.Throwable -> Ld0
            if (r2 == 0) goto L39
            boolean r2 = java.lang.Thread.holdsLock(r0)     // Catch: java.lang.Throwable -> Ld0
            if (r2 == 0) goto Le
            goto L39
        Le:
            java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> Ld0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld0
            r3.<init>()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r4 = "Thread "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Ld0
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> Ld0
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r4 = " MUST hold lock on "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Ld0
            java.lang.StringBuilder r3 = r3.append(r0)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Ld0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Ld0
            throw r2     // Catch: java.lang.Throwable -> Ld0
        L39:
            boolean r0 = r6.initialized     // Catch: java.lang.Throwable -> Ld0
            if (r0 == 0) goto L40
            monitor-exit(r6)
            return
        L40:
            okhttp3.internal.io.FileSystem r0 = r6.fileSystem     // Catch: java.lang.Throwable -> Ld0
            java.io.File r1 = r6.journalFileBackup     // Catch: java.lang.Throwable -> Ld0
            boolean r0 = r0.exists(r1)     // Catch: java.lang.Throwable -> Ld0
            if (r0 == 0) goto L65
            okhttp3.internal.io.FileSystem r0 = r6.fileSystem     // Catch: java.lang.Throwable -> Ld0
            java.io.File r1 = r6.journalFile     // Catch: java.lang.Throwable -> Ld0
            boolean r0 = r0.exists(r1)     // Catch: java.lang.Throwable -> Ld0
            if (r0 == 0) goto L5c
            okhttp3.internal.io.FileSystem r0 = r6.fileSystem     // Catch: java.lang.Throwable -> Ld0
            java.io.File r1 = r6.journalFileBackup     // Catch: java.lang.Throwable -> Ld0
            r0.delete(r1)     // Catch: java.lang.Throwable -> Ld0
            goto L65
        L5c:
            okhttp3.internal.io.FileSystem r0 = r6.fileSystem     // Catch: java.lang.Throwable -> Ld0
            java.io.File r1 = r6.journalFileBackup     // Catch: java.lang.Throwable -> Ld0
            java.io.File r2 = r6.journalFile     // Catch: java.lang.Throwable -> Ld0
            r0.rename(r1, r2)     // Catch: java.lang.Throwable -> Ld0
        L65:
            okhttp3.internal.io.FileSystem r0 = r6.fileSystem     // Catch: java.lang.Throwable -> Ld0
            java.io.File r1 = r6.journalFileBackup     // Catch: java.lang.Throwable -> Ld0
            boolean r0 = okhttp3.internal.Util.isCivilized(r0, r1)     // Catch: java.lang.Throwable -> Ld0
            r6.civilizedFileSystem = r0     // Catch: java.lang.Throwable -> Ld0
            okhttp3.internal.io.FileSystem r0 = r6.fileSystem     // Catch: java.lang.Throwable -> Ld0
            java.io.File r1 = r6.journalFile     // Catch: java.lang.Throwable -> Ld0
            boolean r0 = r0.exists(r1)     // Catch: java.lang.Throwable -> Ld0
            r1 = 1
            if (r0 == 0) goto Lc9
        L7b:
            r6.readJournal()     // Catch: java.io.IOException -> L85 java.lang.Throwable -> Ld0
            r6.processJournal()     // Catch: java.io.IOException -> L85 java.lang.Throwable -> Ld0
            r6.initialized = r1     // Catch: java.io.IOException -> L85 java.lang.Throwable -> Ld0
            monitor-exit(r6)
            return
        L85:
            r0 = move-exception
            okhttp3.internal.platform.Platform$Companion r2 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.Throwable -> Ld0
            okhttp3.internal.platform.Platform r2 = r2.get()     // Catch: java.lang.Throwable -> Ld0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld0
            r3.<init>()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r4 = "DiskLruCache "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Ld0
            java.io.File r4 = r6.directory     // Catch: java.lang.Throwable -> Ld0
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r4 = " is corrupt: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> Ld0
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r4 = ", removing"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Ld0
            r4 = r0
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Throwable -> Ld0
            r5 = 5
            r2.log(r3, r5, r4)     // Catch: java.lang.Throwable -> Ld0
            r0 = 0
            r6.delete()     // Catch: java.lang.Throwable -> Lc5
            r6.closed = r0     // Catch: java.lang.Throwable -> Ld0
            goto Lc9
        Lc5:
            r1 = move-exception
            r6.closed = r0     // Catch: java.lang.Throwable -> Ld0
            throw r1     // Catch: java.lang.Throwable -> Ld0
        Lc9:
            r6.rebuildJournal$okhttp()     // Catch: java.lang.Throwable -> Ld0
            r6.initialized = r1     // Catch: java.lang.Throwable -> Ld0
            monitor-exit(r6)
            return
        Ld0:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Ld0
            throw r0
    }

    public final synchronized boolean isClosed() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.closed     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final synchronized void rebuildJournal$okhttp() throws java.io.IOException {
            r8 = this;
            monitor-enter(r8)
            okio.BufferedSink r0 = r8.journalWriter     // Catch: java.lang.Throwable -> Lcc
            if (r0 == 0) goto L8
            r0.close()     // Catch: java.lang.Throwable -> Lcc
        L8:
            okhttp3.internal.io.FileSystem r0 = r8.fileSystem     // Catch: java.lang.Throwable -> Lcc
            java.io.File r1 = r8.journalFileTmp     // Catch: java.lang.Throwable -> Lcc
            okio.Sink r0 = r0.sink(r1)     // Catch: java.lang.Throwable -> Lcc
            okio.BufferedSink r0 = okio.Okio.buffer(r0)     // Catch: java.lang.Throwable -> Lcc
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch: java.lang.Throwable -> Lcc
            r1 = r0
            okio.BufferedSink r1 = (okio.BufferedSink) r1     // Catch: java.lang.Throwable -> Lc5
            r2 = 0
            java.lang.String r3 = okhttp3.internal.cache.DiskLruCache.MAGIC     // Catch: java.lang.Throwable -> Lc5
            okio.BufferedSink r3 = r1.writeUtf8(r3)     // Catch: java.lang.Throwable -> Lc5
            r4 = 10
            r3.writeByte(r4)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r3 = okhttp3.internal.cache.DiskLruCache.VERSION_1     // Catch: java.lang.Throwable -> Lc5
            okio.BufferedSink r3 = r1.writeUtf8(r3)     // Catch: java.lang.Throwable -> Lc5
            r3.writeByte(r4)     // Catch: java.lang.Throwable -> Lc5
            int r3 = r8.appVersion     // Catch: java.lang.Throwable -> Lc5
            long r5 = (long) r3     // Catch: java.lang.Throwable -> Lc5
            okio.BufferedSink r3 = r1.writeDecimalLong(r5)     // Catch: java.lang.Throwable -> Lc5
            r3.writeByte(r4)     // Catch: java.lang.Throwable -> Lc5
            int r3 = r8.valueCount     // Catch: java.lang.Throwable -> Lc5
            long r5 = (long) r3     // Catch: java.lang.Throwable -> Lc5
            okio.BufferedSink r3 = r1.writeDecimalLong(r5)     // Catch: java.lang.Throwable -> Lc5
            r3.writeByte(r4)     // Catch: java.lang.Throwable -> Lc5
            r1.writeByte(r4)     // Catch: java.lang.Throwable -> Lc5
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r3 = r8.lruEntries     // Catch: java.lang.Throwable -> Lc5
            java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> Lc5
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lc5
        L4f:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> Lc5
            if (r5 == 0) goto L8e
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> Lc5
            okhttp3.internal.cache.DiskLruCache$Entry r5 = (okhttp3.internal.cache.DiskLruCache.Entry) r5     // Catch: java.lang.Throwable -> Lc5
            okhttp3.internal.cache.DiskLruCache$Editor r6 = r5.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> Lc5
            r7 = 32
            if (r6 == 0) goto L77
            java.lang.String r6 = okhttp3.internal.cache.DiskLruCache.DIRTY     // Catch: java.lang.Throwable -> Lc5
            okio.BufferedSink r6 = r1.writeUtf8(r6)     // Catch: java.lang.Throwable -> Lc5
            r6.writeByte(r7)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r6 = r5.getKey$okhttp()     // Catch: java.lang.Throwable -> Lc5
            r1.writeUtf8(r6)     // Catch: java.lang.Throwable -> Lc5
            r1.writeByte(r4)     // Catch: java.lang.Throwable -> Lc5
            goto L4f
        L77:
            java.lang.String r6 = okhttp3.internal.cache.DiskLruCache.CLEAN     // Catch: java.lang.Throwable -> Lc5
            okio.BufferedSink r6 = r1.writeUtf8(r6)     // Catch: java.lang.Throwable -> Lc5
            r6.writeByte(r7)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r6 = r5.getKey$okhttp()     // Catch: java.lang.Throwable -> Lc5
            r1.writeUtf8(r6)     // Catch: java.lang.Throwable -> Lc5
            r5.writeLengths$okhttp(r1)     // Catch: java.lang.Throwable -> Lc5
            r1.writeByte(r4)     // Catch: java.lang.Throwable -> Lc5
            goto L4f
        L8e:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lc5
            r1 = 0
            kotlin.p001io.CloseableKt.closeFinally(r0, r1)     // Catch: java.lang.Throwable -> Lcc
            okhttp3.internal.io.FileSystem r0 = r8.fileSystem     // Catch: java.lang.Throwable -> Lcc
            java.io.File r1 = r8.journalFile     // Catch: java.lang.Throwable -> Lcc
            boolean r0 = r0.exists(r1)     // Catch: java.lang.Throwable -> Lcc
            if (r0 == 0) goto La8
            okhttp3.internal.io.FileSystem r0 = r8.fileSystem     // Catch: java.lang.Throwable -> Lcc
            java.io.File r1 = r8.journalFile     // Catch: java.lang.Throwable -> Lcc
            java.io.File r2 = r8.journalFileBackup     // Catch: java.lang.Throwable -> Lcc
            r0.rename(r1, r2)     // Catch: java.lang.Throwable -> Lcc
        La8:
            okhttp3.internal.io.FileSystem r0 = r8.fileSystem     // Catch: java.lang.Throwable -> Lcc
            java.io.File r1 = r8.journalFileTmp     // Catch: java.lang.Throwable -> Lcc
            java.io.File r2 = r8.journalFile     // Catch: java.lang.Throwable -> Lcc
            r0.rename(r1, r2)     // Catch: java.lang.Throwable -> Lcc
            okhttp3.internal.io.FileSystem r0 = r8.fileSystem     // Catch: java.lang.Throwable -> Lcc
            java.io.File r1 = r8.journalFileBackup     // Catch: java.lang.Throwable -> Lcc
            r0.delete(r1)     // Catch: java.lang.Throwable -> Lcc
            okio.BufferedSink r0 = r8.newJournalWriter()     // Catch: java.lang.Throwable -> Lcc
            r8.journalWriter = r0     // Catch: java.lang.Throwable -> Lcc
            r0 = 0
            r8.hasJournalErrors = r0     // Catch: java.lang.Throwable -> Lcc
            r8.mostRecentRebuildFailed = r0     // Catch: java.lang.Throwable -> Lcc
            monitor-exit(r8)
            return
        Lc5:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> Lc7
        Lc7:
            r2 = move-exception
            kotlin.p001io.CloseableKt.closeFinally(r0, r1)     // Catch: java.lang.Throwable -> Lcc
            throw r2     // Catch: java.lang.Throwable -> Lcc
        Lcc:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lcc
            throw r0
    }

    public final synchronized boolean remove(java.lang.String r8) throws java.io.IOException {
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)     // Catch: java.lang.Throwable -> L2e
            r7.initialize()     // Catch: java.lang.Throwable -> L2e
            r7.checkNotClosed()     // Catch: java.lang.Throwable -> L2e
            r7.validateKey(r8)     // Catch: java.lang.Throwable -> L2e
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r7.lruEntries     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L2e
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            if (r0 != 0) goto L1c
            monitor-exit(r7)
            return r1
        L1c:
            boolean r2 = r7.removeEntry$okhttp(r0)     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L2c
            long r3 = r7.size     // Catch: java.lang.Throwable -> L2e
            long r5 = r7.maxSize     // Catch: java.lang.Throwable -> L2e
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L2c
            r7.mostRecentTrimFailed = r1     // Catch: java.lang.Throwable -> L2e
        L2c:
            monitor-exit(r7)
            return r2
        L2e:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2e
            throw r8
    }

    public final boolean removeEntry$okhttp(okhttp3.internal.cache.DiskLruCache.Entry r11) throws java.io.IOException {
            r10 = this;
            java.lang.String r0 = "entry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            boolean r0 = r10.civilizedFileSystem
            r1 = 10
            r2 = 32
            r3 = 1
            if (r0 != 0) goto L40
            int r0 = r11.getLockingSourceCount$okhttp()
            if (r0 <= 0) goto L30
            okio.BufferedSink r0 = r10.journalWriter
            if (r0 == 0) goto L30
            r4 = 0
            java.lang.String r5 = okhttp3.internal.cache.DiskLruCache.DIRTY
            r0.writeUtf8(r5)
            r0.writeByte(r2)
            java.lang.String r5 = r11.getKey$okhttp()
            r0.writeUtf8(r5)
            r0.writeByte(r1)
            r0.flush()
        L30:
            int r0 = r11.getLockingSourceCount$okhttp()
            if (r0 > 0) goto L3c
            okhttp3.internal.cache.DiskLruCache$Editor r0 = r11.getCurrentEditor$okhttp()
            if (r0 == 0) goto L40
        L3c:
            r11.setZombie$okhttp(r3)
            return r3
        L40:
            okhttp3.internal.cache.DiskLruCache$Editor r0 = r11.getCurrentEditor$okhttp()
            if (r0 == 0) goto L49
            r0.detach$okhttp()
        L49:
            r0 = 0
            int r4 = r10.valueCount
        L4c:
            if (r0 >= r4) goto L73
            okhttp3.internal.io.FileSystem r5 = r10.fileSystem
            java.util.List r6 = r11.getCleanFiles$okhttp()
            java.lang.Object r6 = r6.get(r0)
            java.io.File r6 = (java.io.File) r6
            r5.delete(r6)
            long r5 = r10.size
            long[] r7 = r11.getLengths$okhttp()
            r8 = r7[r0]
            long r5 = r5 - r8
            r10.size = r5
            long[] r5 = r11.getLengths$okhttp()
            r6 = 0
            r5[r0] = r6
            int r0 = r0 + 1
            goto L4c
        L73:
            int r0 = r10.redundantOpCount
            int r0 = r0 + r3
            r10.redundantOpCount = r0
            okio.BufferedSink r0 = r10.journalWriter
            if (r0 == 0) goto L90
            r4 = 0
            java.lang.String r5 = okhttp3.internal.cache.DiskLruCache.REMOVE
            r0.writeUtf8(r5)
            r0.writeByte(r2)
            java.lang.String r2 = r11.getKey$okhttp()
            r0.writeUtf8(r2)
            r0.writeByte(r1)
        L90:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r10.lruEntries
            java.lang.String r1 = r11.getKey$okhttp()
            r0.remove(r1)
            boolean r0 = r10.journalRebuildRequired()
            if (r0 == 0) goto Lad
            okhttp3.internal.concurrent.TaskQueue r4 = r10.cleanupQueue
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r0 = r10.cleanupTask
            r5 = r0
            okhttp3.internal.concurrent.Task r5 = (okhttp3.internal.concurrent.Task) r5
            r8 = 2
            r9 = 0
            r6 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r4, r5, r6, r8, r9)
        Lad:
            return r3
    }

    public final void setClosed$okhttp(boolean r1) {
            r0 = this;
            r0.closed = r1
            return
    }

    public final synchronized void setMaxSize(long r8) {
            r7 = this;
            monitor-enter(r7)
            r7.maxSize = r8     // Catch: java.lang.Throwable -> L17
            boolean r0 = r7.initialized     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L15
            okhttp3.internal.concurrent.TaskQueue r1 = r7.cleanupQueue     // Catch: java.lang.Throwable -> L17
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r0 = r7.cleanupTask     // Catch: java.lang.Throwable -> L17
            r2 = r0
            okhttp3.internal.concurrent.Task r2 = (okhttp3.internal.concurrent.Task) r2     // Catch: java.lang.Throwable -> L17
            r5 = 2
            r6 = 0
            r3 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r1, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L17
        L15:
            monitor-exit(r7)
            return
        L17:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L17
            throw r8
    }

    public final synchronized long size() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            r2.initialize()     // Catch: java.lang.Throwable -> L8
            long r0 = r2.size     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)
            return r0
        L8:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    public final synchronized java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Snapshot> snapshots() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r1.initialize()     // Catch: java.lang.Throwable -> Ld
            okhttp3.internal.cache.DiskLruCache$snapshots$1 r0 = new okhttp3.internal.cache.DiskLruCache$snapshots$1     // Catch: java.lang.Throwable -> Ld
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld
            java.util.Iterator r0 = (java.util.Iterator) r0     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return r0
        Ld:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    public final void trimToSize() throws java.io.IOException {
            r4 = this;
        L1:
            long r0 = r4.size
            long r2 = r4.maxSize
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L10
            boolean r0 = r4.removeOldestEntry()
            if (r0 != 0) goto L1
            return
        L10:
            r0 = 0
            r4.mostRecentTrimFailed = r0
            return
    }
}
