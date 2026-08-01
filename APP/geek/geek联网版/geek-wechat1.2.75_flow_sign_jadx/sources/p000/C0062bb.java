package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: bb */
/* JADX INFO: loaded from: classes.dex */
public final class C0062bb extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f706a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0098cb f707b;

    public /* synthetic */ C0062bb(C0098cb c0098cb, int i) {
        this.f706a = i;
        this.f707b = c0098cb;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f706a) {
            case Base64.NO_PADDING /* 1 */:
                this.f707b.f2229b.m1290h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f706a) {
            case Base64.DEFAULT /* 0 */:
                this.f707b.f2229b.m1290h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
