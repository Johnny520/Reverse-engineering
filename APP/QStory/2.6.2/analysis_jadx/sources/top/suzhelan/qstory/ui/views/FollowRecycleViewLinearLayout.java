package top.suzhelan.qstory.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.kongzue.dialogx.interfaces.InterfaceC3745;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class FollowRecycleViewLinearLayout extends LinearLayout implements InterfaceC3745 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f16287;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public DialogXRecycleView f16288;

    public FollowRecycleViewLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16287 = false;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3745
    public int getScrollDistance() {
        if (this.f16287) {
            return 1;
        }
        DialogXRecycleView dialogXRecycleView = this.f16288;
        if (dialogXRecycleView != null) {
            return dialogXRecycleView.getScrollDistance();
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        DialogXRecycleView dialogXRecycleView = this.f16288;
        return dialogXRecycleView != null ? dialogXRecycleView.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    public void setDisableScroll(boolean z) {
        this.f16287 = z;
    }

    public void setFollowRecycleView(DialogXRecycleView dialogXRecycleView) {
        this.f16288 = dialogXRecycleView;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3745
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8077() {
        if (this.f16287) {
            return true;
        }
        DialogXRecycleView dialogXRecycleView = this.f16288;
        return dialogXRecycleView != null && dialogXRecycleView.mo8077();
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3745
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo8078(boolean z) {
        DialogXRecycleView dialogXRecycleView = this.f16288;
        if (dialogXRecycleView != null) {
            dialogXRecycleView.f16286 = z;
        }
    }
}
