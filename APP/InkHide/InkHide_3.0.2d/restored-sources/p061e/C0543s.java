package p061e;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import p052b1.AbstractC0503h;
import p066g.C0564d;

/* JADX INFO: renamed from: e.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0543s extends ContentFrameLayout {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ LayoutInflaterFactory2C0545u f1773j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0543s(LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u, C0564d c0564d) {
        super(c0564d, null);
        this.f1773j = layoutInflaterFactory2C0545u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f1773j.m1112s(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (x2 < -5 || y2 < -5 || x2 > getWidth() + 5 || y2 > getHeight() + 5) {
                LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = this.f1773j;
                layoutInflaterFactory2C0545u.m1111q(layoutInflaterFactory2C0545u.m1117x(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void setBackgroundResource(int i2) {
        setBackgroundDrawable(AbstractC0503h.m992y(getContext(), i2));
    }
}
