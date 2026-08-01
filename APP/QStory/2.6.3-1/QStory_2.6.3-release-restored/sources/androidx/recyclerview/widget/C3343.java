package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3343 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C3338 f7891;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f7892;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ View f7893;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3317 f7894;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7895 = 1;

    public C3343(C3338 c3338, AbstractC3317 abstractC3317, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f7891 = c3338;
        this.f7894 = abstractC3317;
        this.f7892 = viewPropertyAnimator;
        this.f7893 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f7895) {
            case 1:
                this.f7893.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f7895;
        AbstractC3317 abstractC3317 = this.f7894;
        C3338 c3338 = this.f7891;
        ViewPropertyAnimator viewPropertyAnimator = this.f7892;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.f7893.setAlpha(1.0f);
                c3338.m5605(abstractC3317);
                c3338.f7846.remove(abstractC3317);
                c3338.m5534();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                c3338.m5605(abstractC3317);
                c3338.f7848.remove(abstractC3317);
                c3338.m5534();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f7895) {
            case 0:
                this.f7891.getClass();
                break;
            default:
                this.f7891.getClass();
                break;
        }
    }

    public C3343(C3338 c3338, AbstractC3317 abstractC3317, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f7891 = c3338;
        this.f7894 = abstractC3317;
        this.f7893 = view;
        this.f7892 = viewPropertyAnimator;
    }
}
