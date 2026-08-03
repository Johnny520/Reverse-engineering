package p000;

import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: Qz */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC0730Qz implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2343a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f2344b;

    public /* synthetic */ AnimationAnimationListenerC0730Qz(ViewGroup r1, int r2) {
        this.f2343a = r2;
        this.f2344b = r1;
    }

    /* JADX INFO: renamed from: a */
    private final void m1518a(Animation r1) {
    }

    /* JADX INFO: renamed from: b */
    private final void m1519b(Animation r1) {
    }

    /* JADX INFO: renamed from: c */
    private final void m1520c(Animation r1) {
    }

    /* JADX INFO: renamed from: d */
    private final void m1521d(Animation r1) {
    }

    /* JADX INFO: renamed from: e */
    private final void m1522e(Animation r1) {
    }

    /* JADX INFO: renamed from: f */
    private final void m1523f(Animation r1) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation r12) {
        switch(this.f2343a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        LinearLayout r122 = (LinearLayout) this.f2344b;
        AbstractC0295Gu.m625r(-782302523160629L);
        ScaleAnimation r2 = new ScaleAnimation(1.05f, 1.0f, 1.05f, 1.0f, 1, 0.5f, 1, 0.5f);
        r2.setDuration(150);
        r2.setInterpolator(new AccelerateDecelerateInterpolator());
        r122.startAnimation(r2);
        return;
    L6:
        C0987Wz r123 = (C0987Wz) this.f2344b;
        C0772Rz r0 = new C0772Rz(r123, 1);
        r123.f3123B = r0;
        r0.setDuration(150);
        C2489s9 r02 = r123.f3151t;
        r02.f8751a = null;
        r02.clearAnimation();
        r123.f3151t.startAnimation(r123.f3123B);
        return;
    L8:
        C0987Wz r124 = (C0987Wz) this.f2344b;
        if (r124.f3134c == false) goto L16;
        r124.f3157z.setAlpha(255);
        r124.f3157z.start();
        if (r124.f3126E == false) goto L15;
        InterfaceC0901Uz r03 = r124.f3133b;
        if (r03 == null) goto L15;
        r03.mo1423a();
    L15:
        r124.f3145n = r124.f3151t.getTop();
        return;
    L16:
        r124.m1872l();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation r1) {
        int r12 = this.f2343a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation r1) {
        int r12 = this.f2343a;
    }
}
