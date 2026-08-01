package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛲᛳᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0239 implements android.app.Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public android.app.Application f904;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public xhss.C0137 f905;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public android.app.Activity f906;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r2) {
            r1 = this;
            android.app.Activity r0 = r1.f906
            if (r0 == r2) goto L5
            return
        L5:
            xhss.ᛲᛲᲀᛷ r2 = r1.f905
            if (r2 == 0) goto Lc
            r2.m367()
        Lc:
            r1.m544()
            r2 = 0
            r1.f906 = r2
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r2) {
            r1 = this;
            android.app.Activity r0 = r1.f906
            if (r0 == r2) goto L5
            goto L9
        L5:
            xhss.ᛲᛲᲀᛷ r1 = r1.f905
            if (r1 != 0) goto La
        L9:
            return
        La:
            r1.m367()
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

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m544() {
            r1 = this;
            r0 = 0
            r1.f905 = r0
            android.app.Activity r0 = r1.f906
            if (r0 != 0) goto L8
            return
        L8:
            r0.unregisterActivityLifecycleCallbacks(r1)
            return
    }
}
