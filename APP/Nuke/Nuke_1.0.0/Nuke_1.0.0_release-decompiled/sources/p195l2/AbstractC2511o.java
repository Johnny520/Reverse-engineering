package p195l2;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l2.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2511o {

    /* JADX INFO: renamed from: a */
    public static final char[] f8029a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b */
    public static final char[] f8030b = new char[64];

    /* JADX INFO: renamed from: c */
    public static volatile Handler f8031c;

    /* JADX INFO: renamed from: a */
    public static void m4452a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4453b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX INFO: renamed from: c */
    public static int m4454c(Bitmap bitmap) {
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
    public static int m4455d(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i5 = AbstractC2510n.f8028a[config.ordinal()];
        int i6 = 1;
        if (i5 != 1) {
            i6 = 2;
            if (i5 != 2 && i5 != 3) {
                return i5 != 4 ? 4 : 8;
            }
        }
        return i6;
    }

    /* JADX INFO: renamed from: e */
    public static ArrayList m4456e(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static Handler m4457f() {
        if (f8031c == null) {
            synchronized (AbstractC2511o.class) {
                try {
                    if (f8031c == null) {
                        f8031c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f8031c;
    }

    /* JADX INFO: renamed from: g */
    public static int m4458g(int i5, int i6) {
        return (i6 * 31) + i5;
    }

    /* JADX INFO: renamed from: h */
    public static int m4459h(int i5, Object obj) {
        return m4458g(obj == null ? 0 : obj.hashCode(), i5);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m4460i(int i5, int i6) {
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            return i6 > 0 || i6 == Integer.MIN_VALUE;
        }
        return false;
    }
}
