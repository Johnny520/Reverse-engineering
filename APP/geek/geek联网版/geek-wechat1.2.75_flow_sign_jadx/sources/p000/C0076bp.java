package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* JADX INFO: renamed from: bp */
/* JADX INFO: loaded from: classes.dex */
public final class C0076bp extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f748a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextView f749b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f750c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TextView f751d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0158dp f752e;

    public C0076bp(C0158dp c0158dp, int i, TextView textView, int i2, TextView textView2) {
        this.f752e = c0158dp;
        this.f748a = i;
        this.f749b = textView;
        this.f750c = i2;
        this.f751d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0249g5 c0249g5;
        int i = this.f748a;
        C0158dp c0158dp = this.f752e;
        c0158dp.f1415n = i;
        c0158dp.f1413l = null;
        TextView textView = this.f749b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f750c == 1 && (c0249g5 = c0158dp.f1419r) != null) {
                c0249g5.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f751d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f751d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
