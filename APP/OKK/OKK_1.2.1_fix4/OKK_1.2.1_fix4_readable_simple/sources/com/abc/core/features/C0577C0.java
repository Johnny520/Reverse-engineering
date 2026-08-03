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
    public final /* synthetic */ HomeAvatarHook f1716a;

    public C0577C0() {
        this.f1716a = HomeAvatarHook.f1723a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity r1, Bundle r2) {
        AbstractC0307g.m703e(r1, "a");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity r2) {
        AbstractC0307g.m703e(r2, "a");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity r2) {
        AbstractC0307g.m703e(r2, "a");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity r4) {
        AbstractC0307g.m703e(r4, "activity");
        HomeAvatarHook.f1722C = r4.getClass().getName();
        if (AbstractC0425j.m1005J0(HomeAvatarHook.f1722C, "LauncherUI", false) == false) goto L5;
    L8:
        this.f1716a.getClass();
        HomeAvatarHook.m1404k(r4);
        return;
    L5:
        if (AbstractC0425j.m1005J0(HomeAvatarHook.f1722C, "MainTabUI", false) == true) goto L8;
        this.f1716a.getClass();
        HomeAvatarHook.m1411r(false);
        AbstractC0358S.m898n(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity r2, Bundle r3) {
        AbstractC0307g.m703e(r2, "a");
        AbstractC0307g.m703e(r3, "b");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity r2) {
        AbstractC0307g.m703e(r2, "a");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity r2) {
        AbstractC0307g.m703e(r2, "a");
    }
}
