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

    public C0904h(C0906i r1, Context r2) {
        this.f3201d = r1;
        super(r2, C1031R.attr.actionOverflowButtonStyle);
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
        if (super.performClick() == false) goto L5;
        return true;
    L5:
        playSoundEffect(0);
        this.f3201d.m2236f();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int r5, int r6, int r7, int r8) {
        boolean r52 = super.setFrame(r5, r6, r7, r8);
        Drawable r62 = getDrawable();
        Drawable r72 = getBackground();
        if (r62 == null) goto L6;
        if (r72 == null) goto L6;
        int r63 = getWidth();
        int r82 = getHeight();
        int r02 = Math.max(r63, r82) / 2;
        int r1 = getPaddingLeft() - getPaddingRight();
        int r64 = (r63 + r1) / 2;
        int r83 = (r82 + (getPaddingTop() - getPaddingBottom())) / 2;
        AbstractC1111a.m2624f(r72, r64 - r02, r83 - r02, r64 + r02, r83 + r02);
    L6:
        return r52;
    }
}
