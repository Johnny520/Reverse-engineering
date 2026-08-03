package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001d\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "LYue/ۥۣۢ۠ۤ;", "set", "(Landroid/view/View;Landroidx/lifecycle/ViewModelStoreOwner;)V", "setViewTreeViewModelStoreOwner", "get", "(Landroid/view/View;)Landroidx/lifecycle/ViewModelStoreOwner;", "findViewTreeViewModelStoreOwner", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0})
@Yue.InterfaceC3421(name = "ViewTreeViewModelStoreOwner")
public final class ViewTreeViewModelStoreOwner {
    @Yue.InterfaceC3421(name = "get")
    @Yue.InterfaceC4543
    public static final androidx.lifecycle.ViewModelStoreOwner get(@Yue.InterfaceC4418 android.view.View r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1 r0 = androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1.INSTANCE
            Yue.ۥۡۨۢ r1 = Yue.C5616.m20994(r1, r0)
            androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 r0 = androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2.INSTANCE
            Yue.ۥۡۨۢ r1 = Yue.C5629.m21106(r1, r0)
            java.lang.Object r1 = Yue.C5629.m21070(r1)
            androidx.lifecycle.ViewModelStoreOwner r1 = (androidx.lifecycle.ViewModelStoreOwner) r1
            return r1
    }

    @Yue.InterfaceC3421(name = "set")
    public static final void set(@Yue.InterfaceC4418 android.view.View r1, @Yue.InterfaceC4543 androidx.lifecycle.ViewModelStoreOwner r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            int r0 = androidx.lifecycle.viewmodel.R.id.view_tree_view_model_store_owner
            r1.setTag(r0, r2)
            return
    }
}
