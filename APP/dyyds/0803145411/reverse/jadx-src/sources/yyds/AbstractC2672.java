package yyds;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: yyds.ᲈᛵᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2672 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C1281 f13114 = new C1281(16);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final ThreadPoolExecutor f13115;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final Object f13116;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C0988 f13117;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0710(2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f13115 = threadPoolExecutor;
        f13116 = new Object();
        f13117 = new C0988(0);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static String m4763(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((C1396) list.get(i2)).f6508);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a0, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a4, code lost:
    
        throw r8;
     */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2246 m4764(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceM2238;
        C1281 c1281 = f13114;
        AbstractC0879.m1969("getFontSync");
        try {
            Typeface typeface = (Typeface) c1281.m2548(str);
            if (typeface != null) {
                return new C2246(typeface);
            }
            C1760 c1760M3167 = AbstractC1539.m3167(context, list);
            List list2 = (List) c1760M3167.f8839;
            int i3 = c1760M3167.f8838;
            if (i3 != 0) {
                i2 = i3 != 1 ? -3 : -2;
            } else {
                C2685[] c2685Arr = (C2685[]) list2.get(0);
                if (c2685Arr == null || c2685Arr.length == 0) {
                    i2 = 1;
                } else {
                    int length = c2685Arr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            i2 = 0;
                            break;
                        }
                        int i5 = c2685Arr[i4].f13152;
                        if (i5 == 0) {
                            i4++;
                        } else if (i5 >= 0) {
                            i2 = i5;
                        }
                    }
                }
            }
            if (i2 != 0) {
                return new C2246(i2);
            }
            if (list2.size() > 1) {
                C1985 c1985 = AbstractC1046.f4750;
                AbstractC0879.m1969("TypefaceCompat.createFromFontInfoWithFallback");
                typefaceM2238 = AbstractC1046.f4750.m3847(context, list2, i);
                Trace.endSection();
            } else {
                typefaceM2238 = AbstractC1046.m2238(context, (C2685[]) list2.get(0), i);
            }
            if (typefaceM2238 == null) {
                return new C2246(-3);
            }
            c1281.m2556(str, typefaceM2238);
            return new C2246(typefaceM2238);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C2246(-1);
        } finally {
        }
    }
}
