package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class n {
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tendcloud.tenddata.n.a> a;

    /* JADX INFO: renamed from: com.tendcloud.tenddata.n$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class a {
        private java.nio.channels.FileLock fileLock;
        private java.io.RandomAccessFile randomAccessFile;

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(com.tendcloud.tenddata.n.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ java.io.RandomAccessFile access$000(com.tendcloud.tenddata.n.a r0) {
                java.io.RandomAccessFile r0 = r0.randomAccessFile
                return r0
        }

        public static /* synthetic */ java.io.RandomAccessFile access$002(com.tendcloud.tenddata.n.a r0, java.io.RandomAccessFile r1) {
                r0.randomAccessFile = r1
                return r1
        }

        public static /* synthetic */ java.nio.channels.FileLock access$200(com.tendcloud.tenddata.n.a r0) {
                java.nio.channels.FileLock r0 = r0.fileLock
                return r0
        }

        public static /* synthetic */ java.nio.channels.FileLock access$202(com.tendcloud.tenddata.n.a r0, java.nio.channels.FileLock r1) {
                r0.fileLock = r1
                return r1
        }
    }

    public enum b extends java.lang.Enum<com.tendcloud.tenddata.n.b> {
        private static final /* synthetic */ com.tendcloud.tenddata.n.b[] $VALUES = null;
        public static final com.tendcloud.tenddata.n.b AES_DATA_ENTRYCP_LOCK = null;
        public static final com.tendcloud.tenddata.n.b AES_DATA_LOCK = null;
        public static final com.tendcloud.tenddata.n.b AES_IV_LOCK = null;
        public static final com.tendcloud.tenddata.n.b AES_SALT_LOCK = null;
        public static final com.tendcloud.tenddata.n.b App_Lock_File = null;
        public static final com.tendcloud.tenddata.n.b App_SQL_Lock_File = null;
        public static final com.tendcloud.tenddata.n.b BG_Lock_File = null;
        public static final com.tendcloud.tenddata.n.b Cloud_Control_Lock_File = null;
        public static final com.tendcloud.tenddata.n.b Custom_Device_Id_Lock_File = null;
        public static final com.tendcloud.tenddata.n.b EAuth_Lock_File = null;
        public static final com.tendcloud.tenddata.n.b Env_Lock_File = null;
        public static final com.tendcloud.tenddata.n.b Game_Lock_File = null;
        public static final com.tendcloud.tenddata.n.b Push_Lock_File = null;
        public static final com.tendcloud.tenddata.n.b Tracking_Lock_File = null;
        public static final com.tendcloud.tenddata.n.b Universal_Lock_File = null;
        private final java.lang.String filePath;

        static {
                com.tendcloud.tenddata.n$b r0 = new com.tendcloud.tenddata.n$b
                java.lang.String r1 = "Custom_Device_Id_Lock_File"
                r2 = 0
                r0.<init>(r1, r2, r1)
                com.tendcloud.tenddata.n.b.Custom_Device_Id_Lock_File = r0
                com.tendcloud.tenddata.n$b r1 = new com.tendcloud.tenddata.n$b
                java.lang.String r3 = "Cloud_Control_Lock_File"
                r4 = 1
                java.lang.String r5 = "Cloud_Control_Cache_Param"
                r1.<init>(r3, r4, r5)
                com.tendcloud.tenddata.n.b.Cloud_Control_Lock_File = r1
                com.tendcloud.tenddata.n$b r3 = new com.tendcloud.tenddata.n$b
                java.lang.String r5 = "App_Lock_File"
                r6 = 2
                java.lang.String r7 = "__App_Synchronous_Lock__"
                r3.<init>(r5, r6, r7)
                com.tendcloud.tenddata.n.b.App_Lock_File = r3
                com.tendcloud.tenddata.n$b r5 = new com.tendcloud.tenddata.n$b
                java.lang.String r7 = "Tracking_Lock_File"
                r8 = 3
                java.lang.String r9 = "__Tracking_Synchronous_Lock__"
                r5.<init>(r7, r8, r9)
                com.tendcloud.tenddata.n.b.Tracking_Lock_File = r5
                com.tendcloud.tenddata.n$b r7 = new com.tendcloud.tenddata.n$b
                java.lang.String r9 = "Env_Lock_File"
                r10 = 4
                java.lang.String r11 = "__Env_Synchronous_Lock__"
                r7.<init>(r9, r10, r11)
                com.tendcloud.tenddata.n.b.Env_Lock_File = r7
                com.tendcloud.tenddata.n$b r9 = new com.tendcloud.tenddata.n$b
                java.lang.String r11 = "Game_Lock_File"
                r12 = 5
                java.lang.String r13 = "__Game_Synchronous_Lock__"
                r9.<init>(r11, r12, r13)
                com.tendcloud.tenddata.n.b.Game_Lock_File = r9
                com.tendcloud.tenddata.n$b r11 = new com.tendcloud.tenddata.n$b
                java.lang.String r13 = "Push_Lock_File"
                r14 = 6
                java.lang.String r15 = "__Push_Synchronous_Lock__"
                r11.<init>(r13, r14, r15)
                com.tendcloud.tenddata.n.b.Push_Lock_File = r11
                com.tendcloud.tenddata.n$b r13 = new com.tendcloud.tenddata.n$b
                java.lang.String r15 = "EAuth_Lock_File"
                r14 = 7
                java.lang.String r12 = "__EAuth_Synchronous_Lock__"
                r13.<init>(r15, r14, r12)
                com.tendcloud.tenddata.n.b.EAuth_Lock_File = r13
                com.tendcloud.tenddata.n$b r12 = new com.tendcloud.tenddata.n$b
                java.lang.String r15 = "App_SQL_Lock_File"
                r14 = 8
                java.lang.String r10 = "__AppSQL_Synchronous_Lock__"
                r12.<init>(r15, r14, r10)
                com.tendcloud.tenddata.n.b.App_SQL_Lock_File = r12
                com.tendcloud.tenddata.n$b r10 = new com.tendcloud.tenddata.n$b
                java.lang.String r15 = "BG_Lock_File"
                r14 = 9
                java.lang.String r8 = "__BG_Synchronous_Lock__"
                r10.<init>(r15, r14, r8)
                com.tendcloud.tenddata.n.b.BG_Lock_File = r10
                com.tendcloud.tenddata.n$b r8 = new com.tendcloud.tenddata.n$b
                java.lang.String r15 = "Universal_Lock_File"
                r14 = 10
                java.lang.String r6 = "__SDK_Synchronous_Lock__"
                r8.<init>(r15, r14, r6)
                com.tendcloud.tenddata.n.b.Universal_Lock_File = r8
                com.tendcloud.tenddata.n$b r6 = new com.tendcloud.tenddata.n$b
                java.lang.String r15 = "AES_DATA_LOCK"
                r14 = 11
                java.lang.String r4 = "_AES_DATA_LOCK"
                r6.<init>(r15, r14, r4)
                com.tendcloud.tenddata.n.b.AES_DATA_LOCK = r6
                com.tendcloud.tenddata.n$b r4 = new com.tendcloud.tenddata.n$b
                java.lang.String r15 = "AES_DATA_ENTRYCP_LOCK"
                r14 = 12
                java.lang.String r2 = "_AES_DATA_ENTCRYPT_LOCK"
                r4.<init>(r15, r14, r2)
                com.tendcloud.tenddata.n.b.AES_DATA_ENTRYCP_LOCK = r4
                com.tendcloud.tenddata.n$b r2 = new com.tendcloud.tenddata.n$b
                java.lang.String r15 = "AES_SALT_LOCK"
                r14 = 13
                r16 = r4
                java.lang.String r4 = "_AES_SALT_LOCK"
                r2.<init>(r15, r14, r4)
                com.tendcloud.tenddata.n.b.AES_SALT_LOCK = r2
                com.tendcloud.tenddata.n$b r4 = new com.tendcloud.tenddata.n$b
                java.lang.String r15 = "AES_IV_LOCK"
                r14 = 14
                r17 = r2
                java.lang.String r2 = "_AES_IV_LOCK"
                r4.<init>(r15, r14, r2)
                com.tendcloud.tenddata.n.b.AES_IV_LOCK = r4
                r2 = 15
                com.tendcloud.tenddata.n$b[] r2 = new com.tendcloud.tenddata.n.b[r2]
                r15 = 0
                r2[r15] = r0
                r0 = 1
                r2[r0] = r1
                r0 = 2
                r2[r0] = r3
                r0 = 3
                r2[r0] = r5
                r0 = 4
                r2[r0] = r7
                r0 = 5
                r2[r0] = r9
                r0 = 6
                r2[r0] = r11
                r0 = 7
                r2[r0] = r13
                r0 = 8
                r2[r0] = r12
                r0 = 9
                r2[r0] = r10
                r0 = 10
                r2[r0] = r8
                r0 = 11
                r2[r0] = r6
                r0 = 12
                r2[r0] = r16
                r0 = 13
                r2[r0] = r17
                r2[r14] = r4
                com.tendcloud.tenddata.n.b.$VALUES = r2
                return
        }

        b(java.lang.String r3, int r4, java.lang.String r5) {
                r2 = this;
                r2.<init>(r3, r4)
                java.io.File r3 = new java.io.File
                android.content.Context r4 = com.tendcloud.tenddata.ab.g
                java.io.File r4 = r4.getFilesDir()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "TD"
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r3.<init>(r4, r5)
                java.lang.String r3 = r3.getAbsolutePath()
                r2.filePath = r3
                return
        }

        public static java.lang.String getFeatureLockFileName(int r1) {
                if (r1 == 0) goto L36
                r0 = 1
                if (r1 == r0) goto L33
                r0 = 2
                if (r1 == r0) goto L30
                r0 = 3
                if (r1 == r0) goto L2d
                r0 = 4
                if (r1 == r0) goto L2a
                r0 = 6
                if (r1 == r0) goto L27
                r0 = 7
                if (r1 == r0) goto L24
                r0 = 8
                if (r1 == r0) goto L21
                r0 = 99
                if (r1 == r0) goto L1e
                r1 = 0
                goto L3c
            L1e:
                com.tendcloud.tenddata.n$b r1 = com.tendcloud.tenddata.n.b.Universal_Lock_File
                goto L38
            L21:
                com.tendcloud.tenddata.n$b r1 = com.tendcloud.tenddata.n.b.BG_Lock_File
                goto L38
            L24:
                com.tendcloud.tenddata.n$b r1 = com.tendcloud.tenddata.n.b.App_SQL_Lock_File
                goto L38
            L27:
                com.tendcloud.tenddata.n$b r1 = com.tendcloud.tenddata.n.b.EAuth_Lock_File
                goto L38
            L2a:
                com.tendcloud.tenddata.n$b r1 = com.tendcloud.tenddata.n.b.Push_Lock_File
                goto L38
            L2d:
                com.tendcloud.tenddata.n$b r1 = com.tendcloud.tenddata.n.b.Game_Lock_File
                goto L38
            L30:
                com.tendcloud.tenddata.n$b r1 = com.tendcloud.tenddata.n.b.Env_Lock_File
                goto L38
            L33:
                com.tendcloud.tenddata.n$b r1 = com.tendcloud.tenddata.n.b.Tracking_Lock_File
                goto L38
            L36:
                com.tendcloud.tenddata.n$b r1 = com.tendcloud.tenddata.n.b.App_Lock_File
            L38:
                java.lang.String r1 = r1.toString()
            L3c:
                return r1
        }

        public static com.tendcloud.tenddata.n.b valueOf(java.lang.String r1) {
                java.lang.Class<com.tendcloud.tenddata.n$b> r0 = com.tendcloud.tenddata.n.b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.tendcloud.tenddata.n$b r1 = (com.tendcloud.tenddata.n.b) r1
                return r1
        }

        public static com.tendcloud.tenddata.n.b[] values() {
                com.tendcloud.tenddata.n$b[] r0 = com.tendcloud.tenddata.n.b.$VALUES
                java.lang.Object r0 = r0.clone()
                com.tendcloud.tenddata.n$b[] r0 = (com.tendcloud.tenddata.n.b[]) r0
                return r0
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.filePath
                return r0
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.tendcloud.tenddata.n.a = r0
            return
    }

    public n() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(java.lang.String r5) {
            r0 = 0
            boolean r1 = com.tendcloud.tenddata.y.b(r5)     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L4b
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L53
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L53
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tendcloud.tenddata.n$a> r2 = com.tendcloud.tenddata.n.a     // Catch: java.lang.Throwable -> L53
            boolean r2 = r2.containsKey(r5)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L21
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tendcloud.tenddata.n$a> r1 = com.tendcloud.tenddata.n.a     // Catch: java.lang.Throwable -> L53
            java.lang.Object r5 = r1.get(r5)     // Catch: java.lang.Throwable -> L53
            com.tendcloud.tenddata.n$a r5 = (com.tendcloud.tenddata.n.a) r5     // Catch: java.lang.Throwable -> L53
            java.io.RandomAccessFile r1 = com.tendcloud.tenddata.n.a.access$000(r5)     // Catch: java.lang.Throwable -> L53
            goto L38
        L21:
            com.tendcloud.tenddata.n$a r2 = new com.tendcloud.tenddata.n$a     // Catch: java.lang.Throwable -> L53
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L53
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = "rw"
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> L53
            com.tendcloud.tenddata.n.a.access$002(r2, r3)     // Catch: java.lang.Throwable -> L53
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tendcloud.tenddata.n$a> r1 = com.tendcloud.tenddata.n.a     // Catch: java.lang.Throwable -> L53
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L53
            r5 = r2
            r1 = r3
        L38:
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch: java.lang.Throwable -> L53
            java.nio.channels.FileLock r1 = r1.tryLock()     // Catch: java.lang.Throwable -> L53
            com.tendcloud.tenddata.n.a.access$202(r5, r1)     // Catch: java.lang.Throwable -> L53
            java.nio.channels.FileLock r5 = com.tendcloud.tenddata.n.a.access$200(r5)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L4a
            r0 = 1
        L4a:
            return r0
        L4b:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = "LockManager Error: filePath can not be null!"
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L53
            throw r5     // Catch: java.lang.Throwable -> L53
        L53:
            return r0
    }

    public static java.io.RandomAccessFile b(java.lang.String r5) {
            r0 = 0
            boolean r1 = com.tendcloud.tenddata.y.b(r5)     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L36
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tendcloud.tenddata.n$a> r2 = com.tendcloud.tenddata.n.a     // Catch: java.lang.Throwable -> L3e
            boolean r2 = r2.containsKey(r5)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L21
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tendcloud.tenddata.n$a> r1 = com.tendcloud.tenddata.n.a     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r5 = r1.get(r5)     // Catch: java.lang.Throwable -> L3e
            com.tendcloud.tenddata.n$a r5 = (com.tendcloud.tenddata.n.a) r5     // Catch: java.lang.Throwable -> L3e
            java.io.RandomAccessFile r5 = com.tendcloud.tenddata.n.a.access$000(r5)     // Catch: java.lang.Throwable -> L3e
            return r5
        L21:
            com.tendcloud.tenddata.n$a r2 = new com.tendcloud.tenddata.n$a     // Catch: java.lang.Throwable -> L3e
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L3e
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "rw"
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> L3e
            com.tendcloud.tenddata.n.a.access$002(r2, r3)     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tendcloud.tenddata.n$a> r1 = com.tendcloud.tenddata.n.a     // Catch: java.lang.Throwable -> L3e
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L3e
            return r3
        L36:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = "LockManager Error: filePath can not be null!"
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L3e
            throw r5     // Catch: java.lang.Throwable -> L3e
        L3e:
            return r0
    }

    public static void getFileLock(java.lang.String r4) {
            boolean r0 = com.tendcloud.tenddata.y.b(r4)     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto L43
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L4b
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L4b
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tendcloud.tenddata.n$a> r1 = com.tendcloud.tenddata.n.a     // Catch: java.lang.Throwable -> L4b
            boolean r1 = r1.containsKey(r4)     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L20
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tendcloud.tenddata.n$a> r0 = com.tendcloud.tenddata.n.a     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Throwable -> L4b
            com.tendcloud.tenddata.n$a r4 = (com.tendcloud.tenddata.n.a) r4     // Catch: java.lang.Throwable -> L4b
            java.io.RandomAccessFile r0 = com.tendcloud.tenddata.n.a.access$000(r4)     // Catch: java.lang.Throwable -> L4b
            goto L37
        L20:
            com.tendcloud.tenddata.n$a r1 = new com.tendcloud.tenddata.n$a     // Catch: java.lang.Throwable -> L4b
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4b
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = "rw"
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L4b
            com.tendcloud.tenddata.n.a.access$002(r1, r2)     // Catch: java.lang.Throwable -> L4b
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tendcloud.tenddata.n$a> r0 = com.tendcloud.tenddata.n.a     // Catch: java.lang.Throwable -> L4b
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L4b
            r4 = r1
            r0 = r2
        L37:
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch: java.lang.Throwable -> L4b
            java.nio.channels.FileLock r0 = r0.lock()     // Catch: java.lang.Throwable -> L4b
            com.tendcloud.tenddata.n.a.access$202(r4, r0)     // Catch: java.lang.Throwable -> L4b
            goto L4b
        L43:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = "LockManager Error: filePath can not be null!"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L4b
            throw r4     // Catch: java.lang.Throwable -> L4b
        L4b:
            return
    }

    public static void releaseFileLock(java.lang.String r1) {
            boolean r0 = com.tendcloud.tenddata.y.b(r1)     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L2c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tendcloud.tenddata.n$a> r0 = com.tendcloud.tenddata.n.a     // Catch: java.lang.Throwable -> L34
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L24
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tendcloud.tenddata.n$a> r0 = com.tendcloud.tenddata.n.a     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L34
            com.tendcloud.tenddata.n$a r1 = (com.tendcloud.tenddata.n.a) r1     // Catch: java.lang.Throwable -> L34
            java.nio.channels.FileLock r0 = com.tendcloud.tenddata.n.a.access$200(r1)     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L34
            java.nio.channels.FileLock r1 = com.tendcloud.tenddata.n.a.access$200(r1)     // Catch: java.lang.Throwable -> L34
            r1.release()     // Catch: java.lang.Throwable -> L34
            goto L34
        L24:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "LockManager Error: there is no information about this file in the cache!"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L34
            throw r1     // Catch: java.lang.Throwable -> L34
        L2c:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "LockManager Error: filePath can not be null!"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L34
            throw r1     // Catch: java.lang.Throwable -> L34
        L34:
            return
    }
}
