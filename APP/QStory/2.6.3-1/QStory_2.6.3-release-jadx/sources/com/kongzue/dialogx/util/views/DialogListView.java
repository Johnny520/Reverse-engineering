package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import com.android.p002dx.p005io.Opcodes;
import com.kongzue.dialogx.interfaces.AbstractC4580;
import com.kongzue.dialogx.interfaces.InterfaceC4578;
import p273.C9034;
import p273.C9036;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class DialogListView extends ListView implements InterfaceC4578 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f11965;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C9036 f11966;

    public DialogListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C9036 c9036;
        if ((motionEvent.getActionMasked() & Opcodes.CONST_METHOD_TYPE) == 0 && (c9036 = this.f11966) != null) {
            C9034 c9034 = c9036.f22957;
            c9034.f22947 = c9034.f22965.f22979.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public AbstractC4580 getBottomMenuListViewTouchEvent() {
        return this.f11966;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4578
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
        if (this.f11965) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4578
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8623() {
        return true;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4578
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo8624(boolean z) {
        this.f11965 = z;
    }
}
