package com.abc.core.runtime;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: f0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0829h implements Application.ActivityLifecycleCallbacks {
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
    public final void onActivityResumed(Activity r2) {
        AbstractC0307g.m703e(r2, "activity");
        HookDiagnostics.m2151a(r2, "lifecycle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity r2, Bundle r3) {
        AbstractC0307g.m703e(r2, "a");
        AbstractC0307g.m703e(r3, "b");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity r2) {
        AbstractC0307g.m703e(r2, "a");
        HookDiagnostics.m2151a(r2, "started");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity r2) {
        AbstractC0307g.m703e(r2, "a");
    }
}
