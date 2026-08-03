package p057g;

import android.content.Context;
import android.graphics.drawable.Drawable;
import org.luckypray.dexkit.C1031R;
import p055f.ViewOnTouchListenerC0770a;
import p087w.AbstractC1111a;

/* JADX INFO: renamed from: g.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0904h extends C0936x implements InterfaceC0908j {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0906i f3201d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0904h(C0906i c0906i, Context context) {
        super(context, C1031R.attr.actionOverflowButtonStyle);
        this.f3201d = c0906i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC0875N0.m2199a(this, getContentDescription());
        setOnTouchListener(new ViewOnTouchListenerC0770a(this, this));
    }

    @Override // p057g.InterfaceC0908j
    /* JADX INFO: renamed from: a */
    public final boolean mo1111a() {
        return false;
    }

    @Override // p057g.InterfaceC0908j
    /* JADX INFO: renamed from: b */
    public final boolean mo1112b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f3201d.m2236f();
        return true;
    }

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
            AbstractC1111a.m2624f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
