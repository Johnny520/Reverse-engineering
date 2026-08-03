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
    public final C2520sy f7539a;

    /* JADX INFO: renamed from: b */
    public final C2520sy f7540b;

    public C2162ks() {
        this.f7539a = new C2520sy(0);
        this.f7540b = new C2520sy(0);
    }

    /* JADX INFO: renamed from: a */
    public static C2162ks m4362a(Context r2, int r3) {
        Animator r22 = AnimatorInflater.loadAnimator(r2, r3);     // Catch: Exception -> L11
        if ((r22 instanceof AnimatorSet) == true) goto L6;
        if (r22 == null) goto L10;
        ArrayList r1 = new ArrayList();     // Catch: Exception -> L11
        r1.add(r22);     // Catch: Exception -> L11
        return m4363b(r1);
    L10:
        return null;
    L6:
        return m4363b(((AnimatorSet) r22).getChildAnimations());
    L11:
        Integer.toHexString(r3);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C2162ks m4363b(ArrayList r13) {
        C2162ks r0 = new C2162ks();
        int r1 = r13.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L9;
        Animator r4 = (Animator) r13.get(r3);
        if ((r4 instanceof ObjectAnimator) == false) goto L8;
        ObjectAnimator r42 = (ObjectAnimator) r4;
        r0.f7540b.put(r42.getPropertyName(), r42.getValues());
        String r5 = r42.getPropertyName();
        long r7 = r42.getStartDelay();
        long r9 = r42.getDuration();
        TimeInterpolator r11 = r42.getInterpolator();
        C2205ls r6 = new C2205ls();
        r6.f7687d = 0;
        r6.f7688e = 1;
        r6.f7684a = r7;
        r6.f7685b = r9;
        r6.f7686c = r11;
        r6.f7687d = r42.getRepeatCount();
        r6.f7688e = r42.getRepeatMode();
        r0.f7539a.put(r5, r6);
        r3 = r3 + 1;
        goto L3
    L8:
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + r4);
    L9:
        return r0;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof C2162ks) == true) goto L10;
        return false;
    L10:
        return this.f7539a.equals(((C2162ks) r2).f7539a);
    }

    public final int hashCode() {
        return this.f7539a.hashCode();
    }

    public final String toString() {
        return "\n" + C2162ks.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f7539a + "}\n";
    }
}
