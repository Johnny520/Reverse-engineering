package p333;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import androidx.collection.C1130;
import io.ktor.util.C5043;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言楪苏子哲世兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9500 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1130 f24809 = new C1130(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1130 f24808 = new C1130(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C9500 m14953(ArrayList arrayList) {
        C9500 c9500 = new C9500();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                C5043.m9163(animator, "Animator must be an ObjectAnimator: ");
                return null;
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c9500.f24808.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            C9499 c9499 = new C9499();
            c9499.f24804 = 0;
            c9499.f24803 = 1;
            c9499.f24807 = startDelay;
            c9499.f24806 = duration;
            c9499.f24805 = interpolator;
            c9499.f24804 = objectAnimator.getRepeatCount();
            c9499.f24803 = objectAnimator.getRepeatMode();
            c9500.f24809.put(propertyName, c9499);
        }
        return c9500;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C9500 m14954(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m14953(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m14953(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9500) {
            return this.f24809.equals(((C9500) obj).f24809);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24809.hashCode();
    }

    public final String toString() {
        return "\n" + C9500.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f24809 + "}\n";
    }
}
