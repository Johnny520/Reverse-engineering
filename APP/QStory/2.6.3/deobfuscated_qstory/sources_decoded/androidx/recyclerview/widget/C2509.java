package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2509 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C2507 f7544;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f7545 = false;

    public C2509(C2507 c2507) {
        this.f7544 = c2507;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f7545 = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f7545) {
            this.f7545 = false;
            return;
        }
        C2507 c2507 = this.f7544;
        if (((Float) c2507.f7517.getAnimatedValue()).floatValue() == 0.0f) {
            c2507.f7516 = 0;
            c2507.m4978(0);
        } else {
            c2507.f7516 = 2;
            c2507.f7526.invalidate();
        }
    }
}
