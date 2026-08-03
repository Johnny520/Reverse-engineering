package p043Y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.luckypray.dexkit.C1031R;

/* JADX INFO: renamed from: Y.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0448g extends AnimatorListenerAdapter implements InterfaceC0452k {

    /* JADX INFO: renamed from: a */
    public final View f990a;

    /* JADX INFO: renamed from: b */
    public boolean f991b = false;

    public C0448g(View view) {
        this.f990a = view;
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: a */
    public final void mo1040a() {
        View view = this.f990a;
        view.setTag(C1031R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC0465x.f1048a.mo926z(view) : 0.0f));
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: b */
    public final void mo1041b(AbstractC0454m abstractC0454m) {
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: c */
    public final void mo1042c(AbstractC0454m abstractC0454m) {
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: d */
    public final void mo1043d(AbstractC0454m abstractC0454m) {
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: e */
    public final void mo1044e() {
        this.f990a.setTag(C1031R.id.transition_pause_alpha, null);
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: f */
    public final void mo1068f(AbstractC0454m abstractC0454m) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC0465x.f1048a.mo924k0(this.f990a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f990a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f991b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f991b;
        View view = this.f990a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        C0437C c0437c = AbstractC0465x.f1048a;
        c0437c.mo924k0(view, 1.0f);
        c0437c.getClass();
    }
}
