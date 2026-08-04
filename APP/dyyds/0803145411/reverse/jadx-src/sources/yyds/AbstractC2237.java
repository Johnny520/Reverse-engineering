package yyds;

import android.app.Activity;
import android.app.FragmentManager;
import androidx.lifecycle.C0038;
import yyds.FragmentC1919;

/* JADX INFO: renamed from: yyds.ᲁᛵᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2237 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m4236(Activity activity, EnumC0637 enumC0637) {
        C0038 c0038Mo14;
        if (!(activity instanceof InterfaceC2345) || (c0038Mo14 = ((InterfaceC2345) activity).mo14()) == null) {
            return;
        }
        c0038Mo14.m127(enumC0637);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m4237(Activity activity) {
        FragmentC1919.C1920.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new FragmentC1919.C1920());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC1919(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
