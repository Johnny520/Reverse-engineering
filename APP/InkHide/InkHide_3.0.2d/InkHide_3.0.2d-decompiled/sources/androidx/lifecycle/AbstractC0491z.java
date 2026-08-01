package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: androidx.lifecycle.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0491z {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m938a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        AbstractC0223g.m418e(activity, "activity");
        AbstractC0223g.m418e(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
