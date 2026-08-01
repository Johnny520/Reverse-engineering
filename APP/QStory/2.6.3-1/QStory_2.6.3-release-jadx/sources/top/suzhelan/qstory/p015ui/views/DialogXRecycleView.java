package top.suzhelan.qstory.p015ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.kongzue.dialogx.interfaces.InterfaceC4578;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class DialogXRecycleView extends RecyclerView implements InterfaceC4578 {

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public boolean f16640;

    public DialogXRecycleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4578
    public int getScrollDistance() {
        return computeVerticalScrollOffset();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f16640) {
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
        this.f16640 = z;
    }
}
