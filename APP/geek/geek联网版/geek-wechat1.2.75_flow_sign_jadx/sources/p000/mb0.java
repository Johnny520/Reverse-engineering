package p000;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class mb0 extends AbstractC0517nc {

    /* JADX INFO: renamed from: g */
    public boolean f3117g;

    /* JADX INFO: renamed from: h */
    public boolean f3118h;

    @Override // p000.AbstractC0517nc
    /* JADX INFO: renamed from: e */
    public void mo1819e(AttributeSet attributeSet) {
        super.mo1819e(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0947yy.f5510b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f3117g = true;
                } else if (index == 13) {
                    this.f3118h = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo192h(C0747tk c0747tk, int i, int i2);

    @Override // p000.AbstractC0517nc, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f3117g || this.f3118h) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f3264b; i++) {
                View view = (View) constraintLayout.f363a.get(this.f3263a[i]);
                if (view != null) {
                    if (this.f3117g) {
                        view.setVisibility(visibility);
                    }
                    if (this.f3118h && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m1940c();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m1940c();
    }
}
