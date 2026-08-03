package p091g3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: g3.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1335u extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1300b0 f4407a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f4408b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1335u(View view, C1300b0 c1300b0) {
        this.f4407a = c1300b0;
        this.f4408b = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1300b0 c1300b0 = this.f4407a;
        c1300b0.f4355a.mo3448e(1.0f);
        C1338x.m3564f(this.f4408b, c1300b0);
    }
}
