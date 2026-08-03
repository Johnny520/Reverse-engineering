package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g3.b0 f4234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g3.r0 f4235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g3.r0 f4236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f4238e;

    public t(g3.b0 r1, g3.r0 r2, g3.r0 r3, int r4, android.view.View r5) {
            r0 = this;
            r0.<init>()
            r0.f4234a = r1
            r0.f4235b = r2
            r0.f4236c = r3
            r0.f4237d = r4
            r0.f4238e = r5
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r15) {
            r14 = this;
            float r15 = r15.getAnimatedFraction()
            g3.b0 r0 = r14.f4234a
            g3.a0 r1 = r0.f4187a
            r1.e(r15)
            float r15 = r1.c()
            android.view.animation.PathInterpolator r1 = g3.x.f4247e
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            g3.r0 r3 = r14.f4235b
            if (r1 < r2) goto L1f
            g3.f0 r1 = new g3.f0
            r1.<init>(r3)
            goto L38
        L1f:
            r2 = 30
            if (r1 < r2) goto L29
            g3.e0 r1 = new g3.e0
            r1.<init>(r3)
            goto L38
        L29:
            r2 = 29
            if (r1 < r2) goto L33
            g3.d0 r1 = new g3.d0
            r1.<init>(r3)
            goto L38
        L33:
            g3.c0 r1 = new g3.c0
            r1.<init>(r3)
        L38:
            r2 = 1
        L39:
            r4 = 512(0x200, float:7.17E-43)
            if (r2 > r4) goto L8f
            int r4 = r14.f4237d
            r4 = r4 & r2
            g3.n0 r5 = r3.f4230a
            if (r4 != 0) goto L4c
            b3.a r4 = r5.g(r2)
            r1.c(r2, r4)
            goto L8c
        L4c:
            b3.a r4 = r5.g(r2)
            g3.r0 r5 = r14.f4236c
            g3.n0 r5 = r5.f4230a
            b3.a r5 = r5.g(r2)
            int r6 = r4.f445a
            int r7 = r5.f445a
            int r6 = r6 - r7
            float r6 = (float) r6
            r7 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 - r15
            float r6 = r6 * r7
            double r8 = (double) r6
            r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r8 = r8 + r10
            int r6 = (int) r8
            int r8 = r4.f446b
            int r9 = r5.f446b
            int r8 = r8 - r9
            float r8 = (float) r8
            float r8 = r8 * r7
            double r8 = (double) r8
            double r8 = r8 + r10
            int r8 = (int) r8
            int r9 = r4.f447c
            int r12 = r5.f447c
            int r9 = r9 - r12
            float r9 = (float) r9
            float r9 = r9 * r7
            double r12 = (double) r9
            double r12 = r12 + r10
            int r9 = (int) r12
            int r12 = r4.f448d
            int r5 = r5.f448d
            int r12 = r12 - r5
            float r5 = (float) r12
            float r5 = r5 * r7
            double r12 = (double) r5
            double r12 = r12 + r10
            int r5 = (int) r12
            b3.a r4 = g3.r0.a(r4, r6, r8, r9, r5)
            r1.c(r2, r4)
        L8c:
            int r2 = r2 << 1
            goto L39
        L8f:
            g3.r0 r15 = r1.b()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            android.view.View r1 = r14.f4238e
            g3.x.h(r1, r15, r0)
            return
    }
}
