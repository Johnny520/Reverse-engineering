package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* JADX INFO: renamed from: kl */
/* JADX INFO: loaded from: classes.dex */
public final class C2151kl extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7524a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextView f7525b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f7526c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TextView f7527d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2241ml f7528e;

    public C2151kl(C2241ml c2241ml, int i, TextView textView, int i2, TextView textView2) {
        this.f7528e = c2241ml;
        this.f7524a = i;
        this.f7525b = textView;
        this.f7526c = i2;
        this.f7527d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C2304o4 c2304o4;
        int i = this.f7524a;
        C2241ml c2241ml = this.f7528e;
        c2241ml.f7908n = i;
        c2241ml.f7906l = null;
        TextView textView = this.f7525b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f7526c == 1 && (c2304o4 = c2241ml.f7912r) != null) {
                c2304o4.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f7527d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f7527d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
