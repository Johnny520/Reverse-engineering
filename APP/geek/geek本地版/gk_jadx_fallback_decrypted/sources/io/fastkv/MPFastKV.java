package io.fastkv;

/* JADX INFO: loaded from: classes.dex */
public final class MPFastKV extends io.fastkv.AbsFastKV {
    private static final int LOCK_TIMEOUT = 3000;
    private static final int MSG_APPLY = 2;
    private static final int MSG_CLEAR = 4;
    private static final int MSG_DATA_CHANGE = 3;
    private static final int MSG_REFRESH = 1;
    private static final java.util.Random random = null;
    private java.io.RandomAccessFile aAccessFile;
    private java.nio.MappedByteBuffer aBuffer;
    private java.nio.channels.FileChannel aChannel;
    private final java.io.File aFile;
    private final java.util.concurrent.Executor applyExecutor;
    private java.io.RandomAccessFile bAccessFile;
    private java.nio.channels.FileChannel bChannel;
    private final java.io.File bFile;
    private java.nio.channels.FileLock bFileLock;
    private final java.util.Set<java.lang.String> changedKey;
    private volatile io.fastkv.MPFastKV.KVFileObserver fileObserver;
    private final android.os.Handler kvHandler;
    private boolean needFullWrite;
    private final boolean needWatchFileChange;
    private final java.util.concurrent.Executor refreshExecutor;
    private int updateCount;
    private long updateHash;
    private int[] updateStartAndSize;

    /* JADX INFO: renamed from: io.fastkv.MPFastKV$1, reason: invalid class name */
    public class AnonymousClass1 extends android.os.Handler {
        final /* synthetic */ io.fastkv.MPFastKV this$0;

        public AnonymousClass1(io.fastkv.MPFastKV r1, android.os.Looper r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        public static /* synthetic */ void a(io.fastkv.MPFastKV r0) {
                lambda$handleMessage$0(r0)
                return
        }

        private static /* synthetic */ void lambda$handleMessage$0(io.fastkv.MPFastKV r0) {
                io.fastkv.MPFastKV.access$200(r0)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r3) {
                r2 = this;
                int r3 = r3.what
                r0 = 1
                if (r3 == r0) goto L22
                r0 = 2
                if (r3 == r0) goto L1c
                r0 = 3
                if (r3 == r0) goto L16
                r0 = 4
                if (r3 == r0) goto Lf
                return
            Lf:
                io.fastkv.MPFastKV r3 = r2.this$0
                r0 = 0
                r3.notifyListeners(r0)
                return
            L16:
                io.fastkv.MPFastKV r3 = r2.this$0
                io.fastkv.MPFastKV.access$100(r3)
                return
            L1c:
                io.fastkv.MPFastKV r3 = r2.this$0
                r3.apply()
                return
            L22:
                io.fastkv.MPFastKV r3 = r2.this$0
                java.util.concurrent.Executor r3 = io.fastkv.MPFastKV.access$000(r3)
                io.fastkv.MPFastKV r0 = r2.this$0
                io.fastkv.c r1 = new io.fastkv.c
                r1.<init>(r0)
                r3.execute(r1)
                return
        }
    }

    public static class Builder {
        private static final java.util.Map<java.lang.String, io.fastkv.MPFastKV> INSTANCE_MAP = null;
        private io.fastkv.interfaces.FastCipher cipher;
        private io.fastkv.interfaces.FastEncoder[] encoders;
        private final java.lang.String name;
        private boolean needWatchFileChange;
        private final java.lang.String path;

        static {
                java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
                r0.<init>()
                io.fastkv.MPFastKV.Builder.INSTANCE_MAP = r0
                return
        }

        public Builder(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                r2.<init>()
                r0 = 1
                r2.needWatchFileChange = r0
                if (r3 == 0) goto L30
                boolean r0 = r3.isEmpty()
                if (r0 != 0) goto L30
                if (r4 == 0) goto L28
                boolean r0 = r4.isEmpty()
                if (r0 != 0) goto L28
                java.lang.String r0 = "/"
                boolean r1 = r3.endsWith(r0)
                if (r1 == 0) goto L1f
                goto L23
            L1f:
                java.lang.String r3 = r3.concat(r0)
            L23:
                r2.path = r3
                r2.name = r4
                return
            L28:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "name is empty"
                r3.<init>(r4)
                throw r3
            L30:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "path is empty"
                r3.<init>(r4)
                throw r3
        }

        public io.fastkv.MPFastKV build() {
                r10 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r10.path
                r0.append(r1)
                java.lang.String r1 = r10.name
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.util.Map<java.lang.String, io.fastkv.MPFastKV> r1 = io.fastkv.MPFastKV.Builder.INSTANCE_MAP
                java.lang.Object r2 = r1.get(r0)
                io.fastkv.MPFastKV r2 = (io.fastkv.MPFastKV) r2
                if (r2 != 0) goto L42
                java.lang.Class<io.fastkv.MPFastKV$Builder> r3 = io.fastkv.MPFastKV.Builder.class
                monitor-enter(r3)
                java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L3c
                io.fastkv.MPFastKV r2 = (io.fastkv.MPFastKV) r2     // Catch: java.lang.Throwable -> L3c
                if (r2 != 0) goto L3e
                io.fastkv.MPFastKV r4 = new io.fastkv.MPFastKV     // Catch: java.lang.Throwable -> L3c
                java.lang.String r5 = r10.path     // Catch: java.lang.Throwable -> L3c
                java.lang.String r6 = r10.name     // Catch: java.lang.Throwable -> L3c
                io.fastkv.interfaces.FastEncoder[] r7 = r10.encoders     // Catch: java.lang.Throwable -> L3c
                io.fastkv.interfaces.FastCipher r8 = r10.cipher     // Catch: java.lang.Throwable -> L3c
                boolean r9 = r10.needWatchFileChange     // Catch: java.lang.Throwable -> L3c
                r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L3c
                r1.put(r0, r4)     // Catch: java.lang.Throwable -> L3c
                r2 = r4
                goto L3e
            L3c:
                r0 = move-exception
                goto L40
            L3e:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L3c
                return r2
            L40:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L3c
                throw r0
            L42:
                return r2
        }

        public io.fastkv.MPFastKV.Builder cipher(io.fastkv.interfaces.FastCipher r1) {
                r0 = this;
                r0.cipher = r1
                return r0
        }

        public io.fastkv.MPFastKV.Builder disableWatchFileChange() {
                r1 = this;
                r0 = 0
                r1.needWatchFileChange = r0
                return r1
        }

        public io.fastkv.MPFastKV.Builder encoder(io.fastkv.interfaces.FastEncoder[] r1) {
                r0 = this;
                r0.encoders = r1
                return r0
        }
    }

    public class KVFileObserver extends android.os.FileObserver {
        final /* synthetic */ io.fastkv.MPFastKV this$0;

        public KVFileObserver(io.fastkv.MPFastKV r1, java.lang.String r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 2
                r0.<init>(r2, r1)
                return
        }

        @Override // android.os.FileObserver
        public void onEvent(int r3, java.lang.String r4) {
                r2 = this;
                io.fastkv.MPFastKV r3 = r2.this$0
                android.os.Handler r3 = io.fastkv.MPFastKV.access$300(r3)
                r4 = 1
                boolean r3 = r3.hasMessages(r4)
                if (r3 != 0) goto L18
                io.fastkv.MPFastKV r3 = r2.this$0
                android.os.Handler r3 = io.fastkv.MPFastKV.access$300(r3)
                r0 = 30
                r3.sendEmptyMessageDelayed(r4, r0)
            L18:
                return
        }
    }

    static {
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            io.fastkv.MPFastKV.random = r0
            return
    }

    public MPFastKV(java.lang.String r1, java.lang.String r2, io.fastkv.interfaces.FastEncoder[] r3, io.fastkv.interfaces.FastCipher r4, boolean r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r3 = 16
            int[] r3 = new int[r3]
            r0.updateStartAndSize = r3
            r3 = 0
            r0.updateCount = r3
            r0.needFullWrite = r3
            io.fastkv.LimitExecutor r3 = new io.fastkv.LimitExecutor
            r3.<init>()
            r0.applyExecutor = r3
            io.fastkv.LimitExecutor r3 = new io.fastkv.LimitExecutor
            r3.<init>()
            r0.refreshExecutor = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r0.changedKey = r3
            io.fastkv.MPFastKV$1 r3 = new io.fastkv.MPFastKV$1
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r3.<init>(r0, r4)
            r0.kvHandler = r3
            java.io.File r3 = new java.io.File
            java.lang.String r4 = ".kva"
            java.lang.String r4 = defpackage.z30.i(r2, r4)
            r3.<init>(r1, r4)
            r0.aFile = r3
            java.io.File r3 = new java.io.File
            java.lang.String r4 = ".kvb"
            java.lang.String r2 = defpackage.z30.i(r2, r4)
            r3.<init>(r1, r2)
            r0.bFile = r3
            r0.needWatchFileChange = r5
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r1 = r0.data
            monitor-enter(r1)
            java.util.concurrent.Executor r2 = io.fastkv.FastKVConfig.getExecutor()     // Catch: java.lang.Throwable -> L64
            is r3 = new is     // Catch: java.lang.Throwable -> L64
            r4 = 0
            r3.<init>(r0, r4)     // Catch: java.lang.Throwable -> L64
            r2.execute(r3)     // Catch: java.lang.Throwable -> L64
        L5a:
            boolean r2 = r0.startLoading     // Catch: java.lang.Throwable -> L64
            if (r2 != 0) goto L66
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r2 = r0.data     // Catch: java.lang.InterruptedException -> L5a java.lang.Throwable -> L64
            r2.wait()     // Catch: java.lang.InterruptedException -> L5a java.lang.Throwable -> L64
            goto L5a
        L64:
            r2 = move-exception
            goto L68
        L66:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L64
            return
        L68:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L64
            throw r2
    }

    public static /* synthetic */ java.util.concurrent.Executor access$000(io.fastkv.MPFastKV r0) {
            java.util.concurrent.Executor r0 = r0.refreshExecutor
            return r0
    }

    public static /* synthetic */ void access$100(io.fastkv.MPFastKV r0) {
            r0.notifyChangedKeys()
            return
    }

    public static /* synthetic */ void access$200(io.fastkv.MPFastKV r0) {
            r0.refresh()
            return
    }

    public static /* synthetic */ android.os.Handler access$300(io.fastkv.MPFastKV r0) {
            android.os.Handler r0 = r0.kvHandler
            return r0
    }

    private void addUpdate(int r6, int r7) {
            r5 = this;
            int r0 = r5.updateCount
            int[] r1 = r5.updateStartAndSize
            int r2 = r1.length
            int r3 = r0 << 1
            if (r3 < r2) goto L13
            int r3 = r2 << 1
            int[] r3 = new int[r3]
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r3, r4, r2)
            r5.updateStartAndSize = r3
        L13:
            int[] r1 = r5.updateStartAndSize
            r1[r0] = r6
            int r6 = r0 + 1
            r1[r6] = r7
            int r0 = r0 + 2
            r5.updateCount = r0
            return
    }

    private boolean alignAToBuffer() {
            r10 = this;
            io.fastkv.FastBuffer r0 = r10.fastBuffer
            byte[] r0 = r0.hb
            int r0 = r0.length
            r1 = 0
            java.io.RandomAccessFile r2 = r10.aAccessFile     // Catch: java.lang.Exception -> L1f
            if (r2 != 0) goto L21
            java.io.File r2 = r10.aFile     // Catch: java.lang.Exception -> L1f
            boolean r2 = io.fastkv.Utils.makeFileIfNotExist(r2)     // Catch: java.lang.Exception -> L1f
            if (r2 != 0) goto L13
            return r1
        L13:
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L1f
            java.io.File r3 = r10.aFile     // Catch: java.lang.Exception -> L1f
            java.lang.String r4 = "rw"
            r2.<init>(r3, r4)     // Catch: java.lang.Exception -> L1f
            r10.aAccessFile = r2     // Catch: java.lang.Exception -> L1f
            goto L21
        L1f:
            r0 = move-exception
            goto L68
        L21:
            java.io.RandomAccessFile r2 = r10.aAccessFile     // Catch: java.lang.Exception -> L1f
            long r2 = r2.length()     // Catch: java.lang.Exception -> L1f
            long r8 = (long) r0     // Catch: java.lang.Exception -> L1f
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 == 0) goto L31
            java.io.RandomAccessFile r2 = r10.aAccessFile     // Catch: java.lang.Exception -> L1f
            r2.setLength(r8)     // Catch: java.lang.Exception -> L1f
        L31:
            java.nio.channels.FileChannel r2 = r10.aChannel     // Catch: java.lang.Exception -> L1f
            if (r2 != 0) goto L3e
            java.io.RandomAccessFile r2 = r10.aAccessFile     // Catch: java.lang.Exception -> L1f
            java.nio.channels.FileChannel r2 = r2.getChannel()     // Catch: java.lang.Exception -> L1f
            r10.aChannel = r2     // Catch: java.lang.Exception -> L1f
            goto L4b
        L3e:
            long r2 = r2.size()     // Catch: java.lang.Exception -> L1f
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 == 0) goto L4b
            java.nio.channels.FileChannel r2 = r10.aChannel     // Catch: java.lang.Exception -> L1f
            r2.truncate(r8)     // Catch: java.lang.Exception -> L1f
        L4b:
            java.nio.MappedByteBuffer r2 = r10.aBuffer     // Catch: java.lang.Exception -> L1f
            if (r2 == 0) goto L55
            int r2 = r2.capacity()     // Catch: java.lang.Exception -> L1f
            if (r2 == r0) goto L66
        L55:
            java.nio.channels.FileChannel r4 = r10.aChannel     // Catch: java.lang.Exception -> L1f
            java.nio.channels.FileChannel$MapMode r5 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch: java.lang.Exception -> L1f
            r6 = 0
            java.nio.MappedByteBuffer r0 = r4.map(r5, r6, r8)     // Catch: java.lang.Exception -> L1f
            r10.aBuffer = r0     // Catch: java.lang.Exception -> L1f
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Exception -> L1f
            r0.order(r2)     // Catch: java.lang.Exception -> L1f
        L66:
            r0 = 1
            return r0
        L68:
            r10.error(r0)
            return r1
    }

    public static /* synthetic */ void c(io.fastkv.MPFastKV r0, java.lang.String r1) {
            r0.lambda$updateFile$0(r1)
            return
    }

    private void checkDiff(java.util.HashMap<java.lang.String, io.fastkv.Container.BaseContainer> r5) {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r1 = r4.data
            java.util.Set r1 = r1.keySet()
            r0.<init>(r1)
            java.util.HashSet r1 = new java.util.HashSet
            java.util.Set r2 = r5.keySet()
            r1.<init>(r2)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r0)
            r2.retainAll(r1)
            r0.removeAll(r2)
            r1.removeAll(r2)
            java.util.Set<java.lang.String> r3 = r4.changedKey
            r3.addAll(r0)
            java.util.Set<java.lang.String> r0 = r4.changedKey
            r0.addAll(r1)
            java.util.Iterator r0 = r2.iterator()
        L30:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r5.get(r1)
            io.fastkv.Container$BaseContainer r2 = (io.fastkv.Container.BaseContainer) r2
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r3 = r4.data
            java.lang.Object r3 = r3.get(r1)
            io.fastkv.Container$BaseContainer r3 = (io.fastkv.Container.BaseContainer) r3
            if (r2 == 0) goto L30
            boolean r2 = r2.equalTo(r3)
            if (r2 != 0) goto L30
            java.util.Set<java.lang.String> r2 = r4.changedKey
            r2.add(r1)
            goto L30
        L58:
            java.util.Set<java.lang.String> r5 = r4.changedKey
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L66
            android.os.Handler r5 = r4.kvHandler
            r0 = 3
            r5.sendEmptyMessage(r0)
        L66:
            return
    }

    private void checkUpdate() {
            r10 = this;
            java.nio.MappedByteBuffer r0 = r10.aBuffer
            if (r0 == 0) goto Ld6
            java.io.File r1 = r10.aFile
            if (r1 != 0) goto La
            goto Ld6
        La:
            long r1 = r1.length()
            int r1 = (int) r1
            if (r1 > 0) goto L17
            java.lang.String r0 = "invalid file length"
            r10.error(r0)
            return
        L17:
            java.nio.MappedByteBuffer r2 = r10.aBuffer
            int r2 = r2.capacity()
            if (r2 == r1) goto L3a
            java.nio.channels.FileChannel r0 = r10.aChannel
            long r6 = (long) r1
            r0.truncate(r6)
            java.nio.channels.FileChannel r2 = r10.aChannel
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_WRITE
            r4 = 0
            java.nio.MappedByteBuffer r0 = r2.map(r3, r4, r6)
            if (r0 != 0) goto L33
            goto Ld6
        L33:
            r10.aBuffer = r0
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r2)
        L3a:
            java.nio.channels.FileChannel r2 = r10.bChannel
            long r2 = r2.size()
            long r4 = (long) r1
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 == 0) goto L4a
            java.nio.channels.FileChannel r1 = r10.bChannel
            r1.truncate(r4)
        L4a:
            int r1 = r0.capacity()
            r2 = 0
            int r2 = r0.getInt(r2)
            int r3 = io.fastkv.AbsFastKV.unpackSize(r2)
            boolean r2 = io.fastkv.AbsFastKV.isCipher(r2)
            if (r3 < 0) goto Lba
            if (r3 > r1) goto Lba
            r1 = 4
            long r4 = r0.getLong(r1)
            int r1 = r3 + 12
            long r6 = r10.updateHash
            int r8 = r0.capacity()
            int r8 = r8 + (-8)
            if (r1 >= r8) goto L74
            long r6 = r0.getLong(r1)
        L74:
            int r0 = r10.dataEnd
            if (r1 != r0) goto L84
            long r8 = r10.checksum
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 != 0) goto L84
            long r8 = r10.updateHash
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto Ld6
        L84:
            r10.dataEnd = r1
            r10.checksum = r4
            r10.updateHash = r6
            java.util.ArrayList<android.content.SharedPreferences$OnSharedPreferenceChangeListener> r0 = r10.listeners
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L94
            r0 = 0
            goto L9b
        L94:
            java.util.HashMap r0 = new java.util.HashMap
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r1 = r10.data
            r0.<init>(r1)
        L9b:
            r10.reloadData()
            io.fastkv.FastBuffer r1 = r10.fastBuffer
            r6 = 12
            long r6 = r1.getChecksum(r6, r3)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto Lb6
            boolean r1 = r10.parseData(r2)
            if (r1 == 0) goto Lb6
            if (r0 == 0) goto Ld6
            r10.checkDiff(r0)
            return
        Lb6:
            r10.clearData()
            return
        Lba:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid file, dataSize:"
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r3 = ", capacity:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        Ld6:
            return
    }

    private void clearData() {
            r5 = this;
            r5.resetMemory()
            r0 = 4
            r5.alignAToBuffer()     // Catch: java.lang.Exception -> L31
            java.nio.MappedByteBuffer r1 = r5.aBuffer     // Catch: java.lang.Exception -> L31
            r2 = 0
            int r3 = r5.packSize(r2)     // Catch: java.lang.Exception -> L31
            r1.putInt(r2, r3)     // Catch: java.lang.Exception -> L31
            java.nio.MappedByteBuffer r1 = r5.aBuffer     // Catch: java.lang.Exception -> L31
            r3 = 0
            r1.putLong(r0, r3)     // Catch: java.lang.Exception -> L31
            r5.getUpdateHash()     // Catch: java.lang.Exception -> L31
            java.io.File r1 = r5.bFile     // Catch: java.lang.Exception -> L31
            boolean r1 = io.fastkv.Utils.makeFileIfNotExist(r1)     // Catch: java.lang.Exception -> L31
            if (r1 == 0) goto L38
            int r1 = io.fastkv.AbsFastKV.PAGE_SIZE     // Catch: java.lang.Exception -> L31
            r5.setBFileSize(r1)     // Catch: java.lang.Exception -> L31
            r1 = 12
            r5.syncAToB(r2, r1)     // Catch: java.lang.Exception -> L31
            r5.trySettingObserver()     // Catch: java.lang.Exception -> L31
            goto L38
        L31:
            r1 = move-exception
            r5.error(r1)
            r1 = 1
            r5.needFullWrite = r1
        L38:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r5.path
            r2.append(r3)
            java.lang.String r3 = r5.name
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            io.fastkv.Utils.deleteFile(r1)
            android.os.Handler r1 = r5.kvHandler
            r1.sendEmptyMessage(r0)
            return
    }

    public static /* synthetic */ void d(io.fastkv.MPFastKV r0) {
            r0.updateFile()
            return
    }

    public static /* synthetic */ void e(io.fastkv.MPFastKV r0) {
            r0.loadData()
            return
    }

    private boolean fullWrite() {
            r5 = this;
            io.fastkv.FastBuffer r0 = r5.fastBuffer
            r1 = 0
            r0.position = r1
            int r0 = r0.getInt()
            int r0 = io.fastkv.AbsFastKV.unpackSize(r0)
            io.fastkv.FastBuffer r1 = r5.fastBuffer
            long r1 = r1.getLong()
            r5.checksum = r1
            int r3 = r0 + 12
            r5.dataEnd = r3
            io.fastkv.FastBuffer r3 = r5.fastBuffer
            r4 = 12
            long r3 = r3.getChecksum(r4, r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L2c
            io.fastkv.FastBuffer r0 = r5.fastBuffer
            boolean r0 = r5.writeToABFile(r0)
            return r0
        L2c:
            r5.clearData()
            r0 = 1
            return r0
    }

    private void fullWriteAToB() {
            r2 = this;
            java.io.File r0 = r2.bFile     // Catch: java.lang.Exception -> L19
            boolean r0 = io.fastkv.Utils.makeFileIfNotExist(r0)     // Catch: java.lang.Exception -> L19
            if (r0 != 0) goto L9
            return
        L9:
            java.nio.MappedByteBuffer r0 = r2.aBuffer     // Catch: java.lang.Exception -> L19
            int r0 = r0.capacity()     // Catch: java.lang.Exception -> L19
            r2.setBFileSize(r0)     // Catch: java.lang.Exception -> L19
            int r0 = r2.dataEnd     // Catch: java.lang.Exception -> L19
            r1 = 0
            r2.syncAToB(r1, r0)     // Catch: java.lang.Exception -> L19
            return
        L19:
            r0 = move-exception
            r2.error(r0)
            return
    }

    private void fullWriteBufferToA() {
            r4 = this;
            boolean r0 = r4.alignAToBuffer()     // Catch: java.lang.Exception -> L18
            if (r0 == 0) goto L1a
            java.nio.MappedByteBuffer r0 = r4.aBuffer     // Catch: java.lang.Exception -> L18
            r1 = 0
            r0.position(r1)     // Catch: java.lang.Exception -> L18
            java.nio.MappedByteBuffer r0 = r4.aBuffer     // Catch: java.lang.Exception -> L18
            io.fastkv.FastBuffer r2 = r4.fastBuffer     // Catch: java.lang.Exception -> L18
            byte[] r2 = r2.hb     // Catch: java.lang.Exception -> L18
            int r3 = r4.dataEnd     // Catch: java.lang.Exception -> L18
            r0.put(r2, r1, r3)     // Catch: java.lang.Exception -> L18
            return
        L18:
            r0 = move-exception
            goto L1b
        L1a:
            return
        L1b:
            r4.error(r0)
            return
    }

    private void getUpdateHash() {
            r2 = this;
            java.nio.MappedByteBuffer r0 = r2.aBuffer
            if (r0 == 0) goto L18
            int r1 = r2.dataEnd
            int r1 = r1 + 8
            int r0 = r0.capacity()
            if (r1 >= r0) goto L18
            java.nio.MappedByteBuffer r0 = r2.aBuffer
            int r1 = r2.dataEnd
            long r0 = r0.getLong(r1)
            r2.updateHash = r0
        L18:
            return
    }

    private /* synthetic */ void lambda$updateFile$0(java.lang.String r4) {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.path
            r1.append(r2)
            java.lang.String r2 = r3.name
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            io.fastkv.Utils.deleteFile(r0)
            return
    }

    private synchronized void loadData() {
            r5 = this;
            java.lang.String r0 = "loading finish, data len:"
            monitor-enter(r5)
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r1 = r5.data     // Catch: java.lang.Throwable -> L1d
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L1d
            r2 = 1
            r5.startLoading = r2     // Catch: java.lang.Throwable -> L7e
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r2 = r5.data     // Catch: java.lang.Throwable -> L7e
            r2.notify()     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7e
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L1d
            boolean r3 = r5.loadFromCFile()     // Catch: java.lang.Throwable -> L1d
            if (r3 != 0) goto L1f
            r5.loadFromABFile()     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r0 = move-exception
            goto L81
        L1f:
            io.fastkv.FastBuffer r3 = r5.fastBuffer     // Catch: java.lang.Throwable -> L1d
            if (r3 != 0) goto L2c
            io.fastkv.FastBuffer r3 = new io.fastkv.FastBuffer     // Catch: java.lang.Throwable -> L1d
            int r4 = io.fastkv.AbsFastKV.PAGE_SIZE     // Catch: java.lang.Throwable -> L1d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1d
            r5.fastBuffer = r3     // Catch: java.lang.Throwable -> L1d
        L2c:
            int r3 = r5.dataEnd     // Catch: java.lang.Throwable -> L1d
            if (r3 != 0) goto L34
            r3 = 12
            r5.dataEnd = r3     // Catch: java.lang.Throwable -> L1d
        L34:
            boolean r3 = r5.needRewrite     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L40
            r5.rewrite()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "rewrite data"
            r5.info(r3)     // Catch: java.lang.Throwable -> L1d
        L40:
            io.fastkv.interfaces.FastLogger r3 = r5.logger     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L79
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L1d
            long r3 = r3 - r1
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1d
            int r0 = r5.dataEnd     // Catch: java.lang.Throwable -> L1d
            r1.append(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = ", get keys:"
            r1.append(r0)     // Catch: java.lang.Throwable -> L1d
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r5.data     // Catch: java.lang.Throwable -> L1d
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L1d
            r1.append(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = ", use time:"
            r1.append(r0)     // Catch: java.lang.Throwable -> L1d
            r1.append(r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = " ms"
            r1.append(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L1d
            r5.info(r0)     // Catch: java.lang.Throwable -> L1d
        L79:
            r5.trySettingObserver()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r5)
            return
        L7e:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7e
            throw r0     // Catch: java.lang.Throwable -> L1d
        L81:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1d
            throw r0
    }

    private void loadFromABFile() {
            r15 = this;
            java.lang.String r0 = "rw"
            r1 = 0
            r2 = r1
        L4:
            java.io.File r3 = r15.aFile     // Catch: java.lang.Exception -> L15
            boolean r3 = io.fastkv.Utils.makeFileIfNotExist(r3)     // Catch: java.lang.Exception -> L15
            if (r3 == 0) goto L18
            java.io.File r3 = r15.bFile     // Catch: java.lang.Exception -> L15
            boolean r3 = io.fastkv.Utils.makeFileIfNotExist(r3)     // Catch: java.lang.Exception -> L15
            if (r3 != 0) goto L23
            goto L18
        L15:
            r0 = move-exception
            goto L189
        L18:
            r3 = 3
            if (r2 >= r3) goto L23
            r3 = 20
            java.lang.Thread.sleep(r3)     // Catch: java.lang.Exception -> L15
            int r2 = r2 + 1
            goto L4
        L23:
            java.io.File r2 = r15.aFile     // Catch: java.lang.Exception -> L15
            boolean r2 = r2.exists()     // Catch: java.lang.Exception -> L15
            if (r2 == 0) goto L17e
            java.io.File r2 = r15.bFile     // Catch: java.lang.Exception -> L15
            boolean r2 = r2.exists()     // Catch: java.lang.Exception -> L15
            if (r2 != 0) goto L35
            goto L17e
        L35:
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L15
            java.io.File r3 = r15.aFile     // Catch: java.lang.Exception -> L15
            r2.<init>(r3, r0)     // Catch: java.lang.Exception -> L15
            r15.aAccessFile = r2     // Catch: java.lang.Exception -> L15
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L15
            java.io.File r3 = r15.bFile     // Catch: java.lang.Exception -> L15
            r2.<init>(r3, r0)     // Catch: java.lang.Exception -> L15
            r15.bAccessFile = r2     // Catch: java.lang.Exception -> L15
            java.io.RandomAccessFile r0 = r15.aAccessFile     // Catch: java.lang.Exception -> L15
            long r2 = r0.length()     // Catch: java.lang.Exception -> L15
            java.io.RandomAccessFile r0 = r15.bAccessFile     // Catch: java.lang.Exception -> L15
            long r4 = r0.length()     // Catch: java.lang.Exception -> L15
            java.io.RandomAccessFile r0 = r15.aAccessFile     // Catch: java.lang.Exception -> L15
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch: java.lang.Exception -> L15
            r15.aChannel = r0     // Catch: java.lang.Exception -> L15
            java.io.RandomAccessFile r0 = r15.bAccessFile     // Catch: java.lang.Exception -> L15
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch: java.lang.Exception -> L15
            r15.bChannel = r0     // Catch: java.lang.Exception -> L15
            java.nio.channels.FileLock r6 = r0.lock()     // Catch: java.lang.Exception -> L15
            java.nio.channels.FileChannel r7 = r15.aChannel     // Catch: java.lang.Throwable -> L9e java.io.IOException -> L16b
            java.nio.channels.FileChannel$MapMode r8 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch: java.lang.Throwable -> L9e java.io.IOException -> L16b
            r13 = 0
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L73
            r11 = r2
            goto L77
        L73:
            int r9 = io.fastkv.AbsFastKV.PAGE_SIZE     // Catch: java.lang.Throwable -> L9e java.io.IOException -> L16b
            long r9 = (long) r9     // Catch: java.lang.Throwable -> L9e java.io.IOException -> L16b
            r11 = r9
        L77:
            r9 = 0
            java.nio.MappedByteBuffer r7 = r7.map(r8, r9, r11)     // Catch: java.lang.Throwable -> L9e java.io.IOException -> L16b
            r15.aBuffer = r7     // Catch: java.lang.Throwable -> L9e java.io.IOException -> L16b
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L9e java.io.IOException -> L16b
            r7.order(r8)     // Catch: java.lang.Throwable -> L9e java.io.IOException -> L16b
            r7 = 12
            if (r0 != 0) goto La1
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 != 0) goto La1
            r15.dataEnd = r7     // Catch: java.lang.Throwable -> L9e
            java.io.RandomAccessFile r0 = r15.bAccessFile     // Catch: java.lang.Throwable -> L9e
            int r1 = io.fastkv.AbsFastKV.PAGE_SIZE     // Catch: java.lang.Throwable -> L9e
            long r2 = (long) r1     // Catch: java.lang.Throwable -> L9e
            r0.setLength(r2)     // Catch: java.lang.Throwable -> L9e
            java.nio.channels.FileChannel r0 = r15.bChannel     // Catch: java.lang.Throwable -> L9e
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L9e
            r0.truncate(r1)     // Catch: java.lang.Throwable -> L9e
            goto L164
        L9e:
            r0 = move-exception
            goto L17a
        La1:
            java.io.File r0 = r15.bFile     // Catch: java.lang.Throwable -> L9e
            boolean r0 = r15.loadWithBlockingIO(r0)     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto Le8
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto Ld9
            io.fastkv.FastBuffer r0 = r15.fastBuffer     // Catch: java.lang.Throwable -> L9e
            byte[] r0 = r0.hb     // Catch: java.lang.Throwable -> L9e
            int r0 = r0.length     // Catch: java.lang.Throwable -> L9e
            java.nio.MappedByteBuffer r2 = r15.aBuffer     // Catch: java.lang.Throwable -> L9e
            int r2 = r2.capacity()     // Catch: java.lang.Throwable -> L9e
            if (r0 != r2) goto Ld9
            io.fastkv.FastBuffer r0 = r15.fastBuffer     // Catch: java.lang.Throwable -> L9e
            byte[] r0 = r0.hb     // Catch: java.lang.Throwable -> L9e
            int r2 = r15.dataEnd     // Catch: java.lang.Throwable -> L9e
            byte[] r3 = new byte[r2]     // Catch: java.lang.Throwable -> L9e
            java.nio.MappedByteBuffer r4 = r15.aBuffer     // Catch: java.lang.Throwable -> L9e
            r4.get(r3, r1, r2)     // Catch: java.lang.Throwable -> L9e
        Lc7:
            int r2 = r15.dataEnd     // Catch: java.lang.Throwable -> L9e
            if (r1 >= r2) goto Ld5
            r4 = r3[r1]     // Catch: java.lang.Throwable -> L9e
            r5 = r0[r1]     // Catch: java.lang.Throwable -> L9e
            if (r4 == r5) goto Ld2
            goto Ld5
        Ld2:
            int r1 = r1 + 1
            goto Lc7
        Ld5:
            if (r1 != r2) goto Ld9
            goto L164
        Ld9:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = "A file error"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9e
            r15.warning(r0)     // Catch: java.lang.Throwable -> L9e
            r15.fullWriteBufferToA()     // Catch: java.lang.Throwable -> L9e
            goto L164
        Le8:
            r15.updateCount = r1     // Catch: java.lang.Throwable -> L9e
            r15.resetData()     // Catch: java.lang.Throwable -> L9e
            io.fastkv.FastBuffer r0 = r15.fastBuffer     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto Lfc
            byte[] r0 = r0.hb     // Catch: java.lang.Throwable -> L9e
            int r0 = r0.length     // Catch: java.lang.Throwable -> L9e
            java.nio.MappedByteBuffer r4 = r15.aBuffer     // Catch: java.lang.Throwable -> L9e
            int r4 = r4.capacity()     // Catch: java.lang.Throwable -> L9e
            if (r0 == r4) goto L109
        Lfc:
            io.fastkv.FastBuffer r0 = new io.fastkv.FastBuffer     // Catch: java.lang.Throwable -> L9e
            java.nio.MappedByteBuffer r4 = r15.aBuffer     // Catch: java.lang.Throwable -> L9e
            int r4 = r4.capacity()     // Catch: java.lang.Throwable -> L9e
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L9e
            r15.fastBuffer = r0     // Catch: java.lang.Throwable -> L9e
        L109:
            java.nio.MappedByteBuffer r0 = r15.aBuffer     // Catch: java.lang.Throwable -> L9e
            int r0 = r0.getInt()     // Catch: java.lang.Throwable -> L9e
            int r4 = io.fastkv.AbsFastKV.unpackSize(r0)     // Catch: java.lang.Throwable -> L9e
            boolean r0 = io.fastkv.AbsFastKV.isCipher(r0)     // Catch: java.lang.Throwable -> L9e
            if (r4 < 0) goto L15c
            long r8 = (long) r4     // Catch: java.lang.Throwable -> L9e
            r10 = 12
            long r2 = r2 - r10
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 > 0) goto L15c
            int r2 = r4 + 12
            r15.dataEnd = r2     // Catch: java.lang.Throwable -> L9e
            java.nio.MappedByteBuffer r2 = r15.aBuffer     // Catch: java.lang.Throwable -> L9e
            r3 = 4
            long r2 = r2.getLong(r3)     // Catch: java.lang.Throwable -> L9e
            java.nio.MappedByteBuffer r5 = r15.aBuffer     // Catch: java.lang.Throwable -> L9e
            r5.rewind()     // Catch: java.lang.Throwable -> L9e
            java.nio.MappedByteBuffer r5 = r15.aBuffer     // Catch: java.lang.Throwable -> L9e
            io.fastkv.FastBuffer r8 = r15.fastBuffer     // Catch: java.lang.Throwable -> L9e
            byte[] r8 = r8.hb     // Catch: java.lang.Throwable -> L9e
            int r9 = r15.dataEnd     // Catch: java.lang.Throwable -> L9e
            r5.get(r8, r1, r9)     // Catch: java.lang.Throwable -> L9e
            io.fastkv.FastBuffer r1 = r15.fastBuffer     // Catch: java.lang.Throwable -> L9e
            long r4 = r1.getChecksum(r7, r4)     // Catch: java.lang.Throwable -> L9e
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 != 0) goto L15c
            boolean r0 = r15.parseData(r0)     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L15c
            r15.checksum = r2     // Catch: java.lang.Throwable -> L9e
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = "B file error"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9e
            r15.warning(r0)     // Catch: java.lang.Throwable -> L9e
            r15.fullWriteAToB()     // Catch: java.lang.Throwable -> L9e
            goto L164
        L15c:
            java.lang.String r0 = "both files error"
            r15.error(r0)     // Catch: java.lang.Throwable -> L9e
            r15.clearData()     // Catch: java.lang.Throwable -> L9e
        L164:
            r15.getUpdateHash()     // Catch: java.lang.Throwable -> L9e
            r6.release()     // Catch: java.lang.Exception -> L15
            return
        L16b:
            r0 = move-exception
            r15.error(r0)     // Catch: java.lang.Throwable -> L9e
            java.io.File r0 = r15.aFile     // Catch: java.lang.Throwable -> L9e
            java.io.File r1 = r15.bFile     // Catch: java.lang.Throwable -> L9e
            r15.tryBlockingIO(r0, r1)     // Catch: java.lang.Throwable -> L9e
            r6.release()     // Catch: java.lang.Exception -> L15
            return
        L17a:
            r6.release()     // Catch: java.lang.Exception -> L15
            throw r0     // Catch: java.lang.Exception -> L15
        L17e:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> L15
            java.lang.String r1 = "open file failed"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L15
            r15.error(r0)     // Catch: java.lang.Exception -> L15
            return
        L189:
            r15.error(r0)
            r15.resetMemory()
            return
    }

    private boolean loadFromCFile() {
            r6 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r6.path
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.name
            java.lang.String r4 = ".kvc"
            java.lang.String r2 = defpackage.z30.l(r2, r3, r4)
            r0.<init>(r1, r2)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r6.path
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r6.name
            java.lang.String r5 = ".tmp"
            java.lang.String r3 = defpackage.z30.l(r3, r4, r5)
            r1.<init>(r2, r3)
            r2 = 0
            boolean r3 = r0.exists()     // Catch: java.lang.Exception -> L50
            if (r3 == 0) goto L30
            goto L39
        L30:
            boolean r0 = r1.exists()     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L38
            r0 = r1
            goto L39
        L38:
            r0 = 0
        L39:
            if (r0 == 0) goto L58
            boolean r0 = r6.loadWithBlockingIO(r0)     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L52
            io.fastkv.FastBuffer r0 = r6.fastBuffer     // Catch: java.lang.Exception -> L50
            boolean r0 = r6.writeToABFile(r0)     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L55
            java.lang.String r0 = "recover from c file"
            r6.info(r0)     // Catch: java.lang.Exception -> L50
            r2 = 1
            goto L55
        L50:
            r0 = move-exception
            goto L59
        L52:
            r6.resetMemory()     // Catch: java.lang.Exception -> L50
        L55:
            r6.deleteCFiles()     // Catch: java.lang.Exception -> L50
        L58:
            return r2
        L59:
            r6.error(r0)
            return r2
    }

    private synchronized void notifyChangedKeys() {
            r2 = this;
            monitor-enter(r2)
            java.util.Set<java.lang.String> r0 = r2.changedKey     // Catch: java.lang.Throwable -> L1f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L26
            java.util.Set<java.lang.String> r0 = r2.changedKey     // Catch: java.lang.Throwable -> L1f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1f
        Lf:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L1f
            r2.notifyListeners(r1)     // Catch: java.lang.Throwable -> L1f
            goto Lf
        L1f:
            r0 = move-exception
            goto L28
        L21:
            java.util.Set<java.lang.String> r0 = r2.changedKey     // Catch: java.lang.Throwable -> L1f
            r0.clear()     // Catch: java.lang.Throwable -> L1f
        L26:
            monitor-exit(r2)
            return
        L28:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f
            throw r0
    }

    private synchronized void refresh() {
            r1 = this;
            monitor-enter(r1)
            r1.lockAndCheckUpdate()     // Catch: java.lang.Throwable -> L9
            r1.releaseLock()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    private synchronized void releaseLock() {
            r2 = this;
            monitor-enter(r2)
            java.nio.channels.FileLock r0 = r2.bFileLock     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L18
            r0.release()     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> Lb
            goto Lf
        L9:
            r0 = move-exception
            goto L1a
        Lb:
            r0 = move-exception
            r2.error(r0)     // Catch: java.lang.Throwable -> L9
        Lf:
            r0 = 0
            r2.bFileLock = r0     // Catch: java.lang.Throwable -> L9
            android.os.Handler r0 = r2.kvHandler     // Catch: java.lang.Throwable -> L9
            r1 = 2
            r0.removeMessages(r1)     // Catch: java.lang.Throwable -> L9
        L18:
            monitor-exit(r2)
            return
        L1a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    private void reloadData() {
            r4 = this;
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r4.data
            r0.clear()
            r4.clearInvalid()
            java.nio.MappedByteBuffer r0 = r4.aBuffer
            int r0 = r0.capacity()
            io.fastkv.FastBuffer r1 = r4.fastBuffer
            if (r1 != 0) goto L1a
            io.fastkv.FastBuffer r1 = new io.fastkv.FastBuffer
            r1.<init>(r0)
            r4.fastBuffer = r1
            goto L23
        L1a:
            byte[] r2 = r1.hb
            int r2 = r2.length
            if (r2 == r0) goto L23
            byte[] r0 = new byte[r0]
            r1.hb = r0
        L23:
            java.nio.MappedByteBuffer r0 = r4.aBuffer
            r0.rewind()
            java.nio.MappedByteBuffer r0 = r4.aBuffer
            io.fastkv.FastBuffer r1 = r4.fastBuffer
            byte[] r1 = r1.hb
            r2 = 0
            int r3 = r4.dataEnd
            r0.get(r1, r2, r3)
            return
    }

    private void reloadFromABuffer() {
            r6 = this;
            java.nio.MappedByteBuffer r0 = r6.aBuffer
            if (r0 != 0) goto L5
            goto L3b
        L5:
            r6.reloadData()
            r6.getUpdateHash()
            io.fastkv.FastBuffer r0 = r6.fastBuffer
            r1 = 0
            r0.position = r1
            int r0 = r0.getInt()
            int r1 = io.fastkv.AbsFastKV.unpackSize(r0)
            boolean r0 = io.fastkv.AbsFastKV.isCipher(r0)
            io.fastkv.FastBuffer r2 = r6.fastBuffer
            long r2 = r2.getLong()
            r6.checksum = r2
            int r4 = r1 + 12
            r6.dataEnd = r4
            io.fastkv.FastBuffer r4 = r6.fastBuffer
            r5 = 12
            long r4 = r4.getChecksum(r5, r1)
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 != 0) goto L3c
            boolean r0 = r6.parseData(r0)
            if (r0 != 0) goto L3b
            goto L3c
        L3b:
            return
        L3c:
            r6.clearData()
            return
    }

    private void setBFileSize(int r5) {
            r4 = this;
            java.io.RandomAccessFile r0 = r4.bAccessFile
            if (r0 != 0) goto Lf
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.io.File r1 = r4.bFile
            java.lang.String r2 = "rw"
            r0.<init>(r1, r2)
            r4.bAccessFile = r0
        Lf:
            java.nio.channels.FileChannel r0 = r4.bChannel
            if (r0 != 0) goto L1b
            java.io.RandomAccessFile r0 = r4.bAccessFile
            java.nio.channels.FileChannel r0 = r0.getChannel()
            r4.bChannel = r0
        L1b:
            java.nio.channels.FileChannel r0 = r4.bChannel
            long r0 = r0.size()
            long r2 = (long) r5
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L30
            java.io.RandomAccessFile r5 = r4.bAccessFile
            r5.setLength(r2)
            java.nio.channels.FileChannel r5 = r4.bChannel
            r5.truncate(r2)
        L30:
            return
    }

    private void syncAToB(int r6, int r7) {
            r5 = this;
            java.nio.MappedByteBuffer r0 = r5.aBuffer
            r0.position(r6)
            int r7 = r7 + r6
            r0.limit(r7)
            java.nio.channels.FileChannel r7 = r5.bChannel
            long r1 = r7.size()
            int r7 = r0.capacity()
            long r3 = (long) r7
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L22
            java.nio.channels.FileChannel r7 = r5.bChannel
            int r1 = r0.capacity()
            long r1 = (long) r1
            r7.truncate(r1)
        L22:
            java.nio.channels.FileChannel r7 = r5.bChannel
            long r1 = (long) r6
            r7.position(r1)
        L28:
            boolean r6 = r0.hasRemaining()
            if (r6 == 0) goto L34
            java.nio.channels.FileChannel r6 = r5.bChannel
            r6.write(r0)
            goto L28
        L34:
            int r6 = r0.capacity()
            r0.limit(r6)
            return
    }

    private void syncBufferToA(int r3, int r4) {
            r2 = this;
            io.fastkv.FastBuffer r0 = r2.fastBuffer
            byte[] r0 = r0.hb
            java.nio.MappedByteBuffer r1 = r2.aBuffer
            r1.position(r3)
            java.nio.MappedByteBuffer r1 = r2.aBuffer
            r1.put(r0, r3, r4)
            return
    }

    private void truncate() {
            r8 = this;
            int r0 = io.fastkv.AbsFastKV.PAGE_SIZE
            int r1 = r8.dataEnd
            int r1 = r1 + r0
            int r0 = r8.getNewCapacity(r0, r1)
            io.fastkv.FastBuffer r1 = r8.fastBuffer
            byte[] r1 = r1.hb
            int r2 = r1.length
            if (r0 < r2) goto L11
            return
        L11:
            byte[] r2 = new byte[r0]
            int r3 = r8.dataEnd
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r2, r4, r3)
            io.fastkv.FastBuffer r1 = r8.fastBuffer
            r1.hb = r2
            java.nio.channels.FileChannel r1 = r8.aChannel     // Catch: java.lang.Exception -> L3f
            long r6 = (long) r0     // Catch: java.lang.Exception -> L3f
            r1.truncate(r6)     // Catch: java.lang.Exception -> L3f
            java.nio.channels.FileChannel r2 = r8.aChannel     // Catch: java.lang.Exception -> L3f
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch: java.lang.Exception -> L3f
            r4 = 0
            java.nio.MappedByteBuffer r0 = r2.map(r3, r4, r6)     // Catch: java.lang.Exception -> L3f
            r8.aBuffer = r0     // Catch: java.lang.Exception -> L3f
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Exception -> L3f
            r0.order(r1)     // Catch: java.lang.Exception -> L3f
            java.io.RandomAccessFile r0 = r8.bAccessFile     // Catch: java.lang.Exception -> L3f
            r0.setLength(r6)     // Catch: java.lang.Exception -> L3f
            java.nio.channels.FileChannel r0 = r8.bChannel     // Catch: java.lang.Exception -> L3f
            r0.truncate(r6)     // Catch: java.lang.Exception -> L3f
            goto L4d
        L3f:
            r0 = move-exception
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r2 = "map failed"
            r1.<init>(r2, r0)
            r8.error(r1)
            r0 = 1
            r8.needFullWrite = r0
        L4d:
            java.lang.String r0 = "truncate finish"
            r8.info(r0)
            return
    }

    private void trySettingObserver() {
            r2 = this;
            boolean r0 = r2.needWatchFileChange
            if (r0 == 0) goto L24
            io.fastkv.MPFastKV$KVFileObserver r0 = r2.fileObserver
            if (r0 != 0) goto L24
            java.io.File r0 = r2.bFile
            if (r0 == 0) goto L24
            boolean r0 = r0.exists()
            if (r0 == 0) goto L24
            io.fastkv.MPFastKV$KVFileObserver r0 = new io.fastkv.MPFastKV$KVFileObserver
            java.io.File r1 = r2.bFile
            java.lang.String r1 = r1.getPath()
            r0.<init>(r2, r1)
            r2.fileObserver = r0
            io.fastkv.MPFastKV$KVFileObserver r0 = r2.fileObserver
            r0.startWatching()
        L24:
            return
    }

    private synchronized boolean updateFile() {
            r9 = this;
            monitor-enter(r9)
            java.nio.channels.FileLock r0 = r9.bFileLock     // Catch: java.lang.Throwable -> L16
            r1 = 0
            if (r0 != 0) goto L8
            monitor-exit(r9)
            return r1
        L8:
            io.fastkv.FastBuffer r0 = r9.fastBuffer     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L179
            int r0 = r9.updateCount     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L19
            boolean r0 = r9.needFullWrite     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L19
            goto L179
        L16:
            r0 = move-exception
            goto L17e
        L19:
            r0 = 1
            r2 = 3
            int r3 = r9.dataEnd     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r4 = 12
            int r3 = r3 - r4
            int r3 = r9.packSize(r3)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            io.fastkv.FastBuffer r5 = r9.fastBuffer     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r5.putInt(r1, r3)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            io.fastkv.FastBuffer r5 = r9.fastBuffer     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            long r6 = r9.checksum     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r8 = 4
            r5.putLong(r8, r6)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            boolean r5 = r9.needFullWrite     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            if (r5 == 0) goto L60
            boolean r3 = r9.fullWrite()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            if (r3 == 0) goto L44
            r9.needFullWrite = r1     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            goto L44
        L3e:
            r0 = move-exception
            goto L15e
        L41:
            r3 = move-exception
            goto L13d
        L44:
            r9.updateCount = r1     // Catch: java.lang.Throwable -> L16
            java.util.List<java.lang.String> r0 = r9.deletedFiles     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L53
            java.util.List<java.lang.String> r0 = r9.deletedFiles     // Catch: java.lang.Throwable -> L16
            r0.clear()     // Catch: java.lang.Throwable -> L16
        L53:
            r9.waitExternalWriting()     // Catch: java.lang.Throwable -> L16
            r9.releaseLock()     // Catch: java.lang.Throwable -> L16
            android.os.Handler r0 = r9.kvHandler     // Catch: java.lang.Throwable -> L16
            r0.sendEmptyMessage(r2)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r9)
            return r3
        L60:
            boolean r5 = r9.alignAToBuffer()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            if (r5 != 0) goto L8c
            java.nio.MappedByteBuffer r3 = r9.aBuffer     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            if (r3 == 0) goto L6e
            r9.reloadFromABuffer()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            goto L70
        L6e:
            r9.needFullWrite = r0     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
        L70:
            r9.updateCount = r1     // Catch: java.lang.Throwable -> L16
            java.util.List<java.lang.String> r0 = r9.deletedFiles     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L7f
            java.util.List<java.lang.String> r0 = r9.deletedFiles     // Catch: java.lang.Throwable -> L16
            r0.clear()     // Catch: java.lang.Throwable -> L16
        L7f:
            r9.waitExternalWriting()     // Catch: java.lang.Throwable -> L16
            r9.releaseLock()     // Catch: java.lang.Throwable -> L16
            android.os.Handler r0 = r9.kvHandler     // Catch: java.lang.Throwable -> L16
            r0.sendEmptyMessage(r2)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r9)
            return r1
        L8c:
            java.nio.MappedByteBuffer r5 = r9.aBuffer     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            int r5 = r5.capacity()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r9.setBFileSize(r5)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            java.nio.MappedByteBuffer r5 = r9.aBuffer     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r5.putInt(r1, r3)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            java.nio.MappedByteBuffer r3 = r9.aBuffer     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            long r5 = r9.checksum     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r3.putLong(r8, r5)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r3 = r1
        La2:
            int r5 = r9.updateCount     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            if (r3 >= r5) goto Lb4
            int[] r5 = r9.updateStartAndSize     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r6 = r5[r3]     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            int r7 = r3 + 1
            r5 = r5[r7]     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r9.syncBufferToA(r6, r5)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            int r3 = r3 + 2
            goto La2
        Lb4:
            int r3 = r9.dataEnd     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            int r3 = r3 + 8
            java.nio.MappedByteBuffer r5 = r9.aBuffer     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            int r5 = r5.capacity()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            if (r3 >= r5) goto Ld4
            java.util.Random r3 = io.fastkv.MPFastKV.random     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            long r5 = r3.nextLong()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            long r7 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            long r5 = r5 ^ r7
            r9.updateHash = r5     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            java.nio.MappedByteBuffer r3 = r9.aBuffer     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            int r7 = r9.dataEnd     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r3.putLong(r7, r5)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
        Ld4:
            r9.syncAToB(r1, r4)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r3 = r1
        Ld8:
            int r4 = r9.updateCount     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            if (r3 >= r4) goto Lea
            int[] r4 = r9.updateStartAndSize     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r5 = r4[r3]     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            int r6 = r3 + 1
            r4 = r4[r6]     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r9.syncAToB(r5, r4)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            int r3 = r3 + 2
            goto Ld8
        Lea:
            java.util.List<java.lang.String> r3 = r9.deletedFiles     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            if (r3 != 0) goto L112
            java.util.List<java.lang.String> r3 = r9.deletedFiles     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
        Lf8:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            if (r4 == 0) goto L112
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            java.util.concurrent.Executor r5 = io.fastkv.FastKVConfig.getExecutor()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            t5 r6 = new t5     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r7 = 4
            r6.<init>(r9, r7, r4)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r5.execute(r6)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            goto Lf8
        L112:
            io.fastkv.FastBuffer r3 = r9.fastBuffer     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            byte[] r3 = r3.hb     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            int r3 = r3.length     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            int r4 = r9.dataEnd     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            int r3 = r3 - r4
            int r4 = io.fastkv.AbsFastKV.TRUNCATE_THRESHOLD     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            if (r3 <= r4) goto L121
            r9.truncate()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
        L121:
            r9.updateCount = r1     // Catch: java.lang.Throwable -> L16
            java.util.List<java.lang.String> r1 = r9.deletedFiles     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L130
            java.util.List<java.lang.String> r1 = r9.deletedFiles     // Catch: java.lang.Throwable -> L16
            r1.clear()     // Catch: java.lang.Throwable -> L16
        L130:
            r9.waitExternalWriting()     // Catch: java.lang.Throwable -> L16
            r9.releaseLock()     // Catch: java.lang.Throwable -> L16
            android.os.Handler r1 = r9.kvHandler     // Catch: java.lang.Throwable -> L16
            r1.sendEmptyMessage(r2)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r9)
            return r0
        L13d:
            r9.error(r3)     // Catch: java.lang.Throwable -> L3e
            r9.needFullWrite = r0     // Catch: java.lang.Throwable -> L3e
            r9.updateCount = r1     // Catch: java.lang.Throwable -> L16
            java.util.List<java.lang.String> r0 = r9.deletedFiles     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L151
            java.util.List<java.lang.String> r0 = r9.deletedFiles     // Catch: java.lang.Throwable -> L16
            r0.clear()     // Catch: java.lang.Throwable -> L16
        L151:
            r9.waitExternalWriting()     // Catch: java.lang.Throwable -> L16
            r9.releaseLock()     // Catch: java.lang.Throwable -> L16
            android.os.Handler r0 = r9.kvHandler     // Catch: java.lang.Throwable -> L16
            r0.sendEmptyMessage(r2)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r9)
            return r1
        L15e:
            r9.updateCount = r1     // Catch: java.lang.Throwable -> L16
            java.util.List<java.lang.String> r1 = r9.deletedFiles     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L16d
            java.util.List<java.lang.String> r1 = r9.deletedFiles     // Catch: java.lang.Throwable -> L16
            r1.clear()     // Catch: java.lang.Throwable -> L16
        L16d:
            r9.waitExternalWriting()     // Catch: java.lang.Throwable -> L16
            r9.releaseLock()     // Catch: java.lang.Throwable -> L16
            android.os.Handler r1 = r9.kvHandler     // Catch: java.lang.Throwable -> L16
            r1.sendEmptyMessage(r2)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        L179:
            r9.releaseLock()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r9)
            return r1
        L17e:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L16
            throw r0
    }

    private void waitExternalWriting() {
            r2 = this;
        L0:
            io.fastkv.TagExecutor r0 = r2.externalExecutor
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Le
            r0 = 10
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Exception -> L0
            goto L0
        Le:
            return
    }

    private boolean writeToABFile(io.fastkv.FastBuffer r8) {
            r7 = this;
            byte[] r0 = r8.hb
            int r0 = r0.length
            r1 = 0
            java.io.File r2 = r7.aFile     // Catch: java.lang.Exception -> L24
            boolean r2 = io.fastkv.Utils.makeFileIfNotExist(r2)     // Catch: java.lang.Exception -> L24
            if (r2 == 0) goto L7f
            java.io.File r2 = r7.bFile     // Catch: java.lang.Exception -> L24
            boolean r2 = io.fastkv.Utils.makeFileIfNotExist(r2)     // Catch: java.lang.Exception -> L24
            if (r2 == 0) goto L7f
            java.io.RandomAccessFile r2 = r7.bAccessFile     // Catch: java.lang.Exception -> L24
            if (r2 != 0) goto L26
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L24
            java.io.File r3 = r7.bFile     // Catch: java.lang.Exception -> L24
            java.lang.String r4 = "rw"
            r2.<init>(r3, r4)     // Catch: java.lang.Exception -> L24
            r7.bAccessFile = r2     // Catch: java.lang.Exception -> L24
            goto L26
        L24:
            r8 = move-exception
            goto L87
        L26:
            java.nio.channels.FileChannel r2 = r7.bChannel     // Catch: java.lang.Exception -> L24
            if (r2 != 0) goto L32
            java.io.RandomAccessFile r2 = r7.bAccessFile     // Catch: java.lang.Exception -> L24
            java.nio.channels.FileChannel r2 = r2.getChannel()     // Catch: java.lang.Exception -> L24
            r7.bChannel = r2     // Catch: java.lang.Exception -> L24
        L32:
            java.nio.channels.FileLock r2 = r7.bFileLock     // Catch: java.lang.Exception -> L24
            if (r2 != 0) goto L3d
            java.nio.channels.FileChannel r2 = r7.bChannel     // Catch: java.lang.Exception -> L24
            java.nio.channels.FileLock r2 = r2.lock()     // Catch: java.lang.Exception -> L24
            goto L3e
        L3d:
            r2 = 0
        L3e:
            r7.alignAToBuffer()     // Catch: java.lang.Throwable -> L5e
            java.nio.MappedByteBuffer r3 = r7.aBuffer     // Catch: java.lang.Throwable -> L5e
            byte[] r8 = r8.hb     // Catch: java.lang.Throwable -> L5e
            int r4 = r7.dataEnd     // Catch: java.lang.Throwable -> L5e
            r3.put(r8, r1, r4)     // Catch: java.lang.Throwable -> L5e
            r7.getUpdateHash()     // Catch: java.lang.Throwable -> L5e
            java.io.RandomAccessFile r8 = r7.bAccessFile     // Catch: java.lang.Throwable -> L5e
            long r3 = r8.length()     // Catch: java.lang.Throwable -> L5e
            long r5 = (long) r0     // Catch: java.lang.Throwable -> L5e
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L60
            java.io.RandomAccessFile r8 = r7.bAccessFile     // Catch: java.lang.Throwable -> L5e
            r8.setLength(r5)     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r8 = move-exception
            goto L79
        L60:
            java.nio.channels.FileChannel r8 = r7.bChannel     // Catch: java.lang.Throwable -> L5e
            r8.truncate(r5)     // Catch: java.lang.Throwable -> L5e
            int r8 = r7.dataEnd     // Catch: java.lang.Throwable -> L5e
            r7.syncAToB(r1, r8)     // Catch: java.lang.Throwable -> L5e
            java.nio.channels.FileChannel r8 = r7.bChannel     // Catch: java.lang.Throwable -> L5e
            r8.force(r1)     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto L74
            r2.release()     // Catch: java.lang.Exception -> L24
        L74:
            r7.trySettingObserver()     // Catch: java.lang.Exception -> L24
            r8 = 1
            return r8
        L79:
            if (r2 == 0) goto L7e
            r2.release()     // Catch: java.lang.Exception -> L24
        L7e:
            throw r8     // Catch: java.lang.Exception -> L24
        L7f:
            java.lang.Exception r8 = new java.lang.Exception     // Catch: java.lang.Exception -> L24
            java.lang.String r0 = "open file failed"
            r8.<init>(r0)     // Catch: java.lang.Exception -> L24
            throw r8     // Catch: java.lang.Exception -> L24
        L87:
            r7.error(r8)
            return r1
    }

    @Override // android.content.SharedPreferences.Editor
    public void apply() {
            r3 = this;
            java.util.concurrent.Executor r0 = r3.applyExecutor
            is r1 = new is
            r2 = 1
            r1.<init>(r3, r2)
            r0.execute(r1)
            return
    }

    @Override // io.fastkv.AbsFastKV
    public void checkGC() {
            r2 = this;
            int r0 = r2.invalidBytes
            int r1 = r2.bytesThreshold()
            if (r0 >= r1) goto L14
            java.util.ArrayList<io.fastkv.AbsFastKV$Segment> r0 = r2.invalids
            int r0 = r0.size()
            r1 = 80
            if (r0 < r1) goto L13
            goto L14
        L13:
            return
        L14:
            r0 = 0
            r2.gc(r0)
            return
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized android.content.SharedPreferences.Editor clear() {
            r1 = this;
            monitor-enter(r1)
            r1.lockAndCheckUpdate()     // Catch: java.lang.Throwable -> Lc
            r1.clearData()     // Catch: java.lang.Throwable -> Lc
            r1.releaseLock()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return r1
        Lc:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    @Override // android.content.SharedPreferences.Editor
    public boolean commit() {
            r1 = this;
            boolean r0 = r1.updateFile()
            return r0
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ boolean contains(java.lang.String r1) {
            r0 = this;
            boolean r1 = super.contains(r1)
            return r1
    }

    @Override // io.fastkv.AbsFastKV
    public void copyToMainFile(io.fastkv.FastKV r1) {
            r0 = this;
            io.fastkv.FastBuffer r1 = r1.fastBuffer
            r0.writeToABFile(r1)
            return
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ android.content.SharedPreferences.Editor edit() {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = super.edit()
            return r0
    }

    @Override // io.fastkv.AbsFastKV
    public void ensureSize(int r4) {
            r3 = this;
            io.fastkv.FastBuffer r0 = r3.fastBuffer
            byte[] r0 = r0.hb
            int r0 = r0.length
            int r1 = r3.dataEnd
            int r1 = r1 + r4
            int r1 = r1 + 8
            if (r1 < r0) goto L20
            int r4 = r3.getNewCapacity(r0, r1)
            byte[] r4 = new byte[r4]
            io.fastkv.FastBuffer r0 = r3.fastBuffer
            byte[] r0 = r0.hb
            int r1 = r3.dataEnd
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            io.fastkv.FastBuffer r0 = r3.fastBuffer
            r0.hb = r4
        L20:
            return
    }

    public synchronized void force() {
            r2 = this;
            monitor-enter(r2)
            java.nio.MappedByteBuffer r0 = r2.aBuffer     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> Lb
            if (r0 == 0) goto Ld
            r0.force()     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> Lb
            goto Ld
        L9:
            r0 = move-exception
            goto L1b
        Lb:
            r0 = move-exception
            goto L16
        Ld:
            java.nio.channels.FileChannel r0 = r2.bChannel     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> Lb
            if (r0 == 0) goto L19
            r1 = 0
            r0.force(r1)     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> Lb
            goto L19
        L16:
            r2.error(r0)     // Catch: java.lang.Throwable -> L9
        L19:
            monitor-exit(r2)
            return
        L1b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ java.util.Map getAll() {
            r1 = this;
            java.util.Map r0 = super.getAll()
            return r0
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ byte[] getArray(java.lang.String r1) {
            r0 = this;
            byte[] r1 = super.getArray(r1)
            return r1
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ byte[] getArray(java.lang.String r1, byte[] r2) {
            r0 = this;
            byte[] r1 = super.getArray(r1, r2)
            return r1
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ boolean getBoolean(java.lang.String r1) {
            r0 = this;
            boolean r1 = super.getBoolean(r1)
            return r1
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ boolean getBoolean(java.lang.String r1, boolean r2) {
            r0 = this;
            boolean r1 = super.getBoolean(r1, r2)
            return r1
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ double getDouble(java.lang.String r3) {
            r2 = this;
            double r0 = super.getDouble(r3)
            return r0
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ double getDouble(java.lang.String r1, double r2) {
            r0 = this;
            double r1 = super.getDouble(r1, r2)
            return r1
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ float getFloat(java.lang.String r1) {
            r0 = this;
            float r1 = super.getFloat(r1)
            return r1
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ float getFloat(java.lang.String r1, float r2) {
            r0 = this;
            float r1 = super.getFloat(r1, r2)
            return r1
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ int getInt(java.lang.String r1) {
            r0 = this;
            int r1 = super.getInt(r1)
            return r1
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ int getInt(java.lang.String r1, int r2) {
            r0 = this;
            int r1 = super.getInt(r1, r2)
            return r1
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ long getLong(java.lang.String r3) {
            r2 = this;
            long r0 = super.getLong(r3)
            return r0
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ long getLong(java.lang.String r1, long r2) {
            r0 = this;
            long r1 = super.getLong(r1, r2)
            return r1
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ java.lang.Object getObject(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = super.getObject(r1)
            return r1
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ java.lang.String getString(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = super.getString(r1)
            return r1
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ java.lang.String getString(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r1 = super.getString(r1, r2)
            return r1
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ java.util.Set getStringSet(java.lang.String r1) {
            r0 = this;
            java.util.Set r1 = super.getStringSet(r1)
            return r1
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ java.util.Set getStringSet(java.lang.String r1, java.util.Set r2) {
            r0 = this;
            java.util.Set r1 = super.getStringSet(r1, r2)
            return r1
    }

    @Override // io.fastkv.AbsFastKV
    public void handleChange(java.lang.String r2) {
            r1 = this;
            java.util.ArrayList<android.content.SharedPreferences$OnSharedPreferenceChangeListener> r0 = r1.listeners
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ld
            java.util.Set<java.lang.String> r0 = r1.changedKey
            r0.add(r2)
        Ld:
            return
    }

    @Override // io.fastkv.AbsFastKV
    public void lockAndCheckUpdate() {
            r5 = this;
            java.nio.channels.FileLock r0 = r5.bFileLock
            if (r0 == 0) goto L5
            goto L31
        L5:
            java.nio.channels.FileChannel r0 = r5.bChannel
            if (r0 != 0) goto Lf
            r5.loadFromABFile()
            r5.trySettingObserver()
        Lf:
            java.nio.channels.FileChannel r0 = r5.bChannel
            if (r0 == 0) goto L31
            java.nio.channels.FileLock r0 = r0.lock()     // Catch: java.lang.Exception -> L25
            r5.bFileLock = r0     // Catch: java.lang.Exception -> L25
            r0 = 3000(0xbb8, double:1.482E-320)
            r2 = 2
            r5.checkUpdate()     // Catch: java.lang.Throwable -> L27
            android.os.Handler r3 = r5.kvHandler     // Catch: java.lang.Exception -> L25
            r3.sendEmptyMessageDelayed(r2, r0)     // Catch: java.lang.Exception -> L25
            return
        L25:
            r0 = move-exception
            goto L2e
        L27:
            r3 = move-exception
            android.os.Handler r4 = r5.kvHandler     // Catch: java.lang.Exception -> L25
            r4.sendEmptyMessageDelayed(r2, r0)     // Catch: java.lang.Exception -> L25
            throw r3     // Catch: java.lang.Exception -> L25
        L2e:
            r5.error(r0)
        L31:
            return
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ void putAll(java.util.Map r1) {
            r0 = this;
            super.putAll(r1)
            return
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ void putAll(java.util.Map r1, java.util.Map r2) {
            r0 = this;
            super.putAll(r1, r2)
            return
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ android.content.SharedPreferences.Editor putArray(java.lang.String r1, byte[] r2) {
            r0 = this;
            android.content.SharedPreferences$Editor r1 = super.putArray(r1, r2)
            return r1
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ android.content.SharedPreferences.Editor putBoolean(java.lang.String r1, boolean r2) {
            r0 = this;
            android.content.SharedPreferences$Editor r1 = super.putBoolean(r1, r2)
            return r1
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ android.content.SharedPreferences.Editor putDouble(java.lang.String r1, double r2) {
            r0 = this;
            android.content.SharedPreferences$Editor r1 = super.putDouble(r1, r2)
            return r1
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ android.content.SharedPreferences.Editor putFloat(java.lang.String r1, float r2) {
            r0 = this;
            android.content.SharedPreferences$Editor r1 = super.putFloat(r1, r2)
            return r1
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ android.content.SharedPreferences.Editor putInt(java.lang.String r1, int r2) {
            r0 = this;
            android.content.SharedPreferences$Editor r1 = super.putInt(r1, r2)
            return r1
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ android.content.SharedPreferences.Editor putLong(java.lang.String r1, long r2) {
            r0 = this;
            android.content.SharedPreferences$Editor r1 = super.putLong(r1, r2)
            return r1
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ android.content.SharedPreferences.Editor putObject(java.lang.String r1, java.lang.Object r2, io.fastkv.interfaces.FastEncoder r3) {
            r0 = this;
            android.content.SharedPreferences$Editor r1 = super.putObject(r1, r2, r3)
            return r1
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ android.content.SharedPreferences.Editor putString(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            android.content.SharedPreferences$Editor r1 = super.putString(r1, r2)
            return r1
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ android.content.SharedPreferences.Editor putStringSet(java.lang.String r1, java.util.Set r2) {
            r0 = this;
            android.content.SharedPreferences$Editor r1 = super.putStringSet(r1, r2)
            return r1
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r1) {
            r0 = this;
            super.registerOnSharedPreferenceChangeListener(r1)
            return
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized android.content.SharedPreferences.Editor remove(java.lang.String r6) {
            r5 = this;
            monitor-enter(r5)
            r5.lockAndCheckUpdate()     // Catch: java.lang.Throwable -> L3b
            r5.handleChange(r6)     // Catch: java.lang.Throwable -> L3b
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r5.data     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L3b
            io.fastkv.Container$BaseContainer r0 = (io.fastkv.Container.BaseContainer) r0     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L5c
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r1 = r5.data     // Catch: java.lang.Throwable -> L3b
            r1.remove(r6)     // Catch: java.lang.Throwable -> L3b
            io.fastkv.WeakCache r1 = r5.bigValueCache     // Catch: java.lang.Throwable -> L3b
            r1.remove(r6)     // Catch: java.lang.Throwable -> L3b
            io.fastkv.WeakCache r1 = r5.externalCache     // Catch: java.lang.Throwable -> L3b
            r1.remove(r6)     // Catch: java.lang.Throwable -> L3b
            byte r1 = r0.getType()     // Catch: java.lang.Throwable -> L3b
            r2 = 5
            r3 = 0
            if (r1 > r2) goto L3d
            int r6 = io.fastkv.FastBuffer.getStringSize(r6)     // Catch: java.lang.Throwable -> L3b
            int r0 = r0.offset     // Catch: java.lang.Throwable -> L3b
            int r6 = r6 + 2
            int r6 = r0 - r6
            int[] r2 = io.fastkv.AbsFastKV.TYPE_SIZE     // Catch: java.lang.Throwable -> L3b
            r2 = r2[r1]     // Catch: java.lang.Throwable -> L3b
            int r0 = r0 + r2
            r5.remove(r1, r6, r0)     // Catch: java.lang.Throwable -> L3b
            goto L52
        L3b:
            r6 = move-exception
            goto L5e
        L3d:
            io.fastkv.Container$VarContainer r0 = (io.fastkv.Container.VarContainer) r0     // Catch: java.lang.Throwable -> L3b
            int r6 = r0.start     // Catch: java.lang.Throwable -> L3b
            int r2 = r0.offset     // Catch: java.lang.Throwable -> L3b
            int r4 = r0.valueSize     // Catch: java.lang.Throwable -> L3b
            int r2 = r2 + r4
            r5.remove(r1, r6, r2)     // Catch: java.lang.Throwable -> L3b
            boolean r6 = r0.external     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L52
            java.lang.Object r6 = r0.value     // Catch: java.lang.Throwable -> L3b
            r3 = r6
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L3b
        L52:
            if (r3 == 0) goto L59
            java.util.List<java.lang.String> r6 = r5.deletedFiles     // Catch: java.lang.Throwable -> L3b
            r6.add(r3)     // Catch: java.lang.Throwable -> L3b
        L59:
            r5.checkGC()     // Catch: java.lang.Throwable -> L3b
        L5c:
            monitor-exit(r5)
            return r5
        L5e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3b
            throw r6
    }

    @Override // io.fastkv.AbsFastKV
    public void remove(byte r1, int r2, int r3) {
            r0 = this;
            super.remove(r1, r2, r3)
            r1 = 1
            r0.addUpdate(r2, r1)
            return
    }

    @Override // io.fastkv.AbsFastKV
    public void removeOldFile(java.lang.String r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.deletedFiles
            r0.add(r2)
            return
    }

    @Override // io.fastkv.AbsFastKV
    public void resetData() {
            r2 = this;
            super.resetData()
            r0 = 0
            r2.updateHash = r0
            return
    }

    @Override // io.fastkv.AbsFastKV
    public void syncCompatBuffer(int r2, int r3, int r4) {
            r1 = this;
            r3 = 0
            r4 = r3
        L2:
            int r0 = r1.updateCount
            if (r4 >= r0) goto L10
            int[] r0 = r1.updateStartAndSize
            r0 = r0[r4]
            if (r0 >= r2) goto Ld
            r2 = r0
        Ld:
            int r4 = r4 + 2
            goto L2
        L10:
            int[] r4 = r1.updateStartAndSize
            r4[r3] = r2
            int r3 = r1.dataEnd
            int r3 = r3 - r2
            r2 = 1
            r4[r2] = r3
            r2 = 2
            r1.updateCount = r2
            return
    }

    public synchronized java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "MPFastKV: path:"
            monitor-enter(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r2.path     // Catch: java.lang.Throwable -> L1d
            r1.append(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = " name:"
            r1.append(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r2.name     // Catch: java.lang.Throwable -> L1d
            r1.append(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            return r0
        L1d:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r0
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r1) {
            r0 = this;
            super.unregisterOnSharedPreferenceChangeListener(r1)
            return
    }

    @Override // io.fastkv.AbsFastKV
    public void updateBoolean(byte r5, int r6) {
            r4 = this;
            long r0 = r4.checksum
            r2 = 1
            long r2 = r4.shiftCheckSum(r2, r6)
            long r0 = r0 ^ r2
            r4.checksum = r0
            io.fastkv.FastBuffer r0 = r4.fastBuffer
            byte[] r0 = r0.hb
            r0[r6] = r5
            r5 = 1
            r4.addUpdate(r6, r5)
            return
    }

    @Override // io.fastkv.AbsFastKV
    public void updateBytes(int r1, byte[] r2) {
            r0 = this;
            super.updateBytes(r1, r2)
            int r2 = r2.length
            r0.addUpdate(r1, r2)
            return
    }

    @Override // io.fastkv.AbsFastKV
    public void updateChange() {
            r5 = this;
            long r0 = r5.checksum
            io.fastkv.FastBuffer r2 = r5.fastBuffer
            int r3 = r5.updateStart
            int r4 = r5.updateSize
            long r2 = r2.getChecksum(r3, r4)
            long r0 = r0 ^ r2
            r5.checksum = r0
            int r0 = r5.updateSize
            if (r0 == 0) goto L1b
            int r1 = r5.updateStart
            r5.addUpdate(r1, r0)
            r0 = 0
            r5.updateSize = r0
        L1b:
            return
    }

    @Override // io.fastkv.AbsFastKV
    public void updateInt32(int r3, long r4, int r6) {
            r2 = this;
            long r0 = r2.checksum
            long r4 = r2.shiftCheckSum(r4, r6)
            long r4 = r4 ^ r0
            r2.checksum = r4
            io.fastkv.FastBuffer r4 = r2.fastBuffer
            r4.putInt(r6, r3)
            r3 = 4
            r2.addUpdate(r6, r3)
            return
    }

    @Override // io.fastkv.AbsFastKV
    public void updateInt64(long r3, long r5, int r7) {
            r2 = this;
            long r0 = r2.checksum
            long r5 = r2.shiftCheckSum(r5, r7)
            long r5 = r5 ^ r0
            r2.checksum = r5
            io.fastkv.FastBuffer r5 = r2.fastBuffer
            r5.putLong(r7, r3)
            r3 = 8
            r2.addUpdate(r7, r3)
            return
    }
}
