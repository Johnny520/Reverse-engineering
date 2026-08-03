package com.kongzue.dialogx.util.views;

/* JADX INFO: loaded from: classes2.dex */
public class DialogScrollView extends androidx.core.widget.NestedScrollView implements com.kongzue.dialogx.interfaces.ScrollController {
    boolean lockScroll;

    public DialogScrollView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public DialogScrollView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public DialogScrollView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super.dispatchTouchEvent(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.ScrollController
    public int getScrollDistance() {
            r1 = this;
            int r0 = r1.getScrollY()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.ScrollController
    public boolean isCanScroll() {
            r3 = this;
            r0 = 0
            android.view.View r1 = r3.getChildAt(r0)
            if (r1 == 0) goto L12
            int r1 = r1.getHeight()
            int r2 = r3.getHeight()
            if (r2 >= r1) goto L12
            r0 = 1
        L12:
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

    @Override // androidx.core.widget.NestedScrollView, android.view.View
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
}
