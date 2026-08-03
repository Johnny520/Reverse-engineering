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
    public boolean f961d = true;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0449h f962e;

    public C0440F(C0449h c0449h, ViewGroup viewGroup, View view, View view2) {
        this.f962e = c0449h;
        this.f958a = viewGroup;
        this.f959b = view;
        this.f960c = view2;
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: a */
    public final void mo1040a() {
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: b */
    public final void mo1041b(AbstractC0454m abstractC0454m) {
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: c */
    public final void mo1042c(AbstractC0454m abstractC0454m) {
        if (this.f961d) {
            m1046g();
        }
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: d */
    public final void mo1043d(AbstractC0454m abstractC0454m) {
        abstractC0454m.mo1062x(this);
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
    public final void onAnimationEnd(Animator animator) {
        m1046g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f958a.getOverlay().remove(this.f959b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f959b;
        if (view.getParent() == null) {
            this.f958a.getOverlay().add(view);
        } else {
            this.f962e.mo1055c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f960c;
            View view2 = this.f959b;
            view.setTag(C1031R.id.save_overlay_view, view2);
            this.f958a.getOverlay().add(view2);
            this.f961d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        m1046g();
    }
}
