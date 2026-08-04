package yyds;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: yyds.ᛲᛳᛶᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0310 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f1620;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0185 f1621;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ int f1622;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ View f1623;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ C2446 f1624;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ int f1625;

    public C0310(C2446 c2446, AbstractC0185 abstractC0185, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1624 = c2446;
        this.f1621 = abstractC0185;
        this.f1622 = i;
        this.f1623 = view;
        this.f1625 = i2;
        this.f1620 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f1622;
        View view = this.f1623;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f1625 != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f1620.setListener(null);
        C2446 c2446 = this.f1624;
        AbstractC0185 abstractC0185 = this.f1621;
        c2446.m4465(abstractC0185);
        c2446.f12054.remove(abstractC0185);
        c2446.m4485();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f1624.getClass();
    }
}
