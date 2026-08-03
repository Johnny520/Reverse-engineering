package android.view;

import Yue.AbstractC5673;
import Yue.C5499;
import Yue.InterfaceC5124;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import android.view.View;
import android.view.runtime.C1725R;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m2699d2 = {"<anonymous>", "Landroidx/lifecycle/LifecycleOwner;", "viewParent", "Landroid/view/View;", "invoke"}, m2700k = 3, m2701mv = {1, 8, 0}, m2703xi = 48)
public final class ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2 extends AbstractC5673 implements InterfaceC5124<View, LifecycleOwner> {
    public static final ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2 INSTANCE = new ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2();

    public ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2() {
        super(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // Yue.InterfaceC5124
    @InterfaceC6489
    public final LifecycleOwner invoke(@InterfaceC6399 View view) {
        C5499.m17103(view, "viewParent");
        Object tag = view.getTag(C1725R.id.view_tree_lifecycle_owner);
        if (tag instanceof LifecycleOwner) {
            return (LifecycleOwner) tag;
        }
        return null;
    }
}
