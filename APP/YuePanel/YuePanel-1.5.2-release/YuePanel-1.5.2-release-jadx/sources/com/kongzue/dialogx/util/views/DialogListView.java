package com.kongzue.dialogx.util.views;

import Yue.C4198;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import com.kongzue.dialogx.interfaces.BottomMenuListViewTouchEvent;
import com.kongzue.dialogx.interfaces.DialogConvertViewInterface;
import com.kongzue.dialogx.interfaces.ScrollController;

/* JADX INFO: loaded from: classes2.dex */
public class DialogListView extends ListView implements ScrollController {
    private BottomMenuListViewTouchEvent bottomMenuListViewTouchEvent;
    private DialogConvertViewInterface dialogImpl;
    boolean lockScroll;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DialogListView(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        BottomMenuListViewTouchEvent bottomMenuListViewTouchEvent;
        int actionMasked = motionEvent.getActionMasked() & 255;
        if (actionMasked == 0) {
            BottomMenuListViewTouchEvent bottomMenuListViewTouchEvent2 = this.bottomMenuListViewTouchEvent;
            if (bottomMenuListViewTouchEvent2 != null) {
                bottomMenuListViewTouchEvent2.down(motionEvent);
            }
        } else if (actionMasked == 1) {
            BottomMenuListViewTouchEvent bottomMenuListViewTouchEvent3 = this.bottomMenuListViewTouchEvent;
            if (bottomMenuListViewTouchEvent3 != null) {
                bottomMenuListViewTouchEvent3.m5093up(motionEvent);
            }
        } else if (actionMasked == 2 && (bottomMenuListViewTouchEvent = this.bottomMenuListViewTouchEvent) != null) {
            bottomMenuListViewTouchEvent.move(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public BottomMenuListViewTouchEvent getBottomMenuListViewTouchEvent() {
        return this.bottomMenuListViewTouchEvent;
    }

    @Override // com.kongzue.dialogx.interfaces.ScrollController
    public int getScrollDistance() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return 0;
        }
        return (-childAt.getTop()) + (getFirstVisiblePosition() * childAt.getHeight());
    }

    @Override // com.kongzue.dialogx.interfaces.ScrollController
    public boolean isCanScroll() {
        return true;
    }

    @Override // com.kongzue.dialogx.interfaces.ScrollController
    public boolean isLockScroll() {
        return this.lockScroll;
    }

    @Override // com.kongzue.dialogx.interfaces.ScrollController
    public void lockScroll(boolean z) {
        this.lockScroll = z;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.lockScroll) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public DialogListView setBottomMenuListViewTouchEvent(BottomMenuListViewTouchEvent bottomMenuListViewTouchEvent) {
        this.bottomMenuListViewTouchEvent = bottomMenuListViewTouchEvent;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public DialogListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DialogListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DialogListView(DialogConvertViewInterface dialogConvertViewInterface, Context context) {
        super(context);
        this.dialogImpl = dialogConvertViewInterface;
        setVerticalScrollBarEnabled(false);
    }

    public DialogListView(DialogConvertViewInterface dialogConvertViewInterface, Context context, int i) {
        super(new C4198(context, i));
        this.dialogImpl = dialogConvertViewInterface;
        setVerticalScrollBarEnabled(false);
    }
}
