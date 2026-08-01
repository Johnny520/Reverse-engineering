package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.davemorrissey.labs.subscaleview.R;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0206 extends C0136 implements InterfaceC0201 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C0197 f808;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0206(C0197 c0197, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f808 = c0197;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC0147.m601(this, getContentDescription());
        setOnTouchListener(new C0205(this, this));
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f808.m703();
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

    @Override // androidx.appcompat.widget.InterfaceC0201
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo455() {
        return false;
    }

    @Override // androidx.appcompat.widget.InterfaceC0201
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo456() {
        return false;
    }
}
