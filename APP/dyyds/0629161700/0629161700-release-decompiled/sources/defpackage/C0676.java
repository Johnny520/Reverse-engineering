package defpackage;

/* JADX INFO: renamed from: ᛴᛵᛸᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0676 implements android.app.Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static volatile defpackage.C0676 f3258;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public long f3259;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public android.app.Activity f3260;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public android.app.Activity f3261;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C0676 m1522() {
            ᛴᛵᛸᛴ r0 = defpackage.C0676.f3258
            if (r0 != 0) goto L19
            java.lang.Class<ᛴᛵᛸᛴ> r0 = defpackage.C0676.class
            monitor-enter(r0)
            ᛴᛵᛸᛴ r1 = defpackage.C0676.f3258     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            ᛴᛵᛸᛴ r1 = new ᛴᛵᛸᛴ     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            defpackage.C0676.f3258 = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            ᛴᛵᛸᛴ r0 = defpackage.C0676.f3258
            return r0
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r2) {
            r1 = this;
            android.app.Activity r0 = r1.f3260
            if (r0 == r2) goto L5
            return
        L5:
            r2 = 0
            r1.f3260 = r2
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity r3) {
            r2 = this;
            r2.f3261 = r3
            long r0 = java.lang.System.currentTimeMillis()
            r2.f3259 = r0
            android.app.Activity r0 = r2.f3260
            if (r0 == 0) goto Ld
            return
        Ld:
            r2.f3260 = r3
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
            r0.f3260 = r1
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r3) {
            r2 = this;
            android.app.Activity r0 = r2.f3261
            if (r0 == r3) goto L5
            return
        L5:
            r3 = 0
            r2.f3261 = r3
            r0 = 0
            r2.f3259 = r0
            return
    }
}
