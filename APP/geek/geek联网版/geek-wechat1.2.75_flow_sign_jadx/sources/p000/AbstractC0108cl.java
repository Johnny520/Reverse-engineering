package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: cl */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0108cl {

    /* JADX INFO: renamed from: a */
    public static final C0309hs f900a = new C0309hs(16);

    /* JADX INFO: renamed from: b */
    public static final ThreadPoolExecutor f901b;

    /* JADX INFO: renamed from: c */
    public static final Object f902c;

    /* JADX INFO: renamed from: d */
    public static final b40 f903d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new y00());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f901b = threadPoolExecutor;
        f902c = new Object();
        f903d = new b40();
    }

    /* JADX INFO: renamed from: a */
    public static C0072bl m650a(String str, Context context, C0914y1 c0914y1, int i) {
        C0309hs c0309hs = f900a;
        Typeface typeface = (Typeface) c0309hs.m1412a(str);
        if (typeface != null) {
            return new C0072bl(typeface);
        }
        try {
            C0209f2 c0209f2M1200o = g80.m1200o(context, c0914y1);
            C0338il[] c0338ilArr = (C0338il[]) c0209f2M1200o.f1722b;
            int i2 = c0209f2M1200o.f1721a;
            int i3 = 1;
            if (i2 != 0) {
                i3 = i2 != 1 ? -3 : -2;
            } else if (c0338ilArr != null && c0338ilArr.length != 0) {
                int length = c0338ilArr.length;
                i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    int i5 = c0338ilArr[i4].f2552e;
                    if (i5 == 0) {
                        i4++;
                    } else if (i5 >= 0) {
                        i3 = i5;
                    }
                }
            }
            if (i3 != 0) {
                return new C0072bl(i3);
            }
            Typeface typefaceMo1487h = h80.f2140a.mo1487h(context, c0338ilArr, i);
            if (typefaceMo1487h == null) {
                return new C0072bl(-3);
            }
            c0309hs.m1413b(str, typefaceMo1487h);
            return new C0072bl(typefaceMo1487h);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0072bl(-1);
        }
    }
}
