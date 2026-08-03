package p000;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: renamed from: C3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0090C3 extends ContentFrameLayout {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ LayoutInflaterFactory2C0176E3 f203i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0090C3(LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3, C0147Db c0147Db) {
        super(c0147Db, null);
        this.f203i = layoutInflaterFactory2C0176E3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f203i.m355u(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = this.f203i;
                layoutInflaterFactory2C0176E3.m354s(layoutInflaterFactory2C0176E3.m360z(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(AbstractC1406fG.m2695U(getContext(), i));
    }
}
