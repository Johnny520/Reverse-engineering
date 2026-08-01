// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class CLS401 implements ValueAnimator.AnimatorUpdateListener {
    public final CLS425 FLD3825;

    public CLS401(CLS425 ˊﹳ0) {
        this.FLD3825 = ˊﹳ0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        this.FLD3825.FLD4109.setTranslationX(((float)(((Float)valueAnimator0.getAnimatedValue()))));
    }
}

