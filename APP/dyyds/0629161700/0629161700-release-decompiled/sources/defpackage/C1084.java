package defpackage;

/* JADX INFO: renamed from: ᛶᛶᛱᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1084 implements android.app.Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public android.app.Activity f4870;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public java.lang.ref.WeakReference f4871;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r2) {
            r1 = this;
            android.app.Activity r0 = r1.f4870
            if (r0 == r2) goto L5
            goto L15
        L5:
            r2 = 0
            r1.f4870 = r2
            java.lang.ref.WeakReference r0 = r1.f4871
            if (r0 != 0) goto Ld
            goto L15
        Ld:
            java.lang.Object r0 = r0.get()
            ᲁᛶᲁ r0 = (defpackage.C1876) r0
            if (r0 != 0) goto L16
        L15:
            return
        L16:
            r0.m3283()
            r1.f4871 = r2
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r2) {
            r1 = this;
            android.app.Activity r0 = r1.f4870
            if (r0 != r2) goto L21
            boolean r2 = r0.isFinishing()
            if (r2 != 0) goto Lb
            goto L21
        Lb:
            java.lang.ref.WeakReference r1 = r1.f4871
            if (r1 != 0) goto L10
            goto L21
        L10:
            java.lang.Object r1 = r1.get()
            ᲁᛶᲁ r1 = (defpackage.C1876) r1
            if (r1 != 0) goto L19
            goto L21
        L19:
            boolean r2 = r1.f8147
            if (r2 != 0) goto L1e
            goto L21
        L1e:
            r1.m3284()
        L21:
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
}
