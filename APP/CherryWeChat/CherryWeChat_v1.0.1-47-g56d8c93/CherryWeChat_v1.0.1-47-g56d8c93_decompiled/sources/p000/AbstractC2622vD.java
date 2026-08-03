package p000;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: vD */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2622vD {

    /* JADX INFO: renamed from: a */
    public static final char[] f9104a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b */
    public static final char[] f9105b = new char[64];

    /* JADX INFO: renamed from: c */
    public static volatile Handler f9106c;

    /* JADX INFO: renamed from: a */
    public static void m5130a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5131b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX INFO: renamed from: c */
    public static int m5132c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* JADX INFO: renamed from: d */
    public static int m5133d(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = AbstractC2579uD.f8937a[config.ordinal()];
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
    public static ArrayList m5134e(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static Handler m5135f() {
        if (f9106c == null) {
            synchronized (AbstractC2622vD.class) {
                try {
                    if (f9106c == null) {
                        f9106c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f9106c;
    }

    /* JADX INFO: renamed from: g */
    public static int m5136g(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* JADX INFO: renamed from: h */
    public static int m5137h(int i, Object obj) {
        return m5136g(obj == null ? 0 : obj.hashCode(), i);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m5138i(int i, int i2) {
        if (i > 0 || i == Integer.MIN_VALUE) {
            return i2 > 0 || i2 == Integer.MIN_VALUE;
        }
        return false;
    }
}
