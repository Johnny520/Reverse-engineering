package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC2345 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ C2329 f6943;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ View f6944;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C2349 f6945;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C2357 f6946;

    public AnimationAnimationListenerC2345(C2357 c2357, C2349 c2349, View view, C2329 c2329) {
        this.f6946 = c2357;
        this.f6945 = c2349;
        this.f6944 = view;
        this.f6943 = c2329;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        C2349 c2349 = this.f6945;
        c2349.f6957.post(new RunnableC2346(c2349, this.f6944, this.f6943, 0));
        if (AbstractC2313.m4362(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f6946 + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (AbstractC2313.m4362(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f6946 + " has reached onAnimationStart.");
        }
    }
}
