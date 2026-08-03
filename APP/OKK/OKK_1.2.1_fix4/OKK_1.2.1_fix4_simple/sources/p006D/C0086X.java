package p006D;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import p043Y.AbstractC0454m;
import p063j.C0957b;

/* JADX INFO: renamed from: D.X */
/* JADX INFO: loaded from: classes.dex */
public final class C0086X extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f229a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f230b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f231c;

    public C0086X(C0096d0 r2, View r3) {
        this.f229a = 0;
        this.f230b = r2;
        this.f231c = r3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r2) {
        switch(this.f229a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((C0957b) this.f230b).remove(r2);
        ((AbstractC0454m) this.f231c).f1022n.remove(r2);
        return;
    L6:
        ((C0096d0) this.f230b).f252a.mo323d(1.0f);
        C0088Z.m306e((View) this.f231c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator r2) {
        switch(this.f229a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationStart(r2);
        return;
    L6:
        ((AbstractC0454m) this.f231c).f1022n.add(r2);
    }

    public C0086X(AbstractC0454m r2, C0957b r3) {
        this.f229a = 1;
        this.f231c = r2;
        this.f230b = r3;
    }
}
