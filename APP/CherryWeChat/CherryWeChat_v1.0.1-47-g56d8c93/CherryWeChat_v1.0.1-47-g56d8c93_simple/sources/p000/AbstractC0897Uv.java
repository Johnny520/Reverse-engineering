package p000;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import p000.FragmentC0983Wv;

/* JADX INFO: renamed from: Uv */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0897Uv {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m1750a(Activity r1, EnumC0632On r2) {
        if ((r1 instanceof InterfaceC1061Yn) == false) goto L8;
        AbstractC0760Rn r12 = ((InterfaceC1061Yn) r1).getLifecycle();
        if ((r12 instanceof C1185ao) == false) goto L9;
        ((C1185ao) r12).m2276e(r2);
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: b */
    public static void m1751b(Activity r3) {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        FragmentC0983Wv.a.Companion.getClass();
        AbstractC0688Q.m1410n(r3, new FragmentC0983Wv.a());
    L5:
        FragmentManager r32 = r3.getFragmentManager();
        if (r32.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") != null) goto L9;
        r32.beginTransaction().add(new FragmentC0983Wv(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
        r32.executePendingTransactions();
        return;
    }
}
