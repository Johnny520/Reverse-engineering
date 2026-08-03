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
    public final void mo1834e(ConstraintLayout constraintLayout) {
        m2652d(constraintLayout);
    }

    @Override // p000.AbstractC1364eb
    /* JADX INFO: renamed from: g */
    public void mo1835g(AttributeSet attributeSet) {
        super.mo1835g(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0639Ou.f2035b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f3000h = true;
                } else if (index == 22) {
                    this.f3001i = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo1836j(C0368Ih c0368Ih, int i, int i2);

    @Override // p000.AbstractC1364eb, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3000h || this.f3001i) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f4873b; i++) {
                    View view = (View) constraintLayout.f3871a.get(this.f4872a[i]);
                    if (view != null) {
                        if (this.f3000h) {
                            view.setVisibility(visibility);
                        }
                        if (this.f3001i && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m2652d((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m2652d((ConstraintLayout) parent);
    }
}
