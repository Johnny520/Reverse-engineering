package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: androidx.lifecycle.C */
/* JADX INFO: loaded from: classes.dex */
public final class C0514C implements Application.ActivityLifecycleCallbacks {
    public static final C0513B Companion = new C0513B();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        AbstractC0307g.m703e(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new C0514C());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC0307g.m703e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC0307g.m703e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC0307g.m703e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        AbstractC0307g.m703e(activity, "activity");
        int i2 = FragmentC0515D.f1457b;
        AbstractC0517F.m1246c(activity, EnumC0535l.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        AbstractC0307g.m703e(activity, "activity");
        int i2 = FragmentC0515D.f1457b;
        AbstractC0517F.m1246c(activity, EnumC0535l.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        AbstractC0307g.m703e(activity, "activity");
        int i2 = FragmentC0515D.f1457b;
        AbstractC0517F.m1246c(activity, EnumC0535l.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        AbstractC0307g.m703e(activity, "activity");
        int i2 = FragmentC0515D.f1457b;
        AbstractC0517F.m1246c(activity, EnumC0535l.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        AbstractC0307g.m703e(activity, "activity");
        int i2 = FragmentC0515D.f1457b;
        AbstractC0517F.m1246c(activity, EnumC0535l.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        AbstractC0307g.m703e(activity, "activity");
        int i2 = FragmentC0515D.f1457b;
        AbstractC0517F.m1246c(activity, EnumC0535l.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC0307g.m703e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC0307g.m703e(activity, "activity");
        AbstractC0307g.m703e(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC0307g.m703e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC0307g.m703e(activity, "activity");
    }
}
