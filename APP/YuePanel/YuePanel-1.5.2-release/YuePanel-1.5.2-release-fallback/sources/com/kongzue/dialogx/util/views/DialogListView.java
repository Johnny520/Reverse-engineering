package com.kongzue.dialogx.util.views;

/* JADX INFO: loaded from: classes2.dex */
public class DialogListView extends android.widget.ListView implements com.kongzue.dialogx.interfaces.ScrollController {
    private com.kongzue.dialogx.interfaces.BottomMenuListViewTouchEvent bottomMenuListViewTouchEvent;
    private com.kongzue.dialogx.interfaces.DialogConvertViewInterface dialogImpl;
    boolean lockScroll;

    public DialogListView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public DialogListView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public DialogListView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public DialogListView(com.kongzue.dialogx.interfaces.DialogConvertViewInterface r1, android.content.Context r2) {
            r0 = this;
            r0.<init>(r2)
            r0.dialogImpl = r1
            r1 = 0
            r0.setVerticalScrollBarEnabled(r1)
            return
    }

    public DialogListView(com.kongzue.dialogx.interfaces.DialogConvertViewInterface r2, android.content.Context r3, int r4) {
            r1 = this;
            Yue.ۥ۟ۧۤۡ r0 = new Yue.ۥ۟ۧۤۡ
            r0.<init>(r3, r4)
            r1.<init>(r0)
            r1.dialogImpl = r2
            r2 = 0
            r1.setVerticalScrollBarEnabled(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            int r0 = r3.getActionMasked()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L1f
            r1 = 1
            if (r0 == r1) goto L17
            r1 = 2
            if (r0 == r1) goto Lf
            goto L26
        Lf:
            com.kongzue.dialogx.interfaces.BottomMenuListViewTouchEvent r0 = r2.bottomMenuListViewTouchEvent
            if (r0 == 0) goto L26
            r0.move(r3)
            goto L26
        L17:
            com.kongzue.dialogx.interfaces.BottomMenuListViewTouchEvent r0 = r2.bottomMenuListViewTouchEvent
            if (r0 == 0) goto L26
            r0.up(r3)
            goto L26
        L1f:
            com.kongzue.dialogx.interfaces.BottomMenuListViewTouchEvent r0 = r2.bottomMenuListViewTouchEvent
            if (r0 == 0) goto L26
            r0.down(r3)
        L26:
            boolean r3 = super.dispatchTouchEvent(r3)
            return r3
    }

    public com.kongzue.dialogx.interfaces.BottomMenuListViewTouchEvent getBottomMenuListViewTouchEvent() {
            r1 = this;
            com.kongzue.dialogx.interfaces.BottomMenuListViewTouchEvent r0 = r1.bottomMenuListViewTouchEvent
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.ScrollController
    public int getScrollDistance() {
            r3 = this;
            r0 = 0
            android.view.View r1 = r3.getChildAt(r0)
            if (r1 != 0) goto L8
            return r0
        L8:
            int r0 = r3.getFirstVisiblePosition()
            int r2 = r1.getTop()
            int r2 = -r2
            int r1 = r1.getHeight()
            int r0 = r0 * r1
            int r2 = r2 + r0
            return r2
    }

    @Override // com.kongzue.dialogx.interfaces.ScrollController
    public boolean isCanScroll() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.ScrollController
    public boolean isLockScroll() {
            r1 = this;
            boolean r0 = r1.lockScroll
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.ScrollController
    public void lockScroll(boolean r1) {
            r0 = this;
            r0.lockScroll = r1
            return
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.lockScroll
            if (r0 == 0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r2 = super.onTouchEvent(r2)
            return r2
    }

    public com.kongzue.dialogx.util.views.DialogListView setBottomMenuListViewTouchEvent(com.kongzue.dialogx.interfaces.BottomMenuListViewTouchEvent r1) {
            r0 = this;
            r0.bottomMenuListViewTouchEvent = r1
            return r0
    }
}
