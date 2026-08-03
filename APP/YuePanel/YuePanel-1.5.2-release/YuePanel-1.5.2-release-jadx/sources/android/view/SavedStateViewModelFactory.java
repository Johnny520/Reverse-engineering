package android.view;

import Yue.C4750;
import Yue.C5499;
import Yue.C6659;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7144;
import Yue.InterfaceC7235;
import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import android.view.ViewModelProvider;
import android.view.viewmodel.CreationExtras;
import androidx.savedstate.C1794;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0003\u0010\tB%\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0003\u0010\fJ/\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0013\u0010\u0017J'\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\rH\u0017¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Landroidx/lifecycle/SavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Landroid/app/Application;", "application", "LYue/ۥۡۧۤۢ;", "owner", "(Landroid/app/Application;LYue/ۥۡۧۤۢ;)V", "Landroid/os/Bundle;", "defaultArgs", "(Landroid/app/Application;LYue/ۥۡۧۤۢ;Landroid/os/Bundle;)V", "Landroidx/lifecycle/ViewModel;", C4750.f10502, "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "", C6659.f17103, "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "viewModel", "LYue/ۥۣۢ۠ۤ;", "onRequery", "(Landroidx/lifecycle/ViewModel;)V", "Landroid/app/Application;", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroid/os/Bundle;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "Landroidx/savedstate/ۥ;", "savedStateRegistry", "Landroidx/savedstate/ۥ;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
public final class SavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {

    @InterfaceC6489
    private Application application;

    @InterfaceC6489
    private Bundle defaultArgs;

    @InterfaceC6399
    private final ViewModelProvider.Factory factory;

    @InterfaceC6489
    private Lifecycle lifecycle;

    @InterfaceC6489
    private C1794 savedStateRegistry;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SavedStateViewModelFactory() {
        this.factory = new ViewModelProvider.AndroidViewModelFactory();
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.lifecycle.SavedStateViewModelFactoryKt.access$getANDROID_VIEWMODEL_SIGNATURE$p():java.util.List */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @InterfaceC6399
    public <T extends ViewModel> T create(@InterfaceC6399 Class<T> modelClass, @InterfaceC6399 CreationExtras extras) {
        C5499.m17103(modelClass, "modelClass");
        C5499.m17103(extras, "extras");
        String str = (String) extras.get(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.get(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY) == null || extras.get(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY) == null) {
            if (this.lifecycle != null) {
                return (T) create(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.get(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY);
        boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
        Constructor constructorFindMatchingConstructor = (!zIsAssignableFrom || application == null) ? SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE) : SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE);
        return constructorFindMatchingConstructor == null ? (T) this.factory.create(modelClass, extras) : (!zIsAssignableFrom || application == null) ? (T) SavedStateViewModelFactoryKt.newInstance(modelClass, constructorFindMatchingConstructor, SavedStateHandleSupport.createSavedStateHandle(extras)) : (T) SavedStateViewModelFactoryKt.newInstance(modelClass, constructorFindMatchingConstructor, application, SavedStateHandleSupport.createSavedStateHandle(extras));
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public void onRequery(@InterfaceC6399 ViewModel viewModel) {
        C5499.m17103(viewModel, "viewModel");
        if (this.lifecycle != null) {
            C1794 c1794 = this.savedStateRegistry;
            C5499.m17100(c1794);
            Lifecycle lifecycle = this.lifecycle;
            C5499.m17100(lifecycle);
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, c1794, lifecycle);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SavedStateViewModelFactory(@InterfaceC6489 Application application, @InterfaceC6399 InterfaceC7235 interfaceC7235) {
        this(application, interfaceC7235, null);
        C5499.m17103(interfaceC7235, "owner");
    }

    @SuppressLint({"LambdaLast"})
    public SavedStateViewModelFactory(@InterfaceC6489 Application application, @InterfaceC6399 InterfaceC7235 interfaceC7235, @InterfaceC6489 Bundle bundle) {
        ViewModelProvider.AndroidViewModelFactory androidViewModelFactory;
        C5499.m17103(interfaceC7235, "owner");
        this.savedStateRegistry = interfaceC7235.getSavedStateRegistry();
        this.lifecycle = interfaceC7235.getLifecycle();
        this.defaultArgs = bundle;
        this.application = application;
        if (application != null) {
            androidViewModelFactory = ViewModelProvider.AndroidViewModelFactory.Companion.getInstance(application);
        } else {
            androidViewModelFactory = new ViewModelProvider.AndroidViewModelFactory();
        }
        this.factory = androidViewModelFactory;
    }

    @InterfaceC6399
    public final <T extends ViewModel> T create(@InterfaceC6399 String key, @InterfaceC6399 Class<T> modelClass) {
        Constructor constructorFindMatchingConstructor;
        T t;
        Application application;
        C5499.m17103(key, C6659.f17103);
        C5499.m17103(modelClass, "modelClass");
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle != null) {
            boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
            if (zIsAssignableFrom && this.application != null) {
                constructorFindMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE);
            } else {
                constructorFindMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE);
            }
            if (constructorFindMatchingConstructor == null) {
                return this.application != null ? (T) this.factory.create(modelClass) : (T) ViewModelProvider.NewInstanceFactory.Companion.getInstance().create(modelClass);
            }
            C1794 c1794 = this.savedStateRegistry;
            C5499.m17100(c1794);
            SavedStateHandleController savedStateHandleControllerCreate = LegacySavedStateHandleController.create(c1794, lifecycle, key, this.defaultArgs);
            if (zIsAssignableFrom && (application = this.application) != null) {
                C5499.m17100(application);
                t = (T) SavedStateViewModelFactoryKt.newInstance(modelClass, constructorFindMatchingConstructor, application, savedStateHandleControllerCreate.getHandle());
            } else {
                t = (T) SavedStateViewModelFactoryKt.newInstance(modelClass, constructorFindMatchingConstructor, savedStateHandleControllerCreate.getHandle());
            }
            t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerCreate);
            return t;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @InterfaceC6399
    public <T extends ViewModel> T create(@InterfaceC6399 Class<T> modelClass) {
        C5499.m17103(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) create(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
