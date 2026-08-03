package android.view;

import Yue.AbstractC5673;
import Yue.InterfaceC5122;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6211(m2698d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m2699d2 = {"<anonymous>", "Landroidx/lifecycle/SavedStateHandlesVM;", "invoke"}, m2700k = 3, m2701mv = {1, 8, 0}, m2703xi = 48)
public final class SavedStateHandlesProvider$viewModel$2 extends AbstractC5673 implements InterfaceC5122<SavedStateHandlesVM> {
    final /* synthetic */ ViewModelStoreOwner $viewModelStoreOwner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedStateHandlesProvider$viewModel$2(ViewModelStoreOwner viewModelStoreOwner) {
        super(0);
        this.$viewModelStoreOwner = viewModelStoreOwner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // Yue.InterfaceC5122
    @InterfaceC6399
    public final SavedStateHandlesVM invoke() {
        return SavedStateHandleSupport.getSavedStateHandlesVM(this.$viewModelStoreOwner);
    }
}
