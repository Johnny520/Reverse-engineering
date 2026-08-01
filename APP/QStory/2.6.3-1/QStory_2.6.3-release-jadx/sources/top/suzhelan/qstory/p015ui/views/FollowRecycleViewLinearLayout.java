package top.suzhelan.qstory.p015ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.kongzue.dialogx.interfaces.InterfaceC4578;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class FollowRecycleViewLinearLayout extends LinearLayout implements InterfaceC4578 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f16641;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public DialogXRecycleView f16642;

    public FollowRecycleViewLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16641 = false;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4578
    public int getScrollDistance() {
        if (this.f16641) {
            return 1;
        }
        DialogXRecycleView dialogXRecycleView = this.f16642;
        if (dialogXRecycleView != null) {
            return dialogXRecycleView.getScrollDistance();
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        DialogXRecycleView dialogXRecycleView = this.f16642;
        return dialogXRecycleView != null ? dialogXRecycleView.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    public void setDisableScroll(boolean z) {
        this.f16641 = z;
    }

    public void setFollowRecycleView(DialogXRecycleView dialogXRecycleView) {
        this.f16642 = dialogXRecycleView;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4578
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8623() {
        if (this.f16641) {
            return true;
        }
        DialogXRecycleView dialogXRecycleView = this.f16642;
        return dialogXRecycleView != null && dialogXRecycleView.mo8623();
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4578
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo8624(boolean z) {
        DialogXRecycleView dialogXRecycleView = this.f16642;
        if (dialogXRecycleView != null) {
            dialogXRecycleView.f16640 = z;
        }
    }
}
