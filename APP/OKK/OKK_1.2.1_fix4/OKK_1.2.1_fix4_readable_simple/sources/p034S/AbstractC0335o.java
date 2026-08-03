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
    public static final C0976h f650a = null;

    /* JADX INFO: renamed from: b */
    public static final Object f651b = null;

    /* JADX INFO: renamed from: c */
    public static C1121e f652c;

    static {
        f650a = new C0976h();
        f651b = new Object();
        f652c = null;
    }

    /* JADX INFO: renamed from: a */
    public static long m754a(Context r3) {
        PackageManager r02 = r3.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT < 33) goto L7;
        return AbstractC0333m.m751a(r02, r3).lastUpdateTime;
    L7:
        return r02.getPackageInfo(r3.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: b */
    public static C1121e m755b() {
        C1121e r02 = new C1121e(11);
        f652c = r02;
        C0976h r1 = f650a;
        r1.getClass();
        if (AbstractFutureC0975g.f3455f.mo2068d(r1, null, r02) == false) goto L6;
        AbstractFutureC0975g.m2329b(r1);
    L6:
        return f652c;
    }

    /* JADX INFO: renamed from: c */
    public static void m756c(Context r18, boolean r19) {
        if (r19 == false) goto L4;
    L6:
        Object r1 = f651b;
        monitor-enter(r1);
        if (r19 == false) goto L82;
    L15:
        int r02 = Build.VERSION.SDK_INT;     // Catch: Throwable -> L13
        if (r02 >= 28) goto L18;
    L76:
        m755b();     // Catch: Throwable -> L13
        monitor-exit(r1);     // Catch: Throwable -> L13
        return;
    L18:
        if (r02 == 30) goto L76;
        File r03 = new File(new File("/data/misc/profiles/ref/", r18.getPackageName()), "primary.prof");     // Catch: Throwable -> L13
        long r2 = r03.length();     // Catch: Throwable -> L13
        int r4 = 0;
        if (r03.exists() == true) goto L23;
    L25:
        boolean r04 = false;
    L26:
        File r8 = new File(new File("/data/misc/profiles/cur/0/", r18.getPackageName()), "primary.prof");     // Catch: Throwable -> L13
        long r16 = r8.length();     // Catch: Throwable -> L13
        if (r8.exists() == true) goto L29;
    L31:
        boolean r5 = false;
    L85:
        long r14 = m754a(r18);     // Catch: Throwable -> L13 PackageManager.NameNotFoundException -> L73
        File r6 = new File(r18.getFilesDir(), "profileInstalled");     // Catch: Throwable -> L13
        if (r6.exists() == true) goto L83;
        C0334n r82 = null;
    L42:
        if (r82 != null) goto L44;
    L49:
        if (r04 == false) goto L51;
        r4 = 1;
    L53:
        if (r19 == false) goto L57;
        if (r5 == false) goto L57;
        if (r4 == 1) goto L57;
        r4 = 2;
    L57:
        if (r82 != null) goto L59;
    L64:
        int r13 = r4;
    L65:
        C0334n r05 = new C0334n(1, r13, r14, r16);     // Catch: Throwable -> L13
        if (r82 != null) goto L68;
    L87:
        r05.m753b(r6);     // Catch: Throwable -> L13 IOException -> L81
    L70:
        m755b();     // Catch: Throwable -> L13
        monitor-exit(r1);     // Catch: Throwable -> L13
        return;
    L68:
        if (r82.equals(r05) == true) goto L70;
    L59:
        if (r82.f647b != 2) goto L64;
        if (r4 != 1) goto L64;
        if (r2 >= r82.f649d) goto L64;
        r13 = 3;
        goto L65
    L51:
        if (r5 == false) goto L53;
        r4 = 2;
        goto L53
    L44:
        if (r82.f648c != r14) goto L49;
        int r10 = r82.f647b;     // Catch: Throwable -> L13
        if (r10 == 2) goto L49;
        r4 = r10;
        goto L53
    L83:
        r82 = C0334n.m752a(r6);     // Catch: Throwable -> L13 IOException -> L37
    L37:
        m755b();     // Catch: Throwable -> L13
        return;
    L73:
        m755b();     // Catch: Throwable -> L13
        return;
    L13:
        th = move-exception;
        throw th;
    L29:
        if (r16 <= 0) goto L31;
        r5 = true;
        goto L85
    L23:
        if (r2 <= 0) goto L25;
        r04 = true;
        goto L26
    L82:
        if (f652c == null) goto L15;
        monitor-exit(r1);     // Catch: Throwable -> L13
        return;
    L4:
        if (f652c == null) goto L6;
    }
}
