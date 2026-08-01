package top.suzhelan.sticker.sdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.kongzue.dialogx.interfaces.InterfaceC4578;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class FollowLinearLayout extends LinearLayout implements InterfaceC4578 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public CustomRecycleView f16652;

    public FollowLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4578
    public int getScrollDistance() {
        CustomRecycleView customRecycleView = this.f16652;
        if (customRecycleView != null) {
            return customRecycleView.getScrollDistance();
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CustomRecycleView customRecycleView = this.f16652;
        return customRecycleView != null ? customRecycleView.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    public void setFollowRecycleView(CustomRecycleView customRecycleView) {
        this.f16652 = customRecycleView;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4578
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8623() {
        CustomRecycleView customRecycleView = this.f16652;
        return customRecycleView != null && customRecycleView.mo8623();
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4578
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo8624(boolean z) {
        CustomRecycleView customRecycleView = this.f16652;
        if (customRecycleView != null) {
            customRecycleView.f16651 = z;
        }
    }
}
