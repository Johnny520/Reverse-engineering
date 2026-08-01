package androidx.lifecycle;

/* JADX INFO: loaded from: classes2.dex */
final class SavedStateHandleController implements androidx.lifecycle.LifecycleEventObserver {
    private final androidx.lifecycle.SavedStateHandle mHandle;
    private boolean mIsAttached;
    private final java.lang.String mKey;

    SavedStateHandleController(java.lang.String r2, androidx.lifecycle.SavedStateHandle r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mIsAttached = r0
            r1.mKey = r2
            r1.mHandle = r3
            return
    }

    void attachToLifecycle(androidx.savedstate.SavedStateRegistry r3, androidx.lifecycle.Lifecycle r4) {
            r2 = this;
            boolean r0 = r2.mIsAttached
            if (r0 != 0) goto L16
            r0 = 1
            r2.mIsAttached = r0
            r4.addObserver(r2)
            java.lang.String r0 = r2.mKey
            androidx.lifecycle.SavedStateHandle r1 = r2.mHandle
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r1 = r1.savedStateProvider()
            r3.registerSavedStateProvider(r0, r1)
            return
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already attached to lifecycleOwner"
            r0.<init>(r1)
            throw r0
    }

    androidx.lifecycle.SavedStateHandle getHandle() {
            r1 = this;
            androidx.lifecycle.SavedStateHandle r0 = r1.mHandle
            return r0
    }

    boolean isAttached() {
            r1 = this;
            boolean r0 = r1.mIsAttached
            return r0
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
            r1 = this;
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r3 != r0) goto Le
            r0 = 0
            r1.mIsAttached = r0
            androidx.lifecycle.Lifecycle r0 = r2.getLifecycle()
            r0.removeObserver(r1)
        Le:
            return
    }
}
