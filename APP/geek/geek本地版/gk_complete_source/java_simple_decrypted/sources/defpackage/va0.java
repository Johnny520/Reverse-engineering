package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public abstract class va0 {
    public static ViewPropertyAnimator a(ViewPropertyAnimator r0, ValueAnimator.AnimatorUpdateListener r1) {
        return r0.setUpdateListener(r1);
    }
}
