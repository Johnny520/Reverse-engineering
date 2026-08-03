package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,225:1\n1#2:226\n31#3:227\n63#3,2:228\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n*L\n109#1:227\n110#1:228,2\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000fH\u0007¢\u0006\u0004\b\r\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016\"\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016\"\u0018\u0010\u001c\u001a\u00020\u0019*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0018\u0010 \u001a\u00020\u001d*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LYue/ۥۡۧۤۢ;", "Landroidx/lifecycle/ViewModelStoreOwner;", "T", "LYue/ۥۣۢ۠ۤ;", "enableSavedStateHandles", "(LYue/ۥۡۧۤۢ;)V", "savedStateRegistryOwner", "viewModelStoreOwner", "", "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/SavedStateHandle;", "createSavedStateHandle", "(LYue/ۥۡۧۤۢ;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/SavedStateHandle;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/SavedStateHandle;", "VIEWMODEL_KEY", "Ljava/lang/String;", "SAVED_STATE_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "SAVED_STATE_REGISTRY_OWNER_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "VIEW_MODEL_STORE_OWNER_KEY", "DEFAULT_ARGS_KEY", "Landroidx/lifecycle/SavedStateHandlesVM;", "getSavedStateHandlesVM", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/SavedStateHandlesVM;", "savedStateHandlesVM", "Landroidx/lifecycle/SavedStateHandlesProvider;", "getSavedStateHandlesProvider", "(LYue/ۥۡۧۤۢ;)Landroidx/lifecycle/SavedStateHandlesProvider;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0})
@Yue.InterfaceC3421(name = "SavedStateHandleSupport")
public final class SavedStateHandleSupport {

    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final androidx.lifecycle.viewmodel.CreationExtras.Key<android.os.Bundle> DEFAULT_ARGS_KEY = null;

    @Yue.InterfaceC4418
    private static final java.lang.String SAVED_STATE_KEY = "androidx.lifecycle.internal.SavedStateHandlesProvider";

    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final androidx.lifecycle.viewmodel.CreationExtras.Key<Yue.InterfaceC5504> SAVED_STATE_REGISTRY_OWNER_KEY = null;

    @Yue.InterfaceC4418
    private static final java.lang.String VIEWMODEL_KEY = "androidx.lifecycle.internal.SavedStateHandlesVM";

    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final androidx.lifecycle.viewmodel.CreationExtras.Key<androidx.lifecycle.ViewModelStoreOwner> VIEW_MODEL_STORE_OWNER_KEY = null;

    static {
            androidx.lifecycle.SavedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1 r0 = new androidx.lifecycle.SavedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1
            r0.<init>()
            androidx.lifecycle.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY = r0
            androidx.lifecycle.SavedStateHandleSupport$VIEW_MODEL_STORE_OWNER_KEY$1 r0 = new androidx.lifecycle.SavedStateHandleSupport$VIEW_MODEL_STORE_OWNER_KEY$1
            r0.<init>()
            androidx.lifecycle.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY = r0
            androidx.lifecycle.SavedStateHandleSupport$DEFAULT_ARGS_KEY$1 r0 = new androidx.lifecycle.SavedStateHandleSupport$DEFAULT_ARGS_KEY$1
            r0.<init>()
            androidx.lifecycle.SavedStateHandleSupport.DEFAULT_ARGS_KEY = r0
            return
    }

    private static final androidx.lifecycle.SavedStateHandle createSavedStateHandle(Yue.InterfaceC5504 r1, androidx.lifecycle.ViewModelStoreOwner r2, java.lang.String r3, android.os.Bundle r4) {
            androidx.lifecycle.SavedStateHandlesProvider r1 = getSavedStateHandlesProvider(r1)
            androidx.lifecycle.SavedStateHandlesVM r2 = getSavedStateHandlesVM(r2)
            java.util.Map r0 = r2.getHandles()
            java.lang.Object r0 = r0.get(r3)
            androidx.lifecycle.SavedStateHandle r0 = (androidx.lifecycle.SavedStateHandle) r0
            if (r0 != 0) goto L25
            androidx.lifecycle.SavedStateHandle$Companion r0 = androidx.lifecycle.SavedStateHandle.Companion
            android.os.Bundle r1 = r1.consumeRestoredStateForKey(r3)
            androidx.lifecycle.SavedStateHandle r0 = r0.createHandle(r1, r4)
            java.util.Map r1 = r2.getHandles()
            r1.put(r3, r0)
        L25:
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3875
    public static final androidx.lifecycle.SavedStateHandle createSavedStateHandle(@Yue.InterfaceC4418 androidx.lifecycle.viewmodel.CreationExtras r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            androidx.lifecycle.viewmodel.CreationExtras$Key<Yue.ۥۡۧۤۢ> r0 = androidx.lifecycle.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY
            java.lang.Object r0 = r4.get(r0)
            Yue.ۥۡۧۤۢ r0 = (Yue.InterfaceC5504) r0
            if (r0 == 0) goto L40
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.lifecycle.ViewModelStoreOwner> r1 = androidx.lifecycle.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY
            java.lang.Object r1 = r4.get(r1)
            androidx.lifecycle.ViewModelStoreOwner r1 = (androidx.lifecycle.ViewModelStoreOwner) r1
            if (r1 == 0) goto L38
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.os.Bundle> r2 = androidx.lifecycle.SavedStateHandleSupport.DEFAULT_ARGS_KEY
            java.lang.Object r2 = r4.get(r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            androidx.lifecycle.viewmodel.CreationExtras$Key<java.lang.String> r3 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY
            java.lang.Object r4 = r4.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L30
            androidx.lifecycle.SavedStateHandle r4 = createSavedStateHandle(r0, r1, r4, r2)
            return r4
        L30:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `VIEW_MODEL_KEY`"
            r4.<init>(r0)
            throw r4
        L38:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"
            r4.<init>(r0)
            throw r4
        L40:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"
            r4.<init>(r0)
            throw r4
    }

    @Yue.InterfaceC3875
    public static final <T extends Yue.InterfaceC5504 & androidx.lifecycle.ViewModelStoreOwner> void enableSavedStateHandles(@Yue.InterfaceC4418 T r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            androidx.lifecycle.Lifecycle r0 = r4.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            if (r0 == r1) goto L22
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            if (r0 != r1) goto L16
            goto L22
        L16:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L22:
            androidx.savedstate.ۥ r0 = r4.getSavedStateRegistry()
            java.lang.String r1 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            androidx.savedstate.ۥ$ۥ۟۟ r0 = r0.m30360(r1)
            if (r0 != 0) goto L4d
            androidx.lifecycle.SavedStateHandlesProvider r0 = new androidx.lifecycle.SavedStateHandlesProvider
            androidx.savedstate.ۥ r2 = r4.getSavedStateRegistry()
            r3 = r4
            androidx.lifecycle.ViewModelStoreOwner r3 = (androidx.lifecycle.ViewModelStoreOwner) r3
            r0.<init>(r2, r3)
            androidx.savedstate.ۥ r2 = r4.getSavedStateRegistry()
            r2.m30366(r1, r0)
            androidx.lifecycle.Lifecycle r4 = r4.getLifecycle()
            androidx.lifecycle.SavedStateHandleAttacher r1 = new androidx.lifecycle.SavedStateHandleAttacher
            r1.<init>(r0)
            r4.addObserver(r1)
        L4d:
            return
    }

    @Yue.InterfaceC4418
    public static final androidx.lifecycle.SavedStateHandlesProvider getSavedStateHandlesProvider(@Yue.InterfaceC4418 Yue.InterfaceC5504 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            androidx.savedstate.ۥ r1 = r1.getSavedStateRegistry()
            java.lang.String r0 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            androidx.savedstate.ۥ$ۥ۟۟ r1 = r1.m30360(r0)
            boolean r0 = r1 instanceof androidx.lifecycle.SavedStateHandlesProvider
            if (r0 == 0) goto L16
            androidx.lifecycle.SavedStateHandlesProvider r1 = (androidx.lifecycle.SavedStateHandlesProvider) r1
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 == 0) goto L1a
            return r1
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call"
            r1.<init>(r0)
            throw r1
    }

    @Yue.InterfaceC4418
    public static final androidx.lifecycle.SavedStateHandlesVM getSavedStateHandlesVM(@Yue.InterfaceC4418 androidx.lifecycle.ViewModelStoreOwner r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder r0 = new androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder
            r0.<init>()
            androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1$1 r1 = androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1$1.INSTANCE
            java.lang.Class<androidx.lifecycle.SavedStateHandlesVM> r2 = androidx.lifecycle.SavedStateHandlesVM.class
            Yue.ۥ۠ۦۢۢ r3 = Yue.C5277.m19888(r2)
            r0.addInitializer(r3, r1)
            androidx.lifecycle.ViewModelProvider$Factory r0 = r0.build()
            androidx.lifecycle.ViewModelProvider r1 = new androidx.lifecycle.ViewModelProvider
            r1.<init>(r4, r0)
            java.lang.String r4 = "androidx.lifecycle.internal.SavedStateHandlesVM"
            androidx.lifecycle.ViewModel r4 = r1.get(r4, r2)
            androidx.lifecycle.SavedStateHandlesVM r4 = (androidx.lifecycle.SavedStateHandlesVM) r4
            return r4
    }
}
