package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"findViewTreeViewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "view", "Landroid/view/View;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewTreeViewModelKt {
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Replaced by View.findViewTreeViewModelStoreOwner in ViewTreeViewModelStoreOwner", replaceWith = @Yue.InterfaceC5313(expression = "View.findViewTreeViewModelStoreOwner", imports = {"androidx.lifecycle.ViewTreeViewModelStoreOwner"}))
    public static final /* synthetic */ androidx.lifecycle.ViewModelStoreOwner findViewTreeViewModelStoreOwner(android.view.View r1) {
            java.lang.String r0 = "view"
            Yue.C3329.m13906(r1, r0)
            androidx.lifecycle.ViewModelStoreOwner r1 = androidx.lifecycle.ViewTreeViewModelStoreOwner.get(r1)
            return r1
    }
}
