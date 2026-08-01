package top.suzhelan.sticker.sdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.kongzue.dialogx.interfaces.InterfaceC3746;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class FollowLinearLayout extends LinearLayout implements InterfaceC3746 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public CustomRecycleView f16307;

    public FollowLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3746
    public int getScrollDistance() {
        CustomRecycleView customRecycleView = this.f16307;
        if (customRecycleView != null) {
            return customRecycleView.getScrollDistance();
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CustomRecycleView customRecycleView = this.f16307;
        return customRecycleView != null ? customRecycleView.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    public void setFollowRecycleView(CustomRecycleView customRecycleView) {
        this.f16307 = customRecycleView;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3746
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8064() {
        CustomRecycleView customRecycleView = this.f16307;
        return customRecycleView != null && customRecycleView.mo8064();
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3746
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo8065(boolean z) {
        CustomRecycleView customRecycleView = this.f16307;
        if (customRecycleView != null) {
            customRecycleView.f16306 = z;
        }
    }
}
