package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class xo extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ zo e;

    public xo(zo r1, int r2, TextView r3, int r4, TextView r5) {
        this.e = r1;
        this.a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r4) {
        int r42 = this.a;
        zo r0 = this.e;
        r0.n = r42;
        r0.l = null;
        TextView r1 = this.b;
        if (r1 == null) goto L9;
        r1.setVisibility(4);
        if (this.c != 1) goto L9;
        g5 r02 = r0.r;
        if (r02 == null) goto L9;
        r02.setText(null);
    L9:
        TextView r43 = this.d;
        if (r43 == null) goto L13;
        r43.setTranslationY(0.0f);
        r43.setAlpha(1.0f);
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r2) {
        TextView r22 = this.d;
        if (r22 == null) goto L6;
        r22.setVisibility(0);
        r22.setAlpha(0.0f);
        return;
    }
}
