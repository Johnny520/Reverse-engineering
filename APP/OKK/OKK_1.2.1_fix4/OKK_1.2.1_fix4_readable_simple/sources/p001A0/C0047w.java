package p001A0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import p037U.AbstractC0355O;
import p037U.C0371g;
import p057g.C0868K;

/* JADX INFO: renamed from: A0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0047w extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f142a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f143b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f144c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f145d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f146e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f147f;

    public C0047w(C0049y r2, int r3, TextView r4, int r5, TextView r6) {
        this.f142a = 0;
        this.f147f = r2;
        this.f143b = r3;
        this.f145d = r4;
        this.f144c = r5;
        this.f146e = r6;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator r3) {
        switch(this.f142a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationCancel(r3);
        return;
    L6:
        int r32 = this.f143b;
        View r1 = this.f145d;
        if (r32 == 0) goto L10;
        r1.setTranslationX(0.0f);
    L10:
        if (this.f144c == 0) goto L13;
        r1.setTranslationY(0.0f);
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r4) {
        switch(this.f142a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((ViewPropertyAnimator) this.f146e).setListener(null);
        C0371g r42 = (C0371g) this.f147f;
        r42.m980b(null);
        r42.f793p.remove(null);
        r42.m949g();
        return;
    L6:
        int r43 = this.f143b;
        C0049y r02 = (C0049y) this.f147f;
        r02.f164n = r43;
        r02.f162l = null;
        TextView r1 = (TextView) this.f145d;
        if (r1 == null) goto L13;
        r1.setVisibility(4);
        if (this.f144c != 1) goto L13;
        C0868K r03 = r02.f168r;
        if (r03 == null) goto L13;
        r03.setText(null);
    L13:
        TextView r44 = (TextView) this.f146e;
        if (r44 == null) goto L17;
        r44.setTranslationY(0.0f);
        r44.setAlpha(1.0f);
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r2) {
        switch(this.f142a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((C0371g) this.f147f).getClass();
        return;
    L6:
        TextView r22 = (TextView) this.f146e;
        if (r22 == null) goto L10;
        r22.setVisibility(0);
        r22.setAlpha(0.0f);
        return;
    }

    public C0047w(C0371g r1, AbstractC0355O r2, int r3, View r4, int r5, ViewPropertyAnimator r6) {
        this.f142a = 1;
        this.f147f = r1;
        this.f143b = r3;
        this.f145d = r4;
        this.f144c = r5;
        this.f146e = r6;
    }
}
