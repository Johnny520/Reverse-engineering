package yyds;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: yyds.ᛵᛳᛲᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1053 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public Activity f4788;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public Application f4789;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C0922 f4790;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4788 != activity) {
            return;
        }
        C0922 c0922 = this.f4790;
        if (c0922 != null) {
            c0922.m2039();
        }
        m2249();
        this.f4788 = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C0922 c0922;
        if (this.f4788 == activity && (c0922 = this.f4790) != null) {
            c0922.m2039();
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

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m2249() {
        this.f4790 = null;
        Activity activity = this.f4788;
        if (activity == null) {
            return;
        }
        activity.unregisterActivityLifecycleCallbacks(this);
    }
}
