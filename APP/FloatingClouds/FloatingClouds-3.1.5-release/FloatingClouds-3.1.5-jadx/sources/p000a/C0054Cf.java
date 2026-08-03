package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.AbstractC1235e;

/* JADX INFO: renamed from: a.Cf */
/* JADX INFO: loaded from: classes.dex */
public final class C0054Cf extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0166J1 f186a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1235e f187b;

    public C0054Cf(AbstractC1235e abstractC1235e, C0166J1 c0166j1) {
        this.f187b = abstractC1235e;
        this.f186a = c0166j1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f186a.remove(animator);
        this.f187b.f5251n.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f187b.f5251n.add(animator);
    }
}
