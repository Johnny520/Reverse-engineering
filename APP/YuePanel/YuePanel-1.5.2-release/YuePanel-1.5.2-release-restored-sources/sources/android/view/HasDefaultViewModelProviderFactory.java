package android.view;

import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import android.view.ViewModelProvider;
import android.view.viewmodel.CreationExtras;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m2699d2 = {"Landroidx/lifecycle/HasDefaultViewModelProviderFactory;", "", "defaultViewModelCreationExtras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultViewModelCreationExtras", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultViewModelProviderFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel_release"}, m2700k = 1, m2701mv = {1, 8, 0}, m2703xi = 48)
public interface HasDefaultViewModelProviderFactory {
    @InterfaceC6399
    default CreationExtras getDefaultViewModelCreationExtras() {
        return CreationExtras.Empty.INSTANCE;
    }

    @InterfaceC6399
    ViewModelProvider.Factory getDefaultViewModelProviderFactory();
}
