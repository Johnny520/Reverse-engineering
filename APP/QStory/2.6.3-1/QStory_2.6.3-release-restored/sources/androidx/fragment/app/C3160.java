package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3160 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C3162 f7174;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ C3190 f7175;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ boolean f7176;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ View f7177;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C3182 f7178;

    public C3160(C3182 c3182, View view, boolean z, C3190 c3190, C3162 c3162) {
        this.f7178 = c3182;
        this.f7177 = view;
        this.f7176 = z;
        this.f7175 = c3190;
        this.f7174 = c3162;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        ViewGroup viewGroup = this.f7178.f7302;
        View view = this.f7177;
        viewGroup.endViewTransition(view);
        boolean z = this.f7176;
        C3190 c3190 = this.f7175;
        if (z) {
            SpecialEffectsController$Operation$State specialEffectsController$Operation$State = c3190.f7328;
            view.getClass();
            specialEffectsController$Operation$State.applyState(view);
        }
        this.f7174.m866();
        if (AbstractC3146.m4922(2)) {
            Log.v("FragmentManager", "Animator from operation " + c3190 + " has ended.");
        }
    }
}
