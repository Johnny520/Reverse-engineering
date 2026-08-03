package p006D;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.lang.reflect.Field;
import java.util.Objects;
import p000A.C0002c;
import p000A.RunnableC0014o;
import p085v.C1102c;

/* JADX INFO: renamed from: D.Y */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0087Y implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public final C0099f f232a;

    /* JADX INFO: renamed from: b */
    public C0122q0 f233b;

    public ViewOnApplyWindowInsetsListenerC0087Y(View r2, C0099f r3) {
        this.f232a = r3;
        Field r32 = AbstractC0080Q.f219a;
        C0122q0 r22 = AbstractC0071H.m237a(r2);
        if (r22 == null) goto L12;
        int r33 = Build.VERSION.SDK_INT;
        if (r33 < 30) goto L8;
        AbstractC0106i0 r34 = new C0104h0(r22);
    L11:
        C0122q0 r23 = r34.mo362b();
    L13:
        this.f233b = r23;
        return;
    L8:
        if (r33 < 29) goto L10;
        r34 = new C0102g0(r22);
        goto L11
    L10:
        r34 = new C0100f0(r22);
        goto L11
    L12:
        r23 = null;
        goto L13
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View r20, WindowInsets r21) {
        if (r20.isLaidOut() == true) goto L6;
        this.f233b = C0122q0.m429d(r20, r21);
        return C0088Z.m310i(r20, r21);
    L6:
        C0122q0 r9 = C0122q0.m429d(r20, r21);
        if (this.f233b != null) goto L10;
        Field r3 = AbstractC0080Q.f219a;
        this.f233b = AbstractC0071H.m237a(r20);
    L10:
        if (this.f233b != null) goto L13;
        this.f233b = r9;
        return C0088Z.m310i(r20, r21);
    L13:
        C0099f r32 = C0088Z.m311j(r20);
        if (r32 != null) goto L16;
    L19:
        C0122q0 r33 = this.f233b;
        int r6 = 1;
        int r5 = 0;
    L20:
        C0118o0 r10 = r9.f309a;
        if (r6 > 256) goto L26;
        if (r10.mo381f(r6).equals(r33.f309a.mo381f(r6)) == true) goto L25;
        r5 = r5 | r6;
    L25:
        r6 = r6 << 1;
        goto L20
    L26:
        if (r5 == 0) goto L28;
        C0122q0 r62 = this.f233b;
        if ((r5 & 8) != 0) goto L32;
        Interpolator r1 = C0088Z.f236g;
    L36:
        C0096d0 r11 = new C0096d0(r5, r1, 160);
        r11.f252a.mo323d(0.0f);
        ValueAnimator r12 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(r11.f252a.mo320a());
        C1102c r13 = r10.mo381f(r5);
        C1102c r34 = r62.f309a.mo381f(r5);
        int r102 = Math.min(r13.f4249a, r34.f4249a);
        int r132 = r13.f4250b;
        int r14 = r34.f4250b;
        int r15 = Math.min(r132, r14);
        int r4 = r13.f4251c;
        int r2 = r34.f4251c;
        int r02 = Math.min(r4, r2);
        int r122 = r13.f4252d;
        int r17 = r5;
        int r52 = r34.f4252d;
        C0002c r103 = new C0002c(C1102c.m2598b(r102, r15, r02, Math.min(r122, r52)), C1102c.m2598b(Math.max(r13.f4249a, r34.f4249a), Math.max(r132, r14), Math.max(r4, r2), Math.max(r122, r52)), 1);
        C0088Z.m307f(r20, r21, false);
        r12.addUpdateListener(new C0085W(r11, r9, r62, r17, r20));
        r12.addListener(new C0086X(r11, r20));
        RunnableC0014o r03 = new RunnableC0014o(r20, r11, r103, r12);
        if (r20 == null) goto L41;
        ViewTreeObserverOnPreDrawListenerC0127t r16 = new ViewTreeObserverOnPreDrawListenerC0127t(r20, r03);
        r20.getViewTreeObserver().addOnPreDrawListener(r16);
        r20.addOnAttachStateChangeListener(r16);
        this.f233b = r9;
        return C0088Z.m310i(r20, r21);
    L41:
        throw new NullPointerException("view == null");
    L32:
        if (r10.mo381f(8).f4252d <= r62.f309a.mo381f(8).f4252d) goto L34;
        r1 = C0088Z.f234e;
        goto L36
    L34:
        r1 = C0088Z.f235f;
        goto L36
    L28:
        return C0088Z.m310i(r20, r21);
    L16:
        if (Objects.equals((WindowInsets) r32.f258b, r21) == false) goto L19;
        return C0088Z.m310i(r20, r21);
    }
}
