package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: androidx.lifecycle.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0472g implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC0223g.m418e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC0223g.m418e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC0223g.m418e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC0223g.m418e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC0223g.m418e(activity, "activity");
        AbstractC0223g.m418e(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC0223g.m418e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC0223g.m418e(activity, "activity");
    }
}
