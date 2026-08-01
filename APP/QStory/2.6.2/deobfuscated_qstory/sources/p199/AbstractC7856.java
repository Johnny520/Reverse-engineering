package p199;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import p203.C7883;

/* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7856 extends AbstractC7853 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f21502;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f21503;

    @Override // p199.AbstractC7853, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f21502 || this.f21503) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f21489; i++) {
                    View view = (View) constraintLayout.f6395.get(this.f21491[i]);
                    if (view != null) {
                        if (this.f21502) {
                            view.setVisibility(visibility);
                        }
                        if (this.f21503 && elevation > 0.0f) {
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
        m13177((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m13177((ConstraintLayout) parent);
    }

    @Override // p199.AbstractC7853
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo13176(ConstraintLayout constraintLayout) {
        m13177(constraintLayout);
    }

    @Override // p199.AbstractC7853
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public void mo13181(AttributeSet attributeSet) {
        super.mo13181(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC7861.f21526);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f21502 = true;
                } else if (index == 22) {
                    this.f21503 = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public abstract void mo3912(C7883 c7883, int i, int i2);
}
