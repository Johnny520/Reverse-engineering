package p000a;

import android.content.Context;
import java.util.Arrays;

/* JADX INFO: renamed from: a.B1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0021B1 {

    /* JADX INFO: renamed from: a */
    public static int f64a = -1;

    /* JADX INFO: renamed from: b */
    public static String f65b = "";

    /* JADX INFO: renamed from: a.B1$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static String m54a() {
            return m56c() + "(" + m55b() + ")";
        }

        /* JADX INFO: renamed from: b */
        public static int m55b() {
            int i = -1;
            if (C0021B1.f64a == -1) {
                try {
                    Context context = C0889w1.f3488p;
                    C0631i9.m1479b(context);
                    i = context.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode;
                } catch (Exception e) {
                    C0908x1.m2193a(Arrays.copyOf(new Object[]{e}, 1));
                }
                C0021B1.f64a = i;
            }
            return C0021B1.f64a;
        }

        /* JADX INFO: renamed from: c */
        public static String m56c() {
            String str = "";
            if (C0034Be.m101P(C0021B1.f65b)) {
                try {
                    Context context = C0889w1.f3488p;
                    C0631i9.m1479b(context);
                    String str2 = context.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionName;
                    if (str2 != null) {
                        str = str2;
                    }
                } catch (Exception e) {
                    C0908x1.m2193a(Arrays.copyOf(new Object[]{e}, 1));
                }
                C0021B1.f65b = str;
            }
            return C0021B1.f65b;
        }
    }
}
