package p060h0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import p063j.C0966k;

/* JADX INFO: renamed from: h0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0946b {

    /* JADX INFO: renamed from: a */
    public final C0966k f3358a = new C0966k();

    /* JADX INFO: renamed from: b */
    public final C0966k f3359b = new C0966k();

    /* JADX INFO: renamed from: a */
    public static C0946b m2278a(Context context, int i2) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i2);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m2279b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m2279b(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0946b m2279b(ArrayList arrayList) {
        C0946b c0946b = new C0946b();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0946b.f3359b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0945a.f3355b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0945a.f3356c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0945a.f3357d;
            }
            C0947c c0947c = new C0947c();
            c0947c.f3363d = 0;
            c0947c.f3364e = 1;
            c0947c.f3360a = startDelay;
            c0947c.f3361b = duration;
            c0947c.f3362c = interpolator;
            c0947c.f3363d = objectAnimator.getRepeatCount();
            c0947c.f3364e = objectAnimator.getRepeatMode();
            c0946b.f3358a.put(propertyName, c0947c);
        }
        return c0946b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0946b) {
            return this.f3358a.equals(((C0946b) obj).f3358a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3358a.hashCode();
    }

    public final String toString() {
        return "\n" + C0946b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3358a + "}\n";
    }
}
