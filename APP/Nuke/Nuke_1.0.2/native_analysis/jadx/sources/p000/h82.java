package p000;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import p000.j82;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h82 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m2122a(Activity activity, z91 z91Var) {
        z91Var.getClass();
        if (activity instanceof ia1) {
            ba1 lifecycle = ((ia1) activity).getLifecycle();
            if (lifecycle instanceof la1) {
                ((la1) lifecycle).m2892e(z91Var);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2123b(AbstractActivityC0108cw abstractActivityC0108cw) {
        if (Build.VERSION.SDK_INT >= 29) {
            j82.C0341a.Companion.getClass();
            abstractActivityC0108cw.registerActivityLifecycleCallbacks(new j82.C0341a());
        }
        FragmentManager fragmentManager = abstractActivityC0108cw.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new j82(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
