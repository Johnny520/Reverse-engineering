package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2515 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C2505 f7571;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ View f7572;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f7573;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C2512 f7574;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7575;

    public /* synthetic */ C2515(C2505 c2505, C2512 c2512, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f7575 = i;
        this.f7571 = c2505;
        this.f7574 = c2512;
        this.f7573 = viewPropertyAnimator;
        this.f7572 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f7575;
        C2512 c2512 = this.f7574;
        C2505 c2505 = this.f7571;
        View view = this.f7572;
        ViewPropertyAnimator viewPropertyAnimator = this.f7573;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                c2505.m5045(c2512.f7559);
                c2505.f7502.remove(c2512.f7559);
                c2505.m4974();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                c2505.m5045(c2512.f7558);
                c2505.f7502.remove(c2512.f7558);
                c2505.m4974();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f7575) {
            case 0:
                this.f7571.getClass();
                break;
            default:
                this.f7571.getClass();
                break;
        }
    }
}
