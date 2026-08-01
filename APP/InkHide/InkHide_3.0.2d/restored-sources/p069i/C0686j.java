package p069i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.p055lu.wxmask272.R;
import p052b1.AbstractC0503h;
import p068h.C0583b;
import p087s.AbstractC0962a;

/* JADX INFO: renamed from: i.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0686j extends C0729z implements InterfaceC0692l {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0689k f2301e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0686j(C0689k c0689k, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f2301e = c0689k;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC0503h.m976N(this, getContentDescription());
        setOnTouchListener(new C0583b(this, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0692l
    /* JADX INFO: renamed from: a */
    public final boolean mo643a() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0692l
    /* JADX INFO: renamed from: b */
    public final boolean mo644b() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f2301e.m1311l();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ImageView
    public final boolean setFrame(int i2, int i3, int i4, int i5) {
        boolean frame = super.setFrame(i2, i3, i4, i5);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AbstractC0962a.m2141f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
