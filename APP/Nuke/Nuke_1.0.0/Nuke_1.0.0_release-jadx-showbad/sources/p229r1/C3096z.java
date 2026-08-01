package p229r1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: r1.z */
/* JADX INFO: loaded from: classes.dex */
public final class C3096z extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3046G f9820a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f9821b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3096z(View view, C3046G c3046g) {
        this.f9820a = c3046g;
        this.f9821b = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C3046G c3046g = this.f9820a;
        c3046g.f9741a.mo5320e(1.0f);
        C3042C.m5309f(this.f9821b, c3046g);
    }
}
