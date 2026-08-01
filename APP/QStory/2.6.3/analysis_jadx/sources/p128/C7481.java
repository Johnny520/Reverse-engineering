package p128;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.davemorrissey.labs.subscaleview.R;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7481 extends AnimatorListenerAdapter implements InterfaceC7485 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f20238 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f20239;

    public C7481(View view) {
        this.f20239 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC7468.f20207.mo12694(this.f20239, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.f20238;
        View view = this.f20239;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        C7472 c7472 = AbstractC7468.f20207;
        c7472.mo12694(view, 1.0f);
        c7472.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f20239;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f20238 = true;
            view.setLayerType(2, null);
        }
    }

    @Override // p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12665() {
        this.f20239.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo12668() {
        View view = this.f20239;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC7468.f20207.mo12695(view) : 0.0f));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo12666(AbstractC7483 abstractC7483) {
    }

    @Override // p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12687(AbstractC7483 abstractC7483) {
    }

    @Override // p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo12667(AbstractC7483 abstractC7483) {
    }

    @Override // p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo12703(AbstractC7483 abstractC7483) {
    }
}
