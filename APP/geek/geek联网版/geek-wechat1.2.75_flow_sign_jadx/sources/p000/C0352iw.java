package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* JADX INFO: renamed from: iw */
/* JADX INFO: loaded from: classes.dex */
public final class C0352iw {

    /* JADX INFO: renamed from: a */
    public final b40 f2611a = new b40();

    /* JADX INFO: renamed from: b */
    public final b40 f2612b = new b40();

    /* JADX INFO: renamed from: a */
    public static C0352iw m1541a(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m1542b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m1542b(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0352iw m1542b(ArrayList arrayList) {
        C0352iw c0352iw = new C0352iw();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0352iw.f2612b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0618q2.f3771b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0618q2.f3772c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0618q2.f3773d;
            }
            C0389jw c0389jw = new C0389jw();
            c0389jw.f2749d = 0;
            c0389jw.f2750e = 1;
            c0389jw.f2746a = startDelay;
            c0389jw.f2747b = duration;
            c0389jw.f2748c = interpolator;
            c0389jw.f2749d = objectAnimator.getRepeatCount();
            c0389jw.f2750e = objectAnimator.getRepeatMode();
            c0352iw.f2611a.put(propertyName, c0389jw);
        }
        return c0352iw;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0352iw) {
            return this.f2611a.equals(((C0352iw) obj).f2611a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2611a.hashCode();
    }

    public final String toString() {
        return "\n" + C0352iw.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f2611a + "}\n";
    }
}
