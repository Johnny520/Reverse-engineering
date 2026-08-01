package lin.xposed.hook.javaplugin.view.animation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class ViewHideAnimation extends Animation {
    int initialHeight;
    int targetHeight = 0;
    private final View view;

    public ViewHideAnimation(View view) {
        this.view = view;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        this.view.getLayoutParams().height = this.initialHeight + ((int) ((this.targetHeight - r0) * f));
        this.view.requestLayout();
    }

    @Override // android.view.animation.Animation
    public void initialize(int i, int i2, int i3, int i4) {
        this.initialHeight = i2;
        super.initialize(i, i2, i3, i4);
    }
}
