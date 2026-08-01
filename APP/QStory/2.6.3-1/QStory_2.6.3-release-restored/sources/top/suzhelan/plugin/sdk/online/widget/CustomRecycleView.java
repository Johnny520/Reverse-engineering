package top.suzhelan.plugin.sdk.online.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.AbstractC3352;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kongzue.dialogx.interfaces.InterfaceC4578;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class CustomRecycleView extends RecyclerView implements InterfaceC4578 {

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public boolean f16276;

    public CustomRecycleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4578
    public int getScrollDistance() {
        if (getChildCount() == 0) {
            return 0;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        View childAt = getChildAt(0);
        int iM5206 = linearLayoutManager.m5206();
        return ((iM5206 + 1) * childAt.getHeight()) - AbstractC3352.m5546(childAt);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f16276) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4578
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8623() {
        return canScrollVertically(1) || canScrollVertically(-1);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4578
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo8624(boolean z) {
        this.f16276 = z;
    }
}
