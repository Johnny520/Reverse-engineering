package p000;

import android.animation.Animator;

/* JADX INFO: renamed from: u9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2575u9 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2618v9 f8924a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2661w9 f8925b;

    public C2575u9(C2661w9 r1, C2618v9 r2) {
        this.f8925b = r1;
        this.f8924a = r2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator r1) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r1) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator r6) {
        C2661w9 r0 = this.f8925b;
        C2618v9 r2 = this.f8924a;
        r0.m5225a(1.0f, r2, true);
        r2.f9084k = r2.f9078e;
        r2.f9085l = r2.f9079f;
        r2.f9086m = r2.f9080g;
        r2.m5129a((r2.f9083j + 1) % r2.f9082i.length);
        if (r0.f9212f == false) goto L8;
        r0.f9212f = false;
        r6.cancel();
        r6.setDuration(1332);
        r6.start();
        if (r2.f9087n == false) goto L10;
        r2.f9087n = false;
        return;
    L10:
        return;
    L8:
        r0.f9211e += 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r2) {
        this.f8925b.f9211e = 0.0f;
    }
}
