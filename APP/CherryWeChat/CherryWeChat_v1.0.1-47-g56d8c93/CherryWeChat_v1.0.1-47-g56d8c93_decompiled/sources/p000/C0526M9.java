package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: M9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0526M9 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1718a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0569N9 f1719b;

    public /* synthetic */ C0526M9(C0569N9 c0569n9, int i) {
        this.f1718a = i;
        this.f1719b = c0569n9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f1718a) {
            case 1:
                this.f1719b.f4174b.m2065h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1718a) {
            case 0:
                this.f1719b.f4174b.m2065h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
