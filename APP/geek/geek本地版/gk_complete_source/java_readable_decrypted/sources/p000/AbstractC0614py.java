package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: py */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0614py {

    /* JADX INFO: renamed from: a */
    public static final u00 f3961a = new u00();

    /* JADX INFO: renamed from: b */
    public static final Object f3962b = new Object();

    /* JADX INFO: renamed from: c */
    public static C0354iy f3963c = null;

    /* JADX INFO: renamed from: a */
    public static long m2133a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0539ny.m1952a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: b */
    public static C0354iy m2134b() {
        C0354iy c0354iy = new C0354iy(3);
        f3963c = c0354iy;
        u00 u00Var = f3961a;
        u00Var.getClass();
        if (AbstractFutureC0727t.f4476f.mo1209f(u00Var, null, c0354iy)) {
            AbstractFutureC0727t.m2342b(u00Var);
        }
        return f3963c;
    }

    /* JADX INFO: renamed from: c */
    public static void m2135c(Context context, boolean z) {
        C0576oy c0576oyM2028a;
        int i;
        if (z || f3963c == null) {
            synchronized (f3962b) {
                if (!z) {
                    try {
                        if (f3963c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28 && i2 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i3 = 0;
                    boolean z2 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z3 = file2.exists() && length2 > 0;
                    try {
                        long jM2133a = m2133a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                c0576oyM2028a = C0576oy.m2028a(file3);
                            } catch (IOException unused) {
                                m2134b();
                                return;
                            }
                        } else {
                            c0576oyM2028a = null;
                        }
                        if (c0576oyM2028a != null && c0576oyM2028a.f3619c == jM2133a && (i = c0576oyM2028a.f3618b) != 2) {
                            i3 = i;
                        } else if (z2) {
                            i3 = 1;
                        } else if (z3) {
                            i3 = 2;
                        }
                        if (z && z3 && i3 != 1) {
                            i3 = 2;
                        }
                        if (c0576oyM2028a != null && c0576oyM2028a.f3618b == 2 && i3 == 1 && length < c0576oyM2028a.f3620d) {
                            i3 = 3;
                        }
                        C0576oy c0576oy = new C0576oy(1, i3, jM2133a, length2);
                        if (c0576oyM2028a == null || !c0576oyM2028a.equals(c0576oy)) {
                            try {
                                c0576oy.m2029b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        m2134b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        m2134b();
                        return;
                    }
                }
                m2134b();
            }
        }
    }
}
