package androidx.lifecycle;

/* JADX INFO: loaded from: classes2.dex */
public class ReportFragment extends android.app.Fragment {
    private static final java.lang.String REPORT_FRAGMENT_TAG = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
    private androidx.lifecycle.ReportFragment.ActivityInitializationListener mProcessListener;

    interface ActivityInitializationListener {
        void onCreate();

        void onResume();

        void onStart();
    }

    static class LifecycleCallbacks implements android.app.Application.ActivityLifecycleCallbacks {
        LifecycleCallbacks() {
                r0 = this;
                r0.<init>()
                return
        }

        static void registerIn(android.app.Activity r1) {
                androidx.lifecycle.ReportFragment$LifecycleCallbacks r0 = new androidx.lifecycle.ReportFragment$LifecycleCallbacks
                r0.<init>()
                r1.registerActivityLifecycleCallbacks(r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(android.app.Activity r2, android.os.Bundle r3) {
                r1 = this;
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
                androidx.lifecycle.ReportFragment.dispatch(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity r2) {
                r1 = this;
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
                androidx.lifecycle.ReportFragment.dispatch(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity r2) {
                r1 = this;
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_START
                androidx.lifecycle.ReportFragment.dispatch(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(android.app.Activity r2) {
                r1 = this;
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                androidx.lifecycle.ReportFragment.dispatch(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(android.app.Activity r2) {
                r1 = this;
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
                androidx.lifecycle.ReportFragment.dispatch(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(android.app.Activity r2) {
                r1 = this;
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                androidx.lifecycle.ReportFragment.dispatch(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity r1) {
                r0 = this;
                return
        }
    }

    public ReportFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    static void dispatch(android.app.Activity r2, androidx.lifecycle.Lifecycle.Event r3) {
            boolean r0 = r2 instanceof androidx.lifecycle.LifecycleRegistryOwner
            if (r0 == 0) goto Lf
            r0 = r2
            androidx.lifecycle.LifecycleRegistryOwner r0 = (androidx.lifecycle.LifecycleRegistryOwner) r0
            androidx.lifecycle.LifecycleRegistry r0 = r0.getLifecycle()
            r0.handleLifecycleEvent(r3)
            return
        Lf:
            boolean r0 = r2 instanceof androidx.lifecycle.LifecycleOwner
            if (r0 == 0) goto L24
            r0 = r2
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            boolean r1 = r0 instanceof androidx.lifecycle.LifecycleRegistry
            if (r1 == 0) goto L24
            r1 = r0
            androidx.lifecycle.LifecycleRegistry r1 = (androidx.lifecycle.LifecycleRegistry) r1
            r1.handleLifecycleEvent(r3)
        L24:
            return
    }

    private void dispatch(androidx.lifecycle.Lifecycle.Event r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto Ld
            android.app.Activity r0 = r2.getActivity()
            dispatch(r0, r3)
        Ld:
            return
    }

    private void dispatchCreate(androidx.lifecycle.ReportFragment.ActivityInitializationListener r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.onCreate()
        L5:
            return
    }

    private void dispatchResume(androidx.lifecycle.ReportFragment.ActivityInitializationListener r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.onResume()
        L5:
            return
    }

    private void dispatchStart(androidx.lifecycle.ReportFragment.ActivityInitializationListener r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.onStart()
        L5:
            return
    }

    static androidx.lifecycle.ReportFragment get(android.app.Activity r2) {
            android.app.FragmentManager r0 = r2.getFragmentManager()
            java.lang.String r1 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
            android.app.Fragment r0 = r0.findFragmentByTag(r1)
            androidx.lifecycle.ReportFragment r0 = (androidx.lifecycle.ReportFragment) r0
            return r0
    }

    public static void injectIfNeededIn(android.app.Activity r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L9
            androidx.lifecycle.ReportFragment.LifecycleCallbacks.registerIn(r4)
        L9:
            android.app.FragmentManager r0 = r4.getFragmentManager()
            java.lang.String r1 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
            android.app.Fragment r2 = r0.findFragmentByTag(r1)
            if (r2 != 0) goto L28
            android.app.FragmentTransaction r2 = r0.beginTransaction()
            androidx.lifecycle.ReportFragment r3 = new androidx.lifecycle.ReportFragment
            r3.<init>()
            android.app.FragmentTransaction r1 = r2.add(r3, r1)
            r1.commit()
            r0.executePendingTransactions()
        L28:
            return
    }

    @Override // android.app.Fragment
    public void onActivityCreated(android.os.Bundle r2) {
            r1 = this;
            super.onActivityCreated(r2)
            androidx.lifecycle.ReportFragment$ActivityInitializationListener r0 = r1.mProcessListener
            r1.dispatchCreate(r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r1.dispatch(r0)
            return
    }

    @Override // android.app.Fragment
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            r1.dispatch(r0)
            r0 = 0
            r1.mProcessListener = r0
            return
    }

    @Override // android.app.Fragment
    public void onPause() {
            r1 = this;
            super.onPause()
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
            r1.dispatch(r0)
            return
    }

    @Override // android.app.Fragment
    public void onResume() {
            r1 = this;
            super.onResume()
            androidx.lifecycle.ReportFragment$ActivityInitializationListener r0 = r1.mProcessListener
            r1.dispatchResume(r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r1.dispatch(r0)
            return
    }

    @Override // android.app.Fragment
    public void onStart() {
            r1 = this;
            super.onStart()
            androidx.lifecycle.ReportFragment$ActivityInitializationListener r0 = r1.mProcessListener
            r1.dispatchStart(r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_START
            r1.dispatch(r0)
            return
    }

    @Override // android.app.Fragment
    public void onStop() {
            r1 = this;
            super.onStop()
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r1.dispatch(r0)
            return
    }

    void setProcessListener(androidx.lifecycle.ReportFragment.ActivityInitializationListener r1) {
            r0 = this;
            r0.mProcessListener = r1
            return
    }
}
