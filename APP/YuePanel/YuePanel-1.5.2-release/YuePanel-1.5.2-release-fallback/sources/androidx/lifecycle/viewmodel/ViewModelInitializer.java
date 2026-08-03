package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B.\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR+\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "Landroidx/lifecycle/ViewModel;", "T", "", "Ljava/lang/Class;", "clazz", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "LYue/ۥ۠ۡۥۧ;", "initializer", "<init>", "(Ljava/lang/Class;LYue/ۥۣ۠ۡ۟;)V", "Ljava/lang/Class;", "getClazz$lifecycle_viewmodel_release", "()Ljava/lang/Class;", "LYue/ۥۣ۠ۡ۟;", "getInitializer$lifecycle_viewmodel_release", "()LYue/ۥۣ۠ۡ۟;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
public final class ViewModelInitializer<T extends androidx.lifecycle.ViewModel> {

    @Yue.InterfaceC4418
    private final java.lang.Class<T> clazz;

    @Yue.InterfaceC4418
    private final Yue.InterfaceC2825<androidx.lifecycle.viewmodel.CreationExtras, T> initializer;

    public ViewModelInitializer(@Yue.InterfaceC4418 java.lang.Class<T> r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super androidx.lifecycle.viewmodel.CreationExtras, ? extends T> r3) {
            r1 = this;
            java.lang.String r0 = "clazz"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "initializer"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.clazz = r2
            r1.initializer = r3
            return
    }

    @Yue.InterfaceC4418
    public final java.lang.Class<T> getClazz$lifecycle_viewmodel_release() {
            r1 = this;
            java.lang.Class<T extends androidx.lifecycle.ViewModel> r0 = r1.clazz
            return r0
    }

    @Yue.InterfaceC4418
    public final Yue.InterfaceC2825<androidx.lifecycle.viewmodel.CreationExtras, T> getInitializer$lifecycle_viewmodel_release() {
            r1 = this;
            Yue.ۥۣ۠ۡ۟<androidx.lifecycle.viewmodel.CreationExtras, T extends androidx.lifecycle.ViewModel> r0 = r1.initializer
            return r0
    }
}
