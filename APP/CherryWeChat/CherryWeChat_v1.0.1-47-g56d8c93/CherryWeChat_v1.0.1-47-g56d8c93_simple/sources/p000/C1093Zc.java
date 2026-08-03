package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.AbstractC1166o;

/* JADX INFO: renamed from: Zc */
/* JADX INFO: loaded from: classes.dex */
public final class C1093Zc extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3472a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1138ad f3473b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f3474c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f3475d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1261cd f3476e;

    public /* synthetic */ C1093Zc(C1261cd r1, C1138ad r2, ViewPropertyAnimator r3, View r4, int r5) {
        this.f3472a = r5;
        this.f3476e = r1;
        this.f3473b = r2;
        this.f3474c = r3;
        this.f3475d = r4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r3) {
        switch(this.f3472a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.f3474c.setListener(null);
        View r0 = this.f3475d;
        r0.setAlpha(1.0f);
        r0.setTranslationX(0.0f);
        r0.setTranslationY(0.0f);
        C1138ad r32 = this.f3473b;
        AbstractC1166o r02 = r32.f3594b;
        C1261cd r1 = this.f3476e;
        r1.m2247c(r02);
        r1.f4287r.remove(r32.f3594b);
        r1.m2394i();
        return;
    L6:
        this.f3474c.setListener(null);
        View r03 = this.f3475d;
        r03.setAlpha(1.0f);
        r03.setTranslationX(0.0f);
        r03.setTranslationY(0.0f);
        C1138ad r33 = this.f3473b;
        AbstractC1166o r04 = r33.f3593a;
        C1261cd r12 = this.f3476e;
        r12.m2247c(r04);
        r12.f4287r.remove(r33.f3593a);
        r12.m2394i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r1) {
        switch(this.f3472a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC1166o r12 = this.f3473b.f3594b;
        this.f3476e.getClass();
        return;
    L6:
        AbstractC1166o r13 = this.f3473b.f3593a;
        this.f3476e.getClass();
    }
}
