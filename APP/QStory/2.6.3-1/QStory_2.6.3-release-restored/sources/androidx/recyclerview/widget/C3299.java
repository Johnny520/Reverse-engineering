package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3299 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f7686;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC3317 f7687;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f7688;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f7689;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f7690;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f7691;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f7692;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f7693;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3317 f7694;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C3306 f7695;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f7696;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ValueAnimator f7697;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f7698 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f7699 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f7700;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public float f7701;

    public C3299(C3306 c3306, AbstractC3317 abstractC3317, int i, float f, float f2, float f3, float f4, int i2, AbstractC3317 abstractC33172) {
        this.f7695 = c3306;
        this.f7692 = i2;
        this.f7694 = abstractC33172;
        this.f7686 = i;
        this.f7687 = abstractC3317;
        this.f7691 = f;
        this.f7690 = f2;
        this.f7689 = f3;
        this.f7688 = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7697 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new C3339(this, 1));
        valueAnimatorOfFloat.setTarget(abstractC3317.itemView);
        valueAnimatorOfFloat.addListener(this);
        this.f7693 = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f7693 = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m5429(animator);
        if (this.f7698) {
            return;
        }
        int i = this.f7692;
        AbstractC3317 abstractC3317 = this.f7694;
        C3306 c3306 = this.f7695;
        if (i <= 0) {
            c3306.f7750.getClass();
            AbstractC3297.m5427(abstractC3317);
        } else {
            c3306.f7742.add(abstractC3317.itemView);
            this.f7696 = true;
            if (i > 0) {
                c3306.f7752.post(new RunnableC3344(c3306, this, i));
            }
        }
        View view = c3306.f7745;
        View view2 = abstractC3317.itemView;
        if (view == view2 && view2 == view) {
            c3306.f7745 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5429(Animator animator) {
        if (!this.f7699) {
            this.f7687.setIsRecyclable(true);
        }
        this.f7699 = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
