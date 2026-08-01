package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: renamed from: r1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0654r1 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public Object f3990a;

    /* JADX INFO: renamed from: b */
    public Activity f3991b;

    /* JADX INFO: renamed from: c */
    public final int f3992c;

    /* JADX INFO: renamed from: d */
    public boolean f3993d = false;

    /* JADX INFO: renamed from: e */
    public boolean f3994e = false;

    /* JADX INFO: renamed from: f */
    public boolean f3995f = false;

    public C0654r1(Activity activity) {
        this.f3991b = activity;
        this.f3992c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f3991b == activity) {
            this.f3991b = null;
            this.f3994e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f3994e || this.f3995f || this.f3993d) {
            return;
        }
        Object obj = this.f3990a;
        try {
            Object obj2 = AbstractC0691s1.f4182c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f3992c) {
                AbstractC0691s1.f4186g.postAtFrontOfQueue(new RunnableC0282h1(AbstractC0691s1.f4181b.get(activity), obj2, 3, false));
                this.f3995f = true;
                this.f3990a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f3991b == activity) {
            this.f3993d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
