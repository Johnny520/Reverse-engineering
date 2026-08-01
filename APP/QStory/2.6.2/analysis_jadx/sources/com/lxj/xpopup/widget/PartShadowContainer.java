package com.lxj.xpopup.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.lxj.xpopup.util.AbstractC3787;
import p264.InterfaceC8257;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class PartShadowContainer extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float f11903;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float f11904;

    public PartShadowContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt = getChildAt(0);
        int[] iArr = new int[2];
        childAt.getLocationInWindow(iArr);
        int i = iArr[0];
        if (!AbstractC3787.m8121(motionEvent.getRawX(), motionEvent.getRawY(), new Rect(i, iArr[1], childAt.getMeasuredWidth() + i, childAt.getMeasuredHeight() + iArr[1]))) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f11904 = motionEvent.getX();
                this.f11903 = motionEvent.getY();
            } else if (action == 1 || action == 2 || action == 3) {
                float x = motionEvent.getX() - this.f11904;
                Math.sqrt(Math.pow(motionEvent.getY() - this.f11903, 2.0d) + Math.pow(x, 2.0d));
                ViewConfiguration.get(getContext()).getScaledTouchSlop();
                this.f11904 = 0.0f;
                this.f11903 = 0.0f;
                return true;
            }
        }
        return true;
    }

    public void setOnClickOutsideListener(InterfaceC8257 interfaceC8257) {
    }
}
