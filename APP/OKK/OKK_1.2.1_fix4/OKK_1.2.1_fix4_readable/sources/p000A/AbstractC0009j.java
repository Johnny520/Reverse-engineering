package p000A;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p063j.C0961f;
import p063j.C0966k;
import p085v.AbstractC1106g;

/* JADX INFO: renamed from: A.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0009j {

    /* JADX INFO: renamed from: a */
    public static final C0961f f24a = new C0961f(16);

    /* JADX INFO: renamed from: b */
    public static final ThreadPoolExecutor f25b;

    /* JADX INFO: renamed from: c */
    public static final Object f26c;

    /* JADX INFO: renamed from: d */
    public static final C0966k f27d;

    static {
        ThreadFactoryC0013n threadFactoryC0013n = new ThreadFactoryC0013n();
        threadFactoryC0013n.f36a = "fonts-androidx";
        threadFactoryC0013n.f37b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), threadFactoryC0013n);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f25b = threadPoolExecutor;
        f26c = new Object();
        f27d = new C0966k();
    }

    /* JADX INFO: renamed from: a */
    public static C0008i m17a(String str, Context context, C0005f c0005f, int i2) {
        C0961f c0961f = f24a;
        Typeface typeface = (Typeface) c0961f.m2313a(str);
        if (typeface != null) {
            return new C0008i(typeface);
        }
        try {
            C0010k c0010kM15a = AbstractC0004e.m15a(context, c0005f);
            int i3 = 1;
            C0011l[] c0011lArr = (C0011l[]) c0010kM15a.f29b;
            int i4 = c0010kM15a.f28a;
            if (i4 != 0) {
                i3 = i4 != 1 ? -3 : -2;
            } else if (c0011lArr != null && c0011lArr.length != 0) {
                int length = c0011lArr.length;
                i3 = 0;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    int i6 = c0011lArr[i5].f34e;
                    if (i6 == 0) {
                        i5++;
                    } else if (i6 >= 0) {
                        i3 = i6;
                    }
                }
            }
            if (i3 != 0) {
                return new C0008i(i3);
            }
            Typeface typefaceMo2071k = AbstractC1106g.f4256a.mo2071k(context, c0011lArr, i2);
            if (typefaceMo2071k == null) {
                return new C0008i(-3);
            }
            c0961f.m2314b(str, typefaceMo2071k);
            return new C0008i(typefaceMo2071k);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0008i(-1);
        }
    }
}
