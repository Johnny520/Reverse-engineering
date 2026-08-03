package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: M9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0526M9 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1718a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0569N9 f1719b;

    public /* synthetic */ C0526M9(C0569N9 r1, int r2) {
        this.f1718a = r2;
        this.f1719b = r1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator r2) {
        switch(this.f1718a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationEnd(r2);
        return;
    L6:
        this.f1719b.f4174b.m2065h(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator r2) {
        switch(this.f1718a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationStart(r2);
        return;
    L6:
        this.f1719b.f4174b.m2065h(true);
    }
}
