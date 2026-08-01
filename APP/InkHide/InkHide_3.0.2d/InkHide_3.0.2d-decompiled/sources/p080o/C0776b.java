package p080o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: renamed from: o.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0776b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public Object f2600a;

    /* JADX INFO: renamed from: b */
    public Activity f2601b;

    /* JADX INFO: renamed from: c */
    public final int f2602c;

    /* JADX INFO: renamed from: d */
    public boolean f2603d = false;

    /* JADX INFO: renamed from: e */
    public boolean f2604e = false;

    /* JADX INFO: renamed from: f */
    public boolean f2605f = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0776b(Activity activity) {
        this.f2601b = activity;
        this.f2602c = activity.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f2601b == activity) {
            this.f2601b = null;
            this.f2604e = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f2604e || this.f2605f || this.f2603d) {
            return;
        }
        Object obj = this.f2600a;
        try {
            Object obj2 = AbstractC0777c.f2608c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f2602c) {
                AbstractC0777c.f2612g.postAtFrontOfQueue(new RunnableC0775a(AbstractC0777c.f2607b.get(activity), obj2, 2, false));
                this.f2605f = true;
                this.f2600a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f2601b == activity) {
            this.f2603d = true;
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
