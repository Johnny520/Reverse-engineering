package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class p3 extends ContentFrameLayout {
    public final /* synthetic */ r3 i;

    public p3(r3 r1, kd r2) {
        this.i = r1;
        super(r2, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent r2) {
        if (this.i.u(r2) == false) goto L5;
        return true;
    L5:
        if (super.dispatchKeyEvent(r2) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent r4) {
        if (r4.getAction() != 0) goto L14;
        int r0 = (int) r4.getX();
        int r1 = (int) r4.getY();
        if (r0 < (-5)) goto L11;
        if (r1 < (-5)) goto L11;
        if (r0 > (getWidth() + 5)) goto L11;
        if (r1 <= (getHeight() + 5)) goto L14;
    L11:
        r3 r02 = this.i;
        r02.s(r02.z(0), true);
        return true;
    L14:
        return super.onInterceptTouchEvent(r4);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int r2) {
        setBackgroundDrawable(ff.r(getContext(), r2));
    }
}
