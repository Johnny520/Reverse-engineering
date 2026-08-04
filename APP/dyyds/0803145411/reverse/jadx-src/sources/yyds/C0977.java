package yyds;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᛴᲇᛵᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0977 extends C2264 implements InterfaceC1200 {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ C1313 f4472;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0977(C1313 c1313, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f4472 = c1313;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC0146.m690(this, getContentDescription());
        setOnTouchListener(new C2412(this, this));
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f4472.m2604();
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

    @Override // yyds.InterfaceC1200
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final boolean mo27() {
        return false;
    }

    @Override // yyds.InterfaceC1200
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final boolean mo28() {
        return false;
    }
}
