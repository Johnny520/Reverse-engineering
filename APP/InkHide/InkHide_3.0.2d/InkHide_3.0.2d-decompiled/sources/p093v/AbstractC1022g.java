package p093v;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p061e.C0531g;
import p075l.C0748f;
import p075l.C0753k;
import p085r.AbstractC0814f;

/* JADX INFO: renamed from: v.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1022g {

    /* JADX INFO: renamed from: a */
    public static final C0748f f3628a = new C0748f(16);

    /* JADX INFO: renamed from: b */
    public static final ThreadPoolExecutor f3629b;

    /* JADX INFO: renamed from: c */
    public static final Object f3630c;

    /* JADX INFO: renamed from: d */
    public static final C0753k f3631d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1025j());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f3629b = threadPoolExecutor;
        f3630c = new Object();
        f3631d = new C0753k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1021f m2220a(String str, Context context, C1018c c1018c, int i2) {
        C0748f c0748f = f3628a;
        Typeface typeface = (Typeface) c0748f.m1410a(str);
        if (typeface != null) {
            return new C1021f(typeface);
        }
        try {
            C0531g c0531gM2219a = AbstractC1017b.m2219a(context, c1018c);
            int i3 = 1;
            C1023h[] c1023hArr = (C1023h[]) c0531gM2219a.f1747b;
            int i4 = c0531gM2219a.f1746a;
            if (i4 != 0) {
                i3 = i4 != 1 ? -3 : -2;
            } else if (c1023hArr != null && c1023hArr.length != 0) {
                int length = c1023hArr.length;
                i3 = 0;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    int i6 = c1023hArr[i5].f3636e;
                    if (i6 == 0) {
                        i5++;
                    } else if (i6 >= 0) {
                        i3 = i6;
                    }
                }
            }
            if (i3 != 0) {
                return new C1021f(i3);
            }
            Typeface typefaceMo1002m = AbstractC0814f.f2717a.mo1002m(context, c1023hArr, i2);
            if (typefaceMo1002m == null) {
                return new C1021f(-3);
            }
            c0748f.m1411b(str, typefaceMo1002m);
            return new C1021f(typefaceMo1002m);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C1021f(-1);
        }
    }
}
