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

    public /* synthetic */ AnimationAnimationListenerC0730Qz(ViewGroup viewGroup, int i) {
        this.f2343a = i;
        this.f2344b = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    private final void m1518a(Animation animation) {
    }

    /* JADX INFO: renamed from: b */
    private final void m1519b(Animation animation) {
    }

    /* JADX INFO: renamed from: c */
    private final void m1520c(Animation animation) {
    }

    /* JADX INFO: renamed from: d */
    private final void m1521d(Animation animation) {
    }

    /* JADX INFO: renamed from: e */
    private final void m1522e(Animation animation) {
    }

    /* JADX INFO: renamed from: f */
    private final void m1523f(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        InterfaceC0901Uz interfaceC0901Uz;
        switch (this.f2343a) {
            case 0:
                C0987Wz c0987Wz = (C0987Wz) this.f2344b;
                if (!c0987Wz.f3134c) {
                    c0987Wz.m1872l();
                } else {
                    c0987Wz.f3157z.setAlpha(255);
                    c0987Wz.f3157z.start();
                    if (c0987Wz.f3126E && (interfaceC0901Uz = c0987Wz.f3133b) != null) {
                        interfaceC0901Uz.mo1423a();
                    }
                    c0987Wz.f3145n = c0987Wz.f3151t.getTop();
                }
                break;
            case 1:
                C0987Wz c0987Wz2 = (C0987Wz) this.f2344b;
                C0772Rz c0772Rz = new C0772Rz(c0987Wz2, 1);
                c0987Wz2.f3123B = c0772Rz;
                c0772Rz.setDuration(150L);
                C2489s9 c2489s9 = c0987Wz2.f3151t;
                c2489s9.f8751a = null;
                c2489s9.clearAnimation();
                c0987Wz2.f3151t.startAnimation(c0987Wz2.f3123B);
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f2344b;
                AbstractC0295Gu.m625r(-782302523160629L);
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.05f, 1.0f, 1.05f, 1.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(150L);
                scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                linearLayout.startAnimation(scaleAnimation);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.f2343a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i = this.f2343a;
    }
}
