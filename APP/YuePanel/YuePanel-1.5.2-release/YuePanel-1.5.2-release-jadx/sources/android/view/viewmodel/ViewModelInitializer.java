package android.view.viewmodel;

import Yue.C4750;
import Yue.C5499;
import Yue.InterfaceC5124;
import Yue.InterfaceC6399;
import android.view.ViewModel;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B.\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR+\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "Landroidx/lifecycle/ViewModel;", C4750.f10502, "", "Ljava/lang/Class;", "clazz", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "LYue/ۥ۠ۡۥۧ;", "initializer", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Class;LYue/ۥۣ۠ۡ۟;)V", "Ljava/lang/Class;", "getClazz$lifecycle_viewmodel_release", "()Ljava/lang/Class;", "LYue/ۥۣ۠ۡ۟;", "getInitializer$lifecycle_viewmodel_release", "()LYue/ۥۣ۠ۡ۟;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
public final class ViewModelInitializer<T extends ViewModel> {

    @InterfaceC6399
    private final Class<T> clazz;

    @InterfaceC6399
    private final InterfaceC5124<CreationExtras, T> initializer;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super androidx.lifecycle.viewmodel.CreationExtras, ? extends T extends androidx.lifecycle.ViewModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelInitializer(@InterfaceC6399 Class<T> cls, @InterfaceC6399 InterfaceC5124<? super CreationExtras, ? extends T> interfaceC5124) {
        C5499.m17103(cls, "clazz");
        C5499.m17103(interfaceC5124, "initializer");
        this.clazz = cls;
        this.initializer = interfaceC5124;
    }

    @InterfaceC6399
    public final Class<T> getClazz$lifecycle_viewmodel_release() {
        return this.clazz;
    }

    @InterfaceC6399
    public final InterfaceC5124<CreationExtras, T> getInitializer$lifecycle_viewmodel_release() {
        return this.initializer;
    }
}
