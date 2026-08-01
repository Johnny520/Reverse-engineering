package p000;

import android.animation.ValueAnimator;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ab0 {
    /* JADX INFO: renamed from: a */
    public static ViewPropertyAnimator m45a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
    }
}
