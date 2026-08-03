package android.view.viewmodel;

import Yue.C4750;
import Yue.C5499;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC7507;
import android.view.ViewModel;
import android.view.ViewModelProvider;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6211(m2698d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J-\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eR\u001c\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u000f"}, m2699d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "initializers", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "([Landroidx/lifecycle/viewmodel/ViewModelInitializer;)V", "[Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "create", C4750.f10502, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, m2700k = 1, m2701mv = {1, 8, 0}, m2703xi = 48)
@InterfaceC7507({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,115:1\n13579#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n*L\n105#1:116,2\n*E\n"})
public final class InitializerViewModelFactory implements ViewModelProvider.Factory {

    @InterfaceC6399
    private final ViewModelInitializer<?>[] initializers;

    public InitializerViewModelFactory(@InterfaceC6399 ViewModelInitializer<?>... viewModelInitializerArr) {
        C5499.m17103(viewModelInitializerArr, "initializers");
        this.initializers = viewModelInitializerArr;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @InterfaceC6399
    public <T extends ViewModel> T create(@InterfaceC6399 Class<T> cls, @InterfaceC6399 CreationExtras creationExtras) {
        C5499.m17103(cls, "modelClass");
        C5499.m17103(creationExtras, "extras");
        T t = null;
        for (ViewModelInitializer<?> viewModelInitializer : this.initializers) {
            if (C5499.m17094(viewModelInitializer.getClazz$lifecycle_viewmodel_release(), cls)) {
                T tInvoke = viewModelInitializer.getInitializer$lifecycle_viewmodel_release().invoke(creationExtras);
                t = tInvoke instanceof ViewModel ? tInvoke : null;
            }
        }
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
