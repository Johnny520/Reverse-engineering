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
    public final /* synthetic */ int f142a = 0;

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

    public C0047w(C0049y c0049y, int i2, TextView textView, int i3, TextView textView2) {
        this.f147f = c0049y;
        this.f143b = i2;
        this.f145d = textView;
        this.f144c = i3;
        this.f146e = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f142a) {
            case 1:
                int i2 = this.f143b;
                View view = this.f145d;
                if (i2 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.f144c != 0) {
                    view.setTranslationY(0.0f);
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0868K c0868k;
        switch (this.f142a) {
            case 0:
                int i2 = this.f143b;
                C0049y c0049y = (C0049y) this.f147f;
                c0049y.f164n = i2;
                c0049y.f162l = null;
                TextView textView = (TextView) this.f145d;
                if (textView != null) {
                    textView.setVisibility(4);
                    if (this.f144c == 1 && (c0868k = c0049y.f168r) != null) {
                        c0868k.setText((CharSequence) null);
                    }
                }
                TextView textView2 = (TextView) this.f146e;
                if (textView2 != null) {
                    textView2.setTranslationY(0.0f);
                    textView2.setAlpha(1.0f);
                }
                break;
            default:
                ((ViewPropertyAnimator) this.f146e).setListener(null);
                C0371g c0371g = (C0371g) this.f147f;
                c0371g.m980b(null);
                c0371g.f793p.remove((Object) null);
                c0371g.m949g();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f142a) {
            case 0:
                TextView textView = (TextView) this.f146e;
                if (textView != null) {
                    textView.setVisibility(0);
                    textView.setAlpha(0.0f);
                }
                break;
            default:
                ((C0371g) this.f147f).getClass();
                break;
        }
    }

    public C0047w(C0371g c0371g, AbstractC0355O abstractC0355O, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
        this.f147f = c0371g;
        this.f143b = i2;
        this.f145d = view;
        this.f144c = i3;
        this.f146e = viewPropertyAnimator;
    }
}
