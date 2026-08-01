package p128;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p053.AbstractC6561;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7470 extends AnimatorListenerAdapter implements InterfaceC7485 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f20212;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ViewGroup f20214;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20215;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f20216;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f20211 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f20213 = true;

    public C7470(View view, int i) {
        this.f20216 = view;
        this.f20215 = i;
        this.f20214 = (ViewGroup) view.getParent();
        m12688(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f20211 = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.f20211) {
            AbstractC7468.m12685(this.f20216, this.f20215);
            ViewGroup viewGroup = this.f20214;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m12688(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            AbstractC7468.m12685(this.f20216, 0);
            ViewGroup viewGroup = this.f20214;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12665() {
        m12688(true);
        if (this.f20211) {
            return;
        }
        AbstractC7468.m12685(this.f20216, 0);
    }

    @Override // p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo12666(AbstractC7483 abstractC7483) {
        abstractC7483.mo12675(this);
    }

    @Override // p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo12668() {
        m12688(false);
        if (this.f20211) {
            return;
        }
        AbstractC7468.m12685(this.f20216, this.f20215);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m12688(boolean z) {
        ViewGroup viewGroup;
        if (!this.f20213 || this.f20212 == z || (viewGroup = this.f20214) == null) {
            return;
        }
        this.f20212 = z;
        AbstractC6561.m12061(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f20211) {
            AbstractC7468.m12685(this.f20216, this.f20215);
            ViewGroup viewGroup = this.f20214;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m12688(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo12687(AbstractC7483 abstractC7483) {
    }

    @Override // p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo12667(AbstractC7483 abstractC7483) {
    }
}
