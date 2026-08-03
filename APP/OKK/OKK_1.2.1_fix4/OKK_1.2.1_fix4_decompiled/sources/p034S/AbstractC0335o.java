package p034S;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import p065k.AbstractFutureC0975g;
import p065k.C0976h;
import p089x0.C1121e;

/* JADX INFO: renamed from: S.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0335o {

    /* JADX INFO: renamed from: a */
    public static final C0976h f650a = new C0976h();

    /* JADX INFO: renamed from: b */
    public static final Object f651b = new Object();

    /* JADX INFO: renamed from: c */
    public static C1121e f652c = null;

    /* JADX INFO: renamed from: a */
    public static long m754a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0333m.m751a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: b */
    public static C1121e m755b() {
        C1121e c1121e = new C1121e(11);
        f652c = c1121e;
        C0976h c0976h = f650a;
        c0976h.getClass();
        if (AbstractFutureC0975g.f3455f.mo2068d(c0976h, null, c1121e)) {
            AbstractFutureC0975g.m2329b(c0976h);
        }
        return f652c;
    }

    /* JADX INFO: renamed from: c */
    public static void m756c(Context context, boolean z2) {
        C0334n c0334nM752a;
        int i2;
        if (z2 || f652c == null) {
            synchronized (f651b) {
                if (!z2) {
                    try {
                        if (f652c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28 && i3 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i4 = 0;
                    boolean z3 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z4 = file2.exists() && length2 > 0;
                    try {
                        long jM754a = m754a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                c0334nM752a = C0334n.m752a(file3);
                            } catch (IOException unused) {
                                m755b();
                                return;
                            }
                        } else {
                            c0334nM752a = null;
                        }
                        if (c0334nM752a != null && c0334nM752a.f648c == jM754a && (i2 = c0334nM752a.f647b) != 2) {
                            i4 = i2;
                        } else if (z3) {
                            i4 = 1;
                        } else if (z4) {
                            i4 = 2;
                        }
                        if (z2 && z4 && i4 != 1) {
                            i4 = 2;
                        }
                        C0334n c0334n = new C0334n(1, (c0334nM752a == null || c0334nM752a.f647b != 2 || i4 != 1 || length >= c0334nM752a.f649d) ? i4 : 3, jM754a, length2);
                        if (c0334nM752a == null || !c0334nM752a.equals(c0334n)) {
                            try {
                                c0334n.m753b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        m755b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        m755b();
                        return;
                    }
                }
                m755b();
            }
        }
    }
}
