package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class rf extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sf b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ uf e;

    public /* synthetic */ rf(uf r1, sf r2, ViewPropertyAnimator r3, View r4, int r5) {
        this.a = r5;
        this.e = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r3) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.c.setListener(null);
        View r0 = this.d;
        r0.setAlpha(1.0f);
        r0.setTranslationX(0.0f);
        r0.setTranslationY(0.0f);
        sf r32 = this.b;
        b00 r02 = r32.b;
        uf r1 = this.e;
        r1.c(r02);
        r1.r.remove(r32.b);
        r1.i();
        return;
    L6:
        this.c.setListener(null);
        View r03 = this.d;
        r03.setAlpha(1.0f);
        r03.setTranslationX(0.0f);
        r03.setTranslationY(0.0f);
        sf r33 = this.b;
        b00 r04 = r33.a;
        uf r12 = this.e;
        r12.c(r04);
        r12.r.remove(r33.a);
        r12.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r1) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        b00 r12 = this.b.b;
        this.e.getClass();
        return;
    L6:
        b00 r13 = this.b.a;
        this.e.getClass();
    }
}
