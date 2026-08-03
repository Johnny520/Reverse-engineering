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

    public /* synthetic */ C0029e(C0030f c0030f, int i2) {
        this.f72a = i2;
        this.f73b = c0030f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f72a) {
            case 1:
                this.f73b.f139b.m147h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f72a) {
            case 0:
                this.f73b.f139b.m147h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
