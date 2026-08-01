package p183m6;

import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import okhttp3.internal.http2.Http2;
import p376zd.C9993h;

/* JADX INFO: renamed from: m6.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5056z {
    /* JADX INFO: renamed from: a */
    public static int m20460a(int[] iArr, int i10) {
        int length = iArr.length - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) >>> 1;
            int i13 = iArr[i12];
            if (i13 < i10) {
                i11 = i12 + 1;
            } else {
                if (i13 <= i10) {
                    return i12;
                }
                length = i12 - 1;
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: b */
    public static void m20461b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m20462c(File file) {
        try {
            if (file.exists()) {
                m20463d(file);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m20463d(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                m20463d(file2);
            }
        }
        file.delete();
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m20464e(File file) {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) != 0) {
            C9993h.m38666a("file too large, path:", file.getPath());
            return null;
        }
        int i10 = (int) length;
        byte[] bArr = new byte[i10];
        m20470k(file, bArr, i10);
        return bArr;
    }

    /* JADX INFO: renamed from: f */
    public static int m20465f() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Method declaredMethod = cls.getDeclaredMethod("pageSize", null);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(declaredField.get(null), null)).intValue();
        } catch (Throwable unused) {
            return Http2.INITIAL_MAX_FRAME_SIZE;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m20466g(Exception exc) {
        Executor executor = AbstractC5047q.f15358a;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m20467h(File file) {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return (parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile();
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static void m20468i(File file, String str) {
        File[] fileArrListFiles;
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            try {
                m20469j(file2, new File(str, file2.getName()));
            } catch (Exception e10) {
                m20466g(e10);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m20469j(File file, File file2) {
        if (!file.exists() || file2.exists() || file.renameTo(file2)) {
            return;
        }
        m20472m(file2, m20464e(file));
        m20462c(file);
    }

    /* JADX INFO: renamed from: k */
    public static void m20470k(File file, byte[] bArr, int i10) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i11 = 0;
        while (i11 < i10) {
            try {
                int i12 = randomAccessFile.read(bArr, i11, i10 - i11);
                if (i12 < 0) {
                    break;
                } else {
                    i11 += i12;
                }
            } finally {
                m20461b(randomAccessFile);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m20471l(File file, File file2) {
        if (file.renameTo(file2)) {
            return true;
        }
        return (!file2.exists() || file2.delete()) && file.renameTo(file2);
    }

    /* JADX INFO: renamed from: m */
    public static void m20472m(File file, byte[] bArr) {
        try {
            int length = bArr.length;
            File file2 = new File(file.getParent(), file.getName() + ".tmp");
            if (!m20467h(file2)) {
                m20466g(new Exception("create file failed"));
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            try {
                randomAccessFile.setLength(length);
                randomAccessFile.write(bArr, 0, length);
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
                m20471l(file2, file);
            } finally {
            }
        } catch (Exception e10) {
            m20466g(new Exception("save bytes failed", e10));
        }
    }
}
