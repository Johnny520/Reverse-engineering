package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0003\u0010\tB%\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0003\u0010\fJ/\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0013\u0010\u0017J'\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\rH\u0017¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Landroidx/lifecycle/SavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "<init>", "()V", "Landroid/app/Application;", "application", "LYue/ۥۡۧۤۢ;", "owner", "(Landroid/app/Application;LYue/ۥۡۧۤۢ;)V", "Landroid/os/Bundle;", "defaultArgs", "(Landroid/app/Application;LYue/ۥۡۧۤۢ;Landroid/os/Bundle;)V", "Landroidx/lifecycle/ViewModel;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "", "key", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "viewModel", "LYue/ۥۣۢ۠ۤ;", "onRequery", "(Landroidx/lifecycle/ViewModel;)V", "Landroid/app/Application;", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroid/os/Bundle;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "Landroidx/savedstate/ۥ;", "savedStateRegistry", "Landroidx/savedstate/ۥ;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
public final class SavedStateViewModelFactory extends androidx.lifecycle.ViewModelProvider.OnRequeryFactory implements androidx.lifecycle.ViewModelProvider.Factory {

    @Yue.InterfaceC4543
    private android.app.Application application;

    @Yue.InterfaceC4543
    private android.os.Bundle defaultArgs;

    @Yue.InterfaceC4418
    private final androidx.lifecycle.ViewModelProvider.Factory factory;

    @Yue.InterfaceC4543
    private androidx.lifecycle.Lifecycle lifecycle;

    @Yue.InterfaceC4543
    private androidx.savedstate.C7816 savedStateRegistry;

    public SavedStateViewModelFactory() {
            r1 = this;
            r1.<init>()
            androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r0 = new androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory
            r0.<init>()
            r1.factory = r0
            return
    }

    public SavedStateViewModelFactory(@Yue.InterfaceC4543 android.app.Application r2, @Yue.InterfaceC4418 Yue.InterfaceC5504 r3) {
            r1 = this;
            java.lang.String r0 = "owner"
            Yue.C3329.m13906(r3, r0)
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    @android.annotation.SuppressLint({"LambdaLast"})
    public SavedStateViewModelFactory(@Yue.InterfaceC4543 android.app.Application r2, @Yue.InterfaceC4418 Yue.InterfaceC5504 r3, @Yue.InterfaceC4543 android.os.Bundle r4) {
            r1 = this;
            java.lang.String r0 = "owner"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            androidx.savedstate.ۥ r0 = r3.getSavedStateRegistry()
            r1.savedStateRegistry = r0
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            r1.lifecycle = r3
            r1.defaultArgs = r4
            r1.application = r2
            if (r2 == 0) goto L21
            androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion r3 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion
            androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r2 = r3.getInstance(r2)
            goto L26
        L21:
            androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r2 = new androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory
            r2.<init>()
        L26:
            r1.factory = r2
            return
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @Yue.InterfaceC4418
    public <T extends androidx.lifecycle.ViewModel> T create(@Yue.InterfaceC4418 java.lang.Class<T> r2) {
            r1 = this;
            java.lang.String r0 = "modelClass"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = r2.getCanonicalName()
            if (r0 == 0) goto L10
            androidx.lifecycle.ViewModel r2 = r1.create(r0, r2)
            return r2
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Local and anonymous classes can not be ViewModels"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @Yue.InterfaceC4418
    public <T extends androidx.lifecycle.ViewModel> T create(@Yue.InterfaceC4418 java.lang.Class<T> r4, @Yue.InterfaceC4418 androidx.lifecycle.viewmodel.CreationExtras r5) {
            r3 = this;
            java.lang.String r0 = "modelClass"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "extras"
            Yue.C3329.m13906(r5, r0)
            androidx.lifecycle.viewmodel.CreationExtras$Key<java.lang.String> r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L7f
            androidx.lifecycle.viewmodel.CreationExtras$Key<Yue.ۥۡۧۤۢ> r1 = androidx.lifecycle.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY
            java.lang.Object r1 = r5.get(r1)
            if (r1 == 0) goto L6e
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.lifecycle.ViewModelStoreOwner> r1 = androidx.lifecycle.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY
            java.lang.Object r1 = r5.get(r1)
            if (r1 == 0) goto L6e
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.app.Application> r0 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY
            java.lang.Object r0 = r5.get(r0)
            android.app.Application r0 = (android.app.Application) r0
            java.lang.Class<androidx.lifecycle.AndroidViewModel> r1 = androidx.lifecycle.AndroidViewModel.class
            boolean r1 = r1.isAssignableFrom(r4)
            if (r1 == 0) goto L3f
            if (r0 == 0) goto L3f
            java.util.List r2 = androidx.lifecycle.SavedStateViewModelFactoryKt.access$getANDROID_VIEWMODEL_SIGNATURE$p()
            java.lang.reflect.Constructor r2 = androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor(r4, r2)
            goto L47
        L3f:
            java.util.List r2 = androidx.lifecycle.SavedStateViewModelFactoryKt.access$getVIEWMODEL_SIGNATURE$p()
            java.lang.reflect.Constructor r2 = androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor(r4, r2)
        L47:
            if (r2 != 0) goto L50
            androidx.lifecycle.ViewModelProvider$Factory r0 = r3.factory
            androidx.lifecycle.ViewModel r4 = r0.create(r4, r5)
            return r4
        L50:
            if (r1 == 0) goto L61
            if (r0 == 0) goto L61
            androidx.lifecycle.SavedStateHandle r5 = androidx.lifecycle.SavedStateHandleSupport.createSavedStateHandle(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r5}
            androidx.lifecycle.ViewModel r4 = androidx.lifecycle.SavedStateViewModelFactoryKt.newInstance(r4, r2, r5)
            goto L76
        L61:
            androidx.lifecycle.SavedStateHandle r5 = androidx.lifecycle.SavedStateHandleSupport.createSavedStateHandle(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            androidx.lifecycle.ViewModel r4 = androidx.lifecycle.SavedStateViewModelFactoryKt.newInstance(r4, r2, r5)
            goto L76
        L6e:
            androidx.lifecycle.Lifecycle r5 = r3.lifecycle
            if (r5 == 0) goto L77
            androidx.lifecycle.ViewModel r4 = r3.create(r0, r4)
        L76:
            return r4
        L77:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel."
            r4.<init>(r5)
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "VIEW_MODEL_KEY must always be provided by ViewModelProvider"
            r4.<init>(r5)
            throw r4
    }

    @Yue.InterfaceC4418
    public final <T extends androidx.lifecycle.ViewModel> T create(@Yue.InterfaceC4418 java.lang.String r6, @Yue.InterfaceC4418 java.lang.Class<T> r7) {
            r5 = this;
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "modelClass"
            Yue.C3329.m13906(r7, r0)
            androidx.lifecycle.Lifecycle r0 = r5.lifecycle
            if (r0 == 0) goto L76
            java.lang.Class<androidx.lifecycle.AndroidViewModel> r1 = androidx.lifecycle.AndroidViewModel.class
            boolean r1 = r1.isAssignableFrom(r7)
            if (r1 == 0) goto L23
            android.app.Application r2 = r5.application
            if (r2 == 0) goto L23
            java.util.List r2 = androidx.lifecycle.SavedStateViewModelFactoryKt.access$getANDROID_VIEWMODEL_SIGNATURE$p()
            java.lang.reflect.Constructor r2 = androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor(r7, r2)
            goto L2b
        L23:
            java.util.List r2 = androidx.lifecycle.SavedStateViewModelFactoryKt.access$getVIEWMODEL_SIGNATURE$p()
            java.lang.reflect.Constructor r2 = androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor(r7, r2)
        L2b:
            if (r2 != 0) goto L43
            android.app.Application r6 = r5.application
            if (r6 == 0) goto L38
            androidx.lifecycle.ViewModelProvider$Factory r6 = r5.factory
            androidx.lifecycle.ViewModel r6 = r6.create(r7)
            goto L42
        L38:
            androidx.lifecycle.ViewModelProvider$NewInstanceFactory$Companion r6 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion
            androidx.lifecycle.ViewModelProvider$NewInstanceFactory r6 = r6.getInstance()
            androidx.lifecycle.ViewModel r6 = r6.create(r7)
        L42:
            return r6
        L43:
            androidx.savedstate.ۥ r3 = r5.savedStateRegistry
            Yue.C3329.m13903(r3)
            android.os.Bundle r4 = r5.defaultArgs
            androidx.lifecycle.SavedStateHandleController r6 = androidx.lifecycle.LegacySavedStateHandleController.create(r3, r0, r6, r4)
            if (r1 == 0) goto L64
            android.app.Application r0 = r5.application
            if (r0 == 0) goto L64
            Yue.C3329.m13903(r0)
            androidx.lifecycle.SavedStateHandle r1 = r6.getHandle()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            androidx.lifecycle.ViewModel r7 = androidx.lifecycle.SavedStateViewModelFactoryKt.newInstance(r7, r2, r0)
            goto L70
        L64:
            androidx.lifecycle.SavedStateHandle r0 = r6.getHandle()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            androidx.lifecycle.ViewModel r7 = androidx.lifecycle.SavedStateViewModelFactoryKt.newInstance(r7, r2, r0)
        L70:
            java.lang.String r0 = "androidx.lifecycle.savedstate.vm.tag"
            r7.setTagIfAbsent(r0, r6)
            return r7
        L76:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.String r7 = "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."
            r6.<init>(r7)
            throw r6
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public void onRequery(@Yue.InterfaceC4418 androidx.lifecycle.ViewModel r3) {
            r2 = this;
            java.lang.String r0 = "viewModel"
            Yue.C3329.m13906(r3, r0)
            androidx.lifecycle.Lifecycle r0 = r2.lifecycle
            if (r0 == 0) goto L16
            androidx.savedstate.ۥ r0 = r2.savedStateRegistry
            Yue.C3329.m13903(r0)
            androidx.lifecycle.Lifecycle r1 = r2.lifecycle
            Yue.C3329.m13903(r1)
            androidx.lifecycle.LegacySavedStateHandleController.attachHandleIfNeeded(r3, r0, r1)
        L16:
            return
    }
}
