package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: al */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0022al {

    /* JADX INFO: renamed from: a */
    public static final C0161ds f147a = new C0161ds(16);

    /* JADX INFO: renamed from: b */
    public static final ThreadPoolExecutor f148b;

    /* JADX INFO: renamed from: c */
    public static final Object f149c;

    /* JADX INFO: renamed from: d */
    public static final u30 f150d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new r00());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f148b = threadPoolExecutor;
        f149c = new Object();
        f150d = new u30();
    }

    /* JADX INFO: renamed from: a */
    public static C0970zk m112a(String str, Context context, C0914y1 c0914y1, int i) {
        C0161ds c0161ds = f147a;
        Typeface typeface = (Typeface) c0161ds.m957a(str);
        if (typeface != null) {
            return new C0970zk(typeface);
        }
        try {
            C0209f2 c0209f2M48m = a80.m48m(context, c0914y1);
            C0265gl[] c0265glArr = (C0265gl[]) c0209f2M48m.f1872b;
            int i2 = c0209f2M48m.f1871a;
            int i3 = 1;
            if (i2 != 0) {
                i3 = i2 != 1 ? -3 : -2;
            } else if (c0265glArr != null && c0265glArr.length != 0) {
                int length = c0265glArr.length;
                i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    int i5 = c0265glArr[i4].f2140e;
                    if (i5 == 0) {
                        i4++;
                    } else if (i5 >= 0) {
                        i3 = i5;
                    }
                }
            }
            if (i3 != 0) {
                return new C0970zk(i3);
            }
            Typeface typefaceMo644h = b80.f779a.mo644h(context, c0265glArr, i);
            if (typefaceMo644h == null) {
                return new C0970zk(-3);
            }
            c0161ds.m958b(str, typefaceMo644h);
            return new C0970zk(typefaceMo644h);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0970zk(-1);
        }
    }
}
