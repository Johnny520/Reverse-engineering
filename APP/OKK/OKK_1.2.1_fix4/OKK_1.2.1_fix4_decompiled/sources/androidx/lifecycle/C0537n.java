package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: androidx.lifecycle.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0537n extends AbstractC0529f {
    @Override // androidx.lifecycle.AbstractC0529f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC0307g.m703e(activity, "activity");
        int i2 = FragmentC0515D.f1457b;
        if (Build.VERSION.SDK_INT >= 29) {
            C0514C.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new C0514C());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0515D(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
