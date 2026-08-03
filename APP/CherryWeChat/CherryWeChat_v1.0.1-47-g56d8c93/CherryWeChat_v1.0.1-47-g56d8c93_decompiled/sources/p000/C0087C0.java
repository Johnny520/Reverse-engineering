package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: C0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0087C0 extends C0520M3 implements InterfaceC0173E0 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0130D0 f194d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0087C0(C0130D0 c0130d0, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f194d = c0130d0;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC2706xB.m5280a(this, getContentDescription());
        setOnTouchListener(new C2695x0(this, this));
    }

    @Override // p000.InterfaceC0173E0
    /* JADX INFO: renamed from: a */
    public final boolean mo135a() {
        return false;
    }

    @Override // p000.InterfaceC0173E0
    /* JADX INFO: renamed from: b */
    public final boolean mo136b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f194d.m223l();
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
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
