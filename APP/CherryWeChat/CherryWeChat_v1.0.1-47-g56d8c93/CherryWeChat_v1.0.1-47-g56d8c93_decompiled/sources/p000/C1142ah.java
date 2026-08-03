package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: ah */
/* JADX INFO: loaded from: classes.dex */
public final class C1142ah extends AnimatorListenerAdapter implements InterfaceC0313HB {

    /* JADX INFO: renamed from: a */
    public final View f3628a;

    /* JADX INFO: renamed from: b */
    public boolean f3629b = false;

    public C1142ah(View view) {
        this.f3628a = view;
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: a */
    public final void mo662a(AbstractC0356IB abstractC0356IB) {
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: b */
    public final void mo663b() {
        View view = this.f3628a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC0574NE.f1868a.mo1251A(view) : 0.0f));
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: c */
    public final void mo664c() {
        this.f3628a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: d */
    public final void mo665d(AbstractC0356IB abstractC0356IB) {
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: e */
    public final void mo666e(AbstractC0356IB abstractC0356IB) {
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: f */
    public final void mo667f(AbstractC0356IB abstractC0356IB) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC0574NE.f1868a.mo1252Q(this.f3628a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f3628a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f3629b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.f3629b;
        View view = this.f3628a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        C0831TE c0831te = AbstractC0574NE.f1868a;
        c0831te.mo1252Q(view, 1.0f);
        c0831te.getClass();
    }
}
