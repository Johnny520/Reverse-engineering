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
    public final /* synthetic */ int f229a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f230b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f231c;

    public C0086X(C0096d0 c0096d0, View view) {
        this.f230b = c0096d0;
        this.f231c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f229a) {
            case 0:
                ((C0096d0) this.f230b).f252a.mo323d(1.0f);
                C0088Z.m306e((View) this.f231c);
                break;
            default:
                ((C0957b) this.f230b).remove(animator);
                ((AbstractC0454m) this.f231c).f1022n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f229a) {
            case 1:
                ((AbstractC0454m) this.f231c).f1022n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0086X(AbstractC0454m abstractC0454m, C0957b c0957b) {
        this.f231c = abstractC0454m;
        this.f230b = c0957b;
    }
}
