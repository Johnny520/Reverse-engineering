package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: wy */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0873wy {

    /* JADX INFO: renamed from: a */
    public static final b10 f5143a = new b10();

    /* JADX INFO: renamed from: b */
    public static final Object f5144b = new Object();

    /* JADX INFO: renamed from: c */
    public static C0426kw f5145c = null;

    /* JADX INFO: renamed from: a */
    public static long m2626a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0798uy.m2500a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: b */
    public static C0426kw m2627b() {
        C0426kw c0426kw = new C0426kw(5);
        f5145c = c0426kw;
        b10 b10Var = f5143a;
        b10Var.getClass();
        if (AbstractFutureC0726t.f4379f.mo1271n(b10Var, null, c0426kw)) {
            AbstractFutureC0726t.m2389b(b10Var);
        }
        return f5145c;
    }

    /* JADX INFO: renamed from: c */
    public static void m2628c(Context context, boolean z) {
        C0835vy c0835vyM2581a;
        int i;
        if (z || f5145c == null) {
            synchronized (f5144b) {
                if (!z) {
                    try {
                        if (f5145c != null) {
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
                        long jM2626a = m2626a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                c0835vyM2581a = C0835vy.m2581a(file3);
                            } catch (IOException unused) {
                                m2627b();
                                return;
                            }
                        } else {
                            c0835vyM2581a = null;
                        }
                        if (c0835vyM2581a != null && c0835vyM2581a.f5015c == jM2626a && (i = c0835vyM2581a.f5014b) != 2) {
                            i3 = i;
                        } else if (z2) {
                            i3 = 1;
                        } else if (z3) {
                            i3 = 2;
                        }
                        if (z && z3 && i3 != 1) {
                            i3 = 2;
                        }
                        if (c0835vyM2581a != null && c0835vyM2581a.f5014b == 2 && i3 == 1 && length < c0835vyM2581a.f5016d) {
                            i3 = 3;
                        }
                        C0835vy c0835vy = new C0835vy(1, i3, jM2626a, length2);
                        if (c0835vyM2581a == null || !c0835vyM2581a.equals(c0835vy)) {
                            try {
                                c0835vy.m2582b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        m2627b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        m2627b();
                        return;
                    }
                }
                m2627b();
            }
        }
    }
}
