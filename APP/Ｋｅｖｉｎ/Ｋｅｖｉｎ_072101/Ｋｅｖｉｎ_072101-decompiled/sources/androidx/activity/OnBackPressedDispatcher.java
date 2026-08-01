package androidx.activity;

/* JADX INFO: loaded from: classes2.dex */
public final class OnBackPressedDispatcher {
    private boolean mBackInvokedCallbackRegistered;
    private androidx.core.util.Consumer<java.lang.Boolean> mEnabledConsumer;
    private final java.lang.Runnable mFallbackOnBackPressed;
    private android.window.OnBackInvokedDispatcher mInvokedDispatcher;
    private android.window.OnBackInvokedCallback mOnBackInvokedCallback;
    final java.util.ArrayDeque<androidx.activity.OnBackPressedCallback> mOnBackPressedCallbacks;

    static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.window.OnBackInvokedCallback createOnBackInvokedCallback(java.lang.Runnable r1) {
                java.util.Objects.requireNonNull(r1)
                androidx.activity.OnBackPressedDispatcher$Api33Impl$$ExternalSyntheticLambda0 r0 = new androidx.activity.OnBackPressedDispatcher$Api33Impl$$ExternalSyntheticLambda0
                r0.<init>(r1)
                return r0
        }

        static void registerOnBackInvokedCallback(java.lang.Object r2, int r3, java.lang.Object r4) {
                r0 = r2
                android.window.OnBackInvokedDispatcher r0 = (android.window.OnBackInvokedDispatcher) r0
                r1 = r4
                android.window.OnBackInvokedCallback r1 = (android.window.OnBackInvokedCallback) r1
                r0.registerOnBackInvokedCallback(r3, r1)
                return
        }

        static void unregisterOnBackInvokedCallback(java.lang.Object r2, java.lang.Object r3) {
                r0 = r2
                android.window.OnBackInvokedDispatcher r0 = (android.window.OnBackInvokedDispatcher) r0
                r1 = r3
                android.window.OnBackInvokedCallback r1 = (android.window.OnBackInvokedCallback) r1
                r0.unregisterOnBackInvokedCallback(r1)
                return
        }
    }

    private class LifecycleOnBackPressedCancellable implements androidx.lifecycle.LifecycleEventObserver, androidx.activity.Cancellable {
        private androidx.activity.Cancellable mCurrentCancellable;
        private final androidx.lifecycle.Lifecycle mLifecycle;
        private final androidx.activity.OnBackPressedCallback mOnBackPressedCallback;
        final /* synthetic */ androidx.activity.OnBackPressedDispatcher this$0;

        LifecycleOnBackPressedCancellable(androidx.activity.OnBackPressedDispatcher r1, androidx.lifecycle.Lifecycle r2, androidx.activity.OnBackPressedCallback r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mLifecycle = r2
                r0.mOnBackPressedCallback = r3
                r2.addObserver(r0)
                return
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
                r1 = this;
                androidx.lifecycle.Lifecycle r0 = r1.mLifecycle
                r0.removeObserver(r1)
                androidx.activity.OnBackPressedCallback r0 = r1.mOnBackPressedCallback
                r0.removeCancellable(r1)
                androidx.activity.Cancellable r0 = r1.mCurrentCancellable
                if (r0 == 0) goto L16
                androidx.activity.Cancellable r0 = r1.mCurrentCancellable
                r0.cancel()
                r0 = 0
                r1.mCurrentCancellable = r0
            L16:
                return
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4) {
                r2 = this;
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_START
                if (r4 != r0) goto Lf
                androidx.activity.OnBackPressedDispatcher r0 = r2.this$0
                androidx.activity.OnBackPressedCallback r1 = r2.mOnBackPressedCallback
                androidx.activity.Cancellable r0 = r0.addCancellableCallback(r1)
                r2.mCurrentCancellable = r0
                goto L24
            Lf:
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                if (r4 != r0) goto L1d
                androidx.activity.Cancellable r0 = r2.mCurrentCancellable
                if (r0 == 0) goto L24
                androidx.activity.Cancellable r0 = r2.mCurrentCancellable
                r0.cancel()
                goto L24
            L1d:
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                if (r4 != r0) goto L24
                r2.cancel()
            L24:
                return
        }
    }

    private class OnBackPressedCancellable implements androidx.activity.Cancellable {
        private final androidx.activity.OnBackPressedCallback mOnBackPressedCallback;
        final /* synthetic */ androidx.activity.OnBackPressedDispatcher this$0;

        OnBackPressedCancellable(androidx.activity.OnBackPressedDispatcher r1, androidx.activity.OnBackPressedCallback r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mOnBackPressedCallback = r2
                return
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
                r2 = this;
                androidx.activity.OnBackPressedDispatcher r0 = r2.this$0
                java.util.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r0.mOnBackPressedCallbacks
                androidx.activity.OnBackPressedCallback r1 = r2.mOnBackPressedCallback
                r0.remove(r1)
                androidx.activity.OnBackPressedCallback r0 = r2.mOnBackPressedCallback
                r0.removeCancellable(r2)
                boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
                if (r0 == 0) goto L1f
                androidx.activity.OnBackPressedCallback r0 = r2.mOnBackPressedCallback
                r1 = 0
                r0.setIsEnabledConsumer(r1)
                androidx.activity.OnBackPressedDispatcher r0 = r2.this$0
                r0.updateBackInvokedCallbackState()
            L1f:
                return
        }
    }

    public OnBackPressedDispatcher() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public OnBackPressedDispatcher(java.lang.Runnable r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.mOnBackPressedCallbacks = r0
            r0 = 0
            r1.mBackInvokedCallbackRegistered = r0
            r1.mFallbackOnBackPressed = r2
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 == 0) goto L27
            androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticLambda0 r0 = new androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticLambda0
            r0.<init>(r1)
            r1.mEnabledConsumer = r0
            androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticLambda1 r0 = new androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticLambda1
            r0.<init>(r1)
            android.window.OnBackInvokedCallback r0 = androidx.activity.OnBackPressedDispatcher.Api33Impl.createOnBackInvokedCallback(r0)
            r1.mOnBackInvokedCallback = r0
        L27:
            return
    }

    public void addCallback(androidx.activity.OnBackPressedCallback r1) {
            r0 = this;
            r0.addCancellableCallback(r1)
            return
    }

    public void addCallback(androidx.lifecycle.LifecycleOwner r4, androidx.activity.OnBackPressedCallback r5) {
            r3 = this;
            androidx.lifecycle.Lifecycle r0 = r4.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r1 != r2) goto Ld
            return
        Ld:
            androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r1 = new androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            r1.<init>(r3, r0, r5)
            r5.addCancellable(r1)
            boolean r1 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r1 == 0) goto L23
            r3.updateBackInvokedCallbackState()
            androidx.core.util.Consumer<java.lang.Boolean> r1 = r3.mEnabledConsumer
            r5.setIsEnabledConsumer(r1)
        L23:
            return
    }

    androidx.activity.Cancellable addCancellableCallback(androidx.activity.OnBackPressedCallback r3) {
            r2 = this;
            java.util.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r2.mOnBackPressedCallbacks
            r0.add(r3)
            androidx.activity.OnBackPressedDispatcher$OnBackPressedCancellable r0 = new androidx.activity.OnBackPressedDispatcher$OnBackPressedCancellable
            r0.<init>(r2, r3)
            r3.addCancellable(r0)
            boolean r1 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r1 == 0) goto L1b
            r2.updateBackInvokedCallbackState()
            androidx.core.util.Consumer<java.lang.Boolean> r1 = r2.mEnabledConsumer
            r3.setIsEnabledConsumer(r1)
        L1b:
            return r0
    }

    public boolean hasEnabledCallbacks() {
            r2 = this;
            java.util.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r2.mOnBackPressedCallbacks
            java.util.Iterator r0 = r0.descendingIterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.activity.OnBackPressedCallback r1 = (androidx.activity.OnBackPressedCallback) r1
            boolean r1 = r1.isEnabled()
            if (r1 == 0) goto L6
            r1 = 1
            return r1
        L1a:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-activity-OnBackPressedDispatcher, reason: not valid java name */
    /* synthetic */ void m154lambda$new$0$androidxactivityOnBackPressedDispatcher(java.lang.Boolean r2) {
            r1 = this;
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 == 0) goto L9
            r1.updateBackInvokedCallbackState()
        L9:
            return
    }

    public void onBackPressed() {
            r3 = this;
            java.util.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r3.mOnBackPressedCallbacks
            java.util.Iterator r0 = r0.descendingIterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            androidx.activity.OnBackPressedCallback r1 = (androidx.activity.OnBackPressedCallback) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L1c
            r1.handleOnBackPressed()
            return
        L1c:
            goto L6
        L1d:
            java.lang.Runnable r1 = r3.mFallbackOnBackPressed
            if (r1 == 0) goto L26
            java.lang.Runnable r1 = r3.mFallbackOnBackPressed
            r1.run()
        L26:
            return
    }

    public void setOnBackInvokedDispatcher(android.window.OnBackInvokedDispatcher r1) {
            r0 = this;
            r0.mInvokedDispatcher = r1
            r0.updateBackInvokedCallbackState()
            return
    }

    void updateBackInvokedCallbackState() {
            r4 = this;
            boolean r0 = r4.hasEnabledCallbacks()
            android.window.OnBackInvokedDispatcher r1 = r4.mInvokedDispatcher
            if (r1 == 0) goto L29
            r1 = 0
            if (r0 == 0) goto L1a
            boolean r2 = r4.mBackInvokedCallbackRegistered
            if (r2 != 0) goto L1a
            android.window.OnBackInvokedDispatcher r2 = r4.mInvokedDispatcher
            android.window.OnBackInvokedCallback r3 = r4.mOnBackInvokedCallback
            androidx.activity.OnBackPressedDispatcher.Api33Impl.registerOnBackInvokedCallback(r2, r1, r3)
            r1 = 1
            r4.mBackInvokedCallbackRegistered = r1
            goto L29
        L1a:
            if (r0 != 0) goto L29
            boolean r2 = r4.mBackInvokedCallbackRegistered
            if (r2 == 0) goto L29
            android.window.OnBackInvokedDispatcher r2 = r4.mInvokedDispatcher
            android.window.OnBackInvokedCallback r3 = r4.mOnBackInvokedCallback
            androidx.activity.OnBackPressedDispatcher.Api33Impl.unregisterOnBackInvokedCallback(r2, r3)
            r4.mBackInvokedCallbackRegistered = r1
        L29:
            return
    }
}
