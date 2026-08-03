package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class cr {
    private static final int a = 25;
    private static com.tendcloud.tenddata.cr b;
    private java.util.concurrent.ExecutorService c;
    private java.util.HashMap<java.lang.Integer, java.util.TreeSet<com.tendcloud.tenddata.cq>> d;
    private java.util.zip.CRC32 e;
    private java.util.Map<java.lang.Integer, java.io.RandomAccessFile> f;
    private java.util.Map<java.lang.Integer, java.nio.channels.FileLock> g;
    private java.util.concurrent.locks.Lock h;


    public class a implements java.lang.Runnable {
        private final java.lang.String mFolderPath;
        private final java.lang.String mNewFolder;
        private final java.util.TreeSet<com.tendcloud.tenddata.cq> mQueue;
        public final /* synthetic */ com.tendcloud.tenddata.cr this$0;

        private a(com.tendcloud.tenddata.cr r4, com.tendcloud.tenddata.a r5) {
                r3 = this;
                r3.this$0 = r4
                r3.<init>()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                android.content.Context r1 = com.tendcloud.tenddata.ab.g
                java.io.File r1 = r1.getFilesDir()
                r0.append(r1)
                java.lang.String r1 = java.io.File.separator
                r0.append(r1)
                java.lang.String r2 = r5.getDataFolder()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r3.mFolderPath = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                android.content.Context r2 = com.tendcloud.tenddata.ab.g
                java.io.File r2 = r2.getFilesDir()
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = r5.getRootFolder()
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = r5.getDataFolder()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.mNewFolder = r0
                java.util.HashMap r4 = com.tendcloud.tenddata.cr.a(r4)
                int r5 = r5.index()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r4 = r4.get(r5)
                java.util.TreeSet r4 = (java.util.TreeSet) r4
                r3.mQueue = r4
                return
        }

        public /* synthetic */ a(com.tendcloud.tenddata.cr r1, com.tendcloud.tenddata.a r2, com.tendcloud.tenddata.cr.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private void deleteFile(java.lang.String r2, com.tendcloud.tenddata.cq r3) {
                r1 = this;
                java.lang.StringBuilder r2 = p000.c4.m108(r2)
                java.lang.String r0 = java.io.File.separator
                r2.append(r0)
                java.lang.String r3 = r3.b()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.io.File r3 = new java.io.File
                r3.<init>(r2)
                boolean r2 = r3.exists()
                if (r2 == 0) goto L22
                r3.delete()
            L22:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.util.TreeSet<com.tendcloud.tenddata.cq> r0 = r3.mQueue     // Catch: java.lang.Throwable -> L47
                if (r0 == 0) goto L47
                r0.isEmpty()     // Catch: java.lang.Throwable -> L47
            L7:
                java.util.TreeSet<com.tendcloud.tenddata.cq> r0 = r3.mQueue     // Catch: java.lang.Throwable -> L47
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L47
                if (r0 != 0) goto L42
                java.util.TreeSet<com.tendcloud.tenddata.cq> r0 = r3.mQueue     // Catch: java.lang.Throwable -> L47
                java.lang.Object r0 = r0.pollFirst()     // Catch: java.lang.Throwable -> L47
                com.tendcloud.tenddata.cq r0 = (com.tendcloud.tenddata.cq) r0     // Catch: java.lang.Throwable -> L47
                if (r0 == 0) goto L7
                java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L47
                java.lang.String r2 = r3.mFolderPath     // Catch: java.lang.Throwable -> L47
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L47
                boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L47
                if (r2 == 0) goto L2d
                java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L47
                r3.deleteFile(r1, r0)     // Catch: java.lang.Throwable -> L47
            L2d:
                java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L47
                java.lang.String r2 = r3.mNewFolder     // Catch: java.lang.Throwable -> L47
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L47
                boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L47
                if (r2 == 0) goto L7
                java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L47
                r3.deleteFile(r1, r0)     // Catch: java.lang.Throwable -> L47
                goto L7
            L42:
                java.util.TreeSet<com.tendcloud.tenddata.cq> r0 = r3.mQueue     // Catch: java.lang.Throwable -> L47
                r0.clear()     // Catch: java.lang.Throwable -> L47
            L47:
                return
        }
    }

    public class b implements java.lang.Runnable {
        private final java.lang.String mFolderPath;
        private final com.tendcloud.tenddata.cq mOperation;
        public final /* synthetic */ com.tendcloud.tenddata.cr this$0;

        private b(com.tendcloud.tenddata.cr r2, com.tendcloud.tenddata.cq r3, com.tendcloud.tenddata.a r4, java.lang.String r5) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                android.content.Context r2 = com.tendcloud.tenddata.ab.g
                java.io.File r2 = r2.getFilesDir()
                java.lang.String r2 = r2.getAbsolutePath()
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 != 0) goto L25
                java.lang.StringBuilder r2 = p000.c4.m108(r2)
                java.lang.String r0 = java.io.File.separator
                r2.append(r0)
                r2.append(r5)
                java.lang.String r2 = r2.toString()
            L25:
                java.lang.StringBuilder r2 = p000.c4.m108(r2)
                java.lang.String r5 = java.io.File.separator
                r2.append(r5)
                java.lang.String r4 = r4.getDataFolder()
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                r1.mFolderPath = r2
                r1.mOperation = r3
                return
        }

        public /* synthetic */ b(com.tendcloud.tenddata.cr r1, com.tendcloud.tenddata.cq r2, com.tendcloud.tenddata.a r3, java.lang.String r4, com.tendcloud.tenddata.cr.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
                r0.<init>()     // Catch: java.lang.Throwable -> L2a
                java.lang.String r1 = r2.mFolderPath     // Catch: java.lang.Throwable -> L2a
                r0.append(r1)     // Catch: java.lang.Throwable -> L2a
                java.lang.String r1 = java.io.File.separator     // Catch: java.lang.Throwable -> L2a
                r0.append(r1)     // Catch: java.lang.Throwable -> L2a
                com.tendcloud.tenddata.cq r1 = r2.mOperation     // Catch: java.lang.Throwable -> L2a
                java.lang.String r1 = r1.b()     // Catch: java.lang.Throwable -> L2a
                r0.append(r1)     // Catch: java.lang.Throwable -> L2a
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2a
                java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L2a
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L2a
                boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L2a
                if (r0 == 0) goto L2a
                r1.delete()     // Catch: java.lang.Throwable -> L2a
            L2a:
                return
        }
    }

    public class c implements java.lang.Runnable {
        private com.tendcloud.tenddata.cs callback;
        private com.tendcloud.tenddata.a features;
        private java.lang.String mFolderPath;
        private final com.tendcloud.tenddata.cq mOperation;
        private final com.tendcloud.tenddata.cr opm;
        public final /* synthetic */ com.tendcloud.tenddata.cr this$0;

        private c(com.tendcloud.tenddata.cr r3, com.tendcloud.tenddata.cq r4, com.tendcloud.tenddata.bv r5, com.tendcloud.tenddata.cr r6) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                android.content.Context r3 = com.tendcloud.tenddata.ab.g
                java.io.File r3 = r3.getFilesDir()
                r2.opm = r6
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = r3.toString()
                r6.append(r0)
                java.lang.String r0 = java.io.File.separator
                r6.append(r0)
                com.tendcloud.tenddata.a r1 = r5.a
                java.lang.String r1 = r1.getDataFolder()
                r6.append(r1)
                java.lang.String r6 = r6.toString()
                r2.mFolderPath = r6
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r3 = r3.toString()
                r6.append(r3)
                r6.append(r0)
                com.tendcloud.tenddata.a r3 = r5.a
                java.lang.String r3 = r3.getRootFolder()
                r6.append(r3)
                r6.append(r0)
                com.tendcloud.tenddata.a r3 = r5.a
                java.lang.String r3 = r3.getDataFolder()
                r6.append(r3)
                java.lang.String r3 = r6.toString()
                r2.mFolderPath = r3
                r2.mOperation = r4
                com.tendcloud.tenddata.cs r3 = r5.f
                r2.callback = r3
                com.tendcloud.tenddata.a r3 = r5.a
                r2.features = r3
                return
        }

        public /* synthetic */ c(com.tendcloud.tenddata.cr r1, com.tendcloud.tenddata.cq r2, com.tendcloud.tenddata.bv r3, com.tendcloud.tenddata.cr r4, com.tendcloud.tenddata.cr.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                r0 = 0
                com.tendcloud.tenddata.cr r1 = r7.opm     // Catch: java.lang.Throwable -> Laf
                monitor-enter(r1)     // Catch: java.lang.Throwable -> Laf
                java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> La8
                java.lang.String r3 = r7.mFolderPath     // Catch: java.lang.Throwable -> La8
                r2.<init>(r3)     // Catch: java.lang.Throwable -> La8
                boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> La8
                if (r3 != 0) goto L1f
                boolean r3 = r2.isDirectory()     // Catch: java.lang.Throwable -> La8
                if (r3 != 0) goto L1f
                boolean r3 = r2.mkdirs()     // Catch: java.lang.Throwable -> La8
                if (r3 != 0) goto L1f
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La8
                return
            L1f:
                com.tendcloud.tenddata.cr r3 = r7.this$0     // Catch: java.lang.Throwable -> La8
                com.tendcloud.tenddata.a r4 = r7.features     // Catch: java.lang.Throwable -> La8
                com.tendcloud.tenddata.cr.a(r3, r2, r4)     // Catch: java.lang.Throwable -> La8
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8
                r2.<init>()     // Catch: java.lang.Throwable -> La8
                java.lang.String r3 = r7.mFolderPath     // Catch: java.lang.Throwable -> La8
                r2.append(r3)     // Catch: java.lang.Throwable -> La8
                java.lang.String r3 = java.io.File.separator     // Catch: java.lang.Throwable -> La8
                r2.append(r3)     // Catch: java.lang.Throwable -> La8
                com.tendcloud.tenddata.cq r3 = r7.mOperation     // Catch: java.lang.Throwable -> La8
                java.lang.String r3 = r3.b()     // Catch: java.lang.Throwable -> La8
                r2.append(r3)     // Catch: java.lang.Throwable -> La8
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> La8
                java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> La8
                r3.<init>(r2)     // Catch: java.lang.Throwable -> La8
                boolean r2 = r3.exists()     // Catch: java.lang.Throwable -> La8
                if (r2 != 0) goto L55
                boolean r2 = r3.createNewFile()     // Catch: java.lang.Throwable -> La8
                if (r2 != 0) goto L55
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La8
                return
            L55:
                java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> La8
                java.lang.String r4 = "rw"
                r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> La8
                java.nio.channels.FileChannel r3 = r2.getChannel()     // Catch: java.lang.Throwable -> La2
                java.nio.channels.FileLock r3 = r3.lock()     // Catch: java.lang.Throwable -> La2
                r4 = 1
                r2.seek(r4)     // Catch: java.lang.Throwable -> L9c
                com.tendcloud.tenddata.cq r4 = r7.mOperation     // Catch: java.lang.Throwable -> L9c
                int r4 = r4.d()     // Catch: java.lang.Throwable -> L9c
                r2.writeInt(r4)     // Catch: java.lang.Throwable -> L9c
                com.tendcloud.tenddata.cq r4 = r7.mOperation     // Catch: java.lang.Throwable -> L9c
                int r4 = r4.e()     // Catch: java.lang.Throwable -> L9c
                r2.writeInt(r4)     // Catch: java.lang.Throwable -> L9c
                com.tendcloud.tenddata.cq r4 = r7.mOperation     // Catch: java.lang.Throwable -> L9c
                byte[] r4 = r4.c()     // Catch: java.lang.Throwable -> L9c
                r2.write(r4)     // Catch: java.lang.Throwable -> L9c
                java.io.FileDescriptor r4 = r2.getFD()     // Catch: java.lang.Throwable -> L9c
                r4.sync()     // Catch: java.lang.Throwable -> L9c
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L9c
                if (r3 == 0) goto L91
                r3.release()     // Catch: java.lang.Throwable -> Lc9
            L91:
                r2.close()     // Catch: java.lang.Throwable -> Lc9
                com.tendcloud.tenddata.cs r0 = r7.callback     // Catch: java.lang.Throwable -> Lc9
                if (r0 == 0) goto Lc9
            L98:
                r0.onStoreSuccess()     // Catch: java.lang.Throwable -> Lc9
                goto Lc9
            L9c:
                r4 = move-exception
                r6 = r3
                r3 = r2
                r2 = r4
                r4 = r6
                goto Lab
            La2:
                r3 = move-exception
                r4 = r0
                r6 = r3
                r3 = r2
                r2 = r6
                goto Lab
            La8:
                r2 = move-exception
                r3 = r0
                r4 = r3
            Lab:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lad
                throw r2     // Catch: java.lang.Throwable -> Lb1
            Lad:
                r2 = move-exception
                goto Lab
            Laf:
                r3 = r0
                r4 = r3
            Lb1:
                com.tendcloud.tenddata.cs r1 = r7.callback     // Catch: java.lang.Throwable -> Lca
                if (r1 == 0) goto Lba
                r1.onStoreFailed()     // Catch: java.lang.Throwable -> Lca
                r7.callback = r0     // Catch: java.lang.Throwable -> Lca
            Lba:
                if (r4 == 0) goto Lbf
                r4.release()     // Catch: java.lang.Throwable -> Lc9
            Lbf:
                if (r3 == 0) goto Lc9
                r3.close()     // Catch: java.lang.Throwable -> Lc9
                com.tendcloud.tenddata.cs r0 = r7.callback     // Catch: java.lang.Throwable -> Lc9
                if (r0 == 0) goto Lc9
                goto L98
            Lc9:
                return
            Lca:
                r0 = move-exception
                if (r4 == 0) goto Ld0
                r4.release()     // Catch: java.lang.Throwable -> Ldc
            Ld0:
                if (r3 == 0) goto Ldc
                r3.close()     // Catch: java.lang.Throwable -> Ldc
                com.tendcloud.tenddata.cs r1 = r7.callback     // Catch: java.lang.Throwable -> Ldc
                if (r1 == 0) goto Ldc
                r1.onStoreSuccess()     // Catch: java.lang.Throwable -> Ldc
            Ldc:
                throw r0
        }
    }

    private cr() {
            r6 = this;
            r6.<init>()
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r6.h = r0
            r6.c()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.d = r0
            com.tendcloud.tenddata.a[] r0 = com.tendcloud.tenddata.a.values()
            int r1 = r0.length
            r2 = 0
        L1a:
            if (r2 >= r1) goto L33
            r3 = r0[r2]
            java.util.HashMap<java.lang.Integer, java.util.TreeSet<com.tendcloud.tenddata.cq>> r4 = r6.d
            int r3 = r3.index()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.TreeSet r5 = new java.util.TreeSet
            r5.<init>()
            r4.put(r3, r5)
            int r2 = r2 + 1
            goto L1a
        L33:
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r6.c = r0
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r6.e = r0
            return
    }

    public static com.tendcloud.tenddata.cr a() {
            java.lang.Class<com.tendcloud.tenddata.cr> r0 = com.tendcloud.tenddata.cr.class
            monitor-enter(r0)
            com.tendcloud.tenddata.cr r1 = com.tendcloud.tenddata.cr.b     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            com.tendcloud.tenddata.cr r1 = new com.tendcloud.tenddata.cr     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            com.tendcloud.tenddata.cr.b = r1     // Catch: java.lang.Throwable -> L12
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            com.tendcloud.tenddata.cr r0 = com.tendcloud.tenddata.cr.b
            return r0
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    public static /* synthetic */ java.util.HashMap a(com.tendcloud.tenddata.cr r0) {
            java.util.HashMap<java.lang.Integer, java.util.TreeSet<com.tendcloud.tenddata.cq>> r0 = r0.d
            return r0
    }

    private synchronized void a(com.tendcloud.tenddata.cq r2, com.tendcloud.tenddata.a r3) {
            r1 = this;
            monitor-enter(r1)
            if (r3 == 0) goto L18
            if (r2 == 0) goto L18
            java.util.HashMap<java.lang.Integer, java.util.TreeSet<com.tendcloud.tenddata.cq>> r0 = r1.d     // Catch: java.lang.Throwable -> L18
            int r3 = r3.index()     // Catch: java.lang.Throwable -> L18
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L18
            java.util.TreeSet r3 = (java.util.TreeSet) r3     // Catch: java.lang.Throwable -> L18
            r3.add(r2)     // Catch: java.lang.Throwable -> L18
        L18:
            monitor-exit(r1)
            return
    }

    public static /* synthetic */ void a(com.tendcloud.tenddata.cr r0, java.io.File r1, com.tendcloud.tenddata.a r2) {
            r0.a(r1, r2)
            return
    }

    private void a(java.io.File r2) {
            r1 = this;
            boolean r0 = r2.isDirectory()     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L15
            java.util.List r2 = r1.c(r2)     // Catch: java.lang.Throwable -> L18
            r0 = 0
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L18
            java.io.File r2 = (java.io.File) r2     // Catch: java.lang.Throwable -> L18
            r1.a(r2)     // Catch: java.lang.Throwable -> L18
            goto L18
        L15:
            r2.delete()     // Catch: java.lang.Throwable -> L18
        L18:
            return
    }

    private void a(java.io.File r2, com.tendcloud.tenddata.a r3) {
            r1 = this;
            int r3 = r3.getFileLimitType()     // Catch: java.lang.Throwable -> L25
            r0 = 1
            if (r3 == r0) goto L1c
            r0 = 2
            if (r3 == r0) goto L12
            r0 = 3
            if (r3 == r0) goto Le
            goto L25
        Le:
            r1.a(r2)     // Catch: java.lang.Throwable -> L25
            goto L25
        L12:
            java.io.File[] r3 = r2.listFiles()     // Catch: java.lang.Throwable -> L25
            int r3 = r3.length     // Catch: java.lang.Throwable -> L25
            r0 = 10
            if (r3 < r0) goto L25
            goto Le
        L1c:
            int r3 = r1.b(r2)     // Catch: java.lang.Throwable -> L25
            r0 = 25
            if (r3 <= r0) goto L25
            goto Le
        L25:
            return
    }

    private int b(java.io.File r8) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            boolean r1 = r8.isDirectory()     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.io.File[] r8 = r8.listFiles()     // Catch: java.lang.Throwable -> L31
            if (r8 == 0) goto L31
            int r1 = r8.length     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L15
            goto L31
        L15:
            int r1 = r8.length     // Catch: java.lang.Throwable -> L31
            r2 = 0
            r4 = r0
        L19:
            if (r4 >= r1) goto L2b
            r5 = r8[r4]     // Catch: java.lang.Throwable -> L31
            boolean r6 = r5.isFile()     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L28
            long r5 = r5.length()     // Catch: java.lang.Throwable -> L31
            long r2 = r2 + r5
        L28:
            int r4 = r4 + 1
            goto L19
        L2b:
            r4 = 1048576(0x100000, double:5.180654E-318)
            long r2 = r2 / r4
            int r8 = (int) r2
            return r8
        L31:
            return r0
    }

    private java.util.List<java.io.File> c(java.io.File r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File[] r2 = r2.listFiles()
            if (r2 == 0) goto L17
            java.util.List r0 = java.util.Arrays.asList(r2)     // Catch: java.lang.Throwable -> L17
            com.tendcloud.tenddata.cr$1 r2 = new com.tendcloud.tenddata.cr$1     // Catch: java.lang.Throwable -> L17
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L17
            java.util.Collections.sort(r0, r2)     // Catch: java.lang.Throwable -> L17
        L17:
            return r0
    }

    private void c() {
            r8 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r8.f = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r8.g = r0
            com.tendcloud.tenddata.a[] r0 = com.tendcloud.tenddata.a.values()     // Catch: java.lang.Throwable -> L6e
            int r1 = r0.length     // Catch: java.lang.Throwable -> L6e
            r2 = 0
        L14:
            if (r2 >= r1) goto L6e
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L6e
            android.content.Context r4 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L6e
            java.io.File r4 = r4.getFilesDir()     // Catch: java.lang.Throwable -> L6e
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L6e
            java.lang.String r6 = r3.getRootFolder()     // Catch: java.lang.Throwable -> L6e
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> L6e
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L6e
            java.lang.String r6 = r3.getDataFolder()     // Catch: java.lang.Throwable -> L6e
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L6e
            boolean r6 = r4.exists()     // Catch: java.lang.Throwable -> L6e
            if (r6 != 0) goto L3d
            boolean r4 = r4.mkdirs()     // Catch: java.lang.Throwable -> L6e
            if (r4 != 0) goto L3d
            return
        L3d:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L6e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
            r6.<init>()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r7 = "Lock"
            r6.append(r7)     // Catch: java.lang.Throwable -> L6e
            int r7 = r3.index()     // Catch: java.lang.Throwable -> L6e
            r6.append(r7)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L6e
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L6e
            java.util.Map<java.lang.Integer, java.io.RandomAccessFile> r5 = r8.f     // Catch: java.lang.Throwable -> L6e
            int r3 = r3.index()     // Catch: java.lang.Throwable -> L6e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L6e
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L6e
            java.lang.String r7 = "rw"
            r6.<init>(r4, r7)     // Catch: java.lang.Throwable -> L6e
            r5.put(r3, r6)     // Catch: java.lang.Throwable -> L6e
            int r2 = r2 + 1
            goto L14
        L6e:
            return
    }

    public synchronized java.util.TreeSet<com.tendcloud.tenddata.cq> a(com.tendcloud.tenddata.a r18, int r19, java.lang.String r20) {
            r17 = this;
            r7 = r17
            r0 = r20
            monitor-enter(r17)
            android.content.Context r1 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L147
            java.io.File r1 = r1.getFilesDir()     // Catch: java.lang.Throwable -> L147
            if (r0 == 0) goto L13
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L147
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L147
            r1 = r2
        L13:
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L147
            java.lang.String r2 = r18.getDataFolder()     // Catch: java.lang.Throwable -> L147
            r8.<init>(r1, r2)     // Catch: java.lang.Throwable -> L147
            boolean r1 = r8.exists()     // Catch: java.lang.Throwable -> L147
            r2 = 0
            if (r1 != 0) goto L3e
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L147
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L147
            r1.<init>()     // Catch: java.lang.Throwable -> L147
            java.lang.String r3 = "operationFolder is not exists: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L147
            r1.append(r8)     // Catch: java.lang.Throwable -> L147
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L147
            r0[r2] = r1     // Catch: java.lang.Throwable -> L147
            com.tendcloud.tenddata.h.iForInternal(r0)     // Catch: java.lang.Throwable -> L147
            goto L130
        L3e:
            java.lang.String[] r10 = r8.list()     // Catch: java.lang.Throwable -> L147
            if (r10 == 0) goto L130
            int r1 = r10.length     // Catch: java.lang.Throwable -> L147
            if (r1 <= 0) goto L130
            int r1 = r10.length     // Catch: java.lang.Throwable -> L147
            r3 = r19
            int r11 = java.lang.Math.min(r1, r3)     // Catch: java.lang.Throwable -> L147
            r12 = r2
            r1 = 0
            r2 = 0
            r3 = 0
        L52:
            if (r12 >= r11) goto L130
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> Lf5
            r5 = r10[r12]     // Catch: java.lang.Throwable -> Lf5
            r4.<init>(r8, r5)     // Catch: java.lang.Throwable -> Lf5
            long r5 = r4.length()     // Catch: java.lang.Throwable -> Lf5
            r13 = 0
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 != 0) goto L71
            if (r1 == 0) goto L6b
            r1.release()     // Catch: java.lang.Throwable -> L11e
            r1 = 0
        L6b:
            if (r2 == 0) goto L11e
            r2.close()     // Catch: java.lang.Throwable -> L11e
            goto L97
        L71:
            com.tendcloud.tenddata.cq r13 = new com.tendcloud.tenddata.cq     // Catch: java.lang.Throwable -> Lf5
            r5 = r10[r12]     // Catch: java.lang.Throwable -> Lf5
            r13.<init>(r5)     // Catch: java.lang.Throwable -> Lf5
            java.io.RandomAccessFile r14 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r3 = "rw"
            r14.<init>(r4, r3)     // Catch: java.lang.Throwable -> Lf2
            java.nio.channels.FileChannel r2 = r14.getChannel()     // Catch: java.lang.Throwable -> Lf0
            java.nio.channels.FileLock r15 = r2.tryLock()     // Catch: java.lang.Throwable -> Lf0
            if (r15 != 0) goto L9a
            r14.close()     // Catch: java.lang.Throwable -> Lf8
            if (r15 == 0) goto L92
            r15.release()     // Catch: java.lang.Throwable -> L118
            r15 = 0
        L92:
            r14.close()     // Catch: java.lang.Throwable -> L118
            r3 = r13
            r1 = r15
        L97:
            r2 = 0
            goto L11e
        L9a:
            r1 = 1
            r14.seek(r1)     // Catch: java.lang.Throwable -> Lf8
            int r1 = r14.readInt()     // Catch: java.lang.Throwable -> Lf8
            int r2 = r14.readInt()     // Catch: java.lang.Throwable -> Lf8
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> Lf8
            r14.readFully(r2)     // Catch: java.lang.Throwable -> Lf8
            java.util.zip.CRC32 r3 = r7.e     // Catch: java.lang.Throwable -> Lf8
            r3.reset()     // Catch: java.lang.Throwable -> Lf8
            java.util.zip.CRC32 r3 = r7.e     // Catch: java.lang.Throwable -> Lf8
            r3.update(r2)     // Catch: java.lang.Throwable -> Lf8
            java.util.zip.CRC32 r3 = r7.e     // Catch: java.lang.Throwable -> Lf8
            long r3 = r3.getValue()     // Catch: java.lang.Throwable -> Lf8
            int r3 = (int) r3
            if (r1 != r3) goto Lcb
            r13.writeData(r2)     // Catch: java.lang.Throwable -> Lc8
            r6 = r18
            r7.a(r13, r6)     // Catch: java.lang.Throwable -> Lf8
            goto Le5
        Lc8:
            r6 = r18
            goto Lf8
        Lcb:
            r6 = r18
            java.util.concurrent.ExecutorService r5 = r7.c     // Catch: java.lang.Throwable -> Lf8
            com.tendcloud.tenddata.cr$b r4 = new com.tendcloud.tenddata.cr$b     // Catch: java.lang.Throwable -> Lf8
            r16 = 0
            r1 = r4
            r2 = r17
            r3 = r13
            r9 = r4
            r4 = r18
            r0 = r5
            r5 = r20
            r6 = r16
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lf8
            r0.execute(r9)     // Catch: java.lang.Throwable -> Lf8
        Le5:
            r15.release()     // Catch: java.lang.Throwable -> L118
            r14.close()     // Catch: java.lang.Throwable -> Lee
            r3 = r13
            r1 = 0
            goto L97
        Lee:
            r15 = 0
            goto L118
        Lf0:
            r15 = r1
            goto Lf8
        Lf2:
            r15 = r1
            r14 = r2
            goto Lf8
        Lf5:
            r15 = r1
            r14 = r2
            r13 = r3
        Lf8:
            java.util.concurrent.ExecutorService r0 = r7.c     // Catch: java.lang.Throwable -> L124
            com.tendcloud.tenddata.cr$b r9 = new com.tendcloud.tenddata.cr$b     // Catch: java.lang.Throwable -> L124
            r6 = 0
            r1 = r9
            r2 = r17
            r3 = r13
            r4 = r18
            r5 = r20
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L124
            r0.execute(r9)     // Catch: java.lang.Throwable -> L124
            if (r15 == 0) goto L111
            r15.release()     // Catch: java.lang.Throwable -> L118
            r15 = 0
        L111:
            if (r14 == 0) goto L11b
            r14.close()     // Catch: java.lang.Throwable -> L118
            r2 = 0
            goto L11c
        L118:
            r3 = r13
            r2 = r14
            goto L11d
        L11b:
            r2 = r14
        L11c:
            r3 = r13
        L11d:
            r1 = r15
        L11e:
            int r12 = r12 + 1
            r0 = r20
            goto L52
        L124:
            r0 = move-exception
            if (r15 == 0) goto L12a
            r15.release()     // Catch: java.lang.Throwable -> L12f
        L12a:
            if (r14 == 0) goto L12f
            r14.close()     // Catch: java.lang.Throwable -> L12f
        L12f:
            throw r0     // Catch: java.lang.Throwable -> L147
        L130:
            java.util.HashMap<java.lang.Integer, java.util.TreeSet<com.tendcloud.tenddata.cq>> r0 = r7.d     // Catch: java.lang.Throwable -> L147
            if (r0 == 0) goto L144
            int r1 = r18.index()     // Catch: java.lang.Throwable -> L147
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L147
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L147
            java.util.TreeSet r0 = (java.util.TreeSet) r0     // Catch: java.lang.Throwable -> L147
            monitor-exit(r17)
            return r0
        L144:
            monitor-exit(r17)
            r0 = 0
            return r0
        L147:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
    }

    public synchronized void a(com.tendcloud.tenddata.cq r9, com.tendcloud.tenddata.bv r10) {
            r8 = this;
            monitor-enter(r8)
            java.util.concurrent.ExecutorService r0 = r8.c     // Catch: java.lang.Throwable -> L13
            com.tendcloud.tenddata.cr$c r7 = new com.tendcloud.tenddata.cr$c     // Catch: java.lang.Throwable -> L13
            r6 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L13
            r0.execute(r7)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r8)
            return
        L13:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    public void b() {
            r7 = this;
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            java.io.File r0 = r0.getFilesDir()
            com.tendcloud.tenddata.a[] r1 = com.tendcloud.tenddata.a.values()     // Catch: java.lang.Throwable -> L78
            int r2 = r1.length     // Catch: java.lang.Throwable -> L78
            r3 = 0
            r4 = r3
        Ld:
            if (r4 >= r2) goto L3b
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L78
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L78
            java.lang.String r5 = r5.getDataFolder()     // Catch: java.lang.Throwable -> L78
            r6.<init>(r0, r5)     // Catch: java.lang.Throwable -> L78
            boolean r5 = r6.exists()     // Catch: java.lang.Throwable -> L78
            if (r5 == 0) goto L38
            java.util.List r5 = r7.c(r6)     // Catch: java.lang.Throwable -> L78
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L78
        L28:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L78
            if (r6 == 0) goto L38
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L78
            java.io.File r6 = (java.io.File) r6     // Catch: java.lang.Throwable -> L78
            r6.delete()     // Catch: java.lang.Throwable -> L78
            goto L28
        L38:
            int r4 = r4 + 1
            goto Ld
        L3b:
            com.tendcloud.tenddata.a[] r1 = com.tendcloud.tenddata.a.values()     // Catch: java.lang.Throwable -> L78
            int r2 = r1.length     // Catch: java.lang.Throwable -> L78
        L40:
            if (r3 >= r2) goto L78
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L78
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L78
            java.lang.String r6 = r4.getRootFolder()     // Catch: java.lang.Throwable -> L78
            r5.<init>(r0, r6)     // Catch: java.lang.Throwable -> L78
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L78
            java.lang.String r4 = r4.getDataFolder()     // Catch: java.lang.Throwable -> L78
            r0.<init>(r5, r4)     // Catch: java.lang.Throwable -> L78
            boolean r4 = r0.exists()     // Catch: java.lang.Throwable -> L78
            if (r4 == 0) goto L74
            java.util.List r0 = r7.c(r0)     // Catch: java.lang.Throwable -> L78
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L78
        L64:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L78
            if (r4 == 0) goto L74
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L78
            java.io.File r4 = (java.io.File) r4     // Catch: java.lang.Throwable -> L78
            r4.delete()     // Catch: java.lang.Throwable -> L78
            goto L64
        L74:
            int r3 = r3 + 1
            r0 = r5
            goto L40
        L78:
            return
    }

    public void clearDataCache(com.tendcloud.tenddata.a r2) {
            r1 = this;
            java.util.HashMap<java.lang.Integer, java.util.TreeSet<com.tendcloud.tenddata.cq>> r0 = r1.d     // Catch: java.lang.Throwable -> L13
            int r2 = r2.index()     // Catch: java.lang.Throwable -> L13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L13
            java.util.TreeSet r2 = (java.util.TreeSet) r2     // Catch: java.lang.Throwable -> L13
            r2.clear()     // Catch: java.lang.Throwable -> L13
        L13:
            return
    }

    public void confirmRead(com.tendcloud.tenddata.a r3) {
            r2 = this;
            com.tendcloud.tenddata.cr$a r0 = new com.tendcloud.tenddata.cr$a
            r1 = 0
            r0.<init>(r2, r3, r1)
            r0.run()
            return
    }

    public void getFileLock(com.tendcloud.tenddata.a r4) {
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.h     // Catch: java.lang.Throwable -> L2a
            r0.lock()     // Catch: java.lang.Throwable -> L2a
            java.util.Map<java.lang.Integer, java.nio.channels.FileLock> r0 = r3.g     // Catch: java.lang.Throwable -> L2a
            int r1 = r4.index()     // Catch: java.lang.Throwable -> L2a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L2a
            java.util.Map<java.lang.Integer, java.io.RandomAccessFile> r2 = r3.f     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.index()     // Catch: java.lang.Throwable -> L2a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Throwable -> L2a
            java.io.RandomAccessFile r4 = (java.io.RandomAccessFile) r4     // Catch: java.lang.Throwable -> L2a
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch: java.lang.Throwable -> L2a
            java.nio.channels.FileLock r4 = r4.lock()     // Catch: java.lang.Throwable -> L2a
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L2a
        L2a:
            return
    }

    public void releaseFileLock(com.tendcloud.tenddata.a r3) {
            r2 = this;
            java.util.Map<java.lang.Integer, java.nio.channels.FileLock> r0 = r2.g     // Catch: java.lang.Throwable -> L28
            int r1 = r3.index()     // Catch: java.lang.Throwable -> L28
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L28
            java.util.Map<java.lang.Integer, java.nio.channels.FileLock> r0 = r2.g     // Catch: java.lang.Throwable -> L28
            int r3 = r3.index()     // Catch: java.lang.Throwable -> L28
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L28
            java.nio.channels.FileLock r3 = (java.nio.channels.FileLock) r3     // Catch: java.lang.Throwable -> L28
            r3.release()     // Catch: java.lang.Throwable -> L28
            java.util.concurrent.locks.Lock r3 = r2.h     // Catch: java.lang.Throwable -> L28
            r3.unlock()     // Catch: java.lang.Throwable -> L28
        L28:
            return
    }
}
