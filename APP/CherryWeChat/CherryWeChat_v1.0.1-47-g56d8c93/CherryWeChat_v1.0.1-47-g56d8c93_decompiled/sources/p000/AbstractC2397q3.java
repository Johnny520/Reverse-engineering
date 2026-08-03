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
    public static final ExecutorC2303o3 f8398a = new ExecutorC2303o3(new ExecutorC2346p3(0));

    /* JADX INFO: renamed from: b */
    public static int f8399b = -100;

    /* JADX INFO: renamed from: c */
    public static C1105Zo f8400c = null;

    /* JADX INFO: renamed from: d */
    public static C1105Zo f8401d = null;

    /* JADX INFO: renamed from: e */
    public static Boolean f8402e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f8403f = false;

    /* JADX INFO: renamed from: g */
    public static final C0607O4 f8404g = new C0607O4();

    /* JADX INFO: renamed from: h */
    public static final Object f8405h = new Object();

    /* JADX INFO: renamed from: i */
    public static final Object f8406i = new Object();

    /* JADX INFO: renamed from: b */
    public static boolean m4833b(Context context) {
        if (f8402e == null) {
            try {
                int i = AbstractServiceC2742y4.f9351a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC2742y4.class), AbstractC2699x4.m5279a() | 128).metaData;
                if (bundle != null) {
                    f8402e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f8402e = Boolean.FALSE;
            }
        }
        return f8402e.booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public static void m4834f(LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3) {
        synchronized (f8405h) {
            try {
                C0607O4 c0607o4 = f8404g;
                c0607o4.getClass();
                C0349I4 c0349i4 = new C0349I4(c0607o4);
                while (c0349i4.hasNext()) {
                    AbstractC2397q3 abstractC2397q3 = (AbstractC2397q3) ((WeakReference) c0349i4.next()).get();
                    if (abstractC2397q3 == layoutInflaterFactory2C0176E3 || abstractC2397q3 == null) {
                        c0349i4.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo341a();

    /* JADX INFO: renamed from: c */
    public abstract void mo342c();

    /* JADX INFO: renamed from: e */
    public abstract void mo343e();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo344g(int i);

    /* JADX INFO: renamed from: h */
    public abstract void mo345h(int i);

    /* JADX INFO: renamed from: i */
    public abstract void mo346i(View view);

    /* JADX INFO: renamed from: j */
    public abstract void mo347j(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: k */
    public abstract void mo348k(CharSequence charSequence);

    /* JADX INFO: renamed from: l */
    public abstract AbstractC0345I0 mo349l(InterfaceC0302H0 interfaceC0302H0);
}
