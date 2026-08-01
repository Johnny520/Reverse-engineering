package io.fastkv;

import android.annotation.SuppressLint;
import io.fastkv.interfaces.FastLogger;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
class Utils {
    private static final int DEFAULT_PAGE_SIZE = 16384;
    static final int NAME_SIZE = 32;

    public static class Holder {
        static final char[] digits = null;
        static final SecureRandom random = null;

        static {
            random = new SecureRandom();
            digits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        }

        private Holder() {
        }
    }

    public Utils() {
    }

    public static int binarySearch(int[] r4, int r5) {
        int r0 = r4.length - 1;
        int r1 = 0;
    L3:
        if (r1 > r0) goto L10;
        int r2 = (r1 + r0) >>> 1;
        int r3 = r4[r2];
        if (r3 < r5) goto L6;
        if (r3 <= r5) goto L9;
        r0 = r2 - 1;
        goto L3
    L9:
        return r2;
    L6:
        r1 = r2 + 1;
        goto L3
    L10:
        return r0;
    }

    public static void closeQuietly(Closeable r0) {
        if (r0 == null) goto L8;
        r0.close();     // Catch: Throwable -> L5
        return;
    L9:
        return;
    }

    public static void deleteFile(File r1) {
        if (r1.exists() == false) goto L9;
        deleteRecursive(r1);     // Catch: Throwable -> L6
        return;
    L9:
        return;
    }

    private static void deleteRecursive(File r4) {
        if (r4.isDirectory() == false) goto L9;
        File[] r0 = r4.listFiles();
        if (r0 == null) goto L9;
        int r1 = r0.length;
        int r2 = 0;
    L7:
        if (r2 >= r1) goto L9;
        deleteRecursive(r0[r2]);
        r2 = r2 + 1;
    L9:
        r4.delete();
    }

    public static byte[] getBytes(File r6) {
        if (r6.isFile() == true) goto L6;
        return null;
    L6:
        long r0 = r6.length();
        if ((r0 >> 32) != 0) goto L11;
        int r02 = (int) r0;
        byte[] r1 = new byte[r02];
        readBytes(r6, r1, r02);
        return r1;
    L11:
        throw new IllegalArgumentException("file too large, path:" + r6.getPath());
    }

    @SuppressLint({"DiscouragedPrivateApi"})
    public static int getPageSize() {
        Class<?> r0 = Class.forName("sun.misc.Unsafe");     // Catch: Throwable -> L4
        Field r1 = r0.getDeclaredField("theUnsafe");     // Catch: Throwable -> L4
        r1.setAccessible(true);     // Catch: Throwable -> L4
        Method r02 = r0.getDeclaredMethod("pageSize", null);     // Catch: Throwable -> L4
        r02.setAccessible(true);     // Catch: Throwable -> L4
        return ((Integer) r02.invoke(r1.get(null), null)).intValue();
    L4:
        return DEFAULT_PAGE_SIZE;
    }

    public static void logError(Exception r2) {
        FastLogger r0 = FastKVConfig.sLogger;
        if (r0 == null) goto L6;
        r0.e("FastKV", r2);
        return;
    }

    public static boolean makeFileIfNotExist(File r3) {
        if (r3.isFile() == false) goto L5;
        return true;
    L5:
        File r0 = r3.getParentFile();
        if (r0 != null) goto L8;
        return false;
    L8:
        if (r0.isDirectory() == true) goto L12;
        if (r0.mkdirs() == true) goto L12;
        return false;
    L12:
        if (r3.createNewFile() == false) goto L17;
        return true;
    L17:
        return false;
    }

    public static void moveDirFiles(File r5, String r6) {
        if (r5.isDirectory() == false) goto L14;
        File[] r52 = r5.listFiles();
        if (r52 == null) goto L20;
        int r0 = r52.length;
        int r1 = 0;
    L7:
        if (r1 >= r0) goto L21;
        File r2 = r52[r1];
        moveFile(r2, new File(r6, r2.getName()));     // Catch: Exception -> L11
    L13:
        r1 = r1 + 1;
    L11:
        e = move-exception;
        logError(e);
        goto L13
    L21:
        return;
    L20:
        return;
    }

    private static void moveFile(File r1, File r2) {
        if (r1.exists() == true) goto L5;
        return;
    L5:
        if (r2.exists() == false) goto L8;
        return;
    L8:
        if (r1.renameTo(r2) == true) goto L12;
        saveBytes(r2, getBytes(r1));
        return;
    }

    public static String randomName() {
        byte[] r1 = new byte[16];
        Holder.random.nextBytes(r1);
        char[] r2 = new char[NAME_SIZE];
        int r3 = 0;
    L3:
        if (r3 >= 16) goto L6;
        byte r4 = r1[r3];
        int r5 = r3 << 1;
        char[] r6 = Holder.digits;
        r2[r5] = r6[(r4 >> 4) & 15];
        r2[r5 + 1] = r6[r4 & 15];
        r3 = r3 + 1;
        goto L3
    L6:
        return new String(r2);
    }

    public static void readBytes(File r2, byte[] r3, int r4) {
        RandomAccessFile r0 = new RandomAccessFile(r2, "rw");
        int r22 = 0;
    L3:
        if (r22 >= r4) goto L12;
        int r1 = r0.read(r3, r22, r4 - r22);     // Catch: Throwable -> L9
        if (r1 < 0) goto L12;
        r22 = r22 + r1;
    L9:
        th = move-exception;
        closeQuietly(r0);
        throw th;
    L12:
        closeQuietly(r0);
    }

    public static boolean renameFile(File r2, File r3) {
        if (r2.renameTo(r3) == false) goto L6;
        return true;
    L6:
        if (r3.exists() == false) goto L10;
        if (r3.delete() == true) goto L10;
        return false;
    L10:
        if (r2.renameTo(r3) == false) goto L14;
        return true;
    L14:
        return false;
    }

    public static boolean saveBytes(File r1, byte[] r2) {
        return saveBytes(r1, r2, r2.length);
    }

    public static boolean saveBytes(File r5, byte[] r6, int r7) {
        File r1 = new File(r5.getParent(), r5.getName() + ".tmp");     // Catch: Exception -> L7
        if (makeFileIfNotExist(r1) == true) goto L9;
        logError(new Exception("create file failed"));     // Catch: Exception -> L7
        return false;
    L9:
        RandomAccessFile r2 = new RandomAccessFile(r1, "rw");     // Catch: Exception -> L7
        r2.setLength(r7);     // Catch: Throwable -> L14
        r2.write(r6, 0, r7);     // Catch: Throwable -> L14
        r2.getFD().sync();     // Catch: Throwable -> L14
        r2.close();     // Catch: Exception -> L7
        return renameFile(r1, r5);
    L14:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L17
    L19:
        throw th;     // Catch: Exception -> L7
    L17:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Exception -> L7
    L7:
        e = move-exception;
        logError(new Exception("save bytes failed", e));
        return false;
    }
}
