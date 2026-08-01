package androidx.appcompat.app;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import io.ktor.client.plugins.AbstractC3933;
import p192.C7808;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0079 extends ContentFrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C0068 f230;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0079(LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068, C7808 c7808) {
        super(c7808, null);
        this.f230 = layoutInflaterFactory2C0068;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f230.m235(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = this.f230;
                layoutInflaterFactory2C0068.m231(layoutInflaterFactory2C0068.m218(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(AbstractC3933.m8312(getContext(), i));
    }
}
