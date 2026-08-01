package p199;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import p203.C7884;

/* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7857 extends AbstractC7854 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f21499;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f21500;

    @Override // p199.AbstractC7854, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f21499 || this.f21500) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f21486; i++) {
                    View view = (View) constraintLayout.f6396.get(this.f21488[i]);
                    if (view != null) {
                        if (this.f21499) {
                            view.setVisibility(visibility);
                        }
                        if (this.f21500 && elevation > 0.0f) {
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
        m13205((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m13205((ConstraintLayout) parent);
    }

    @Override // p199.AbstractC7854
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo13204(ConstraintLayout constraintLayout) {
        m13205(constraintLayout);
    }

    @Override // p199.AbstractC7854
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public void mo13209(AttributeSet attributeSet) {
        super.mo13209(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC7862.f21523);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f21499 = true;
                } else if (index == 22) {
                    this.f21500 = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public abstract void mo3922(C7884 c7884, int i, int i2);
}
