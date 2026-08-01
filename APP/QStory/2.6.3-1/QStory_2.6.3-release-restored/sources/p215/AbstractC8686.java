package p215;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import p219.C8713;

/* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8686 extends AbstractC8683 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f21844;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f21845;

    @Override // p215.AbstractC8683, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f21844 || this.f21845) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f21831; i++) {
                    View view = (View) constraintLayout.f6741.get(this.f21833[i]);
                    if (view != null) {
                        if (this.f21844) {
                            view.setVisibility(visibility);
                        }
                        if (this.f21845 && elevation > 0.0f) {
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
        m13764((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m13764((ConstraintLayout) parent);
    }

    @Override // p215.AbstractC8683
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo13763(ConstraintLayout constraintLayout) {
        m13764(constraintLayout);
    }

    @Override // p215.AbstractC8683
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public void mo13768(AttributeSet attributeSet) {
        super.mo13768(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC8691.f21868);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f21844 = true;
                } else if (index == 22) {
                    this.f21845 = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public abstract void mo4482(C8713 c8713, int i, int i2);
}
