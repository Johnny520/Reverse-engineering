package p022L;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import p012G.C0140d;
import p076m.AbstractFutureC0761g;
import p076m.C0762h;

/* JADX INFO: renamed from: L.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0184n {

    /* JADX INFO: renamed from: a */
    public static final C0762h f531a = new C0762h();

    /* JADX INFO: renamed from: b */
    public static final Object f532b = new Object();

    /* JADX INFO: renamed from: c */
    public static C0140d f533c = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static long m388a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0182l.m385a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C0140d m389b() {
        C0140d c0140d = new C0140d(7);
        f533c = c0140d;
        C0762h c0762h = f531a;
        c0762h.getClass();
        if (AbstractFutureC0761g.f2576f.mo999e(c0762h, null, c0140d)) {
            AbstractFutureC0761g.m1422b(c0762h);
        }
        return f533c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m390c(Context context, boolean z2) {
        C0183m c0183mM386a;
        int i2;
        if (z2 || f533c == null) {
            synchronized (f532b) {
                if (!z2) {
                    try {
                        if (f533c != null) {
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
                        long jM388a = m388a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                c0183mM386a = C0183m.m386a(file3);
                            } catch (IOException unused) {
                                m389b();
                                return;
                            }
                        } else {
                            c0183mM386a = null;
                        }
                        if (c0183mM386a != null && c0183mM386a.f529c == jM388a && (i2 = c0183mM386a.f528b) != 2) {
                            i4 = i2;
                        } else if (z3) {
                            i4 = 1;
                        } else if (z4) {
                            i4 = 2;
                        }
                        if (z2 && z4 && i4 != 1) {
                            i4 = 2;
                        }
                        if (c0183mM386a != null && c0183mM386a.f528b == 2 && i4 == 1 && length < c0183mM386a.f530d) {
                            i4 = 3;
                        }
                        C0183m c0183m = new C0183m(1, i4, jM388a, length2);
                        if (c0183mM386a == null || !c0183mM386a.equals(c0183m)) {
                            try {
                                c0183m.m387b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        m389b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        m389b();
                        return;
                    }
                }
                m389b();
            }
        }
    }
}
