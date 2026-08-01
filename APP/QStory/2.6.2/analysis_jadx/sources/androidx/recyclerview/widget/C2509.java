package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2509 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C2507 f7543;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f7544 = false;

    public C2509(C2507 c2507) {
        this.f7543 = c2507;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f7544 = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f7544) {
            this.f7544 = false;
            return;
        }
        C2507 c2507 = this.f7543;
        if (((Float) c2507.f7516.getAnimatedValue()).floatValue() == 0.0f) {
            c2507.f7515 = 0;
            c2507.m4968(0);
        } else {
            c2507.f7515 = 2;
            c2507.f7525.invalidate();
        }
    }
}
