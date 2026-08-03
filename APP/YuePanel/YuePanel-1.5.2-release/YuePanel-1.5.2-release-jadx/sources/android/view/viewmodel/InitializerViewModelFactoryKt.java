package android.view.viewmodel;

import Yue.C5499;
import Yue.C7071;
import Yue.C8107;
import Yue.InterfaceC5124;
import Yue.InterfaceC6399;
import android.view.ViewModel;
import android.view.ViewModelProvider;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a>\u0010\u000b\u001a\u00020\u0002\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\b*\u00020\u00012\u0019\b\b\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "builder", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "(LYue/ۥۣ۠ۡ۟;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "initializer", "(Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;LYue/ۥۣ۠ۡ۟;)V", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0})
public final class InitializerViewModelFactoryKt {
    public static final /* synthetic */ <VM extends ViewModel> void initializer(InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder, InterfaceC5124<? super CreationExtras, ? extends VM> interfaceC5124) {
        C5499.m17103(initializerViewModelFactoryBuilder, "<this>");
        C5499.m17103(interfaceC5124, "initializer");
        C5499.m17112(4, "VM");
        initializerViewModelFactoryBuilder.addInitializer(C7071.m21996(ViewModel.class), interfaceC5124);
    }

    @InterfaceC6399
    public static final ViewModelProvider.Factory viewModelFactory(@InterfaceC6399 InterfaceC5124<? super InitializerViewModelFactoryBuilder, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "builder");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        interfaceC5124.invoke(initializerViewModelFactoryBuilder);
        return initializerViewModelFactoryBuilder.build();
    }
}
