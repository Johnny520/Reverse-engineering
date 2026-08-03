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

    public C1050Yc(C1261cd c1261cd, AbstractC1166o abstractC1166o, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3351f = c1261cd;
        this.f3346a = abstractC1166o;
        this.f3347b = i;
        this.f3348c = view;
        this.f3349d = i2;
        this.f3350e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f3347b;
        View view = this.f3348c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f3349d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3350e.setListener(null);
        C1261cd c1261cd = this.f3351f;
        AbstractC1166o abstractC1166o = this.f3346a;
        c1261cd.m2247c(abstractC1166o);
        c1261cd.f4285p.remove(abstractC1166o);
        c1261cd.m2394i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3351f.getClass();
    }
}
