package android.view;

import Yue.C5499;
import Yue.C6411;
import Yue.C6659;
import Yue.InterfaceC5578;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7235;
import android.os.Bundle;
import android.view.Lifecycle;
import androidx.savedstate.C1794;
import java.util.Iterator;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Landroidx/savedstate/ۥ;", "registry", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "", C6659.f17103, "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/SavedStateHandleController;", "create", "(Landroidx/savedstate/ۥ;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/ViewModel;", "viewModel", "LYue/ۥۣۢ۠ۤ;", "attachHandleIfNeeded", "(Landroidx/lifecycle/ViewModel;Landroidx/savedstate/ۥ;Landroidx/lifecycle/Lifecycle;)V", "tryToAddRecreator", "(Landroidx/savedstate/ۥ;Landroidx/lifecycle/Lifecycle;)V", "TAG_SAVED_STATE_HANDLE_CONTROLLER", "Ljava/lang/String;", "OnRecreation", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
public final class LegacySavedStateHandleController {

    @InterfaceC6399
    public static final LegacySavedStateHandleController INSTANCE = new LegacySavedStateHandleController();

    @InterfaceC6399
    public static final String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController$OnRecreation;", "Landroidx/savedstate/ۥ$ۥ;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LYue/ۥۡۧۤۢ;", "owner", "LYue/ۥۣۢ۠ۤ;", "onRecreated", "(LYue/ۥۡۧۤۢ;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
    public static final class OnRecreation implements C1794.InterfaceC8998 {
        @Override // androidx.savedstate.C1794.InterfaceC8998
        public void onRecreated(@InterfaceC6399 InterfaceC7235 owner) {
            C5499.m17103(owner, "owner");
            if (!(owner instanceof ViewModelStoreOwner)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            ViewModelStore viewModelStore = ((ViewModelStoreOwner) owner).getViewModelStore();
            C1794 savedStateRegistry = owner.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.keys().iterator();
            while (it.hasNext()) {
                ViewModel viewModel = viewModelStore.get(it.next());
                C5499.m17100(viewModel);
                LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, owner.getLifecycle());
            }
            if (!viewModelStore.keys().isEmpty()) {
                savedStateRegistry.m30807(OnRecreation.class);
            }
        }
    }

    private LegacySavedStateHandleController() {
    }

    @InterfaceC5578
    public static final void attachHandleIfNeeded(@InterfaceC6399 ViewModel viewModel, @InterfaceC6399 C1794 registry, @InterfaceC6399 Lifecycle lifecycle) {
        C5499.m17103(viewModel, "viewModel");
        C5499.m17103(registry, "registry");
        C5499.m17103(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.getIsAttached()) {
            return;
        }
        savedStateHandleController.attachToLifecycle(registry, lifecycle);
        INSTANCE.tryToAddRecreator(registry, lifecycle);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final SavedStateHandleController create(@InterfaceC6399 C1794 registry, @InterfaceC6399 Lifecycle lifecycle, @InterfaceC6489 String key, @InterfaceC6489 Bundle defaultArgs) {
        C5499.m17103(registry, "registry");
        C5499.m17103(lifecycle, "lifecycle");
        C5499.m17100(key);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(key, SavedStateHandle.INSTANCE.createHandle(registry.m5022(key), defaultArgs));
        savedStateHandleController.attachToLifecycle(registry, lifecycle);
        INSTANCE.tryToAddRecreator(registry, lifecycle);
        return savedStateHandleController;
    }

    private final void tryToAddRecreator(final C1794 registry, final Lifecycle lifecycle) {
        Lifecycle.State state = lifecycle.getState();
        if (state == Lifecycle.State.INITIALIZED || state.isAtLeast(Lifecycle.State.STARTED)) {
            registry.m30807(OnRecreation.class);
        } else {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.lifecycle.LegacySavedStateHandleController.tryToAddRecreator.1
                @Override // android.view.LifecycleEventObserver
                public void onStateChanged(@InterfaceC6399 LifecycleOwner source, @InterfaceC6399 Lifecycle.Event event) {
                    C5499.m17103(source, "source");
                    C5499.m17103(event, C6411.f16276);
                    if (event == Lifecycle.Event.ON_START) {
                        lifecycle.removeObserver(this);
                        registry.m30807(OnRecreation.class);
                    }
                }
            });
        }
    }
}
