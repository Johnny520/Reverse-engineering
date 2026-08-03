package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class g extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.A f998a;
    public final /* synthetic */ android.view.View b;
    public final /* synthetic */ android.view.ViewPropertyAnimator c;
    public final /* synthetic */ androidx.recyclerview.widget.k d;

    public g(android.view.View r1, android.view.ViewPropertyAnimator r2, androidx.recyclerview.widget.k r3, androidx.recyclerview.widget.RecyclerView.A r4) {
            r0 = this;
            r0.d = r3
            r0.f998a = r4
            r0.b = r1
            r0.c = r2
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator r2) {
            r1 = this;
            android.view.View r2 = r1.b
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r0)
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r3) {
            r2 = this;
            android.view.ViewPropertyAnimator r3 = r2.c
            r0 = 0
            r3.setListener(r0)
            androidx.recyclerview.widget.k r3 = r2.d
            androidx.recyclerview.widget.RecyclerView$A r0 = r2.f998a
            r3.c(r0)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r1 = r3.o
            r1.remove(r0)
            r3.i()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            androidx.recyclerview.widget.k r1 = r0.d
            r1.getClass()
            return
    }
}
