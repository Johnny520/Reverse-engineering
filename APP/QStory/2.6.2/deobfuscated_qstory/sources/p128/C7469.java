package p128;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import kotlin.reflect.jvm.internal.AbstractC5061;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7469 extends AnimatorListenerAdapter implements InterfaceC7484 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f20217;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ViewGroup f20219;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20220;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f20221;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f20216 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f20218 = true;

    public C7469(View view, int i) {
        this.f20221 = view;
        this.f20220 = i;
        this.f20219 = (ViewGroup) view.getParent();
        m12661(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f20216 = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.f20216) {
            AbstractC7467.m12658(this.f20221, this.f20220);
            ViewGroup viewGroup = this.f20219;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m12661(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            AbstractC7467.m12658(this.f20221, 0);
            ViewGroup viewGroup = this.f20219;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12638() {
        m12661(true);
        if (this.f20216) {
            return;
        }
        AbstractC7467.m12658(this.f20221, 0);
    }

    @Override // p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo12639(AbstractC7482 abstractC7482) {
        abstractC7482.mo12648(this);
    }

    @Override // p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo12641() {
        m12661(false);
        if (this.f20216) {
            return;
        }
        AbstractC7467.m12658(this.f20221, this.f20220);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m12661(boolean z) {
        ViewGroup viewGroup;
        if (!this.f20218 || this.f20217 == z || (viewGroup = this.f20219) == null) {
            return;
        }
        this.f20217 = z;
        AbstractC5061.m10017(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f20216) {
            AbstractC7467.m12658(this.f20221, this.f20220);
            ViewGroup viewGroup = this.f20219;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m12661(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo12660(AbstractC7482 abstractC7482) {
    }

    @Override // p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo12640(AbstractC7482 abstractC7482) {
    }
}
