package yyds;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: yyds.ᛷᛱᛱᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1472 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f6989;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public boolean f6990;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public float f6991;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public float f6992;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final AbstractC0185 f6993;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final float f6994;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0185 f6995;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final float f6996;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final ValueAnimator f6997;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public boolean f6998 = false;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public boolean f6999 = false;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public float f7000;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final float f7001;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final /* synthetic */ C1877 f7002;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int f7003;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final float f7004;

    public C1472(C1877 c1877, AbstractC0185 abstractC0185, int i, float f, float f2, float f3, float f4, int i2, AbstractC0185 abstractC01852) {
        this.f7002 = c1877;
        this.f6989 = i2;
        this.f6995 = abstractC01852;
        this.f7003 = i;
        this.f6993 = abstractC0185;
        this.f6994 = f;
        this.f6996 = f2;
        this.f7001 = f3;
        this.f7004 = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f6997 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new C0383(1, this));
        valueAnimatorOfFloat.setTarget(abstractC0185.f1093);
        valueAnimatorOfFloat.addListener(this);
        this.f6991 = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f6991 = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m2974(animator);
        if (this.f6998) {
            return;
        }
        int i = this.f6989;
        AbstractC0185 abstractC0185 = this.f6995;
        C1877 c1877 = this.f7002;
        if (i <= 0) {
            c1877.f9442.mo1232(c1877.f9450, abstractC0185);
        } else {
            c1877.f9447.add(abstractC0185.f1093);
            this.f6990 = true;
            if (i > 0) {
                c1877.f9450.post(new RunnableC2660(c1877, this, i));
            }
        }
        View view = c1877.f9453;
        View view2 = abstractC0185.f1093;
        if (view == view2 && view2 == view) {
            c1877.f9453 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m2974(Animator animator) {
        if (!this.f6999) {
            this.f6993.m777(true);
        }
        this.f6999 = true;
    }
}
