package okhttp3.internal.cache;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class DiskLruCache implements java.io.Closeable, java.io.Flushable {
    public static final long ANY_SEQUENCE_NUMBER = 0;
    public static final java.lang.String CLEAN = null;
    public static final okhttp3.internal.cache.DiskLruCache.Companion Companion = null;
    public static final java.lang.String DIRTY = null;
    public static final java.lang.String JOURNAL_FILE = null;
    public static final java.lang.String JOURNAL_FILE_BACKUP = null;
    public static final java.lang.String JOURNAL_FILE_TEMP = null;
    public static final og.k LEGAL_KEY_PATTERN = null;
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
    private final okhttp3.internal.io.FileSystem fileSystem;
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
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class Editor {
        private boolean done;
        private final okhttp3.internal.cache.DiskLruCache.Entry entry;
        final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;
        private final boolean[] written;

        public Editor(okhttp3.internal.cache.DiskLruCache r1, okhttp3.internal.cache.DiskLruCache.Entry r2) {
                r0 = this;
                r2.getClass()
                r0.this$0 = r1
                r0.<init>()
                r0.entry = r2
                boolean r2 = r2.getReadable$okhttp()
                if (r2 == 0) goto L12
                r1 = 0
                goto L18
            L12:
                int r1 = r1.getValueCount$okhttp()
                boolean[] r1 = new boolean[r1]
            L18:
                r0.written = r1
                return
        }

        public final void abort() {
                r3 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r3.this$0
                monitor-enter(r0)
                boolean r1 = r3.done     // Catch: java.lang.Throwable -> L18
                if (r1 != 0) goto L1f
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.entry     // Catch: java.lang.Throwable -> L18
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L18
                boolean r1 = gg.l.a(r1, r3)     // Catch: java.lang.Throwable -> L18
                if (r1 == 0) goto L1a
                r1 = 0
                r0.completeEdit$okhttp(r3, r1)     // Catch: java.lang.Throwable -> L18
                goto L1a
            L18:
                r1 = move-exception
                goto L27
            L1a:
                r1 = 1
                r3.done = r1     // Catch: java.lang.Throwable -> L18
                monitor-exit(r0)
                return
            L1f:
                java.lang.String r1 = "Check failed."
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
                r2.<init>(r1)     // Catch: java.lang.Throwable -> L18
                throw r2     // Catch: java.lang.Throwable -> L18
            L27:
                monitor-exit(r0)
                throw r1
        }

        public final void commit() {
                r3 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r3.this$0
                monitor-enter(r0)
                boolean r1 = r3.done     // Catch: java.lang.Throwable -> L18
                if (r1 != 0) goto L1e
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.entry     // Catch: java.lang.Throwable -> L18
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L18
                boolean r1 = gg.l.a(r1, r3)     // Catch: java.lang.Throwable -> L18
                r2 = 1
                if (r1 == 0) goto L1a
                r0.completeEdit$okhttp(r3, r2)     // Catch: java.lang.Throwable -> L18
                goto L1a
            L18:
                r1 = move-exception
                goto L26
            L1a:
                r3.done = r2     // Catch: java.lang.Throwable -> L18
                monitor-exit(r0)
                return
            L1e:
                java.lang.String r1 = "Check failed."
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
                r2.<init>(r1)     // Catch: java.lang.Throwable -> L18
                throw r2     // Catch: java.lang.Throwable -> L18
            L26:
                monitor-exit(r0)
                throw r1
        }

        public final void detach$okhttp() {
                r2 = this;
                okhttp3.internal.cache.DiskLruCache$Entry r0 = r2.entry
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r0.getCurrentEditor$okhttp()
                boolean r0 = gg.l.a(r0, r2)
                if (r0 == 0) goto L21
                okhttp3.internal.cache.DiskLruCache r0 = r2.this$0
                boolean r0 = okhttp3.internal.cache.DiskLruCache.access$getCivilizedFileSystem$p(r0)
                if (r0 == 0) goto L1b
                okhttp3.internal.cache.DiskLruCache r0 = r2.this$0
                r1 = 0
                r0.completeEdit$okhttp(r2, r1)
                return
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

        public final okio.Sink newSink(int r4) {
                r3 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r3.this$0
                monitor-enter(r0)
                boolean r1 = r3.done     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto L51
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.entry     // Catch: java.lang.Throwable -> L19
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L19
                boolean r1 = gg.l.a(r1, r3)     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto L1b
                okio.Sink r4 = okio.Okio.blackhole()     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)
                return r4
            L19:
                r4 = move-exception
                goto L59
            L1b:
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.entry     // Catch: java.lang.Throwable -> L19
                boolean r1 = r1.getReadable$okhttp()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto L2b
                boolean[] r1 = r3.written     // Catch: java.lang.Throwable -> L19
                r1.getClass()     // Catch: java.lang.Throwable -> L19
                r2 = 1
                r1[r4] = r2     // Catch: java.lang.Throwable -> L19
            L2b:
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.entry     // Catch: java.lang.Throwable -> L19
                java.util.List r1 = r1.getDirtyFiles$okhttp()     // Catch: java.lang.Throwable -> L19
                java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L19
                java.io.File r4 = (java.io.File) r4     // Catch: java.lang.Throwable -> L19
                okhttp3.internal.io.FileSystem r1 = r0.getFileSystem$okhttp()     // Catch: java.lang.Throwable -> L19 java.io.FileNotFoundException -> L4b
                okio.Sink r4 = r1.sink(r4)     // Catch: java.lang.Throwable -> L19 java.io.FileNotFoundException -> L4b
                okhttp3.internal.cache.FaultHidingSink r1 = new okhttp3.internal.cache.FaultHidingSink     // Catch: java.lang.Throwable -> L19
                okhttp3.internal.cache.DiskLruCache$Editor$newSink$1$1 r2 = new okhttp3.internal.cache.DiskLruCache$Editor$newSink$1$1     // Catch: java.lang.Throwable -> L19
                r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L19
                r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)
                return r1
            L4b:
                okio.Sink r4 = okio.Okio.blackhole()     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)
                return r4
            L51:
                java.lang.String r4 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19
                r1.<init>(r4)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.Throwable -> L19
            L59:
                monitor-exit(r0)
                throw r4
        }

        public final okio.Source newSource(int r5) {
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r4.this$0
                monitor-enter(r0)
                boolean r1 = r4.done     // Catch: java.lang.Throwable -> L3a
                if (r1 != 0) goto L40
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch: java.lang.Throwable -> L3a
                boolean r1 = r1.getReadable$okhttp()     // Catch: java.lang.Throwable -> L3a
                r2 = 0
                if (r1 == 0) goto L3e
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch: java.lang.Throwable -> L3a
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L3a
                boolean r1 = gg.l.a(r1, r4)     // Catch: java.lang.Throwable -> L3a
                if (r1 == 0) goto L3e
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch: java.lang.Throwable -> L3a
                boolean r1 = r1.getZombie$okhttp()     // Catch: java.lang.Throwable -> L3a
                if (r1 == 0) goto L25
                goto L3e
            L25:
                okhttp3.internal.io.FileSystem r1 = r0.getFileSystem$okhttp()     // Catch: java.lang.Throwable -> L3a java.io.FileNotFoundException -> L3c
                okhttp3.internal.cache.DiskLruCache$Entry r3 = r4.entry     // Catch: java.lang.Throwable -> L3a java.io.FileNotFoundException -> L3c
                java.util.List r3 = r3.getCleanFiles$okhttp()     // Catch: java.lang.Throwable -> L3a java.io.FileNotFoundException -> L3c
                java.lang.Object r5 = r3.get(r5)     // Catch: java.lang.Throwable -> L3a java.io.FileNotFoundException -> L3c
                java.io.File r5 = (java.io.File) r5     // Catch: java.lang.Throwable -> L3a java.io.FileNotFoundException -> L3c
                okio.Source r2 = r1.source(r5)     // Catch: java.lang.Throwable -> L3a java.io.FileNotFoundException -> L3c
                goto L3c
            L3a:
                r5 = move-exception
                goto L48
            L3c:
                monitor-exit(r0)
                return r2
            L3e:
                monitor-exit(r0)
                return r2
            L40:
                java.lang.String r5 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3a
                r1.<init>(r5)     // Catch: java.lang.Throwable -> L3a
                throw r1     // Catch: java.lang.Throwable -> L3a
            L48:
                monitor-exit(r0)
                throw r5
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
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

        public Entry(okhttp3.internal.cache.DiskLruCache r7, java.lang.String r8) {
                r6 = this;
                r8.getClass()
                r6.this$0 = r7
                r6.<init>()
                r6.key = r8
                int r0 = r7.getValueCount$okhttp()
                long[] r0 = new long[r0]
                r6.lengths = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r6.cleanFiles = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r6.dirtyFiles = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r8)
                r8 = 46
                r0.append(r8)
                int r8 = r0.length()
                int r7 = r7.getValueCount$okhttp()
                r1 = 0
            L33:
                if (r1 >= r7) goto L6b
                r0.append(r1)
                java.util.List<java.io.File> r2 = r6.cleanFiles
                java.io.File r3 = new java.io.File
                okhttp3.internal.cache.DiskLruCache r4 = r6.this$0
                java.io.File r4 = r4.getDirectory()
                java.lang.String r5 = r0.toString()
                r3.<init>(r4, r5)
                r2.add(r3)
                java.lang.String r2 = ".tmp"
                r0.append(r2)
                java.util.List<java.io.File> r2 = r6.dirtyFiles
                java.io.File r3 = new java.io.File
                okhttp3.internal.cache.DiskLruCache r4 = r6.this$0
                java.io.File r4 = r4.getDirectory()
                java.lang.String r5 = r0.toString()
                r3.<init>(r4, r5)
                r2.add(r3)
                r0.setLength(r8)
                int r1 = r1 + 1
                goto L33
            L6b:
                return
        }

        private final java.lang.Void invalidLengths(java.util.List<java.lang.String> r4) {
                r3 = this;
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "unexpected journal line: "
                r1.<init>(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        private final okio.Source newSource(int r3) {
                r2 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r2.this$0
                okhttp3.internal.io.FileSystem r0 = r0.getFileSystem$okhttp()
                java.util.List<java.io.File> r1 = r2.cleanFiles
                java.lang.Object r3 = r1.get(r3)
                java.io.File r3 = (java.io.File) r3
                okio.Source r3 = r0.source(r3)
                okhttp3.internal.cache.DiskLruCache r0 = r2.this$0
                boolean r0 = okhttp3.internal.cache.DiskLruCache.access$getCivilizedFileSystem$p(r0)
                if (r0 == 0) goto L1b
                return r3
            L1b:
                int r0 = r2.lockingSourceCount
                int r0 = r0 + 1
                r2.lockingSourceCount = r0
                okhttp3.internal.cache.DiskLruCache$Entry$newSource$1 r0 = new okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                okhttp3.internal.cache.DiskLruCache r1 = r2.this$0
                r0.<init>(r3, r1, r2)
                return r0
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

        public final void setLengths$okhttp(java.util.List<java.lang.String> r6) {
                r5 = this;
                r6.getClass()
                int r0 = r6.size()
                okhttp3.internal.cache.DiskLruCache r1 = r5.this$0
                int r1 = r1.getValueCount$okhttp()
                if (r0 != r1) goto L2f
                int r0 = r6.size()     // Catch: java.lang.NumberFormatException -> L28
                r1 = 0
            L14:
                if (r1 >= r0) goto L27
                long[] r2 = r5.lengths     // Catch: java.lang.NumberFormatException -> L28
                java.lang.Object r3 = r6.get(r1)     // Catch: java.lang.NumberFormatException -> L28
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NumberFormatException -> L28
                long r3 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L28
                r2[r1] = r3     // Catch: java.lang.NumberFormatException -> L28
                int r1 = r1 + 1
                goto L14
            L27:
                return
            L28:
                r5.invalidLengths(r6)
                okio.a.c()
                return
            L2f:
                r5.invalidLengths(r6)
                okio.a.c()
                return
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
                r9 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r9.this$0
                boolean r1 = okhttp3.internal.Util.assertionsEnabled
                if (r1 == 0) goto L1c
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 == 0) goto Ld
                goto L1c
            Ld:
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = " MUST hold lock on "
                j8.o.i(r1, r2, r0)
                r0 = 0
                return r0
            L1c:
                boolean r0 = r9.readable
                r1 = 0
                if (r0 != 0) goto L22
                return r1
            L22:
                okhttp3.internal.cache.DiskLruCache r0 = r9.this$0
                boolean r0 = okhttp3.internal.cache.DiskLruCache.access$getCivilizedFileSystem$p(r0)
                if (r0 != 0) goto L33
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r9.currentEditor
                if (r0 != 0) goto L32
                boolean r0 = r9.zombie
                if (r0 == 0) goto L33
            L32:
                return r1
            L33:
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                long[] r0 = r9.lengths
                java.lang.Object r0 = r0.clone()
                r8 = r0
                long[] r8 = (long[]) r8
                okhttp3.internal.cache.DiskLruCache r0 = r9.this$0     // Catch: java.io.FileNotFoundException -> L60
                int r0 = r0.getValueCount$okhttp()     // Catch: java.io.FileNotFoundException -> L60
                r2 = 0
            L48:
                if (r2 >= r0) goto L54
                okio.Source r3 = r9.newSource(r2)     // Catch: java.io.FileNotFoundException -> L60
                r7.add(r3)     // Catch: java.io.FileNotFoundException -> L60
                int r2 = r2 + 1
                goto L48
            L54:
                okhttp3.internal.cache.DiskLruCache$Snapshot r2 = new okhttp3.internal.cache.DiskLruCache$Snapshot     // Catch: java.io.FileNotFoundException -> L60
                okhttp3.internal.cache.DiskLruCache r3 = r9.this$0     // Catch: java.io.FileNotFoundException -> L60
                java.lang.String r4 = r9.key     // Catch: java.io.FileNotFoundException -> L60
                long r5 = r9.sequenceNumber     // Catch: java.io.FileNotFoundException -> L60
                r2.<init>(r3, r4, r5, r7, r8)     // Catch: java.io.FileNotFoundException -> L60
                return r2
            L60:
                java.util.Iterator r0 = r7.iterator()
            L64:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L74
                java.lang.Object r2 = r0.next()
                okio.Source r2 = (okio.Source) r2
                okhttp3.internal.Util.closeQuietly(r2)
                goto L64
            L74:
                okhttp3.internal.cache.DiskLruCache r0 = r9.this$0     // Catch: java.io.IOException -> L79
                r0.removeEntry$okhttp(r9)     // Catch: java.io.IOException -> L79
            L79:
                return r1
        }

        public final void writeLengths$okhttp(okio.BufferedSink r7) {
                r6 = this;
                r7.getClass()
                long[] r0 = r6.lengths
                int r1 = r0.length
                r2 = 0
            L7:
                if (r2 >= r1) goto L17
                r3 = r0[r2]
                r5 = 32
                okio.BufferedSink r5 = r7.writeByte(r5)
                r5.writeDecimalLong(r3)
                int r2 = r2 + 1
                goto L7
            L17:
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class Snapshot implements java.io.Closeable {
        private final java.lang.String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final java.util.List<okio.Source> sources;
        final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;

        public Snapshot(okhttp3.internal.cache.DiskLruCache r1, java.lang.String r2, long r3, java.util.List<? extends okio.Source> r5, long[] r6) {
                r0 = this;
                r2.getClass()
                r5.getClass()
                r6.getClass()
                r0.this$0 = r1
                r0.<init>()
                r0.key = r2
                r0.sequenceNumber = r3
                r0.sources = r5
                r0.lengths = r6
                return
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r2 = this;
                java.util.List<okio.Source> r0 = r2.sources
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                okio.Source r1 = (okio.Source) r1
                okhttp3.internal.Util.closeQuietly(r1)
                goto L6
            L16:
                return
        }

        public final okhttp3.internal.cache.DiskLruCache.Editor edit() {
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
                java.lang.Object r2 = r0.get(r2)
                okio.Source r2 = (okio.Source) r2
                return r2
        }

        public final java.lang.String key() {
                r1 = this;
                java.lang.String r0 = r1.key
                return r0
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.DiskLruCache$snapshots$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class AnonymousClass1 implements java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Snapshot>, hg.a {
        private final java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Entry> delegate;
        private okhttp3.internal.cache.DiskLruCache.Snapshot nextSnapshot;
        private okhttp3.internal.cache.DiskLruCache.Snapshot removeSnapshot;
        final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;

        public AnonymousClass1(okhttp3.internal.cache.DiskLruCache r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.LinkedHashMap r2 = r2.getLruEntries$okhttp()
                java.util.Collection r2 = r2.values()
                r0.<init>(r2)
                java.util.Iterator r2 = r0.iterator()
                r2.getClass()
                r1.delegate = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r4 = this;
                okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r4.nextSnapshot
                r1 = 1
                if (r0 == 0) goto L6
                return r1
            L6:
                okhttp3.internal.cache.DiskLruCache r0 = r4.this$0
                monitor-enter(r0)
                boolean r2 = r0.getClosed$okhttp()     // Catch: java.lang.Throwable -> L2f
                r3 = 0
                if (r2 == 0) goto L12
                monitor-exit(r0)
                return r3
            L12:
                java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Entry> r2 = r4.delegate     // Catch: java.lang.Throwable -> L2f
                boolean r2 = r2.hasNext()     // Catch: java.lang.Throwable -> L2f
                if (r2 == 0) goto L31
                java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Entry> r2 = r4.delegate     // Catch: java.lang.Throwable -> L2f
                java.lang.Object r2 = r2.next()     // Catch: java.lang.Throwable -> L2f
                okhttp3.internal.cache.DiskLruCache$Entry r2 = (okhttp3.internal.cache.DiskLruCache.Entry) r2     // Catch: java.lang.Throwable -> L2f
                if (r2 == 0) goto L12
                okhttp3.internal.cache.DiskLruCache$Snapshot r2 = r2.snapshot$okhttp()     // Catch: java.lang.Throwable -> L2f
                if (r2 != 0) goto L2b
                goto L12
            L2b:
                r4.nextSnapshot = r2     // Catch: java.lang.Throwable -> L2f
                monitor-exit(r0)
                return r1
            L2f:
                r1 = move-exception
                goto L33
            L31:
                monitor-exit(r0)
                return r3
            L33:
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
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L11
                okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r2.nextSnapshot
                r2.removeSnapshot = r0
                r1 = 0
                r2.nextSnapshot = r1
                r0.getClass()
                return r0
            L11:
                bsh.j.e()
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r3 = this;
                okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r3.removeSnapshot
                if (r0 == 0) goto L18
                r1 = 0
                okhttp3.internal.cache.DiskLruCache r2 = r3.this$0     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L15
                java.lang.String r0 = r0.key()     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L15
                r2.remove(r0)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L15
                r3.removeSnapshot = r1
                return
            L11:
                r0 = move-exception
                r3.removeSnapshot = r1
                throw r0
            L15:
                r3.removeSnapshot = r1
                return
            L18:
                java.lang.String r0 = "remove() before next()"
                j8.o.A(r0)
                return
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
            og.k r0 = new og.k
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

    public DiskLruCache(okhttp3.internal.io.FileSystem r3, java.io.File r4, int r5, int r6, long r7, okhttp3.internal.concurrent.TaskRunner r9) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            r9.getClass()
            r2.<init>()
            r2.fileSystem = r3
            r2.directory = r4
            r2.appVersion = r5
            r2.valueCount = r6
            r2.maxSize = r7
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r5 = 1061158912(0x3f400000, float:0.75)
            r0 = 1
            r1 = 0
            r3.<init>(r1, r5, r0)
            r2.lruEntries = r3
            okhttp3.internal.concurrent.TaskQueue r3 = r9.newQueue()
            r2.cleanupQueue = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = okhttp3.internal.Util.okHttpName
            java.lang.String r9 = " Cache"
            java.lang.String r3 = eh.a.r(r3, r5, r9)
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r5 = new okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            r5.<init>(r2, r3)
            r2.cleanupTask = r5
            r0 = 0
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 <= 0) goto L66
            if (r6 <= 0) goto L5f
            java.io.File r3 = new java.io.File
            java.lang.String r5 = okhttp3.internal.cache.DiskLruCache.JOURNAL_FILE
            r3.<init>(r4, r5)
            r2.journalFile = r3
            java.io.File r3 = new java.io.File
            java.lang.String r5 = okhttp3.internal.cache.DiskLruCache.JOURNAL_FILE_TEMP
            r3.<init>(r4, r5)
            r2.journalFileTmp = r3
            java.io.File r3 = new java.io.File
            java.lang.String r5 = okhttp3.internal.cache.DiskLruCache.JOURNAL_FILE_BACKUP
            r3.<init>(r4, r5)
            r2.journalFileBackup = r3
            return
        L5f:
            java.lang.String r3 = "valueCount <= 0"
            j8.o.t(r3)
            r3 = 0
            throw r3
        L66:
            java.lang.String r3 = "maxSize <= 0"
            j8.o.t(r3)
            r3 = 0
            throw r3
    }

    public static final /* synthetic */ boolean access$getCivilizedFileSystem$p(okhttp3.internal.cache.DiskLruCache r0) {
            boolean r0 = r0.civilizedFileSystem
            return r0
    }

    public static final /* synthetic */ boolean access$getInitialized$p(okhttp3.internal.cache.DiskLruCache r0) {
            boolean r0 = r0.initialized
            return r0
    }

    public static final /* synthetic */ boolean access$journalRebuildRequired(okhttp3.internal.cache.DiskLruCache r0) {
            boolean r0 = r0.journalRebuildRequired()
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
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L7
            monitor-exit(r2)
            return
        L7:
            java.lang.String r0 = "cache is closed"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1     // Catch: java.lang.Throwable -> Lf
        Lf:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    public static /* synthetic */ okhttp3.internal.cache.DiskLruCache.Editor edit$default(okhttp3.internal.cache.DiskLruCache r0, java.lang.String r1, long r2, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            long r2 = okhttp3.internal.cache.DiskLruCache.ANY_SEQUENCE_NUMBER
        L6:
            okhttp3.internal.cache.DiskLruCache$Editor r0 = r0.edit(r1, r2)
            return r0
    }

    private final boolean journalRebuildRequired() {
            r2 = this;
            int r0 = r2.redundantOpCount
            r1 = 2000(0x7d0, float:2.803E-42)
            if (r0 < r1) goto L10
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r1 = r2.lruEntries
            int r1 = r1.size()
            if (r0 < r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    private final okio.BufferedSink newJournalWriter() {
            r3 = this;
            okhttp3.internal.io.FileSystem r0 = r3.fileSystem
            java.io.File r1 = r3.journalFile
            okio.Sink r0 = r0.appendingSink(r1)
            okhttp3.internal.cache.FaultHidingSink r1 = new okhttp3.internal.cache.FaultHidingSink
            okhttp3.internal.cache.DiskLruCache$newJournalWriter$faultHidingSink$1 r2 = new okhttp3.internal.cache.DiskLruCache$newJournalWriter$faultHidingSink$1
            r2.<init>(r3)
            r1.<init>(r0, r2)
            okio.BufferedSink r0 = okio.Okio.buffer(r1)
            return r0
    }

    private final void processJournal() {
            r9 = this;
            okhttp3.internal.io.FileSystem r0 = r9.fileSystem
            java.io.File r1 = r9.journalFileTmp
            r0.delete(r1)
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r9.lruEntries
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r0.next()
            r1.getClass()
            okhttp3.internal.cache.DiskLruCache$Entry r1 = (okhttp3.internal.cache.DiskLruCache.Entry) r1
            okhttp3.internal.cache.DiskLruCache$Editor r2 = r1.getCurrentEditor$okhttp()
            r3 = 0
            if (r2 != 0) goto L39
            int r2 = r9.valueCount
        L29:
            if (r3 >= r2) goto L11
            long r4 = r9.size
            long[] r6 = r1.getLengths$okhttp()
            r7 = r6[r3]
            long r4 = r4 + r7
            r9.size = r4
            int r3 = r3 + 1
            goto L29
        L39:
            r2 = 0
            r1.setCurrentEditor$okhttp(r2)
            int r2 = r9.valueCount
        L3f:
            if (r3 >= r2) goto L62
            okhttp3.internal.io.FileSystem r4 = r9.fileSystem
            java.util.List r5 = r1.getCleanFiles$okhttp()
            java.lang.Object r5 = r5.get(r3)
            java.io.File r5 = (java.io.File) r5
            r4.delete(r5)
            okhttp3.internal.io.FileSystem r4 = r9.fileSystem
            java.util.List r5 = r1.getDirtyFiles$okhttp()
            java.lang.Object r5 = r5.get(r3)
            java.io.File r5 = (java.io.File) r5
            r4.delete(r5)
            int r3 = r3 + 1
            goto L3f
        L62:
            r0.remove()
            goto L11
        L66:
            return
    }

    private final void readJournal() {
            r9 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            okhttp3.internal.io.FileSystem r2 = r9.fileSystem
            java.io.File r3 = r9.journalFile
            okio.Source r2 = r2.source(r3)
            okio.BufferedSource r2 = okio.Okio.buffer(r2)
            java.lang.String r3 = r2.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = r2.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r5 = r2.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r6 = r2.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r7 = r2.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r8 = okhttp3.internal.cache.DiskLruCache.MAGIC     // Catch: java.lang.Throwable -> L5d
            boolean r8 = gg.l.a(r8, r3)     // Catch: java.lang.Throwable -> L5d
            if (r8 == 0) goto L7d
            java.lang.String r8 = okhttp3.internal.cache.DiskLruCache.VERSION_1     // Catch: java.lang.Throwable -> L5d
            boolean r8 = gg.l.a(r8, r4)     // Catch: java.lang.Throwable -> L5d
            if (r8 == 0) goto L7d
            int r8 = r9.appVersion     // Catch: java.lang.Throwable -> L5d
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L5d
            boolean r5 = gg.l.a(r8, r5)     // Catch: java.lang.Throwable -> L5d
            if (r5 == 0) goto L7d
            int r5 = r9.valueCount     // Catch: java.lang.Throwable -> L5d
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L5d
            boolean r5 = gg.l.a(r5, r6)     // Catch: java.lang.Throwable -> L5d
            if (r5 == 0) goto L7d
            int r5 = r7.length()     // Catch: java.lang.Throwable -> L5d
            if (r5 > 0) goto L7d
            r0 = 0
        L53:
            java.lang.String r1 = r2.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5d java.io.EOFException -> L5f
            r9.readJournalLine(r1)     // Catch: java.lang.Throwable -> L5d java.io.EOFException -> L5f
            int r0 = r0 + 1
            goto L53
        L5d:
            r0 = move-exception
            goto La6
        L5f:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r1 = r9.lruEntries     // Catch: java.lang.Throwable -> L5d
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L5d
            int r0 = r0 - r1
            r9.redundantOpCount = r0     // Catch: java.lang.Throwable -> L5d
            boolean r0 = r2.exhausted()     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L72
            r9.rebuildJournal$okhttp()     // Catch: java.lang.Throwable -> L5d
            goto L78
        L72:
            okio.BufferedSink r0 = r9.newJournalWriter()     // Catch: java.lang.Throwable -> L5d
            r9.journalWriter = r0     // Catch: java.lang.Throwable -> L5d
        L78:
            r0 = 0
            ig.a.i(r2, r0)
            return
        L7d:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L5d
            r8.append(r3)     // Catch: java.lang.Throwable -> L5d
            r8.append(r0)     // Catch: java.lang.Throwable -> L5d
            r8.append(r4)     // Catch: java.lang.Throwable -> L5d
            r8.append(r0)     // Catch: java.lang.Throwable -> L5d
            r8.append(r6)     // Catch: java.lang.Throwable -> L5d
            r8.append(r0)     // Catch: java.lang.Throwable -> L5d
            r8.append(r7)     // Catch: java.lang.Throwable -> L5d
            r0 = 93
            r8.append(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L5d
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L5d
            throw r5     // Catch: java.lang.Throwable -> L5d
        La6:
            throw r0     // Catch: java.lang.Throwable -> La7
        La7:
            r1 = move-exception
            ig.a.i(r2, r0)
            throw r1
    }

    private final void readJournalLine(java.lang.String r11) {
            r10 = this;
            r0 = 32
            r1 = 0
            r2 = 6
            int r3 = og.m.q0(r11, r0, r1, r2)
            java.lang.String r4 = "unexpected journal line: "
            r5 = -1
            if (r3 == r5) goto La1
            int r6 = r3 + 1
            r7 = 4
            int r7 = og.m.q0(r11, r0, r6, r7)
            if (r7 != r5) goto L2e
            java.lang.String r6 = r11.substring(r6)
            java.lang.String r8 = okhttp3.internal.cache.DiskLruCache.REMOVE
            int r9 = r8.length()
            if (r3 != r9) goto L32
            boolean r8 = og.t.d0(r11, r8, r1)
            if (r8 == 0) goto L32
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r11 = r10.lruEntries
            r11.remove(r6)
            return
        L2e:
            java.lang.String r6 = r11.substring(r6, r7)
        L32:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r8 = r10.lruEntries
            java.lang.Object r8 = r8.get(r6)
            okhttp3.internal.cache.DiskLruCache$Entry r8 = (okhttp3.internal.cache.DiskLruCache.Entry) r8
            if (r8 != 0) goto L46
            okhttp3.internal.cache.DiskLruCache$Entry r8 = new okhttp3.internal.cache.DiskLruCache$Entry
            r8.<init>(r10, r6)
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r9 = r10.lruEntries
            r9.put(r6, r8)
        L46:
            if (r7 == r5) goto L6f
            java.lang.String r6 = okhttp3.internal.cache.DiskLruCache.CLEAN
            int r9 = r6.length()
            if (r3 != r9) goto L6f
            boolean r6 = og.t.d0(r11, r6, r1)
            if (r6 == 0) goto L6f
            r3 = 1
            int r7 = r7 + r3
            java.lang.String r11 = r11.substring(r7)
            char[] r4 = new char[r3]
            r4[r1] = r0
            java.util.List r11 = og.m.F0(r11, r4, r2)
            r8.setReadable$okhttp(r3)
            r0 = 0
            r8.setCurrentEditor$okhttp(r0)
            r8.setLengths$okhttp(r11)
            return
        L6f:
            if (r7 != r5) goto L88
            java.lang.String r0 = okhttp3.internal.cache.DiskLruCache.DIRTY
            int r2 = r0.length()
            if (r3 != r2) goto L88
            boolean r0 = og.t.d0(r11, r0, r1)
            if (r0 == 0) goto L88
            okhttp3.internal.cache.DiskLruCache$Editor r11 = new okhttp3.internal.cache.DiskLruCache$Editor
            r11.<init>(r10, r8)
            r8.setCurrentEditor$okhttp(r11)
            return
        L88:
            if (r7 != r5) goto L99
            java.lang.String r0 = okhttp3.internal.cache.DiskLruCache.READ
            int r2 = r0.length()
            if (r3 != r2) goto L99
            boolean r0 = og.t.d0(r11, r0, r1)
            if (r0 == 0) goto L99
            return
        L99:
            java.lang.String r11 = r4.concat(r11)
            j8.o.y(r11)
            return
        La1:
            java.lang.String r11 = r4.concat(r11)
            j8.o.y(r11)
            return
    }

    private final boolean removeOldestEntry() {
            r3 = this;
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r3.lruEntries
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            okhttp3.internal.cache.DiskLruCache$Entry r1 = (okhttp3.internal.cache.DiskLruCache.Entry) r1
            boolean r2 = r1.getZombie$okhttp()
            if (r2 != 0) goto La
            r3.removeEntry$okhttp(r1)
            r0 = 1
            return r0
        L21:
            r0 = 0
            return r0
    }

    private final void validateKey(java.lang.String r2) {
            r1 = this;
            og.k r0 = okhttp3.internal.cache.DiskLruCache.LEGAL_KEY_PATTERN
            boolean r0 = r0.d(r2)
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.String r0 = "keys must match regex [a-z0-9_-]{1,120}: \""
            j8.o.r(r2, r0)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.initialized     // Catch: java.lang.Throwable -> L32
            r1 = 1
            if (r0 == 0) goto L49
            boolean r0 = r6.closed     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto Lb
            goto L49
        Lb:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r6.lruEntries     // Catch: java.lang.Throwable -> L32
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L32
            r0.getClass()     // Catch: java.lang.Throwable -> L32
            r2 = 0
            okhttp3.internal.cache.DiskLruCache$Entry[] r3 = new okhttp3.internal.cache.DiskLruCache.Entry[r2]     // Catch: java.lang.Throwable -> L32
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch: java.lang.Throwable -> L32
            okhttp3.internal.cache.DiskLruCache$Entry[] r0 = (okhttp3.internal.cache.DiskLruCache.Entry[]) r0     // Catch: java.lang.Throwable -> L32
            int r3 = r0.length     // Catch: java.lang.Throwable -> L32
        L1e:
            if (r2 >= r3) goto L37
            r4 = r0[r2]     // Catch: java.lang.Throwable -> L32
            okhttp3.internal.cache.DiskLruCache$Editor r5 = r4.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L34
            okhttp3.internal.cache.DiskLruCache$Editor r4 = r4.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L34
            r4.detach$okhttp()     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r0 = move-exception
            goto L4d
        L34:
            int r2 = r2 + 1
            goto L1e
        L37:
            r6.trimToSize()     // Catch: java.lang.Throwable -> L32
            okio.BufferedSink r0 = r6.journalWriter     // Catch: java.lang.Throwable -> L32
            r0.getClass()     // Catch: java.lang.Throwable -> L32
            r0.close()     // Catch: java.lang.Throwable -> L32
            r0 = 0
            r6.journalWriter = r0     // Catch: java.lang.Throwable -> L32
            r6.closed = r1     // Catch: java.lang.Throwable -> L32
            monitor-exit(r6)
            return
        L49:
            r6.closed = r1     // Catch: java.lang.Throwable -> L32
            monitor-exit(r6)
            return
        L4d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L32
            throw r0
    }

    public final synchronized void completeEdit$okhttp(okhttp3.internal.cache.DiskLruCache.Editor r9, boolean r10) {
            r8 = this;
            monitor-enter(r8)
            r9.getClass()     // Catch: java.lang.Throwable -> L42
            okhttp3.internal.cache.DiskLruCache$Entry r0 = r9.getEntry$okhttp()     // Catch: java.lang.Throwable -> L42
            okhttp3.internal.cache.DiskLruCache$Editor r1 = r0.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L42
            boolean r1 = gg.l.a(r1, r9)     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L138
            r1 = 0
            if (r10 == 0) goto L63
            boolean r2 = r0.getReadable$okhttp()     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L63
            int r2 = r8.valueCount     // Catch: java.lang.Throwable -> L42
            r3 = r1
        L1e:
            if (r3 >= r2) goto L63
            boolean[] r4 = r9.getWritten$okhttp()     // Catch: java.lang.Throwable -> L42
            r4.getClass()     // Catch: java.lang.Throwable -> L42
            boolean r4 = r4[r3]     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L49
            okhttp3.internal.io.FileSystem r4 = r8.fileSystem     // Catch: java.lang.Throwable -> L42
            java.util.List r5 = r0.getDirtyFiles$okhttp()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r5 = r5.get(r3)     // Catch: java.lang.Throwable -> L42
            java.io.File r5 = (java.io.File) r5     // Catch: java.lang.Throwable -> L42
            boolean r4 = r4.exists(r5)     // Catch: java.lang.Throwable -> L42
            if (r4 != 0) goto L46
            r9.abort()     // Catch: java.lang.Throwable -> L42
            monitor-exit(r8)
            return
        L42:
            r0 = move-exception
            r9 = r0
            goto L140
        L46:
            int r3 = r3 + 1
            goto L1e
        L49:
            r9.abort()     // Catch: java.lang.Throwable -> L42
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            r10.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r10.append(r0)     // Catch: java.lang.Throwable -> L42
            r10.append(r3)     // Catch: java.lang.Throwable -> L42
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L42
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L42
            throw r9     // Catch: java.lang.Throwable -> L42
        L63:
            int r9 = r8.valueCount     // Catch: java.lang.Throwable -> L42
        L65:
            if (r1 >= r9) goto Lb1
            java.util.List r2 = r0.getDirtyFiles$okhttp()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L42
            java.io.File r2 = (java.io.File) r2     // Catch: java.lang.Throwable -> L42
            if (r10 == 0) goto La9
            boolean r3 = r0.getZombie$okhttp()     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto La9
            okhttp3.internal.io.FileSystem r3 = r8.fileSystem     // Catch: java.lang.Throwable -> L42
            boolean r3 = r3.exists(r2)     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto Lae
            java.util.List r3 = r0.getCleanFiles$okhttp()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L42
            java.io.File r3 = (java.io.File) r3     // Catch: java.lang.Throwable -> L42
            okhttp3.internal.io.FileSystem r4 = r8.fileSystem     // Catch: java.lang.Throwable -> L42
            r4.rename(r2, r3)     // Catch: java.lang.Throwable -> L42
            long[] r2 = r0.getLengths$okhttp()     // Catch: java.lang.Throwable -> L42
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L42
            okhttp3.internal.io.FileSystem r2 = r8.fileSystem     // Catch: java.lang.Throwable -> L42
            long r2 = r2.size(r3)     // Catch: java.lang.Throwable -> L42
            long[] r6 = r0.getLengths$okhttp()     // Catch: java.lang.Throwable -> L42
            r6[r1] = r2     // Catch: java.lang.Throwable -> L42
            long r6 = r8.size     // Catch: java.lang.Throwable -> L42
            long r6 = r6 - r4
            long r6 = r6 + r2
            r8.size = r6     // Catch: java.lang.Throwable -> L42
            goto Lae
        La9:
            okhttp3.internal.io.FileSystem r3 = r8.fileSystem     // Catch: java.lang.Throwable -> L42
            r3.delete(r2)     // Catch: java.lang.Throwable -> L42
        Lae:
            int r1 = r1 + 1
            goto L65
        Lb1:
            r9 = 0
            r0.setCurrentEditor$okhttp(r9)     // Catch: java.lang.Throwable -> L42
            boolean r9 = r0.getZombie$okhttp()     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto Lc0
            r8.removeEntry$okhttp(r0)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r8)
            return
        Lc0:
            int r9 = r8.redundantOpCount     // Catch: java.lang.Throwable -> L42
            r1 = 1
            int r9 = r9 + r1
            r8.redundantOpCount = r9     // Catch: java.lang.Throwable -> L42
            okio.BufferedSink r9 = r8.journalWriter     // Catch: java.lang.Throwable -> L42
            r9.getClass()     // Catch: java.lang.Throwable -> L42
            boolean r2 = r0.getReadable$okhttp()     // Catch: java.lang.Throwable -> L42
            r3 = 10
            r4 = 32
            if (r2 != 0) goto Lf5
            if (r10 == 0) goto Ld8
            goto Lf5
        Ld8:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r10 = r8.lruEntries     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r0.getKey$okhttp()     // Catch: java.lang.Throwable -> L42
            r10.remove(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.String r10 = okhttp3.internal.cache.DiskLruCache.REMOVE     // Catch: java.lang.Throwable -> L42
            okio.BufferedSink r10 = r9.writeUtf8(r10)     // Catch: java.lang.Throwable -> L42
            r10.writeByte(r4)     // Catch: java.lang.Throwable -> L42
            java.lang.String r10 = r0.getKey$okhttp()     // Catch: java.lang.Throwable -> L42
            r9.writeUtf8(r10)     // Catch: java.lang.Throwable -> L42
            r9.writeByte(r3)     // Catch: java.lang.Throwable -> L42
            goto L11a
        Lf5:
            r0.setReadable$okhttp(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = okhttp3.internal.cache.DiskLruCache.CLEAN     // Catch: java.lang.Throwable -> L42
            okio.BufferedSink r1 = r9.writeUtf8(r1)     // Catch: java.lang.Throwable -> L42
            r1.writeByte(r4)     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r0.getKey$okhttp()     // Catch: java.lang.Throwable -> L42
            r9.writeUtf8(r1)     // Catch: java.lang.Throwable -> L42
            r0.writeLengths$okhttp(r9)     // Catch: java.lang.Throwable -> L42
            r9.writeByte(r3)     // Catch: java.lang.Throwable -> L42
            if (r10 == 0) goto L11a
            long r1 = r8.nextSequenceNumber     // Catch: java.lang.Throwable -> L42
            r3 = 1
            long r3 = r3 + r1
            r8.nextSequenceNumber = r3     // Catch: java.lang.Throwable -> L42
            r0.setSequenceNumber$okhttp(r1)     // Catch: java.lang.Throwable -> L42
        L11a:
            r9.flush()     // Catch: java.lang.Throwable -> L42
            long r9 = r8.size     // Catch: java.lang.Throwable -> L42
            long r0 = r8.maxSize     // Catch: java.lang.Throwable -> L42
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 > 0) goto L12b
            boolean r9 = r8.journalRebuildRequired()     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L136
        L12b:
            okhttp3.internal.concurrent.TaskQueue r0 = r8.cleanupQueue     // Catch: java.lang.Throwable -> L42
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r1 = r8.cleanupTask     // Catch: java.lang.Throwable -> L42
            r4 = 2
            r5 = 0
            r2 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r0, r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L42
        L136:
            monitor-exit(r8)
            return
        L138:
            java.lang.String r9 = "Check failed."
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L42
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L42
            throw r10     // Catch: java.lang.Throwable -> L42
        L140:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L42
            throw r9
    }

    public final void delete() {
            r2 = this;
            r2.close()
            okhttp3.internal.io.FileSystem r0 = r2.fileSystem
            java.io.File r1 = r2.directory
            r0.deleteContents(r1)
            return
    }

    public final okhttp3.internal.cache.DiskLruCache.Editor edit(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 2
            r5 = 0
            r2 = 0
            r0 = r6
            r1 = r7
            okhttp3.internal.cache.DiskLruCache$Editor r7 = edit$default(r0, r1, r2, r4, r5)
            return r7
    }

    public final synchronized okhttp3.internal.cache.DiskLruCache.Editor edit(java.lang.String r10, long r11) {
            r9 = this;
            monitor-enter(r9)
            r10.getClass()     // Catch: java.lang.Throwable -> L27
            r9.initialize()     // Catch: java.lang.Throwable -> L27
            r9.checkNotClosed()     // Catch: java.lang.Throwable -> L27
            r9.validateKey(r10)     // Catch: java.lang.Throwable -> L27
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r9.lruEntries     // Catch: java.lang.Throwable -> L27
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Throwable -> L27
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch: java.lang.Throwable -> L27
            long r1 = okhttp3.internal.cache.DiskLruCache.ANY_SEQUENCE_NUMBER     // Catch: java.lang.Throwable -> L27
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L2c
            if (r0 == 0) goto L2a
            long r3 = r0.getSequenceNumber$okhttp()     // Catch: java.lang.Throwable -> L27
            int r11 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r11 == 0) goto L2c
            goto L2a
        L27:
            r0 = move-exception
            r10 = r0
            goto L91
        L2a:
            monitor-exit(r9)
            return r2
        L2c:
            if (r0 == 0) goto L33
            okhttp3.internal.cache.DiskLruCache$Editor r11 = r0.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L27
            goto L34
        L33:
            r11 = r2
        L34:
            if (r11 == 0) goto L38
            monitor-exit(r9)
            return r2
        L38:
            if (r0 == 0) goto L42
            int r11 = r0.getLockingSourceCount$okhttp()     // Catch: java.lang.Throwable -> L27
            if (r11 == 0) goto L42
            monitor-exit(r9)
            return r2
        L42:
            boolean r11 = r9.mostRecentTrimFailed     // Catch: java.lang.Throwable -> L27
            if (r11 != 0) goto L84
            boolean r11 = r9.mostRecentRebuildFailed     // Catch: java.lang.Throwable -> L27
            if (r11 == 0) goto L4b
            goto L84
        L4b:
            okio.BufferedSink r11 = r9.journalWriter     // Catch: java.lang.Throwable -> L27
            r11.getClass()     // Catch: java.lang.Throwable -> L27
            java.lang.String r12 = okhttp3.internal.cache.DiskLruCache.DIRTY     // Catch: java.lang.Throwable -> L27
            okio.BufferedSink r12 = r11.writeUtf8(r12)     // Catch: java.lang.Throwable -> L27
            r1 = 32
            okio.BufferedSink r12 = r12.writeByte(r1)     // Catch: java.lang.Throwable -> L27
            okio.BufferedSink r12 = r12.writeUtf8(r10)     // Catch: java.lang.Throwable -> L27
            r1 = 10
            r12.writeByte(r1)     // Catch: java.lang.Throwable -> L27
            r11.flush()     // Catch: java.lang.Throwable -> L27
            boolean r11 = r9.hasJournalErrors     // Catch: java.lang.Throwable -> L27
            if (r11 == 0) goto L6e
            monitor-exit(r9)
            return r2
        L6e:
            if (r0 != 0) goto L7a
            okhttp3.internal.cache.DiskLruCache$Entry r0 = new okhttp3.internal.cache.DiskLruCache$Entry     // Catch: java.lang.Throwable -> L27
            r0.<init>(r9, r10)     // Catch: java.lang.Throwable -> L27
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r11 = r9.lruEntries     // Catch: java.lang.Throwable -> L27
            r11.put(r10, r0)     // Catch: java.lang.Throwable -> L27
        L7a:
            okhttp3.internal.cache.DiskLruCache$Editor r10 = new okhttp3.internal.cache.DiskLruCache$Editor     // Catch: java.lang.Throwable -> L27
            r10.<init>(r9, r0)     // Catch: java.lang.Throwable -> L27
            r0.setCurrentEditor$okhttp(r10)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r9)
            return r10
        L84:
            okhttp3.internal.concurrent.TaskQueue r3 = r9.cleanupQueue     // Catch: java.lang.Throwable -> L27
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r4 = r9.cleanupTask     // Catch: java.lang.Throwable -> L27
            r7 = 2
            r8 = 0
            r5 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r9)
            return r2
        L91:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L27
            throw r10
    }

    public final synchronized void evictAll() {
            r5 = this;
            monitor-enter(r5)
            r5.initialize()     // Catch: java.lang.Throwable -> L25
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r5.lruEntries     // Catch: java.lang.Throwable -> L25
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L25
            r0.getClass()     // Catch: java.lang.Throwable -> L25
            r1 = 0
            okhttp3.internal.cache.DiskLruCache$Entry[] r2 = new okhttp3.internal.cache.DiskLruCache.Entry[r1]     // Catch: java.lang.Throwable -> L25
            java.lang.Object[] r0 = r0.toArray(r2)     // Catch: java.lang.Throwable -> L25
            okhttp3.internal.cache.DiskLruCache$Entry[] r0 = (okhttp3.internal.cache.DiskLruCache.Entry[]) r0     // Catch: java.lang.Throwable -> L25
            int r2 = r0.length     // Catch: java.lang.Throwable -> L25
            r3 = r1
        L18:
            if (r3 >= r2) goto L27
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L25
            r4.getClass()     // Catch: java.lang.Throwable -> L25
            r5.removeEntry$okhttp(r4)     // Catch: java.lang.Throwable -> L25
            int r3 = r3 + 1
            goto L18
        L25:
            r0 = move-exception
            goto L2b
        L27:
            r5.mostRecentTrimFailed = r1     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
            return
        L2b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L25
            throw r0
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
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
            r0.getClass()     // Catch: java.lang.Throwable -> L17
            r0.flush()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            return
        L17:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    public final synchronized okhttp3.internal.cache.DiskLruCache.Snapshot get(java.lang.String r8) {
            r7 = this;
            monitor-enter(r7)
            r8.getClass()     // Catch: java.lang.Throwable -> L54
            r7.initialize()     // Catch: java.lang.Throwable -> L54
            r7.checkNotClosed()     // Catch: java.lang.Throwable -> L54
            r7.validateKey(r8)     // Catch: java.lang.Throwable -> L54
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r7.lruEntries     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L54
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch: java.lang.Throwable -> L54
            r1 = 0
            if (r0 != 0) goto L1a
            monitor-exit(r7)
            return r1
        L1a:
            okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r0.snapshot$okhttp()     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L22
            monitor-exit(r7)
            return r1
        L22:
            int r1 = r7.redundantOpCount     // Catch: java.lang.Throwable -> L54
            int r1 = r1 + 1
            r7.redundantOpCount = r1     // Catch: java.lang.Throwable -> L54
            okio.BufferedSink r1 = r7.journalWriter     // Catch: java.lang.Throwable -> L54
            r1.getClass()     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = okhttp3.internal.cache.DiskLruCache.READ     // Catch: java.lang.Throwable -> L54
            okio.BufferedSink r1 = r1.writeUtf8(r2)     // Catch: java.lang.Throwable -> L54
            r2 = 32
            okio.BufferedSink r1 = r1.writeByte(r2)     // Catch: java.lang.Throwable -> L54
            okio.BufferedSink r8 = r1.writeUtf8(r8)     // Catch: java.lang.Throwable -> L54
            r1 = 10
            r8.writeByte(r1)     // Catch: java.lang.Throwable -> L54
            boolean r8 = r7.journalRebuildRequired()     // Catch: java.lang.Throwable -> L54
            if (r8 == 0) goto L57
            okhttp3.internal.concurrent.TaskQueue r1 = r7.cleanupQueue     // Catch: java.lang.Throwable -> L54
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r2 = r7.cleanupTask     // Catch: java.lang.Throwable -> L54
            r5 = 2
            r6 = 0
            r3 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r1, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L54
            goto L57
        L54:
            r0 = move-exception
            r8 = r0
            goto L59
        L57:
            monitor-exit(r7)
            return r0
        L59:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L54
            throw r8
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

    public final okhttp3.internal.io.FileSystem getFileSystem$okhttp() {
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

    public final synchronized void initialize() {
            r5 = this;
            java.lang.String r0 = "DiskLruCache "
            java.lang.String r1 = "Thread "
            monitor-enter(r5)
            boolean r2 = okhttp3.internal.Util.assertionsEnabled     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L35
            boolean r2 = java.lang.Thread.holdsLock(r5)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L10
            goto L35
        L10:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L32
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L32
            r2.append(r1)     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = " MUST hold lock on "
            r2.append(r1)     // Catch: java.lang.Throwable -> L32
            r2.append(r5)     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L32
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L32
            throw r0     // Catch: java.lang.Throwable -> L32
        L32:
            r0 = move-exception
            goto Lb9
        L35:
            boolean r1 = r5.initialized     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L3b
            monitor-exit(r5)
            return
        L3b:
            okhttp3.internal.io.FileSystem r1 = r5.fileSystem     // Catch: java.lang.Throwable -> L32
            java.io.File r2 = r5.journalFileBackup     // Catch: java.lang.Throwable -> L32
            boolean r1 = r1.exists(r2)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L5e
            okhttp3.internal.io.FileSystem r1 = r5.fileSystem     // Catch: java.lang.Throwable -> L32
            java.io.File r2 = r5.journalFile     // Catch: java.lang.Throwable -> L32
            boolean r1 = r1.exists(r2)     // Catch: java.lang.Throwable -> L32
            okhttp3.internal.io.FileSystem r2 = r5.fileSystem
            if (r1 == 0) goto L57
            java.io.File r1 = r5.journalFileBackup     // Catch: java.lang.Throwable -> L32
            r2.delete(r1)     // Catch: java.lang.Throwable -> L32
            goto L5e
        L57:
            java.io.File r1 = r5.journalFileBackup     // Catch: java.lang.Throwable -> L32
            java.io.File r3 = r5.journalFile     // Catch: java.lang.Throwable -> L32
            r2.rename(r1, r3)     // Catch: java.lang.Throwable -> L32
        L5e:
            okhttp3.internal.io.FileSystem r1 = r5.fileSystem     // Catch: java.lang.Throwable -> L32
            java.io.File r2 = r5.journalFileBackup     // Catch: java.lang.Throwable -> L32
            boolean r1 = okhttp3.internal.Util.isCivilized(r1, r2)     // Catch: java.lang.Throwable -> L32
            r5.civilizedFileSystem = r1     // Catch: java.lang.Throwable -> L32
            okhttp3.internal.io.FileSystem r1 = r5.fileSystem     // Catch: java.lang.Throwable -> L32
            java.io.File r2 = r5.journalFile     // Catch: java.lang.Throwable -> L32
            boolean r1 = r1.exists(r2)     // Catch: java.lang.Throwable -> L32
            r2 = 1
            if (r1 == 0) goto Lb2
            r5.readJournal()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L7d
            r5.processJournal()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L7d
            r5.initialized = r2     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L7d
            monitor-exit(r5)
            return
        L7d:
            r1 = move-exception
            okhttp3.internal.platform.Platform$Companion r3 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.Throwable -> L32
            okhttp3.internal.platform.Platform r3 = r3.get()     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L32
            java.io.File r0 = r5.directory     // Catch: java.lang.Throwable -> L32
            r4.append(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = " is corrupt: "
            r4.append(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> L32
            r4.append(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = ", removing"
            r4.append(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L32
            r4 = 5
            r3.log(r0, r4, r1)     // Catch: java.lang.Throwable -> L32
            r0 = 0
            r5.delete()     // Catch: java.lang.Throwable -> Lae
            r5.closed = r0     // Catch: java.lang.Throwable -> L32
            goto Lb2
        Lae:
            r1 = move-exception
            r5.closed = r0     // Catch: java.lang.Throwable -> L32
            throw r1     // Catch: java.lang.Throwable -> L32
        Lb2:
            r5.rebuildJournal$okhttp()     // Catch: java.lang.Throwable -> L32
            r5.initialized = r2     // Catch: java.lang.Throwable -> L32
            monitor-exit(r5)
            return
        Lb9:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L32
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

    public final synchronized void rebuildJournal$okhttp() {
            r6 = this;
            monitor-enter(r6)
            okio.BufferedSink r0 = r6.journalWriter     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lc
            r0.close()     // Catch: java.lang.Throwable -> L9
            goto Lc
        L9:
            r0 = move-exception
            goto Lc8
        Lc:
            okhttp3.internal.io.FileSystem r0 = r6.fileSystem     // Catch: java.lang.Throwable -> L9
            java.io.File r1 = r6.journalFileTmp     // Catch: java.lang.Throwable -> L9
            okio.Sink r0 = r0.sink(r1)     // Catch: java.lang.Throwable -> L9
            okio.BufferedSink r0 = okio.Okio.buffer(r0)     // Catch: java.lang.Throwable -> L9
            java.lang.String r1 = okhttp3.internal.cache.DiskLruCache.MAGIC     // Catch: java.lang.Throwable -> L75
            okio.BufferedSink r1 = r0.writeUtf8(r1)     // Catch: java.lang.Throwable -> L75
            r2 = 10
            r1.writeByte(r2)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = okhttp3.internal.cache.DiskLruCache.VERSION_1     // Catch: java.lang.Throwable -> L75
            okio.BufferedSink r1 = r0.writeUtf8(r1)     // Catch: java.lang.Throwable -> L75
            r1.writeByte(r2)     // Catch: java.lang.Throwable -> L75
            int r1 = r6.appVersion     // Catch: java.lang.Throwable -> L75
            long r3 = (long) r1     // Catch: java.lang.Throwable -> L75
            okio.BufferedSink r1 = r0.writeDecimalLong(r3)     // Catch: java.lang.Throwable -> L75
            r1.writeByte(r2)     // Catch: java.lang.Throwable -> L75
            int r1 = r6.valueCount     // Catch: java.lang.Throwable -> L75
            long r3 = (long) r1     // Catch: java.lang.Throwable -> L75
            okio.BufferedSink r1 = r0.writeDecimalLong(r3)     // Catch: java.lang.Throwable -> L75
            r1.writeByte(r2)     // Catch: java.lang.Throwable -> L75
            r0.writeByte(r2)     // Catch: java.lang.Throwable -> L75
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r1 = r6.lruEntries     // Catch: java.lang.Throwable -> L75
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L75
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L75
        L4d:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L75
            if (r3 == 0) goto L8e
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L75
            okhttp3.internal.cache.DiskLruCache$Entry r3 = (okhttp3.internal.cache.DiskLruCache.Entry) r3     // Catch: java.lang.Throwable -> L75
            okhttp3.internal.cache.DiskLruCache$Editor r4 = r3.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L75
            r5 = 32
            if (r4 == 0) goto L77
            java.lang.String r4 = okhttp3.internal.cache.DiskLruCache.DIRTY     // Catch: java.lang.Throwable -> L75
            okio.BufferedSink r4 = r0.writeUtf8(r4)     // Catch: java.lang.Throwable -> L75
            r4.writeByte(r5)     // Catch: java.lang.Throwable -> L75
            java.lang.String r3 = r3.getKey$okhttp()     // Catch: java.lang.Throwable -> L75
            r0.writeUtf8(r3)     // Catch: java.lang.Throwable -> L75
            r0.writeByte(r2)     // Catch: java.lang.Throwable -> L75
            goto L4d
        L75:
            r1 = move-exception
            goto Lc2
        L77:
            java.lang.String r4 = okhttp3.internal.cache.DiskLruCache.CLEAN     // Catch: java.lang.Throwable -> L75
            okio.BufferedSink r4 = r0.writeUtf8(r4)     // Catch: java.lang.Throwable -> L75
            r4.writeByte(r5)     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = r3.getKey$okhttp()     // Catch: java.lang.Throwable -> L75
            r0.writeUtf8(r4)     // Catch: java.lang.Throwable -> L75
            r3.writeLengths$okhttp(r0)     // Catch: java.lang.Throwable -> L75
            r0.writeByte(r2)     // Catch: java.lang.Throwable -> L75
            goto L4d
        L8e:
            r1 = 0
            ig.a.i(r0, r1)     // Catch: java.lang.Throwable -> L9
            okhttp3.internal.io.FileSystem r0 = r6.fileSystem     // Catch: java.lang.Throwable -> L9
            java.io.File r1 = r6.journalFile     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.exists(r1)     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto La5
            okhttp3.internal.io.FileSystem r0 = r6.fileSystem     // Catch: java.lang.Throwable -> L9
            java.io.File r1 = r6.journalFile     // Catch: java.lang.Throwable -> L9
            java.io.File r2 = r6.journalFileBackup     // Catch: java.lang.Throwable -> L9
            r0.rename(r1, r2)     // Catch: java.lang.Throwable -> L9
        La5:
            okhttp3.internal.io.FileSystem r0 = r6.fileSystem     // Catch: java.lang.Throwable -> L9
            java.io.File r1 = r6.journalFileTmp     // Catch: java.lang.Throwable -> L9
            java.io.File r2 = r6.journalFile     // Catch: java.lang.Throwable -> L9
            r0.rename(r1, r2)     // Catch: java.lang.Throwable -> L9
            okhttp3.internal.io.FileSystem r0 = r6.fileSystem     // Catch: java.lang.Throwable -> L9
            java.io.File r1 = r6.journalFileBackup     // Catch: java.lang.Throwable -> L9
            r0.delete(r1)     // Catch: java.lang.Throwable -> L9
            okio.BufferedSink r0 = r6.newJournalWriter()     // Catch: java.lang.Throwable -> L9
            r6.journalWriter = r0     // Catch: java.lang.Throwable -> L9
            r0 = 0
            r6.hasJournalErrors = r0     // Catch: java.lang.Throwable -> L9
            r6.mostRecentRebuildFailed = r0     // Catch: java.lang.Throwable -> L9
            monitor-exit(r6)
            return
        Lc2:
            throw r1     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            r2 = move-exception
            ig.a.i(r0, r1)     // Catch: java.lang.Throwable -> L9
            throw r2     // Catch: java.lang.Throwable -> L9
        Lc8:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public final synchronized boolean remove(java.lang.String r6) {
            r5 = this;
            monitor-enter(r5)
            r6.getClass()     // Catch: java.lang.Throwable -> L2b
            r5.initialize()     // Catch: java.lang.Throwable -> L2b
            r5.checkNotClosed()     // Catch: java.lang.Throwable -> L2b
            r5.validateKey(r6)     // Catch: java.lang.Throwable -> L2b
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r5.lruEntries     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L2b
            okhttp3.internal.cache.DiskLruCache$Entry r6 = (okhttp3.internal.cache.DiskLruCache.Entry) r6     // Catch: java.lang.Throwable -> L2b
            r0 = 0
            if (r6 != 0) goto L1a
            monitor-exit(r5)
            return r0
        L1a:
            boolean r6 = r5.removeEntry$okhttp(r6)     // Catch: java.lang.Throwable -> L2b
            if (r6 == 0) goto L2d
            long r1 = r5.size     // Catch: java.lang.Throwable -> L2b
            long r3 = r5.maxSize     // Catch: java.lang.Throwable -> L2b
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L2d
            r5.mostRecentTrimFailed = r0     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r6 = move-exception
            goto L2f
        L2d:
            monitor-exit(r5)
            return r6
        L2f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2b
            throw r6
    }

    public final boolean removeEntry$okhttp(okhttp3.internal.cache.DiskLruCache.Entry r11) {
            r10 = this;
            r11.getClass()
            boolean r0 = r10.civilizedFileSystem
            r1 = 10
            r2 = 32
            r3 = 1
            if (r0 != 0) goto L3b
            int r0 = r11.getLockingSourceCount$okhttp()
            if (r0 <= 0) goto L2b
            okio.BufferedSink r0 = r10.journalWriter
            if (r0 == 0) goto L2b
            java.lang.String r4 = okhttp3.internal.cache.DiskLruCache.DIRTY
            r0.writeUtf8(r4)
            r0.writeByte(r2)
            java.lang.String r4 = r11.getKey$okhttp()
            r0.writeUtf8(r4)
            r0.writeByte(r1)
            r0.flush()
        L2b:
            int r0 = r11.getLockingSourceCount$okhttp()
            if (r0 > 0) goto L37
            okhttp3.internal.cache.DiskLruCache$Editor r0 = r11.getCurrentEditor$okhttp()
            if (r0 == 0) goto L3b
        L37:
            r11.setZombie$okhttp(r3)
            return r3
        L3b:
            okhttp3.internal.cache.DiskLruCache$Editor r0 = r11.getCurrentEditor$okhttp()
            if (r0 == 0) goto L44
            r0.detach$okhttp()
        L44:
            int r0 = r10.valueCount
            r4 = 0
        L47:
            if (r4 >= r0) goto L6e
            okhttp3.internal.io.FileSystem r5 = r10.fileSystem
            java.util.List r6 = r11.getCleanFiles$okhttp()
            java.lang.Object r6 = r6.get(r4)
            java.io.File r6 = (java.io.File) r6
            r5.delete(r6)
            long r5 = r10.size
            long[] r7 = r11.getLengths$okhttp()
            r8 = r7[r4]
            long r5 = r5 - r8
            r10.size = r5
            long[] r5 = r11.getLengths$okhttp()
            r6 = 0
            r5[r4] = r6
            int r4 = r4 + 1
            goto L47
        L6e:
            int r0 = r10.redundantOpCount
            int r0 = r0 + r3
            r10.redundantOpCount = r0
            okio.BufferedSink r0 = r10.journalWriter
            if (r0 == 0) goto L89
            java.lang.String r4 = okhttp3.internal.cache.DiskLruCache.REMOVE
            r0.writeUtf8(r4)
            r0.writeByte(r2)
            java.lang.String r2 = r11.getKey$okhttp()
            r0.writeUtf8(r2)
            r0.writeByte(r1)
        L89:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r10.lruEntries
            java.lang.String r11 = r11.getKey$okhttp()
            r0.remove(r11)
            boolean r11 = r10.journalRebuildRequired()
            if (r11 == 0) goto La3
            okhttp3.internal.concurrent.TaskQueue r4 = r10.cleanupQueue
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r5 = r10.cleanupTask
            r8 = 2
            r9 = 0
            r6 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r4, r5, r6, r8, r9)
        La3:
            return r3
    }

    public final void setClosed$okhttp(boolean r1) {
            r0 = this;
            r0.closed = r1
            return
    }

    public final synchronized void setMaxSize(long r7) {
            r6 = this;
            monitor-enter(r6)
            r6.maxSize = r7     // Catch: java.lang.Throwable -> L13
            boolean r7 = r6.initialized     // Catch: java.lang.Throwable -> L13
            if (r7 == 0) goto L16
            okhttp3.internal.concurrent.TaskQueue r0 = r6.cleanupQueue     // Catch: java.lang.Throwable -> L13
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r1 = r6.cleanupTask     // Catch: java.lang.Throwable -> L13
            r4 = 2
            r5 = 0
            r2 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r0, r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L13
            goto L16
        L13:
            r0 = move-exception
            r7 = r0
            goto L18
        L16:
            monitor-exit(r6)
            return
        L18:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L13
            throw r7
    }

    public final synchronized long size() {
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

    public final synchronized java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Snapshot> snapshots() {
            r1 = this;
            monitor-enter(r1)
            r1.initialize()     // Catch: java.lang.Throwable -> Lb
            okhttp3.internal.cache.DiskLruCache$snapshots$1 r0 = new okhttp3.internal.cache.DiskLruCache$snapshots$1     // Catch: java.lang.Throwable -> Lb
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public final void trimToSize() {
            r4 = this;
        L0:
            long r0 = r4.size
            long r2 = r4.maxSize
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lf
            boolean r0 = r4.removeOldestEntry()
            if (r0 != 0) goto L0
            return
        Lf:
            r0 = 0
            r4.mostRecentTrimFailed = r0
            return
    }
}
