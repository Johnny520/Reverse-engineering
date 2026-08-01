package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.FragmentC3266;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3269 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m5096(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            FragmentC3266.C3267.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new FragmentC3266.C3267());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC3266(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m5097(Activity activity, Lifecycle$Event lifecycle$Event) {
        lifecycle$Event.getClass();
        if (activity instanceof InterfaceC3221) {
            AbstractC3235 lifecycle = ((InterfaceC3221) activity).getLifecycle();
            if (lifecycle instanceof C3219) {
                ((C3219) lifecycle).m5059(lifecycle$Event);
            }
        }
    }
}
