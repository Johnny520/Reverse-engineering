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
        static final SecureRandom random = new SecureRandom();
        static final char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        private Holder() {
        }
    }

    public static int binarySearch(int[] iArr, int i) {
        int length = iArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = iArr[i3];
            if (i4 < i) {
                i2 = i3 + 1;
            } else {
                if (i4 <= i) {
                    return i3;
                }
                length = i3 - 1;
            }
        }
        return length;
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void deleteFile(File file) {
        try {
            if (file.exists()) {
                deleteRecursive(file);
            }
        } catch (Throwable unused) {
        }
    }

    private static void deleteRecursive(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                deleteRecursive(file2);
            }
        }
        file.delete();
    }

    public static byte[] getBytes(File file) {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) != 0) {
            throw new IllegalArgumentException("file too large, path:" + file.getPath());
        }
        int i = (int) length;
        byte[] bArr = new byte[i];
        readBytes(file, bArr, i);
        return bArr;
    }

    @SuppressLint({"DiscouragedPrivateApi"})
    public static int getPageSize() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Method declaredMethod = cls.getDeclaredMethod("pageSize", null);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(declaredField.get(null), null)).intValue();
        } catch (Throwable unused) {
            return DEFAULT_PAGE_SIZE;
        }
    }

    public static void logError(Exception exc) {
        FastLogger fastLogger = FastKVConfig.sLogger;
        if (fastLogger != null) {
            fastLogger.mo1509e("FastKV", exc);
        }
    }

    public static boolean makeFileIfNotExist(File file) {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return (parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile();
        }
        return false;
    }

    public static void moveDirFiles(File file, String str) {
        File[] fileArrListFiles;
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            try {
                moveFile(file2, new File(str, file2.getName()));
            } catch (Exception e) {
                logError(e);
            }
        }
    }

    private static void moveFile(File file, File file2) {
        if (!file.exists() || file2.exists() || file.renameTo(file2)) {
            return;
        }
        saveBytes(file2, getBytes(file));
    }

    public static String randomName() {
        byte[] bArr = new byte[16];
        Holder.random.nextBytes(bArr);
        char[] cArr = new char[NAME_SIZE];
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = i << 1;
            char[] cArr2 = Holder.digits;
            cArr[i2] = cArr2[(b >> 4) & 15];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static void readBytes(File file, byte[] bArr, int i) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i2 = 0;
        while (i2 < i) {
            try {
                int i3 = randomAccessFile.read(bArr, i2, i - i2);
                if (i3 < 0) {
                    break;
                } else {
                    i2 += i3;
                }
            } finally {
                closeQuietly(randomAccessFile);
            }
        }
    }

    public static boolean renameFile(File file, File file2) {
        if (file.renameTo(file2)) {
            return true;
        }
        return (!file2.exists() || file2.delete()) && file.renameTo(file2);
    }

    public static boolean saveBytes(File file, byte[] bArr) {
        return saveBytes(file, bArr, bArr.length);
    }

    public static boolean saveBytes(File file, byte[] bArr, int i) {
        try {
            File file2 = new File(file.getParent(), file.getName() + ".tmp");
            if (!makeFileIfNotExist(file2)) {
                logError(new Exception("create file failed"));
                return false;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            try {
                randomAccessFile.setLength(i);
                randomAccessFile.write(bArr, 0, i);
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
                return renameFile(file2, file);
            } finally {
            }
        } catch (Exception e) {
            logError(new Exception("save bytes failed", e));
            return false;
        }
    }
}
