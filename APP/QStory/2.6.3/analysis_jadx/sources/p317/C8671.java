package p317;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import androidx.collection.C0283;
import io.ktor.util.C4211;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言楪苏子哲世兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8671 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0283 f24464 = new C0283(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0283 f24463 = new C0283(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C8671 m14394(ArrayList arrayList) {
        C8671 c8671 = new C8671();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                C4211.m8604(animator, "Animator must be an ObjectAnimator: ");
                return null;
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c8671.f24463.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            C8670 c8670 = new C8670();
            c8670.f24459 = 0;
            c8670.f24458 = 1;
            c8670.f24462 = startDelay;
            c8670.f24461 = duration;
            c8670.f24460 = interpolator;
            c8670.f24459 = objectAnimator.getRepeatCount();
            c8670.f24458 = objectAnimator.getRepeatMode();
            c8671.f24464.put(propertyName, c8670);
        }
        return c8671;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8671 m14395(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m14394(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m14394(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8671) {
            return this.f24464.equals(((C8671) obj).f24464);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24464.hashCode();
    }

    public final String toString() {
        return "\n" + C8671.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f24464 + "}\n";
    }
}
