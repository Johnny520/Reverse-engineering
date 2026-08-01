package androidx.fragment.app;

/* JADX INFO: loaded from: classes2.dex */
class FragmentViewLifecycleOwner implements androidx.lifecycle.HasDefaultViewModelProviderFactory, androidx.savedstate.SavedStateRegistryOwner, androidx.lifecycle.ViewModelStoreOwner {
    private androidx.lifecycle.ViewModelProvider.Factory mDefaultFactory;
    private final androidx.fragment.app.Fragment mFragment;
    private androidx.lifecycle.LifecycleRegistry mLifecycleRegistry;
    private androidx.savedstate.SavedStateRegistryController mSavedStateRegistryController;
    private final androidx.lifecycle.ViewModelStore mViewModelStore;

    FragmentViewLifecycleOwner(androidx.fragment.app.Fragment r2, androidx.lifecycle.ViewModelStore r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mLifecycleRegistry = r0
            r1.mSavedStateRegistryController = r0
            r1.mFragment = r2
            r1.mViewModelStore = r3
            return
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
            r5 = this;
            androidx.fragment.app.Fragment r0 = r5.mFragment
            androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
            androidx.fragment.app.Fragment r1 = r5.mFragment
            androidx.lifecycle.ViewModelProvider$Factory r1 = r1.mDefaultFactory
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L13
            r5.mDefaultFactory = r0
            return r0
        L13:
            androidx.lifecycle.ViewModelProvider$Factory r1 = r5.mDefaultFactory
            if (r1 != 0) goto L43
            r1 = 0
            androidx.fragment.app.Fragment r2 = r5.mFragment
            android.content.Context r2 = r2.requireContext()
            android.content.Context r2 = r2.getApplicationContext()
        L22:
            boolean r3 = r2 instanceof android.content.ContextWrapper
            if (r3 == 0) goto L36
            boolean r3 = r2 instanceof android.app.Application
            if (r3 == 0) goto L2e
            r1 = r2
            android.app.Application r1 = (android.app.Application) r1
            goto L36
        L2e:
            r3 = r2
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            android.content.Context r2 = r3.getBaseContext()
            goto L22
        L36:
            androidx.lifecycle.SavedStateViewModelFactory r3 = new androidx.lifecycle.SavedStateViewModelFactory
            androidx.fragment.app.Fragment r4 = r5.mFragment
            android.os.Bundle r4 = r4.getArguments()
            r3.<init>(r1, r5, r4)
            r5.mDefaultFactory = r3
        L43:
            androidx.lifecycle.ViewModelProvider$Factory r1 = r5.mDefaultFactory
            return r1
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            r1.initialize()
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            return r0
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
            r1 = this;
            r1.initialize()
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            androidx.savedstate.SavedStateRegistry r0 = r0.getSavedStateRegistry()
            return r0
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public androidx.lifecycle.ViewModelStore getViewModelStore() {
            r1 = this;
            r1.initialize()
            androidx.lifecycle.ViewModelStore r0 = r1.mViewModelStore
            return r0
    }

    void handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event r2) {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            r0.handleLifecycleEvent(r2)
            return
    }

    void initialize() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            if (r0 != 0) goto L11
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1.mLifecycleRegistry = r0
            androidx.savedstate.SavedStateRegistryController r0 = androidx.savedstate.SavedStateRegistryController.create(r1)
            r1.mSavedStateRegistryController = r0
        L11:
            return
    }

    boolean isInitialized() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    void performRestore(android.os.Bundle r2) {
            r1 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            r0.performRestore(r2)
            return
    }

    void performSave(android.os.Bundle r2) {
            r1 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            r0.performSave(r2)
            return
    }

    void setCurrentState(androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            r0.setCurrentState(r2)
            return
    }
}
