package p128;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.davemorrissey.labs.subscaleview.R;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7480 extends AnimatorListenerAdapter implements InterfaceC7484 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f20243 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f20244;

    public C7480(View view) {
        this.f20244 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC7467.f20212.mo9904(this.f20244, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.f20243;
        View view = this.f20244;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        C7471 c7471 = AbstractC7467.f20212;
        c7471.mo9904(view, 1.0f);
        c7471.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f20244;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f20243 = true;
            view.setLayerType(2, null);
        }
    }

    @Override // p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12638() {
        this.f20244.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo12641() {
        View view = this.f20244;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC7467.f20212.mo9908(view) : 0.0f));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo12639(AbstractC7482 abstractC7482) {
    }

    @Override // p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12660(AbstractC7482 abstractC7482) {
    }

    @Override // p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo12640(AbstractC7482 abstractC7482) {
    }

    @Override // p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo12674(AbstractC7482 abstractC7482) {
    }
}
