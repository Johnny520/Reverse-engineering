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

/* JADX INFO: renamed from: bw */
/* JADX INFO: loaded from: classes.dex */
public final class C0083bw {

    /* JADX INFO: renamed from: a */
    public final u30 f857a = new u30();

    /* JADX INFO: renamed from: b */
    public final u30 f858b = new u30();

    /* JADX INFO: renamed from: a */
    public static C0083bw m582a(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m583b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m583b(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0083bw m583b(ArrayList arrayList) {
        C0083bw c0083bw = new C0083bw();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0083bw.f858b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0619q2.f3972b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0619q2.f3973c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0619q2.f3974d;
            }
            C0129cw c0129cw = new C0129cw();
            c0129cw.f1328d = 0;
            c0129cw.f1329e = 1;
            c0129cw.f1325a = startDelay;
            c0129cw.f1326b = duration;
            c0129cw.f1327c = interpolator;
            c0129cw.f1328d = objectAnimator.getRepeatCount();
            c0129cw.f1329e = objectAnimator.getRepeatMode();
            c0083bw.f857a.put(propertyName, c0129cw);
        }
        return c0083bw;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0083bw) {
            return this.f857a.equals(((C0083bw) obj).f857a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f857a.hashCode();
    }

    public final String toString() {
        return "\n" + C0083bw.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f857a + "}\n";
    }
}
