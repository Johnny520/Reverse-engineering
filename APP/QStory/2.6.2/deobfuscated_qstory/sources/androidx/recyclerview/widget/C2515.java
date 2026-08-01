package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2515 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C2505 f7570;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ View f7571;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f7572;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C2512 f7573;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7574;

    public /* synthetic */ C2515(C2505 c2505, C2512 c2512, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f7574 = i;
        this.f7570 = c2505;
        this.f7573 = c2512;
        this.f7572 = viewPropertyAnimator;
        this.f7571 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f7574;
        C2512 c2512 = this.f7573;
        C2505 c2505 = this.f7570;
        View view = this.f7571;
        ViewPropertyAnimator viewPropertyAnimator = this.f7572;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                c2505.m5035(c2512.f7558);
                c2505.f7501.remove(c2512.f7558);
                c2505.m4964();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                c2505.m5035(c2512.f7557);
                c2505.f7501.remove(c2512.f7557);
                c2505.m4964();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f7574) {
            case 0:
                this.f7570.getClass();
                break;
            default:
                this.f7570.getClass();
                break;
        }
    }
}
