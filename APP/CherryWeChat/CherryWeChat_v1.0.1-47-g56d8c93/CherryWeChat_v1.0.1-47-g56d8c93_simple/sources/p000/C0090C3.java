package p000;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: renamed from: C3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0090C3 extends ContentFrameLayout {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ LayoutInflaterFactory2C0176E3 f203i;

    public C0090C3(LayoutInflaterFactory2C0176E3 r1, C0147Db r2) {
        this.f203i = r1;
        super(r2, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent r2) {
        if (this.f203i.m355u(r2) == false) goto L5;
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
        LayoutInflaterFactory2C0176E3 r02 = this.f203i;
        r02.m354s(r02.m360z(0), true);
        return true;
    L14:
        return super.onInterceptTouchEvent(r4);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int r2) {
        setBackgroundDrawable(AbstractC1406fG.m2695U(getContext(), r2));
    }
}
