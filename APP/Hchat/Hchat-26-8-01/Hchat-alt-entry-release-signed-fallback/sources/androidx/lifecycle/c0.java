package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class c0 extends android.app.Fragment {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f280h = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.lifecycle.x f281g;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class a implements android.app.Application.ActivityLifecycleCallbacks {
        public static final androidx.lifecycle.b0 Companion = null;

        static {
                androidx.lifecycle.b0 r0 = new androidx.lifecycle.b0
                r0.<init>()
                androidx.lifecycle.c0.a.Companion = r0
                return
        }

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public static final void registerIn(android.app.Activity r1) {
                androidx.lifecycle.b0 r0 = androidx.lifecycle.c0.a.Companion
                r0.getClass()
                r1.getClass()
                androidx.lifecycle.c0$a r0 = new androidx.lifecycle.c0$a
                r0.<init>()
                androidx.lifecycle.a0.d(r1, r0)
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
                int r2 = androidx.lifecycle.c0.f280h
                androidx.lifecycle.k r2 = androidx.lifecycle.k.ON_CREATE
                androidx.lifecycle.z.a(r1, r2)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity r2) {
                r1 = this;
                r2.getClass()
                int r0 = androidx.lifecycle.c0.f280h
                androidx.lifecycle.k r0 = androidx.lifecycle.k.ON_RESUME
                androidx.lifecycle.z.a(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity r2) {
                r1 = this;
                r2.getClass()
                int r0 = androidx.lifecycle.c0.f280h
                androidx.lifecycle.k r0 = androidx.lifecycle.k.ON_START
                androidx.lifecycle.z.a(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(android.app.Activity r2) {
                r1 = this;
                r2.getClass()
                int r0 = androidx.lifecycle.c0.f280h
                androidx.lifecycle.k r0 = androidx.lifecycle.k.ON_DESTROY
                androidx.lifecycle.z.a(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(android.app.Activity r2) {
                r1 = this;
                r2.getClass()
                int r0 = androidx.lifecycle.c0.f280h
                androidx.lifecycle.k r0 = androidx.lifecycle.k.ON_PAUSE
                androidx.lifecycle.z.a(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(android.app.Activity r2) {
                r1 = this;
                r2.getClass()
                int r0 = androidx.lifecycle.c0.f280h
                androidx.lifecycle.k r0 = androidx.lifecycle.k.ON_STOP
                androidx.lifecycle.z.a(r2, r0)
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

    public c0() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void a(androidx.lifecycle.k r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L10
            android.app.Activity r0 = r2.getActivity()
            r0.getClass()
            androidx.lifecycle.z.a(r0, r3)
        L10:
            return
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(android.os.Bundle r1) {
            r0 = this;
            super.onActivityCreated(r1)
            androidx.lifecycle.k r1 = androidx.lifecycle.k.ON_CREATE
            r0.a(r1)
            return
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
            r1 = this;
            super.onDestroy()
            androidx.lifecycle.k r0 = androidx.lifecycle.k.ON_DESTROY
            r1.a(r0)
            r0 = 0
            r1.f281g = r0
            return
    }

    @Override // android.app.Fragment
    public final void onPause() {
            r1 = this;
            super.onPause()
            androidx.lifecycle.k r0 = androidx.lifecycle.k.ON_PAUSE
            r1.a(r0)
            return
    }

    @Override // android.app.Fragment
    public final void onResume() {
            r1 = this;
            super.onResume()
            androidx.lifecycle.x r0 = r1.f281g
            if (r0 == 0) goto Le
            java.lang.Object r0 = r0.f310h
            androidx.lifecycle.y r0 = (androidx.lifecycle.y) r0
            r0.a()
        Le:
            androidx.lifecycle.k r0 = androidx.lifecycle.k.ON_RESUME
            r1.a(r0)
            return
    }

    @Override // android.app.Fragment
    public final void onStart() {
            r3 = this;
            super.onStart()
            androidx.lifecycle.x r0 = r3.f281g
            if (r0 == 0) goto L21
            java.lang.Object r0 = r0.f310h
            androidx.lifecycle.y r0 = (androidx.lifecycle.y) r0
            int r1 = r0.f312g
            r2 = 1
            int r1 = r1 + r2
            r0.f312g = r1
            if (r1 != r2) goto L21
            boolean r1 = r0.f315j
            if (r1 == 0) goto L21
            androidx.lifecycle.s r1 = r0.f317l
            androidx.lifecycle.k r2 = androidx.lifecycle.k.ON_START
            r1.d(r2)
            r1 = 0
            r0.f315j = r1
        L21:
            androidx.lifecycle.k r0 = androidx.lifecycle.k.ON_START
            r3.a(r0)
            return
    }

    @Override // android.app.Fragment
    public final void onStop() {
            r1 = this;
            super.onStop()
            androidx.lifecycle.k r0 = androidx.lifecycle.k.ON_STOP
            r1.a(r0)
            return
    }
}
