package p037U;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: U.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0368d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f780a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f781b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f782c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f783d;

    public /* synthetic */ C0368d(C0371g c0371g, Object obj, ViewPropertyAnimator viewPropertyAnimator, View view, int i2) {
        this.f780a = i2;
        this.f783d = c0371g;
        this.f782c = viewPropertyAnimator;
        this.f781b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f780a) {
            case 1:
                this.f781b.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f780a) {
            case 0:
                ((ViewPropertyAnimator) this.f782c).setListener(null);
                this.f781b.setAlpha(1.0f);
                C0371g c0371g = (C0371g) this.f783d;
                c0371g.m980b(null);
                c0371g.f794q.remove((Object) null);
                c0371g.m949g();
                return;
            case 1:
                ((ViewPropertyAnimator) this.f782c).setListener(null);
                C0371g c0371g2 = (C0371g) this.f783d;
                c0371g2.m980b(null);
                c0371g2.f792o.remove((Object) null);
                c0371g2.m949g();
                return;
            case 2:
                ((ViewPropertyAnimator) this.f782c).setListener(null);
                View view = this.f781b;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                throw null;
            case 3:
                ((ViewPropertyAnimator) this.f782c).setListener(null);
                View view2 = this.f781b;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                throw null;
            default:
                AbstractC0307g.m703e(animator, "animation");
                View view3 = this.f781b;
                view3.setLayerType(0, null);
                AbstractC0358S.m900o((View) this.f783d, (FrameLayout) this.f782c, (LinearLayout) view3);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f780a) {
            case 0:
                ((C0371g) this.f783d).getClass();
                return;
            case 1:
                ((C0371g) this.f783d).getClass();
                return;
            case 2:
                throw null;
            case 3:
                throw null;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public C0368d(C0371g c0371g, AbstractC0355O abstractC0355O, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f780a = 1;
        this.f783d = c0371g;
        this.f781b = view;
        this.f782c = viewPropertyAnimator;
    }

    public C0368d(View view, FrameLayout frameLayout, LinearLayout linearLayout) {
        this.f780a = 4;
        this.f781b = linearLayout;
        this.f782c = frameLayout;
        this.f783d = view;
    }
}
