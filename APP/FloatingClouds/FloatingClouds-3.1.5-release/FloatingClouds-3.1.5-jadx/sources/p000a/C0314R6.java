package p000a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: a.R6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0314R6 {

    /* JADX INFO: renamed from: a */
    public static final C0407W9<String, Typeface> f1123a = new C0407W9<>(16);

    /* JADX INFO: renamed from: b */
    public static final ThreadPoolExecutor f1124b;

    /* JADX INFO: renamed from: c */
    public static final Object f1125c;

    /* JADX INFO: renamed from: d */
    public static final C0598ge<String, ArrayList<InterfaceC0294Q3<a>>> f1126d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0464Zc());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f1124b = threadPoolExecutor;
        f1125c = new Object();
        f1126d = new C0598ge<>();
    }

    /* JADX INFO: renamed from: a */
    public static a m857a(String str, Context context, C0225M6 c0225m6, int i) {
        C0407W9<String, Typeface> c0407w9 = f1123a;
        Typeface typefaceM1052a = c0407w9.m1052a(str);
        if (typefaceM1052a != null) {
            return new a(typefaceM1052a);
        }
        try {
            C0051Cc c0051CcM582a = C0207L6.m582a(context, c0225m6);
            int i2 = 1;
            C0350T6[] c0350t6Arr = (C0350T6[]) c0051CcM582a.f182b;
            int i3 = c0051CcM582a.f183c;
            if (i3 != 0) {
                i2 = i3 != 1 ? -3 : -2;
            } else if (c0350t6Arr != null && c0350t6Arr.length != 0) {
                int length = c0350t6Arr.length;
                i2 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    int i5 = c0350t6Arr[i4].f1248e;
                    if (i5 == 0) {
                        i4++;
                    } else if (i5 >= 0) {
                        i2 = i5;
                    }
                }
            }
            if (i2 != 0) {
                return new a(i2);
            }
            Typeface typefaceMo753b = C0234Mf.f777a.mo753b(context, c0350t6Arr, i);
            if (typefaceMo753b == null) {
                return new a(-3);
            }
            c0407w9.m1053b(str, typefaceMo753b);
            return new a(typefaceMo753b);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        }
    }

    /* JADX INFO: renamed from: a.R6$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Typeface f1127a;

        /* JADX INFO: renamed from: b */
        public final int f1128b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(int i) {
            this.f1127a = null;
            this.f1128b = i;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f1127a = typeface;
            this.f1128b = 0;
        }
    }
}
