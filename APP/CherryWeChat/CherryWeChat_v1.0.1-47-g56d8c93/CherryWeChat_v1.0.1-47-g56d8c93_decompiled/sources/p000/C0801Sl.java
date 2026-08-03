package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1166o;

/* JADX INFO: renamed from: Sl */
/* JADX INFO: loaded from: classes.dex */
public final class C0801Sl implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final float f2508a;

    /* JADX INFO: renamed from: b */
    public final float f2509b;

    /* JADX INFO: renamed from: c */
    public final float f2510c;

    /* JADX INFO: renamed from: d */
    public final float f2511d;

    /* JADX INFO: renamed from: e */
    public final AbstractC1166o f2512e;

    /* JADX INFO: renamed from: f */
    public final int f2513f;

    /* JADX INFO: renamed from: g */
    public final ValueAnimator f2514g;

    /* JADX INFO: renamed from: h */
    public boolean f2515h;

    /* JADX INFO: renamed from: i */
    public float f2516i;

    /* JADX INFO: renamed from: j */
    public float f2517j;

    /* JADX INFO: renamed from: k */
    public boolean f2518k = false;

    /* JADX INFO: renamed from: l */
    public boolean f2519l = false;

    /* JADX INFO: renamed from: m */
    public float f2520m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f2521n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ AbstractC1166o f2522o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0973Wl f2523p;

    public C0801Sl(C0973Wl c0973Wl, AbstractC1166o abstractC1166o, int i, float f, float f2, float f3, float f4, int i2, AbstractC1166o abstractC1166o2) {
        this.f2523p = c0973Wl;
        this.f2521n = i2;
        this.f2522o = abstractC1166o2;
        this.f2513f = i;
        this.f2512e = abstractC1166o;
        this.f2508a = f;
        this.f2509b = f2;
        this.f2510c = f3;
        this.f2511d = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2514g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new C0994X5(2, this));
        valueAnimatorOfFloat.setTarget(abstractC1166o.itemView);
        valueAnimatorOfFloat.addListener(this);
        this.f2520m = 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final void m1609a(Animator animator) {
        if (!this.f2519l) {
            this.f2512e.setIsRecyclable(true);
        }
        this.f2519l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2520m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m1609a(animator);
        if (this.f2518k) {
            return;
        }
        int i = this.f2521n;
        AbstractC1166o abstractC1166o = this.f2522o;
        C0973Wl c0973Wl = this.f2523p;
        if (i <= 0) {
            c0973Wl.f3041m.mo1531a(c0973Wl.f3045q, abstractC1166o);
        } else {
            c0973Wl.f3029a.add(abstractC1166o.itemView);
            this.f2515h = true;
            if (i > 0) {
                c0973Wl.f3045q.post(new RunnableC0044B0(c0973Wl, this, i));
            }
        }
        View view = c0973Wl.f3050v;
        View view2 = abstractC1166o.itemView;
        if (view == view2) {
            c0973Wl.m1858m(view2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
