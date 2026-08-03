package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Th */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0840Th {

    /* JADX INFO: renamed from: a */
    public static final C0161Dp f2669a = new C0161Dp(16);

    /* JADX INFO: renamed from: b */
    public static final ThreadPoolExecutor f2670b;

    /* JADX INFO: renamed from: c */
    public static final Object f2671c;

    /* JADX INFO: renamed from: d */
    public static final C2520sy f2672d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0474L0(2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f2670b = threadPoolExecutor;
        f2671c = new Object();
        f2672d = new C2520sy(0);
    }

    /* JADX INFO: renamed from: a */
    public static String m1661a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((C0583Nh) list.get(i2)).f1889g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b7, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bb, code lost:
    
        throw r8;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0797Sh m1662b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceMo1763r;
        C0161Dp c0161Dp = f2669a;
        AbstractC0628Oj.m1239c("getFontSync");
        try {
            Typeface typeface = (Typeface) c0161Dp.m307f(str);
            if (typeface != null) {
                return new C0797Sh(typeface);
            }
            C0307H5 c0307h5M1036a = AbstractC0540Mh.m1036a(context, list);
            List list2 = (List) c0307h5M1036a.f1021b;
            int i3 = c0307h5M1036a.f1020a;
            if (i3 != 0) {
                i2 = i3 != 1 ? -3 : -2;
            } else {
                C1098Zh[] c1098ZhArr = (C1098Zh[]) list2.get(0);
                if (c1098ZhArr == null || c1098ZhArr.length == 0) {
                    i2 = 1;
                } else {
                    int length = c1098ZhArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            i2 = 0;
                            break;
                        }
                        int i5 = c1098ZhArr[i4].f3490f;
                        if (i5 == 0) {
                            i4++;
                        } else if (i5 >= 0) {
                            i2 = i5;
                        }
                    }
                }
            }
            if (i2 != 0) {
                return new C0797Sh(i2);
            }
            if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                C1098Zh[] c1098ZhArr2 = (C1098Zh[]) list2.get(0);
                AbstractC1293cr abstractC1293cr = AbstractC0871UB.f2754a;
                AbstractC0628Oj.m1239c("TypefaceCompat.createFromFontInfo");
                typefaceMo1763r = AbstractC0871UB.f2754a.mo1763r(context, c1098ZhArr2, i);
                Trace.endSection();
            } else {
                AbstractC1293cr abstractC1293cr2 = AbstractC0871UB.f2754a;
                AbstractC0628Oj.m1239c("TypefaceCompat.createFromFontInfoWithFallback");
                typefaceMo1763r = AbstractC0871UB.f2754a.mo1831s(context, list2, i);
                Trace.endSection();
            }
            if (typefaceMo1763r == null) {
                return new C0797Sh(-3);
            }
            c0161Dp.m311j(str, typefaceMo1763r);
            return new C0797Sh(typefaceMo1763r);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0797Sh(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
    }
}
