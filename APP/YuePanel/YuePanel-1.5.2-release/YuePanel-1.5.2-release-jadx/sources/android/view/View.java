package android.view;

import Yue.C5499;
import Yue.C7332;
import Yue.C7342;
import Yue.InterfaceC5572;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import android.view.runtime.C1725R;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.lifecycle.ViewTreeLifecycleOwner, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001d\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "LYue/ۥۣۢ۠ۤ;", "set", "(Landroid/view/View;Landroidx/lifecycle/LifecycleOwner;)V", "setViewTreeLifecycleOwner", "get", "(Landroid/view/View;)Landroidx/lifecycle/LifecycleOwner;", "findViewTreeLifecycleOwner", "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0})
@InterfaceC5572(name = "ViewTreeLifecycleOwner")
public final class View {
    @InterfaceC5572(name = "get")
    @InterfaceC6489
    public static final LifecycleOwner get(@InterfaceC6399 android.view.View view) {
        C5499.m17103(view, "<this>");
        return (LifecycleOwner) C7342.m22954(C7342.m22990(C7332.m22878(view, ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1.INSTANCE), ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2.INSTANCE));
    }

    @InterfaceC5572(name = "set")
    public static final void set(@InterfaceC6399 android.view.View view, @InterfaceC6489 LifecycleOwner lifecycleOwner) {
        C5499.m17103(view, "<this>");
        view.setTag(C1725R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
