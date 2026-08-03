package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: a.k3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0663k3 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2475a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0682l3 f2476b;

    public /* synthetic */ C0663k3(C0682l3 c0682l3, int i) {
        this.f2475a = i;
        this.f2476b = c0682l3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2475a) {
            case 1:
                this.f2476b.f1876b.m3289h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2475a) {
            case 0:
                this.f2476b.f1876b.m3289h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
