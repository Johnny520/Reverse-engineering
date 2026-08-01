package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: renamed from: r1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0655r1 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public Object f4126a;

    /* JADX INFO: renamed from: b */
    public Activity f4127b;

    /* JADX INFO: renamed from: c */
    public final int f4128c;

    /* JADX INFO: renamed from: d */
    public boolean f4129d = false;

    /* JADX INFO: renamed from: e */
    public boolean f4130e = false;

    /* JADX INFO: renamed from: f */
    public boolean f4131f = false;

    public C0655r1(Activity activity) {
        this.f4127b = activity;
        this.f4128c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4127b == activity) {
            this.f4127b = null;
            this.f4130e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f4130e || this.f4131f || this.f4129d) {
            return;
        }
        Object obj = this.f4126a;
        try {
            Object obj2 = AbstractC0692s1.f4371c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f4128c) {
                AbstractC0692s1.f4375g.postAtFrontOfQueue(new RunnableC0282h1(AbstractC0692s1.f4370b.get(activity), obj2, 3, false));
                this.f4131f = true;
                this.f4126a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f4127b == activity) {
            this.f4129d = true;
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
