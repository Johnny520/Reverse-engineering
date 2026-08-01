package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2510 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C2505 f7545;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f7546;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ View f7547;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2484 f7548;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7549 = 1;

    public C2510(C2505 c2505, AbstractC2484 abstractC2484, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f7545 = c2505;
        this.f7548 = abstractC2484;
        this.f7546 = viewPropertyAnimator;
        this.f7547 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f7549) {
            case 1:
                this.f7547.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f7549;
        AbstractC2484 abstractC2484 = this.f7548;
        C2505 c2505 = this.f7545;
        ViewPropertyAnimator viewPropertyAnimator = this.f7546;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.f7547.setAlpha(1.0f);
                c2505.m5035(abstractC2484);
                c2505.f7500.remove(abstractC2484);
                c2505.m4964();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                c2505.m5035(abstractC2484);
                c2505.f7502.remove(abstractC2484);
                c2505.m4964();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f7549) {
            case 0:
                this.f7545.getClass();
                break;
            default:
                this.f7545.getClass();
                break;
        }
    }

    public C2510(C2505 c2505, AbstractC2484 abstractC2484, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f7545 = c2505;
        this.f7548 = abstractC2484;
        this.f7547 = view;
        this.f7546 = viewPropertyAnimator;
    }
}
