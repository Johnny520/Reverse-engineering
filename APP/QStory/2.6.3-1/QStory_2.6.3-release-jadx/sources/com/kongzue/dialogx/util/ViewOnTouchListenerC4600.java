package com.kongzue.dialogx.util;

import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.interfaces.InterfaceC4578;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import p273.C9050;
import p273.C9068;
import p273.C9069;
import p277.AbstractC9077;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC4600 implements View.OnTouchListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C4599 f12074;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9068 f12075;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ View f12076;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C9069 f12077;

    public ViewOnTouchListenerC4600(C4599 c4599, C9069 c9069, C9068 c9068, View view) {
        this.f12074 = c4599;
        this.f12077 = c9069;
        this.f12075 = c9068;
        this.f12076 = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C9069 c9069 = this.f12077;
        int i = 0;
        if (c9069.f23112 == null) {
            new C9050(i);
        }
        int action = motionEvent.getAction();
        C4599 c4599 = this.f12074;
        C9068 c9068 = this.f12075;
        if (action == 0) {
            c4599.f12072 = motionEvent.getY();
            c4599.f12073 = true;
            c4599.f12071 = c9068.f23085.getY();
            return false;
        }
        if (action == 1) {
            InterfaceC4578 interfaceC4578 = c9068.f23098;
            DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c9068.f23086;
            RelativeLayout relativeLayout = c9068.f23085;
            interfaceC4578.getScrollDistance();
            c4599.f12073 = false;
            if (c4599.f12071 == dialogXBaseRelativeLayout.getUnsafePlace().top) {
                if (relativeLayout.getY() > dialogXBaseRelativeLayout.getUnsafePlace().top + c9068.f23088 + AbstractC9077.f23179) {
                    c9068.m14316();
                } else if (relativeLayout.getY() != c4599.f12071) {
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "y", relativeLayout.getY(), c9068.f23088);
                    objectAnimatorOfFloat.setDuration(300L);
                    objectAnimatorOfFloat.start();
                }
            } else if (relativeLayout.getY() > c4599.f12071 + AbstractC9077.f23179) {
                c9068.m14316();
            } else if (relativeLayout.getY() != c4599.f12071) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(relativeLayout, "y", relativeLayout.getY(), dialogXBaseRelativeLayout.getUnsafePlace().top);
                objectAnimatorOfFloat2.setDuration(300L);
                objectAnimatorOfFloat2.start();
            }
            InterfaceC4578 interfaceC45782 = c9068.f23098;
            if (interfaceC45782 != null) {
                interfaceC45782.mo8624(false);
            }
        } else if (action != 2) {
            if (action == 3) {
            }
        } else if (c4599.f12073 && c9069.m14321()) {
            RelativeLayout relativeLayout2 = c9068.f23085;
            RelativeLayout relativeLayout3 = c9068.f23085;
            DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = c9068.f23086;
            float y = (motionEvent.getY() + relativeLayout2.getY()) - c4599.f12072;
            if (c9068.f23098.mo8623()) {
                View view2 = (View) c9068.f23098;
                RectF rectF = new RectF();
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                view2.getLocationInWindow(iArr);
                this.f12076.getLocationInWindow(iArr2);
                float f = iArr[0] - iArr2[0];
                rectF.left = f;
                rectF.top = iArr[1] - iArr2[1];
                rectF.right = f + view2.getWidth();
                rectF.bottom = rectF.top + view2.getHeight();
                if (motionEvent.getX() >= rectF.left && motionEvent.getX() <= rectF.right && motionEvent.getY() >= rectF.top && motionEvent.getY() <= rectF.bottom) {
                    float f2 = dialogXBaseRelativeLayout2.getUnsafePlace().top;
                    InterfaceC4578 interfaceC45783 = c9068.f23098;
                    if (y <= f2) {
                        interfaceC45783.mo8624(false);
                        relativeLayout3.setY(dialogXBaseRelativeLayout2.getUnsafePlace().top);
                        return false;
                    }
                    if (interfaceC45783.getScrollDistance() != 0) {
                        c4599.f12072 = motionEvent.getY();
                        return false;
                    }
                    c9068.f23098.mo8624(true);
                    relativeLayout3.setY(y);
                    return false;
                }
            }
            if (y > dialogXBaseRelativeLayout2.getUnsafePlace().top) {
                relativeLayout3.setY(y);
                return true;
            }
            relativeLayout3.setY(dialogXBaseRelativeLayout2.getUnsafePlace().top);
            return false;
        }
        return false;
    }
}
