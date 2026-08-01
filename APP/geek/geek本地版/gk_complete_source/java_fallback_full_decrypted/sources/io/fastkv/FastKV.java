package io.fastkv;

/* JADX INFO: loaded from: classes.dex */
public final class FastKV extends io.fastkv.AbsFastKV {
    static final int ASYNC_BLOCKING = 1;
    static final int NON_BLOCKING = 0;
    static final int SYNC_BLOCKING = 2;
    private java.nio.MappedByteBuffer aBuffer;
    private java.nio.channels.FileChannel aChannel;
    private final java.util.concurrent.Executor applyExecutor;
    boolean autoCommit;
    private java.nio.MappedByteBuffer bBuffer;
    private java.nio.channels.FileChannel bChannel;
    private int removeStart;
    private int writingMode;

    public static final class Builder {
        static final java.util.Map<java.lang.String, io.fastkv.FastKV> INSTANCE_MAP = null;
        private io.fastkv.interfaces.FastCipher cipher;
        private io.fastkv.interfaces.FastEncoder[] encoders;
        private final java.lang.String name;
        private final java.lang.String path;
        private int writingMode;

        static {
                java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
                r0.<init>()
                io.fastkv.FastKV.Builder.INSTANCE_MAP = r0
                return
        }

        public Builder(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.writingMode = r0
                if (r2 == 0) goto L36
                if (r3 == 0) goto L2e
                boolean r0 = r3.isEmpty()
                if (r0 != 0) goto L2e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.io.File r2 = r2.getFilesDir()
                java.lang.String r2 = r2.getAbsolutePath()
                r0.append(r2)
                java.lang.String r2 = "/fastkv/"
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.path = r2
                r1.name = r3
                return
            L2e:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "name is empty"
                r2.<init>(r3)
                throw r2
            L36:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "context is null"
                r2.<init>(r3)
                throw r2
        }

        public Builder(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.writingMode = r0
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

        public io.fastkv.FastKV.Builder asyncBlocking() {
                r1 = this;
                r0 = 1
                r1.writingMode = r0
                return r1
        }

        public io.fastkv.FastKV.Builder blocking() {
                r1 = this;
                r0 = 2
                r1.writingMode = r0
                return r1
        }

        public io.fastkv.FastKV build() {
                r10 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r10.path
                r0.append(r1)
                java.lang.String r1 = r10.name
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.util.Map<java.lang.String, io.fastkv.FastKV> r1 = io.fastkv.FastKV.Builder.INSTANCE_MAP
                java.lang.Object r2 = r1.get(r0)
                io.fastkv.FastKV r2 = (io.fastkv.FastKV) r2
                if (r2 != 0) goto L42
                java.lang.Class<io.fastkv.FastKV$Builder> r3 = io.fastkv.FastKV.Builder.class
                monitor-enter(r3)
                java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L3c
                io.fastkv.FastKV r2 = (io.fastkv.FastKV) r2     // Catch: java.lang.Throwable -> L3c
                if (r2 != 0) goto L3e
                io.fastkv.FastKV r4 = new io.fastkv.FastKV     // Catch: java.lang.Throwable -> L3c
                java.lang.String r5 = r10.path     // Catch: java.lang.Throwable -> L3c
                java.lang.String r6 = r10.name     // Catch: java.lang.Throwable -> L3c
                io.fastkv.interfaces.FastEncoder[] r7 = r10.encoders     // Catch: java.lang.Throwable -> L3c
                io.fastkv.interfaces.FastCipher r8 = r10.cipher     // Catch: java.lang.Throwable -> L3c
                int r9 = r10.writingMode     // Catch: java.lang.Throwable -> L3c
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

        public io.fastkv.FastKV.Builder cipher(io.fastkv.interfaces.FastCipher r1) {
                r0 = this;
                r0.cipher = r1
                return r0
        }

        public io.fastkv.FastKV.Builder encoder(io.fastkv.interfaces.FastEncoder[] r1) {
                r0 = this;
                r0.encoders = r1
                return r0
        }
    }

    public FastKV(java.lang.String r1, java.lang.String r2, io.fastkv.interfaces.FastEncoder[] r3, io.fastkv.interfaces.FastCipher r4, int r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r1 = 1
            r0.autoCommit = r1
            io.fastkv.LimitExecutor r1 = new io.fastkv.LimitExecutor
            r1.<init>()
            r0.applyExecutor = r1
            r0.writingMode = r5
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r1 = r0.data
            monitor-enter(r1)
            java.util.concurrent.Executor r2 = io.fastkv.FastKVConfig.getExecutor()     // Catch: java.lang.Throwable -> L29
            sj r3 = new sj     // Catch: java.lang.Throwable -> L29
            r4 = 1
            r3.<init>(r0, r4)     // Catch: java.lang.Throwable -> L29
            r2.execute(r3)     // Catch: java.lang.Throwable -> L29
        L1f:
            boolean r2 = r0.startLoading     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L2b
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r2 = r0.data     // Catch: java.lang.InterruptedException -> L1f java.lang.Throwable -> L29
            r2.wait()     // Catch: java.lang.InterruptedException -> L1f java.lang.Throwable -> L29
            goto L1f
        L29:
            r2 = move-exception
            goto L2d
        L2b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            return
        L2d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            throw r2
    }

    public static android.content.SharedPreferences adapt(android.content.Context r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = r3.getFilesDir()
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            java.lang.String r1 = "/fastkv"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            io.fastkv.FastKV$Builder r1 = new io.fastkv.FastKV$Builder
            r1.<init>(r0, r4)
            io.fastkv.FastKV r0 = r1.build()
            java.lang.String r1 = "kv_import_flag"
            boolean r2 = r0.contains(r1)
            if (r2 != 0) goto L3a
            r2 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r2)
            java.util.Map r3 = r3.getAll()
            r0.putAll(r3)
            r3 = 1
            r0.putBoolean(r1, r3)
        L3a:
            return r0
    }

    public static /* synthetic */ void c(io.fastkv.FastKV r0) {
            r0.writeToCFile()
            return
    }

    private void checkIfCommit() {
            r1 = this;
            int r0 = r1.writingMode
            if (r0 == 0) goto Lb
            boolean r0 = r1.autoCommit
            if (r0 == 0) goto Lb
            r1.commitToCFile()
        Lb:
            return
    }

    private void clearData() {
            r3 = this;
            int r0 = r3.writingMode
            if (r0 != 0) goto L12
            java.nio.MappedByteBuffer r0 = r3.aBuffer     // Catch: java.lang.Exception -> Lf
            r3.resetBuffer(r0)     // Catch: java.lang.Exception -> Lf
            java.nio.MappedByteBuffer r0 = r3.bBuffer     // Catch: java.lang.Exception -> Lf
            r3.resetBuffer(r0)     // Catch: java.lang.Exception -> Lf
            goto L12
        Lf:
            r3.toBlockingMode()
        L12:
            r3.resetMemory()
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.path
            r1.append(r2)
            java.lang.String r2 = r3.name
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            io.fastkv.Utils.deleteFile(r0)
            return
    }

    private void clearDeletedFiles() {
            r5 = this;
            java.util.List<java.lang.String> r0 = r5.deletedFiles
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2d
            java.util.List<java.lang.String> r0 = r5.deletedFiles
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.concurrent.Executor r2 = io.fastkv.FastKVConfig.getExecutor()
            rj r3 = new rj
            r4 = 2
            r3.<init>(r5, r1, r4)
            r2.execute(r3)
            goto Le
        L28:
            java.util.List<java.lang.String> r0 = r5.deletedFiles
            r0.clear()
        L2d:
            return
    }

    private boolean commitToCFile() {
            r4 = this;
            int r0 = r4.writingMode
            r1 = 1
            if (r0 != r1) goto L11
            java.util.concurrent.Executor r0 = r4.applyExecutor
            sj r2 = new sj
            r3 = 0
            r2.<init>(r4, r3)
            r0.execute(r2)
            return r1
        L11:
            r2 = 2
            if (r0 != r2) goto L19
            boolean r0 = r4.writeToCFile()
            return r0
        L19:
            return r1
    }

    private void copyBuffer(java.nio.MappedByteBuffer r8, java.nio.MappedByteBuffer r9, int r10) {
            r7 = this;
            int r0 = r8.capacity()
            int r1 = r9.capacity()
            if (r0 == r1) goto L3c
            java.nio.MappedByteBuffer r0 = r7.bBuffer     // Catch: java.io.IOException -> L12
            if (r9 != r0) goto L15
            java.nio.channels.FileChannel r0 = r7.bChannel     // Catch: java.io.IOException -> L12
        L10:
            r1 = r0
            goto L18
        L12:
            r0 = move-exception
            r8 = r0
            goto L35
        L15:
            java.nio.channels.FileChannel r0 = r7.aChannel     // Catch: java.io.IOException -> L12
            goto L10
        L18:
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch: java.io.IOException -> L12
            int r0 = r8.capacity()     // Catch: java.io.IOException -> L12
            long r5 = (long) r0     // Catch: java.io.IOException -> L12
            r3 = 0
            java.nio.MappedByteBuffer r0 = r1.map(r2, r3, r5)     // Catch: java.io.IOException -> L12
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.io.IOException -> L12
            r0.order(r1)     // Catch: java.io.IOException -> L12
            java.nio.MappedByteBuffer r1 = r7.bBuffer     // Catch: java.io.IOException -> L12
            if (r9 != r1) goto L31
            r7.bBuffer = r0     // Catch: java.io.IOException -> L12
            goto L33
        L31:
            r7.aBuffer = r0     // Catch: java.io.IOException -> L12
        L33:
            r9 = r0
            goto L3c
        L35:
            r7.error(r8)
            r7.toBlockingMode()
            return
        L3c:
            r8.rewind()
            r9.rewind()
            r8.limit(r10)
            r9.put(r8)
            int r9 = r8.capacity()
            r8.limit(r9)
            return
    }

    public static /* synthetic */ void d(io.fastkv.FastKV r0, java.lang.String r1) {
            r0.lambda$remove$0(r1)
            return
    }

    public static /* synthetic */ void e(io.fastkv.FastKV r0, java.lang.String r1) {
            r0.lambda$removeOldFile$2(r1)
            return
    }

    public static /* synthetic */ void f(io.fastkv.FastKV r0) {
            r0.loadData()
            return
    }

    public static /* synthetic */ void g(io.fastkv.FastKV r0, java.lang.String r1) {
            r0.lambda$clearDeletedFiles$1(r1)
            return
    }

    private boolean isABFileEqual() {
            r6 = this;
            io.fastkv.FastBuffer r0 = new io.fastkv.FastBuffer
            int r1 = r6.dataEnd
            r0.<init>(r1)
            java.nio.MappedByteBuffer r1 = r6.bBuffer
            r1.rewind()
            java.nio.MappedByteBuffer r1 = r6.bBuffer
            byte[] r2 = r0.hb
            int r3 = r6.dataEnd
            r4 = 0
            r1.get(r2, r4, r3)
            io.fastkv.FastBuffer r1 = r6.fastBuffer
            byte[] r1 = r1.hb
            byte[] r0 = r0.hb
            r2 = r4
        L1d:
            int r3 = r6.dataEnd
            if (r2 >= r3) goto L2b
            r3 = r1[r2]
            r5 = r0[r2]
            if (r3 == r5) goto L28
            return r4
        L28:
            int r2 = r2 + 1
            goto L1d
        L2b:
            r0 = 1
            return r0
    }

    private /* synthetic */ void lambda$clearDeletedFiles$1(java.lang.String r4) {
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

    private /* synthetic */ void lambda$remove$0(java.lang.String r4) {
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

    private /* synthetic */ void lambda$removeOldFile$2(java.lang.String r4) {
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
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r1 = r5.data     // Catch: java.lang.Throwable -> L21
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L21
            r2 = 1
            r5.startLoading = r2     // Catch: java.lang.Throwable -> L7f
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r2 = r5.data     // Catch: java.lang.Throwable -> L7f
            r2.notify()     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7f
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L21
            boolean r3 = r5.loadFromCFile()     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L23
            int r3 = r5.writingMode     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L23
            r5.loadFromABFile()     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r0 = move-exception
            goto L82
        L23:
            io.fastkv.FastBuffer r3 = r5.fastBuffer     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L30
            io.fastkv.FastBuffer r3 = new io.fastkv.FastBuffer     // Catch: java.lang.Throwable -> L21
            int r4 = io.fastkv.AbsFastKV.PAGE_SIZE     // Catch: java.lang.Throwable -> L21
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L21
            r5.fastBuffer = r3     // Catch: java.lang.Throwable -> L21
        L30:
            int r3 = r5.dataEnd     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L38
            r3 = 12
            r5.dataEnd = r3     // Catch: java.lang.Throwable -> L21
        L38:
            boolean r3 = r5.needRewrite     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L44
            r5.rewrite()     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = "rewrite data"
            r5.info(r3)     // Catch: java.lang.Throwable -> L21
        L44:
            io.fastkv.interfaces.FastLogger r3 = r5.logger     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L7d
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L21
            long r3 = r3 - r1
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L21
            int r0 = r5.dataEnd     // Catch: java.lang.Throwable -> L21
            r1.append(r0)     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = ", get keys:"
            r1.append(r0)     // Catch: java.lang.Throwable -> L21
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r5.data     // Catch: java.lang.Throwable -> L21
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L21
            r1.append(r0)     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = ", use time:"
            r1.append(r0)     // Catch: java.lang.Throwable -> L21
            r1.append(r3)     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = " ms"
            r1.append(r0)     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L21
            r5.info(r0)     // Catch: java.lang.Throwable -> L21
        L7d:
            monitor-exit(r5)
            return
        L7f:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7f
            throw r0     // Catch: java.lang.Throwable -> L21
        L82:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L21
            throw r0
    }

    private void loadFromABFile() {
            r21 = this;
            r1 = r21
            java.lang.String r0 = "rw"
            java.io.File r2 = new java.io.File
            java.lang.String r3 = r1.path
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r1.name
            java.lang.String r6 = ".kva"
            java.lang.String r4 = defpackage.z30.l(r4, r5, r6)
            r2.<init>(r3, r4)
            java.io.File r3 = new java.io.File
            java.lang.String r4 = r1.path
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r1.name
            java.lang.String r7 = ".kvb"
            java.lang.String r5 = defpackage.z30.l(r5, r6, r7)
            r3.<init>(r4, r5)
            boolean r4 = io.fastkv.Utils.makeFileIfNotExist(r2)     // Catch: java.lang.Exception -> La4
            if (r4 == 0) goto L19f
            boolean r4 = io.fastkv.Utils.makeFileIfNotExist(r3)     // Catch: java.lang.Exception -> La4
            if (r4 != 0) goto L3a
            goto L19f
        L3a:
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> La4
            r4.<init>(r2, r0)     // Catch: java.lang.Exception -> La4
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> La4
            r5.<init>(r3, r0)     // Catch: java.lang.Exception -> La4
            long r6 = r4.length()     // Catch: java.lang.Exception -> La4
            long r8 = r5.length()     // Catch: java.lang.Exception -> La4
            java.nio.channels.FileChannel r0 = r4.getChannel()     // Catch: java.lang.Exception -> La4
            r1.aChannel = r0     // Catch: java.lang.Exception -> La4
            java.nio.channels.FileChannel r0 = r5.getChannel()     // Catch: java.lang.Exception -> La4
            r1.bChannel = r0     // Catch: java.lang.Exception -> La4
            java.nio.channels.FileChannel r10 = r1.aChannel     // Catch: java.lang.Exception -> La4 java.io.IOException -> L194
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch: java.lang.Exception -> La4 java.io.IOException -> L194
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L64
            r14 = r6
            goto L68
        L64:
            int r12 = io.fastkv.AbsFastKV.PAGE_SIZE     // Catch: java.lang.Exception -> La4 java.io.IOException -> L194
            long r12 = (long) r12     // Catch: java.lang.Exception -> La4 java.io.IOException -> L194
            r14 = r12
        L68:
            r12 = 0
            java.nio.MappedByteBuffer r10 = r10.map(r11, r12, r14)     // Catch: java.lang.Exception -> La4 java.io.IOException -> L194
            r1.aBuffer = r10     // Catch: java.lang.Exception -> La4 java.io.IOException -> L194
            java.nio.ByteOrder r12 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Exception -> La4 java.io.IOException -> L194
            r10.order(r12)     // Catch: java.lang.Exception -> La4 java.io.IOException -> L194
            r10 = r12
            r12 = r11
            java.nio.channels.FileChannel r11 = r1.bChannel     // Catch: java.lang.Exception -> La4 java.io.IOException -> L194
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 <= 0) goto L7f
            r15 = r8
            goto L83
        L7f:
            int r5 = io.fastkv.AbsFastKV.PAGE_SIZE     // Catch: java.lang.Exception -> La4 java.io.IOException -> L194
            long r13 = (long) r5     // Catch: java.lang.Exception -> La4 java.io.IOException -> L194
            r15 = r13
        L83:
            r13 = 0
            java.nio.MappedByteBuffer r5 = r11.map(r12, r13, r15)     // Catch: java.lang.Exception -> La4 java.io.IOException -> L194
            r1.bBuffer = r5     // Catch: java.lang.Exception -> La4 java.io.IOException -> L194
            r5.order(r10)     // Catch: java.lang.Exception -> La4 java.io.IOException -> L194
            io.fastkv.FastBuffer r2 = new io.fastkv.FastBuffer     // Catch: java.lang.Exception -> La4
            java.nio.MappedByteBuffer r3 = r1.aBuffer     // Catch: java.lang.Exception -> La4
            int r3 = r3.capacity()     // Catch: java.lang.Exception -> La4
            r2.<init>(r3)     // Catch: java.lang.Exception -> La4
            r1.fastBuffer = r2     // Catch: java.lang.Exception -> La4
            r2 = 12
            if (r0 != 0) goto La7
            if (r4 != 0) goto La7
            r1.dataEnd = r2     // Catch: java.lang.Exception -> La4
            return
        La4:
            r0 = move-exception
            goto L1ad
        La7:
            java.nio.MappedByteBuffer r0 = r1.aBuffer     // Catch: java.lang.Exception -> La4
            int r0 = r0.getInt()     // Catch: java.lang.Exception -> La4
            int r3 = io.fastkv.AbsFastKV.unpackSize(r0)     // Catch: java.lang.Exception -> La4
            boolean r0 = io.fastkv.AbsFastKV.isCipher(r0)     // Catch: java.lang.Exception -> La4
            java.nio.MappedByteBuffer r4 = r1.aBuffer     // Catch: java.lang.Exception -> La4
            long r4 = r4.getLong()     // Catch: java.lang.Exception -> La4
            java.nio.MappedByteBuffer r10 = r1.bBuffer     // Catch: java.lang.Exception -> La4
            int r10 = r10.getInt()     // Catch: java.lang.Exception -> La4
            int r11 = io.fastkv.AbsFastKV.unpackSize(r10)     // Catch: java.lang.Exception -> La4
            boolean r10 = io.fastkv.AbsFastKV.isCipher(r10)     // Catch: java.lang.Exception -> La4
            java.nio.MappedByteBuffer r12 = r1.bBuffer     // Catch: java.lang.Exception -> La4
            long r12 = r12.getLong()     // Catch: java.lang.Exception -> La4
            r17 = 12
            if (r3 < 0) goto L123
            long r14 = (long) r3     // Catch: java.lang.Exception -> La4
            long r19 = r6 - r17
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 > 0) goto L123
            int r14 = r3 + 12
            r1.dataEnd = r14     // Catch: java.lang.Exception -> La4
            java.nio.MappedByteBuffer r14 = r1.aBuffer     // Catch: java.lang.Exception -> La4
            r14.rewind()     // Catch: java.lang.Exception -> La4
            java.nio.MappedByteBuffer r14 = r1.aBuffer     // Catch: java.lang.Exception -> La4
            io.fastkv.FastBuffer r15 = r1.fastBuffer     // Catch: java.lang.Exception -> La4
            byte[] r15 = r15.hb     // Catch: java.lang.Exception -> La4
            int r2 = r1.dataEnd     // Catch: java.lang.Exception -> La4
            r19 = r6
            r6 = 0
            r14.get(r15, r6, r2)     // Catch: java.lang.Exception -> La4
            io.fastkv.FastBuffer r2 = r1.fastBuffer     // Catch: java.lang.Exception -> La4
            r6 = 12
            long r2 = r2.getChecksum(r6, r3)     // Catch: java.lang.Exception -> La4
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L123
            boolean r0 = r1.parseData(r0)     // Catch: java.lang.Exception -> La4
            if (r0 == 0) goto L123
            r1.checksum = r4     // Catch: java.lang.Exception -> La4
            int r0 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r0 != 0) goto L10f
            boolean r0 = r1.isABFileEqual()     // Catch: java.lang.Exception -> La4
            if (r0 != 0) goto L19e
        L10f:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> La4
            java.lang.String r2 = "B file error"
            r0.<init>(r2)     // Catch: java.lang.Exception -> La4
            r1.warning(r0)     // Catch: java.lang.Exception -> La4
            java.nio.MappedByteBuffer r0 = r1.aBuffer     // Catch: java.lang.Exception -> La4
            java.nio.MappedByteBuffer r2 = r1.bBuffer     // Catch: java.lang.Exception -> La4
            int r3 = r1.dataEnd     // Catch: java.lang.Exception -> La4
            r1.copyBuffer(r0, r2, r3)     // Catch: java.lang.Exception -> La4
            return
        L123:
            if (r11 < 0) goto L18b
            long r2 = (long) r11     // Catch: java.lang.Exception -> La4
            long r8 = r8 - r17
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 > 0) goto L18b
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r1.data     // Catch: java.lang.Exception -> La4
            r0.clear()     // Catch: java.lang.Exception -> La4
            r1.clearInvalid()     // Catch: java.lang.Exception -> La4
            int r0 = r11 + 12
            r1.dataEnd = r0     // Catch: java.lang.Exception -> La4
            io.fastkv.FastBuffer r0 = r1.fastBuffer     // Catch: java.lang.Exception -> La4
            byte[] r0 = r0.hb     // Catch: java.lang.Exception -> La4
            int r0 = r0.length     // Catch: java.lang.Exception -> La4
            java.nio.MappedByteBuffer r2 = r1.bBuffer     // Catch: java.lang.Exception -> La4
            int r2 = r2.capacity()     // Catch: java.lang.Exception -> La4
            if (r0 == r2) goto L152
            io.fastkv.FastBuffer r0 = new io.fastkv.FastBuffer     // Catch: java.lang.Exception -> La4
            java.nio.MappedByteBuffer r2 = r1.bBuffer     // Catch: java.lang.Exception -> La4
            int r2 = r2.capacity()     // Catch: java.lang.Exception -> La4
            r0.<init>(r2)     // Catch: java.lang.Exception -> La4
            r1.fastBuffer = r0     // Catch: java.lang.Exception -> La4
        L152:
            java.nio.MappedByteBuffer r0 = r1.bBuffer     // Catch: java.lang.Exception -> La4
            r0.rewind()     // Catch: java.lang.Exception -> La4
            java.nio.MappedByteBuffer r0 = r1.bBuffer     // Catch: java.lang.Exception -> La4
            io.fastkv.FastBuffer r2 = r1.fastBuffer     // Catch: java.lang.Exception -> La4
            byte[] r2 = r2.hb     // Catch: java.lang.Exception -> La4
            int r3 = r1.dataEnd     // Catch: java.lang.Exception -> La4
            r6 = 0
            r0.get(r2, r6, r3)     // Catch: java.lang.Exception -> La4
            io.fastkv.FastBuffer r0 = r1.fastBuffer     // Catch: java.lang.Exception -> La4
            r6 = 12
            long r2 = r0.getChecksum(r6, r11)     // Catch: java.lang.Exception -> La4
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 != 0) goto L18b
            boolean r0 = r1.parseData(r10)     // Catch: java.lang.Exception -> La4
            if (r0 == 0) goto L18b
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> La4
            java.lang.String r2 = "A file error"
            r0.<init>(r2)     // Catch: java.lang.Exception -> La4
            r1.warning(r0)     // Catch: java.lang.Exception -> La4
            java.nio.MappedByteBuffer r0 = r1.bBuffer     // Catch: java.lang.Exception -> La4
            java.nio.MappedByteBuffer r2 = r1.aBuffer     // Catch: java.lang.Exception -> La4
            int r3 = r1.dataEnd     // Catch: java.lang.Exception -> La4
            r1.copyBuffer(r0, r2, r3)     // Catch: java.lang.Exception -> La4
            r1.checksum = r12     // Catch: java.lang.Exception -> La4
            return
        L18b:
            java.lang.String r0 = "both files error"
            r1.error(r0)     // Catch: java.lang.Exception -> La4
            r1.clearData()     // Catch: java.lang.Exception -> La4
            return
        L194:
            r0 = move-exception
            r1.error(r0)     // Catch: java.lang.Exception -> La4
            r1.toBlockingMode()     // Catch: java.lang.Exception -> La4
            r1.tryBlockingIO(r2, r3)     // Catch: java.lang.Exception -> La4
        L19e:
            return
        L19f:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> La4
            java.lang.String r2 = "open file failed"
            r0.<init>(r2)     // Catch: java.lang.Exception -> La4
            r1.error(r0)     // Catch: java.lang.Exception -> La4
            r1.toBlockingMode()     // Catch: java.lang.Exception -> La4
            return
        L1ad:
            r1.error(r0)
            r1.resetMemory()
            r1.toBlockingMode()
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
            boolean r3 = r0.exists()     // Catch: java.lang.Exception -> L5a
            if (r3 == 0) goto L30
            goto L39
        L30:
            boolean r0 = r1.exists()     // Catch: java.lang.Exception -> L5a
            if (r0 == 0) goto L38
            r0 = r1
            goto L39
        L38:
            r0 = 0
        L39:
            if (r0 == 0) goto L66
            boolean r0 = r6.loadWithBlockingIO(r0)     // Catch: java.lang.Exception -> L5a
            if (r0 == 0) goto L5f
            int r0 = r6.writingMode     // Catch: java.lang.Exception -> L5a
            if (r0 != 0) goto Lad
            io.fastkv.FastBuffer r0 = r6.fastBuffer     // Catch: java.lang.Exception -> L5a
            boolean r0 = r6.writeToABFile(r0)     // Catch: java.lang.Exception -> L5a
            r1 = 1
            if (r0 == 0) goto L5c
            java.lang.String r0 = "recover from c file"
            r6.info(r0)     // Catch: java.lang.Exception -> L5a
            r6.deleteCFiles()     // Catch: java.lang.Exception -> L57
            return r1
        L57:
            r0 = move-exception
            r2 = r1
            goto Lae
        L5a:
            r0 = move-exception
            goto Lae
        L5c:
            r6.writingMode = r1     // Catch: java.lang.Exception -> L5a
            return r2
        L5f:
            r6.resetMemory()     // Catch: java.lang.Exception -> L5a
            r6.deleteCFiles()     // Catch: java.lang.Exception -> L5a
            return r2
        L66:
            int r0 = r6.writingMode     // Catch: java.lang.Exception -> L5a
            if (r0 == 0) goto Lad
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L5a
            java.lang.String r1 = r6.path     // Catch: java.lang.Exception -> L5a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5a
            r3.<init>()     // Catch: java.lang.Exception -> L5a
            java.lang.String r4 = r6.name     // Catch: java.lang.Exception -> L5a
            r3.append(r4)     // Catch: java.lang.Exception -> L5a
            java.lang.String r4 = ".kva"
            r3.append(r4)     // Catch: java.lang.Exception -> L5a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L5a
            r0.<init>(r1, r3)     // Catch: java.lang.Exception -> L5a
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L5a
            java.lang.String r3 = r6.path     // Catch: java.lang.Exception -> L5a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5a
            r4.<init>()     // Catch: java.lang.Exception -> L5a
            java.lang.String r5 = r6.name     // Catch: java.lang.Exception -> L5a
            r4.append(r5)     // Catch: java.lang.Exception -> L5a
            java.lang.String r5 = ".kvb"
            r4.append(r5)     // Catch: java.lang.Exception -> L5a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L5a
            r1.<init>(r3, r4)     // Catch: java.lang.Exception -> L5a
            boolean r3 = r0.exists()     // Catch: java.lang.Exception -> L5a
            if (r3 == 0) goto Lad
            boolean r3 = r1.exists()     // Catch: java.lang.Exception -> L5a
            if (r3 == 0) goto Lad
            r6.tryBlockingIO(r0, r1)     // Catch: java.lang.Exception -> L5a
        Lad:
            return r2
        Lae:
            r6.error(r0)
            return r2
    }

    private void resetBuffer(java.nio.MappedByteBuffer r9) {
            r8 = this;
            int r0 = r9.capacity()
            int r1 = io.fastkv.AbsFastKV.PAGE_SIZE
            if (r0 == r1) goto L2f
            java.nio.MappedByteBuffer r0 = r8.aBuffer
            if (r9 != r0) goto L10
            java.nio.channels.FileChannel r0 = r8.aChannel
        Le:
            r2 = r0
            goto L13
        L10:
            java.nio.channels.FileChannel r0 = r8.bChannel
            goto Le
        L13:
            long r3 = (long) r1
            r2.truncate(r3)
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_WRITE
            r4 = 0
            long r6 = (long) r1
            java.nio.MappedByteBuffer r0 = r2.map(r3, r4, r6)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r1)
            java.nio.MappedByteBuffer r1 = r8.aBuffer
            if (r9 != r1) goto L2c
            r8.aBuffer = r0
            goto L2e
        L2c:
            r8.bBuffer = r0
        L2e:
            r9 = r0
        L2f:
            r0 = 0
            int r1 = r8.packSize(r0)
            r9.putInt(r0, r1)
            r0 = 4
            r1 = 0
            r9.putLong(r0, r1)
            return
    }

    private void syncToABBuffer(java.nio.MappedByteBuffer r4) {
            r3 = this;
            r0 = 4
            long r1 = r3.checksum
            r4.putLong(r0, r1)
            int r0 = r3.removeStart
            if (r0 == 0) goto L13
            io.fastkv.FastBuffer r1 = r3.fastBuffer
            byte[] r1 = r1.hb
            r1 = r1[r0]
            r4.put(r0, r1)
        L13:
            int r0 = r3.updateSize
            if (r0 == 0) goto L27
            int r0 = r3.updateStart
            r4.position(r0)
            io.fastkv.FastBuffer r0 = r3.fastBuffer
            byte[] r0 = r0.hb
            int r1 = r3.updateStart
            int r2 = r3.updateSize
            r4.put(r0, r1, r2)
        L27:
            return
    }

    private void toBlockingMode() {
            r1 = this;
            r0 = 1
            r1.writingMode = r0
            java.nio.channels.FileChannel r0 = r1.aChannel
            io.fastkv.Utils.closeQuietly(r0)
            java.nio.channels.FileChannel r0 = r1.bChannel
            io.fastkv.Utils.closeQuietly(r0)
            r0 = 0
            r1.aChannel = r0
            r1.bChannel = r0
            r1.aBuffer = r0
            r1.bBuffer = r0
            return
    }

    private void truncate(int r8) {
            r7 = this;
            int r0 = io.fastkv.AbsFastKV.PAGE_SIZE
            int r8 = r8 + r0
            int r8 = r7.getNewCapacity(r0, r8)
            io.fastkv.FastBuffer r0 = r7.fastBuffer
            byte[] r0 = r0.hb
            int r1 = r0.length
            if (r8 < r1) goto Lf
            return
        Lf:
            byte[] r1 = new byte[r8]
            int r2 = r7.dataEnd
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            io.fastkv.FastBuffer r0 = r7.fastBuffer
            r0.hb = r1
            int r0 = r7.writingMode
            if (r0 != 0) goto L58
            java.nio.channels.FileChannel r0 = r7.aChannel     // Catch: java.lang.Exception -> L49
            long r5 = (long) r8     // Catch: java.lang.Exception -> L49
            r0.truncate(r5)     // Catch: java.lang.Exception -> L49
            java.nio.channels.FileChannel r1 = r7.aChannel     // Catch: java.lang.Exception -> L49
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch: java.lang.Exception -> L49
            r3 = 0
            java.nio.MappedByteBuffer r8 = r1.map(r2, r3, r5)     // Catch: java.lang.Exception -> L49
            r7.aBuffer = r8     // Catch: java.lang.Exception -> L49
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Exception -> L49
            r8.order(r0)     // Catch: java.lang.Exception -> L49
            java.nio.channels.FileChannel r8 = r7.bChannel     // Catch: java.lang.Exception -> L49
            r8.truncate(r5)     // Catch: java.lang.Exception -> L49
            java.nio.channels.FileChannel r1 = r7.bChannel     // Catch: java.lang.Exception -> L49
            r3 = 0
            java.nio.MappedByteBuffer r8 = r1.map(r2, r3, r5)     // Catch: java.lang.Exception -> L49
            r7.bBuffer = r8     // Catch: java.lang.Exception -> L49
            r8.order(r0)     // Catch: java.lang.Exception -> L49
            goto L58
        L49:
            r0 = move-exception
            r8 = r0
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "map failed"
            r0.<init>(r1, r8)
            r7.error(r0)
            r7.toBlockingMode()
        L58:
            java.lang.String r8 = "truncate finish"
            r7.info(r8)
            return
    }

    private boolean writeToABFile(io.fastkv.FastBuffer r13) {
            r12 = this;
            java.lang.String r0 = "rw"
            byte[] r1 = r13.hb
            int r1 = r1.length
            java.io.File r2 = new java.io.File
            java.lang.String r3 = r12.path
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r12.name
            java.lang.String r6 = ".kva"
            java.lang.String r4 = defpackage.z30.l(r4, r5, r6)
            r2.<init>(r3, r4)
            java.io.File r3 = new java.io.File
            java.lang.String r4 = r12.path
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r12.name
            java.lang.String r7 = ".kvb"
            java.lang.String r5 = defpackage.z30.l(r5, r6, r7)
            r3.<init>(r4, r5)
            r4 = 0
            boolean r5 = io.fastkv.Utils.makeFileIfNotExist(r2)     // Catch: java.lang.Exception -> L85
            if (r5 == 0) goto L88
            boolean r5 = io.fastkv.Utils.makeFileIfNotExist(r3)     // Catch: java.lang.Exception -> L85
            if (r5 == 0) goto L88
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L85
            r5.<init>(r2, r0)     // Catch: java.lang.Exception -> L85
            long r10 = (long) r1     // Catch: java.lang.Exception -> L85
            r5.setLength(r10)     // Catch: java.lang.Exception -> L85
            java.nio.channels.FileChannel r6 = r5.getChannel()     // Catch: java.lang.Exception -> L85
            r12.aChannel = r6     // Catch: java.lang.Exception -> L85
            java.nio.channels.FileChannel$MapMode r7 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch: java.lang.Exception -> L85
            r8 = 0
            java.nio.MappedByteBuffer r1 = r6.map(r7, r8, r10)     // Catch: java.lang.Exception -> L85
            r12.aBuffer = r1     // Catch: java.lang.Exception -> L85
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Exception -> L85
            r1.order(r2)     // Catch: java.lang.Exception -> L85
            java.nio.MappedByteBuffer r1 = r12.aBuffer     // Catch: java.lang.Exception -> L85
            byte[] r5 = r13.hb     // Catch: java.lang.Exception -> L85
            int r6 = r12.dataEnd     // Catch: java.lang.Exception -> L85
            r1.put(r5, r4, r6)     // Catch: java.lang.Exception -> L85
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L85
            r1.<init>(r3, r0)     // Catch: java.lang.Exception -> L85
            r1.setLength(r10)     // Catch: java.lang.Exception -> L85
            java.nio.channels.FileChannel r6 = r1.getChannel()     // Catch: java.lang.Exception -> L85
            r12.bChannel = r6     // Catch: java.lang.Exception -> L85
            r8 = 0
            java.nio.MappedByteBuffer r0 = r6.map(r7, r8, r10)     // Catch: java.lang.Exception -> L85
            r12.bBuffer = r0     // Catch: java.lang.Exception -> L85
            r0.order(r2)     // Catch: java.lang.Exception -> L85
            java.nio.MappedByteBuffer r0 = r12.bBuffer     // Catch: java.lang.Exception -> L85
            byte[] r13 = r13.hb     // Catch: java.lang.Exception -> L85
            int r1 = r12.dataEnd     // Catch: java.lang.Exception -> L85
            r0.put(r13, r4, r1)     // Catch: java.lang.Exception -> L85
            r13 = 1
            return r13
        L85:
            r0 = move-exception
            r13 = r0
            goto L90
        L88:
            java.lang.Exception r13 = new java.lang.Exception     // Catch: java.lang.Exception -> L85
            java.lang.String r0 = "open file failed"
            r13.<init>(r0)     // Catch: java.lang.Exception -> L85
            throw r13     // Catch: java.lang.Exception -> L85
        L90:
            r12.error(r13)
            return r4
    }

    private synchronized boolean writeToCFile() {
            r5 = this;
            monitor-enter(r5)
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.String r1 = r5.path     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r2.<init>()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.String r3 = r5.name     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r2.append(r3)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.String r3 = ".tmp"
            r2.append(r3)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            io.fastkv.FastBuffer r1 = r5.fastBuffer     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            byte[] r1 = r1.hb     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            int r2 = r5.dataEnd     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            boolean r1 = io.fastkv.Utils.saveBytes(r0, r1, r2)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            if (r1 == 0) goto L5f
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.String r2 = r5.path     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r3.<init>()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.String r4 = r5.name     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r3.append(r4)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.String r4 = ".kvc"
            r3.append(r4)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            boolean r0 = io.fastkv.Utils.renameFile(r0, r1)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            if (r0 == 0) goto L51
            r5.clearDeletedFiles()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            monitor-exit(r5)
            r0 = 1
            return r0
        L4d:
            r0 = move-exception
            goto L62
        L4f:
            r0 = move-exception
            goto L5c
        L51:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.String r1 = "rename failed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r5.warning(r0)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            goto L5f
        L5c:
            r5.error(r0)     // Catch: java.lang.Throwable -> L4d
        L5f:
            monitor-exit(r5)
            r0 = 0
            return r0
        L62:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4d
            throw r0
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized void apply() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.closed     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return
        L7:
            r0 = 1
            r1.autoCommit = r0     // Catch: java.lang.Throwable -> Lf
            r1.commitToCFile()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return
        Lf:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    @Override // io.fastkv.AbsFastKV
    public void checkGC() {
            r3 = this;
            int r0 = r3.invalidBytes
            int r1 = r3.bytesThreshold()
            int r1 = r1 << 1
            if (r0 >= r1) goto L1f
            java.util.ArrayList<io.fastkv.AbsFastKV$Segment> r0 = r3.invalids
            int r0 = r0.size()
            int r1 = r3.dataEnd
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r1 >= r2) goto L19
            r1 = 80
            goto L1b
        L19:
            r1 = 160(0xa0, float:2.24E-43)
        L1b:
            if (r0 < r1) goto L1e
            goto L1f
        L1e:
            return
        L1f:
            r0 = 0
            r3.gc(r0)
            return
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized android.content.SharedPreferences.Editor clear() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.closed     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return r1
        L7:
            r1.clearData()     // Catch: java.lang.Throwable -> L12
            int r0 = r1.writingMode     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            r1.deleteCFiles()     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r0 = move-exception
            goto L1a
        L14:
            r0 = 0
            r1.notifyListeners(r0)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return r1
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    public synchronized void close() {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.closed     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L7
            monitor-exit(r4)
            return
        L7:
            r0 = 1
            r4.closed = r0     // Catch: java.lang.Throwable -> L24
            int r0 = r4.writingMode     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L2a
            java.nio.channels.FileChannel r0 = r4.aChannel     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            r1 = 0
            r0.force(r1)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            java.nio.channels.FileChannel r0 = r4.aChannel     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            r0.close()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            java.nio.channels.FileChannel r0 = r4.bChannel     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            r0.force(r1)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            java.nio.channels.FileChannel r0 = r4.bChannel     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            r0.close()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            goto L2a
        L24:
            r0 = move-exception
            goto L4b
        L26:
            r0 = move-exception
            r4.error(r0)     // Catch: java.lang.Throwable -> L24
        L2a:
            java.lang.Class<io.fastkv.FastKV$Builder> r0 = io.fastkv.FastKV.Builder.class
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L24
            java.util.Map<java.lang.String, io.fastkv.FastKV> r1 = io.fastkv.FastKV.Builder.INSTANCE_MAP     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r2.<init>()     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = r4.path     // Catch: java.lang.Throwable -> L48
            r2.append(r3)     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = r4.name     // Catch: java.lang.Throwable -> L48
            r2.append(r3)     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L48
            r1.remove(r2)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r4)
            return
        L48:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r1     // Catch: java.lang.Throwable -> L24
        L4b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L24
            throw r0
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized boolean commit() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.closed     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L8
            monitor-exit(r1)
            r0 = 0
            return r0
        L8:
            r0 = 1
            r1.autoCommit = r0     // Catch: java.lang.Throwable -> L11
            boolean r0 = r1.commitToCFile()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r0
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ boolean contains(java.lang.String r1) {
            r0 = this;
            boolean r1 = super.contains(r1)
            return r1
    }

    @Override // io.fastkv.AbsFastKV
    public void copyToMainFile(io.fastkv.FastKV r5) {
            r4 = this;
            io.fastkv.FastBuffer r5 = r5.fastBuffer
            int r0 = r4.writingMode
            if (r0 != 0) goto L44
            byte[] r0 = r5.hb
            int r0 = r0.length
            java.nio.MappedByteBuffer r1 = r4.aBuffer
            if (r1 == 0) goto L3b
            int r1 = r1.capacity()
            if (r1 != r0) goto L3b
            java.nio.MappedByteBuffer r1 = r4.bBuffer
            if (r1 == 0) goto L3b
            int r1 = r1.capacity()
            if (r1 != r0) goto L3b
            java.nio.MappedByteBuffer r0 = r4.aBuffer
            r1 = 0
            r0.position(r1)
            java.nio.MappedByteBuffer r0 = r4.aBuffer
            byte[] r2 = r5.hb
            int r3 = r4.dataEnd
            r0.put(r2, r1, r3)
            java.nio.MappedByteBuffer r0 = r4.bBuffer
            r0.position(r1)
            java.nio.MappedByteBuffer r0 = r4.bBuffer
            byte[] r5 = r5.hb
            int r2 = r4.dataEnd
            r0.put(r5, r1, r2)
            goto L44
        L3b:
            boolean r5 = r4.writeToABFile(r5)
            if (r5 != 0) goto L44
            r5 = 1
            r4.writingMode = r5
        L44:
            int r5 = r4.writingMode
            if (r5 == 0) goto L4b
            r4.writeToCFile()
        L4b:
            return
    }

    public synchronized void disableAutoCommit() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.autoCommit = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ android.content.SharedPreferences.Editor edit() {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = super.edit()
            return r0
    }

    @Override // io.fastkv.AbsFastKV
    public void ensureSize(int r12) {
            r11 = this;
            io.fastkv.FastBuffer r0 = r11.fastBuffer
            byte[] r0 = r0.hb
            int r0 = r0.length
            int r1 = r11.dataEnd
            int r1 = r1 + r12
            if (r1 < r0) goto L76
            int r2 = r11.invalidBytes
            if (r2 <= r12) goto L18
            int r3 = r11.bytesThreshold()
            if (r2 <= r3) goto L18
            r11.gc(r12)
            return
        L18:
            int r12 = r11.getNewCapacity(r0, r1)
            byte[] r0 = new byte[r12]
            io.fastkv.FastBuffer r1 = r11.fastBuffer
            byte[] r1 = r1.hb
            int r2 = r11.dataEnd
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r0, r3, r2)
            io.fastkv.FastBuffer r1 = r11.fastBuffer
            r1.hb = r0
            int r0 = r11.writingMode
            if (r0 != 0) goto L76
            java.nio.channels.FileChannel r4 = r11.aChannel     // Catch: java.io.IOException -> L52
            java.nio.channels.FileChannel$MapMode r5 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch: java.io.IOException -> L52
            long r8 = (long) r12     // Catch: java.io.IOException -> L52
            r6 = 0
            java.nio.MappedByteBuffer r12 = r4.map(r5, r6, r8)     // Catch: java.io.IOException -> L52
            r11.aBuffer = r12     // Catch: java.io.IOException -> L52
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.io.IOException -> L52
            r12.order(r0)     // Catch: java.io.IOException -> L52
            r6 = r5
            java.nio.channels.FileChannel r5 = r11.bChannel     // Catch: java.io.IOException -> L52
            r9 = r8
            r7 = 0
            java.nio.MappedByteBuffer r12 = r5.map(r6, r7, r9)     // Catch: java.io.IOException -> L52
            r11.bBuffer = r12     // Catch: java.io.IOException -> L52
            r12.order(r0)     // Catch: java.io.IOException -> L52
            return
        L52:
            r0 = move-exception
            r12 = r0
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "map failed"
            r0.<init>(r1, r12)
            r11.error(r0)
            io.fastkv.FastBuffer r12 = r11.fastBuffer
            int r0 = r11.dataEnd
            int r0 = r0 + (-12)
            int r0 = r11.packSize(r0)
            r12.putInt(r3, r0)
            io.fastkv.FastBuffer r12 = r11.fastBuffer
            r0 = 4
            long r1 = r11.checksum
            r12.putLong(r0, r1)
            r11.toBlockingMode()
        L76:
            return
    }

    public synchronized void force() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.closed     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return
        L7:
            int r0 = r1.writingMode     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            java.nio.MappedByteBuffer r0 = r1.aBuffer     // Catch: java.lang.Throwable -> L16
            r0.force()     // Catch: java.lang.Throwable -> L16
            java.nio.MappedByteBuffer r0 = r1.bBuffer     // Catch: java.lang.Throwable -> L16
            r0.force()     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r0 = move-exception
            goto L1a
        L18:
            monitor-exit(r1)
            return
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
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
    public void handleChange(java.lang.String r1) {
            r0 = this;
            r0.checkIfCommit()
            r0.notifyListeners(r1)
            return
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ void putAll(java.util.Map r1) {
            r0 = this;
            super.putAll(r1)
            return
    }

    @Override // io.fastkv.AbsFastKV
    public synchronized void putAll(java.util.Map<java.lang.String, java.lang.Object> r2, java.util.Map<java.lang.Class, io.fastkv.interfaces.FastEncoder> r3) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.closed     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return
        L7:
            int r0 = r1.writingMode     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            r0 = 0
            r1.autoCommit = r0     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L1d
        L11:
            super.putAll(r2, r3)     // Catch: java.lang.Throwable -> Lf
            int r2 = r1.writingMode     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L1b
            r1.commit()     // Catch: java.lang.Throwable -> Lf
        L1b:
            monitor-exit(r1)
            return
        L1d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
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
    public synchronized android.content.SharedPreferences.Editor remove(java.lang.String r7) {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.closed     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L7
            monitor-exit(r6)
            return r6
        L7:
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r0 = r6.data     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L3b
            io.fastkv.Container$BaseContainer r0 = (io.fastkv.Container.BaseContainer) r0     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto La0
            java.util.HashMap<java.lang.String, io.fastkv.Container$BaseContainer> r1 = r6.data     // Catch: java.lang.Throwable -> L3b
            r1.remove(r7)     // Catch: java.lang.Throwable -> L3b
            io.fastkv.WeakCache r1 = r6.bigValueCache     // Catch: java.lang.Throwable -> L3b
            r1.remove(r7)     // Catch: java.lang.Throwable -> L3b
            io.fastkv.WeakCache r1 = r6.externalCache     // Catch: java.lang.Throwable -> L3b
            r1.remove(r7)     // Catch: java.lang.Throwable -> L3b
            byte r1 = r0.getType()     // Catch: java.lang.Throwable -> L3b
            r2 = 5
            r3 = 0
            if (r1 > r2) goto L3d
            int r7 = io.fastkv.FastBuffer.getStringSize(r7)     // Catch: java.lang.Throwable -> L3b
            int r0 = r0.offset     // Catch: java.lang.Throwable -> L3b
            int r7 = r7 + 2
            int r7 = r0 - r7
            int[] r2 = io.fastkv.AbsFastKV.TYPE_SIZE     // Catch: java.lang.Throwable -> L3b
            r2 = r2[r1]     // Catch: java.lang.Throwable -> L3b
            int r0 = r0 + r2
            r6.remove(r1, r7, r0)     // Catch: java.lang.Throwable -> L3b
            goto L52
        L3b:
            r7 = move-exception
            goto La2
        L3d:
            io.fastkv.Container$VarContainer r0 = (io.fastkv.Container.VarContainer) r0     // Catch: java.lang.Throwable -> L3b
            int r7 = r0.start     // Catch: java.lang.Throwable -> L3b
            int r2 = r0.offset     // Catch: java.lang.Throwable -> L3b
            int r4 = r0.valueSize     // Catch: java.lang.Throwable -> L3b
            int r2 = r2 + r4
            r6.remove(r1, r7, r2)     // Catch: java.lang.Throwable -> L3b
            boolean r7 = r0.external     // Catch: java.lang.Throwable -> L3b
            if (r7 == 0) goto L52
            java.lang.Object r7 = r0.value     // Catch: java.lang.Throwable -> L3b
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L3b
        L52:
            r7 = r1 | (-128(0xffffffffffffff80, float:NaN))
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L3b
            int r0 = r6.writingMode     // Catch: java.lang.Throwable -> L3b
            r1 = 4
            if (r0 != 0) goto L77
            java.nio.MappedByteBuffer r0 = r6.aBuffer     // Catch: java.lang.Throwable -> L3b
            long r4 = r6.checksum     // Catch: java.lang.Throwable -> L3b
            r0.putLong(r1, r4)     // Catch: java.lang.Throwable -> L3b
            java.nio.MappedByteBuffer r0 = r6.aBuffer     // Catch: java.lang.Throwable -> L3b
            int r2 = r6.removeStart     // Catch: java.lang.Throwable -> L3b
            r0.put(r2, r7)     // Catch: java.lang.Throwable -> L3b
            java.nio.MappedByteBuffer r0 = r6.bBuffer     // Catch: java.lang.Throwable -> L3b
            long r4 = r6.checksum     // Catch: java.lang.Throwable -> L3b
            r0.putLong(r1, r4)     // Catch: java.lang.Throwable -> L3b
            java.nio.MappedByteBuffer r0 = r6.bBuffer     // Catch: java.lang.Throwable -> L3b
            int r1 = r6.removeStart     // Catch: java.lang.Throwable -> L3b
            r0.put(r1, r7)     // Catch: java.lang.Throwable -> L3b
            goto L7e
        L77:
            io.fastkv.FastBuffer r7 = r6.fastBuffer     // Catch: java.lang.Throwable -> L3b
            long r4 = r6.checksum     // Catch: java.lang.Throwable -> L3b
            r7.putLong(r1, r4)     // Catch: java.lang.Throwable -> L3b
        L7e:
            r7 = 0
            r6.removeStart = r7     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L9a
            int r7 = r6.writingMode     // Catch: java.lang.Throwable -> L3b
            if (r7 != 0) goto L95
            java.util.concurrent.Executor r7 = io.fastkv.FastKVConfig.getExecutor()     // Catch: java.lang.Throwable -> L3b
            rj r0 = new rj     // Catch: java.lang.Throwable -> L3b
            r1 = 1
            r0.<init>(r6, r3, r1)     // Catch: java.lang.Throwable -> L3b
            r7.execute(r0)     // Catch: java.lang.Throwable -> L3b
            goto L9a
        L95:
            java.util.List<java.lang.String> r7 = r6.deletedFiles     // Catch: java.lang.Throwable -> L3b
            r7.add(r3)     // Catch: java.lang.Throwable -> L3b
        L9a:
            r6.checkGC()     // Catch: java.lang.Throwable -> L3b
            r6.checkIfCommit()     // Catch: java.lang.Throwable -> L3b
        La0:
            monitor-exit(r6)
            return r6
        La2:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3b
            throw r7
    }

    @Override // io.fastkv.AbsFastKV
    public void remove(byte r1, int r2, int r3) {
            r0 = this;
            super.remove(r1, r2, r3)
            r0.removeStart = r2
            return
    }

    @Override // io.fastkv.AbsFastKV
    public void removeOldFile(java.lang.String r4) {
            r3 = this;
            int r0 = r3.writingMode
            if (r0 != 0) goto L12
            java.util.concurrent.Executor r0 = io.fastkv.FastKVConfig.getExecutor()
            rj r1 = new rj
            r2 = 0
            r1.<init>(r3, r4, r2)
            r0.execute(r1)
            return
        L12:
            java.util.List<java.lang.String> r0 = r3.deletedFiles
            r0.add(r4)
            return
    }

    @Override // io.fastkv.AbsFastKV
    public void syncCompatBuffer(int r7, int r8, int r9) {
            r6 = this;
            int r0 = r6.dataEnd
            int r0 = r0 + (-12)
            int r0 = r6.packSize(r0)
            int r1 = r6.writingMode
            r2 = 4
            r3 = 0
            if (r1 != 0) goto L49
            java.nio.MappedByteBuffer r1 = r6.aBuffer
            r4 = -1
            r1.putInt(r3, r4)
            java.nio.MappedByteBuffer r1 = r6.aBuffer
            long r4 = r6.checksum
            r1.putLong(r2, r4)
            java.nio.MappedByteBuffer r1 = r6.aBuffer
            r1.position(r7)
            java.nio.MappedByteBuffer r1 = r6.aBuffer
            io.fastkv.FastBuffer r4 = r6.fastBuffer
            byte[] r4 = r4.hb
            r1.put(r4, r7, r9)
            java.nio.MappedByteBuffer r1 = r6.aBuffer
            r1.putInt(r3, r0)
            java.nio.MappedByteBuffer r1 = r6.bBuffer
            r1.putInt(r3, r0)
            java.nio.MappedByteBuffer r0 = r6.bBuffer
            long r3 = r6.checksum
            r0.putLong(r2, r3)
            java.nio.MappedByteBuffer r0 = r6.bBuffer
            r0.position(r7)
            java.nio.MappedByteBuffer r0 = r6.bBuffer
            io.fastkv.FastBuffer r1 = r6.fastBuffer
            byte[] r1 = r1.hb
            r0.put(r1, r7, r9)
            goto L55
        L49:
            io.fastkv.FastBuffer r7 = r6.fastBuffer
            r7.putInt(r3, r0)
            io.fastkv.FastBuffer r7 = r6.fastBuffer
            long r0 = r6.checksum
            r7.putLong(r2, r0)
        L55:
            int r7 = r6.dataEnd
            int r7 = r7 + r8
            io.fastkv.FastBuffer r8 = r6.fastBuffer
            byte[] r8 = r8.hb
            int r8 = r8.length
            int r8 = r8 - r7
            int r9 = io.fastkv.AbsFastKV.TRUNCATE_THRESHOLD
            if (r8 <= r9) goto L65
            r6.truncate(r7)
        L65:
            return
    }

    public synchronized java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "FastKV: path:"
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
            int r2 = r4.writingMode
            r3 = 4
            if (r2 != 0) goto L27
            java.nio.MappedByteBuffer r2 = r4.aBuffer
            r2.putLong(r3, r0)
            java.nio.MappedByteBuffer r0 = r4.aBuffer
            r0.put(r6, r5)
            java.nio.MappedByteBuffer r0 = r4.bBuffer
            long r1 = r4.checksum
            r0.putLong(r3, r1)
            java.nio.MappedByteBuffer r0 = r4.bBuffer
            r0.put(r6, r5)
            goto L2c
        L27:
            io.fastkv.FastBuffer r2 = r4.fastBuffer
            r2.putLong(r3, r0)
        L2c:
            io.fastkv.FastBuffer r0 = r4.fastBuffer
            byte[] r0 = r0.hb
            r0[r6] = r5
            return
    }

    @Override // io.fastkv.AbsFastKV
    public void updateBytes(int r7, byte[] r8) {
            r6 = this;
            super.updateBytes(r7, r8)
            int r0 = r6.writingMode
            r1 = 4
            if (r0 != 0) goto L3f
            java.nio.MappedByteBuffer r0 = r6.aBuffer
            r2 = -1
            r3 = 0
            r0.putInt(r3, r2)
            java.nio.MappedByteBuffer r0 = r6.aBuffer
            long r4 = r6.checksum
            r0.putLong(r1, r4)
            java.nio.MappedByteBuffer r0 = r6.aBuffer
            r0.position(r7)
            java.nio.MappedByteBuffer r0 = r6.aBuffer
            r0.put(r8)
            java.nio.MappedByteBuffer r0 = r6.aBuffer
            int r2 = r6.dataEnd
            int r2 = r2 + (-12)
            int r2 = r6.packSize(r2)
            r0.putInt(r3, r2)
            java.nio.MappedByteBuffer r0 = r6.bBuffer
            long r2 = r6.checksum
            r0.putLong(r1, r2)
            java.nio.MappedByteBuffer r0 = r6.bBuffer
            r0.position(r7)
            java.nio.MappedByteBuffer r7 = r6.bBuffer
            r7.put(r8)
            return
        L3f:
            io.fastkv.FastBuffer r7 = r6.fastBuffer
            long r2 = r6.checksum
            r7.putLong(r1, r2)
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
            int r0 = r5.dataEnd
            int r0 = r0 + (-12)
            int r0 = r5.packSize(r0)
            int r1 = r5.writingMode
            r2 = 0
            if (r1 != 0) goto L37
            java.nio.MappedByteBuffer r1 = r5.aBuffer
            r3 = -1
            r1.putInt(r2, r3)
            java.nio.MappedByteBuffer r1 = r5.aBuffer
            r5.syncToABBuffer(r1)
            java.nio.MappedByteBuffer r1 = r5.aBuffer
            r1.putInt(r2, r0)
            java.nio.MappedByteBuffer r1 = r5.bBuffer
            r1.putInt(r2, r0)
            java.nio.MappedByteBuffer r0 = r5.bBuffer
            r5.syncToABBuffer(r0)
            goto L44
        L37:
            io.fastkv.FastBuffer r1 = r5.fastBuffer
            r1.putInt(r2, r0)
            io.fastkv.FastBuffer r0 = r5.fastBuffer
            r1 = 4
            long r3 = r5.checksum
            r0.putLong(r1, r3)
        L44:
            r5.removeStart = r2
            r5.updateSize = r2
            return
    }

    @Override // io.fastkv.AbsFastKV
    public void updateInt32(int r5, long r6, int r8) {
            r4 = this;
            long r0 = r4.checksum
            long r6 = r4.shiftCheckSum(r6, r8)
            long r6 = r6 ^ r0
            r4.checksum = r6
            int r0 = r4.writingMode
            r1 = 4
            if (r0 != 0) goto L25
            java.nio.MappedByteBuffer r0 = r4.aBuffer
            r0.putLong(r1, r6)
            java.nio.MappedByteBuffer r6 = r4.aBuffer
            r6.putInt(r8, r5)
            java.nio.MappedByteBuffer r6 = r4.bBuffer
            long r2 = r4.checksum
            r6.putLong(r1, r2)
            java.nio.MappedByteBuffer r6 = r4.bBuffer
            r6.putInt(r8, r5)
            goto L2a
        L25:
            io.fastkv.FastBuffer r0 = r4.fastBuffer
            r0.putLong(r1, r6)
        L2a:
            io.fastkv.FastBuffer r6 = r4.fastBuffer
            r6.putInt(r8, r5)
            return
    }

    @Override // io.fastkv.AbsFastKV
    public void updateInt64(long r5, long r7, int r9) {
            r4 = this;
            long r0 = r4.checksum
            long r7 = r4.shiftCheckSum(r7, r9)
            long r7 = r7 ^ r0
            r4.checksum = r7
            int r0 = r4.writingMode
            r1 = 4
            if (r0 != 0) goto L25
            java.nio.MappedByteBuffer r0 = r4.aBuffer
            r0.putLong(r1, r7)
            java.nio.MappedByteBuffer r7 = r4.aBuffer
            r7.putLong(r9, r5)
            java.nio.MappedByteBuffer r7 = r4.bBuffer
            long r2 = r4.checksum
            r7.putLong(r1, r2)
            java.nio.MappedByteBuffer r7 = r4.bBuffer
            r7.putLong(r9, r5)
            goto L2a
        L25:
            io.fastkv.FastBuffer r0 = r4.fastBuffer
            r0.putLong(r1, r7)
        L2a:
            io.fastkv.FastBuffer r7 = r4.fastBuffer
            r7.putLong(r9, r5)
            return
    }
}
