package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class al {
    public static final ds a = null;
    public static final ThreadPoolExecutor b = null;
    public static final Object c = null;
    public static final u30 d = null;

    static {
        a = new ds(16);
        ThreadPoolExecutor r2 = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new r00());
        r2.allowCoreThreadTimeOut(true);
        b = r2;
        c = new Object();
        d = new u30();
    }

    public static zk a(String r6, Context r7, y1 r8, int r9) {
        ds r0 = a;
        Typeface r1 = (Typeface) r0.a(r6);
        if (r1 != null) goto L5;
        f2 r82 = a80.m(r7, r8);     // Catch: PackageManager.NameNotFoundException -> L33
        gl[] r12 = (gl[]) r82.b;
        int r83 = r82.a;
        int r3 = 1;
        if (r83 == 0) goto L12;
        if (r83 == 1) goto L11;
    L10:
        r3 = -3;
    L24:
        if (r3 != 0) goto L26;
        Typeface r72 = b80.a.h(r7, r12, r9);
        if (r72 == null) goto L32;
        r0.b(r6, r72);
        return new zk(r72);
    L32:
        return new zk(-3);
    L26:
        return new zk(r3);
    L11:
        r3 = -2;
        goto L24
    L12:
        if (r12 == null) goto L24;
        if (r12.length == 0) goto L24;
        int r84 = r12.length;
        r3 = 0;
        int r4 = 0;
    L17:
        if (r4 >= r84) goto L24;
        int r5 = r12[r4].e;
        if (r5 != 0) goto L20;
        r4 = r4 + 1;
        goto L17
    L20:
        if (r5 < 0) goto L10;
        r3 = r5;
    L34:
        return new zk(-1);
    L5:
        return new zk(r1);
    }
}
