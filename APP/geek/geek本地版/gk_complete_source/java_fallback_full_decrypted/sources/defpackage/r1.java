package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r1 implements android.app.Application.ActivityLifecycleCallbacks {
    public java.lang.Object a;
    public android.app.Activity b;
    public final int c;
    public boolean d;
    public boolean e;
    public boolean f;

    public r1(android.app.Activity r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.d = r0
            r1.e = r0
            r1.f = r0
            r1.b = r2
            int r2 = r2.hashCode()
            r1.c = r2
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r2) {
            r1 = this;
            android.app.Activity r0 = r1.b
            if (r0 != r2) goto La
            r2 = 0
            r1.b = r2
            r2 = 1
            r1.e = r2
        La:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r6) {
            r5 = this;
            boolean r0 = r5.e
            if (r0 == 0) goto L40
            boolean r0 = r5.f
            if (r0 != 0) goto L40
            boolean r0 = r5.d
            if (r0 != 0) goto L40
            java.lang.Object r0 = r5.a
            java.lang.reflect.Field r1 = defpackage.s1.c     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L38
            if (r1 != r0) goto L40
            int r0 = r6.hashCode()     // Catch: java.lang.Throwable -> L38
            int r2 = r5.c
            if (r0 == r2) goto L1f
            goto L40
        L1f:
            java.lang.reflect.Field r0 = defpackage.s1.b     // Catch: java.lang.Throwable -> L38
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L38
            android.os.Handler r0 = defpackage.s1.g     // Catch: java.lang.Throwable -> L38
            h1 r2 = new h1     // Catch: java.lang.Throwable -> L38
            r3 = 3
            r4 = 0
            r2.<init>(r6, r1, r3, r4)     // Catch: java.lang.Throwable -> L38
            r0.postAtFrontOfQueue(r2)     // Catch: java.lang.Throwable -> L38
            r6 = 1
            r5.f = r6
            r6 = 0
            r5.a = r6
            return
        L38:
            r6 = move-exception
            java.lang.String r0 = "ActivityRecreator"
            java.lang.String r1 = "Exception while fetching field values"
            android.util.Log.e(r0, r1, r6)
        L40:
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
    public final void onActivityStarted(android.app.Activity r2) {
            r1 = this;
            android.app.Activity r0 = r1.b
            if (r0 != r2) goto L7
            r2 = 1
            r1.d = r2
        L7:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r1) {
            r0 = this;
            return
    }
}
