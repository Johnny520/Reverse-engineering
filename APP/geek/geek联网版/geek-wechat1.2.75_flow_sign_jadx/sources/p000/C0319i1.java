package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ljx.wechatmod.R;

/* JADX INFO: renamed from: i1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0319i1 extends C0005a4 implements InterfaceC0395k1 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0358j1 f2314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0319i1(C0358j1 c0358j1, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f2314d = c0358j1;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        r70.m2264a(this, getContentDescription());
        setOnTouchListener(new C0135d1(this, this));
    }

    @Override // p000.InterfaceC0395k1
    /* JADX INFO: renamed from: a */
    public final boolean mo117a() {
        return false;
    }

    @Override // p000.InterfaceC0395k1
    /* JADX INFO: renamed from: b */
    public final boolean mo118b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f2314d.m1562l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AbstractC0187eh.m993f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
