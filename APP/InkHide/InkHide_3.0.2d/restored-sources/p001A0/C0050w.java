package p001A0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0050w implements Application.ActivityLifecycleCallbacks {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC0223g.m418e(activity, "activity");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC0223g.m418e(activity, "activity");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC0223g.m418e(activity, "activity");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Window window;
        View decorView;
        AbstractC0223g.m418e(activity, "activity");
        if (!activity.getClass().getName().equals("com.tencent.mm.ui.LauncherUI") || C0052y.f294d.get() || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.postDelayed(new RunnableC0049v(activity, 0), 300L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC0223g.m418e(activity, "activity");
        AbstractC0223g.m418e(bundle, "outState");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC0223g.m418e(activity, "activity");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        AbstractC0223g.m418e(activity, "activity");
    }
}
