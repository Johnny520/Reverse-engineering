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
    public boolean f991b;

    public C0448g(View r2) {
        this.f991b = false;
        this.f990a = r2;
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: a */
    public final void mo1040a() {
        View r02 = this.f990a;
        if (r02.getVisibility() != 0) goto L5;
        float r1 = AbstractC0465x.f1048a.mo926z(r02);
    L6:
        r02.setTag(C1031R.id.transition_pause_alpha, Float.valueOf(r1));
        return;
    L5:
        r1 = 0.0f;
        goto L6
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: b */
    public final void mo1041b(AbstractC0454m r1) {
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: c */
    public final void mo1042c(AbstractC0454m r1) {
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: d */
    public final void mo1043d(AbstractC0454m r1) {
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: e */
    public final void mo1044e() {
        this.f990a.setTag(C1031R.id.transition_pause_alpha, null);
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: f */
    public final void mo1068f(AbstractC0454m r1) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator r3) {
        AbstractC0465x.f1048a.mo924k0(this.f990a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r2) {
        onAnimationEnd(r2, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r3) {
        View r32 = this.f990a;
        if (r32.hasOverlappingRendering() == true) goto L5;
        return;
    L5:
        if (r32.getLayerType() != 0) goto L9;
        this.f991b = true;
        r32.setLayerType(2, null);
        return;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r3, boolean r4) {
        boolean r32 = this.f991b;
        View r02 = this.f990a;
        if (r32 == false) goto L5;
        r02.setLayerType(0, null);
    L5:
        if (r4 == true) goto L8;
        C0437C r33 = AbstractC0465x.f1048a;
        r33.mo924k0(r02, 1.0f);
        r33.getClass();
        return;
    }
}
