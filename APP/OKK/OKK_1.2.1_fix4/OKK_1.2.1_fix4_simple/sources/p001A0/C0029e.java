package p001A0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: A0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0029e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f72a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0030f f73b;

    public /* synthetic */ C0029e(C0030f r1, int r2) {
        this.f72a = r2;
        this.f73b = r1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator r2) {
        switch(this.f72a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationEnd(r2);
        return;
    L6:
        this.f73b.f139b.m147h(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator r2) {
        switch(this.f72a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationStart(r2);
        return;
    L6:
        this.f73b.f139b.m147h(true);
    }
}
