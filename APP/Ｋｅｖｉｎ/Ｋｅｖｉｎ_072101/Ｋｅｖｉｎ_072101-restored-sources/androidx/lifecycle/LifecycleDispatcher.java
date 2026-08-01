package androidx.lifecycle;

/* JADX INFO: loaded from: classes2.dex */
class LifecycleDispatcher {
    private static java.util.concurrent.atomic.AtomicBoolean sInitialized;

    static class DispatcherActivityCallback extends androidx.lifecycle.EmptyActivityLifecycleCallbacks {
        DispatcherActivityCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                androidx.lifecycle.ReportFragment.injectIfNeededIn(r1)
                return
        }

        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity r1) {
                r0 = this;
                return
        }
    }

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            androidx.lifecycle.LifecycleDispatcher.sInitialized = r0
            return
    }

    private LifecycleDispatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    static void init(android.content.Context r2) {
            java.util.concurrent.atomic.AtomicBoolean r0 = androidx.lifecycle.LifecycleDispatcher.sInitialized
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto La
            return
        La:
            android.content.Context r0 = r2.getApplicationContext()
            android.app.Application r0 = (android.app.Application) r0
            androidx.lifecycle.LifecycleDispatcher$DispatcherActivityCallback r1 = new androidx.lifecycle.LifecycleDispatcher$DispatcherActivityCallback
            r1.<init>()
            r0.registerActivityLifecycleCallbacks(r1)
            return
    }
}
