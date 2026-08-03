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
    public static void m1750a(Activity activity, EnumC0632On enumC0632On) {
        if (activity instanceof InterfaceC1061Yn) {
            AbstractC0760Rn lifecycle = ((InterfaceC1061Yn) activity).getLifecycle();
            if (lifecycle instanceof C1185ao) {
                ((C1185ao) lifecycle).m2276e(enumC0632On);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1751b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            FragmentC0983Wv.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new FragmentC0983Wv.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0983Wv(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
