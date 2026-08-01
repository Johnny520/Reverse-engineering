package defpackage;

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

/* JADX INFO: loaded from: classes.dex */
public final class bw {
    public final u30 a;
    public final u30 b;

    public bw() {
        this.a = new u30();
        this.b = new u30();
    }

    public static bw a(Context r3, int r4) {
        Animator r32 = AnimatorInflater.loadAnimator(r3, r4);     // Catch: Exception -> L7
        if ((r32 instanceof AnimatorSet) == true) goto L6;
        if (r32 == null) goto L12;
        ArrayList r1 = new ArrayList();     // Catch: Exception -> L7
        r1.add(r32);     // Catch: Exception -> L7
        return b(r1);
    L12:
        return null;
    L6:
        return b(((AnimatorSet) r32).getChildAnimations());
    L7:
        e = move-exception;
        Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(r4), e);
        return null;
    }

    public static bw b(ArrayList r13) {
        bw r0 = new bw();
        int r1 = r13.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L20;
        Animator r4 = (Animator) r13.get(r3);
        if ((r4 instanceof ObjectAnimator) == false) goto L19;
        ObjectAnimator r42 = (ObjectAnimator) r4;
        r0.b.put(r42.getPropertyName(), r42.getValues());
        String r5 = r42.getPropertyName();
        long r7 = r42.getStartDelay();
        long r9 = r42.getDuration();
        TimeInterpolator r11 = r42.getInterpolator();
        if ((r11 instanceof AccelerateDecelerateInterpolator) == true) goto L16;
        if (r11 == null) goto L16;
        if ((r11 instanceof AccelerateInterpolator) == false) goto L14;
        r11 = q2.c;
    L17:
        cw r6 = new cw();
        r6.d = 0;
        r6.e = 1;
        r6.a = r7;
        r6.b = r9;
        r6.c = r11;
        r6.d = r42.getRepeatCount();
        r6.e = r42.getRepeatMode();
        r0.a.put(r5, r6);
        r3 = r3 + 1;
        goto L3
    L14:
        if ((r11 instanceof DecelerateInterpolator) == false) goto L17;
        r11 = q2.d;
    L16:
        r11 = q2.b;
        goto L17
    L19:
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + r4);
    L20:
        return r0;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof bw) == true) goto L10;
        return false;
    L10:
        return this.a.equals(((bw) r2).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\n" + bw.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
