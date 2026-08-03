package okhttp3.internal.cache;

import bsh.C0353j;
import gg.AbstractC1411g;
import gg.AbstractC1416l;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.p220io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.C3193a;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import p068eh.AbstractC0921a;
import p114hg.InterfaceC1711a;
import p129ig.AbstractC2043a;
import p136j8.C2104o;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3147k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class DiskLruCache implements Closeable, Flushable {
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final File directory;
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private BufferedSink journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;
    public static final Companion Companion = new Companion(null);
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String MAGIC = "libcore.io.DiskLruCache";
    public static final String VERSION_1 = "1";
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final C3147k LEGAL_KEY_PATTERN = new C3147k("[a-z0-9_-]{1,120}");
    public static final String CLEAN = "CLEAN";
    public static final String DIRTY = "DIRTY";
    public static final String REMOVE = "REMOVE";
    public static final String READ = "READ";

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class Editor {
        private boolean done;
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;
        private final boolean[] written;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Editor(DiskLruCache diskLruCache, Entry entry) {
            entry.getClass();
            this.this$0 = diskLruCache;
            this.entry = entry;
            this.written = entry.getReadable$okhttp() ? null : new boolean[diskLruCache.getValueCount$okhttp()];
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void abort() {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                try {
                    if (this.done) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (AbstractC1416l.m3825a(this.entry.getCurrentEditor$okhttp(), this)) {
                        diskLruCache.completeEdit$okhttp(this, false);
                    }
                    this.done = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void commit() {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                try {
                    if (this.done) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (AbstractC1416l.m3825a(this.entry.getCurrentEditor$okhttp(), this)) {
                        diskLruCache.completeEdit$okhttp(this, true);
                    }
                    this.done = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void detach$okhttp() {
            if (AbstractC1416l.m3825a(this.entry.getCurrentEditor$okhttp(), this)) {
                if (this.this$0.civilizedFileSystem) {
                    this.this$0.completeEdit$okhttp(this, false);
                } else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Sink newSink(int i9) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!AbstractC1416l.m3825a(this.entry.getCurrentEditor$okhttp(), this)) {
                    return Okio.blackhole();
                }
                if (!this.entry.getReadable$okhttp()) {
                    boolean[] zArr = this.written;
                    zArr.getClass();
                    zArr[i9] = true;
                }
                try {
                    return new FaultHidingSink(diskLruCache.getFileSystem$okhttp().sink(this.entry.getDirtyFiles$okhttp().get(i9)), new DiskLruCache$Editor$newSink$1$1(diskLruCache, this));
                } catch (FileNotFoundException unused) {
                    return Okio.blackhole();
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Source newSource(int i9) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.");
                }
                Source source = null;
                if (!this.entry.getReadable$okhttp() || !AbstractC1416l.m3825a(this.entry.getCurrentEditor$okhttp(), this) || this.entry.getZombie$okhttp()) {
                    return null;
                }
                try {
                    source = diskLruCache.getFileSystem$okhttp().source(this.entry.getCleanFiles$okhttp().get(i9));
                } catch (FileNotFoundException unused) {
                }
                return source;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class Entry {
        private final List<File> cleanFiles;
        private Editor currentEditor;
        private final List<File> dirtyFiles;
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Entry(DiskLruCache diskLruCache, String str) {
            str.getClass();
            this.this$0 = diskLruCache;
            this.key = str;
            this.lengths = new long[diskLruCache.getValueCount$okhttp()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int valueCount$okhttp = diskLruCache.getValueCount$okhttp();
            for (int i9 = 0; i9 < valueCount$okhttp; i9++) {
                sb2.append(i9);
                this.cleanFiles.add(new File(this.this$0.getDirectory(), sb2.toString()));
                sb2.append(".tmp");
                this.dirtyFiles.add(new File(this.this$0.getDirectory(), sb2.toString()));
                sb2.setLength(length);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final Void invalidLengths(List<String> list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final Source newSource(int i9) {
            final Source source = this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(i9));
            if (this.this$0.civilizedFileSystem) {
                return source;
            }
            this.lockingSourceCount++;
            final DiskLruCache diskLruCache = this.this$0;
            return new ForwardingSource(source) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                private boolean closed;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    super.close();
                    if (this.closed) {
                        return;
                    }
                    this.closed = true;
                    DiskLruCache diskLruCache2 = diskLruCache;
                    DiskLruCache.Entry entry = this;
                    synchronized (diskLruCache2) {
                        entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount$okhttp() - 1);
                        if (entry.getLockingSourceCount$okhttp() == 0 && entry.getZombie$okhttp()) {
                            diskLruCache2.removeEntry$okhttp(entry);
                        }
                    }
                }
            };
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getKey$okhttp() {
            return this.key;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean getZombie$okhttp() {
            return this.zombie;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setCurrentEditor$okhttp(Editor editor) {
            this.currentEditor = editor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setLengths$okhttp(List<String> list) throws IOException {
            list.getClass();
            if (list.size() != this.this$0.getValueCount$okhttp()) {
                invalidLengths(list);
                C3193a.m6814c();
                return;
            }
            try {
                int size = list.size();
                for (int i9 = 0; i9 < size; i9++) {
                    this.lengths[i9] = Long.parseLong(list.get(i9));
                }
            } catch (NumberFormatException unused) {
                invalidLengths(list);
                C3193a.m6814c();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setLockingSourceCount$okhttp(int i9) {
            this.lockingSourceCount = i9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setReadable$okhttp(boolean z9) {
            this.readable = z9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setSequenceNumber$okhttp(long j3) {
            this.sequenceNumber = j3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setZombie$okhttp(boolean z9) {
            this.zombie = z9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache = this.this$0;
            if (Util.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                C2104o.m5284i(Thread.currentThread().getName(), " MUST hold lock on ", diskLruCache);
                return null;
            }
            if (!this.readable) {
                return null;
            }
            if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            try {
                int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                for (int i9 = 0; i9 < valueCount$okhttp; i9++) {
                    arrayList.add(newSource(i9));
                }
                return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Util.closeQuietly((Source) it.next());
                }
                try {
                    this.this$0.removeEntry$okhttp(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void writeLengths$okhttp(BufferedSink bufferedSink) {
            bufferedSink.getClass();
            for (long j3 : this.lengths) {
                bufferedSink.writeByte(32).writeDecimalLong(j3);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<Source> sources;
        final /* synthetic */ DiskLruCache this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends okio.Source> */
        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(DiskLruCache diskLruCache, String str, long j3, List<? extends Source> list, long[] jArr) {
            str.getClass();
            list.getClass();
            jArr.getClass();
            this.this$0 = diskLruCache;
            this.key = str;
            this.sequenceNumber = j3;
            this.sources = list;
            this.lengths = jArr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<Source> it = this.sources.iterator();
            while (it.hasNext()) {
                Util.closeQuietly(it.next());
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Editor edit() {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long getLength(int i9) {
            return this.lengths[i9];
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Source getSource(int i9) {
            return this.sources.get(i9);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String key() {
            return this.key;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.DiskLruCache$snapshots$1 */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class C31711 implements Iterator<Snapshot>, InterfaceC1711a {
        private final Iterator<Entry> delegate;
        private Snapshot nextSnapshot;
        private Snapshot removeSnapshot;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C31711() {
            Iterator<Entry> it = new ArrayList(DiskLruCache.this.getLruEntries$okhttp().values()).iterator();
            it.getClass();
            this.delegate = it;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.Iterator
        public boolean hasNext() {
            Snapshot snapshotSnapshot$okhttp;
            if (this.nextSnapshot != null) {
                return true;
            }
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (diskLruCache.getClosed$okhttp()) {
                    return false;
                }
                while (this.delegate.hasNext()) {
                    Entry next = this.delegate.next();
                    if (next != null && (snapshotSnapshot$okhttp = next.snapshot$okhttp()) != null) {
                        this.nextSnapshot = snapshotSnapshot$okhttp;
                        return true;
                    }
                }
                return false;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        public Snapshot next() {
            if (!hasNext()) {
                C0353j.m1307e();
                return null;
            }
            Snapshot snapshot = this.nextSnapshot;
            this.removeSnapshot = snapshot;
            this.nextSnapshot = null;
            snapshot.getClass();
            return snapshot;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.Iterator
        public void remove() {
            Snapshot snapshot = this.removeSnapshot;
            if (snapshot == null) {
                C2104o.m5276A("remove() before next()");
                return;
            }
            try {
                DiskLruCache.this.remove(snapshot.key());
            } catch (IOException unused) {
            } finally {
                this.removeSnapshot = null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(FileSystem fileSystem, File file, int i9, int i10, long j3, TaskRunner taskRunner) {
        fileSystem.getClass();
        file.getClass();
        taskRunner.getClass();
        this.fileSystem = fileSystem;
        this.directory = file;
        this.appVersion = i9;
        this.valueCount = i10;
        this.maxSize = j3;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        final String strM2255r = AbstractC0921a.m2255r(new StringBuilder(), Util.okHttpName, " Cache");
        this.cleanupTask = new Task(strM2255r) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                DiskLruCache diskLruCache = this.this$0;
                synchronized (diskLruCache) {
                    if (!diskLruCache.initialized || diskLruCache.getClosed$okhttp()) {
                        return -1L;
                    }
                    try {
                        diskLruCache.trimToSize();
                    } catch (IOException unused) {
                        diskLruCache.mostRecentTrimFailed = true;
                    }
                    try {
                        if (diskLruCache.journalRebuildRequired()) {
                            diskLruCache.rebuildJournal$okhttp();
                            diskLruCache.redundantOpCount = 0;
                        }
                    } catch (IOException unused2) {
                        diskLruCache.mostRecentRebuildFailed = true;
                        diskLruCache.journalWriter = Okio.buffer(Okio.blackhole());
                    }
                    return -1L;
                }
            }
        };
        if (j3 <= 0) {
            C2104o.m5294t("maxSize <= 0");
            throw null;
        }
        if (i10 <= 0) {
            C2104o.m5294t("valueCount <= 0");
            throw null;
        }
        this.journalFile = new File(file, JOURNAL_FILE);
        this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
        this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final synchronized void checkNotClosed() {
        if (this.closed) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j3, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            j3 = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final boolean journalRebuildRequired() {
        int i9 = this.redundantOpCount;
        return i9 >= 2000 && i9 >= this.lruEntries.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final BufferedSink newJournalWriter() {
        return Okio.buffer(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void processJournal() {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            next.getClass();
            Entry entry = next;
            int i9 = 0;
            if (entry.getCurrentEditor$okhttp() == null) {
                int i10 = this.valueCount;
                while (i9 < i10) {
                    this.size += entry.getLengths$okhttp()[i9];
                    i9++;
                }
            } else {
                entry.setCurrentEditor$okhttp(null);
                int i11 = this.valueCount;
                while (i9 < i11) {
                    this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i9));
                    this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i9));
                    i9++;
                }
                it.remove();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private final void readJournal() {
        BufferedSource bufferedSourceBuffer = Okio.buffer(this.fileSystem.source(this.journalFile));
        try {
            String utf8LineStrict = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict2 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict3 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict4 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict5 = bufferedSourceBuffer.readUtf8LineStrict();
            if (!AbstractC1416l.m3825a(MAGIC, utf8LineStrict) || !AbstractC1416l.m3825a(VERSION_1, utf8LineStrict2) || !AbstractC1416l.m3825a(String.valueOf(this.appVersion), utf8LineStrict3) || !AbstractC1416l.m3825a(String.valueOf(this.valueCount), utf8LineStrict4) || utf8LineStrict5.length() > 0) {
                throw new IOException("unexpected journal header: [" + utf8LineStrict + ", " + utf8LineStrict2 + ", " + utf8LineStrict4 + ", " + utf8LineStrict5 + ']');
            }
            int i9 = 0;
            while (true) {
                try {
                    readJournalLine(bufferedSourceBuffer.readUtf8LineStrict());
                    i9++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i9 - this.lruEntries.size();
                    if (bufferedSourceBuffer.exhausted()) {
                        this.journalWriter = newJournalWriter();
                    } else {
                        rebuildJournal$okhttp();
                    }
                    AbstractC2043a.m5035i(bufferedSourceBuffer, null);
                    return;
                }
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void readJournalLine(String str) throws IOException {
        String strSubstring;
        int iM6718q0 = AbstractC3149m.m6718q0(str, ' ', 0, 6);
        if (iM6718q0 == -1) {
            C2104o.m5299y("unexpected journal line: ".concat(str));
            return;
        }
        int i9 = iM6718q0 + 1;
        int iM6718q02 = AbstractC3149m.m6718q0(str, ' ', i9, 4);
        if (iM6718q02 == -1) {
            strSubstring = str.substring(i9);
            String str2 = REMOVE;
            if (iM6718q0 == str2.length() && AbstractC3156t.m6740d0(str, str2, false)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i9, iM6718q02);
        }
        Entry entry = this.lruEntries.get(strSubstring);
        if (entry == null) {
            entry = new Entry(this, strSubstring);
            this.lruEntries.put(strSubstring, entry);
        }
        if (iM6718q02 != -1) {
            String str3 = CLEAN;
            if (iM6718q0 == str3.length() && AbstractC3156t.m6740d0(str, str3, false)) {
                List<String> listM6691F0 = AbstractC3149m.m6691F0(str.substring(iM6718q02 + 1), new char[]{' '}, 6);
                entry.setReadable$okhttp(true);
                entry.setCurrentEditor$okhttp(null);
                entry.setLengths$okhttp(listM6691F0);
                return;
            }
        }
        if (iM6718q02 == -1) {
            String str4 = DIRTY;
            if (iM6718q0 == str4.length() && AbstractC3156t.m6740d0(str, str4, false)) {
                entry.setCurrentEditor$okhttp(new Editor(this, entry));
                return;
            }
        }
        if (iM6718q02 == -1) {
            String str5 = READ;
            if (iM6718q0 == str5.length() && AbstractC3156t.m6740d0(str, str5, false)) {
                return;
            }
        }
        C2104o.m5299y("unexpected journal line: ".concat(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean removeOldestEntry() {
        for (Entry entry : this.lruEntries.values()) {
            if (!entry.getZombie$okhttp()) {
                removeEntry$okhttp(entry);
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void validateKey(String str) {
        if (LEGAL_KEY_PATTERN.m6683d(str)) {
            return;
        }
        C2104o.m5292r(str, "keys must match regex [a-z0-9_-]{1,120}: \"");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        Editor currentEditor$okhttp;
        try {
            if (this.initialized && !this.closed) {
                Collection<Entry> collectionValues = this.lruEntries.values();
                collectionValues.getClass();
                for (Entry entry : (Entry[]) collectionValues.toArray(new Entry[0])) {
                    if (entry.getCurrentEditor$okhttp() != null && (currentEditor$okhttp = entry.getCurrentEditor$okhttp()) != null) {
                        currentEditor$okhttp.detach$okhttp();
                    }
                }
                trimToSize();
                BufferedSink bufferedSink = this.journalWriter;
                bufferedSink.getClass();
                bufferedSink.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void completeEdit$okhttp(Editor editor, boolean z9) {
        editor.getClass();
        Entry entry$okhttp = editor.getEntry$okhttp();
        if (!AbstractC1416l.m3825a(entry$okhttp.getCurrentEditor$okhttp(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z9 && !entry$okhttp.getReadable$okhttp()) {
            int i9 = this.valueCount;
            for (int i10 = 0; i10 < i9; i10++) {
                boolean[] written$okhttp = editor.getWritten$okhttp();
                written$okhttp.getClass();
                if (!written$okhttp[i10]) {
                    editor.abort();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!this.fileSystem.exists(entry$okhttp.getDirtyFiles$okhttp().get(i10))) {
                    editor.abort();
                    return;
                }
            }
        }
        int i11 = this.valueCount;
        for (int i12 = 0; i12 < i11; i12++) {
            File file = entry$okhttp.getDirtyFiles$okhttp().get(i12);
            if (!z9 || entry$okhttp.getZombie$okhttp()) {
                this.fileSystem.delete(file);
            } else if (this.fileSystem.exists(file)) {
                File file2 = entry$okhttp.getCleanFiles$okhttp().get(i12);
                this.fileSystem.rename(file, file2);
                long j3 = entry$okhttp.getLengths$okhttp()[i12];
                long size = this.fileSystem.size(file2);
                entry$okhttp.getLengths$okhttp()[i12] = size;
                this.size = (this.size - j3) + size;
            }
        }
        entry$okhttp.setCurrentEditor$okhttp(null);
        if (entry$okhttp.getZombie$okhttp()) {
            removeEntry$okhttp(entry$okhttp);
            return;
        }
        this.redundantOpCount++;
        BufferedSink bufferedSink = this.journalWriter;
        bufferedSink.getClass();
        if (entry$okhttp.getReadable$okhttp() || z9) {
            entry$okhttp.setReadable$okhttp(true);
            bufferedSink.writeUtf8(CLEAN).writeByte(32);
            bufferedSink.writeUtf8(entry$okhttp.getKey$okhttp());
            entry$okhttp.writeLengths$okhttp(bufferedSink);
            bufferedSink.writeByte(10);
            if (z9) {
                long j4 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j4;
                entry$okhttp.setSequenceNumber$okhttp(j4);
            }
        } else {
            this.lruEntries.remove(entry$okhttp.getKey$okhttp());
            bufferedSink.writeUtf8(REMOVE).writeByte(32);
            bufferedSink.writeUtf8(entry$okhttp.getKey$okhttp());
            bufferedSink.writeByte(10);
        }
        bufferedSink.flush();
        if (this.size > this.maxSize || journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void delete() {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized Editor edit(String str, long j3) {
        str.getClass();
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (j3 != ANY_SEQUENCE_NUMBER && (entry == null || entry.getSequenceNumber$okhttp() != j3)) {
            return null;
        }
        if ((entry != null ? entry.getCurrentEditor$okhttp() : null) != null) {
            return null;
        }
        if (entry != null && entry.getLockingSourceCount$okhttp() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            BufferedSink bufferedSink = this.journalWriter;
            bufferedSink.getClass();
            bufferedSink.writeUtf8(DIRTY).writeByte(32).writeUtf8(str).writeByte(10);
            bufferedSink.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, str);
                this.lruEntries.put(str, entry);
            }
            Editor editor = new Editor(this, entry);
            entry.setCurrentEditor$okhttp(editor);
            return editor;
        }
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void evictAll() {
        try {
            initialize();
            Collection<Entry> collectionValues = this.lruEntries.values();
            collectionValues.getClass();
            for (Entry entry : (Entry[]) collectionValues.toArray(new Entry[0])) {
                entry.getClass();
                removeEntry$okhttp(entry);
            }
            this.mostRecentTrimFailed = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            BufferedSink bufferedSink = this.journalWriter;
            bufferedSink.getClass();
            bufferedSink.flush();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized Snapshot get(String str) {
        str.getClass();
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return null;
        }
        Snapshot snapshotSnapshot$okhttp = entry.snapshot$okhttp();
        if (snapshotSnapshot$okhttp == null) {
            return null;
        }
        this.redundantOpCount++;
        BufferedSink bufferedSink = this.journalWriter;
        bufferedSink.getClass();
        bufferedSink.writeUtf8(READ).writeByte(32).writeUtf8(str).writeByte(10);
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return snapshotSnapshot$okhttp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final File getDirectory() {
        return this.directory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FileSystem getFileSystem$okhttp() {
        return this.fileSystem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void initialize() {
        try {
            if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.exists(this.journalFileBackup)) {
                boolean zExists = this.fileSystem.exists(this.journalFile);
                FileSystem fileSystem = this.fileSystem;
                if (zExists) {
                    fileSystem.delete(this.journalFileBackup);
                } else {
                    fileSystem.rename(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e6) {
                    Platform.Companion.get().log("DiskLruCache " + this.directory + " is corrupt: " + e6.getMessage() + ", removing", 5, e6);
                    try {
                        delete();
                        this.closed = false;
                        rebuildJournal$okhttp();
                        this.initialized = true;
                    } catch (Throwable th2) {
                        this.closed = false;
                        throw th2;
                    }
                }
            }
            rebuildJournal$okhttp();
            this.initialized = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized boolean isClosed() {
        return this.closed;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final synchronized void rebuildJournal$okhttp() {
        try {
            BufferedSink bufferedSink = this.journalWriter;
            if (bufferedSink != null) {
                bufferedSink.close();
            }
            BufferedSink bufferedSinkBuffer = Okio.buffer(this.fileSystem.sink(this.journalFileTmp));
            try {
                bufferedSinkBuffer.writeUtf8(MAGIC).writeByte(10);
                bufferedSinkBuffer.writeUtf8(VERSION_1).writeByte(10);
                bufferedSinkBuffer.writeDecimalLong(this.appVersion).writeByte(10);
                bufferedSinkBuffer.writeDecimalLong(this.valueCount).writeByte(10);
                bufferedSinkBuffer.writeByte(10);
                for (Entry entry : this.lruEntries.values()) {
                    if (entry.getCurrentEditor$okhttp() != null) {
                        bufferedSinkBuffer.writeUtf8(DIRTY).writeByte(32);
                        bufferedSinkBuffer.writeUtf8(entry.getKey$okhttp());
                        bufferedSinkBuffer.writeByte(10);
                    } else {
                        bufferedSinkBuffer.writeUtf8(CLEAN).writeByte(32);
                        bufferedSinkBuffer.writeUtf8(entry.getKey$okhttp());
                        entry.writeLengths$okhttp(bufferedSinkBuffer);
                        bufferedSinkBuffer.writeByte(10);
                    }
                }
                AbstractC2043a.m5035i(bufferedSinkBuffer, null);
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.rename(this.journalFile, this.journalFileBackup);
                }
                this.fileSystem.rename(this.journalFileTmp, this.journalFile);
                this.fileSystem.delete(this.journalFileBackup);
                this.journalWriter = newJournalWriter();
                this.hasJournalErrors = false;
                this.mostRecentRebuildFailed = false;
            } finally {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized boolean remove(String str) {
        str.getClass();
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return false;
        }
        boolean zRemoveEntry$okhttp = removeEntry$okhttp(entry);
        if (zRemoveEntry$okhttp && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return zRemoveEntry$okhttp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean removeEntry$okhttp(Entry entry) {
        BufferedSink bufferedSink;
        entry.getClass();
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount$okhttp() > 0 && (bufferedSink = this.journalWriter) != null) {
                bufferedSink.writeUtf8(DIRTY);
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(entry.getKey$okhttp());
                bufferedSink.writeByte(10);
                bufferedSink.flush();
            }
            if (entry.getLockingSourceCount$okhttp() > 0 || entry.getCurrentEditor$okhttp() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        int i9 = this.valueCount;
        for (int i10 = 0; i10 < i9; i10++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i10));
            this.size -= entry.getLengths$okhttp()[i10];
            entry.getLengths$okhttp()[i10] = 0;
        }
        this.redundantOpCount++;
        BufferedSink bufferedSink2 = this.journalWriter;
        if (bufferedSink2 != null) {
            bufferedSink2.writeUtf8(REMOVE);
            bufferedSink2.writeByte(32);
            bufferedSink2.writeUtf8(entry.getKey$okhttp());
            bufferedSink2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey$okhttp());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setClosed$okhttp(boolean z9) {
        this.closed = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void setMaxSize(long j3) {
        this.maxSize = j3;
        if (this.initialized) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized long size() {
        initialize();
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized Iterator<Snapshot> snapshots() {
        initialize();
        return new C31711();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void trimToSize() {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.cache.DiskLruCache.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        private Companion() {
        }
    }

    public final Editor edit(String str) {
        str.getClass();
        return edit$default(this, str, 0L, 2, null);
    }
}
