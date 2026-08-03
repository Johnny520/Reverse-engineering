package android.view.viewmodel;

import Yue.C4750;
import Yue.C5499;
import Yue.C5564;
import Yue.InterfaceC5124;
import Yue.InterfaceC5585;
import Yue.InterfaceC6399;
import Yue.InterfaceC7507;
import android.view.ViewModel;
import android.view.ViewModelProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,115:1\n37#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n*L\n54#1:116,2\n*E\n"})
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\b\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Landroidx/lifecycle/ViewModel;", C4750.f10502, "LYue/ۥ۠ۦۢۢ;", "clazz", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "LYue/ۥ۠ۡۥۧ;", "initializer", "LYue/ۥۣۢ۠ۤ;", "addInitializer", "(LYue/ۥ۠ۦۢۢ;LYue/ۥۣ۠ۡ۟;)V", "Landroidx/lifecycle/ViewModelProvider$Factory;", "build", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "initializers", "Ljava/util/List;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
@ViewModelFactoryDsl
public final class InitializerViewModelFactoryBuilder {

    @InterfaceC6399
    private final List<ViewModelInitializer<?>> initializers = new ArrayList();

    public final <T extends ViewModel> void addInitializer(@InterfaceC6399 InterfaceC5585<T> clazz, @InterfaceC6399 InterfaceC5124<? super CreationExtras, ? extends T> initializer) {
        C5499.m17103(clazz, "clazz");
        C5499.m17103(initializer, "initializer");
        this.initializers.add(new ViewModelInitializer<>(C5564.m17346(clazz), initializer));
    }

    @InterfaceC6399
    public final ViewModelProvider.Factory build() {
        ViewModelInitializer[] viewModelInitializerArr = (ViewModelInitializer[]) this.initializers.toArray(new ViewModelInitializer[0]);
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }
}
