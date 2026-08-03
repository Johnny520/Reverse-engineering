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
    public boolean f3340d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1222bh f3341e;

    public C1046YE(C1222bh r1, ViewGroup r2, View r3, View r4) {
        this.f3341e = r1;
        this.f3340d = true;
        this.f3337a = r2;
        this.f3338b = r3;
        this.f3339c = r4;
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: a */
    public final void mo662a(AbstractC0356IB r1) {
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
    public final void mo665d(AbstractC0356IB r1) {
        r1.mo786x(this);
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: f */
    public final void mo667f(AbstractC0356IB r1) {
        if (this.f3340d == false) goto L6;
        m1997g();
        return;
    }

    /* JADX INFO: renamed from: g */
    public final void m1997g() {
        this.f3339c.setTag(R.id.save_overlay_view, null);
        this.f3337a.getOverlay().remove(this.f3338b);
        this.f3340d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r1) {
        m1997g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator r2) {
        this.f3337a.getOverlay().remove(this.f3338b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator r2) {
        View r22 = this.f3338b;
        if (r22.getParent() != null) goto L6;
        this.f3337a.getOverlay().add(r22);
        return;
    L6:
        this.f3341e.mo767c();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r2, boolean r3) {
        if (r3 == false) goto L5;
        View r22 = this.f3339c;
        View r0 = this.f3338b;
        r22.setTag(R.id.save_overlay_view, r0);
        this.f3337a.getOverlay().add(r0);
        this.f3340d = true;
        return;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r1, boolean r2) {
        if (r2 == true) goto L5;
        m1997g();
        return;
    }
}
