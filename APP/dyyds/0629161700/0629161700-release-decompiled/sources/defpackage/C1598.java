package defpackage;

/* JADX INFO: renamed from: ᛸᲈᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1598 implements android.app.Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.C1377 f7050;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public android.app.Activity f7051;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public android.app.Application f7052;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r2) {
            r1 = this;
            android.app.Activity r0 = r1.f7051
            if (r0 == r2) goto L5
            return
        L5:
            ᛷᲁᲈᲇ r2 = r1.f7050
            if (r2 == 0) goto Lc
            r2.m2545()
        Lc:
            r1.m2890()
            r2 = 0
            r1.f7051 = r2
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r2) {
            r1 = this;
            android.app.Activity r0 = r1.f7051
            if (r0 == r2) goto L5
            goto L9
        L5:
            ᛷᲁᲈᲇ r1 = r1.f7050
            if (r1 != 0) goto La
        L9:
            return
        La:
            r1.m2545()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m2890() {
            r1 = this;
            r0 = 0
            r1.f7050 = r0
            android.app.Activity r0 = r1.f7051
            if (r0 != 0) goto L8
            return
        L8:
            r0.unregisterActivityLifecycleCallbacks(r1)
            return
    }
}
