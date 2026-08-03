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
    public boolean f3629b;

    public C1142ah(View r2) {
        this.f3629b = false;
        this.f3628a = r2;
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: a */
    public final void mo662a(AbstractC0356IB r1) {
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: b */
    public final void mo663b() {
        View r0 = this.f3628a;
        if (r0.getVisibility() != 0) goto L5;
        float r1 = AbstractC0574NE.f1868a.mo1251A(r0);
    L6:
        r0.setTag(R.id.transition_pause_alpha, Float.valueOf(r1));
        return;
    L5:
        r1 = 0.0f;
        goto L6
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: c */
    public final void mo664c() {
        this.f3628a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: d */
    public final void mo665d(AbstractC0356IB r1) {
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: e */
    public final void mo666e(AbstractC0356IB r1) {
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: f */
    public final void mo667f(AbstractC0356IB r1) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator r3) {
        AbstractC0574NE.f1868a.mo1252Q(this.f3628a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r2) {
        onAnimationEnd(r2, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r3) {
        View r32 = this.f3628a;
        if (r32.hasOverlappingRendering() == true) goto L5;
        return;
    L5:
        if (r32.getLayerType() != 0) goto L9;
        this.f3629b = true;
        r32.setLayerType(2, null);
        return;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r3, boolean r4) {
        boolean r32 = this.f3629b;
        View r0 = this.f3628a;
        if (r32 == false) goto L5;
        r0.setLayerType(0, null);
    L5:
        if (r4 == true) goto L8;
        C0831TE r33 = AbstractC0574NE.f1868a;
        r33.mo1252Q(r0, 1.0f);
        r33.getClass();
        return;
    }
}
