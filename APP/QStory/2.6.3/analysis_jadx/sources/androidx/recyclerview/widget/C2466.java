package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2466 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f7341;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC2484 f7342;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f7343;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f7344;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f7345;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f7346;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f7347;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f7348;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2484 f7349;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C2473 f7350;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f7351;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ValueAnimator f7352;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f7353 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f7354 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f7355;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public float f7356;

    public C2466(C2473 c2473, AbstractC2484 abstractC2484, int i, float f, float f2, float f3, float f4, int i2, AbstractC2484 abstractC24842) {
        this.f7350 = c2473;
        this.f7347 = i2;
        this.f7349 = abstractC24842;
        this.f7341 = i;
        this.f7342 = abstractC2484;
        this.f7346 = f;
        this.f7345 = f2;
        this.f7344 = f3;
        this.f7343 = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7352 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new C2506(this, 1));
        valueAnimatorOfFloat.setTarget(abstractC2484.itemView);
        valueAnimatorOfFloat.addListener(this);
        this.f7348 = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f7348 = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m4869(animator);
        if (this.f7353) {
            return;
        }
        int i = this.f7347;
        AbstractC2484 abstractC2484 = this.f7349;
        C2473 c2473 = this.f7350;
        if (i <= 0) {
            c2473.f7405.getClass();
            AbstractC2464.m4867(abstractC2484);
        } else {
            c2473.f7397.add(abstractC2484.itemView);
            this.f7351 = true;
            if (i > 0) {
                c2473.f7407.post(new RunnableC2511(c2473, this, i));
            }
        }
        View view = c2473.f7400;
        View view2 = abstractC2484.itemView;
        if (view == view2 && view2 == view) {
            c2473.f7400 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4869(Animator animator) {
        if (!this.f7354) {
            this.f7342.setIsRecyclable(true);
        }
        this.f7354 = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
