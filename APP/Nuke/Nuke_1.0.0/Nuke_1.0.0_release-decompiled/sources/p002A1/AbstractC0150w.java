package p002A1;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import p002A1.FragmentC0153z;
import p117X2.AbstractC1665j;
import p194l1.AbstractActivityC2494b;

/* JADX INFO: renamed from: A1.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0150w {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m194a(Activity activity, EnumC0140m enumC0140m) {
        AbstractC1665j.m2985e(enumC0140m, "event");
        if (activity instanceof InterfaceC0145r) {
            AbstractC0142o lifecycle = ((InterfaceC0145r) activity).getLifecycle();
            if (lifecycle instanceof C0147t) {
                ((C0147t) lifecycle).m189e(enumC0140m);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m195b(AbstractActivityC2494b abstractActivityC2494b) {
        if (Build.VERSION.SDK_INT >= 29) {
            FragmentC0153z.a.Companion.getClass();
            abstractActivityC2494b.registerActivityLifecycleCallbacks(new FragmentC0153z.a());
        }
        FragmentManager fragmentManager = abstractActivityC2494b.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0153z(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
