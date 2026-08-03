package p000;

import android.animation.Animator;

/* JADX INFO: renamed from: u9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2575u9 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2618v9 f8924a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2661w9 f8925b;

    public C2575u9(C2661w9 c2661w9, C2618v9 c2618v9) {
        this.f8925b = c2661w9;
        this.f8924a = c2618v9;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        C2661w9 c2661w9 = this.f8925b;
        C2618v9 c2618v9 = this.f8924a;
        c2661w9.m5225a(1.0f, c2618v9, true);
        c2618v9.f9084k = c2618v9.f9078e;
        c2618v9.f9085l = c2618v9.f9079f;
        c2618v9.f9086m = c2618v9.f9080g;
        c2618v9.m5129a((c2618v9.f9083j + 1) % c2618v9.f9082i.length);
        if (!c2661w9.f9212f) {
            c2661w9.f9211e += 1.0f;
            return;
        }
        c2661w9.f9212f = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (c2618v9.f9087n) {
            c2618v9.f9087n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f8925b.f9211e = 0.0f;
    }
}
