package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bc0 implements View.OnApplyWindowInsetsListener {
    public final ad a;
    public wc0 b;

    public bc0(View r2, ad r3) {
        this.a = r3;
        WeakHashMap r32 = ja0.a;
        wc0 r22 = z90.a(r2);
        if (r22 == null) goto L12;
        int r33 = Build.VERSION.SDK_INT;
        if (r33 < 30) goto L8;
        mc0 r34 = new lc0(r22);
    L11:
        wc0 r23 = r34.b();
    L13:
        this.b = r23;
        return;
    L8:
        if (r33 < 29) goto L10;
        r34 = new kc0(r22);
        goto L11
    L10:
        r34 = new ic0(r22);
        goto L11
    L12:
        r23 = null;
        goto L13
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View r21, WindowInsets r22) {
        if (r21.isLaidOut() == true) goto L6;
        this.b = wc0.g(r21, r22);
        return cc0.i(r21, r22);
    L6:
        wc0 r3 = wc0.g(r21, r22);
        tc0 r1 = r3.a;
        if (this.b != null) goto L10;
        WeakHashMap r2 = ja0.a;
        this.b = z90.a(r21);
    L10:
        if (this.b != null) goto L13;
        this.b = r3;
        return cc0.i(r21, r22);
    L13:
        ad r23 = cc0.j(r21);
        if (r23 != null) goto L16;
    L19:
        wc0 r24 = this.b;
        int r5 = 1;
        int r8 = 0;
    L21:
        if (r5 > 256) goto L26;
        if (r1.f(r5).equals(r24.a.f(r5)) == true) goto L25;
        r8 = r8 | r5;
    L25:
        r5 = r5 << 1;
        goto L21
    L26:
        if (r8 == 0) goto L28;
        wc0 r25 = this.b;
        gc0 r52 = new gc0(r8, new DecelerateInterpolator(), 160);
        r52.a.d(0.0f);
        ValueAnimator r10 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(r52.a.a());
        ep r12 = r1.f(r8);
        ep r11 = r25.a.f(r8);
        int r122 = Math.min(r12.a, r11.a);
        int r13 = r12.b;
        int r14 = r11.b;
        int r15 = Math.min(r13, r14);
        int r9 = r12.c;
        int r4 = r11.c;
        int r26 = Math.min(r9, r4);
        int r32 = r12.d;
        int r53 = r11.d;
        int r19 = r8;
        d4 r82 = new d4(ep.b(r122, r15, r26, Math.min(r32, r53)), ep.b(Math.max(r12.a, r11.a), Math.max(r13, r14), Math.max(r9, r4), Math.max(r32, r53)), 21, false);
        cc0.f(r21, r22, false);
        r10.addUpdateListener(new ac0(r52, r3, r25, r19, r21));
        r10.addListener(new o70(r52, r21, 2));
        cx.a(r21, new s00(r21, r52, r82, r10));
        this.b = r3;
        return cc0.i(r21, r22);
    L28:
        return cc0.i(r21, r22);
    L16:
        if (Objects.equals((WindowInsets) r23.b, r22) == false) goto L19;
        return cc0.i(r21, r22);
    }
}
