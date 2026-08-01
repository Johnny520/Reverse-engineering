package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC2345 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ C2329 f6942;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ View f6943;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C2349 f6944;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C2357 f6945;

    public AnimationAnimationListenerC2345(C2357 c2357, C2349 c2349, View view, C2329 c2329) {
        this.f6945 = c2357;
        this.f6944 = c2349;
        this.f6943 = view;
        this.f6942 = c2329;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        C2349 c2349 = this.f6944;
        c2349.f6956.post(new RunnableC2346(c2349, this.f6943, this.f6942, 0));
        if (AbstractC2313.m4352(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f6945 + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (AbstractC2313.m4352(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f6945 + " has reached onAnimationStart.");
        }
    }
}
