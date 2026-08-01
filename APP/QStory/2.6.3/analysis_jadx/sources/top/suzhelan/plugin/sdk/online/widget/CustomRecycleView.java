package top.suzhelan.plugin.sdk.online.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.AbstractC2519;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kongzue.dialogx.interfaces.InterfaceC3746;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class CustomRecycleView extends RecyclerView implements InterfaceC3746 {

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public boolean f15931;

    public CustomRecycleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3746
    public int getScrollDistance() {
        if (getChildCount() == 0) {
            return 0;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        View childAt = getChildAt(0);
        int iM4646 = linearLayoutManager.m4646();
        return ((iM4646 + 1) * childAt.getHeight()) - AbstractC2519.m4986(childAt);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f15931) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3746
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8064() {
        return canScrollVertically(1) || canScrollVertically(-1);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3746
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo8065(boolean z) {
        this.f15931 = z;
    }
}
