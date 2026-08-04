package yyds;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: yyds.ᛴᛸᛶᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0915 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C2446 f4197;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f4198 = 1;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0185 f4199;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ View f4200;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f4201;

    public C0915(C2446 c2446, AbstractC0185 abstractC0185, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f4197 = c2446;
        this.f4199 = abstractC0185;
        this.f4201 = viewPropertyAnimator;
        this.f4200 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f4198) {
            case 1:
                this.f4200.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f4198;
        AbstractC0185 abstractC0185 = this.f4199;
        C2446 c2446 = this.f4197;
        ViewPropertyAnimator viewPropertyAnimator = this.f4201;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.f4200.setAlpha(1.0f);
                c2446.m4465(abstractC0185);
                c2446.f12049.remove(abstractC0185);
                c2446.m4485();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                c2446.m4465(abstractC0185);
                c2446.f12047.remove(abstractC0185);
                c2446.m4485();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f4198) {
            case 0:
                this.f4197.getClass();
                break;
            default:
                this.f4197.getClass();
                break;
        }
    }

    public C0915(C2446 c2446, AbstractC0185 abstractC0185, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f4197 = c2446;
        this.f4199 = abstractC0185;
        this.f4200 = view;
        this.f4201 = viewPropertyAnimator;
    }
}
