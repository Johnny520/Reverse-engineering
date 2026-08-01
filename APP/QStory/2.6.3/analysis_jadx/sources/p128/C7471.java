package p128;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC2270;
import com.davemorrissey.labs.subscaleview.R;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7471 extends AnimatorListenerAdapter implements InterfaceC7485 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C7480 f20217;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f20218 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final View f20219;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final View f20220;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ViewGroup f20221;

    public C7471(C7480 c7480, ViewGroup viewGroup, View view, View view2) {
        this.f20217 = c7480;
        this.f20221 = viewGroup;
        this.f20220 = view;
        this.f20219 = view2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        m12689();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f20221.getOverlay().remove(this.f20220);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f20220;
        if (view.getParent() == null) {
            AbstractC2270.m4238(this.f20221, view);
        } else {
            this.f20217.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.f20219;
            View view2 = this.f20220;
            view.setTag(R.id.save_overlay_view, view2);
            AbstractC2270.m4238(this.f20221, view2);
            this.f20218 = true;
        }
    }

    @Override // p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo12666(AbstractC7483 abstractC7483) {
        abstractC7483.mo12675(this);
    }

    @Override // p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo12667(AbstractC7483 abstractC7483) {
        if (this.f20218) {
            m12689();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m12689() {
        this.f20219.setTag(R.id.save_overlay_view, null);
        this.f20221.getOverlay().remove(this.f20220);
        this.f20218 = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m12689();
    }

    @Override // p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12665() {
    }

    @Override // p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo12668() {
    }

    @Override // p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12687(AbstractC7483 abstractC7483) {
    }
}
