package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.TargetApi(14)
public class b implements android.app.Application.ActivityLifecycleCallbacks {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity r2) {
            r1 = this;
            r0 = 0
            com.tendcloud.tenddata.ab.H = r0     // Catch: java.lang.Throwable -> L8
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL     // Catch: java.lang.Throwable -> L8
            com.tendcloud.tenddata.c.b(r2, r0)     // Catch: java.lang.Throwable -> L8
        L8:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity r3) {
            r2 = this;
            r0 = 1
            com.tendcloud.tenddata.ab.J = r0
            com.tendcloud.tenddata.ab.H = r0
            com.tendcloud.tenddata.a r1 = com.tendcloud.tenddata.a.UNIVERSAL     // Catch: java.lang.Throwable -> Lc
            com.tendcloud.tenddata.c.a(r3, r1)     // Catch: java.lang.Throwable -> Lc
            com.tendcloud.tenddata.ab.m = r0     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity r1) {
            r0 = this;
            return
    }
}
