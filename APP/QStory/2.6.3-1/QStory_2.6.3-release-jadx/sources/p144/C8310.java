package p144;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.davemorrissey.labs.subscaleview.C0328R;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8310 extends AnimatorListenerAdapter implements InterfaceC8314 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f20583 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f20584;

    public C8310(View view) {
        this.f20584 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC8297.f20552.mo13253(this.f20584, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.f20583;
        View view = this.f20584;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        C8301 c8301 = AbstractC8297.f20552;
        c8301.mo13253(view, 1.0f);
        c8301.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f20584;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f20583 = true;
            view.setLayerType(2, null);
        }
    }

    @Override // p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo13224() {
        this.f20584.setTag(C0328R.id.transition_pause_alpha, null);
    }

    @Override // p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo13227() {
        View view = this.f20584;
        view.setTag(C0328R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC8297.f20552.mo13254(view) : 0.0f));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo13225(AbstractC8312 abstractC8312) {
    }

    @Override // p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo13246(AbstractC8312 abstractC8312) {
    }

    @Override // p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo13226(AbstractC8312 abstractC8312) {
    }

    @Override // p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo13262(AbstractC8312 abstractC8312) {
    }
}
