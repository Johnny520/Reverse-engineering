package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.FragmentC2433;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2436 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m4526(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            FragmentC2433.C2434.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new FragmentC2433.C2434());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC2433(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m4527(Activity activity, Lifecycle$Event lifecycle$Event) {
        lifecycle$Event.getClass();
        if (activity instanceof InterfaceC2388) {
            AbstractC2402 lifecycle = ((InterfaceC2388) activity).getLifecycle();
            if (lifecycle instanceof C2386) {
                ((C2386) lifecycle).m4489(lifecycle$Event);
            }
        }
    }
}
