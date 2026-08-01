package androidx.lifecycle;

/* JADX INFO: loaded from: classes2.dex */
public class ViewTreeViewModelStoreOwner {
    private ViewTreeViewModelStoreOwner() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.lifecycle.ViewModelStoreOwner get(android.view.View r4) {
            int r0 = androidx.lifecycle.viewmodel.C0331R.id.view_tree_view_model_store_owner
            java.lang.Object r0 = r4.getTag(r0)
            androidx.lifecycle.ViewModelStoreOwner r0 = (androidx.lifecycle.ViewModelStoreOwner) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            android.view.ViewParent r1 = r4.getParent()
        Lf:
            if (r0 != 0) goto L26
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L26
            r2 = r1
            android.view.View r2 = (android.view.View) r2
            int r3 = androidx.lifecycle.viewmodel.C0331R.id.view_tree_view_model_store_owner
            java.lang.Object r3 = r2.getTag(r3)
            r0 = r3
            androidx.lifecycle.ViewModelStoreOwner r0 = (androidx.lifecycle.ViewModelStoreOwner) r0
            android.view.ViewParent r1 = r2.getParent()
            goto Lf
        L26:
            return r0
    }

    public static void set(android.view.View r1, androidx.lifecycle.ViewModelStoreOwner r2) {
            int r0 = androidx.lifecycle.viewmodel.C0331R.id.view_tree_view_model_store_owner
            r1.setTag(r0, r2)
            return
    }
}
