package p001;

import android.graphics.Bitmap;
import android.os.Process;
import android.os.StatFs;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: ۟.ic */
/* JADX INFO: loaded from: classes.dex */
public final class C0259ic {

    /* JADX INFO: renamed from: ۥ */
    public static final StringBuilder f866 = new StringBuilder();

    /* JADX INFO: renamed from: ۟.ic$a */
    public static class a extends Thread {
        public a(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* JADX INFO: renamed from: ۟.ic$b */
    public static class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new a(runnable);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static long m872(File file) {
        long blockCount;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            blockCount = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            blockCount = 5242880;
        }
        return Math.max(Math.min(blockCount, 52428800L), 5242880L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ */
    public static int m873(Bitmap bitmap) {
        int byteCount = bitmap.getByteCount();
        if (byteCount >= 0) {
            return byteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String m1095(RunnableC0163c0 runnableC0163c0) {
        return m1096(runnableC0163c0, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static String m1096(RunnableC0163c0 runnableC0163c0, String str) {
        StringBuilder sb = new StringBuilder(str);
        AbstractC0204f abstractC0204f = runnableC0163c0.f1353;
        if (abstractC0204f != null) {
            sb.append(abstractC0204f.f774.m958());
        }
        ArrayList arrayList = runnableC0163c0.f1354;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || abstractC0204f != null) {
                    sb.append(", ");
                }
                sb.append(((AbstractC0204f) arrayList.get(i)).f774.m958());
            }
        }
        return sb.toString();
    }
}
