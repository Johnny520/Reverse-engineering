package android.view;

import Yue.C5499;
import Yue.C7332;
import Yue.C7342;
import Yue.InterfaceC5572;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import android.view.View;
import android.view.viewmodel.C1726R;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.lifecycle.ViewTreeViewModelStoreOwner, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001d\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "LYue/ۥۣۢ۠ۤ;", "set", "(Landroid/view/View;Landroidx/lifecycle/ViewModelStoreOwner;)V", "setViewTreeViewModelStoreOwner", "get", "(Landroid/view/View;)Landroidx/lifecycle/ViewModelStoreOwner;", "findViewTreeViewModelStoreOwner", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0})
@InterfaceC5572(name = "ViewTreeViewModelStoreOwner")
public final class C9041ViewTreeViewModelStoreOwner {
    @InterfaceC5572(name = "get")
    @InterfaceC6489
    public static final ViewModelStoreOwner get(@InterfaceC6399 View view) {
        C5499.m17103(view, "<this>");
        return (ViewModelStoreOwner) C7342.m22954(C7342.m22990(C7332.m22878(view, ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1.INSTANCE), ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2.INSTANCE));
    }

    @InterfaceC5572(name = "set")
    public static final void set(@InterfaceC6399 View view, @InterfaceC6489 ViewModelStoreOwner viewModelStoreOwner) {
        C5499.m17103(view, "<this>");
        view.setTag(C1726R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}
