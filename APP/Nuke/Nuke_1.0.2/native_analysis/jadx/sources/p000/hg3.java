package p000;

import android.util.Log;
import de.robv.android.xposed.XposedBridge;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hg3 {
    /* JADX INFO: renamed from: a */
    public static void m2163a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2164b(File file) {
        try {
            if (file.exists()) {
                m2165c(file);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2165c(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                m2165c(file2);
            }
        }
        file.delete();
    }

    /* JADX INFO: renamed from: d */
    public static void m2166d(String str, String str2) {
        str.getClass();
        m2169g(6, str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m2167e(File file) {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) == 0) {
            int i = (int) length;
            byte[] bArr = new byte[i];
            m2171i(file, bArr, i);
            return bArr;
        }
        throw new IllegalArgumentException("file too large, path:" + file.getPath());
    }

    /* JADX INFO: renamed from: f */
    public static void m2168f(String str, String str2) {
        str.getClass();
        m2169g(4, str, str2);
    }

    /* JADX INFO: renamed from: g */
    public static void m2169g(int i, String str, String str2) {
        Object x92Var;
        String string = str2.toString();
        try {
            XposedBridge.log("[" + str + "]" + string);
            x92Var = a83.f116a;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        if (x92Var instanceof x92) {
            Log.println(i, str, string);
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2170h(File file) {
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
    public static void m2171i(File file, byte[] bArr, int i) {
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
                m2163a(randomAccessFile);
            }
        }
    }
}
