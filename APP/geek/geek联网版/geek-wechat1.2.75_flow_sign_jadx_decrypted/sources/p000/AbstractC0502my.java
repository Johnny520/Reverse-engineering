package p000;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: renamed from: my */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0502my {
    /* JADX INFO: renamed from: a */
    public static final void m1907a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        AbstractC0493mp.m1857g("activity", activity);
        AbstractC0493mp.m1857g("callback", activityLifecycleCallbacks);
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
