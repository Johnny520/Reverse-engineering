package p318;

import android.view.View;
import androidx.compose.animation.core.C0318;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC2270;
import java.util.WeakHashMap;
import p201.AbstractC7875;

/* JADX INFO: renamed from: 飘花落叶言楪苏子哲兰世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8681 extends AbstractC7875 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C0318 f24477;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public void mo7012(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.m3929(view, i);
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public boolean mo7006(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo7012(coordinatorLayout, view, i);
        if (this.f24477 == null) {
            C0318 c0318 = new C0318();
            c0318.f1071 = view;
            this.f24477 = c0318;
        }
        C0318 c03182 = this.f24477;
        View view2 = (View) c03182.f1071;
        c03182.f1072 = view2.getTop();
        c03182.f1070 = view2.getLeft();
        C0318 c03183 = this.f24477;
        View view3 = (View) c03183.f1071;
        int top2 = 0 - (view3.getTop() - c03183.f1072);
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        view3.offsetTopAndBottom(top2);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - c03183.f1070));
        return true;
    }
}
