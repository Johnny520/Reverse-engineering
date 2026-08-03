package androidx.lifecycle.viewmodel;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a>\u0010\u000b\u001a\u00020\u0002\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\b*\u00020\u00012\u0019\b\b\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "builder", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "(LYue/ۥۣ۠ۡ۟;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "initializer", "(Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;LYue/ۥۣ۠ۡ۟;)V", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0})
public final class InitializerViewModelFactoryKt {
    public static final /* synthetic */ <VM extends androidx.lifecycle.ViewModel> void initializer(androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder r2, Yue.InterfaceC2825<? super androidx.lifecycle.viewmodel.CreationExtras, ? extends VM> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "initializer"
            Yue.C3329.m13906(r3, r0)
            r0 = 4
            java.lang.String r1 = "VM"
            Yue.C3329.m13915(r0, r1)
            java.lang.Class<androidx.lifecycle.ViewModel> r0 = androidx.lifecycle.ViewModel.class
            Yue.ۥ۠ۦۢۢ r0 = Yue.C5277.m19888(r0)
            r2.addInitializer(r0, r3)
            return
    }

    @Yue.InterfaceC4418
    public static final androidx.lifecycle.ViewModelProvider.Factory viewModelFactory(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder, Yue.C6593> r1) {
            java.lang.String r0 = "builder"
            Yue.C3329.m13906(r1, r0)
            androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder r0 = new androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder
            r0.<init>()
            r1.invoke(r0)
            androidx.lifecycle.ViewModelProvider$Factory r1 = r0.build()
            return r1
    }
}
