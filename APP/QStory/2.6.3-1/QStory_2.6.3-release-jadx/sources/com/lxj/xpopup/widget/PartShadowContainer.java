package com.lxj.xpopup.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.lxj.xpopup.util.AbstractC4620;
import p280.InterfaceC9087;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class PartShadowContainer extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float f12253;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float f12254;

    public PartShadowContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt = getChildAt(0);
        int[] iArr = new int[2];
        childAt.getLocationInWindow(iArr);
        int i = iArr[0];
        if (!AbstractC4620.m8667(motionEvent.getRawX(), motionEvent.getRawY(), new Rect(i, iArr[1], childAt.getMeasuredWidth() + i, childAt.getMeasuredHeight() + iArr[1]))) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f12254 = motionEvent.getX();
                this.f12253 = motionEvent.getY();
            } else if (action == 1 || action == 2 || action == 3) {
                float x = motionEvent.getX() - this.f12254;
                Math.sqrt(Math.pow(motionEvent.getY() - this.f12253, 2.0d) + Math.pow(x, 2.0d));
                ViewConfiguration.get(getContext()).getScaledTouchSlop();
                this.f12254 = 0.0f;
                this.f12253 = 0.0f;
                return true;
            }
        }
        return true;
    }

    public void setOnClickOutsideListener(InterfaceC9087 interfaceC9087) {
    }
}
