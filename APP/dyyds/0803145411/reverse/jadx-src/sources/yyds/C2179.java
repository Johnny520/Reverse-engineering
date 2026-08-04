package yyds;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: renamed from: yyds.ᲁᛲᛶᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2179 extends ContentFrameLayout {

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C2181 f10667;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2179(LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181, C0586 c0586) {
        super(c0586);
        this.f10667 = layoutInflaterFactory2C2181;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f10667.m4169(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181 = this.f10667;
                layoutInflaterFactory2C2181.m4155(layoutInflaterFactory2C2181.m4163(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(AbstractC1367.m2767(getContext(), i));
    }
}
