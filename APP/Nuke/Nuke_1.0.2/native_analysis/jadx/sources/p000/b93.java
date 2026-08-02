package p000;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b93 {

    /* JADX INFO: renamed from: a */
    public static final char[] f747a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b */
    public static final char[] f748b = new char[64];

    /* JADX INFO: renamed from: c */
    public static volatile Handler f749c;

    /* JADX INFO: renamed from: a */
    public static void m494a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        C0676s.m4651j("You must call this method on the main thread");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m495b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX INFO: renamed from: c */
    public static int m496c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled Bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        sb.append("[");
        sb.append(width);
        sb.append("x");
        sb.append(height);
        sb.append("] ");
        sb.append(config);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: d */
    public static int m497d(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = a93.f118a[config.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                return i != 4 ? 4 : 8;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: e */
    public static ArrayList m498e(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static Handler m499f() {
        if (f749c == null) {
            synchronized (b93.class) {
                try {
                    if (f749c == null) {
                        f749c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f749c;
    }

    /* JADX INFO: renamed from: g */
    public static int m500g(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* JADX INFO: renamed from: h */
    public static int m501h(int i, Object obj) {
        return m500g(obj == null ? 0 : obj.hashCode(), i);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m502i(int i, int i2) {
        if (i > 0 || i == Integer.MIN_VALUE) {
            return i2 > 0 || i2 == Integer.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static void m503j(String str, String str2, Bitmap bitmap, int i, int i2) {
        int i3 = i * i2;
        int iM497d = m497d(bitmap.getConfig()) * i3;
        int iM497d2 = m497d(bitmap.getConfig()) * bitmap.getWidth() * bitmap.getHeight();
        int i4 = iM497d2 - iM497d;
        int iM496c = m496c(bitmap) - iM497d2;
        int iIdentityHashCode = System.identityHashCode(bitmap);
        int height = bitmap.getHeight() * bitmap.getWidth();
        Log.d("GlideMemoryTracking", str + " [Device: " + Build.DEVICE + "]: Decoded bitmap [ID: " + iIdentityHashCode + "] " + (height > i3 ? "upscaled" : height < i3 ? "downscaled" : "no scaling") + (str2 == null ? "" : vi0.m5691j(" (Strategy: ", str2, ")")) + " from [" + i + "x" + i2 + "] (" + iM497d + " bytes) to [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] (" + iM497d2 + " bytes). True cost: " + i4 + " bytes" + (iM496c > 0 ? hk1.m2208g(iM496c, " [Pooled: +", " bytes buffer overhead]") : ""));
    }
}
