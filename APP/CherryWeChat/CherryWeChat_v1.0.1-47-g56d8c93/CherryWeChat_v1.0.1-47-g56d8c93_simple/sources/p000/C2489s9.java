package p000;

import android.graphics.drawable.ShapeDrawable;
import android.view.animation.Animation;
import android.widget.ImageView;

/* JADX INFO: renamed from: s9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2489s9 extends ImageView {

    /* JADX INFO: renamed from: a */
    public Animation.AnimationListener f8751a;

    /* JADX INFO: renamed from: b */
    public int f8752b;

    @Override // android.view.View
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener r0 = this.f8751a;
        if (r0 == null) goto L6;
        r0.onAnimationEnd(getAnimation());
        return;
    }

    @Override // android.view.View
    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener r0 = this.f8751a;
        if (r0 == null) goto L6;
        r0.onAnimationStart(getAnimation());
        return;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int r2) {
        if ((getBackground() instanceof ShapeDrawable) == false) goto L6;
        ((ShapeDrawable) getBackground()).getPaint().setColor(r2);
        this.f8752b = r2;
        return;
    }
}
