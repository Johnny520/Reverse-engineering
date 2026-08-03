package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: renamed from: ks */
/* JADX INFO: loaded from: classes.dex */
public final class C2162ks {

    /* JADX INFO: renamed from: a */
    public final C2520sy f7539a = new C2520sy(0);

    /* JADX INFO: renamed from: b */
    public final C2520sy f7540b = new C2520sy(0);

    /* JADX INFO: renamed from: a */
    public static C2162ks m4362a(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m4363b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m4363b(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C2162ks m4363b(ArrayList arrayList) {
        C2162ks c2162ks = new C2162ks();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c2162ks.f7540b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            C2205ls c2205ls = new C2205ls();
            c2205ls.f7687d = 0;
            c2205ls.f7688e = 1;
            c2205ls.f7684a = startDelay;
            c2205ls.f7685b = duration;
            c2205ls.f7686c = interpolator;
            c2205ls.f7687d = objectAnimator.getRepeatCount();
            c2205ls.f7688e = objectAnimator.getRepeatMode();
            c2162ks.f7539a.put(propertyName, c2205ls);
        }
        return c2162ks;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2162ks) {
            return this.f7539a.equals(((C2162ks) obj).f7539a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7539a.hashCode();
    }

    public final String toString() {
        return "\n" + C2162ks.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f7539a + "}\n";
    }
}
