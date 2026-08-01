package p144;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC3103;
import com.davemorrissey.labs.subscaleview.C0328R;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8300 extends AnimatorListenerAdapter implements InterfaceC8314 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C8309 f20562;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f20563 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final View f20564;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final View f20565;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ViewGroup f20566;

    public C8300(C8309 c8309, ViewGroup viewGroup, View view, View view2) {
        this.f20562 = c8309;
        this.f20566 = viewGroup;
        this.f20565 = view;
        this.f20564 = view2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        m13248();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f20566.getOverlay().remove(this.f20565);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f20565;
        if (view.getParent() == null) {
            AbstractC3103.m4798(this.f20566, view);
        } else {
            this.f20562.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.f20564;
            View view2 = this.f20565;
            view.setTag(C0328R.id.save_overlay_view, view2);
            AbstractC3103.m4798(this.f20566, view2);
            this.f20563 = true;
        }
    }

    @Override // p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo13225(AbstractC8312 abstractC8312) {
        abstractC8312.mo13234(this);
    }

    @Override // p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo13226(AbstractC8312 abstractC8312) {
        if (this.f20563) {
            m13248();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13248() {
        this.f20564.setTag(C0328R.id.save_overlay_view, null);
        this.f20566.getOverlay().remove(this.f20565);
        this.f20563 = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m13248();
    }

    @Override // p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo13224() {
    }

    @Override // p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo13227() {
    }

    @Override // p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo13246(AbstractC8312 abstractC8312) {
    }
}
