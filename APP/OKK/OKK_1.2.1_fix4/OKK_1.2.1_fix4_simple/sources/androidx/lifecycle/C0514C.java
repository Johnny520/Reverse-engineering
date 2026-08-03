package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import p001A0.AbstractC0016B;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: androidx.lifecycle.C */
/* JADX INFO: loaded from: classes.dex */
public final class C0514C implements Application.ActivityLifecycleCallbacks {
    public static final C0513B Companion = null;

    static {
        Companion = new C0513B();
    }

    public C0514C() {
    }

    public static final void registerIn(Activity r1) {
        Companion.getClass();
        AbstractC0307g.m703e(r1, "activity");
        AbstractC0016B.m38k(r1, new C0514C());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity r1, Bundle r2) {
        AbstractC0307g.m703e(r1, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity r2) {
        AbstractC0307g.m703e(r2, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity r2) {
        AbstractC0307g.m703e(r2, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity r1, Bundle r2) {
        AbstractC0307g.m703e(r1, "activity");
        int r22 = FragmentC0515D.f1457b;
        AbstractC0517F.m1246c(r1, EnumC0535l.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity r2) {
        AbstractC0307g.m703e(r2, "activity");
        int r02 = FragmentC0515D.f1457b;
        AbstractC0517F.m1246c(r2, EnumC0535l.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity r2) {
        AbstractC0307g.m703e(r2, "activity");
        int r02 = FragmentC0515D.f1457b;
        AbstractC0517F.m1246c(r2, EnumC0535l.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity r2) {
        AbstractC0307g.m703e(r2, "activity");
        int r02 = FragmentC0515D.f1457b;
        AbstractC0517F.m1246c(r2, EnumC0535l.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity r2) {
        AbstractC0307g.m703e(r2, "activity");
        int r02 = FragmentC0515D.f1457b;
        AbstractC0517F.m1246c(r2, EnumC0535l.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity r2) {
        AbstractC0307g.m703e(r2, "activity");
        int r02 = FragmentC0515D.f1457b;
        AbstractC0517F.m1246c(r2, EnumC0535l.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity r2) {
        AbstractC0307g.m703e(r2, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity r2, Bundle r3) {
        AbstractC0307g.m703e(r2, "activity");
        AbstractC0307g.m703e(r3, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity r2) {
        AbstractC0307g.m703e(r2, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity r2) {
        AbstractC0307g.m703e(r2, "activity");
    }
}
