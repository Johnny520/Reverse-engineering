package android.view;

import Yue.C5499;
import Yue.InterfaceC5572;
import Yue.InterfaceC5922;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import android.view.viewmodel.CreationExtras;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\u0004\u001a\u0002H\u0005\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0006*\u00020\u0007H\u0087\b¢\u0006\u0002\u0010\b¨\u0006\t"}, m2699d2 = {"defaultCreationExtras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "get", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider;", "(Landroidx/lifecycle/ViewModelProvider;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, m2700k = 2, m2701mv = {1, 8, 0}, m2703xi = 48)
@InterfaceC5572(name = "ViewModelProviderGetKt")
public final class ViewModelProviderGetKt {
    @InterfaceC6399
    public static final CreationExtras defaultCreationExtras(@InterfaceC6399 ViewModelStoreOwner viewModelStoreOwner) {
        C5499.m17103(viewModelStoreOwner, "owner");
        return viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
    }

    @InterfaceC5922
    public static final /* synthetic */ <VM extends ViewModel> VM get(ViewModelProvider viewModelProvider) {
        C5499.m17103(viewModelProvider, "<this>");
        C5499.m17112(4, "VM");
        return (VM) viewModelProvider.get(ViewModel.class);
    }
}
