package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0003\u0010\tJ/\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0010\u0010\u0014J'\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0015J7\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H$¢\u0006\u0004\b\u0010\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\nH\u0017¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010#¨\u0006%"}, d2 = {"Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "<init>", "()V", "LYue/ۥۡۧۤۢ;", "owner", "Landroid/os/Bundle;", "defaultArgs", "(LYue/ۥۡۧۤۢ;Landroid/os/Bundle;)V", "Landroidx/lifecycle/ViewModel;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/SavedStateHandle;", "handle", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "viewModel", "LYue/ۥۣۢ۠ۤ;", "onRequery", "(Landroidx/lifecycle/ViewModel;)V", "Landroidx/savedstate/ۥ;", "savedStateRegistry", "Landroidx/savedstate/ۥ;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "Landroid/os/Bundle;", "Companion", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
public abstract class AbstractSavedStateViewModelFactory extends androidx.lifecycle.ViewModelProvider.OnRequeryFactory implements androidx.lifecycle.ViewModelProvider.Factory {

    @Yue.InterfaceC4418
    public static final androidx.lifecycle.AbstractSavedStateViewModelFactory.Companion Companion = null;

    @Yue.InterfaceC4418
    public static final java.lang.String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";

    @Yue.InterfaceC4543
    private android.os.Bundle defaultArgs;

    @Yue.InterfaceC4543
    private androidx.lifecycle.Lifecycle lifecycle;

    @Yue.InterfaceC4543
    private androidx.savedstate.C7816 savedStateRegistry;

    @Yue.InterfaceC4201(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/AbstractSavedStateViewModelFactory$Companion;", "", "()V", "TAG_SAVED_STATE_HANDLE_CONTROLLER", "", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            androidx.lifecycle.AbstractSavedStateViewModelFactory$Companion r0 = new androidx.lifecycle.AbstractSavedStateViewModelFactory$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.lifecycle.AbstractSavedStateViewModelFactory.Companion = r0
            return
    }

    public AbstractSavedStateViewModelFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public AbstractSavedStateViewModelFactory(@Yue.InterfaceC4418 Yue.InterfaceC5504 r2, @Yue.InterfaceC4543 android.os.Bundle r3) {
            r1 = this;
            java.lang.String r0 = "owner"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            androidx.savedstate.ۥ r0 = r2.getSavedStateRegistry()
            r1.savedStateRegistry = r0
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r1.lifecycle = r2
            r1.defaultArgs = r3
            return
    }

    private final <T extends androidx.lifecycle.ViewModel> T create(java.lang.String r4, java.lang.Class<T> r5) {
            r3 = this;
            androidx.savedstate.ۥ r0 = r3.savedStateRegistry
            Yue.C3329.m13903(r0)
            androidx.lifecycle.Lifecycle r1 = r3.lifecycle
            Yue.C3329.m13903(r1)
            android.os.Bundle r2 = r3.defaultArgs
            androidx.lifecycle.SavedStateHandleController r0 = androidx.lifecycle.LegacySavedStateHandleController.create(r0, r1, r4, r2)
            androidx.lifecycle.SavedStateHandle r1 = r0.getHandle()
            androidx.lifecycle.ViewModel r4 = r3.create(r4, r5, r1)
            java.lang.String r5 = "androidx.lifecycle.savedstate.vm.tag"
            r4.setTagIfAbsent(r5, r0)
            return r4
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @Yue.InterfaceC4418
    public <T extends androidx.lifecycle.ViewModel> T create(@Yue.InterfaceC4418 java.lang.Class<T> r3) {
            r2 = this;
            java.lang.String r0 = "modelClass"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = r3.getCanonicalName()
            if (r0 == 0) goto L1c
            androidx.lifecycle.Lifecycle r1 = r2.lifecycle
            if (r1 == 0) goto L14
            androidx.lifecycle.ViewModel r3 = r2.create(r0, r3)
            return r3
        L14:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."
            r3.<init>(r0)
            throw r3
        L1c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Local and anonymous classes can not be ViewModels"
            r3.<init>(r0)
            throw r3
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @Yue.InterfaceC4418
    public <T extends androidx.lifecycle.ViewModel> T create(@Yue.InterfaceC4418 java.lang.Class<T> r3, @Yue.InterfaceC4418 androidx.lifecycle.viewmodel.CreationExtras r4) {
            r2 = this;
            java.lang.String r0 = "modelClass"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "extras"
            Yue.C3329.m13906(r4, r0)
            androidx.lifecycle.viewmodel.CreationExtras$Key<java.lang.String> r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L26
            androidx.savedstate.ۥ r1 = r2.savedStateRegistry
            if (r1 == 0) goto L1d
            androidx.lifecycle.ViewModel r3 = r2.create(r0, r3)
            goto L25
        L1d:
            androidx.lifecycle.SavedStateHandle r4 = androidx.lifecycle.SavedStateHandleSupport.createSavedStateHandle(r4)
            androidx.lifecycle.ViewModel r3 = r2.create(r0, r3, r4)
        L25:
            return r3
        L26:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "VIEW_MODEL_KEY must always be provided by ViewModelProvider"
            r3.<init>(r4)
            throw r3
    }

    @Yue.InterfaceC4418
    public abstract <T extends androidx.lifecycle.ViewModel> T create(@Yue.InterfaceC4418 java.lang.String r1, @Yue.InterfaceC4418 java.lang.Class<T> r2, @Yue.InterfaceC4418 androidx.lifecycle.SavedStateHandle r3);

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public void onRequery(@Yue.InterfaceC4418 androidx.lifecycle.ViewModel r3) {
            r2 = this;
            java.lang.String r0 = "viewModel"
            Yue.C3329.m13906(r3, r0)
            androidx.savedstate.ۥ r0 = r2.savedStateRegistry
            if (r0 == 0) goto L14
            Yue.C3329.m13903(r0)
            androidx.lifecycle.Lifecycle r1 = r2.lifecycle
            Yue.C3329.m13903(r1)
            androidx.lifecycle.LegacySavedStateHandleController.attachHandleIfNeeded(r3, r0, r1)
        L14:
            return
    }
}
