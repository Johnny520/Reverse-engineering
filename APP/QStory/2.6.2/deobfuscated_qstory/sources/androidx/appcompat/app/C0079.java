package androidx.appcompat.app;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import com.bumptech.glide.AbstractC3054;
import p192.C7807;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0079 extends ContentFrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C0068 f230;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0079(LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068, C7807 c7807) {
        super(c7807, null);
        this.f230 = layoutInflaterFactory2C0068;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f230.m234(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = this.f230;
                layoutInflaterFactory2C0068.m230(layoutInflaterFactory2C0068.m217(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(AbstractC3054.m6607(getContext(), i));
    }
}
