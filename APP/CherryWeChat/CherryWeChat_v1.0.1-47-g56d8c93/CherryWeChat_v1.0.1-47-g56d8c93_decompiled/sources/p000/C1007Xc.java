package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.AbstractC1166o;

/* JADX INFO: renamed from: Xc */
/* JADX INFO: loaded from: classes.dex */
public final class C1007Xc extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3208a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1166o f3209b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f3210c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ViewPropertyAnimator f3211d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1261cd f3212e;

    public C1007Xc(C1261cd c1261cd, AbstractC1166o abstractC1166o, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3212e = c1261cd;
        this.f3209b = abstractC1166o;
        this.f3211d = viewPropertyAnimator;
        this.f3210c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3208a) {
            case 1:
                this.f3210c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3208a) {
            case 0:
                this.f3211d.setListener(null);
                this.f3210c.setAlpha(1.0f);
                C1261cd c1261cd = this.f3212e;
                AbstractC1166o abstractC1166o = this.f3209b;
                c1261cd.m2247c(abstractC1166o);
                c1261cd.f4286q.remove(abstractC1166o);
                c1261cd.m2394i();
                break;
            default:
                this.f3211d.setListener(null);
                C1261cd c1261cd2 = this.f3212e;
                AbstractC1166o abstractC1166o2 = this.f3209b;
                c1261cd2.m2247c(abstractC1166o2);
                c1261cd2.f4284o.remove(abstractC1166o2);
                c1261cd2.m2394i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3208a) {
            case 0:
                this.f3212e.getClass();
                break;
            default:
                this.f3212e.getClass();
                break;
        }
    }

    public C1007Xc(C1261cd c1261cd, AbstractC1166o abstractC1166o, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3212e = c1261cd;
        this.f3209b = abstractC1166o;
        this.f3210c = view;
        this.f3211d = viewPropertyAnimator;
    }
}
