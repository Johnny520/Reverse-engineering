package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import com.android.dx.io.Opcodes;
import com.kongzue.dialogx.interfaces.AbstractC3748;
import com.kongzue.dialogx.interfaces.InterfaceC3746;
import p257.C8205;
import p257.C8207;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class DialogListView extends ListView implements InterfaceC3746 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f11620;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C8207 f11621;

    public DialogListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C8207 c8207;
        if ((motionEvent.getActionMasked() & Opcodes.CONST_METHOD_TYPE) == 0 && (c8207 = this.f11621) != null) {
            C8205 c8205 = c8207.f22612;
            c8205.f22602 = c8205.f22620.f22634.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public AbstractC3748 getBottomMenuListViewTouchEvent() {
        return this.f11621;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3746
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
        if (this.f11620) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3746
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8064() {
        return true;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3746
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo8065(boolean z) {
        this.f11620 = z;
    }
}
