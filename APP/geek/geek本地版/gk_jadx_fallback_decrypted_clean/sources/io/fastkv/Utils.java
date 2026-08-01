package io.fastkv;

/* JADX INFO: loaded from: classes.dex */
class Utils {
    private static final int DEFAULT_PAGE_SIZE = 16384;
    static final int NAME_SIZE = 32;

    public static class Holder {
        static final char[] digits = null;
        static final java.security.SecureRandom random = null;

        static {
                java.security.SecureRandom r0 = new java.security.SecureRandom
                r0.<init>()
                io.fastkv.Utils.Holder.random = r0
                r0 = 16
                char[] r0 = new char[r0]
                r0 = {x0012: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
                io.fastkv.Utils.Holder.digits = r0
                return
        }

        private Holder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public Utils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int binarySearch(int[] r4, int r5) {
            int r0 = r4.length
            int r0 = r0 + (-1)
            r1 = 0
        L4:
            if (r1 > r0) goto L19
            int r2 = r1 + r0
            int r2 = r2 >>> 1
            r3 = r4[r2]
            if (r3 >= r5) goto L12
            int r2 = r2 + 1
            r1 = r2
            goto L4
        L12:
            if (r3 <= r5) goto L18
            int r2 = r2 + (-1)
            r0 = r2
            goto L4
        L18:
            return r2
        L19:
            return r0
    }

    public static void closeQuietly(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public static void deleteFile(java.io.File r1) {
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L9
            deleteRecursive(r1)     // Catch: java.lang.Throwable -> L9
        L9:
            return
    }

    private static void deleteRecursive(java.io.File r4) {
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L18
            java.io.File[] r0 = r4.listFiles()
            if (r0 == 0) goto L18
            int r1 = r0.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            deleteRecursive(r3)
            int r2 = r2 + 1
            goto Le
        L18:
            r4.delete()
            return
    }

    public static byte[] getBytes(java.io.File r6) {
            boolean r0 = r6.isFile()
            if (r0 != 0) goto L8
            r6 = 0
            return r6
        L8:
            long r0 = r6.length()
            r2 = 32
            long r2 = r0 >> r2
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L1d
            int r0 = (int) r0
            byte[] r1 = new byte[r0]
            readBytes(r6, r1, r0)
            return r1
        L1d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "file too large, path:"
            r1.<init>(r2)
            java.lang.String r6 = r6.getPath()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }

    @android.annotation.SuppressLint({"DiscouragedPrivateApi"})
    public static int getPageSize() {
            java.lang.String r0 = "sun.misc.Unsafe"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "theUnsafe"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L29
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "pageSize"
            r4 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L29
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r0 = r0.invoke(r1, r4)     // Catch: java.lang.Throwable -> L29
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L29
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L29
            return r0
        L29:
            r0 = 16384(0x4000, float:2.2959E-41)
            return r0
    }

    public static void logError(java.lang.Exception r2) {
            io.fastkv.interfaces.FastLogger r0 = io.fastkv.FastKVConfig.sLogger
            if (r0 == 0) goto L9
            java.lang.String r1 = "FastKV"
            r0.e(r1, r2)
        L9:
            return
    }

    public static boolean makeFileIfNotExist(java.io.File r3) {
            boolean r0 = r3.isFile()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            java.io.File r0 = r3.getParentFile()
            if (r0 == 0) goto L21
            boolean r2 = r0.isDirectory()
            if (r2 != 0) goto L1a
            boolean r0 = r0.mkdirs()
            if (r0 == 0) goto L21
        L1a:
            boolean r3 = r3.createNewFile()
            if (r3 == 0) goto L21
            return r1
        L21:
            r3 = 0
            return r3
    }

    public static void moveDirFiles(java.io.File r5, java.lang.String r6) {
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L26
            java.io.File[] r5 = r5.listFiles()
            if (r5 == 0) goto L26
            int r0 = r5.length
            r1 = 0
        Le:
            if (r1 >= r0) goto L26
            r2 = r5[r1]
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L1f
            java.lang.String r4 = r2.getName()     // Catch: java.lang.Exception -> L1f
            r3.<init>(r6, r4)     // Catch: java.lang.Exception -> L1f
            moveFile(r2, r3)     // Catch: java.lang.Exception -> L1f
            goto L23
        L1f:
            r2 = move-exception
            logError(r2)
        L23:
            int r1 = r1 + 1
            goto Le
        L26:
            return
    }

    private static void moveFile(java.io.File r1, java.io.File r2) {
            boolean r0 = r1.exists()
            if (r0 == 0) goto L1a
            boolean r0 = r2.exists()
            if (r0 == 0) goto Ld
            goto L1a
        Ld:
            boolean r0 = r1.renameTo(r2)
            if (r0 != 0) goto L1a
            byte[] r1 = getBytes(r1)
            saveBytes(r2, r1)
        L1a:
            return
    }

    public static java.lang.String randomName() {
            r0 = 16
            byte[] r1 = new byte[r0]
            java.security.SecureRandom r2 = io.fastkv.Utils.Holder.random
            r2.nextBytes(r1)
            r2 = 32
            char[] r2 = new char[r2]
            r3 = 0
        Le:
            if (r3 >= r0) goto L29
            r4 = r1[r3]
            int r5 = r3 << 1
            char[] r6 = io.fastkv.Utils.Holder.digits
            int r7 = r4 >> 4
            r7 = r7 & 15
            char r7 = r6[r7]
            r2[r5] = r7
            int r5 = r5 + 1
            r4 = r4 & 15
            char r4 = r6[r4]
            r2[r5] = r4
            int r3 = r3 + 1
            goto Le
        L29:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
    }

    public static void readBytes(java.io.File r2, byte[] r3, int r4) {
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r2, r1)
            r2 = 0
        L8:
            if (r2 >= r4) goto L1a
            int r1 = r4 - r2
            int r1 = r0.read(r3, r2, r1)     // Catch: java.lang.Throwable -> L15
            if (r1 >= 0) goto L13
            goto L1a
        L13:
            int r2 = r2 + r1
            goto L8
        L15:
            r2 = move-exception
            closeQuietly(r0)
            throw r2
        L1a:
            closeQuietly(r0)
            return
    }

    public static boolean renameFile(java.io.File r2, java.io.File r3) {
            boolean r0 = r2.renameTo(r3)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r3.exists()
            if (r0 == 0) goto L14
            boolean r0 = r3.delete()
            if (r0 == 0) goto L1b
        L14:
            boolean r2 = r2.renameTo(r3)
            if (r2 == 0) goto L1b
            return r1
        L1b:
            r2 = 0
            return r2
    }

    public static boolean saveBytes(java.io.File r1, byte[] r2) {
            int r0 = r2.length
            boolean r1 = saveBytes(r1, r2, r0)
            return r1
    }

    public static boolean saveBytes(java.io.File r5, byte[] r6, int r7) {
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = r5.getParent()     // Catch: java.lang.Exception -> L30
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30
            r3.<init>()     // Catch: java.lang.Exception -> L30
            java.lang.String r4 = r5.getName()     // Catch: java.lang.Exception -> L30
            r3.append(r4)     // Catch: java.lang.Exception -> L30
            java.lang.String r4 = ".tmp"
            r3.append(r4)     // Catch: java.lang.Exception -> L30
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L30
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L30
            boolean r2 = makeFileIfNotExist(r1)     // Catch: java.lang.Exception -> L30
            if (r2 != 0) goto L32
            java.lang.Exception r5 = new java.lang.Exception     // Catch: java.lang.Exception -> L30
            java.lang.String r6 = "create file failed"
            r5.<init>(r6)     // Catch: java.lang.Exception -> L30
            logError(r5)     // Catch: java.lang.Exception -> L30
            return r0
        L30:
            r5 = move-exception
            goto L59
        L32:
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L30
            java.lang.String r3 = "rw"
            r2.<init>(r1, r3)     // Catch: java.lang.Exception -> L30
            long r3 = (long) r7
            r2.setLength(r3)     // Catch: java.lang.Throwable -> L4f
            r2.write(r6, r0, r7)     // Catch: java.lang.Throwable -> L4f
            java.io.FileDescriptor r6 = r2.getFD()     // Catch: java.lang.Throwable -> L4f
            r6.sync()     // Catch: java.lang.Throwable -> L4f
            r2.close()     // Catch: java.lang.Exception -> L30
            boolean r5 = renameFile(r1, r5)     // Catch: java.lang.Exception -> L30
            return r5
        L4f:
            r5 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L54
            goto L58
        L54:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.lang.Exception -> L30
        L58:
            throw r5     // Catch: java.lang.Exception -> L30
        L59:
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.String r7 = "save bytes failed"
            r6.<init>(r7, r5)
            logError(r6)
            return r0
    }
}
