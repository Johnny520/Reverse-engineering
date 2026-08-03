package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/SavedStateHandlesVM;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class SavedStateHandlesProvider$viewModel$2 extends Yue.AbstractC3560 implements Yue.InterfaceC2823<androidx.lifecycle.SavedStateHandlesVM> {
    final /* synthetic */ androidx.lifecycle.ViewModelStoreOwner $viewModelStoreOwner;

    public SavedStateHandlesProvider$viewModel$2(androidx.lifecycle.ViewModelStoreOwner r1) {
            r0 = this;
            r0.$viewModelStoreOwner = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // Yue.InterfaceC2823
    @Yue.InterfaceC4418
    public final androidx.lifecycle.SavedStateHandlesVM invoke() {
            r1 = this;
            androidx.lifecycle.ViewModelStoreOwner r0 = r1.$viewModelStoreOwner
            androidx.lifecycle.SavedStateHandlesVM r0 = androidx.lifecycle.SavedStateHandleSupport.getSavedStateHandlesVM(r0)
            return r0
    }

    @Override // Yue.InterfaceC2823
    public /* bridge */ /* synthetic */ androidx.lifecycle.SavedStateHandlesVM invoke() {
            r1 = this;
            androidx.lifecycle.SavedStateHandlesVM r0 = r1.invoke()
            return r0
    }
}
