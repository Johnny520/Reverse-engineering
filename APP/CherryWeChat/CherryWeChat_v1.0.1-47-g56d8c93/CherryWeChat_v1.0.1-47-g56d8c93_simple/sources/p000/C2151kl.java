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

    public C2151kl(C2241ml r1, int r2, TextView r3, int r4, TextView r5) {
        this.f7528e = r1;
        this.f7524a = r2;
        this.f7525b = r3;
        this.f7526c = r4;
        this.f7527d = r5;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r4) {
        int r42 = this.f7524a;
        C2241ml r0 = this.f7528e;
        r0.f7908n = r42;
        r0.f7906l = null;
        TextView r1 = this.f7525b;
        if (r1 == null) goto L9;
        r1.setVisibility(4);
        if (this.f7526c != 1) goto L9;
        C2304o4 r02 = r0.f7912r;
        if (r02 == null) goto L9;
        r02.setText(null);
    L9:
        TextView r43 = this.f7527d;
        if (r43 == null) goto L13;
        r43.setTranslationY(0.0f);
        r43.setAlpha(1.0f);
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r2) {
        TextView r22 = this.f7527d;
        if (r22 == null) goto L6;
        r22.setVisibility(0);
        r22.setAlpha(0.0f);
        return;
    }
}
