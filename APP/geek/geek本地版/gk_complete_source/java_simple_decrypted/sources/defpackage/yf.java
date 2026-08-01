package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class yf extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ g40 d;
    public final /* synthetic */ ag e;

    public yf(ViewGroup r1, View r2, boolean r3, g40 r4, ag r5) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r2) {
        ViewGroup r22 = this.a;
        View r0 = this.b;
        r22.endViewTransition(r0);
        if (this.c == false) goto L5;
        z30.a(r0, this.d.a);
    L5:
        this.e.d();
    }
}
