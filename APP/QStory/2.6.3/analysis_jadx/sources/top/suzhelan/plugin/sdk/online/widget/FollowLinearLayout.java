package top.suzhelan.plugin.sdk.online.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.kongzue.dialogx.interfaces.InterfaceC3746;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class FollowLinearLayout extends LinearLayout implements InterfaceC3746 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public CustomRecycleView f15932;

    public FollowLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3746
    public int getScrollDistance() {
        return this.f15932.getScrollDistance();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f15932.onTouchEvent(motionEvent);
    }

    public void setFollowRecycleView(CustomRecycleView customRecycleView) {
        this.f15932 = customRecycleView;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3746
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8064() {
        return this.f15932.mo8064();
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3746
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo8065(boolean z) {
        this.f15932.f15931 = z;
    }
}
