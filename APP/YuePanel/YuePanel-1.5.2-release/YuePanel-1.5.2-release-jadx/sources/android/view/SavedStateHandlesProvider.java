package android.view;

import Yue.C5499;
import Yue.C5689;
import Yue.C6659;
import Yue.InterfaceC5684;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7507;
import android.os.Bundle;
import androidx.savedstate.C1794;
import java.util.Map;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n215#2,2:226\n1#3:228\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n*L\n146#1:226,2\n*E\n"})
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/lifecycle/SavedStateHandlesProvider;", "Landroidx/savedstate/ۥ$ۥ۟۟;", "Landroidx/savedstate/ۥ;", "savedStateRegistry", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/savedstate/ۥ;Landroidx/lifecycle/ViewModelStoreOwner;)V", "Landroid/os/Bundle;", "saveState", "()Landroid/os/Bundle;", "LYue/ۥۣۢ۠ۤ;", "performRestore", "()V", "", C6659.f17103, "consumeRestoredStateForKey", "(Ljava/lang/String;)Landroid/os/Bundle;", "Landroidx/savedstate/ۥ;", "", "restored", "Z", "restoredState", "Landroid/os/Bundle;", "Landroidx/lifecycle/SavedStateHandlesVM;", "viewModel$delegate", "LYue/ۥ۠ۦۨۨ;", "getViewModel", "()Landroidx/lifecycle/SavedStateHandlesVM;", "viewModel", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
public final class SavedStateHandlesProvider implements C1794.InterfaceC9000 {
    private boolean restored;

    @InterfaceC6489
    private Bundle restoredState;

    @InterfaceC6399
    private final C1794 savedStateRegistry;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 viewModel;

    public SavedStateHandlesProvider(@InterfaceC6399 C1794 c1794, @InterfaceC6399 ViewModelStoreOwner viewModelStoreOwner) {
        C5499.m17103(c1794, "savedStateRegistry");
        C5499.m17103(viewModelStoreOwner, "viewModelStoreOwner");
        this.savedStateRegistry = c1794;
        this.viewModel = C5689.m2370(new SavedStateHandlesProvider$viewModel$2(viewModelStoreOwner));
    }

    private final SavedStateHandlesVM getViewModel() {
        return (SavedStateHandlesVM) this.viewModel.getValue();
    }

    @InterfaceC6489
    public final Bundle consumeRestoredStateForKey(@InterfaceC6399 String key) {
        C5499.m17103(key, C6659.f17103);
        performRestore();
        Bundle bundle = this.restoredState;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.restoredState;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.restoredState;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.restoredState = null;
        }
        return bundle2;
    }

    public final void performRestore() {
        if (this.restored) {
            return;
        }
        Bundle bundleM5022 = this.savedStateRegistry.m5022("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM5022 != null) {
            bundle.putAll(bundleM5022);
        }
        this.restoredState = bundle;
        this.restored = true;
        getViewModel();
    }

    @Override // androidx.savedstate.C1794.InterfaceC9000
    @InterfaceC6399
    public Bundle saveState() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, SavedStateHandle> entry : getViewModel().getHandles().entrySet()) {
            String key = entry.getKey();
            Bundle bundleSaveState = entry.getValue().getSavedStateProvider().saveState();
            if (!C5499.m17094(bundleSaveState, Bundle.EMPTY)) {
                bundle.putBundle(key, bundleSaveState);
            }
        }
        this.restored = false;
        return bundle;
    }
}
