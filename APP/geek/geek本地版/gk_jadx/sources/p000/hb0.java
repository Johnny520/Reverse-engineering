package p000;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class hb0 extends AbstractC0182ec {

    /* JADX INFO: renamed from: g */
    public boolean f2260g;

    /* JADX INFO: renamed from: h */
    public boolean f2261h;

    @Override // p000.AbstractC0182ec
    /* JADX INFO: renamed from: e */
    public void mo1013e(AttributeSet attributeSet) {
        super.mo1013e(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0688ry.f4350b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f2260g = true;
                } else if (index == 13) {
                    this.f2261h = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo207h(C0674rk c0674rk, int i, int i2);

    @Override // p000.AbstractC0182ec, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f2260g || this.f2261h) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f1767b; i++) {
                View view = (View) constraintLayout.f400a.get(this.f1766a[i]);
                if (view != null) {
                    if (this.f2260g) {
                        view.setVisibility(visibility);
                    }
                    if (this.f2261h && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m1011c();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m1011c();
    }
}
