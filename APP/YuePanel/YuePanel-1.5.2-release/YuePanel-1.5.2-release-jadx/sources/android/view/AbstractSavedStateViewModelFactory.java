package android.view;

import Yue.C4750;
import Yue.C5499;
import Yue.C6659;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7144;
import Yue.InterfaceC7235;
import android.os.Bundle;
import android.view.ViewModelProvider;
import android.view.viewmodel.CreationExtras;
import androidx.savedstate.C1794;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0003\u0010\tJ/\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0010\u0010\u0014J'\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0015J7\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H$¢\u0006\u0004\b\u0010\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\nH\u0017¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010#¨\u0006%"}, d2 = {"Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LYue/ۥۡۧۤۢ;", "owner", "Landroid/os/Bundle;", "defaultArgs", "(LYue/ۥۡۧۤۢ;Landroid/os/Bundle;)V", "Landroidx/lifecycle/ViewModel;", C4750.f10502, "", C6659.f17103, "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/SavedStateHandle;", "handle", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "viewModel", "LYue/ۥۣۢ۠ۤ;", "onRequery", "(Landroidx/lifecycle/ViewModel;)V", "Landroidx/savedstate/ۥ;", "savedStateRegistry", "Landroidx/savedstate/ۥ;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "Landroid/os/Bundle;", "Companion", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
public abstract class AbstractSavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {

    @InterfaceC6399
    public static final String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";

    @InterfaceC6489
    private Bundle defaultArgs;

    @InterfaceC6489
    private Lifecycle lifecycle;

    @InterfaceC6489
    private C1794 savedStateRegistry;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractSavedStateViewModelFactory() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @InterfaceC6399
    public <T extends ViewModel> T create(@InterfaceC6399 Class<T> modelClass, @InterfaceC6399 CreationExtras extras) {
        C5499.m17103(modelClass, "modelClass");
        C5499.m17103(extras, "extras");
        String str = (String) extras.get(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str != null) {
            return this.savedStateRegistry != null ? (T) create(str, modelClass) : (T) create(str, modelClass, SavedStateHandleSupport.createSavedStateHandle(extras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @InterfaceC6399
    public abstract <T extends ViewModel> T create(@InterfaceC6399 String key, @InterfaceC6399 Class<T> modelClass, @InterfaceC6399 SavedStateHandle handle);

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public void onRequery(@InterfaceC6399 ViewModel viewModel) {
        C5499.m17103(viewModel, "viewModel");
        C1794 c1794 = this.savedStateRegistry;
        if (c1794 != null) {
            C5499.m17100(c1794);
            Lifecycle lifecycle = this.lifecycle;
            C5499.m17100(lifecycle);
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, c1794, lifecycle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractSavedStateViewModelFactory(@InterfaceC6399 InterfaceC7235 interfaceC7235, @InterfaceC6489 Bundle bundle) {
        C5499.m17103(interfaceC7235, "owner");
        this.savedStateRegistry = interfaceC7235.getSavedStateRegistry();
        this.lifecycle = interfaceC7235.getLifecycle();
        this.defaultArgs = bundle;
    }

    private final <T extends ViewModel> T create(String key, Class<T> modelClass) {
        C1794 c1794 = this.savedStateRegistry;
        C5499.m17100(c1794);
        Lifecycle lifecycle = this.lifecycle;
        C5499.m17100(lifecycle);
        SavedStateHandleController savedStateHandleControllerCreate = LegacySavedStateHandleController.create(c1794, lifecycle, key, this.defaultArgs);
        T t = (T) create(key, modelClass, savedStateHandleControllerCreate.getHandle());
        t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerCreate);
        return t;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @InterfaceC6399
    public <T extends ViewModel> T create(@InterfaceC6399 Class<T> modelClass) {
        C5499.m17103(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            if (this.lifecycle != null) {
                return (T) create(canonicalName, modelClass);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
