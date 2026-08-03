package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/lifecycle/l;", "Landroid/app/Fragment;", "<init>", "()V", "a", "b", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class l extends android.app.Fragment {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.j.b f938a;

    public static final class a {
        public static void a(android.app.Activity r1, androidx.lifecycle.e.a r2) {
                java.lang.String r0 = "event"
                a.C0193i9.e(r2, r0)
                boolean r0 = r1 instanceof a.InterfaceC0497z9
                if (r0 == 0) goto L13
                a.z9 r1 = (a.InterfaceC0497z9) r1
                androidx.lifecycle.h r1 = r1.getLifecycle()
                r1.f(r2)
                return
            L13:
                boolean r0 = r1 instanceof a.InterfaceC0479y9
                if (r0 == 0) goto L26
                a.y9 r1 = (a.InterfaceC0479y9) r1
                androidx.lifecycle.e r1 = r1.getLifecycle()
                boolean r0 = r1 instanceof androidx.lifecycle.h
                if (r0 == 0) goto L26
                androidx.lifecycle.h r1 = (androidx.lifecycle.h) r1
                r1.f(r2)
            L26:
                return
        }

        public static void b(android.app.Activity r3) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L13
                androidx.lifecycle.l$b$a r0 = androidx.lifecycle.l.b.Companion
                r0.getClass()
                androidx.lifecycle.l$b r0 = new androidx.lifecycle.l$b
                r0.<init>()
                a.E.i(r3, r0)
            L13:
                android.app.FragmentManager r3 = r3.getFragmentManager()
                java.lang.String r0 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
                android.app.Fragment r1 = r3.findFragmentByTag(r0)
                if (r1 != 0) goto L32
                android.app.FragmentTransaction r1 = r3.beginTransaction()
                androidx.lifecycle.l r2 = new androidx.lifecycle.l
                r2.<init>()
                android.app.FragmentTransaction r0 = r1.add(r2, r0)
                r0.commit()
                r3.executePendingTransactions()
            L32:
                return
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\nJ\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u000e¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/l$b;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "bundle", "La/Wf;", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "savedInstanceState", "onActivityPostCreated", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityPostStarted", "onActivityResumed", "onActivityPostResumed", "onActivityPrePaused", "onActivityPaused", "onActivityPreStopped", "onActivityStopped", "onActivitySaveInstanceState", "onActivityPreDestroyed", "onActivityDestroyed", "Companion", "a", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements android.app.Application.ActivityLifecycleCallbacks {
        public static final androidx.lifecycle.l.b.a Companion = null;

        public static final class a {
        }

        static {
                androidx.lifecycle.l$b$a r0 = new androidx.lifecycle.l$b$a
                r0.<init>()
                androidx.lifecycle.l.b.Companion = r0
                return
        }

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        public static final void registerIn(android.app.Activity r1) {
                androidx.lifecycle.l$b$a r0 = androidx.lifecycle.l.b.Companion
                r0.getClass()
                java.lang.String r0 = "activity"
                a.C0193i9.e(r1, r0)
                androidx.lifecycle.l$b r0 = new androidx.lifecycle.l$b
                r0.<init>()
                a.E.i(r1, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                java.lang.String r2 = "activity"
                a.C0193i9.e(r1, r2)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                a.C0193i9.e(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                a.C0193i9.e(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                java.lang.String r2 = "activity"
                a.C0193i9.e(r1, r2)
                int r2 = androidx.lifecycle.l.b
                androidx.lifecycle.e$a r2 = androidx.lifecycle.e.a.ON_CREATE
                androidx.lifecycle.l.a.a(r1, r2)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                a.C0193i9.e(r2, r0)
                int r0 = androidx.lifecycle.l.b
                androidx.lifecycle.e$a r0 = androidx.lifecycle.e.a.ON_RESUME
                androidx.lifecycle.l.a.a(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                a.C0193i9.e(r2, r0)
                int r0 = androidx.lifecycle.l.b
                androidx.lifecycle.e$a r0 = androidx.lifecycle.e.a.ON_START
                androidx.lifecycle.l.a.a(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                a.C0193i9.e(r2, r0)
                int r0 = androidx.lifecycle.l.b
                androidx.lifecycle.e$a r0 = androidx.lifecycle.e.a.ON_DESTROY
                androidx.lifecycle.l.a.a(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                a.C0193i9.e(r2, r0)
                int r0 = androidx.lifecycle.l.b
                androidx.lifecycle.e$a r0 = androidx.lifecycle.e.a.ON_PAUSE
                androidx.lifecycle.l.a.a(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                a.C0193i9.e(r2, r0)
                int r0 = androidx.lifecycle.l.b
                androidx.lifecycle.e$a r0 = androidx.lifecycle.e.a.ON_STOP
                androidx.lifecycle.l.a.a(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                a.C0193i9.e(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity r2, android.os.Bundle r3) {
                r1 = this;
                java.lang.String r0 = "activity"
                a.C0193i9.e(r2, r0)
                java.lang.String r2 = "bundle"
                a.C0193i9.e(r3, r2)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                a.C0193i9.e(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                a.C0193i9.e(r2, r0)
                return
        }
    }

    public l() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void a(androidx.lifecycle.e.a r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L12
            android.app.Activity r0 = r2.getActivity()
            java.lang.String r1 = "activity"
            a.C0193i9.d(r0, r1)
            androidx.lifecycle.l.a.a(r0, r3)
        L12:
            return
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(android.os.Bundle r1) {
            r0 = this;
            super.onActivityCreated(r1)
            androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_CREATE
            r0.a(r1)
            return
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
            r1 = this;
            super.onDestroy()
            androidx.lifecycle.e$a r0 = androidx.lifecycle.e.a.ON_DESTROY
            r1.a(r0)
            r0 = 0
            r1.f938a = r0
            return
    }

    @Override // android.app.Fragment
    public final void onPause() {
            r1 = this;
            super.onPause()
            androidx.lifecycle.e$a r0 = androidx.lifecycle.e.a.ON_PAUSE
            r1.a(r0)
            return
    }

    @Override // android.app.Fragment
    public final void onResume() {
            r1 = this;
            super.onResume()
            androidx.lifecycle.j$b r0 = r1.f938a
            if (r0 == 0) goto Lc
            androidx.lifecycle.j r0 = r0.f937a
            r0.a()
        Lc:
            androidx.lifecycle.e$a r0 = androidx.lifecycle.e.a.ON_RESUME
            r1.a(r0)
            return
    }

    @Override // android.app.Fragment
    public final void onStart() {
            r3 = this;
            super.onStart()
            androidx.lifecycle.j$b r0 = r3.f938a
            if (r0 == 0) goto L1f
            androidx.lifecycle.j r0 = r0.f937a
            int r1 = r0.f936a
            r2 = 1
            int r1 = r1 + r2
            r0.f936a = r1
            if (r1 != r2) goto L1f
            boolean r1 = r0.d
            if (r1 == 0) goto L1f
            androidx.lifecycle.h r1 = r0.f
            androidx.lifecycle.e$a r2 = androidx.lifecycle.e.a.ON_START
            r1.f(r2)
            r1 = 0
            r0.d = r1
        L1f:
            androidx.lifecycle.e$a r0 = androidx.lifecycle.e.a.ON_START
            r3.a(r0)
            return
    }

    @Override // android.app.Fragment
    public final void onStop() {
            r1 = this;
            super.onStop()
            androidx.lifecycle.e$a r0 = androidx.lifecycle.e.a.ON_STOP
            r1.a(r0)
            return
    }
}
