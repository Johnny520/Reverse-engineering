package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* JADX INFO: renamed from: xo */
/* JADX INFO: loaded from: classes.dex */
public final class C0900xo extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5177a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextView f5178b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f5179c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TextView f5180d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0974zo f5181e;

    public C0900xo(C0974zo c0974zo, int i, TextView textView, int i2, TextView textView2) {
        this.f5181e = c0974zo;
        this.f5177a = i;
        this.f5178b = textView;
        this.f5179c = i2;
        this.f5180d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0249g5 c0249g5;
        int i = this.f5177a;
        C0974zo c0974zo = this.f5181e;
        c0974zo.f5591n = i;
        c0974zo.f5589l = null;
        TextView textView = this.f5178b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f5179c == 1 && (c0249g5 = c0974zo.f5595r) != null) {
                c0249g5.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f5180d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f5180d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
