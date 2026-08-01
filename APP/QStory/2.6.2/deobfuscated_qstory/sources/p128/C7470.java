package p128;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC2270;
import com.davemorrissey.labs.subscaleview.R;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7470 extends AnimatorListenerAdapter implements InterfaceC7484 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C7479 f20222;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f20223 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final View f20224;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final View f20225;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ViewGroup f20226;

    public C7470(C7479 c7479, ViewGroup viewGroup, View view, View view2) {
        this.f20222 = c7479;
        this.f20226 = viewGroup;
        this.f20225 = view;
        this.f20224 = view2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        m12662();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f20226.getOverlay().remove(this.f20225);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f20225;
        if (view.getParent() == null) {
            AbstractC2270.m4228(this.f20226, view);
        } else {
            this.f20222.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.f20224;
            View view2 = this.f20225;
            view.setTag(R.id.save_overlay_view, view2);
            AbstractC2270.m4228(this.f20226, view2);
            this.f20223 = true;
        }
    }

    @Override // p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo12639(AbstractC7482 abstractC7482) {
        abstractC7482.mo12648(this);
    }

    @Override // p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo12640(AbstractC7482 abstractC7482) {
        if (this.f20223) {
            m12662();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m12662() {
        this.f20224.setTag(R.id.save_overlay_view, null);
        this.f20226.getOverlay().remove(this.f20225);
        this.f20223 = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m12662();
    }

    @Override // p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12638() {
    }

    @Override // p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo12641() {
    }

    @Override // p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12660(AbstractC7482 abstractC7482) {
    }
}
