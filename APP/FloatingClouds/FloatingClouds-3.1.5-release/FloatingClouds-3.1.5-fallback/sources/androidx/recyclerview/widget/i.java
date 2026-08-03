package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class i extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k.a f1000a;
    public final /* synthetic */ android.view.ViewPropertyAnimator b;
    public final /* synthetic */ android.view.View c;
    public final /* synthetic */ androidx.recyclerview.widget.k d;

    public i(androidx.recyclerview.widget.k r1, androidx.recyclerview.widget.k.a r2, android.view.ViewPropertyAnimator r3, android.view.View r4) {
            r0 = this;
            r0.d = r1
            r0.f1000a = r2
            r0.b = r3
            r0.c = r4
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r3) {
            r2 = this;
            android.view.ViewPropertyAnimator r3 = r2.b
            r0 = 0
            r3.setListener(r0)
            r3 = 1065353216(0x3f800000, float:1.0)
            android.view.View r0 = r2.c
            r0.setAlpha(r3)
            r3 = 0
            r0.setTranslationX(r3)
            r0.setTranslationY(r3)
            androidx.recyclerview.widget.k$a r3 = r2.f1000a
            androidx.recyclerview.widget.RecyclerView$A r0 = r3.f1002a
            androidx.recyclerview.widget.k r1 = r2.d
            r1.c(r0)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r1.r
            androidx.recyclerview.widget.RecyclerView$A r3 = r3.f1002a
            r0.remove(r3)
            r1.i()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            androidx.recyclerview.widget.k$a r1 = r0.f1000a
            androidx.recyclerview.widget.RecyclerView$A r1 = r1.f1002a
            androidx.recyclerview.widget.k r1 = r0.d
            r1.getClass()
            return
    }
}
