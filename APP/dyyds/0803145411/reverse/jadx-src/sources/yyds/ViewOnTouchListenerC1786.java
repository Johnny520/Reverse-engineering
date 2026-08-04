package yyds;

import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;

/* JADX INFO: renamed from: yyds.ᛸᛶᛱᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC1786 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ View f9019;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ C0763 f9020;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ C0882 f9021;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C2457 f9022;

    public ViewOnTouchListenerC1786(C0882 c0882, C0763 c0763, C2457 c2457, View view) {
        this.f9021 = c0882;
        this.f9020 = c0763;
        this.f9022 = c2457;
        this.f9019 = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ee  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0763 c0763 = this.f9020;
        c0763.getClass();
        new C1344();
        int action = motionEvent.getAction();
        C0882 c0882 = this.f9021;
        C2457 c2457 = this.f9022;
        if (action == 0) {
            c0882.f4036 = motionEvent.getY();
            c0882.f4035 = true;
            c0882.f4037 = c2457.f12143.getY();
            return false;
        }
        if (action == 1) {
            InterfaceC2018 interfaceC2018 = c2457.f12137;
            DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c2457.f12135;
            RelativeLayout relativeLayout = c2457.f12143;
            interfaceC2018.getScrollDistance();
            c0882.f4035 = false;
            if (c0882.f4037 == dialogXBaseRelativeLayout.getUnsafePlace().top) {
                if (relativeLayout.getY() > dialogXBaseRelativeLayout.getUnsafePlace().top + c2457.f12132 + AbstractC1655.f8456) {
                    c2457.m4496();
                } else if (relativeLayout.getY() != c0882.f4037) {
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "y", relativeLayout.getY(), c2457.f12132);
                    objectAnimatorOfFloat.setDuration(300L);
                    objectAnimatorOfFloat.start();
                }
            } else if (relativeLayout.getY() > c0882.f4037 + AbstractC1655.f8456) {
                c2457.m4496();
            } else if (relativeLayout.getY() != c0882.f4037) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(relativeLayout, "y", relativeLayout.getY(), dialogXBaseRelativeLayout.getUnsafePlace().top);
                objectAnimatorOfFloat2.setDuration(300L);
                objectAnimatorOfFloat2.start();
            }
            InterfaceC2018 interfaceC20182 = c2457.f12137;
            if (interfaceC20182 != null) {
                interfaceC20182.mo293(false);
            }
        } else if (action != 2) {
            if (action == 3) {
            }
        } else if (c0882.f4035 && c0763.m1711()) {
            RelativeLayout relativeLayout2 = c2457.f12143;
            RelativeLayout relativeLayout3 = c2457.f12143;
            DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = c2457.f12135;
            float y = (motionEvent.getY() + relativeLayout2.getY()) - c0882.f4036;
            if (c2457.f12137.mo292()) {
                View view2 = (View) c2457.f12137;
                RectF rectF = new RectF();
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                view2.getLocationInWindow(iArr);
                this.f9019.getLocationInWindow(iArr2);
                float f = iArr[0] - iArr2[0];
                rectF.left = f;
                rectF.top = iArr[1] - iArr2[1];
                rectF.right = f + view2.getWidth();
                rectF.bottom = rectF.top + view2.getHeight();
                if (motionEvent.getX() >= rectF.left && motionEvent.getX() <= rectF.right && motionEvent.getY() >= rectF.top && motionEvent.getY() <= rectF.bottom) {
                    float f2 = dialogXBaseRelativeLayout2.getUnsafePlace().top;
                    InterfaceC2018 interfaceC20183 = c2457.f12137;
                    if (y <= f2) {
                        interfaceC20183.mo293(false);
                        relativeLayout3.setY(dialogXBaseRelativeLayout2.getUnsafePlace().top);
                        return false;
                    }
                    if (interfaceC20183.getScrollDistance() != 0) {
                        c0882.f4036 = motionEvent.getY();
                        return false;
                    }
                    c2457.f12137.mo293(true);
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
