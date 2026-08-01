package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛴᛲᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0354 implements android.app.Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static volatile xhss.C0354 f1309;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public android.app.Activity f1310;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public long f1311;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public android.app.Activity f1312;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static xhss.C0354 m711() {
            xhss.ᛴᛴᛲᛸ r0 = xhss.C0354.f1309
            if (r0 != 0) goto L19
            java.lang.Class<xhss.ᛴᛴᛲᛸ> r0 = xhss.C0354.class
            monitor-enter(r0)
            xhss.ᛴᛴᛲᛸ r1 = xhss.C0354.f1309     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            xhss.ᛴᛴᛲᛸ r1 = new xhss.ᛴᛴᛲᛸ     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            xhss.C0354.f1309 = r1     // Catch: java.lang.Throwable -> L13
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
            xhss.ᛴᛴᛲᛸ r0 = xhss.C0354.f1309
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
            android.app.Activity r0 = r1.f1312
            if (r0 == r2) goto L5
            return
        L5:
            r2 = 0
            r1.f1312 = r2
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity r3) {
            r2 = this;
            r2.f1310 = r3
            long r0 = java.lang.System.currentTimeMillis()
            r2.f1311 = r0
            android.app.Activity r0 = r2.f1312
            if (r0 == 0) goto Ld
            return
        Ld:
            r2.f1312 = r3
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
            r0.f1312 = r1
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r3) {
            r2 = this;
            android.app.Activity r0 = r2.f1310
            if (r0 == r3) goto L5
            return
        L5:
            r3 = 0
            r2.f1310 = r3
            r0 = 0
            r2.f1311 = r0
            return
    }
}
