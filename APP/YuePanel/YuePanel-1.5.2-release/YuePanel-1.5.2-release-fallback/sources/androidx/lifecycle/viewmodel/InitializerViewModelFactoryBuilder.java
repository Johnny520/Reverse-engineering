package androidx.lifecycle.viewmodel;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,115:1\n37#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n*L\n54#1:116,2\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\b\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;", "", "<init>", "()V", "Landroidx/lifecycle/ViewModel;", "T", "LYue/ۥ۠ۦۢۢ;", "clazz", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "LYue/ۥ۠ۡۥۧ;", "initializer", "LYue/ۥۣۢ۠ۤ;", "addInitializer", "(LYue/ۥ۠ۦۢۢ;LYue/ۥۣ۠ۡ۟;)V", "Landroidx/lifecycle/ViewModelProvider$Factory;", "build", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "initializers", "Ljava/util/List;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
@androidx.lifecycle.viewmodel.ViewModelFactoryDsl
public final class InitializerViewModelFactoryBuilder {

    @Yue.InterfaceC4418
    private final java.util.List<androidx.lifecycle.viewmodel.ViewModelInitializer<?>> initializers;

    public InitializerViewModelFactoryBuilder() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.initializers = r0
            return
    }

    public final <T extends androidx.lifecycle.ViewModel> void addInitializer(@Yue.InterfaceC4418 Yue.InterfaceC3435<T> r3, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super androidx.lifecycle.viewmodel.CreationExtras, ? extends T> r4) {
            r2 = this;
            java.lang.String r0 = "clazz"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "initializer"
            Yue.C3329.m13906(r4, r0)
            java.util.List<androidx.lifecycle.viewmodel.ViewModelInitializer<?>> r0 = r2.initializers
            androidx.lifecycle.viewmodel.ViewModelInitializer r1 = new androidx.lifecycle.viewmodel.ViewModelInitializer
            java.lang.Class r3 = Yue.C3413.m14192(r3)
            r1.<init>(r3, r4)
            r0.add(r1)
            return
    }

    @Yue.InterfaceC4418
    public final androidx.lifecycle.ViewModelProvider.Factory build() {
            r3 = this;
            androidx.lifecycle.viewmodel.InitializerViewModelFactory r0 = new androidx.lifecycle.viewmodel.InitializerViewModelFactory
            java.util.List<androidx.lifecycle.viewmodel.ViewModelInitializer<?>> r1 = r3.initializers
            r2 = 0
            androidx.lifecycle.viewmodel.ViewModelInitializer[] r2 = new androidx.lifecycle.viewmodel.ViewModelInitializer[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            androidx.lifecycle.viewmodel.ViewModelInitializer[] r1 = (androidx.lifecycle.viewmodel.ViewModelInitializer[]) r1
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            androidx.lifecycle.viewmodel.ViewModelInitializer[] r1 = (androidx.lifecycle.viewmodel.ViewModelInitializer[]) r1
            r0.<init>(r1)
            return r0
    }
}
