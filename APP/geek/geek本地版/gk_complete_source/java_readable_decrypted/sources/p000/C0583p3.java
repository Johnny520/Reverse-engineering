package p000;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: renamed from: p3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0583p3 extends ContentFrameLayout {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ LayoutInflaterFactory2C0657r3 f3655i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0583p3(LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3, C0407kd c0407kd) {
        super(c0407kd, null);
        this.f3655i = layoutInflaterFactory2C0657r3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f3655i.m2207u(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3 = this.f3655i;
                layoutInflaterFactory2C0657r3.m2206s(layoutInflaterFactory2C0657r3.m2212z(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(AbstractC0222ff.m1196r(getContext(), i));
    }
}
