package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class ac0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ gc0 a;
    public final /* synthetic */ wc0 b;
    public final /* synthetic */ wc0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public ac0(gc0 r1, wc0 r2, wc0 r3, int r4, View r5) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator r15) {
        float r152 = r15.getAnimatedFraction();
        gc0 r0 = this.a;
        fc0 r1 = r0.a;
        r1.d(r152);
        wc0 r153 = this.b;
        tc0 r2 = r153.a;
        float r12 = r1.b();
        int r3 = Build.VERSION.SDK_INT;
        if (r3 < 30) goto L6;
        mc0 r32 = new lc0(r153);
    L9:
        int r154 = 1;
    L11:
        if (r154 > 256) goto L17;
        if ((this.d & r154) != 0) goto L15;
        r32.c(r154, r2.f(r154));
    L16:
        r154 = r154 << 1;
        goto L11
    L15:
        ep r4 = r2.f(r154);
        float r7 = 1.0f - r12;
        r32.c(r154, wc0.e(r4, (int) (((double) ((r4.a - this.c.a.f(r154).a) * r7)) + 0.5d), (int) (((double) ((r4.b - r5.b) * r7)) + 0.5d), (int) (((double) ((r4.c - r5.c) * r7)) + 0.5d), (int) (((double) ((r4.d - r5.d) * r7)) + 0.5d)));
        goto L16
    L17:
        cc0.g(this.e, r32.b(), Collections.singletonList(r0));
        return;
    L6:
        if (r3 < 29) goto L8;
        r32 = new kc0(r153);
        goto L9
    L8:
        r32 = new ic0(r153);
        goto L9
    }
}
