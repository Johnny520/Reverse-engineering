package androidx.lifecycle;

/* JADX INFO: loaded from: classes2.dex */
public interface HasDefaultViewModelProviderFactory {
    default androidx.lifecycle.viewmodel.CreationExtras getDefaultViewModelCreationExtras() {
            r1 = this;
            androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
            return r0
    }

    androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory();
}
