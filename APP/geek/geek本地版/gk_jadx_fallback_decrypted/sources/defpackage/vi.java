package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class vi implements android.app.Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            java.lang.String r2 = "activity"
            defpackage.ip.o(r2, r1)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity r2) {
            r1 = this;
            java.lang.String r0 = "activity"
            defpackage.ip.o(r0, r2)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity r2) {
            r1 = this;
            java.lang.String r0 = "activity"
            defpackage.ip.o(r0, r2)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity r2) {
            r1 = this;
            java.lang.String r0 = "activity"
            defpackage.ip.o(r0, r2)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity r2, android.os.Bundle r3) {
            r1 = this;
            java.lang.String r0 = "activity"
            defpackage.ip.o(r0, r2)
            java.lang.String r2 = "outState"
            defpackage.ip.o(r2, r3)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity r2) {
            r1 = this;
            java.lang.String r0 = "activity"
            defpackage.ip.o(r0, r2)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity r2) {
            r1 = this;
            java.lang.String r0 = "activity"
            defpackage.ip.o(r0, r2)
            return
    }
}
