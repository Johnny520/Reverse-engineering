package p334;

import android.view.View;
import androidx.compose.animation.core.C1164;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC3103;
import java.util.WeakHashMap;
import p217.AbstractC8705;

/* JADX INFO: renamed from: 飘花落叶言楪苏子哲兰世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9502 extends AbstractC8705 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C1164 f24814;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public void mo7558(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.m4499(view, i);
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public boolean mo7552(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo7558(coordinatorLayout, view, i);
        if (this.f24814 == null) {
            C1164 c1164 = new C1164();
            c1164.f1416 = view;
            this.f24814 = c1164;
        }
        C1164 c11642 = this.f24814;
        View view2 = (View) c11642.f1416;
        c11642.f1417 = view2.getTop();
        c11642.f1415 = view2.getLeft();
        C1164 c11643 = this.f24814;
        View view3 = (View) c11643.f1416;
        int top2 = 0 - (view3.getTop() - c11643.f1417);
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        view3.offsetTopAndBottom(top2);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - c11643.f1415));
        return true;
    }
}
