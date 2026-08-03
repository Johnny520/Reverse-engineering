package androidx.constraintlayout.widget;

import Yue.C8387;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.C8778;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8791 extends AbstractC8767 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean f29433;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean f29434;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC8791(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.AbstractC8767, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f29433 || this.f29434) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f26623; i++) {
                View viewById = constraintLayout.getViewById(this.f26622[i]);
                if (viewById != null) {
                    if (this.f29433) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f29434 && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m29285();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m29285();
    }

    @Override // androidx.constraintlayout.widget.AbstractC8767
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo17579(AttributeSet attributeSet) {
        super.mo17579(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C8778.C8789.f28715);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C8778.C8789.f28722) {
                    this.f29433 = true;
                } else if (index == C8778.C8789.f28729) {
                    this.f29434 = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public void mo29256(C8387 c8387, int i, int i2) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC8791(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractC8791(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
