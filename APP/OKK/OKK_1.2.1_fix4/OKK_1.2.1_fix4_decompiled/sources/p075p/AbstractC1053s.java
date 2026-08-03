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
    public void mo1155e(AttributeSet attributeSet) {
        super.mo1155e(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1052r.f4051b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 6) {
                    this.f4059g = true;
                } else if (index == 13) {
                    this.f4060h = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo1157h(C1002g c1002g, int i2, int i3);

    @Override // p075p.AbstractC1037c, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f4059g || this.f4060h) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i2 = 0; i2 < this.f3871b; i2++) {
                View view = (View) constraintLayout.f1258a.get(this.f3870a[i2]);
                if (view != null) {
                    if (this.f4059g) {
                        view.setVisibility(visibility);
                    }
                    if (this.f4060h && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        m2515c();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        m2515c();
    }
}
