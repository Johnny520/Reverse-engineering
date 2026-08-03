package android.view;

import Yue.C5499;
import Yue.EnumC0393;
import Yue.InterfaceC4372;
import Yue.InterfaceC6211;
import Yue.InterfaceC7097;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, m2699d2 = {"findViewTreeViewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "view", "Landroid/view/View;", "lifecycle-viewmodel_release"}, m2700k = 2, m2701mv = {1, 8, 0}, m2703xi = 48)
public final class ViewTreeViewModelKt {
    @InterfaceC4372(level = EnumC0393.f8972, message = "Replaced by View.findViewTreeViewModelStoreOwner in ViewTreeViewModelStoreOwner", replaceWith = @InterfaceC7097(expression = "View.findViewTreeViewModelStoreOwner", imports = {"androidx.lifecycle.ViewTreeViewModelStoreOwner"}))
    public static final /* synthetic */ ViewModelStoreOwner findViewTreeViewModelStoreOwner(View view) {
        C5499.m17103(view, "view");
        return C9041ViewTreeViewModelStoreOwner.get(view);
    }
}
