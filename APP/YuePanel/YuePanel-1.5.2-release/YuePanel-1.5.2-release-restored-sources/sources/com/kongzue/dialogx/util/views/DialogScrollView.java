package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.kongzue.dialogx.interfaces.ScrollController;

/* JADX INFO: loaded from: classes2.dex */
public class DialogScrollView extends NestedScrollView implements ScrollController {
    boolean lockScroll;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DialogScrollView(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.kongzue.dialogx.interfaces.ScrollController
    public int getScrollDistance() {
        return getScrollY();
    }

    @Override // com.kongzue.dialogx.interfaces.ScrollController
    public boolean isCanScroll() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            return getHeight() < childAt.getHeight();
        }
        return false;
    }

    @Override // com.kongzue.dialogx.interfaces.ScrollController
    public boolean isLockScroll() {
        return this.lockScroll;
    }

    @Override // com.kongzue.dialogx.interfaces.ScrollController
    public void lockScroll(boolean z) {
        this.lockScroll = z;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.lockScroll) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public DialogScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DialogScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
