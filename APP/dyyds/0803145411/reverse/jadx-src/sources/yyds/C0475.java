package yyds;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: yyds.ᛲᲇᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0475 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public Activity f2381;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public WeakReference f2382;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C0912 c0912;
        if (this.f2381 != activity) {
            return;
        }
        this.f2381 = null;
        WeakReference weakReference = this.f2382;
        if (weakReference == null || (c0912 = (C0912) weakReference.get()) == null) {
            return;
        }
        c0912.m2031();
        this.f2382 = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        WeakReference weakReference;
        C0912 c0912;
        Activity activity2 = this.f2381;
        if (activity2 == activity && activity2.isFinishing() && (weakReference = this.f2382) != null && (c0912 = (C0912) weakReference.get()) != null && c0912.f4157) {
            c0912.m2027();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
