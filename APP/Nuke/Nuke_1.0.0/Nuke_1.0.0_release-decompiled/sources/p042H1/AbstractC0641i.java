package p042H1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import p002A1.C0115D;
import p182j1.AbstractFutureC2378g;
import p182j1.C2379h;

/* JADX INFO: renamed from: H1.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0641i {

    /* JADX INFO: renamed from: a */
    public static final C2379h f2040a = new C2379h();

    /* JADX INFO: renamed from: b */
    public static final Object f2041b = new Object();

    /* JADX INFO: renamed from: c */
    public static C0115D f2042c = null;

    /* JADX INFO: renamed from: a */
    public static long m1113a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0639g.m1110a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: b */
    public static C0115D m1114b() {
        C0115D c0115d = new C0115D(13);
        f2042c = c0115d;
        C2379h c2379h = f2040a;
        c2379h.getClass();
        if (AbstractFutureC2378g.f7718i.mo3514f(c2379h, null, c0115d)) {
            AbstractFutureC2378g.m4228b(c2379h);
        }
        return f2042c;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1115c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p042H1.AbstractC0641i.m1115c(android.content.Context, boolean):void");
    }
}
