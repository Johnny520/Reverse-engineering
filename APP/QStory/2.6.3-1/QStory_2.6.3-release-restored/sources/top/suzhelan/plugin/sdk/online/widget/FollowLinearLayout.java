package top.suzhelan.plugin.sdk.online.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.kongzue.dialogx.interfaces.InterfaceC4578;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class FollowLinearLayout extends LinearLayout implements InterfaceC4578 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public CustomRecycleView f16277;

    public FollowLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4578
    public int getScrollDistance() {
        return this.f16277.getScrollDistance();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f16277.onTouchEvent(motionEvent);
    }

    public void setFollowRecycleView(CustomRecycleView customRecycleView) {
        this.f16277 = customRecycleView;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4578
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8623() {
        return this.f16277.mo8623();
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4578
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo8624(boolean z) {
        this.f16277.f16276 = z;
    }
}
