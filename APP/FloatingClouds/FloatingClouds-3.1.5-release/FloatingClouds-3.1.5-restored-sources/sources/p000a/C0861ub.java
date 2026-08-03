package p000a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* JADX INFO: renamed from: a.ub */
/* JADX INFO: loaded from: classes.dex */
public final class C0861ub {

    /* JADX INFO: renamed from: a */
    public final C0598ge<String, C0880vb> f3367a = new C0598ge<>();

    /* JADX INFO: renamed from: b */
    public final C0598ge<String, PropertyValuesHolder[]> f3368b = new C0598ge<>();

    /* JADX INFO: renamed from: a */
    public static C0861ub m1990a(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m1991b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m1991b(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0861ub m1991b(ArrayList arrayList) {
        C0861ub c0861ub = new C0861ub();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0861ub.f3368b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = C0888w0.f3469b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = C0888w0.f3470c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = C0888w0.f3471d;
            }
            C0880vb c0880vb = new C0880vb();
            c0880vb.f3455d = 0;
            c0880vb.f3456e = 1;
            c0880vb.f3452a = startDelay;
            c0880vb.f3453b = duration;
            c0880vb.f3454c = interpolator;
            c0880vb.f3455d = objectAnimator.getRepeatCount();
            c0880vb.f3456e = objectAnimator.getRepeatMode();
            c0861ub.f3367a.put(propertyName, c0880vb);
        }
        return c0861ub;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0861ub) {
            return this.f3367a.equals(((C0861ub) obj).f3367a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3367a.hashCode();
    }

    public final String toString() {
        return "\n" + C0861ub.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3367a + "}\n";
    }
}
