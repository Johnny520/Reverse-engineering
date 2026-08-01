package p169;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import androidx.collection.C1115;
import androidx.collection.C1130;
import com.bumptech.glide.load.engine.ThreadFactoryC3829;
import com.google.android.flexbox.C3912;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p069.AbstractC7390;
import p180.AbstractC8492;
import p267.AbstractC9004;

/* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8432 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C1130 f20964;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object f20965;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ThreadPoolExecutor f20966;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1115 f20967 = new C1115(16);

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC3829(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f20966 = threadPoolExecutor;
        f20965 = new Object();
        f20964 = new C1130(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b5, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b9, code lost:
    
        throw r8;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C8425 m13387(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceMo12631;
        C1115 c1115 = f20967;
        AbstractC9004.m14210("getFontSync");
        try {
            Typeface typeface = (Typeface) c1115.m1392(str);
            if (typeface != null) {
                return new C8425(typeface);
            }
            C3912 c3912M13386 = AbstractC8429.m13386(context, list);
            List list2 = c3912M13386.f10247;
            int i3 = c3912M13386.f10248;
            if (i3 != 0) {
                i2 = i3 != 1 ? -3 : -2;
            } else {
                C8431[] c8431Arr = (C8431[]) list2.get(0);
                if (c8431Arr == null || c8431Arr.length == 0) {
                    i2 = 1;
                } else {
                    int length = c8431Arr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            i2 = 0;
                            break;
                        }
                        int i5 = c8431Arr[i4].f20958;
                        if (i5 == 0) {
                            i4++;
                        } else if (i5 >= 0) {
                            i2 = i5;
                        }
                    }
                }
            }
            if (i2 != 0) {
                return new C8425(i2);
            }
            if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                C8431[] c8431Arr2 = (C8431[]) list2.get(0);
                AbstractC7390 abstractC7390 = AbstractC8492.f21148;
                AbstractC9004.m14210("TypefaceCompat.createFromFontInfo");
                typefaceMo12631 = AbstractC8492.f21148.mo12631(context, c8431Arr2, i);
                Trace.endSection();
            } else {
                AbstractC7390 abstractC73902 = AbstractC8492.f21148;
                AbstractC9004.m14210("TypefaceCompat.createFromFontInfoWithFallback");
                typefaceMo12631 = AbstractC8492.f21148.mo12630(context, list2, i);
                Trace.endSection();
            }
            if (typefaceMo12631 == null) {
                return new C8425(-3);
            }
            c1115.m1391(str, typefaceMo12631);
            return new C8425(typefaceMo12631);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C8425(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m13388(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((C8428) list.get(i2)).f20952);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }
}
