package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\u0004\u001a\u0002H\u0005\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0006*\u00020\u0007H\u0087\b¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"defaultCreationExtras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "get", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider;", "(Landroidx/lifecycle/ViewModelProvider;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@Yue.InterfaceC3421(name = "ViewModelProviderGetKt")
public final class ViewModelProviderGetKt {
    @Yue.InterfaceC4418
    public static final androidx.lifecycle.viewmodel.CreationExtras defaultCreationExtras(@Yue.InterfaceC4418 androidx.lifecycle.ViewModelStoreOwner r1) {
            java.lang.String r0 = "owner"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r0 == 0) goto L10
            androidx.lifecycle.HasDefaultViewModelProviderFactory r1 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r1
            androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
            goto L12
        L10:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r1 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
        L12:
            return r1
    }

    @Yue.InterfaceC3875
    public static final /* synthetic */ <VM extends androidx.lifecycle.ViewModel> VM get(androidx.lifecycle.ViewModelProvider r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            r0 = 4
            java.lang.String r1 = "VM"
            Yue.C3329.m13915(r0, r1)
            java.lang.Class<androidx.lifecycle.ViewModel> r0 = androidx.lifecycle.ViewModel.class
            androidx.lifecycle.ViewModel r2 = r2.get(r0)
            return r2
    }
}
