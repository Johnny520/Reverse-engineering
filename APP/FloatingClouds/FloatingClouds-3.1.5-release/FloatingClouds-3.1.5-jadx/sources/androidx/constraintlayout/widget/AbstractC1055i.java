package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p000a.C0450Yg;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1055i extends AbstractC1049c {

    /* JADX INFO: renamed from: g */
    public boolean f4376g;

    /* JADX INFO: renamed from: h */
    public boolean f4377h;

    public AbstractC1055i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.AbstractC1049c
    /* JADX INFO: renamed from: e */
    public void mo2406e(AttributeSet attributeSet) {
        super.mo2406e(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1046R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C1046R.styleable.ConstraintLayout_Layout_android_visibility) {
                    this.f4376g = true;
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_android_elevation) {
                    this.f4377h = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo2408h(C0450Yg c0450Yg, int i, int i2) {
    }

    @Override // androidx.constraintlayout.widget.AbstractC1049c, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f4376g || this.f4377h) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f4250b; i++) {
                View view = constraintLayout.f4143a.get(this.f4249a[i]);
                if (view != null) {
                    if (this.f4376g) {
                        view.setVisibility(visibility);
                    }
                    if (this.f4377h && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m2419c();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m2419c();
    }
}
