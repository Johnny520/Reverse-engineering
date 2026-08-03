package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController;", "", "<init>", "()V", "Landroidx/savedstate/ۥ;", "registry", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "", "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/SavedStateHandleController;", "create", "(Landroidx/savedstate/ۥ;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/ViewModel;", "viewModel", "LYue/ۥۣۢ۠ۤ;", "attachHandleIfNeeded", "(Landroidx/lifecycle/ViewModel;Landroidx/savedstate/ۥ;Landroidx/lifecycle/Lifecycle;)V", "tryToAddRecreator", "(Landroidx/savedstate/ۥ;Landroidx/lifecycle/Lifecycle;)V", "TAG_SAVED_STATE_HANDLE_CONTROLLER", "Ljava/lang/String;", "OnRecreation", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
public final class LegacySavedStateHandleController {

    @Yue.InterfaceC4418
    public static final androidx.lifecycle.LegacySavedStateHandleController INSTANCE = null;

    @Yue.InterfaceC4418
    public static final java.lang.String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController$OnRecreation;", "Landroidx/savedstate/ۥ$ۥ;", "<init>", "()V", "LYue/ۥۡۧۤۢ;", "owner", "LYue/ۥۣۢ۠ۤ;", "onRecreated", "(LYue/ۥۡۧۤۢ;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
    public static final class OnRecreation implements androidx.savedstate.C7816.InterfaceC7817 {
        public OnRecreation() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.savedstate.C7816.InterfaceC7817
        public void onRecreated(@Yue.InterfaceC4418 Yue.InterfaceC5504 r6) {
                r5 = this;
                java.lang.String r0 = "owner"
                Yue.C3329.m13906(r6, r0)
                boolean r0 = r6 instanceof androidx.lifecycle.ViewModelStoreOwner
                if (r0 == 0) goto L49
                r0 = r6
                androidx.lifecycle.ViewModelStoreOwner r0 = (androidx.lifecycle.ViewModelStoreOwner) r0
                androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore()
                androidx.savedstate.ۥ r1 = r6.getSavedStateRegistry()
                java.util.Set r2 = r0.keys()
                java.util.Iterator r2 = r2.iterator()
            L1c:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L37
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                androidx.lifecycle.ViewModel r3 = r0.get(r3)
                Yue.C3329.m13903(r3)
                androidx.lifecycle.Lifecycle r4 = r6.getLifecycle()
                androidx.lifecycle.LegacySavedStateHandleController.attachHandleIfNeeded(r3, r1, r4)
                goto L1c
            L37:
                java.util.Set r6 = r0.keys()
                boolean r6 = r6.isEmpty()
                r6 = r6 ^ 1
                if (r6 == 0) goto L48
                java.lang.Class<androidx.lifecycle.LegacySavedStateHandleController$OnRecreation> r6 = androidx.lifecycle.LegacySavedStateHandleController.OnRecreation.class
                r1.m30367(r6)
            L48:
                return
            L49:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner"
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
        }
    }


    static {
            androidx.lifecycle.LegacySavedStateHandleController r0 = new androidx.lifecycle.LegacySavedStateHandleController
            r0.<init>()
            androidx.lifecycle.LegacySavedStateHandleController.INSTANCE = r0
            return
    }

    private LegacySavedStateHandleController() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC3427
    public static final void attachHandleIfNeeded(@Yue.InterfaceC4418 androidx.lifecycle.ViewModel r1, @Yue.InterfaceC4418 androidx.savedstate.C7816 r2, @Yue.InterfaceC4418 androidx.lifecycle.Lifecycle r3) {
            java.lang.String r0 = "viewModel"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "registry"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "lifecycle"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "androidx.lifecycle.savedstate.vm.tag"
            java.lang.Object r1 = r1.getTag(r0)
            androidx.lifecycle.SavedStateHandleController r1 = (androidx.lifecycle.SavedStateHandleController) r1
            if (r1 == 0) goto L27
            boolean r0 = r1.isAttached()
            if (r0 != 0) goto L27
            r1.attachToLifecycle(r2, r3)
            androidx.lifecycle.LegacySavedStateHandleController r1 = androidx.lifecycle.LegacySavedStateHandleController.INSTANCE
            r1.tryToAddRecreator(r2, r3)
        L27:
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final androidx.lifecycle.SavedStateHandleController create(@Yue.InterfaceC4418 androidx.savedstate.C7816 r2, @Yue.InterfaceC4418 androidx.lifecycle.Lifecycle r3, @Yue.InterfaceC4543 java.lang.String r4, @Yue.InterfaceC4543 android.os.Bundle r5) {
            java.lang.String r0 = "registry"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "lifecycle"
            Yue.C3329.m13906(r3, r0)
            Yue.C3329.m13903(r4)
            android.os.Bundle r0 = r2.m30359(r4)
            androidx.lifecycle.SavedStateHandle$Companion r1 = androidx.lifecycle.SavedStateHandle.Companion
            androidx.lifecycle.SavedStateHandle r5 = r1.createHandle(r0, r5)
            androidx.lifecycle.SavedStateHandleController r0 = new androidx.lifecycle.SavedStateHandleController
            r0.<init>(r4, r5)
            r0.attachToLifecycle(r2, r3)
            androidx.lifecycle.LegacySavedStateHandleController r4 = androidx.lifecycle.LegacySavedStateHandleController.INSTANCE
            r4.tryToAddRecreator(r2, r3)
            return r0
    }

    private final void tryToAddRecreator(androidx.savedstate.C7816 r3, androidx.lifecycle.Lifecycle r4) {
            r2 = this;
            androidx.lifecycle.Lifecycle$State r0 = r4.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            if (r0 == r1) goto L1a
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r0 = r0.isAtLeast(r1)
            if (r0 == 0) goto L11
            goto L1a
        L11:
            androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1 r0 = new androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
            r0.<init>(r4, r3)
            r4.addObserver(r0)
            goto L1f
        L1a:
            java.lang.Class<androidx.lifecycle.LegacySavedStateHandleController$OnRecreation> r4 = androidx.lifecycle.LegacySavedStateHandleController.OnRecreation.class
            r3.m30367(r4)
        L1f:
            return
    }
}
