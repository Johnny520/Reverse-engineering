package top.suzhelan.sticker.sdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.kongzue.dialogx.interfaces.InterfaceC3745;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class FollowLinearLayout extends LinearLayout implements InterfaceC3745 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public CustomRecycleView f16298;

    public FollowLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3745
    public int getScrollDistance() {
        CustomRecycleView customRecycleView = this.f16298;
        if (customRecycleView != null) {
            return customRecycleView.getScrollDistance();
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CustomRecycleView customRecycleView = this.f16298;
        return customRecycleView != null ? customRecycleView.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    public void setFollowRecycleView(CustomRecycleView customRecycleView) {
        this.f16298 = customRecycleView;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3745
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8077() {
        CustomRecycleView customRecycleView = this.f16298;
        return customRecycleView != null && customRecycleView.mo8077();
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3745
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo8078(boolean z) {
        CustomRecycleView customRecycleView = this.f16298;
        if (customRecycleView != null) {
            customRecycleView.f16297 = z;
        }
    }
}
