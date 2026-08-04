package yyds;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: yyds.ᛲᲈᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0490 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C2446 f2409;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2410;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0641 f2411;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f2412;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ View f2413;

    public /* synthetic */ C0490(C2446 c2446, C0641 c0641, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f2410 = i;
        this.f2409 = c2446;
        this.f2411 = c0641;
        this.f2412 = viewPropertyAnimator;
        this.f2413 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f2410;
        C0641 c0641 = this.f2411;
        C2446 c2446 = this.f2409;
        View view = this.f2413;
        ViewPropertyAnimator viewPropertyAnimator = this.f2412;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                c2446.m4465(c0641.f3078);
                c2446.f12048.remove(c0641.f3078);
                c2446.m4485();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                c2446.m4465(c0641.f3079);
                c2446.f12048.remove(c0641.f3079);
                c2446.m4485();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2410) {
            case 0:
                this.f2409.getClass();
                break;
            default:
                this.f2409.getClass();
                break;
        }
    }
}
