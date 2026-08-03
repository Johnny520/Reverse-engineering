package android.view;

import Yue.C4750;
import Yue.C5499;
import Yue.C6659;
import Yue.C7071;
import Yue.InterfaceC5568;
import Yue.InterfaceC5572;
import Yue.InterfaceC5922;
import Yue.InterfaceC6399;
import Yue.InterfaceC7235;
import Yue.InterfaceC7507;
import android.os.Bundle;
import android.view.Lifecycle;
import android.view.ViewModelProvider;
import android.view.viewmodel.CreationExtras;
import android.view.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.savedstate.C1794;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,225:1\n1#2:226\n31#3:227\n63#3,2:228\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n*L\n109#1:227\n110#1:228,2\n*E\n"})
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000fH\u0007¢\u0006\u0004\b\r\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016\"\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016\"\u0018\u0010\u001c\u001a\u00020\u0019*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0018\u0010 \u001a\u00020\u001d*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LYue/ۥۡۧۤۢ;", "Landroidx/lifecycle/ViewModelStoreOwner;", C4750.f10502, "LYue/ۥۣۢ۠ۤ;", "enableSavedStateHandles", "(LYue/ۥۡۧۤۢ;)V", "savedStateRegistryOwner", "viewModelStoreOwner", "", C6659.f17103, "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/SavedStateHandle;", "createSavedStateHandle", "(LYue/ۥۡۧۤۢ;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/SavedStateHandle;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/SavedStateHandle;", "VIEWMODEL_KEY", "Ljava/lang/String;", "SAVED_STATE_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "SAVED_STATE_REGISTRY_OWNER_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "VIEW_MODEL_STORE_OWNER_KEY", "DEFAULT_ARGS_KEY", "Landroidx/lifecycle/SavedStateHandlesVM;", "getSavedStateHandlesVM", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/SavedStateHandlesVM;", "savedStateHandlesVM", "Landroidx/lifecycle/SavedStateHandlesProvider;", "getSavedStateHandlesProvider", "(LYue/ۥۡۧۤۢ;)Landroidx/lifecycle/SavedStateHandlesProvider;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0})
@InterfaceC5572(name = "SavedStateHandleSupport")
public final class SavedStateHandleSupport {

    @InterfaceC6399
    private static final String SAVED_STATE_KEY = "androidx.lifecycle.internal.SavedStateHandlesProvider";

    @InterfaceC6399
    private static final String VIEWMODEL_KEY = "androidx.lifecycle.internal.SavedStateHandlesVM";

    @InterfaceC6399
    @InterfaceC5568
    public static final CreationExtras.Key<InterfaceC7235> SAVED_STATE_REGISTRY_OWNER_KEY = new CreationExtras.Key<InterfaceC7235>() { // from class: androidx.lifecycle.SavedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1
    };

    @InterfaceC6399
    @InterfaceC5568
    public static final CreationExtras.Key<ViewModelStoreOwner> VIEW_MODEL_STORE_OWNER_KEY = new CreationExtras.Key<ViewModelStoreOwner>() { // from class: androidx.lifecycle.SavedStateHandleSupport$VIEW_MODEL_STORE_OWNER_KEY$1
    };

    @InterfaceC6399
    @InterfaceC5568
    public static final CreationExtras.Key<Bundle> DEFAULT_ARGS_KEY = new CreationExtras.Key<Bundle>() { // from class: androidx.lifecycle.SavedStateHandleSupport$DEFAULT_ARGS_KEY$1
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final SavedStateHandle createSavedStateHandle(InterfaceC7235 interfaceC7235, ViewModelStoreOwner viewModelStoreOwner, String str, Bundle bundle) {
        SavedStateHandlesProvider savedStateHandlesProvider = getSavedStateHandlesProvider(interfaceC7235);
        SavedStateHandlesVM savedStateHandlesVM = getSavedStateHandlesVM(viewModelStoreOwner);
        SavedStateHandle savedStateHandle = savedStateHandlesVM.getHandles().get(str);
        if (savedStateHandle != null) {
            return savedStateHandle;
        }
        SavedStateHandle savedStateHandleCreateHandle = SavedStateHandle.INSTANCE.createHandle(savedStateHandlesProvider.consumeRestoredStateForKey(str), bundle);
        savedStateHandlesVM.getHandles().put(str, savedStateHandleCreateHandle);
        return savedStateHandleCreateHandle;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T extends Yue.ۥۡۧۤۢ & androidx.lifecycle.ViewModelStoreOwner */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5922
    public static final <T extends InterfaceC7235 & ViewModelStoreOwner> void enableSavedStateHandles(@InterfaceC6399 T t) {
        C5499.m17103(t, "<this>");
        Lifecycle.State state = t.getLifecycle().getState();
        if (state != Lifecycle.State.INITIALIZED && state != Lifecycle.State.CREATED) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t.getSavedStateRegistry().m30800(SAVED_STATE_KEY) == null) {
            SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(t.getSavedStateRegistry(), t);
            t.getSavedStateRegistry().m30806(SAVED_STATE_KEY, savedStateHandlesProvider);
            t.getLifecycle().addObserver(new SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }

    @InterfaceC6399
    public static final SavedStateHandlesProvider getSavedStateHandlesProvider(@InterfaceC6399 InterfaceC7235 interfaceC7235) {
        C5499.m17103(interfaceC7235, "<this>");
        C1794.InterfaceC9000 interfaceC9000M30800 = interfaceC7235.getSavedStateRegistry().m30800(SAVED_STATE_KEY);
        SavedStateHandlesProvider savedStateHandlesProvider = interfaceC9000M30800 instanceof SavedStateHandlesProvider ? (SavedStateHandlesProvider) interfaceC9000M30800 : null;
        if (savedStateHandlesProvider != null) {
            return savedStateHandlesProvider;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    @InterfaceC6399
    public static final SavedStateHandlesVM getSavedStateHandlesVM(@InterfaceC6399 ViewModelStoreOwner viewModelStoreOwner) {
        C5499.m17103(viewModelStoreOwner, "<this>");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C7071.m21996(SavedStateHandlesVM.class), SavedStateHandleSupport$savedStateHandlesVM$1$1.INSTANCE);
        return (SavedStateHandlesVM) new ViewModelProvider(viewModelStoreOwner, initializerViewModelFactoryBuilder.build()).get(VIEWMODEL_KEY, SavedStateHandlesVM.class);
    }

    @InterfaceC6399
    @InterfaceC5922
    public static final SavedStateHandle createSavedStateHandle(@InterfaceC6399 CreationExtras creationExtras) {
        C5499.m17103(creationExtras, "<this>");
        InterfaceC7235 interfaceC7235 = (InterfaceC7235) creationExtras.get(SAVED_STATE_REGISTRY_OWNER_KEY);
        if (interfaceC7235 != null) {
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) creationExtras.get(VIEW_MODEL_STORE_OWNER_KEY);
            if (viewModelStoreOwner != null) {
                Bundle bundle = (Bundle) creationExtras.get(DEFAULT_ARGS_KEY);
                String str = (String) creationExtras.get(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
                if (str != null) {
                    return createSavedStateHandle(interfaceC7235, viewModelStoreOwner, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }
}
