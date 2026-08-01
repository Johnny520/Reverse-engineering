package p000;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: renamed from: ey */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0204ey {
    /* JADX INFO: renamed from: a */
    public static final void m1092a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        AbstractC0346ip.m1503o("activity", activity);
        AbstractC0346ip.m1503o("callback", activityLifecycleCallbacks);
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
