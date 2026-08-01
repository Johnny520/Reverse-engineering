package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class hb0 extends ec {
    public boolean g;
    public boolean h;

    @Override // defpackage.ec
    public void e(AttributeSet r6) {
        super.e(r6);
        if (r6 == null) goto L13;
        TypedArray r62 = getContext().obtainStyledAttributes(r6, ry.b);
        int r0 = r62.getIndexCount();
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L18;
        int r2 = r62.getIndex(r1);
        if (r2 != 6) goto L10;
        this.g = true;
    L12:
        r1 = r1 + 1;
        goto L5
    L10:
        if (r2 != 13) goto L12;
        this.h = true;
        goto L12
    L18:
        return;
    }

    public abstract void h(rk r1, int r2, int r3);

    @Override // defpackage.ec, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.g == false) goto L5;
    L6:
        ViewParent r0 = getParent();
        if (r0 != null) goto L9;
        return;
    L9:
        if ((r0 instanceof ConstraintLayout) == false) goto L31;
        ConstraintLayout r02 = (ConstraintLayout) r0;
        int r1 = getVisibility();
        float r2 = getElevation();
        int r3 = 0;
    L12:
        if (r3 >= this.b) goto L32;
        int r4 = this.a[r3];
        View r42 = (View) r02.a.get(r4);
        if (r42 == null) goto L23;
        if (this.g == false) goto L19;
        r42.setVisibility(r1);
    L19:
        if (this.h == false) goto L23;
        if (r2 <= 0.0f) goto L23;
        r42.setTranslationZ(r42.getTranslationZ() + r2);
    L23:
        r3 = r3 + 1;
        goto L12
    L32:
        return;
    L31:
        return;
    L5:
        if (this.h == true) goto L6;
    }

    @Override // android.view.View
    public void setElevation(float r1) {
        super.setElevation(r1);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
        super.setVisibility(r1);
        c();
    }
}
