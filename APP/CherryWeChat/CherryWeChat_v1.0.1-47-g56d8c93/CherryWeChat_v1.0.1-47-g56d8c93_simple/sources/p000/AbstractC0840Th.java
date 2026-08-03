package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Th */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0840Th {

    /* JADX INFO: renamed from: a */
    public static final C0161Dp f2669a = null;

    /* JADX INFO: renamed from: b */
    public static final ThreadPoolExecutor f2670b = null;

    /* JADX INFO: renamed from: c */
    public static final Object f2671c = null;

    /* JADX INFO: renamed from: d */
    public static final C2520sy f2672d = null;

    static {
        f2669a = new C0161Dp(16);
        ThreadPoolExecutor r2 = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0474L0(2));
        r2.allowCoreThreadTimeOut(true);
        f2670b = r2;
        f2671c = new Object();
        f2672d = new C2520sy(0);
    }

    /* JADX INFO: renamed from: a */
    public static String m1661a(int r3, List r4) {
        StringBuilder r0 = new StringBuilder();
        int r1 = 0;
    L4:
        if (r1 >= r4.size()) goto L10;
        r0.append(((C0583Nh) r4.get(r1)).f1889g);
        r0.append("-");
        r0.append(r3);
        if (r1 >= (r4.size() - 1)) goto L8;
        r0.append(";");
    L8:
        r1 = r1 + 1;
        goto L4
    L10:
        return r0.toString();
    }

    /* JADX INFO: renamed from: b */
    public static C0797Sh m1662b(String r8, Context r9, List r10, int r11) {
        C0161Dp r0 = f2669a;
        AbstractC0628Oj.m1239c("getFontSync");
        Typeface r1 = (Typeface) r0.m307f(r8);     // Catch: Throwable -> L59
        if (r1 == null) goto L67;
        C0797Sh r82 = new C0797Sh(r1);     // Catch: Throwable -> L59
        Trace.endSection();
        return r82;
    L67:
        C0307H5 r102 = AbstractC0540Mh.m1036a(r9, r10);     // Catch: PackageManager.NameNotFoundException -> L56 Throwable -> L59
        List r12 = (List) r102.f1021b;     // Catch: Throwable -> L59
        int r103 = r102.f1020a;     // Catch: Throwable -> L59
        if (r103 == 0) goto L14;
        if (r103 == 1) goto L13;
    L12:
        int r104 = -3;
    L29:
        if (r104 == 0) goto L34;
        C0797Sh r83 = new C0797Sh(r104);     // Catch: Throwable -> L59
        Trace.endSection();
        return r83;
    L34:
        if (r12.size() > 1) goto L36;
    L43:
        C1098Zh[] r105 = (C1098Zh[]) r12.get(0);     // Catch: Throwable -> L59
        AbstractC1293cr r13 = AbstractC0871UB.f2754a;     // Catch: Throwable -> L59
        AbstractC0628Oj.m1239c("TypefaceCompat.createFromFontInfo");     // Catch: Throwable -> L59
        Typeface r92 = AbstractC0871UB.f2754a.mo1763r(r9, r105, r11);     // Catch: Throwable -> L53
        Trace.endSection();     // Catch: Throwable -> L59
    L46:
        if (r92 == null) goto L50;
        r0.m311j(r8, r92);     // Catch: Throwable -> L59
        C0797Sh r84 = new C0797Sh(r92);     // Catch: Throwable -> L59
        Trace.endSection();
        return r84;
    L50:
        C0797Sh r85 = new C0797Sh(-3);     // Catch: Throwable -> L59
        Trace.endSection();
        return r85;
    L53:
        th = move-exception;
        Trace.endSection();     // Catch: Throwable -> L59
        throw th;     // Catch: Throwable -> L59
    L36:
        if (Build.VERSION.SDK_INT < 29) goto L43;
        AbstractC1293cr r106 = AbstractC0871UB.f2754a;     // Catch: Throwable -> L59
        AbstractC0628Oj.m1239c("TypefaceCompat.createFromFontInfoWithFallback");     // Catch: Throwable -> L59
        r92 = AbstractC0871UB.f2754a.mo1831s(r9, r12, r11);     // Catch: Throwable -> L40
        Trace.endSection();     // Catch: Throwable -> L59
        goto L46
    L40:
        th = move-exception;
        Trace.endSection();     // Catch: Throwable -> L59
        throw th;     // Catch: Throwable -> L59
    L13:
        r104 = -2;
        goto L29
    L14:
        C1098Zh[] r107 = (C1098Zh[]) r12.get(0);     // Catch: Throwable -> L59
        if (r107 != null) goto L17;
    L28:
        r104 = 1;
        goto L29
    L17:
        if (r107.length == 0) goto L28;
        int r5 = r107.length;     // Catch: Throwable -> L59
        int r6 = 0;
    L20:
        if (r6 >= r5) goto L27;
        int r7 = r107[r6].f3490f;     // Catch: Throwable -> L59
        if (r7 != 0) goto L23;
        r6 = r6 + 1;     // Catch: Throwable -> L59
        goto L20
    L23:
        if (r7 < 0) goto L12;
        r104 = r7;
        goto L29
    L27:
        r104 = 0;
        goto L29
    L56:
        C0797Sh r86 = new C0797Sh(-1);     // Catch: Throwable -> L59
        Trace.endSection();
        return r86;
    L59:
        th = move-exception;
        Trace.endSection();
        throw th;
    }
}
