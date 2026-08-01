package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC3178 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ C3162 f7288;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ View f7289;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C3182 f7290;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C3190 f7291;

    public AnimationAnimationListenerC3178(C3190 c3190, C3182 c3182, View view, C3162 c3162) {
        this.f7291 = c3190;
        this.f7290 = c3182;
        this.f7289 = view;
        this.f7288 = c3162;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        C3182 c3182 = this.f7290;
        c3182.f7302.post(new RunnableC3179(c3182, this.f7289, this.f7288, 0));
        if (AbstractC3146.m4922(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f7291 + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (AbstractC3146.m4922(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f7291 + " has reached onAnimationStart.");
        }
    }
}
