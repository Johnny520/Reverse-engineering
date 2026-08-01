package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ljx.wechatmod.R;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends a4 implements k1 {
    public final /* synthetic */ j1 d;

    public i1(j1 r2, Context r3) {
        this.d = r2;
        super(r3, null, R.attr.actionOverflowButtonStyle);
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        l70.a(this, getContentDescription());
        setOnTouchListener(new d1(this, this));
    }

    @Override // defpackage.k1
    public final boolean a() {
        return false;
    }

    @Override // defpackage.k1
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick() == false) goto L5;
        return true;
    L5:
        playSoundEffect(0);
        this.d.l();
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
        int r0 = Math.max(r63, r82) / 2;
        int r1 = getPaddingLeft() - getPaddingRight();
        int r64 = (r63 + r1) / 2;
        int r83 = (r82 + (getPaddingTop() - getPaddingBottom())) / 2;
        ch.f(r72, r64 - r0, r83 - r0, r64 + r0, r83 + r0);
    L6:
        return r52;
    }
}
