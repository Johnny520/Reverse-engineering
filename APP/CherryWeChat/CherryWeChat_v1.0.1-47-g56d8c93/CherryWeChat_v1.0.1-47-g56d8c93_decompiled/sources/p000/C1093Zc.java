package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.AbstractC1166o;

/* JADX INFO: renamed from: Zc */
/* JADX INFO: loaded from: classes.dex */
public final class C1093Zc extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3472a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1138ad f3473b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f3474c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f3475d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1261cd f3476e;

    public /* synthetic */ C1093Zc(C1261cd c1261cd, C1138ad c1138ad, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f3472a = i;
        this.f3476e = c1261cd;
        this.f3473b = c1138ad;
        this.f3474c = viewPropertyAnimator;
        this.f3475d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3472a) {
            case 0:
                this.f3474c.setListener(null);
                View view = this.f3475d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C1138ad c1138ad = this.f3473b;
                AbstractC1166o abstractC1166o = c1138ad.f3593a;
                C1261cd c1261cd = this.f3476e;
                c1261cd.m2247c(abstractC1166o);
                c1261cd.f4287r.remove(c1138ad.f3593a);
                c1261cd.m2394i();
                break;
            default:
                this.f3474c.setListener(null);
                View view2 = this.f3475d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C1138ad c1138ad2 = this.f3473b;
                AbstractC1166o abstractC1166o2 = c1138ad2.f3594b;
                C1261cd c1261cd2 = this.f3476e;
                c1261cd2.m2247c(abstractC1166o2);
                c1261cd2.f4287r.remove(c1138ad2.f3594b);
                c1261cd2.m2394i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3472a) {
            case 0:
                AbstractC1166o abstractC1166o = this.f3473b.f3593a;
                this.f3476e.getClass();
                break;
            default:
                AbstractC1166o abstractC1166o2 = this.f3473b.f3594b;
                this.f3476e.getClass();
                break;
        }
    }
}
