package p144;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p069.AbstractC7390;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8299 extends AnimatorListenerAdapter implements InterfaceC8314 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f20557;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ViewGroup f20559;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20560;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f20561;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f20556 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f20558 = true;

    public C8299(View view, int i) {
        this.f20561 = view;
        this.f20560 = i;
        this.f20559 = (ViewGroup) view.getParent();
        m13247(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f20556 = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.f20556) {
            AbstractC8297.m13244(this.f20561, this.f20560);
            ViewGroup viewGroup = this.f20559;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m13247(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            AbstractC8297.m13244(this.f20561, 0);
            ViewGroup viewGroup = this.f20559;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo13224() {
        m13247(true);
        if (this.f20556) {
            return;
        }
        AbstractC8297.m13244(this.f20561, 0);
    }

    @Override // p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo13225(AbstractC8312 abstractC8312) {
        abstractC8312.mo13234(this);
    }

    @Override // p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo13227() {
        m13247(false);
        if (this.f20556) {
            return;
        }
        AbstractC8297.m13244(this.f20561, this.f20560);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13247(boolean z) {
        ViewGroup viewGroup;
        if (!this.f20558 || this.f20557 == z || (viewGroup = this.f20559) == null) {
            return;
        }
        this.f20557 = z;
        AbstractC7390.m12620(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f20556) {
            AbstractC8297.m13244(this.f20561, this.f20560);
            ViewGroup viewGroup = this.f20559;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m13247(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo13246(AbstractC8312 abstractC8312) {
    }

    @Override // p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo13226(AbstractC8312 abstractC8312) {
    }
}
