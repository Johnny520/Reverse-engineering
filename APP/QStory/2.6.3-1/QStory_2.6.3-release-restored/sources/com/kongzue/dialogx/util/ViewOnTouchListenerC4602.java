package com.kongzue.dialogx.util;

import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.kongzue.dialogx.interfaces.InterfaceC4578;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import p273.C9052;
import p273.C9056;
import p277.AbstractC9077;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC4602 implements View.OnTouchListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9056 f12082;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C4599 f12083;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C9052 f12084;

    public ViewOnTouchListenerC4602(C4599 c4599, C9052 c9052, C9056 c9056) {
        this.f12083 = c4599;
        this.f12084 = c9052;
        this.f12082 = c9056;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        C4599 c4599 = this.f12083;
        C9052 c9052 = this.f12084;
        if (action == 0) {
            c4599.f12072 = motionEvent.getY();
            c4599.f12073 = true;
            c4599.f12071 = c9052.f23028.getY();
            return false;
        }
        C9056 c9056 = this.f12082;
        if (action == 1) {
            c4599.f12073 = false;
            if (c4599.f12071 == c9056.f23053.m14306()) {
                MaxRelativeLayout maxRelativeLayout = c9052.f23028;
                MaxRelativeLayout maxRelativeLayout2 = c9052.f23028;
                float y = maxRelativeLayout.getY();
                float f = AbstractC9077.f23179;
                if (y < f) {
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(maxRelativeLayout2, "y", maxRelativeLayout2.getY(), c9056.f23053.m14306());
                    objectAnimatorOfFloat.setDuration(300L);
                    objectAnimatorOfFloat.start();
                } else if (maxRelativeLayout2.getY() > c9052.m14306() + f) {
                    c9052.m14304();
                } else {
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(maxRelativeLayout2, "y", maxRelativeLayout2.getY(), c9052.m14306());
                    objectAnimatorOfFloat2.setDuration(300L);
                    objectAnimatorOfFloat2.start();
                }
            } else {
                MaxRelativeLayout maxRelativeLayout3 = c9052.f23028;
                MaxRelativeLayout maxRelativeLayout4 = c9052.f23028;
                float y2 = maxRelativeLayout3.getY();
                float f2 = c4599.f12071;
                float f3 = AbstractC9077.f23179;
                if (y2 < f2 - f3) {
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(maxRelativeLayout4, "y", maxRelativeLayout4.getY(), c9056.f23053.m14306());
                    objectAnimatorOfFloat3.setDuration(300L);
                    objectAnimatorOfFloat3.start();
                } else if (maxRelativeLayout4.getY() > c4599.f12071 + f3) {
                    c9052.m14304();
                } else {
                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(maxRelativeLayout4, "y", maxRelativeLayout4.getY(), c9052.m14306());
                    objectAnimatorOfFloat4.setDuration(300L);
                    objectAnimatorOfFloat4.start();
                }
            }
            InterfaceC4578 interfaceC4578 = c9052.f23034;
            if (interfaceC4578 != null) {
                interfaceC4578.mo8624(false);
            }
        } else if (action != 2) {
            if (action == 3) {
            }
        } else if (c4599.f12073) {
            MaxRelativeLayout maxRelativeLayout5 = c9052.f23028;
            MaxRelativeLayout maxRelativeLayout6 = c9052.f23028;
            float y3 = (motionEvent.getY() + maxRelativeLayout5.getY()) - c4599.f12072;
            InterfaceC4578 interfaceC45782 = c9052.f23034;
            if (interfaceC45782 != null && interfaceC45782.mo8623()) {
                View view2 = (View) c9052.f23034;
                RectF rectF = new RectF();
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                view2.getLocationInWindow(iArr);
                view.getLocationInWindow(iArr2);
                float f4 = iArr[0] - iArr2[0];
                rectF.left = f4;
                rectF.top = iArr[1] - iArr2[1];
                rectF.right = f4 + view2.getWidth();
                rectF.bottom = rectF.top + view2.getHeight();
                if (motionEvent.getX() >= rectF.left && motionEvent.getX() <= rectF.right && motionEvent.getY() >= rectF.top && motionEvent.getY() <= rectF.bottom) {
                    float fM14306 = c9056.f23053.m14306();
                    InterfaceC4578 interfaceC45783 = c9052.f23034;
                    if (y3 <= fM14306) {
                        if (interfaceC45783 != null) {
                            interfaceC45783.mo8624(false);
                        }
                        maxRelativeLayout6.setY(c9056.f23053.m14306());
                        return false;
                    }
                    if (interfaceC45783.getScrollDistance() != 0) {
                        c4599.f12072 = motionEvent.getY();
                        return false;
                    }
                    InterfaceC4578 interfaceC45784 = c9052.f23034;
                    if (interfaceC45784 != null) {
                        interfaceC45784.mo8624(true);
                    }
                    maxRelativeLayout6.setY(y3);
                    return false;
                }
            }
            if (y3 < c9056.f23053.m14306()) {
                y3 = c9056.f23053.m14306();
            }
            maxRelativeLayout6.setY(y3);
            return false;
        }
        return false;
    }
}
