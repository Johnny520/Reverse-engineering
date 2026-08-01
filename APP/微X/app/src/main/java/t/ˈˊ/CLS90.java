// Decompiled by JEB v5.42.0.202606242140

package t.ˈˊ;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.graphics.Color;

public final class CLS90 implements ValueAnimator.AnimatorUpdateListener {
    public final int FLD704;
    public final int FLD705;
    public final int FLD706;
    public final CLS88 FLD707;
    public final int FLD708;

    public CLS90(CLS88 ˊﾞ0, int v, int v1, int v2, int v3) {
        this.FLD704 = v3;
        this.FLD707 = ˊﾞ0;
        this.FLD706 = v;
        this.FLD708 = v1;
        this.FLD705 = v2;
        super();
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        int v = this.FLD705;
        int v1 = this.FLD708;
        int v2 = this.FLD706;
        CLS88 ˊﾞ0 = this.FLD707;
        if(this.FLD704 == 0) {
            ˊﾞ0.getClass();
            ˊﾞ0.setBackgroundColor(Color.argb(((int)(((Integer)valueAnimator0.getAnimatedValue()))), v2, v1, v));
            return;
        }
        ˊﾞ0.getClass();
        ˊﾞ0.setBackgroundColor(Color.argb(((int)(((Integer)valueAnimator0.getAnimatedValue()))), v2, v1, v));
    }
}

