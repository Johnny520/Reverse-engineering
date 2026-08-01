package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ac0 implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ defpackage.gc0 a;
    public final /* synthetic */ defpackage.wc0 b;
    public final /* synthetic */ defpackage.wc0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ android.view.View e;

    public ac0(defpackage.gc0 r1, defpackage.wc0 r2, defpackage.wc0 r3, int r4, android.view.View r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r15) {
            r14 = this;
            float r15 = r15.getAnimatedFraction()
            gc0 r0 = r14.a
            fc0 r1 = r0.a
            r1.d(r15)
            wc0 r15 = r14.b
            tc0 r2 = r15.a
            float r1 = r1.b()
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 30
            if (r3 < r4) goto L1f
            lc0 r3 = new lc0
            r3.<init>(r15)
            goto L2e
        L1f:
            r4 = 29
            if (r3 < r4) goto L29
            kc0 r3 = new kc0
            r3.<init>(r15)
            goto L2e
        L29:
            ic0 r3 = new ic0
            r3.<init>(r15)
        L2e:
            r15 = 1
        L2f:
            r4 = 256(0x100, float:3.59E-43)
            if (r15 > r4) goto L83
            int r4 = r14.d
            r4 = r4 & r15
            if (r4 != 0) goto L40
            ep r4 = r2.f(r15)
            r3.c(r15, r4)
            goto L80
        L40:
            ep r4 = r2.f(r15)
            wc0 r5 = r14.c
            tc0 r5 = r5.a
            ep r5 = r5.f(r15)
            int r6 = r4.a
            int r7 = r5.a
            int r6 = r6 - r7
            float r6 = (float) r6
            r7 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 - r1
            float r6 = r6 * r7
            double r8 = (double) r6
            r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r8 = r8 + r10
            int r6 = (int) r8
            int r8 = r4.b
            int r9 = r5.b
            int r8 = r8 - r9
            float r8 = (float) r8
            float r8 = r8 * r7
            double r8 = (double) r8
            double r8 = r8 + r10
            int r8 = (int) r8
            int r9 = r4.c
            int r12 = r5.c
            int r9 = r9 - r12
            float r9 = (float) r9
            float r9 = r9 * r7
            double r12 = (double) r9
            double r12 = r12 + r10
            int r9 = (int) r12
            int r12 = r4.d
            int r5 = r5.d
            int r12 = r12 - r5
            float r5 = (float) r12
            float r5 = r5 * r7
            double r12 = (double) r5
            double r12 = r12 + r10
            int r5 = (int) r12
            ep r4 = defpackage.wc0.e(r4, r6, r8, r9, r5)
            r3.c(r15, r4)
        L80:
            int r15 = r15 << 1
            goto L2f
        L83:
            wc0 r15 = r3.b()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            android.view.View r1 = r14.e
            defpackage.cc0.g(r1, r15, r0)
            return
    }
}
