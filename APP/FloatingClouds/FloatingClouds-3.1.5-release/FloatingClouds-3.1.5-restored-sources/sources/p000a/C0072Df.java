package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.AbstractC1235e;

/* JADX INFO: renamed from: a.Df */
/* JADX INFO: loaded from: classes.dex */
public final class C0072Df extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC1235e f242a;

    public C0072Df(AbstractC1235e abstractC1235e) {
        this.f242a = abstractC1235e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f242a.m3048m();
        animator.removeListener(this);
    }
}
