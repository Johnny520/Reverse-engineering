package top.suzhelan.plugin.sdk.online.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.AbstractC2519;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kongzue.dialogx.interfaces.InterfaceC3745;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class CustomRecycleView extends RecyclerView implements InterfaceC3745 {

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public boolean f15931;

    public CustomRecycleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3745
    public int getScrollDistance() {
        if (getChildCount() == 0) {
            return 0;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        View childAt = getChildAt(0);
        int iM4636 = linearLayoutManager.m4636();
        return ((iM4636 + 1) * childAt.getHeight()) - AbstractC2519.m4976(childAt);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f15931) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3745
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8077() {
        return canScrollVertically(1) || canScrollVertically(-1);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3745
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo8078(boolean z) {
        this.f15931 = z;
    }
}
