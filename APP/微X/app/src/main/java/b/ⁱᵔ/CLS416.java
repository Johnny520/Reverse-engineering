// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;

public final class CLS416 implements Animator.AnimatorListener {
    public final CLS425 FLD4023;

    public CLS416(CLS425 ˊﹳ0) {
        this.FLD4023 = ˊﹳ0;
        super();
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationCancel(Animator animator0) {
        this.FLD4023.FLD4093 = false;
        this.FLD4023.FLD4101 = false;
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationEnd(Animator animator0) {
        this.FLD4023.FLD4093 = false;
        this.FLD4023.FLD4101 = false;
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationRepeat(Animator animator0) {
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationStart(Animator animator0) {
        this.FLD4023.FLD4093 = true;
    }
}

