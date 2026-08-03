package p075p;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import p071n.C1002g;

/* JADX INFO: renamed from: p.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1053s extends AbstractC1037c {

    /* JADX INFO: renamed from: g */
    public boolean f4059g;

    /* JADX INFO: renamed from: h */
    public boolean f4060h;

    @Override // p075p.AbstractC1037c
    /* JADX INFO: renamed from: e */
    public void mo1155e(AttributeSet r6) {
        super.mo1155e(r6);
        if (r6 == null) goto L13;
        TypedArray r62 = getContext().obtainStyledAttributes(r6, AbstractC1052r.f4051b);
        int r02 = r62.getIndexCount();
        int r1 = 0;
    L5:
        if (r1 >= r02) goto L18;
        int r2 = r62.getIndex(r1);
        if (r2 != 6) goto L10;
        this.f4059g = true;
    L12:
        r1 = r1 + 1;
        goto L5
    L10:
        if (r2 != 13) goto L12;
        this.f4060h = true;
        goto L12
    L18:
        return;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo1157h(C1002g r1, int r2, int r3);

    @Override // p075p.AbstractC1037c, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4059g == false) goto L5;
    L6:
        ViewParent r02 = getParent();
        if (r02 != null) goto L9;
        return;
    L9:
        if ((r02 instanceof ConstraintLayout) == false) goto L31;
        ConstraintLayout r03 = (ConstraintLayout) r02;
        int r1 = getVisibility();
        float r2 = getElevation();
        int r3 = 0;
    L12:
        if (r3 >= this.f3871b) goto L32;
        int r4 = this.f3870a[r3];
        View r42 = (View) r03.f1258a.get(r4);
        if (r42 == null) goto L23;
        if (this.f4059g == false) goto L19;
        r42.setVisibility(r1);
    L19:
        if (this.f4060h == false) goto L23;
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
        if (this.f4060h == true) goto L6;
    }

    @Override // android.view.View
    public void setElevation(float r1) {
        super.setElevation(r1);
        m2515c();
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
        super.setVisibility(r1);
        m2515c();
    }
}
