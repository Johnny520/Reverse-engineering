package p006D;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import p085v.C1102c;

/* JADX INFO: renamed from: D.W */
/* JADX INFO: loaded from: classes.dex */
public final class C0085W implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0096d0 f224a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0122q0 f225b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0122q0 f226c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f227d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f228e;

    public C0085W(C0096d0 c0096d0, C0122q0 c0122q0, C0122q0 c0122q02, int i2, View view) {
        this.f224a = c0096d0;
        this.f225b = c0122q0;
        this.f226c = c0122q02;
        this.f227d = i2;
        this.f228e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f2;
        C0096d0 c0096d0;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C0096d0 c0096d02 = this.f224a;
        c0096d02.f252a.mo323d(animatedFraction);
        float fMo321b = c0096d02.f252a.mo321b();
        PathInterpolator pathInterpolator = C0088Z.f234e;
        int i2 = Build.VERSION.SDK_INT;
        C0122q0 c0122q0 = this.f225b;
        AbstractC0106i0 c0104h0 = i2 >= 30 ? new C0104h0(c0122q0) : i2 >= 29 ? new C0102g0(c0122q0) : new C0100f0(c0122q0);
        int i3 = 1;
        while (i3 <= 256) {
            if ((this.f227d & i3) == 0) {
                c0104h0.mo368c(i3, c0122q0.f309a.mo381f(i3));
                f2 = fMo321b;
                c0096d0 = c0096d02;
            } else {
                C1102c c1102cMo381f = c0122q0.f309a.mo381f(i3);
                C1102c c1102cMo381f2 = this.f226c.f309a.mo381f(i3);
                float f3 = 1.0f - fMo321b;
                int i4 = (int) (((double) ((c1102cMo381f.f4249a - c1102cMo381f2.f4249a) * f3)) + 0.5d);
                int i5 = (int) (((double) ((c1102cMo381f.f4250b - c1102cMo381f2.f4250b) * f3)) + 0.5d);
                f2 = fMo321b;
                int i6 = (int) (((double) ((c1102cMo381f.f4251c - c1102cMo381f2.f4251c) * f3)) + 0.5d);
                float f4 = (c1102cMo381f.f4252d - c1102cMo381f2.f4252d) * f3;
                c0096d0 = c0096d02;
                c0104h0.mo368c(i3, C0122q0.m428b(c1102cMo381f, i4, i5, i6, (int) (((double) f4) + 0.5d)));
            }
            i3 <<= 1;
            fMo321b = f2;
            c0096d02 = c0096d0;
        }
        C0088Z.m308g(this.f228e, c0104h0.mo362b(), Collections.singletonList(c0096d02));
    }
}
