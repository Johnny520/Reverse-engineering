package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStoreOwner;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<android.view.View, androidx.lifecycle.ViewModelStoreOwner> {
    public static final androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 INSTANCE = null;

    static {
            androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 r0 = new androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2
            r0.<init>()
            androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2.INSTANCE = r0
            return
    }

    public ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final androidx.lifecycle.ViewModelStoreOwner invoke2(@Yue.InterfaceC4418 android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            Yue.C3329.m13906(r2, r0)
            int r0 = androidx.lifecycle.viewmodel.R.id.view_tree_view_model_store_owner
            java.lang.Object r2 = r2.getTag(r0)
            boolean r0 = r2 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r0 == 0) goto L12
            androidx.lifecycle.ViewModelStoreOwner r2 = (androidx.lifecycle.ViewModelStoreOwner) r2
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    @Override // Yue.InterfaceC2825
    public /* bridge */ /* synthetic */ androidx.lifecycle.ViewModelStoreOwner invoke(android.view.View r1) {
            r0 = this;
            android.view.View r1 = (android.view.View) r1
            androidx.lifecycle.ViewModelStoreOwner r1 = r0.invoke2(r1)
            return r1
    }
}
