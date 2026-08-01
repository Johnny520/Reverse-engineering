package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class jn1 extends android.app.Fragment {

    /* JADX INFO: renamed from: ε */
    public static final /* synthetic */ int f5528 = 0;

    /* JADX INFO: renamed from: jn1$α */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class C0438 implements android.app.Application.ActivityLifecycleCallbacks {
        public static final p000.in1 Companion = null;

        static {
                in1 r0 = new in1
                r0.<init>()
                p000.jn1.C0438.Companion = r0
                return
        }

        public C0438() {
                r0 = this;
                r0.<init>()
                return
        }

        public static final void registerIn(android.app.Activity r1) {
                in1 r0 = p000.jn1.C0438.Companion
                r0.getClass()
                r1.getClass()
                jn1$α r0 = new jn1$α
                r0.<init>()
                r1.registerActivityLifecycleCallbacks(r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                r1.getClass()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                r1.getClass()
                int r0 = p000.jn1.f5528
                br0 r0 = p000.br0.ON_CREATE
                p000.hn1.m2523(r1, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                int r0 = p000.jn1.f5528
                br0 r0 = p000.br0.ON_RESUME
                p000.hn1.m2523(r1, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                int r0 = p000.jn1.f5528
                br0 r0 = p000.br0.ON_START
                p000.hn1.m2523(r1, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                int r0 = p000.jn1.f5528
                br0 r0 = p000.br0.ON_DESTROY
                p000.hn1.m2523(r1, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                int r0 = p000.jn1.f5528
                br0 r0 = p000.br0.ON_PAUSE
                p000.hn1.m2523(r1, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                int r0 = p000.jn1.f5528
                br0 r0 = p000.br0.ON_STOP
                p000.hn1.m2523(r1, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                return
        }
    }

    public jn1() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(android.os.Bundle r1) {
            r0 = this;
            super.onActivityCreated(r1)
            return
    }

    @Override // android.app.Fragment
    public final void onPause() {
            r0 = this;
            super.onPause()
            return
    }

    @Override // android.app.Fragment
    public final void onResume() {
            r0 = this;
            super.onResume()
            return
    }

    @Override // android.app.Fragment
    public final void onStart() {
            r0 = this;
            super.onStart()
            return
    }

    @Override // android.app.Fragment
    public final void onStop() {
            r0 = this;
            super.onStop()
            return
    }
}
