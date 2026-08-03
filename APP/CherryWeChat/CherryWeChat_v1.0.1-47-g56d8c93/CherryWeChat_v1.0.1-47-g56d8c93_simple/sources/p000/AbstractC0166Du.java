package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: Du */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0166Du {

    /* JADX INFO: renamed from: a */
    public static final C2338ow f445a = null;

    /* JADX INFO: renamed from: b */
    public static final Object f446b = null;

    /* JADX INFO: renamed from: c */
    public static C0668Pg f447c;

    static {
        f445a = new C2338ow();
        f446b = new Object();
        f447c = null;
    }

    /* JADX INFO: renamed from: a */
    public static long m313a(Context r3) {
        PackageManager r0 = r3.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT < 33) goto L7;
        return AbstractC0988X.m1876b(r0, r3).lastUpdateTime;
    L7:
        return r0.getPackageInfo(r3.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: b */
    public static C0668Pg m314b() {
        C0668Pg r0 = new C0668Pg(28);
        f447c = r0;
        C2338ow r1 = f445a;
        r1.getClass();
        if (AbstractFutureC0473L.f1565f.mo733g(r1, null, r0) == false) goto L6;
        AbstractFutureC0473L.m923b(r1);
    L6:
        return f447c;
    }

    /* JADX INFO: renamed from: c */
    public static void m315c(Context r19, boolean r20) {
        if (r20 == false) goto L4;
    L6:
        Object r1 = f446b;
        monitor-enter(r1);
        if (r20 == false) goto L102;
    L15:
        int r5 = 0;
        AssetFileDescriptor r6 = r19.getAssets().openFd("dexopt/baseline.prof");     // Catch: Throwable -> L13 IOException -> L32
        if (r6.getLength() <= 0) goto L21;
        boolean r0 = true;
    L22:
        r6.close();     // Catch: Throwable -> L13 IOException -> L32
    L34:
        if (Build.VERSION.SDK_INT != 30) goto L38;
        m314b();     // Catch: Throwable -> L13
        monitor-exit(r1);     // Catch: Throwable -> L13
        return;
    L38:
        File r62 = new File(new File("/data/misc/profiles/ref/", r19.getPackageName()), "primary.prof");     // Catch: Throwable -> L13
        long r7 = r62.length();     // Catch: Throwable -> L13
        if (r62.exists() == true) goto L41;
    L43:
        boolean r63 = false;
    L44:
        File r9 = new File(new File("/data/misc/profiles/cur/0/", r19.getPackageName()), "primary.prof");     // Catch: Throwable -> L13
        long r17 = r9.length();     // Catch: Throwable -> L13
        if (r9.exists() == true) goto L47;
    L49:
        boolean r2 = false;
    L108:
        long r15 = m313a(r19);     // Catch: Throwable -> L13 PackageManager.NameNotFoundException -> L92
        File r3 = new File(r19.getFilesDir(), "profileInstalled");     // Catch: Throwable -> L13
        if (r3.exists() == true) goto L106;
        C0123Cu r92 = null;
    L60:
        if (r92 != null) goto L62;
    L67:
        if (r0 == true) goto L69;
        r5 = 327680;
    L73:
        if (r20 == false) goto L77;
        if (r2 == false) goto L77;
        if (r5 == 1) goto L77;
        r5 = 2;
    L77:
        if (r92 != null) goto L79;
    L84:
        C0123Cu r12 = new C0123Cu(1, r5, r15, r17);     // Catch: Throwable -> L13
        if (r92 != null) goto L87;
    L98:
        r12.m200b(r3);     // Catch: Throwable -> L13 IOException -> L97
    L89:
        m314b();     // Catch: Throwable -> L13
        monitor-exit(r1);     // Catch: Throwable -> L13
        return;
    L87:
        if (r92.equals(r12) == true) goto L89;
    L79:
        if (r92.f292b != 2) goto L84;
        if (r5 != 1) goto L84;
        if (r7 >= r92.f294d) goto L84;
        r5 = 3;
        goto L84
    L69:
        if (r63 == false) goto L71;
        r5 = 1;
        goto L73
    L71:
        if (r2 == false) goto L73;
        r5 = 2;
        goto L73
    L62:
        if (r92.f293c != r15) goto L67;
        int r11 = r92.f292b;     // Catch: Throwable -> L13
        if (r11 == 2) goto L67;
        r5 = r11;
        goto L73
    L106:
        r92 = C0123Cu.m199a(r3);     // Catch: Throwable -> L13 IOException -> L55
    L55:
        m314b();     // Catch: Throwable -> L13
        return;
    L92:
        m314b();     // Catch: Throwable -> L13
        return;
    L13:
        th = move-exception;
        throw th;
    L47:
        if (r17 <= 0) goto L49;
        r2 = true;
        goto L108
    L41:
        if (r7 <= 0) goto L43;
        r63 = true;
        goto L44
    L21:
        r0 = false;
    L24:
        th = move-exception;
        if (r6 == null) goto L110;
        r6.close();     // Catch: Throwable -> L29
        throw th;     // Catch: Throwable -> L13 IOException -> L32
    L29:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L13 IOException -> L32
        throw th;     // Catch: Throwable -> L13 IOException -> L32
    L110:
        throw th;     // Catch: Throwable -> L13 IOException -> L32
    L32:
        r0 = false;
        goto L34
    L102:
        if (f447c == null) goto L15;
        monitor-exit(r1);     // Catch: Throwable -> L13
        return;
    L4:
        if (f447c == null) goto L6;
    }
}
