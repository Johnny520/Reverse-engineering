package p000;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: WE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0960WE extends AbstractC1364eb {

    /* JADX INFO: renamed from: h */
    public boolean f3000h;

    /* JADX INFO: renamed from: i */
    public boolean f3001i;

    @Override // p000.AbstractC1364eb
    /* JADX INFO: renamed from: e */
    public final void mo1834e(ConstraintLayout r1) {
        m2652d(r1);
    }

    @Override // p000.AbstractC1364eb
    /* JADX INFO: renamed from: g */
    public void mo1835g(AttributeSet r6) {
        super.mo1835g(r6);
        if (r6 == null) goto L19;
        TypedArray r62 = getContext().obtainStyledAttributes(r6, AbstractC0639Ou.f2035b);
        int r0 = r62.getIndexCount();
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L13;
        int r2 = r62.getIndex(r1);
        if (r2 != 6) goto L10;
        this.f3000h = true;
    L12:
        r1 = r1 + 1;
        goto L5
    L10:
        if (r2 != 22) goto L12;
        this.f3001i = true;
        goto L12
    L13:
        r62.recycle();
        return;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo1836j(C0368Ih r1, int r2, int r3);

    @Override // p000.AbstractC1364eb, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3000h == false) goto L5;
    L6:
        ViewParent r0 = getParent();
        if ((r0 instanceof ConstraintLayout) == false) goto L28;
        ConstraintLayout r02 = (ConstraintLayout) r0;
        int r1 = getVisibility();
        float r2 = getElevation();
        int r3 = 0;
    L10:
        if (r3 >= this.f4873b) goto L29;
        int r4 = this.f4872a[r3];
        View r42 = (View) r02.f3871a.get(r4);
        if (r42 == null) goto L21;
        if (this.f3000h == false) goto L17;
        r42.setVisibility(r1);
    L17:
        if (this.f3001i == false) goto L21;
        if (r2 <= 0.0f) goto L21;
        r42.setTranslationZ(r42.getTranslationZ() + r2);
    L21:
        r3 = r3 + 1;
        goto L10
    L29:
        return;
    L28:
        return;
    L5:
        if (this.f3001i == true) goto L6;
    }

    @Override // android.view.View
    public void setElevation(float r2) {
        super.setElevation(r2);
        ViewParent r22 = getParent();
        if (r22 != null) goto L5;
        return;
    L5:
        if ((r22 instanceof ConstraintLayout) == false) goto L9;
        m2652d((ConstraintLayout) r22);
        return;
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
        super.setVisibility(r2);
        ViewParent r22 = getParent();
        if (r22 != null) goto L5;
        return;
    L5:
        if ((r22 instanceof ConstraintLayout) == false) goto L9;
        m2652d((ConstraintLayout) r22);
        return;
    }
}
