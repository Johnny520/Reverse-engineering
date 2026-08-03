package p043Y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.luckypray.dexkit.C1031R;

/* JADX INFO: renamed from: Y.F */
/* JADX INFO: loaded from: classes.dex */
public final class C0440F extends AnimatorListenerAdapter implements InterfaceC0452k {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f958a;

    /* JADX INFO: renamed from: b */
    public final View f959b;

    /* JADX INFO: renamed from: c */
    public final View f960c;

    /* JADX INFO: renamed from: d */
    public boolean f961d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0449h f962e;

    public C0440F(C0449h r1, ViewGroup r2, View r3, View r4) {
        this.f962e = r1;
        this.f961d = true;
        this.f958a = r2;
        this.f959b = r3;
        this.f960c = r4;
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: a */
    public final void mo1040a() {
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: b */
    public final void mo1041b(AbstractC0454m r1) {
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: c */
    public final void mo1042c(AbstractC0454m r1) {
        if (this.f961d == false) goto L6;
        m1046g();
        return;
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: d */
    public final void mo1043d(AbstractC0454m r1) {
        r1.mo1062x(this);
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: e */
    public final void mo1044e() {
    }

    /* JADX INFO: renamed from: g */
    public final void m1046g() {
        this.f960c.setTag(C1031R.id.save_overlay_view, null);
        this.f958a.getOverlay().remove(this.f959b);
        this.f961d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r1) {
        m1046g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator r2) {
        this.f958a.getOverlay().remove(this.f959b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator r2) {
        View r22 = this.f959b;
        if (r22.getParent() != null) goto L5;
        this.f958a.getOverlay().add(r22);
        return;
    L5:
        this.f962e.mo1055c();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r2, boolean r3) {
        if (r3 == false) goto L5;
        View r22 = this.f960c;
        View r02 = this.f959b;
        r22.setTag(C1031R.id.save_overlay_view, r02);
        this.f958a.getOverlay().add(r02);
        this.f961d = true;
        return;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r1, boolean r2) {
        if (r2 == true) goto L5;
        m1046g();
        return;
    }
}
