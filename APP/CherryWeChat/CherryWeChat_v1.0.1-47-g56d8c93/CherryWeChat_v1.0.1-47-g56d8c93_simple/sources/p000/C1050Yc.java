package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.AbstractC1166o;

/* JADX INFO: renamed from: Yc */
/* JADX INFO: loaded from: classes.dex */
public final class C1050Yc extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC1166o f3346a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3347b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f3348c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3349d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f3350e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1261cd f3351f;

    public C1050Yc(C1261cd r1, AbstractC1166o r2, int r3, View r4, int r5, ViewPropertyAnimator r6) {
        this.f3351f = r1;
        this.f3346a = r2;
        this.f3347b = r3;
        this.f3348c = r4;
        this.f3349d = r5;
        this.f3350e = r6;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator r3) {
        int r32 = this.f3347b;
        View r1 = this.f3348c;
        if (r32 == 0) goto L6;
        r1.setTranslationX(0.0f);
    L6:
        if (this.f3349d == 0) goto L9;
        r1.setTranslationY(0.0f);
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r3) {
        this.f3350e.setListener(null);
        C1261cd r32 = this.f3351f;
        AbstractC1166o r0 = this.f3346a;
        r32.m2247c(r0);
        r32.f4285p.remove(r0);
        r32.m2394i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r1) {
        this.f3351f.getClass();
    }
}
