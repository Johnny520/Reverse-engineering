package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2466 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f7340;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC2484 f7341;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f7342;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f7343;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f7344;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f7345;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f7346;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f7347;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2484 f7348;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C2473 f7349;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f7350;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ValueAnimator f7351;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f7352 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f7353 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f7354;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public float f7355;

    public C2466(C2473 c2473, AbstractC2484 abstractC2484, int i, float f, float f2, float f3, float f4, int i2, AbstractC2484 abstractC24842) {
        this.f7349 = c2473;
        this.f7346 = i2;
        this.f7348 = abstractC24842;
        this.f7340 = i;
        this.f7341 = abstractC2484;
        this.f7345 = f;
        this.f7344 = f2;
        this.f7343 = f3;
        this.f7342 = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7351 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new C2506(this, 1));
        valueAnimatorOfFloat.setTarget(abstractC2484.itemView);
        valueAnimatorOfFloat.addListener(this);
        this.f7347 = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f7347 = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m4859(animator);
        if (this.f7352) {
            return;
        }
        int i = this.f7346;
        AbstractC2484 abstractC2484 = this.f7348;
        C2473 c2473 = this.f7349;
        if (i <= 0) {
            c2473.f7404.getClass();
            AbstractC2464.m4857(abstractC2484);
        } else {
            c2473.f7396.add(abstractC2484.itemView);
            this.f7350 = true;
            if (i > 0) {
                c2473.f7406.post(new RunnableC2511(c2473, this, i));
            }
        }
        View view = c2473.f7399;
        View view2 = abstractC2484.itemView;
        if (view == view2 && view2 == view) {
            c2473.f7399 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4859(Animator animator) {
        if (!this.f7353) {
            this.f7341.setIsRecyclable(true);
        }
        this.f7353 = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
