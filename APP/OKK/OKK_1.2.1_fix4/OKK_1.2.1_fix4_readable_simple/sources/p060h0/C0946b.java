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
    public final C0966k f3358a;

    /* JADX INFO: renamed from: b */
    public final C0966k f3359b;

    public C0946b() {
        this.f3358a = new C0966k();
        this.f3359b = new C0966k();
    }

    /* JADX INFO: renamed from: a */
    public static C0946b m2278a(Context r2, int r3) {
        Animator r22 = AnimatorInflater.loadAnimator(r2, r3);     // Catch: Exception -> L11
        if ((r22 instanceof AnimatorSet) == true) goto L6;
        if (r22 == null) goto L10;
        ArrayList r1 = new ArrayList();     // Catch: Exception -> L11
        r1.add(r22);     // Catch: Exception -> L11
        return m2279b(r1);
    L10:
        return null;
    L6:
        return m2279b(((AnimatorSet) r22).getChildAnimations());
    L11:
        Integer.toHexString(r3);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C0946b m2279b(ArrayList r13) {
        C0946b r02 = new C0946b();
        int r1 = r13.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L20;
        Animator r4 = (Animator) r13.get(r3);
        if ((r4 instanceof ObjectAnimator) == false) goto L19;
        ObjectAnimator r42 = (ObjectAnimator) r4;
        r02.f3359b.put(r42.getPropertyName(), r42.getValues());
        String r5 = r42.getPropertyName();
        long r7 = r42.getStartDelay();
        long r9 = r42.getDuration();
        TimeInterpolator r11 = r42.getInterpolator();
        if ((r11 instanceof AccelerateDecelerateInterpolator) == true) goto L16;
        if (r11 == null) goto L16;
        if ((r11 instanceof AccelerateInterpolator) == false) goto L14;
        r11 = AbstractC0945a.f3356c;
    L17:
        C0947c r6 = new C0947c();
        r6.f3363d = 0;
        r6.f3364e = 1;
        r6.f3360a = r7;
        r6.f3361b = r9;
        r6.f3362c = r11;
        r6.f3363d = r42.getRepeatCount();
        r6.f3364e = r42.getRepeatMode();
        r02.f3358a.put(r5, r6);
        r3 = r3 + 1;
        goto L3
    L14:
        if ((r11 instanceof DecelerateInterpolator) == false) goto L17;
        r11 = AbstractC0945a.f3357d;
    L16:
        r11 = AbstractC0945a.f3355b;
        goto L17
    L19:
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + r4);
    L20:
        return r02;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof C0946b) == true) goto L10;
        return false;
    L10:
        return this.f3358a.equals(((C0946b) r2).f3358a);
    }

    public final int hashCode() {
        return this.f3358a.hashCode();
    }

    public final String toString() {
        return "\n" + C0946b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3358a + "}\n";
    }
}
