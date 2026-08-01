package top.suzhelan.qstory.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.kongzue.dialogx.interfaces.InterfaceC3746;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class FollowRecycleViewLinearLayout extends LinearLayout implements InterfaceC3746 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f16296;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public DialogXRecycleView f16297;

    public FollowRecycleViewLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16296 = false;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3746
    public int getScrollDistance() {
        if (this.f16296) {
            return 1;
        }
        DialogXRecycleView dialogXRecycleView = this.f16297;
        if (dialogXRecycleView != null) {
            return dialogXRecycleView.getScrollDistance();
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        DialogXRecycleView dialogXRecycleView = this.f16297;
        return dialogXRecycleView != null ? dialogXRecycleView.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    public void setDisableScroll(boolean z) {
        this.f16296 = z;
    }

    public void setFollowRecycleView(DialogXRecycleView dialogXRecycleView) {
        this.f16297 = dialogXRecycleView;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3746
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8064() {
        if (this.f16296) {
            return true;
        }
        DialogXRecycleView dialogXRecycleView = this.f16297;
        return dialogXRecycleView != null && dialogXRecycleView.mo8064();
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3746
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo8065(boolean z) {
        DialogXRecycleView dialogXRecycleView = this.f16297;
        if (dialogXRecycleView != null) {
            dialogXRecycleView.f16295 = z;
        }
    }
}
