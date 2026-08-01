package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class py {
    public static final u00 a = null;
    public static final Object b = null;
    public static iy c;

    static {
        a = new u00();
        b = new Object();
        c = null;
    }

    public static long a(Context r3) {
        PackageManager r0 = r3.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT < 33) goto L7;
        return ny.a(r0, r3).lastUpdateTime;
    L7:
        return r0.getPackageInfo(r3.getPackageName(), 0).lastUpdateTime;
    }

    public static iy b() {
        iy r0 = new iy(3);
        c = r0;
        u00 r1 = a;
        r1.getClass();
        if (t.f.f(r1, null, r0) == false) goto L6;
        t.b(r1);
    L6:
        return c;
    }

    public static void c(Context r18, boolean r19) {
        if (r19 == false) goto L4;
    L6:
        Object r1 = b;
        monitor-enter(r1);
        if (r19 == false) goto L81;
    L15:
        int r0 = Build.VERSION.SDK_INT;     // Catch: Throwable -> L13
        if (r0 >= 28) goto L18;
    L75:
        b();     // Catch: Throwable -> L13
        monitor-exit(r1);     // Catch: Throwable -> L13
        return;
    L18:
        if (r0 == 30) goto L75;
        File r02 = new File(new File("/data/misc/profiles/ref/", r18.getPackageName()), "primary.prof");     // Catch: Throwable -> L13
        long r2 = r02.length();     // Catch: Throwable -> L13
        int r6 = 0;
        if (r02.exists() == true) goto L23;
    L25:
        boolean r03 = false;
    L26:
        File r8 = new File(new File("/data/misc/profiles/cur/0/", r18.getPackageName()), "primary.prof");     // Catch: Throwable -> L13
        long r16 = r8.length();     // Catch: Throwable -> L13
        if (r8.exists() == true) goto L29;
    L31:
        boolean r4 = false;
    L84:
        long r14 = a(r18);     // Catch: Throwable -> L13 PackageManager.NameNotFoundException -> L72
        File r5 = new File(r18.getFilesDir(), "profileInstalled");     // Catch: Throwable -> L13
        if (r5.exists() == true) goto L82;
        oy r82 = null;
    L42:
        if (r82 != null) goto L44;
    L49:
        if (r03 == false) goto L51;
        r6 = 1;
    L53:
        if (r19 == false) goto L57;
        if (r4 == false) goto L57;
        if (r6 == 1) goto L57;
        r6 = 2;
    L57:
        if (r82 != null) goto L59;
    L64:
        oy r11 = new oy(1, r6, r14, r16);     // Catch: Throwable -> L13
        if (r82 != null) goto L67;
    L86:
        r11.b(r5);     // Catch: Throwable -> L13 IOException -> L80
    L69:
        b();     // Catch: Throwable -> L13
        monitor-exit(r1);     // Catch: Throwable -> L13
        return;
    L67:
        if (r82.equals(r11) == true) goto L69;
    L59:
        if (r82.b != 2) goto L64;
        if (r6 != 1) goto L64;
        if (r2 >= r82.d) goto L64;
        r6 = 3;
        goto L64
    L51:
        if (r4 == false) goto L53;
        r6 = 2;
        goto L53
    L44:
        if (r82.c != r14) goto L49;
        int r10 = r82.b;     // Catch: Throwable -> L13
        if (r10 == 2) goto L49;
        r6 = r10;
        goto L53
    L82:
        r82 = oy.a(r5);     // Catch: Throwable -> L13 IOException -> L37
    L37:
        b();     // Catch: Throwable -> L13
        return;
    L72:
        b();     // Catch: Throwable -> L13
        return;
    L13:
        th = move-exception;
        throw th;
    L29:
        if (r16 <= 0) goto L31;
        r4 = true;
        goto L84
    L23:
        if (r2 <= 0) goto L25;
        r03 = true;
        goto L26
    L81:
        if (c == null) goto L15;
        monitor-exit(r1);     // Catch: Throwable -> L13
        return;
    L4:
        if (c == null) goto L6;
    }
}
