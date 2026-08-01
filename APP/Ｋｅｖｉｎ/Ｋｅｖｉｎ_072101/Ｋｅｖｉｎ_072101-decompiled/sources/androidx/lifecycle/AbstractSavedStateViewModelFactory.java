package androidx.lifecycle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractSavedStateViewModelFactory extends androidx.lifecycle.ViewModelProvider.OnRequeryFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    static final java.lang.String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";
    private android.os.Bundle mDefaultArgs;
    private androidx.lifecycle.Lifecycle mLifecycle;
    private androidx.savedstate.SavedStateRegistry mSavedStateRegistry;

    public AbstractSavedStateViewModelFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public AbstractSavedStateViewModelFactory(androidx.savedstate.SavedStateRegistryOwner r2, android.os.Bundle r3) {
            r1 = this;
            r1.<init>()
            androidx.savedstate.SavedStateRegistry r0 = r2.getSavedStateRegistry()
            r1.mSavedStateRegistry = r0
            androidx.lifecycle.Lifecycle r0 = r2.getLifecycle()
            r1.mLifecycle = r0
            r1.mDefaultArgs = r3
            return
    }

    private <T extends androidx.lifecycle.ViewModel> T create(java.lang.String r4, java.lang.Class<T> r5) {
            r3 = this;
            androidx.savedstate.SavedStateRegistry r0 = r3.mSavedStateRegistry
            androidx.lifecycle.Lifecycle r1 = r3.mLifecycle
            android.os.Bundle r2 = r3.mDefaultArgs
            androidx.lifecycle.SavedStateHandleController r0 = androidx.lifecycle.LegacySavedStateHandleController.create(r0, r1, r4, r2)
            androidx.lifecycle.SavedStateHandle r1 = r0.getHandle()
            androidx.lifecycle.ViewModel r1 = r3.create(r4, r5, r1)
            java.lang.String r2 = "androidx.lifecycle.savedstate.vm.tag"
            r1.setTagIfAbsent(r2, r0)
            return r1
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r4) {
            r3 = this;
            java.lang.String r0 = r4.getCanonicalName()
            if (r0 == 0) goto L17
            androidx.lifecycle.Lifecycle r1 = r3.mLifecycle
            if (r1 == 0) goto Lf
            androidx.lifecycle.ViewModel r1 = r3.create(r0, r4)
            return r1
        Lf:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."
            r1.<init>(r2)
            throw r1
        L17:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Local and anonymous classes can not be ViewModels"
            r1.<init>(r2)
            throw r1
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r4, androidx.lifecycle.viewmodel.CreationExtras r5) {
            r3 = this;
            androidx.lifecycle.viewmodel.CreationExtras$Key<java.lang.String> r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L1c
            androidx.savedstate.SavedStateRegistry r1 = r3.mSavedStateRegistry
            if (r1 == 0) goto L13
            androidx.lifecycle.ViewModel r1 = r3.create(r0, r4)
            return r1
        L13:
            androidx.lifecycle.SavedStateHandle r1 = androidx.lifecycle.SavedStateHandleSupport.createSavedStateHandle(r5)
            androidx.lifecycle.ViewModel r1 = r3.create(r0, r4, r1)
            return r1
        L1c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "VIEW_MODEL_KEY must always be provided by ViewModelProvider"
            r1.<init>(r2)
            throw r1
    }

    protected abstract <T extends androidx.lifecycle.ViewModel> T create(java.lang.String r1, java.lang.Class<T> r2, androidx.lifecycle.SavedStateHandle r3);

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public void onRequery(androidx.lifecycle.ViewModel r3) {
            r2 = this;
            androidx.savedstate.SavedStateRegistry r0 = r2.mSavedStateRegistry
            if (r0 == 0) goto Lb
            androidx.savedstate.SavedStateRegistry r0 = r2.mSavedStateRegistry
            androidx.lifecycle.Lifecycle r1 = r2.mLifecycle
            androidx.lifecycle.LegacySavedStateHandleController.attachHandleIfNeeded(r3, r0, r1)
        Lb:
            return
    }
}
