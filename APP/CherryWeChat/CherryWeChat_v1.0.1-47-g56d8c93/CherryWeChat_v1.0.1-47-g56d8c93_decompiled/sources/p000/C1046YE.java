package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: YE */
/* JADX INFO: loaded from: classes.dex */
public final class C1046YE extends AnimatorListenerAdapter implements InterfaceC0313HB {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f3337a;

    /* JADX INFO: renamed from: b */
    public final View f3338b;

    /* JADX INFO: renamed from: c */
    public final View f3339c;

    /* JADX INFO: renamed from: d */
    public boolean f3340d = true;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1222bh f3341e;

    public C1046YE(C1222bh c1222bh, ViewGroup viewGroup, View view, View view2) {
        this.f3341e = c1222bh;
        this.f3337a = viewGroup;
        this.f3338b = view;
        this.f3339c = view2;
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: a */
    public final void mo662a(AbstractC0356IB abstractC0356IB) {
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: b */
    public final void mo663b() {
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: c */
    public final void mo664c() {
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: d */
    public final void mo665d(AbstractC0356IB abstractC0356IB) {
        abstractC0356IB.mo786x(this);
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: f */
    public final void mo667f(AbstractC0356IB abstractC0356IB) {
        if (this.f3340d) {
            m1997g();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1997g() {
        this.f3339c.setTag(R.id.save_overlay_view, null);
        this.f3337a.getOverlay().remove(this.f3338b);
        this.f3340d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m1997g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f3337a.getOverlay().remove(this.f3338b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f3338b;
        if (view.getParent() == null) {
            this.f3337a.getOverlay().add(view);
        } else {
            this.f3341e.mo767c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.f3339c;
            View view2 = this.f3338b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f3337a.getOverlay().add(view2);
            this.f3340d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        m1997g();
    }
}
