package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class pf extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b00 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ uf e;

    public pf(uf r2, b00 r3, ViewPropertyAnimator r4, View r5) {
        this.a = 0;
        this.e = r2;
        this.b = r3;
        this.d = r4;
        this.c = r5;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator r2) {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationCancel(r2);
        return;
    L6:
        this.c.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r3) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.d.setListener(null);
        uf r32 = this.e;
        b00 r0 = this.b;
        r32.c(r0);
        r32.o.remove(r0);
        r32.i();
        return;
    L6:
        this.d.setListener(null);
        this.c.setAlpha(1.0f);
        uf r33 = this.e;
        b00 r02 = this.b;
        r33.c(r02);
        r33.q.remove(r02);
        r33.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r1) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.e.getClass();
        return;
    L6:
        this.e.getClass();
    }

    public pf(uf r2, b00 r3, View r4, ViewPropertyAnimator r5) {
        this.a = 1;
        this.e = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
    }
}
