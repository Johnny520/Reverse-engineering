package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.FragmentC0453E;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: androidx.lifecycle.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0451C {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m905a(Activity activity, EnumC0478m enumC0478m) {
        C0486u c0486uMo636c;
        AbstractC0223g.m418e(enumC0478m, "event");
        if (!(activity instanceof InterfaceC0484s) || (c0486uMo636c = ((InterfaceC0484s) activity).mo636c()) == null) {
            return;
        }
        c0486uMo636c.m930d(enumC0478m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m906b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            FragmentC0453E.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new FragmentC0453E.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0453E(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
