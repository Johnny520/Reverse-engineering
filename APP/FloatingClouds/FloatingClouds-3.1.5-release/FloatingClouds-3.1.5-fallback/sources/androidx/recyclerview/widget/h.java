package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class h extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.A f999a;
    public final /* synthetic */ int b;
    public final /* synthetic */ android.view.View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ android.view.ViewPropertyAnimator e;
    public final /* synthetic */ androidx.recyclerview.widget.k f;

    public h(androidx.recyclerview.widget.k r1, androidx.recyclerview.widget.RecyclerView.A r2, int r3, android.view.View r4, int r5, android.view.ViewPropertyAnimator r6) {
            r0 = this;
            r0.f = r1
            r0.f999a = r2
            r0.b = r3
            r0.c = r4
            r0.d = r5
            r0.e = r6
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator r3) {
            r2 = this;
            int r3 = r2.b
            r0 = 0
            android.view.View r1 = r2.c
            if (r3 == 0) goto La
            r1.setTranslationX(r0)
        La:
            int r3 = r2.d
            if (r3 == 0) goto L11
            r1.setTranslationY(r0)
        L11:
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r3) {
            r2 = this;
            android.view.ViewPropertyAnimator r3 = r2.e
            r0 = 0
            r3.setListener(r0)
            androidx.recyclerview.widget.k r3 = r2.f
            androidx.recyclerview.widget.RecyclerView$A r0 = r2.f999a
            r3.c(r0)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r1 = r3.p
            r1.remove(r0)
            r3.i()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            androidx.recyclerview.widget.k r1 = r0.f
            r1.getClass()
            return
    }
}
