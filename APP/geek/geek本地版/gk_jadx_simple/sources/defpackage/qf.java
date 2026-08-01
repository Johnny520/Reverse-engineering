package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class qf extends AnimatorListenerAdapter {
    public final /* synthetic */ b00 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewPropertyAnimator e;
    public final /* synthetic */ uf f;

    public qf(uf r1, b00 r2, int r3, View r4, int r5, ViewPropertyAnimator r6) {
        this.f = r1;
        this.a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = r6;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator r3) {
        int r32 = this.b;
        View r1 = this.c;
        if (r32 == 0) goto L6;
        r1.setTranslationX(0.0f);
    L6:
        if (this.d == 0) goto L9;
        r1.setTranslationY(0.0f);
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r3) {
        this.e.setListener(null);
        uf r32 = this.f;
        b00 r0 = this.a;
        r32.c(r0);
        r32.p.remove(r0);
        r32.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r1) {
        this.f.getClass();
    }
}
