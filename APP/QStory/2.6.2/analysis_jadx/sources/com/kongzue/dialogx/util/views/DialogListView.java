package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import com.android.dx.io.Opcodes;
import com.kongzue.dialogx.interfaces.AbstractC3747;
import com.kongzue.dialogx.interfaces.InterfaceC3745;
import p257.C8204;
import p257.C8206;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class DialogListView extends ListView implements InterfaceC3745 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f11615;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C8206 f11616;

    public DialogListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C8206 c8206;
        if ((motionEvent.getActionMasked() & Opcodes.CONST_METHOD_TYPE) == 0 && (c8206 = this.f11616) != null) {
            C8204 c8204 = c8206.f22613;
            c8204.f22603 = c8204.f22621.f22635.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public AbstractC3747 getBottomMenuListViewTouchEvent() {
        return this.f11616;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3745
    public int getScrollDistance() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return 0;
        }
        int firstVisiblePosition = getFirstVisiblePosition();
        return (childAt.getHeight() * firstVisiblePosition) + (-childAt.getTop());
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f11615) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3745
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8077() {
        return true;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3745
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo8078(boolean z) {
        this.f11615 = z;
    }
}
