package com.abc.core.features;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.C0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0577C0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HomeAvatarHook f1716a = HomeAvatarHook.f1723a;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC0307g.m703e(activity, "a");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC0307g.m703e(activity, "a");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC0307g.m703e(activity, "a");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AbstractC0307g.m703e(activity, "activity");
        HomeAvatarHook.f1722C = activity.getClass().getName();
        if (AbstractC0425j.m1005J0(HomeAvatarHook.f1722C, "LauncherUI", false) || AbstractC0425j.m1005J0(HomeAvatarHook.f1722C, "MainTabUI", false)) {
            this.f1716a.getClass();
            HomeAvatarHook.m1404k(activity);
        } else {
            this.f1716a.getClass();
            HomeAvatarHook.m1411r(false);
            AbstractC0358S.m898n(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC0307g.m703e(activity, "a");
        AbstractC0307g.m703e(bundle, "b");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC0307g.m703e(activity, "a");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        AbstractC0307g.m703e(activity, "a");
    }
}
