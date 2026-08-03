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
    public boolean f2518k;

    /* JADX INFO: renamed from: l */
    public boolean f2519l;

    /* JADX INFO: renamed from: m */
    public float f2520m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f2521n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ AbstractC1166o f2522o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0973Wl f2523p;

    public C0801Sl(C0973Wl r1, AbstractC1166o r2, int r3, float r4, float r5, float r6, float r7, int r8, AbstractC1166o r9) {
        this.f2523p = r1;
        this.f2521n = r8;
        this.f2522o = r9;
        this.f2518k = false;
        this.f2519l = false;
        this.f2513f = r3;
        this.f2512e = r2;
        this.f2508a = r4;
        this.f2509b = r5;
        this.f2510c = r6;
        this.f2511d = r7;
        ValueAnimator r32 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f2514g = r32;
        r32.addUpdateListener(new C0994X5(2, this));
        r32.setTarget(r2.itemView);
        r32.addListener(this);
        this.f2520m = 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final void m1609a(Animator r2) {
        if (this.f2519l == true) goto L5;
        this.f2512e.setIsRecyclable(true);
    L5:
        this.f2519l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator r1) {
        this.f2520m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r5) {
        m1609a(r5);
        if (this.f2518k == true) goto L16;
        int r52 = this.f2521n;
        AbstractC1166o r0 = this.f2522o;
        C0973Wl r1 = this.f2523p;
        if (r52 > 0) goto L8;
        r1.f3041m.mo1531a(r1.f3045q, r0);
    L11:
        View r53 = r1.f3050v;
        View r02 = r0.itemView;
        if (r53 != r02) goto L15;
        r1.m1858m(r02);
        return;
    L15:
        return;
    L8:
        r1.f3029a.add(r0.itemView);
        this.f2515h = true;
        if (r52 <= 0) goto L11;
        r1.f3045q.post(new RunnableC0044B0(r1, this, r52));
        goto L11
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator r1) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r1) {
    }
}
