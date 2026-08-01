package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2327 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C2329 f6828;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ C2357 f6829;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ boolean f6830;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ View f6831;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C2349 f6832;

    public C2327(C2349 c2349, View view, boolean z, C2357 c2357, C2329 c2329) {
        this.f6832 = c2349;
        this.f6831 = view;
        this.f6830 = z;
        this.f6829 = c2357;
        this.f6828 = c2329;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        ViewGroup viewGroup = this.f6832.f6956;
        View view = this.f6831;
        viewGroup.endViewTransition(view);
        boolean z = this.f6830;
        C2357 c2357 = this.f6829;
        if (z) {
            SpecialEffectsController$Operation$State specialEffectsController$Operation$State = c2357.f6982;
            view.getClass();
            specialEffectsController$Operation$State.applyState(view);
        }
        this.f6828.m305();
        if (AbstractC2313.m4352(2)) {
            Log.v("FragmentManager", "Animator from operation " + c2357 + " has ended.");
        }
    }
}
