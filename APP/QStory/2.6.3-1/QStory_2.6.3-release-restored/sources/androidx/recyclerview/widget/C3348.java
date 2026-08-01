package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3348 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C3338 f7916;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ View f7917;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f7918;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C3345 f7919;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7920;

    public /* synthetic */ C3348(C3338 c3338, C3345 c3345, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f7920 = i;
        this.f7916 = c3338;
        this.f7919 = c3345;
        this.f7918 = viewPropertyAnimator;
        this.f7917 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f7920;
        C3345 c3345 = this.f7919;
        C3338 c3338 = this.f7916;
        View view = this.f7917;
        ViewPropertyAnimator viewPropertyAnimator = this.f7918;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                c3338.m5605(c3345.f7904);
                c3338.f7847.remove(c3345.f7904);
                c3338.m5534();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                c3338.m5605(c3345.f7903);
                c3338.f7847.remove(c3345.f7903);
                c3338.m5534();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f7920) {
            case 0:
                this.f7916.getClass();
                break;
            default:
                this.f7916.getClass();
                break;
        }
    }
}
