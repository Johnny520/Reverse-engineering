package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "view", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<android.view.View, android.view.View> {
    public static final androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1 INSTANCE = null;

    static {
            androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1 r0 = new androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1
            r0.<init>()
            androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1.INSTANCE = r0
            return
    }

    public ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final android.view.View invoke2(@Yue.InterfaceC4418 android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            Yue.C3329.m13906(r2, r0)
            android.view.ViewParent r2 = r2.getParent()
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L10
            android.view.View r2 = (android.view.View) r2
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    @Override // Yue.InterfaceC2825
    public /* bridge */ /* synthetic */ android.view.View invoke(android.view.View r1) {
            r0 = this;
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r0.invoke2(r1)
            return r1
    }
}
