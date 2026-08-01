package androidx.activity;

/* JADX INFO: loaded from: classes2.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements androidx.activity.contextaware.ContextAware, androidx.lifecycle.LifecycleOwner, androidx.lifecycle.ViewModelStoreOwner, androidx.lifecycle.HasDefaultViewModelProviderFactory, androidx.savedstate.SavedStateRegistryOwner, androidx.activity.OnBackPressedDispatcherOwner, androidx.activity.result.ActivityResultRegistryOwner, androidx.activity.result.ActivityResultCaller, androidx.core.content.OnConfigurationChangedProvider, androidx.core.content.OnTrimMemoryProvider, androidx.core.app.OnNewIntentProvider, androidx.core.app.OnMultiWindowModeChangedProvider, androidx.core.app.OnPictureInPictureModeChangedProvider, androidx.core.view.MenuHost {
    private static final java.lang.String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final androidx.activity.result.ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final androidx.activity.contextaware.ContextAwareHelper mContextAwareHelper;
    private androidx.lifecycle.ViewModelProvider.Factory mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    private final androidx.lifecycle.LifecycleRegistry mLifecycleRegistry;
    private final androidx.core.view.MenuHostHelper mMenuHostHelper;
    private final java.util.concurrent.atomic.AtomicInteger mNextLocalRequestCode;
    private final androidx.activity.OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.res.Configuration>> mOnConfigurationChangedListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo>> mOnMultiWindowModeChangedListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.Intent>> mOnNewIntentListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo>> mOnPictureInPictureModeChangedListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<java.lang.Integer>> mOnTrimMemoryListeners;
    final androidx.savedstate.SavedStateRegistryController mSavedStateRegistryController;
    private androidx.lifecycle.ViewModelStore mViewModelStore;






    static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void cancelPendingInputEvents(android.view.View r0) {
                r0.cancelPendingInputEvents()
                return
        }
    }

    static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.window.OnBackInvokedDispatcher getOnBackInvokedDispatcher(android.app.Activity r1) {
                android.window.OnBackInvokedDispatcher r0 = r1.getOnBackInvokedDispatcher()
                return r0
        }
    }

    static final class NonConfigurationInstances {
        java.lang.Object custom;
        androidx.lifecycle.ViewModelStore viewModelStore;

        NonConfigurationInstances() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ComponentActivity() {
            r4 = this;
            r4.<init>()
            androidx.activity.contextaware.ContextAwareHelper r0 = new androidx.activity.contextaware.ContextAwareHelper
            r0.<init>()
            r4.mContextAwareHelper = r0
            androidx.core.view.MenuHostHelper r0 = new androidx.core.view.MenuHostHelper
            androidx.activity.ComponentActivity$$ExternalSyntheticLambda0 r1 = new androidx.activity.ComponentActivity$$ExternalSyntheticLambda0
            r1.<init>(r4)
            r0.<init>(r1)
            r4.mMenuHostHelper = r0
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r4)
            r4.mLifecycleRegistry = r0
            androidx.savedstate.SavedStateRegistryController r0 = androidx.savedstate.SavedStateRegistryController.create(r4)
            r4.mSavedStateRegistryController = r0
            androidx.activity.OnBackPressedDispatcher r0 = new androidx.activity.OnBackPressedDispatcher
            androidx.activity.ComponentActivity$1 r1 = new androidx.activity.ComponentActivity$1
            r1.<init>(r4)
            r0.<init>(r1)
            r4.mOnBackPressedDispatcher = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r4.mNextLocalRequestCode = r0
            androidx.activity.ComponentActivity$2 r0 = new androidx.activity.ComponentActivity$2
            r0.<init>(r4)
            r4.mActivityResultRegistry = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r4.mOnConfigurationChangedListeners = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r4.mOnTrimMemoryListeners = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r4.mOnNewIntentListeners = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r4.mOnMultiWindowModeChangedListeners = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r4.mOnPictureInPictureModeChangedListeners = r0
            r0 = 0
            r4.mDispatchingOnMultiWindowModeChanged = r0
            r4.mDispatchingOnPictureInPictureModeChanged = r0
            androidx.lifecycle.Lifecycle r0 = r4.getLifecycle()
            if (r0 == 0) goto Lb1
        L6d:
            androidx.lifecycle.Lifecycle r1 = r4.getLifecycle()
            androidx.activity.ComponentActivity$3 r2 = new androidx.activity.ComponentActivity$3
            r2.<init>(r4)
            r1.addObserver(r2)
            androidx.lifecycle.Lifecycle r1 = r4.getLifecycle()
            androidx.activity.ComponentActivity$4 r2 = new androidx.activity.ComponentActivity$4
            r2.<init>(r4)
            r1.addObserver(r2)
            androidx.lifecycle.Lifecycle r1 = r4.getLifecycle()
            androidx.activity.ComponentActivity$5 r2 = new androidx.activity.ComponentActivity$5
            r2.<init>(r4)
            r1.addObserver(r2)
            androidx.savedstate.SavedStateRegistryController r1 = r4.mSavedStateRegistryController
            r1.performAttach()
            androidx.lifecycle.SavedStateHandleSupport.enableSavedStateHandles(r4)
            androidx.savedstate.SavedStateRegistry r1 = r4.getSavedStateRegistry()
            androidx.activity.ComponentActivity$$ExternalSyntheticLambda1 r2 = new androidx.activity.ComponentActivity$$ExternalSyntheticLambda1
            r2.<init>(r4)
            java.lang.String r3 = "android:support:activity-result"
            r1.registerSavedStateProvider(r3, r2)
            androidx.activity.ComponentActivity$$ExternalSyntheticLambda2 r1 = new androidx.activity.ComponentActivity$$ExternalSyntheticLambda2
            r1.<init>(r4)
            r4.addOnContextAvailableListener(r1)
            return
        Lb1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization."
            r1.<init>(r2)
            throw r1
    }

    public ComponentActivity(int r1) {
            r0 = this;
            r0.<init>()
            r0.mContentLayoutId = r1
            return
    }

    static /* synthetic */ void access$001(androidx.activity.ComponentActivity r0) {
            super.onBackPressed()
            return
    }

    private void initViewTreeOwners() {
            r1 = this;
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r0, r1)
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r0, r1)
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(r0, r1)
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.activity.ViewTreeOnBackPressedDispatcherOwner.set(r0, r1)
            return
    }

    @Override // android.app.Activity
    public void addContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r0.initViewTreeOwners()
            super.addContentView(r1, r2)
            return
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(androidx.core.view.MenuProvider r2) {
            r1 = this;
            androidx.core.view.MenuHostHelper r0 = r1.mMenuHostHelper
            r0.addMenuProvider(r2)
            return
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(androidx.core.view.MenuProvider r2, androidx.lifecycle.LifecycleOwner r3) {
            r1 = this;
            androidx.core.view.MenuHostHelper r0 = r1.mMenuHostHelper
            r0.addMenuProvider(r2, r3)
            return
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(androidx.core.view.MenuProvider r2, androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.State r4) {
            r1 = this;
            androidx.core.view.MenuHostHelper r0 = r1.mMenuHostHelper
            r0.addMenuProvider(r2, r3, r4)
            return
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(androidx.core.util.Consumer<android.content.res.Configuration> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.res.Configuration>> r0 = r1.mOnConfigurationChangedListeners
            r0.add(r2)
            return
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void addOnContextAvailableListener(androidx.activity.contextaware.OnContextAvailableListener r2) {
            r1 = this;
            androidx.activity.contextaware.ContextAwareHelper r0 = r1.mContextAwareHelper
            r0.addOnContextAvailableListener(r2)
            return
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo>> r0 = r1.mOnMultiWindowModeChangedListeners
            r0.add(r2)
            return
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void addOnNewIntentListener(androidx.core.util.Consumer<android.content.Intent> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.Intent>> r0 = r1.mOnNewIntentListeners
            r0.add(r2)
            return
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo>> r0 = r1.mOnPictureInPictureModeChangedListeners
            r0.add(r2)
            return
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(androidx.core.util.Consumer<java.lang.Integer> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<java.lang.Integer>> r0 = r1.mOnTrimMemoryListeners
            r0.add(r2)
            return
    }

    void ensureViewModelStore() {
            r2 = this;
            androidx.lifecycle.ViewModelStore r0 = r2.mViewModelStore
            if (r0 != 0) goto L1c
        L5:
            java.lang.Object r0 = r2.getLastNonConfigurationInstance()
            androidx.activity.ComponentActivity$NonConfigurationInstances r0 = (androidx.activity.ComponentActivity.NonConfigurationInstances) r0
            if (r0 == 0) goto L11
            androidx.lifecycle.ViewModelStore r1 = r0.viewModelStore
            r2.mViewModelStore = r1
        L11:
            androidx.lifecycle.ViewModelStore r1 = r2.mViewModelStore
            if (r1 != 0) goto L1c
            androidx.lifecycle.ViewModelStore r1 = new androidx.lifecycle.ViewModelStore
            r1.<init>()
            r2.mViewModelStore = r1
        L1c:
            return
    }

    @Override // androidx.activity.result.ActivityResultRegistryOwner
    public final androidx.activity.result.ActivityResultRegistry getActivityResultRegistry() {
            r1 = this;
            androidx.activity.result.ActivityResultRegistry r0 = r1.mActivityResultRegistry
            return r0
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public androidx.lifecycle.viewmodel.CreationExtras getDefaultViewModelCreationExtras() {
            r3 = this;
            androidx.lifecycle.viewmodel.MutableCreationExtras r0 = new androidx.lifecycle.viewmodel.MutableCreationExtras
            r0.<init>()
            android.app.Application r1 = r3.getApplication()
            if (r1 == 0) goto L14
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.app.Application> r1 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY
            android.app.Application r2 = r3.getApplication()
            r0.set(r1, r2)
        L14:
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.savedstate.SavedStateRegistryOwner> r1 = androidx.lifecycle.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY
            r0.set(r1, r3)
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.lifecycle.ViewModelStoreOwner> r1 = androidx.lifecycle.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY
            r0.set(r1, r3)
            android.content.Intent r1 = r3.getIntent()
            if (r1 == 0) goto L3b
            android.content.Intent r1 = r3.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L3b
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.os.Bundle> r1 = androidx.lifecycle.SavedStateHandleSupport.DEFAULT_ARGS_KEY
            android.content.Intent r2 = r3.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            r0.set(r1, r2)
        L3b:
            return r0
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
            r3 = this;
            androidx.lifecycle.ViewModelProvider$Factory r0 = r3.mDefaultFactory
            if (r0 != 0) goto L1f
            androidx.lifecycle.SavedStateViewModelFactory r0 = new androidx.lifecycle.SavedStateViewModelFactory
            android.app.Application r1 = r3.getApplication()
            android.content.Intent r2 = r3.getIntent()
            if (r2 == 0) goto L19
            android.content.Intent r2 = r3.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            goto L1a
        L19:
            r2 = 0
        L1a:
            r0.<init>(r1, r3, r2)
            r3.mDefaultFactory = r0
        L1f:
            androidx.lifecycle.ViewModelProvider$Factory r0 = r3.mDefaultFactory
            return r0
    }

    @java.lang.Deprecated
    public java.lang.Object getLastCustomNonConfigurationInstance() {
            r2 = this;
            java.lang.Object r0 = r2.getLastNonConfigurationInstance()
            androidx.activity.ComponentActivity$NonConfigurationInstances r0 = (androidx.activity.ComponentActivity.NonConfigurationInstances) r0
            if (r0 == 0) goto Lc
            java.lang.Object r1 = r0.custom
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            return r0
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    public final androidx.activity.OnBackPressedDispatcher getOnBackPressedDispatcher() {
            r1 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r1.mOnBackPressedDispatcher
            return r0
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
            r1 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            androidx.savedstate.SavedStateRegistry r0 = r0.getSavedStateRegistry()
            return r0
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public androidx.lifecycle.ViewModelStore getViewModelStore() {
            r2 = this;
            android.app.Application r0 = r2.getApplication()
            if (r0 == 0) goto Lc
            r2.ensureViewModelStore()
            androidx.lifecycle.ViewModelStore r0 = r2.mViewModelStore
            return r0
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call."
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.core.view.MenuHost
    public void invalidateMenu() {
            r0 = this;
            r0.invalidateOptionsMenu()
            return
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-activity-ComponentActivity, reason: not valid java name */
    /* synthetic */ android.os.Bundle m151lambda$new$0$androidxactivityComponentActivity() {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.activity.result.ActivityResultRegistry r1 = r2.mActivityResultRegistry
            r1.onSaveInstanceState(r0)
            return r0
    }

    /* JADX INFO: renamed from: lambda$new$1$androidx-activity-ComponentActivity, reason: not valid java name */
    /* synthetic */ void m152lambda$new$1$androidxactivityComponentActivity(android.content.Context r3) {
            r2 = this;
            androidx.savedstate.SavedStateRegistry r0 = r2.getSavedStateRegistry()
            java.lang.String r1 = "android:support:activity-result"
            android.os.Bundle r0 = r0.consumeRestoredStateForKey(r1)
            if (r0 == 0) goto L11
            androidx.activity.result.ActivityResultRegistry r1 = r2.mActivityResultRegistry
            r1.onRestoreInstanceState(r0)
        L11:
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    protected void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            androidx.activity.result.ActivityResultRegistry r0 = r1.mActivityResultRegistry
            boolean r0 = r0.dispatchResult(r2, r3, r4)
            if (r0 != 0) goto Lb
            super.onActivityResult(r2, r3, r4)
        Lb:
            return
    }

    @Override // android.app.Activity
    public void onBackPressed() {
            r1 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r1.mOnBackPressedDispatcher
            r0.onBackPressed()
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            super.onConfigurationChanged(r3)
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.res.Configuration>> r0 = r2.mOnConfigurationChangedListeners
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            androidx.core.util.Consumer r1 = (androidx.core.util.Consumer) r1
            r1.accept(r3)
            goto L9
        L19:
            return
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle r3) {
            r2 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r2.mSavedStateRegistryController
            r0.performRestore(r3)
            androidx.activity.contextaware.ContextAwareHelper r0 = r2.mContextAwareHelper
            r0.dispatchOnContextAvailable(r2)
            super.onCreate(r3)
            androidx.lifecycle.ReportFragment.injectIfNeededIn(r2)
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 == 0) goto L1f
            androidx.activity.OnBackPressedDispatcher r0 = r2.mOnBackPressedDispatcher
            android.window.OnBackInvokedDispatcher r1 = androidx.activity.ComponentActivity.Api33Impl.getOnBackInvokedDispatcher(r2)
            r0.setOnBackInvokedDispatcher(r1)
        L1f:
            int r0 = r2.mContentLayoutId
            if (r0 == 0) goto L28
            int r0 = r2.mContentLayoutId
            r2.setContentView(r0)
        L28:
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int r3, android.view.Menu r4) {
            r2 = this;
            if (r3 != 0) goto Le
            super.onCreatePanelMenu(r3, r4)
            androidx.core.view.MenuHostHelper r0 = r2.mMenuHostHelper
            android.view.MenuInflater r1 = r2.getMenuInflater()
            r0.onCreateMenu(r4, r1)
        Le:
            r0 = 1
            return r0
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            boolean r0 = super.onMenuItemSelected(r2, r3)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            if (r2 != 0) goto L11
            androidx.core.view.MenuHostHelper r0 = r1.mMenuHostHelper
            boolean r0 = r0.onMenuItemSelected(r3)
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean r4) {
            r3 = this;
            boolean r0 = r3.mDispatchingOnMultiWindowModeChanged
            if (r0 == 0) goto L5
            return
        L5:
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo>> r0 = r3.mOnMultiWindowModeChangedListeners
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            androidx.core.util.Consumer r1 = (androidx.core.util.Consumer) r1
            androidx.core.app.MultiWindowModeChangedInfo r2 = new androidx.core.app.MultiWindowModeChangedInfo
            r2.<init>(r4)
            r1.accept(r2)
            goto Lb
        L20:
            return
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean r4, android.content.res.Configuration r5) {
            r3 = this;
            r0 = 1
            r3.mDispatchingOnMultiWindowModeChanged = r0
            r0 = 0
            super.onMultiWindowModeChanged(r4, r5)     // Catch: java.lang.Throwable -> L26
            r3.mDispatchingOnMultiWindowModeChanged = r0
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo>> r0 = r3.mOnMultiWindowModeChangedListeners
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            androidx.core.util.Consumer r1 = (androidx.core.util.Consumer) r1
            androidx.core.app.MultiWindowModeChangedInfo r2 = new androidx.core.app.MultiWindowModeChangedInfo
            r2.<init>(r4, r5)
            r1.accept(r2)
            goto L10
        L25:
            return
        L26:
            r1 = move-exception
            r3.mDispatchingOnMultiWindowModeChanged = r0
            throw r1
    }

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent r3) {
            r2 = this;
            super.onNewIntent(r3)
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.Intent>> r0 = r2.mOnNewIntentListeners
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            androidx.core.util.Consumer r1 = (androidx.core.util.Consumer) r1
            r1.accept(r3)
            goto L9
        L19:
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r2, android.view.Menu r3) {
            r1 = this;
            androidx.core.view.MenuHostHelper r0 = r1.mMenuHostHelper
            r0.onMenuClosed(r3)
            super.onPanelClosed(r2, r3)
            return
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean r4) {
            r3 = this;
            boolean r0 = r3.mDispatchingOnPictureInPictureModeChanged
            if (r0 == 0) goto L5
            return
        L5:
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo>> r0 = r3.mOnPictureInPictureModeChangedListeners
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            androidx.core.util.Consumer r1 = (androidx.core.util.Consumer) r1
            androidx.core.app.PictureInPictureModeChangedInfo r2 = new androidx.core.app.PictureInPictureModeChangedInfo
            r2.<init>(r4)
            r1.accept(r2)
            goto Lb
        L20:
            return
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean r4, android.content.res.Configuration r5) {
            r3 = this;
            r0 = 1
            r3.mDispatchingOnPictureInPictureModeChanged = r0
            r0 = 0
            super.onPictureInPictureModeChanged(r4, r5)     // Catch: java.lang.Throwable -> L26
            r3.mDispatchingOnPictureInPictureModeChanged = r0
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo>> r0 = r3.mOnPictureInPictureModeChangedListeners
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            androidx.core.util.Consumer r1 = (androidx.core.util.Consumer) r1
            androidx.core.app.PictureInPictureModeChangedInfo r2 = new androidx.core.app.PictureInPictureModeChangedInfo
            r2.<init>(r4, r5)
            r1.accept(r2)
            goto L10
        L25:
            return
        L26:
            r1 = move-exception
            r3.mDispatchingOnPictureInPictureModeChanged = r0
            throw r1
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int r2, android.view.View r3, android.view.Menu r4) {
            r1 = this;
            if (r2 != 0) goto La
            super.onPreparePanel(r2, r3, r4)
            androidx.core.view.MenuHostHelper r0 = r1.mMenuHostHelper
            r0.onPrepareMenu(r4)
        La:
            r0 = 1
            return r0
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void onRequestPermissionsResult(int r4, java.lang.String[] r5, int[] r6) {
            r3 = this;
            androidx.activity.result.ActivityResultRegistry r0 = r3.mActivityResultRegistry
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "androidx.activity.result.contract.extra.PERMISSIONS"
            android.content.Intent r1 = r1.putExtra(r2, r5)
            java.lang.String r2 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
            android.content.Intent r1 = r1.putExtra(r2, r6)
            r2 = -1
            boolean r0 = r0.dispatchResult(r4, r2, r1)
            if (r0 != 0) goto L1e
        L1b:
            super.onRequestPermissionsResult(r4, r5, r6)
        L1e:
            return
    }

    @java.lang.Deprecated
    public java.lang.Object onRetainCustomNonConfigurationInstance() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
            r3 = this;
            java.lang.Object r0 = r3.onRetainCustomNonConfigurationInstance()
            androidx.lifecycle.ViewModelStore r1 = r3.mViewModelStore
            if (r1 != 0) goto L13
        L9:
            java.lang.Object r2 = r3.getLastNonConfigurationInstance()
            androidx.activity.ComponentActivity$NonConfigurationInstances r2 = (androidx.activity.ComponentActivity.NonConfigurationInstances) r2
            if (r2 == 0) goto L13
            androidx.lifecycle.ViewModelStore r1 = r2.viewModelStore
        L13:
            if (r1 != 0) goto L19
            if (r0 != 0) goto L19
            r2 = 0
            return r2
        L19:
            androidx.activity.ComponentActivity$NonConfigurationInstances r2 = new androidx.activity.ComponentActivity$NonConfigurationInstances
            r2.<init>()
            r2.custom = r0
            r2.viewModelStore = r1
            return r2
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle r4) {
            r3 = this;
            androidx.lifecycle.Lifecycle r0 = r3.getLifecycle()
            boolean r1 = r0 instanceof androidx.lifecycle.LifecycleRegistry
            if (r1 == 0) goto L10
            r1 = r0
            androidx.lifecycle.LifecycleRegistry r1 = (androidx.lifecycle.LifecycleRegistry) r1
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.CREATED
            r1.setCurrentState(r2)
        L10:
            super.onSaveInstanceState(r4)
            androidx.savedstate.SavedStateRegistryController r1 = r3.mSavedStateRegistryController
            r1.performSave(r4)
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int r4) {
            r3 = this;
            super.onTrimMemory(r4)
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<java.lang.Integer>> r0 = r3.mOnTrimMemoryListeners
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            androidx.core.util.Consumer r1 = (androidx.core.util.Consumer) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1.accept(r2)
            goto L9
        L1d:
            return
    }

    @Override // androidx.activity.contextaware.ContextAware
    public android.content.Context peekAvailableContext() {
            r1 = this;
            androidx.activity.contextaware.ContextAwareHelper r0 = r1.mContextAwareHelper
            android.content.Context r0 = r0.peekAvailableContext()
            return r0
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(androidx.activity.result.contract.ActivityResultContract<I, O> r2, androidx.activity.result.ActivityResultCallback<O> r3) {
            r1 = this;
            androidx.activity.result.ActivityResultRegistry r0 = r1.mActivityResultRegistry
            androidx.activity.result.ActivityResultLauncher r0 = r1.registerForActivityResult(r2, r0, r3)
            return r0
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(androidx.activity.result.contract.ActivityResultContract<I, O> r3, androidx.activity.result.ActivityResultRegistry r4, androidx.activity.result.ActivityResultCallback<O> r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "activity_rq#"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = r2.mNextLocalRequestCode
            int r1 = r1.getAndIncrement()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.activity.result.ActivityResultLauncher r0 = r4.register(r0, r2, r3, r5)
            return r0
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(androidx.core.view.MenuProvider r2) {
            r1 = this;
            androidx.core.view.MenuHostHelper r0 = r1.mMenuHostHelper
            r0.removeMenuProvider(r2)
            return
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(androidx.core.util.Consumer<android.content.res.Configuration> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.res.Configuration>> r0 = r1.mOnConfigurationChangedListeners
            r0.remove(r2)
            return
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void removeOnContextAvailableListener(androidx.activity.contextaware.OnContextAvailableListener r2) {
            r1 = this;
            androidx.activity.contextaware.ContextAwareHelper r0 = r1.mContextAwareHelper
            r0.removeOnContextAvailableListener(r2)
            return
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo>> r0 = r1.mOnMultiWindowModeChangedListeners
            r0.remove(r2)
            return
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void removeOnNewIntentListener(androidx.core.util.Consumer<android.content.Intent> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.Intent>> r0 = r1.mOnNewIntentListeners
            r0.remove(r2)
            return
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo>> r0 = r1.mOnPictureInPictureModeChangedListeners
            r0.remove(r2)
            return
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(androidx.core.util.Consumer<java.lang.Integer> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<java.lang.Integer>> r0 = r1.mOnTrimMemoryListeners
            r0.remove(r2)
            return
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
            r1 = this;
            boolean r0 = androidx.tracing.Trace.isEnabled()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto Lb
            java.lang.String r0 = "reportFullyDrawn() for ComponentActivity"
            androidx.tracing.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L14
        Lb:
            super.reportFullyDrawn()     // Catch: java.lang.Throwable -> L14
            androidx.tracing.Trace.endSection()
            return
        L14:
            r0 = move-exception
            androidx.tracing.Trace.endSection()
            throw r0
    }

    @Override // android.app.Activity
    public void setContentView(int r1) {
            r0 = this;
            r0.initViewTreeOwners()
            super.setContentView(r1)
            return
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r1) {
            r0 = this;
            r0.initViewTreeOwners()
            super.setContentView(r1)
            return
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r0.initViewTreeOwners()
            super.setContentView(r1, r2)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startActivityForResult(android.content.Intent r1, int r2) {
            r0 = this;
            super.startActivityForResult(r1, r2)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startActivityForResult(android.content.Intent r1, int r2, android.os.Bundle r3) {
            r0 = this;
            super.startActivityForResult(r1, r2, r3)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startIntentSenderForResult(android.content.IntentSender r1, int r2, android.content.Intent r3, int r4, int r5, int r6) throws android.content.IntentSender.SendIntentException {
            r0 = this;
            super.startIntentSenderForResult(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startIntentSenderForResult(android.content.IntentSender r1, int r2, android.content.Intent r3, int r4, int r5, int r6, android.os.Bundle r7) throws android.content.IntentSender.SendIntentException {
            r0 = this;
            super.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
            return
    }
}
