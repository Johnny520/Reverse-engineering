package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: q3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2397q3 {

    /* JADX INFO: renamed from: a */
    public static final ExecutorC2303o3 f8398a = null;

    /* JADX INFO: renamed from: b */
    public static int f8399b;

    /* JADX INFO: renamed from: c */
    public static C1105Zo f8400c;

    /* JADX INFO: renamed from: d */
    public static C1105Zo f8401d;

    /* JADX INFO: renamed from: e */
    public static Boolean f8402e;

    /* JADX INFO: renamed from: f */
    public static boolean f8403f;

    /* JADX INFO: renamed from: g */
    public static final C0607O4 f8404g = null;

    /* JADX INFO: renamed from: h */
    public static final Object f8405h = null;

    /* JADX INFO: renamed from: i */
    public static final Object f8406i = null;

    static {
        f8398a = new ExecutorC2303o3(new ExecutorC2346p3(0));
        f8399b = -100;
        f8400c = null;
        f8401d = null;
        f8402e = null;
        f8403f = false;
        f8404g = new C0607O4();
        f8405h = new Object();
        f8406i = new Object();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4833b(Context r4) {
        if (f8402e != null) goto L10;
        int r0 = AbstractServiceC2742y4.f9351a;     // Catch: PackageManager.NameNotFoundException -> L8
        int r02 = AbstractC2699x4.m5279a() | 128;     // Catch: PackageManager.NameNotFoundException -> L8
        Bundle r42 = r4.getPackageManager().getServiceInfo(new ComponentName(r4, AbstractServiceC2742y4.class), r02).metaData;     // Catch: PackageManager.NameNotFoundException -> L8
        if (r42 == null) goto L10;
        f8402e = Boolean.valueOf(r42.getBoolean("autoStoreLocales"));     // Catch: PackageManager.NameNotFoundException -> L8
    L8:
        f8402e = Boolean.FALSE;
    L10:
        return f8402e.booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public static void m4834f(LayoutInflaterFactory2C0176E3 r3) {
        Object r0 = f8405h;
        monitor-enter(r0);
        C0607O4 r1 = f8404g;     // Catch: Throwable -> L11
        r1.getClass();     // Catch: Throwable -> L11
        C0349I4 r2 = new C0349I4(r1);     // Catch: Throwable -> L11
    L6:
        if (r2.hasNext() == false) goto L13;
        AbstractC2397q3 r12 = (AbstractC2397q3) ((WeakReference) r2.next()).get();     // Catch: Throwable -> L11
        if (r12 == r3) goto L10;
        if (r12 != null) goto L6;
    L10:
        r2.remove();     // Catch: Throwable -> L11
        goto L6
    L13:
        monitor-exit(r0);     // Catch: Throwable -> L11
        return;
    L11:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo341a();

    /* JADX INFO: renamed from: c */
    public abstract void mo342c();

    /* JADX INFO: renamed from: e */
    public abstract void mo343e();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo344g(int r1);

    /* JADX INFO: renamed from: h */
    public abstract void mo345h(int r1);

    /* JADX INFO: renamed from: i */
    public abstract void mo346i(View r1);

    /* JADX INFO: renamed from: j */
    public abstract void mo347j(View r1, ViewGroup.LayoutParams r2);

    /* JADX INFO: renamed from: k */
    public abstract void mo348k(CharSequence r1);

    /* JADX INFO: renamed from: l */
    public abstract AbstractC0345I0 mo349l(InterfaceC0302H0 r1);
}
