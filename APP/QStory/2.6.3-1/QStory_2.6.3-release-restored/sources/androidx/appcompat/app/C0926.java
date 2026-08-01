package androidx.appcompat.app;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import io.ktor.client.plugins.AbstractC4765;
import p208.C8637;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0926 extends ContentFrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C0915 f575;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0926(LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915, C8637 c8637) {
        super(c8637, null);
        this.f575 = layoutInflaterFactory2C0915;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f575.m795(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = this.f575;
                layoutInflaterFactory2C0915.m791(layoutInflaterFactory2C0915.m778(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(AbstractC4765.m8871(getContext(), i));
    }
}
