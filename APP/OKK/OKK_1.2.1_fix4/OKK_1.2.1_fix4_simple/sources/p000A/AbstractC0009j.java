package p000A;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p063j.C0961f;
import p063j.C0966k;
import p085v.AbstractC1106g;

/* JADX INFO: renamed from: A.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0009j {

    /* JADX INFO: renamed from: a */
    public static final C0961f f24a = null;

    /* JADX INFO: renamed from: b */
    public static final ThreadPoolExecutor f25b = null;

    /* JADX INFO: renamed from: c */
    public static final Object f26c = null;

    /* JADX INFO: renamed from: d */
    public static final C0966k f27d = null;

    static {
        f24a = new C0961f(16);
        ThreadFactoryC0013n r9 = new ThreadFactoryC0013n();
        r9.f36a = "fonts-androidx";
        r9.f37b = 10;
        ThreadPoolExecutor r02 = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), r9);
        r02.allowCoreThreadTimeOut(true);
        f25b = r02;
        f26c = new Object();
        f27d = new C0966k();
    }

    /* JADX INFO: renamed from: a */
    public static C0008i m17a(String r6, Context r7, C0005f r8, int r9) {
        C0961f r02 = f24a;
        Typeface r1 = (Typeface) r02.m2313a(r6);
        if (r1 != null) goto L5;
        C0010k r82 = AbstractC0004e.m15a(r7, r8);     // Catch: PackageManager.NameNotFoundException -> L33
        int r12 = 1;
        C0011l[] r3 = (C0011l[]) r82.f29b;
        int r83 = r82.f28a;
        if (r83 == 0) goto L12;
        if (r83 == 1) goto L11;
    L10:
        r12 = -3;
    L24:
        if (r12 != 0) goto L26;
        Typeface r72 = AbstractC1106g.f4256a.mo2071k(r7, r3, r9);
        if (r72 == null) goto L32;
        r02.m2314b(r6, r72);
        return new C0008i(r72);
    L32:
        return new C0008i(-3);
    L26:
        return new C0008i(r12);
    L11:
        r12 = -2;
        goto L24
    L12:
        if (r3 == null) goto L24;
        if (r3.length == 0) goto L24;
        int r84 = r3.length;
        r12 = 0;
        int r4 = 0;
    L17:
        if (r4 >= r84) goto L24;
        int r5 = r3[r4].f34e;
        if (r5 != 0) goto L20;
        r4 = r4 + 1;
        goto L17
    L20:
        if (r5 < 0) goto L10;
        r12 = r5;
    L34:
        return new C0008i(-1);
    L5:
        return new C0008i(r1);
    }
}
