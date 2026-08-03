package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.AbstractC1166o;

/* JADX INFO: renamed from: Xc */
/* JADX INFO: loaded from: classes.dex */
public final class C1007Xc extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3208a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1166o f3209b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f3210c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ViewPropertyAnimator f3211d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1261cd f3212e;

    public C1007Xc(C1261cd r2, AbstractC1166o r3, ViewPropertyAnimator r4, View r5) {
        this.f3208a = 0;
        this.f3212e = r2;
        this.f3209b = r3;
        this.f3211d = r4;
        this.f3210c = r5;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator r2) {
        switch(this.f3208a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationCancel(r2);
        return;
    L6:
        this.f3210c.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r3) {
        switch(this.f3208a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.f3211d.setListener(null);
        C1261cd r32 = this.f3212e;
        AbstractC1166o r0 = this.f3209b;
        r32.m2247c(r0);
        r32.f4284o.remove(r0);
        r32.m2394i();
        return;
    L6:
        this.f3211d.setListener(null);
        this.f3210c.setAlpha(1.0f);
        C1261cd r33 = this.f3212e;
        AbstractC1166o r02 = this.f3209b;
        r33.m2247c(r02);
        r33.f4286q.remove(r02);
        r33.m2394i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r1) {
        switch(this.f3208a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.f3212e.getClass();
        return;
    L6:
        this.f3212e.getClass();
    }

    public C1007Xc(C1261cd r2, AbstractC1166o r3, View r4, ViewPropertyAnimator r5) {
        this.f3208a = 1;
        this.f3212e = r2;
        this.f3209b = r3;
        this.f3210c = r4;
        this.f3211d = r5;
    }
}
