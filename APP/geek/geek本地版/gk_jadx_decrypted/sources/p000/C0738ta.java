package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: ta */
/* JADX INFO: loaded from: classes.dex */
public final class C0738ta extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4557a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0775ua f4558b;

    public /* synthetic */ C0738ta(C0775ua c0775ua, int i) {
        this.f4557a = i;
        this.f4558b = c0775ua;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f4557a) {
            case Base64.NO_PADDING /* 1 */:
                this.f4558b.f1970b.m1042h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f4557a) {
            case Base64.DEFAULT /* 0 */:
                this.f4558b.f1970b.m1042h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
