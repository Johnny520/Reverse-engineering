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

    public /* synthetic */ C0368d(C0371g r1, Object r2, ViewPropertyAnimator r3, View r4, int r5) {
        this.f780a = r5;
        this.f783d = r1;
        this.f782c = r3;
        this.f781b = r4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator r2) {
        switch(this.f780a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationCancel(r2);
        return;
    L6:
        this.f781b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r3) {
        switch(this.f780a) {
            case 0: goto L12;
            case 1: goto L10;
            case 2: goto L8;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0307g.m703e(r3, "animation");
        View r32 = this.f781b;
        r32.setLayerType(0, null);
        FrameLayout r1 = (FrameLayout) this.f782c;
        AbstractC0358S.m900o((View) this.f783d, r1, (LinearLayout) r32);
        return;
    L6:
        ((ViewPropertyAnimator) this.f782c).setListener(null);
        View r02 = this.f781b;
        r02.setAlpha(1.0f);
        r02.setTranslationX(0.0f);
        r02.setTranslationY(0.0f);
        throw null;
    L8:
        ((ViewPropertyAnimator) this.f782c).setListener(null);
        View r03 = this.f781b;
        r03.setAlpha(1.0f);
        r03.setTranslationX(0.0f);
        r03.setTranslationY(0.0f);
        throw null;
    L10:
        ((ViewPropertyAnimator) this.f782c).setListener(null);
        C0371g r33 = (C0371g) this.f783d;
        r33.m980b(null);
        r33.f792o.remove(null);
        r33.m949g();
        return;
    L12:
        ((ViewPropertyAnimator) this.f782c).setListener(null);
        this.f781b.setAlpha(1.0f);
        C0371g r34 = (C0371g) this.f783d;
        r34.m980b(null);
        r34.f794q.remove(null);
        r34.m949g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator r2) {
        switch(this.f780a) {
            case 0: goto L12;
            case 1: goto L10;
            case 2: goto L9;
            case 3: goto L7;
            default: goto L4;
        };
    L4:
        super.onAnimationStart(r2);
        return;
    L10:
        ((C0371g) this.f783d).getClass();
        return;
    L12:
        ((C0371g) this.f783d).getClass();
        return;
    L7:
        throw null;
    L9:
        throw null;
    }

    public C0368d(C0371g r1, AbstractC0355O r2, View r3, ViewPropertyAnimator r4) {
        this.f780a = 1;
        this.f783d = r1;
        this.f781b = r3;
        this.f782c = r4;
    }

    public C0368d(View r2, FrameLayout r3, LinearLayout r4) {
        this.f780a = 4;
        this.f781b = r4;
        this.f782c = r3;
        this.f783d = r2;
    }
}
