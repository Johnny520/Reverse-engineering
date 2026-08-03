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

    public C0085W(C0096d0 r1, C0122q0 r2, C0122q0 r3, int r4, View r5) {
        this.f224a = r1;
        this.f225b = r2;
        this.f226c = r3;
        this.f227d = r4;
        this.f228e = r5;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator r17) {
        float r2 = r17.getAnimatedFraction();
        C0096d0 r3 = this.f224a;
        r3.f252a.mo323d(r2);
        float r22 = r3.f252a.mo321b();
        PathInterpolator r4 = C0088Z.f234e;
        int r42 = Build.VERSION.SDK_INT;
        C0122q0 r6 = this.f225b;
        if (r42 < 30) goto L6;
        AbstractC0106i0 r43 = new C0104h0(r6);
    L9:
        int r5 = 1;
    L11:
        if (r5 > 256) goto L18;
        if ((this.f227d & r5) != 0) goto L16;
        r43.mo368c(r5, r6.f309a.mo381f(r5));
        float r172 = r22;
        C0096d0 r8 = r3;
    L17:
        r5 = r5 << 1;
        r22 = r172;
        r3 = r8;
        goto L11
    L16:
        C1102c r7 = r6.f309a.mo381f(r5);
        float r10 = 1.0f - r22;
        int r9 = (int) (((double) ((r7.f4249a - this.f226c.f309a.mo381f(r5).f4249a) * r10)) + 0.5d);
        int r11 = (int) (((double) ((r7.f4250b - r8.f4250b) * r10)) + 0.5d);
        r172 = r22;
        int r1 = (int) (((double) ((r7.f4251c - r8.f4251c) * r10)) + 0.5d);
        float r23 = (r7.f4252d - r8.f4252d) * r10;
        r8 = r3;
        r43.mo368c(r5, C0122q0.m428b(r7, r9, r11, r1, (int) (((double) r23) + 0.5d)));
        goto L17
    L18:
        C0088Z.m308g(this.f228e, r43.mo362b(), Collections.singletonList(r3));
        return;
    L6:
        if (r42 < 29) goto L8;
        r43 = new C0102g0(r6);
        goto L9
    L8:
        r43 = new C0100f0(r6);
        goto L9
    }
}
