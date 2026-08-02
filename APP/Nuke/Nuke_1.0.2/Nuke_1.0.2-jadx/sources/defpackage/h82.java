package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.j82;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h82 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, z91 z91Var) {
        z91Var.getClass();
        if (activity instanceof ia1) {
            ba1 lifecycle = ((ia1) activity).getLifecycle();
            if (lifecycle instanceof la1) {
                ((la1) lifecycle).e(z91Var);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(cw cwVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            j82.a.Companion.getClass();
            cwVar.registerActivityLifecycleCallbacks(new j82.a());
        }
        FragmentManager fragmentManager = cwVar.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new j82(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
