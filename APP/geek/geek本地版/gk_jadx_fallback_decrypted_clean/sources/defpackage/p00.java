package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class p00 extends android.app.Fragment {
    public static final /* synthetic */ int b = 0;
    public defpackage.l0 a;

    public static final class a implements android.app.Application.ActivityLifecycleCallbacks {
        public static final defpackage.o00 Companion = null;

        static {
                o00 r0 = new o00
                r0.<init>()
                p00.a.Companion = r0
                return
        }

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public static final void registerIn(android.app.Activity r1) {
                o00 r0 = p00.a.Companion
                r0.getClass()
                java.lang.String r0 = "activity"
                defpackage.ip.o(r0, r1)
                p00$a r0 = new p00$a
                r0.<init>()
                defpackage.f0.i(r1, r0)
                return
        }

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
        public void onActivityPostCreated(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                java.lang.String r2 = "activity"
                defpackage.ip.o(r2, r1)
                int r2 = defpackage.p00.b
                iq r2 = defpackage.iq.ON_CREATE
                defpackage.n00.a(r1, r2)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                defpackage.ip.o(r0, r2)
                int r0 = defpackage.p00.b
                iq r0 = defpackage.iq.ON_RESUME
                defpackage.n00.a(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                defpackage.ip.o(r0, r2)
                int r0 = defpackage.p00.b
                iq r0 = defpackage.iq.ON_START
                defpackage.n00.a(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                defpackage.ip.o(r0, r2)
                int r0 = defpackage.p00.b
                iq r0 = defpackage.iq.ON_DESTROY
                defpackage.n00.a(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                defpackage.ip.o(r0, r2)
                int r0 = defpackage.p00.b
                iq r0 = defpackage.iq.ON_PAUSE
                defpackage.n00.a(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                defpackage.ip.o(r0, r2)
                int r0 = defpackage.p00.b
                iq r0 = defpackage.iq.ON_STOP
                defpackage.n00.a(r2, r0)
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
                java.lang.String r2 = "bundle"
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

    public p00() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void a(defpackage.iq r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L12
            android.app.Activity r0 = r2.getActivity()
            java.lang.String r1 = "activity"
            defpackage.ip.n(r1, r0)
            defpackage.n00.a(r0, r3)
        L12:
            return
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(android.os.Bundle r1) {
            r0 = this;
            super.onActivityCreated(r1)
            iq r1 = defpackage.iq.ON_CREATE
            r0.a(r1)
            return
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
            r1 = this;
            super.onDestroy()
            iq r0 = defpackage.iq.ON_DESTROY
            r1.a(r0)
            r0 = 0
            r1.a = r0
            return
    }

    @Override // android.app.Fragment
    public final void onPause() {
            r1 = this;
            super.onPause()
            iq r0 = defpackage.iq.ON_PAUSE
            r1.a(r0)
            return
    }

    @Override // android.app.Fragment
    public final void onResume() {
            r1 = this;
            super.onResume()
            l0 r0 = r1.a
            if (r0 == 0) goto Le
            java.lang.Object r0 = r0.b
            gy r0 = (defpackage.gy) r0
            r0.a()
        Le:
            iq r0 = defpackage.iq.ON_RESUME
            r1.a(r0)
            return
    }

    @Override // android.app.Fragment
    public final void onStart() {
            r3 = this;
            super.onStart()
            l0 r0 = r3.a
            if (r0 == 0) goto L21
            java.lang.Object r0 = r0.b
            gy r0 = (defpackage.gy) r0
            int r1 = r0.a
            r2 = 1
            int r1 = r1 + r2
            r0.a = r1
            if (r1 != r2) goto L21
            boolean r1 = r0.d
            if (r1 == 0) goto L21
            androidx.lifecycle.a r1 = r0.f
            iq r2 = defpackage.iq.ON_START
            r1.d(r2)
            r1 = 0
            r0.d = r1
        L21:
            iq r0 = defpackage.iq.ON_START
            r3.a(r0)
            return
    }

    @Override // android.app.Fragment
    public final void onStop() {
            r1 = this;
            super.onStop()
            iq r0 = defpackage.iq.ON_STOP
            r1.a(r0)
            return
    }
}
